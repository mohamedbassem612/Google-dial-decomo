package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class akw implements defpackage.alp {
    private final defpackage.alp a;
    private final long b;

    public akw(defpackage.alp alpVar, long j) {
        this.a = alpVar;
        this.b = j;
    }

    @Override // defpackage.alp
    public final long a(aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        return this.a.a(aiwVar, aiwVar2, aiwVar3) + this.b;
    }

    @Override // defpackage.alp
    public final /* synthetic */ aiw b(aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        return d(a(aiwVar, aiwVar2, aiwVar3), aiwVar, aiwVar2, aiwVar3);
    }

    @Override // defpackage.alp
    public final aiw c(long j, aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        long j2 = this.b;
        return j >= j2 ? this.a.c(j - j2, aiwVar, aiwVar2, aiwVar3) : aiwVar;
    }

    @Override // defpackage.alp
    public final aiw d(long j, aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        long j2 = this.b;
        return j >= j2 ? this.a.d(j - j2, aiwVar, aiwVar2, aiwVar3) : aiwVar3;
    }

    @Override // defpackage.alp
    public final boolean e() {
        return this.a.e();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.akw)) {
            return false;
        }
        defpackage.akw akwVar = (defpackage.akw) obj;
        return akwVar.b == this.b && aooh.n(akwVar.a, this.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }
}
