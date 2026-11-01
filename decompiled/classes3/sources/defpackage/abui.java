package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abui implements defpackage.abuo {
    public final defpackage.abuf a;
    public final java.lang.Exception b;

    public abui(defpackage.abuf abufVar, java.lang.Exception exc) {
        this.a = abufVar;
        this.b = exc;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abui) {
            defpackage.abui abuiVar = (defpackage.abui) obj;
            if (this.a == abuiVar.a && aooh.n(this.b, abuiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.Exception exc = this.b;
        return iHashCode + (exc == null ? 0 : exc.hashCode());
    }

    public final java.lang.String toString() {
        return "Error(requestStatus=" + this.a + ", exception=" + this.b + ')';
    }
}
