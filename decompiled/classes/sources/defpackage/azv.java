package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class azv extends defpackage.cmv implements defpackage.dbd {
    public float a;
    public float b;

    public azv(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.dbd
    public final defpackage.cyf cX(defpackage.cyi cyiVar, defpackage.cyd cydVar, long j) {
        int iD;
        int iC;
        if (java.lang.Float.isNaN(this.a) || defpackage.dpd.d(j) != 0) {
            iD = defpackage.dpd.d(j);
        } else {
            int iDp = cyiVar.dp(this.a);
            iD = defpackage.dpd.b(j);
            if (iDp < 0) {
                iDp = 0;
            }
            if (iDp <= iD) {
                iD = iDp;
            }
        }
        int iB = defpackage.dpd.b(j);
        if (java.lang.Float.isNaN(this.b) || defpackage.dpd.c(j) != 0) {
            iC = defpackage.dpd.c(j);
        } else {
            int iDp2 = cyiVar.dp(this.b);
            iC = defpackage.dpd.a(j);
            int i = iDp2 >= 0 ? iDp2 : 0;
            if (i <= iC) {
                iC = i;
            }
        }
        defpackage.czc czcVarV = cydVar.v(defpackage.dpe.c(iD, iB, iC, defpackage.dpd.a(j)));
        return cyiVar.du(czcVarV.a, czcVarV.b, defpackage.aokd.a, new defpackage.afz(czcVarV, 6));
    }

    @Override // defpackage.dbd
    public final int e(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        int iC = cxeVar.c(i);
        int iDp = !java.lang.Float.isNaN(this.b) ? cxfVar.dp(this.b) : 0;
        return iC < iDp ? iDp : iC;
    }

    @Override // defpackage.dbd
    public final int f(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        int iD = cxeVar.d(i);
        int iDp = !java.lang.Float.isNaN(this.a) ? cxfVar.dp(this.a) : 0;
        return iD < iDp ? iDp : iD;
    }

    @Override // defpackage.dbd
    public final int i(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        int iE = cxeVar.e(i);
        int iDp = !java.lang.Float.isNaN(this.b) ? cxfVar.dp(this.b) : 0;
        return iE < iDp ? iDp : iE;
    }

    @Override // defpackage.dbd
    public final int j(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        int iF = cxeVar.f(i);
        int iDp = !java.lang.Float.isNaN(this.a) ? cxfVar.dp(this.a) : 0;
        return iF < iDp ? iDp : iF;
    }

    public azv() {
        this(Float.NaN, Float.NaN);
    }
}
