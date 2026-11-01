package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class mcm implements defpackage.aonj {
    private final /* synthetic */ int $cid;

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                defpackage.aacy aacyVar = (defpackage.aacy) obj;
                if (aacyVar == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar.b = defpackage.aais.aI("AnswerScreenCreatedToCallingCardShown", 333272);
                break;
            case 1:
                defpackage.aacy aacyVar2 = (defpackage.aacy) obj;
                if (aacyVar2 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar2.b = defpackage.aais.aI("BeeslyFromRejectedCallFromAnswerScreenToTakeMessage", 253309);
                break;
            case 2:
                defpackage.ajni ajniVar = (defpackage.ajni) obj;
                if (ajniVar == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar.b = defpackage.mcd.CALLING_CARD_IMAGE_DECODE_FAILED;
                ajniVar.c = defpackage.zar.UNKNOWN_ERROR;
                break;
            case 3:
                defpackage.ajni ajniVar2 = (defpackage.ajni) obj;
                if (ajniVar2 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar2.b = defpackage.mcd.CALLING_CARD_NOT_LOADED;
                ajniVar2.c = defpackage.zar.EXTERNAL_ERROR;
                break;
            case 4:
                defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                if (aacyVar3 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar3.b = defpackage.aais.aI("ContactCallingCardSaveButtonPressedToCallingCardSaved", 333276);
                break;
            case 5:
                defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                if (ajniVar3 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar3.b = defpackage.mcd.CONTACT_CALLING_CARD_FAILED_TO_UPDATE;
                ajniVar3.c = defpackage.zar.EXTERNAL_ERROR;
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                if (aacyVar4 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar4.b = defpackage.aais.aI("MyCallingCardSaveButtonPressedToCallingCardSaved", 333274);
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                if (ajniVar4 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar4.b = defpackage.mcd.MY_CALLING_CARD_FAILED_TO_UPDATE;
                ajniVar4.c = defpackage.zar.EXTERNAL_ERROR;
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                if (aacyVar5 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar5.b = defpackage.aais.aI("MyCallingCardDeleteButtonPressedToCallingCardDeleted", 335936);
                break;
            case 9:
                defpackage.ajni ajniVar5 = (defpackage.ajni) obj;
                if (ajniVar5 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar5.b = defpackage.mcd.MY_CALLING_CARD_FAILED_TO_DELETE;
                ajniVar5.c = defpackage.zar.EXTERNAL_ERROR;
                break;
            case 10:
                defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                if (aacyVar6 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar6.b = defpackage.aais.aI("ContactCallingCardDeleteButtonPressedToCallingCardDeleted", 335938);
                break;
            case 11:
                defpackage.ajni ajniVar6 = (defpackage.ajni) obj;
                if (ajniVar6 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar6.b = defpackage.mcd.CONTACT_CALLING_CARD_FAILED_TO_DELETE;
                ajniVar6.c = defpackage.zar.EXTERNAL_ERROR;
                break;
            case 12:
                defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                if (aacyVar7 == null) {
                    defpackage.aooh.i("$this$multiEventEnd");
                }
                aacyVar7.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.CALLING_CARD_SHOWN, defpackage.mce.TEXT_STYLE_SHOWN});
                break;
            case 13:
                defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                if (aacyVar8 == null) {
                    defpackage.aooh.i("$this$multiEventEnd");
                }
                aacyVar8.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.CALLING_CARD_SHOWN, defpackage.mce.TEXT_STYLE_NOT_EXIST});
                break;
            case 14:
                defpackage.ajni ajniVar7 = (defpackage.ajni) obj;
                if (ajniVar7 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar7.b = defpackage.mcd.MY_CALLING_CARD_FETCH_FAILED;
                ajniVar7.c = defpackage.zar.EXTERNAL_ERROR;
                break;
            case 15:
                defpackage.ajni ajniVar8 = (defpackage.ajni) obj;
                if (ajniVar8 == null) {
                    defpackage.aooh.i("$this$error");
                }
                ajniVar8.b = defpackage.mcd.CONTACT_CALLING_CARD_FETCH_FAILED;
                ajniVar8.c = defpackage.zar.EXTERNAL_ERROR;
                break;
            case 16:
                defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                if (aacyVar9 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar9.b = defpackage.aais.aI("ConversationHistoryDropdownMenuShown", 200667);
                break;
            case 17:
                defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                if (aacyVar10 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar10.b = defpackage.aais.aI("ConversationHistoryCallDetailsShown", 200969);
                break;
            case 18:
                defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                if (aacyVar11 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar11.b = defpackage.aais.aI("ConversationHistoryPopupMenuShown", 201066);
                break;
            case 19:
                defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                if (aacyVar12 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar12.b = defpackage.aais.aI("ConversationHistoryCallLogDeleted", 201214);
                break;
            default:
                defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                if (aacyVar13 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar13.b = defpackage.aais.aI("ConversationHistoryNumberBlocked", 201393);
                break;
        }
        return defpackage.aojh.a;
    }
}
