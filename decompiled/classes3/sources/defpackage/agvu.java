package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agvu extends aolj implements kotlinx.coroutines.CoroutineExceptionHandler, java.util.concurrent.ScheduledExecutorService, java.lang.AutoCloseable {
    public static final /* synthetic */ int b = 0;
    public final java.lang.ThreadLocal a;
    private final java.util.concurrent.ScheduledExecutorService d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agvu(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        super(kotlinx.coroutines.CoroutineExceptionHandler.c);
        aooh.f(scheduledExecutorService, "delegate");
        this.d = scheduledExecutorService;
        this.a = new java.lang.ThreadLocal();
    }

    private final java.lang.Runnable b(java.lang.Runnable runnable) {
        defpackage.agrz agrzVar = new defpackage.agrz(runnable, this, 3, null);
        long j = ahqx.a;
        return ahqx.o() ? ahqx.g(agrzVar) : agrzVar;
    }

    public final java.util.concurrent.Callable a(java.util.concurrent.Callable callable) {
        defpackage.afgu afguVar = new defpackage.afgu(callable, this, 8);
        long j = ahqx.a;
        return ahqx.o() ? ahqx.j(afguVar) : afguVar;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) {
        aooh.f(timeUnit, "unit");
        return this.d.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        anty.aj(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        aooh.f(runnable, "command");
        this.d.execute(b(runnable));
    }

    public final void handleException(aolr aolrVar, java.lang.Throwable th) {
        aooh.f(aolrVar, "context");
        aooh.f(th, "exception");
        try {
            ((aimz) defpackage.agvv.b.a()).c().k(th).l("com/google/apps/tiktok/coroutines/TikTokExceptionHandler", "handleException", 61, "TikTokExceptionHandler.kt").v("Uncaught exception from runnable");
        } catch (java.lang.Throwable th2) {
            java.util.logging.Logger logger = defpackage.agvv.a;
            logger.log(java.util.logging.Level.SEVERE, "GoogleLogger failed to log", th2);
            android.util.Log.e("TikTokExceptionHandler2", "GoogleLogger failed to log", th2);
            logger.log(java.util.logging.Level.SEVERE, "Uncaught exception from runnable", th);
            android.util.Log.e("TikTokExceptionHandler2", "Uncaught exception from runnable", th);
        }
        this.a.set(th);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection collection, long j, java.util.concurrent.TimeUnit timeUnit) {
        aooh.f(collection, "tasks");
        aooh.f(timeUnit, "unit");
        java.util.List listInvokeAll = this.d.invokeAll(new aids(collection, new defpackage.agnw(new defpackage.sba(this, 18, (float[][][]) null), 11)), j, timeUnit);
        aooh.e(listInvokeAll, "invokeAll(...)");
        return listInvokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection collection) {
        aooh.f(collection, "tasks");
        return this.d.invokeAny(new aids(collection, new defpackage.agnw(new defpackage.sba(this, 19, (float[][][]) null), 10)));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.d.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.d.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        aooh.f(runnable, "command");
        aooh.f(timeUnit, "unit");
        java.util.concurrent.ScheduledFuture<?> scheduledFutureSchedule = this.d.schedule(b(runnable), j, timeUnit);
        aooh.e(scheduledFutureSchedule, "schedule(...)");
        return scheduledFutureSchedule;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        aooh.f(runnable, "command");
        aooh.f(timeUnit, "unit");
        java.util.concurrent.ScheduledFuture<?> scheduledFutureScheduleAtFixedRate = this.d.scheduleAtFixedRate(b(runnable), j, j2, timeUnit);
        aooh.e(scheduledFutureScheduleAtFixedRate, "scheduleAtFixedRate(...)");
        return scheduledFutureScheduleAtFixedRate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        aooh.f(runnable, "command");
        aooh.f(timeUnit, "unit");
        java.util.concurrent.ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay = this.d.scheduleWithFixedDelay(b(runnable), j, j2, timeUnit);
        aooh.e(scheduledFutureScheduleWithFixedDelay, "scheduleWithFixedDelay(...)");
        return scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.d.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        java.util.List<java.lang.Runnable> listShutdownNow = this.d.shutdownNow();
        aooh.e(listShutdownNow, "shutdownNow(...)");
        return listShutdownNow;
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable runnable) {
        aooh.f(runnable, "task");
        java.util.concurrent.Future<?> futureSubmit = this.d.submit(b(runnable));
        aooh.e(futureSubmit, "submit(...)");
        return futureSubmit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable runnable, java.lang.Object obj) {
        aooh.f(runnable, "task");
        java.util.concurrent.Future futureSubmit = this.d.submit(b(runnable), obj);
        aooh.e(futureSubmit, "submit(...)");
        return futureSubmit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.util.concurrent.Callable callable) {
        aooh.f(callable, "task");
        java.util.concurrent.Future futureSubmit = this.d.submit(a(callable));
        aooh.e(futureSubmit, "submit(...)");
        return futureSubmit;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture schedule(java.util.concurrent.Callable callable, long j, java.util.concurrent.TimeUnit timeUnit) {
        aooh.f(callable, "callable");
        aooh.f(timeUnit, "unit");
        java.util.concurrent.ScheduledFuture scheduledFutureSchedule = this.d.schedule(a(callable), j, timeUnit);
        aooh.e(scheduledFutureSchedule, "schedule(...)");
        return scheduledFutureSchedule;
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection collection, long j, java.util.concurrent.TimeUnit timeUnit) {
        aooh.f(collection, "tasks");
        aooh.f(timeUnit, "unit");
        return this.d.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection collection) {
        aooh.f(collection, "tasks");
        java.util.List listInvokeAll = this.d.invokeAll(new aids(collection, new defpackage.agnw(new defpackage.sba(this, 17, (float[][][]) null), 12)));
        aooh.e(listInvokeAll, "invokeAll(...)");
        return listInvokeAll;
    }
}
