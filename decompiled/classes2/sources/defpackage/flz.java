package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class flz implements defpackage.fma, defpackage.fpm {
    private final long a;
    private final defpackage.fly b;

    public flz(long j, long j2) {
        this.a = j;
        defpackage.fmb fmbVar = j2 == 0 ? defpackage.fmb.a : new defpackage.fmb(0L, j2);
        this.b = new defpackage.fly(fmbVar, fmbVar);
    }

    @Override // defpackage.fma
    public final long a() {
        return this.a;
    }

    @Override // defpackage.fma
    public final defpackage.fly b(long j) {
        return this.b;
    }

    @Override // defpackage.fma
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.fma
    public final boolean d() {
        return false;
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
        return 0L;
    }
}
