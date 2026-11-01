package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sfe {
    public final java.lang.String a;
    public final java.lang.Long b;
    public final android.net.Uri c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final defpackage.abxt g;
    private final java.lang.Long h;

    public sfe(java.lang.String str, java.lang.Long l, java.lang.Long l2, android.net.Uri uri, java.lang.String str2, java.lang.String str3, java.lang.String str4, defpackage.abxt abxtVar) {
        this.a = str;
        this.b = l;
        this.h = l2;
        this.c = uri;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = abxtVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.sfe) {
            defpackage.sfe sfeVar = (defpackage.sfe) obj;
            if (aooh.n(this.a, sfeVar.a) && aooh.n(this.b, sfeVar.b) && aooh.n(this.h, sfeVar.h) && aooh.n(this.c, sfeVar.c) && aooh.n(this.d, sfeVar.d) && aooh.n(this.e, sfeVar.e) && aooh.n(this.f, sfeVar.f) && aooh.n(this.g, sfeVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.Long l = this.b;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        int i = iHashCode * 31;
        java.lang.Long l2 = this.h;
        int iHashCode3 = (((i + iHashCode2) * 31) + (l2 == null ? 0 : l2.hashCode())) * 31;
        android.net.Uri uri = this.c;
        int iHashCode4 = (iHashCode3 + (uri == null ? 0 : uri.hashCode())) * 31;
        java.lang.String str2 = this.d;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.e;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        defpackage.abxt abxtVar = this.g;
        return iHashCode7 + (abxtVar != null ? abxtVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CallingCardSettingsContactData(displayName=" + this.a + ", rawContactId=" + this.b + ", patrickId=" + this.h + ", photoUri=" + this.c + ", lookupKey=" + this.d + ", gaiaAccountName=" + this.e + ", gaiaAccountType=" + this.f + ", patrickData=" + this.g + ')';
    }

    public sfe() {
        this(null, null, null, null, null, null, null, null);
    }
}
