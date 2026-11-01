package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aekx {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final boolean d;
    private final java.lang.String e;

    public aekx(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null accountIdentifier");
        }
        this.e = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null accountName");
        }
        this.a = str2;
        this.b = str3;
        this.c = str4;
        this.d = z;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aekx) {
            defpackage.aekx aekxVar = (defpackage.aekx) obj;
            if (this.e.equals(aekxVar.e) && this.a.equals(aekxVar.a) && ((str = this.b) != null ? str.equals(aekxVar.b) : aekxVar.b == null) && ((str2 = this.c) != null ? str2.equals(aekxVar.c) : aekxVar.c == null) && this.d == aekxVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.e.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
        java.lang.String str = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        java.lang.String str2 = this.c;
        return ((((iHashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ 1231;
    }

    public final java.lang.String toString() {
        return "OneGoogleAvatarImageLoaderKey{accountIdentifier=" + this.e + ", accountName=" + this.a + ", displayName=" + this.b + ", avatarUrl=" + this.c + ", isGaiaAccount=" + this.d + ", isMetadataAvailable=true}";
    }

    public aekx() {
        throw null;
    }
}
