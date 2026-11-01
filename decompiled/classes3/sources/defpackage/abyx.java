package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class abyx implements defpackage.xuo {
    private final defpackage.abys b;
    private final int c;
    private final int d;
    private final defpackage.abyw e;
    private java.lang.String f;

    public abyx(defpackage.abys abysVar, int i, int i2, defpackage.abyw abywVar) {
        this.b = abysVar;
        this.c = i;
        this.d = i2;
        this.e = abywVar;
    }

    private final synchronized java.lang.String b() {
        java.lang.String path;
        path = this.f;
        if (path == null) {
            path = android.net.Uri.parse(this.e.a().b()).getPath();
            this.f = path;
        }
        return path;
    }

    @Override // defpackage.xuo
    public final void a(java.security.MessageDigest messageDigest) {
        com.google.android.libraries.glide.fife.FifeUrl fifeUrl = this.b.a;
        messageDigest.update(b().getBytes(a));
    }

    @Override // defpackage.xuo
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.abyx)) {
            return false;
        }
        defpackage.abyx abyxVar = (defpackage.abyx) obj;
        return this.b.equals(abyxVar.b) && this.c == abyxVar.c && this.d == abyxVar.d;
    }

    @Override // defpackage.xuo
    public final int hashCode() {
        char[] cArr = defpackage.ygc.a;
        return defpackage.ygc.c(this.b, ((this.d + 527) * 31) + this.c);
    }

    public final java.lang.String toString() {
        return "FifeUrlKey{fifeModel='" + java.lang.String.valueOf(this.b) + "', width='" + this.c + "', height='" + this.d + "'}";
    }
}
