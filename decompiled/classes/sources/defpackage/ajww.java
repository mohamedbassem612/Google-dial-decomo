package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ajww {
    private static final long a;
    private static final long b;
    private long c;
    private int d;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        a = 86400000L;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MINUTES;
        b = 1800000L;
    }

    public ajww() {
        defpackage.ajwp.b();
    }

    private final synchronized long c(int i) {
        try {
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return (i == 429 || (i >= 500 && i < 600)) ? (long) java.lang.Math.min(java.lang.Math.pow(2.0d, this.d) + ((long) (java.lang.Math.random() * 1000.0d)), b) : a;
    }

    private final synchronized void d() {
        this.d = 0;
    }

    public final synchronized void a(int i) {
        try {
            if ((i >= 200 && i < 300) || i == 401 || i == 404) {
                d();
            } else {
                this.d++;
                this.c = java.lang.System.currentTimeMillis() + c(i);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean b() {
        return this.d == 0 || java.lang.System.currentTimeMillis() > this.c;
    }
}
