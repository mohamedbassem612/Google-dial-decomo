package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dym {
    private final android.content.Context a;
    private final defpackage.dyn b;
    private android.view.VelocityTracker c;
    private float d;
    private int e = -1;
    private int f = -1;
    private int g = -1;
    private final int[] h = {Integer.MAX_VALUE, 0};

    public dym(android.content.Context context, defpackage.dyn dynVar) {
        this.a = context;
        this.b = dynVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:73:0x0185  */
    public final void a(android.view.MotionEvent motionEvent, int i) {
        char c;
        int iP;
        int deviceId;
        int source;
        int identifier;
        char c2;
        int iP2;
        boolean z;
        boolean z2;
        float fM;
        float fA;
        int i2;
        long j;
        boolean z3;
        int i3 = i;
        int source2 = motionEvent.getSource();
        int deviceId2 = motionEvent.getDeviceId();
        if (this.f == source2 && this.g == deviceId2 && this.e == i3) {
            z = false;
        } else {
            android.content.Context context = this.a;
            int[] iArr = this.h;
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                iP = rp$.ExternalSyntheticApiModelOutline0.m(viewConfiguration, deviceId3, i3, source3);
            } else {
                if (defpackage.dzk.q(deviceId3, i3, source3)) {
                    android.content.res.Resources resources = context.getResources();
                    int identifier2 = (source3 == 4194304 && i3 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    j$.util.Objects.requireNonNull(viewConfiguration);
                    c = 0;
                    iP = defpackage.dzk.p(resources, identifier2, new dzt(viewConfiguration, 0), Integer.MAX_VALUE);
                } else {
                    iP = Integer.MAX_VALUE;
                }
                iArr[c] = iP;
                deviceId = motionEvent.getDeviceId();
                source = motionEvent.getSource();
                if (android.os.Build.VERSION.SDK_INT >= 34) {
                    iP2 = rp$.ExternalSyntheticApiModelOutline0.m$1(viewConfiguration, deviceId, i3, source);
                } else {
                    if (defpackage.dzk.q(deviceId, i3, source)) {
                        android.content.res.Resources resources2 = context.getResources();
                        if (source == 4194304 || i3 != 26) {
                            i3 = i3;
                            identifier = -1;
                        } else {
                            identifier = resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
                            i3 = 26;
                        }
                        j$.util.Objects.requireNonNull(viewConfiguration);
                        c2 = 1;
                        iP2 = defpackage.dzk.p(resources2, identifier, new dzt(viewConfiguration, 1), Integer.MIN_VALUE);
                    } else {
                        iP2 = Integer.MIN_VALUE;
                    }
                    iArr[c2] = iP2;
                    this.f = source2;
                    this.g = deviceId2;
                    this.e = i3;
                    i3 = i3;
                    z = true;
                }
                c2 = 1;
                iArr[c2] = iP2;
                this.f = source2;
                this.g = deviceId2;
                this.e = i3;
                i3 = i3;
                z = true;
            }
            c = 0;
            iArr[c] = iP;
            deviceId = motionEvent.getDeviceId();
            source = motionEvent.getSource();
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                iP2 = rp$.ExternalSyntheticApiModelOutline0.m$1(viewConfiguration, deviceId, i3, source);
            } else {
                if (defpackage.dzk.q(deviceId, i3, source)) {
                    iP2 = Integer.MIN_VALUE;
                } else {
                    android.content.res.Resources resources3 = context.getResources();
                    if (source == 4194304) {
                        i3 = i3;
                        identifier = -1;
                    } else {
                        i3 = i3;
                        identifier = -1;
                    }
                    j$.util.Objects.requireNonNull(viewConfiguration);
                    c2 = 1;
                    iP2 = defpackage.dzk.p(resources3, identifier, new dzt(viewConfiguration, 1), Integer.MIN_VALUE);
                }
                iArr[c2] = iP2;
                this.f = source2;
                this.g = deviceId2;
                this.e = i3;
                i3 = i3;
                z = true;
            }
            c2 = 1;
            iArr[c2] = iP2;
            this.f = source2;
            this.g = deviceId2;
            this.e = i3;
            i3 = i3;
            z = true;
        }
        int[] iArr2 = this.h;
        int i4 = iArr2[0];
        android.view.VelocityTracker velocityTrackerObtain = this.c;
        if (i4 == Integer.MAX_VALUE) {
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.recycle();
                this.c = null;
                return;
            }
            return;
        }
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = android.view.VelocityTracker.obtain();
            this.c = velocityTrackerObtain;
        }
        java.util.Map map = dzg.a;
        velocityTrackerObtain.addMovement(motionEvent);
        int i5 = 20;
        if (android.os.Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            java.util.Map map2 = dzg.a;
            if (!map2.containsKey(velocityTrackerObtain)) {
                map2.put(velocityTrackerObtain, new dzh());
            }
            dzh dzhVar = (dzh) map2.get(velocityTrackerObtain);
            long eventTime = motionEvent.getEventTime();
            int i6 = dzhVar.d;
            if (i6 != 0 && eventTime - dzhVar.b[dzhVar.e] > 40) {
                dzhVar.d = 0;
                dzhVar.c = 0.0f;
                i6 = 0;
            }
            int i7 = (dzhVar.e + 1) % 20;
            dzhVar.e = i7;
            if (i6 != 20) {
                dzhVar.d = i6 + 1;
            }
            dzhVar.a[i7] = motionEvent.getAxisValue(26);
            dzhVar.b[dzhVar.e] = eventTime;
        }
        velocityTrackerObtain.computeCurrentVelocity(1000, Float.MAX_VALUE);
        dzh dzhVarA = dzg.a(velocityTrackerObtain);
        if (dzhVarA != null) {
            int i8 = dzhVarA.d;
            if (i8 >= 2) {
                int i9 = dzhVarA.e;
                long[] jArr = dzhVarA.b;
                long j2 = jArr[i9];
                int i10 = (i9 + 20) - (i8 - 1);
                while (true) {
                    i2 = i10 % 20;
                    j = jArr[i2];
                    if (j2 - j <= 100) {
                        break;
                    }
                    i10 = i2 + 1;
                    dzhVarA.d--;
                }
                int i11 = dzhVarA.d;
                if (i11 < 2) {
                    z2 = z;
                    fA = 0.0f;
                } else if (i11 == 2) {
                    int i12 = (i2 + 1) % 20;
                    long j3 = jArr[i12];
                    if (j == j3) {
                        z2 = z;
                        fA = 0.0f;
                    } else {
                        fA = dzhVarA.a[i12] / (j3 - j);
                        z2 = z;
                    }
                } else {
                    float fAbs = 0.0f;
                    int i13 = 0;
                    int i14 = 0;
                    while (i13 < dzhVarA.d - 1) {
                        int i15 = i13 + i2;
                        int i16 = i15 % 20;
                        int i17 = (i15 + 1) % i5;
                        long j4 = jArr[i16];
                        if (jArr[i17] != j4) {
                            i14++;
                            float fA2 = dzh.a(fAbs);
                            z3 = z;
                            float f = dzhVarA.a[i17] / (jArr[i17] - j4);
                            fAbs += (f - fA2) * java.lang.Math.abs(f);
                            if (i14 == 1) {
                                fAbs *= 0.5f;
                            }
                        } else {
                            z3 = z;
                        }
                        i13++;
                        z = z3;
                        i5 = 20;
                    }
                    z2 = z;
                    fA = dzh.a(fAbs);
                }
            } else {
                z2 = z;
                fA = 0.0f;
            }
            float f2 = fA * 1000.0f;
            dzhVarA.c = f2;
            if (f2 < -3.4028235E38f) {
                dzhVarA.c = -3.4028235E38f;
            } else if (dzhVarA.c > Float.MAX_VALUE) {
                dzhVarA.c = Float.MAX_VALUE;
            }
        } else {
            z2 = z;
        }
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            fM = rp$.ExternalSyntheticApiModelOutline0.m(velocityTrackerObtain, i3);
        } else {
            dzh dzhVarA2 = dzg.a(velocityTrackerObtain);
            fM = (dzhVarA2 == null || i3 != 26) ? 0.0f : dzhVarA2.c;
        }
        defpackage.dyn dynVar = this.b;
        float fA3 = fM * dynVar.a();
        float fSignum = java.lang.Math.signum(fA3);
        if (z2 || (fSignum != java.lang.Math.signum(this.d) && fSignum != 0.0f)) {
            dynVar.b();
        }
        if (java.lang.Math.abs(fA3) >= iArr2[0]) {
            int i18 = iArr2[1];
            float fMax = java.lang.Math.max(-i18, java.lang.Math.min(fA3, i18));
            this.d = true == dynVar.c(fMax) ? fMax : 0.0f;
        }
    }
}
