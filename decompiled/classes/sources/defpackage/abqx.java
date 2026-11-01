package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abqx extends defpackage.ajak implements java.lang.AutoCloseable, defpackage.ajcu {
    public final android.os.Handler a;

    public abqx(android.os.Handler handler) {
        this.a = handler;
    }

    public static int a(java.util.concurrent.Delayed delayed, java.util.concurrent.Delayed delayed2) {
        long delay = delayed2.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS);
        long delay2 = delayed.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS);
        if (delay > delay2) {
            return -1;
        }
        return delay == delay2 ? 0 : 1;
    }

    private final defpackage.ajcs i(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit, boolean z) {
        long millis = timeUnit.toMillis(j);
        abqv abqvVar = new abqv(this, runnable, millis + android.os.SystemClock.elapsedRealtime(), timeUnit.toMillis(j2), z);
        this.a.postDelayed(abqvVar, millis);
        j(abqvVar, abqvVar);
        return abqvVar;
    }

    private final void j(defpackage.ajcq ajcqVar, java.lang.Runnable runnable) {
        ajcqVar.c(new defpackage.abqu(this, runnable, 0), defpackage.ajbm.INSTANCE);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: b */
    public final defpackage.ajcs schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        return schedule(java.util.concurrent.Executors.callable(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: c */
    public final defpackage.ajcs schedule(java.util.concurrent.Callable callable, long j, java.util.concurrent.TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        defpackage.abqw abqwVar = new defpackage.abqw(this, callable, android.os.SystemClock.elapsedRealtime() + millis);
        this.a.postDelayed(abqwVar, millis);
        j(abqwVar, abqwVar);
        return abqwVar;
    }

    @Override // defpackage.ajak, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        defpackage.anty.ak(this);
    }

    @Override // defpackage.ajcu
    /* JADX INFO: renamed from: d */
    public final defpackage.ajcs scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return i(runnable, j, j2, timeUnit, true);
    }

    @Override // defpackage.ajcu
    /* JADX INFO: renamed from: e */
    public final defpackage.ajcs scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return i(runnable, j, j2, timeUnit, false);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.a.post(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return i(runnable, j, j2, timeUnit, true);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return i(runnable, j, j2, timeUnit, false);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        throw new java.lang.UnsupportedOperationException();
    }
}
