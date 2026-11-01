package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vod implements ahtl {
    private final /* synthetic */ int $cid;

    public vod(int i) {
        this.$cid = i;
    }

    public final /* synthetic */ defpackage.ahtm a(ahth ahthVar) {
        int i = this.$cid;
        if (i == 0) {
            aooh.f((defpackage.ahtf) ahthVar, "event");
            return new defpackage.ahtm(defpackage.vob.a);
        }
        if (i == 1) {
            aooh.f((defpackage.ahtd) ahthVar, "event");
            return new defpackage.ahtm(defpackage.voa.a);
        }
        if (i == 2) {
            defpackage.vpc.a.b().l("com/android/dialer/voicemail/settings/VoicemailSettingsFragmentPeer", "onDismissConversationHistoryDeletion", 751, "VoicemailSettingsFragmentPeer.java").v("showDisableConfirmationDialog, cancelled");
            return defpackage.ahtm.a;
        }
        if (i == 3) {
            defpackage.vpc.a.b().l("com/android/dialer/voicemail/settings/VoicemailSettingsFragmentPeer", "onNegativeClickForConversationHistoryDeletion", 766, "VoicemailSettingsFragmentPeer.java").v("showDisableConfirmationDialog, cancelled");
            return defpackage.ahtm.a;
        }
        if (i != 4) {
            aooh.f((defpackage.ahtf) ahthVar, "event");
            defpackage.wuk.a.b().l("com/android/dialer/xatu/impl/ui/precall/XatuPrecallIntegrationDialogFragmentPeer", "onPositiveButtonClicked", 44, "XatuPrecallIntegrationDialogFragmentPeer.kt").v("aborting call");
            return new defpackage.ahtm(new defpackage.zsy());
        }
        aooh.f((defpackage.ahtd) ahthVar, "event");
        defpackage.wgq.a.b().l("com/android/dialer/wirelesspriorityservice/impl/WpsWarningDialogFragmentPeer", "onNegativeButtonClicked", 54, "WpsWarningDialogFragmentPeer.kt").v("user aborted WPS call");
        return new defpackage.ahtm(new defpackage.zsy());
    }
}
