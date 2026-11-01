package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sgn {
    public final java.lang.String a;
    public final android.net.Uri b;
    public final java.lang.String c;
    public final aomy d;
    private final java.lang.Long e;

    public sgn(java.lang.Long l, java.lang.String str, android.net.Uri uri, java.lang.String str2, aomy aomyVar) {
        aooh.f(str, "name");
        this.e = l;
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.sgn) {
            defpackage.sgn sgnVar = (defpackage.sgn) obj;
            if (aooh.n(this.e, sgnVar.e) && aooh.n(this.a, sgnVar.a) && aooh.n(this.b, sgnVar.b) && aooh.n(this.c, sgnVar.c) && aooh.n(this.d, sgnVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Long l = this.e;
        int iHashCode = ((l == null ? 0 : l.hashCode()) * 31) + this.a.hashCode();
        android.net.Uri uri = this.b;
        int iHashCode2 = ((iHashCode * 31) + (uri == null ? 0 : uri.hashCode())) * 31;
        java.lang.String str = this.c;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "ContactWithPatrickUiData(rawContactId=" + this.e + ", name=" + this.a + ", photoUri=" + this.b + ", lookupKey=" + this.c + ", onClick=" + this.d + ')';
    }
}
