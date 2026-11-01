package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rbz extends amzm {
    private final amzg b;
    private final amzg c;

    public rbz(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.rbz.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.util.Set set = (java.util.Set) list.get(0);
        ajct ajctVar = (ajct) list.get(1);
        aooh.f(set, "safeKeys");
        aooh.f(ajctVar, "lightweightExecutor");
        return defpackage.zkb.b(set, ajctVar);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
