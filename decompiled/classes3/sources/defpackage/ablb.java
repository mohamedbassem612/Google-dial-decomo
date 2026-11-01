package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ablb {
    public final abja a;
    public final boolean b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.util.List e;
    public final defpackage.ablc f;
    public final defpackage.abld g;
    public final boolean h;
    public final int i;
    private final java.lang.String j;
    private final defpackage.abdy k;
    private final aomy l;
    private final boolean m;
    private final java.lang.String n;

    public ablb(abja abjaVar, boolean z, java.lang.String str, java.lang.String str2, java.util.List list, defpackage.ablc ablcVar, defpackage.abld abldVar, boolean z2, int i) {
        aooh.f(str, "cardTitle");
        aooh.f(str2, "cardDescription");
        this.a = abjaVar;
        this.b = z;
        this.j = null;
        this.c = str;
        this.d = str2;
        this.e = list;
        this.f = ablcVar;
        this.g = abldVar;
        this.k = null;
        this.l = null;
        this.m = false;
        this.n = null;
        this.h = z2;
        this.i = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ablb) {
            defpackage.ablb ablbVar = (defpackage.ablb) obj;
            if (this.a == ablbVar.a && this.b == ablbVar.b) {
                java.lang.String str = ablbVar.j;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null) && aooh.n(this.c, ablbVar.c) && aooh.n(this.d, ablbVar.d) && aooh.n(this.e, ablbVar.e) && aooh.n(this.f, ablbVar.f) && aooh.n(this.g, ablbVar.g)) {
                    defpackage.abdy abdyVar = ablbVar.k;
                    if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                        aomy aomyVar = ablbVar.l;
                        if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                            boolean z = ablbVar.m;
                            java.lang.String str2 = ablbVar.n;
                            if (aooh.n((java.lang.Object) null, (java.lang.Object) null) && this.h == ablbVar.h && this.i == ablbVar.i) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((this.a.hashCode() * 31) + anty.L(this.b)) * 961) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + 1) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 29791) + anty.L(false)) * 961) + anty.L(this.h)) * 31) + this.i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AlertCardUiData(featureIcon=");
        sb.append(this.a);
        sb.append(", featureIconShowCircleBackground=");
        sb.append(this.b);
        sb.append(", featureTitle=null, cardTitle=");
        sb.append(this.c);
        sb.append(", cardDescription=");
        sb.append(this.d);
        sb.append(", cardDescriptionAnnotations=");
        sb.append(this.e);
        sb.append(", primaryButton=");
        sb.append(this.f);
        sb.append(", secondaryButton=");
        sb.append(this.g);
        sb.append(", initialCompositionElement=null, onCloseClick=null, hasLiveRegion=false, contentDescription=null, transparentBackground=");
        sb.append(this.h);
        sb.append(", style=");
        sb.append((java.lang.Object) (this.i != 2 ? "SEMANTIC_RED_ERROR_WITH_ICON_GRADIENT" : "SEMANTIC_RED_ERROR"));
        sb.append(')');
        return sb.toString();
    }
}
