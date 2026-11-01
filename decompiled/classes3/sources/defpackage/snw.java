package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class snw extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public snw(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.snw.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        defpackage.uyg uygVar = (defpackage.uyg) list.get(1);
        aoss aossVar = (aoss) list.get(2);
        aooh.f(optional, "dialerPhoneNumber");
        aooh.f(uygVar, "networkIdentityFactory");
        aooh.f(aossVar, "lightweightScope");
        hkd hkdVar = (hkd) aooh.q(optional);
        return hkdVar == null ? aiql.z((java.lang.Object) null) : aosv.F(aossVar, 0, new defpackage.rka(uygVar, hkdVar, (aoln) null, 16), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
