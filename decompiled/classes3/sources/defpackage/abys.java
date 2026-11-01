package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abys {
    public final com.google.android.libraries.glide.fife.FifeUrl a;
    public final defpackage.abyy b;
    public final defpackage.abyr c;
    private final defpackage.abza d = null;

    public abys(java.lang.String str, defpackage.abyy abyyVar, defpackage.abyr abyrVar) {
        this.a = new com.google.android.libraries.glide.fife.ProvidedFifeUrl(str);
        this.b = abyyVar;
        this.c = abyrVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.abys)) {
            return false;
        }
        defpackage.abys abysVar = (defpackage.abys) obj;
        if (!this.a.equals(abysVar.a) || !j$.util.Objects.equals(this.b, abysVar.b)) {
            return false;
        }
        defpackage.abza abzaVar = abysVar.d;
        return j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && this.c.equals(abysVar.c);
    }

    public final int hashCode() {
        return defpackage.ygc.c(this.a, defpackage.ygc.c(this.b, this.c.hashCode()));
    }

    public final java.lang.String toString() {
        defpackage.abyr abyrVar = this.c;
        defpackage.abyy abyyVar = this.b;
        return "FifeModel{fifeUrl='" + this.a.toString() + "', fifeUrlOptions='" + abyyVar.toString() + "', newFifeUrlOptions='null', accountInfo='" + abyrVar.toString() + "'}";
    }
}
