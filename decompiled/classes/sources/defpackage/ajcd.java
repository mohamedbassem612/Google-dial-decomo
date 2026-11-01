package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajcd implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public java.lang.Object a;
    public java.lang.Object b;

    public ajcd(defpackage.ajas ajasVar, java.util.concurrent.Executor executor, int i) {
        this.$cid = i;
        this.a = ajasVar;
        executor.getClass();
        this.b = executor;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.$cid == 0) {
            defpackage.aiql.J(this.a, this.b);
        }
        this.a = null;
        this.b = null;
    }

    public ajcd(defpackage.ajcq ajcqVar, java.util.concurrent.Future future, int i) {
        this.$cid = i;
        this.a = ajcqVar;
        this.b = future;
    }
}
