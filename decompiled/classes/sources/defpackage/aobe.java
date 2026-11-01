package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aobe {
    public final java.util.concurrent.ScheduledExecutorService a;
    public final java.util.concurrent.Executor b;
    public final java.lang.Runnable c;
    public long d;
    public boolean e;
    public java.util.concurrent.ScheduledFuture f;
    private final defpackage.ahzh g;

    public aobe(java.lang.Runnable runnable, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.ahzh ahzhVar) {
        this.c = runnable;
        this.b = executor;
        this.a = scheduledExecutorService;
        this.g = ahzhVar;
        ahzhVar.e();
    }

    public final long a() {
        return this.g.a(java.util.concurrent.TimeUnit.NANOSECONDS);
    }
}
