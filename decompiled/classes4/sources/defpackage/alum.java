package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class alum {
    public final defpackage.alsy a;
    public final defpackage.alxx b;
    public final java.lang.String c;
    public final defpackage.alsz d;

    public alum(defpackage.alsy alsyVar, defpackage.alxx alxxVar, java.lang.String str, defpackage.alsz alszVar) {
        this.a = alsyVar;
        this.b = alxxVar;
        this.c = str;
        this.d = alszVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.alum) {
            defpackage.alum alumVar = (defpackage.alum) obj;
            if (this.a == alumVar.a && this.b == alumVar.b && aooh.n(this.c, alumVar.c) && this.d == alumVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        java.lang.String str = this.c;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "ScoobyOverrideResult(callAction=" + this.a + ", finalDecision=" + this.b + ", overrideIntentName=" + this.c + ", triggeringEntity=" + this.d + ')';
    }
}
