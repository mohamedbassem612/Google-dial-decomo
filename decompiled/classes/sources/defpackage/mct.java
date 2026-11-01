package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class mct implements defpackage.aonj {
    private final /* synthetic */ int $cid;

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                defpackage.ajni ajniVar = (defpackage.ajni) obj;
                if (ajniVar == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar.b = defpackage.mcd.DOBBY_STARTED_RINGING_FROM_UNSUPPORTED_STATE;
                ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                return defpackage.aojh.a;
            case 1:
                defpackage.aacy aacyVar = (defpackage.aacy) obj;
                if (aacyVar == null) {
                    defpackage.aooh.i("$this$end");
                }
                aacyVar.b = defpackage.mce.DOBBY_RINGING_NOTIFICATION_REQUESTED;
                return defpackage.aojh.a;
            case 2:
                defpackage.aacy aacyVar2 = (defpackage.aacy) obj;
                if (aacyVar2 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar2.b = defpackage.aais.aI("UserAnsweredCallFromAutoScreeningWithUi", 297401);
                return defpackage.aojh.a;
            case 3:
                defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                if (aacyVar3 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar3.b = defpackage.aais.aI("UserAnsweredCallFromNotificationDuringScreeningSession", 186906);
                return defpackage.aojh.a;
            case 4:
                defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                if (aacyVar4 == null) {
                    defpackage.aooh.i("$this$end");
                }
                aacyVar4.b = defpackage.mce.DOBBY_IN_CALL_FRAGMENT_DESTROYED;
                return defpackage.aojh.a;
            case 5:
                defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                if (aacyVar5 == null) {
                    defpackage.aooh.i("$this$end");
                }
                aacyVar5.b = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.mni.bb((defpackage.ajni) obj);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.mni.aU((defpackage.ajni) obj);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.ajni ajniVar2 = (defpackage.ajni) obj;
                if (ajniVar2 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar2.b = defpackage.mcd.START_MANUAL_SCREENING_FROM_NOT_SUPPORTED_STATE;
                ajniVar2.c = defpackage.zar.ILLEGAL_STATE;
                return defpackage.aojh.a;
            case 9:
                defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                if (ajniVar3 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar3.b = defpackage.mcd.FAILED_TO_LOAD_DOBBY_IN_CALL_FRAGMENT_MODEL;
                ajniVar3.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                return defpackage.aojh.a;
            case 10:
                defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                if (ajniVar4 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar4.b = defpackage.mcd.FAILED_TO_START_AUDIO_PRISM_SESSION_FOR_DOBBY;
                ajniVar4.c = defpackage.zar.ILLEGAL_STATE;
                return defpackage.aojh.a;
            case 11:
                defpackage.ajni ajniVar5 = (defpackage.ajni) obj;
                if (ajniVar5 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar5.b = defpackage.mcd.DOBBY_RECORDING_FILE_LIST_EMPTY;
                ajniVar5.c = defpackage.zar.EXTERNAL_ERROR;
                return defpackage.aojh.a;
            case 12:
                defpackage.ajni ajniVar6 = (defpackage.ajni) obj;
                if (ajniVar6 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar6.b = defpackage.mcd.DOBBY_RECORDING_FILE_NOT_EXIST;
                ajniVar6.c = defpackage.zar.EXTERNAL_ERROR;
                return defpackage.aojh.a;
            case 13:
                defpackage.ajni ajniVar7 = (defpackage.ajni) obj;
                if (ajniVar7 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar7.b = defpackage.mcd.DOBBY_TTS_REQUEST_EMPTY;
                ajniVar7.c = defpackage.zar.EXTERNAL_ERROR;
                return defpackage.aojh.a;
            case 14:
                return defpackage.mni.bb((defpackage.ajni) obj);
            case 15:
                defpackage.ajni ajniVar8 = (defpackage.ajni) obj;
                if (ajniVar8 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar8.b = defpackage.mcd.DOBBY_UNSUPPORTED_TTS_REQUEST;
                ajniVar8.c = defpackage.zar.ILLEGAL_STATE;
                return defpackage.aojh.a;
            case 16:
                defpackage.ajni ajniVar9 = (defpackage.ajni) obj;
                if (ajniVar9 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar9.b = defpackage.mcd.DOBBY_FAILED_TO_START_PLAYING_RECORDING;
                ajniVar9.c = defpackage.zar.AUDIO_ERROR;
                return defpackage.aojh.a;
            case 17:
                defpackage.ajni ajniVar10 = (defpackage.ajni) obj;
                if (ajniVar10 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar10.b = defpackage.mcd.DOBBY_PLAY_RECORDING_FAILED;
                ajniVar10.c = defpackage.zar.AUDIO_ERROR;
                return defpackage.aojh.a;
            case 18:
                defpackage.ajni ajniVar11 = (defpackage.ajni) obj;
                if (ajniVar11 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar11.b = defpackage.mcd.DOBBY_FAILED_PLAYING_TTS_REQUEST;
                ajniVar11.c = defpackage.zar.AUDIO_ERROR;
                return defpackage.aojh.a;
            case 19:
                defpackage.ajni ajniVar12 = (defpackage.ajni) obj;
                if (ajniVar12 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar12.b = defpackage.mcd.DOBBY_DUPLEX_ERROR;
                ajniVar12.c = defpackage.zar.EXTERNAL_ERROR;
                return defpackage.aojh.a;
            default:
                defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                if (aacyVar6 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar6.b = defpackage.aais.aI("UserSelectedSuggestedReplyWithEndCallAction", 186759);
                return defpackage.aojh.a;
        }
    }
}
