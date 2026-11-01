package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abpz extends java.util.concurrent.ThreadPoolExecutor implements java.lang.AutoCloseable {
    public abpz(java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.BlockingQueue blockingQueue, java.util.concurrent.ThreadFactory threadFactory) {
        super(0, Integer.MAX_VALUE, 60L, timeUnit, (java.util.concurrent.BlockingQueue<java.lang.Runnable>) blockingQueue, threadFactory);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(java.lang.Runnable runnable, java.lang.Throwable th) {
        super.afterExecute(runnable, th);
        if (android.os.Build.VERSION.SDK_INT < 31) {
            android.os.Binder.flushPendingCommands();
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        defpackage.anty.aj(this);
    }
}
