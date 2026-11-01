package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aorn {
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater a = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.aorn.class, "c");
    public final defpackage.aooh b;
    private volatile int c;

    public aorn(boolean z, defpackage.aooh aoohVar) {
        this.b = aoohVar;
        this.c = z ? 1 : 0;
    }

    public final boolean a() {
        return this.c != 0;
    }

    public final boolean b() {
        boolean zCompareAndSet = a.compareAndSet(this, 0, 1);
        if (!zCompareAndSet || this.b == defpackage.aorr.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final void c() {
        this.c = 1;
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(a());
    }
}
