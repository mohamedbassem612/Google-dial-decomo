package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iya implements ahtl {
    private final /* synthetic */ int $cid;

    public iya(int i) {
        this.$cid = i;
    }

    public final /* synthetic */ ahtm a(ahth ahthVar) {
        switch (this.$cid) {
            case 0:
                aooh.f((ahtd) ahthVar, "event");
                defpackage.ixz.a.b().l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyDeleteDialogFragmentPeer", "onNegativeButtonClick", 54, "BeeslyDeleteDialogFragmentPeer.kt").v("onNegativeButtonClick");
                return ahtm.a;
            case 1:
                aooh.f((defpackage.ifl) ahthVar, "event");
                return ahtm.a;
            case 2:
                aooh.f((ahtf) ahthVar, "event");
                defpackage.iyl.a.b().l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyLimitReachedDialogFragmentPeer", "onPositiveButtonClick", 40, "BeeslyLimitReachedDialogFragmentPeer.kt").v("onPositiveButtonClick");
                return ahtm.a;
            case 3:
                aooh.f((ahtd) ahthVar, "event");
                defpackage.iyp.a.b().l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyRenameDialogFragmentPeer", "onNegativeButtonClick", 123, "BeeslyRenameDialogFragmentPeer.kt").v("onNegativeButtonClick");
                return ahtm.a;
            case 4:
                defpackage.kzx.a.b().l("com/android/dialer/callrecording/impl/settings/DeleteAllConfirmationDialogFragmentPeer", "onNegativeButtonClick", 79, "DeleteAllConfirmationDialogFragmentPeer.java").v("user cancelled deleting call recordings");
                return ahtm.a;
            case 5:
                defpackage.kzx.a.b().l("com/android/dialer/callrecording/impl/settings/DeleteAllConfirmationDialogFragmentPeer", "onPositiveButtonClick", 73, "DeleteAllConfirmationDialogFragmentPeer.java").v("user confirmed deleting call recordings");
                return new ahtm(new defpackage.kzw());
            case 6:
                defpackage.lai.a.b().l("com/android/dialer/callrecording/impl/settings/RecordingForNonContactsDialogFragmentPeer", "onNegativeButtonClick", 83, "RecordingForNonContactsDialogFragmentPeer.java").v("cancel button clicked in non-contact record dialog");
                return ahtm.a;
            case 7:
                defpackage.lai.a.b().l("com/android/dialer/callrecording/impl/settings/RecordingForNonContactsDialogFragmentPeer", "onPositiveButtonClick", 77, "RecordingForNonContactsDialogFragmentPeer.java").v("positive button clicked in non-contact record dialog");
                return new ahtm(new defpackage.lah());
            case 8:
                defpackage.lam.a.b().l("com/android/dialer/callrecording/impl/settings/RecordingForSelectedNumbersDialogFragmentPeer", "onNegativeButtonClick", 83, "RecordingForSelectedNumbersDialogFragmentPeer.java").v("cancel button clicked in selected numbers record dialog");
                return ahtm.a;
            case 9:
                defpackage.lam.a.b().l("com/android/dialer/callrecording/impl/settings/RecordingForSelectedNumbersDialogFragmentPeer", "onPositiveButtonClick", 77, "RecordingForSelectedNumbersDialogFragmentPeer.java").v("positive button clicked in selected numbers record dialog");
                return new ahtm(new defpackage.lal());
            case 10:
                defpackage.lbe.a.b().l("com/android/dialer/callrecording/impl/settings/UseBeepSoundTermsDialogFragmentPeer", "onNegativeButtonClick", 55, "UseBeepSoundTermsDialogFragmentPeer.kt").v("negative button clicked");
                return ahtm.a;
            case 11:
                defpackage.lbe.a.b().l("com/android/dialer/callrecording/impl/settings/UseBeepSoundTermsDialogFragmentPeer", "onPositiveButtonClick", 49, "UseBeepSoundTermsDialogFragmentPeer.kt").v("positive button clicked");
                return new ahtm(defpackage.lbd.a);
            case 12:
                aooh.f((defpackage.ltn) ahthVar, "event");
                return ahtm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aooh.f((ahtd) ahthVar, "event");
                defpackage.myv.a.b().l("com/android/dialer/dobby/impl/precall/DobbyPrecallIntegrationFragmentPeer", "onNegativeButtonClicked", 64, "DobbyPrecallIntegrationFragmentPeer.kt").v("cancelling outgoing call");
                return new ahtm(new zsy());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aooh.f((ahtd) ahthVar, "event");
                return new ahtm(new ahtd());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                a.bI(qsl.a.d(), "Merge calls prompt canceled by the user.", "com/android/dialer/incall/video/ui/MergeCallsPromptDialogFragmentPeer", "onNegativeButtonClicked", 'K', "MergeCallsPromptDialogFragmentPeer.java", zct.b);
                return new ahtm(new qsk(false));
            case 16:
                qsl.a.b().l("com/android/dialer/incall/video/ui/MergeCallsPromptDialogFragmentPeer", "onPositiveButtonClicked", 69, "MergeCallsPromptDialogFragmentPeer.java").v("Merge calls prompt accepted by the user.");
                return new ahtm(new qsk(true));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                aooh.f((mld) ahthVar, "event");
                return ahtm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                aooh.f((mld) ahthVar, "event");
                return ahtm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                aooh.f((ahte) ahthVar, "event");
                return new ahtm(umb.a);
            default:
                return ahtm.a;
        }
    }
}
