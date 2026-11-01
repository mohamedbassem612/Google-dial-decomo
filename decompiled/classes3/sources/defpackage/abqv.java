package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class abqv extends ajac implements java.lang.Runnable, ajcs {
    final long a;
    final long b;
    final boolean c;
    final java.util.concurrent.atomic.AtomicLong d;
    java.lang.Runnable e;
    final /* synthetic */ abqx f;

    public abqv(abqx abqxVar, java.lang.Runnable runnable, long j, long j2, boolean z) {
        j$.util.Objects.requireNonNull(abqxVar);
        this.f = abqxVar;
        this.d = new java.util.concurrent.atomic.AtomicLong(0L);
        this.e = runnable;
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    private final long d() {
        return java.lang.Math.max(0L, ((this.d.get() * this.b) + this.a) - android.os.SystemClock.elapsedRealtime());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        return abqx.a(this, (java.util.concurrent.Delayed) obj);
    }

    public final long getDelay(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(d(), java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isDone()) {
            return;
        }
        this.d.incrementAndGet();
        try {
            this.e.run();
            boolean z = this.c;
            abqx abqxVar = this.f;
            if (z) {
                abqxVar.a.postDelayed(this, d());
            } else {
                abqxVar.a.postDelayed(this, this.b);
            }
        } catch (java.lang.Throwable th) {
            this.e = null;
            p(th);
        }
    }
}
