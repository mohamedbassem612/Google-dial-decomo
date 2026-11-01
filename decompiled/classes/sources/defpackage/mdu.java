package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class mdu implements defpackage.aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ mdu(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                defpackage.ajni ajniVar = (defpackage.ajni) obj;
                java.util.Set set = defpackage.mdv.a;
                if (ajniVar == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar.b = defpackage.mcd.IN_CALL_ACTIVITY_NOT_FOUND_EXCEPTION;
                ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                return defpackage.aojh.a;
            case 1:
                java.util.Set set2 = defpackage.mdv.a;
                return defpackage.mni.aT((defpackage.ajni) obj);
            case 2:
                defpackage.ajni ajniVar2 = (defpackage.ajni) obj;
                java.util.Set set3 = defpackage.mdv.a;
                if (ajniVar2 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar2.b = defpackage.mcd.PLACE_CALL_NO_CALL_PERMISSION;
                ajniVar2.c = defpackage.zar.PERMISSION_DENIED;
                return defpackage.aojh.a;
            case 3:
                defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                java.util.Set set4 = defpackage.mdv.a;
                if (ajniVar3 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar3.b = defpackage.mcd.NO_RESPONSE_FROM_TELECOM_FOR_OUTGOING_CALL;
                ajniVar3.c = defpackage.zar.TIMEOUT_FAILURE;
                return defpackage.aojh.a;
            case 4:
                defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                java.util.Set set5 = defpackage.mdv.a;
                if (ajniVar4 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar4.b = defpackage.mcd.CALL_DISCONNECTED_WITH_ERROR_CAUSE;
                ajniVar4.c = defpackage.zar.TELECOM_ERROR;
                return defpackage.aojh.a;
            case 5:
                defpackage.aacy aacyVar = (defpackage.aacy) obj;
                if (aacyVar == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar.b = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToStartMeetCall", 204962);
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aacy aacyVar2 = (defpackage.aacy) obj;
                if (aacyVar2 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar2.b = defpackage.aais.aI("VideoCallFromRecentsToStartMeetCall", 204956);
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                if (aacyVar3 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar3.b = defpackage.aais.aI("VideoCallFromFrequentsToStartMeetCall", 204958);
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                if (aacyVar4 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar4.b = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToStartMeetCall", 204964);
                return defpackage.aojh.a;
            case 9:
                defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                if (aacyVar5 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar5.b = defpackage.aais.aI("VideoCallFromFavoritesToStartMeetCall", 204960);
                return defpackage.aojh.a;
            case 10:
                defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                if (aacyVar6 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar6.b = defpackage.aais.aI("VideoCallFromVoicemailToStartMeetCall", 204974);
                return defpackage.aojh.a;
            case 11:
                defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                if (aacyVar7 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar7.b = defpackage.aais.aI("VideoCallFromSearchedContactToStartMeetCall", 204968);
                return defpackage.aojh.a;
            case 12:
                defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                if (aacyVar8 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar8.b = defpackage.aais.aI("VideoCallFromSuggestedContactsToStartMeetCall", 204966);
                return defpackage.aojh.a;
            case 13:
                defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                if (aacyVar9 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar9.b = defpackage.aais.aI("UpgradeToVideoButtonClickedToStartMeetCall", 204976);
                return defpackage.aojh.a;
            case 14:
                defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                if (aacyVar10 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar10.b = defpackage.aais.aI("UpgradeToVideoCornerButtonClickedToStartMeetCall", 241639);
                return defpackage.aojh.a;
            case 15:
                defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                if (aacyVar11 == null) {
                    defpackage.aooh.i("$this$end");
                }
                aacyVar11.b = defpackage.mce.DUO_UPGRADE_SUCCEEDED;
                return defpackage.aojh.a;
            case 16:
                defpackage.ajni ajniVar5 = (defpackage.ajni) obj;
                java.util.Set set6 = defpackage.mdx.a;
                if (ajniVar5 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar5.b = defpackage.mcd.DUO_UPGRADE_FAILED;
                ajniVar5.c = defpackage.zar.EXTERNAL_ERROR;
                return defpackage.aojh.a;
            case 17:
                defpackage.ajni ajniVar6 = (defpackage.ajni) obj;
                java.util.Set set7 = defpackage.mdx.a;
                if (ajniVar6 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar6.b = defpackage.mcd.START_VIDEO_APP_CALL_ERROR;
                ajniVar6.c = defpackage.zar.EXTERNAL_ERROR;
                return defpackage.aojh.a;
            case 18:
                defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                if (aacyVar12 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar12.b = defpackage.aais.aI("VideoCallFromFavoritesToVideoScreenShown", 202531);
                return defpackage.aojh.a;
            case 19:
                defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                if (aacyVar13 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar13.b = defpackage.aais.aI("VideoCallFromSearchedContactToVideoScreenShown", 202549);
                return defpackage.aojh.a;
            default:
                defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                if (aacyVar14 == null) {
                    defpackage.aooh.i("$this$end");
                }
                aacyVar14.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                aacyVar14.a = defpackage.aais.aI("VideoCallFromFavoritesToPreCall", 202533);
                return defpackage.aojh.a;
        }
    }
}
