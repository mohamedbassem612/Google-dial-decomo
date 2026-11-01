package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hst {
    public final java.lang.String a;
    public final java.lang.String b;
    public final android.net.Uri c;
    public final boolean d;
    public final android.graphics.Bitmap e;
    public final defpackage.hts f;

    public hst(java.lang.String str, java.lang.String str2, android.net.Uri uri, boolean z, android.graphics.Bitmap bitmap, defpackage.hts htsVar) {
        aooh.f(str, "name");
        this.a = str;
        this.b = str2;
        this.c = uri;
        this.d = z;
        this.e = bitmap;
        this.f = htsVar;
    }

    public static /* synthetic */ defpackage.hst a(defpackage.hst hstVar, android.graphics.Bitmap bitmap, defpackage.hts htsVar, int i) {
        java.lang.String str = (i & 1) != 0 ? hstVar.a : null;
        java.lang.String str2 = (i & 2) != 0 ? hstVar.b : null;
        android.net.Uri uri = (i & 4) != 0 ? hstVar.c : null;
        boolean z = (i & 8) != 0 ? hstVar.d : false;
        if ((i & 16) != 0) {
            bitmap = hstVar.e;
        }
        android.graphics.Bitmap bitmap2 = bitmap;
        if ((i & 32) != 0) {
            htsVar = hstVar.f;
        }
        aooh.f(str, "name");
        return new defpackage.hst(str, str2, uri, z, bitmap2, htsVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hst) {
            defpackage.hst hstVar = (defpackage.hst) obj;
            if (aooh.n(this.a, hstVar.a) && aooh.n(this.b, hstVar.b) && aooh.n(this.c, hstVar.c) && this.d == hstVar.d && aooh.n(this.e, hstVar.e) && aooh.n(this.f, hstVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        android.net.Uri uri = this.c;
        int iHashCode3 = (((iHashCode2 + (uri == null ? 0 : uri.hashCode())) * 31) + anty.L(this.d)) * 31;
        android.graphics.Bitmap bitmap = this.e;
        return ((iHashCode3 + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + (this.f != null ? 1 : 0);
    }

    public final java.lang.String toString() {
        return "PhoneLookupContact(name=" + this.a + ", formattedNumber=" + this.b + ", lookupUri=" + this.c + ", isWorkProfile=" + this.d + ", photoIcon=" + this.e + ", customization=" + this.f + ')';
    }
}
