package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anvi implements java.lang.Runnable, defpackage.anmp {
    public final boolean a;
    public final boolean b;
    public final long c;
    public volatile java.util.concurrent.ScheduledFuture d;
    public volatile boolean e;
    final /* synthetic */ defpackage.anvo f;

    public anvi(defpackage.anvo anvoVar, anmw anmwVar, boolean z) {
        j$.util.Objects.requireNonNull(anvoVar);
        this.f = anvoVar;
        this.a = z;
        if (anmwVar == null) {
            this.b = false;
            this.c = 0L;
        } else {
            this.b = true;
            this.c = anmwVar.b(java.util.concurrent.TimeUnit.NANOSECONDS);
        }
    }

    @Override // defpackage.anmp
    public final void a(defpackage.anmv anmvVar) {
        if (this.b && this.a && (anmvVar.c() instanceof java.util.concurrent.TimeoutException)) {
            this.f.j.c(b());
        } else {
            this.f.j.c(anty.x(anmvVar));
        }
    }

    final anqw b() {
        long j = this.c;
        long jAbs = java.lang.Math.abs(j);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        long j2 = jAbs / 1000000000;
        long jAbs2 = java.lang.Math.abs(j);
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.SECONDS;
        long j3 = jAbs2 % 1000000000;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(true != this.a ? "CallOptions" : "Context");
        sb.append(" deadline exceeded after ");
        if (j < 0) {
            sb.append('-');
        }
        sb.append(j2);
        sb.append(java.lang.String.format(java.util.Locale.US, ".%09d", java.lang.Long.valueOf(j3)));
        sb.append("s. ");
        defpackage.anvo anvoVar = this.f;
        java.lang.Long l = (java.lang.Long) anvoVar.g.f(anmg.f);
        sb.append(java.lang.String.format(java.util.Locale.US, "Name resolution delay %.9f seconds.", java.lang.Double.valueOf(l == null ? 0.0d : l.longValue() / defpackage.anvo.a)));
        if (anvoVar.j != null) {
            defpackage.anxu anxuVar = new defpackage.anxu();
            anvoVar.j.b(anxuVar);
            sb.append(' ');
            sb.append(anxuVar);
        }
        return anqw.e.f(sb.toString());
    }

    final void c() {
        this.e = true;
        java.util.concurrent.ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f.e.g(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.j.c(b());
    }
}
