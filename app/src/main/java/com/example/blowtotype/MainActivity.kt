package com.example.blowtotype

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.provider.Settings
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : ComponentActivity() {

    private val AUDIO_PERMISSION_CODE = 1
    private var isListening = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Main Container
        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(64, 64, 64, 64)
        layout.setBackgroundColor(Color.parseColor("#121212")) // Dark theme
        layout.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )

        val title = TextView(this)
        title.text = "Blow-To-Type"
        title.textSize = 32f
        title.setTypeface(null, Typeface.BOLD)
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER
        title.setPadding(0, 0, 0, 16)
        layout.addView(title)

        val info = TextView(this)
        info.text = "1. Grant Microphone\n2. Enable Accessibility Service\n3. Tap Start and blow into your mic!\n(1 blow = 9, 2 blows = 8 ... 10 blows = 0)"
        info.textSize = 14f
        info.setTextColor(Color.parseColor("#AAAAAA"))
        info.gravity = Gravity.CENTER
        info.setPadding(0, 0, 0, 48)
        layout.addView(info)

        val btnParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        btnParams.setMargins(0, 0, 0, 24)

        val btnPermission = Button(this)
        btnPermission.text = "Request Audio Permission"
        btnPermission.setBackgroundColor(Color.parseColor("#3700B3"))
        btnPermission.setTextColor(Color.WHITE)
        btnPermission.layoutParams = btnParams
        btnPermission.setOnClickListener { checkPermission() }
        layout.addView(btnPermission)

        val btnAccessibility = Button(this)
        btnAccessibility.text = "Open Accessibility Settings"
        btnAccessibility.setBackgroundColor(Color.parseColor("#03DAC5"))
        btnAccessibility.setTextColor(Color.BLACK)
        btnAccessibility.layoutParams = btnParams
        btnAccessibility.setOnClickListener {
            startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS))
        }
        layout.addView(btnAccessibility)
        
        // Spacer
        val spacer = android.view.View(this)
        spacer.layoutParams = LinearLayout.LayoutParams(0, 0, 1f)
        layout.addView(spacer)

        val btnToggle = Button(this)
        btnToggle.text = "START BLOW-TO-TYPE"
        btnToggle.setBackgroundColor(Color.parseColor("#4CAF50")) // Green
        btnToggle.setTextColor(Color.WHITE)
        btnToggle.textSize = 20f
        btnToggle.layoutParams = btnParams
        btnToggle.setOnClickListener {
            if (!isListening) {
                isListening = true
                btnToggle.text = "STOP BLOW-TO-TYPE"
                btnToggle.setBackgroundColor(Color.parseColor("#F44336")) // Red
                val intent = Intent("com.example.blowtotype.START_LISTENING")
                intent.setPackage(packageName)
                sendBroadcast(intent)
                Toast.makeText(this, "Started! Click any text box and blow.", Toast.LENGTH_SHORT).show()
            } else {
                isListening = false
                btnToggle.text = "START BLOW-TO-TYPE"
                btnToggle.setBackgroundColor(Color.parseColor("#4CAF50"))
                val intent = Intent("com.example.blowtotype.STOP_LISTENING")
                intent.setPackage(packageName)
                sendBroadcast(intent)
            }
        }
        layout.addView(btnToggle)

        setContentView(layout)
        checkPermission()
    }

    private fun checkPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.RECORD_AUDIO), AUDIO_PERMISSION_CODE)
        }
    }
}
