package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mdt implements defpackage.zaq {
    public static final /* synthetic */ int a = 0;
    private static final java.util.Set b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_REMOVED, defpackage.mce.HAS_EXISTING_EMERGENCY_CALL, defpackage.mce.EXPECT_NO_PLACE_CALL_RESPONSE_FROM_TELECOM, defpackage.mce.IN_CALL_ACTIVITY_NOT_VISIBLE_AT_CALL_CONNECTED, defpackage.mce.OUTGOING_CALL_PLACED_WHILE_ALREADY_IN_CALL, defpackage.mce.ON_IN_CALL_ACTIVITY_STOPPED, defpackage.mce.ON_IN_CALL_ACTIVITY_DESTROYED});

    @Override // defpackage.zaq
    public final java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.aaif aaifVarAI = defpackage.aais.aI("EmergencyCallFromDialpadToEmergencyVoiceScreenShown", 179233);
        defpackage.adcm adcmVar = new defpackage.adcm(null);
        defpackage.mdr mdrVar = new defpackage.mdr(aaifVarAI, 4);
        defpackage.aacy aacyVar = new defpackage.aacy(null, null, null);
        mdrVar.a(aacyVar);
        adcmVar.h = aacyVar;
        adcmVar.i = defpackage.mce.USER_CLICKED_DIALPAD_CALL_BUTTON;
        java.util.Set set = b;
        adcmVar.d(set);
        final int i = 13;
        defpackage.mdp mdpVar = new defpackage.mdp(13);
        defpackage.aacy aacyVar2 = new defpackage.aacy();
        mdpVar.a(aacyVar2);
        final int i2 = 0;
        defpackage.mdr mdrVar2 = new defpackage.mdr(aaifVarAI, i2);
        defpackage.aacy aacyVar3 = new defpackage.aacy();
        mdrVar2.a(aacyVar3);
        final int i3 = 1;
        final int i4 = 6;
        defpackage.aonj aonjVar = new defpackage.aonj() { // from class: mds
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i4) {
                    case 0:
                        defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                        int i5 = defpackage.mdt.a;
                        if (aacyVar4 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar4.b = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToVoiceScreenShown", 176661);
                        break;
                    case 1:
                        defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                        int i6 = defpackage.mdt.a;
                        if (aacyVar5 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar5.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar5.a = defpackage.aais.aI("VoiceCallFromVisualVoicemailToPreCall", 172365);
                        break;
                    case 2:
                        defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                        int i7 = defpackage.mdt.a;
                        if (aacyVar6 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar6.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar6.a = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToPreCall", 172369);
                        break;
                    case 3:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        int i8 = defpackage.mdt.a;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar7.b = defpackage.aais.aI("VoiceCallFromExternalToVoiceScreenShown", 176663);
                        break;
                    case 4:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        int i9 = defpackage.mdt.a;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar8.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar8.a = defpackage.aais.aI("VoiceCallFromExternalToPreCall", 172367);
                        break;
                    case 5:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        int i10 = defpackage.mdt.a;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar9.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        int i11 = defpackage.mdt.a;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar10.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.DIRECT_MY_CALL_FRAGMENT_CREATED});
                        aacyVar10.a = defpackage.aais.aI("VoiceCallFromDialpadToDirectMyCallScreenShown", 226576);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        int i12 = defpackage.mdt.a;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar11.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar11.a = defpackage.aais.aI("VoiceCallFromExternalTelecomToPreCall", 178396);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        int i13 = defpackage.mdt.a;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar12.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 9:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        int i14 = defpackage.mdt.a;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar13.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case 10:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        int i15 = defpackage.mdt.a;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar14.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        int i16 = defpackage.mdt.a;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar15.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar15.a = defpackage.aais.aI("VoiceCallFromSearchActionToPreCall", 181223);
                        break;
                    case 12:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        int i17 = defpackage.mdt.a;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar16.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar16.a = defpackage.aais.aI("VoiceCallFromDialpadToPreCall", 172346);
                        break;
                    case 13:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        int i18 = defpackage.mdt.a;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("VoiceScreenShownToScreenFullyRendered", 172371);
                        break;
                    case 14:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        int i19 = defpackage.mdt.a;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("VoiceCallFromSearchToVoiceScreenShown", 176671);
                        break;
                    case 15:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        int i20 = defpackage.mdt.a;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar19.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar19.a = defpackage.aais.aI("VoiceCallFromSearchToPreCall", 172357);
                        break;
                    case 16:
                        defpackage.aacy aacyVar20 = (defpackage.aacy) obj;
                        int i21 = defpackage.mdt.a;
                        if (aacyVar20 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar20.b = defpackage.aais.aI("VoiceCallFromSuggestedContactsToVoiceScreenShown", 176675);
                        break;
                    case 17:
                        defpackage.aacy aacyVar21 = (defpackage.aacy) obj;
                        int i22 = defpackage.mdt.a;
                        if (aacyVar21 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar21.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar21.a = defpackage.aais.aI("VoiceCallFromSuggestedContactsToPreCall", 172353);
                        break;
                    case 18:
                        defpackage.aacy aacyVar22 = (defpackage.aacy) obj;
                        int i23 = defpackage.mdt.a;
                        if (aacyVar22 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar22.b = defpackage.aais.aI("VoiceCallFromRecentsToVoiceScreenShown", 176679);
                        break;
                    case 19:
                        defpackage.aacy aacyVar23 = (defpackage.aacy) obj;
                        int i24 = defpackage.mdt.a;
                        if (aacyVar23 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar23.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar23.a = defpackage.aais.aI("VoiceCallFromRecentsToPreCall", 172349);
                        break;
                    default:
                        defpackage.aacy aacyVar24 = (defpackage.aacy) obj;
                        int i25 = defpackage.mdt.a;
                        if (aacyVar24 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar24.b = defpackage.aais.aI("LastPreCallActionFinishedToVoiceScreenShown", 173772);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar4 = new defpackage.aacy();
        aonjVar.a(aacyVar4);
        final int i5 = 2;
        adcmVar.g(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar2, aacyVar3, aacyVar4}));
        final int i6 = 12;
        defpackage.aonj aonjVar2 = new defpackage.aonj() { // from class: mds
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i6) {
                    case 0:
                        defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                        int i7 = defpackage.mdt.a;
                        if (aacyVar5 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar5.b = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToVoiceScreenShown", 176661);
                        break;
                    case 1:
                        defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                        int i8 = defpackage.mdt.a;
                        if (aacyVar6 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar6.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar6.a = defpackage.aais.aI("VoiceCallFromVisualVoicemailToPreCall", 172365);
                        break;
                    case 2:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        int i9 = defpackage.mdt.a;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar7.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar7.a = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToPreCall", 172369);
                        break;
                    case 3:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        int i10 = defpackage.mdt.a;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar8.b = defpackage.aais.aI("VoiceCallFromExternalToVoiceScreenShown", 176663);
                        break;
                    case 4:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        int i11 = defpackage.mdt.a;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar9.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar9.a = defpackage.aais.aI("VoiceCallFromExternalToPreCall", 172367);
                        break;
                    case 5:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        int i12 = defpackage.mdt.a;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar10.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        int i13 = defpackage.mdt.a;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar11.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.DIRECT_MY_CALL_FRAGMENT_CREATED});
                        aacyVar11.a = defpackage.aais.aI("VoiceCallFromDialpadToDirectMyCallScreenShown", 226576);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        int i14 = defpackage.mdt.a;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar12.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar12.a = defpackage.aais.aI("VoiceCallFromExternalTelecomToPreCall", 178396);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        int i15 = defpackage.mdt.a;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar13.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 9:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        int i16 = defpackage.mdt.a;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar14.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case 10:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        int i17 = defpackage.mdt.a;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar15.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        int i18 = defpackage.mdt.a;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar16.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar16.a = defpackage.aais.aI("VoiceCallFromSearchActionToPreCall", 181223);
                        break;
                    case 12:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        int i19 = defpackage.mdt.a;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar17.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar17.a = defpackage.aais.aI("VoiceCallFromDialpadToPreCall", 172346);
                        break;
                    case 13:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        int i110 = defpackage.mdt.a;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("VoiceScreenShownToScreenFullyRendered", 172371);
                        break;
                    case 14:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        int i111 = defpackage.mdt.a;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("VoiceCallFromSearchToVoiceScreenShown", 176671);
                        break;
                    case 15:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i20 = defpackage.mdt.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VoiceCallFromSearchToPreCall", 172357);
                        break;
                    case 16:
                        defpackage.aacy aacyVar20 = (defpackage.aacy) obj;
                        int i21 = defpackage.mdt.a;
                        if (aacyVar20 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar20.b = defpackage.aais.aI("VoiceCallFromSuggestedContactsToVoiceScreenShown", 176675);
                        break;
                    case 17:
                        defpackage.aacy aacyVar21 = (defpackage.aacy) obj;
                        int i22 = defpackage.mdt.a;
                        if (aacyVar21 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar21.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar21.a = defpackage.aais.aI("VoiceCallFromSuggestedContactsToPreCall", 172353);
                        break;
                    case 18:
                        defpackage.aacy aacyVar22 = (defpackage.aacy) obj;
                        int i23 = defpackage.mdt.a;
                        if (aacyVar22 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar22.b = defpackage.aais.aI("VoiceCallFromRecentsToVoiceScreenShown", 176679);
                        break;
                    case 19:
                        defpackage.aacy aacyVar23 = (defpackage.aacy) obj;
                        int i24 = defpackage.mdt.a;
                        if (aacyVar23 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar23.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar23.a = defpackage.aais.aI("VoiceCallFromRecentsToPreCall", 172349);
                        break;
                    default:
                        defpackage.aacy aacyVar24 = (defpackage.aacy) obj;
                        int i25 = defpackage.mdt.a;
                        if (aacyVar24 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar24.b = defpackage.aais.aI("LastPreCallActionFinishedToVoiceScreenShown", 173772);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar5 = new defpackage.aacy();
        aonjVar2.a(aacyVar5);
        java.util.Set setSingleton = java.util.Collections.singleton(aacyVar5);
        defpackage.aooh.e(setSingleton, "singleton(...)");
        adcmVar.e(setSingleton);
        java.util.Set set2 = defpackage.mdv.a;
        java.util.Set set3 = defpackage.mdv.a;
        adcmVar.f(set3);
        arrayList.add(adcmVar.c());
        defpackage.adcm adcmVar2 = new defpackage.adcm(null);
        defpackage.aonj aonjVar3 = new defpackage.aonj() { // from class: mds
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i) {
                    case 0:
                        defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                        int i7 = defpackage.mdt.a;
                        if (aacyVar6 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar6.b = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToVoiceScreenShown", 176661);
                        break;
                    case 1:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        int i8 = defpackage.mdt.a;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar7.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar7.a = defpackage.aais.aI("VoiceCallFromVisualVoicemailToPreCall", 172365);
                        break;
                    case 2:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        int i9 = defpackage.mdt.a;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar8.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar8.a = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToPreCall", 172369);
                        break;
                    case 3:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        int i10 = defpackage.mdt.a;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar9.b = defpackage.aais.aI("VoiceCallFromExternalToVoiceScreenShown", 176663);
                        break;
                    case 4:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        int i11 = defpackage.mdt.a;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar10.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar10.a = defpackage.aais.aI("VoiceCallFromExternalToPreCall", 172367);
                        break;
                    case 5:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        int i12 = defpackage.mdt.a;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar11.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        int i13 = defpackage.mdt.a;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar12.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.DIRECT_MY_CALL_FRAGMENT_CREATED});
                        aacyVar12.a = defpackage.aais.aI("VoiceCallFromDialpadToDirectMyCallScreenShown", 226576);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        int i14 = defpackage.mdt.a;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar13.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar13.a = defpackage.aais.aI("VoiceCallFromExternalTelecomToPreCall", 178396);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        int i15 = defpackage.mdt.a;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar14.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 9:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        int i16 = defpackage.mdt.a;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar15.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case 10:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        int i17 = defpackage.mdt.a;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar16.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        int i18 = defpackage.mdt.a;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar17.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar17.a = defpackage.aais.aI("VoiceCallFromSearchActionToPreCall", 181223);
                        break;
                    case 12:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        int i19 = defpackage.mdt.a;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar18.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar18.a = defpackage.aais.aI("VoiceCallFromDialpadToPreCall", 172346);
                        break;
                    case 13:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        int i110 = defpackage.mdt.a;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("VoiceScreenShownToScreenFullyRendered", 172371);
                        break;
                    case 14:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i111 = defpackage.mdt.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("VoiceCallFromSearchToVoiceScreenShown", 176671);
                        break;
                    case 15:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i20 = defpackage.mdt.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar111.a = defpackage.aais.aI("VoiceCallFromSearchToPreCall", 172357);
                        break;
                    case 16:
                        defpackage.aacy aacyVar20 = (defpackage.aacy) obj;
                        int i21 = defpackage.mdt.a;
                        if (aacyVar20 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar20.b = defpackage.aais.aI("VoiceCallFromSuggestedContactsToVoiceScreenShown", 176675);
                        break;
                    case 17:
                        defpackage.aacy aacyVar21 = (defpackage.aacy) obj;
                        int i22 = defpackage.mdt.a;
                        if (aacyVar21 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar21.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar21.a = defpackage.aais.aI("VoiceCallFromSuggestedContactsToPreCall", 172353);
                        break;
                    case 18:
                        defpackage.aacy aacyVar22 = (defpackage.aacy) obj;
                        int i23 = defpackage.mdt.a;
                        if (aacyVar22 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar22.b = defpackage.aais.aI("VoiceCallFromRecentsToVoiceScreenShown", 176679);
                        break;
                    case 19:
                        defpackage.aacy aacyVar23 = (defpackage.aacy) obj;
                        int i24 = defpackage.mdt.a;
                        if (aacyVar23 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar23.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar23.a = defpackage.aais.aI("VoiceCallFromRecentsToPreCall", 172349);
                        break;
                    default:
                        defpackage.aacy aacyVar24 = (defpackage.aacy) obj;
                        int i25 = defpackage.mdt.a;
                        if (aacyVar24 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar24.b = defpackage.aais.aI("LastPreCallActionFinishedToVoiceScreenShown", 173772);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar6 = new defpackage.aacy(null, null, null);
        aonjVar3.a(aacyVar6);
        adcmVar2.h = aacyVar6;
        adcmVar2.i = defpackage.mce.IN_CALL_CONTACT_TOP_ROW_FOR_DIALING_SHOWN;
        defpackage.mce mceVar = defpackage.mce.CONTACT_INFO_NOT_SHOWN_BECAUSE_DISPLAY_OFF;
        defpackage.mce mceVar2 = defpackage.mce.DIRECT_MY_CALL_FRAGMENT_CREATED;
        adcmVar2.d(defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_REMOVED, mceVar, defpackage.mce.ON_IN_CALL_ACTIVITY_STOPPED, defpackage.mce.ON_IN_CALL_ACTIVITY_DESTROYED, mceVar2}));
        adcmVar2.a = defpackage.mce.CONTACT_INFO_SHOWN;
        arrayList.add(adcmVar2.c());
        defpackage.adcm adcmVar3 = new defpackage.adcm(null);
        final int i7 = 14;
        defpackage.aonj aonjVar4 = new defpackage.aonj() { // from class: mds
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i7) {
                    case 0:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        int i8 = defpackage.mdt.a;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar7.b = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToVoiceScreenShown", 176661);
                        break;
                    case 1:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        int i9 = defpackage.mdt.a;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar8.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar8.a = defpackage.aais.aI("VoiceCallFromVisualVoicemailToPreCall", 172365);
                        break;
                    case 2:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        int i10 = defpackage.mdt.a;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar9.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar9.a = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToPreCall", 172369);
                        break;
                    case 3:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        int i11 = defpackage.mdt.a;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar10.b = defpackage.aais.aI("VoiceCallFromExternalToVoiceScreenShown", 176663);
                        break;
                    case 4:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        int i12 = defpackage.mdt.a;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar11.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar11.a = defpackage.aais.aI("VoiceCallFromExternalToPreCall", 172367);
                        break;
                    case 5:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        int i13 = defpackage.mdt.a;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar12.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        int i14 = defpackage.mdt.a;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar13.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.DIRECT_MY_CALL_FRAGMENT_CREATED});
                        aacyVar13.a = defpackage.aais.aI("VoiceCallFromDialpadToDirectMyCallScreenShown", 226576);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        int i15 = defpackage.mdt.a;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar14.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar14.a = defpackage.aais.aI("VoiceCallFromExternalTelecomToPreCall", 178396);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        int i16 = defpackage.mdt.a;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar15.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 9:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        int i17 = defpackage.mdt.a;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar16.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case 10:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        int i18 = defpackage.mdt.a;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar17.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        int i19 = defpackage.mdt.a;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar18.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar18.a = defpackage.aais.aI("VoiceCallFromSearchActionToPreCall", 181223);
                        break;
                    case 12:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        int i110 = defpackage.mdt.a;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar19.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar19.a = defpackage.aais.aI("VoiceCallFromDialpadToPreCall", 172346);
                        break;
                    case 13:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i111 = defpackage.mdt.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("VoiceScreenShownToScreenFullyRendered", 172371);
                        break;
                    case 14:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i112 = defpackage.mdt.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("VoiceCallFromSearchToVoiceScreenShown", 176671);
                        break;
                    case 15:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i20 = defpackage.mdt.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar112.a = defpackage.aais.aI("VoiceCallFromSearchToPreCall", 172357);
                        break;
                    case 16:
                        defpackage.aacy aacyVar20 = (defpackage.aacy) obj;
                        int i21 = defpackage.mdt.a;
                        if (aacyVar20 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar20.b = defpackage.aais.aI("VoiceCallFromSuggestedContactsToVoiceScreenShown", 176675);
                        break;
                    case 17:
                        defpackage.aacy aacyVar21 = (defpackage.aacy) obj;
                        int i22 = defpackage.mdt.a;
                        if (aacyVar21 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar21.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar21.a = defpackage.aais.aI("VoiceCallFromSuggestedContactsToPreCall", 172353);
                        break;
                    case 18:
                        defpackage.aacy aacyVar22 = (defpackage.aacy) obj;
                        int i23 = defpackage.mdt.a;
                        if (aacyVar22 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar22.b = defpackage.aais.aI("VoiceCallFromRecentsToVoiceScreenShown", 176679);
                        break;
                    case 19:
                        defpackage.aacy aacyVar23 = (defpackage.aacy) obj;
                        int i24 = defpackage.mdt.a;
                        if (aacyVar23 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar23.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar23.a = defpackage.aais.aI("VoiceCallFromRecentsToPreCall", 172349);
                        break;
                    default:
                        defpackage.aacy aacyVar24 = (defpackage.aacy) obj;
                        int i25 = defpackage.mdt.a;
                        if (aacyVar24 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar24.b = defpackage.aais.aI("LastPreCallActionFinishedToVoiceScreenShown", 173772);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar7 = new defpackage.aacy(null, null, null);
        aonjVar4.a(aacyVar7);
        adcmVar3.h = aacyVar7;
        adcmVar3.i = defpackage.mce.USER_CLICKED_VOICE_CALL_BUTTON_FROM_CONTACT_SEARCH;
        adcmVar3.d(set);
        defpackage.aacy aacyVar8 = new defpackage.aacy();
        defpackage.mce mceVar3 = defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN;
        aacyVar8.b = mceVar3;
        final int i8 = 15;
        defpackage.aonj aonjVar5 = new defpackage.aonj() { // from class: mds
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i8) {
                    case 0:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        int i9 = defpackage.mdt.a;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar9.b = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToVoiceScreenShown", 176661);
                        break;
                    case 1:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        int i10 = defpackage.mdt.a;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar10.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar10.a = defpackage.aais.aI("VoiceCallFromVisualVoicemailToPreCall", 172365);
                        break;
                    case 2:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        int i11 = defpackage.mdt.a;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar11.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar11.a = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToPreCall", 172369);
                        break;
                    case 3:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        int i12 = defpackage.mdt.a;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("VoiceCallFromExternalToVoiceScreenShown", 176663);
                        break;
                    case 4:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        int i13 = defpackage.mdt.a;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar13.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar13.a = defpackage.aais.aI("VoiceCallFromExternalToPreCall", 172367);
                        break;
                    case 5:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        int i14 = defpackage.mdt.a;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar14.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        int i15 = defpackage.mdt.a;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar15.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.DIRECT_MY_CALL_FRAGMENT_CREATED});
                        aacyVar15.a = defpackage.aais.aI("VoiceCallFromDialpadToDirectMyCallScreenShown", 226576);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        int i16 = defpackage.mdt.a;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar16.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar16.a = defpackage.aais.aI("VoiceCallFromExternalTelecomToPreCall", 178396);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        int i17 = defpackage.mdt.a;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar17.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 9:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        int i18 = defpackage.mdt.a;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar18.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case 10:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        int i19 = defpackage.mdt.a;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar19.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mdt.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VoiceCallFromSearchActionToPreCall", 181223);
                        break;
                    case 12:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mdt.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar111.a = defpackage.aais.aI("VoiceCallFromDialpadToPreCall", 172346);
                        break;
                    case 13:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i112 = defpackage.mdt.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("VoiceScreenShownToScreenFullyRendered", 172371);
                        break;
                    case 14:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i113 = defpackage.mdt.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromSearchToVoiceScreenShown", 176671);
                        break;
                    case 15:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i20 = defpackage.mdt.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromSearchToPreCall", 172357);
                        break;
                    case 16:
                        defpackage.aacy aacyVar20 = (defpackage.aacy) obj;
                        int i21 = defpackage.mdt.a;
                        if (aacyVar20 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar20.b = defpackage.aais.aI("VoiceCallFromSuggestedContactsToVoiceScreenShown", 176675);
                        break;
                    case 17:
                        defpackage.aacy aacyVar21 = (defpackage.aacy) obj;
                        int i22 = defpackage.mdt.a;
                        if (aacyVar21 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar21.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar21.a = defpackage.aais.aI("VoiceCallFromSuggestedContactsToPreCall", 172353);
                        break;
                    case 18:
                        defpackage.aacy aacyVar22 = (defpackage.aacy) obj;
                        int i23 = defpackage.mdt.a;
                        if (aacyVar22 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar22.b = defpackage.aais.aI("VoiceCallFromRecentsToVoiceScreenShown", 176679);
                        break;
                    case 19:
                        defpackage.aacy aacyVar23 = (defpackage.aacy) obj;
                        int i24 = defpackage.mdt.a;
                        if (aacyVar23 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar23.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar23.a = defpackage.aais.aI("VoiceCallFromRecentsToPreCall", 172349);
                        break;
                    default:
                        defpackage.aacy aacyVar24 = (defpackage.aacy) obj;
                        int i25 = defpackage.mdt.a;
                        if (aacyVar24 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar24.b = defpackage.aais.aI("LastPreCallActionFinishedToVoiceScreenShown", 173772);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar9 = new defpackage.aacy();
        aonjVar5.a(aacyVar9);
        adcmVar3.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar8, aacyVar9}));
        adcmVar3.f(set3);
        arrayList.add(adcmVar3.c());
        defpackage.adcm adcmVar4 = new defpackage.adcm(null);
        final int i9 = 16;
        defpackage.aonj aonjVar6 = new defpackage.aonj() { // from class: mds
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i9) {
                    case 0:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        int i10 = defpackage.mdt.a;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar10.b = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToVoiceScreenShown", 176661);
                        break;
                    case 1:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        int i11 = defpackage.mdt.a;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar11.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar11.a = defpackage.aais.aI("VoiceCallFromVisualVoicemailToPreCall", 172365);
                        break;
                    case 2:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        int i12 = defpackage.mdt.a;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar12.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar12.a = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToPreCall", 172369);
                        break;
                    case 3:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        int i13 = defpackage.mdt.a;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar13.b = defpackage.aais.aI("VoiceCallFromExternalToVoiceScreenShown", 176663);
                        break;
                    case 4:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        int i14 = defpackage.mdt.a;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar14.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar14.a = defpackage.aais.aI("VoiceCallFromExternalToPreCall", 172367);
                        break;
                    case 5:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        int i15 = defpackage.mdt.a;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar15.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        int i16 = defpackage.mdt.a;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar16.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.DIRECT_MY_CALL_FRAGMENT_CREATED});
                        aacyVar16.a = defpackage.aais.aI("VoiceCallFromDialpadToDirectMyCallScreenShown", 226576);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        int i17 = defpackage.mdt.a;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar17.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar17.a = defpackage.aais.aI("VoiceCallFromExternalTelecomToPreCall", 178396);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        int i18 = defpackage.mdt.a;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar18.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 9:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        int i19 = defpackage.mdt.a;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar19.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case 10:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mdt.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mdt.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar111.a = defpackage.aais.aI("VoiceCallFromSearchActionToPreCall", 181223);
                        break;
                    case 12:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i112 = defpackage.mdt.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar112.a = defpackage.aais.aI("VoiceCallFromDialpadToPreCall", 172346);
                        break;
                    case 13:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i113 = defpackage.mdt.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceScreenShownToScreenFullyRendered", 172371);
                        break;
                    case 14:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i114 = defpackage.mdt.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("VoiceCallFromSearchToVoiceScreenShown", 176671);
                        break;
                    case 15:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i20 = defpackage.mdt.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar115.a = defpackage.aais.aI("VoiceCallFromSearchToPreCall", 172357);
                        break;
                    case 16:
                        defpackage.aacy aacyVar20 = (defpackage.aacy) obj;
                        int i21 = defpackage.mdt.a;
                        if (aacyVar20 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar20.b = defpackage.aais.aI("VoiceCallFromSuggestedContactsToVoiceScreenShown", 176675);
                        break;
                    case 17:
                        defpackage.aacy aacyVar21 = (defpackage.aacy) obj;
                        int i22 = defpackage.mdt.a;
                        if (aacyVar21 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar21.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar21.a = defpackage.aais.aI("VoiceCallFromSuggestedContactsToPreCall", 172353);
                        break;
                    case 18:
                        defpackage.aacy aacyVar22 = (defpackage.aacy) obj;
                        int i23 = defpackage.mdt.a;
                        if (aacyVar22 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar22.b = defpackage.aais.aI("VoiceCallFromRecentsToVoiceScreenShown", 176679);
                        break;
                    case 19:
                        defpackage.aacy aacyVar23 = (defpackage.aacy) obj;
                        int i24 = defpackage.mdt.a;
                        if (aacyVar23 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar23.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar23.a = defpackage.aais.aI("VoiceCallFromRecentsToPreCall", 172349);
                        break;
                    default:
                        defpackage.aacy aacyVar24 = (defpackage.aacy) obj;
                        int i25 = defpackage.mdt.a;
                        if (aacyVar24 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar24.b = defpackage.aais.aI("LastPreCallActionFinishedToVoiceScreenShown", 173772);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar10 = new defpackage.aacy(null, null, null);
        aonjVar6.a(aacyVar10);
        adcmVar4.h = aacyVar10;
        adcmVar4.i = defpackage.mce.USER_CLICKED_VOICE_CALL_BUTTON_FROM_SUGGESTED_SEARCH;
        defpackage.aacy aacyVar11 = new defpackage.aacy();
        aacyVar11.b = mceVar3;
        final int i10 = 17;
        defpackage.aonj aonjVar7 = new defpackage.aonj() { // from class: mds
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i10) {
                    case 0:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        int i11 = defpackage.mdt.a;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToVoiceScreenShown", 176661);
                        break;
                    case 1:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        int i12 = defpackage.mdt.a;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar13.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar13.a = defpackage.aais.aI("VoiceCallFromVisualVoicemailToPreCall", 172365);
                        break;
                    case 2:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        int i13 = defpackage.mdt.a;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar14.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar14.a = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToPreCall", 172369);
                        break;
                    case 3:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        int i14 = defpackage.mdt.a;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("VoiceCallFromExternalToVoiceScreenShown", 176663);
                        break;
                    case 4:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        int i15 = defpackage.mdt.a;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar16.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar16.a = defpackage.aais.aI("VoiceCallFromExternalToPreCall", 172367);
                        break;
                    case 5:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        int i16 = defpackage.mdt.a;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar17.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        int i17 = defpackage.mdt.a;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar18.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.DIRECT_MY_CALL_FRAGMENT_CREATED});
                        aacyVar18.a = defpackage.aais.aI("VoiceCallFromDialpadToDirectMyCallScreenShown", 226576);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        int i18 = defpackage.mdt.a;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar19.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar19.a = defpackage.aais.aI("VoiceCallFromExternalTelecomToPreCall", 178396);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i19 = defpackage.mdt.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 9:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i110 = defpackage.mdt.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case 10:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i111 = defpackage.mdt.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar112.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i112 = defpackage.mdt.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar113.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar113.a = defpackage.aais.aI("VoiceCallFromSearchActionToPreCall", 181223);
                        break;
                    case 12:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i113 = defpackage.mdt.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromDialpadToPreCall", 172346);
                        break;
                    case 13:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i114 = defpackage.mdt.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("VoiceScreenShownToScreenFullyRendered", 172371);
                        break;
                    case 14:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i115 = defpackage.mdt.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromSearchToVoiceScreenShown", 176671);
                        break;
                    case 15:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i20 = defpackage.mdt.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromSearchToPreCall", 172357);
                        break;
                    case 16:
                        defpackage.aacy aacyVar20 = (defpackage.aacy) obj;
                        int i21 = defpackage.mdt.a;
                        if (aacyVar20 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar20.b = defpackage.aais.aI("VoiceCallFromSuggestedContactsToVoiceScreenShown", 176675);
                        break;
                    case 17:
                        defpackage.aacy aacyVar21 = (defpackage.aacy) obj;
                        int i22 = defpackage.mdt.a;
                        if (aacyVar21 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar21.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar21.a = defpackage.aais.aI("VoiceCallFromSuggestedContactsToPreCall", 172353);
                        break;
                    case 18:
                        defpackage.aacy aacyVar22 = (defpackage.aacy) obj;
                        int i23 = defpackage.mdt.a;
                        if (aacyVar22 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar22.b = defpackage.aais.aI("VoiceCallFromRecentsToVoiceScreenShown", 176679);
                        break;
                    case 19:
                        defpackage.aacy aacyVar23 = (defpackage.aacy) obj;
                        int i24 = defpackage.mdt.a;
                        if (aacyVar23 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar23.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar23.a = defpackage.aais.aI("VoiceCallFromRecentsToPreCall", 172349);
                        break;
                    default:
                        defpackage.aacy aacyVar24 = (defpackage.aacy) obj;
                        int i25 = defpackage.mdt.a;
                        if (aacyVar24 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar24.b = defpackage.aais.aI("LastPreCallActionFinishedToVoiceScreenShown", 173772);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar12 = new defpackage.aacy();
        aonjVar7.a(aacyVar12);
        adcmVar4.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar11, aacyVar12}));
        adcmVar4.d(set);
        adcmVar4.f(set3);
        arrayList.add(adcmVar4.c());
        defpackage.adcm adcmVar5 = new defpackage.adcm(null);
        final int i11 = 18;
        defpackage.aonj aonjVar8 = new defpackage.aonj() { // from class: mds
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i11) {
                    case 0:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        int i12 = defpackage.mdt.a;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar13.b = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToVoiceScreenShown", 176661);
                        break;
                    case 1:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        int i13 = defpackage.mdt.a;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar14.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar14.a = defpackage.aais.aI("VoiceCallFromVisualVoicemailToPreCall", 172365);
                        break;
                    case 2:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        int i14 = defpackage.mdt.a;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar15.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar15.a = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToPreCall", 172369);
                        break;
                    case 3:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        int i15 = defpackage.mdt.a;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("VoiceCallFromExternalToVoiceScreenShown", 176663);
                        break;
                    case 4:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        int i16 = defpackage.mdt.a;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar17.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar17.a = defpackage.aais.aI("VoiceCallFromExternalToPreCall", 172367);
                        break;
                    case 5:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        int i17 = defpackage.mdt.a;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar18.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        int i18 = defpackage.mdt.a;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar19.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.DIRECT_MY_CALL_FRAGMENT_CREATED});
                        aacyVar19.a = defpackage.aais.aI("VoiceCallFromDialpadToDirectMyCallScreenShown", 226576);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i19 = defpackage.mdt.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VoiceCallFromExternalTelecomToPreCall", 178396);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i110 = defpackage.mdt.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 9:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i111 = defpackage.mdt.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar112.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case 10:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i112 = defpackage.mdt.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i113 = defpackage.mdt.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromSearchActionToPreCall", 181223);
                        break;
                    case 12:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i114 = defpackage.mdt.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar115.a = defpackage.aais.aI("VoiceCallFromDialpadToPreCall", 172346);
                        break;
                    case 13:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i115 = defpackage.mdt.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceScreenShownToScreenFullyRendered", 172371);
                        break;
                    case 14:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i116 = defpackage.mdt.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar117.b = defpackage.aais.aI("VoiceCallFromSearchToVoiceScreenShown", 176671);
                        break;
                    case 15:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i20 = defpackage.mdt.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar118.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar118.a = defpackage.aais.aI("VoiceCallFromSearchToPreCall", 172357);
                        break;
                    case 16:
                        defpackage.aacy aacyVar20 = (defpackage.aacy) obj;
                        int i21 = defpackage.mdt.a;
                        if (aacyVar20 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar20.b = defpackage.aais.aI("VoiceCallFromSuggestedContactsToVoiceScreenShown", 176675);
                        break;
                    case 17:
                        defpackage.aacy aacyVar21 = (defpackage.aacy) obj;
                        int i22 = defpackage.mdt.a;
                        if (aacyVar21 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar21.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar21.a = defpackage.aais.aI("VoiceCallFromSuggestedContactsToPreCall", 172353);
                        break;
                    case 18:
                        defpackage.aacy aacyVar22 = (defpackage.aacy) obj;
                        int i23 = defpackage.mdt.a;
                        if (aacyVar22 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar22.b = defpackage.aais.aI("VoiceCallFromRecentsToVoiceScreenShown", 176679);
                        break;
                    case 19:
                        defpackage.aacy aacyVar23 = (defpackage.aacy) obj;
                        int i24 = defpackage.mdt.a;
                        if (aacyVar23 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar23.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar23.a = defpackage.aais.aI("VoiceCallFromRecentsToPreCall", 172349);
                        break;
                    default:
                        defpackage.aacy aacyVar24 = (defpackage.aacy) obj;
                        int i25 = defpackage.mdt.a;
                        if (aacyVar24 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar24.b = defpackage.aais.aI("LastPreCallActionFinishedToVoiceScreenShown", 173772);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar13 = new defpackage.aacy(null, null, null);
        aonjVar8.a(aacyVar13);
        adcmVar5.h = aacyVar13;
        adcmVar5.i = defpackage.mce.USER_CLICKED_VOICE_CALL_BUTTON_FROM_RECENTS;
        java.util.Set setSingleton2 = java.util.Collections.singleton(mceVar2);
        defpackage.aooh.e(setSingleton2, "singleton(...)");
        adcmVar5.d(defpackage.ajsz.aI(set, setSingleton2));
        defpackage.aacy aacyVar14 = new defpackage.aacy();
        aacyVar14.b = mceVar3;
        final int i12 = 19;
        defpackage.aonj aonjVar9 = new defpackage.aonj() { // from class: mds
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i12) {
                    case 0:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        int i13 = defpackage.mdt.a;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToVoiceScreenShown", 176661);
                        break;
                    case 1:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        int i14 = defpackage.mdt.a;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar16.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar16.a = defpackage.aais.aI("VoiceCallFromVisualVoicemailToPreCall", 172365);
                        break;
                    case 2:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        int i15 = defpackage.mdt.a;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar17.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar17.a = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToPreCall", 172369);
                        break;
                    case 3:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        int i16 = defpackage.mdt.a;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("VoiceCallFromExternalToVoiceScreenShown", 176663);
                        break;
                    case 4:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        int i17 = defpackage.mdt.a;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar19.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar19.a = defpackage.aais.aI("VoiceCallFromExternalToPreCall", 172367);
                        break;
                    case 5:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i18 = defpackage.mdt.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i19 = defpackage.mdt.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.DIRECT_MY_CALL_FRAGMENT_CREATED});
                        aacyVar111.a = defpackage.aais.aI("VoiceCallFromDialpadToDirectMyCallScreenShown", 226576);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i110 = defpackage.mdt.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar112.a = defpackage.aais.aI("VoiceCallFromExternalTelecomToPreCall", 178396);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i111 = defpackage.mdt.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 9:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i112 = defpackage.mdt.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case 10:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i113 = defpackage.mdt.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i114 = defpackage.mdt.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar116.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar116.a = defpackage.aais.aI("VoiceCallFromSearchActionToPreCall", 181223);
                        break;
                    case 12:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i115 = defpackage.mdt.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromDialpadToPreCall", 172346);
                        break;
                    case 13:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i116 = defpackage.mdt.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceScreenShownToScreenFullyRendered", 172371);
                        break;
                    case 14:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i117 = defpackage.mdt.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("VoiceCallFromSearchToVoiceScreenShown", 176671);
                        break;
                    case 15:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i20 = defpackage.mdt.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1110.a = defpackage.aais.aI("VoiceCallFromSearchToPreCall", 172357);
                        break;
                    case 16:
                        defpackage.aacy aacyVar20 = (defpackage.aacy) obj;
                        int i21 = defpackage.mdt.a;
                        if (aacyVar20 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar20.b = defpackage.aais.aI("VoiceCallFromSuggestedContactsToVoiceScreenShown", 176675);
                        break;
                    case 17:
                        defpackage.aacy aacyVar21 = (defpackage.aacy) obj;
                        int i22 = defpackage.mdt.a;
                        if (aacyVar21 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar21.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar21.a = defpackage.aais.aI("VoiceCallFromSuggestedContactsToPreCall", 172353);
                        break;
                    case 18:
                        defpackage.aacy aacyVar22 = (defpackage.aacy) obj;
                        int i23 = defpackage.mdt.a;
                        if (aacyVar22 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar22.b = defpackage.aais.aI("VoiceCallFromRecentsToVoiceScreenShown", 176679);
                        break;
                    case 19:
                        defpackage.aacy aacyVar23 = (defpackage.aacy) obj;
                        int i24 = defpackage.mdt.a;
                        if (aacyVar23 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar23.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar23.a = defpackage.aais.aI("VoiceCallFromRecentsToPreCall", 172349);
                        break;
                    default:
                        defpackage.aacy aacyVar24 = (defpackage.aacy) obj;
                        int i25 = defpackage.mdt.a;
                        if (aacyVar24 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar24.b = defpackage.aais.aI("LastPreCallActionFinishedToVoiceScreenShown", 173772);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar15 = new defpackage.aacy();
        aonjVar9.a(aacyVar15);
        adcmVar5.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar14, aacyVar15}));
        adcmVar5.f(set3);
        arrayList.add(adcmVar5.c());
        defpackage.adcm adcmVar6 = new defpackage.adcm(null);
        final int i13 = 20;
        defpackage.aonj aonjVar10 = new defpackage.aonj() { // from class: mds
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i13) {
                    case 0:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        int i14 = defpackage.mdt.a;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToVoiceScreenShown", 176661);
                        break;
                    case 1:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        int i15 = defpackage.mdt.a;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar17.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar17.a = defpackage.aais.aI("VoiceCallFromVisualVoicemailToPreCall", 172365);
                        break;
                    case 2:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        int i16 = defpackage.mdt.a;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar18.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar18.a = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToPreCall", 172369);
                        break;
                    case 3:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        int i17 = defpackage.mdt.a;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("VoiceCallFromExternalToVoiceScreenShown", 176663);
                        break;
                    case 4:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i18 = defpackage.mdt.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VoiceCallFromExternalToPreCall", 172367);
                        break;
                    case 5:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i19 = defpackage.mdt.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i110 = defpackage.mdt.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar112.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.DIRECT_MY_CALL_FRAGMENT_CREATED});
                        aacyVar112.a = defpackage.aais.aI("VoiceCallFromDialpadToDirectMyCallScreenShown", 226576);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i111 = defpackage.mdt.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar113.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar113.a = defpackage.aais.aI("VoiceCallFromExternalTelecomToPreCall", 178396);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i112 = defpackage.mdt.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 9:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i113 = defpackage.mdt.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case 10:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i114 = defpackage.mdt.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i115 = defpackage.mdt.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromSearchActionToPreCall", 181223);
                        break;
                    case 12:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i116 = defpackage.mdt.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar118.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar118.a = defpackage.aais.aI("VoiceCallFromDialpadToPreCall", 172346);
                        break;
                    case 13:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i117 = defpackage.mdt.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("VoiceScreenShownToScreenFullyRendered", 172371);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i118 = defpackage.mdt.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1110.b = defpackage.aais.aI("VoiceCallFromSearchToVoiceScreenShown", 176671);
                        break;
                    case 15:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i20 = defpackage.mdt.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1111.a = defpackage.aais.aI("VoiceCallFromSearchToPreCall", 172357);
                        break;
                    case 16:
                        defpackage.aacy aacyVar20 = (defpackage.aacy) obj;
                        int i21 = defpackage.mdt.a;
                        if (aacyVar20 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar20.b = defpackage.aais.aI("VoiceCallFromSuggestedContactsToVoiceScreenShown", 176675);
                        break;
                    case 17:
                        defpackage.aacy aacyVar21 = (defpackage.aacy) obj;
                        int i22 = defpackage.mdt.a;
                        if (aacyVar21 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar21.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar21.a = defpackage.aais.aI("VoiceCallFromSuggestedContactsToPreCall", 172353);
                        break;
                    case 18:
                        defpackage.aacy aacyVar22 = (defpackage.aacy) obj;
                        int i23 = defpackage.mdt.a;
                        if (aacyVar22 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar22.b = defpackage.aais.aI("VoiceCallFromRecentsToVoiceScreenShown", 176679);
                        break;
                    case 19:
                        defpackage.aacy aacyVar23 = (defpackage.aacy) obj;
                        int i24 = defpackage.mdt.a;
                        if (aacyVar23 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar23.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar23.a = defpackage.aais.aI("VoiceCallFromRecentsToPreCall", 172349);
                        break;
                    default:
                        defpackage.aacy aacyVar24 = (defpackage.aacy) obj;
                        int i25 = defpackage.mdt.a;
                        if (aacyVar24 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar24.b = defpackage.aais.aI("LastPreCallActionFinishedToVoiceScreenShown", 173772);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar16 = new defpackage.aacy(null, null, null);
        aonjVar10.a(aacyVar16);
        adcmVar6.h = aacyVar16;
        adcmVar6.i = defpackage.mce.PRE_CALL_ACTION_FINISHED;
        adcmVar6.a = mceVar3;
        defpackage.mce mceVar4 = defpackage.mce.RTT_CHAT_SCREEN_SHOWN;
        adcmVar6.d(defpackage.ajsz.aI(set, defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.PRE_CALL_ACTION_INITIATED, defpackage.mce.START_VIDEO_APP_CALL_SUCCESS, mceVar2, mceVar4})));
        arrayList.add(adcmVar6.c());
        defpackage.adcm adcmVar7 = new defpackage.adcm(null);
        defpackage.mdp mdpVar2 = new defpackage.mdp(10);
        defpackage.aacy aacyVar17 = new defpackage.aacy(null, null, null);
        mdpVar2.a(aacyVar17);
        adcmVar7.h = aacyVar17;
        adcmVar7.i = defpackage.mce.USER_CLICKED_CONTACT_FROM_FAVORITES;
        java.util.Set setSingleton3 = java.util.Collections.singleton(mceVar2);
        defpackage.aooh.e(setSingleton3, "singleton(...)");
        adcmVar7.d(defpackage.ajsz.aI(set, setSingleton3));
        defpackage.aacy aacyVar18 = new defpackage.aacy();
        aacyVar18.b = mceVar3;
        defpackage.mdp mdpVar3 = new defpackage.mdp(11);
        defpackage.aacy aacyVar19 = new defpackage.aacy();
        mdpVar3.a(aacyVar19);
        defpackage.mdp mdpVar4 = new defpackage.mdp(12);
        defpackage.aacy aacyVar20 = new defpackage.aacy();
        mdpVar4.a(aacyVar20);
        adcmVar7.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar18, aacyVar19, aacyVar20}));
        adcmVar7.f(set3);
        arrayList.add(adcmVar7.c());
        defpackage.adcm adcmVar8 = new defpackage.adcm(null);
        defpackage.mdp mdpVar5 = new defpackage.mdp(14);
        defpackage.aacy aacyVar21 = new defpackage.aacy(null, null, null);
        mdpVar5.a(aacyVar21);
        adcmVar8.h = aacyVar21;
        adcmVar8.i = defpackage.mce.USER_CLICKED_VOICE_CALL_BUTTON_FROM_FAVORITES_DISAMBIG_DIALOG;
        java.util.Set setSingleton4 = java.util.Collections.singleton(mceVar2);
        defpackage.aooh.e(setSingleton4, "singleton(...)");
        adcmVar8.d(defpackage.ajsz.aI(set, setSingleton4));
        defpackage.aacy aacyVar22 = new defpackage.aacy();
        aacyVar22.b = mceVar3;
        defpackage.mdp mdpVar6 = new defpackage.mdp(15);
        defpackage.aacy aacyVar23 = new defpackage.aacy();
        mdpVar6.a(aacyVar23);
        adcmVar8.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar22, aacyVar23}));
        adcmVar8.f(set3);
        arrayList.add(adcmVar8.c());
        defpackage.adcm adcmVar9 = new defpackage.adcm(null);
        defpackage.mdp mdpVar7 = new defpackage.mdp(16);
        defpackage.aacy aacyVar24 = new defpackage.aacy(null, null, null);
        mdpVar7.a(aacyVar24);
        adcmVar9.h = aacyVar24;
        adcmVar9.i = defpackage.mce.USER_CLICKED_VOICE_CALL_BUTTON_FROM_FREQUENTS_UNDER_FAVORITES_TAB;
        java.util.Set setSingleton5 = java.util.Collections.singleton(mceVar2);
        defpackage.aooh.e(setSingleton5, "singleton(...)");
        adcmVar9.d(defpackage.ajsz.aI(set, setSingleton5));
        defpackage.aacy aacyVar25 = new defpackage.aacy();
        aacyVar25.b = mceVar3;
        defpackage.mdp mdpVar8 = new defpackage.mdp(17);
        defpackage.aacy aacyVar26 = new defpackage.aacy();
        mdpVar8.a(aacyVar26);
        adcmVar9.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar25, aacyVar26}));
        adcmVar9.f(set3);
        arrayList.add(adcmVar9.c());
        defpackage.adcm adcmVar10 = new defpackage.adcm(null);
        defpackage.mdp mdpVar9 = new defpackage.mdp(18);
        defpackage.aacy aacyVar27 = new defpackage.aacy(null, null, null);
        mdpVar9.a(aacyVar27);
        adcmVar10.h = aacyVar27;
        adcmVar10.i = defpackage.mce.USER_CLICKED_VOICE_CALL_BUTTON_FROM_CALL_HISTORY;
        java.util.Set setSingleton6 = java.util.Collections.singleton(mceVar2);
        defpackage.aooh.e(setSingleton6, "singleton(...)");
        adcmVar10.d(defpackage.ajsz.aI(set, setSingleton6));
        defpackage.aacy aacyVar28 = new defpackage.aacy();
        aacyVar28.b = mceVar3;
        defpackage.mdp mdpVar10 = new defpackage.mdp(19);
        defpackage.aacy aacyVar29 = new defpackage.aacy();
        mdpVar10.a(aacyVar29);
        adcmVar10.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar28, aacyVar29}));
        adcmVar10.f(set3);
        arrayList.add(adcmVar10.c());
        defpackage.adcm adcmVar11 = new defpackage.adcm(null);
        defpackage.mdp mdpVar11 = new defpackage.mdp(20);
        defpackage.aacy aacyVar30 = new defpackage.aacy(null, null, null);
        mdpVar11.a(aacyVar30);
        adcmVar11.h = aacyVar30;
        adcmVar11.i = defpackage.mce.USER_CLICKED_VOICE_CALL_BUTTON_FROM_VISUAL_VOICEMAIL;
        adcmVar11.d(set);
        defpackage.aacy aacyVar31 = new defpackage.aacy();
        aacyVar31.b = mceVar3;
        defpackage.aonj aonjVar11 = new defpackage.aonj() { // from class: mds
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i3) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i14 = defpackage.mdt.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToVoiceScreenShown", 176661);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i15 = defpackage.mdt.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar111.a = defpackage.aais.aI("VoiceCallFromVisualVoicemailToPreCall", 172365);
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i16 = defpackage.mdt.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar112.a = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToPreCall", 172369);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i17 = defpackage.mdt.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromExternalToVoiceScreenShown", 176663);
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i18 = defpackage.mdt.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromExternalToPreCall", 172367);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i19 = defpackage.mdt.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i110 = defpackage.mdt.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.DIRECT_MY_CALL_FRAGMENT_CREATED});
                        aacyVar116.a = defpackage.aais.aI("VoiceCallFromDialpadToDirectMyCallScreenShown", 226576);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i111 = defpackage.mdt.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromExternalTelecomToPreCall", 178396);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i112 = defpackage.mdt.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i113 = defpackage.mdt.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i114 = defpackage.mdt.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i115 = defpackage.mdt.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1111.a = defpackage.aais.aI("VoiceCallFromSearchActionToPreCall", 181223);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i116 = defpackage.mdt.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VoiceCallFromDialpadToPreCall", 172346);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i117 = defpackage.mdt.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VoiceScreenShownToScreenFullyRendered", 172371);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i118 = defpackage.mdt.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("VoiceCallFromSearchToVoiceScreenShown", 176671);
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i20 = defpackage.mdt.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VoiceCallFromSearchToPreCall", 172357);
                        break;
                    case 16:
                        defpackage.aacy aacyVar210 = (defpackage.aacy) obj;
                        int i21 = defpackage.mdt.a;
                        if (aacyVar210 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar210.b = defpackage.aais.aI("VoiceCallFromSuggestedContactsToVoiceScreenShown", 176675);
                        break;
                    case 17:
                        defpackage.aacy aacyVar211 = (defpackage.aacy) obj;
                        int i22 = defpackage.mdt.a;
                        if (aacyVar211 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar211.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar211.a = defpackage.aais.aI("VoiceCallFromSuggestedContactsToPreCall", 172353);
                        break;
                    case 18:
                        defpackage.aacy aacyVar212 = (defpackage.aacy) obj;
                        int i23 = defpackage.mdt.a;
                        if (aacyVar212 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar212.b = defpackage.aais.aI("VoiceCallFromRecentsToVoiceScreenShown", 176679);
                        break;
                    case 19:
                        defpackage.aacy aacyVar213 = (defpackage.aacy) obj;
                        int i24 = defpackage.mdt.a;
                        if (aacyVar213 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar213.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar213.a = defpackage.aais.aI("VoiceCallFromRecentsToPreCall", 172349);
                        break;
                    default:
                        defpackage.aacy aacyVar214 = (defpackage.aacy) obj;
                        int i25 = defpackage.mdt.a;
                        if (aacyVar214 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar214.b = defpackage.aais.aI("LastPreCallActionFinishedToVoiceScreenShown", 173772);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar32 = new defpackage.aacy();
        aonjVar11.a(aacyVar32);
        adcmVar11.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar31, aacyVar32}));
        adcmVar11.f(set3);
        arrayList.add(adcmVar11.c());
        defpackage.adcm adcmVar12 = new defpackage.adcm(null);
        defpackage.aonj aonjVar12 = new defpackage.aonj() { // from class: mds
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i2) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i14 = defpackage.mdt.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToVoiceScreenShown", 176661);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i15 = defpackage.mdt.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar111.a = defpackage.aais.aI("VoiceCallFromVisualVoicemailToPreCall", 172365);
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i16 = defpackage.mdt.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar112.a = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToPreCall", 172369);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i17 = defpackage.mdt.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromExternalToVoiceScreenShown", 176663);
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i18 = defpackage.mdt.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromExternalToPreCall", 172367);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i19 = defpackage.mdt.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i110 = defpackage.mdt.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.DIRECT_MY_CALL_FRAGMENT_CREATED});
                        aacyVar116.a = defpackage.aais.aI("VoiceCallFromDialpadToDirectMyCallScreenShown", 226576);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i111 = defpackage.mdt.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromExternalTelecomToPreCall", 178396);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i112 = defpackage.mdt.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i113 = defpackage.mdt.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i114 = defpackage.mdt.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i115 = defpackage.mdt.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1111.a = defpackage.aais.aI("VoiceCallFromSearchActionToPreCall", 181223);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i116 = defpackage.mdt.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VoiceCallFromDialpadToPreCall", 172346);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i117 = defpackage.mdt.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VoiceScreenShownToScreenFullyRendered", 172371);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i118 = defpackage.mdt.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("VoiceCallFromSearchToVoiceScreenShown", 176671);
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i20 = defpackage.mdt.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VoiceCallFromSearchToPreCall", 172357);
                        break;
                    case 16:
                        defpackage.aacy aacyVar210 = (defpackage.aacy) obj;
                        int i21 = defpackage.mdt.a;
                        if (aacyVar210 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar210.b = defpackage.aais.aI("VoiceCallFromSuggestedContactsToVoiceScreenShown", 176675);
                        break;
                    case 17:
                        defpackage.aacy aacyVar211 = (defpackage.aacy) obj;
                        int i22 = defpackage.mdt.a;
                        if (aacyVar211 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar211.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar211.a = defpackage.aais.aI("VoiceCallFromSuggestedContactsToPreCall", 172353);
                        break;
                    case 18:
                        defpackage.aacy aacyVar212 = (defpackage.aacy) obj;
                        int i23 = defpackage.mdt.a;
                        if (aacyVar212 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar212.b = defpackage.aais.aI("VoiceCallFromRecentsToVoiceScreenShown", 176679);
                        break;
                    case 19:
                        defpackage.aacy aacyVar213 = (defpackage.aacy) obj;
                        int i24 = defpackage.mdt.a;
                        if (aacyVar213 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar213.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar213.a = defpackage.aais.aI("VoiceCallFromRecentsToPreCall", 172349);
                        break;
                    default:
                        defpackage.aacy aacyVar214 = (defpackage.aacy) obj;
                        int i25 = defpackage.mdt.a;
                        if (aacyVar214 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar214.b = defpackage.aais.aI("LastPreCallActionFinishedToVoiceScreenShown", 173772);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar33 = new defpackage.aacy(null, null, null);
        aonjVar12.a(aacyVar33);
        adcmVar12.h = aacyVar33;
        adcmVar12.i = defpackage.mce.CALL_BACK_FROM_MISSED_CALL_NOTIFICATION;
        java.util.Set setSingleton7 = java.util.Collections.singleton(mceVar2);
        defpackage.aooh.e(setSingleton7, "singleton(...)");
        adcmVar12.d(defpackage.ajsz.aI(set, setSingleton7));
        defpackage.aacy aacyVar34 = new defpackage.aacy();
        aacyVar34.b = mceVar3;
        defpackage.aonj aonjVar13 = new defpackage.aonj() { // from class: mds
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i5) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i14 = defpackage.mdt.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToVoiceScreenShown", 176661);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i15 = defpackage.mdt.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar111.a = defpackage.aais.aI("VoiceCallFromVisualVoicemailToPreCall", 172365);
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i16 = defpackage.mdt.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar112.a = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToPreCall", 172369);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i17 = defpackage.mdt.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromExternalToVoiceScreenShown", 176663);
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i18 = defpackage.mdt.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromExternalToPreCall", 172367);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i19 = defpackage.mdt.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i110 = defpackage.mdt.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.DIRECT_MY_CALL_FRAGMENT_CREATED});
                        aacyVar116.a = defpackage.aais.aI("VoiceCallFromDialpadToDirectMyCallScreenShown", 226576);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i111 = defpackage.mdt.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromExternalTelecomToPreCall", 178396);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i112 = defpackage.mdt.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i113 = defpackage.mdt.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i114 = defpackage.mdt.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i115 = defpackage.mdt.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1111.a = defpackage.aais.aI("VoiceCallFromSearchActionToPreCall", 181223);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i116 = defpackage.mdt.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VoiceCallFromDialpadToPreCall", 172346);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i117 = defpackage.mdt.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VoiceScreenShownToScreenFullyRendered", 172371);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i118 = defpackage.mdt.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("VoiceCallFromSearchToVoiceScreenShown", 176671);
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i20 = defpackage.mdt.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VoiceCallFromSearchToPreCall", 172357);
                        break;
                    case 16:
                        defpackage.aacy aacyVar210 = (defpackage.aacy) obj;
                        int i21 = defpackage.mdt.a;
                        if (aacyVar210 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar210.b = defpackage.aais.aI("VoiceCallFromSuggestedContactsToVoiceScreenShown", 176675);
                        break;
                    case 17:
                        defpackage.aacy aacyVar211 = (defpackage.aacy) obj;
                        int i22 = defpackage.mdt.a;
                        if (aacyVar211 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar211.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar211.a = defpackage.aais.aI("VoiceCallFromSuggestedContactsToPreCall", 172353);
                        break;
                    case 18:
                        defpackage.aacy aacyVar212 = (defpackage.aacy) obj;
                        int i23 = defpackage.mdt.a;
                        if (aacyVar212 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar212.b = defpackage.aais.aI("VoiceCallFromRecentsToVoiceScreenShown", 176679);
                        break;
                    case 19:
                        defpackage.aacy aacyVar213 = (defpackage.aacy) obj;
                        int i24 = defpackage.mdt.a;
                        if (aacyVar213 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar213.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar213.a = defpackage.aais.aI("VoiceCallFromRecentsToPreCall", 172349);
                        break;
                    default:
                        defpackage.aacy aacyVar214 = (defpackage.aacy) obj;
                        int i25 = defpackage.mdt.a;
                        if (aacyVar214 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar214.b = defpackage.aais.aI("LastPreCallActionFinishedToVoiceScreenShown", 173772);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar35 = new defpackage.aacy();
        aonjVar13.a(aacyVar35);
        adcmVar12.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar34, aacyVar35}));
        adcmVar12.f(set3);
        arrayList.add(adcmVar12.c());
        defpackage.adcm adcmVar13 = new defpackage.adcm(null);
        final int i14 = 3;
        defpackage.aonj aonjVar14 = new defpackage.aonj() { // from class: mds
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i14) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i15 = defpackage.mdt.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToVoiceScreenShown", 176661);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i16 = defpackage.mdt.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar111.a = defpackage.aais.aI("VoiceCallFromVisualVoicemailToPreCall", 172365);
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i17 = defpackage.mdt.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar112.a = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToPreCall", 172369);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i18 = defpackage.mdt.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromExternalToVoiceScreenShown", 176663);
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i19 = defpackage.mdt.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromExternalToPreCall", 172367);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i110 = defpackage.mdt.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i111 = defpackage.mdt.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.DIRECT_MY_CALL_FRAGMENT_CREATED});
                        aacyVar116.a = defpackage.aais.aI("VoiceCallFromDialpadToDirectMyCallScreenShown", 226576);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i112 = defpackage.mdt.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromExternalTelecomToPreCall", 178396);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i113 = defpackage.mdt.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i114 = defpackage.mdt.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i115 = defpackage.mdt.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i116 = defpackage.mdt.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1111.a = defpackage.aais.aI("VoiceCallFromSearchActionToPreCall", 181223);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i117 = defpackage.mdt.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VoiceCallFromDialpadToPreCall", 172346);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i118 = defpackage.mdt.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VoiceScreenShownToScreenFullyRendered", 172371);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i119 = defpackage.mdt.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("VoiceCallFromSearchToVoiceScreenShown", 176671);
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i20 = defpackage.mdt.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VoiceCallFromSearchToPreCall", 172357);
                        break;
                    case 16:
                        defpackage.aacy aacyVar210 = (defpackage.aacy) obj;
                        int i21 = defpackage.mdt.a;
                        if (aacyVar210 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar210.b = defpackage.aais.aI("VoiceCallFromSuggestedContactsToVoiceScreenShown", 176675);
                        break;
                    case 17:
                        defpackage.aacy aacyVar211 = (defpackage.aacy) obj;
                        int i22 = defpackage.mdt.a;
                        if (aacyVar211 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar211.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar211.a = defpackage.aais.aI("VoiceCallFromSuggestedContactsToPreCall", 172353);
                        break;
                    case 18:
                        defpackage.aacy aacyVar212 = (defpackage.aacy) obj;
                        int i23 = defpackage.mdt.a;
                        if (aacyVar212 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar212.b = defpackage.aais.aI("VoiceCallFromRecentsToVoiceScreenShown", 176679);
                        break;
                    case 19:
                        defpackage.aacy aacyVar213 = (defpackage.aacy) obj;
                        int i24 = defpackage.mdt.a;
                        if (aacyVar213 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar213.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar213.a = defpackage.aais.aI("VoiceCallFromRecentsToPreCall", 172349);
                        break;
                    default:
                        defpackage.aacy aacyVar214 = (defpackage.aacy) obj;
                        int i25 = defpackage.mdt.a;
                        if (aacyVar214 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar214.b = defpackage.aais.aI("LastPreCallActionFinishedToVoiceScreenShown", 173772);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar36 = new defpackage.aacy(null, null, null);
        aonjVar14.a(aacyVar36);
        adcmVar13.h = aacyVar36;
        adcmVar13.i = defpackage.mce.LAUNCH_PRE_CALL_ACTIVITY_ON_CREATE;
        defpackage.aacy aacyVar37 = new defpackage.aacy();
        aacyVar37.b = mceVar3;
        final int i15 = 4;
        defpackage.aonj aonjVar15 = new defpackage.aonj() { // from class: mds
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i15) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i16 = defpackage.mdt.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToVoiceScreenShown", 176661);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i17 = defpackage.mdt.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar111.a = defpackage.aais.aI("VoiceCallFromVisualVoicemailToPreCall", 172365);
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i18 = defpackage.mdt.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar112.a = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToPreCall", 172369);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i19 = defpackage.mdt.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromExternalToVoiceScreenShown", 176663);
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i110 = defpackage.mdt.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromExternalToPreCall", 172367);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i111 = defpackage.mdt.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i112 = defpackage.mdt.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.DIRECT_MY_CALL_FRAGMENT_CREATED});
                        aacyVar116.a = defpackage.aais.aI("VoiceCallFromDialpadToDirectMyCallScreenShown", 226576);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i113 = defpackage.mdt.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromExternalTelecomToPreCall", 178396);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i114 = defpackage.mdt.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i115 = defpackage.mdt.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i116 = defpackage.mdt.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i117 = defpackage.mdt.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1111.a = defpackage.aais.aI("VoiceCallFromSearchActionToPreCall", 181223);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i118 = defpackage.mdt.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VoiceCallFromDialpadToPreCall", 172346);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i119 = defpackage.mdt.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VoiceScreenShownToScreenFullyRendered", 172371);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mdt.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("VoiceCallFromSearchToVoiceScreenShown", 176671);
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i20 = defpackage.mdt.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VoiceCallFromSearchToPreCall", 172357);
                        break;
                    case 16:
                        defpackage.aacy aacyVar210 = (defpackage.aacy) obj;
                        int i21 = defpackage.mdt.a;
                        if (aacyVar210 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar210.b = defpackage.aais.aI("VoiceCallFromSuggestedContactsToVoiceScreenShown", 176675);
                        break;
                    case 17:
                        defpackage.aacy aacyVar211 = (defpackage.aacy) obj;
                        int i22 = defpackage.mdt.a;
                        if (aacyVar211 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar211.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar211.a = defpackage.aais.aI("VoiceCallFromSuggestedContactsToPreCall", 172353);
                        break;
                    case 18:
                        defpackage.aacy aacyVar212 = (defpackage.aacy) obj;
                        int i23 = defpackage.mdt.a;
                        if (aacyVar212 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar212.b = defpackage.aais.aI("VoiceCallFromRecentsToVoiceScreenShown", 176679);
                        break;
                    case 19:
                        defpackage.aacy aacyVar213 = (defpackage.aacy) obj;
                        int i24 = defpackage.mdt.a;
                        if (aacyVar213 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar213.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar213.a = defpackage.aais.aI("VoiceCallFromRecentsToPreCall", 172349);
                        break;
                    default:
                        defpackage.aacy aacyVar214 = (defpackage.aacy) obj;
                        int i25 = defpackage.mdt.a;
                        if (aacyVar214 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar214.b = defpackage.aais.aI("LastPreCallActionFinishedToVoiceScreenShown", 173772);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar38 = new defpackage.aacy();
        aonjVar15.a(aacyVar38);
        adcmVar13.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar37, aacyVar38}));
        final int i16 = 5;
        defpackage.aonj aonjVar16 = new defpackage.aonj() { // from class: mds
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i16) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i17 = defpackage.mdt.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToVoiceScreenShown", 176661);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i18 = defpackage.mdt.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar111.a = defpackage.aais.aI("VoiceCallFromVisualVoicemailToPreCall", 172365);
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i19 = defpackage.mdt.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar112.a = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToPreCall", 172369);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i110 = defpackage.mdt.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromExternalToVoiceScreenShown", 176663);
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i111 = defpackage.mdt.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromExternalToPreCall", 172367);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i112 = defpackage.mdt.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i113 = defpackage.mdt.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.DIRECT_MY_CALL_FRAGMENT_CREATED});
                        aacyVar116.a = defpackage.aais.aI("VoiceCallFromDialpadToDirectMyCallScreenShown", 226576);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i114 = defpackage.mdt.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromExternalTelecomToPreCall", 178396);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i115 = defpackage.mdt.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i116 = defpackage.mdt.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i117 = defpackage.mdt.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i118 = defpackage.mdt.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1111.a = defpackage.aais.aI("VoiceCallFromSearchActionToPreCall", 181223);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i119 = defpackage.mdt.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VoiceCallFromDialpadToPreCall", 172346);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mdt.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VoiceScreenShownToScreenFullyRendered", 172371);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mdt.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("VoiceCallFromSearchToVoiceScreenShown", 176671);
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i20 = defpackage.mdt.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VoiceCallFromSearchToPreCall", 172357);
                        break;
                    case 16:
                        defpackage.aacy aacyVar210 = (defpackage.aacy) obj;
                        int i21 = defpackage.mdt.a;
                        if (aacyVar210 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar210.b = defpackage.aais.aI("VoiceCallFromSuggestedContactsToVoiceScreenShown", 176675);
                        break;
                    case 17:
                        defpackage.aacy aacyVar211 = (defpackage.aacy) obj;
                        int i22 = defpackage.mdt.a;
                        if (aacyVar211 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar211.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar211.a = defpackage.aais.aI("VoiceCallFromSuggestedContactsToPreCall", 172353);
                        break;
                    case 18:
                        defpackage.aacy aacyVar212 = (defpackage.aacy) obj;
                        int i23 = defpackage.mdt.a;
                        if (aacyVar212 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar212.b = defpackage.aais.aI("VoiceCallFromRecentsToVoiceScreenShown", 176679);
                        break;
                    case 19:
                        defpackage.aacy aacyVar213 = (defpackage.aacy) obj;
                        int i24 = defpackage.mdt.a;
                        if (aacyVar213 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar213.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar213.a = defpackage.aais.aI("VoiceCallFromRecentsToPreCall", 172349);
                        break;
                    default:
                        defpackage.aacy aacyVar214 = (defpackage.aacy) obj;
                        int i25 = defpackage.mdt.a;
                        if (aacyVar214 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar214.b = defpackage.aais.aI("LastPreCallActionFinishedToVoiceScreenShown", 173772);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar39 = new defpackage.aacy();
        aonjVar16.a(aacyVar39);
        java.util.Set setSingleton8 = java.util.Collections.singleton(aacyVar39);
        defpackage.aooh.e(setSingleton8, "singleton(...)");
        adcmVar13.g(setSingleton8);
        adcmVar13.f(set3);
        adcmVar13.d(defpackage.ajsz.aI(set, defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.EXTERNAL_APP_ATTEMPTED_EMERGENCY_CALL, mceVar, mceVar2})));
        arrayList.add(adcmVar13.c());
        defpackage.aaif aaifVarAI2 = defpackage.aais.aI("EmergencyCallFromExternalAddedToEmergencyVoiceScreenShown", 179235);
        defpackage.adcm adcmVar14 = new defpackage.adcm(null);
        defpackage.mdr mdrVar3 = new defpackage.mdr(aaifVarAI2, 3);
        defpackage.aacy aacyVar40 = new defpackage.aacy(null, null, null);
        mdrVar3.a(aacyVar40);
        adcmVar14.h = aacyVar40;
        adcmVar14.i = defpackage.mce.ON_CALL_ADDED_FROM_EXTERNAL;
        adcmVar14.d(defpackage.ajsz.aI(set, defpackage.ajsz.cW(new defpackage.mce[]{mceVar, defpackage.mce.PROXIMITY_SENSOR_EVENT_NEAR, mceVar2, mceVar4, defpackage.mce.RTT_SCREEN_CHRONOMETER_SHOWN})));
        final int i17 = 7;
        defpackage.aonj aonjVar17 = new defpackage.aonj() { // from class: mds
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i17) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i18 = defpackage.mdt.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToVoiceScreenShown", 176661);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i19 = defpackage.mdt.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar111.a = defpackage.aais.aI("VoiceCallFromVisualVoicemailToPreCall", 172365);
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i110 = defpackage.mdt.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar112.a = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToPreCall", 172369);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i111 = defpackage.mdt.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromExternalToVoiceScreenShown", 176663);
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i112 = defpackage.mdt.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromExternalToPreCall", 172367);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i113 = defpackage.mdt.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i114 = defpackage.mdt.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.DIRECT_MY_CALL_FRAGMENT_CREATED});
                        aacyVar116.a = defpackage.aais.aI("VoiceCallFromDialpadToDirectMyCallScreenShown", 226576);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i115 = defpackage.mdt.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromExternalTelecomToPreCall", 178396);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i116 = defpackage.mdt.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i117 = defpackage.mdt.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i118 = defpackage.mdt.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i119 = defpackage.mdt.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1111.a = defpackage.aais.aI("VoiceCallFromSearchActionToPreCall", 181223);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mdt.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VoiceCallFromDialpadToPreCall", 172346);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mdt.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VoiceScreenShownToScreenFullyRendered", 172371);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mdt.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("VoiceCallFromSearchToVoiceScreenShown", 176671);
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i20 = defpackage.mdt.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VoiceCallFromSearchToPreCall", 172357);
                        break;
                    case 16:
                        defpackage.aacy aacyVar210 = (defpackage.aacy) obj;
                        int i21 = defpackage.mdt.a;
                        if (aacyVar210 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar210.b = defpackage.aais.aI("VoiceCallFromSuggestedContactsToVoiceScreenShown", 176675);
                        break;
                    case 17:
                        defpackage.aacy aacyVar211 = (defpackage.aacy) obj;
                        int i22 = defpackage.mdt.a;
                        if (aacyVar211 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar211.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar211.a = defpackage.aais.aI("VoiceCallFromSuggestedContactsToPreCall", 172353);
                        break;
                    case 18:
                        defpackage.aacy aacyVar212 = (defpackage.aacy) obj;
                        int i23 = defpackage.mdt.a;
                        if (aacyVar212 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar212.b = defpackage.aais.aI("VoiceCallFromRecentsToVoiceScreenShown", 176679);
                        break;
                    case 19:
                        defpackage.aacy aacyVar213 = (defpackage.aacy) obj;
                        int i24 = defpackage.mdt.a;
                        if (aacyVar213 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar213.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar213.a = defpackage.aais.aI("VoiceCallFromRecentsToPreCall", 172349);
                        break;
                    default:
                        defpackage.aacy aacyVar214 = (defpackage.aacy) obj;
                        int i25 = defpackage.mdt.a;
                        if (aacyVar214 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar214.b = defpackage.aais.aI("LastPreCallActionFinishedToVoiceScreenShown", 173772);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar41 = new defpackage.aacy();
        aonjVar17.a(aacyVar41);
        java.util.Set setSingleton9 = java.util.Collections.singleton(aacyVar41);
        defpackage.aooh.e(setSingleton9, "singleton(...)");
        adcmVar14.e(setSingleton9);
        final int i18 = 8;
        defpackage.aonj aonjVar18 = new defpackage.aonj() { // from class: mds
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i18) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i19 = defpackage.mdt.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToVoiceScreenShown", 176661);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i110 = defpackage.mdt.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar111.a = defpackage.aais.aI("VoiceCallFromVisualVoicemailToPreCall", 172365);
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i111 = defpackage.mdt.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar112.a = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToPreCall", 172369);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i112 = defpackage.mdt.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromExternalToVoiceScreenShown", 176663);
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i113 = defpackage.mdt.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromExternalToPreCall", 172367);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i114 = defpackage.mdt.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i115 = defpackage.mdt.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.DIRECT_MY_CALL_FRAGMENT_CREATED});
                        aacyVar116.a = defpackage.aais.aI("VoiceCallFromDialpadToDirectMyCallScreenShown", 226576);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i116 = defpackage.mdt.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromExternalTelecomToPreCall", 178396);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i117 = defpackage.mdt.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i118 = defpackage.mdt.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i119 = defpackage.mdt.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mdt.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1111.a = defpackage.aais.aI("VoiceCallFromSearchActionToPreCall", 181223);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mdt.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VoiceCallFromDialpadToPreCall", 172346);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mdt.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VoiceScreenShownToScreenFullyRendered", 172371);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mdt.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("VoiceCallFromSearchToVoiceScreenShown", 176671);
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i20 = defpackage.mdt.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VoiceCallFromSearchToPreCall", 172357);
                        break;
                    case 16:
                        defpackage.aacy aacyVar210 = (defpackage.aacy) obj;
                        int i21 = defpackage.mdt.a;
                        if (aacyVar210 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar210.b = defpackage.aais.aI("VoiceCallFromSuggestedContactsToVoiceScreenShown", 176675);
                        break;
                    case 17:
                        defpackage.aacy aacyVar211 = (defpackage.aacy) obj;
                        int i22 = defpackage.mdt.a;
                        if (aacyVar211 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar211.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar211.a = defpackage.aais.aI("VoiceCallFromSuggestedContactsToPreCall", 172353);
                        break;
                    case 18:
                        defpackage.aacy aacyVar212 = (defpackage.aacy) obj;
                        int i23 = defpackage.mdt.a;
                        if (aacyVar212 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar212.b = defpackage.aais.aI("VoiceCallFromRecentsToVoiceScreenShown", 176679);
                        break;
                    case 19:
                        defpackage.aacy aacyVar213 = (defpackage.aacy) obj;
                        int i24 = defpackage.mdt.a;
                        if (aacyVar213 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar213.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar213.a = defpackage.aais.aI("VoiceCallFromRecentsToPreCall", 172349);
                        break;
                    default:
                        defpackage.aacy aacyVar214 = (defpackage.aacy) obj;
                        int i25 = defpackage.mdt.a;
                        if (aacyVar214 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar214.b = defpackage.aais.aI("LastPreCallActionFinishedToVoiceScreenShown", 173772);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar42 = new defpackage.aacy();
        aonjVar18.a(aacyVar42);
        final int i19 = 9;
        defpackage.aonj aonjVar19 = new defpackage.aonj() { // from class: mds
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i19) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mdt.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToVoiceScreenShown", 176661);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mdt.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar111.a = defpackage.aais.aI("VoiceCallFromVisualVoicemailToPreCall", 172365);
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i112 = defpackage.mdt.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar112.a = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToPreCall", 172369);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i113 = defpackage.mdt.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromExternalToVoiceScreenShown", 176663);
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i114 = defpackage.mdt.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromExternalToPreCall", 172367);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i115 = defpackage.mdt.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i116 = defpackage.mdt.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.DIRECT_MY_CALL_FRAGMENT_CREATED});
                        aacyVar116.a = defpackage.aais.aI("VoiceCallFromDialpadToDirectMyCallScreenShown", 226576);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i117 = defpackage.mdt.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromExternalTelecomToPreCall", 178396);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i118 = defpackage.mdt.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i119 = defpackage.mdt.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mdt.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mdt.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1111.a = defpackage.aais.aI("VoiceCallFromSearchActionToPreCall", 181223);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mdt.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VoiceCallFromDialpadToPreCall", 172346);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mdt.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VoiceScreenShownToScreenFullyRendered", 172371);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mdt.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("VoiceCallFromSearchToVoiceScreenShown", 176671);
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i20 = defpackage.mdt.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VoiceCallFromSearchToPreCall", 172357);
                        break;
                    case 16:
                        defpackage.aacy aacyVar210 = (defpackage.aacy) obj;
                        int i21 = defpackage.mdt.a;
                        if (aacyVar210 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar210.b = defpackage.aais.aI("VoiceCallFromSuggestedContactsToVoiceScreenShown", 176675);
                        break;
                    case 17:
                        defpackage.aacy aacyVar211 = (defpackage.aacy) obj;
                        int i22 = defpackage.mdt.a;
                        if (aacyVar211 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar211.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar211.a = defpackage.aais.aI("VoiceCallFromSuggestedContactsToPreCall", 172353);
                        break;
                    case 18:
                        defpackage.aacy aacyVar212 = (defpackage.aacy) obj;
                        int i23 = defpackage.mdt.a;
                        if (aacyVar212 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar212.b = defpackage.aais.aI("VoiceCallFromRecentsToVoiceScreenShown", 176679);
                        break;
                    case 19:
                        defpackage.aacy aacyVar213 = (defpackage.aacy) obj;
                        int i24 = defpackage.mdt.a;
                        if (aacyVar213 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar213.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar213.a = defpackage.aais.aI("VoiceCallFromRecentsToPreCall", 172349);
                        break;
                    default:
                        defpackage.aacy aacyVar214 = (defpackage.aacy) obj;
                        int i25 = defpackage.mdt.a;
                        if (aacyVar214 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar214.b = defpackage.aais.aI("LastPreCallActionFinishedToVoiceScreenShown", 173772);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar43 = new defpackage.aacy();
        aonjVar19.a(aacyVar43);
        defpackage.mdr mdrVar4 = new defpackage.mdr(aaifVarAI2, 5);
        defpackage.aacy aacyVar44 = new defpackage.aacy();
        mdrVar4.a(aacyVar44);
        defpackage.mdr mdrVar5 = new defpackage.mdr(aaifVarAI2, 6);
        defpackage.aacy aacyVar45 = new defpackage.aacy();
        mdrVar5.a(aacyVar45);
        adcmVar14.g(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar42, aacyVar43, aacyVar44, aacyVar45}));
        adcmVar14.f(set3);
        arrayList.add(adcmVar14.c());
        defpackage.aaif aaifVarAI3 = defpackage.aais.aI("EmergencyCallFromSearchToEmergencyVoiceScreenShown", 179237);
        defpackage.adcm adcmVar15 = new defpackage.adcm(null);
        defpackage.mdr mdrVar6 = new defpackage.mdr(aaifVarAI3, i17);
        defpackage.aacy aacyVar46 = new defpackage.aacy(null, null, null);
        mdrVar6.a(aacyVar46);
        adcmVar15.h = aacyVar46;
        adcmVar15.i = defpackage.mce.USER_CLICKED_VOICE_CALL_FROM_SEARCH_ACTION;
        java.util.Set setSingleton10 = java.util.Collections.singleton(mceVar2);
        defpackage.aooh.e(setSingleton10, "singleton(...)");
        adcmVar15.d(defpackage.ajsz.aI(set, setSingleton10));
        final int i20 = 10;
        defpackage.aonj aonjVar20 = new defpackage.aonj() { // from class: mds
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i20) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mdt.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToVoiceScreenShown", 176661);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mdt.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar111.a = defpackage.aais.aI("VoiceCallFromVisualVoicemailToPreCall", 172365);
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i112 = defpackage.mdt.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar112.a = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToPreCall", 172369);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i113 = defpackage.mdt.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromExternalToVoiceScreenShown", 176663);
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i114 = defpackage.mdt.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromExternalToPreCall", 172367);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i115 = defpackage.mdt.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i116 = defpackage.mdt.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.DIRECT_MY_CALL_FRAGMENT_CREATED});
                        aacyVar116.a = defpackage.aais.aI("VoiceCallFromDialpadToDirectMyCallScreenShown", 226576);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i117 = defpackage.mdt.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromExternalTelecomToPreCall", 178396);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i118 = defpackage.mdt.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i119 = defpackage.mdt.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mdt.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mdt.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1111.a = defpackage.aais.aI("VoiceCallFromSearchActionToPreCall", 181223);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mdt.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VoiceCallFromDialpadToPreCall", 172346);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mdt.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VoiceScreenShownToScreenFullyRendered", 172371);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mdt.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("VoiceCallFromSearchToVoiceScreenShown", 176671);
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i21 = defpackage.mdt.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VoiceCallFromSearchToPreCall", 172357);
                        break;
                    case 16:
                        defpackage.aacy aacyVar210 = (defpackage.aacy) obj;
                        int i22 = defpackage.mdt.a;
                        if (aacyVar210 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar210.b = defpackage.aais.aI("VoiceCallFromSuggestedContactsToVoiceScreenShown", 176675);
                        break;
                    case 17:
                        defpackage.aacy aacyVar211 = (defpackage.aacy) obj;
                        int i23 = defpackage.mdt.a;
                        if (aacyVar211 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar211.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar211.a = defpackage.aais.aI("VoiceCallFromSuggestedContactsToPreCall", 172353);
                        break;
                    case 18:
                        defpackage.aacy aacyVar212 = (defpackage.aacy) obj;
                        int i24 = defpackage.mdt.a;
                        if (aacyVar212 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar212.b = defpackage.aais.aI("VoiceCallFromRecentsToVoiceScreenShown", 176679);
                        break;
                    case 19:
                        defpackage.aacy aacyVar213 = (defpackage.aacy) obj;
                        int i25 = defpackage.mdt.a;
                        if (aacyVar213 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar213.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar213.a = defpackage.aais.aI("VoiceCallFromRecentsToPreCall", 172349);
                        break;
                    default:
                        defpackage.aacy aacyVar214 = (defpackage.aacy) obj;
                        int i26 = defpackage.mdt.a;
                        if (aacyVar214 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar214.b = defpackage.aais.aI("LastPreCallActionFinishedToVoiceScreenShown", 173772);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar47 = new defpackage.aacy();
        aonjVar20.a(aacyVar47);
        defpackage.mdr mdrVar7 = new defpackage.mdr(aaifVarAI3, i18);
        defpackage.aacy aacyVar48 = new defpackage.aacy();
        mdrVar7.a(aacyVar48);
        adcmVar15.g(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar47, aacyVar48}));
        final int i21 = 11;
        defpackage.aonj aonjVar21 = new defpackage.aonj() { // from class: mds
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i21) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mdt.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToVoiceScreenShown", 176661);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mdt.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar111.a = defpackage.aais.aI("VoiceCallFromVisualVoicemailToPreCall", 172365);
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i112 = defpackage.mdt.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar112.a = defpackage.aais.aI("VoiceCallFromMissedCallNotificationToPreCall", 172369);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i113 = defpackage.mdt.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromExternalToVoiceScreenShown", 176663);
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i114 = defpackage.mdt.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromExternalToPreCall", 172367);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i115 = defpackage.mdt.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i116 = defpackage.mdt.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.DIRECT_MY_CALL_FRAGMENT_CREATED});
                        aacyVar116.a = defpackage.aais.aI("VoiceCallFromDialpadToDirectMyCallScreenShown", 226576);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i117 = defpackage.mdt.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromExternalTelecomToPreCall", 178396);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i118 = defpackage.mdt.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i119 = defpackage.mdt.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mdt.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.BOUNCE_VOICE_FRAGMENT_CREATED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mdt.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1111.a = defpackage.aais.aI("VoiceCallFromSearchActionToPreCall", 181223);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mdt.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VoiceCallFromDialpadToPreCall", 172346);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mdt.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VoiceScreenShownToScreenFullyRendered", 172371);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mdt.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("VoiceCallFromSearchToVoiceScreenShown", 176671);
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i22 = defpackage.mdt.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VoiceCallFromSearchToPreCall", 172357);
                        break;
                    case 16:
                        defpackage.aacy aacyVar210 = (defpackage.aacy) obj;
                        int i23 = defpackage.mdt.a;
                        if (aacyVar210 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar210.b = defpackage.aais.aI("VoiceCallFromSuggestedContactsToVoiceScreenShown", 176675);
                        break;
                    case 17:
                        defpackage.aacy aacyVar211 = (defpackage.aacy) obj;
                        int i24 = defpackage.mdt.a;
                        if (aacyVar211 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar211.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar211.a = defpackage.aais.aI("VoiceCallFromSuggestedContactsToPreCall", 172353);
                        break;
                    case 18:
                        defpackage.aacy aacyVar212 = (defpackage.aacy) obj;
                        int i25 = defpackage.mdt.a;
                        if (aacyVar212 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar212.b = defpackage.aais.aI("VoiceCallFromRecentsToVoiceScreenShown", 176679);
                        break;
                    case 19:
                        defpackage.aacy aacyVar213 = (defpackage.aacy) obj;
                        int i26 = defpackage.mdt.a;
                        if (aacyVar213 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar213.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar213.a = defpackage.aais.aI("VoiceCallFromRecentsToPreCall", 172349);
                        break;
                    default:
                        defpackage.aacy aacyVar214 = (defpackage.aacy) obj;
                        int i27 = defpackage.mdt.a;
                        if (aacyVar214 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar214.b = defpackage.aais.aI("LastPreCallActionFinishedToVoiceScreenShown", 173772);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar49 = new defpackage.aacy();
        aonjVar21.a(aacyVar49);
        java.util.Set setSingleton11 = java.util.Collections.singleton(aacyVar49);
        defpackage.aooh.e(setSingleton11, "singleton(...)");
        adcmVar15.e(setSingleton11);
        adcmVar15.f(set3);
        arrayList.add(adcmVar15.c());
        return arrayList;
    }
}
