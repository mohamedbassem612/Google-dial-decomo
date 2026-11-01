package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class rsw extends aomh implements aonn {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ rsd b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rsw(rsd rsdVar, int i, aoln aolnVar) {
        super(2, aolnVar);
        this.b = rsdVar;
        this.c = i;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((rtl) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        rtl rtlVar = (rtl) this.a;
        ipc ipcVarAa = ttj.aa(rtlVar.p());
        ipcVarAa.aR();
        rsd rsdVar = this.b;
        java.lang.String string = rsdVar.toString();
        rtk rtkVarD = (rtk) j$.util.DesugarCollections.unmodifiableMap(rtlVar.b).get(rsdVar.toString());
        if (rtkVarD == null) {
            rtkVarD = pez.bv(rtk.a.m()).D();
        }
        int i = this.c;
        hgw hgwVarBv = pez.bv(rtkVarD.p());
        akzx akzxVar = (akzx) hgwVarBv.a;
        akzxVar.u();
        akzxVar.b.d = i;
        ipcVarAa.aQ(string, hgwVarBv.D());
        return ipcVarAa.aP();
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.rsw rswVar = new defpackage.rsw(this.b, this.c, aolnVar);
        rswVar.a = obj;
        return rswVar;
    }
}
