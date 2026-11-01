package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mdl implements defpackage.zaq {
    @Override // defpackage.zaq
    public final java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.adcm adcmVar = new defpackage.adcm(null);
        final int i = 6;
        defpackage.aonj aonjVar = new defpackage.aonj() { // from class: mdi
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i) {
                    case 0:
                        defpackage.aacy aacyVar = (defpackage.aacy) obj;
                        if (aacyVar == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar.b = defpackage.mce.ON_INCOMING_CALL_SCREENING_ACCEPTED;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.PRODUCE_ANSWER_MODEL_FAILURE;
                        ajniVar.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.ajni ajniVar2 = (defpackage.ajni) obj;
                        if (ajniVar2 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar2.b = defpackage.mcd.CALL_SCREENING_SERVICE_TIMEOUT_UNBIND;
                        ajniVar2.c = defpackage.zar.TIMEOUT_FAILURE;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar2 = (defpackage.aacy) obj;
                        if (aacyVar2 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar2.b = defpackage.aais.aI("UserManuallyScreenedCallFromNotification", 165458);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                        if (ajniVar3 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar3.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar3.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                        if (aacyVar3 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar3.b = defpackage.aais.aI("UserManuallyScreenedCallFromAnswerScreen", 165459);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                        if (aacyVar4 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar4.b = defpackage.aais.aI("IncomingCallNotificationInitialized", 162191);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                        if (ajniVar4 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar4.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar4.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                        if (aacyVar5 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar5.b = defpackage.aais.aI("UserAnsweredCallAsRttFromAnswerScreen", 167412);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                        if (aacyVar6 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar6.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar7.b = defpackage.aais.aI("IncomingCallAnswerScreenShown", 162192);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar5 = (defpackage.ajni) obj;
                        if (ajniVar5 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar5.b = defpackage.mcd.ACCEPT_RTT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar5.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar8.b = defpackage.aais.aI("UserAnsweredCallFromNotificationToChronometerShown", 167402);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar9.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar10.b = defpackage.aais.aI("UserRejectedCallFromAnswerScreen", 167408);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar11.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_TELECOM, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar12.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar13.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED_ACTIVE, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    default:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar = new defpackage.aacy(null, null, null);
        aonjVar.a(aacyVar);
        adcmVar.h = aacyVar;
        adcmVar.i = defpackage.mce.ON_CALL_ADDED;
        adcmVar.a = defpackage.mce.INCOMING_CALL_NOTIFICATION_REQUESTED;
        defpackage.mce mceVar = defpackage.mce.ON_CALL_REMOVED;
        final int i2 = 0;
        final int i3 = 1;
        final int i4 = 2;
        final int i5 = 3;
        final int i6 = 4;
        adcmVar.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar, defpackage.mce.STATUS_BAR_NOTIFICATION_MODEL_EMPTY, defpackage.mce.STATUS_BAR_NOTIFICATION_MODEL_INHIBITED, defpackage.mce.ON_CALL_ACTIVATED_BUT_NEVER_RANG, defpackage.mce.DOBBY_SILENTLY_SCREENING_NOTIFICATION_REQUESTED, defpackage.mce.REVELIO_NOTIFICATION_REQUESTED}));
        defpackage.aonj aonjVar2 = new defpackage.aonj() { // from class: mdi
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i3) {
                    case 0:
                        defpackage.aacy aacyVar2 = (defpackage.aacy) obj;
                        if (aacyVar2 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar2.b = defpackage.mce.ON_INCOMING_CALL_SCREENING_ACCEPTED;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.PRODUCE_ANSWER_MODEL_FAILURE;
                        ajniVar.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.ajni ajniVar2 = (defpackage.ajni) obj;
                        if (ajniVar2 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar2.b = defpackage.mcd.CALL_SCREENING_SERVICE_TIMEOUT_UNBIND;
                        ajniVar2.c = defpackage.zar.TIMEOUT_FAILURE;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                        if (aacyVar3 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar3.b = defpackage.aais.aI("UserManuallyScreenedCallFromNotification", 165458);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                        if (ajniVar3 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar3.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar3.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                        if (aacyVar4 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar4.b = defpackage.aais.aI("UserManuallyScreenedCallFromAnswerScreen", 165459);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                        if (aacyVar5 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar5.b = defpackage.aais.aI("IncomingCallNotificationInitialized", 162191);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                        if (ajniVar4 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar4.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar4.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                        if (aacyVar6 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar6.b = defpackage.aais.aI("UserAnsweredCallAsRttFromAnswerScreen", 167412);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar7.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar8.b = defpackage.aais.aI("IncomingCallAnswerScreenShown", 162192);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar5 = (defpackage.ajni) obj;
                        if (ajniVar5 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar5.b = defpackage.mcd.ACCEPT_RTT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar5.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar9.b = defpackage.aais.aI("UserAnsweredCallFromNotificationToChronometerShown", 167402);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar10.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar11.b = defpackage.aais.aI("UserRejectedCallFromAnswerScreen", 167408);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar12.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_TELECOM, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar13.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar14.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED_ACTIVE, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    default:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar = new defpackage.ajni(null);
        aonjVar2.a(ajniVar);
        java.util.Set setSingleton = java.util.Collections.singleton(ajniVar);
        defpackage.aooh.e(setSingleton, "singleton(...)");
        adcmVar.f(setSingleton);
        arrayList.add(adcmVar.c());
        defpackage.adcm adcmVar2 = new defpackage.adcm(null);
        final int i7 = 10;
        defpackage.aonj aonjVar3 = new defpackage.aonj() { // from class: mdi
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i7) {
                    case 0:
                        defpackage.aacy aacyVar2 = (defpackage.aacy) obj;
                        if (aacyVar2 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar2.b = defpackage.mce.ON_INCOMING_CALL_SCREENING_ACCEPTED;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.ajni ajniVar2 = (defpackage.ajni) obj;
                        if (ajniVar2 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar2.b = defpackage.mcd.PRODUCE_ANSWER_MODEL_FAILURE;
                        ajniVar2.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                        if (ajniVar3 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar3.b = defpackage.mcd.CALL_SCREENING_SERVICE_TIMEOUT_UNBIND;
                        ajniVar3.c = defpackage.zar.TIMEOUT_FAILURE;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                        if (aacyVar3 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar3.b = defpackage.aais.aI("UserManuallyScreenedCallFromNotification", 165458);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                        if (ajniVar4 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar4.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar4.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                        if (aacyVar4 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar4.b = defpackage.aais.aI("UserManuallyScreenedCallFromAnswerScreen", 165459);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                        if (aacyVar5 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar5.b = defpackage.aais.aI("IncomingCallNotificationInitialized", 162191);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar5 = (defpackage.ajni) obj;
                        if (ajniVar5 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar5.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar5.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                        if (aacyVar6 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar6.b = defpackage.aais.aI("UserAnsweredCallAsRttFromAnswerScreen", 167412);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar7.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar8.b = defpackage.aais.aI("IncomingCallAnswerScreenShown", 162192);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar6 = (defpackage.ajni) obj;
                        if (ajniVar6 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar6.b = defpackage.mcd.ACCEPT_RTT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar6.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar9.b = defpackage.aais.aI("UserAnsweredCallFromNotificationToChronometerShown", 167402);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar10.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar11.b = defpackage.aais.aI("UserRejectedCallFromAnswerScreen", 167408);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar12.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_TELECOM, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar13.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar14.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED_ACTIVE, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    default:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar2 = new defpackage.aacy(null, null, null);
        aonjVar3.a(aacyVar2);
        adcmVar2.h = aacyVar2;
        adcmVar2.i = defpackage.mce.ANSWER_SCREEN_CREATED;
        adcmVar2.a = defpackage.mce.CONTACT_INFO_SHOWN;
        defpackage.mce mceVar2 = defpackage.mce.ON_IN_CALL_ACTIVITY_STOPPED;
        defpackage.mce mceVar3 = defpackage.mce.ON_IN_CALL_ACTIVITY_DESTROYED;
        defpackage.mce mceVar4 = defpackage.mce.CONTACT_INFO_NOT_SHOWN_BECAUSE_DISPLAY_OFF;
        adcmVar2.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar2, mceVar3, mceVar4}));
        final int i8 = 20;
        defpackage.aonj aonjVar4 = new defpackage.aonj() { // from class: mdi
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i8) {
                    case 0:
                        defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                        if (aacyVar3 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar3.b = defpackage.mce.ON_INCOMING_CALL_SCREENING_ACCEPTED;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.ajni ajniVar2 = (defpackage.ajni) obj;
                        if (ajniVar2 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar2.b = defpackage.mcd.PRODUCE_ANSWER_MODEL_FAILURE;
                        ajniVar2.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                        if (ajniVar3 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar3.b = defpackage.mcd.CALL_SCREENING_SERVICE_TIMEOUT_UNBIND;
                        ajniVar3.c = defpackage.zar.TIMEOUT_FAILURE;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                        if (aacyVar4 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar4.b = defpackage.aais.aI("UserManuallyScreenedCallFromNotification", 165458);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                        if (ajniVar4 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar4.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar4.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                        if (aacyVar5 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar5.b = defpackage.aais.aI("UserManuallyScreenedCallFromAnswerScreen", 165459);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                        if (aacyVar6 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar6.b = defpackage.aais.aI("IncomingCallNotificationInitialized", 162191);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar5 = (defpackage.ajni) obj;
                        if (ajniVar5 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar5.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar5.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar7.b = defpackage.aais.aI("UserAnsweredCallAsRttFromAnswerScreen", 167412);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar8.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar9.b = defpackage.aais.aI("IncomingCallAnswerScreenShown", 162192);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar6 = (defpackage.ajni) obj;
                        if (ajniVar6 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar6.b = defpackage.mcd.ACCEPT_RTT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar6.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar10.b = defpackage.aais.aI("UserAnsweredCallFromNotificationToChronometerShown", 167402);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar11.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("UserRejectedCallFromAnswerScreen", 167408);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar13.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_TELECOM, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar14.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar15.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED_ACTIVE, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    default:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar2 = new defpackage.ajni(null);
        aonjVar4.a(ajniVar2);
        java.util.Set setSingleton2 = java.util.Collections.singleton(ajniVar2);
        defpackage.aooh.e(setSingleton2, "singleton(...)");
        adcmVar2.f(setSingleton2);
        arrayList.add(adcmVar2.c());
        defpackage.adcm adcmVar3 = new defpackage.adcm(null);
        defpackage.aonj aonjVar5 = new defpackage.aonj() { // from class: mdj
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i7) {
                    case 0:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                        if (aacyVar3 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar3.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_ANSWERED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                    case 4:
                        defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                        if (aacyVar4 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar4.b = defpackage.aais.aI("MissedCallNotificationShown", 166973);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                        if (aacyVar5 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar5.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToChronometerShown", 167410);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                        if (aacyVar6 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar6.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                        if (ajniVar3 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar3.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar3.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar7.b = defpackage.aais.aI("UserClickedRejectCallWithTextFromAnswerScreen", 166757);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar8.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToContactInfoShown", 169607);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar9.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar10.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.EMERGENCY_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN, defpackage.mce.CHRONOMETER_SHOWN});
                        aacyVar10.a = defpackage.aais.aI("UserAnsweredEmergencyCallbackFromAnswerScreenToEmergencyVoiceScreenShown", 179243);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                        if (ajniVar4 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar4.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar4.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.ajni ajniVar5 = (defpackage.ajni) obj;
                        if (ajniVar5 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar5.b = defpackage.mcd.GET_MISSED_CALLS_PERMISSION_DENIED;
                        ajniVar5.c = defpackage.zar.PERMISSION_DENIED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar3 = new defpackage.aacy(null, null, null);
        aonjVar5.a(aacyVar3);
        adcmVar3.h = aacyVar3;
        adcmVar3.i = defpackage.mce.USER_CLICKED_REJECT_CALL_WITH_TEXT_FROM_ANSWER_SCREEN;
        adcmVar3.a = defpackage.mce.REJECT_CALL_WITH_TEXT_DIALOG_SHOWN;
        adcmVar3.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar2, mceVar3}));
        arrayList.add(adcmVar3.c());
        defpackage.adcm adcmVar4 = new defpackage.adcm(null);
        defpackage.mdk mdkVar = new defpackage.mdk(1);
        defpackage.aacy aacyVar4 = new defpackage.aacy(null, null, null);
        mdkVar.a(aacyVar4);
        adcmVar4.h = aacyVar4;
        adcmVar4.i = defpackage.mce.USER_CLICKED_REJECT_CALL_FROM_NOTIFICATION;
        defpackage.mdk mdkVar2 = new defpackage.mdk(0);
        defpackage.aacy aacyVar5 = new defpackage.aacy();
        mdkVar2.a(aacyVar5);
        defpackage.mdk mdkVar3 = new defpackage.mdk(2);
        defpackage.aacy aacyVar6 = new defpackage.aacy();
        mdkVar3.a(aacyVar6);
        adcmVar4.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar5, aacyVar6}));
        arrayList.add(adcmVar4.c());
        defpackage.aaif aaifVarAI = defpackage.aais.aI("RejectCallWithTextScreenFinished", 166864);
        defpackage.adcm adcmVar5 = new defpackage.adcm(null);
        defpackage.mcx mcxVar = new defpackage.mcx(aaifVarAI, 17);
        defpackage.aacy aacyVar7 = new defpackage.aacy(null, null, null);
        mcxVar.a(aacyVar7);
        adcmVar5.h = aacyVar7;
        adcmVar5.i = defpackage.mce.USER_SENDS_CUSTOM_TEXT_RESPONSE;
        defpackage.mce mceVar5 = defpackage.mce.ANSWER_SCREEN_DESTROYED;
        adcmVar5.a = mceVar5;
        arrayList.add(adcmVar5.c());
        defpackage.adcm adcmVar6 = new defpackage.adcm(null);
        defpackage.mcx mcxVar2 = new defpackage.mcx(aaifVarAI, 18);
        defpackage.aacy aacyVar8 = new defpackage.aacy(null, null, null);
        mcxVar2.a(aacyVar8);
        adcmVar6.h = aacyVar8;
        adcmVar6.i = defpackage.mce.USER_CLICKED_CANNED_TEXT_RESPONSE_TO_REPLY;
        adcmVar6.a = mceVar5;
        arrayList.add(adcmVar6.c());
        defpackage.adcm adcmVar7 = new defpackage.adcm(null);
        final int i9 = 16;
        defpackage.aonj aonjVar6 = new defpackage.aonj() { // from class: mdi
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i9) {
                    case 0:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar9.b = defpackage.mce.ON_INCOMING_CALL_SCREENING_ACCEPTED;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                        if (ajniVar3 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar3.b = defpackage.mcd.PRODUCE_ANSWER_MODEL_FAILURE;
                        ajniVar3.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                        if (ajniVar4 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar4.b = defpackage.mcd.CALL_SCREENING_SERVICE_TIMEOUT_UNBIND;
                        ajniVar4.c = defpackage.zar.TIMEOUT_FAILURE;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar10.b = defpackage.aais.aI("UserManuallyScreenedCallFromNotification", 165458);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.ajni ajniVar5 = (defpackage.ajni) obj;
                        if (ajniVar5 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar5.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar5.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar11.b = defpackage.aais.aI("UserManuallyScreenedCallFromAnswerScreen", 165459);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("IncomingCallNotificationInitialized", 162191);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar6 = (defpackage.ajni) obj;
                        if (ajniVar6 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar6.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar6.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar13.b = defpackage.aais.aI("UserAnsweredCallAsRttFromAnswerScreen", 167412);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar14.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("IncomingCallAnswerScreenShown", 162192);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar7 = (defpackage.ajni) obj;
                        if (ajniVar7 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar7.b = defpackage.mcd.ACCEPT_RTT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar7.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("UserAnsweredCallFromNotificationToChronometerShown", 167402);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar17.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("UserRejectedCallFromAnswerScreen", 167408);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar19.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_TELECOM, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED_ACTIVE, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    default:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar9 = new defpackage.aacy(null, null, null);
        aonjVar6.a(aacyVar9);
        adcmVar7.h = aacyVar9;
        adcmVar7.i = defpackage.mce.USER_REJECTS_CALL_FROM_ANSWER_SCREEN;
        adcmVar7.a = mceVar5;
        arrayList.add(adcmVar7.c());
        defpackage.adcm adcmVar8 = new defpackage.adcm(null);
        defpackage.aonj aonjVar7 = new defpackage.aonj() { // from class: mdj
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i6) {
                    case 0:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar10.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_ANSWERED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                    case 4:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar11.b = defpackage.aais.aI("MissedCallNotificationShown", 166973);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToChronometerShown", 167410);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar13.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                        if (ajniVar3 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar3.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar3.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("UserClickedRejectCallWithTextFromAnswerScreen", 166757);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToContactInfoShown", 169607);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar16.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar17.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.EMERGENCY_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN, defpackage.mce.CHRONOMETER_SHOWN});
                        aacyVar17.a = defpackage.aais.aI("UserAnsweredEmergencyCallbackFromAnswerScreenToEmergencyVoiceScreenShown", 179243);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                        if (ajniVar4 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar4.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar4.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.ajni ajniVar5 = (defpackage.ajni) obj;
                        if (ajniVar5 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar5.b = defpackage.mcd.GET_MISSED_CALLS_PERMISSION_DENIED;
                        ajniVar5.c = defpackage.zar.PERMISSION_DENIED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar10 = new defpackage.aacy(null, null, null);
        aonjVar7.a(aacyVar10);
        adcmVar8.h = aacyVar10;
        adcmVar8.i = defpackage.mce.MISSED_CALL_NOTIFICATION_REQUESTED;
        adcmVar8.a = defpackage.mce.MISSED_CALL_NOTIFICATION_POSTED;
        java.util.Set setSingleton3 = java.util.Collections.singleton(defpackage.mce.MISSED_CALL_NOTIFICATION_INHIBITED);
        defpackage.aooh.e(setSingleton3, "singleton(...)");
        adcmVar8.d(setSingleton3);
        final int i10 = 15;
        defpackage.aonj aonjVar8 = new defpackage.aonj() { // from class: mdj
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i10) {
                    case 0:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar11.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_ANSWERED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                    case 4:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("MissedCallNotificationShown", 166973);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar13.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToChronometerShown", 167410);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar14.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                        if (ajniVar3 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar3.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar3.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("UserClickedRejectCallWithTextFromAnswerScreen", 166757);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToContactInfoShown", 169607);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar17.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar18.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.EMERGENCY_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN, defpackage.mce.CHRONOMETER_SHOWN});
                        aacyVar18.a = defpackage.aais.aI("UserAnsweredEmergencyCallbackFromAnswerScreenToEmergencyVoiceScreenShown", 179243);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                        if (ajniVar4 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar4.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar4.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.ajni ajniVar5 = (defpackage.ajni) obj;
                        if (ajniVar5 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar5.b = defpackage.mcd.GET_MISSED_CALLS_PERMISSION_DENIED;
                        ajniVar5.c = defpackage.zar.PERMISSION_DENIED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar3 = new defpackage.ajni(null);
        aonjVar8.a(ajniVar3);
        defpackage.mdk mdkVar4 = new defpackage.mdk(3);
        defpackage.ajni ajniVar4 = new defpackage.ajni(null);
        mdkVar4.a(ajniVar4);
        defpackage.mdk mdkVar5 = new defpackage.mdk(4);
        defpackage.ajni ajniVar5 = new defpackage.ajni(null);
        mdkVar5.a(ajniVar5);
        defpackage.mdk mdkVar6 = new defpackage.mdk(5);
        defpackage.ajni ajniVar6 = new defpackage.ajni(null);
        mdkVar6.a(ajniVar6);
        adcmVar8.f(defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar3, ajniVar4, ajniVar5, ajniVar6}));
        arrayList.add(adcmVar8.c());
        defpackage.aaif aaifVarAI2 = defpackage.aais.aI("UserAnsweredCallAsRttFromNotification", 167404);
        defpackage.adcm adcmVar9 = new defpackage.adcm(null);
        defpackage.mcx mcxVar3 = new defpackage.mcx(aaifVarAI2, 19);
        defpackage.aacy aacyVar11 = new defpackage.aacy(null, null, null);
        mcxVar3.a(aacyVar11);
        adcmVar9.h = aacyVar11;
        adcmVar9.i = defpackage.mce.USER_CLICKED_ANSWER_CALL_AS_RTT_FROM_NOTIFICATION;
        defpackage.mdk mdkVar7 = new defpackage.mdk(6);
        defpackage.aacy aacyVar12 = new defpackage.aacy();
        mdkVar7.a(aacyVar12);
        java.util.Set setSingleton4 = java.util.Collections.singleton(aacyVar12);
        defpackage.aooh.e(setSingleton4, "singleton(...)");
        adcmVar9.g(setSingleton4);
        adcmVar9.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar, mceVar2, mceVar3}));
        defpackage.mdf mdfVar = new defpackage.mdf(20);
        defpackage.ajni ajniVar7 = new defpackage.ajni(null);
        mdfVar.a(ajniVar7);
        java.util.Set setSingleton5 = java.util.Collections.singleton(ajniVar7);
        defpackage.aooh.e(setSingleton5, "singleton(...)");
        adcmVar9.f(setSingleton5);
        arrayList.add(adcmVar9.c());
        defpackage.aaif aaifVarAI3 = defpackage.aais.aI("IncomingCallAcceptedViaCallScreeningService", 167392);
        defpackage.aaif aaifVarAI4 = defpackage.aais.aI("IncomingCallRejectedViaCallScreeningService", 167394);
        defpackage.aaif aaifVarAI5 = defpackage.aais.aI("IncomingCallSilencedViaCallScreeningService", 167396);
        defpackage.adcm adcmVar10 = new defpackage.adcm(null);
        final int i11 = 11;
        defpackage.mcx mcxVar4 = new defpackage.mcx(aaifVarAI3, 11);
        defpackage.aacy aacyVar13 = new defpackage.aacy(null, null, null);
        mcxVar4.a(aacyVar13);
        adcmVar10.h = aacyVar13;
        adcmVar10.i = defpackage.mce.ON_INCOMING_CALL_SCREENING_STARTED;
        defpackage.aonj aonjVar9 = new defpackage.aonj() { // from class: mdi
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i2) {
                    case 0:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar14.b = defpackage.mce.ON_INCOMING_CALL_SCREENING_ACCEPTED;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.ajni ajniVar8 = (defpackage.ajni) obj;
                        if (ajniVar8 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar8.b = defpackage.mcd.PRODUCE_ANSWER_MODEL_FAILURE;
                        ajniVar8.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.ajni ajniVar9 = (defpackage.ajni) obj;
                        if (ajniVar9 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar9.b = defpackage.mcd.CALL_SCREENING_SERVICE_TIMEOUT_UNBIND;
                        ajniVar9.c = defpackage.zar.TIMEOUT_FAILURE;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("UserManuallyScreenedCallFromNotification", 165458);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.ajni ajniVar10 = (defpackage.ajni) obj;
                        if (ajniVar10 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar10.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar10.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("UserManuallyScreenedCallFromAnswerScreen", 165459);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("IncomingCallNotificationInitialized", 162191);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar11 = (defpackage.ajni) obj;
                        if (ajniVar11 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar11.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar11.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("UserAnsweredCallAsRttFromAnswerScreen", 167412);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar19.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("IncomingCallAnswerScreenShown", 162192);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar12 = (defpackage.ajni) obj;
                        if (ajniVar12 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar12.b = defpackage.mcd.ACCEPT_RTT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar12.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("UserAnsweredCallFromNotificationToChronometerShown", 167402);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar112.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("UserRejectedCallFromAnswerScreen", 167408);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_TELECOM, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED_ACTIVE, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    default:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar14 = new defpackage.aacy();
        aonjVar9.a(aacyVar14);
        final int i12 = 12;
        defpackage.mcx mcxVar5 = new defpackage.mcx(aaifVarAI4, 12);
        defpackage.aacy aacyVar15 = new defpackage.aacy();
        mcxVar5.a(aacyVar15);
        final int i13 = 13;
        defpackage.mcx mcxVar6 = new defpackage.mcx(aaifVarAI5, 13);
        defpackage.aacy aacyVar16 = new defpackage.aacy();
        mcxVar6.a(aacyVar16);
        adcmVar10.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar14, aacyVar15, aacyVar16}));
        defpackage.aonj aonjVar10 = new defpackage.aonj() { // from class: mdi
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i4) {
                    case 0:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar17.b = defpackage.mce.ON_INCOMING_CALL_SCREENING_ACCEPTED;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.ajni ajniVar8 = (defpackage.ajni) obj;
                        if (ajniVar8 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar8.b = defpackage.mcd.PRODUCE_ANSWER_MODEL_FAILURE;
                        ajniVar8.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.ajni ajniVar9 = (defpackage.ajni) obj;
                        if (ajniVar9 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar9.b = defpackage.mcd.CALL_SCREENING_SERVICE_TIMEOUT_UNBIND;
                        ajniVar9.c = defpackage.zar.TIMEOUT_FAILURE;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("UserManuallyScreenedCallFromNotification", 165458);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.ajni ajniVar10 = (defpackage.ajni) obj;
                        if (ajniVar10 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar10.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar10.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("UserManuallyScreenedCallFromAnswerScreen", 165459);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("IncomingCallNotificationInitialized", 162191);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar11 = (defpackage.ajni) obj;
                        if (ajniVar11 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar11.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar11.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("UserAnsweredCallAsRttFromAnswerScreen", 167412);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar112.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("IncomingCallAnswerScreenShown", 162192);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar12 = (defpackage.ajni) obj;
                        if (ajniVar12 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar12.b = defpackage.mcd.ACCEPT_RTT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar12.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserAnsweredCallFromNotificationToChronometerShown", 167402);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("UserRejectedCallFromAnswerScreen", 167408);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_TELECOM, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED_ACTIVE, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    default:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar8 = new defpackage.ajni(null);
        aonjVar10.a(ajniVar8);
        java.util.Set setSingleton6 = java.util.Collections.singleton(ajniVar8);
        defpackage.aooh.e(setSingleton6, "singleton(...)");
        adcmVar10.f(setSingleton6);
        arrayList.add(adcmVar10.c());
        defpackage.adcm adcmVar11 = new defpackage.adcm(null);
        defpackage.aonj aonjVar11 = new defpackage.aonj() { // from class: mdi
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i5) {
                    case 0:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar17.b = defpackage.mce.ON_INCOMING_CALL_SCREENING_ACCEPTED;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.ajni ajniVar9 = (defpackage.ajni) obj;
                        if (ajniVar9 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar9.b = defpackage.mcd.PRODUCE_ANSWER_MODEL_FAILURE;
                        ajniVar9.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.ajni ajniVar10 = (defpackage.ajni) obj;
                        if (ajniVar10 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar10.b = defpackage.mcd.CALL_SCREENING_SERVICE_TIMEOUT_UNBIND;
                        ajniVar10.c = defpackage.zar.TIMEOUT_FAILURE;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("UserManuallyScreenedCallFromNotification", 165458);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.ajni ajniVar11 = (defpackage.ajni) obj;
                        if (ajniVar11 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar11.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar11.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("UserManuallyScreenedCallFromAnswerScreen", 165459);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("IncomingCallNotificationInitialized", 162191);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar12 = (defpackage.ajni) obj;
                        if (ajniVar12 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar12.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar12.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("UserAnsweredCallAsRttFromAnswerScreen", 167412);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar112.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("IncomingCallAnswerScreenShown", 162192);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar13 = (defpackage.ajni) obj;
                        if (ajniVar13 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar13.b = defpackage.mcd.ACCEPT_RTT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar13.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserAnsweredCallFromNotificationToChronometerShown", 167402);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("UserRejectedCallFromAnswerScreen", 167408);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_TELECOM, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED_ACTIVE, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    default:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar17 = new defpackage.aacy(null, null, null);
        aonjVar11.a(aacyVar17);
        adcmVar11.h = aacyVar17;
        adcmVar11.i = defpackage.mce.INCOMING_CALL_SCREENED_FROM_NOTIFICATION;
        defpackage.mce mceVar6 = defpackage.mce.CALL_SCREENING_INITIALIZED;
        adcmVar11.a = mceVar6;
        java.util.Set setSingleton7 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton7, "singleton(...)");
        adcmVar11.d(setSingleton7);
        final int i14 = 4;
        defpackage.aonj aonjVar12 = new defpackage.aonj() { // from class: mdi
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i14) {
                    case 0:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar18.b = defpackage.mce.ON_INCOMING_CALL_SCREENING_ACCEPTED;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.ajni ajniVar9 = (defpackage.ajni) obj;
                        if (ajniVar9 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar9.b = defpackage.mcd.PRODUCE_ANSWER_MODEL_FAILURE;
                        ajniVar9.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.ajni ajniVar10 = (defpackage.ajni) obj;
                        if (ajniVar10 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar10.b = defpackage.mcd.CALL_SCREENING_SERVICE_TIMEOUT_UNBIND;
                        ajniVar10.c = defpackage.zar.TIMEOUT_FAILURE;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("UserManuallyScreenedCallFromNotification", 165458);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.ajni ajniVar11 = (defpackage.ajni) obj;
                        if (ajniVar11 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar11.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar11.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("UserManuallyScreenedCallFromAnswerScreen", 165459);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("IncomingCallNotificationInitialized", 162191);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar12 = (defpackage.ajni) obj;
                        if (ajniVar12 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar12.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar12.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserAnsweredCallAsRttFromAnswerScreen", 167412);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("IncomingCallAnswerScreenShown", 162192);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar13 = (defpackage.ajni) obj;
                        if (ajniVar13 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar13.b = defpackage.mcd.ACCEPT_RTT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar13.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("UserAnsweredCallFromNotificationToChronometerShown", 167402);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar117.b = defpackage.aais.aI("UserRejectedCallFromAnswerScreen", 167408);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_TELECOM, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED_ACTIVE, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    default:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar9 = new defpackage.ajni(null);
        aonjVar12.a(ajniVar9);
        java.util.Set setSingleton8 = java.util.Collections.singleton(ajniVar9);
        defpackage.aooh.e(setSingleton8, "singleton(...)");
        adcmVar11.f(setSingleton8);
        arrayList.add(adcmVar11.c());
        defpackage.adcm adcmVar12 = new defpackage.adcm(null);
        final int i15 = 5;
        defpackage.aonj aonjVar13 = new defpackage.aonj() { // from class: mdi
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i15) {
                    case 0:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar18.b = defpackage.mce.ON_INCOMING_CALL_SCREENING_ACCEPTED;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.ajni ajniVar10 = (defpackage.ajni) obj;
                        if (ajniVar10 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar10.b = defpackage.mcd.PRODUCE_ANSWER_MODEL_FAILURE;
                        ajniVar10.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.ajni ajniVar11 = (defpackage.ajni) obj;
                        if (ajniVar11 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar11.b = defpackage.mcd.CALL_SCREENING_SERVICE_TIMEOUT_UNBIND;
                        ajniVar11.c = defpackage.zar.TIMEOUT_FAILURE;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("UserManuallyScreenedCallFromNotification", 165458);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.ajni ajniVar12 = (defpackage.ajni) obj;
                        if (ajniVar12 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar12.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar12.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("UserManuallyScreenedCallFromAnswerScreen", 165459);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("IncomingCallNotificationInitialized", 162191);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar13 = (defpackage.ajni) obj;
                        if (ajniVar13 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar13.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar13.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserAnsweredCallAsRttFromAnswerScreen", 167412);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("IncomingCallAnswerScreenShown", 162192);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar14 = (defpackage.ajni) obj;
                        if (ajniVar14 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar14.b = defpackage.mcd.ACCEPT_RTT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar14.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("UserAnsweredCallFromNotificationToChronometerShown", 167402);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar117.b = defpackage.aais.aI("UserRejectedCallFromAnswerScreen", 167408);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_TELECOM, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED_ACTIVE, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    default:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar18 = new defpackage.aacy(null, null, null);
        aonjVar13.a(aacyVar18);
        adcmVar12.h = aacyVar18;
        adcmVar12.i = defpackage.mce.INCOMING_CALL_SCREENED_FROM_ANSWER_SCREEN;
        adcmVar12.a = mceVar6;
        java.util.Set setSingleton9 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton9, "singleton(...)");
        adcmVar12.d(setSingleton9);
        final int i16 = 7;
        defpackage.aonj aonjVar14 = new defpackage.aonj() { // from class: mdi
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i16) {
                    case 0:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar19.b = defpackage.mce.ON_INCOMING_CALL_SCREENING_ACCEPTED;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.ajni ajniVar10 = (defpackage.ajni) obj;
                        if (ajniVar10 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar10.b = defpackage.mcd.PRODUCE_ANSWER_MODEL_FAILURE;
                        ajniVar10.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.ajni ajniVar11 = (defpackage.ajni) obj;
                        if (ajniVar11 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar11.b = defpackage.mcd.CALL_SCREENING_SERVICE_TIMEOUT_UNBIND;
                        ajniVar11.c = defpackage.zar.TIMEOUT_FAILURE;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("UserManuallyScreenedCallFromNotification", 165458);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.ajni ajniVar12 = (defpackage.ajni) obj;
                        if (ajniVar12 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar12.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar12.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("UserManuallyScreenedCallFromAnswerScreen", 165459);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("IncomingCallNotificationInitialized", 162191);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar13 = (defpackage.ajni) obj;
                        if (ajniVar13 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar13.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar13.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("UserAnsweredCallAsRttFromAnswerScreen", 167412);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("IncomingCallAnswerScreenShown", 162192);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar14 = (defpackage.ajni) obj;
                        if (ajniVar14 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar14.b = defpackage.mcd.ACCEPT_RTT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar14.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("UserAnsweredCallFromNotificationToChronometerShown", 167402);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("UserRejectedCallFromAnswerScreen", 167408);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_TELECOM, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED_ACTIVE, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    default:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar10 = new defpackage.ajni(null);
        aonjVar14.a(ajniVar10);
        java.util.Set setSingleton10 = java.util.Collections.singleton(ajniVar10);
        defpackage.aooh.e(setSingleton10, "singleton(...)");
        adcmVar12.f(setSingleton10);
        arrayList.add(adcmVar12.c());
        defpackage.adcm adcmVar13 = new defpackage.adcm(null);
        final int i17 = 8;
        defpackage.aonj aonjVar15 = new defpackage.aonj() { // from class: mdi
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i17) {
                    case 0:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar19.b = defpackage.mce.ON_INCOMING_CALL_SCREENING_ACCEPTED;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.ajni ajniVar11 = (defpackage.ajni) obj;
                        if (ajniVar11 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar11.b = defpackage.mcd.PRODUCE_ANSWER_MODEL_FAILURE;
                        ajniVar11.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.ajni ajniVar12 = (defpackage.ajni) obj;
                        if (ajniVar12 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar12.b = defpackage.mcd.CALL_SCREENING_SERVICE_TIMEOUT_UNBIND;
                        ajniVar12.c = defpackage.zar.TIMEOUT_FAILURE;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("UserManuallyScreenedCallFromNotification", 165458);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.ajni ajniVar13 = (defpackage.ajni) obj;
                        if (ajniVar13 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar13.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar13.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("UserManuallyScreenedCallFromAnswerScreen", 165459);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("IncomingCallNotificationInitialized", 162191);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar14 = (defpackage.ajni) obj;
                        if (ajniVar14 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar14.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar14.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("UserAnsweredCallAsRttFromAnswerScreen", 167412);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("IncomingCallAnswerScreenShown", 162192);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar15 = (defpackage.ajni) obj;
                        if (ajniVar15 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar15.b = defpackage.mcd.ACCEPT_RTT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar15.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("UserAnsweredCallFromNotificationToChronometerShown", 167402);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("UserRejectedCallFromAnswerScreen", 167408);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_TELECOM, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED_ACTIVE, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    default:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar19 = new defpackage.aacy(null, null, null);
        aonjVar15.a(aacyVar19);
        adcmVar13.h = aacyVar19;
        adcmVar13.i = defpackage.mce.USER_CLICKED_ANSWER_CALL_AS_RTT_FROM_ANSWER_SCREEN;
        final int i18 = 9;
        defpackage.aonj aonjVar16 = new defpackage.aonj() { // from class: mdi
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i18) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ON_INCOMING_CALL_SCREENING_ACCEPTED;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.ajni ajniVar11 = (defpackage.ajni) obj;
                        if (ajniVar11 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar11.b = defpackage.mcd.PRODUCE_ANSWER_MODEL_FAILURE;
                        ajniVar11.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.ajni ajniVar12 = (defpackage.ajni) obj;
                        if (ajniVar12 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar12.b = defpackage.mcd.CALL_SCREENING_SERVICE_TIMEOUT_UNBIND;
                        ajniVar12.c = defpackage.zar.TIMEOUT_FAILURE;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("UserManuallyScreenedCallFromNotification", 165458);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.ajni ajniVar13 = (defpackage.ajni) obj;
                        if (ajniVar13 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar13.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar13.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserManuallyScreenedCallFromAnswerScreen", 165459);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("IncomingCallNotificationInitialized", 162191);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar14 = (defpackage.ajni) obj;
                        if (ajniVar14 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar14.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar14.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserAnsweredCallAsRttFromAnswerScreen", 167412);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("IncomingCallAnswerScreenShown", 162192);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar15 = (defpackage.ajni) obj;
                        if (ajniVar15 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar15.b = defpackage.mcd.ACCEPT_RTT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar15.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar117.b = defpackage.aais.aI("UserAnsweredCallFromNotificationToChronometerShown", 167402);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("UserRejectedCallFromAnswerScreen", 167408);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_TELECOM, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1112.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED_ACTIVE, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    default:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar20 = new defpackage.aacy();
        aonjVar16.a(aacyVar20);
        java.util.Set setSingleton11 = java.util.Collections.singleton(aacyVar20);
        defpackage.aooh.e(setSingleton11, "singleton(...)");
        adcmVar13.g(setSingleton11);
        adcmVar13.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar, mceVar2, mceVar3}));
        defpackage.aonj aonjVar17 = new defpackage.aonj() { // from class: mdi
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i11) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ON_INCOMING_CALL_SCREENING_ACCEPTED;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.ajni ajniVar11 = (defpackage.ajni) obj;
                        if (ajniVar11 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar11.b = defpackage.mcd.PRODUCE_ANSWER_MODEL_FAILURE;
                        ajniVar11.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.ajni ajniVar12 = (defpackage.ajni) obj;
                        if (ajniVar12 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar12.b = defpackage.mcd.CALL_SCREENING_SERVICE_TIMEOUT_UNBIND;
                        ajniVar12.c = defpackage.zar.TIMEOUT_FAILURE;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("UserManuallyScreenedCallFromNotification", 165458);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.ajni ajniVar13 = (defpackage.ajni) obj;
                        if (ajniVar13 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar13.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar13.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserManuallyScreenedCallFromAnswerScreen", 165459);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("IncomingCallNotificationInitialized", 162191);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar14 = (defpackage.ajni) obj;
                        if (ajniVar14 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar14.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar14.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserAnsweredCallAsRttFromAnswerScreen", 167412);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("IncomingCallAnswerScreenShown", 162192);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar15 = (defpackage.ajni) obj;
                        if (ajniVar15 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar15.b = defpackage.mcd.ACCEPT_RTT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar15.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar117.b = defpackage.aais.aI("UserAnsweredCallFromNotificationToChronometerShown", 167402);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("UserRejectedCallFromAnswerScreen", 167408);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_TELECOM, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1112.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED_ACTIVE, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    default:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar11 = new defpackage.ajni(null);
        aonjVar17.a(ajniVar11);
        java.util.Set setSingleton12 = java.util.Collections.singleton(ajniVar11);
        defpackage.aooh.e(setSingleton12, "singleton(...)");
        adcmVar13.f(setSingleton12);
        arrayList.add(adcmVar13.c());
        defpackage.adcm adcmVar14 = new defpackage.adcm(null);
        defpackage.aonj aonjVar18 = new defpackage.aonj() { // from class: mdi
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i12) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ON_INCOMING_CALL_SCREENING_ACCEPTED;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.ajni ajniVar12 = (defpackage.ajni) obj;
                        if (ajniVar12 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar12.b = defpackage.mcd.PRODUCE_ANSWER_MODEL_FAILURE;
                        ajniVar12.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.ajni ajniVar13 = (defpackage.ajni) obj;
                        if (ajniVar13 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar13.b = defpackage.mcd.CALL_SCREENING_SERVICE_TIMEOUT_UNBIND;
                        ajniVar13.c = defpackage.zar.TIMEOUT_FAILURE;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("UserManuallyScreenedCallFromNotification", 165458);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.ajni ajniVar14 = (defpackage.ajni) obj;
                        if (ajniVar14 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar14.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar14.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserManuallyScreenedCallFromAnswerScreen", 165459);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("IncomingCallNotificationInitialized", 162191);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar15 = (defpackage.ajni) obj;
                        if (ajniVar15 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar15.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar15.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserAnsweredCallAsRttFromAnswerScreen", 167412);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("IncomingCallAnswerScreenShown", 162192);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar16 = (defpackage.ajni) obj;
                        if (ajniVar16 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar16.b = defpackage.mcd.ACCEPT_RTT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar16.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar117.b = defpackage.aais.aI("UserAnsweredCallFromNotificationToChronometerShown", 167402);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("UserRejectedCallFromAnswerScreen", 167408);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_TELECOM, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1112.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED_ACTIVE, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    default:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar21 = new defpackage.aacy(null, null, null);
        aonjVar18.a(aacyVar21);
        adcmVar14.h = aacyVar21;
        adcmVar14.i = defpackage.mce.INCOMING_CALL_ANSWERED_VIA_NOTIFICATION_FOR_CHRONOMETER;
        final int i19 = 14;
        defpackage.mcx mcxVar7 = new defpackage.mcx(aaifVarAI2, 14);
        defpackage.aacy aacyVar22 = new defpackage.aacy();
        mcxVar7.a(aacyVar22);
        java.util.Set setSingleton13 = java.util.Collections.singleton(aacyVar22);
        defpackage.aooh.e(setSingleton13, "singleton(...)");
        adcmVar14.e(setSingleton13);
        defpackage.aonj aonjVar19 = new defpackage.aonj() { // from class: mdi
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i13) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ON_INCOMING_CALL_SCREENING_ACCEPTED;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.ajni ajniVar12 = (defpackage.ajni) obj;
                        if (ajniVar12 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar12.b = defpackage.mcd.PRODUCE_ANSWER_MODEL_FAILURE;
                        ajniVar12.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.ajni ajniVar13 = (defpackage.ajni) obj;
                        if (ajniVar13 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar13.b = defpackage.mcd.CALL_SCREENING_SERVICE_TIMEOUT_UNBIND;
                        ajniVar13.c = defpackage.zar.TIMEOUT_FAILURE;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("UserManuallyScreenedCallFromNotification", 165458);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.ajni ajniVar14 = (defpackage.ajni) obj;
                        if (ajniVar14 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar14.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar14.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserManuallyScreenedCallFromAnswerScreen", 165459);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("IncomingCallNotificationInitialized", 162191);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar15 = (defpackage.ajni) obj;
                        if (ajniVar15 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar15.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar15.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserAnsweredCallAsRttFromAnswerScreen", 167412);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("IncomingCallAnswerScreenShown", 162192);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar16 = (defpackage.ajni) obj;
                        if (ajniVar16 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar16.b = defpackage.mcd.ACCEPT_RTT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar16.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar117.b = defpackage.aais.aI("UserAnsweredCallFromNotificationToChronometerShown", 167402);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("UserRejectedCallFromAnswerScreen", 167408);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_TELECOM, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1112.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED_ACTIVE, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    default:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar23 = new defpackage.aacy();
        aonjVar19.a(aacyVar23);
        java.util.Set setSingleton14 = java.util.Collections.singleton(aacyVar23);
        defpackage.aooh.e(setSingleton14, "singleton(...)");
        adcmVar14.g(setSingleton14);
        defpackage.mce mceVar7 = defpackage.mce.EMERGENCY_VOICE_FRAGMENT_DATA_LOADED;
        defpackage.mce mceVar8 = defpackage.mce.CHRONOMETER_NOT_SHOWN_BECAUSE_DISPLAY_OFF;
        adcmVar14.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar, mceVar2, mceVar3, mceVar7, mceVar8}));
        defpackage.aonj aonjVar20 = new defpackage.aonj() { // from class: mdi
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i19) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ON_INCOMING_CALL_SCREENING_ACCEPTED;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.ajni ajniVar12 = (defpackage.ajni) obj;
                        if (ajniVar12 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar12.b = defpackage.mcd.PRODUCE_ANSWER_MODEL_FAILURE;
                        ajniVar12.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.ajni ajniVar13 = (defpackage.ajni) obj;
                        if (ajniVar13 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar13.b = defpackage.mcd.CALL_SCREENING_SERVICE_TIMEOUT_UNBIND;
                        ajniVar13.c = defpackage.zar.TIMEOUT_FAILURE;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("UserManuallyScreenedCallFromNotification", 165458);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.ajni ajniVar14 = (defpackage.ajni) obj;
                        if (ajniVar14 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar14.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar14.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserManuallyScreenedCallFromAnswerScreen", 165459);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("IncomingCallNotificationInitialized", 162191);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar15 = (defpackage.ajni) obj;
                        if (ajniVar15 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar15.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar15.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserAnsweredCallAsRttFromAnswerScreen", 167412);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("IncomingCallAnswerScreenShown", 162192);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar16 = (defpackage.ajni) obj;
                        if (ajniVar16 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar16.b = defpackage.mcd.ACCEPT_RTT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar16.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar117.b = defpackage.aais.aI("UserAnsweredCallFromNotificationToChronometerShown", 167402);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("UserRejectedCallFromAnswerScreen", 167408);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_TELECOM, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1112.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED_ACTIVE, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    default:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar12 = new defpackage.ajni(null);
        aonjVar20.a(ajniVar12);
        final int i20 = 15;
        defpackage.aonj aonjVar21 = new defpackage.aonj() { // from class: mdi
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i20) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ON_INCOMING_CALL_SCREENING_ACCEPTED;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.ajni ajniVar13 = (defpackage.ajni) obj;
                        if (ajniVar13 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar13.b = defpackage.mcd.PRODUCE_ANSWER_MODEL_FAILURE;
                        ajniVar13.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.ajni ajniVar14 = (defpackage.ajni) obj;
                        if (ajniVar14 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar14.b = defpackage.mcd.CALL_SCREENING_SERVICE_TIMEOUT_UNBIND;
                        ajniVar14.c = defpackage.zar.TIMEOUT_FAILURE;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("UserManuallyScreenedCallFromNotification", 165458);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.ajni ajniVar15 = (defpackage.ajni) obj;
                        if (ajniVar15 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar15.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar15.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserManuallyScreenedCallFromAnswerScreen", 165459);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("IncomingCallNotificationInitialized", 162191);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar16 = (defpackage.ajni) obj;
                        if (ajniVar16 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar16.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar16.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserAnsweredCallAsRttFromAnswerScreen", 167412);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("IncomingCallAnswerScreenShown", 162192);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar17 = (defpackage.ajni) obj;
                        if (ajniVar17 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar17.b = defpackage.mcd.ACCEPT_RTT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar17.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar117.b = defpackage.aais.aI("UserAnsweredCallFromNotificationToChronometerShown", 167402);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("UserRejectedCallFromAnswerScreen", 167408);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_TELECOM, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1112.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED_ACTIVE, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    default:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar13 = new defpackage.ajni(null);
        aonjVar21.a(ajniVar13);
        adcmVar14.f(defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar12, ajniVar13}));
        arrayList.add(adcmVar14.c());
        defpackage.aaif aaifVarAI6 = defpackage.aais.aI("UserAnsweredEmergencyCallbackFromNotificationToEmergencyVoiceScreenShown", 179245);
        defpackage.adcm adcmVar15 = new defpackage.adcm(null);
        defpackage.mcx mcxVar8 = new defpackage.mcx(aaifVarAI6, 15);
        defpackage.aacy aacyVar24 = new defpackage.aacy(null, null, null);
        mcxVar8.a(aacyVar24);
        adcmVar15.h = aacyVar24;
        adcmVar15.i = defpackage.mce.INCOMING_CALL_ANSWERED_VIA_NOTIFICATION;
        final int i21 = 17;
        defpackage.aonj aonjVar22 = new defpackage.aonj() { // from class: mdi
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i21) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ON_INCOMING_CALL_SCREENING_ACCEPTED;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.ajni ajniVar14 = (defpackage.ajni) obj;
                        if (ajniVar14 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar14.b = defpackage.mcd.PRODUCE_ANSWER_MODEL_FAILURE;
                        ajniVar14.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.ajni ajniVar15 = (defpackage.ajni) obj;
                        if (ajniVar15 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar15.b = defpackage.mcd.CALL_SCREENING_SERVICE_TIMEOUT_UNBIND;
                        ajniVar15.c = defpackage.zar.TIMEOUT_FAILURE;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("UserManuallyScreenedCallFromNotification", 165458);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.ajni ajniVar16 = (defpackage.ajni) obj;
                        if (ajniVar16 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar16.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar16.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserManuallyScreenedCallFromAnswerScreen", 165459);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("IncomingCallNotificationInitialized", 162191);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar17 = (defpackage.ajni) obj;
                        if (ajniVar17 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar17.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar17.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserAnsweredCallAsRttFromAnswerScreen", 167412);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("IncomingCallAnswerScreenShown", 162192);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar18 = (defpackage.ajni) obj;
                        if (ajniVar18 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar18.b = defpackage.mcd.ACCEPT_RTT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar18.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar117.b = defpackage.aais.aI("UserAnsweredCallFromNotificationToChronometerShown", 167402);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("UserRejectedCallFromAnswerScreen", 167408);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_TELECOM, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1112.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED_ACTIVE, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    default:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar25 = new defpackage.aacy();
        aonjVar22.a(aacyVar25);
        final int i22 = 18;
        defpackage.aonj aonjVar23 = new defpackage.aonj() { // from class: mdi
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i22) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ON_INCOMING_CALL_SCREENING_ACCEPTED;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.ajni ajniVar14 = (defpackage.ajni) obj;
                        if (ajniVar14 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar14.b = defpackage.mcd.PRODUCE_ANSWER_MODEL_FAILURE;
                        ajniVar14.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.ajni ajniVar15 = (defpackage.ajni) obj;
                        if (ajniVar15 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar15.b = defpackage.mcd.CALL_SCREENING_SERVICE_TIMEOUT_UNBIND;
                        ajniVar15.c = defpackage.zar.TIMEOUT_FAILURE;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("UserManuallyScreenedCallFromNotification", 165458);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.ajni ajniVar16 = (defpackage.ajni) obj;
                        if (ajniVar16 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar16.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar16.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserManuallyScreenedCallFromAnswerScreen", 165459);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("IncomingCallNotificationInitialized", 162191);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar17 = (defpackage.ajni) obj;
                        if (ajniVar17 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar17.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar17.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserAnsweredCallAsRttFromAnswerScreen", 167412);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("IncomingCallAnswerScreenShown", 162192);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar18 = (defpackage.ajni) obj;
                        if (ajniVar18 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar18.b = defpackage.mcd.ACCEPT_RTT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar18.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar117.b = defpackage.aais.aI("UserAnsweredCallFromNotificationToChronometerShown", 167402);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("UserRejectedCallFromAnswerScreen", 167408);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_TELECOM, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1112.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED_ACTIVE, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    default:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar26 = new defpackage.aacy();
        aonjVar23.a(aacyVar26);
        final int i23 = 19;
        defpackage.aonj aonjVar24 = new defpackage.aonj() { // from class: mdi
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i23) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ON_INCOMING_CALL_SCREENING_ACCEPTED;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.ajni ajniVar14 = (defpackage.ajni) obj;
                        if (ajniVar14 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar14.b = defpackage.mcd.PRODUCE_ANSWER_MODEL_FAILURE;
                        ajniVar14.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.ajni ajniVar15 = (defpackage.ajni) obj;
                        if (ajniVar15 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar15.b = defpackage.mcd.CALL_SCREENING_SERVICE_TIMEOUT_UNBIND;
                        ajniVar15.c = defpackage.zar.TIMEOUT_FAILURE;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("UserManuallyScreenedCallFromNotification", 165458);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.ajni ajniVar16 = (defpackage.ajni) obj;
                        if (ajniVar16 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar16.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar16.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserManuallyScreenedCallFromAnswerScreen", 165459);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("IncomingCallNotificationInitialized", 162191);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar17 = (defpackage.ajni) obj;
                        if (ajniVar17 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar17.b = defpackage.mcd.PRODUCE_CALL_SCREEN_MODEL_FAILURE;
                        ajniVar17.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserAnsweredCallAsRttFromAnswerScreen", 167412);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("IncomingCallAnswerScreenShown", 162192);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar18 = (defpackage.ajni) obj;
                        if (ajniVar18 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar18.b = defpackage.mcd.ACCEPT_RTT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar18.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar117.b = defpackage.aais.aI("UserAnsweredCallFromNotificationToChronometerShown", 167402);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("UserRejectedCallFromAnswerScreen", 167408);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_TELECOM, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1112.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_INTERCEPTED_ACTIVE, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    default:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar27 = new defpackage.aacy();
        aonjVar24.a(aacyVar27);
        defpackage.aonj aonjVar25 = new defpackage.aonj() { // from class: mdj
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i3) {
                    case 0:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_ANSWERED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                    case 4:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationShown", 166973);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToChronometerShown", 167410);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar14 = (defpackage.ajni) obj;
                        if (ajniVar14 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar14.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar14.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserClickedRejectCallWithTextFromAnswerScreen", 166757);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToContactInfoShown", 169607);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.EMERGENCY_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN, defpackage.mce.CHRONOMETER_SHOWN});
                        aacyVar117.a = defpackage.aais.aI("UserAnsweredEmergencyCallbackFromAnswerScreenToEmergencyVoiceScreenShown", 179243);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.ajni ajniVar15 = (defpackage.ajni) obj;
                        if (ajniVar15 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar15.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar15.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.ajni ajniVar16 = (defpackage.ajni) obj;
                        if (ajniVar16 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar16.b = defpackage.mcd.GET_MISSED_CALLS_PERMISSION_DENIED;
                        ajniVar16.c = defpackage.zar.PERMISSION_DENIED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar28 = new defpackage.aacy();
        aonjVar25.a(aacyVar28);
        defpackage.mcx mcxVar9 = new defpackage.mcx(aaifVarAI6, 16);
        defpackage.aacy aacyVar29 = new defpackage.aacy();
        mcxVar9.a(aacyVar29);
        adcmVar15.g(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar25, aacyVar26, aacyVar27, aacyVar28, aacyVar29}));
        adcmVar15.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar, mceVar2, mceVar3, defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, mceVar4, mceVar8, defpackage.mce.ANSWER_CALL_ALREADY_ACTIVE, defpackage.mce.ANSWER_CALL_ALREADY_DISCONNECTING}));
        defpackage.aonj aonjVar26 = new defpackage.aonj() { // from class: mdj
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i2) {
                    case 0:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_ANSWERED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                    case 4:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationShown", 166973);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToChronometerShown", 167410);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar14 = (defpackage.ajni) obj;
                        if (ajniVar14 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar14.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar14.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserClickedRejectCallWithTextFromAnswerScreen", 166757);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToContactInfoShown", 169607);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.EMERGENCY_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN, defpackage.mce.CHRONOMETER_SHOWN});
                        aacyVar117.a = defpackage.aais.aI("UserAnsweredEmergencyCallbackFromAnswerScreenToEmergencyVoiceScreenShown", 179243);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.ajni ajniVar15 = (defpackage.ajni) obj;
                        if (ajniVar15 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar15.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar15.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.ajni ajniVar16 = (defpackage.ajni) obj;
                        if (ajniVar16 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar16.b = defpackage.mcd.GET_MISSED_CALLS_PERMISSION_DENIED;
                        ajniVar16.c = defpackage.zar.PERMISSION_DENIED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar14 = new defpackage.ajni(null);
        aonjVar26.a(ajniVar14);
        defpackage.aonj aonjVar27 = new defpackage.aonj() { // from class: mdj
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i4) {
                    case 0:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_ANSWERED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                    case 4:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationShown", 166973);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToChronometerShown", 167410);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar15 = (defpackage.ajni) obj;
                        if (ajniVar15 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar15.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar15.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserClickedRejectCallWithTextFromAnswerScreen", 166757);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToContactInfoShown", 169607);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.EMERGENCY_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN, defpackage.mce.CHRONOMETER_SHOWN});
                        aacyVar117.a = defpackage.aais.aI("UserAnsweredEmergencyCallbackFromAnswerScreenToEmergencyVoiceScreenShown", 179243);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.ajni ajniVar16 = (defpackage.ajni) obj;
                        if (ajniVar16 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar16.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar16.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.ajni ajniVar17 = (defpackage.ajni) obj;
                        if (ajniVar17 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar17.b = defpackage.mcd.GET_MISSED_CALLS_PERMISSION_DENIED;
                        ajniVar17.c = defpackage.zar.PERMISSION_DENIED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar15 = new defpackage.ajni(null);
        aonjVar27.a(ajniVar15);
        defpackage.aonj aonjVar28 = new defpackage.aonj() { // from class: mdj
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i5) {
                    case 0:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_ANSWERED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                    case 4:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationShown", 166973);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToChronometerShown", 167410);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar16 = (defpackage.ajni) obj;
                        if (ajniVar16 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar16.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar16.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserClickedRejectCallWithTextFromAnswerScreen", 166757);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToContactInfoShown", 169607);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.EMERGENCY_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN, defpackage.mce.CHRONOMETER_SHOWN});
                        aacyVar117.a = defpackage.aais.aI("UserAnsweredEmergencyCallbackFromAnswerScreenToEmergencyVoiceScreenShown", 179243);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.ajni ajniVar17 = (defpackage.ajni) obj;
                        if (ajniVar17 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar17.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar17.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.ajni ajniVar18 = (defpackage.ajni) obj;
                        if (ajniVar18 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar18.b = defpackage.mcd.GET_MISSED_CALLS_PERMISSION_DENIED;
                        ajniVar18.c = defpackage.zar.PERMISSION_DENIED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar16 = new defpackage.ajni(null);
        aonjVar28.a(ajniVar16);
        adcmVar15.f(defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar14, ajniVar15, ajniVar16}));
        arrayList.add(adcmVar15.c());
        defpackage.adcm adcmVar16 = new defpackage.adcm(null);
        final int i24 = 5;
        defpackage.aonj aonjVar29 = new defpackage.aonj() { // from class: mdj
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i24) {
                    case 0:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_ANSWERED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                    case 4:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationShown", 166973);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToChronometerShown", 167410);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar17 = (defpackage.ajni) obj;
                        if (ajniVar17 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar17.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar17.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserClickedRejectCallWithTextFromAnswerScreen", 166757);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToContactInfoShown", 169607);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.EMERGENCY_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN, defpackage.mce.CHRONOMETER_SHOWN});
                        aacyVar117.a = defpackage.aais.aI("UserAnsweredEmergencyCallbackFromAnswerScreenToEmergencyVoiceScreenShown", 179243);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.ajni ajniVar18 = (defpackage.ajni) obj;
                        if (ajniVar18 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar18.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar18.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.ajni ajniVar19 = (defpackage.ajni) obj;
                        if (ajniVar19 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar19.b = defpackage.mcd.GET_MISSED_CALLS_PERMISSION_DENIED;
                        ajniVar19.c = defpackage.zar.PERMISSION_DENIED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar30 = new defpackage.aacy(null, null, null);
        aonjVar29.a(aacyVar30);
        adcmVar16.h = aacyVar30;
        adcmVar16.i = defpackage.mce.ACCEPT_VOICE_CALL_FROM_ANSWER_SCREEN_FOR_CHRONOMETER;
        final int i25 = 6;
        defpackage.aonj aonjVar30 = new defpackage.aonj() { // from class: mdj
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i25) {
                    case 0:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_ANSWERED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                    case 4:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationShown", 166973);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToChronometerShown", 167410);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar17 = (defpackage.ajni) obj;
                        if (ajniVar17 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar17.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar17.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserClickedRejectCallWithTextFromAnswerScreen", 166757);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToContactInfoShown", 169607);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.EMERGENCY_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN, defpackage.mce.CHRONOMETER_SHOWN});
                        aacyVar117.a = defpackage.aais.aI("UserAnsweredEmergencyCallbackFromAnswerScreenToEmergencyVoiceScreenShown", 179243);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.ajni ajniVar18 = (defpackage.ajni) obj;
                        if (ajniVar18 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar18.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar18.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.ajni ajniVar19 = (defpackage.ajni) obj;
                        if (ajniVar19 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar19.b = defpackage.mcd.GET_MISSED_CALLS_PERMISSION_DENIED;
                        ajniVar19.c = defpackage.zar.PERMISSION_DENIED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar31 = new defpackage.aacy();
        aonjVar30.a(aacyVar31);
        java.util.Set setSingleton15 = java.util.Collections.singleton(aacyVar31);
        defpackage.aooh.e(setSingleton15, "singleton(...)");
        adcmVar16.g(setSingleton15);
        adcmVar16.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar, mceVar2, mceVar3, mceVar7, mceVar8}));
        defpackage.aonj aonjVar31 = new defpackage.aonj() { // from class: mdj
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i16) {
                    case 0:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_ANSWERED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                    case 4:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationShown", 166973);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToChronometerShown", 167410);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar17 = (defpackage.ajni) obj;
                        if (ajniVar17 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar17.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar17.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserClickedRejectCallWithTextFromAnswerScreen", 166757);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToContactInfoShown", 169607);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.EMERGENCY_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN, defpackage.mce.CHRONOMETER_SHOWN});
                        aacyVar117.a = defpackage.aais.aI("UserAnsweredEmergencyCallbackFromAnswerScreenToEmergencyVoiceScreenShown", 179243);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.ajni ajniVar18 = (defpackage.ajni) obj;
                        if (ajniVar18 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar18.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar18.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.ajni ajniVar19 = (defpackage.ajni) obj;
                        if (ajniVar19 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar19.b = defpackage.mcd.GET_MISSED_CALLS_PERMISSION_DENIED;
                        ajniVar19.c = defpackage.zar.PERMISSION_DENIED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar17 = new defpackage.ajni(null);
        aonjVar31.a(ajniVar17);
        defpackage.aonj aonjVar32 = new defpackage.aonj() { // from class: mdj
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i17) {
                    case 0:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_ANSWERED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                    case 4:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationShown", 166973);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToChronometerShown", 167410);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar18 = (defpackage.ajni) obj;
                        if (ajniVar18 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar18.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar18.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserClickedRejectCallWithTextFromAnswerScreen", 166757);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToContactInfoShown", 169607);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.EMERGENCY_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN, defpackage.mce.CHRONOMETER_SHOWN});
                        aacyVar117.a = defpackage.aais.aI("UserAnsweredEmergencyCallbackFromAnswerScreenToEmergencyVoiceScreenShown", 179243);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.ajni ajniVar19 = (defpackage.ajni) obj;
                        if (ajniVar19 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar19.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar19.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.ajni ajniVar110 = (defpackage.ajni) obj;
                        if (ajniVar110 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar110.b = defpackage.mcd.GET_MISSED_CALLS_PERMISSION_DENIED;
                        ajniVar110.c = defpackage.zar.PERMISSION_DENIED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar18 = new defpackage.ajni(null);
        aonjVar32.a(ajniVar18);
        final int i26 = 9;
        defpackage.aonj aonjVar33 = new defpackage.aonj() { // from class: mdj
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i26) {
                    case 0:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_ANSWERED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                    case 4:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationShown", 166973);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToChronometerShown", 167410);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar19 = (defpackage.ajni) obj;
                        if (ajniVar19 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar19.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar19.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserClickedRejectCallWithTextFromAnswerScreen", 166757);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToContactInfoShown", 169607);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.EMERGENCY_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN, defpackage.mce.CHRONOMETER_SHOWN});
                        aacyVar117.a = defpackage.aais.aI("UserAnsweredEmergencyCallbackFromAnswerScreenToEmergencyVoiceScreenShown", 179243);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.ajni ajniVar110 = (defpackage.ajni) obj;
                        if (ajniVar110 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar110.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar110.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.ajni ajniVar111 = (defpackage.ajni) obj;
                        if (ajniVar111 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar111.b = defpackage.mcd.GET_MISSED_CALLS_PERMISSION_DENIED;
                        ajniVar111.c = defpackage.zar.PERMISSION_DENIED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar19 = new defpackage.ajni(null);
        aonjVar33.a(ajniVar19);
        adcmVar16.f(defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar17, ajniVar18, ajniVar19}));
        arrayList.add(adcmVar16.c());
        defpackage.adcm adcmVar17 = new defpackage.adcm(null);
        defpackage.aonj aonjVar34 = new defpackage.aonj() { // from class: mdj
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i11) {
                    case 0:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_ANSWERED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                    case 4:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationShown", 166973);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToChronometerShown", 167410);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar110 = (defpackage.ajni) obj;
                        if (ajniVar110 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar110.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar110.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserClickedRejectCallWithTextFromAnswerScreen", 166757);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToContactInfoShown", 169607);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.EMERGENCY_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN, defpackage.mce.CHRONOMETER_SHOWN});
                        aacyVar117.a = defpackage.aais.aI("UserAnsweredEmergencyCallbackFromAnswerScreenToEmergencyVoiceScreenShown", 179243);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.ajni ajniVar111 = (defpackage.ajni) obj;
                        if (ajniVar111 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar111.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar111.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.ajni ajniVar112 = (defpackage.ajni) obj;
                        if (ajniVar112 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar112.b = defpackage.mcd.GET_MISSED_CALLS_PERMISSION_DENIED;
                        ajniVar112.c = defpackage.zar.PERMISSION_DENIED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar32 = new defpackage.aacy(null, null, null);
        aonjVar34.a(aacyVar32);
        adcmVar17.h = aacyVar32;
        adcmVar17.i = defpackage.mce.ACCEPT_VOICE_CALL_FROM_ANSWER_SCREEN;
        final int i27 = 12;
        defpackage.aonj aonjVar35 = new defpackage.aonj() { // from class: mdj
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i27) {
                    case 0:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_ANSWERED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                    case 4:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationShown", 166973);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToChronometerShown", 167410);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar110 = (defpackage.ajni) obj;
                        if (ajniVar110 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar110.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar110.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserClickedRejectCallWithTextFromAnswerScreen", 166757);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToContactInfoShown", 169607);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.EMERGENCY_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN, defpackage.mce.CHRONOMETER_SHOWN});
                        aacyVar117.a = defpackage.aais.aI("UserAnsweredEmergencyCallbackFromAnswerScreenToEmergencyVoiceScreenShown", 179243);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.ajni ajniVar111 = (defpackage.ajni) obj;
                        if (ajniVar111 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar111.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar111.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.ajni ajniVar112 = (defpackage.ajni) obj;
                        if (ajniVar112 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar112.b = defpackage.mcd.GET_MISSED_CALLS_PERMISSION_DENIED;
                        ajniVar112.c = defpackage.zar.PERMISSION_DENIED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar33 = new defpackage.aacy();
        aonjVar35.a(aacyVar33);
        final int i28 = 13;
        defpackage.aonj aonjVar36 = new defpackage.aonj() { // from class: mdj
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i28) {
                    case 0:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_ANSWERED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                    case 4:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationShown", 166973);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToChronometerShown", 167410);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar110 = (defpackage.ajni) obj;
                        if (ajniVar110 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar110.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar110.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserClickedRejectCallWithTextFromAnswerScreen", 166757);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToContactInfoShown", 169607);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.EMERGENCY_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN, defpackage.mce.CHRONOMETER_SHOWN});
                        aacyVar117.a = defpackage.aais.aI("UserAnsweredEmergencyCallbackFromAnswerScreenToEmergencyVoiceScreenShown", 179243);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.ajni ajniVar111 = (defpackage.ajni) obj;
                        if (ajniVar111 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar111.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar111.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.ajni ajniVar112 = (defpackage.ajni) obj;
                        if (ajniVar112 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar112.b = defpackage.mcd.GET_MISSED_CALLS_PERMISSION_DENIED;
                        ajniVar112.c = defpackage.zar.PERMISSION_DENIED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar34 = new defpackage.aacy();
        aonjVar36.a(aacyVar34);
        adcmVar17.g(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar33, aacyVar34}));
        adcmVar17.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar, mceVar2, mceVar3, mceVar4, mceVar8}));
        final int i29 = 14;
        defpackage.aonj aonjVar37 = new defpackage.aonj() { // from class: mdj
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i29) {
                    case 0:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_ANSWERED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                    case 4:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationShown", 166973);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToChronometerShown", 167410);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar110 = (defpackage.ajni) obj;
                        if (ajniVar110 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar110.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar110.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserClickedRejectCallWithTextFromAnswerScreen", 166757);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToContactInfoShown", 169607);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.EMERGENCY_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN, defpackage.mce.CHRONOMETER_SHOWN});
                        aacyVar117.a = defpackage.aais.aI("UserAnsweredEmergencyCallbackFromAnswerScreenToEmergencyVoiceScreenShown", 179243);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.ajni ajniVar111 = (defpackage.ajni) obj;
                        if (ajniVar111 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar111.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar111.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.ajni ajniVar112 = (defpackage.ajni) obj;
                        if (ajniVar112 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar112.b = defpackage.mcd.GET_MISSED_CALLS_PERMISSION_DENIED;
                        ajniVar112.c = defpackage.zar.PERMISSION_DENIED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar20 = new defpackage.ajni(null);
        aonjVar37.a(ajniVar20);
        final int i30 = 16;
        defpackage.aonj aonjVar38 = new defpackage.aonj() { // from class: mdj
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i30) {
                    case 0:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_ANSWERED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                    case 4:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationShown", 166973);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToChronometerShown", 167410);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar110 = (defpackage.ajni) obj;
                        if (ajniVar110 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar110.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar110.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserClickedRejectCallWithTextFromAnswerScreen", 166757);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToContactInfoShown", 169607);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.EMERGENCY_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN, defpackage.mce.CHRONOMETER_SHOWN});
                        aacyVar117.a = defpackage.aais.aI("UserAnsweredEmergencyCallbackFromAnswerScreenToEmergencyVoiceScreenShown", 179243);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.ajni ajniVar111 = (defpackage.ajni) obj;
                        if (ajniVar111 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar111.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar111.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.ajni ajniVar112 = (defpackage.ajni) obj;
                        if (ajniVar112 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar112.b = defpackage.mcd.GET_MISSED_CALLS_PERMISSION_DENIED;
                        ajniVar112.c = defpackage.zar.PERMISSION_DENIED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar21 = new defpackage.ajni(null);
        aonjVar38.a(ajniVar21);
        final int i31 = 17;
        defpackage.aonj aonjVar39 = new defpackage.aonj() { // from class: mdj
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i31) {
                    case 0:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_ANSWERED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                    case 4:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationShown", 166973);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToChronometerShown", 167410);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar110 = (defpackage.ajni) obj;
                        if (ajniVar110 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar110.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar110.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserClickedRejectCallWithTextFromAnswerScreen", 166757);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToContactInfoShown", 169607);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.EMERGENCY_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN, defpackage.mce.CHRONOMETER_SHOWN});
                        aacyVar117.a = defpackage.aais.aI("UserAnsweredEmergencyCallbackFromAnswerScreenToEmergencyVoiceScreenShown", 179243);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.ajni ajniVar111 = (defpackage.ajni) obj;
                        if (ajniVar111 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar111.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar111.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.ajni ajniVar112 = (defpackage.ajni) obj;
                        if (ajniVar112 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar112.b = defpackage.mcd.GET_MISSED_CALLS_PERMISSION_DENIED;
                        ajniVar112.c = defpackage.zar.PERMISSION_DENIED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar22 = new defpackage.ajni(null);
        aonjVar39.a(ajniVar22);
        final int i32 = 18;
        defpackage.aonj aonjVar40 = new defpackage.aonj() { // from class: mdj
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i32) {
                    case 0:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANSWER_CALL_ANSWERED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                    case 4:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationShown", 166973);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToChronometerShown", 167410);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CHRONOMETER_SHOWN, defpackage.mce.ON_CALL_CONNECTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.ajni ajniVar110 = (defpackage.ajni) obj;
                        if (ajniVar110 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar110.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar110.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserClickedRejectCallWithTextFromAnswerScreen", 166757);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("UserAnsweredCallFromAnswerScreenToContactInfoShown", 169607);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BOUNCE_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN});
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.EMERGENCY_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CONTACT_INFO_SHOWN, defpackage.mce.CHRONOMETER_SHOWN});
                        aacyVar117.a = defpackage.aais.aI("UserAnsweredEmergencyCallbackFromAnswerScreenToEmergencyVoiceScreenShown", 179243);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.ajni ajniVar111 = (defpackage.ajni) obj;
                        if (ajniVar111 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar111.b = defpackage.mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE;
                        ajniVar111.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.ajni ajniVar112 = (defpackage.ajni) obj;
                        if (ajniVar112 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar112.b = defpackage.mcd.GET_MISSED_CALLS_PERMISSION_DENIED;
                        ajniVar112.c = defpackage.zar.PERMISSION_DENIED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.aT((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aV((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar23 = new defpackage.ajni(null);
        aonjVar40.a(ajniVar23);
        adcmVar17.f(defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar20, ajniVar21, ajniVar22, ajniVar23}));
        arrayList.add(adcmVar17.c());
        return arrayList;
    }
}
