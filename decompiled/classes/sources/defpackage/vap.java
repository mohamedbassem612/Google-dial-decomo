package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vap implements defpackage.rns {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/notification/impl/VoicemailNotificationIntentListener");
    private final defpackage.agsm b;
    private final defpackage.vtv c;

    public vap(defpackage.agsm agsmVar, defpackage.vtv vtvVar) {
        if (agsmVar == null) {
            defpackage.aooh.i("androidFutures");
        }
        this.b = agsmVar;
        this.c = vtvVar;
    }

    @Override // defpackage.rns
    public final void a(android.content.Intent intent) {
        if (intent == null || !defpackage.aooh.n(intent.getAction(), "ACTION_SHOW_TAB")) {
            return;
        }
        if (intent.getBooleanExtra("EXTRA_MARK_ALL_NEW_VOICEMAILS_AS_OLD", false) || intent.getBooleanExtra("EXTRA_CLEAR_NEW_VOICEMAILS", false)) {
            ((defpackage.aimw) a.b().l("com/android/dialer/voicemail/notification/impl/VoicemailNotificationIntentListener", "markNewVoicemailsAsOld", 39, "VoicemailNotificationIntentListener.kt")).v("mark and/or clear all new voicemails as old");
            this.b.g(this.c.c(), 5L, java.util.concurrent.TimeUnit.SECONDS);
        }
    }
}
