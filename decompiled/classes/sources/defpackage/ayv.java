package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ayv extends defpackage.cmv implements defpackage.dbd {
    public float a;
    public float b;
    public float c;
    public float d;
    public boolean e;

    public ayv(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }

    @Override // defpackage.dbd
    public final defpackage.cyf cX(defpackage.cyi cyiVar, defpackage.cyd cydVar, long j) {
        int iDp = cyiVar.dp(this.a) + cyiVar.dp(this.c);
        int iDp2 = cyiVar.dp(this.b) + cyiVar.dp(this.d);
        defpackage.czc czcVarV = cydVar.v(defpackage.dpe.g(j, -iDp, -iDp2));
        int i = czcVarV.a + iDp;
        int iD = defpackage.dpd.d(j);
        if (i < iD) {
            i = iD;
        }
        int iB = defpackage.dpd.b(j);
        if (i > iB) {
            i = iB;
        }
        int i2 = czcVarV.b + iDp2;
        int iC = defpackage.dpd.c(j);
        int iA = defpackage.dpd.a(j);
        if (i2 < iC) {
            i2 = iC;
        }
        if (i2 <= iA) {
            iA = i2;
        }
        return cyiVar.du(i, iA, defpackage.aokd.a, new defpackage.bet(this, czcVarV, 1));
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
