package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aqap implements defpackage.aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aqap(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return defpackage.anty.aS((defpackage.ajni) obj);
            case 1:
                defpackage.ajni ajniVar = (defpackage.ajni) obj;
                if (ajniVar == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar.b = defpackage.mcd.VOICEMAIL_DELETION_FAILED;
                ajniVar.c = defpackage.zar.UNKNOWN_ERROR;
                return defpackage.aojh.a;
            case 2:
                defpackage.aacy aacyVar = (defpackage.aacy) obj;
                if (aacyVar == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar.b = defpackage.aais.aI("UserClickedVoicemailEntryToEntryExpanded", 202968);
                return defpackage.aojh.a;
            case 3:
                defpackage.ajni ajniVar2 = (defpackage.ajni) obj;
                if (ajniVar2 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar2.b = defpackage.mcd.AUDIO_PLAYBACK_ERROR;
                ajniVar2.c = defpackage.zar.AUDIO_ERROR;
                return defpackage.aojh.a;
            case 4:
                return defpackage.anty.aS((defpackage.ajni) obj);
            case 5:
                defpackage.aacy aacyVar2 = (defpackage.aacy) obj;
                if (aacyVar2 == null) {
                    defpackage.aooh.i("$this$end");
                }
                aacyVar2.b = defpackage.mce.AUDIO_PLAYBACK_STARTED;
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                if (aacyVar3 == null) {
                    defpackage.aooh.i("$this$end");
                }
                aacyVar3.b = defpackage.mce.VOICEMAIL_AUDIO_DOWNLOAD_STARTED;
                aacyVar3.a = defpackage.aais.aI("UserClickedAudioPlaybackPlayButtonToDownloadInitialization", 202976);
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                if (aacyVar4 == null) {
                    defpackage.aooh.i("$this$multiEventEnd");
                }
                aacyVar4.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.VOICEMAIL_ENTRY_EXPANDED, defpackage.mce.AUDIO_PLAYBACK_STARTED});
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                if (aacyVar5 == null) {
                    defpackage.aooh.i("$this$multiEventEnd");
                }
                aacyVar5.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.VOICEMAIL_ENTRY_EXPANDED, defpackage.mce.VOICEMAIL_AUDIO_DOWNLOAD_STARTED});
                aacyVar5.a = defpackage.aais.aI("UserClickedVoicemailEntryPlayButtonToDownloadInitialization", 202980);
                return defpackage.aojh.a;
            case 9:
                defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                if (aacyVar6 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar6.b = defpackage.aais.aI("AutoActivatedVoicemail", 202960);
                return defpackage.aojh.a;
            case 10:
                defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                if (ajniVar3 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar3.b = defpackage.mcd.VVM_ACTIVATION_FAILED;
                ajniVar3.c = defpackage.zar.EXTERNAL_ERROR;
                return defpackage.aojh.a;
            case 11:
                defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                if (aacyVar7 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar7.b = defpackage.aais.aI("UserActivatedVoicemailOnSettings", 202962);
                return defpackage.aojh.a;
            case 12:
                defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                if (ajniVar4 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar4.b = defpackage.mcd.VVM_ACTIVATION_FAILED;
                ajniVar4.c = defpackage.zar.EXTERNAL_ERROR;
                return defpackage.aojh.a;
            default:
                defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                if (aacyVar8 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar8.b = defpackage.aais.aI("VoicemailDownloadFinishedToPlaybackStarted", 202982);
                return defpackage.aojh.a;
        }
    }
}
