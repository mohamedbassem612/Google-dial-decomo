package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aesh implements android.view.Window.OnFrameMetricsAvailableListener {
    public static final /* synthetic */ int a = 0;
    private boolean b;
    private long c;
    private aesq d;
    private final android.util.ArrayMap e;
    private final defpackage.ahzi f;
    private final defpackage.aoin g;

    public aesh(android.content.Context context, android.util.ArrayMap arrayMap, defpackage.aoin aoinVar) {
        this.f = defpackage.ahvr.bI(new defpackage.aeex(context, 7));
        this.e = arrayMap;
        this.g = aoinVar;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(android.view.Window window, android.view.FrameMetrics frameMetrics, int i) {
        int i2;
        int i3;
        boolean z = true;
        if (!this.b) {
            this.b = true;
            this.d = android.os.Build.VERSION.SDK_INT <= 30 ? new aesq() : null;
            defpackage.aoin aoinVar = this.g;
            if (aoinVar.a() == null || !((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                this.c = ((java.lang.Long) this.f.eZ()).longValue();
            } else {
                this.c = (long) (1.0E9f / window.getWindowManager().getDefaultDisplay().getRefreshRate());
            }
        }
        if (aa$.ExternalSyntheticApiModelOutline1.m(frameMetrics, 9) == 1) {
            aesq aesqVar = this.d;
            if (aesqVar != null) {
                aesqVar.a(frameMetrics, this.c);
                return;
            }
            return;
        }
        long jM = aa$.ExternalSyntheticApiModelOutline1.m(frameMetrics, 8);
        aesq aesqVar2 = this.d;
        long jA = this.c;
        if (aesqVar2 != null) {
            jA = aesqVar2.a(frameMetrics, jA);
        }
        long jM2 = aa$.ExternalSyntheticApiModelOutline1.m(frameMetrics, 13);
        android.util.ArrayMap arrayMap = this.e;
        synchronized (arrayMap) {
            int size = arrayMap.size();
            int i4 = 0;
            while (i4 < size) {
                defpackage.aesj aesjVar = (defpackage.aesj) arrayMap.valueAt(i4);
                boolean z2 = z;
                long j = jM;
                int i5 = (int) (j / 1000000);
                if (i5 < 0) {
                    aesjVar.i++;
                } else {
                    aesjVar.h++;
                    boolean z3 = aesjVar.o;
                    if (jM2 > 0) {
                        int i6 = (int) ((j - jM2) / 1000000);
                        if (aesjVar.n < i6) {
                            aesjVar.n = i6;
                        }
                        int[] iArr = aesjVar.e;
                        if (i6 < 20) {
                            if (i6 >= -20) {
                                i3 = ((i6 + 20) >> 1) + 12;
                            } else if (i6 >= -30) {
                                i3 = ((i6 + 30) / 5) + 10;
                            } else if (i6 >= -100) {
                                i3 = ((i6 + 100) / 10) + 3;
                            } else {
                                i3 = i6 >= -200 ? ((i6 + 200) / 50) + 1 : 0;
                            }
                        } else if (i6 < 30) {
                            i3 = ((i6 - 20) / 5) + 32;
                        } else if (i6 < 100) {
                            i3 = ((i6 - 30) / 10) + 34;
                        } else if (i6 < 200) {
                            i3 = ((i6 - 50) / 100) + 41;
                        } else {
                            i3 = i6 < 1000 ? ((i6 - 200) / 100) + 43 : 51;
                        }
                        iArr[i3] = iArr[i3] + 1;
                        if (j > jM2) {
                            aesjVar.f++;
                            aesjVar.k += i5;
                        }
                        if (j > jA) {
                            aesjVar.g++;
                            aesjVar.l += i5;
                        }
                    } else if (j > jA) {
                        aesjVar.f++;
                        aesjVar.k += i5;
                    }
                    int[] iArr2 = aesjVar.d;
                    if (i5 <= 20) {
                        i2 = i5 >= 8 ? (i5 >> 1) - 2 : i5 / 4;
                    } else if (i5 <= 30) {
                        i2 = (i5 / 5) + 4;
                    } else if (i5 <= 100) {
                        i2 = (i5 / 10) + 7;
                    } else if (i5 <= 200) {
                        i2 = (i5 / 50) + 15;
                    } else if (i5 <= 1000) {
                        i2 = (i5 / 100) + 17;
                    } else {
                        i2 = i5 < 5000 ? 27 : 28;
                    }
                    iArr2[i2] = iArr2[i2] + 1;
                    aesjVar.i += i;
                    if (aesjVar.j < i5) {
                        aesjVar.j = i5;
                    }
                    aesjVar.m += i5;
                }
                i4++;
                z = z2;
                jM = j;
            }
        }
    }
}
