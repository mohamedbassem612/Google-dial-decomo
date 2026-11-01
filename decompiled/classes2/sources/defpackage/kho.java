package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kho {
    public final long a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final defpackage.khq h;
    public final java.lang.String i;
    private final int j;

    public kho(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.String str6, defpackage.khq khqVar) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.j = i;
        this.g = str6;
        this.h = khqVar;
        this.i = str4 != null ? aoov.U(str4, str4) : null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kho) {
            defpackage.kho khoVar = (defpackage.kho) obj;
            if (this.a == khoVar.a && aooh.n(this.b, khoVar.b) && aooh.n(this.c, khoVar.c) && aooh.n(this.d, khoVar.d) && aooh.n(this.e, khoVar.e) && aooh.n(this.f, khoVar.f) && this.j == khoVar.j && aooh.n(this.g, khoVar.g) && aooh.n(this.h, khoVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = (anty.M(this.a) * 31) + this.b.hashCode();
        java.lang.String str = this.c;
        int iHashCode = ((iM * 31) + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.j) * 31;
        java.lang.String str5 = this.g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        defpackage.khq khqVar = this.h;
        return iHashCode5 + (khqVar != null ? khqVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "HaloCallLogEntry(id=" + this.a + ", uuid=" + this.b + ", formattedNumber=" + this.c + ", cachedName=" + this.d + ", phoneAccountComponentName=" + this.e + ", rawNumber=" + this.f + ", features=" + this.j + ", alternativeUuid=" + this.g + ", voipContactInfo=" + this.h + ')';
    }
}
