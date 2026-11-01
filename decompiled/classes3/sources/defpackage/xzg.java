package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xzg implements defpackage.xuo {
    public java.net.URL b;
    private final defpackage.xzh c;
    private final java.net.URL d;
    private final java.lang.String e;
    private java.lang.String f;
    private volatile byte[] g;
    private int h;

    public xzg(java.net.URL url) {
        defpackage.xzh xzhVar = defpackage.xzh.a;
        anty.aI(url, "Argument must not be null");
        this.d = url;
        this.e = null;
        anty.aI(xzhVar, "Argument must not be null");
        this.c = xzhVar;
    }

    @Override // defpackage.xuo
    public final void a(java.security.MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = b().getBytes(a);
        }
        messageDigest.update(this.g);
    }

    public final java.lang.String b() {
        java.lang.String str = this.e;
        if (str != null) {
            return str;
        }
        java.net.URL url = this.d;
        anty.aI(url, "Argument must not be null");
        return url.toString();
    }

    public final java.lang.String c() {
        if (android.text.TextUtils.isEmpty(this.f)) {
            java.lang.String string = this.e;
            if (android.text.TextUtils.isEmpty(string)) {
                java.net.URL url = this.d;
                anty.aI(url, "Argument must not be null");
                string = url.toString();
            }
            this.f = android.net.Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
        }
        return this.f;
    }

    public final java.util.Map d() {
        return this.c.a();
    }

    @Override // defpackage.xuo
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.xzg)) {
            return false;
        }
        defpackage.xzg xzgVar = (defpackage.xzg) obj;
        return b().equals(xzgVar.b()) && this.c.equals(xzgVar.c);
    }

    @Override // defpackage.xuo
    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int iHashCode = b().hashCode();
        this.h = iHashCode;
        int iHashCode2 = (iHashCode * 31) + this.c.hashCode();
        this.h = iHashCode2;
        return iHashCode2;
    }

    public final java.lang.String toString() {
        return b();
    }

    public xzg(java.lang.String str, defpackage.xzh xzhVar) {
        this.d = null;
        defpackage.xfh.t(str);
        this.e = str;
        anty.aI(xzhVar, "Argument must not be null");
        this.c = xzhVar;
    }
}
