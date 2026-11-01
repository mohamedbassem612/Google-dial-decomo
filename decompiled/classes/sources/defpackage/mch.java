package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class mch implements defpackage.aonj {
    private final /* synthetic */ int $cid;

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                defpackage.aacy aacyVar = (defpackage.aacy) obj;
                int i = defpackage.mci.a;
                if (aacyVar == null) {
                    defpackage.aooh.i("$this$multiEventEnd");
                }
                aacyVar.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_RECENTS_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN});
                aacyVar.a = defpackage.aais.aI("AndroidAutoCreateScreenToRecentsDataShown", 283369);
                return defpackage.aojh.a;
            case 1:
                defpackage.aacy aacyVar2 = (defpackage.aacy) obj;
                int i2 = defpackage.mci.a;
                if (aacyVar2 == null) {
                    defpackage.aooh.i("$this$multiEventEnd");
                }
                aacyVar2.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN});
                return defpackage.aojh.a;
            case 2:
                defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                int i3 = defpackage.mci.a;
                if (aacyVar3 == null) {
                    defpackage.aooh.i("$this$end");
                }
                aacyVar3.b = defpackage.mce.ANDROID_AUTO_FAVORITES_NUMBER_SELECTION_SCREEN_SHOWN;
                aacyVar3.a = defpackage.aais.aI("AndroidAutoFavoritesToNumberSelectionScreenShown", 232918);
                return defpackage.aojh.a;
            case 3:
                defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                int i4 = defpackage.mci.a;
                if (aacyVar4 == null) {
                    defpackage.aooh.i("$this$end");
                }
                aacyVar4.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                aacyVar4.a = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesToCarPreCallScreenShown", 256506);
                return defpackage.aojh.a;
            case 4:
                defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                int i5 = defpackage.mci.a;
                if (aacyVar5 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar5.b = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesNumberSelectionToCarInCallScreenShown", 232920);
                return defpackage.aojh.a;
            case 5:
                defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                int i6 = defpackage.mcj.a;
                if (aacyVar6 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar6.b = defpackage.aais.aI("BeaconCardShownFromCallAssist", 262805);
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                int i7 = defpackage.mcj.a;
                if (aacyVar7 == null) {
                    defpackage.aooh.i("$this$end");
                }
                aacyVar7.b = defpackage.mce.BEACON_CARD_RENDERED_BY_SPOON;
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                int i8 = defpackage.mcj.a;
                if (aacyVar8 == null) {
                    defpackage.aooh.i("$this$end");
                }
                aacyVar8.b = defpackage.mce.BEACON_ZERO_STATE_CARD_SHOWN;
                aacyVar8.a = defpackage.aais.aI("BeaconZeroStateCardShownFromCallAssist", 262807);
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                int i9 = defpackage.mcj.a;
                if (aacyVar9 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar9.b = defpackage.aais.aI("BeaconCardShownFromPromo", 262810);
                return defpackage.aojh.a;
            case 9:
                defpackage.ajni ajniVar = (defpackage.ajni) obj;
                int i10 = defpackage.mcj.a;
                if (ajniVar == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar.b = defpackage.mcd.BEACON_ZERO_STATE_CARD_SHOWN_UNINTENTIONALLY;
                ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                return defpackage.aojh.a;
            case 10:
                defpackage.ajni ajniVar2 = (defpackage.ajni) obj;
                int i11 = defpackage.mcj.a;
                if (ajniVar2 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar2.b = defpackage.mcd.BEACON_SPOON_SESSION_PREPARE_FAILURE;
                ajniVar2.c = defpackage.zar.EXTERNAL_ERROR;
                return defpackage.aojh.a;
            case 11:
                defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                int i12 = defpackage.mcj.a;
                if (ajniVar3 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar3.b = defpackage.mcd.BEACON_SPOON_SESSION_FAILURE;
                ajniVar3.c = defpackage.zar.EXTERNAL_ERROR;
                return defpackage.aojh.a;
            case 12:
                defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                if (ajniVar4 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar4.b = defpackage.mcd.DOBBY_DUPLEX_ERROR;
                ajniVar4.c = defpackage.zar.EXTERNAL_ERROR;
                return defpackage.aojh.a;
            case 13:
                return defpackage.mni.bE((defpackage.ajni) obj);
            case 14:
                return defpackage.mni.bD((defpackage.ajni) obj);
            case 15:
                defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                if (aacyVar10 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar10.b = defpackage.aais.aI("BeeslyV2PlayDisclaimerStartedToCompleted", 335920);
                return defpackage.aojh.a;
            case 16:
                defpackage.ajni ajniVar5 = (defpackage.ajni) obj;
                if (ajniVar5 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar5.b = defpackage.mcd.BEESLY_V2_PLAY_DISCLAIMER_FAILED;
                ajniVar5.c = defpackage.zar.UNKNOWN_ERROR;
                return defpackage.aojh.a;
            case 17:
                defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                if (aacyVar11 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar11.b = defpackage.aais.aI("BeeslyFromRejectedCallFromNotificationToTakeMessage", 266267);
                return defpackage.aojh.a;
            case 18:
                return defpackage.mni.bE((defpackage.ajni) obj);
            case 19:
                return defpackage.mni.bD((defpackage.ajni) obj);
            default:
                defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                if (aacyVar12 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar12.b = defpackage.aais.aI("UserAnsweredCallFromBeeslyWithUi", 298079);
                return defpackage.aojh.a;
        }
    }
}
