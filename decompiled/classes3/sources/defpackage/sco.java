package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class sco {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final hkd d;

    public sco(java.lang.String str, java.lang.String str2, java.lang.String str3, hkd hkdVar) {
        aooh.f(str, "originalNumber");
        aooh.f(hkdVar, "dialerPhoneNumber");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = hkdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.sco) {
            defpackage.sco scoVar = (defpackage.sco) obj;
            if (aooh.n(this.a, scoVar.a) && aooh.n(this.b, scoVar.b) && aooh.n(this.c, scoVar.c) && aooh.n(this.d, scoVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.c;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "PhoneNumberWrapper(originalNumber=" + this.a + ", countryCode=" + this.b + ", e164Number=" + this.c + ", dialerPhoneNumber=" + this.d + ')';
    }
}
