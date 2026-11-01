package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fpi implements defpackage.fpm {
    private final long[] a;
    private final long[] b;
    private final long c;

    public fpi(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? eum.w(jArr2[jArr2.length - 1]) : j;
    }

    private static android.util.Pair i(long j, long[] jArr, long[] jArr2) {
        int iAc = eum.ac(jArr, j, true);
        long j2 = jArr[iAc];
        long j3 = jArr2[iAc];
        int i = iAc + 1;
        if (i == jArr.length) {
            return android.util.Pair.create(java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return android.util.Pair.create(java.lang.Long.valueOf(j), java.lang.Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.fma
    public final long a() {
        return this.c;
    }

    @Override // defpackage.fma
    public final defpackage.fly b(long j) {
        android.util.Pair pairI = i(eum.C(eum.s(j, 0L, this.c)), this.b, this.a);
        defpackage.fmb fmbVar = new defpackage.fmb(eum.w(((java.lang.Long) pairI.first).longValue()), ((java.lang.Long) pairI.second).longValue());
        return new defpackage.fly(fmbVar, fmbVar);
    }

    @Override // defpackage.fma
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.fma
    public final boolean d() {
        return true;
    }

    @Override // defpackage.fpm
    public final int e() {
        return -2147483647;
    }

    @Override // defpackage.fpm
    public final long f() {
        return -1L;
    }

    @Override // defpackage.fpm
    public final long g() {
        return 0L;
    }

    @Override // defpackage.fpm
    public final long h(long j) {
        return eum.w(((java.lang.Long) i(j, this.a, this.b).second).longValue());
    }
}
