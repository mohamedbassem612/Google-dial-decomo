package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abpy extends java.util.concurrent.ScheduledThreadPoolExecutor implements java.lang.AutoCloseable {
    public abpy(java.util.concurrent.ThreadFactory threadFactory) {
        super(1, threadFactory);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        defpackage.anty.aj(this);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    protected final java.util.concurrent.RunnableScheduledFuture decorateTask(java.lang.Runnable runnable, java.util.concurrent.RunnableScheduledFuture runnableScheduledFuture) {
        return defpackage.abqn.b(runnableScheduledFuture);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    protected final java.util.concurrent.RunnableScheduledFuture decorateTask(java.util.concurrent.Callable callable, java.util.concurrent.RunnableScheduledFuture runnableScheduledFuture) {
        return defpackage.abqn.b(runnableScheduledFuture);
    }
}
