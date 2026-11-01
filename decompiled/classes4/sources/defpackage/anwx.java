package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anwx {
    public final long a;
    public final long b;
    public long c;
    public final java.lang.Object d;

    public anwx() {
        this.d = new java.util.Random();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        this.a = 1000000000L;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MINUTES;
        this.b = 120000000000L;
        this.c = 1000000000L;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final long a() {
        long j = this.c;
        double d = j;
        this.c = java.lang.Math.min((long) (1.6d * d), this.b);
        double d2 = 0.2d * d;
        double d3 = d * (-0.2d);
        ahvr.bM((boolean) (((d2 > d3 ? 1 : (d2 == d3 ? 0 : -1)) ^ (-1)) >>> 31));
        return j + ((long) ((((java.util.Random) this.d).nextDouble() * (d2 - d3)) + d3));
    }

    public anwx(erc ercVar, long j, long j2) {
        this.d = ercVar;
        this.b = j;
        this.a = j2;
    }
}
