package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class svd extends amzm {
    private final amzg b;
    private final amzg c;
    private final amyz d;

    public svd(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amyz amyzVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.svd.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amyzVar3;
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aoss aossVar = (aoss) list.get(0);
        java.util.Set set = (java.util.Set) list.get(1);
        aooh.f(aossVar, "lightweightScope");
        aooh.f(set, "dataIds");
        return aosv.F(aossVar, 0, new defpackage.suw(set, this.d, null), 3);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
