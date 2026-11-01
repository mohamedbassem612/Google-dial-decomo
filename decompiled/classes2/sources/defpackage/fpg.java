package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fpg extends defpackage.flb implements defpackage.fpm {
    public final long f;
    private final long g;

    public fpg(long j, long j2, int i, int i2, boolean z, boolean z2, long j3) {
        super(j, j2, i, i2, z, z2);
        this.f = j3;
        this.g = j == -1 ? -1L : j;
    }

    @Override // defpackage.flb, defpackage.fma
    public final long a() {
        long j = this.f;
        return j == -9223372036854775807L ? this.d : j;
    }

    @Override // defpackage.flb, defpackage.fma
    public final defpackage.fly b(long j) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            long j3 = this.g;
            if (j3 != -1) {
                long j4 = this.a;
                long j5 = this.b;
                long j6 = j3 - j5;
                defpackage.fmb fmbVar = new defpackage.fmb(java.lang.Math.max(0L, j2 - j(j5 + j4)), java.lang.Math.max(j4, j6));
                return new defpackage.fly(fmbVar, fmbVar);
            }
        }
        return super.b(j);
    }

    @Override // defpackage.fpm
    public final int e() {
        return this.c;
    }

    @Override // defpackage.fpm
    public final long f() {
        return this.g;
    }

    @Override // defpackage.fpm
    public final long g() {
        return this.a;
    }

    @Override // defpackage.fpm
    public final long h(long j) {
        return j(j);
    }
}
