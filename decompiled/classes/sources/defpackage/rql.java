package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rql {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/main/impl/ui/MainScreenVoiceSearchMenuProvider");
    public final defpackage.aw b;
    private final defpackage.rlv c;
    private final defpackage.ok d;

    public rql(defpackage.aw awVar, defpackage.rlv rlvVar) {
        if (awVar == null) {
            defpackage.aooh.i("fragment");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        this.b = awVar;
        this.c = rlvVar;
        this.d = awVar.O(new defpackage.pb(), new defpackage.rqk(this));
    }

    public final void a() {
        this.c.n(defpackage.rmw.MAIN_CLICK_SEARCH_BAR_VOICE_BUTTON);
        try {
            this.d.b(new android.content.Intent("android.speech.action.RECOGNIZE_SPEECH"));
        } catch (android.content.ActivityNotFoundException e) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).k(e).l("com/android/dialer/main/impl/ui/MainScreenVoiceSearchMenuProvider", "onItemSelected", 44, "MainScreenVoiceSearchMenuProvider.kt")).v("failed to launch voice transcription");
            android.view.View viewFindViewById = this.b.N().findViewById(2131428497);
            defpackage.aooh.e(viewFindViewById, "findViewById(...)");
            agby.o((androidx.coordinatorlayout.widget.CoordinatorLayout) viewFindViewById, 2132020823, -1).h();
        }
    }
}
