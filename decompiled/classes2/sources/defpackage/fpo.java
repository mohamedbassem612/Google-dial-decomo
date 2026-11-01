package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fpo implements defpackage.fpm {
    private final long a;
    private final int b;
    private final long c;
    private final int d;
    private final long e;
    private final long f;
    private final long[] g;

    public fpo(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = defpackage.fsu.s(j3 - ((long) i), j2);
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    private final long i(int i) {
        return (this.c * ((long) i)) / 100;
    }

    @Override // defpackage.fma
    public final long a() {
        return this.c;
    }

    @Override // defpackage.fma
    public final defpackage.fly b(long j) {
        if (!d()) {
            defpackage.fmb fmbVar = new defpackage.fmb(0L, this.a + ((long) this.b));
            return new defpackage.fly(fmbVar, fmbVar);
        }
        long j2 = this.c;
        long jS = eum.s(j, 0L, j2);
        double d = (jS * 100.0d) / j2;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.g;
                ahvr.ci(jArr);
                double d3 = jArr[i];
                d2 = d3 + ((d - ((double) i)) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        long j3 = this.e;
        defpackage.fmb fmbVar2 = new defpackage.fmb(jS, this.a + eum.s(java.lang.Math.round((d2 / 256.0d) * j3), this.b, (-1) + j3));
        return new defpackage.fly(fmbVar2, fmbVar2);
    }

    @Override // defpackage.fma
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.fma
    public final boolean d() {
        return this.g != null;
    }

    @Override // defpackage.fpm
    public final int e() {
        return this.d;
    }

    @Override // defpackage.fpm
    public final long f() {
        return this.f;
    }

    @Override // defpackage.fpm
    public final long g() {
        return this.a + ((long) this.b);
    }

    @Override // defpackage.fpm
    public final long h(long j) {
        if (d()) {
            long j2 = j - this.a;
            if (j2 > this.b) {
                long[] jArr = this.g;
                ahvr.ci(jArr);
                double d = (j2 * 256.0d) / this.e;
                int iAc = eum.ac(jArr, (long) d, true);
                long jI = i(iAc);
                long j3 = jArr[iAc];
                int i = iAc + 1;
                long jI2 = i(i);
                long j4 = iAc == 99 ? 256L : jArr[i];
                return jI + java.lang.Math.round((j3 == j4 ? 0.0d : (d - j3) / (j4 - j3)) * (jI2 - jI));
            }
        }
        return 0L;
    }
}
