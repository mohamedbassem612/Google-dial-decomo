package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nuq extends amzm {
    private final amzg b;
    private final amzg c;

    public nuq(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.nuq.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        ajct ajctVar = (ajct) list.get(0);
        defpackage.nmo nmoVar = (defpackage.nmo) list.get(1);
        aooh.f(ajctVar, "lightweightExecutor");
        aooh.f(nmoVar, "lifecycleState");
        return aiql.z(uyg.L(new defpackage.nfp(nmoVar, 5), new defpackage.jse(17), ajctVar));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
