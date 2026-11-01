package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajcm implements defpackage.ajcq {
    public static final defpackage.ajcq a = new defpackage.ajcm(null);
    private static final defpackage.ajcp b = new defpackage.ajcp(defpackage.ajcm.class);
    private final java.lang.Object c;

    public ajcm(java.lang.Object obj) {
        this.c = obj;
    }

    @Override // defpackage.ajcq
    public final void c(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        if (runnable == null) {
            throw new java.lang.NullPointerException("Runnable was null.");
        }
        if (executor == null) {
            throw new java.lang.NullPointerException("Executor was null.");
        }
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e) {
            b.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", defpackage.a.bK(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (java.lang.Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.ahvr.ci(timeUnit);
        return this.c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.c;
        return super.toString() + "[status=SUCCESS, result=[" + java.lang.String.valueOf(obj) + "]]";
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.c;
    }
}
