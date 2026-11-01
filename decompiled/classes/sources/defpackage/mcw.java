package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mcw implements defpackage.zaq {
    private final defpackage.aoin a;
    private final java.util.Set b;
    private final java.util.Set c;
    private final java.util.Set d;
    private final java.util.Set e;
    private final java.util.Set f;

    public mcw(defpackage.aoin aoinVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("enableRecordingCuiCancelOnConnect");
        }
        this.a = aoinVar;
        defpackage.mct mctVar = new defpackage.mct(8);
        defpackage.ajni ajniVar = new defpackage.ajni(null);
        mctVar.a(ajniVar);
        defpackage.mct mctVar2 = new defpackage.mct(10);
        defpackage.ajni ajniVar2 = new defpackage.ajni(null);
        mctVar2.a(ajniVar2);
        this.b = defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar, ajniVar2});
        defpackage.mct mctVar3 = new defpackage.mct(11);
        defpackage.ajni ajniVar3 = new defpackage.ajni(null);
        mctVar3.a(ajniVar3);
        defpackage.mct mctVar4 = new defpackage.mct(12);
        defpackage.ajni ajniVar4 = new defpackage.ajni(null);
        mctVar4.a(ajniVar4);
        defpackage.mct mctVar5 = new defpackage.mct(13);
        defpackage.ajni ajniVar5 = new defpackage.ajni(null);
        mctVar5.a(ajniVar5);
        defpackage.mct mctVar6 = new defpackage.mct(15);
        defpackage.ajni ajniVar6 = new defpackage.ajni(null);
        mctVar6.a(ajniVar6);
        defpackage.mct mctVar7 = new defpackage.mct(16);
        defpackage.ajni ajniVar7 = new defpackage.ajni(null);
        mctVar7.a(ajniVar7);
        java.util.Set setCW = defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar3, ajniVar4, ajniVar5, ajniVar6, ajniVar7});
        this.c = setCW;
        defpackage.mct mctVar8 = new defpackage.mct(17);
        defpackage.ajni ajniVar8 = new defpackage.ajni(null);
        mctVar8.a(ajniVar8);
        defpackage.mct mctVar9 = new defpackage.mct(18);
        defpackage.ajni ajniVar9 = new defpackage.ajni(null);
        mctVar9.a(ajniVar9);
        java.util.Set setCW2 = defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar8, ajniVar9});
        this.d = setCW2;
        defpackage.mct mctVar10 = new defpackage.mct(19);
        defpackage.ajni ajniVar10 = new defpackage.ajni(null);
        mctVar10.a(ajniVar10);
        defpackage.mct mctVar11 = new defpackage.mct(9);
        defpackage.ajni ajniVar11 = new defpackage.ajni(null);
        mctVar11.a(ajniVar11);
        java.util.Set setCW3 = defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar10, ajniVar11});
        this.e = setCW3;
        this.f = defpackage.ajsz.aI(defpackage.ajsz.aI(setCW3, setCW), setCW2);
    }

    @Override // defpackage.zaq
    public final java.util.List a() {
        defpackage.zao[] zaoVarArr = new defpackage.zao[28];
        defpackage.adcm adcmVar = new defpackage.adcm(null);
        final int i = 7;
        defpackage.aonj aonjVar = new defpackage.aonj() { // from class: mcs
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i) {
                    case 0:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar = (defpackage.aacy) obj;
                        if (aacyVar == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_BACKGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar2 = (defpackage.aacy) obj;
                        if (aacyVar2 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar2.b = defpackage.aais.aI("MissedCallNotificationRequestedForDecliningMissedCall", 186924);
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                        if (aacyVar3 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar3.b = defpackage.aais.aI("UserSelectedSuggestedReplyWithReportSpamAction", 186761);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                        if (aacyVar4 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar4.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_REPORT_SPAM, defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 5:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                        if (aacyVar5 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar5.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                        if (aacyVar6 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar6.b = defpackage.aais.aI("callAddedToReadyForManualScreening", 189377);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.DOBBY_FAILED_TO_SET_INITIAL_LIFECYCLE_STATE;
                        ajniVar.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar7.b = defpackage.aais.aI("EndCallFromDobbyBackgroundDeclining", 186904);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar8.b = defpackage.mce.ON_CALL_DISCONNECTED;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar2 = (defpackage.ajni) obj;
                        if (ajniVar2 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar2.b = defpackage.mcd.FAILED_TO_DISCONNECT_CALL;
                        ajniVar2.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar9.b = defpackage.aais.aI("MissedCallNotificationRequestedForRemoteDisconnection", 186920);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar10.b = defpackage.aais.aI("UserAnsweredCallFromManualScreening", 186755);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar11.b = defpackage.mce.DOBBY_IN_CALL_FRAGMENT_DESTROYED;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar12.b = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.bb((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 18:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 19:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar13.b = defpackage.aais.aI("SilentlyScreeningNotificationInitialized", 197292);
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("MissedCallNotificationRequestedForNewCallDueToAlreadyScreening", 186918);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar = new defpackage.aacy(null, null, null);
        aonjVar.a(aacyVar);
        adcmVar.h = aacyVar;
        adcmVar.i = defpackage.mce.DOBBY_ON_CALL_SCOPE_ADDED;
        final int i2 = 3;
        defpackage.mce mceVar = defpackage.mce.ON_CALL_REMOVED;
        defpackage.mce mceVar2 = defpackage.mce.DOBBY_AUTO_SCREENING_START;
        adcmVar.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar, defpackage.mce.DOBBY_SESSION_PRECONDITION_CHECK_FAILED, mceVar2}));
        adcmVar.a = defpackage.mce.DOBBY_READY_FOR_MANUAL_SCREENING;
        final int i3 = 8;
        defpackage.aonj aonjVar2 = new defpackage.aonj() { // from class: mcs
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i3) {
                    case 0:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar2 = (defpackage.aacy) obj;
                        if (aacyVar2 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar2.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_BACKGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                        if (aacyVar3 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar3.b = defpackage.aais.aI("MissedCallNotificationRequestedForDecliningMissedCall", 186924);
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                        if (aacyVar4 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar4.b = defpackage.aais.aI("UserSelectedSuggestedReplyWithReportSpamAction", 186761);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                        if (aacyVar5 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar5.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_REPORT_SPAM, defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 5:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                        if (aacyVar6 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar6.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar7.b = defpackage.aais.aI("callAddedToReadyForManualScreening", 189377);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.DOBBY_FAILED_TO_SET_INITIAL_LIFECYCLE_STATE;
                        ajniVar.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar8.b = defpackage.aais.aI("EndCallFromDobbyBackgroundDeclining", 186904);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar9.b = defpackage.mce.ON_CALL_DISCONNECTED;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar2 = (defpackage.ajni) obj;
                        if (ajniVar2 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar2.b = defpackage.mcd.FAILED_TO_DISCONNECT_CALL;
                        ajniVar2.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar10.b = defpackage.aais.aI("MissedCallNotificationRequestedForRemoteDisconnection", 186920);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar11.b = defpackage.aais.aI("UserAnsweredCallFromManualScreening", 186755);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar12.b = defpackage.mce.DOBBY_IN_CALL_FRAGMENT_DESTROYED;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar13.b = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.bb((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 18:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 19:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("SilentlyScreeningNotificationInitialized", 197292);
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("MissedCallNotificationRequestedForNewCallDueToAlreadyScreening", 186918);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.ajni ajniVar = new defpackage.ajni(null);
        aonjVar2.a(ajniVar);
        java.util.Set setSingleton = java.util.Collections.singleton(ajniVar);
        defpackage.aooh.e(setSingleton, "singleton(...)");
        adcmVar.f(setSingleton);
        zaoVarArr[0] = adcmVar.c();
        defpackage.adcm adcmVar2 = new defpackage.adcm(null);
        defpackage.mcu mcuVar = new defpackage.mcu(2);
        defpackage.aacy aacyVar2 = new defpackage.aacy(null, null, null);
        mcuVar.a(aacyVar2);
        adcmVar2.h = aacyVar2;
        adcmVar2.i = defpackage.mce.USER_CLICKED_SCREEN_CALL_FROM_NOTIFICATION;
        defpackage.mce mceVar3 = defpackage.mce.SINGLE_CALL_CONNECTED;
        defpackage.mce mceVar4 = defpackage.mce.CONTACT_INFO_NOT_SHOWN_BECAUSE_DISPLAY_OFF;
        defpackage.mce mceVar5 = defpackage.mce.CHRONOMETER_NOT_SHOWN_BECAUSE_DISPLAY_OFF;
        defpackage.mce mceVar6 = defpackage.mce.DOBBY_CANCELLED_CUI_ON_ANSWERED_OR_DISCONNECTING_STATE;
        final int i4 = 6;
        adcmVar2.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar, mceVar3, mceVar4, mceVar5, mceVar6, defpackage.mce.DOBBY_CANCELLED_CUI_ON_ARBITOR_REJECTION, defpackage.mce.DOBBY_CANCEL_MCS_ON_STARTED_BEESLY}));
        defpackage.mcu mcuVar2 = new defpackage.mcu(3);
        defpackage.aacy aacyVar3 = new defpackage.aacy();
        mcuVar2.a(aacyVar3);
        java.util.Set setSingleton2 = java.util.Collections.singleton(aacyVar3);
        defpackage.aooh.e(setSingleton2, "singleton(...)");
        adcmVar2.g(setSingleton2);
        java.util.Set set = this.f;
        java.util.Set set2 = this.b;
        adcmVar2.f(defpackage.ajsz.aI(set, set2));
        zaoVarArr[1] = adcmVar2.c();
        defpackage.adcm adcmVar3 = new defpackage.adcm(null);
        final int i5 = 13;
        defpackage.mcu mcuVar3 = new defpackage.mcu(13);
        defpackage.aacy aacyVar4 = new defpackage.aacy(null, null, null);
        mcuVar3.a(aacyVar4);
        adcmVar3.h = aacyVar4;
        adcmVar3.i = defpackage.mce.USER_CLICKED_SCREEN_CALL_FROM_ANSWER_SCREEN;
        adcmVar3.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar, mceVar3, mceVar4, mceVar5}));
        defpackage.mcu mcuVar4 = new defpackage.mcu(15);
        defpackage.aacy aacyVar5 = new defpackage.aacy();
        mcuVar4.a(aacyVar5);
        java.util.Set setSingleton3 = java.util.Collections.singleton(aacyVar5);
        defpackage.aooh.e(setSingleton3, "singleton(...)");
        adcmVar3.g(setSingleton3);
        adcmVar3.f(defpackage.ajsz.aI(set, set2));
        zaoVarArr[2] = adcmVar3.c();
        defpackage.adcm adcmVar4 = new defpackage.adcm(null);
        defpackage.mco mcoVar = new defpackage.mco(16);
        defpackage.aacy aacyVar6 = new defpackage.aacy(null, null, null);
        mcoVar.a(aacyVar6);
        adcmVar4.h = aacyVar6;
        adcmVar4.i = defpackage.mce.USER_CLICKED_END_CALL_FROM_MANUAL_SCREENING;
        defpackage.mce mceVar7 = defpackage.mce.ON_IN_CALL_ACTIVITY_DESTROYED;
        defpackage.mce mceVar8 = defpackage.mce.DOBBY_CANCELLED_CUI_FOR_ACTION_FROM_STALE_UI;
        defpackage.mce mceVar9 = defpackage.mce.DOBBY_PLAY_RECORDING_FAILED_ON_TELECOM_CHANGE;
        adcmVar4.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar, defpackage.mce.SINGLE_CALL_IN_CALL_ACTIVITY_DESTROYED, mceVar7, mceVar8, mceVar9, defpackage.mce.DOBBY_CANCEL_END_CALL_BOT}));
        defpackage.aonj aonjVar3 = new defpackage.aonj() { // from class: mcs
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i4) {
                    case 0:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar7.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_BACKGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar8.b = defpackage.aais.aI("MissedCallNotificationRequestedForDecliningMissedCall", 186924);
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar9.b = defpackage.aais.aI("UserSelectedSuggestedReplyWithReportSpamAction", 186761);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar10.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_REPORT_SPAM, defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 5:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar11.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("callAddedToReadyForManualScreening", 189377);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.ajni ajniVar2 = (defpackage.ajni) obj;
                        if (ajniVar2 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar2.b = defpackage.mcd.DOBBY_FAILED_TO_SET_INITIAL_LIFECYCLE_STATE;
                        ajniVar2.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar13.b = defpackage.aais.aI("EndCallFromDobbyBackgroundDeclining", 186904);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar14.b = defpackage.mce.ON_CALL_DISCONNECTED;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                        if (ajniVar3 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar3.b = defpackage.mcd.FAILED_TO_DISCONNECT_CALL;
                        ajniVar3.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("MissedCallNotificationRequestedForRemoteDisconnection", 186920);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("UserAnsweredCallFromManualScreening", 186755);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar17.b = defpackage.mce.DOBBY_IN_CALL_FRAGMENT_DESTROYED;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar18.b = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.bb((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 18:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 19:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("SilentlyScreeningNotificationInitialized", 197292);
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("MissedCallNotificationRequestedForNewCallDueToAlreadyScreening", 186918);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar7 = new defpackage.aacy();
        aonjVar3.a(aacyVar7);
        java.util.Set setSingleton4 = java.util.Collections.singleton(aacyVar7);
        defpackage.aooh.e(setSingleton4, "singleton(...)");
        adcmVar4.g(setSingleton4);
        java.util.Set set3 = this.e;
        final int i6 = 17;
        defpackage.aonj aonjVar4 = new defpackage.aonj() { // from class: mcs
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i6) {
                    case 0:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar8.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_BACKGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar9.b = defpackage.aais.aI("MissedCallNotificationRequestedForDecliningMissedCall", 186924);
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar10.b = defpackage.aais.aI("UserSelectedSuggestedReplyWithReportSpamAction", 186761);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar11.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_REPORT_SPAM, defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 5:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar12.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar13.b = defpackage.aais.aI("callAddedToReadyForManualScreening", 189377);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.ajni ajniVar2 = (defpackage.ajni) obj;
                        if (ajniVar2 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar2.b = defpackage.mcd.DOBBY_FAILED_TO_SET_INITIAL_LIFECYCLE_STATE;
                        ajniVar2.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("EndCallFromDobbyBackgroundDeclining", 186904);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar15.b = defpackage.mce.ON_CALL_DISCONNECTED;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                        if (ajniVar3 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar3.b = defpackage.mcd.FAILED_TO_DISCONNECT_CALL;
                        ajniVar3.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("MissedCallNotificationRequestedForRemoteDisconnection", 186920);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("UserAnsweredCallFromManualScreening", 186755);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar18.b = defpackage.mce.DOBBY_IN_CALL_FRAGMENT_DESTROYED;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar19.b = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.bb((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 18:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 19:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("SilentlyScreeningNotificationInitialized", 197292);
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationRequestedForNewCallDueToAlreadyScreening", 186918);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.ajni ajniVar2 = new defpackage.ajni(null);
        aonjVar4.a(ajniVar2);
        java.util.Set setSingleton5 = java.util.Collections.singleton(ajniVar2);
        defpackage.aooh.e(setSingleton5, "singleton(...)");
        adcmVar4.f(defpackage.ajsz.aI(set3, setSingleton5));
        zaoVarArr[3] = adcmVar4.c();
        defpackage.adcm adcmVar5 = new defpackage.adcm(null);
        defpackage.aonj aonjVar5 = new defpackage.aonj() { // from class: mcs
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i5) {
                    case 0:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar8.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_BACKGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar9.b = defpackage.aais.aI("MissedCallNotificationRequestedForDecliningMissedCall", 186924);
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar10.b = defpackage.aais.aI("UserSelectedSuggestedReplyWithReportSpamAction", 186761);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar11.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_REPORT_SPAM, defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 5:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar12.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar13.b = defpackage.aais.aI("callAddedToReadyForManualScreening", 189377);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                        if (ajniVar3 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar3.b = defpackage.mcd.DOBBY_FAILED_TO_SET_INITIAL_LIFECYCLE_STATE;
                        ajniVar3.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("EndCallFromDobbyBackgroundDeclining", 186904);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar15.b = defpackage.mce.ON_CALL_DISCONNECTED;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                        if (ajniVar4 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar4.b = defpackage.mcd.FAILED_TO_DISCONNECT_CALL;
                        ajniVar4.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("MissedCallNotificationRequestedForRemoteDisconnection", 186920);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("UserAnsweredCallFromManualScreening", 186755);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar18.b = defpackage.mce.DOBBY_IN_CALL_FRAGMENT_DESTROYED;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar19.b = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.bb((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 18:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 19:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("SilentlyScreeningNotificationInitialized", 197292);
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationRequestedForNewCallDueToAlreadyScreening", 186918);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar8 = new defpackage.aacy(null, null, null);
        aonjVar5.a(aacyVar8);
        adcmVar5.h = aacyVar8;
        adcmVar5.i = defpackage.mce.USER_CLICKED_ANSWER_CALL_FROM_MANUAL_SCREENING;
        defpackage.mce mceVar10 = defpackage.mce.ON_IN_CALL_ACTIVITY_STOPPED;
        defpackage.mce mceVar11 = defpackage.mce.DOBBY_CANCEL_ANSWER_CALL_BOT;
        adcmVar5.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar, mceVar8, mceVar9, mceVar7, mceVar10, mceVar11}));
        final int i7 = 14;
        defpackage.aonj aonjVar6 = new defpackage.aonj() { // from class: mcs
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i7) {
                    case 0:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar9.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_BACKGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar10.b = defpackage.aais.aI("MissedCallNotificationRequestedForDecliningMissedCall", 186924);
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar11.b = defpackage.aais.aI("UserSelectedSuggestedReplyWithReportSpamAction", 186761);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar12.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_REPORT_SPAM, defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 5:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar13.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("callAddedToReadyForManualScreening", 189377);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                        if (ajniVar3 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar3.b = defpackage.mcd.DOBBY_FAILED_TO_SET_INITIAL_LIFECYCLE_STATE;
                        ajniVar3.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("EndCallFromDobbyBackgroundDeclining", 186904);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar16.b = defpackage.mce.ON_CALL_DISCONNECTED;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                        if (ajniVar4 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar4.b = defpackage.mcd.FAILED_TO_DISCONNECT_CALL;
                        ajniVar4.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("MissedCallNotificationRequestedForRemoteDisconnection", 186920);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("UserAnsweredCallFromManualScreening", 186755);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar19.b = defpackage.mce.DOBBY_IN_CALL_FRAGMENT_DESTROYED;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.bb((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 18:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 19:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("SilentlyScreeningNotificationInitialized", 197292);
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("MissedCallNotificationRequestedForNewCallDueToAlreadyScreening", 186918);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar9 = new defpackage.aacy();
        aonjVar6.a(aacyVar9);
        final int i8 = 15;
        defpackage.aonj aonjVar7 = new defpackage.aonj() { // from class: mcs
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i8) {
                    case 0:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar10.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_BACKGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar11.b = defpackage.aais.aI("MissedCallNotificationRequestedForDecliningMissedCall", 186924);
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("UserSelectedSuggestedReplyWithReportSpamAction", 186761);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar13.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_REPORT_SPAM, defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 5:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar14.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("callAddedToReadyForManualScreening", 189377);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                        if (ajniVar3 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar3.b = defpackage.mcd.DOBBY_FAILED_TO_SET_INITIAL_LIFECYCLE_STATE;
                        ajniVar3.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("EndCallFromDobbyBackgroundDeclining", 186904);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar17.b = defpackage.mce.ON_CALL_DISCONNECTED;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                        if (ajniVar4 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar4.b = defpackage.mcd.FAILED_TO_DISCONNECT_CALL;
                        ajniVar4.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("MissedCallNotificationRequestedForRemoteDisconnection", 186920);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("UserAnsweredCallFromManualScreening", 186755);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.DOBBY_IN_CALL_FRAGMENT_DESTROYED;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.bb((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 18:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 19:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("SilentlyScreeningNotificationInitialized", 197292);
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("MissedCallNotificationRequestedForNewCallDueToAlreadyScreening", 186918);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar10 = new defpackage.aacy();
        aonjVar7.a(aacyVar10);
        adcmVar5.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar9, aacyVar10}));
        final int i9 = 16;
        defpackage.aonj aonjVar8 = new defpackage.aonj() { // from class: mcs
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i9) {
                    case 0:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar11.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_BACKGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("MissedCallNotificationRequestedForDecliningMissedCall", 186924);
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar13.b = defpackage.aais.aI("UserSelectedSuggestedReplyWithReportSpamAction", 186761);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar14.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_REPORT_SPAM, defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 5:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar15.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("callAddedToReadyForManualScreening", 189377);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                        if (ajniVar3 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar3.b = defpackage.mcd.DOBBY_FAILED_TO_SET_INITIAL_LIFECYCLE_STATE;
                        ajniVar3.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("EndCallFromDobbyBackgroundDeclining", 186904);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar18.b = defpackage.mce.ON_CALL_DISCONNECTED;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                        if (ajniVar4 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar4.b = defpackage.mcd.FAILED_TO_DISCONNECT_CALL;
                        ajniVar4.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("MissedCallNotificationRequestedForRemoteDisconnection", 186920);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("UserAnsweredCallFromManualScreening", 186755);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.DOBBY_IN_CALL_FRAGMENT_DESTROYED;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.bb((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 18:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 19:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("SilentlyScreeningNotificationInitialized", 197292);
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("MissedCallNotificationRequestedForNewCallDueToAlreadyScreening", 186918);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.ajni ajniVar3 = new defpackage.ajni(null);
        aonjVar8.a(ajniVar3);
        final int i10 = 18;
        defpackage.aonj aonjVar9 = new defpackage.aonj() { // from class: mcs
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i10) {
                    case 0:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar11.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_BACKGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("MissedCallNotificationRequestedForDecliningMissedCall", 186924);
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar13.b = defpackage.aais.aI("UserSelectedSuggestedReplyWithReportSpamAction", 186761);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar14.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_REPORT_SPAM, defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 5:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar15.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("callAddedToReadyForManualScreening", 189377);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                        if (ajniVar4 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar4.b = defpackage.mcd.DOBBY_FAILED_TO_SET_INITIAL_LIFECYCLE_STATE;
                        ajniVar4.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("EndCallFromDobbyBackgroundDeclining", 186904);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar18.b = defpackage.mce.ON_CALL_DISCONNECTED;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar5 = (defpackage.ajni) obj;
                        if (ajniVar5 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar5.b = defpackage.mcd.FAILED_TO_DISCONNECT_CALL;
                        ajniVar5.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("MissedCallNotificationRequestedForRemoteDisconnection", 186920);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("UserAnsweredCallFromManualScreening", 186755);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.DOBBY_IN_CALL_FRAGMENT_DESTROYED;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.bb((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 18:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 19:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("SilentlyScreeningNotificationInitialized", 197292);
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("MissedCallNotificationRequestedForNewCallDueToAlreadyScreening", 186918);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.ajni ajniVar4 = new defpackage.ajni(null);
        aonjVar9.a(ajniVar4);
        adcmVar5.f(defpackage.ajsz.aI(set, defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar3, ajniVar4})));
        zaoVarArr[4] = adcmVar5.c();
        defpackage.adcm adcmVar6 = new defpackage.adcm(null);
        defpackage.mct mctVar = new defpackage.mct(2);
        defpackage.aacy aacyVar11 = new defpackage.aacy(null, null, null);
        mctVar.a(aacyVar11);
        adcmVar6.h = aacyVar11;
        adcmVar6.i = defpackage.mce.USER_CLICKED_ANSWER_CALL_FROM_AUTO_SCREENING_WITH_UI;
        adcmVar6.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar, mceVar8, mceVar9, mceVar7, mceVar10, mceVar11}));
        defpackage.mct mctVar2 = new defpackage.mct(4);
        defpackage.aacy aacyVar12 = new defpackage.aacy();
        mctVar2.a(aacyVar12);
        defpackage.mct mctVar3 = new defpackage.mct(5);
        defpackage.aacy aacyVar13 = new defpackage.aacy();
        mctVar3.a(aacyVar13);
        adcmVar6.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar12, aacyVar13}));
        defpackage.mct mctVar4 = new defpackage.mct(6);
        defpackage.ajni ajniVar5 = new defpackage.ajni(null);
        mctVar4.a(ajniVar5);
        defpackage.mct mctVar5 = new defpackage.mct(7);
        defpackage.ajni ajniVar6 = new defpackage.ajni(null);
        mctVar5.a(ajniVar6);
        adcmVar6.f(defpackage.ajsz.aI(set, defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar5, ajniVar6})));
        zaoVarArr[5] = adcmVar6.c();
        defpackage.adcm adcmVar7 = new defpackage.adcm(null);
        defpackage.aonj aonjVar10 = new defpackage.aonj() { // from class: mcs
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i2) {
                    case 0:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar14.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_BACKGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("MissedCallNotificationRequestedForDecliningMissedCall", 186924);
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("UserSelectedSuggestedReplyWithReportSpamAction", 186761);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar17.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_REPORT_SPAM, defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 5:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar18.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("callAddedToReadyForManualScreening", 189377);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.ajni ajniVar7 = (defpackage.ajni) obj;
                        if (ajniVar7 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar7.b = defpackage.mcd.DOBBY_FAILED_TO_SET_INITIAL_LIFECYCLE_STATE;
                        ajniVar7.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("EndCallFromDobbyBackgroundDeclining", 186904);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.ON_CALL_DISCONNECTED;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar8 = (defpackage.ajni) obj;
                        if (ajniVar8 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar8.b = defpackage.mcd.FAILED_TO_DISCONNECT_CALL;
                        ajniVar8.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("MissedCallNotificationRequestedForRemoteDisconnection", 186920);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("UserAnsweredCallFromManualScreening", 186755);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.DOBBY_IN_CALL_FRAGMENT_DESTROYED;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar115.b = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.bb((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 18:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 19:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("SilentlyScreeningNotificationInitialized", 197292);
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar117.b = defpackage.aais.aI("MissedCallNotificationRequestedForNewCallDueToAlreadyScreening", 186918);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar14 = new defpackage.aacy(null, null, null);
        aonjVar10.a(aacyVar14);
        adcmVar7.h = aacyVar14;
        adcmVar7.i = defpackage.mce.USER_SELECTED_SUGGESTED_REPLY_WITH_REPORT_SPAM_ACTION;
        adcmVar7.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar, mceVar8}));
        final int i11 = 4;
        defpackage.aonj aonjVar11 = new defpackage.aonj() { // from class: mcs
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i11) {
                    case 0:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar15.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_BACKGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("MissedCallNotificationRequestedForDecliningMissedCall", 186924);
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("UserSelectedSuggestedReplyWithReportSpamAction", 186761);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar18.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_REPORT_SPAM, defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 5:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar19.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("callAddedToReadyForManualScreening", 189377);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.ajni ajniVar7 = (defpackage.ajni) obj;
                        if (ajniVar7 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar7.b = defpackage.mcd.DOBBY_FAILED_TO_SET_INITIAL_LIFECYCLE_STATE;
                        ajniVar7.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("EndCallFromDobbyBackgroundDeclining", 186904);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.ON_CALL_DISCONNECTED;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar8 = (defpackage.ajni) obj;
                        if (ajniVar8 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar8.b = defpackage.mcd.FAILED_TO_DISCONNECT_CALL;
                        ajniVar8.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("MissedCallNotificationRequestedForRemoteDisconnection", 186920);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UserAnsweredCallFromManualScreening", 186755);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar115.b = defpackage.mce.DOBBY_IN_CALL_FRAGMENT_DESTROYED;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar116.b = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.bb((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 18:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 19:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar117.b = defpackage.aais.aI("SilentlyScreeningNotificationInitialized", 197292);
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("MissedCallNotificationRequestedForNewCallDueToAlreadyScreening", 186918);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar15 = new defpackage.aacy();
        aonjVar11.a(aacyVar15);
        java.util.Set setSingleton6 = java.util.Collections.singleton(aacyVar15);
        defpackage.aooh.e(setSingleton6, "singleton(...)");
        adcmVar7.g(setSingleton6);
        final int i12 = 5;
        defpackage.aonj aonjVar12 = new defpackage.aonj() { // from class: mcs
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i12) {
                    case 0:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar16.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_BACKGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("MissedCallNotificationRequestedForDecliningMissedCall", 186924);
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("UserSelectedSuggestedReplyWithReportSpamAction", 186761);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar19.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_REPORT_SPAM, defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 5:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("callAddedToReadyForManualScreening", 189377);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.ajni ajniVar7 = (defpackage.ajni) obj;
                        if (ajniVar7 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar7.b = defpackage.mcd.DOBBY_FAILED_TO_SET_INITIAL_LIFECYCLE_STATE;
                        ajniVar7.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("EndCallFromDobbyBackgroundDeclining", 186904);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar113.b = defpackage.mce.ON_CALL_DISCONNECTED;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar8 = (defpackage.ajni) obj;
                        if (ajniVar8 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar8.b = defpackage.mcd.FAILED_TO_DISCONNECT_CALL;
                        ajniVar8.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("MissedCallNotificationRequestedForRemoteDisconnection", 186920);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("UserAnsweredCallFromManualScreening", 186755);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar116.b = defpackage.mce.DOBBY_IN_CALL_FRAGMENT_DESTROYED;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.bb((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 18:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 19:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("SilentlyScreeningNotificationInitialized", 197292);
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("MissedCallNotificationRequestedForNewCallDueToAlreadyScreening", 186918);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.ajni ajniVar7 = new defpackage.ajni(null);
        aonjVar12.a(ajniVar7);
        java.util.Set setSingleton7 = java.util.Collections.singleton(ajniVar7);
        defpackage.aooh.e(setSingleton7, "singleton(...)");
        adcmVar7.f(defpackage.ajsz.aI(set, setSingleton7));
        zaoVarArr[6] = adcmVar7.c();
        defpackage.adcm adcmVar8 = new defpackage.adcm(null);
        final int i13 = 20;
        defpackage.mct mctVar6 = new defpackage.mct(20);
        defpackage.aacy aacyVar16 = new defpackage.aacy(null, null, null);
        mctVar6.a(aacyVar16);
        adcmVar8.h = aacyVar16;
        adcmVar8.i = defpackage.mce.USER_SELECTED_SUGGESTED_REPLY_WITH_END_CALL_ACTION;
        adcmVar8.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar, mceVar8}));
        defpackage.mcu mcuVar5 = new defpackage.mcu(1);
        defpackage.aacy aacyVar17 = new defpackage.aacy();
        mcuVar5.a(aacyVar17);
        java.util.Set setSingleton8 = java.util.Collections.singleton(aacyVar17);
        defpackage.aooh.e(setSingleton8, "singleton(...)");
        adcmVar8.g(setSingleton8);
        defpackage.mcu mcuVar6 = new defpackage.mcu(0);
        defpackage.ajni ajniVar8 = new defpackage.ajni(null);
        mcuVar6.a(ajniVar8);
        java.util.Set setSingleton9 = java.util.Collections.singleton(ajniVar8);
        defpackage.aooh.e(setSingleton9, "singleton(...)");
        adcmVar8.f(defpackage.ajsz.aI(set, setSingleton9));
        zaoVarArr[7] = adcmVar8.c();
        defpackage.adcm adcmVar9 = new defpackage.adcm(null);
        defpackage.mcu mcuVar7 = new defpackage.mcu(7);
        defpackage.aacy aacyVar18 = new defpackage.aacy(null, null, null);
        mcuVar7.a(aacyVar18);
        adcmVar9.h = aacyVar18;
        adcmVar9.i = defpackage.mce.USER_SELECTED_SUGGESTED_REPLY_WITHOUT_END_CALL_ACTION;
        adcmVar9.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar, mceVar8}));
        defpackage.mcu mcuVar8 = new defpackage.mcu(8);
        defpackage.aacy aacyVar19 = new defpackage.aacy();
        mcuVar8.a(aacyVar19);
        java.util.Set setSingleton10 = java.util.Collections.singleton(aacyVar19);
        defpackage.aooh.e(setSingleton10, "singleton(...)");
        adcmVar9.g(setSingleton10);
        adcmVar9.f(set);
        zaoVarArr[8] = adcmVar9.c();
        defpackage.adcm adcmVar10 = new defpackage.adcm(null);
        defpackage.mcv mcvVar = new defpackage.mcv(2);
        defpackage.aacy aacyVar20 = new defpackage.aacy(null, null, null);
        mcvVar.a(aacyVar20);
        adcmVar10.h = aacyVar20;
        adcmVar10.i = defpackage.mce.DOBBY_PLAY_RECORDING_STARTED;
        adcmVar10.a = defpackage.mce.DOBBY_PLAY_RECORDING_COMPLETED;
        defpackage.aolg aolgVar = new defpackage.aolg();
        defpackage.mce mceVar12 = defpackage.mce.ON_CALL_DISCONNECTED;
        aolgVar.add(mceVar12);
        aolgVar.add(mceVar9);
        if (((java.lang.Boolean) this.a.a()).booleanValue()) {
            aolgVar.add(mceVar3);
            aolgVar.add(mceVar);
        }
        adcmVar10.d(aolgVar.b());
        adcmVar10.f(this.d);
        zaoVarArr[9] = adcmVar10.c();
        defpackage.adcm adcmVar11 = new defpackage.adcm(null);
        final int i14 = 19;
        defpackage.mcu mcuVar9 = new defpackage.mcu(19);
        defpackage.aacy aacyVar21 = new defpackage.aacy(null, null, null);
        mcuVar9.a(aacyVar21);
        adcmVar11.h = aacyVar21;
        adcmVar11.i = defpackage.mce.DOBBY_END_CALL_FROM_FOREGROUND_DECLINING;
        adcmVar11.a = mceVar12;
        defpackage.mce mceVar13 = defpackage.mce.SINGLE_CALL_ALREADY_DISCONNECTED;
        java.util.Set setSingleton11 = java.util.Collections.singleton(mceVar13);
        defpackage.aooh.e(setSingleton11, "singleton(...)");
        adcmVar11.d(setSingleton11);
        defpackage.mcu mcuVar10 = new defpackage.mcu(20);
        defpackage.ajni ajniVar9 = new defpackage.ajni(null);
        mcuVar10.a(ajniVar9);
        java.util.Set setSingleton12 = java.util.Collections.singleton(ajniVar9);
        defpackage.aooh.e(setSingleton12, "singleton(...)");
        adcmVar11.f(setSingleton12);
        final int i15 = 10;
        zaoVarArr[10] = adcmVar11.c();
        defpackage.adcm adcmVar12 = new defpackage.adcm(null);
        final int i16 = 9;
        defpackage.aonj aonjVar13 = new defpackage.aonj() { // from class: mcs
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i16) {
                    case 0:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_BACKGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationRequestedForDecliningMissedCall", 186924);
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserSelectedSuggestedReplyWithReportSpamAction", 186761);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_REPORT_SPAM, defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 5:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("callAddedToReadyForManualScreening", 189377);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.ajni ajniVar10 = (defpackage.ajni) obj;
                        if (ajniVar10 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar10.b = defpackage.mcd.DOBBY_FAILED_TO_SET_INITIAL_LIFECYCLE_STATE;
                        ajniVar10.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("EndCallFromDobbyBackgroundDeclining", 186904);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ON_CALL_DISCONNECTED;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar11 = (defpackage.ajni) obj;
                        if (ajniVar11 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar11.b = defpackage.mcd.FAILED_TO_DISCONNECT_CALL;
                        ajniVar11.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("MissedCallNotificationRequestedForRemoteDisconnection", 186920);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("UserAnsweredCallFromManualScreening", 186755);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.DOBBY_IN_CALL_FRAGMENT_DESTROYED;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.bb((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 18:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 19:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("SilentlyScreeningNotificationInitialized", 197292);
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("MissedCallNotificationRequestedForNewCallDueToAlreadyScreening", 186918);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar22 = new defpackage.aacy(null, null, null);
        aonjVar13.a(aacyVar22);
        adcmVar12.h = aacyVar22;
        adcmVar12.i = defpackage.mce.DOBBY_END_CALL_FROM_BACKGROUND_DECLINING;
        defpackage.aonj aonjVar14 = new defpackage.aonj() { // from class: mcs
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i15) {
                    case 0:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_BACKGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationRequestedForDecliningMissedCall", 186924);
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserSelectedSuggestedReplyWithReportSpamAction", 186761);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_REPORT_SPAM, defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 5:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("callAddedToReadyForManualScreening", 189377);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.ajni ajniVar10 = (defpackage.ajni) obj;
                        if (ajniVar10 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar10.b = defpackage.mcd.DOBBY_FAILED_TO_SET_INITIAL_LIFECYCLE_STATE;
                        ajniVar10.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("EndCallFromDobbyBackgroundDeclining", 186904);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ON_CALL_DISCONNECTED;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar11 = (defpackage.ajni) obj;
                        if (ajniVar11 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar11.b = defpackage.mcd.FAILED_TO_DISCONNECT_CALL;
                        ajniVar11.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("MissedCallNotificationRequestedForRemoteDisconnection", 186920);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("UserAnsweredCallFromManualScreening", 186755);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.DOBBY_IN_CALL_FRAGMENT_DESTROYED;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.bb((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 18:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 19:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("SilentlyScreeningNotificationInitialized", 197292);
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("MissedCallNotificationRequestedForNewCallDueToAlreadyScreening", 186918);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar23 = new defpackage.aacy();
        aonjVar14.a(aacyVar23);
        java.util.Set setSingleton13 = java.util.Collections.singleton(aacyVar23);
        defpackage.aooh.e(setSingleton13, "singleton(...)");
        adcmVar12.e(setSingleton13);
        java.util.Set setSingleton14 = java.util.Collections.singleton(mceVar13);
        defpackage.aooh.e(setSingleton14, "singleton(...)");
        adcmVar12.d(setSingleton14);
        final int i17 = 11;
        defpackage.aonj aonjVar15 = new defpackage.aonj() { // from class: mcs
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i17) {
                    case 0:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_BACKGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationRequestedForDecliningMissedCall", 186924);
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserSelectedSuggestedReplyWithReportSpamAction", 186761);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_REPORT_SPAM, defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 5:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("callAddedToReadyForManualScreening", 189377);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.ajni ajniVar10 = (defpackage.ajni) obj;
                        if (ajniVar10 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar10.b = defpackage.mcd.DOBBY_FAILED_TO_SET_INITIAL_LIFECYCLE_STATE;
                        ajniVar10.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("EndCallFromDobbyBackgroundDeclining", 186904);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ON_CALL_DISCONNECTED;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar11 = (defpackage.ajni) obj;
                        if (ajniVar11 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar11.b = defpackage.mcd.FAILED_TO_DISCONNECT_CALL;
                        ajniVar11.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("MissedCallNotificationRequestedForRemoteDisconnection", 186920);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("UserAnsweredCallFromManualScreening", 186755);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.DOBBY_IN_CALL_FRAGMENT_DESTROYED;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.bb((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 18:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 19:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("SilentlyScreeningNotificationInitialized", 197292);
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("MissedCallNotificationRequestedForNewCallDueToAlreadyScreening", 186918);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.ajni ajniVar10 = new defpackage.ajni(null);
        aonjVar15.a(ajniVar10);
        java.util.Set setSingleton15 = java.util.Collections.singleton(ajniVar10);
        defpackage.aooh.e(setSingleton15, "singleton(...)");
        adcmVar12.f(setSingleton15);
        zaoVarArr[11] = adcmVar12.c();
        defpackage.adcm adcmVar13 = new defpackage.adcm(null);
        defpackage.mct mctVar7 = new defpackage.mct(3);
        defpackage.aacy aacyVar24 = new defpackage.aacy(null, null, null);
        mctVar7.a(aacyVar24);
        adcmVar13.h = aacyVar24;
        defpackage.mce mceVar14 = defpackage.mce.USER_CLICKED_ANSWER_CALL_FROM_NOTIFICATION_DURING_SCREENING;
        adcmVar13.i = mceVar14;
        java.util.Set setSingleton16 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton16, "singleton(...)");
        adcmVar13.d(setSingleton16);
        adcmVar13.a = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
        defpackage.mct mctVar8 = new defpackage.mct(14);
        defpackage.ajni ajniVar11 = new defpackage.ajni(null);
        mctVar8.a(ajniVar11);
        defpackage.mcu mcuVar11 = new defpackage.mcu(4);
        defpackage.ajni ajniVar12 = new defpackage.ajni(null);
        mcuVar11.a(ajniVar12);
        adcmVar13.f(defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar11, ajniVar12}));
        final int i18 = 12;
        zaoVarArr[12] = adcmVar13.c();
        defpackage.adcm adcmVar14 = new defpackage.adcm(null);
        defpackage.mco mcoVar2 = new defpackage.mco(17);
        defpackage.aacy aacyVar25 = new defpackage.aacy(null, null, null);
        mcoVar2.a(aacyVar25);
        adcmVar14.h = aacyVar25;
        defpackage.mce mceVar15 = defpackage.mce.USER_CLICKED_HANG_UP_FROM_NOTIFICATION_DURING_SCREENING;
        adcmVar14.i = mceVar15;
        java.util.Set setSingleton17 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton17, "singleton(...)");
        adcmVar14.d(setSingleton17);
        defpackage.mco mcoVar3 = new defpackage.mco(18);
        defpackage.aacy aacyVar26 = new defpackage.aacy();
        mcoVar3.a(aacyVar26);
        java.util.Set setSingleton18 = java.util.Collections.singleton(aacyVar26);
        defpackage.aooh.e(setSingleton18, "singleton(...)");
        adcmVar14.g(setSingleton18);
        defpackage.mco mcoVar4 = new defpackage.mco(19);
        defpackage.ajni ajniVar13 = new defpackage.ajni(null);
        mcoVar4.a(ajniVar13);
        java.util.Set setSingleton19 = java.util.Collections.singleton(ajniVar13);
        defpackage.aooh.e(setSingleton19, "singleton(...)");
        adcmVar14.f(defpackage.ajsz.aI(set, setSingleton19));
        zaoVarArr[13] = adcmVar14.c();
        defpackage.adcm adcmVar15 = new defpackage.adcm(null);
        defpackage.mcu mcuVar12 = new defpackage.mcu(10);
        defpackage.aacy aacyVar27 = new defpackage.aacy(null, null, null);
        mcuVar12.a(aacyVar27);
        adcmVar15.h = aacyVar27;
        adcmVar15.i = defpackage.mce.USER_ANSWERED_CALL_FROM_ANSWER_SCREEN_AFTER_SCREENING;
        java.util.Set setSingleton20 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton20, "singleton(...)");
        adcmVar15.d(setSingleton20);
        adcmVar15.a = defpackage.mce.DOBBY_ANSWERED_CALL;
        defpackage.mcu mcuVar13 = new defpackage.mcu(11);
        defpackage.ajni ajniVar14 = new defpackage.ajni(null);
        mcuVar13.a(ajniVar14);
        defpackage.mcu mcuVar14 = new defpackage.mcu(12);
        defpackage.ajni ajniVar15 = new defpackage.ajni(null);
        mcuVar14.a(ajniVar15);
        adcmVar15.f(defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar14, ajniVar15}));
        zaoVarArr[14] = adcmVar15.c();
        defpackage.adcm adcmVar16 = new defpackage.adcm(null);
        defpackage.mcu mcuVar15 = new defpackage.mcu(16);
        defpackage.aacy aacyVar28 = new defpackage.aacy(null, null, null);
        mcuVar15.a(aacyVar28);
        adcmVar16.h = aacyVar28;
        adcmVar16.i = defpackage.mce.USER_DECLINED_CALL_FROM_ANSWER_SCREEN_AFTER_SCREENING;
        adcmVar16.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar, defpackage.mce.DOBBY_POST_ACS_TAKE_A_MESSAGE}));
        defpackage.mcu mcuVar16 = new defpackage.mcu(17);
        defpackage.aacy aacyVar29 = new defpackage.aacy();
        mcuVar16.a(aacyVar29);
        java.util.Set setSingleton21 = java.util.Collections.singleton(aacyVar29);
        defpackage.aooh.e(setSingleton21, "singleton(...)");
        adcmVar16.g(setSingleton21);
        defpackage.mcu mcuVar17 = new defpackage.mcu(18);
        defpackage.ajni ajniVar16 = new defpackage.ajni(null);
        mcuVar17.a(ajniVar16);
        java.util.Set setSingleton22 = java.util.Collections.singleton(ajniVar16);
        defpackage.aooh.e(setSingleton22, "singleton(...)");
        adcmVar16.f(defpackage.ajsz.aI(set, setSingleton22));
        zaoVarArr[15] = adcmVar16.c();
        defpackage.adcm adcmVar17 = new defpackage.adcm(null);
        defpackage.mcu mcuVar18 = new defpackage.mcu(14);
        defpackage.aacy aacyVar30 = new defpackage.aacy(null, null, null);
        mcuVar18.a(aacyVar30);
        adcmVar17.h = aacyVar30;
        adcmVar17.i = defpackage.mce.USER_CLICKED_REPORT_SPAM_FROM_ANSWER_SCREEN;
        java.util.Set setSingleton23 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton23, "singleton(...)");
        adcmVar17.d(setSingleton23);
        defpackage.mcv mcvVar2 = new defpackage.mcv(1);
        defpackage.aacy aacyVar31 = new defpackage.aacy();
        mcvVar2.a(aacyVar31);
        java.util.Set setSingleton24 = java.util.Collections.singleton(aacyVar31);
        defpackage.aooh.e(setSingleton24, "singleton(...)");
        adcmVar17.g(setSingleton24);
        defpackage.mcv mcvVar3 = new defpackage.mcv(0);
        defpackage.ajni ajniVar17 = new defpackage.ajni(null);
        mcvVar3.a(ajniVar17);
        java.util.Set setSingleton25 = java.util.Collections.singleton(ajniVar17);
        defpackage.aooh.e(setSingleton25, "singleton(...)");
        adcmVar17.f(defpackage.ajsz.aI(set, setSingleton25));
        zaoVarArr[16] = adcmVar17.c();
        defpackage.adcm adcmVar18 = new defpackage.adcm(null);
        defpackage.mco mcoVar5 = new defpackage.mco(20);
        defpackage.aacy aacyVar32 = new defpackage.aacy(null, null, null);
        mcoVar5.a(aacyVar32);
        adcmVar18.h = aacyVar32;
        adcmVar18.i = defpackage.mce.USER_CLICKED_CALL_YOU_BACK_FROM_ANSWER_SCREEN;
        java.util.Set setSingleton26 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton26, "singleton(...)");
        adcmVar18.d(setSingleton26);
        final int i19 = 1;
        defpackage.aonj aonjVar16 = new defpackage.aonj() { // from class: mcs
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i19) {
                    case 0:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_BACKGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationRequestedForDecliningMissedCall", 186924);
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserSelectedSuggestedReplyWithReportSpamAction", 186761);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_REPORT_SPAM, defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 5:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("callAddedToReadyForManualScreening", 189377);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.ajni ajniVar18 = (defpackage.ajni) obj;
                        if (ajniVar18 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar18.b = defpackage.mcd.DOBBY_FAILED_TO_SET_INITIAL_LIFECYCLE_STATE;
                        ajniVar18.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("EndCallFromDobbyBackgroundDeclining", 186904);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ON_CALL_DISCONNECTED;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar19 = (defpackage.ajni) obj;
                        if (ajniVar19 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar19.b = defpackage.mcd.FAILED_TO_DISCONNECT_CALL;
                        ajniVar19.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("MissedCallNotificationRequestedForRemoteDisconnection", 186920);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("UserAnsweredCallFromManualScreening", 186755);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.DOBBY_IN_CALL_FRAGMENT_DESTROYED;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.bb((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 18:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 19:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("SilentlyScreeningNotificationInitialized", 197292);
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("MissedCallNotificationRequestedForNewCallDueToAlreadyScreening", 186918);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar33 = new defpackage.aacy();
        aonjVar16.a(aacyVar33);
        java.util.Set setSingleton27 = java.util.Collections.singleton(aacyVar33);
        defpackage.aooh.e(setSingleton27, "singleton(...)");
        adcmVar18.g(setSingleton27);
        final int i20 = 0;
        defpackage.aonj aonjVar17 = new defpackage.aonj() { // from class: mcs
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i20) {
                    case 0:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_BACKGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationRequestedForDecliningMissedCall", 186924);
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserSelectedSuggestedReplyWithReportSpamAction", 186761);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_REPORT_SPAM, defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 5:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("callAddedToReadyForManualScreening", 189377);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.ajni ajniVar18 = (defpackage.ajni) obj;
                        if (ajniVar18 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar18.b = defpackage.mcd.DOBBY_FAILED_TO_SET_INITIAL_LIFECYCLE_STATE;
                        ajniVar18.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("EndCallFromDobbyBackgroundDeclining", 186904);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ON_CALL_DISCONNECTED;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar19 = (defpackage.ajni) obj;
                        if (ajniVar19 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar19.b = defpackage.mcd.FAILED_TO_DISCONNECT_CALL;
                        ajniVar19.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("MissedCallNotificationRequestedForRemoteDisconnection", 186920);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("UserAnsweredCallFromManualScreening", 186755);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.DOBBY_IN_CALL_FRAGMENT_DESTROYED;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.bb((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 18:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 19:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("SilentlyScreeningNotificationInitialized", 197292);
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("MissedCallNotificationRequestedForNewCallDueToAlreadyScreening", 186918);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.ajni ajniVar18 = new defpackage.ajni(null);
        aonjVar17.a(ajniVar18);
        java.util.Set setSingleton28 = java.util.Collections.singleton(ajniVar18);
        defpackage.aooh.e(setSingleton28, "singleton(...)");
        adcmVar18.f(defpackage.ajsz.aI(set, setSingleton28));
        zaoVarArr[17] = adcmVar18.c();
        defpackage.adcm adcmVar19 = new defpackage.adcm(null);
        defpackage.mcu mcuVar19 = new defpackage.mcu(6);
        defpackage.aacy aacyVar34 = new defpackage.aacy(null, null, null);
        mcuVar19.a(aacyVar34);
        adcmVar19.h = aacyVar34;
        adcmVar19.i = defpackage.mce.USER_CLICKED_TAKE_A_MESSAGE_FROM_ANSWER_SCREEN;
        defpackage.mce mceVar16 = defpackage.mce.DOBBY_TAKE_A_MESSAGE_STARTED;
        adcmVar19.a = mceVar16;
        java.util.Set setSingleton29 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton29, "singleton(...)");
        adcmVar19.d(setSingleton29);
        adcmVar19.f(set);
        zaoVarArr[18] = adcmVar19.c();
        defpackage.adcm adcmVar20 = new defpackage.adcm(null);
        defpackage.aonj aonjVar18 = new defpackage.aonj() { // from class: mcs
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i13) {
                    case 0:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_BACKGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationRequestedForDecliningMissedCall", 186924);
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserSelectedSuggestedReplyWithReportSpamAction", 186761);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_REPORT_SPAM, defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 5:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("callAddedToReadyForManualScreening", 189377);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.ajni ajniVar19 = (defpackage.ajni) obj;
                        if (ajniVar19 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar19.b = defpackage.mcd.DOBBY_FAILED_TO_SET_INITIAL_LIFECYCLE_STATE;
                        ajniVar19.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("EndCallFromDobbyBackgroundDeclining", 186904);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ON_CALL_DISCONNECTED;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar110 = (defpackage.ajni) obj;
                        if (ajniVar110 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar110.b = defpackage.mcd.FAILED_TO_DISCONNECT_CALL;
                        ajniVar110.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("MissedCallNotificationRequestedForRemoteDisconnection", 186920);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("UserAnsweredCallFromManualScreening", 186755);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.DOBBY_IN_CALL_FRAGMENT_DESTROYED;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.bb((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 18:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 19:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("SilentlyScreeningNotificationInitialized", 197292);
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("MissedCallNotificationRequestedForNewCallDueToAlreadyScreening", 186918);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar35 = new defpackage.aacy(null, null, null);
        aonjVar18.a(aacyVar35);
        adcmVar20.h = aacyVar35;
        adcmVar20.i = defpackage.mce.DOBBY_REJECT_CALL_DUE_TO_ALREADY_SCREENING;
        defpackage.mce mceVar17 = defpackage.mce.DOBBY_MISSED_CALL_NOTIFICATION_REQUESTED;
        adcmVar20.a = mceVar17;
        zaoVarArr[19] = adcmVar20.c();
        defpackage.adcm adcmVar21 = new defpackage.adcm(null);
        defpackage.aonj aonjVar19 = new defpackage.aonj() { // from class: mcs
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i18) {
                    case 0:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_BACKGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationRequestedForDecliningMissedCall", 186924);
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserSelectedSuggestedReplyWithReportSpamAction", 186761);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_REPORT_SPAM, defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 5:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("callAddedToReadyForManualScreening", 189377);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.ajni ajniVar19 = (defpackage.ajni) obj;
                        if (ajniVar19 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar19.b = defpackage.mcd.DOBBY_FAILED_TO_SET_INITIAL_LIFECYCLE_STATE;
                        ajniVar19.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("EndCallFromDobbyBackgroundDeclining", 186904);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ON_CALL_DISCONNECTED;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar110 = (defpackage.ajni) obj;
                        if (ajniVar110 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar110.b = defpackage.mcd.FAILED_TO_DISCONNECT_CALL;
                        ajniVar110.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("MissedCallNotificationRequestedForRemoteDisconnection", 186920);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("UserAnsweredCallFromManualScreening", 186755);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.DOBBY_IN_CALL_FRAGMENT_DESTROYED;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.bb((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 18:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 19:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("SilentlyScreeningNotificationInitialized", 197292);
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("MissedCallNotificationRequestedForNewCallDueToAlreadyScreening", 186918);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar36 = new defpackage.aacy(null, null, null);
        aonjVar19.a(aacyVar36);
        adcmVar21.h = aacyVar36;
        adcmVar21.i = defpackage.mce.DOBBY_REMOTE_DISCONNECT_FROM_NOT_SPAM;
        adcmVar21.a = mceVar17;
        zaoVarArr[20] = adcmVar21.c();
        defpackage.adcm adcmVar22 = new defpackage.adcm(null);
        final int i21 = 2;
        defpackage.aonj aonjVar20 = new defpackage.aonj() { // from class: mcs
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i21) {
                    case 0:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_BACKGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationRequestedForDecliningMissedCall", 186924);
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserSelectedSuggestedReplyWithReportSpamAction", 186761);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_REPORT_SPAM, defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 5:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("callAddedToReadyForManualScreening", 189377);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.ajni ajniVar19 = (defpackage.ajni) obj;
                        if (ajniVar19 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar19.b = defpackage.mcd.DOBBY_FAILED_TO_SET_INITIAL_LIFECYCLE_STATE;
                        ajniVar19.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("EndCallFromDobbyBackgroundDeclining", 186904);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ON_CALL_DISCONNECTED;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar110 = (defpackage.ajni) obj;
                        if (ajniVar110 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar110.b = defpackage.mcd.FAILED_TO_DISCONNECT_CALL;
                        ajniVar110.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("MissedCallNotificationRequestedForRemoteDisconnection", 186920);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("UserAnsweredCallFromManualScreening", 186755);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.DOBBY_IN_CALL_FRAGMENT_DESTROYED;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.bb((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 18:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 19:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("SilentlyScreeningNotificationInitialized", 197292);
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("MissedCallNotificationRequestedForNewCallDueToAlreadyScreening", 186918);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar37 = new defpackage.aacy(null, null, null);
        aonjVar20.a(aacyVar37);
        adcmVar22.h = aacyVar37;
        adcmVar22.i = defpackage.mce.DOBBY_DECLINE_CALL_AS_MISSED_CALL;
        adcmVar22.a = mceVar17;
        zaoVarArr[21] = adcmVar22.c();
        defpackage.aaif aaifVarAI = defpackage.aais.aI("RingingAfterScreeningNotificationInitialized", 196926);
        defpackage.aaif aaifVarAI2 = defpackage.aais.aI("RingingAfterScreeningAnswerScreenCreated", 308753);
        defpackage.adcm adcmVar23 = new defpackage.adcm(null);
        defpackage.gxo gxoVar = new defpackage.gxo(aaifVarAI, 12);
        defpackage.aacy aacyVar38 = new defpackage.aacy(null, null, null);
        gxoVar.a(aacyVar38);
        adcmVar23.h = aacyVar38;
        adcmVar23.i = defpackage.mce.DOBBY_STARTED_RINGING;
        defpackage.mct mctVar9 = new defpackage.mct(1);
        defpackage.aacy aacyVar39 = new defpackage.aacy();
        mctVar9.a(aacyVar39);
        defpackage.gxo gxoVar2 = new defpackage.gxo(aaifVarAI2, 13);
        defpackage.aacy aacyVar40 = new defpackage.aacy();
        gxoVar2.a(aacyVar40);
        adcmVar23.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar39, aacyVar40}));
        adcmVar23.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar, mceVar6, mceVar14, mceVar15, defpackage.mce.DOBBY_ALREADY_RINGING_DURING_ACTIVE_SESSION}));
        defpackage.mct mctVar10 = new defpackage.mct(0);
        defpackage.ajni ajniVar19 = new defpackage.ajni(null);
        mctVar10.a(ajniVar19);
        java.util.Set setSingleton30 = java.util.Collections.singleton(ajniVar19);
        defpackage.aooh.e(setSingleton30, "singleton(...)");
        adcmVar23.f(setSingleton30);
        zaoVarArr[22] = adcmVar23.c();
        defpackage.adcm adcmVar24 = new defpackage.adcm(null);
        defpackage.aonj aonjVar21 = new defpackage.aonj() { // from class: mcs
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i14) {
                    case 0:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_BACKGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MissedCallNotificationRequestedForDecliningMissedCall", 186924);
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("UserSelectedSuggestedReplyWithReportSpamAction", 186761);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_REPORT_SPAM, defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case 5:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.DOBBY_FOREGROUND_DECLINING_START, defpackage.mce.DOBBY_NEW_BOT_MESSAGE_RECEIVED, defpackage.mce.DOBBY_PLAY_RECORDING_STARTED});
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("callAddedToReadyForManualScreening", 189377);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.ajni ajniVar110 = (defpackage.ajni) obj;
                        if (ajniVar110 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar110.b = defpackage.mcd.DOBBY_FAILED_TO_SET_INITIAL_LIFECYCLE_STATE;
                        ajniVar110.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("EndCallFromDobbyBackgroundDeclining", 186904);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ON_CALL_DISCONNECTED;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar111 = (defpackage.ajni) obj;
                        if (ajniVar111 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar111.b = defpackage.mcd.FAILED_TO_DISCONNECT_CALL;
                        ajniVar111.c = defpackage.zar.UNKNOWN_ERROR;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("MissedCallNotificationRequestedForRemoteDisconnection", 186920);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("UserAnsweredCallFromManualScreening", 186755);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.DOBBY_IN_CALL_FRAGMENT_DESTROYED;
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED;
                        return defpackage.aojh.a;
                    case 16:
                        return defpackage.mni.bb((defpackage.ajni) obj);
                    case 17:
                        return defpackage.mni.bc((defpackage.ajni) obj);
                    case 18:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 19:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("SilentlyScreeningNotificationInitialized", 197292);
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("MissedCallNotificationRequestedForNewCallDueToAlreadyScreening", 186918);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar41 = new defpackage.aacy(null, null, null);
        aonjVar21.a(aacyVar41);
        adcmVar24.h = aacyVar41;
        adcmVar24.i = mceVar2;
        adcmVar24.a = defpackage.mce.DOBBY_SILENTLY_SCREENING_NOTIFICATION_REQUESTED;
        java.util.Set setSingleton31 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton31, "singleton(...)");
        adcmVar24.d(setSingleton31);
        zaoVarArr[23] = adcmVar24.c();
        defpackage.adcm adcmVar25 = new defpackage.adcm(null);
        defpackage.mcu mcuVar20 = new defpackage.mcu(5);
        defpackage.aacy aacyVar42 = new defpackage.aacy(null, null, null);
        mcuVar20.a(aacyVar42);
        adcmVar25.h = aacyVar42;
        adcmVar25.i = defpackage.mce.DOBBY_RINGING_TIMEOUT;
        adcmVar25.a = mceVar16;
        java.util.Set setSingleton32 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton32, "singleton(...)");
        adcmVar25.d(setSingleton32);
        adcmVar25.f(set);
        zaoVarArr[24] = adcmVar25.c();
        defpackage.adcm adcmVar26 = new defpackage.adcm(null);
        defpackage.gxo gxoVar3 = new defpackage.gxo(adcmVar26, 14);
        defpackage.aacy aacyVar43 = new defpackage.aacy(null, null, null);
        gxoVar3.a(aacyVar43);
        adcmVar26.h = aacyVar43;
        zaoVarArr[25] = adcmVar26.c();
        defpackage.adcm adcmVar27 = new defpackage.adcm(null);
        defpackage.gxo gxoVar4 = new defpackage.gxo(adcmVar27, 11);
        defpackage.aacy aacyVar44 = new defpackage.aacy(null, null, null);
        gxoVar4.a(aacyVar44);
        adcmVar27.h = aacyVar44;
        zaoVarArr[26] = adcmVar27.c();
        defpackage.adcm adcmVar28 = new defpackage.adcm(null);
        defpackage.gxo gxoVar5 = new defpackage.gxo(adcmVar28, 10);
        defpackage.aacy aacyVar45 = new defpackage.aacy(null, null, null);
        gxoVar5.a(aacyVar45);
        adcmVar28.h = aacyVar45;
        zaoVarArr[27] = adcmVar28.c();
        java.util.List listAsList = java.util.Arrays.asList(zaoVarArr);
        defpackage.aooh.e(listAsList, "asList(...)");
        return listAsList;
    }
}
