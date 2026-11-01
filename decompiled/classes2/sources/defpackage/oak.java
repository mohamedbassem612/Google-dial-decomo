package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oak extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public oak(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new amzw(defpackage.oak.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.lang.String str = (java.lang.String) list.get(0);
        java.lang.String str2 = (java.lang.String) list.get(1);
        int iIntValue = ((java.lang.Integer) list.get(2)).intValue();
        boolean zBooleanValue = ((java.lang.Boolean) list.get(3)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(4)).booleanValue();
        aooh.f(str, "audioRouteLabel");
        aooh.f(str2, "audioRouteDescription");
        akzx akzxVarM = defpackage.oah.a.m();
        aooh.f(akzxVarM, "builder");
        aooh.f(str, "value");
        akzxVarM.u();
        defpackage.oah oahVar = (defpackage.oah) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        oahVar.b |= 1;
        oahVar.c = str;
        aooh.f(str2, "value");
        akzxVarM.u();
        defpackage.oah oahVar2 = (defpackage.oah) akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        oahVar2.b |= 2;
        oahVar2.d = str2;
        akzxVarM.u();
        defpackage.oah oahVar3 = (defpackage.oah) akzxVarM.b;
        oahVar3.b |= 4;
        oahVar3.e = iIntValue;
        akzxVarM.u();
        defpackage.oah oahVar4 = (defpackage.oah) akzxVarM.b;
        oahVar4.b |= 8;
        oahVar4.f = zBooleanValue;
        akzxVarM.u();
        defpackage.oah oahVar5 = (defpackage.oah) akzxVarM.b;
        oahVar5.b |= 16;
        oahVar5.g = zBooleanValue2;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        return aiql.z((defpackage.oah) aladVarP);
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        amzg amzgVar3 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
