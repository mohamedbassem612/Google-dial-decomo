package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class snm {
    public final java.lang.String a;
    public final java.lang.String b;

    public snm(java.lang.String str, java.lang.String str2) {
        aooh.f(str, "phoneNumberInputFromUser");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.snm) {
            defpackage.snm snmVar = (defpackage.snm) obj;
            if (aooh.n(this.a, snmVar.a) && aooh.n(this.b, snmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "ContactEntry(phoneNumberInputFromUser=" + this.a + ", phoneNumberFormattedByContactApp=" + this.b + ')';
    }
}
