package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anrc implements java.util.concurrent.Executor {
    private final java.lang.Thread.UncaughtExceptionHandler a;
    private final java.util.Queue b = new j$.util.concurrent.ConcurrentLinkedQueue();
    private final java.util.concurrent.atomic.AtomicReference c = new java.util.concurrent.atomic.AtomicReference();

    public anrc(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    public final void a() {
        while (defpackage.anty.aq(this.c, java.lang.Thread.currentThread())) {
            while (true) {
                try {
                    java.lang.Runnable runnable = (java.lang.Runnable) this.b.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (java.lang.Throwable th) {
                        this.a.uncaughtException(java.lang.Thread.currentThread(), th);
                    }
                } catch (java.lang.Throwable th2) {
                    this.c.set(null);
                    throw th2;
                }
            }
            this.c.set(null);
            if (this.b.isEmpty()) {
                return;
            }
        }
    }

    public final void b(java.lang.Runnable runnable) {
        defpackage.ahvr.cj(runnable, "runnable is null");
        this.b.add(runnable);
    }

    public final void c() {
        defpackage.ahvr.bZ(java.lang.Thread.currentThread() == this.c.get(), "Not called from the SynchronizationContext");
    }

    public final apjb d(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        anrb anrbVar = new anrb(runnable);
        return new apjb(anrbVar, scheduledExecutorService.schedule((java.lang.Runnable) new anra(this, anrbVar, runnable), j, timeUnit));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        b(runnable);
        a();
    }
}
