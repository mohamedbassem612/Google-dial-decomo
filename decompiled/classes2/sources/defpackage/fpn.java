package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fpn implements defpackage.fpm {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;
    private final long e;
    private final int f;

    public fpn(long[] jArr, long[] jArr2, long j, long j2, long j3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = defpackage.fsu.s(j3 - j2, j);
    }

    @Override // defpackage.fma
    public final long a() {
        return this.c;
    }

    @Override // defpackage.fma
    public final defpackage.fly b(long j) {
        long[] jArr = this.a;
        int iAc = eum.ac(jArr, j, true);
        long j2 = jArr[iAc];
        long[] jArr2 = this.b;
        defpackage.fmb fmbVar = new defpackage.fmb(j2, jArr2[iAc]);
        if (fmbVar.b >= j || iAc == jArr.length - 1) {
            return new defpackage.fly(fmbVar, fmbVar);
        }
        int i = iAc + 1;
        return new defpackage.fly(fmbVar, new defpackage.fmb(jArr[i], jArr2[i]));
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
        return this.f;
    }

    @Override // defpackage.fpm
    public final long f() {
        return this.e;
    }

    @Override // defpackage.fpm
    public final long g() {
        return this.d;
    }

    @Override // defpackage.fpm
    public final long h(long j) {
        return this.a[eum.ac(this.b, j, true)];
    }
}
