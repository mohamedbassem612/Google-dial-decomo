package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rfh extends amzm {
    private final amzg b;

    public rfh(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.rfh.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        aihd aihdVar = (aihd) obj;
        int size = aihdVar.size();
        int size2 = aihdVar.size();
        java.lang.Object objCollect = j$.util.Collection.-EL.stream(aihdVar).map(new defpackage.rat(3)).collect(aido.a);
        if (size <= 1) {
            return aiql.z(aihdVar.isEmpty() ? j$.util.Optional.empty() : j$.util.Optional.of((defpackage.reo) ahvr.bm(aihdVar)));
        }
        throw new java.lang.IllegalStateException(ahvr.bK("at most one error dialog can be shown, but there are %s for %s", new java.lang.Object[]{java.lang.Integer.valueOf(size2), objCollect}));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
