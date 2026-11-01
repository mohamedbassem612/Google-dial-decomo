package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aorp {
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater a = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.aorp.class, "b");
    public volatile long b;
    public final defpackage.aooh c;

    public aorp(long j, defpackage.aooh aoohVar) {
        this.c = aoohVar;
        this.b = j;
    }

    public final long a(long j) {
        return a.addAndGet(this, j);
    }

    public final long b() {
        return a.getAndIncrement(this);
    }

    public final boolean c(long j, long j2) {
        boolean zCompareAndSet = a.compareAndSet(this, j, j2);
        if (!zCompareAndSet || this.c == defpackage.aorr.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.b);
    }
}
