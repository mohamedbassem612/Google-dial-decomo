package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abps {
    public final int a;
    public final boolean b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final boolean e;
    public final java.lang.String f;
    public final defpackage.abpr g;
    public final defpackage.abpr h;
    private final java.lang.String i;

    public abps(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, defpackage.abpr abprVar, defpackage.abpr abprVar2) {
        aooh.f(str, "title");
        aooh.f(str2, "description");
        aooh.f(abprVar, "positiveAction");
        aooh.f(abprVar2, "dismissAction");
        this.a = 2131231514;
        this.b = true;
        this.c = str;
        this.d = str2;
        this.i = null;
        this.e = true;
        this.f = str3;
        this.g = abprVar;
        this.h = abprVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abps) {
            defpackage.abps abpsVar = (defpackage.abps) obj;
            int i = abpsVar.a;
            boolean z = abpsVar.b;
            if (aooh.n(this.c, abpsVar.c) && aooh.n(this.d, abpsVar.d)) {
                java.lang.String str = abpsVar.i;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                    boolean z2 = abpsVar.e;
                    if (aooh.n(this.f, abpsVar.f) && aooh.n(this.g, abpsVar.g) && aooh.n(this.h, abpsVar.h)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iL = ((((anty.L(true) + 1643667494) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        java.lang.String str = this.f;
        return (((((((iL * 961) + anty.L(true)) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final java.lang.String toString() {
        return "PromoData(iconRes=2131231514, tintIcon=true, title=" + this.c + ", description=" + this.d + ", previewLabel=null, showCloseIcon=true, closeContentDescription=" + this.f + ", positiveAction=" + this.g + ", dismissAction=" + this.h + ')';
    }
}
