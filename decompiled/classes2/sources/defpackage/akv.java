package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class akv implements aiq {
    private final aiq a;
    private final long b;

    public akv(aiq aiqVar, long j) {
        this.a = aiqVar;
        this.b = j;
    }

    public final defpackage.alp a(nf nfVar) {
        return new defpackage.akw(this.a.a(nfVar), this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.akv)) {
            return false;
        }
        defpackage.akv akvVar = (defpackage.akv) obj;
        return akvVar.b == this.b && aooh.n(akvVar.a, this.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }
}
