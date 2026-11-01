package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class skd implements defpackage.ske {
    public final android.net.Uri a;
    public final java.lang.String b;
    public final int c;
    public final int d;
    public final defpackage.sko e;
    public final java.lang.String f;
    public final java.lang.Float g;
    public final java.lang.Float h;
    public final java.lang.Float i;

    public skd(android.net.Uri uri, java.lang.String str, int i, int i2, defpackage.sko skoVar, java.lang.String str2, java.lang.Float f, java.lang.Float f2, java.lang.Float f3) {
        aooh.f(str2, "contactName");
        this.a = uri;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = skoVar;
        this.f = str2;
        this.g = f;
        this.h = f2;
        this.i = f3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.skd) {
            defpackage.skd skdVar = (defpackage.skd) obj;
            if (aooh.n(this.a, skdVar.a) && aooh.n(this.b, skdVar.b) && this.c == skdVar.c && this.d == skdVar.d && aooh.n(this.e, skdVar.e) && aooh.n(this.f, skdVar.f) && aooh.n(this.g, skdVar.g) && aooh.n(this.h, skdVar.h) && aooh.n(this.i, skdVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        android.net.Uri uri = this.a;
        int iHashCode = uri == null ? 0 : uri.hashCode();
        java.lang.String str = this.b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i = iHashCode * 31;
        int i2 = this.c;
        int i3 = this.d;
        defpackage.sko skoVar = this.e;
        return ((((((((((((((i + iHashCode2) * 31) + i2) * 31) + i3) * 31) + (skoVar != null ? skoVar.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final java.lang.String toString() {
        return "Succeeded(backgroundImageUri=" + this.a + ", photoToken=" + this.b + ", fontColorInt=" + this.c + ", selectedFontColorInt=" + this.d + ", fontStyle=" + this.e + ", contactName=" + this.f + ", imageScale=" + this.g + ", imageOffsetXAxis=" + this.h + ", imageOffsetYAxis=" + this.i + ')';
    }
}
