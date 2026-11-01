package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aehr {
    public final java.lang.Object a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final java.lang.String d;
    private final java.lang.String e;
    private final java.lang.String f;
    private final defpackage.aeho g;

    public aehr(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, defpackage.aeho aehoVar) {
        this.a = obj;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = aehoVar;
    }

    public static defpackage.aehr a(java.lang.Object obj, defpackage.aehm aehmVar) {
        if (obj == null) {
            return null;
        }
        java.lang.String strC = aehmVar.c(obj);
        java.lang.String strE = aehmVar.e(obj);
        java.lang.String strF = aehmVar.f(obj);
        agoq agoqVar = ((defpackage.agon) obj).b;
        return new defpackage.aehr(obj, strC, strE, strF, (agoqVar.b & 8) != 0 ? agoqVar.f : null, aehmVar.d(obj), aehmVar.a(obj));
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aehr) {
            defpackage.aehr aehrVar = (defpackage.aehr) obj;
            if (this.a.equals(aehrVar.a) && ((str = this.b) != null ? str.equals(aehrVar.b) : aehrVar.b == null) && ((str2 = this.c) != null ? str2.equals(aehrVar.c) : aehrVar.c == null) && ((str3 = this.d) != null ? str3.equals(aehrVar.d) : aehrVar.d == null) && ((str4 = this.e) != null ? str4.equals(aehrVar.e) : aehrVar.e == null) && ((str5 = this.f) != null ? str5.equals(aehrVar.f) : aehrVar.f == null)) {
                defpackage.aeho aehoVar = this.g;
                if (aehoVar == null) {
                    if (aehrVar.g == null) {
                        return true;
                    }
                } else if (aehoVar.equals(aehrVar.g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        java.lang.String str = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        java.lang.String str2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        java.lang.String str3 = this.d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        java.lang.String str4 = this.e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        java.lang.String str5 = this.f;
        int iHashCode6 = (((iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003) ^ 1231) * 1000003;
        defpackage.aeho aehoVar = this.g;
        return iHashCode6 ^ (aehoVar != null ? aehoVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        defpackage.aeho aehoVar = this.g;
        return "AccountSnapshot{account=" + this.a.toString() + ", accountName=" + this.b + ", displayName=" + this.c + ", givenName=" + this.d + ", familyName=" + this.e + ", avatarUrl=" + this.f + ", isMetadataAvailable=true, gaiaAccountData=" + java.lang.String.valueOf(aehoVar) + '}';
    }

    public aehr() {
        throw null;
    }
}
