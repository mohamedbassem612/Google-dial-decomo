package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abjm {
    public final android.net.Uri a;
    public final java.lang.String b;
    public final defpackage.abjl c;

    public abjm(android.net.Uri uri, java.lang.String str, defpackage.abjl abjlVar) {
        aooh.f(uri, "uri");
        aooh.f(abjlVar, "transformation");
        this.a = uri;
        this.b = str;
        this.c = abjlVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abjm) {
            defpackage.abjm abjmVar = (defpackage.abjm) obj;
            if (aooh.n(this.a, abjmVar.a) && aooh.n(this.b, abjmVar.b) && aooh.n(this.c, abjmVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "ImageTransformUiData(uri=" + this.a + ", contentDescription=" + this.b + ", transformation=" + this.c + ')';
    }
}
