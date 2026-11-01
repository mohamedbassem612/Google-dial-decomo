package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class mcv implements defpackage.aonj {
    private final /* synthetic */ int $cid;

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return defpackage.mni.bc((defpackage.ajni) obj);
            case 1:
                defpackage.aacy aacyVar = (defpackage.aacy) obj;
                if (aacyVar == null) {
                    defpackage.aooh.i("$this$multiEventEnd");
                }
                aacyVar.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_REPORT_SPAM, defpackage.mce.DOBBY_BACKGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                return defpackage.aojh.a;
            case 2:
                defpackage.aacy aacyVar2 = (defpackage.aacy) obj;
                if (aacyVar2 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar2.b = defpackage.aais.aI("DobbyRecordingStartedToCompleted", 186902);
                return defpackage.aojh.a;
            case 3:
                defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                if (aacyVar3 == null) {
                    defpackage.aooh.i("$this$multiEventEnd");
                }
                aacyVar3.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.EMERGENCY_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                return defpackage.aojh.a;
            case 4:
                defpackage.ajni ajniVar = (defpackage.ajni) obj;
                if (ajniVar == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar.b = defpackage.mcd.AED_TTS_LOCALE_UNAVAILABLE;
                ajniVar.c = defpackage.zar.EXTERNAL_ERROR;
                return defpackage.aojh.a;
            case 5:
                defpackage.ajni ajniVar2 = (defpackage.ajni) obj;
                if (ajniVar2 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar2.b = defpackage.mcd.AED_TTS_INIT_FAILED;
                ajniVar2.c = defpackage.zar.EXTERNAL_ERROR;
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.mni.aT((defpackage.ajni) obj);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.mni.aV((defpackage.ajni) obj);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                if (ajniVar3 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar3.b = defpackage.mcd.VOICE_FRAGMENT_CREATED;
                ajniVar3.c = defpackage.zar.ILLEGAL_STATE;
                return defpackage.aojh.a;
            case 9:
                defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                if (aacyVar4 == null) {
                    defpackage.aooh.i("$this$end");
                }
                aacyVar4.b = defpackage.mce.AUDIO_ROUTE_REQUESTED;
                return defpackage.aojh.a;
            case 10:
                defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                if (ajniVar4 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar4.b = defpackage.mcd.EMERGENCY_REQUEST_LOCATION_UPDATES_FAILURE;
                ajniVar4.c = defpackage.zar.PERMISSION_DENIED;
                return defpackage.aojh.a;
            case 11:
                return defpackage.mni.aV((defpackage.ajni) obj);
            case 12:
                defpackage.ajni ajniVar5 = (defpackage.ajni) obj;
                if (ajniVar5 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar5.b = defpackage.mcd.EMERGENCY_REQUEST_LOCATION_UPDATES_FAILURE;
                ajniVar5.c = defpackage.zar.PERMISSION_DENIED;
                return defpackage.aojh.a;
            case 13:
                defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                if (aacyVar5 == null) {
                    defpackage.aooh.i("$this$multiEventEnd");
                }
                aacyVar5.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_DISCONNECTED, defpackage.mce.ON_CALL_REMOVED});
                return defpackage.aojh.a;
            case 14:
                return defpackage.mni.aW((defpackage.ajni) obj);
            case 15:
                defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                if (aacyVar6 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar6.b = defpackage.aais.aI("ExpressoMsgSentClickedToReceived", 293085);
                return defpackage.aojh.a;
            case 16:
                defpackage.ajni ajniVar6 = (defpackage.ajni) obj;
                if (ajniVar6 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar6.b = defpackage.mcd.EXPRESSO_URGENT_MSG_REJECTED;
                ajniVar6.c = defpackage.zar.ILLEGAL_STATE;
                return defpackage.aojh.a;
            case 17:
                defpackage.ajni ajniVar7 = (defpackage.ajni) obj;
                if (ajniVar7 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar7.b = defpackage.mcd.EXPRESSO_URGENT_MSG_TIMEOUT;
                ajniVar7.c = defpackage.zar.ILLEGAL_STATE;
                return defpackage.aojh.a;
            case 18:
                defpackage.ajni ajniVar8 = (defpackage.ajni) obj;
                if (ajniVar8 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar8.b = defpackage.mcd.EXPRESSO_URGENT_MSG_UNREACHABLE;
                ajniVar8.c = defpackage.zar.ILLEGAL_STATE;
                return defpackage.aojh.a;
            case 19:
                defpackage.ajni ajniVar9 = (defpackage.ajni) obj;
                if (ajniVar9 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar9.b = defpackage.mcd.EXPRESSO_URGENT_MSG_FAILURE;
                ajniVar9.c = defpackage.zar.ILLEGAL_STATE;
                return defpackage.aojh.a;
            default:
                defpackage.ajni ajniVar10 = (defpackage.ajni) obj;
                if (ajniVar10 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar10.b = defpackage.mcd.EXPRESSO_URGENT_MSG_SERVICE_UNAVAILABLE;
                ajniVar10.c = defpackage.zar.ILLEGAL_STATE;
                return defpackage.aojh.a;
        }
    }
}
