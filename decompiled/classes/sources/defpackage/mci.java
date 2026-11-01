package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mci implements defpackage.zaq {
    public static final /* synthetic */ int a = 0;
    private static final java.util.Set b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_REMOVED, defpackage.mce.HAS_EXISTING_EMERGENCY_CALL, defpackage.mce.EXPECT_NO_PLACE_CALL_RESPONSE_FROM_TELECOM, defpackage.mce.OUTGOING_CALL_PLACED_WHILE_ALREADY_IN_CALL, defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_PAUSED, defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_DESTROYED, defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_STOPPED, defpackage.mce.ANDROID_AUTO_ACCOUNT_SELECTOR_SCREEN_REQUESTED, defpackage.mce.ANDROID_AUTO_IN_CALL_SCREENS_REMOVED});
    private static final java.util.Set c = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_REMOVED, defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_PAUSED, defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_DESTROYED, defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_STOPPED, defpackage.mce.ANDROID_AUTO_IN_CALL_SCREENS_REMOVED, defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN, defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN, defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN, defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN});

    @Override // defpackage.zaq
    public final java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.adcm adcmVar = new defpackage.adcm(null);
        final int i = 1;
        defpackage.aonj aonjVar = new defpackage.aonj() { // from class: mcf
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i) {
                    case 0:
                        defpackage.aacy aacyVar = (defpackage.aacy) obj;
                        int i2 = defpackage.mci.a;
                        if (aacyVar == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar.a = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesNumberSelectionToCarPreCallScreenShown", 257286);
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar2 = (defpackage.aacy) obj;
                        int i3 = defpackage.mci.a;
                        if (aacyVar2 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar2.b = defpackage.aais.aI("AndroidAutoAppLaunchedToCarAppVisible", 281442);
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                        int i4 = defpackage.mci.a;
                        if (aacyVar3 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar3.b = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_RESUMED;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                        int i5 = defpackage.mci.a;
                        if (aacyVar4 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar4.b = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarInCallScreenShown", 234710);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                        int i6 = defpackage.mci.a;
                        if (aacyVar5 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar5.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar5.a = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarPreCallScreenShown", 257289);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                        int i7 = defpackage.mci.a;
                        if (aacyVar6 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar6.b = defpackage.aais.aI("AndroidAutoContactsToNumberScreenShown", 235160);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        int i8 = defpackage.mci.a;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar7.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarInCallScreenShown", 235164);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        int i9 = defpackage.mci.a;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar8.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar8.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarPreCallScreenShown", 257293);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        int i10 = defpackage.mci.a;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar9.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarInCallScreenShown", 235162);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        int i11 = defpackage.mci.a;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar10.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN});
                        aacyVar10.a = defpackage.aais.aI("AndroidAutoCreateScreenToContactsDataShown", 283373);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        int i12 = defpackage.mci.a;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar11.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar11.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarPreCallScreenShown", 257291);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        int i13 = defpackage.mci.a;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("AndroidAutoFavoritesTabSelectedToTabShown", 236856);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        int i14 = defpackage.mci.a;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar13.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        int i15 = defpackage.mci.a;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar14.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        aacyVar14.a = defpackage.aais.aI("AndroidAutoRecentsTabSelectedToTabShown", 236858);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        int i16 = defpackage.mci.a;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar15.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        aacyVar15.a = defpackage.aais.aI("AndroidAutoContactsTabSelectedToTabShown", 236860);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        int i17 = defpackage.mci.a;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar16.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        aacyVar16.a = defpackage.aais.aI("AndroidAutoDialpadTabSelectedToTabShown", 236862);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        int i18 = defpackage.mci.a;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("AndroidAutoMuteButtonClickedToMuteButtonUpdated", 317820);
                        return defpackage.aojh.a;
                    case 17:
                        int i19 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 18:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        int i20 = defpackage.mci.a;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar18.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN});
                        aacyVar18.a = defpackage.aais.aI("AndroidAutoCreateScreenToDialpadDataShown", 283378);
                        return defpackage.aojh.a;
                    case 19:
                        int i21 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    default:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i22 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.ANDROID_AUTO_IN_CALL_MUTE_BUTTON_LISTENER_NOT_FOUND;
                        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar = new defpackage.aacy(null, null, null);
        aonjVar.a(aacyVar);
        adcmVar.h = aacyVar;
        adcmVar.i = defpackage.mce.ANDROID_AUTO_CAR_SERVICE_ON_CREATE_SESSION;
        final int i2 = 6;
        final int i3 = 2;
        defpackage.aonj aonjVar2 = new defpackage.aonj() { // from class: mcf
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i3) {
                    case 0:
                        defpackage.aacy aacyVar2 = (defpackage.aacy) obj;
                        int i4 = defpackage.mci.a;
                        if (aacyVar2 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar2.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar2.a = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesNumberSelectionToCarPreCallScreenShown", 257286);
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                        int i5 = defpackage.mci.a;
                        if (aacyVar3 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar3.b = defpackage.aais.aI("AndroidAutoAppLaunchedToCarAppVisible", 281442);
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                        int i6 = defpackage.mci.a;
                        if (aacyVar4 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar4.b = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_RESUMED;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                        int i7 = defpackage.mci.a;
                        if (aacyVar5 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar5.b = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarInCallScreenShown", 234710);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                        int i8 = defpackage.mci.a;
                        if (aacyVar6 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar6.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar6.a = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarPreCallScreenShown", 257289);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        int i9 = defpackage.mci.a;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar7.b = defpackage.aais.aI("AndroidAutoContactsToNumberScreenShown", 235160);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        int i10 = defpackage.mci.a;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar8.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarInCallScreenShown", 235164);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        int i11 = defpackage.mci.a;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar9.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar9.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarPreCallScreenShown", 257293);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        int i12 = defpackage.mci.a;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar10.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarInCallScreenShown", 235162);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        int i13 = defpackage.mci.a;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar11.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN});
                        aacyVar11.a = defpackage.aais.aI("AndroidAutoCreateScreenToContactsDataShown", 283373);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        int i14 = defpackage.mci.a;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar12.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar12.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarPreCallScreenShown", 257291);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        int i15 = defpackage.mci.a;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar13.b = defpackage.aais.aI("AndroidAutoFavoritesTabSelectedToTabShown", 236856);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        int i16 = defpackage.mci.a;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar14.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        int i17 = defpackage.mci.a;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar15.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        aacyVar15.a = defpackage.aais.aI("AndroidAutoRecentsTabSelectedToTabShown", 236858);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        int i18 = defpackage.mci.a;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar16.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        aacyVar16.a = defpackage.aais.aI("AndroidAutoContactsTabSelectedToTabShown", 236860);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        int i19 = defpackage.mci.a;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar17.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        aacyVar17.a = defpackage.aais.aI("AndroidAutoDialpadTabSelectedToTabShown", 236862);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("AndroidAutoMuteButtonClickedToMuteButtonUpdated", 317820);
                        return defpackage.aojh.a;
                    case 17:
                        int i111 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 18:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        int i20 = defpackage.mci.a;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar19.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN});
                        aacyVar19.a = defpackage.aais.aI("AndroidAutoCreateScreenToDialpadDataShown", 283378);
                        return defpackage.aojh.a;
                    case 19:
                        int i21 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    default:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i22 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.ANDROID_AUTO_IN_CALL_MUTE_BUTTON_LISTENER_NOT_FOUND;
                        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar2 = new defpackage.aacy();
        aonjVar2.a(aacyVar2);
        final int i4 = 0;
        defpackage.aacy aacyVar3 = new defpackage.aacy();
        defpackage.mce mceVar = defpackage.mce.ANDROID_AUTO_IN_CALL_SCREEN_SHOWN;
        aacyVar3.b = mceVar;
        defpackage.aonj aonjVar3 = new defpackage.aonj() { // from class: mcg
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i4) {
                    case 0:
                        defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                        int i5 = defpackage.mci.a;
                        if (aacyVar4 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar4.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                        int i6 = defpackage.mci.a;
                        if (aacyVar5 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar5.b = defpackage.aais.aI("AndroidAutoUnholdButtonClickedToUnholdButtonNotShown", 270245);
                        return defpackage.aojh.a;
                    case 2:
                        int i7 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 3:
                        int i8 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        int i9 = defpackage.mci.a;
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i10 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.UNHOLD_FAILED;
                        ajniVar.c = defpackage.zar.TELECOM_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                        int i11 = defpackage.mci.a;
                        if (aacyVar6 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar6.b = defpackage.aais.aI("AndroidAutoEndCallButtonClickedToCallDisconnected", 237662);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        int i12 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        int i13 = defpackage.mci.a;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar7.b = defpackage.mce.ANDROID_AUTO_IN_CALL_SCREEN_SHOWN;
                        aacyVar7.a = defpackage.aais.aI("AndroidAutoCreateScreenToInCallScreenShown", 299724);
                        return defpackage.aojh.a;
                    case 9:
                        int i14 = defpackage.mci.a;
                        return defpackage.mni.aW((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        int i15 = defpackage.mci.a;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar8.b = defpackage.aais.aI("AndroidAutoAudioRouteButtonClickedToAudioRouteSelectorScreenShown", 237685);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        int i16 = defpackage.mci.a;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar9.b = defpackage.aais.aI("AndroidAutoDialpadButtonClickedToInCallDialpadScreenShown", 239067);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        int i17 = defpackage.mci.a;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar10.b = defpackage.aais.aI("VoiceCallFromAndroidAutoCallIntentReceivedToCarInCallScreenShown", 237054);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        int i18 = defpackage.mci.a;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar11.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        int i19 = defpackage.mci.a;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarInCallScreenShown", 237775);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        int i20 = defpackage.mci.a;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar13.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar13.a = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarPreCallScreenShown", 257296);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        int i21 = defpackage.mci.a;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("LastPreCallActionFromAndroidAutoFinishedToInCallScreenShown", 257298);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        int i22 = defpackage.mci.a;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar15.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        int i23 = defpackage.mci.a;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesToCarInCallScreenShown", 232893);
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        int i24 = defpackage.mci.a;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar17.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        int i25 = defpackage.mci.a;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("AndroidAutoCreateScreenToFavoritesDataShown", 283037);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar4 = new defpackage.aacy();
        aonjVar3.a(aacyVar4);
        final int i5 = 13;
        defpackage.aonj aonjVar4 = new defpackage.aonj() { // from class: mcg
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i5) {
                    case 0:
                        defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                        int i6 = defpackage.mci.a;
                        if (aacyVar5 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar5.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                        int i7 = defpackage.mci.a;
                        if (aacyVar6 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar6.b = defpackage.aais.aI("AndroidAutoUnholdButtonClickedToUnholdButtonNotShown", 270245);
                        return defpackage.aojh.a;
                    case 2:
                        int i8 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 3:
                        int i9 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        int i10 = defpackage.mci.a;
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i11 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.UNHOLD_FAILED;
                        ajniVar.c = defpackage.zar.TELECOM_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        int i12 = defpackage.mci.a;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar7.b = defpackage.aais.aI("AndroidAutoEndCallButtonClickedToCallDisconnected", 237662);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        int i13 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        int i14 = defpackage.mci.a;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar8.b = defpackage.mce.ANDROID_AUTO_IN_CALL_SCREEN_SHOWN;
                        aacyVar8.a = defpackage.aais.aI("AndroidAutoCreateScreenToInCallScreenShown", 299724);
                        return defpackage.aojh.a;
                    case 9:
                        int i15 = defpackage.mci.a;
                        return defpackage.mni.aW((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        int i16 = defpackage.mci.a;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar9.b = defpackage.aais.aI("AndroidAutoAudioRouteButtonClickedToAudioRouteSelectorScreenShown", 237685);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        int i17 = defpackage.mci.a;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar10.b = defpackage.aais.aI("AndroidAutoDialpadButtonClickedToInCallDialpadScreenShown", 239067);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        int i18 = defpackage.mci.a;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar11.b = defpackage.aais.aI("VoiceCallFromAndroidAutoCallIntentReceivedToCarInCallScreenShown", 237054);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        int i19 = defpackage.mci.a;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar12.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar13.b = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarInCallScreenShown", 237775);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        int i20 = defpackage.mci.a;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar14.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar14.a = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarPreCallScreenShown", 257296);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        int i21 = defpackage.mci.a;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("LastPreCallActionFromAndroidAutoFinishedToInCallScreenShown", 257298);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        int i22 = defpackage.mci.a;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar16.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        int i23 = defpackage.mci.a;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesToCarInCallScreenShown", 232893);
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        int i24 = defpackage.mci.a;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar18.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        int i25 = defpackage.mci.a;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("AndroidAutoCreateScreenToFavoritesDataShown", 283037);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar5 = new defpackage.aacy();
        aonjVar4.a(aacyVar5);
        final int i6 = 3;
        final int i7 = 17;
        defpackage.aonj aonjVar5 = new defpackage.aonj() { // from class: mcg
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i7) {
                    case 0:
                        defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                        int i8 = defpackage.mci.a;
                        if (aacyVar6 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar6.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        int i9 = defpackage.mci.a;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar7.b = defpackage.aais.aI("AndroidAutoUnholdButtonClickedToUnholdButtonNotShown", 270245);
                        return defpackage.aojh.a;
                    case 2:
                        int i10 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 3:
                        int i11 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        int i12 = defpackage.mci.a;
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i13 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.UNHOLD_FAILED;
                        ajniVar.c = defpackage.zar.TELECOM_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        int i14 = defpackage.mci.a;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar8.b = defpackage.aais.aI("AndroidAutoEndCallButtonClickedToCallDisconnected", 237662);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        int i15 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        int i16 = defpackage.mci.a;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar9.b = defpackage.mce.ANDROID_AUTO_IN_CALL_SCREEN_SHOWN;
                        aacyVar9.a = defpackage.aais.aI("AndroidAutoCreateScreenToInCallScreenShown", 299724);
                        return defpackage.aojh.a;
                    case 9:
                        int i17 = defpackage.mci.a;
                        return defpackage.mni.aW((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        int i18 = defpackage.mci.a;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar10.b = defpackage.aais.aI("AndroidAutoAudioRouteButtonClickedToAudioRouteSelectorScreenShown", 237685);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        int i19 = defpackage.mci.a;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar11.b = defpackage.aais.aI("AndroidAutoDialpadButtonClickedToInCallDialpadScreenShown", 239067);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("VoiceCallFromAndroidAutoCallIntentReceivedToCarInCallScreenShown", 237054);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar13.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        int i112 = defpackage.mci.a;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarInCallScreenShown", 237775);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        int i20 = defpackage.mci.a;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar15.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar15.a = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarPreCallScreenShown", 257296);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        int i21 = defpackage.mci.a;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("LastPreCallActionFromAndroidAutoFinishedToInCallScreenShown", 257298);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        int i22 = defpackage.mci.a;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar17.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        int i23 = defpackage.mci.a;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesToCarInCallScreenShown", 232893);
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        int i24 = defpackage.mci.a;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar19.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i25 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("AndroidAutoCreateScreenToFavoritesDataShown", 283037);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar6 = new defpackage.aacy();
        aonjVar5.a(aacyVar6);
        final int i8 = 4;
        final int i9 = 19;
        defpackage.aonj aonjVar6 = new defpackage.aonj() { // from class: mcg
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i9) {
                    case 0:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        int i10 = defpackage.mci.a;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar7.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        int i11 = defpackage.mci.a;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar8.b = defpackage.aais.aI("AndroidAutoUnholdButtonClickedToUnholdButtonNotShown", 270245);
                        return defpackage.aojh.a;
                    case 2:
                        int i12 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 3:
                        int i13 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        int i14 = defpackage.mci.a;
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i15 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.UNHOLD_FAILED;
                        ajniVar.c = defpackage.zar.TELECOM_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        int i16 = defpackage.mci.a;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar9.b = defpackage.aais.aI("AndroidAutoEndCallButtonClickedToCallDisconnected", 237662);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        int i17 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        int i18 = defpackage.mci.a;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar10.b = defpackage.mce.ANDROID_AUTO_IN_CALL_SCREEN_SHOWN;
                        aacyVar10.a = defpackage.aais.aI("AndroidAutoCreateScreenToInCallScreenShown", 299724);
                        return defpackage.aojh.a;
                    case 9:
                        int i19 = defpackage.mci.a;
                        return defpackage.mni.aW((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar11.b = defpackage.aais.aI("AndroidAutoAudioRouteButtonClickedToAudioRouteSelectorScreenShown", 237685);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("AndroidAutoDialpadButtonClickedToInCallDialpadScreenShown", 239067);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        int i112 = defpackage.mci.a;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar13.b = defpackage.aais.aI("VoiceCallFromAndroidAutoCallIntentReceivedToCarInCallScreenShown", 237054);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar14.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        int i114 = defpackage.mci.a;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarInCallScreenShown", 237775);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        int i20 = defpackage.mci.a;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar16.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar16.a = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarPreCallScreenShown", 257296);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        int i21 = defpackage.mci.a;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("LastPreCallActionFromAndroidAutoFinishedToInCallScreenShown", 257298);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        int i22 = defpackage.mci.a;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar18.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        int i23 = defpackage.mci.a;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesToCarInCallScreenShown", 232893);
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i24 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i25 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoCreateScreenToFavoritesDataShown", 283037);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar7 = new defpackage.aacy();
        aonjVar6.a(aacyVar7);
        final int i10 = 5;
        adcmVar.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar2, aacyVar3, aacyVar4, aacyVar5, aacyVar6, aacyVar7}));
        defpackage.mce mceVar2 = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_DESTROYED;
        defpackage.mce mceVar3 = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_STOPPED;
        defpackage.mce mceVar4 = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_PAUSED;
        adcmVar.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar2, mceVar3, mceVar4}));
        arrayList.add(adcmVar.c());
        defpackage.adcm adcmVar2 = new defpackage.adcm(null);
        final int i11 = 20;
        defpackage.aonj aonjVar7 = new defpackage.aonj() { // from class: mcg
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i11) {
                    case 0:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        int i12 = defpackage.mci.a;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar8.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        int i13 = defpackage.mci.a;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar9.b = defpackage.aais.aI("AndroidAutoUnholdButtonClickedToUnholdButtonNotShown", 270245);
                        return defpackage.aojh.a;
                    case 2:
                        int i14 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 3:
                        int i15 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        int i16 = defpackage.mci.a;
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i17 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.UNHOLD_FAILED;
                        ajniVar.c = defpackage.zar.TELECOM_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        int i18 = defpackage.mci.a;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar10.b = defpackage.aais.aI("AndroidAutoEndCallButtonClickedToCallDisconnected", 237662);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        int i19 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar11.b = defpackage.mce.ANDROID_AUTO_IN_CALL_SCREEN_SHOWN;
                        aacyVar11.a = defpackage.aais.aI("AndroidAutoCreateScreenToInCallScreenShown", 299724);
                        return defpackage.aojh.a;
                    case 9:
                        int i111 = defpackage.mci.a;
                        return defpackage.mni.aW((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        int i112 = defpackage.mci.a;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("AndroidAutoAudioRouteButtonClickedToAudioRouteSelectorScreenShown", 237685);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar13.b = defpackage.aais.aI("AndroidAutoDialpadButtonClickedToInCallDialpadScreenShown", 239067);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        int i114 = defpackage.mci.a;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("VoiceCallFromAndroidAutoCallIntentReceivedToCarInCallScreenShown", 237054);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        int i115 = defpackage.mci.a;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar15.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarInCallScreenShown", 237775);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        int i20 = defpackage.mci.a;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar17.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar17.a = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarPreCallScreenShown", 257296);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        int i21 = defpackage.mci.a;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("LastPreCallActionFromAndroidAutoFinishedToInCallScreenShown", 257298);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        int i22 = defpackage.mci.a;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar19.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i23 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesToCarInCallScreenShown", 232893);
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i24 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i25 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("AndroidAutoCreateScreenToFavoritesDataShown", 283037);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar8 = new defpackage.aacy(null, null, null);
        aonjVar7.a(aacyVar8);
        adcmVar2.h = aacyVar8;
        adcmVar2.i = defpackage.mce.ANDROID_AUTO_CAR_SESSION_ON_CREATE_SCREEN;
        defpackage.mch mchVar = new defpackage.mch(1);
        defpackage.aacy aacyVar9 = new defpackage.aacy();
        mchVar.a(aacyVar9);
        defpackage.mch mchVar2 = new defpackage.mch(0);
        defpackage.aacy aacyVar10 = new defpackage.aacy();
        mchVar2.a(aacyVar10);
        final int i12 = 9;
        defpackage.aonj aonjVar8 = new defpackage.aonj() { // from class: mcf
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i12) {
                    case 0:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        int i13 = defpackage.mci.a;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar11.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar11.a = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesNumberSelectionToCarPreCallScreenShown", 257286);
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        int i14 = defpackage.mci.a;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("AndroidAutoAppLaunchedToCarAppVisible", 281442);
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        int i15 = defpackage.mci.a;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar13.b = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_RESUMED;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        int i16 = defpackage.mci.a;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarInCallScreenShown", 234710);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        int i17 = defpackage.mci.a;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar15.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar15.a = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarPreCallScreenShown", 257289);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        int i18 = defpackage.mci.a;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("AndroidAutoContactsToNumberScreenShown", 235160);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        int i19 = defpackage.mci.a;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarInCallScreenShown", 235164);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar18.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar18.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarPreCallScreenShown", 257293);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarInCallScreenShown", 235162);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i112 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN});
                        aacyVar110.a = defpackage.aais.aI("AndroidAutoCreateScreenToContactsDataShown", 283373);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar111.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarPreCallScreenShown", 257291);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i114 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("AndroidAutoFavoritesTabSelectedToTabShown", 236856);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i115 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar113.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("AndroidAutoRecentsTabSelectedToTabShown", 236858);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i117 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar115.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        aacyVar115.a = defpackage.aais.aI("AndroidAutoContactsTabSelectedToTabShown", 236860);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar116.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        aacyVar116.a = defpackage.aais.aI("AndroidAutoDialpadTabSelectedToTabShown", 236862);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i119 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar117.b = defpackage.aais.aI("AndroidAutoMuteButtonClickedToMuteButtonUpdated", 317820);
                        return defpackage.aojh.a;
                    case 17:
                        int i1110 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 18:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i20 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar118.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN});
                        aacyVar118.a = defpackage.aais.aI("AndroidAutoCreateScreenToDialpadDataShown", 283378);
                        return defpackage.aojh.a;
                    case 19:
                        int i21 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    default:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i22 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.ANDROID_AUTO_IN_CALL_MUTE_BUTTON_LISTENER_NOT_FOUND;
                        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar11 = new defpackage.aacy();
        aonjVar8.a(aacyVar11);
        final int i13 = 18;
        defpackage.aonj aonjVar9 = new defpackage.aonj() { // from class: mcf
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i13) {
                    case 0:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        int i14 = defpackage.mci.a;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar12.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar12.a = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesNumberSelectionToCarPreCallScreenShown", 257286);
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        int i15 = defpackage.mci.a;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar13.b = defpackage.aais.aI("AndroidAutoAppLaunchedToCarAppVisible", 281442);
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        int i16 = defpackage.mci.a;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar14.b = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_RESUMED;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        int i17 = defpackage.mci.a;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarInCallScreenShown", 234710);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        int i18 = defpackage.mci.a;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar16.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar16.a = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarPreCallScreenShown", 257289);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        int i19 = defpackage.mci.a;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("AndroidAutoContactsToNumberScreenShown", 235160);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarInCallScreenShown", 235164);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar19.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar19.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarPreCallScreenShown", 257293);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i112 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarInCallScreenShown", 235162);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN});
                        aacyVar111.a = defpackage.aais.aI("AndroidAutoCreateScreenToContactsDataShown", 283373);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i114 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar112.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarPreCallScreenShown", 257291);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i115 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("AndroidAutoFavoritesTabSelectedToTabShown", 236856);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i117 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar115.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        aacyVar115.a = defpackage.aais.aI("AndroidAutoRecentsTabSelectedToTabShown", 236858);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar116.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        aacyVar116.a = defpackage.aais.aI("AndroidAutoContactsTabSelectedToTabShown", 236860);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i119 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("AndroidAutoDialpadTabSelectedToTabShown", 236862);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("AndroidAutoMuteButtonClickedToMuteButtonUpdated", 317820);
                        return defpackage.aojh.a;
                    case 17:
                        int i1111 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 18:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i20 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN});
                        aacyVar119.a = defpackage.aais.aI("AndroidAutoCreateScreenToDialpadDataShown", 283378);
                        return defpackage.aojh.a;
                    case 19:
                        int i21 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    default:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i22 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.ANDROID_AUTO_IN_CALL_MUTE_BUTTON_LISTENER_NOT_FOUND;
                        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar12 = new defpackage.aacy();
        aonjVar9.a(aacyVar12);
        adcmVar2.g(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar9, aacyVar10, aacyVar11, aacyVar12}));
        final int i14 = 8;
        defpackage.aonj aonjVar10 = new defpackage.aonj() { // from class: mcg
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i14) {
                    case 0:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        int i15 = defpackage.mci.a;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar13.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        int i16 = defpackage.mci.a;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("AndroidAutoUnholdButtonClickedToUnholdButtonNotShown", 270245);
                        return defpackage.aojh.a;
                    case 2:
                        int i17 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 3:
                        int i18 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        int i19 = defpackage.mci.a;
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i110 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.UNHOLD_FAILED;
                        ajniVar.c = defpackage.zar.TELECOM_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("AndroidAutoEndCallButtonClickedToCallDisconnected", 237662);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        int i112 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar16.b = defpackage.mce.ANDROID_AUTO_IN_CALL_SCREEN_SHOWN;
                        aacyVar16.a = defpackage.aais.aI("AndroidAutoCreateScreenToInCallScreenShown", 299724);
                        return defpackage.aojh.a;
                    case 9:
                        int i114 = defpackage.mci.a;
                        return defpackage.mni.aW((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        int i115 = defpackage.mci.a;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("AndroidAutoAudioRouteButtonClickedToAudioRouteSelectorScreenShown", 237685);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("AndroidAutoDialpadButtonClickedToInCallDialpadScreenShown", 239067);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        int i117 = defpackage.mci.a;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("VoiceCallFromAndroidAutoCallIntentReceivedToCarInCallScreenShown", 237054);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i119 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarInCallScreenShown", 237775);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i20 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar112.a = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarPreCallScreenShown", 257296);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i21 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("LastPreCallActionFromAndroidAutoFinishedToInCallScreenShown", 257298);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i22 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i23 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesToCarInCallScreenShown", 232893);
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i24 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar116.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i25 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar117.b = defpackage.aais.aI("AndroidAutoCreateScreenToFavoritesDataShown", 283037);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar13 = new defpackage.aacy();
        aonjVar10.a(aacyVar13);
        java.util.Set setSingleton = java.util.Collections.singleton(aacyVar13);
        defpackage.aooh.e(setSingleton, "singleton(...)");
        adcmVar2.e(setSingleton);
        adcmVar2.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar4, mceVar2, mceVar3}));
        arrayList.add(adcmVar2.c());
        defpackage.adcm adcmVar3 = new defpackage.adcm(null);
        defpackage.aonj aonjVar11 = new defpackage.aonj() { // from class: mcg
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i13) {
                    case 0:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        int i15 = defpackage.mci.a;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar14.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        int i16 = defpackage.mci.a;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("AndroidAutoUnholdButtonClickedToUnholdButtonNotShown", 270245);
                        return defpackage.aojh.a;
                    case 2:
                        int i17 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 3:
                        int i18 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        int i19 = defpackage.mci.a;
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i110 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.UNHOLD_FAILED;
                        ajniVar.c = defpackage.zar.TELECOM_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("AndroidAutoEndCallButtonClickedToCallDisconnected", 237662);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        int i112 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar17.b = defpackage.mce.ANDROID_AUTO_IN_CALL_SCREEN_SHOWN;
                        aacyVar17.a = defpackage.aais.aI("AndroidAutoCreateScreenToInCallScreenShown", 299724);
                        return defpackage.aojh.a;
                    case 9:
                        int i114 = defpackage.mci.a;
                        return defpackage.mni.aW((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        int i115 = defpackage.mci.a;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("AndroidAutoAudioRouteButtonClickedToAudioRouteSelectorScreenShown", 237685);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("AndroidAutoDialpadButtonClickedToInCallDialpadScreenShown", 239067);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i117 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("VoiceCallFromAndroidAutoCallIntentReceivedToCarInCallScreenShown", 237054);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i119 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarInCallScreenShown", 237775);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i20 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar113.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar113.a = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarPreCallScreenShown", 257296);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i21 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("LastPreCallActionFromAndroidAutoFinishedToInCallScreenShown", 257298);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i22 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar115.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i23 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesToCarInCallScreenShown", 232893);
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i24 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i25 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("AndroidAutoCreateScreenToFavoritesDataShown", 283037);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar14 = new defpackage.aacy(null, null, null);
        aonjVar11.a(aacyVar14);
        adcmVar3.h = aacyVar14;
        adcmVar3.i = defpackage.mce.USER_CLICKED_AUTO_FAVORITE_CONTACT;
        java.util.Set set = b;
        adcmVar3.d(set);
        defpackage.aacy aacyVar15 = new defpackage.aacy();
        aacyVar15.b = mceVar;
        defpackage.mch mchVar3 = new defpackage.mch(2);
        defpackage.aacy aacyVar16 = new defpackage.aacy();
        mchVar3.a(aacyVar16);
        defpackage.mch mchVar4 = new defpackage.mch(3);
        defpackage.aacy aacyVar17 = new defpackage.aacy();
        mchVar4.a(aacyVar17);
        adcmVar3.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar15, aacyVar16, aacyVar17}));
        java.util.Set set2 = defpackage.mdv.a;
        java.util.Set set3 = defpackage.mdv.a;
        adcmVar3.f(set3);
        arrayList.add(adcmVar3.c());
        defpackage.adcm adcmVar4 = new defpackage.adcm(null);
        defpackage.mch mchVar5 = new defpackage.mch(4);
        defpackage.aacy aacyVar18 = new defpackage.aacy(null, null, null);
        mchVar5.a(aacyVar18);
        adcmVar4.h = aacyVar18;
        adcmVar4.i = defpackage.mce.ANDROID_AUTO_FAVORITES_NUMBER_SELECTED;
        adcmVar4.d(set);
        defpackage.aacy aacyVar19 = new defpackage.aacy();
        aacyVar19.b = mceVar;
        defpackage.aonj aonjVar12 = new defpackage.aonj() { // from class: mcf
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i4) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i15 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesNumberSelectionToCarPreCallScreenShown", 257286);
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i16 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoAppLaunchedToCarAppVisible", 281442);
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i17 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_RESUMED;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i18 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarInCallScreenShown", 234710);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i19 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarPreCallScreenShown", 257289);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoContactsToNumberScreenShown", 235160);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarInCallScreenShown", 235164);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i112 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarPreCallScreenShown", 257293);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarInCallScreenShown", 235162);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i114 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN});
                        aacyVar119.a = defpackage.aais.aI("AndroidAutoCreateScreenToContactsDataShown", 283373);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i115 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar1110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarPreCallScreenShown", 257291);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("AndroidAutoFavoritesTabSelectedToTabShown", 236856);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i117 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        aacyVar1113.a = defpackage.aais.aI("AndroidAutoRecentsTabSelectedToTabShown", 236858);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i119 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1114.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        aacyVar1114.a = defpackage.aais.aI("AndroidAutoContactsTabSelectedToTabShown", 236860);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("AndroidAutoDialpadTabSelectedToTabShown", 236862);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("AndroidAutoMuteButtonClickedToMuteButtonUpdated", 317820);
                        return defpackage.aojh.a;
                    case 17:
                        int i1112 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 18:
                        defpackage.aacy aacyVar1117 = (defpackage.aacy) obj;
                        int i20 = defpackage.mci.a;
                        if (aacyVar1117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN});
                        aacyVar1117.a = defpackage.aais.aI("AndroidAutoCreateScreenToDialpadDataShown", 283378);
                        return defpackage.aojh.a;
                    case 19:
                        int i21 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    default:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i22 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.ANDROID_AUTO_IN_CALL_MUTE_BUTTON_LISTENER_NOT_FOUND;
                        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar20 = new defpackage.aacy();
        aonjVar12.a(aacyVar20);
        adcmVar4.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar19, aacyVar20}));
        adcmVar4.f(set3);
        arrayList.add(adcmVar4.c());
        defpackage.adcm adcmVar5 = new defpackage.adcm(null);
        defpackage.aonj aonjVar13 = new defpackage.aonj() { // from class: mcf
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i6) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i15 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesNumberSelectionToCarPreCallScreenShown", 257286);
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i16 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoAppLaunchedToCarAppVisible", 281442);
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i17 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_RESUMED;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i18 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarInCallScreenShown", 234710);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i19 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarPreCallScreenShown", 257289);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoContactsToNumberScreenShown", 235160);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarInCallScreenShown", 235164);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i112 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarPreCallScreenShown", 257293);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarInCallScreenShown", 235162);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i114 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN});
                        aacyVar119.a = defpackage.aais.aI("AndroidAutoCreateScreenToContactsDataShown", 283373);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i115 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar1110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarPreCallScreenShown", 257291);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("AndroidAutoFavoritesTabSelectedToTabShown", 236856);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i117 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        aacyVar1113.a = defpackage.aais.aI("AndroidAutoRecentsTabSelectedToTabShown", 236858);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i119 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1114.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        aacyVar1114.a = defpackage.aais.aI("AndroidAutoContactsTabSelectedToTabShown", 236860);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("AndroidAutoDialpadTabSelectedToTabShown", 236862);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("AndroidAutoMuteButtonClickedToMuteButtonUpdated", 317820);
                        return defpackage.aojh.a;
                    case 17:
                        int i1112 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 18:
                        defpackage.aacy aacyVar1117 = (defpackage.aacy) obj;
                        int i20 = defpackage.mci.a;
                        if (aacyVar1117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN});
                        aacyVar1117.a = defpackage.aais.aI("AndroidAutoCreateScreenToDialpadDataShown", 283378);
                        return defpackage.aojh.a;
                    case 19:
                        int i21 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    default:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i22 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.ANDROID_AUTO_IN_CALL_MUTE_BUTTON_LISTENER_NOT_FOUND;
                        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar21 = new defpackage.aacy(null, null, null);
        aonjVar13.a(aacyVar21);
        adcmVar5.h = aacyVar21;
        adcmVar5.i = defpackage.mce.USER_CLICKED_AUTO_RECENTS_ENTRY;
        adcmVar5.d(set);
        defpackage.aacy aacyVar22 = new defpackage.aacy();
        aacyVar22.b = mceVar;
        defpackage.aonj aonjVar14 = new defpackage.aonj() { // from class: mcf
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i8) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i15 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesNumberSelectionToCarPreCallScreenShown", 257286);
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i16 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoAppLaunchedToCarAppVisible", 281442);
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i17 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_RESUMED;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i18 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarInCallScreenShown", 234710);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i19 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarPreCallScreenShown", 257289);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoContactsToNumberScreenShown", 235160);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarInCallScreenShown", 235164);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i112 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarPreCallScreenShown", 257293);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarInCallScreenShown", 235162);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i114 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN});
                        aacyVar119.a = defpackage.aais.aI("AndroidAutoCreateScreenToContactsDataShown", 283373);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i115 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar1110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarPreCallScreenShown", 257291);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("AndroidAutoFavoritesTabSelectedToTabShown", 236856);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i117 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        aacyVar1113.a = defpackage.aais.aI("AndroidAutoRecentsTabSelectedToTabShown", 236858);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i119 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1114.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        aacyVar1114.a = defpackage.aais.aI("AndroidAutoContactsTabSelectedToTabShown", 236860);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("AndroidAutoDialpadTabSelectedToTabShown", 236862);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("AndroidAutoMuteButtonClickedToMuteButtonUpdated", 317820);
                        return defpackage.aojh.a;
                    case 17:
                        int i1112 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 18:
                        defpackage.aacy aacyVar1117 = (defpackage.aacy) obj;
                        int i20 = defpackage.mci.a;
                        if (aacyVar1117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN});
                        aacyVar1117.a = defpackage.aais.aI("AndroidAutoCreateScreenToDialpadDataShown", 283378);
                        return defpackage.aojh.a;
                    case 19:
                        int i21 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    default:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i22 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.ANDROID_AUTO_IN_CALL_MUTE_BUTTON_LISTENER_NOT_FOUND;
                        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar23 = new defpackage.aacy();
        aonjVar14.a(aacyVar23);
        adcmVar5.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar22, aacyVar23}));
        adcmVar5.f(set3);
        arrayList.add(adcmVar5.c());
        defpackage.adcm adcmVar6 = new defpackage.adcm(null);
        defpackage.aonj aonjVar15 = new defpackage.aonj() { // from class: mcf
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i10) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i15 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesNumberSelectionToCarPreCallScreenShown", 257286);
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i16 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoAppLaunchedToCarAppVisible", 281442);
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i17 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_RESUMED;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i18 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarInCallScreenShown", 234710);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i19 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarPreCallScreenShown", 257289);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoContactsToNumberScreenShown", 235160);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarInCallScreenShown", 235164);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i112 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarPreCallScreenShown", 257293);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarInCallScreenShown", 235162);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i114 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN});
                        aacyVar119.a = defpackage.aais.aI("AndroidAutoCreateScreenToContactsDataShown", 283373);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i115 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar1110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarPreCallScreenShown", 257291);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("AndroidAutoFavoritesTabSelectedToTabShown", 236856);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i117 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        aacyVar1113.a = defpackage.aais.aI("AndroidAutoRecentsTabSelectedToTabShown", 236858);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i119 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1114.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        aacyVar1114.a = defpackage.aais.aI("AndroidAutoContactsTabSelectedToTabShown", 236860);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("AndroidAutoDialpadTabSelectedToTabShown", 236862);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("AndroidAutoMuteButtonClickedToMuteButtonUpdated", 317820);
                        return defpackage.aojh.a;
                    case 17:
                        int i1112 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 18:
                        defpackage.aacy aacyVar1117 = (defpackage.aacy) obj;
                        int i20 = defpackage.mci.a;
                        if (aacyVar1117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN});
                        aacyVar1117.a = defpackage.aais.aI("AndroidAutoCreateScreenToDialpadDataShown", 283378);
                        return defpackage.aojh.a;
                    case 19:
                        int i21 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    default:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i22 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.ANDROID_AUTO_IN_CALL_MUTE_BUTTON_LISTENER_NOT_FOUND;
                        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar24 = new defpackage.aacy(null, null, null);
        aonjVar15.a(aacyVar24);
        adcmVar6.h = aacyVar24;
        adcmVar6.i = defpackage.mce.USER_CLICKED_AUTO_CONTACTS_CONTACT;
        adcmVar6.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar4, mceVar2, mceVar3}));
        adcmVar6.a = defpackage.mce.ANDROID_AUTO_CONTACTS_NUMBER_SCREEN_SHOWN;
        arrayList.add(adcmVar6.c());
        defpackage.adcm adcmVar7 = new defpackage.adcm(null);
        defpackage.aonj aonjVar16 = new defpackage.aonj() { // from class: mcf
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i2) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i15 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesNumberSelectionToCarPreCallScreenShown", 257286);
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i16 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoAppLaunchedToCarAppVisible", 281442);
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i17 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_RESUMED;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i18 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarInCallScreenShown", 234710);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i19 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarPreCallScreenShown", 257289);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoContactsToNumberScreenShown", 235160);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarInCallScreenShown", 235164);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i112 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarPreCallScreenShown", 257293);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarInCallScreenShown", 235162);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i114 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN});
                        aacyVar119.a = defpackage.aais.aI("AndroidAutoCreateScreenToContactsDataShown", 283373);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i115 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar1110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarPreCallScreenShown", 257291);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("AndroidAutoFavoritesTabSelectedToTabShown", 236856);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i117 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        aacyVar1113.a = defpackage.aais.aI("AndroidAutoRecentsTabSelectedToTabShown", 236858);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i119 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1114.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        aacyVar1114.a = defpackage.aais.aI("AndroidAutoContactsTabSelectedToTabShown", 236860);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("AndroidAutoDialpadTabSelectedToTabShown", 236862);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("AndroidAutoMuteButtonClickedToMuteButtonUpdated", 317820);
                        return defpackage.aojh.a;
                    case 17:
                        int i1112 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 18:
                        defpackage.aacy aacyVar1117 = (defpackage.aacy) obj;
                        int i20 = defpackage.mci.a;
                        if (aacyVar1117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN});
                        aacyVar1117.a = defpackage.aais.aI("AndroidAutoCreateScreenToDialpadDataShown", 283378);
                        return defpackage.aojh.a;
                    case 19:
                        int i21 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    default:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i22 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.ANDROID_AUTO_IN_CALL_MUTE_BUTTON_LISTENER_NOT_FOUND;
                        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar25 = new defpackage.aacy(null, null, null);
        aonjVar16.a(aacyVar25);
        adcmVar7.h = aacyVar25;
        adcmVar7.i = defpackage.mce.ANDROID_AUTO_CONTACTS_NUMBER_SELECTED;
        adcmVar7.d(set);
        defpackage.aacy aacyVar26 = new defpackage.aacy();
        aacyVar26.b = mceVar;
        final int i15 = 7;
        defpackage.aonj aonjVar17 = new defpackage.aonj() { // from class: mcf
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i15) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i16 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesNumberSelectionToCarPreCallScreenShown", 257286);
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i17 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoAppLaunchedToCarAppVisible", 281442);
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i18 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_RESUMED;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i19 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarInCallScreenShown", 234710);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarPreCallScreenShown", 257289);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoContactsToNumberScreenShown", 235160);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i112 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarInCallScreenShown", 235164);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarPreCallScreenShown", 257293);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i114 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarInCallScreenShown", 235162);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i115 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN});
                        aacyVar119.a = defpackage.aais.aI("AndroidAutoCreateScreenToContactsDataShown", 283373);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar1110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarPreCallScreenShown", 257291);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i117 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("AndroidAutoFavoritesTabSelectedToTabShown", 236856);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i119 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        aacyVar1113.a = defpackage.aais.aI("AndroidAutoRecentsTabSelectedToTabShown", 236858);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1114.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        aacyVar1114.a = defpackage.aais.aI("AndroidAutoContactsTabSelectedToTabShown", 236860);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("AndroidAutoDialpadTabSelectedToTabShown", 236862);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("AndroidAutoMuteButtonClickedToMuteButtonUpdated", 317820);
                        return defpackage.aojh.a;
                    case 17:
                        int i1113 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 18:
                        defpackage.aacy aacyVar1117 = (defpackage.aacy) obj;
                        int i20 = defpackage.mci.a;
                        if (aacyVar1117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN});
                        aacyVar1117.a = defpackage.aais.aI("AndroidAutoCreateScreenToDialpadDataShown", 283378);
                        return defpackage.aojh.a;
                    case 19:
                        int i21 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    default:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i22 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.ANDROID_AUTO_IN_CALL_MUTE_BUTTON_LISTENER_NOT_FOUND;
                        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar27 = new defpackage.aacy();
        aonjVar17.a(aacyVar27);
        adcmVar7.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar26, aacyVar27}));
        adcmVar7.f(set3);
        arrayList.add(adcmVar7.c());
        defpackage.adcm adcmVar8 = new defpackage.adcm(null);
        defpackage.aonj aonjVar18 = new defpackage.aonj() { // from class: mcf
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i14) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i16 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesNumberSelectionToCarPreCallScreenShown", 257286);
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i17 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoAppLaunchedToCarAppVisible", 281442);
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i18 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_RESUMED;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i19 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarInCallScreenShown", 234710);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarPreCallScreenShown", 257289);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoContactsToNumberScreenShown", 235160);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i112 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarInCallScreenShown", 235164);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarPreCallScreenShown", 257293);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i114 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarInCallScreenShown", 235162);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i115 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN});
                        aacyVar119.a = defpackage.aais.aI("AndroidAutoCreateScreenToContactsDataShown", 283373);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar1110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarPreCallScreenShown", 257291);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i117 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("AndroidAutoFavoritesTabSelectedToTabShown", 236856);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i119 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        aacyVar1113.a = defpackage.aais.aI("AndroidAutoRecentsTabSelectedToTabShown", 236858);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1114.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        aacyVar1114.a = defpackage.aais.aI("AndroidAutoContactsTabSelectedToTabShown", 236860);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("AndroidAutoDialpadTabSelectedToTabShown", 236862);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("AndroidAutoMuteButtonClickedToMuteButtonUpdated", 317820);
                        return defpackage.aojh.a;
                    case 17:
                        int i1113 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 18:
                        defpackage.aacy aacyVar1117 = (defpackage.aacy) obj;
                        int i20 = defpackage.mci.a;
                        if (aacyVar1117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN});
                        aacyVar1117.a = defpackage.aais.aI("AndroidAutoCreateScreenToDialpadDataShown", 283378);
                        return defpackage.aojh.a;
                    case 19:
                        int i21 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    default:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i22 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.ANDROID_AUTO_IN_CALL_MUTE_BUTTON_LISTENER_NOT_FOUND;
                        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar28 = new defpackage.aacy(null, null, null);
        aonjVar18.a(aacyVar28);
        adcmVar8.h = aacyVar28;
        adcmVar8.i = defpackage.mce.USER_CLICKED_AUTO_CONTACT_PHONE_ICON;
        adcmVar8.d(set);
        defpackage.aacy aacyVar29 = new defpackage.aacy();
        aacyVar29.b = mceVar;
        final int i16 = 10;
        defpackage.aonj aonjVar19 = new defpackage.aonj() { // from class: mcf
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i16) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i17 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesNumberSelectionToCarPreCallScreenShown", 257286);
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i18 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoAppLaunchedToCarAppVisible", 281442);
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i19 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_RESUMED;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarInCallScreenShown", 234710);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarPreCallScreenShown", 257289);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i112 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoContactsToNumberScreenShown", 235160);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarInCallScreenShown", 235164);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i114 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarPreCallScreenShown", 257293);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i115 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarInCallScreenShown", 235162);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN});
                        aacyVar119.a = defpackage.aais.aI("AndroidAutoCreateScreenToContactsDataShown", 283373);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i117 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar1110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarPreCallScreenShown", 257291);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("AndroidAutoFavoritesTabSelectedToTabShown", 236856);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i119 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        aacyVar1113.a = defpackage.aais.aI("AndroidAutoRecentsTabSelectedToTabShown", 236858);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1114.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        aacyVar1114.a = defpackage.aais.aI("AndroidAutoContactsTabSelectedToTabShown", 236860);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("AndroidAutoDialpadTabSelectedToTabShown", 236862);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("AndroidAutoMuteButtonClickedToMuteButtonUpdated", 317820);
                        return defpackage.aojh.a;
                    case 17:
                        int i1114 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 18:
                        defpackage.aacy aacyVar1117 = (defpackage.aacy) obj;
                        int i20 = defpackage.mci.a;
                        if (aacyVar1117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN});
                        aacyVar1117.a = defpackage.aais.aI("AndroidAutoCreateScreenToDialpadDataShown", 283378);
                        return defpackage.aojh.a;
                    case 19:
                        int i21 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    default:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i22 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.ANDROID_AUTO_IN_CALL_MUTE_BUTTON_LISTENER_NOT_FOUND;
                        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar30 = new defpackage.aacy();
        aonjVar19.a(aacyVar30);
        adcmVar8.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar29, aacyVar30}));
        adcmVar8.f(set3);
        arrayList.add(adcmVar8.c());
        defpackage.adcm adcmVar9 = new defpackage.adcm(null);
        final int i17 = 11;
        defpackage.aonj aonjVar20 = new defpackage.aonj() { // from class: mcf
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i17) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i18 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesNumberSelectionToCarPreCallScreenShown", 257286);
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i19 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoAppLaunchedToCarAppVisible", 281442);
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_RESUMED;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarInCallScreenShown", 234710);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i112 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarPreCallScreenShown", 257289);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoContactsToNumberScreenShown", 235160);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i114 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarInCallScreenShown", 235164);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i115 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarPreCallScreenShown", 257293);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarInCallScreenShown", 235162);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i117 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN});
                        aacyVar119.a = defpackage.aais.aI("AndroidAutoCreateScreenToContactsDataShown", 283373);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar1110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarPreCallScreenShown", 257291);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i119 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("AndroidAutoFavoritesTabSelectedToTabShown", 236856);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        aacyVar1113.a = defpackage.aais.aI("AndroidAutoRecentsTabSelectedToTabShown", 236858);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1114.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        aacyVar1114.a = defpackage.aais.aI("AndroidAutoContactsTabSelectedToTabShown", 236860);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("AndroidAutoDialpadTabSelectedToTabShown", 236862);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("AndroidAutoMuteButtonClickedToMuteButtonUpdated", 317820);
                        return defpackage.aojh.a;
                    case 17:
                        int i1115 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 18:
                        defpackage.aacy aacyVar1117 = (defpackage.aacy) obj;
                        int i20 = defpackage.mci.a;
                        if (aacyVar1117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN});
                        aacyVar1117.a = defpackage.aais.aI("AndroidAutoCreateScreenToDialpadDataShown", 283378);
                        return defpackage.aojh.a;
                    case 19:
                        int i21 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    default:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i22 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.ANDROID_AUTO_IN_CALL_MUTE_BUTTON_LISTENER_NOT_FOUND;
                        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar31 = new defpackage.aacy(null, null, null);
        aonjVar20.a(aacyVar31);
        adcmVar9.h = aacyVar31;
        adcmVar9.i = defpackage.mce.USER_SELECTED_TAB_ON_AUTO_HOME_SCREEN;
        adcmVar9.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar4, mceVar2, mceVar3}));
        final int i18 = 12;
        defpackage.aonj aonjVar21 = new defpackage.aonj() { // from class: mcf
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i18) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i19 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesNumberSelectionToCarPreCallScreenShown", 257286);
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoAppLaunchedToCarAppVisible", 281442);
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_RESUMED;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i112 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarInCallScreenShown", 234710);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarPreCallScreenShown", 257289);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i114 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoContactsToNumberScreenShown", 235160);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i115 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarInCallScreenShown", 235164);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarPreCallScreenShown", 257293);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i117 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarInCallScreenShown", 235162);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN});
                        aacyVar119.a = defpackage.aais.aI("AndroidAutoCreateScreenToContactsDataShown", 283373);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i119 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar1110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarPreCallScreenShown", 257291);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("AndroidAutoFavoritesTabSelectedToTabShown", 236856);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        aacyVar1113.a = defpackage.aais.aI("AndroidAutoRecentsTabSelectedToTabShown", 236858);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1114.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        aacyVar1114.a = defpackage.aais.aI("AndroidAutoContactsTabSelectedToTabShown", 236860);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("AndroidAutoDialpadTabSelectedToTabShown", 236862);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        int i1115 = defpackage.mci.a;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("AndroidAutoMuteButtonClickedToMuteButtonUpdated", 317820);
                        return defpackage.aojh.a;
                    case 17:
                        int i1116 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 18:
                        defpackage.aacy aacyVar1117 = (defpackage.aacy) obj;
                        int i20 = defpackage.mci.a;
                        if (aacyVar1117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN});
                        aacyVar1117.a = defpackage.aais.aI("AndroidAutoCreateScreenToDialpadDataShown", 283378);
                        return defpackage.aojh.a;
                    case 19:
                        int i21 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    default:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i22 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.ANDROID_AUTO_IN_CALL_MUTE_BUTTON_LISTENER_NOT_FOUND;
                        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar32 = new defpackage.aacy();
        aonjVar21.a(aacyVar32);
        final int i19 = 13;
        defpackage.aonj aonjVar22 = new defpackage.aonj() { // from class: mcf
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i19) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesNumberSelectionToCarPreCallScreenShown", 257286);
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoAppLaunchedToCarAppVisible", 281442);
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i112 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_RESUMED;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarInCallScreenShown", 234710);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i114 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarPreCallScreenShown", 257289);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i115 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoContactsToNumberScreenShown", 235160);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarInCallScreenShown", 235164);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i117 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarPreCallScreenShown", 257293);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarInCallScreenShown", 235162);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i119 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN});
                        aacyVar119.a = defpackage.aais.aI("AndroidAutoCreateScreenToContactsDataShown", 283373);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar1110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarPreCallScreenShown", 257291);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("AndroidAutoFavoritesTabSelectedToTabShown", 236856);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        aacyVar1113.a = defpackage.aais.aI("AndroidAutoRecentsTabSelectedToTabShown", 236858);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1114.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        aacyVar1114.a = defpackage.aais.aI("AndroidAutoContactsTabSelectedToTabShown", 236860);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i1115 = defpackage.mci.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("AndroidAutoDialpadTabSelectedToTabShown", 236862);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        int i1116 = defpackage.mci.a;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("AndroidAutoMuteButtonClickedToMuteButtonUpdated", 317820);
                        return defpackage.aojh.a;
                    case 17:
                        int i1117 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 18:
                        defpackage.aacy aacyVar1117 = (defpackage.aacy) obj;
                        int i20 = defpackage.mci.a;
                        if (aacyVar1117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN});
                        aacyVar1117.a = defpackage.aais.aI("AndroidAutoCreateScreenToDialpadDataShown", 283378);
                        return defpackage.aojh.a;
                    case 19:
                        int i21 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    default:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i22 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.ANDROID_AUTO_IN_CALL_MUTE_BUTTON_LISTENER_NOT_FOUND;
                        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar33 = new defpackage.aacy();
        aonjVar22.a(aacyVar33);
        final int i20 = 14;
        defpackage.aonj aonjVar23 = new defpackage.aonj() { // from class: mcf
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i20) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesNumberSelectionToCarPreCallScreenShown", 257286);
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoAppLaunchedToCarAppVisible", 281442);
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i112 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_RESUMED;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarInCallScreenShown", 234710);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i114 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarPreCallScreenShown", 257289);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i115 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoContactsToNumberScreenShown", 235160);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarInCallScreenShown", 235164);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i117 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarPreCallScreenShown", 257293);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarInCallScreenShown", 235162);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i119 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN});
                        aacyVar119.a = defpackage.aais.aI("AndroidAutoCreateScreenToContactsDataShown", 283373);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar1110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarPreCallScreenShown", 257291);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("AndroidAutoFavoritesTabSelectedToTabShown", 236856);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        aacyVar1113.a = defpackage.aais.aI("AndroidAutoRecentsTabSelectedToTabShown", 236858);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1114.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        aacyVar1114.a = defpackage.aais.aI("AndroidAutoContactsTabSelectedToTabShown", 236860);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i1115 = defpackage.mci.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("AndroidAutoDialpadTabSelectedToTabShown", 236862);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        int i1116 = defpackage.mci.a;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("AndroidAutoMuteButtonClickedToMuteButtonUpdated", 317820);
                        return defpackage.aojh.a;
                    case 17:
                        int i1117 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 18:
                        defpackage.aacy aacyVar1117 = (defpackage.aacy) obj;
                        int i21 = defpackage.mci.a;
                        if (aacyVar1117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN});
                        aacyVar1117.a = defpackage.aais.aI("AndroidAutoCreateScreenToDialpadDataShown", 283378);
                        return defpackage.aojh.a;
                    case 19:
                        int i22 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    default:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i23 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.ANDROID_AUTO_IN_CALL_MUTE_BUTTON_LISTENER_NOT_FOUND;
                        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar34 = new defpackage.aacy();
        aonjVar23.a(aacyVar34);
        final int i21 = 15;
        defpackage.aonj aonjVar24 = new defpackage.aonj() { // from class: mcf
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i21) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesNumberSelectionToCarPreCallScreenShown", 257286);
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoAppLaunchedToCarAppVisible", 281442);
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i112 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_RESUMED;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarInCallScreenShown", 234710);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i114 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarPreCallScreenShown", 257289);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i115 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoContactsToNumberScreenShown", 235160);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarInCallScreenShown", 235164);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i117 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarPreCallScreenShown", 257293);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarInCallScreenShown", 235162);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i119 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN});
                        aacyVar119.a = defpackage.aais.aI("AndroidAutoCreateScreenToContactsDataShown", 283373);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar1110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarPreCallScreenShown", 257291);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("AndroidAutoFavoritesTabSelectedToTabShown", 236856);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        aacyVar1113.a = defpackage.aais.aI("AndroidAutoRecentsTabSelectedToTabShown", 236858);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1114.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        aacyVar1114.a = defpackage.aais.aI("AndroidAutoContactsTabSelectedToTabShown", 236860);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i1115 = defpackage.mci.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("AndroidAutoDialpadTabSelectedToTabShown", 236862);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        int i1116 = defpackage.mci.a;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("AndroidAutoMuteButtonClickedToMuteButtonUpdated", 317820);
                        return defpackage.aojh.a;
                    case 17:
                        int i1117 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 18:
                        defpackage.aacy aacyVar1117 = (defpackage.aacy) obj;
                        int i22 = defpackage.mci.a;
                        if (aacyVar1117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN});
                        aacyVar1117.a = defpackage.aais.aI("AndroidAutoCreateScreenToDialpadDataShown", 283378);
                        return defpackage.aojh.a;
                    case 19:
                        int i23 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    default:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i24 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.ANDROID_AUTO_IN_CALL_MUTE_BUTTON_LISTENER_NOT_FOUND;
                        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar35 = new defpackage.aacy();
        aonjVar24.a(aacyVar35);
        adcmVar9.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar32, aacyVar33, aacyVar34, aacyVar35}));
        arrayList.add(adcmVar9.c());
        defpackage.adcm adcmVar10 = new defpackage.adcm(null);
        final int i22 = 16;
        defpackage.aonj aonjVar25 = new defpackage.aonj() { // from class: mcf
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i22) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesNumberSelectionToCarPreCallScreenShown", 257286);
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoAppLaunchedToCarAppVisible", 281442);
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i112 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_RESUMED;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarInCallScreenShown", 234710);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i114 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarPreCallScreenShown", 257289);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i115 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoContactsToNumberScreenShown", 235160);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarInCallScreenShown", 235164);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i117 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarPreCallScreenShown", 257293);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarInCallScreenShown", 235162);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i119 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN});
                        aacyVar119.a = defpackage.aais.aI("AndroidAutoCreateScreenToContactsDataShown", 283373);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar1110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarPreCallScreenShown", 257291);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("AndroidAutoFavoritesTabSelectedToTabShown", 236856);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        aacyVar1113.a = defpackage.aais.aI("AndroidAutoRecentsTabSelectedToTabShown", 236858);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1114.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        aacyVar1114.a = defpackage.aais.aI("AndroidAutoContactsTabSelectedToTabShown", 236860);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i1115 = defpackage.mci.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("AndroidAutoDialpadTabSelectedToTabShown", 236862);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        int i1116 = defpackage.mci.a;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("AndroidAutoMuteButtonClickedToMuteButtonUpdated", 317820);
                        return defpackage.aojh.a;
                    case 17:
                        int i1117 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 18:
                        defpackage.aacy aacyVar1117 = (defpackage.aacy) obj;
                        int i23 = defpackage.mci.a;
                        if (aacyVar1117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN});
                        aacyVar1117.a = defpackage.aais.aI("AndroidAutoCreateScreenToDialpadDataShown", 283378);
                        return defpackage.aojh.a;
                    case 19:
                        int i24 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    default:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i25 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.ANDROID_AUTO_IN_CALL_MUTE_BUTTON_LISTENER_NOT_FOUND;
                        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar36 = new defpackage.aacy(null, null, null);
        aonjVar25.a(aacyVar36);
        adcmVar10.h = aacyVar36;
        adcmVar10.i = defpackage.mce.USER_CLICKED_AUTO_IN_CALL_MUTE_BUTTON;
        adcmVar10.a = defpackage.mce.ANDROID_AUTO_IN_CALL_MUTE_BUTTON_UPDATED;
        java.util.Set set4 = c;
        defpackage.mce mceVar5 = defpackage.mce.ON_CALL_DISCONNECTED;
        defpackage.mce mceVar6 = defpackage.mce.ANDROID_AUTO_AUDIO_ROUTE_SELECTOR_SCREEN_SHOWN;
        defpackage.mce mceVar7 = defpackage.mce.ANDROID_AUTO_IN_CALL_DIALPAD_SCREEN_SHOWN;
        defpackage.mce mceVar8 = defpackage.mce.SINGLE_CALL_ALREADY_DISCONNECTED;
        adcmVar10.d(defpackage.ajsz.aI(set4, defpackage.ajsz.cW(new defpackage.mce[]{mceVar5, defpackage.mce.HOLD_REQUESTED, defpackage.mce.USER_CLICKED_IN_CALL_HOLD_BUTTON, mceVar6, mceVar7, mceVar8})));
        final int i23 = 17;
        defpackage.aonj aonjVar26 = new defpackage.aonj() { // from class: mcf
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i23) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesNumberSelectionToCarPreCallScreenShown", 257286);
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoAppLaunchedToCarAppVisible", 281442);
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i112 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_RESUMED;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarInCallScreenShown", 234710);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i114 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarPreCallScreenShown", 257289);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i115 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoContactsToNumberScreenShown", 235160);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarInCallScreenShown", 235164);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i117 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarPreCallScreenShown", 257293);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarInCallScreenShown", 235162);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i119 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN});
                        aacyVar119.a = defpackage.aais.aI("AndroidAutoCreateScreenToContactsDataShown", 283373);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar1110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarPreCallScreenShown", 257291);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("AndroidAutoFavoritesTabSelectedToTabShown", 236856);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        aacyVar1113.a = defpackage.aais.aI("AndroidAutoRecentsTabSelectedToTabShown", 236858);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1114.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        aacyVar1114.a = defpackage.aais.aI("AndroidAutoContactsTabSelectedToTabShown", 236860);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i1115 = defpackage.mci.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("AndroidAutoDialpadTabSelectedToTabShown", 236862);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        int i1116 = defpackage.mci.a;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("AndroidAutoMuteButtonClickedToMuteButtonUpdated", 317820);
                        return defpackage.aojh.a;
                    case 17:
                        int i1117 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 18:
                        defpackage.aacy aacyVar1117 = (defpackage.aacy) obj;
                        int i24 = defpackage.mci.a;
                        if (aacyVar1117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN});
                        aacyVar1117.a = defpackage.aais.aI("AndroidAutoCreateScreenToDialpadDataShown", 283378);
                        return defpackage.aojh.a;
                    case 19:
                        int i25 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    default:
                        defpackage.ajni ajniVar = (defpackage.ajni) obj;
                        int i26 = defpackage.mci.a;
                        if (ajniVar == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar.b = defpackage.mcd.ANDROID_AUTO_IN_CALL_MUTE_BUTTON_LISTENER_NOT_FOUND;
                        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.ajni ajniVar = new defpackage.ajni(null);
        aonjVar26.a(ajniVar);
        final int i24 = 19;
        defpackage.aonj aonjVar27 = new defpackage.aonj() { // from class: mcf
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i24) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesNumberSelectionToCarPreCallScreenShown", 257286);
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoAppLaunchedToCarAppVisible", 281442);
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i112 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_RESUMED;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarInCallScreenShown", 234710);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i114 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarPreCallScreenShown", 257289);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i115 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoContactsToNumberScreenShown", 235160);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarInCallScreenShown", 235164);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i117 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarPreCallScreenShown", 257293);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarInCallScreenShown", 235162);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i119 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN});
                        aacyVar119.a = defpackage.aais.aI("AndroidAutoCreateScreenToContactsDataShown", 283373);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar1110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarPreCallScreenShown", 257291);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("AndroidAutoFavoritesTabSelectedToTabShown", 236856);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        aacyVar1113.a = defpackage.aais.aI("AndroidAutoRecentsTabSelectedToTabShown", 236858);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1114.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        aacyVar1114.a = defpackage.aais.aI("AndroidAutoContactsTabSelectedToTabShown", 236860);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i1115 = defpackage.mci.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("AndroidAutoDialpadTabSelectedToTabShown", 236862);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        int i1116 = defpackage.mci.a;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("AndroidAutoMuteButtonClickedToMuteButtonUpdated", 317820);
                        return defpackage.aojh.a;
                    case 17:
                        int i1117 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 18:
                        defpackage.aacy aacyVar1117 = (defpackage.aacy) obj;
                        int i25 = defpackage.mci.a;
                        if (aacyVar1117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN});
                        aacyVar1117.a = defpackage.aais.aI("AndroidAutoCreateScreenToDialpadDataShown", 283378);
                        return defpackage.aojh.a;
                    case 19:
                        int i26 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    default:
                        defpackage.ajni ajniVar2 = (defpackage.ajni) obj;
                        int i27 = defpackage.mci.a;
                        if (ajniVar2 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar2.b = defpackage.mcd.ANDROID_AUTO_IN_CALL_MUTE_BUTTON_LISTENER_NOT_FOUND;
                        ajniVar2.c = defpackage.zar.ILLEGAL_STATE;
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.ajni ajniVar2 = new defpackage.ajni(null);
        aonjVar27.a(ajniVar2);
        final int i25 = 20;
        defpackage.aonj aonjVar28 = new defpackage.aonj() { // from class: mcf
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i25) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesNumberSelectionToCarPreCallScreenShown", 257286);
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoAppLaunchedToCarAppVisible", 281442);
                        return defpackage.aojh.a;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i112 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.ON_ANDROID_AUTO_CAR_SESSION_RESUMED;
                        return defpackage.aojh.a;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i113 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarInCallScreenShown", 234710);
                        return defpackage.aojh.a;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i114 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VoiceCallFromAndroidAutoRecentsToCarPreCallScreenShown", 257289);
                        return defpackage.aojh.a;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i115 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoContactsToNumberScreenShown", 235160);
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarInCallScreenShown", 235164);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i117 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsNumberSelectionToCarPreCallScreenShown", 257293);
                        return defpackage.aojh.a;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarInCallScreenShown", 235162);
                        return defpackage.aojh.a;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i119 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN});
                        aacyVar119.a = defpackage.aais.aI("AndroidAutoCreateScreenToContactsDataShown", 283373);
                        return defpackage.aojh.a;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1110.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar1110.a = defpackage.aais.aI("VoiceCallFromAndroidAutoContactsToCarPreCallScreenShown", 257291);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("AndroidAutoFavoritesTabSelectedToTabShown", 236856);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        aacyVar1113.a = defpackage.aais.aI("AndroidAutoRecentsTabSelectedToTabShown", 236858);
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1114.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        aacyVar1114.a = defpackage.aais.aI("AndroidAutoContactsTabSelectedToTabShown", 236860);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        int i1115 = defpackage.mci.a;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("AndroidAutoDialpadTabSelectedToTabShown", 236862);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        int i1116 = defpackage.mci.a;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("AndroidAutoMuteButtonClickedToMuteButtonUpdated", 317820);
                        return defpackage.aojh.a;
                    case 17:
                        int i1117 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 18:
                        defpackage.aacy aacyVar1117 = (defpackage.aacy) obj;
                        int i26 = defpackage.mci.a;
                        if (aacyVar1117 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1117.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_DATA_LOADED, defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN});
                        aacyVar1117.a = defpackage.aais.aI("AndroidAutoCreateScreenToDialpadDataShown", 283378);
                        return defpackage.aojh.a;
                    case 19:
                        int i27 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    default:
                        defpackage.ajni ajniVar3 = (defpackage.ajni) obj;
                        int i28 = defpackage.mci.a;
                        if (ajniVar3 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar3.b = defpackage.mcd.ANDROID_AUTO_IN_CALL_MUTE_BUTTON_LISTENER_NOT_FOUND;
                        ajniVar3.c = defpackage.zar.ILLEGAL_STATE;
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.ajni ajniVar3 = new defpackage.ajni(null);
        aonjVar28.a(ajniVar3);
        adcmVar10.f(defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar, ajniVar2, ajniVar3}));
        arrayList.add(adcmVar10.c());
        defpackage.adcm adcmVar11 = new defpackage.adcm(null);
        defpackage.aonj aonjVar29 = new defpackage.aonj() { // from class: mcg
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoUnholdButtonClickedToUnholdButtonNotShown", 270245);
                        return defpackage.aojh.a;
                    case 2:
                        int i112 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 3:
                        int i113 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        int i114 = defpackage.mci.a;
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                        int i115 = defpackage.mci.a;
                        if (ajniVar4 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar4.b = defpackage.mcd.UNHOLD_FAILED;
                        ajniVar4.c = defpackage.zar.TELECOM_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("AndroidAutoEndCallButtonClickedToCallDisconnected", 237662);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        int i117 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar113.b = defpackage.mce.ANDROID_AUTO_IN_CALL_SCREEN_SHOWN;
                        aacyVar113.a = defpackage.aais.aI("AndroidAutoCreateScreenToInCallScreenShown", 299724);
                        return defpackage.aojh.a;
                    case 9:
                        int i119 = defpackage.mci.a;
                        return defpackage.mni.aW((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("AndroidAutoAudioRouteButtonClickedToAudioRouteSelectorScreenShown", 237685);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoDialpadButtonClickedToInCallDialpadScreenShown", 239067);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoCallIntentReceivedToCarInCallScreenShown", 237054);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarInCallScreenShown", 237775);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i26 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar119.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar119.a = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarPreCallScreenShown", 257296);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i27 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1110.b = defpackage.aais.aI("LastPreCallActionFromAndroidAutoFinishedToInCallScreenShown", 257298);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i28 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i29 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesToCarInCallScreenShown", 232893);
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i210 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i211 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("AndroidAutoCreateScreenToFavoritesDataShown", 283037);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar37 = new defpackage.aacy(null, null, null);
        aonjVar29.a(aacyVar37);
        adcmVar11.h = aacyVar37;
        adcmVar11.i = defpackage.mce.USER_CLICKED_AUTO_IN_CALL_UNHOLD_BUTTON;
        adcmVar11.a = defpackage.mce.ANDROID_AUTO_IN_CALL_UNHOLD_BUTTON_NOT_SHOWN;
        adcmVar11.d(set4);
        defpackage.aonj aonjVar30 = new defpackage.aonj() { // from class: mcg
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i3) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoUnholdButtonClickedToUnholdButtonNotShown", 270245);
                        return defpackage.aojh.a;
                    case 2:
                        int i112 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 3:
                        int i113 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        int i114 = defpackage.mci.a;
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.ajni ajniVar4 = (defpackage.ajni) obj;
                        int i115 = defpackage.mci.a;
                        if (ajniVar4 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar4.b = defpackage.mcd.UNHOLD_FAILED;
                        ajniVar4.c = defpackage.zar.TELECOM_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("AndroidAutoEndCallButtonClickedToCallDisconnected", 237662);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        int i117 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar113.b = defpackage.mce.ANDROID_AUTO_IN_CALL_SCREEN_SHOWN;
                        aacyVar113.a = defpackage.aais.aI("AndroidAutoCreateScreenToInCallScreenShown", 299724);
                        return defpackage.aojh.a;
                    case 9:
                        int i119 = defpackage.mci.a;
                        return defpackage.mni.aW((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("AndroidAutoAudioRouteButtonClickedToAudioRouteSelectorScreenShown", 237685);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoDialpadButtonClickedToInCallDialpadScreenShown", 239067);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoCallIntentReceivedToCarInCallScreenShown", 237054);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarInCallScreenShown", 237775);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i26 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar119.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar119.a = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarPreCallScreenShown", 257296);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i27 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1110.b = defpackage.aais.aI("LastPreCallActionFromAndroidAutoFinishedToInCallScreenShown", 257298);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i28 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i29 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesToCarInCallScreenShown", 232893);
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i210 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i211 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("AndroidAutoCreateScreenToFavoritesDataShown", 283037);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.ajni ajniVar4 = new defpackage.ajni(null);
        aonjVar30.a(ajniVar4);
        defpackage.aonj aonjVar31 = new defpackage.aonj() { // from class: mcg
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i6) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoUnholdButtonClickedToUnholdButtonNotShown", 270245);
                        return defpackage.aojh.a;
                    case 2:
                        int i112 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 3:
                        int i113 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        int i114 = defpackage.mci.a;
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.ajni ajniVar5 = (defpackage.ajni) obj;
                        int i115 = defpackage.mci.a;
                        if (ajniVar5 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar5.b = defpackage.mcd.UNHOLD_FAILED;
                        ajniVar5.c = defpackage.zar.TELECOM_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("AndroidAutoEndCallButtonClickedToCallDisconnected", 237662);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        int i117 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar113.b = defpackage.mce.ANDROID_AUTO_IN_CALL_SCREEN_SHOWN;
                        aacyVar113.a = defpackage.aais.aI("AndroidAutoCreateScreenToInCallScreenShown", 299724);
                        return defpackage.aojh.a;
                    case 9:
                        int i119 = defpackage.mci.a;
                        return defpackage.mni.aW((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("AndroidAutoAudioRouteButtonClickedToAudioRouteSelectorScreenShown", 237685);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoDialpadButtonClickedToInCallDialpadScreenShown", 239067);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoCallIntentReceivedToCarInCallScreenShown", 237054);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarInCallScreenShown", 237775);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i26 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar119.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar119.a = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarPreCallScreenShown", 257296);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i27 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1110.b = defpackage.aais.aI("LastPreCallActionFromAndroidAutoFinishedToInCallScreenShown", 257298);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i28 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i29 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesToCarInCallScreenShown", 232893);
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i210 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i211 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("AndroidAutoCreateScreenToFavoritesDataShown", 283037);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.ajni ajniVar5 = new defpackage.ajni(null);
        aonjVar31.a(ajniVar5);
        defpackage.aonj aonjVar32 = new defpackage.aonj() { // from class: mcg
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i8) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoUnholdButtonClickedToUnholdButtonNotShown", 270245);
                        return defpackage.aojh.a;
                    case 2:
                        int i112 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 3:
                        int i113 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        int i114 = defpackage.mci.a;
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.ajni ajniVar6 = (defpackage.ajni) obj;
                        int i115 = defpackage.mci.a;
                        if (ajniVar6 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar6.b = defpackage.mcd.UNHOLD_FAILED;
                        ajniVar6.c = defpackage.zar.TELECOM_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("AndroidAutoEndCallButtonClickedToCallDisconnected", 237662);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        int i117 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar113.b = defpackage.mce.ANDROID_AUTO_IN_CALL_SCREEN_SHOWN;
                        aacyVar113.a = defpackage.aais.aI("AndroidAutoCreateScreenToInCallScreenShown", 299724);
                        return defpackage.aojh.a;
                    case 9:
                        int i119 = defpackage.mci.a;
                        return defpackage.mni.aW((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("AndroidAutoAudioRouteButtonClickedToAudioRouteSelectorScreenShown", 237685);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoDialpadButtonClickedToInCallDialpadScreenShown", 239067);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoCallIntentReceivedToCarInCallScreenShown", 237054);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarInCallScreenShown", 237775);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i26 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar119.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar119.a = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarPreCallScreenShown", 257296);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i27 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1110.b = defpackage.aais.aI("LastPreCallActionFromAndroidAutoFinishedToInCallScreenShown", 257298);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i28 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i29 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesToCarInCallScreenShown", 232893);
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i210 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i211 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("AndroidAutoCreateScreenToFavoritesDataShown", 283037);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.ajni ajniVar6 = new defpackage.ajni(null);
        aonjVar32.a(ajniVar6);
        final int i26 = 5;
        defpackage.aonj aonjVar33 = new defpackage.aonj() { // from class: mcg
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i26) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoUnholdButtonClickedToUnholdButtonNotShown", 270245);
                        return defpackage.aojh.a;
                    case 2:
                        int i112 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 3:
                        int i113 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        int i114 = defpackage.mci.a;
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.ajni ajniVar7 = (defpackage.ajni) obj;
                        int i115 = defpackage.mci.a;
                        if (ajniVar7 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar7.b = defpackage.mcd.UNHOLD_FAILED;
                        ajniVar7.c = defpackage.zar.TELECOM_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("AndroidAutoEndCallButtonClickedToCallDisconnected", 237662);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        int i117 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar113.b = defpackage.mce.ANDROID_AUTO_IN_CALL_SCREEN_SHOWN;
                        aacyVar113.a = defpackage.aais.aI("AndroidAutoCreateScreenToInCallScreenShown", 299724);
                        return defpackage.aojh.a;
                    case 9:
                        int i119 = defpackage.mci.a;
                        return defpackage.mni.aW((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("AndroidAutoAudioRouteButtonClickedToAudioRouteSelectorScreenShown", 237685);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoDialpadButtonClickedToInCallDialpadScreenShown", 239067);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoCallIntentReceivedToCarInCallScreenShown", 237054);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarInCallScreenShown", 237775);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i27 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar119.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar119.a = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarPreCallScreenShown", 257296);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i28 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1110.b = defpackage.aais.aI("LastPreCallActionFromAndroidAutoFinishedToInCallScreenShown", 257298);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i29 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i210 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesToCarInCallScreenShown", 232893);
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i211 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i212 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("AndroidAutoCreateScreenToFavoritesDataShown", 283037);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.ajni ajniVar7 = new defpackage.ajni(null);
        aonjVar33.a(ajniVar7);
        adcmVar11.f(defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar4, ajniVar5, ajniVar6, ajniVar7}));
        arrayList.add(adcmVar11.c());
        defpackage.adcm adcmVar12 = new defpackage.adcm(null);
        final int i27 = 6;
        defpackage.aonj aonjVar34 = new defpackage.aonj() { // from class: mcg
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i27) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoUnholdButtonClickedToUnholdButtonNotShown", 270245);
                        return defpackage.aojh.a;
                    case 2:
                        int i112 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 3:
                        int i113 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        int i114 = defpackage.mci.a;
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.ajni ajniVar8 = (defpackage.ajni) obj;
                        int i115 = defpackage.mci.a;
                        if (ajniVar8 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar8.b = defpackage.mcd.UNHOLD_FAILED;
                        ajniVar8.c = defpackage.zar.TELECOM_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("AndroidAutoEndCallButtonClickedToCallDisconnected", 237662);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        int i117 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar113.b = defpackage.mce.ANDROID_AUTO_IN_CALL_SCREEN_SHOWN;
                        aacyVar113.a = defpackage.aais.aI("AndroidAutoCreateScreenToInCallScreenShown", 299724);
                        return defpackage.aojh.a;
                    case 9:
                        int i119 = defpackage.mci.a;
                        return defpackage.mni.aW((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("AndroidAutoAudioRouteButtonClickedToAudioRouteSelectorScreenShown", 237685);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoDialpadButtonClickedToInCallDialpadScreenShown", 239067);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoCallIntentReceivedToCarInCallScreenShown", 237054);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarInCallScreenShown", 237775);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i28 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar119.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar119.a = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarPreCallScreenShown", 257296);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i29 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1110.b = defpackage.aais.aI("LastPreCallActionFromAndroidAutoFinishedToInCallScreenShown", 257298);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i210 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i211 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesToCarInCallScreenShown", 232893);
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i212 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i213 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("AndroidAutoCreateScreenToFavoritesDataShown", 283037);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar38 = new defpackage.aacy(null, null, null);
        aonjVar34.a(aacyVar38);
        adcmVar12.h = aacyVar38;
        adcmVar12.i = defpackage.mce.USER_CLICKED_AUTO_END_CALL_BUTTON;
        adcmVar12.b = defpackage.ajsz.cW(new defpackage.mce[]{mceVar5, defpackage.mce.ON_CALL_REMOVED});
        adcmVar12.d(defpackage.ajsz.cW(new defpackage.mce[]{mceVar8, mceVar2, mceVar3, mceVar4, defpackage.mce.ANDROID_AUTO_IN_CALL_SCREENS_REMOVED, defpackage.mce.ALL_TOP_LEVEL_CALLS_ALREADY_DISCONNECTED}));
        final int i28 = 7;
        defpackage.aonj aonjVar35 = new defpackage.aonj() { // from class: mcg
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i28) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoUnholdButtonClickedToUnholdButtonNotShown", 270245);
                        return defpackage.aojh.a;
                    case 2:
                        int i112 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 3:
                        int i113 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        int i114 = defpackage.mci.a;
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.ajni ajniVar8 = (defpackage.ajni) obj;
                        int i115 = defpackage.mci.a;
                        if (ajniVar8 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar8.b = defpackage.mcd.UNHOLD_FAILED;
                        ajniVar8.c = defpackage.zar.TELECOM_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("AndroidAutoEndCallButtonClickedToCallDisconnected", 237662);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        int i117 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar113.b = defpackage.mce.ANDROID_AUTO_IN_CALL_SCREEN_SHOWN;
                        aacyVar113.a = defpackage.aais.aI("AndroidAutoCreateScreenToInCallScreenShown", 299724);
                        return defpackage.aojh.a;
                    case 9:
                        int i119 = defpackage.mci.a;
                        return defpackage.mni.aW((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("AndroidAutoAudioRouteButtonClickedToAudioRouteSelectorScreenShown", 237685);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoDialpadButtonClickedToInCallDialpadScreenShown", 239067);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoCallIntentReceivedToCarInCallScreenShown", 237054);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarInCallScreenShown", 237775);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i29 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar119.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar119.a = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarPreCallScreenShown", 257296);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i210 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1110.b = defpackage.aais.aI("LastPreCallActionFromAndroidAutoFinishedToInCallScreenShown", 257298);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i211 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i212 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesToCarInCallScreenShown", 232893);
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i213 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i214 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("AndroidAutoCreateScreenToFavoritesDataShown", 283037);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.ajni ajniVar8 = new defpackage.ajni(null);
        aonjVar35.a(ajniVar8);
        final int i29 = 9;
        defpackage.aonj aonjVar36 = new defpackage.aonj() { // from class: mcg
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i29) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoUnholdButtonClickedToUnholdButtonNotShown", 270245);
                        return defpackage.aojh.a;
                    case 2:
                        int i112 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 3:
                        int i113 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        int i114 = defpackage.mci.a;
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.ajni ajniVar9 = (defpackage.ajni) obj;
                        int i115 = defpackage.mci.a;
                        if (ajniVar9 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar9.b = defpackage.mcd.UNHOLD_FAILED;
                        ajniVar9.c = defpackage.zar.TELECOM_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("AndroidAutoEndCallButtonClickedToCallDisconnected", 237662);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        int i117 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar113.b = defpackage.mce.ANDROID_AUTO_IN_CALL_SCREEN_SHOWN;
                        aacyVar113.a = defpackage.aais.aI("AndroidAutoCreateScreenToInCallScreenShown", 299724);
                        return defpackage.aojh.a;
                    case 9:
                        int i119 = defpackage.mci.a;
                        return defpackage.mni.aW((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("AndroidAutoAudioRouteButtonClickedToAudioRouteSelectorScreenShown", 237685);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoDialpadButtonClickedToInCallDialpadScreenShown", 239067);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoCallIntentReceivedToCarInCallScreenShown", 237054);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarInCallScreenShown", 237775);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i210 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar119.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar119.a = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarPreCallScreenShown", 257296);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i211 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1110.b = defpackage.aais.aI("LastPreCallActionFromAndroidAutoFinishedToInCallScreenShown", 257298);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i212 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i213 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesToCarInCallScreenShown", 232893);
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i214 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i215 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("AndroidAutoCreateScreenToFavoritesDataShown", 283037);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.ajni ajniVar9 = new defpackage.ajni(null);
        aonjVar36.a(ajniVar9);
        adcmVar12.f(defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar8, ajniVar9}));
        arrayList.add(adcmVar12.c());
        defpackage.adcm adcmVar13 = new defpackage.adcm(null);
        final int i30 = 10;
        defpackage.aonj aonjVar37 = new defpackage.aonj() { // from class: mcg
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i30) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoUnholdButtonClickedToUnholdButtonNotShown", 270245);
                        return defpackage.aojh.a;
                    case 2:
                        int i112 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 3:
                        int i113 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        int i114 = defpackage.mci.a;
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.ajni ajniVar10 = (defpackage.ajni) obj;
                        int i115 = defpackage.mci.a;
                        if (ajniVar10 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar10.b = defpackage.mcd.UNHOLD_FAILED;
                        ajniVar10.c = defpackage.zar.TELECOM_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("AndroidAutoEndCallButtonClickedToCallDisconnected", 237662);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        int i117 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar113.b = defpackage.mce.ANDROID_AUTO_IN_CALL_SCREEN_SHOWN;
                        aacyVar113.a = defpackage.aais.aI("AndroidAutoCreateScreenToInCallScreenShown", 299724);
                        return defpackage.aojh.a;
                    case 9:
                        int i119 = defpackage.mci.a;
                        return defpackage.mni.aW((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("AndroidAutoAudioRouteButtonClickedToAudioRouteSelectorScreenShown", 237685);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoDialpadButtonClickedToInCallDialpadScreenShown", 239067);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoCallIntentReceivedToCarInCallScreenShown", 237054);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarInCallScreenShown", 237775);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i210 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar119.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar119.a = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarPreCallScreenShown", 257296);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i211 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1110.b = defpackage.aais.aI("LastPreCallActionFromAndroidAutoFinishedToInCallScreenShown", 257298);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i212 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i213 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesToCarInCallScreenShown", 232893);
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i214 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i215 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("AndroidAutoCreateScreenToFavoritesDataShown", 283037);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar39 = new defpackage.aacy(null, null, null);
        aonjVar37.a(aacyVar39);
        adcmVar13.h = aacyVar39;
        adcmVar13.i = defpackage.mce.USER_CLICKED_AUTO_IN_CALL_AUDIO_ROUTE;
        adcmVar13.a = mceVar6;
        adcmVar13.d(set4);
        arrayList.add(adcmVar13.c());
        defpackage.adcm adcmVar14 = new defpackage.adcm(null);
        final int i31 = 11;
        defpackage.aonj aonjVar38 = new defpackage.aonj() { // from class: mcg
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i31) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoUnholdButtonClickedToUnholdButtonNotShown", 270245);
                        return defpackage.aojh.a;
                    case 2:
                        int i112 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 3:
                        int i113 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        int i114 = defpackage.mci.a;
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.ajni ajniVar10 = (defpackage.ajni) obj;
                        int i115 = defpackage.mci.a;
                        if (ajniVar10 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar10.b = defpackage.mcd.UNHOLD_FAILED;
                        ajniVar10.c = defpackage.zar.TELECOM_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("AndroidAutoEndCallButtonClickedToCallDisconnected", 237662);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        int i117 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar113.b = defpackage.mce.ANDROID_AUTO_IN_CALL_SCREEN_SHOWN;
                        aacyVar113.a = defpackage.aais.aI("AndroidAutoCreateScreenToInCallScreenShown", 299724);
                        return defpackage.aojh.a;
                    case 9:
                        int i119 = defpackage.mci.a;
                        return defpackage.mni.aW((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("AndroidAutoAudioRouteButtonClickedToAudioRouteSelectorScreenShown", 237685);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoDialpadButtonClickedToInCallDialpadScreenShown", 239067);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoCallIntentReceivedToCarInCallScreenShown", 237054);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarInCallScreenShown", 237775);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i210 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar119.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar119.a = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarPreCallScreenShown", 257296);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i211 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1110.b = defpackage.aais.aI("LastPreCallActionFromAndroidAutoFinishedToInCallScreenShown", 257298);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i212 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i213 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesToCarInCallScreenShown", 232893);
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i214 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i215 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("AndroidAutoCreateScreenToFavoritesDataShown", 283037);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar40 = new defpackage.aacy(null, null, null);
        aonjVar38.a(aacyVar40);
        adcmVar14.h = aacyVar40;
        adcmVar14.i = defpackage.mce.USER_CLICKED_AUTO_IN_CALL_DIALPAD;
        adcmVar14.a = mceVar7;
        adcmVar14.d(set4);
        arrayList.add(adcmVar14.c());
        defpackage.adcm adcmVar15 = new defpackage.adcm(null);
        final int i32 = 12;
        defpackage.aonj aonjVar39 = new defpackage.aonj() { // from class: mcg
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i32) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoUnholdButtonClickedToUnholdButtonNotShown", 270245);
                        return defpackage.aojh.a;
                    case 2:
                        int i112 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 3:
                        int i113 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        int i114 = defpackage.mci.a;
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.ajni ajniVar10 = (defpackage.ajni) obj;
                        int i115 = defpackage.mci.a;
                        if (ajniVar10 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar10.b = defpackage.mcd.UNHOLD_FAILED;
                        ajniVar10.c = defpackage.zar.TELECOM_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("AndroidAutoEndCallButtonClickedToCallDisconnected", 237662);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        int i117 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar113.b = defpackage.mce.ANDROID_AUTO_IN_CALL_SCREEN_SHOWN;
                        aacyVar113.a = defpackage.aais.aI("AndroidAutoCreateScreenToInCallScreenShown", 299724);
                        return defpackage.aojh.a;
                    case 9:
                        int i119 = defpackage.mci.a;
                        return defpackage.mni.aW((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("AndroidAutoAudioRouteButtonClickedToAudioRouteSelectorScreenShown", 237685);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoDialpadButtonClickedToInCallDialpadScreenShown", 239067);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoCallIntentReceivedToCarInCallScreenShown", 237054);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarInCallScreenShown", 237775);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i210 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar119.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar119.a = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarPreCallScreenShown", 257296);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i211 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1110.b = defpackage.aais.aI("LastPreCallActionFromAndroidAutoFinishedToInCallScreenShown", 257298);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i212 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i213 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesToCarInCallScreenShown", 232893);
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i214 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i215 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("AndroidAutoCreateScreenToFavoritesDataShown", 283037);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar41 = new defpackage.aacy(null, null, null);
        aonjVar39.a(aacyVar41);
        adcmVar15.h = aacyVar41;
        adcmVar15.i = defpackage.mce.ANDROID_AUTO_CALL_INTENT_RECEIVED;
        adcmVar15.d(set);
        adcmVar15.a = mceVar;
        adcmVar15.f(set3);
        arrayList.add(adcmVar15.c());
        defpackage.adcm adcmVar16 = new defpackage.adcm(null);
        final int i33 = 14;
        defpackage.aonj aonjVar40 = new defpackage.aonj() { // from class: mcg
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i33) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoUnholdButtonClickedToUnholdButtonNotShown", 270245);
                        return defpackage.aojh.a;
                    case 2:
                        int i112 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 3:
                        int i113 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        int i114 = defpackage.mci.a;
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.ajni ajniVar10 = (defpackage.ajni) obj;
                        int i115 = defpackage.mci.a;
                        if (ajniVar10 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar10.b = defpackage.mcd.UNHOLD_FAILED;
                        ajniVar10.c = defpackage.zar.TELECOM_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("AndroidAutoEndCallButtonClickedToCallDisconnected", 237662);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        int i117 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar113.b = defpackage.mce.ANDROID_AUTO_IN_CALL_SCREEN_SHOWN;
                        aacyVar113.a = defpackage.aais.aI("AndroidAutoCreateScreenToInCallScreenShown", 299724);
                        return defpackage.aojh.a;
                    case 9:
                        int i119 = defpackage.mci.a;
                        return defpackage.mni.aW((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("AndroidAutoAudioRouteButtonClickedToAudioRouteSelectorScreenShown", 237685);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoDialpadButtonClickedToInCallDialpadScreenShown", 239067);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoCallIntentReceivedToCarInCallScreenShown", 237054);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarInCallScreenShown", 237775);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i210 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar119.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar119.a = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarPreCallScreenShown", 257296);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i211 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1110.b = defpackage.aais.aI("LastPreCallActionFromAndroidAutoFinishedToInCallScreenShown", 257298);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i212 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i213 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesToCarInCallScreenShown", 232893);
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i214 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i215 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("AndroidAutoCreateScreenToFavoritesDataShown", 283037);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar42 = new defpackage.aacy(null, null, null);
        aonjVar40.a(aacyVar42);
        adcmVar16.h = aacyVar42;
        adcmVar16.i = defpackage.mce.ANDROID_AUTO_USER_CLICKED_CALL_BUTTON_FROM_DIALPAD;
        adcmVar16.d(set);
        defpackage.aacy aacyVar43 = new defpackage.aacy();
        aacyVar43.b = mceVar;
        final int i34 = 15;
        defpackage.aonj aonjVar41 = new defpackage.aonj() { // from class: mcg
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i34) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoUnholdButtonClickedToUnholdButtonNotShown", 270245);
                        return defpackage.aojh.a;
                    case 2:
                        int i112 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 3:
                        int i113 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        int i114 = defpackage.mci.a;
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.ajni ajniVar10 = (defpackage.ajni) obj;
                        int i115 = defpackage.mci.a;
                        if (ajniVar10 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar10.b = defpackage.mcd.UNHOLD_FAILED;
                        ajniVar10.c = defpackage.zar.TELECOM_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("AndroidAutoEndCallButtonClickedToCallDisconnected", 237662);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        int i117 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar113.b = defpackage.mce.ANDROID_AUTO_IN_CALL_SCREEN_SHOWN;
                        aacyVar113.a = defpackage.aais.aI("AndroidAutoCreateScreenToInCallScreenShown", 299724);
                        return defpackage.aojh.a;
                    case 9:
                        int i119 = defpackage.mci.a;
                        return defpackage.mni.aW((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("AndroidAutoAudioRouteButtonClickedToAudioRouteSelectorScreenShown", 237685);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoDialpadButtonClickedToInCallDialpadScreenShown", 239067);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoCallIntentReceivedToCarInCallScreenShown", 237054);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarInCallScreenShown", 237775);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i210 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar119.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar119.a = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarPreCallScreenShown", 257296);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i211 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1110.b = defpackage.aais.aI("LastPreCallActionFromAndroidAutoFinishedToInCallScreenShown", 257298);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i212 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i213 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesToCarInCallScreenShown", 232893);
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i214 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i215 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("AndroidAutoCreateScreenToFavoritesDataShown", 283037);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar44 = new defpackage.aacy();
        aonjVar41.a(aacyVar44);
        adcmVar16.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar43, aacyVar44}));
        adcmVar16.f(set3);
        arrayList.add(adcmVar16.c());
        defpackage.adcm adcmVar17 = new defpackage.adcm(null);
        final int i35 = 16;
        defpackage.aonj aonjVar42 = new defpackage.aonj() { // from class: mcg
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i35) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        int i110 = defpackage.mci.a;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.ANDROID_AUTO_FAVORITES_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        int i111 = defpackage.mci.a;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("AndroidAutoUnholdButtonClickedToUnholdButtonNotShown", 270245);
                        return defpackage.aojh.a;
                    case 2:
                        int i112 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case 3:
                        int i113 = defpackage.mci.a;
                        return defpackage.mni.aX((defpackage.ajni) obj);
                    case 4:
                        int i114 = defpackage.mci.a;
                        return defpackage.mni.aY((defpackage.ajni) obj);
                    case 5:
                        defpackage.ajni ajniVar10 = (defpackage.ajni) obj;
                        int i115 = defpackage.mci.a;
                        if (ajniVar10 == null) {
                            defpackage.aooh.i("$this$error");
                        }
                        ajniVar10.b = defpackage.mcd.UNHOLD_FAILED;
                        ajniVar10.c = defpackage.zar.TELECOM_ERROR;
                        return defpackage.aojh.a;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        int i116 = defpackage.mci.a;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("AndroidAutoEndCallButtonClickedToCallDisconnected", 237662);
                        return defpackage.aojh.a;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        int i117 = defpackage.mci.a;
                        return defpackage.gus.aF((defpackage.ajni) obj);
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        int i118 = defpackage.mci.a;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar113.b = defpackage.mce.ANDROID_AUTO_IN_CALL_SCREEN_SHOWN;
                        aacyVar113.a = defpackage.aais.aI("AndroidAutoCreateScreenToInCallScreenShown", 299724);
                        return defpackage.aojh.a;
                    case 9:
                        int i119 = defpackage.mci.a;
                        return defpackage.mni.aW((defpackage.ajni) obj);
                    case 10:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        int i1110 = defpackage.mci.a;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("AndroidAutoAudioRouteButtonClickedToAudioRouteSelectorScreenShown", 237685);
                        return defpackage.aojh.a;
                    case 11:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        int i1111 = defpackage.mci.a;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("AndroidAutoDialpadButtonClickedToInCallDialpadScreenShown", 239067);
                        return defpackage.aojh.a;
                    case 12:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        int i1112 = defpackage.mci.a;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VoiceCallFromAndroidAutoCallIntentReceivedToCarInCallScreenShown", 237054);
                        return defpackage.aojh.a;
                    case 13:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        int i1113 = defpackage.mci.a;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.ANDROID_AUTO_RECENTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 14:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        int i1114 = defpackage.mci.a;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarInCallScreenShown", 237775);
                        return defpackage.aojh.a;
                    case 15:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        int i210 = defpackage.mci.a;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar119.b = defpackage.mce.ANDROID_AUTO_PRE_CALL_SCREEN_SHOWN;
                        aacyVar119.a = defpackage.aais.aI("VoiceCallFromAndroidAutoDialpadToCarPreCallScreenShown", 257296);
                        return defpackage.aojh.a;
                    case 16:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        int i211 = defpackage.mci.a;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1110.b = defpackage.aais.aI("LastPreCallActionFromAndroidAutoFinishedToInCallScreenShown", 257298);
                        return defpackage.aojh.a;
                    case 17:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        int i212 = defpackage.mci.a;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.ANDROID_AUTO_CONTACTS_TAB_SHOWN;
                        return defpackage.aojh.a;
                    case 18:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        int i213 = defpackage.mci.a;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("VoiceCallFromAndroidAutoFavoritesToCarInCallScreenShown", 232893);
                        return defpackage.aojh.a;
                    case 19:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        int i214 = defpackage.mci.a;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1113.b = defpackage.mce.ANDROID_AUTO_DIALPAD_TAB_SHOWN;
                        return defpackage.aojh.a;
                    default:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        int i215 = defpackage.mci.a;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1114.b = defpackage.aais.aI("AndroidAutoCreateScreenToFavoritesDataShown", 283037);
                        return defpackage.aojh.a;
                }
            }
        };
        defpackage.aacy aacyVar45 = new defpackage.aacy(null, null, null);
        aonjVar42.a(aacyVar45);
        adcmVar17.h = aacyVar45;
        adcmVar17.i = defpackage.mce.ANDROID_AUTO_PRE_CALL_ACTION_FINISHED;
        adcmVar17.d(set);
        adcmVar17.a = mceVar;
        adcmVar17.f(set3);
        arrayList.add(adcmVar17.c());
        return arrayList;
    }
}
