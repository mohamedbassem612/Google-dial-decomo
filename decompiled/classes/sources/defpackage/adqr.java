package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adqr implements defpackage.ajcq {
    private final defpackage.ajcq a;

    public adqr(defpackage.ajcq ajcqVar) {
        this.a = ajcqVar;
    }

    @Override // defpackage.ajcq
    public final void c(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.a.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final /* bridge */ /* synthetic */ java.lang.Object get() {
        this.a.get();
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final /* bridge */ /* synthetic */ java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
        this.a.get(j, timeUnit);
        return null;
    }
}
