package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adzp implements defpackage.adzn {
    public static final aiof a = aiof.i("GnpSdk");
    private static final defpackage.yep b;
    private final defpackage.vqf c;

    static {
        defpackage.yeh yehVarQ = new defpackage.yep().q(defpackage.xwm.b);
        aooh.e(yehVarQ, "diskCacheStrategy(...)");
        b = (defpackage.yep) yehVarQ;
        ajsz.cW(new java.lang.String[]{"url", "redirect", "continue", "next", "dest", "return_url", "go", "out", "q", "uri", "goto", "target", "r", "u", "link"});
    }

    public adzp(aesg aesgVar, aesg aesgVar2, ajct ajctVar, defpackage.vqf vqfVar) {
        aooh.f(aesgVar, "authUtil");
        aooh.f(aesgVar2, "glideFuturesWrapper");
        aooh.f(ajctVar, "backgroundExecutor");
        aooh.f(vqfVar, "gnpMediaUtil");
        this.c = vqfVar;
    }

    private static final int c(int i) {
        if (i == -1) {
            return Integer.MIN_VALUE;
        }
        return i;
    }

    private static final defpackage.xzk d() {
        return new defpackage.xzi().a();
    }

    @Override // defpackage.adzn
    public final ajcq a(defpackage.vqf vqfVar, defpackage.aefu aefuVar) {
        defpackage.xzg xzgVar = new defpackage.xzg(this.c.D(aefuVar), d());
        defpackage.xsv xsvVarD = ((ahhp) vqfVar.a).b().d();
        aooh.e(xsvVarD, "downloadOnly(...)");
        defpackage.yeh yehVarR = ((defpackage.xsv) xsvVarD.f(xzgVar).z(c(aefuVar.b), c(aefuVar.c))).r();
        aooh.e(yehVarR, "dontTransform(...)");
        defpackage.xsv xsvVar = (defpackage.xsv) yehVarR;
        aooh.f(xsvVar, "requestBuilder");
        return defpackage.xff.H(xsvVar);
    }

    @Override // defpackage.adzn
    public final void b(defpackage.vqf vqfVar, android.widget.ImageView imageView, defpackage.aefu aefuVar) {
        aooh.f(imageView, "imageView");
        defpackage.xzg xzgVar = new defpackage.xzg(this.c.D(aefuVar), d());
        int i = aefuVar.c;
        int iC = c(aefuVar.b);
        int iC2 = c(i);
        try {
            imageView.setVisibility(0);
            defpackage.xsv xsvVarF = ((ahhp) vqfVar.a).b().f(xzgVar);
            aooh.e(xsvVarF, "load(...)");
            ((defpackage.xsv) ((defpackage.xsv) xsvVarF.i(b).d(new defpackage.adzo(imageView)).z(iC, iC2)).r()).m(imageView);
        } catch (java.lang.RuntimeException e) {
            imageView.setVisibility(8);
            hgb.b(a.c(), "Runtime exception during image load", e);
        }
    }
}
