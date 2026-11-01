package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahws implements java.lang.Runnable {
    final /* synthetic */ ajdd a;
    final /* synthetic */ java.lang.Runnable b;
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference c;
    final /* synthetic */ ajcu d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;

    public ahws(ajdd ajddVar, java.lang.Runnable runnable, java.util.concurrent.atomic.AtomicReference atomicReference, ajcu ajcuVar, long j, long j2) {
        this.a = ajddVar;
        this.b = runnable;
        this.c = atomicReference;
        this.d = ajcuVar;
        this.e = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ajdd ajddVar = this.a;
            if (ajddVar.isDone()) {
                return;
            }
            this.b.run();
            ajdd ajddVar2 = new ajdd();
            this.c.set(ajddVar2);
            if (ajddVar.isDone()) {
                return;
            }
            ajcu ajcuVar = this.d;
            long j = this.e;
            long j2 = this.f;
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            ajddVar2.q(ajcuVar.b(this, jElapsedRealtime < j ? (j + j2) - jElapsedRealtime : j2 - ((jElapsedRealtime - j) % j2), java.util.concurrent.TimeUnit.MILLISECONDS));
        } catch (java.lang.Throwable th) {
            this.a.p(th);
        }
    }

    public final java.lang.String toString() {
        return this.b.toString();
    }
}
