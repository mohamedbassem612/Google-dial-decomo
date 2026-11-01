package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sov extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public sov(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.sov.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        sou souVar = (sou) list.get(1);
        mgu mguVar = (mgu) list.get(2);
        aooh.f(optional, "optionalPhoneAccountHandle");
        aooh.f(souVar, "phoneAccountInfoFetcher");
        aooh.f(mguVar, "recorder");
        java.lang.Object objI = mguVar.c(new defpackage.pin(optional, souVar, 12)).a(mfy.ak).i();
        aooh.e(objI, "ifPresent(...)");
        return aiql.z((j$.util.Optional) objI);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
