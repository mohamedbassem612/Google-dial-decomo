package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qmk extends amzm {
    private final amzg b;
    private final amzg c;

    public qmk(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.qmk.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.util.Set set = (java.util.Set) list.get(0);
        ajct ajctVar = (ajct) list.get(1);
        aooh.f(set, "safeAndroidAutoActionButtonCandidates");
        aooh.f(ajctVar, "lightweightExecutor");
        return defpackage.zkb.b(set, ajctVar);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
