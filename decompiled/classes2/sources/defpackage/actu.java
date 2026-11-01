package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class actu {
    public final android.net.Uri a;
    public final int b;
    public final int c;
    public final boolean d;
    private final int e;

    public actu(android.net.Uri uri, int i, int i2, boolean z, int i3) {
        aooh.f(uri, "uri");
        this.a = uri;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = i3;
        dzk.x(uri);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.actu) {
            defpackage.actu actuVar = (defpackage.actu) obj;
            if (aooh.n(this.a, actuVar.a) && this.b == actuVar.b && this.c == actuVar.c && this.d == actuVar.d && this.e == actuVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + anty.L(this.d)) * 31) + this.e;
    }

    public final java.lang.String toString() {
        return "FontInfo(uri=" + this.a + ", ttcIndex=" + this.b + ", weight=" + this.c + ", isItalic=" + this.d + ", resultCode=" + this.e + ')';
    }
}
