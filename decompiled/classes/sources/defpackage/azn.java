package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class azn extends defpackage.cmv implements defpackage.dbd {
    public float a;
    public float b;
    public float c;
    public float d;
    public boolean e;

    public azn(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    private final long d(defpackage.dpf dpfVar) {
        int iDp;
        int iDp2;
        int iDp3;
        int i = 0;
        if (java.lang.Float.isNaN(this.c)) {
            iDp = Integer.MAX_VALUE;
        } else {
            iDp = dpfVar.dp(this.c);
            if (iDp < 0) {
                iDp = 0;
            }
        }
        if (java.lang.Float.isNaN(this.d)) {
            iDp2 = Integer.MAX_VALUE;
        } else {
            iDp2 = dpfVar.dp(this.d);
            if (iDp2 < 0) {
                iDp2 = 0;
            }
        }
        if (java.lang.Float.isNaN(this.a)) {
            iDp3 = 0;
        } else {
            iDp3 = dpfVar.dp(this.a);
            if (iDp3 < 0) {
                iDp3 = 0;
            }
            if (iDp3 > iDp) {
                iDp3 = iDp;
            }
            if (iDp3 == Integer.MAX_VALUE) {
                iDp3 = 0;
            }
        }
        if (!java.lang.Float.isNaN(this.b)) {
            int iDp4 = dpfVar.dp(this.b);
            if (iDp4 < 0) {
                iDp4 = 0;
            }
            if (iDp4 > iDp2) {
                iDp4 = iDp2;
            }
            if (iDp4 != Integer.MAX_VALUE) {
                i = iDp4;
            }
        }
        return defpackage.dpe.c(iDp3, iDp, i, iDp2);
    }

    @Override // defpackage.dbd
    public final defpackage.cyf cX(defpackage.cyi cyiVar, defpackage.cyd cydVar, long j) {
        int iD;
        int iB;
        int iC;
        int iA;
        long jC;
        long jD = d(cyiVar);
        if (this.e) {
            jC = defpackage.dpe.e(j, jD);
        } else {
            if (java.lang.Float.isNaN(this.a)) {
                iD = defpackage.dpd.d(j);
                int iB2 = defpackage.dpd.b(jD);
                if (iD > iB2) {
                    iD = iB2;
                }
            } else {
                iD = defpackage.dpd.d(jD);
            }
            if (java.lang.Float.isNaN(this.c)) {
                iB = defpackage.dpd.b(j);
                int iD2 = defpackage.dpd.d(jD);
                if (iB < iD2) {
                    iB = iD2;
                }
            } else {
                iB = defpackage.dpd.b(jD);
            }
            if (java.lang.Float.isNaN(this.b)) {
                iC = defpackage.dpd.c(j);
                int iA2 = defpackage.dpd.a(jD);
                if (iC > iA2) {
                    iC = iA2;
                }
            } else {
                iC = defpackage.dpd.c(jD);
            }
            if (java.lang.Float.isNaN(this.d)) {
                iA = defpackage.dpd.a(j);
                int iC2 = defpackage.dpd.c(jD);
                if (iA < iC2) {
                    iA = iC2;
                }
            } else {
                iA = defpackage.dpd.a(jD);
            }
            jC = defpackage.dpe.c(iD, iB, iC, iA);
        }
        defpackage.czc czcVarV = cydVar.v(jC);
        return cyiVar.du(czcVarV.a, czcVarV.b, defpackage.aokd.a, new defpackage.afz(czcVarV, 5));
    }

    @Override // defpackage.dbd
    public final int e(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        long jD = d(cxfVar);
        if (defpackage.dpd.i(jD)) {
            return defpackage.dpd.a(jD);
        }
        if (!this.e) {
            int iD = defpackage.dpd.d(jD);
            int iB = defpackage.dpd.b(jD);
            if (i < iD) {
                i = iD;
            }
            if (i > iB) {
                i = iB;
            }
        }
        int iC = cxeVar.c(i);
        int iC2 = defpackage.dpd.c(jD);
        int iA = defpackage.dpd.a(jD);
        if (iC < iC2) {
            iC = iC2;
        }
        return iC > iA ? iA : iC;
    }

    @Override // defpackage.dbd
    public final int f(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        long jD = d(cxfVar);
        if (defpackage.dpd.j(jD)) {
            return defpackage.dpd.b(jD);
        }
        if (!this.e) {
            int iC = defpackage.dpd.c(jD);
            int iA = defpackage.dpd.a(jD);
            if (i < iC) {
                i = iC;
            }
            if (i > iA) {
                i = iA;
            }
        }
        int iD = cxeVar.d(i);
        int iD2 = defpackage.dpd.d(jD);
        int iB = defpackage.dpd.b(jD);
        if (iD < iD2) {
            iD = iD2;
        }
        return iD > iB ? iB : iD;
    }

    @Override // defpackage.dbd
    public final int i(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        long jD = d(cxfVar);
        if (defpackage.dpd.i(jD)) {
            return defpackage.dpd.a(jD);
        }
        if (!this.e) {
            int iD = defpackage.dpd.d(jD);
            int iB = defpackage.dpd.b(jD);
            if (i < iD) {
                i = iD;
            }
            if (i > iB) {
                i = iB;
            }
        }
        int iE = cxeVar.e(i);
        int iC = defpackage.dpd.c(jD);
        int iA = defpackage.dpd.a(jD);
        if (iE < iC) {
            iE = iC;
        }
        return iE > iA ? iA : iE;
    }

    @Override // defpackage.dbd
    public final int j(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        long jD = d(cxfVar);
        if (defpackage.dpd.j(jD)) {
            return defpackage.dpd.b(jD);
        }
        if (!this.e) {
            int iC = defpackage.dpd.c(jD);
            int iA = defpackage.dpd.a(jD);
            if (i < iC) {
                i = iC;
            }
            if (i > iA) {
                i = iA;
            }
        }
        int iF = cxeVar.f(i);
        int iD = defpackage.dpd.d(jD);
        int iB = defpackage.dpd.b(jD);
        if (iF < iD) {
            iF = iD;
        }
        return iF > iB ? iB : iF;
    }
}
