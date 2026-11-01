package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afoe {
    public final java.util.List a;
    public final boolean b;
    public final java.util.List c;
    public final int d;

    public afoe(java.util.List list, int i, boolean z, java.util.List list2) {
        aooh.f(list, "items");
        aooh.f(list2, "eventLogs");
        this.a = list;
        this.d = i;
        this.b = z;
        this.c = list2;
    }

    public final boolean a() {
        return this.a.isEmpty() && this.c.isEmpty() && this.d == 0 && !this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.afoe) {
            defpackage.afoe afoeVar = (defpackage.afoe) obj;
            if (aooh.n(this.a, afoeVar.a) && this.d == afoeVar.d && this.b == afoeVar.b && aooh.n(this.c, afoeVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.d;
        if (i == 0) {
            i = 0;
        }
        return ((((iHashCode + i) * 31) + anty.L(this.b)) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "PagedResource(items=" + this.a + ", errorState=" + ((java.lang.Object) aehj.v(this.d)) + ", hasAdditionalResults=" + this.b + ", eventLogs=" + this.c + ')';
    }
}
