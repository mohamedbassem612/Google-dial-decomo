package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class meb implements defpackage.aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ meb(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                defpackage.aacy aacyVar = (defpackage.aacy) obj;
                if (aacyVar == null) {
                    defpackage.aooh.i("$this$multiEventEnd");
                }
                aacyVar.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.SHARPIE_IS_OFF_WHEN_VOICE_BUTTON_CLICKED, defpackage.mce.SHARPIE_DISCLOSURE_STARTED});
                return defpackage.aojh.a;
            case 1:
                defpackage.aacy aacyVar2 = (defpackage.aacy) obj;
                if (aacyVar2 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar2.b = defpackage.mec.c;
                defpackage.meb mebVar = new defpackage.meb(5);
                defpackage.aacy aacyVar3 = new defpackage.aacy(null);
                mebVar.a(aacyVar3);
                java.util.Set setSingleton = java.util.Collections.singleton(aacyVar3);
                defpackage.aooh.e(setSingleton, "singleton(...)");
                aacyVar2.c(setSingleton);
                return defpackage.aojh.a;
            case 2:
                defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                if (aacyVar4 == null) {
                    defpackage.aooh.i("$this$multiEventEnd");
                }
                aacyVar4.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.SHARPIE_IS_ON_WHEN_VOICE_BUTTON_CLICKED, defpackage.mce.SHARPIE_ACTIVE_INDICATOR_HIDDEN, defpackage.mce.IN_CALL_SHARPIE_BUTTON_UPDATED});
                aacyVar4.a = defpackage.mec.d;
                return defpackage.aojh.a;
            case 3:
                defpackage.ajni ajniVar = (defpackage.ajni) obj;
                if (ajniVar == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar.b = defpackage.mcd.SHARPIE_SESSION_STOP_FAILURE;
                ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                return defpackage.aojh.a;
            case 4:
                defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                if (aacyVar5 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar5.b = defpackage.aais.aI("SharpieAutomaticallyActivatedToDisclosureStarted", 247606);
                return defpackage.aojh.a;
            case 5:
                defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                if (aacyVar6 == null) {
                    defpackage.aooh.i("$this$definingEventSet");
                }
                aacyVar6.a = defpackage.mec.d;
                java.util.Set setSingleton2 = java.util.Collections.singleton(defpackage.mce.SHARPIE_IS_ON_WHEN_VOICE_BUTTON_CLICKED);
                defpackage.aooh.e(setSingleton2, "singleton(...)");
                aacyVar6.b(setSingleton2);
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                if (aacyVar7 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar7.b = defpackage.aais.aI("SonicVoiceChipClicked", 203136);
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                if (aacyVar8 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar8.b = defpackage.aais.aI("AudioEmojiCategoryButtonClickedToAudioEmojiCategoryShown", 235374);
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.mni.aS((defpackage.ajni) obj);
            case 9:
                defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                if (aacyVar9 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar9.b = defpackage.aais.aI("SonicEmojiClickedToAudioInjectionBeginning", 187354);
                return defpackage.aojh.a;
            case 10:
                return defpackage.mni.aS((defpackage.ajni) obj);
            case 11:
                defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                if (aacyVar10 == null) {
                    defpackage.aooh.i("$this$multiEventEnd");
                }
                aacyVar10.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.SONIC_AUDIO_INJECTION_STARTED_AT_REMOTE, defpackage.mce.SONIC_AUDIO_INJECTION_STARTED_AT_LOCAL, defpackage.mce.SONIC_ANIMATION_STARTED});
                return defpackage.aojh.a;
            case 12:
                defpackage.ajni ajniVar2 = (defpackage.ajni) obj;
                if (ajniVar2 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar2.b = defpackage.mcd.SONIC_GET_AUDIO_PLAYER_FAILED;
                ajniVar2.c = defpackage.zar.ILLEGAL_STATE;
                return defpackage.aojh.a;
            case 13:
                defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                if (ajniVar3 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar3.b = defpackage.mcd.SONIC_AUDIO_PLAYER_IS_NOT_IDLE;
                ajniVar3.c = defpackage.zar.ILLEGAL_STATE;
                return defpackage.aojh.a;
            case 14:
                defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                if (ajniVar4 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar4.b = defpackage.mcd.SONIC_SOUND_FILE_GENERATION_FAILED;
                ajniVar4.c = defpackage.zar.IO_EXCEPTION;
                return defpackage.aojh.a;
            case 15:
                defpackage.ajni ajniVar5 = (defpackage.ajni) obj;
                if (ajniVar5 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar5.b = defpackage.mcd.SONIC_AUDIO_FAILED_TO_START_AT_REMOTE;
                ajniVar5.c = defpackage.zar.AUDIO_ERROR;
                return defpackage.aojh.a;
            case 16:
                defpackage.ajni ajniVar6 = (defpackage.ajni) obj;
                if (ajniVar6 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar6.b = defpackage.mcd.SONIC_AUDIO_PLAY_ERROR_AT_LOCAL;
                ajniVar6.c = defpackage.zar.AUDIO_ERROR;
                return defpackage.aojh.a;
            case 17:
                return defpackage.mni.aS((defpackage.ajni) obj);
            case 18:
                defpackage.ajni ajniVar7 = (defpackage.ajni) obj;
                if (ajniVar7 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar7.b = defpackage.mcd.SONIC_AUDIO_PLAY_AT_LOCAL_SET_DATASOURCE_EXCEPTION;
                ajniVar7.c = defpackage.zar.IO_EXCEPTION;
                return defpackage.aojh.a;
            case 19:
                defpackage.ajni ajniVar8 = (defpackage.ajni) obj;
                if (ajniVar8 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar8.b = defpackage.mcd.SONIC_ANIMATION_PLAY_REQUEST_FAILED;
                ajniVar8.c = defpackage.zar.ILLEGAL_STATE;
                return defpackage.aojh.a;
            default:
                defpackage.ajni ajniVar9 = (defpackage.ajni) obj;
                if (ajniVar9 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar9.b = defpackage.mcd.SONIC_ANIMATION_PLAY_REQUEST_REJECTED;
                ajniVar9.c = defpackage.zar.ILLEGAL_STATE;
                return defpackage.aojh.a;
        }
    }
}
