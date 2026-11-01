package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ajda {
    public double a;
    public double b;
    public double c;
    public long d = 0;
    public final defpackage.ajyi e;
    private volatile java.lang.Object f;

    public ajda(defpackage.ajyi ajyiVar) {
        this.e = ajyiVar;
    }

    public final java.lang.Object a() {
        java.lang.Object obj = this.f;
        if (obj == null) {
            synchronized (this) {
                obj = this.f;
                if (obj == null) {
                    obj = new java.lang.Object();
                    this.f = obj;
                }
            }
        }
        return obj;
    }

    public final void b(long j) {
        long j2 = this.d;
        if (j > j2) {
            this.a = java.lang.Math.min(this.b, this.a + ((j - j2) / this.c));
            this.d = j;
        }
    }

    public final java.lang.String toString() {
        double d;
        java.util.Locale locale = java.util.Locale.ROOT;
        synchronized (a()) {
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
            d = 1000000.0d / this.c;
        }
        return java.lang.String.format(locale, "RateLimiter[stableRate=%3.1fqps]", java.lang.Double.valueOf(d));
    }
}
