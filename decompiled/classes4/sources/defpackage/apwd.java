package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apwd implements java.util.concurrent.Executor {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public apwd(defpackage.apwe apweVar, java.util.concurrent.Executor executor, int i) {
        this.$cid = i;
        this.a = executor;
        j$.util.Objects.requireNonNull(apweVar);
        this.b = apweVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        if (this.$cid != 0) {
            this.b.execute(new defpackage.akbr(this.a, runnable, 5, null));
        } else {
            try {
                this.a.execute(runnable);
            } catch (java.util.concurrent.RejectedExecutionException e) {
                ((defpackage.apwe) this.b).g(e);
            }
        }
    }

    public /* synthetic */ apwd(akbw akbwVar, java.util.concurrent.Executor executor, int i) {
        this.$cid = i;
        this.a = akbwVar;
        this.b = executor;
    }
}
