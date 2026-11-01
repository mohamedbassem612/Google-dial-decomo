package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class see extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amyz f;

    public see(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amyz amyzVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.see.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amyzVar3;
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        hrc hrcVar = (hrc) list.get(0);
        aoss aossVar = (aoss) list.get(1);
        aooh.f(hrcVar, "callingCardEnabledFn");
        aooh.f(aossVar, "lightweightScope");
        return aiql.z(new defpackage.uyg((defpackage.zka) new nfp(hrcVar, 12), (ajas) new kff(aossVar, this.f, this.e, this.d, 10)));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
