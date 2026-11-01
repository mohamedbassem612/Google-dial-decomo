package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class bah extends cmv implements dbd {
    public aonn a;
    public int b;

    public bah(int i, aonn aonnVar) {
        this.b = i;
        this.a = aonnVar;
    }

    public final cyf cX(final cyi cyiVar, cyd cydVar, long j) {
        int i = this.b;
        final czc czcVarV = cydVar.v(dpe.c(i != 1 ? 0 : dpd.d(j), dpd.b(j), i == 2 ? dpd.c(j) : 0, dpd.a(j)));
        final int iW = aooc.w(czcVarV.a, dpd.d(j), dpd.b(j));
        final int iW2 = aooc.w(czcVarV.b, dpd.c(j), dpd.a(j));
        return cyiVar.du(iW, iW2, aokd.a, new aonj() { // from class: bag
            public final java.lang.Object a(java.lang.Object obj) {
                int i2 = iW;
                czc czcVar = czcVarV;
                ((czb) obj).t(czcVar, ((dpn) this.a.a.a(new dpp((((long) (i2 - czcVar.a)) << 32) | (((long) (iW2 - czcVar.b)) & 4294967295L)), cyiVar.p())).a, 0.0f);
                return aojh.a;
            }
        });
    }

    public final /* synthetic */ int e(cxf cxfVar, cxe cxeVar, int i) {
        return ddt.c(new defpackage.dbc(this), cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int f(cxf cxfVar, cxe cxeVar, int i) {
        return ddt.d(new defpackage.dbc(this), cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int i(cxf cxfVar, cxe cxeVar, int i) {
        return ddt.e(new defpackage.dbc(this), cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int j(cxf cxfVar, cxe cxeVar, int i) {
        return ddt.f(new defpackage.dbc(this), cxfVar, cxeVar, i);
    }
}
