package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class oud {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/incall/activity/uiminimizer/impl/InCallActivityMinimizerImpl");
    public final defpackage.agsm b;
    public android.app.Activity c;
    public final java.util.concurrent.Executor d;
    public final defpackage.tkl e;
    public final defpackage.gpd f;
    private final defpackage.ajct g;

    public oud(defpackage.ajct ajctVar, defpackage.agsm agsmVar, defpackage.gpd gpdVar, defpackage.tkl tklVar) {
        defpackage.aooh.f(ajctVar, "lightweightExecutor");
        defpackage.aooh.f(agsmVar, "androidFutures");
        defpackage.aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        defpackage.aooh.f(tklVar, "inCallUiVisibilityProviderImpl");
        this.g = ajctVar;
        this.b = agsmVar;
        this.f = gpdVar;
        this.e = tklVar;
        this.d = new defpackage.ajdc(ajctVar);
    }

    public final defpackage.ajcq a() {
        return defpackage.ahvr.F(new omj(this, 10), this.d);
    }
}
