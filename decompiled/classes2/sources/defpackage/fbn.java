package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fbn {
    public static final java.lang.Object a = new java.lang.Object();
    public static java.util.concurrent.ScheduledExecutorService b;
    public static int c;
    public final android.media.AudioTrack d;
    public final defpackage.faw e;
    public final float f;
    public defpackage.fbi g;
    public final defpackage.fbq h;
    public final boolean i;
    public final defpackage.fbm j;
    public final defpackage.eto k = new defpackage.eto(java.lang.Thread.currentThread());
    public boolean l;
    public long m;
    public long n;
    public int o;
    public int p;
    public final rai q;
    private final int r;

    public fbn(android.media.AudioTrack audioTrack, defpackage.faw fawVar, rai raiVar, float f, defpackage.etc etcVar) {
        int iJ;
        this.d = audioTrack;
        this.e = fawVar;
        this.f = f;
        this.q = raiVar;
        boolean zU = eum.U(fawVar.a);
        this.i = zU;
        if (zU) {
            iJ = eum.j(fawVar.a) * java.lang.Integer.bitCount(fawVar.c);
            this.r = iJ;
        } else {
            iJ = -1;
            this.r = -1;
        }
        int i = iJ;
        if (defpackage.eqe.b(10) && zU && !fawVar.d) {
            audioTrack.play();
            audioTrack.pause();
        }
        this.h = new defpackage.fbq(new rai(this), etcVar, audioTrack, fawVar.a, i, fawVar.e);
        if (raiVar != null) {
            this.g = new defpackage.fbi(audioTrack, raiVar);
        }
        this.j = f() ? new defpackage.fbm(this) : null;
    }

    public final int a() {
        return this.d.getSampleRate();
    }

    public final long b() {
        return this.d.getBufferSizeInFrames();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00af A[Catch: Exception -> 0x00bb, TRY_LEAVE, TryCatch #1 {Exception -> 0x00bb, blocks: (B:25:0x009d, B:27:0x00af), top: B:123:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x0116  */
    /* JADX WARN: Code duplicated, block: B:46:0x011a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0133  */
    /* JADX WARN: Code duplicated, block: B:50:0x0178  */
    /* JADX WARN: Code duplicated, block: B:52:0x0189  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:56:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:59:0x01de  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x01ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:72:0x0201  */
    /* JADX WARN: Code duplicated, block: B:73:0x0205  */
    /* JADX WARN: Code duplicated, block: B:75:0x0222  */
    /* JADX WARN: Code duplicated, block: B:78:0x0231  */
    /* JADX WARN: Code duplicated, block: B:79:0x0236  */
    /* JADX WARN: Code duplicated, block: B:80:0x0241  */
    /* JADX WARN: Code duplicated, block: B:81:0x0247  */
    /* JADX WARN: Code duplicated, block: B:83:0x024a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0254  */
    /* JADX WARN: Code duplicated, block: B:87:0x0265  */
    /* JADX WARN: Code duplicated, block: B:89:0x026c  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x0133, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x0189, please report this as an issue */
    public final long c() {
        android.media.AudioTrack audioTrack;
        long j;
        long j2;
        defpackage.fbq fbqVar;
        int i;
        long j3;
        long j4;
        defpackage.fbf fbfVar;
        float f;
        long jB;
        defpackage.fbe fbeVar;
        android.media.AudioTimestamp audioTimestamp;
        boolean timestamp;
        defpackage.fbq fbqVar2;
        boolean z;
        float f2;
        long j5;
        int i2;
        int i3;
        long j6;
        long j7;
        long j8;
        float f3;
        defpackage.fbf fbfVar2;
        long j9;
        long jA;
        long jA2;
        long j10;
        java.lang.reflect.Method method;
        long j11;
        java.lang.reflect.Method method2;
        long jMax;
        long jD = d();
        defpackage.fbq fbqVar3 = this.h;
        android.media.AudioTrack audioTrack2 = fbqVar3.c;
        ahvr.ci(audioTrack2);
        if (audioTrack2.getPlayState() == 3) {
            defpackage.etc etcVar = fbqVar3.a;
            long jNanoTime = java.lang.System.nanoTime() / 1000;
            j = 1000;
            if (jNanoTime - fbqVar3.k >= 30000) {
                long jC = fbqVar3.c();
                if (jC == 0) {
                    jD = jD;
                    fbqVar = fbqVar3;
                    audioTrack = audioTrack2;
                    j2 = 0;
                } else {
                    long[] jArr = fbqVar3.b;
                    jArr[fbqVar3.o] = eum.v(jC, fbqVar3.h) - jNanoTime;
                    fbqVar3.o = (fbqVar3.o + 1) % 10;
                    int i4 = fbqVar3.p;
                    if (i4 < 10) {
                        fbqVar3.p = i4 + 1;
                    }
                    fbqVar3.k = jNanoTime;
                    fbqVar3.j = 0L;
                    int i5 = 0;
                    while (true) {
                        int i6 = fbqVar3.p;
                        if (i5 >= i6) {
                            break;
                        }
                        int i7 = i5;
                        fbqVar3.j += jArr[i7] / ((long) i6);
                        i5 = i7 + 1;
                    }
                    j3 = fbqVar3.m;
                    if (fbqVar3.f && (method = fbqVar3.l) != null && jNanoTime - fbqVar3.n >= 500000) {
                        try {
                            ahvr.ci(audioTrack2);
                            java.lang.Integer num = (java.lang.Integer) method.invoke(audioTrack2, null);
                            java.lang.String str = eum.a;
                            j11 = jNanoTime;
                            try {
                                long jIntValue = (((long) num.intValue()) * 1000) - fbqVar3.e;
                                fbqVar3.m = jIntValue;
                                jMax = java.lang.Math.max(jIntValue, 0L);
                                fbqVar3.m = jMax;
                                if (jMax > 10000000) {
                                    defpackage.etr.f("AudioTrackAudioOutput", a.bz(jMax, "Ignoring impossibly large audio latency: "));
                                    fbqVar3.m = 0L;
                                }
                            } catch (java.lang.Exception unused) {
                                method2 = null;
                                fbqVar3.l = method2;
                            }
                        } catch (java.lang.Exception unused2) {
                            j11 = jNanoTime;
                            method2 = null;
                        }
                        jNanoTime = j11;
                        fbqVar3.n = jNanoTime;
                    }
                    j4 = fbqVar3.m;
                    fbfVar = fbqVar3.g;
                    f = fbqVar3.h;
                    j2 = 0;
                    jB = fbqVar3.b(jNanoTime);
                    if (j3 == j4 || jNanoTime - fbfVar.e >= fbfVar.d) {
                        fbfVar.e = jNanoTime;
                        fbeVar = fbfVar.a;
                        android.media.AudioTrack audioTrack3 = fbeVar.a;
                        audioTimestamp = fbeVar.b;
                        timestamp = audioTrack3.getTimestamp(audioTimestamp);
                        if (timestamp) {
                            j10 = audioTimestamp.framePosition;
                            if (fbeVar.d > j10) {
                                fbeVar.c++;
                            }
                            fbeVar.d = j10;
                            fbeVar.e = j10 + fbeVar.f + (fbeVar.c << 32);
                        }
                        if (timestamp) {
                            jA = fbeVar.a();
                            jA2 = fbfVar.a(jNanoTime, f);
                            j5 = 500000;
                            if (java.lang.Math.abs(jA - jNanoTime) > 5000000) {
                                rai raiVar = fbfVar.h;
                                f2 = f;
                                fbqVar2 = fbqVar3;
                                audioTrack = audioTrack2;
                                z = timestamp;
                                java.lang.String str2 = "Spurious audio timestamp (system clock mismatch): " + fbeVar.e + ", " + jA + ", " + jNanoTime + ", " + jB + ", " + ((defpackage.fbn) raiVar.a).d();
                                int i8 = defpackage.equ.a;
                                defpackage.etr.f("AudioTrackAudioOutput", str2);
                                fbfVar.c(4);
                            } else {
                                fbqVar2 = fbqVar3;
                                audioTrack = audioTrack2;
                                z = timestamp;
                                f2 = f;
                                if (java.lang.Math.abs(jA2 - jB) > 5000000) {
                                    rai raiVar2 = fbfVar.h;
                                    java.lang.String str3 = "Spurious audio timestamp (frame position mismatch): " + fbeVar.e + ", " + jA + ", " + jNanoTime + ", " + jB + ", " + ((defpackage.fbn) raiVar2.a).d();
                                    int i9 = defpackage.equ.a;
                                    defpackage.etr.f("AudioTrackAudioOutput", str3);
                                    fbfVar.c(4);
                                } else {
                                    if (fbfVar.b == 4) {
                                        i2 = 0;
                                        fbfVar.c(0);
                                    }
                                    i3 = fbfVar.b;
                                    if (i3 != 0) {
                                        if (i3 != 1) {
                                            if (i3 != 2) {
                                                if (i3 == 3 && z) {
                                                    fbfVar.c(i2);
                                                }
                                            } else if (!z) {
                                                fbfVar.c(i2);
                                            }
                                        } else if (z) {
                                            j6 = fbeVar.e;
                                            j7 = jNanoTime;
                                            j8 = fbfVar.f;
                                            if (j6 <= j8) {
                                                fbfVar2 = fbfVar;
                                                j9 = j7;
                                            } else {
                                                f3 = f2;
                                                fbfVar2 = fbfVar;
                                                j9 = j7;
                                                if (java.lang.Math.abs(fbfVar2.a(j9, f3) - fbfVar.b(j8, fbfVar.g, j7, f3)) < 1000) {
                                                    fbfVar2.c(2);
                                                }
                                            }
                                            if (j9 - fbfVar2.c > 2000000) {
                                                fbfVar2.c(3);
                                            } else {
                                                fbfVar2.f = fbeVar.e;
                                                fbfVar2.g = fbeVar.a();
                                            }
                                        } else {
                                            fbfVar.c(0);
                                        }
                                    } else if (z) {
                                        if (fbeVar.a() >= fbfVar.c) {
                                            fbfVar.f = fbeVar.e;
                                            fbfVar.g = fbeVar.a();
                                            fbfVar.c(1);
                                        }
                                    } else if (jNanoTime - fbfVar.c > j5) {
                                        fbfVar.c(3);
                                    }
                                    fbqVar = fbqVar2;
                                }
                            }
                        } else {
                            fbqVar2 = fbqVar3;
                            audioTrack = audioTrack2;
                            z = timestamp;
                            f2 = f;
                            j5 = 500000;
                        }
                        i2 = 0;
                        i3 = fbfVar.b;
                        if (i3 != 0) {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    if (i3 == 3) {
                                        fbfVar.c(i2);
                                    }
                                } else if (!z) {
                                    fbfVar.c(i2);
                                }
                            } else if (z) {
                                j6 = fbeVar.e;
                                j7 = jNanoTime;
                                j8 = fbfVar.f;
                                if (j6 <= j8) {
                                    fbfVar2 = fbfVar;
                                    j9 = j7;
                                } else {
                                    f3 = f2;
                                    fbfVar2 = fbfVar;
                                    j9 = j7;
                                    if (java.lang.Math.abs(fbfVar2.a(j9, f3) - fbfVar.b(j8, fbfVar.g, j7, f3)) < 1000) {
                                        fbfVar2.c(2);
                                    }
                                }
                                if (j9 - fbfVar2.c > 2000000) {
                                    fbfVar2.c(3);
                                } else {
                                    fbfVar2.f = fbeVar.e;
                                    fbfVar2.g = fbeVar.a();
                                }
                            } else {
                                fbfVar.c(0);
                            }
                        } else if (z) {
                            if (fbeVar.a() >= fbfVar.c) {
                                fbfVar.f = fbeVar.e;
                                fbfVar.g = fbeVar.a();
                                fbfVar.c(1);
                            }
                        } else if (jNanoTime - fbfVar.c > j5) {
                            fbfVar.c(3);
                        }
                        fbqVar = fbqVar2;
                    } else {
                        jD = jD;
                        fbqVar = fbqVar3;
                        audioTrack = audioTrack2;
                    }
                }
            } else {
                j3 = fbqVar3.m;
                if (fbqVar3.f) {
                    ahvr.ci(audioTrack2);
                    java.lang.Integer num2 = (java.lang.Integer) method.invoke(audioTrack2, null);
                    java.lang.String str4 = eum.a;
                    j11 = jNanoTime;
                    long jIntValue2 = (((long) num2.intValue()) * 1000) - fbqVar3.e;
                    fbqVar3.m = jIntValue2;
                    jMax = java.lang.Math.max(jIntValue2, 0L);
                    fbqVar3.m = jMax;
                    if (jMax > 10000000) {
                        defpackage.etr.f("AudioTrackAudioOutput", a.bz(jMax, "Ignoring impossibly large audio latency: "));
                        fbqVar3.m = 0L;
                    }
                    jNanoTime = j11;
                    fbqVar3.n = jNanoTime;
                }
                j4 = fbqVar3.m;
                fbfVar = fbqVar3.g;
                f = fbqVar3.h;
                j2 = 0;
                jB = fbqVar3.b(jNanoTime);
                if (j3 == j4) {
                    fbfVar.e = jNanoTime;
                    fbeVar = fbfVar.a;
                    android.media.AudioTrack audioTrack4 = fbeVar.a;
                    audioTimestamp = fbeVar.b;
                    timestamp = audioTrack4.getTimestamp(audioTimestamp);
                    if (timestamp) {
                        j10 = audioTimestamp.framePosition;
                        if (fbeVar.d > j10) {
                            fbeVar.c++;
                        }
                        fbeVar.d = j10;
                        fbeVar.e = j10 + fbeVar.f + (fbeVar.c << 32);
                    }
                    if (timestamp) {
                        jA = fbeVar.a();
                        jA2 = fbfVar.a(jNanoTime, f);
                        j5 = 500000;
                        if (java.lang.Math.abs(jA - jNanoTime) > 5000000) {
                            rai raiVar3 = fbfVar.h;
                            f2 = f;
                            fbqVar2 = fbqVar3;
                            audioTrack = audioTrack2;
                            z = timestamp;
                            java.lang.String str5 = "Spurious audio timestamp (system clock mismatch): " + fbeVar.e + ", " + jA + ", " + jNanoTime + ", " + jB + ", " + ((defpackage.fbn) raiVar3.a).d();
                            int i10 = defpackage.equ.a;
                            defpackage.etr.f("AudioTrackAudioOutput", str5);
                            fbfVar.c(4);
                        } else {
                            fbqVar2 = fbqVar3;
                            audioTrack = audioTrack2;
                            z = timestamp;
                            f2 = f;
                            if (java.lang.Math.abs(jA2 - jB) > 5000000) {
                                rai raiVar4 = fbfVar.h;
                                java.lang.String str6 = "Spurious audio timestamp (frame position mismatch): " + fbeVar.e + ", " + jA + ", " + jNanoTime + ", " + jB + ", " + ((defpackage.fbn) raiVar4.a).d();
                                int i11 = defpackage.equ.a;
                                defpackage.etr.f("AudioTrackAudioOutput", str6);
                                fbfVar.c(4);
                            } else {
                                if (fbfVar.b == 4) {
                                    i2 = 0;
                                    fbfVar.c(0);
                                }
                                i3 = fbfVar.b;
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        if (i3 != 2) {
                                            if (i3 == 3) {
                                                fbfVar.c(i2);
                                            }
                                        } else if (!z) {
                                            fbfVar.c(i2);
                                        }
                                    } else if (z) {
                                        j6 = fbeVar.e;
                                        j7 = jNanoTime;
                                        j8 = fbfVar.f;
                                        if (j6 <= j8) {
                                            fbfVar2 = fbfVar;
                                            j9 = j7;
                                        } else {
                                            f3 = f2;
                                            fbfVar2 = fbfVar;
                                            j9 = j7;
                                            if (java.lang.Math.abs(fbfVar2.a(j9, f3) - fbfVar.b(j8, fbfVar.g, j7, f3)) < 1000) {
                                                fbfVar2.c(2);
                                            }
                                        }
                                        if (j9 - fbfVar2.c > 2000000) {
                                            fbfVar2.c(3);
                                        } else {
                                            fbfVar2.f = fbeVar.e;
                                            fbfVar2.g = fbeVar.a();
                                        }
                                    } else {
                                        fbfVar.c(0);
                                    }
                                } else if (z) {
                                    if (fbeVar.a() >= fbfVar.c) {
                                        fbfVar.f = fbeVar.e;
                                        fbfVar.g = fbeVar.a();
                                        fbfVar.c(1);
                                    }
                                } else if (jNanoTime - fbfVar.c > j5) {
                                    fbfVar.c(3);
                                }
                                fbqVar = fbqVar2;
                            }
                        }
                    } else {
                        fbqVar2 = fbqVar3;
                        audioTrack = audioTrack2;
                        z = timestamp;
                        f2 = f;
                        j5 = 500000;
                    }
                    i2 = 0;
                    i3 = fbfVar.b;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    fbfVar.c(i2);
                                }
                            } else if (!z) {
                                fbfVar.c(i2);
                            }
                        } else if (z) {
                            j6 = fbeVar.e;
                            j7 = jNanoTime;
                            j8 = fbfVar.f;
                            if (j6 <= j8) {
                                fbfVar2 = fbfVar;
                                j9 = j7;
                            } else {
                                f3 = f2;
                                fbfVar2 = fbfVar;
                                j9 = j7;
                                if (java.lang.Math.abs(fbfVar2.a(j9, f3) - fbfVar.b(j8, fbfVar.g, j7, f3)) < 1000) {
                                    fbfVar2.c(2);
                                }
                            }
                            if (j9 - fbfVar2.c > 2000000) {
                                fbfVar2.c(3);
                            } else {
                                fbfVar2.f = fbeVar.e;
                                fbfVar2.g = fbeVar.a();
                            }
                        } else {
                            fbfVar.c(0);
                        }
                    } else if (z) {
                        if (fbeVar.a() >= fbfVar.c) {
                            fbfVar.f = fbeVar.e;
                            fbfVar.g = fbeVar.a();
                            fbfVar.c(1);
                        }
                    } else if (jNanoTime - fbfVar.c > j5) {
                        fbfVar.c(3);
                    }
                    fbqVar = fbqVar2;
                } else {
                    fbfVar.e = jNanoTime;
                    fbeVar = fbfVar.a;
                    android.media.AudioTrack audioTrack5 = fbeVar.a;
                    audioTimestamp = fbeVar.b;
                    timestamp = audioTrack5.getTimestamp(audioTimestamp);
                    if (timestamp) {
                        j10 = audioTimestamp.framePosition;
                        if (fbeVar.d > j10) {
                            fbeVar.c++;
                        }
                        fbeVar.d = j10;
                        fbeVar.e = j10 + fbeVar.f + (fbeVar.c << 32);
                    }
                    if (timestamp) {
                        jA = fbeVar.a();
                        jA2 = fbfVar.a(jNanoTime, f);
                        j5 = 500000;
                        if (java.lang.Math.abs(jA - jNanoTime) > 5000000) {
                            rai raiVar5 = fbfVar.h;
                            f2 = f;
                            fbqVar2 = fbqVar3;
                            audioTrack = audioTrack2;
                            z = timestamp;
                            java.lang.String str7 = "Spurious audio timestamp (system clock mismatch): " + fbeVar.e + ", " + jA + ", " + jNanoTime + ", " + jB + ", " + ((defpackage.fbn) raiVar5.a).d();
                            int i12 = defpackage.equ.a;
                            defpackage.etr.f("AudioTrackAudioOutput", str7);
                            fbfVar.c(4);
                        } else {
                            fbqVar2 = fbqVar3;
                            audioTrack = audioTrack2;
                            z = timestamp;
                            f2 = f;
                            if (java.lang.Math.abs(jA2 - jB) > 5000000) {
                                rai raiVar6 = fbfVar.h;
                                java.lang.String str8 = "Spurious audio timestamp (frame position mismatch): " + fbeVar.e + ", " + jA + ", " + jNanoTime + ", " + jB + ", " + ((defpackage.fbn) raiVar6.a).d();
                                int i13 = defpackage.equ.a;
                                defpackage.etr.f("AudioTrackAudioOutput", str8);
                                fbfVar.c(4);
                            } else {
                                if (fbfVar.b == 4) {
                                    i2 = 0;
                                    fbfVar.c(0);
                                }
                                i3 = fbfVar.b;
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        if (i3 != 2) {
                                            if (i3 == 3) {
                                                fbfVar.c(i2);
                                            }
                                        } else if (!z) {
                                            fbfVar.c(i2);
                                        }
                                    } else if (z) {
                                        j6 = fbeVar.e;
                                        j7 = jNanoTime;
                                        j8 = fbfVar.f;
                                        if (j6 <= j8) {
                                            fbfVar2 = fbfVar;
                                            j9 = j7;
                                        } else {
                                            f3 = f2;
                                            fbfVar2 = fbfVar;
                                            j9 = j7;
                                            if (java.lang.Math.abs(fbfVar2.a(j9, f3) - fbfVar.b(j8, fbfVar.g, j7, f3)) < 1000) {
                                                fbfVar2.c(2);
                                            }
                                        }
                                        if (j9 - fbfVar2.c > 2000000) {
                                            fbfVar2.c(3);
                                        } else {
                                            fbfVar2.f = fbeVar.e;
                                            fbfVar2.g = fbeVar.a();
                                        }
                                    } else {
                                        fbfVar.c(0);
                                    }
                                } else if (z) {
                                    if (fbeVar.a() >= fbfVar.c) {
                                        fbfVar.f = fbeVar.e;
                                        fbfVar.g = fbeVar.a();
                                        fbfVar.c(1);
                                    }
                                } else if (jNanoTime - fbfVar.c > j5) {
                                    fbfVar.c(3);
                                }
                                fbqVar = fbqVar2;
                            }
                        }
                    } else {
                        fbqVar2 = fbqVar3;
                        audioTrack = audioTrack2;
                        z = timestamp;
                        f2 = f;
                        j5 = 500000;
                    }
                    i2 = 0;
                    i3 = fbfVar.b;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    fbfVar.c(i2);
                                }
                            } else if (!z) {
                                fbfVar.c(i2);
                            }
                        } else if (z) {
                            j6 = fbeVar.e;
                            j7 = jNanoTime;
                            j8 = fbfVar.f;
                            if (j6 <= j8) {
                                fbfVar2 = fbfVar;
                                j9 = j7;
                            } else {
                                f3 = f2;
                                fbfVar2 = fbfVar;
                                j9 = j7;
                                if (java.lang.Math.abs(fbfVar2.a(j9, f3) - fbfVar.b(j8, fbfVar.g, j7, f3)) < 1000) {
                                    fbfVar2.c(2);
                                }
                            }
                            if (j9 - fbfVar2.c > 2000000) {
                                fbfVar2.c(3);
                            } else {
                                fbfVar2.f = fbeVar.e;
                                fbfVar2.g = fbeVar.a();
                            }
                        } else {
                            fbfVar.c(0);
                        }
                    } else if (z) {
                        if (fbeVar.a() >= fbfVar.c) {
                            fbfVar.f = fbeVar.e;
                            fbfVar.g = fbeVar.a();
                            fbfVar.c(1);
                        }
                    } else if (jNanoTime - fbfVar.c > j5) {
                        fbfVar.c(3);
                    }
                    fbqVar = fbqVar2;
                }
            }
        } else {
            jD = jD;
            audioTrack = audioTrack2;
            j = 1000;
            j2 = 0;
            fbqVar = fbqVar3;
        }
        defpackage.etc etcVar2 = fbqVar.a;
        long jNanoTime2 = java.lang.System.nanoTime() / j;
        defpackage.fbf fbfVar3 = fbqVar.g;
        boolean z2 = fbfVar3.b == 2;
        long jA3 = z2 ? fbfVar3.a(jNanoTime2, fbqVar.h) : fbqVar.b(jNanoTime2);
        long jY = eum.y(jD, fbqVar.d);
        if (jA3 >= jY) {
            fbqVar.e();
            fbfVar3.c(0);
            return jY;
        }
        int playState = audioTrack.getPlayState();
        if (playState != 3) {
            if (playState != 1) {
                return jA3;
            }
            fbqVar.d(jA3);
            return jA3;
        }
        if (z2 || ((i = fbfVar3.b) != 0 && i != 1)) {
            fbqVar.d(jA3);
        }
        long j12 = fbqVar.v;
        if (j12 != -9223372036854775807L) {
            long j13 = jA3 - fbqVar.u;
            long jU = eum.u(jNanoTime2 - j12, fbqVar.h);
            long j14 = fbqVar.u + jU;
            long jAbs = java.lang.Math.abs(j14 - jA3);
            if (j13 != j2 && jAbs < 1000000) {
                long j15 = (jU * 10) / 100;
                jA3 = eum.s(jA3, j14 - j15, j14 + j15);
            }
        }
        fbqVar.v = jNanoTime2;
        fbqVar.u = jA3;
        return jA3;
    }

    public final long d() {
        if (!this.i) {
            return this.n;
        }
        long j = this.m;
        int i = this.r;
        java.lang.String str = eum.a;
        long j2 = i;
        return ((j + j2) - 1) / j2;
    }

    public final void e(android.media.AudioDeviceInfo audioDeviceInfo) {
        this.d.setPreferredDevice(audioDeviceInfo);
    }

    public final boolean f() {
        return fn$.ExternalSyntheticApiModelOutline0.m(this.d);
    }
}
