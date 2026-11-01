package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alpg {
    private static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/utils/ActiveTaskMonitor");
    private final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.util.concurrent.Semaphore c = new java.util.concurrent.Semaphore(1);

    public final synchronized boolean a() {
        if (this.b.getAndIncrement() == 0) {
            try {
                this.c.acquire();
            } catch (java.lang.InterruptedException unused) {
                this.b.decrementAndGet();
                return false;
            }
        }
        return true;
    }

    public final synchronized void b() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.b;
        if (atomicInteger.get() <= 0) {
            a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/utils/ActiveTaskMonitor", "decrementActiveCount", 39, "ActiveTaskMonitor.java").v("Trying to decrement an already idle active count.");
        } else {
            if (atomicInteger.decrementAndGet() == 0) {
                this.c.release();
            }
        }
    }
}
