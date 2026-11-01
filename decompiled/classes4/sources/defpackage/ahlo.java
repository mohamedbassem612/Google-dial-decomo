package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class ahlo implements java.lang.Runnable {
    private final /* synthetic */ int $cid;

    public ahlo(defpackage.aocs aocsVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aocsVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            ahlt.a.b().l("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "sync", 211, "SyncManagerImpl.java").v("#sync() complete");
        } else {
            if (i == 2) {
                throw new java.lang.IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
            }
            if (i == 4) {
                throw new java.lang.IllegalStateException("resources not initialized or already closed");
            }
            if (i == 5) {
                throw new java.lang.IllegalStateException("resources not initialized or already closed");
            }
        }
    }
}
