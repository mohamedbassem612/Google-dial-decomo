package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class mdf implements defpackage.aonj {
    private final /* synthetic */ int $cid;

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                defpackage.ajni ajniVar = (defpackage.ajni) obj;
                if (ajniVar == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar.b = defpackage.mcd.CALL_NOT_ON_HOLD;
                ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                return defpackage.aojh.a;
            case 1:
                return defpackage.mni.aX((defpackage.ajni) obj);
            case 2:
                defpackage.aacy aacyVar = (defpackage.aacy) obj;
                if (aacyVar == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar.b = defpackage.aais.aI("InCallEndCallButtonToDisconnected", 200553);
                return defpackage.aojh.a;
            case 3:
                defpackage.ajni ajniVar2 = (defpackage.ajni) obj;
                if (ajniVar2 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar2.b = defpackage.mcd.UNHOLD_FAILED;
                ajniVar2.c = defpackage.zar.TELECOM_ERROR;
                return defpackage.aojh.a;
            case 4:
                defpackage.aacy aacyVar2 = (defpackage.aacy) obj;
                if (aacyVar2 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar2.b = defpackage.aais.aI("UnholdRequestedToHoldButtonShown", 174998);
                return defpackage.aojh.a;
            case 5:
                defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                if (aacyVar3 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar3.b = defpackage.aais.aI("InCallDialpadButtonClickedToDialpadShown", 175000);
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                if (aacyVar4 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar4.b = defpackage.aais.aI("InCallDialpadDismissedToDialpadHidden", 175002);
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                if (aacyVar5 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar5.b = defpackage.aais.aI("CallAssistCategoryButtonClickedToCallAssistCategoryShown", 235372);
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                if (ajniVar3 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar3.b = defpackage.mcd.CALL_ASSIST_MENU_MODEL_FAILED_TO_LOAD;
                ajniVar3.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                return defpackage.aojh.a;
            case 9:
                return defpackage.mni.aX((defpackage.ajni) obj);
            case 10:
                return defpackage.mni.aW((defpackage.ajni) obj);
            case 11:
                defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                if (aacyVar6 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar6.b = defpackage.aais.aI("OnCallRemovedToCallScopeUiLockReleased", 200555);
                return defpackage.aojh.a;
            case 12:
                defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                if (ajniVar4 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar4.b = defpackage.mcd.FAILED_TO_RELEASE_CALL_SCOPE_LOCK;
                ajniVar4.c = defpackage.zar.ILLEGAL_STATE;
                return defpackage.aojh.a;
            case 13:
                defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                if (aacyVar7 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar7.b = defpackage.aais.aI("AllUiLocksReleasedToInCallActivityDestroyed", 200557);
                return defpackage.aojh.a;
            case 14:
                defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                if (aacyVar8 == null) {
                    defpackage.aooh.i("$this$end");
                }
                aacyVar8.b = defpackage.mce.AUDIO_ROUTE_REQUESTED;
                return defpackage.aojh.a;
            case 15:
                return defpackage.mni.aY((defpackage.ajni) obj);
            case 16:
                defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                if (aacyVar9 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar9.b = defpackage.aais.aI("AudioRouteSelectedToRouteRequested", 174978);
                return defpackage.aojh.a;
            case 17:
                defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                if (aacyVar10 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar10.b = defpackage.aais.aI("AudioRouteRequestedToAudioRouteButtonUpdated", 174980);
                return defpackage.aojh.a;
            case 18:
                defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                if (aacyVar11 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar11.b = defpackage.aais.aI("AudioRouteSelectedFromDialogToRouteRequested", 197591);
                return defpackage.aojh.a;
            case 19:
                defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                if (aacyVar12 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar12.b = defpackage.aais.aI("MuteButtonClickedToMuteStateRequested", 174982);
                return defpackage.aojh.a;
            default:
                defpackage.ajni ajniVar5 = (defpackage.ajni) obj;
                if (ajniVar5 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar5.b = defpackage.mcd.PRODUCE_RTT_CHAT_SERVICE_MODEL_ERROR;
                ajniVar5.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                return defpackage.aojh.a;
        }
    }
}
