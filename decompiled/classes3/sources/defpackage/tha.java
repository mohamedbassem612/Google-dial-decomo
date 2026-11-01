package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tha implements defpackage.thd {
    public final defpackage.tei a;
    public final java.lang.String b;
    public final java.util.List c;
    public final java.util.List d;
    public final long e;
    public final int f;

    public tha(defpackage.tei teiVar, java.lang.String str, java.util.List list, java.util.List list2, long j, int i) {
        aooh.f(teiVar, "query");
        aooh.f(list, "sections");
        aooh.f(list2, "queryActions");
        this.a = teiVar;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = j;
        this.f = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.tha) {
            defpackage.tha thaVar = (defpackage.tha) obj;
            if (aooh.n(this.a, thaVar.a)) {
                java.lang.String str = this.b;
                java.lang.String str2 = thaVar.b;
                if (str != null ? !(str2 == null || !aooh.n(str, str2)) : str2 == null) {
                    if (aooh.n(this.c, thaVar.c) && aooh.n(this.d, thaVar.d) && this.e == thaVar.e && this.f == thaVar.f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + anty.M(this.e)) * 31) + this.f;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.b;
        java.lang.String strA = str == null ? "null" : defpackage.tgx.a(str);
        return "SearchScreenUiModel(query=" + this.a + ", selectedKey=" + strA + ", sections=" + this.c + ", queryActions=" + this.d + ", searchStartTimestampMs=" + this.e + ", totalListSize=" + this.f + ')';
    }
}
