package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rpk implements defpackage.rns {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/main/impl/service/MainFragmentIntentListener");
    private static final java.util.concurrent.TimeUnit b = java.util.concurrent.TimeUnit.SECONDS;
    private final defpackage.rpj c;
    private final defpackage.agsm d;
    private final defpackage.rlv e;
    private final defpackage.gpd f;

    public rpk(defpackage.rpj rpjVar, defpackage.agsm agsmVar, defpackage.gpd gpdVar, defpackage.rlv rlvVar) {
        if (rpjVar == null) {
            defpackage.aooh.i("mainFragmentDataService");
        }
        if (agsmVar == null) {
            defpackage.aooh.i("androidFutures");
        }
        if (gpdVar == null) {
            defpackage.aooh.i("cuiSemanticLoggerFactory");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        this.c = rpjVar;
        this.d = agsmVar;
        this.f = gpdVar;
        this.e = rlvVar;
    }

    @Override // defpackage.rns
    public final void a(android.content.Intent intent) {
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/main/impl/service/MainFragmentIntentListener", "handleIntent", 33, "MainFragmentIntentListener.kt")).v("enter");
        if (intent != null) {
            if (defpackage.ttj.S(intent)) {
                if (!intent.getBooleanExtra("extra_from_call_options_fallback", false)) {
                    this.e.o(defpackage.rmx.ACTION_DIAL_RECEIVED);
                }
                this.e.n(defpackage.rmw.MAIN_OPEN_WITH_DIALPAD);
                this.d.g(this.c.b(defpackage.roc.DIALPAD_KEY), 5L, b);
                return;
            }
            if (defpackage.ttj.T(intent)) {
                int intExtra = intent.getIntExtra("EXTRA_SHOW_TAB", -1);
                if (intExtra == 1) {
                    this.d.g(this.c.b(defpackage.roc.CALL_LOG_TAB_KEY), 5L, b);
                } else if (intExtra != 4) {
                    ((defpackage.aimw) aimzVar.d().l("com/android/dialer/main/impl/service/MainFragmentIntentListener", "handleIntent", 72, "MainFragmentIntentListener.kt")).w("tab index is neither call log nor visual voicemail: %d", intExtra);
                } else {
                    this.f.i(null).b(defpackage.mce.USER_CLICKED_VOICEMAIL_NOTIFICATION);
                    this.d.g(this.c.b(defpackage.roc.VISUAL_VOICEMAIL_TAB_KEY), 5L, b);
                }
            }
        }
    }
}
