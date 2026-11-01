package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ssg {
    public static final defpackage.ssg a = new defpackage.ssg();
    public android.net.Uri b;
    public java.lang.String c;
    public java.lang.String d;
    public int e;
    public java.lang.String f;
    public java.lang.String g;
    public java.lang.String h;
    public java.lang.String i;
    public long j;
    public android.net.Uri k;
    public boolean l;
    public java.lang.String m;
    public long n;
    public int o;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.ssg ssgVar = (defpackage.ssg) obj;
            if (wsc.aR(this.b, ssgVar.b) && android.text.TextUtils.equals(this.c, ssgVar.c) && android.text.TextUtils.equals(this.d, ssgVar.d) && this.e == ssgVar.e && android.text.TextUtils.equals(this.f, ssgVar.f) && android.text.TextUtils.equals(this.g, ssgVar.g) && android.text.TextUtils.equals(this.h, ssgVar.h) && android.text.TextUtils.equals(this.i, ssgVar.i) && this.j == ssgVar.j && wsc.aR(this.k, ssgVar.k) && android.text.TextUtils.equals(this.m, ssgVar.m) && this.n == ssgVar.n && this.o == ssgVar.o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        android.net.Uri uri = this.b;
        int iHashCode = uri == null ? 0 : uri.hashCode();
        java.lang.String str = this.c;
        return ((iHashCode + 31) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ContactInfo{lookupUri=" + java.lang.String.valueOf(this.b) + ", name='" + this.c + "', nameAlternative='" + this.d + "', type=" + this.e + ", label='" + this.f + "', number='" + this.g + "', formattedNumber='" + this.h + "', normalizedNumber='" + this.i + "', photoId=" + this.j + ", photoUri=" + java.lang.String.valueOf(this.k) + ", objectId='" + this.m + "', userType=" + this.n + ", carrierPresence=" + this.o + ", geoDescription=null}";
    }
}
