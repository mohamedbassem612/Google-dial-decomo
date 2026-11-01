package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahgl extends defpackage.amxr {
    private final defpackage.aw a;

    public ahgl(defpackage.aw awVar) {
        super(awVar);
        this.a = awVar;
    }

    public static final void b(defpackage.aw awVar, defpackage.albh albhVar) {
        defpackage.amxr.g(awVar);
        android.os.Bundle bundle = awVar.m;
        defpackage.ahvr.ci(albhVar);
        akmr.u(bundle, "TIKTOK_FRAGMENT_ARGUMENT", albhVar);
    }

    public static final void c(defpackage.aw awVar, java.lang.String str) {
        defpackage.amxr.g(awVar);
        android.os.Bundle bundle = awVar.m;
        defpackage.ahvr.ci(str);
        bundle.putString("TIKTOK_FRAGMENT_ARGUMENT", str);
    }

    @Override // defpackage.amxr
    protected final java.lang.Object a() {
        defpackage.ahoq ahoqVarY = defpackage.ahvr.Y(1388, this.a.getClass(), "TTFCM#Component");
        try {
            java.lang.Object objA = super.a();
            ahoqVarY.close();
            return objA;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarY.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.amxr
    protected final void d(defpackage.aw awVar) {
        defpackage.ahvr.cl(awVar.G(), "Fragment %s has no parent Activity -- Did you forget @ActivityAgnosticPeer?", awVar.getClass().getSimpleName());
        defpackage.ahvr.ce(awVar.G() instanceof defpackage.ahfx, "TikTok Fragment, %s cannot be attached to a non-TikTok Activity, %s", awVar.getClass().getSimpleName(), awVar.G().getClass().getSimpleName());
    }
}
