package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class ayd extends defpackage.axz implements dbd {
    private azz a;

    public ayd(azz azzVar) {
        this.a = azzVar;
    }

    @Override // defpackage.axz
    public final azz b(azz azzVar) {
        return new defpackage.azr(azzVar, this.a);
    }

    public final cyf cX(cyi cyiVar, cyd cydVar, long j) {
        int iB = this.c.b(cyiVar, cyiVar.p()) - this.b.b(cyiVar, cyiVar.p());
        int iD = this.c.d(cyiVar) - this.b.d(cyiVar);
        int iC = this.c.c(cyiVar, cyiVar.p()) - this.b.c(cyiVar, cyiVar.p());
        int iA = (this.c.a(cyiVar) - this.b.a(cyiVar)) + iD;
        int i = iC + iB;
        czc czcVarV = cydVar.v(dpe.g(j, -i, -iA));
        int i2 = czcVarV.a + i;
        int iD2 = dpd.d(j);
        if (i2 < iD2) {
            i2 = iD2;
        }
        int iB2 = dpd.b(j);
        if (i2 > iB2) {
            i2 = iB2;
        }
        int i3 = czcVarV.b + iA;
        int iC2 = dpd.c(j);
        int iA2 = dpd.a(j);
        if (i3 < iC2) {
            i3 = iC2;
        }
        if (i3 <= iA2) {
            iA2 = i3;
        }
        return cyiVar.du(i2, iA2, aokd.a, new defpackage.ayc(czcVarV, iB, iD, 0));
    }

    @Override // defpackage.axz
    public final void d() {
        if (((cmv) this).D) {
            super.d();
            cfo.A(this).H();
        }
    }

    public final /* synthetic */ int e(cxf cxfVar, cxe cxeVar, int i) {
        return ddt.c(new defpackage.dbc(this), cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int f(cxf cxfVar, cxe cxeVar, int i) {
        return ddt.d(new defpackage.dbc(this), cxfVar, cxeVar, i);
    }

    public final void g(azz azzVar) {
        if (aooh.n(azzVar, this.a)) {
            return;
        }
        this.a = azzVar;
        d();
    }

    public final /* synthetic */ int i(cxf cxfVar, cxe cxeVar, int i) {
        return ddt.e(new defpackage.dbc(this), cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int j(cxf cxfVar, cxe cxeVar, int i) {
        return ddt.f(new defpackage.dbc(this), cxfVar, cxeVar, i);
    }
}
