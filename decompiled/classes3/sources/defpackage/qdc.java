package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class qdc extends amzv {
    long a;
    long b;
    final /* synthetic */ defpackage.amzw c;
    final /* synthetic */ defpackage.qdd d;

    public qdc(defpackage.qdd qddVar, defpackage.amzw amzwVar) {
        this.c = amzwVar;
        j$.util.Objects.requireNonNull(qddVar);
        this.d = qddVar;
        this.a = 0L;
        this.b = 0L;
    }

    public final void a(java.lang.Throwable th) {
        this.d.a.a.d.h(this.c.toString());
    }

    public final void b() {
        float fB = aazc.b() - this.b;
        com.android.dialer.incall.producersmonitor.ProducersMonitor producersMonitor = this.d.a.a;
        float f = fB / 1000000.0f;
        if (f > producersMonitor.a) {
            producersMonitor.a("Producer %s runtime: %f milliseconds", this.c, f);
        }
    }

    public final void c() {
        this.b = aazc.b();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final void d() {
        this.a = aazc.b();
        java.lang.String string = this.c.toString();
        defpackage.uss ussVar = this.d.a.a.d;
        if (ussVar.i()) {
            java.lang.Object obj = ussVar.b;
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MILLISECONDS;
            ussVar.d.putIfAbsent(string, java.lang.Long.valueOf(jElapsedRealtime / 1000));
            ussVar.g();
        }
    }

    public final void e(java.lang.Object obj) {
        com.android.dialer.incall.producersmonitor.ProducersMonitor producersMonitor = this.d.a.a;
        defpackage.uss ussVar = producersMonitor.d;
        long jB = aazc.b();
        defpackage.amzw amzwVar = this.c;
        ussVar.h(amzwVar.toString());
        long j = jB - this.b;
        long j2 = jB - this.a;
        float f = j / 1000000.0f;
        if (f > producersMonitor.b) {
            producersMonitor.a("Producer %s complete: %f milliseconds", amzwVar, f);
        }
        float f2 = j2 / 1000000.0f;
        if (f2 > producersMonitor.c) {
            producersMonitor.a("Producer %s latency: %f milliseconds", amzwVar, f2);
        }
    }
}
