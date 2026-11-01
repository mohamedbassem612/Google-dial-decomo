package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tej {
    public final java.lang.String a;
    public final long b;
    public final int c;

    public tej(java.lang.String str, int i, long j) {
        aooh.f(str, "query");
        this.a = str;
        this.c = i;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.tej) {
            defpackage.tej tejVar = (defpackage.tej) obj;
            if (aooh.n(this.a, tejVar.a) && this.c == tejVar.c && this.b == tejVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c) * 31) + anty.M(this.b);
    }

    public final java.lang.String toString() {
        return "SearchContext(query=" + this.a + ", searchType=" + ((java.lang.Object) snl.aH(this.c)) + ", searchStartTimeMs=" + this.b + ')';
    }
}
