package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jme extends android.content.BroadcastReceiver {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/blockreportspam/ShowBlockReportSpamDialogReceiver");
    private final defpackage.bo b;

    public jme(defpackage.bo boVar) {
        this.b = boVar;
    }

    public static android.content.IntentFilter a() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("show_dialog_to_block_number_and_optionally_report_spam");
        intentFilter.addAction("show_dialog_to_block_number_and_non_checked_optionally_report_spam");
        intentFilter.addAction("show_dialog_to_block_number");
        intentFilter.addAction("show_dialog_to_report_spam_and_block");
        intentFilter.addAction("show_dialog_to_report_not_spam");
        intentFilter.addAction("show_dialog_to_report_not_scam");
        intentFilter.addAction("show_dialog_to_unblock_number");
        intentFilter.addAction("show_dialog_to_block_optionally_report");
        return intentFilter;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    private static jjx b(android.content.Context context, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        defpackage.ahvr.bM(intent.hasExtra("dialog_info"));
        jjx jjxVarT = sns.t(intent, "dialog_info", jjx.a);
        defpackage.zjv zjvVarDQ = hhv.l(context).dQ();
        java.util.Locale locale = java.util.Locale.getDefault();
        java.lang.String str3 = jjxVarT.e;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(jjxVarT.f);
        int iAD = defpackage.a.aD(jjxVarT.g);
        if (iAD != 0) {
            switch (iAD) {
                case 1:
                    str = "UNKNOWN_REPORTING_LOCATION";
                    break;
                case 2:
                    str = "CALL_LOG_HISTORY";
                    break;
                case 3:
                    str = "FEEDBACK_PROMPT";
                    break;
                case 4:
                    str = "VOICEMAIL_HISTORY";
                    break;
                case 5:
                    str = "CONTACT_DETAILS";
                    break;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    str = "SPEAKEASY";
                    break;
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    str = "CALLSCREEN_POST_CALL_SURVEY";
                    break;
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    str = "CALL_DETAILS";
                    break;
                case 9:
                    str = "DOBBY";
                    break;
                case 10:
                    str = "CALL_LOG_CHIP";
                    break;
                default:
                    str = "CALL_LOG_POPUP_MENU";
                    break;
            }
        } else {
            str = "UNKNOWN_REPORTING_LOCATION";
        }
        defpackage.rmt rmtVarB = defpackage.rmt.b(jjxVarT.h);
        if (rmtVarB == null) {
            rmtVarB = defpackage.rmt.UNKNOWN_SOURCE_TYPE;
        }
        java.lang.String strName = rmtVarB.name();
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(jjxVarT.j);
        java.lang.Long lValueOf = java.lang.Long.valueOf(jjxVarT.k);
        utu utuVar = jjxVarT.i;
        if (utuVar == null) {
            utuVar = utu.a;
        }
        java.lang.String str4 = utuVar.e;
        utu utuVar2 = jjxVarT.i;
        if (utuVar2 == null) {
            utuVar2 = utu.a;
        }
        int iAP = defpackage.a.aP(utuVar2.f);
        if (iAP != 0) {
            switch (iAP) {
                case 1:
                    str2 = "UNKNOWN";
                    break;
                case 2:
                    str2 = "NOTIFICATION";
                    break;
                case 3:
                    str2 = "CONVERSATION_HISTORY_CALL_LOG";
                    break;
                case 4:
                    str2 = "VIEW_TRANSCRIPT_CALL_LOG";
                    break;
                case 5:
                    str2 = "VIEW_TRANSCRIPT_CALL_DETAILS";
                    break;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    str2 = "REPORT_SPAM_CALL_LOG";
                    break;
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    str2 = "VOICEMAIL";
                    break;
                default:
                    str2 = "GEMINI_APP";
                    break;
            }
        } else {
            str2 = "UNKNOWN";
        }
        zjvVarDQ.d(defpackage.jme.class, intent, defpackage.aify.p(defpackage.gus.aw(java.lang.String.format(locale, "[countryIso: %s, call_type: %d, reporting_location: %s, contact_source: %s, is_eligible_for_survey: %b, call_creation_time_millis: %d, feedback_ui_info.unique_call_id: %s, feedback_ui_info.feedback_origin: %s]", str3, numValueOf, str, strName, boolValueOf, lValueOf, str4, str2))));
        return jjxVarT;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        defpackage.ahok ahokVarF = hhv.l(context).fi().f(157, "Broadcast to ShowBlockReportSpamDialogReceiver");
        try {
            defpackage.aimz aimzVar = a;
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/blockreportspam/ShowBlockReportSpamDialogReceiver", "onReceive", 122, "ShowBlockReportSpamDialogReceiver.java")).v("enter");
            java.lang.String action = intent.getAction();
            defpackage.ahvr.ci(action);
            switch (action.hashCode()) {
                case -1622385948:
                    if (action.equals("show_dialog_to_report_not_scam")) {
                        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/blockreportspam/ShowBlockReportSpamDialogReceiver", "showDialogToReportNotScam", 243, "ShowBlockReportSpamDialogReceiver.java")).v("enter");
                        jjx jjxVarB = b(context, intent);
                        defpackage.akzx akzxVarM = jmk.a.m();
                        akzxVarM.u();
                        jmk jmkVar = akzxVarM.b;
                        j$.util.Objects.requireNonNull(jjxVarB);
                        jmkVar.d = jjxVarB;
                        jmkVar.b |= 2;
                        jmk jmkVarR = akzxVarM.r();
                        jkp jkpVar = new jkp();
                        defpackage.amxr.g(jkpVar);
                        defpackage.ahgl.b(jkpVar, jmkVarR);
                        jkpVar.r(this.b, "NotScamDialog");
                        ahokVarF.close();
                        return;
                    }
                    throw new java.lang.IllegalStateException(defpackage.a.bx(action, "Unsupported action: "));
                case -1622373455:
                    if (action.equals("show_dialog_to_report_not_spam")) {
                        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/blockreportspam/ShowBlockReportSpamDialogReceiver", "showDialogToReportNotSpam", 230, "ShowBlockReportSpamDialogReceiver.java")).v("enter");
                        jjx jjxVarB2 = b(context, intent);
                        defpackage.akzx akzxVarM2 = jmk.a.m();
                        akzxVarM2.u();
                        jmk jmkVar2 = akzxVarM2.b;
                        j$.util.Objects.requireNonNull(jjxVarB2);
                        jmkVar2.d = jjxVarB2;
                        jmkVar2.b |= 2;
                        jmk jmkVarR2 = akzxVarM2.r();
                        jks jksVar = new jks();
                        defpackage.amxr.g(jksVar);
                        defpackage.ahgl.b(jksVar, jmkVarR2);
                        jksVar.r(this.b, "NotSpamDialog");
                        ahokVarF.close();
                        return;
                    }
                    throw new java.lang.IllegalStateException(defpackage.a.bx(action, "Unsupported action: "));
                case -1363460439:
                    if (action.equals("show_dialog_to_block_number_and_non_checked_optionally_report_spam")) {
                        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/blockreportspam/ShowBlockReportSpamDialogReceiver", "showDialogToBlockNumberAndNonCheckedOptionallyReportSpam", 177, "ShowBlockReportSpamDialogReceiver.java")).v("enter");
                        jjx jjxVarB3 = b(context, intent);
                        defpackage.ahpm ahpmVarG = defpackage.ahns.g();
                        try {
                            defpackage.akzx akzxVarM3 = jmk.a.m();
                            java.lang.String string = context.getString(2132017573);
                            akzxVarM3.u();
                            jmk jmkVar3 = akzxVarM3.b;
                            j$.util.Objects.requireNonNull(string);
                            jmkVar3.b |= 1;
                            jmkVar3.c = string;
                            akzxVarM3.u();
                            jmk jmkVar4 = akzxVarM3.b;
                            j$.util.Objects.requireNonNull(jjxVarB3);
                            jmkVar4.d = jjxVarB3;
                            jmkVar4.b |= 2;
                            jke.a(akzxVarM3.r()).r(this.b, "BlockReportSpamDialog");
                            ahpmVarG.close();
                            ahokVarF.close();
                            return;
                        } catch (java.lang.Throwable th) {
                            try {
                                ahpmVarG.close();
                                break;
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    throw new java.lang.IllegalStateException(defpackage.a.bx(action, "Unsupported action: "));
                case -1360348573:
                    if (action.equals("show_dialog_to_unblock_number")) {
                        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/blockreportspam/ShowBlockReportSpamDialogReceiver", "showDialogToUnblockNumber", 255, "ShowBlockReportSpamDialogReceiver.java")).v("enter");
                        jjx jjxVarB4 = b(context, intent);
                        defpackage.akzx akzxVarM4 = jmk.a.m();
                        akzxVarM4.u();
                        jmk jmkVar5 = akzxVarM4.b;
                        j$.util.Objects.requireNonNull(jjxVarB4);
                        jmkVar5.d = jjxVarB4;
                        jmkVar5.b |= 2;
                        jmk jmkVarR3 = akzxVarM4.r();
                        jmn jmnVar = new jmn();
                        defpackage.amxr.g(jmnVar);
                        defpackage.ahgl.b(jmnVar, jmkVarR3);
                        jmnVar.r(this.b, "UnblockDialog");
                        ahokVarF.close();
                        return;
                    }
                    throw new java.lang.IllegalStateException(defpackage.a.bx(action, "Unsupported action: "));
                case -1336343841:
                    if (action.equals("show_dialog_to_block_number_and_optionally_report_spam")) {
                        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/blockreportspam/ShowBlockReportSpamDialogReceiver", "showDialogToBlockNumberAndOptionallyReportSpam", 157, "ShowBlockReportSpamDialogReceiver.java")).v("enter");
                        jjx jjxVarB5 = b(context, intent);
                        defpackage.ahpm ahpmVarG2 = defpackage.ahns.g();
                        try {
                            defpackage.akzx akzxVarM5 = jmk.a.m();
                            java.lang.String string2 = context.getString(2132017573);
                            akzxVarM5.u();
                            jmk jmkVar6 = akzxVarM5.b;
                            j$.util.Objects.requireNonNull(string2);
                            jmkVar6.b |= 1;
                            jmkVar6.c = string2;
                            akzxVarM5.u();
                            jmk jmkVar7 = akzxVarM5.b;
                            j$.util.Objects.requireNonNull(jjxVarB5);
                            jmkVar7.d = jjxVarB5;
                            jmkVar7.b |= 2;
                            akzxVarM5.u();
                            jmk jmkVar8 = akzxVarM5.b;
                            jmkVar8.b |= 4;
                            jmkVar8.e = true;
                            jke.a(akzxVarM5.r()).r(this.b, "BlockReportSpamDialog");
                            ahpmVarG2.close();
                            ahokVarF.close();
                            return;
                        } catch (java.lang.Throwable th3) {
                            try {
                                ahpmVarG2.close();
                                break;
                            } catch (java.lang.Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                    throw new java.lang.IllegalStateException(defpackage.a.bx(action, "Unsupported action: "));
                case -1038238677:
                    if (action.equals("show_dialog_to_report_spam_and_block")) {
                        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/blockreportspam/ShowBlockReportSpamDialogReceiver", "showDialogToReportSpamAndBlock", 217, "ShowBlockReportSpamDialogReceiver.java")).v("enter");
                        jjx jjxVarB6 = b(context, intent);
                        defpackage.akzx akzxVarM6 = jmk.a.m();
                        akzxVarM6.u();
                        jmk jmkVar9 = akzxVarM6.b;
                        j$.util.Objects.requireNonNull(jjxVarB6);
                        jmkVar9.d = jjxVarB6;
                        jmkVar9.b |= 2;
                        jmk jmkVarR4 = akzxVarM6.r();
                        jkx jkxVar = new jkx();
                        defpackage.amxr.g(jkxVar);
                        defpackage.ahgl.b(jkxVar, jmkVarR4);
                        jkxVar.r(this.b, "SpamAndBlockDialog");
                        ahokVarF.close();
                        return;
                    }
                    throw new java.lang.IllegalStateException(defpackage.a.bx(action, "Unsupported action: "));
                case -226212763:
                    if (action.equals("show_dialog_to_block_optionally_report")) {
                        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/blockreportspam/ShowBlockReportSpamDialogReceiver", "showDialogToBlockOptionallyReport", 267, "ShowBlockReportSpamDialogReceiver.java")).v("enter");
                        jjx jjxVarB7 = b(context, intent);
                        defpackage.akzx akzxVarM7 = jmk.a.m();
                        akzxVarM7.u();
                        jmk jmkVar10 = akzxVarM7.b;
                        j$.util.Objects.requireNonNull(jjxVarB7);
                        jmkVar10.d = jjxVarB7;
                        jmkVar10.b |= 2;
                        jmk jmkVarR5 = akzxVarM7.r();
                        jjf jjfVar = new jjf();
                        defpackage.amxr.g(jjfVar);
                        defpackage.ahgl.b(jjfVar, jmkVarR5);
                        jjfVar.r(this.b, "BlockOptionallyReportDialog");
                        ahokVarF.close();
                        return;
                    }
                    throw new java.lang.IllegalStateException(defpackage.a.bx(action, "Unsupported action: "));
                case 513212682:
                    if (action.equals("show_dialog_to_block_number")) {
                        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/blockreportspam/ShowBlockReportSpamDialogReceiver", "showDialogToBlockNumber", 201, "ShowBlockReportSpamDialogReceiver.java")).v("enter");
                        jjx jjxVarB8 = b(context, intent);
                        defpackage.ahpm ahpmVarG3 = defpackage.ahns.g();
                        try {
                            defpackage.akzx akzxVarM8 = jmk.a.m();
                            akzxVarM8.u();
                            jmk jmkVar11 = akzxVarM8.b;
                            j$.util.Objects.requireNonNull(jjxVarB8);
                            jmkVar11.d = jjxVarB8;
                            jmkVar11.b |= 2;
                            jmk jmkVarR6 = akzxVarM8.r();
                            jiz jizVar = new jiz();
                            defpackage.amxr.g(jizVar);
                            defpackage.ahgl.b(jizVar, jmkVarR6);
                            jizVar.r(this.b, "BlockDialog");
                            ahpmVarG3.close();
                            ahokVarF.close();
                            return;
                        } catch (java.lang.Throwable th5) {
                            try {
                                ahpmVarG3.close();
                                break;
                            } catch (java.lang.Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    }
                    throw new java.lang.IllegalStateException(defpackage.a.bx(action, "Unsupported action: "));
                default:
                    throw new java.lang.IllegalStateException(defpackage.a.bx(action, "Unsupported action: "));
            }
        } catch (java.lang.Throwable th7) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }
}
