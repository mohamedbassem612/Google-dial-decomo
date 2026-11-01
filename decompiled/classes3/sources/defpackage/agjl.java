package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agjl {
    public final float[] a;
    public final float b;
    public final float c;
    public final float[] d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final java.lang.String i;
    private final java.lang.Float j;
    private final java.lang.Float k;
    private final java.lang.Float l;
    private final java.lang.Float m;
    private final float n;

    static {
        defpackage.agly.e(10000.0f);
    }

    public /* synthetic */ agjl(float[] fArr, float f, float f2, float[] fArr2, boolean z, boolean z2, boolean z3, float f3, java.lang.String str, int i) {
        fArr = (i & 16) != 0 ? defpackage.agly.e(32.0f) : fArr;
        f = (i & 32) != 0 ? 0.5f : f;
        f2 = (i & 64) != 0 ? 0.5f : f2;
        fArr2 = (i & 128) != 0 ? defpackage.aglz.g() : fArr2;
        boolean z4 = (!((i & 512) == 0)) | z;
        boolean z5 = (!((i & 1024) == 0)) | z2;
        boolean z6 = (!((i & 2048) == 0)) | z3;
        f3 = (i & 4096) != 0 ? (defpackage.aglz.b(fArr2) + defpackage.aglz.f(fArr2)) / 4.0f : f3;
        str = (i & 8192) != 0 ? defpackage.agjr.a : str;
        aooh.f(fArr, "cornerRadii");
        aooh.f(fArr2, "margins");
        aooh.f(str, "shape");
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.a = fArr;
        this.b = f;
        this.c = f2;
        this.d = fArr2;
        this.n = 0.0f;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = f3;
        this.i = str;
        aooh.f(fArr, "cornerRadii");
        defpackage.agly.c(fArr);
        defpackage.agly.a(fArr);
        defpackage.agly.d(fArr);
        defpackage.agly.b(fArr);
        aooh.f(fArr, "cornerRadii");
        defpackage.agly.c(fArr);
        defpackage.agly.d(fArr);
        defpackage.agly.a(fArr);
        defpackage.agly.b(fArr);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agjl) {
            defpackage.agjl agjlVar = (defpackage.agjl) obj;
            java.lang.Float f = agjlVar.j;
            if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                java.lang.Float f2 = agjlVar.k;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                    java.lang.Float f3 = agjlVar.l;
                    if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                        java.lang.Float f4 = agjlVar.m;
                        if (aooh.n((java.lang.Object) null, (java.lang.Object) null) && aooh.n(this.a, agjlVar.a) && java.lang.Float.compare(this.b, agjlVar.b) == 0 && java.lang.Float.compare(this.c, agjlVar.c) == 0 && aooh.n(this.d, agjlVar.d)) {
                            float f5 = agjlVar.n;
                            if (this.e == agjlVar.e && this.f == agjlVar.f && this.g == agjlVar.g && java.lang.Float.compare(this.h, agjlVar.h) == 0) {
                                java.lang.String str = this.i;
                                java.lang.String str2 = agjlVar.i;
                                java.lang.String str3 = defpackage.agjr.a;
                                if (aooh.n(str, str2)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((java.util.Arrays.hashCode(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.util.Arrays.hashCode(this.d);
        float f = this.h;
        boolean z = this.g;
        int iL = (((((((iHashCode * 961) + anty.L(this.e)) * 31) + anty.L(this.f)) * 31) + anty.L(z)) * 31) + java.lang.Float.floatToIntBits(f);
        java.lang.String str = defpackage.agjr.a;
        return (iL * 31) + this.i.hashCode();
    }

    public final java.lang.String toString() {
        return "LayoutConfig(centerX=null, centerY=null, height=null, width=null, cornerRadii=" + ("CornerRadii(values=" + java.util.Arrays.toString(this.a) + ')') + ", anchorPercentX=" + this.b + ", anchorPercentY=" + this.c + ", margins=" + ("Margins(values=" + java.util.Arrays.toString(this.d) + ')') + ", padding=0.0, updateHeightForBounds=" + this.e + ", updateWidthForBounds=" + this.f + ", limitRadiiByBounds=" + this.g + ", spread=" + this.h + ", shape=" + defpackage.agjr.b(this.i) + ')';
    }

    public agjl() {
        this(null, 0.0f, 0.0f, null, false, false, false, 0.0f, null, 16383);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ agjl(byte[] bArr) {
        float[] fArrE = defpackage.agly.e(32.0f);
        float[] fArrG = defpackage.aglz.g();
        float f = 0.5f;
        this(fArrE, f, f, fArrG, true, true, true, (defpackage.aglz.b(fArrG) + defpackage.aglz.f(fArrG)) / 4.0f, defpackage.agjr.a, 3);
    }
}
