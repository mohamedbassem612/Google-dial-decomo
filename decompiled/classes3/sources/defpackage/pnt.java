package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pnt extends amzm {
    private final amzg b;

    public pnt(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.pnt.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        aihd aihdVar = (aihd) obj;
        return aiql.z(java.lang.Long.valueOf(aihdVar.isEmpty() ? 0L : ((java.lang.Long) java.util.Collections.min(aihdVar)).longValue()));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
