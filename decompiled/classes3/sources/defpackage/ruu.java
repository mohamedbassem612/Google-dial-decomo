package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ruu {
    public final android.graphics.drawable.Drawable a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final defpackage.rut d;

    public ruu(android.graphics.drawable.Drawable drawable, java.lang.String str, java.lang.String str2, defpackage.rut rutVar) {
        this.a = drawable;
        this.b = str;
        this.c = str2;
        this.d = rutVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ruu) {
            defpackage.ruu ruuVar = (defpackage.ruu) obj;
            if (aooh.n(this.a, ruuVar.a) && aooh.n(this.b, ruuVar.b) && aooh.n(this.c, ruuVar.c) && aooh.n(this.d, ruuVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        android.graphics.drawable.Drawable drawable = this.a;
        int iHashCode = ((((drawable == null ? 0 : drawable.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        defpackage.rut rutVar = this.d;
        return (iHashCode * 31) + (rutVar != null ? rutVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "BannerData(icon=" + this.a + ", title=" + this.b + ", summary=" + this.c + ", bannerActionButton=" + this.d + ')';
    }
}
