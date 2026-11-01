package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abuk implements defpackage.abuo {
    public final defpackage.abuf a;
    public final java.lang.Exception b;
    private final defpackage.abuw c;

    public abuk(defpackage.abuw abuwVar, defpackage.abuf abufVar, java.lang.Exception exc) {
        aooh.f(abuwVar, "identifier");
        this.c = abuwVar;
        this.a = abufVar;
        this.b = exc;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abuk) {
            defpackage.abuk abukVar = (defpackage.abuk) obj;
            if (aooh.n(this.c, abukVar.c) && this.a == abukVar.a && aooh.n(this.b, abukVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() * 31) + this.a.hashCode();
        java.lang.Exception exc = this.b;
        return (iHashCode * 31) + (exc == null ? 0 : exc.hashCode());
    }

    public final java.lang.String toString() {
        return "ItemError(identifier=" + this.c + ", requestStatus=" + this.a + ", exception=" + this.b + ')';
    }
}
