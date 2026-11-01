package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hur {
    public final java.lang.CharSequence a;
    public final java.lang.CharSequence b;

    public hur(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        this.a = charSequence;
        if (charSequence2 == null) {
            throw new java.lang.NullPointerException("Null countryCode");
        }
        this.b = charSequence2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.hur) {
            defpackage.hur hurVar = (defpackage.hur) obj;
            if (this.a.equals(hurVar.a) && this.b.equals(hurVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "DisplayNameAndCountryCodeTuple{countryDisplayname=" + ((java.lang.String) this.a) + ", countryCode=" + this.b.toString() + '}';
    }

    public hur() {
        throw null;
    }
}
