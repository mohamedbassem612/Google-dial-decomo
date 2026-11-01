package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pqy extends amzm {
    private final amzg b;

    public pqy(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.pqy.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        long j = ((defpackage.ptx) obj).c.get();
        return aiql.z(j <= 0 ? j$.util.Optional.empty() : j$.util.Optional.of(java.lang.Long.valueOf(j)));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
