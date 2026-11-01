package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mdg implements defpackage.zaq {
    @Override // defpackage.zaq
    public final java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.adcm adcmVar = new defpackage.adcm(null);
        final int i = 1;
        defpackage.aonj aonjVar = new defpackage.aonj() { // from class: mde
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i) {
                    case 0:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar = (defpackage.aacy) obj;
                        if (aacyVar == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar.b = defpackage.aais.aI("OutgoingCallConnectedToChronometerShown", 174966);
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.aacy aacyVar2 = (defpackage.aacy) obj;
                        if (aacyVar2 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar2.b = defpackage.aais.aI("MuteStateRequestedToMuteButtonUpdated", 174984);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                        if (aacyVar3 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar3.b = defpackage.aais.aI("AddCallButtonClickedToAddCallUiShown", 174986);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 10:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.FAILED_TO_DISMISS_KEYGUARD;
                        ajniVar.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar2 = (defpackage.ajni) obj;
                        if (ajniVar2 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar2.b = defpackage.mcd.FAILED_TO_START_ADD_CALL_SCREEN;
                        ajniVar2.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                        if (ajniVar3 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar3.b = defpackage.mcd.FAILED_TO_LOAD_INCALLSCREEN_HOST_MODEL;
                        ajniVar3.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                        if (aacyVar4 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar4.b = defpackage.mce.HOLD_REQUESTED;
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                        if (aacyVar5 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar5.b = defpackage.aais.aI("HoldWhileRecordingPromptConfirmHoldToHoldRequested", 174992);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                        if (aacyVar6 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar6.b = defpackage.aais.aI("HoldRequestedToUnholdButtonShown", 174994);
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar7.b = defpackage.aais.aI("UnholdButtonClickedToUnholdRequested", 174996);
                        return defpackage.aojh.a;
                    case 19:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar = new defpackage.aacy(null, null, null);
        aonjVar.a(aacyVar);
        adcmVar.h = aacyVar;
        adcmVar.i = defpackage.mce.SINGLE_CALL_CONNECTED;
        adcmVar.a = defpackage.mce.CHRONOMETER_SHOWN;
        defpackage.mce mceVar = defpackage.mce.SINGLE_CALL_IN_CALL_ACTIVITY_DESTROYED;
        final int i2 = 0;
        defpackage.mce mceVar2 = defpackage.mce.ON_IN_CALL_ACTIVITY_STOPPED;
        final int i3 = 2;
        final int i4 = 3;
        final int i5 = 4;
        final int i6 = 5;
        defpackage.mce mceVar3 = defpackage.mce.ON_CALL_REMOVED;
        final int i7 = 9;
        adcmVar.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar, mceVar2, defpackage.mce.INCOMING_OR_UNKNOWN_CALL_DIRECTION, defpackage.mce.IN_CALL_ACTIVITY_NOT_VISIBLE_AT_CALL_CONNECTED, defpackage.mce.EMERGENCY_VOICE_FRAGMENT_DATA_LOADED, defpackage.mce.CALL_SCREENING_INITIALIZED, defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN, defpackage.mce.VIDEO_CALL_CONNECTED, mceVar3, defpackage.mce.CHRONOMETER_NOT_SHOWN_BECAUSE_DISPLAY_OFF}));
        defpackage.aonj aonjVar2 = new defpackage.aonj() { // from class: mde
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i3) {
                    case 0:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar2 = (defpackage.aacy) obj;
                        if (aacyVar2 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar2.b = defpackage.aais.aI("OutgoingCallConnectedToChronometerShown", 174966);
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                        if (aacyVar3 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar3.b = defpackage.aais.aI("MuteStateRequestedToMuteButtonUpdated", 174984);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                        if (aacyVar4 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar4.b = defpackage.aais.aI("AddCallButtonClickedToAddCallUiShown", 174986);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 10:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.FAILED_TO_DISMISS_KEYGUARD;
                        ajniVar.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar2 = (defpackage.ajni) obj;
                        if (ajniVar2 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar2.b = defpackage.mcd.FAILED_TO_START_ADD_CALL_SCREEN;
                        ajniVar2.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                        if (ajniVar3 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar3.b = defpackage.mcd.FAILED_TO_LOAD_INCALLSCREEN_HOST_MODEL;
                        ajniVar3.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                        if (aacyVar5 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar5.b = defpackage.mce.HOLD_REQUESTED;
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                        if (aacyVar6 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar6.b = defpackage.aais.aI("HoldWhileRecordingPromptConfirmHoldToHoldRequested", 174992);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar7.b = defpackage.aais.aI("HoldRequestedToUnholdButtonShown", 174994);
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar8.b = defpackage.aais.aI("UnholdButtonClickedToUnholdRequested", 174996);
                        return defpackage.aojh.a;
                    case 19:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar = new defpackage.ajni(null);
        aonjVar2.a(ajniVar);
        final int i8 = 12;
        defpackage.aonj aonjVar3 = new defpackage.aonj() { // from class: mde
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i8) {
                    case 0:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar2 = (defpackage.aacy) obj;
                        if (aacyVar2 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar2.b = defpackage.aais.aI("OutgoingCallConnectedToChronometerShown", 174966);
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                        if (aacyVar3 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar3.b = defpackage.aais.aI("MuteStateRequestedToMuteButtonUpdated", 174984);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                        if (aacyVar4 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar4.b = defpackage.aais.aI("AddCallButtonClickedToAddCallUiShown", 174986);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 10:
                        defpackage.ajni ajniVar2 = (defpackage.ajni) obj;
                        if (ajniVar2 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar2.b = defpackage.mcd.FAILED_TO_DISMISS_KEYGUARD;
                        ajniVar2.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                        if (ajniVar3 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar3.b = defpackage.mcd.FAILED_TO_START_ADD_CALL_SCREEN;
                        ajniVar3.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                        if (ajniVar4 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar4.b = defpackage.mcd.FAILED_TO_LOAD_INCALLSCREEN_HOST_MODEL;
                        ajniVar4.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                        if (aacyVar5 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar5.b = defpackage.mce.HOLD_REQUESTED;
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                        if (aacyVar6 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar6.b = defpackage.aais.aI("HoldWhileRecordingPromptConfirmHoldToHoldRequested", 174992);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar7.b = defpackage.aais.aI("HoldRequestedToUnholdButtonShown", 174994);
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar8.b = defpackage.aais.aI("UnholdButtonClickedToUnholdRequested", 174996);
                        return defpackage.aojh.a;
                    case 19:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar2 = new defpackage.ajni(null);
        aonjVar3.a(ajniVar2);
        adcmVar.f(defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar, ajniVar2}));
        arrayList.add(adcmVar.c());
        defpackage.adcm adcmVar2 = new defpackage.adcm(null);
        defpackage.mdf mdfVar = new defpackage.mdf(2);
        defpackage.aacy aacyVar2 = new defpackage.aacy(null, null, null);
        mdfVar.a(aacyVar2);
        adcmVar2.h = aacyVar2;
        adcmVar2.i = defpackage.mce.SINGLE_CALL_USER_ENDED_CALL_FROM_IN_CALL_SCREEN;
        adcmVar2.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_DISCONNECTED, mceVar3});
        adcmVar2.d(defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.SINGLE_CALL_ALREADY_DISCONNECTED, mceVar}));
        defpackage.mdf mdfVar2 = new defpackage.mdf(10);
        defpackage.ajni ajniVar3 = new defpackage.ajni(null);
        mdfVar2.a(ajniVar3);
        java.util.Set setSingleton = java.util.Collections.singleton(ajniVar3);
        defpackage.aooh.e(setSingleton, "singleton(...)");
        adcmVar2.f(setSingleton);
        arrayList.add(adcmVar2.c());
        defpackage.adcm adcmVar3 = new defpackage.adcm(null);
        defpackage.mdf mdfVar3 = new defpackage.mdf(11);
        defpackage.aacy aacyVar3 = new defpackage.aacy(null, null, null);
        mdfVar3.a(aacyVar3);
        adcmVar3.h = aacyVar3;
        adcmVar3.i = mceVar3;
        adcmVar3.a = defpackage.mce.CALL_SCOPE_UI_LOCK_RELEASED;
        adcmVar3.d(defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.CALL_SCOPE_ALREADY_REMOVED, defpackage.mce.CALL_SCOPE_UI_LOCK_ALREADY_RELEASED}));
        defpackage.mdf mdfVar4 = new defpackage.mdf(12);
        defpackage.ajni ajniVar4 = new defpackage.ajni(null);
        mdfVar4.a(ajniVar4);
        java.util.Set setSingleton2 = java.util.Collections.singleton(ajniVar4);
        defpackage.aooh.e(setSingleton2, "singleton(...)");
        adcmVar3.f(setSingleton2);
        arrayList.add(adcmVar3.c());
        defpackage.adcm adcmVar4 = new defpackage.adcm(null);
        defpackage.mdf mdfVar5 = new defpackage.mdf(13);
        defpackage.aacy aacyVar4 = new defpackage.aacy(null, null, null);
        mdfVar5.a(aacyVar4);
        adcmVar4.h = aacyVar4;
        adcmVar4.i = defpackage.mce.ALL_UI_LOCKS_RELEASED;
        defpackage.mce mceVar4 = defpackage.mce.ON_IN_CALL_ACTIVITY_DESTROYED;
        adcmVar4.a = mceVar4;
        arrayList.add(adcmVar4.c());
        defpackage.aaif aaifVarAI = defpackage.aais.aI("AudioRouteButtonClickedToRouteRequested", 174974);
        defpackage.aaif aaifVarAI2 = defpackage.aais.aI("AudioRouteButtonClickedToAudioRoutePickerShown", 174976);
        defpackage.adcm adcmVar5 = new defpackage.adcm(null);
        defpackage.mcx mcxVar = new defpackage.mcx(aaifVarAI, 8);
        defpackage.aacy aacyVar5 = new defpackage.aacy(null, null, null);
        mcxVar.a(aacyVar5);
        adcmVar5.h = aacyVar5;
        adcmVar5.i = defpackage.mce.USER_CLICKED_IN_CALL_AUDIO_ROUTE_BUTTON;
        defpackage.mdf mdfVar6 = new defpackage.mdf(14);
        defpackage.aacy aacyVar6 = new defpackage.aacy();
        mdfVar6.a(aacyVar6);
        defpackage.mcx mcxVar2 = new defpackage.mcx(aaifVarAI2, 5);
        defpackage.aacy aacyVar7 = new defpackage.aacy();
        mcxVar2.a(aacyVar7);
        adcmVar5.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar6, aacyVar7}));
        java.util.Set setSingleton3 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton3, "singleton(...)");
        adcmVar5.d(setSingleton3);
        final int i9 = 19;
        defpackage.aonj aonjVar4 = new defpackage.aonj() { // from class: mde
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i9) {
                    case 0:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar8.b = defpackage.aais.aI("OutgoingCallConnectedToChronometerShown", 174966);
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar9.b = defpackage.aais.aI("MuteStateRequestedToMuteButtonUpdated", 174984);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar10.b = defpackage.aais.aI("AddCallButtonClickedToAddCallUiShown", 174986);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 10:
                        defpackage.ajni ajniVar5 = (defpackage.ajni) obj;
                        if (ajniVar5 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar5.b = defpackage.mcd.FAILED_TO_DISMISS_KEYGUARD;
                        ajniVar5.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar6 = (defpackage.ajni) obj;
                        if (ajniVar6 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar6.b = defpackage.mcd.FAILED_TO_START_ADD_CALL_SCREEN;
                        ajniVar6.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.ajni ajniVar7 = (defpackage.ajni) obj;
                        if (ajniVar7 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar7.b = defpackage.mcd.FAILED_TO_LOAD_INCALLSCREEN_HOST_MODEL;
                        ajniVar7.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar11.b = defpackage.mce.HOLD_REQUESTED;
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("HoldWhileRecordingPromptConfirmHoldToHoldRequested", 174992);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar13.b = defpackage.aais.aI("HoldRequestedToUnholdButtonShown", 174994);
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("UnholdButtonClickedToUnholdRequested", 174996);
                        return defpackage.aojh.a;
                    case 19:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar5 = new defpackage.ajni(null);
        aonjVar4.a(ajniVar5);
        defpackage.mdf mdfVar7 = new defpackage.mdf(9);
        defpackage.ajni ajniVar6 = new defpackage.ajni(null);
        mdfVar7.a(ajniVar6);
        defpackage.mdf mdfVar8 = new defpackage.mdf(15);
        defpackage.ajni ajniVar7 = new defpackage.ajni(null);
        mdfVar8.a(ajniVar7);
        defpackage.mcx mcxVar3 = new defpackage.mcx(aaifVarAI2, 9);
        defpackage.ajni ajniVar8 = new defpackage.ajni(null);
        mcxVar3.a(ajniVar8);
        adcmVar5.f(defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar5, ajniVar6, ajniVar7, ajniVar8}));
        arrayList.add(adcmVar5.c());
        defpackage.adcm adcmVar6 = new defpackage.adcm(null);
        defpackage.mdf mdfVar9 = new defpackage.mdf(16);
        defpackage.aacy aacyVar8 = new defpackage.aacy(null, null, null);
        mdfVar9.a(aacyVar8);
        adcmVar6.h = aacyVar8;
        adcmVar6.i = defpackage.mce.USER_SELECTED_AUDIO_ROUTE_FROM_IN_CALL_PICKER;
        defpackage.mce mceVar5 = defpackage.mce.AUDIO_ROUTE_REQUESTED;
        adcmVar6.a = mceVar5;
        java.util.Set setSingleton4 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton4, "singleton(...)");
        adcmVar6.d(setSingleton4);
        arrayList.add(adcmVar6.c());
        defpackage.adcm adcmVar7 = new defpackage.adcm(null);
        defpackage.mdf mdfVar10 = new defpackage.mdf(17);
        defpackage.aacy aacyVar9 = new defpackage.aacy(null, null, null);
        mdfVar10.a(aacyVar9);
        adcmVar7.h = aacyVar9;
        adcmVar7.i = mceVar5;
        adcmVar7.a = defpackage.mce.IN_CALL_AUDIO_ROUTE_BUTTON_UPDATED;
        java.util.Set setSingleton5 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton5, "singleton(...)");
        adcmVar7.d(setSingleton5);
        arrayList.add(adcmVar7.c());
        defpackage.adcm adcmVar8 = new defpackage.adcm(null);
        defpackage.mdf mdfVar11 = new defpackage.mdf(18);
        defpackage.aacy aacyVar10 = new defpackage.aacy(null, null, null);
        mdfVar11.a(aacyVar10);
        adcmVar8.h = aacyVar10;
        adcmVar8.i = defpackage.mce.USER_SELECTED_AUDIO_ROUTE_FROM_SELECTOR_DIALOG;
        adcmVar8.a = mceVar5;
        java.util.Set setSingleton6 = java.util.Collections.singleton(mceVar3);
        defpackage.aooh.e(setSingleton6, "singleton(...)");
        adcmVar8.d(setSingleton6);
        arrayList.add(adcmVar8.c());
        defpackage.adcm adcmVar9 = new defpackage.adcm(null);
        defpackage.mdf mdfVar12 = new defpackage.mdf(19);
        defpackage.aacy aacyVar11 = new defpackage.aacy(null, null, null);
        mdfVar12.a(aacyVar11);
        adcmVar9.h = aacyVar11;
        adcmVar9.i = defpackage.mce.USER_CLICKED_IN_CALL_MUTE_BUTTON;
        defpackage.mce mceVar6 = defpackage.mce.MUTE_STATE_REQUESTED;
        adcmVar9.a = mceVar6;
        java.util.Set setSingleton7 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton7, "singleton(...)");
        adcmVar9.d(setSingleton7);
        defpackage.aonj aonjVar5 = new defpackage.aonj() { // from class: mde
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i2) {
                    case 0:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("OutgoingCallConnectedToChronometerShown", 174966);
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar13.b = defpackage.aais.aI("MuteStateRequestedToMuteButtonUpdated", 174984);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("AddCallButtonClickedToAddCallUiShown", 174986);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 10:
                        defpackage.ajni ajniVar9 = (defpackage.ajni) obj;
                        if (ajniVar9 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar9.b = defpackage.mcd.FAILED_TO_DISMISS_KEYGUARD;
                        ajniVar9.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar10 = (defpackage.ajni) obj;
                        if (ajniVar10 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar10.b = defpackage.mcd.FAILED_TO_START_ADD_CALL_SCREEN;
                        ajniVar10.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.ajni ajniVar11 = (defpackage.ajni) obj;
                        if (ajniVar11 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar11.b = defpackage.mcd.FAILED_TO_LOAD_INCALLSCREEN_HOST_MODEL;
                        ajniVar11.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar15.b = defpackage.mce.HOLD_REQUESTED;
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("HoldWhileRecordingPromptConfirmHoldToHoldRequested", 174992);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("HoldRequestedToUnholdButtonShown", 174994);
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("UnholdButtonClickedToUnholdRequested", 174996);
                        return defpackage.aojh.a;
                    case 19:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar9 = new defpackage.ajni(null);
        aonjVar5.a(ajniVar9);
        defpackage.aonj aonjVar6 = new defpackage.aonj() { // from class: mde
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i4) {
                    case 0:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("OutgoingCallConnectedToChronometerShown", 174966);
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar13.b = defpackage.aais.aI("MuteStateRequestedToMuteButtonUpdated", 174984);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("AddCallButtonClickedToAddCallUiShown", 174986);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 10:
                        defpackage.ajni ajniVar10 = (defpackage.ajni) obj;
                        if (ajniVar10 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar10.b = defpackage.mcd.FAILED_TO_DISMISS_KEYGUARD;
                        ajniVar10.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar11 = (defpackage.ajni) obj;
                        if (ajniVar11 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar11.b = defpackage.mcd.FAILED_TO_START_ADD_CALL_SCREEN;
                        ajniVar11.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.ajni ajniVar12 = (defpackage.ajni) obj;
                        if (ajniVar12 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar12.b = defpackage.mcd.FAILED_TO_LOAD_INCALLSCREEN_HOST_MODEL;
                        ajniVar12.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar15.b = defpackage.mce.HOLD_REQUESTED;
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("HoldWhileRecordingPromptConfirmHoldToHoldRequested", 174992);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("HoldRequestedToUnholdButtonShown", 174994);
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("UnholdButtonClickedToUnholdRequested", 174996);
                        return defpackage.aojh.a;
                    case 19:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar10 = new defpackage.ajni(null);
        aonjVar6.a(ajniVar10);
        defpackage.aonj aonjVar7 = new defpackage.aonj() { // from class: mde
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i5) {
                    case 0:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("OutgoingCallConnectedToChronometerShown", 174966);
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar13.b = defpackage.aais.aI("MuteStateRequestedToMuteButtonUpdated", 174984);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("AddCallButtonClickedToAddCallUiShown", 174986);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 10:
                        defpackage.ajni ajniVar11 = (defpackage.ajni) obj;
                        if (ajniVar11 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar11.b = defpackage.mcd.FAILED_TO_DISMISS_KEYGUARD;
                        ajniVar11.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar12 = (defpackage.ajni) obj;
                        if (ajniVar12 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar12.b = defpackage.mcd.FAILED_TO_START_ADD_CALL_SCREEN;
                        ajniVar12.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.ajni ajniVar13 = (defpackage.ajni) obj;
                        if (ajniVar13 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar13.b = defpackage.mcd.FAILED_TO_LOAD_INCALLSCREEN_HOST_MODEL;
                        ajniVar13.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar15.b = defpackage.mce.HOLD_REQUESTED;
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("HoldWhileRecordingPromptConfirmHoldToHoldRequested", 174992);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("HoldRequestedToUnholdButtonShown", 174994);
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("UnholdButtonClickedToUnholdRequested", 174996);
                        return defpackage.aojh.a;
                    case 19:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar11 = new defpackage.ajni(null);
        aonjVar7.a(ajniVar11);
        adcmVar9.f(defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar9, ajniVar10, ajniVar11}));
        arrayList.add(adcmVar9.c());
        defpackage.adcm adcmVar10 = new defpackage.adcm(null);
        defpackage.aonj aonjVar8 = new defpackage.aonj() { // from class: mde
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i6) {
                    case 0:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("OutgoingCallConnectedToChronometerShown", 174966);
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar13.b = defpackage.aais.aI("MuteStateRequestedToMuteButtonUpdated", 174984);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("AddCallButtonClickedToAddCallUiShown", 174986);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 10:
                        defpackage.ajni ajniVar12 = (defpackage.ajni) obj;
                        if (ajniVar12 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar12.b = defpackage.mcd.FAILED_TO_DISMISS_KEYGUARD;
                        ajniVar12.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar13 = (defpackage.ajni) obj;
                        if (ajniVar13 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar13.b = defpackage.mcd.FAILED_TO_START_ADD_CALL_SCREEN;
                        ajniVar13.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.ajni ajniVar14 = (defpackage.ajni) obj;
                        if (ajniVar14 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar14.b = defpackage.mcd.FAILED_TO_LOAD_INCALLSCREEN_HOST_MODEL;
                        ajniVar14.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar15.b = defpackage.mce.HOLD_REQUESTED;
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("HoldWhileRecordingPromptConfirmHoldToHoldRequested", 174992);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("HoldRequestedToUnholdButtonShown", 174994);
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("UnholdButtonClickedToUnholdRequested", 174996);
                        return defpackage.aojh.a;
                    case 19:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar12 = new defpackage.aacy(null, null, null);
        aonjVar8.a(aacyVar12);
        adcmVar10.h = aacyVar12;
        adcmVar10.i = mceVar6;
        adcmVar10.a = defpackage.mce.IN_CALL_MUTE_BUTTON_UPDATED;
        defpackage.mce mceVar7 = defpackage.mce.PRE_CALL_DIALPAD_SHOWN;
        adcmVar10.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar, mceVar7}));
        arrayList.add(adcmVar10.c());
        defpackage.adcm adcmVar11 = new defpackage.adcm(null);
        final int i10 = 6;
        defpackage.aonj aonjVar9 = new defpackage.aonj() { // from class: mde
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i10) {
                    case 0:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar13.b = defpackage.aais.aI("OutgoingCallConnectedToChronometerShown", 174966);
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("MuteStateRequestedToMuteButtonUpdated", 174984);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("AddCallButtonClickedToAddCallUiShown", 174986);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 10:
                        defpackage.ajni ajniVar12 = (defpackage.ajni) obj;
                        if (ajniVar12 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar12.b = defpackage.mcd.FAILED_TO_DISMISS_KEYGUARD;
                        ajniVar12.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar13 = (defpackage.ajni) obj;
                        if (ajniVar13 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar13.b = defpackage.mcd.FAILED_TO_START_ADD_CALL_SCREEN;
                        ajniVar13.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.ajni ajniVar14 = (defpackage.ajni) obj;
                        if (ajniVar14 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar14.b = defpackage.mcd.FAILED_TO_LOAD_INCALLSCREEN_HOST_MODEL;
                        ajniVar14.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar16.b = defpackage.mce.HOLD_REQUESTED;
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("HoldWhileRecordingPromptConfirmHoldToHoldRequested", 174992);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("HoldRequestedToUnholdButtonShown", 174994);
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("UnholdButtonClickedToUnholdRequested", 174996);
                        return defpackage.aojh.a;
                    case 19:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar13 = new defpackage.aacy(null, null, null);
        aonjVar9.a(aacyVar13);
        adcmVar11.h = aacyVar13;
        adcmVar11.i = defpackage.mce.USER_CLICKED_IN_CALL_ADD_CALL_BUTTON;
        adcmVar11.a = mceVar7;
        final int i11 = 7;
        defpackage.aonj aonjVar10 = new defpackage.aonj() { // from class: mde
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i11) {
                    case 0:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("OutgoingCallConnectedToChronometerShown", 174966);
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("MuteStateRequestedToMuteButtonUpdated", 174984);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("AddCallButtonClickedToAddCallUiShown", 174986);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 10:
                        defpackage.ajni ajniVar12 = (defpackage.ajni) obj;
                        if (ajniVar12 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar12.b = defpackage.mcd.FAILED_TO_DISMISS_KEYGUARD;
                        ajniVar12.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar13 = (defpackage.ajni) obj;
                        if (ajniVar13 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar13.b = defpackage.mcd.FAILED_TO_START_ADD_CALL_SCREEN;
                        ajniVar13.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.ajni ajniVar14 = (defpackage.ajni) obj;
                        if (ajniVar14 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar14.b = defpackage.mcd.FAILED_TO_LOAD_INCALLSCREEN_HOST_MODEL;
                        ajniVar14.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar17.b = defpackage.mce.HOLD_REQUESTED;
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("HoldWhileRecordingPromptConfirmHoldToHoldRequested", 174992);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("HoldRequestedToUnholdButtonShown", 174994);
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("UnholdButtonClickedToUnholdRequested", 174996);
                        return defpackage.aojh.a;
                    case 19:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar12 = new defpackage.ajni(null);
        aonjVar10.a(ajniVar12);
        final int i12 = 8;
        defpackage.aonj aonjVar11 = new defpackage.aonj() { // from class: mde
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i12) {
                    case 0:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("OutgoingCallConnectedToChronometerShown", 174966);
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("MuteStateRequestedToMuteButtonUpdated", 174984);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("AddCallButtonClickedToAddCallUiShown", 174986);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 10:
                        defpackage.ajni ajniVar13 = (defpackage.ajni) obj;
                        if (ajniVar13 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar13.b = defpackage.mcd.FAILED_TO_DISMISS_KEYGUARD;
                        ajniVar13.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar14 = (defpackage.ajni) obj;
                        if (ajniVar14 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar14.b = defpackage.mcd.FAILED_TO_START_ADD_CALL_SCREEN;
                        ajniVar14.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.ajni ajniVar15 = (defpackage.ajni) obj;
                        if (ajniVar15 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar15.b = defpackage.mcd.FAILED_TO_LOAD_INCALLSCREEN_HOST_MODEL;
                        ajniVar15.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar17.b = defpackage.mce.HOLD_REQUESTED;
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("HoldWhileRecordingPromptConfirmHoldToHoldRequested", 174992);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("HoldRequestedToUnholdButtonShown", 174994);
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("UnholdButtonClickedToUnholdRequested", 174996);
                        return defpackage.aojh.a;
                    case 19:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar13 = new defpackage.ajni(null);
        aonjVar11.a(ajniVar13);
        defpackage.aonj aonjVar12 = new defpackage.aonj() { // from class: mde
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i7) {
                    case 0:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("OutgoingCallConnectedToChronometerShown", 174966);
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("MuteStateRequestedToMuteButtonUpdated", 174984);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("AddCallButtonClickedToAddCallUiShown", 174986);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 10:
                        defpackage.ajni ajniVar14 = (defpackage.ajni) obj;
                        if (ajniVar14 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar14.b = defpackage.mcd.FAILED_TO_DISMISS_KEYGUARD;
                        ajniVar14.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar15 = (defpackage.ajni) obj;
                        if (ajniVar15 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar15.b = defpackage.mcd.FAILED_TO_START_ADD_CALL_SCREEN;
                        ajniVar15.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.ajni ajniVar16 = (defpackage.ajni) obj;
                        if (ajniVar16 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar16.b = defpackage.mcd.FAILED_TO_LOAD_INCALLSCREEN_HOST_MODEL;
                        ajniVar16.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar17.b = defpackage.mce.HOLD_REQUESTED;
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("HoldWhileRecordingPromptConfirmHoldToHoldRequested", 174992);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("HoldRequestedToUnholdButtonShown", 174994);
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("UnholdButtonClickedToUnholdRequested", 174996);
                        return defpackage.aojh.a;
                    case 19:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar14 = new defpackage.ajni(null);
        aonjVar12.a(ajniVar14);
        final int i13 = 10;
        defpackage.aonj aonjVar13 = new defpackage.aonj() { // from class: mde
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i13) {
                    case 0:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("OutgoingCallConnectedToChronometerShown", 174966);
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("MuteStateRequestedToMuteButtonUpdated", 174984);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("AddCallButtonClickedToAddCallUiShown", 174986);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 10:
                        defpackage.ajni ajniVar15 = (defpackage.ajni) obj;
                        if (ajniVar15 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar15.b = defpackage.mcd.FAILED_TO_DISMISS_KEYGUARD;
                        ajniVar15.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar16 = (defpackage.ajni) obj;
                        if (ajniVar16 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar16.b = defpackage.mcd.FAILED_TO_START_ADD_CALL_SCREEN;
                        ajniVar16.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.ajni ajniVar17 = (defpackage.ajni) obj;
                        if (ajniVar17 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar17.b = defpackage.mcd.FAILED_TO_LOAD_INCALLSCREEN_HOST_MODEL;
                        ajniVar17.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar17.b = defpackage.mce.HOLD_REQUESTED;
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("HoldWhileRecordingPromptConfirmHoldToHoldRequested", 174992);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("HoldRequestedToUnholdButtonShown", 174994);
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("UnholdButtonClickedToUnholdRequested", 174996);
                        return defpackage.aojh.a;
                    case 19:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar15 = new defpackage.ajni(null);
        aonjVar13.a(ajniVar15);
        final int i14 = 11;
        defpackage.aonj aonjVar14 = new defpackage.aonj() { // from class: mde
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i14) {
                    case 0:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("OutgoingCallConnectedToChronometerShown", 174966);
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("MuteStateRequestedToMuteButtonUpdated", 174984);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("AddCallButtonClickedToAddCallUiShown", 174986);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 10:
                        defpackage.ajni ajniVar16 = (defpackage.ajni) obj;
                        if (ajniVar16 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar16.b = defpackage.mcd.FAILED_TO_DISMISS_KEYGUARD;
                        ajniVar16.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar17 = (defpackage.ajni) obj;
                        if (ajniVar17 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar17.b = defpackage.mcd.FAILED_TO_START_ADD_CALL_SCREEN;
                        ajniVar17.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.ajni ajniVar18 = (defpackage.ajni) obj;
                        if (ajniVar18 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar18.b = defpackage.mcd.FAILED_TO_LOAD_INCALLSCREEN_HOST_MODEL;
                        ajniVar18.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar17.b = defpackage.mce.HOLD_REQUESTED;
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("HoldWhileRecordingPromptConfirmHoldToHoldRequested", 174992);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("HoldRequestedToUnholdButtonShown", 174994);
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("UnholdButtonClickedToUnholdRequested", 174996);
                        return defpackage.aojh.a;
                    case 19:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar16 = new defpackage.ajni(null);
        aonjVar14.a(ajniVar16);
        adcmVar11.f(defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar12, ajniVar13, ajniVar14, ajniVar15, ajniVar16}));
        arrayList.add(adcmVar11.c());
        defpackage.aaif aaifVarAI3 = defpackage.aais.aI("HoldButtonClickedToHoldRequested", 174988);
        defpackage.aaif aaifVarAI4 = defpackage.aais.aI("HoldButtonClickedToHoldWhileRecordingPromptShown", 174990);
        defpackage.adcm adcmVar12 = new defpackage.adcm(null);
        defpackage.mcx mcxVar4 = new defpackage.mcx(aaifVarAI3, 6);
        defpackage.aacy aacyVar14 = new defpackage.aacy(null, null, null);
        mcxVar4.a(aacyVar14);
        adcmVar12.h = aacyVar14;
        adcmVar12.i = defpackage.mce.USER_CLICKED_IN_CALL_HOLD_BUTTON;
        final int i15 = 13;
        defpackage.aonj aonjVar15 = new defpackage.aonj() { // from class: mde
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i15) {
                    case 0:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("OutgoingCallConnectedToChronometerShown", 174966);
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("MuteStateRequestedToMuteButtonUpdated", 174984);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("AddCallButtonClickedToAddCallUiShown", 174986);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 10:
                        defpackage.ajni ajniVar17 = (defpackage.ajni) obj;
                        if (ajniVar17 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar17.b = defpackage.mcd.FAILED_TO_DISMISS_KEYGUARD;
                        ajniVar17.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar18 = (defpackage.ajni) obj;
                        if (ajniVar18 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar18.b = defpackage.mcd.FAILED_TO_START_ADD_CALL_SCREEN;
                        ajniVar18.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.ajni ajniVar19 = (defpackage.ajni) obj;
                        if (ajniVar19 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar19.b = defpackage.mcd.FAILED_TO_LOAD_INCALLSCREEN_HOST_MODEL;
                        ajniVar19.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar18.b = defpackage.mce.HOLD_REQUESTED;
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("HoldWhileRecordingPromptConfirmHoldToHoldRequested", 174992);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("HoldRequestedToUnholdButtonShown", 174994);
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("UnholdButtonClickedToUnholdRequested", 174996);
                        return defpackage.aojh.a;
                    case 19:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar15 = new defpackage.aacy();
        aonjVar15.a(aacyVar15);
        defpackage.mcx mcxVar5 = new defpackage.mcx(aaifVarAI4, 7);
        defpackage.aacy aacyVar16 = new defpackage.aacy();
        mcxVar5.a(aacyVar16);
        adcmVar12.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar15, aacyVar16}));
        java.util.Set setSingleton8 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton8, "singleton(...)");
        adcmVar12.d(setSingleton8);
        final int i16 = 14;
        defpackage.aonj aonjVar16 = new defpackage.aonj() { // from class: mde
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i16) {
                    case 0:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("OutgoingCallConnectedToChronometerShown", 174966);
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("MuteStateRequestedToMuteButtonUpdated", 174984);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("AddCallButtonClickedToAddCallUiShown", 174986);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 10:
                        defpackage.ajni ajniVar17 = (defpackage.ajni) obj;
                        if (ajniVar17 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar17.b = defpackage.mcd.FAILED_TO_DISMISS_KEYGUARD;
                        ajniVar17.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar18 = (defpackage.ajni) obj;
                        if (ajniVar18 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar18.b = defpackage.mcd.FAILED_TO_START_ADD_CALL_SCREEN;
                        ajniVar18.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.ajni ajniVar19 = (defpackage.ajni) obj;
                        if (ajniVar19 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar19.b = defpackage.mcd.FAILED_TO_LOAD_INCALLSCREEN_HOST_MODEL;
                        ajniVar19.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.HOLD_REQUESTED;
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("HoldWhileRecordingPromptConfirmHoldToHoldRequested", 174992);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("HoldRequestedToUnholdButtonShown", 174994);
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("UnholdButtonClickedToUnholdRequested", 174996);
                        return defpackage.aojh.a;
                    case 19:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar17 = new defpackage.ajni(null);
        aonjVar16.a(ajniVar17);
        final int i17 = 15;
        defpackage.aonj aonjVar17 = new defpackage.aonj() { // from class: mde
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i17) {
                    case 0:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("OutgoingCallConnectedToChronometerShown", 174966);
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("MuteStateRequestedToMuteButtonUpdated", 174984);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("AddCallButtonClickedToAddCallUiShown", 174986);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 10:
                        defpackage.ajni ajniVar18 = (defpackage.ajni) obj;
                        if (ajniVar18 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar18.b = defpackage.mcd.FAILED_TO_DISMISS_KEYGUARD;
                        ajniVar18.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar19 = (defpackage.ajni) obj;
                        if (ajniVar19 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar19.b = defpackage.mcd.FAILED_TO_START_ADD_CALL_SCREEN;
                        ajniVar19.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.ajni ajniVar110 = (defpackage.ajni) obj;
                        if (ajniVar110 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar110.b = defpackage.mcd.FAILED_TO_LOAD_INCALLSCREEN_HOST_MODEL;
                        ajniVar110.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.HOLD_REQUESTED;
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("HoldWhileRecordingPromptConfirmHoldToHoldRequested", 174992);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("HoldRequestedToUnholdButtonShown", 174994);
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("UnholdButtonClickedToUnholdRequested", 174996);
                        return defpackage.aojh.a;
                    case 19:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar18 = new defpackage.ajni(null);
        aonjVar17.a(ajniVar18);
        adcmVar12.f(defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar17, ajniVar18}));
        arrayList.add(adcmVar12.c());
        defpackage.adcm adcmVar13 = new defpackage.adcm(null);
        final int i18 = 16;
        defpackage.aonj aonjVar18 = new defpackage.aonj() { // from class: mde
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i18) {
                    case 0:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("OutgoingCallConnectedToChronometerShown", 174966);
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("MuteStateRequestedToMuteButtonUpdated", 174984);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("AddCallButtonClickedToAddCallUiShown", 174986);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 10:
                        defpackage.ajni ajniVar19 = (defpackage.ajni) obj;
                        if (ajniVar19 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar19.b = defpackage.mcd.FAILED_TO_DISMISS_KEYGUARD;
                        ajniVar19.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar110 = (defpackage.ajni) obj;
                        if (ajniVar110 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar110.b = defpackage.mcd.FAILED_TO_START_ADD_CALL_SCREEN;
                        ajniVar110.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.ajni ajniVar111 = (defpackage.ajni) obj;
                        if (ajniVar111 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar111.b = defpackage.mcd.FAILED_TO_LOAD_INCALLSCREEN_HOST_MODEL;
                        ajniVar111.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.HOLD_REQUESTED;
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("HoldWhileRecordingPromptConfirmHoldToHoldRequested", 174992);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("HoldRequestedToUnholdButtonShown", 174994);
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("UnholdButtonClickedToUnholdRequested", 174996);
                        return defpackage.aojh.a;
                    case 19:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar17 = new defpackage.aacy(null, null, null);
        aonjVar18.a(aacyVar17);
        adcmVar13.h = aacyVar17;
        adcmVar13.i = defpackage.mce.USER_CONFIRMED_HOLD_CALL_FROM_IN_CALL_SCREEN;
        defpackage.mce mceVar8 = defpackage.mce.HOLD_REQUESTED;
        adcmVar13.a = mceVar8;
        java.util.Set setSingleton9 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton9, "singleton(...)");
        adcmVar13.d(setSingleton9);
        arrayList.add(adcmVar13.c());
        defpackage.adcm adcmVar14 = new defpackage.adcm(null);
        final int i19 = 17;
        defpackage.aonj aonjVar19 = new defpackage.aonj() { // from class: mde
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i19) {
                    case 0:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("OutgoingCallConnectedToChronometerShown", 174966);
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("MuteStateRequestedToMuteButtonUpdated", 174984);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("AddCallButtonClickedToAddCallUiShown", 174986);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 10:
                        defpackage.ajni ajniVar19 = (defpackage.ajni) obj;
                        if (ajniVar19 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar19.b = defpackage.mcd.FAILED_TO_DISMISS_KEYGUARD;
                        ajniVar19.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar110 = (defpackage.ajni) obj;
                        if (ajniVar110 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar110.b = defpackage.mcd.FAILED_TO_START_ADD_CALL_SCREEN;
                        ajniVar110.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.ajni ajniVar111 = (defpackage.ajni) obj;
                        if (ajniVar111 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar111.b = defpackage.mcd.FAILED_TO_LOAD_INCALLSCREEN_HOST_MODEL;
                        ajniVar111.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.HOLD_REQUESTED;
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("HoldWhileRecordingPromptConfirmHoldToHoldRequested", 174992);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("HoldRequestedToUnholdButtonShown", 174994);
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("UnholdButtonClickedToUnholdRequested", 174996);
                        return defpackage.aojh.a;
                    case 19:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar18 = new defpackage.aacy(null, null, null);
        aonjVar19.a(aacyVar18);
        adcmVar14.h = aacyVar18;
        adcmVar14.i = mceVar8;
        adcmVar14.a = defpackage.mce.IN_CALL_UNHOLD_BUTTON_SHOWN;
        java.util.Set setSingleton10 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton10, "singleton(...)");
        adcmVar14.d(setSingleton10);
        arrayList.add(adcmVar14.c());
        defpackage.adcm adcmVar15 = new defpackage.adcm(null);
        final int i20 = 18;
        defpackage.aonj aonjVar20 = new defpackage.aonj() { // from class: mde
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i20) {
                    case 0:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("OutgoingCallConnectedToChronometerShown", 174966);
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("MuteStateRequestedToMuteButtonUpdated", 174984);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AddCallButtonClickedToAddCallUiShown", 174986);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 10:
                        defpackage.ajni ajniVar19 = (defpackage.ajni) obj;
                        if (ajniVar19 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar19.b = defpackage.mcd.FAILED_TO_DISMISS_KEYGUARD;
                        ajniVar19.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar110 = (defpackage.ajni) obj;
                        if (ajniVar110 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar110.b = defpackage.mcd.FAILED_TO_START_ADD_CALL_SCREEN;
                        ajniVar110.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.ajni ajniVar111 = (defpackage.ajni) obj;
                        if (ajniVar111 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar111.b = defpackage.mcd.FAILED_TO_LOAD_INCALLSCREEN_HOST_MODEL;
                        ajniVar111.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.HOLD_REQUESTED;
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("HoldWhileRecordingPromptConfirmHoldToHoldRequested", 174992);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("HoldRequestedToUnholdButtonShown", 174994);
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("UnholdButtonClickedToUnholdRequested", 174996);
                        return defpackage.aojh.a;
                    case 19:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                }
            }
        };
        defpackage.aacy aacyVar19 = new defpackage.aacy(null, null, null);
        aonjVar20.a(aacyVar19);
        adcmVar15.h = aacyVar19;
        adcmVar15.i = defpackage.mce.USER_CLICKED_IN_CALL_UNHOLD_BUTTON;
        defpackage.mce mceVar9 = defpackage.mce.UNHOLD_REQUESTED;
        adcmVar15.a = mceVar9;
        java.util.Set setSingleton11 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton11, "singleton(...)");
        adcmVar15.d(setSingleton11);
        final int i21 = 20;
        defpackage.aonj aonjVar21 = new defpackage.aonj() { // from class: mde
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i21) {
                    case 0:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("OutgoingCallConnectedToChronometerShown", 174966);
                        return defpackage.aojh.a;
                    case 2:
                        return defpackage.mni.aU((defpackage.ajni) obj);
                    case 3:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("MuteStateRequestedToMuteButtonUpdated", 174984);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("AddCallButtonClickedToAddCallUiShown", 174986);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 9:
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 10:
                        defpackage.ajni ajniVar19 = (defpackage.ajni) obj;
                        if (ajniVar19 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar19.b = defpackage.mcd.FAILED_TO_DISMISS_KEYGUARD;
                        ajniVar19.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.ajni ajniVar110 = (defpackage.ajni) obj;
                        if (ajniVar110 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar110.b = defpackage.mcd.FAILED_TO_START_ADD_CALL_SCREEN;
                        ajniVar110.c = defpackage.zar.INTERNAL;
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.ajni ajniVar111 = (defpackage.ajni) obj;
                        if (ajniVar111 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar111.b = defpackage.mcd.FAILED_TO_LOAD_INCALLSCREEN_HOST_MODEL;
                        ajniVar111.c = defpackage.zar.PRODUCE_MODEL_FAILURE;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar113.b = defpackage.mce.HOLD_REQUESTED;
                        return defpackage.aojh.a;
                    case 14:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    case 15:
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 16:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("HoldWhileRecordingPromptConfirmHoldToHoldRequested", 174992);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("HoldRequestedToUnholdButtonShown", 174994);
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("UnholdButtonClickedToUnholdRequested", 174996);
                        return defpackage.aojh.a;
                    case 19:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                    default:
                        return defpackage.mni.aZ((defpackage.ajni) obj);
                }
            }
        };
        defpackage.ajni ajniVar19 = new defpackage.ajni(null);
        aonjVar21.a(ajniVar19);
        defpackage.mdf mdfVar13 = new defpackage.mdf(1);
        defpackage.ajni ajniVar20 = new defpackage.ajni(null);
        mdfVar13.a(ajniVar20);
        defpackage.mdf mdfVar14 = new defpackage.mdf(0);
        defpackage.ajni ajniVar21 = new defpackage.ajni(null);
        mdfVar14.a(ajniVar21);
        defpackage.mdf mdfVar15 = new defpackage.mdf(3);
        defpackage.ajni ajniVar22 = new defpackage.ajni(null);
        mdfVar15.a(ajniVar22);
        adcmVar15.f(defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar19, ajniVar20, ajniVar21, ajniVar22}));
        arrayList.add(adcmVar15.c());
        defpackage.adcm adcmVar16 = new defpackage.adcm(null);
        defpackage.mdf mdfVar16 = new defpackage.mdf(4);
        defpackage.aacy aacyVar20 = new defpackage.aacy(null, null, null);
        mdfVar16.a(aacyVar20);
        adcmVar16.h = aacyVar20;
        adcmVar16.i = mceVar9;
        adcmVar16.a = defpackage.mce.IN_CALL_HOLD_BUTTON_SHOWN;
        java.util.Set setSingleton12 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton12, "singleton(...)");
        adcmVar16.d(setSingleton12);
        arrayList.add(adcmVar16.c());
        defpackage.adcm adcmVar17 = new defpackage.adcm(null);
        defpackage.mdf mdfVar17 = new defpackage.mdf(5);
        defpackage.aacy aacyVar21 = new defpackage.aacy(null, null, null);
        mdfVar17.a(aacyVar21);
        adcmVar17.h = aacyVar21;
        adcmVar17.i = defpackage.mce.USER_CLICKED_IN_CALL_DIALPAD_BUTTON;
        adcmVar17.a = defpackage.mce.IN_CALL_DIALPAD_SHOW_ANIMATION_ENDED;
        java.util.Set setSingleton13 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton13, "singleton(...)");
        adcmVar17.d(setSingleton13);
        arrayList.add(adcmVar17.c());
        defpackage.adcm adcmVar18 = new defpackage.adcm(null);
        defpackage.mdf mdfVar18 = new defpackage.mdf(6);
        defpackage.aacy aacyVar22 = new defpackage.aacy(null, null, null);
        mdfVar18.a(aacyVar22);
        adcmVar18.h = aacyVar22;
        adcmVar18.i = defpackage.mce.USER_DISMISSED_IN_CALL_DIALPAD;
        adcmVar18.a = defpackage.mce.IN_CALL_DIALPAD_HIDE_ANIMATION_ENDED;
        java.util.Set setSingleton14 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton14, "singleton(...)");
        adcmVar18.d(setSingleton14);
        arrayList.add(adcmVar18.c());
        defpackage.adcm adcmVar19 = new defpackage.adcm(null);
        defpackage.mdf mdfVar19 = new defpackage.mdf(7);
        defpackage.aacy aacyVar23 = new defpackage.aacy(null, null, null);
        mdfVar19.a(aacyVar23);
        adcmVar19.h = aacyVar23;
        adcmVar19.i = defpackage.mce.CALL_ASSIST_CATEGORY_BUTTON_CLICKED;
        adcmVar19.a = defpackage.mce.CALL_ASSIST_CATEGORY_SHOWN;
        adcmVar19.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar3, mceVar4, mceVar2, defpackage.mce.CALL_ASSIST_MENU_NOT_SHOWN_DUE_TO_DISPLAY_OFF}));
        defpackage.mdf mdfVar20 = new defpackage.mdf(8);
        defpackage.ajni ajniVar23 = new defpackage.ajni(null);
        mdfVar20.a(ajniVar23);
        java.util.Set setSingleton15 = java.util.Collections.singleton(ajniVar23);
        defpackage.aooh.e(setSingleton15, "singleton(...)");
        adcmVar19.f(setSingleton15);
        arrayList.add(adcmVar19.c());
        return arrayList;
    }
}
