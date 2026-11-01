package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class ajbw extends defpackage.aiey implements java.util.concurrent.ExecutorService, java.lang.AutoCloseable {
    protected ajbw() {
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) {
        return g().awaitTermination(j, timeUnit);
    }

    public /* synthetic */ void close() {
        defpackage.anty.aj(this);
    }

    public void execute(java.lang.Runnable runnable) {
        g().execute(runnable);
    }

    protected abstract java.util.concurrent.ExecutorService g();

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection collection) {
        return g().invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection collection) {
        return g().invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return g().isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return g().isTerminated();
    }

    public void shutdown() {
        g().shutdown();
    }

    public java.util.List shutdownNow() {
        return g().shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.concurrent.Future submit(java.lang.Runnable runnable) {
        return g().submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection collection, long j, java.util.concurrent.TimeUnit timeUnit) {
        return g().invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection collection, long j, java.util.concurrent.TimeUnit timeUnit) {
        return g().invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.concurrent.Future submit(java.lang.Runnable runnable, java.lang.Object obj) {
        return g().submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.concurrent.Future submit(java.util.concurrent.Callable callable) {
        return g().submit(callable);
    }
}
