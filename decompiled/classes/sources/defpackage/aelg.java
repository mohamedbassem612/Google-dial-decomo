package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aelg {
    public boolean a;
    private final java.util.concurrent.ScheduledExecutorService b;

    public aelg(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        defpackage.aooh.f(scheduledExecutorService, "scheduledExecutorService");
        this.b = scheduledExecutorService;
        this.a = true;
    }

    public final void a(java.lang.Runnable runnable) {
        if (this.a) {
            defpackage.aooh.e(this.b.schedule(new defpackage.abqu(runnable, this, 4, null), 5L, java.util.concurrent.TimeUnit.SECONDS), "schedule(...)");
        } else {
            runnable.run();
        }
    }
}
