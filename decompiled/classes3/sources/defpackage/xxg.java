package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xxg implements defpackage.xuo {
    private static final defpackage.yfy b = new defpackage.yfy(50);
    private final defpackage.xuo c;
    private final defpackage.xuo d;
    private final int e;
    private final int f;
    private final java.lang.Class g;
    private final defpackage.xus h;
    private final defpackage.xuw i;
    private final defpackage.xxt j;

    public xxg(defpackage.xxt xxtVar, defpackage.xuo xuoVar, defpackage.xuo xuoVar2, int i, int i2, defpackage.xuw xuwVar, java.lang.Class cls, defpackage.xus xusVar) {
        this.j = xxtVar;
        this.c = xuoVar;
        this.d = xuoVar2;
        this.e = i;
        this.f = i2;
        this.i = xuwVar;
        this.g = cls;
        this.h = xusVar;
    }

    @Override // defpackage.xuo
    public final void a(java.security.MessageDigest messageDigest) {
        defpackage.xxt xxtVar = this.j;
        byte[] bArr = (byte[]) xxtVar.e(byte[].class);
        java.nio.ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(bArr);
        defpackage.xuw xuwVar = this.i;
        if (xuwVar != null) {
            xuwVar.a(messageDigest);
        }
        this.h.a(messageDigest);
        java.lang.Class cls = this.g;
        defpackage.yfy yfyVar = b;
        byte[] bytes = (byte[]) yfyVar.f(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(a);
            yfyVar.g(cls, bytes);
        }
        messageDigest.update(bytes);
        xxtVar.c(bArr);
    }

    @Override // defpackage.xuo
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.xxg)) {
            return false;
        }
        defpackage.xxg xxgVar = (defpackage.xxg) obj;
        if (this.f != xxgVar.f || this.e != xxgVar.e) {
            return false;
        }
        defpackage.xuw xuwVar = this.i;
        defpackage.xuw xuwVar2 = xxgVar.i;
        char[] cArr = defpackage.ygc.a;
        return a.L(xuwVar, xuwVar2) && this.g.equals(xxgVar.g) && this.c.equals(xxgVar.c) && this.d.equals(xxgVar.d) && this.h.equals(xxgVar.h);
    }

    @Override // defpackage.xuo
    public final int hashCode() {
        int iHashCode = (this.c.hashCode() * 31) + this.d.hashCode();
        defpackage.xuw xuwVar = this.i;
        int iHashCode2 = (((iHashCode * 31) + this.e) * 31) + this.f;
        if (xuwVar != null) {
            iHashCode2 = (iHashCode2 * 31) + xuwVar.hashCode();
        }
        return (((iHashCode2 * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.xus xusVar = this.h;
        defpackage.xuw xuwVar = this.i;
        java.lang.Class cls = this.g;
        defpackage.xuo xuoVar = this.d;
        return "ResourceCacheKey{sourceKey=" + java.lang.String.valueOf(this.c) + ", signature=" + java.lang.String.valueOf(xuoVar) + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + java.lang.String.valueOf(cls) + ", transformation='" + java.lang.String.valueOf(xuwVar) + "', options=" + java.lang.String.valueOf(xusVar) + '}';
    }
}
