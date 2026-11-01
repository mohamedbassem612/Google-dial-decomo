package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ajbx extends defpackage.ajck {
    private final defpackage.ajcq a;

    public ajbx(defpackage.ajcq ajcqVar) {
        ajcqVar.getClass();
        this.a = ajcqVar;
    }

    @Override // defpackage.ajac, defpackage.ajcq
    public final void c(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.a.c(runnable, executor);
    }

    @Override // defpackage.ajac, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.ajac, java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.a.get();
    }

    @Override // defpackage.ajac, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // defpackage.ajac, java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // defpackage.ajac
    public final java.lang.String toString() {
        return this.a.toString();
    }

    @Override // defpackage.ajac, java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
