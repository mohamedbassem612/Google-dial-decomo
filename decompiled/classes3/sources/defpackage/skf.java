package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class skf {
    public final int a;
    public final defpackage.ske b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final java.lang.String k;
    public final boolean l;
    public final boolean m;
    public final defpackage.abix n;

    public skf(int i, defpackage.abix abixVar, defpackage.ske skeVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, java.lang.String str, boolean z9, boolean z10) {
        this.a = i;
        this.n = abixVar;
        this.b = skeVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = str;
        this.l = z9;
        this.m = z10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.skf) {
            defpackage.skf skfVar = (defpackage.skf) obj;
            if (this.a == skfVar.a && aooh.n(this.n, skfVar.n) && aooh.n(this.b, skfVar.b) && this.c == skfVar.c && this.d == skfVar.d && this.e == skfVar.e && this.f == skfVar.f && this.g == skfVar.g && this.h == skfVar.h && this.i == skfVar.i && this.j == skfVar.j && aooh.n(this.k, skfVar.k) && this.l == skfVar.l && this.m == skfVar.m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.abix abixVar = this.n;
        int iHashCode = (((this.a * 31) + (abixVar == null ? 0 : abixVar.hashCode())) * 31) + this.b.hashCode();
        boolean z = this.c;
        boolean z2 = this.d;
        boolean z3 = this.e;
        boolean z4 = this.f;
        boolean z5 = this.g;
        boolean z6 = this.h;
        boolean z7 = this.i;
        boolean z8 = this.j;
        java.lang.String str = this.k;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        int iL = anty.L(z);
        int iL2 = anty.L(z2);
        int i = ((iHashCode * 31) + iL) * 31;
        int iL3 = anty.L(z3);
        int i2 = (i + iL2) * 31;
        int iL4 = anty.L(z4);
        int i3 = (i2 + iL3) * 31;
        int iL5 = anty.L(z5);
        int i4 = (i3 + iL4) * 31;
        int i5 = (i4 + iL5) * 31;
        return ((((((((((i5 + anty.L(z6)) * 31) + anty.L(z7)) * 31) + anty.L(z8)) * 31) + iHashCode2) * 31) + anty.L(this.l)) * 31) + anty.L(this.m);
    }

    public final java.lang.String toString() {
        return "OnboardingFlowUiData(selectedMenuIndex=" + this.a + ", dialogUiData=" + this.n + ", state=" + this.b + ", shouldShowResizablePreview=" + this.c + ", shouldShowGooglePhotosButton=" + this.d + ", showCustomTypographyMenu=" + this.e + ", isCustomTypographySelected=" + this.f + ", shouldShowSmartColor=" + this.g + ", enableBackNavigationFix=" + this.h + ", enableOnboardingNavigationRefactor=" + this.i + ", isMyCallingCard=" + this.j + ", remixButtonLabel=" + this.k + ", enableOnboardingImageCrossfade=" + this.l + ", enableDefaultCallingCardV1=" + this.m + ')';
    }
}
