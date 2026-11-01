package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xur {
    public static final defpackage.xuq a = new defpackage.xup();
    public final java.lang.Object b;
    private final defpackage.xuq c;
    private final java.lang.String d;
    private volatile byte[] e;

    public xur(java.lang.String str, java.lang.Object obj, defpackage.xuq xuqVar) {
        defpackage.xfh.t(str);
        this.d = str;
        this.b = obj;
        this.c = xuqVar;
    }

    public final void a(java.lang.Object obj, java.security.MessageDigest messageDigest) {
        if (this.e == null) {
            this.e = this.d.getBytes(defpackage.xuo.a);
        }
        this.c.a(this.e, obj, messageDigest);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.xur) {
            return this.d.equals(((defpackage.xur) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "Option{key='" + this.d + "'}";
    }
}
