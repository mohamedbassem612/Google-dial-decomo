package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class htt {
    private final rwv a;
    private final java.lang.String b;
    private final sql c;

    public htt(rwv rwvVar, java.lang.String str, sql sqlVar) {
        aooh.f(rwvVar, "call");
        aooh.f(str, "countryIso");
        aooh.f(sqlVar, "phoneLookupConsolidator");
        this.a = rwvVar;
        this.b = str;
        this.c = sqlVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.htt) {
            defpackage.htt httVar = (defpackage.htt) obj;
            if (aooh.n(this.a, httVar.a) && aooh.n(this.b, httVar.b) && aooh.n(this.c, httVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "Request(call=" + this.a + ", countryIso=" + this.b + ", phoneLookupConsolidator=" + this.c + ')';
    }
}
