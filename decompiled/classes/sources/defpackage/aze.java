package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aze extends defpackage.cmv implements defpackage.dbd {
    public defpackage.ayy a;

    public aze(defpackage.ayy ayyVar) {
        this.a = ayyVar;
    }

    @Override // defpackage.dbd
    public final defpackage.cyf cX(defpackage.cyi cyiVar, defpackage.cyd cydVar, long j) {
        float fB = this.a.b(cyiVar.p());
        float fD = this.a.d();
        float fC = this.a.c(cyiVar.p());
        float fA = this.a.a();
        if (((defpackage.dpi.a(fB, 0.0f) ^ (-1)) & (defpackage.dpi.a(fD, 0.0f) ^ (-1)) & (defpackage.dpi.a(fC, 0.0f) ^ (-1)) & (defpackage.dpi.a(fA, 0.0f) ^ (-1))) >= 0) {
            bai.a("Padding must be non-negative");
        }
        int iDp = cyiVar.dp(fB);
        int iDp2 = cyiVar.dp(fC) + iDp;
        int iDp3 = cyiVar.dp(fD);
        int iDp4 = cyiVar.dp(fA) + iDp3;
        defpackage.czc czcVarV = cydVar.v(defpackage.dpe.g(j, -iDp2, -iDp4));
        int i = czcVarV.a + iDp2;
        int iD = defpackage.dpd.d(j);
        int iB = defpackage.dpd.b(j);
        if (i < iD) {
            i = iD;
        }
        if (i <= iB) {
            iB = i;
        }
        int i2 = czcVarV.b + iDp4;
        int iC = defpackage.dpd.c(j);
        int iA = defpackage.dpd.a(j);
        if (i2 < iC) {
            i2 = iC;
        }
        if (i2 <= iA) {
            iA = i2;
        }
        return cyiVar.du(iB, iA, defpackage.aokd.a, new defpackage.brm(czcVarV, iDp, iDp3, 1));
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int e(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return defpackage.ddt.c(new dbc(this), cxfVar, cxeVar, i);
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int f(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return defpackage.ddt.d(new dbc(this), cxfVar, cxeVar, i);
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int i(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return defpackage.ddt.e(new dbc(this), cxfVar, cxeVar, i);
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int j(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return defpackage.ddt.f(new dbc(this), cxfVar, cxeVar, i);
    }
}
