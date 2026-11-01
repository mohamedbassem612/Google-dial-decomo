package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class joy implements defpackage.lot {
    private final /* synthetic */ int $cid;

    public /* synthetic */ joy(int i) {
        this.$cid = i;
    }

    @Override // defpackage.lot
    public final void a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.joz.c.b().l("com/android/dialer/callannouncer/impl/settings/CallAnnouncerSettingsFragmentCompat", "handleCallAnnouncerPreferenceChange", 225, "CallAnnouncerSettingsFragmentCompat.java").v("canceled periodic pre-warm worker");
            return;
        }
        if (i == 1) {
            defpackage.joz.c.b().l("com/android/dialer/callannouncer/impl/settings/CallAnnouncerSettingsFragmentCompat", "handleCallAnnouncerPreferenceChange", 214, "CallAnnouncerSettingsFragmentCompat.java").v("scheduled periodic pre-warm worker");
        } else if (i == 2) {
        } else if (i != 3) {
            defpackage.lyi.a.b().l("com/android/dialer/conversationhistorycalldetails/ConversationHistoryCallDetailsFragmentPeer", "deleteSingleCallLogItem", 935, "ConversationHistoryCallDetailsFragmentPeer.java").v("Call log item successfully deleted");
        } else {
            com.android.dialer.callscreen.impl.history.CallScreenSessionActivity.n.b().l("com/android/dialer/callscreen/impl/history/CallScreenSessionActivity", "setTranscriptAsRatedInLocalStorage", 206, "CallScreenSessionActivity.java").v("transcript rating updated");
        }
    }
}
