package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class abqm implements java.util.concurrent.RunnableScheduledFuture {
    private final java.util.concurrent.RunnableScheduledFuture a;

    public abqm(java.util.concurrent.RunnableScheduledFuture runnableScheduledFuture) {
        this.a = runnableScheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.util.concurrent.Delayed delayed) {
        java.util.concurrent.Delayed delayed2 = delayed;
        if (this == delayed2) {
            return 0;
        }
        return delayed2 instanceof defpackage.abqm ? this.a.compareTo(((defpackage.abqm) delayed2).a) : java.lang.Long.compare(getDelay(java.util.concurrent.TimeUnit.NANOSECONDS), delayed2.getDelay(java.util.concurrent.TimeUnit.NANOSECONDS));
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.a.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(java.util.concurrent.TimeUnit timeUnit) {
        long delay = this.a.getDelay(timeUnit);
        return java.util.concurrent.TimeUnit.NANOSECONDS.convert(delay, timeUnit) > 2147483647999999999L ? timeUnit.convert(2147483647999999999L, java.util.concurrent.TimeUnit.NANOSECONDS) : delay;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return this.a.isPeriodic();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
        return abqn.a(this.a, j, timeUnit);
    }
}
