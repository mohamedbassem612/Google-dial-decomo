package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fqs implements defpackage.fma {
    final /* synthetic */ defpackage.fqt a;

    public fqs(defpackage.fqt fqtVar) {
        j$.util.Objects.requireNonNull(fqtVar);
        this.a = fqtVar;
    }

    @Override // defpackage.fma
    public final long a() {
        defpackage.fqt fqtVar = this.a;
        return fqtVar.c.f(fqtVar.d);
    }

    @Override // defpackage.fma
    public final defpackage.fly b(long j) {
        defpackage.fqt fqtVar = this.a;
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(fqtVar.c.g(j));
        long j2 = fqtVar.b;
        long j3 = fqtVar.a;
        defpackage.fmb fmbVar = new defpackage.fmb(j, eum.s((bigIntegerValueOf.multiply(java.math.BigInteger.valueOf(j2 - j3)).divide(java.math.BigInteger.valueOf(fqtVar.d)).longValue() + j3) - 30000, j3, (-1) + j2));
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
}
