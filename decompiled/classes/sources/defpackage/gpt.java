package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class gpt extends defpackage.gow {
    public static final defpackage.gok e = new defpackage.gok("ratio:1.4", 1.4f);
    public static final defpackage.gok f = defpackage.gok.a;
    public final int g;
    public final int h;
    public final int i;
    public final defpackage.gok j;
    public final defpackage.gok k;
    public final defpackage.gpl l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpt(defpackage.gok gokVar, defpackage.gok gokVar2, defpackage.gpl gplVar) {
        super("DialerTrampolineActivity");
        if (gokVar == null) {
            defpackage.aooh.i("maxAspectRatioInPortrait");
        }
        if (gokVar2 == null) {
            defpackage.aooh.i("maxAspectRatioInLandscape");
        }
        this.g = 600;
        this.h = 600;
        this.i = 600;
        this.j = gokVar;
        this.k = gokVar2;
        this.l = gplVar;
    }

    private static final int c(float f2) {
        return (int) ((f2 * 600.0f) + 0.5f);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    public final boolean b(android.content.Context context, android.view.WindowMetrics windowMetrics) {
        boolean z;
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(windowMetrics, "parentMetrics");
        if (android.os.Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        defpackage.aooh.f(windowMetrics, "windowMetrics");
        android.graphics.Rect rectM = baa$.ExternalSyntheticApiModelOutline1.m(windowMetrics);
        defpackage.aooh.e(rectM, "getBounds(...)");
        float fB = android.os.Build.VERSION.SDK_INT <= 33 ? context.getResources().getDisplayMetrics().density : fsu.B(windowMetrics, context);
        defpackage.aooh.f(rectM, "bounds");
        int iWidth = rectM.width();
        int iHeight = rectM.height();
        if (iWidth == 0 || iHeight == 0) {
            return false;
        }
        int iC = c(fB);
        int iC2 = c(fB);
        int iC3 = c(fB);
        boolean z2 = iWidth >= iC;
        boolean z3 = iHeight >= iC2;
        int iMin = java.lang.Math.min(iWidth, iHeight);
        if (iHeight >= iWidth) {
            defpackage.gok gokVar = this.j;
            if (defpackage.aooh.n(gokVar, defpackage.gok.a) || iHeight / iWidth <= gokVar.b) {
                z = true;
            } else {
                z = false;
            }
        } else {
            defpackage.gok gokVar2 = this.k;
            if (defpackage.aooh.n(gokVar2, defpackage.gok.a) || iWidth / iHeight <= gokVar2.b) {
                z = true;
            } else {
                z = false;
            }
        }
        return z2 && z3 && iMin >= iC3 && z;
    }

    @Override // defpackage.gow
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof defpackage.gpt) && super.equals(obj)) {
            defpackage.gpt gptVar = (defpackage.gpt) obj;
            int i = gptVar.g;
            int i2 = gptVar.h;
            int i3 = gptVar.i;
            if (defpackage.aooh.n(this.j, gptVar.j) && defpackage.aooh.n(this.k, gptVar.k) && defpackage.aooh.n(this.l, gptVar.l)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gow
    public int hashCode() {
        return (((((((((((super.hashCode() * 31) + 600) * 31) + 600) * 31) + 600) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode();
    }

    public java.lang.String toString() {
        return "gpt{ tag=" + a() + ", defaultSplitAttributes=" + this.l + ", minWidthDp=600, minHeightDp=600, minSmallestWidthDp=600, maxAspectRatioInPortrait=" + this.j + ", maxAspectRatioInLandscape=" + this.k + '}';
    }
}
