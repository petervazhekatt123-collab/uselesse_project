package com.example.blowtotype

import android.accessibilityservice.AccessibilityService
import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.media.AudioFormat
import android.media.AudioRecord
import android.media.MediaRecorder
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityNodeInfo
import android.accessibilityservice.GestureDescription
import android.graphics.Path
import kotlin.math.abs

class BlowToTypeService : AccessibilityService() {

    private val TAG = "BlowToTypeService"
    private var isListening = false
    private var audioRecord: AudioRecord? = null

    private val BLOW_THRESHOLD = 15000 // Tune this if needed
    private var blowCount = 0
    private var lastBlowTime = 0L
    private val BLOW_COOLDOWN_MS = 300L // Minimum time between distinct blows
    private val FINALIZATION_DELAY_MS = 1500L // Time to wait before finalizing count

    private val handler = Handler(Looper.getMainLooper())
    private var receiver: BroadcastReceiver? = null

    private val finalizeRunnable = Runnable {
        if (blowCount > 0) {
            val numberToType = when (blowCount) {
                1 -> "9"
                2 -> "8"
                3 -> "7"
                4 -> "6"
                5 -> "5"
                6 -> "4"
                7 -> "3"
                8 -> "2"
                9 -> "1"
                10 -> "0"
                else -> "" 
            }

            if (numberToType.isNotEmpty()) {
                Log.d(TAG, "Finalizing blow count: $blowCount -> Typing: $numberToType")
                tapNumber(numberToType)
            } else {
                Log.d(TAG, "Blow count $blowCount is out of bounds (ignoring).")
            }
            blowCount = 0
        }
    }

    override fun onServiceConnected() {
        super.onServiceConnected()
        Log.d(TAG, "Service connected.")

        val filter = IntentFilter()
        filter.addAction("com.example.blowtotype.START_LISTENING")
        filter.addAction("com.example.blowtotype.STOP_LISTENING")
        
        receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                when (intent?.action) {
                    "com.example.blowtotype.START_LISTENING" -> startListening()
                    "com.example.blowtotype.STOP_LISTENING" -> stopListening()
                }
            }
        }
        // In API 33+, we must specify RECEIVER_NOT_EXPORTED
        registerReceiver(receiver, filter, Context.RECEIVER_NOT_EXPORTED)
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // We don't actively need to process events here unless we want to track focus manually.
        // We will fetch the focused node on demand when typing.
    }

    override fun onInterrupt() {}

    override fun onDestroy() {
        super.onDestroy()
        stopListening()
        receiver?.let { unregisterReceiver(it) }
    }

    @SuppressLint("MissingPermission")
    private fun startListening() {
        if (isListening) return
        Log.d(TAG, "Starting microphone...")
        isListening = true

        val sampleRate = 44100
        val channelConfig = AudioFormat.CHANNEL_IN_MONO
        val audioFormat = AudioFormat.ENCODING_PCM_16BIT
        val bufferSize = AudioRecord.getMinBufferSize(sampleRate, channelConfig, audioFormat)

        try {
            audioRecord = AudioRecord(
                MediaRecorder.AudioSource.MIC,
                sampleRate,
                channelConfig,
                audioFormat,
                bufferSize
            )

            audioRecord?.startRecording()

            Thread {
                val buffer = ShortArray(bufferSize)
                while (isListening && audioRecord?.recordingState == AudioRecord.RECORDSTATE_RECORDING) {
                    val read = audioRecord?.read(buffer, 0, bufferSize) ?: 0
                    if (read > 0) {
                        var maxAmplitude = 0
                        for (i in 0 until read) {
                            val amplitude = abs(buffer[i].toInt())
                            if (amplitude > maxAmplitude) {
                                maxAmplitude = amplitude
                            }
                        }

                        if (maxAmplitude > BLOW_THRESHOLD) {
                            val now = System.currentTimeMillis()
                            if (now - lastBlowTime > BLOW_COOLDOWN_MS) {
                                lastBlowTime = now
                                blowCount++
                                Log.d(TAG, "Blow detected! Count is now: $blowCount")

                                // Reset the finalization timer
                                handler.removeCallbacks(finalizeRunnable)
                                handler.postDelayed(finalizeRunnable, FINALIZATION_DELAY_MS)
                                
                                // Sleep briefly in the thread to prevent double-counting immediately
                                Thread.sleep(200)
                            }
                        }
                    }
                }
            }.start()
        } catch (e: Exception) {
            Log.e(TAG, "Failed to start AudioRecord: ${e.message}")
            isListening = false
        }
    }

    private fun stopListening() {
        if (!isListening) return
        Log.d(TAG, "Stopping microphone.")
        isListening = false
        handler.removeCallbacks(finalizeRunnable)
        blowCount = 0
        try {
            audioRecord?.stop()
            audioRecord?.release()
            audioRecord = null
        } catch (e: Exception) {
            Log.e(TAG, "Error stopping AudioRecord: ${e.message}")
        }
    }

    private fun tapNumber(number: String) {
        val x: Float
        val y: Float
        when (number) {
            "1" -> { x = 270f; y = 1100f }
            "2" -> { x = 540f; y = 1100f }
            "3" -> { x = 810f; y = 1100f }
            "4" -> { x = 270f; y = 1350f }
            "5" -> { x = 540f; y = 1350f }
            "6" -> { x = 810f; y = 1350f }
            "7" -> { x = 270f; y = 1600f }
            "8" -> { x = 540f; y = 1600f }
            "9" -> { x = 810f; y = 1600f }
            "0" -> { x = 540f; y = 1850f }
            else -> return
        }
        dispatchTap(x, y)
    }

    private fun dispatchTap(x: Float, y: Float) {
        Log.d(TAG, "Tapping screen at X:$x Y:$y")
        try {
            val path = Path()
            path.moveTo(x, y)
            val stroke = GestureDescription.StrokeDescription(path, 0, 50)
            val gesture = GestureDescription.Builder().addStroke(stroke).build()
            dispatchGesture(gesture, null, null)
        } catch (e: Exception) {
            Log.e(TAG, "Error dispatching tap: ${e.message}")
        }
    }
}
