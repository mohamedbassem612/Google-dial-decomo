package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class flb implements defpackage.fma {
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    private final long f;
    private final long g;
    private final boolean h;

    public flb(long j, long j2, int i, int i2, boolean z, boolean z2) {
        long jF;
        this.f = j;
        this.a = j2;
        this.b = i2 == -1 ? 1 : i2;
        this.c = i;
        this.e = z;
        this.h = z2;
        if (j == -1) {
            this.g = -1L;
            jF = -9223372036854775807L;
        } else {
            this.g = j - j2;
            jF = f(j, j2, i);
        }
        this.d = jF;
    }

    private static long f(long j, long j2, int i) {
        return (java.lang.Math.max(0L, j - j2) * 8000000) / ((long) i);
    }

    @Override // defpackage.fma
    public long a() {
        return this.d;
    }

    @Override // defpackage.fma
    public defpackage.fly b(long j) {
        long j2 = this.g;
        if (j2 == -1) {
            if (!this.e) {
                defpackage.fmb fmbVar = new defpackage.fmb(0L, this.a);
                return new defpackage.fly(fmbVar, fmbVar);
            }
            j2 = -1;
        }
        long j3 = ((long) this.c) * j;
        long j4 = this.b;
        long jMin = ((j3 / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = java.lang.Math.min(jMin, j2 - j4);
        }
        long jMax = this.a + java.lang.Math.max(jMin, 0L);
        long j5 = j(jMax);
        defpackage.fmb fmbVar2 = new defpackage.fmb(j5, jMax);
        if (j2 != -1 && j5 < j) {
            long j6 = jMax + j4;
            if (j6 < this.f) {
                return new defpackage.fly(fmbVar2, new defpackage.fmb(j(j6), j6));
            }
        }
        return new defpackage.fly(fmbVar2, fmbVar2);
    }

    @Override // defpackage.fma
    public final boolean c() {
        return this.h;
    }

    @Override // defpackage.fma
    public final boolean d() {
        return this.g != -1 || this.e;
    }

    public final long j(long j) {
        return f(j, this.a, this.c);
    }
}
