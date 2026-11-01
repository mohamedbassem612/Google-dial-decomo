package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aamc {
    long a = -1;
    long b = -1;

    public final long a() {
        aais.ai(this.b != -1);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
        return (b() - this.b) / 1000000;
    }

    public final long b() {
        if (this.a == -1) {
            return java.lang.System.nanoTime();
        }
        this.a = -1L;
        return 0L;
    }

    public final void c() {
        this.b = b();
    }
}
