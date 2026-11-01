package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class abqw extends defpackage.ajac implements java.lang.Runnable, defpackage.ajcs {
    private java.util.concurrent.Callable a;
    private final long b;

    public abqw(defpackage.abqx abqxVar, java.util.concurrent.Callable callable, long j) {
        j$.util.Objects.requireNonNull(abqxVar);
        this.a = callable;
        this.b = j;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.util.concurrent.Delayed delayed) {
        return defpackage.abqx.a(this, delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(java.util.concurrent.TimeUnit timeUnit) {
        return java.lang.Math.max(0L, java.util.concurrent.TimeUnit.MILLISECONDS.convert(this.b - android.os.SystemClock.elapsedRealtime(), timeUnit));
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isDone()) {
            return;
        }
        try {
            java.util.concurrent.Callable callable = this.a;
            this.a = null;
            o(callable.call());
        } catch (java.lang.Throwable th) {
            p(th);
        }
    }
}
