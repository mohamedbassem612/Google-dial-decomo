package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoro {
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater a = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.aoro.class, "b");
    public volatile int b;
    public final defpackage.aooh c;

    public aoro(int i, defpackage.aooh aoohVar) {
        this.c = aoohVar;
        this.b = i;
    }

    public final int a() {
        return a.decrementAndGet(this);
    }

    public final int b() {
        return a.incrementAndGet(this);
    }

    public final boolean c(int i, int i2) {
        boolean zCompareAndSet = a.compareAndSet(this, i, i2);
        if (!zCompareAndSet || this.c == defpackage.aorr.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.b);
    }
}
