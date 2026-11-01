package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agwc implements java.util.concurrent.ScheduledExecutorService, java.lang.AutoCloseable {
    private final java.util.concurrent.ScheduledExecutorService a;

    public agwc(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService == null) {
            defpackage.aooh.i("delegate");
        }
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.aooh.f(timeUnit, "unit");
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        defpackage.anty.aj(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        if (runnable == null) {
            defpackage.aooh.i("command");
        }
        long j = defpackage.ahqx.a;
        boolean zO = defpackage.ahqx.o();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.a;
        if (zO) {
            scheduledExecutorService.execute(defpackage.ahqx.g(runnable));
        } else {
            scheduledExecutorService.execute(runnable);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection collection, long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.aooh.f(collection, "tasks");
        defpackage.aooh.f(timeUnit, "unit");
        java.util.List listInvokeAll = this.a.invokeAll(collection, j, timeUnit);
        defpackage.aooh.e(listInvokeAll, "invokeAll(...)");
        return listInvokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection collection, long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.aooh.f(collection, "tasks");
        defpackage.aooh.f(timeUnit, "unit");
        return this.a.invokeAny(collection, j, timeUnit);
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
        if (runnable == null) {
            defpackage.aooh.i("command");
        }
        if (timeUnit == null) {
            defpackage.aooh.i("unit");
        }
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.a;
        long j2 = defpackage.ahqx.a;
        if (defpackage.ahqx.o()) {
            runnable = defpackage.ahqx.g(runnable);
        }
        java.util.concurrent.ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, timeUnit);
        defpackage.aooh.e(scheduledFutureSchedule, "schedule(...)");
        return scheduledFutureSchedule;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.aooh.f(runnable, "command");
        defpackage.aooh.f(timeUnit, "unit");
        long j3 = defpackage.ahqx.a;
        if (defpackage.ahqx.o()) {
            runnable = defpackage.ahqx.g(runnable);
        }
        java.util.concurrent.ScheduledFuture<?> scheduledFutureScheduleAtFixedRate = this.a.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        defpackage.aooh.e(scheduledFutureScheduleAtFixedRate, "scheduleAtFixedRate(...)");
        return scheduledFutureScheduleAtFixedRate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.aooh.f(runnable, "command");
        defpackage.aooh.f(timeUnit, "unit");
        long j3 = defpackage.ahqx.a;
        if (defpackage.ahqx.o()) {
            runnable = defpackage.ahqx.g(runnable);
        }
        java.util.concurrent.ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay = this.a.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        defpackage.aooh.e(scheduledFutureScheduleWithFixedDelay, "scheduleWithFixedDelay(...)");
        return scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        java.util.List<java.lang.Runnable> listShutdownNow = this.a.shutdownNow();
        defpackage.aooh.e(listShutdownNow, "shutdownNow(...)");
        return listShutdownNow;
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable runnable) {
        defpackage.aooh.f(runnable, "task");
        long j = defpackage.ahqx.a;
        boolean zO = defpackage.ahqx.o();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.a;
        if (zO) {
            java.util.concurrent.Future<?> futureSubmit = scheduledExecutorService.submit(defpackage.ahqx.g(runnable));
            defpackage.aooh.c(futureSubmit);
            return futureSubmit;
        }
        java.util.concurrent.Future<?> futureSubmit2 = scheduledExecutorService.submit(runnable);
        defpackage.aooh.c(futureSubmit2);
        return futureSubmit2;
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection collection) {
        defpackage.aooh.f(collection, "tasks");
        return this.a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection collection) {
        defpackage.aooh.f(collection, "tasks");
        java.util.List listInvokeAll = this.a.invokeAll(collection);
        defpackage.aooh.e(listInvokeAll, "invokeAll(...)");
        return listInvokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable runnable, java.lang.Object obj) {
        defpackage.aooh.f(runnable, "task");
        long j = defpackage.ahqx.a;
        boolean zO = defpackage.ahqx.o();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.a;
        if (zO) {
            java.util.concurrent.Future futureSubmit = scheduledExecutorService.submit(defpackage.ahqx.g(runnable), obj);
            defpackage.aooh.c(futureSubmit);
            return futureSubmit;
        }
        java.util.concurrent.Future futureSubmit2 = scheduledExecutorService.submit(runnable, obj);
        defpackage.aooh.c(futureSubmit2);
        return futureSubmit2;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture schedule(java.util.concurrent.Callable callable, long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.aooh.f(callable, "callable");
        defpackage.aooh.f(timeUnit, "unit");
        long j2 = defpackage.ahqx.a;
        if (defpackage.ahqx.o()) {
            callable = defpackage.ahqx.j(callable);
        }
        java.util.concurrent.ScheduledFuture scheduledFutureSchedule = this.a.schedule(callable, j, timeUnit);
        defpackage.aooh.e(scheduledFutureSchedule, "schedule(...)");
        return scheduledFutureSchedule;
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.util.concurrent.Callable callable) {
        defpackage.aooh.f(callable, "task");
        long j = defpackage.ahqx.a;
        boolean zO = defpackage.ahqx.o();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.a;
        if (zO) {
            java.util.concurrent.Future futureSubmit = scheduledExecutorService.submit(defpackage.ahqx.j(callable));
            defpackage.aooh.c(futureSubmit);
            return futureSubmit;
        }
        java.util.concurrent.Future futureSubmit2 = scheduledExecutorService.submit(callable);
        defpackage.aooh.c(futureSubmit2);
        return futureSubmit2;
    }
}
