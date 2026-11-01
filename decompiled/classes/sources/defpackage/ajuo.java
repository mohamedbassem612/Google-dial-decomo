package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajuo implements java.util.concurrent.ScheduledExecutorService, java.lang.AutoCloseable {
    public static final /* synthetic */ int c = 0;
    public final java.util.concurrent.ExecutorService a;
    public final java.util.concurrent.ScheduledExecutorService b;

    public ajuo(java.util.concurrent.ExecutorService executorService, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.a = executorService;
        this.b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        defpackage.anty.aj(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection collection) {
        return this.a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection collection) {
        return this.a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        return new ajuq(new ajum(this, runnable, j, timeUnit, 0));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return new ajuq(new ajun(this, runnable, j, j2, timeUnit, 1));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return new ajuq(new ajun(this, runnable, j, j2, timeUnit, 0));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new java.lang.UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        throw new java.lang.UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable runnable) {
        return this.a.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection collection, long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection collection, long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable runnable, java.lang.Object obj) {
        return this.a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.util.concurrent.Callable callable) {
        return this.a.submit(callable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture schedule(java.util.concurrent.Callable callable, long j, java.util.concurrent.TimeUnit timeUnit) {
        return new ajuq(new ajum(this, callable, j, timeUnit, 1));
    }
}
