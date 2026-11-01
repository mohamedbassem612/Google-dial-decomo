package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class awk extends cmv implements dbd {
    public float a;
    public boolean b;

    public awk(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    private final long d(long j, boolean z) {
        int iA = dpd.a(j);
        if (iA != Integer.MAX_VALUE) {
            int iRound = java.lang.Math.round(iA * this.a);
            if (iRound > 0 && (!z || defpackage.rx.m(j, iRound, iA))) {
                return (((long) iRound) << 32) | ((long) iA);
            }
        }
        return 0L;
    }

    private final long g(long j, boolean z) {
        int iB = dpd.b(j);
        if (iB != Integer.MAX_VALUE) {
            int iRound = java.lang.Math.round(iB / this.a);
            if (iRound > 0 && (!z || defpackage.rx.m(j, iB, iRound))) {
                return (((long) iB) << 32) | (((long) iRound) & 4294967295L);
            }
        }
        return 0L;
    }

    private final long h(long j, boolean z) {
        int iC = dpd.c(j);
        int iRound = java.lang.Math.round(iC * this.a);
        if (iRound <= 0 || (z && !defpackage.rx.m(j, iRound, iC))) {
            return 0L;
        }
        return (((long) iRound) << 32) | ((long) iC);
    }

    private final long k(long j, boolean z) {
        int iD = dpd.d(j);
        int iRound = java.lang.Math.round(iD / this.a);
        if (iRound <= 0 || (z && !defpackage.rx.m(j, iD, iRound))) {
            return 0L;
        }
        return (((long) iD) << 32) | (((long) iRound) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0089  */
    public final cyf cX(cyi cyiVar, cyd cydVar, long j) {
        long jD;
        if (this.b) {
            jD = d(j, true);
            if (jD == 0) {
                jD = g(j, true);
                if (jD == 0) {
                    jD = h(j, true);
                    if (jD == 0) {
                        jD = k(j, true);
                        if (jD == 0) {
                            jD = d(j, false);
                            if (jD == 0) {
                                jD = g(j, false);
                                if (jD == 0) {
                                    jD = h(j, false);
                                    if (jD == 0) {
                                        jD = k(j, false);
                                        if (jD == 0) {
                                            jD = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            jD = g(j, true);
            if (jD == 0) {
                jD = d(j, true);
                if (jD == 0) {
                    jD = k(j, true);
                    if (jD == 0) {
                        jD = h(j, true);
                        if (jD == 0) {
                            jD = g(j, false);
                            if (jD == 0) {
                                jD = d(j, false);
                                if (jD == 0) {
                                    jD = k(j, false);
                                    if (jD == 0) {
                                        jD = h(j, false);
                                        if (jD == 0) {
                                            jD = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (jD != 0) {
            j = dpe.l((int) (jD >> 32), (int) (jD & 4294967295L));
        }
        czc czcVarV = cydVar.v(j);
        return cyiVar.du(czcVarV.a, czcVarV.b, aokd.a, new defpackage.auj(czcVarV, 2));
    }

    public final int e(cxf cxfVar, cxe cxeVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return cxeVar.c(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
        }
        return java.lang.Math.round(i / this.a);
    }

    public final int f(cxf cxfVar, cxe cxeVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return cxeVar.d(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
        }
        return java.lang.Math.round(i * this.a);
    }

    public final int i(cxf cxfVar, cxe cxeVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return cxeVar.e(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
        }
        return java.lang.Math.round(i / this.a);
    }

    public final int j(cxf cxfVar, cxe cxeVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return cxeVar.f(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
        }
        return java.lang.Math.round(i * this.a);
    }
}
