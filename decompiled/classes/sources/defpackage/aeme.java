package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeme {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final defpackage.aemd f;
    public final defpackage.aemd g;
    public final java.lang.String h;
    private final boolean i;
    private final boolean j;
    private final java.lang.String k;
    private final int l;

    public aeme(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z2, defpackage.aemd aemdVar, defpackage.aemd aemdVar2, java.lang.String str6, java.lang.String str7, int i) {
        this.a = str;
        this.i = z;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.j = z2;
        this.f = aemdVar;
        this.g = aemdVar2;
        this.h = str6;
        this.k = str7;
        this.l = i;
    }

    public static defpackage.aemc a() {
        defpackage.aemc aemcVar = new defpackage.aemc();
        aemcVar.d(false);
        defpackage.aemd aemdVar = defpackage.aemd.a;
        aemcVar.c(aemdVar);
        aemcVar.e(true);
        aemcVar.e = aemdVar;
        aemcVar.h = 1;
        return aemcVar;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aeme) {
            defpackage.aeme aemeVar = (defpackage.aeme) obj;
            if (this.a.equals(aemeVar.a) && this.i == aemeVar.i && ((str = this.b) != null ? str.equals(aemeVar.b) : aemeVar.b == null) && ((str2 = this.c) != null ? str2.equals(aemeVar.c) : aemeVar.c == null) && ((str3 = this.d) != null ? str3.equals(aemeVar.d) : aemeVar.d == null) && ((str4 = this.e) != null ? str4.equals(aemeVar.e) : aemeVar.e == null) && this.j == aemeVar.j && this.f.equals(aemeVar.f) && this.g.equals(aemeVar.g) && ((str5 = this.h) != null ? str5.equals(aemeVar.h) : aemeVar.h == null) && ((str6 = this.k) != null ? str6.equals(aemeVar.k) : aemeVar.k == null)) {
                int i = this.l;
                int i2 = aemeVar.l;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        java.lang.String str = this.b;
        int iHashCode2 = ((((iHashCode * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        java.lang.String str2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        java.lang.String str3 = this.d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        java.lang.String str4 = this.e;
        int iHashCode5 = (((((((iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003) ^ (true == this.j ? 1231 : 1237)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        java.lang.String str5 = this.h;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        java.lang.String str6 = this.k;
        int iHashCode7 = str6 != null ? str6.hashCode() : 0;
        int i = this.l;
        defpackage.anty.aJ(i);
        return ((iHashCode6 ^ iHashCode7) * 1000003) ^ i;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.l;
        defpackage.aemd aemdVar = this.g;
        java.lang.String strValueOf = java.lang.String.valueOf(this.f);
        java.lang.String strValueOf2 = java.lang.String.valueOf(aemdVar);
        if (i == 1) {
            str = "UNKNOWN";
        } else if (i == 2) {
            str = "LESS_THAN_EIGHTEEN";
        } else if (i != 3) {
            str = i != 4 ? "null" : "TWENTY_ONE_OR_OLDER";
        } else {
            str = "EIGHTEEN_TO_TWENTY";
        }
        java.lang.String str2 = this.k;
        java.lang.String str3 = this.h;
        boolean z = this.j;
        java.lang.String str4 = this.e;
        java.lang.String str5 = this.d;
        java.lang.String str6 = this.c;
        java.lang.String str7 = this.b;
        boolean z2 = this.i;
        return "GoogleOwner{accountName=" + this.a + ", isMetadataAvailable=" + z2 + ", displayName=" + str7 + ", givenName=" + str6 + ", familyName=" + str5 + ", obfuscatedGaiaId=" + str4 + ", isG1User=" + z + ", isDasherUser=" + strValueOf + ", isUnicornUser=" + strValueOf2 + ", avatarUrl=" + str3 + ", defaultAvatarUrl=" + str2 + ", ageRange=" + str + '}';
    }

    public aeme() {
        throw null;
    }
}
