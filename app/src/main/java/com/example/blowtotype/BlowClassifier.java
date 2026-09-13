package com.example.blowtotype;
public class BlowClassifier {
    public static double[] score(double[] input) {
        double[] var0;
        if (input[0] <= 513.4866333007812) {
            if (input[1] <= 0.03220685012638569) {
                if (input[2] <= 28.533024787902832) {
                    var0 = new double[] {1.0, 0.0};
                } else {
                    if (input[2] <= 38.83869934082031) {
                        var0 = new double[] {0.0, 1.0};
                    } else {
                        var0 = new double[] {1.0, 0.0};
                    }
                }
            } else {
                if (input[2] <= 37.13365936279297) {
                    if (input[0] <= 122.63995361328125) {
                        var0 = new double[] {0.0, 1.0};
                    } else {
                        if (input[0] <= 169.8493423461914) {
                            var0 = new double[] {0.8181818181818182, 0.18181818181818182};
                        } else {
                            var0 = new double[] {1.0, 0.0};
                        }
                    }
                } else {
                    var0 = new double[] {1.0, 0.0};
                }
            }
        } else {
            if (input[0] <= 2236.3854370117188) {
                if (input[2] <= 98.8287353515625) {
                    if (input[1] <= 0.0011340439523337409) {
                        var0 = new double[] {1.0, 0.0};
                    } else {
                        var0 = new double[] {0.0, 1.0};
                    }
                } else {
                    var0 = new double[] {1.0, 0.0};
                }
            } else {
                var0 = new double[] {0.0, 1.0};
            }
        }
        double[] var1;
        if (input[2] <= 35.53423500061035) {
            if (input[2] <= 27.599278450012207) {
                var1 = new double[] {1.0, 0.0};
            } else {
                if (input[2] <= 28.294342041015625) {
                    var1 = new double[] {0.0, 1.0};
                } else {
                    if (input[2] <= 28.533024787902832) {
                        var1 = new double[] {1.0, 0.0};
                    } else {
                        if (input[1] <= 0.03254706226289272) {
                            var1 = new double[] {0.07142857142857142, 0.9285714285714286};
                        } else {
                            var1 = new double[] {0.5454545454545454, 0.45454545454545453};
                        }
                    }
                }
            }
        } else {
            if (input[0] <= 873.3253479003906) {
                if (input[2] <= 48.81095504760742) {
                    if (input[2] <= 47.68902587890625) {
                        var1 = new double[] {1.0, 0.0};
                    } else {
                        var1 = new double[] {0.0, 1.0};
                    }
                } else {
                    var1 = new double[] {1.0, 0.0};
                }
            } else {
                var1 = new double[] {0.0, 1.0};
            }
        }
        double[] var2;
        if (input[1] <= 0.0258562033995986) {
            if (input[1] <= 0.01939215324819088) {
                var2 = new double[] {0.0, 1.0};
            } else {
                if (input[1] <= 0.022113858722150326) {
                    var2 = new double[] {1.0, 0.0};
                } else {
                    var2 = new double[] {0.0, 1.0};
                }
            }
        } else {
            if (input[0] <= 569.9469604492188) {
                if (input[2] <= 31.88619899749756) {
                    if (input[2] <= 31.236462593078613) {
                        if (input[2] <= 28.471314430236816) {
                            var2 = new double[] {0.8181818181818182, 0.18181818181818182};
                        } else {
                            var2 = new double[] {1.0, 0.0};
                        }
                    } else {
                        var2 = new double[] {0.0, 1.0};
                    }
                } else {
                    if (input[1] <= 0.1862100288271904) {
                        if (input[0] <= 513.4866333007812) {
                            var2 = new double[] {1.0, 0.0};
                        } else {
                            var2 = new double[] {0.6666666666666666, 0.3333333333333333};
                        }
                    } else {
                        if (input[1] <= 0.2057155817747116) {
                            var2 = new double[] {0.0, 1.0};
                        } else {
                            var2 = new double[] {1.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[2] <= 469.73754501342773) {
                    var2 = new double[] {0.0, 1.0};
                } else {
                    var2 = new double[] {1.0, 0.0};
                }
            }
        }
        double[] var3;
        if (input[2] <= 223.92396545410156) {
            if (input[1] <= 0.0375368557870388) {
                if (input[0] <= 496.65858459472656) {
                    if (input[0] <= 402.46937561035156) {
                        if (input[1] <= 0.021433431655168533) {
                            var3 = new double[] {0.0, 1.0};
                        } else {
                            var3 = new double[] {0.75, 0.25};
                        }
                    } else {
                        var3 = new double[] {1.0, 0.0};
                    }
                } else {
                    if (input[0] <= 1821.5742797851562) {
                        var3 = new double[] {0.0, 1.0};
                    } else {
                        if (input[1] <= 0.004082558254594915) {
                            var3 = new double[] {1.0, 0.0};
                        } else {
                            var3 = new double[] {0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[2] <= 40.347639083862305) {
                    if (input[0] <= 650.9071350097656) {
                        if (input[1] <= 0.10433204844594002) {
                            var3 = new double[] {0.9473684210526315, 0.05263157894736842};
                        } else {
                            var3 = new double[] {0.0, 1.0};
                        }
                    } else {
                        var3 = new double[] {0.0, 1.0};
                    }
                } else {
                    var3 = new double[] {1.0, 0.0};
                }
            }
        } else {
            if (input[2] <= 720.9373779296875) {
                if (input[2] <= 258.38336181640625) {
                    if (input[0] <= 3308.4209594726562) {
                        var3 = new double[] {1.0, 0.0};
                    } else {
                        var3 = new double[] {0.0, 1.0};
                    }
                } else {
                    if (input[1] <= 0.1807666067034006) {
                        var3 = new double[] {0.0, 1.0};
                    } else {
                        var3 = new double[] {1.0, 0.0};
                    }
                }
            } else {
                var3 = new double[] {1.0, 0.0};
            }
        }
        double[] var4;
        if (input[2] <= 294.5708923339844) {
            if (input[1] <= 0.030959400348365307) {
                if (input[0] <= 507.0493621826172) {
                    if (input[0] <= 314.16522216796875) {
                        var4 = new double[] {0.0, 1.0};
                    } else {
                        if (input[0] <= 435.86212158203125) {
                            var4 = new double[] {0.5, 0.5};
                        } else {
                            var4 = new double[] {1.0, 0.0};
                        }
                    }
                } else {
                    if (input[0] <= 1893.5326538085938) {
                        var4 = new double[] {0.0, 1.0};
                    } else {
                        if (input[2] <= 61.01916313171387) {
                            var4 = new double[] {1.0, 0.0};
                        } else {
                            var4 = new double[] {0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[2] <= 40.347639083862305) {
                    if (input[2] <= 39.98456382751465) {
                        if (input[0] <= 129.76971817016602) {
                            var4 = new double[] {0.0, 1.0};
                        } else {
                            var4 = new double[] {0.8709677419354839, 0.12903225806451613};
                        }
                    } else {
                        var4 = new double[] {0.0, 1.0};
                    }
                } else {
                    if (input[2] <= 89.3624038696289) {
                        if (input[1] <= 0.035268768668174744) {
                            var4 = new double[] {0.3333333333333333, 0.6666666666666666};
                        } else {
                            var4 = new double[] {0.94, 0.06};
                        }
                    } else {
                        var4 = new double[] {1.0, 0.0};
                    }
                }
            }
        } else {
            if (input[2] <= 536.6986389160156) {
                var4 = new double[] {0.0, 1.0};
            } else {
                if (input[2] <= 572.1976013183594) {
                    var4 = new double[] {1.0, 0.0};
                } else {
                    var4 = new double[] {0.0, 1.0};
                }
            }
        }
        double[] var5;
        if (input[1] <= 0.028237695805728436) {
            if (input[1] <= 0.0011340439523337409) {
                if (input[1] <= 0.00011340439959894866) {
                    if (input[0] <= 417.81932067871094) {
                        var5 = new double[] {0.0, 1.0};
                    } else {
                        var5 = new double[] {1.0, 0.0};
                    }
                } else {
                    var5 = new double[] {1.0, 0.0};
                }
            } else {
                if (input[2] <= 47.14256286621094) {
                    if (input[0] <= 449.9025115966797) {
                        var5 = new double[] {1.0, 0.0};
                    } else {
                        var5 = new double[] {0.0, 1.0};
                    }
                } else {
                    var5 = new double[] {0.0, 1.0};
                }
            }
        } else {
            if (input[1] <= 0.1064867302775383) {
                if (input[2] <= 38.64432334899902) {
                    if (input[0] <= 650.9071350097656) {
                        if (input[1] <= 0.060671353712677956) {
                            var5 = new double[] {1.0, 0.0};
                        } else {
                            var5 = new double[] {0.4, 0.6};
                        }
                    } else {
                        var5 = new double[] {0.0, 1.0};
                    }
                } else {
                    if (input[1] <= 0.03889770805835724) {
                        if (input[1] <= 0.03458834066987038) {
                            var5 = new double[] {1.0, 0.0};
                        } else {
                            var5 = new double[] {0.0, 1.0};
                        }
                    } else {
                        var5 = new double[] {1.0, 0.0};
                    }
                }
            } else {
                if (input[1] <= 0.10943524539470673) {
                    var5 = new double[] {0.0, 1.0};
                } else {
                    if (input[0] <= 134.09543991088867) {
                        if (input[2] <= 43.52128505706787) {
                            var5 = new double[] {0.0, 1.0};
                        } else {
                            var5 = new double[] {1.0, 0.0};
                        }
                    } else {
                        if (input[1] <= 0.13177590817213058) {
                            var5 = new double[] {0.8888888888888888, 0.1111111111111111};
                        } else {
                            var5 = new double[] {1.0, 0.0};
                        }
                    }
                }
            }
        }
        double[] var6;
        if (input[1] <= 0.03708323836326599) {
            if (input[2] <= 25.669014930725098) {
                var6 = new double[] {1.0, 0.0};
            } else {
                if (input[2] <= 46.759334564208984) {
                    if (input[1] <= 0.030392378568649292) {
                        if (input[2] <= 28.533024787902832) {
                            var6 = new double[] {0.5, 0.5};
                        } else {
                            var6 = new double[] {0.07692307692307693, 0.9230769230769231};
                        }
                    } else {
                        var6 = new double[] {1.0, 0.0};
                    }
                } else {
                    var6 = new double[] {0.0, 1.0};
                }
            }
        } else {
            if (input[1] <= 0.07745520770549774) {
                var6 = new double[] {1.0, 0.0};
            } else {
                if (input[1] <= 0.07915627211332321) {
                    var6 = new double[] {0.0, 1.0};
                } else {
                    if (input[2] <= 42.58571243286133) {
                        if (input[0] <= 640.1066131591797) {
                            var6 = new double[] {1.0, 0.0};
                        } else {
                            var6 = new double[] {0.0, 1.0};
                        }
                    } else {
                        if (input[0] <= 1756.0580444335938) {
                            var6 = new double[] {1.0, 0.0};
                        } else {
                            var6 = new double[] {0.0, 1.0};
                        }
                    }
                }
            }
        }
        double[] var7;
        if (input[0] <= 873.3253479003906) {
            if (input[1] <= 0.026876842603087425) {
                if (input[2] <= 39.661521911621094) {
                    if (input[1] <= 0.02460875455290079) {
                        var7 = new double[] {0.0, 1.0};
                    } else {
                        if (input[0] <= 276.5795440673828) {
                            var7 = new double[] {1.0, 0.0};
                        } else {
                            var7 = new double[] {0.0, 1.0};
                        }
                    }
                } else {
                    var7 = new double[] {1.0, 0.0};
                }
            } else {
                if (input[2] <= 49.72914695739746) {
                    if (input[2] <= 47.67904472351074) {
                        if (input[1] <= 0.10988886281847954) {
                            var7 = new double[] {0.9787234042553191, 0.02127659574468085};
                        } else {
                            var7 = new double[] {0.0, 1.0};
                        }
                    } else {
                        var7 = new double[] {0.0, 1.0};
                    }
                } else {
                    var7 = new double[] {1.0, 0.0};
                }
            }
        } else {
            if (input[2] <= 35.384145736694336) {
                var7 = new double[] {1.0, 0.0};
            } else {
                if (input[1] <= 0.10523928329348564) {
                    var7 = new double[] {0.0, 1.0};
                } else {
                    var7 = new double[] {1.0, 0.0};
                }
            }
        }
        double[] var8;
        if (input[2] <= 143.42411041259766) {
            if (input[1] <= 0.030959400348365307) {
                if (input[0] <= 507.0493621826172) {
                    if (input[0] <= 396.557861328125) {
                        if (input[1] <= 0.019051939249038696) {
                            var8 = new double[] {0.0, 1.0};
                        } else {
                            var8 = new double[] {0.5714285714285714, 0.42857142857142855};
                        }
                    } else {
                        if (input[1] <= 0.025629394687712193) {
                            var8 = new double[] {0.5, 0.5};
                        } else {
                            var8 = new double[] {1.0, 0.0};
                        }
                    }
                } else {
                    var8 = new double[] {0.0, 1.0};
                }
            } else {
                if (input[1] <= 0.17759129405021667) {
                    if (input[0] <= 851.7269592285156) {
                        if (input[1] <= 0.033454298973083496) {
                            var8 = new double[] {0.6666666666666666, 0.3333333333333333};
                        } else {
                            var8 = new double[] {0.9787234042553191, 0.02127659574468085};
                        }
                    } else {
                        var8 = new double[] {0.0, 1.0};
                    }
                } else {
                    var8 = new double[] {0.0, 1.0};
                }
            }
        } else {
            if (input[0] <= 1869.5421447753906) {
                var8 = new double[] {1.0, 0.0};
            } else {
                var8 = new double[] {0.0, 1.0};
            }
        }
        double[] var9;
        if (input[0] <= 507.69061279296875) {
            if (input[1] <= 0.019051939249038696) {
                var9 = new double[] {0.0, 1.0};
            } else {
                if (input[0] <= 122.63995361328125) {
                    if (input[0] <= 109.38230514526367) {
                        var9 = new double[] {0.0, 1.0};
                    } else {
                        if (input[2] <= 22.636828422546387) {
                            var9 = new double[] {1.0, 0.0};
                        } else {
                            var9 = new double[] {0.3333333333333333, 0.6666666666666666};
                        }
                    }
                } else {
                    if (input[0] <= 237.0251235961914) {
                        if (input[0] <= 230.53557586669922) {
                            var9 = new double[] {0.9830508474576272, 0.01694915254237288};
                        } else {
                            var9 = new double[] {0.0, 1.0};
                        }
                    } else {
                        var9 = new double[] {1.0, 0.0};
                    }
                }
            }
        } else {
            if (input[0] <= 2218.8449096679688) {
                if (input[0] <= 1030.8101501464844) {
                    if (input[2] <= 98.59435272216797) {
                        var9 = new double[] {0.0, 1.0};
                    } else {
                        var9 = new double[] {1.0, 0.0};
                    }
                } else {
                    if (input[2] <= 351.06664276123047) {
                        if (input[2] <= 41.180185317993164) {
                            var9 = new double[] {1.0, 0.0};
                        } else {
                            var9 = new double[] {0.0, 1.0};
                        }
                    } else {
                        var9 = new double[] {1.0, 0.0};
                    }
                }
            } else {
                var9 = new double[] {0.0, 1.0};
            }
        }
        double[] var10;
        if (input[0] <= 507.69061279296875) {
            if (input[2] <= 34.31003761291504) {
                if (input[0] <= 229.9058609008789) {
                    if (input[2] <= 26.617098808288574) {
                        var10 = new double[] {1.0, 0.0};
                    } else {
                        if (input[2] <= 28.471314430236816) {
                            var10 = new double[] {0.0, 1.0};
                        } else {
                            var10 = new double[] {0.85, 0.15};
                        }
                    }
                } else {
                    if (input[1] <= 0.007031072862446308) {
                        if (input[0] <= 417.81932067871094) {
                            var10 = new double[] {0.0, 1.0};
                        } else {
                            var10 = new double[] {1.0, 0.0};
                        }
                    } else {
                        var10 = new double[] {0.0, 1.0};
                    }
                }
            } else {
                var10 = new double[] {1.0, 0.0};
            }
        } else {
            if (input[1] <= 0.13290995359420776) {
                if (input[1] <= 0.04332048073410988) {
                    var10 = new double[] {0.0, 1.0};
                } else {
                    if (input[0] <= 851.7269592285156) {
                        var10 = new double[] {1.0, 0.0};
                    } else {
                        var10 = new double[] {0.0, 1.0};
                    }
                }
            } else {
                var10 = new double[] {1.0, 0.0};
            }
        }
        double[] var11;
        if (input[2] <= 119.74839401245117) {
            if (input[1] <= 0.030959400348365307) {
                if (input[0] <= 195.38373565673828) {
                    var11 = new double[] {1.0, 0.0};
                } else {
                    if (input[1] <= 0.0011340439523337409) {
                        var11 = new double[] {1.0, 0.0};
                    } else {
                        if (input[2] <= 41.14860725402832) {
                            var11 = new double[] {0.0, 1.0};
                        } else {
                            var11 = new double[] {0.1, 0.9};
                        }
                    }
                }
            } else {
                if (input[2] <= 58.44213676452637) {
                    if (input[2] <= 57.54985046386719) {
                        if (input[2] <= 29.745253562927246) {
                            var11 = new double[] {1.0, 0.0};
                        } else {
                            var11 = new double[] {0.8076923076923077, 0.19230769230769232};
                        }
                    } else {
                        var11 = new double[] {0.0, 1.0};
                    }
                } else {
                    var11 = new double[] {1.0, 0.0};
                }
            }
        } else {
            if (input[0] <= 1984.9834594726562) {
                var11 = new double[] {1.0, 0.0};
            } else {
                var11 = new double[] {0.0, 1.0};
            }
        }
        double[] var12;
        if (input[2] <= 98.28109359741211) {
            if (input[0] <= 513.4866333007812) {
                if (input[0] <= 323.28050231933594) {
                    if (input[1] <= 0.02109321765601635) {
                        var12 = new double[] {0.0, 1.0};
                    } else {
                        if (input[1] <= 0.06747562065720558) {
                            var12 = new double[] {0.925, 0.075};
                        } else {
                            var12 = new double[] {1.0, 0.0};
                        }
                    }
                } else {
                    if (input[1] <= 0.026876842603087425) {
                        if (input[1] <= 0.0062372419051826) {
                            var12 = new double[] {0.6666666666666666, 0.3333333333333333};
                        } else {
                            var12 = new double[] {0.0, 1.0};
                        }
                    } else {
                        var12 = new double[] {1.0, 0.0};
                    }
                }
            } else {
                if (input[2] <= 49.72914695739746) {
                    var12 = new double[] {0.0, 1.0};
                } else {
                    if (input[0] <= 951.2080688476562) {
                        var12 = new double[] {1.0, 0.0};
                    } else {
                        var12 = new double[] {0.0, 1.0};
                    }
                }
            }
        } else {
            if (input[2] <= 592.8136291503906) {
                if (input[0] <= 1736.5721130371094) {
                    var12 = new double[] {1.0, 0.0};
                } else {
                    var12 = new double[] {0.0, 1.0};
                }
            } else {
                var12 = new double[] {1.0, 0.0};
            }
        }
        double[] var13;
        if (input[2] <= 154.7161102294922) {
            if (input[0] <= 807.07763671875) {
                if (input[1] <= 0.019051939249038696) {
                    var13 = new double[] {0.0, 1.0};
                } else {
                    if (input[0] <= 120.80950927734375) {
                        var13 = new double[] {0.0, 1.0};
                    } else {
                        if (input[1] <= 0.030392378568649292) {
                            var13 = new double[] {0.6, 0.4};
                        } else {
                            var13 = new double[] {0.979381443298969, 0.020618556701030927};
                        }
                    }
                }
            } else {
                var13 = new double[] {0.0, 1.0};
            }
        } else {
            if (input[2] <= 536.6986389160156) {
                if (input[0] <= 2019.9307556152344) {
                    var13 = new double[] {1.0, 0.0};
                } else {
                    var13 = new double[] {0.0, 1.0};
                }
            } else {
                var13 = new double[] {1.0, 0.0};
            }
        }
        double[] var14;
        if (input[1] <= 0.032093445770442486) {
            if (input[1] <= 0.027784078381955624) {
                if (input[0] <= 2447.7703247070312) {
                    if (input[1] <= 0.0012474484246922657) {
                        if (input[1] <= 0.00011340439959894866) {
                            var14 = new double[] {0.16666666666666666, 0.8333333333333334};
                        } else {
                            var14 = new double[] {1.0, 0.0};
                        }
                    } else {
                        var14 = new double[] {0.0, 1.0};
                    }
                } else {
                    var14 = new double[] {0.0, 1.0};
                }
            } else {
                if (input[2] <= 60.50765037536621) {
                    if (input[2] <= 25.685649871826172) {
                        var14 = new double[] {1.0, 0.0};
                    } else {
                        if (input[1] <= 0.02846450451761484) {
                            var14 = new double[] {1.0, 0.0};
                        } else {
                            var14 = new double[] {0.0, 1.0};
                        }
                    }
                } else {
                    var14 = new double[] {0.0, 1.0};
                }
            }
        } else {
            if (input[1] <= 0.11034248024225235) {
                if (input[0] <= 851.7269592285156) {
                    if (input[0] <= 120.28414154052734) {
                        if (input[2] <= 22.636828422546387) {
                            var14 = new double[] {1.0, 0.0};
                        } else {
                            var14 = new double[] {0.0, 1.0};
                        }
                    } else {
                        if (input[1] <= 0.03776366449892521) {
                            var14 = new double[] {0.6666666666666666, 0.3333333333333333};
                        } else {
                            var14 = new double[] {0.975, 0.025};
                        }
                    }
                } else {
                    var14 = new double[] {0.0, 1.0};
                }
            } else {
                var14 = new double[] {1.0, 0.0};
            }
        }
        return mulVectorNumber(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(var0, var1), var2), var3), var4), var5), var6), var7), var8), var9), var10), var11), var12), var13), var14), 0.06666666666666667);
    }
    private static double[] addVectors(double[] v1, double[] v2) {
        double[] result = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] + v2[i];
        }
        return result;
    }
    private static double[] mulVectorNumber(double[] v1, double num) {
        double[] result = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] * num;
        }
        return result;
    }
}
