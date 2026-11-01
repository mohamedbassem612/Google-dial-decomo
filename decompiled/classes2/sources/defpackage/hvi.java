package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hvi extends amzm {
    private final amzg b;
    private final amzg c;

    public hvi(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.hvi.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(1)).booleanValue();
        int i = true != zBooleanValue2 ? 2131231435 : 2131231991;
        int i2 = true != zBooleanValue2 ? 2132018020 : 2132018529;
        akzx akzxVarM = defpackage.huu.a.m();
        aooh.f(akzxVarM, "builder");
        akzxVarM.u();
        defpackage.huu huuVar = (defpackage.huu) akzxVarM.b;
        huuVar.b |= 1;
        huuVar.c = zBooleanValue;
        akzxVarM.u();
        defpackage.huu huuVar2 = (defpackage.huu) akzxVarM.b;
        huuVar2.b |= 2;
        huuVar2.d = i2;
        akzxVarM.u();
        defpackage.huu huuVar3 = (defpackage.huu) akzxVarM.b;
        huuVar3.b |= 4;
        huuVar3.e = i;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        return aiql.z((defpackage.huu) aladVarP);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
