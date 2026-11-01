package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hss {
    public final java.lang.CharSequence a;
    public final java.lang.CharSequence b;
    public final java.lang.CharSequence c;
    public final long d;
    public final android.graphics.Bitmap e;
    public final android.net.Uri f;
    public final android.net.Uri g;
    public final java.util.List h;

    public hss(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, long j, android.graphics.Bitmap bitmap, android.net.Uri uri, android.net.Uri uri2, java.util.List list) {
        aooh.f(charSequence, "title");
        aooh.f(charSequence2, "publicTitle");
        aooh.f(charSequence3, "expandedText");
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = j;
        this.e = bitmap;
        this.f = uri;
        this.g = uri2;
        this.h = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hss) {
            defpackage.hss hssVar = (defpackage.hss) obj;
            if (aooh.n(this.a, hssVar.a) && aooh.n(this.b, hssVar.b) && aooh.n(this.c, hssVar.c) && this.d == hssVar.d && aooh.n(this.e, hssVar.e) && aooh.n(this.f, hssVar.f) && aooh.n(this.g, hssVar.g) && aooh.n(this.h, hssVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        android.graphics.Bitmap bitmap = this.e;
        int iM = ((((iHashCode * 31) + anty.M(this.d)) * 31) + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        android.net.Uri uri = this.f;
        int iHashCode2 = (iM + (uri == null ? 0 : uri.hashCode())) * 31;
        android.net.Uri uri2 = this.g;
        return ((iHashCode2 + (uri2 != null ? uri2.hashCode() : 0)) * 31) + 1;
    }

    public final java.lang.String toString() {
        return "NotificationModel(title=" + ((java.lang.Object) this.a) + ", publicTitle=" + ((java.lang.Object) this.b) + ", expandedText=" + ((java.lang.Object) this.c) + ", creationTimeMillis=" + this.d + ", photoIcon=" + this.e + ", callUri=" + this.f + ", personUri=" + this.g + ", customActions=" + this.h + ')';
    }

    public /* synthetic */ hss(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, long j, android.graphics.Bitmap bitmap, android.net.Uri uri, android.net.Uri uri2, int i) {
        this(charSequence, charSequence2, charSequence3, j, (i & 16) != 0 ? null : bitmap, (i & 32) != 0 ? null : uri, (i & 64) != 0 ? null : uri2, (java.util.List) aokc.a);
    }
}
