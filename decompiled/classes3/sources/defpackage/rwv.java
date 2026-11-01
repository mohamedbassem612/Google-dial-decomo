package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rwv {
    public final android.net.Uri a;
    public final java.lang.String b;
    public final int c;
    public final java.lang.String d;
    public final long e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final java.lang.Long h;
    public final java.lang.String i;

    public rwv(android.net.Uri uri, java.lang.String str, int i, java.lang.String str2, long j, java.lang.String str3, java.lang.String str4, java.lang.Long l, java.lang.String str5) {
        aooh.f(uri, "uri");
        aooh.f(str, "phoneNumber");
        this.a = uri;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = j;
        this.f = str3;
        this.g = str4;
        this.h = l;
        this.i = str5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.rwv) {
            defpackage.rwv rwvVar = (defpackage.rwv) obj;
            if (aooh.n(this.a, rwvVar.a) && aooh.n(this.b, rwvVar.b) && this.c == rwvVar.c && aooh.n(this.d, rwvVar.d) && this.e == rwvVar.e && aooh.n(this.f, rwvVar.f) && aooh.n(this.g, rwvVar.g) && aooh.n(this.h, rwvVar.h) && aooh.n(this.i, rwvVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        java.lang.String str = this.d;
        int iHashCode2 = ((((((iHashCode * 31) + this.c) * 31) + (str == null ? 0 : str.hashCode())) * 31) + anty.M(this.e)) * 31;
        java.lang.String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Long l = this.h;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        java.lang.String str4 = this.i;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "MissedCall(uri=" + this.a + ", phoneNumber=" + this.b + ", numberPresentation=" + this.c + ", countryIso=" + this.d + ", creationTimeMillis=" + this.e + ", accountComponentName=" + this.f + ", accountId=" + this.g + ", missedReason=" + this.h + ", cachedName=" + this.i + ')';
    }
}
