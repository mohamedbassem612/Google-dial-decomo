package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajcz extends defpackage.ajcw implements java.lang.AutoCloseable, defpackage.ajcu {
    final java.util.concurrent.ScheduledExecutorService a;

    public ajcz(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: b */
    public final defpackage.ajcs schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.ajdk ajdkVar = new defpackage.ajdk(java.util.concurrent.Executors.callable(runnable, null));
        return new defpackage.ajcx(ajdkVar, this.a.schedule(ajdkVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: c */
    public final defpackage.ajcs schedule(java.util.concurrent.Callable callable, long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.ajdk ajdkVar = new defpackage.ajdk(callable);
        return new defpackage.ajcx(ajdkVar, this.a.schedule(ajdkVar, j, timeUnit));
    }

    @Override // defpackage.ajak, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        defpackage.anty.aj(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: d */
    public final defpackage.ajcs scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        ajcy ajcyVar = new ajcy(runnable);
        return new defpackage.ajcx(ajcyVar, this.a.scheduleAtFixedRate(ajcyVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: e */
    public final defpackage.ajcs scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        ajcy ajcyVar = new ajcy(runnable);
        return new defpackage.ajcx(ajcyVar, this.a.scheduleWithFixedDelay(ajcyVar, j, j2, timeUnit));
    }
}
