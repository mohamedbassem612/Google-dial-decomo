package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tei {
    public final java.lang.String a;
    public final java.lang.String b;
    public final int c;

    public tei(java.lang.String str, int i, java.lang.String str2) {
        aooh.f(str, "normalizedInput");
        aooh.f(str2, "rawInput");
        this.a = str;
        this.c = i;
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.tei) {
            defpackage.tei teiVar = (defpackage.tei) obj;
            if (aooh.n(this.a, teiVar.a) && this.c == teiVar.c && aooh.n(this.b, teiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Query(normalizedInput=" + this.a + ", searchType=" + ((java.lang.Object) snl.aH(this.c)) + ", rawInput=" + this.b + ')';
    }
}
