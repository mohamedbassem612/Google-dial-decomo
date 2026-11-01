package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anyl implements java.lang.Runnable {
    private static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.anyl.class.getName());
    private final java.lang.Runnable b;

    public anyl(java.lang.Runnable runnable) {
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } catch (java.lang.Throwable th) {
            a.logp(java.util.logging.Level.SEVERE, "io.grpc.internal.LogExceptionRunnable", "run", "Exception while executing runnable ".concat(this.b.toString()), th);
            defpackage.ahzn.c(th);
            throw new java.lang.AssertionError(th);
        }
    }

    public final java.lang.String toString() {
        return "LogExceptionRunnable(" + this.b.toString() + ')';
    }
}
