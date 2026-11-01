package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anmw implements java.lang.Comparable {
    public static final defpackage.ajsz b = new defpackage.ajsz((float[]) null);
    private static final long d;
    private static final long e;
    private static final long f;
    public final long a;
    public final defpackage.ajsz c;
    private volatile boolean g;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        d = 3153600000000000000L;
        e = -3153600000000000000L;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.SECONDS;
        f = 1000000000L;
    }

    private anmw(defpackage.ajsz ajszVar, long j, long j2) {
        this.c = ajszVar;
        long jMin = java.lang.Math.min(d, java.lang.Math.max(e, j2));
        this.a = j + jMin;
        this.g = jMin <= 0;
    }

    public static defpackage.anmw c(long j, java.util.concurrent.TimeUnit timeUnit) {
        return g(j, timeUnit, b);
    }

    public static defpackage.anmw g(long j, java.util.concurrent.TimeUnit timeUnit, defpackage.ajsz ajszVar) {
        j$.util.Objects.requireNonNull(timeUnit, "units");
        return new defpackage.anmw(ajszVar, java.lang.System.nanoTime(), timeUnit.toNanos(j));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.anmw anmwVar) {
        d(anmwVar);
        return java.lang.Long.compare(this.a, anmwVar.a);
    }

    public final long b(java.util.concurrent.TimeUnit timeUnit) {
        long jNanoTime = java.lang.System.nanoTime();
        if (!this.g && this.a - jNanoTime <= 0) {
            this.g = true;
        }
        return timeUnit.convert(this.a - jNanoTime, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final void d(defpackage.anmw anmwVar) {
        defpackage.ajsz ajszVar = this.c;
        defpackage.ajsz ajszVar2 = anmwVar.c;
        if (ajszVar == ajszVar2) {
            return;
        }
        throw new java.lang.AssertionError("Tickers (" + java.lang.String.valueOf(ajszVar) + " and " + java.lang.String.valueOf(ajszVar2) + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final boolean e(defpackage.anmw anmwVar) {
        d(anmwVar);
        return this.a - anmwVar.a < 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.anmw) {
            defpackage.anmw anmwVar = (defpackage.anmw) obj;
            defpackage.ajsz ajszVar = this.c;
            if (ajszVar != null ? ajszVar == anmwVar.c : anmwVar.c == null) {
                if (this.a == anmwVar.a) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f() {
        if (this.g) {
            return true;
        }
        if (this.a - java.lang.System.nanoTime() > 0) {
            return false;
        }
        this.g = true;
        return true;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.c, java.lang.Long.valueOf(this.a)});
    }

    public final java.lang.String toString() {
        long jB = b(java.util.concurrent.TimeUnit.NANOSECONDS);
        long jAbs = java.lang.Math.abs(jB);
        long j = f;
        long j2 = jAbs / j;
        long jAbs2 = java.lang.Math.abs(jB) % j;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (jB < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (jAbs2 > 0) {
            sb.append(java.lang.String.format(java.util.Locale.US, ".%09d", java.lang.Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        defpackage.ajsz ajszVar = this.c;
        if (ajszVar != b) {
            sb.append(" (ticker=" + java.lang.String.valueOf(ajszVar) + ')');
        }
        return sb.toString();
    }
}
