package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abpo {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.CharSequence d;
    public final java.lang.CharSequence e;

    public abpo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        aooh.f(str, "primaryText");
        aooh.f(str2, "secondaryText");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = charSequence;
        this.e = charSequence2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abpo) {
            defpackage.abpo abpoVar = (defpackage.abpo) obj;
            if (aooh.n(this.a, abpoVar.a) && aooh.n(this.b, abpoVar.b) && aooh.n(this.c, abpoVar.c) && aooh.n(this.d, abpoVar.d) && aooh.n(this.e, abpoVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        java.lang.String str = this.c;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.CharSequence charSequence = this.d;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        java.lang.CharSequence charSequence2 = this.e;
        return iHashCode3 + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "DialpadKeyData(primaryText=" + this.a + ", secondaryText=" + this.b + ", secondaryTextAlt=" + this.c + ", contentDescription=" + ((java.lang.Object) this.d) + ", longPressContentDescription=" + ((java.lang.Object) this.e) + ')';
    }
}
