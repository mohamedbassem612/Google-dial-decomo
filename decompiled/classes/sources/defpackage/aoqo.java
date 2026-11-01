package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aoqo implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ aoqo(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [aomy, java.lang.Object] */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.aooh.f(obj, "it");
            return this.a.a();
        }
        int i2 = 1;
        if (i == 1) {
            java.lang.Exception exc = (java.lang.Exception) obj;
            defpackage.aooh.f(exc, "it");
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.ahew) this.a).h.d()).k(exc).l("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "tryPurgeOldVersions$<anonymous>", 426, "StartupAfterPackageReplacedWithRetryRunner.kt")).v("Failed to purge old versions");
            return defpackage.ajcm.a;
        }
        if (i == 2) {
            ((defpackage.apdp) this.a).d();
            return defpackage.aojh.a;
        }
        int i3 = 3;
        int i4 = 4;
        int i5 = 0;
        if (i == 3) {
            defpackage.aacy aacyVar = (defpackage.aacy) obj;
            if (aacyVar == null) {
                defpackage.aooh.i("$this$defaultCuiMapping");
            }
            java.lang.Object obj2 = this.a;
            aacyVar.b = defpackage.aais.aI("UserClickedVoicemailNotificationToVoicemailTabShown", 202966);
            defpackage.adcm adcmVar = (defpackage.adcm) obj2;
            adcmVar.i = defpackage.mce.USER_CLICKED_VOICEMAIL_NOTIFICATION;
            defpackage.aoso aosoVar = new defpackage.aoso(i4);
            defpackage.aacy aacyVar2 = new defpackage.aacy();
            aosoVar.a(aacyVar2);
            defpackage.aoso aosoVar2 = new defpackage.aoso(14);
            defpackage.aacy aacyVar3 = new defpackage.aacy();
            aosoVar2.a(aacyVar3);
            adcmVar.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar2, aacyVar3}));
            return defpackage.aojh.a;
        }
        if (i == 4) {
            defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
            if (aacyVar4 == null) {
                defpackage.aooh.i("$this$defaultCuiMapping");
            }
            java.lang.Object obj3 = this.a;
            aacyVar4.b = defpackage.aais.aI("UserClickedVoicemailEntryDeleteButtonToVoicemailEntryDeleted", 202970);
            defpackage.adcm adcmVar2 = (defpackage.adcm) obj3;
            adcmVar2.i = defpackage.mce.USER_CLICKED_VOICEMAIL_DELETE_BUTTON;
            java.util.Set setSingleton = java.util.Collections.singleton(defpackage.mce.VOICEMAIL_DELETION_CANCELLED);
            defpackage.aooh.e(setSingleton, "singleton(...)");
            adcmVar2.d(setSingleton);
            defpackage.aqap aqapVar = new defpackage.aqap(i2);
            defpackage.ajni ajniVar = new defpackage.ajni(null);
            aqapVar.a(ajniVar);
            defpackage.aqap aqapVar2 = new defpackage.aqap(i5);
            defpackage.ajni ajniVar2 = new defpackage.ajni(null);
            aqapVar2.a(ajniVar2);
            adcmVar2.f(defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar, ajniVar2}));
            adcmVar2.a = defpackage.mce.VOICEMAIL_ENTRY_DELETED;
            return defpackage.aojh.a;
        }
        defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
        if (aacyVar5 == null) {
            defpackage.aooh.i("$this$defaultCuiMapping");
        }
        java.lang.Object obj4 = this.a;
        aacyVar5.b = defpackage.aais.aI("UserClickedAudioPlaybackPlayButtonToPlaybackStartedWithoutLoading", 202974);
        defpackage.adcm adcmVar3 = (defpackage.adcm) obj4;
        adcmVar3.i = defpackage.mce.USER_CLICKED_PLAY_BUTTON_FROM_EXPANDED_VOICEMAIL_ENTRY;
        defpackage.aqap aqapVar3 = new defpackage.aqap(i3);
        defpackage.ajni ajniVar3 = new defpackage.ajni(null);
        aqapVar3.a(ajniVar3);
        defpackage.aqap aqapVar4 = new defpackage.aqap(i4);
        defpackage.ajni ajniVar4 = new defpackage.ajni(null);
        aqapVar4.a(ajniVar4);
        adcmVar3.f(defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar3, ajniVar4}));
        defpackage.aqap aqapVar5 = new defpackage.aqap(5);
        defpackage.aacy aacyVar6 = new defpackage.aacy();
        aqapVar5.a(aacyVar6);
        defpackage.aqap aqapVar6 = new defpackage.aqap(6);
        defpackage.aacy aacyVar7 = new defpackage.aacy();
        aqapVar6.a(aacyVar7);
        adcmVar3.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar6, aacyVar7}));
        return defpackage.aojh.a;
    }
}
