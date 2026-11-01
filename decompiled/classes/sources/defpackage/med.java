package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class med implements defpackage.aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ med(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                defpackage.ajni ajniVar = (defpackage.ajni) obj;
                if (ajniVar == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar.b = defpackage.mcd.SONIC_AUDIO_PLAY_ERROR_AT_LOCAL;
                ajniVar.c = defpackage.zar.AUDIO_ERROR;
                return defpackage.aojh.a;
            case 1:
                defpackage.aacy aacyVar = (defpackage.aacy) obj;
                if (aacyVar == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar.b = defpackage.aais.aI("SonicAudioPlayAtLocal", 194156);
                return defpackage.aojh.a;
            case 2:
                defpackage.aacy aacyVar2 = (defpackage.aacy) obj;
                if (aacyVar2 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar2.b = defpackage.aais.aI("SonicBounceButtonClicked", 200572);
                return defpackage.aojh.a;
            case 3:
                return defpackage.mni.aS((defpackage.ajni) obj);
            case 4:
                defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                if (aacyVar3 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar3.b = defpackage.aais.aI("SonicAudioPlayAtRemote", 194158);
                return defpackage.aojh.a;
            case 5:
                defpackage.ajni ajniVar2 = (defpackage.ajni) obj;
                if (ajniVar2 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar2.b = defpackage.mcd.SONIC_AUDIO_PLAY_ENDED_WITH_FAILURE_AT_REMOTE;
                ajniVar2.c = defpackage.zar.AUDIO_ERROR;
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                if (ajniVar3 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar3.b = defpackage.mcd.SONIC_AUDIO_PLAY_ENDED_WITH_EXCEPTION_AT_REMOTE;
                ajniVar3.c = defpackage.zar.AUDIO_ERROR;
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                if (aacyVar4 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar4.b = defpackage.aais.aI("SonicPromoClicked", 192368);
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                if (ajniVar4 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar4.b = defpackage.mcd.SONIC_PROMO_MODEL_FAILED_TO_LOAD;
                ajniVar4.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                return defpackage.aojh.a;
            case 9:
                return defpackage.mni.aS((defpackage.ajni) obj);
            case 10:
                defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                if (aacyVar5 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar5.b = defpackage.aais.aI("AppStartToMainActivity", 172980);
                return defpackage.aojh.a;
            case 11:
                defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                if (aacyVar6 == null) {
                    defpackage.aooh.i("$this$end");
                }
                aacyVar6.b = defpackage.mce.MAIN_ACTIVITY_ON_CREATE_WITHOUT_DIAL_INTENT;
                return defpackage.aojh.a;
            case 12:
                defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                if (aacyVar7 == null) {
                    defpackage.aooh.i("$this$end");
                }
                aacyVar7.b = defpackage.mce.MAIN_ACTIVITY_ON_CREATE_WITH_DIAL_INTENT;
                return defpackage.aojh.a;
            case 13:
                defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                if (aacyVar8 == null) {
                    defpackage.aooh.i("$this$end");
                }
                aacyVar8.b = defpackage.mce.CALL_OPTIONS_SHOWN;
                aacyVar8.a = defpackage.aais.aI("ActionDialToCallOptions", 350556);
                return defpackage.aojh.a;
            case 14:
                defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                if (aacyVar9 == null) {
                    defpackage.aooh.i("$this$end");
                }
                aacyVar9.b = defpackage.mce.RECENTS_TAB_RENDERED_AFTER_CREATED;
                return defpackage.aojh.a;
            case 15:
                defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                if (aacyVar10 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar10.b = defpackage.aais.aI("MainActivityToDialpadRendered", 172978);
                return defpackage.aojh.a;
            case 16:
                defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                if (aacyVar11 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar11.b = defpackage.aais.aI("AudioTransferredToWearToInCallUiMinimized", 244597);
                return defpackage.aojh.a;
            case 17:
                defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                if (aacyVar12 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar12.b = defpackage.aais.aI("InCallUiMaximizedToAudioTransferredToPhone", 244599);
                return defpackage.aojh.a;
            case 18:
                return defpackage.aais.aH(((android.telecom.PhoneAccountHandle) obj).getId());
            case 19:
                defpackage.ahkl ahklVar = (defpackage.ahkl) obj;
                defpackage.aooh.f(ahklVar, "$this$buildDataStoreConfig");
                ahklVar.b = new defpackage.ahkk(1, 1);
                return defpackage.aojh.a;
            default:
                defpackage.gou gouVar = (defpackage.gou) obj;
                if (gouVar == null) {
                    defpackage.aooh.i("it");
                }
                return java.lang.Boolean.valueOf(defpackage.aooh.n(gouVar.d, defpackage.rkw.b));
        }
    }
}
