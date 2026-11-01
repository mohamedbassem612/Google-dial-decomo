package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mea implements defpackage.zaq {
    @Override // defpackage.zaq
    public final java.util.List a() {
        defpackage.adcm adcmVar = new defpackage.adcm(null);
        defpackage.mdu mduVar = new defpackage.mdu(18);
        defpackage.aacy aacyVar = new defpackage.aacy(null, null, null);
        mduVar.a(aacyVar);
        adcmVar.h = aacyVar;
        adcmVar.i = defpackage.mce.USER_CLICKED_VIDEO_CALL_CONTACT_FROM_FAVORITES;
        defpackage.mce mceVar = defpackage.mce.ON_CALL_REMOVED;
        java.util.Set setSingleton = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton, "singleton(...)");
        adcmVar.d(setSingleton);
        final int i = 2;
        defpackage.mce mceVar2 = defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN;
        final int i2 = 0;
        defpackage.mce mceVar3 = defpackage.mce.VIDEO_CALL_SURFACE_RENDERED;
        final int i3 = 1;
        adcmVar.b = defpackage.ajsz.cW(new defpackage.mce[]{mceVar2, mceVar3});
        final int i4 = 20;
        defpackage.mdu mduVar2 = new defpackage.mdu(20);
        defpackage.aacy aacyVar2 = new defpackage.aacy();
        mduVar2.a(aacyVar2);
        java.util.Set setSingleton2 = java.util.Collections.singleton(aacyVar2);
        defpackage.aooh.e(setSingleton2, "singleton(...)");
        adcmVar.e(setSingleton2);
        java.util.Set set = defpackage.mdv.a;
        java.util.Set set2 = defpackage.mdv.a;
        adcmVar.f(set2);
        defpackage.adcm adcmVar2 = new defpackage.adcm(null);
        final int i5 = 11;
        defpackage.aonj aonjVar = new defpackage.aonj() { // from class: mdy
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i5) {
                    case 0:
                        defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                        if (aacyVar3 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar3.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar3.a = defpackage.aais.aI("VideoCallFromSearchedContactToPreCall", 202551);
                        break;
                    case 1:
                        defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                        if (aacyVar4 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar4.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 2:
                        defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                        if (aacyVar5 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar5.b = defpackage.aais.aI("VideoCallFromSuggestedContactsToVideoScreenShown", 202545);
                        break;
                    case 3:
                        defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                        if (aacyVar6 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar6.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 4:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar7.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar7.a = defpackage.aais.aI("VideoCallFromSuggestedContactsToPreCall", 202547);
                        break;
                    case 5:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar8.b = defpackage.aais.aI("VideoCallFromSearchActionToVideoScreenShown", 202553);
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar9.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar10.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar10.a = defpackage.aais.aI("VideoCallFromSearchActionToPreCall", 202555);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar11.b = defpackage.aais.aI("VideoCallFromExternalToVideoScreenShown", 202701);
                        break;
                    case 9:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToVideoScreenShown", 202541);
                        break;
                    case 10:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar13.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("VideoCallFromFrequentsToVideoScreenShown", 202527);
                        break;
                    case 12:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar15.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar15.a = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToPreCall", 202543);
                        break;
                    case 13:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar16.b = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToVideoScreenShown", 202537);
                        break;
                    case 14:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar17.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 15:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar18.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar18.a = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToPreCall", 202539);
                        break;
                    case 16:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("VideoCallFromRecentsToVideoScreenShown", 202523);
                        break;
                    case 17:
                        defpackage.aacy aacyVar20 = (defpackage.aacy) obj;
                        if (aacyVar20 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar20.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 18:
                        defpackage.aacy aacyVar21 = (defpackage.aacy) obj;
                        if (aacyVar21 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar21.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar21.a = defpackage.aais.aI("VideoCallFromRecentsToPreCall", 202525);
                        break;
                    case 19:
                        defpackage.aacy aacyVar22 = (defpackage.aacy) obj;
                        if (aacyVar22 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar22.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    default:
                        defpackage.aacy aacyVar23 = (defpackage.aacy) obj;
                        if (aacyVar23 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar23.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar23.a = defpackage.aais.aI("VideoCallFromFrequentsToPreCall", 202529);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar3 = new defpackage.aacy(null, null, null);
        aonjVar.a(aacyVar3);
        adcmVar2.h = aacyVar3;
        adcmVar2.i = defpackage.mce.USER_CLICKED_VIDEO_CALL_BUTTON_FROM_FREQUENTS;
        java.util.Set setSingleton3 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton3, "singleton(...)");
        adcmVar2.d(setSingleton3);
        adcmVar2.b = defpackage.ajsz.cW(new defpackage.mce[]{mceVar2, mceVar3});
        defpackage.aonj aonjVar2 = new defpackage.aonj() { // from class: mdy
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i4) {
                    case 0:
                        defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                        if (aacyVar4 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar4.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar4.a = defpackage.aais.aI("VideoCallFromSearchedContactToPreCall", 202551);
                        break;
                    case 1:
                        defpackage.aacy aacyVar5 = (defpackage.aacy) obj;
                        if (aacyVar5 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar5.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 2:
                        defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                        if (aacyVar6 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar6.b = defpackage.aais.aI("VideoCallFromSuggestedContactsToVideoScreenShown", 202545);
                        break;
                    case 3:
                        defpackage.aacy aacyVar7 = (defpackage.aacy) obj;
                        if (aacyVar7 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar7.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 4:
                        defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                        if (aacyVar8 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar8.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar8.a = defpackage.aais.aI("VideoCallFromSuggestedContactsToPreCall", 202547);
                        break;
                    case 5:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar9.b = defpackage.aais.aI("VideoCallFromSearchActionToVideoScreenShown", 202553);
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar10.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar11.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar11.a = defpackage.aais.aI("VideoCallFromSearchActionToPreCall", 202555);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("VideoCallFromExternalToVideoScreenShown", 202701);
                        break;
                    case 9:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar13.b = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToVideoScreenShown", 202541);
                        break;
                    case 10:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar14.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("VideoCallFromFrequentsToVideoScreenShown", 202527);
                        break;
                    case 12:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar16.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar16.a = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToPreCall", 202543);
                        break;
                    case 13:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToVideoScreenShown", 202537);
                        break;
                    case 14:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar18.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 15:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar19.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar19.a = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToPreCall", 202539);
                        break;
                    case 16:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("VideoCallFromRecentsToVideoScreenShown", 202523);
                        break;
                    case 17:
                        defpackage.aacy aacyVar20 = (defpackage.aacy) obj;
                        if (aacyVar20 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar20.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 18:
                        defpackage.aacy aacyVar21 = (defpackage.aacy) obj;
                        if (aacyVar21 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar21.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar21.a = defpackage.aais.aI("VideoCallFromRecentsToPreCall", 202525);
                        break;
                    case 19:
                        defpackage.aacy aacyVar22 = (defpackage.aacy) obj;
                        if (aacyVar22 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar22.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    default:
                        defpackage.aacy aacyVar23 = (defpackage.aacy) obj;
                        if (aacyVar23 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar23.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar23.a = defpackage.aais.aI("VideoCallFromFrequentsToPreCall", 202529);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar4 = new defpackage.aacy();
        aonjVar2.a(aacyVar4);
        java.util.Set setSingleton4 = java.util.Collections.singleton(aacyVar4);
        defpackage.aooh.e(setSingleton4, "singleton(...)");
        adcmVar2.e(setSingleton4);
        adcmVar2.f(set2);
        defpackage.adcm adcmVar3 = new defpackage.adcm(null);
        defpackage.mdz mdzVar = new defpackage.mdz(1);
        defpackage.aacy aacyVar5 = new defpackage.aacy(null, null, null);
        mdzVar.a(aacyVar5);
        adcmVar3.h = aacyVar5;
        adcmVar3.i = defpackage.mce.USER_CLICKED_UPGRADE_TO_TRANSMISSION_ONLY_VIDEO_BUTTON;
        java.util.Set setSingleton5 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton5, "singleton(...)");
        adcmVar3.d(setSingleton5);
        defpackage.mdz mdzVar2 = new defpackage.mdz(0);
        defpackage.aacy aacyVar6 = new defpackage.aacy();
        mdzVar2.a(aacyVar6);
        java.util.Set setSingleton6 = java.util.Collections.singleton(aacyVar6);
        defpackage.aooh.e(setSingleton6, "singleton(...)");
        adcmVar3.g(setSingleton6);
        defpackage.mdz mdzVar3 = new defpackage.mdz(2);
        defpackage.ajni ajniVar = new defpackage.ajni(null);
        mdzVar3.a(ajniVar);
        java.util.Set setSingleton7 = java.util.Collections.singleton(ajniVar);
        defpackage.aooh.e(setSingleton7, "singleton(...)");
        adcmVar3.f(setSingleton7);
        defpackage.adcm adcmVar4 = new defpackage.adcm(null);
        final int i6 = 3;
        defpackage.mdz mdzVar4 = new defpackage.mdz(3);
        defpackage.aacy aacyVar7 = new defpackage.aacy(null, null, null);
        mdzVar4.a(aacyVar7);
        adcmVar4.h = aacyVar7;
        adcmVar4.i = defpackage.mce.USER_CLICKED_UPGRADE_TO_CARRIER_VIDEO_BUTTON;
        java.util.Set setSingleton8 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton8, "singleton(...)");
        adcmVar4.d(setSingleton8);
        final int i7 = 4;
        defpackage.mdz mdzVar5 = new defpackage.mdz(4);
        defpackage.aacy aacyVar8 = new defpackage.aacy();
        mdzVar5.a(aacyVar8);
        java.util.Set setSingleton9 = java.util.Collections.singleton(aacyVar8);
        defpackage.aooh.e(setSingleton9, "singleton(...)");
        adcmVar4.g(setSingleton9);
        final int i8 = 5;
        defpackage.mdz mdzVar6 = new defpackage.mdz(5);
        defpackage.ajni ajniVar2 = new defpackage.ajni(null);
        mdzVar6.a(ajniVar2);
        java.util.Set setSingleton10 = java.util.Collections.singleton(ajniVar2);
        defpackage.aooh.e(setSingleton10, "singleton(...)");
        adcmVar4.f(setSingleton10);
        defpackage.adcm adcmVar5 = new defpackage.adcm(null);
        final int i9 = 8;
        defpackage.aonj aonjVar3 = new defpackage.aonj() { // from class: mdy
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i9) {
                    case 0:
                        defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                        if (aacyVar9 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar9.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar9.a = defpackage.aais.aI("VideoCallFromSearchedContactToPreCall", 202551);
                        break;
                    case 1:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar10.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 2:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar11.b = defpackage.aais.aI("VideoCallFromSuggestedContactsToVideoScreenShown", 202545);
                        break;
                    case 3:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar12.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 4:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar13.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar13.a = defpackage.aais.aI("VideoCallFromSuggestedContactsToPreCall", 202547);
                        break;
                    case 5:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar14.b = defpackage.aais.aI("VideoCallFromSearchActionToVideoScreenShown", 202553);
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar15.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar16.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar16.a = defpackage.aais.aI("VideoCallFromSearchActionToPreCall", 202555);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar17.b = defpackage.aais.aI("VideoCallFromExternalToVideoScreenShown", 202701);
                        break;
                    case 9:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToVideoScreenShown", 202541);
                        break;
                    case 10:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar19.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar110.b = defpackage.aais.aI("VideoCallFromFrequentsToVideoScreenShown", 202527);
                        break;
                    case 12:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar111.a = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToPreCall", 202543);
                        break;
                    case 13:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToVideoScreenShown", 202537);
                        break;
                    case 14:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 15:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToPreCall", 202539);
                        break;
                    case 16:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("VideoCallFromRecentsToVideoScreenShown", 202523);
                        break;
                    case 17:
                        defpackage.aacy aacyVar20 = (defpackage.aacy) obj;
                        if (aacyVar20 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar20.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 18:
                        defpackage.aacy aacyVar21 = (defpackage.aacy) obj;
                        if (aacyVar21 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar21.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar21.a = defpackage.aais.aI("VideoCallFromRecentsToPreCall", 202525);
                        break;
                    case 19:
                        defpackage.aacy aacyVar22 = (defpackage.aacy) obj;
                        if (aacyVar22 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar22.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    default:
                        defpackage.aacy aacyVar23 = (defpackage.aacy) obj;
                        if (aacyVar23 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar23.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar23.a = defpackage.aais.aI("VideoCallFromFrequentsToPreCall", 202529);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar9 = new defpackage.aacy(null, null, null);
        aonjVar3.a(aacyVar9);
        adcmVar5.h = aacyVar9;
        adcmVar5.i = defpackage.mce.LAUNCH_PRE_CALL_ACTIVITY_ON_CREATE_VIDEO_CALL;
        java.util.Set setSingleton11 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton11, "singleton(...)");
        adcmVar5.d(setSingleton11);
        final int i10 = 19;
        defpackage.aonj aonjVar4 = new defpackage.aonj() { // from class: mdy
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i10) {
                    case 0:
                        defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                        if (aacyVar10 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar10.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar10.a = defpackage.aais.aI("VideoCallFromSearchedContactToPreCall", 202551);
                        break;
                    case 1:
                        defpackage.aacy aacyVar11 = (defpackage.aacy) obj;
                        if (aacyVar11 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar11.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 2:
                        defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                        if (aacyVar12 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar12.b = defpackage.aais.aI("VideoCallFromSuggestedContactsToVideoScreenShown", 202545);
                        break;
                    case 3:
                        defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                        if (aacyVar13 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar13.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 4:
                        defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                        if (aacyVar14 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar14.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar14.a = defpackage.aais.aI("VideoCallFromSuggestedContactsToPreCall", 202547);
                        break;
                    case 5:
                        defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                        if (aacyVar15 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar15.b = defpackage.aais.aI("VideoCallFromSearchActionToVideoScreenShown", 202553);
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                        if (aacyVar16 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar16.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar17 = (defpackage.aacy) obj;
                        if (aacyVar17 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar17.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar17.a = defpackage.aais.aI("VideoCallFromSearchActionToPreCall", 202555);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar18 = (defpackage.aacy) obj;
                        if (aacyVar18 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar18.b = defpackage.aais.aI("VideoCallFromExternalToVideoScreenShown", 202701);
                        break;
                    case 9:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar19.b = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToVideoScreenShown", 202541);
                        break;
                    case 10:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("VideoCallFromFrequentsToVideoScreenShown", 202527);
                        break;
                    case 12:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar112.a = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToPreCall", 202543);
                        break;
                    case 13:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar113.b = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToVideoScreenShown", 202537);
                        break;
                    case 14:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 15:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar115.a = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToPreCall", 202539);
                        break;
                    case 16:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar116.b = defpackage.aais.aI("VideoCallFromRecentsToVideoScreenShown", 202523);
                        break;
                    case 17:
                        defpackage.aacy aacyVar20 = (defpackage.aacy) obj;
                        if (aacyVar20 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar20.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 18:
                        defpackage.aacy aacyVar21 = (defpackage.aacy) obj;
                        if (aacyVar21 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar21.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar21.a = defpackage.aais.aI("VideoCallFromRecentsToPreCall", 202525);
                        break;
                    case 19:
                        defpackage.aacy aacyVar22 = (defpackage.aacy) obj;
                        if (aacyVar22 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar22.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    default:
                        defpackage.aacy aacyVar23 = (defpackage.aacy) obj;
                        if (aacyVar23 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar23.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar23.a = defpackage.aais.aI("VideoCallFromFrequentsToPreCall", 202529);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar10 = new defpackage.aacy();
        aonjVar4.a(aacyVar10);
        java.util.Set setSingleton12 = java.util.Collections.singleton(aacyVar10);
        defpackage.aooh.e(setSingleton12, "singleton(...)");
        adcmVar5.g(setSingleton12);
        final int i11 = 6;
        defpackage.mdz mdzVar7 = new defpackage.mdz(6);
        defpackage.aacy aacyVar11 = new defpackage.aacy();
        mdzVar7.a(aacyVar11);
        java.util.Set setSingleton13 = java.util.Collections.singleton(aacyVar11);
        defpackage.aooh.e(setSingleton13, "singleton(...)");
        adcmVar5.e(setSingleton13);
        adcmVar5.f(set2);
        defpackage.adcm adcmVar6 = new defpackage.adcm(null);
        final int i12 = 7;
        defpackage.mdz mdzVar8 = new defpackage.mdz(7);
        defpackage.aacy aacyVar12 = new defpackage.aacy(null, null, null);
        mdzVar8.a(aacyVar12);
        adcmVar6.h = aacyVar12;
        adcmVar6.i = defpackage.mce.USER_CLICKED_VIDEO_CALL_BUTTON_FROM_VISUAL_VOICEMAIL;
        java.util.Set setSingleton14 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton14, "singleton(...)");
        adcmVar6.d(setSingleton14);
        defpackage.mdz mdzVar9 = new defpackage.mdz(8);
        defpackage.aacy aacyVar13 = new defpackage.aacy();
        mdzVar9.a(aacyVar13);
        java.util.Set setSingleton15 = java.util.Collections.singleton(aacyVar13);
        defpackage.aooh.e(setSingleton15, "singleton(...)");
        adcmVar6.g(setSingleton15);
        final int i13 = 9;
        defpackage.mdz mdzVar10 = new defpackage.mdz(9);
        defpackage.aacy aacyVar14 = new defpackage.aacy();
        mdzVar10.a(aacyVar14);
        java.util.Set setSingleton16 = java.util.Collections.singleton(aacyVar14);
        defpackage.aooh.e(setSingleton16, "singleton(...)");
        adcmVar6.e(setSingleton16);
        adcmVar6.f(set2);
        defpackage.adcm adcmVar7 = new defpackage.adcm(null);
        defpackage.mdz mdzVar11 = new defpackage.mdz(10);
        defpackage.aacy aacyVar15 = new defpackage.aacy(null, null, null);
        mdzVar11.a(aacyVar15);
        adcmVar7.h = aacyVar15;
        adcmVar7.i = defpackage.mce.USER_CLICKED_VIDEO_CALL_BUTTON_FROM_CALL_HISTORY;
        java.util.Set setSingleton17 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton17, "singleton(...)");
        adcmVar7.d(setSingleton17);
        defpackage.mdz mdzVar12 = new defpackage.mdz(11);
        defpackage.aacy aacyVar16 = new defpackage.aacy();
        mdzVar12.a(aacyVar16);
        java.util.Set setSingleton18 = java.util.Collections.singleton(aacyVar16);
        defpackage.aooh.e(setSingleton18, "singleton(...)");
        adcmVar7.g(setSingleton18);
        final int i14 = 12;
        defpackage.mdz mdzVar13 = new defpackage.mdz(12);
        defpackage.aacy aacyVar17 = new defpackage.aacy();
        mdzVar13.a(aacyVar17);
        java.util.Set setSingleton19 = java.util.Collections.singleton(aacyVar17);
        defpackage.aooh.e(setSingleton19, "singleton(...)");
        adcmVar7.e(setSingleton19);
        adcmVar7.f(set2);
        defpackage.adcm adcmVar8 = new defpackage.adcm(null);
        defpackage.mdu mduVar3 = new defpackage.mdu(19);
        defpackage.aacy aacyVar18 = new defpackage.aacy(null, null, null);
        mduVar3.a(aacyVar18);
        adcmVar8.h = aacyVar18;
        adcmVar8.i = defpackage.mce.USER_CLICKED_VIDEO_CALL_BUTTON_FROM_CONTACT_SEARCH;
        java.util.Set setSingleton20 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton20, "singleton(...)");
        adcmVar8.d(setSingleton20);
        defpackage.aonj aonjVar5 = new defpackage.aonj() { // from class: mdy
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i3) {
                    case 0:
                        defpackage.aacy aacyVar19 = (defpackage.aacy) obj;
                        if (aacyVar19 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar19.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar19.a = defpackage.aais.aI("VideoCallFromSearchedContactToPreCall", 202551);
                        break;
                    case 1:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 2:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar111.b = defpackage.aais.aI("VideoCallFromSuggestedContactsToVideoScreenShown", 202545);
                        break;
                    case 3:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar112.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 4:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar113.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar113.a = defpackage.aais.aI("VideoCallFromSuggestedContactsToPreCall", 202547);
                        break;
                    case 5:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar114.b = defpackage.aais.aI("VideoCallFromSearchActionToVideoScreenShown", 202553);
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar115.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar116.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar116.a = defpackage.aais.aI("VideoCallFromSearchActionToPreCall", 202555);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar117.b = defpackage.aais.aI("VideoCallFromExternalToVideoScreenShown", 202701);
                        break;
                    case 9:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToVideoScreenShown", 202541);
                        break;
                    case 10:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar119.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1110.b = defpackage.aais.aI("VideoCallFromFrequentsToVideoScreenShown", 202527);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1111.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1111.a = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToPreCall", 202543);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1112.b = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToVideoScreenShown", 202537);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 15:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1114.a = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToPreCall", 202539);
                        break;
                    case 16:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1115.b = defpackage.aais.aI("VideoCallFromRecentsToVideoScreenShown", 202523);
                        break;
                    case 17:
                        defpackage.aacy aacyVar20 = (defpackage.aacy) obj;
                        if (aacyVar20 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar20.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 18:
                        defpackage.aacy aacyVar21 = (defpackage.aacy) obj;
                        if (aacyVar21 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar21.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar21.a = defpackage.aais.aI("VideoCallFromRecentsToPreCall", 202525);
                        break;
                    case 19:
                        defpackage.aacy aacyVar22 = (defpackage.aacy) obj;
                        if (aacyVar22 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar22.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    default:
                        defpackage.aacy aacyVar23 = (defpackage.aacy) obj;
                        if (aacyVar23 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar23.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar23.a = defpackage.aais.aI("VideoCallFromFrequentsToPreCall", 202529);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar19 = new defpackage.aacy();
        aonjVar5.a(aacyVar19);
        java.util.Set setSingleton21 = java.util.Collections.singleton(aacyVar19);
        defpackage.aooh.e(setSingleton21, "singleton(...)");
        adcmVar8.g(setSingleton21);
        defpackage.aonj aonjVar6 = new defpackage.aonj() { // from class: mdy
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i2) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VideoCallFromSearchedContactToPreCall", 202551);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("VideoCallFromSuggestedContactsToVideoScreenShown", 202545);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VideoCallFromSuggestedContactsToPreCall", 202547);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("VideoCallFromSearchActionToVideoScreenShown", 202553);
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VideoCallFromSearchActionToPreCall", 202555);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VideoCallFromExternalToVideoScreenShown", 202701);
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToVideoScreenShown", 202541);
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("VideoCallFromFrequentsToVideoScreenShown", 202527);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToPreCall", 202543);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToVideoScreenShown", 202537);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToPreCall", 202539);
                        break;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("VideoCallFromRecentsToVideoScreenShown", 202523);
                        break;
                    case 17:
                        defpackage.aacy aacyVar20 = (defpackage.aacy) obj;
                        if (aacyVar20 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar20.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 18:
                        defpackage.aacy aacyVar21 = (defpackage.aacy) obj;
                        if (aacyVar21 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar21.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar21.a = defpackage.aais.aI("VideoCallFromRecentsToPreCall", 202525);
                        break;
                    case 19:
                        defpackage.aacy aacyVar22 = (defpackage.aacy) obj;
                        if (aacyVar22 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar22.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    default:
                        defpackage.aacy aacyVar23 = (defpackage.aacy) obj;
                        if (aacyVar23 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar23.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar23.a = defpackage.aais.aI("VideoCallFromFrequentsToPreCall", 202529);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar20 = new defpackage.aacy();
        aonjVar6.a(aacyVar20);
        java.util.Set setSingleton22 = java.util.Collections.singleton(aacyVar20);
        defpackage.aooh.e(setSingleton22, "singleton(...)");
        adcmVar8.e(setSingleton22);
        adcmVar8.f(set2);
        defpackage.adcm adcmVar9 = new defpackage.adcm(null);
        defpackage.aonj aonjVar7 = new defpackage.aonj() { // from class: mdy
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VideoCallFromSearchedContactToPreCall", 202551);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("VideoCallFromSuggestedContactsToVideoScreenShown", 202545);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VideoCallFromSuggestedContactsToPreCall", 202547);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("VideoCallFromSearchActionToVideoScreenShown", 202553);
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VideoCallFromSearchActionToPreCall", 202555);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VideoCallFromExternalToVideoScreenShown", 202701);
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToVideoScreenShown", 202541);
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("VideoCallFromFrequentsToVideoScreenShown", 202527);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToPreCall", 202543);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToVideoScreenShown", 202537);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToPreCall", 202539);
                        break;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("VideoCallFromRecentsToVideoScreenShown", 202523);
                        break;
                    case 17:
                        defpackage.aacy aacyVar21 = (defpackage.aacy) obj;
                        if (aacyVar21 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar21.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 18:
                        defpackage.aacy aacyVar22 = (defpackage.aacy) obj;
                        if (aacyVar22 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar22.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar22.a = defpackage.aais.aI("VideoCallFromRecentsToPreCall", 202525);
                        break;
                    case 19:
                        defpackage.aacy aacyVar23 = (defpackage.aacy) obj;
                        if (aacyVar23 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar23.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    default:
                        defpackage.aacy aacyVar24 = (defpackage.aacy) obj;
                        if (aacyVar24 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar24.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar24.a = defpackage.aais.aI("VideoCallFromFrequentsToPreCall", 202529);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar21 = new defpackage.aacy(null, null, null);
        aonjVar7.a(aacyVar21);
        adcmVar9.h = aacyVar21;
        adcmVar9.i = defpackage.mce.USER_CLICKED_VIDEO_CALL_BUTTON_FROM_SUGGESTED_SEARCH;
        java.util.Set setSingleton23 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton23, "singleton(...)");
        adcmVar9.d(setSingleton23);
        defpackage.aonj aonjVar8 = new defpackage.aonj() { // from class: mdy
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i6) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VideoCallFromSearchedContactToPreCall", 202551);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("VideoCallFromSuggestedContactsToVideoScreenShown", 202545);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VideoCallFromSuggestedContactsToPreCall", 202547);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("VideoCallFromSearchActionToVideoScreenShown", 202553);
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VideoCallFromSearchActionToPreCall", 202555);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VideoCallFromExternalToVideoScreenShown", 202701);
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToVideoScreenShown", 202541);
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("VideoCallFromFrequentsToVideoScreenShown", 202527);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToPreCall", 202543);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToVideoScreenShown", 202537);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToPreCall", 202539);
                        break;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("VideoCallFromRecentsToVideoScreenShown", 202523);
                        break;
                    case 17:
                        defpackage.aacy aacyVar22 = (defpackage.aacy) obj;
                        if (aacyVar22 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar22.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 18:
                        defpackage.aacy aacyVar23 = (defpackage.aacy) obj;
                        if (aacyVar23 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar23.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar23.a = defpackage.aais.aI("VideoCallFromRecentsToPreCall", 202525);
                        break;
                    case 19:
                        defpackage.aacy aacyVar24 = (defpackage.aacy) obj;
                        if (aacyVar24 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar24.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    default:
                        defpackage.aacy aacyVar25 = (defpackage.aacy) obj;
                        if (aacyVar25 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar25.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar25.a = defpackage.aais.aI("VideoCallFromFrequentsToPreCall", 202529);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar22 = new defpackage.aacy();
        aonjVar8.a(aacyVar22);
        java.util.Set setSingleton24 = java.util.Collections.singleton(aacyVar22);
        defpackage.aooh.e(setSingleton24, "singleton(...)");
        adcmVar9.g(setSingleton24);
        defpackage.aonj aonjVar9 = new defpackage.aonj() { // from class: mdy
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i7) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VideoCallFromSearchedContactToPreCall", 202551);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("VideoCallFromSuggestedContactsToVideoScreenShown", 202545);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VideoCallFromSuggestedContactsToPreCall", 202547);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("VideoCallFromSearchActionToVideoScreenShown", 202553);
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VideoCallFromSearchActionToPreCall", 202555);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VideoCallFromExternalToVideoScreenShown", 202701);
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToVideoScreenShown", 202541);
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("VideoCallFromFrequentsToVideoScreenShown", 202527);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToPreCall", 202543);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToVideoScreenShown", 202537);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToPreCall", 202539);
                        break;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("VideoCallFromRecentsToVideoScreenShown", 202523);
                        break;
                    case 17:
                        defpackage.aacy aacyVar23 = (defpackage.aacy) obj;
                        if (aacyVar23 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar23.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 18:
                        defpackage.aacy aacyVar24 = (defpackage.aacy) obj;
                        if (aacyVar24 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar24.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar24.a = defpackage.aais.aI("VideoCallFromRecentsToPreCall", 202525);
                        break;
                    case 19:
                        defpackage.aacy aacyVar25 = (defpackage.aacy) obj;
                        if (aacyVar25 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar25.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    default:
                        defpackage.aacy aacyVar26 = (defpackage.aacy) obj;
                        if (aacyVar26 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar26.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar26.a = defpackage.aais.aI("VideoCallFromFrequentsToPreCall", 202529);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar23 = new defpackage.aacy();
        aonjVar9.a(aacyVar23);
        java.util.Set setSingleton25 = java.util.Collections.singleton(aacyVar23);
        defpackage.aooh.e(setSingleton25, "singleton(...)");
        adcmVar9.e(setSingleton25);
        adcmVar9.f(set2);
        defpackage.adcm adcmVar10 = new defpackage.adcm(null);
        defpackage.aonj aonjVar10 = new defpackage.aonj() { // from class: mdy
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i8) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VideoCallFromSearchedContactToPreCall", 202551);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("VideoCallFromSuggestedContactsToVideoScreenShown", 202545);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VideoCallFromSuggestedContactsToPreCall", 202547);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("VideoCallFromSearchActionToVideoScreenShown", 202553);
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VideoCallFromSearchActionToPreCall", 202555);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VideoCallFromExternalToVideoScreenShown", 202701);
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToVideoScreenShown", 202541);
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("VideoCallFromFrequentsToVideoScreenShown", 202527);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToPreCall", 202543);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToVideoScreenShown", 202537);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToPreCall", 202539);
                        break;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("VideoCallFromRecentsToVideoScreenShown", 202523);
                        break;
                    case 17:
                        defpackage.aacy aacyVar24 = (defpackage.aacy) obj;
                        if (aacyVar24 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar24.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 18:
                        defpackage.aacy aacyVar25 = (defpackage.aacy) obj;
                        if (aacyVar25 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar25.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar25.a = defpackage.aais.aI("VideoCallFromRecentsToPreCall", 202525);
                        break;
                    case 19:
                        defpackage.aacy aacyVar26 = (defpackage.aacy) obj;
                        if (aacyVar26 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar26.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    default:
                        defpackage.aacy aacyVar27 = (defpackage.aacy) obj;
                        if (aacyVar27 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar27.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar27.a = defpackage.aais.aI("VideoCallFromFrequentsToPreCall", 202529);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar24 = new defpackage.aacy(null, null, null);
        aonjVar10.a(aacyVar24);
        adcmVar10.h = aacyVar24;
        adcmVar10.i = defpackage.mce.USER_CLICKED_VIDEO_CALL_BUTTON_FROM_SEARCH_ACTION;
        java.util.Set setSingleton26 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton26, "singleton(...)");
        adcmVar10.d(setSingleton26);
        defpackage.aonj aonjVar11 = new defpackage.aonj() { // from class: mdy
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i11) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VideoCallFromSearchedContactToPreCall", 202551);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("VideoCallFromSuggestedContactsToVideoScreenShown", 202545);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VideoCallFromSuggestedContactsToPreCall", 202547);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("VideoCallFromSearchActionToVideoScreenShown", 202553);
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VideoCallFromSearchActionToPreCall", 202555);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VideoCallFromExternalToVideoScreenShown", 202701);
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToVideoScreenShown", 202541);
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("VideoCallFromFrequentsToVideoScreenShown", 202527);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToPreCall", 202543);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToVideoScreenShown", 202537);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToPreCall", 202539);
                        break;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("VideoCallFromRecentsToVideoScreenShown", 202523);
                        break;
                    case 17:
                        defpackage.aacy aacyVar25 = (defpackage.aacy) obj;
                        if (aacyVar25 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar25.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 18:
                        defpackage.aacy aacyVar26 = (defpackage.aacy) obj;
                        if (aacyVar26 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar26.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar26.a = defpackage.aais.aI("VideoCallFromRecentsToPreCall", 202525);
                        break;
                    case 19:
                        defpackage.aacy aacyVar27 = (defpackage.aacy) obj;
                        if (aacyVar27 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar27.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    default:
                        defpackage.aacy aacyVar28 = (defpackage.aacy) obj;
                        if (aacyVar28 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar28.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar28.a = defpackage.aais.aI("VideoCallFromFrequentsToPreCall", 202529);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar25 = new defpackage.aacy();
        aonjVar11.a(aacyVar25);
        java.util.Set setSingleton27 = java.util.Collections.singleton(aacyVar25);
        defpackage.aooh.e(setSingleton27, "singleton(...)");
        adcmVar10.g(setSingleton27);
        defpackage.aonj aonjVar12 = new defpackage.aonj() { // from class: mdy
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i12) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VideoCallFromSearchedContactToPreCall", 202551);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("VideoCallFromSuggestedContactsToVideoScreenShown", 202545);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VideoCallFromSuggestedContactsToPreCall", 202547);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("VideoCallFromSearchActionToVideoScreenShown", 202553);
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VideoCallFromSearchActionToPreCall", 202555);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VideoCallFromExternalToVideoScreenShown", 202701);
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToVideoScreenShown", 202541);
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("VideoCallFromFrequentsToVideoScreenShown", 202527);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToPreCall", 202543);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToVideoScreenShown", 202537);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToPreCall", 202539);
                        break;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("VideoCallFromRecentsToVideoScreenShown", 202523);
                        break;
                    case 17:
                        defpackage.aacy aacyVar26 = (defpackage.aacy) obj;
                        if (aacyVar26 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar26.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 18:
                        defpackage.aacy aacyVar27 = (defpackage.aacy) obj;
                        if (aacyVar27 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar27.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar27.a = defpackage.aais.aI("VideoCallFromRecentsToPreCall", 202525);
                        break;
                    case 19:
                        defpackage.aacy aacyVar28 = (defpackage.aacy) obj;
                        if (aacyVar28 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar28.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    default:
                        defpackage.aacy aacyVar29 = (defpackage.aacy) obj;
                        if (aacyVar29 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar29.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar29.a = defpackage.aais.aI("VideoCallFromFrequentsToPreCall", 202529);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar26 = new defpackage.aacy();
        aonjVar12.a(aacyVar26);
        java.util.Set setSingleton28 = java.util.Collections.singleton(aacyVar26);
        defpackage.aooh.e(setSingleton28, "singleton(...)");
        adcmVar10.e(setSingleton28);
        adcmVar10.f(set2);
        defpackage.adcm adcmVar11 = new defpackage.adcm(null);
        defpackage.aonj aonjVar13 = new defpackage.aonj() { // from class: mdy
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i13) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VideoCallFromSearchedContactToPreCall", 202551);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("VideoCallFromSuggestedContactsToVideoScreenShown", 202545);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VideoCallFromSuggestedContactsToPreCall", 202547);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("VideoCallFromSearchActionToVideoScreenShown", 202553);
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VideoCallFromSearchActionToPreCall", 202555);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VideoCallFromExternalToVideoScreenShown", 202701);
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToVideoScreenShown", 202541);
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("VideoCallFromFrequentsToVideoScreenShown", 202527);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToPreCall", 202543);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToVideoScreenShown", 202537);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToPreCall", 202539);
                        break;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("VideoCallFromRecentsToVideoScreenShown", 202523);
                        break;
                    case 17:
                        defpackage.aacy aacyVar27 = (defpackage.aacy) obj;
                        if (aacyVar27 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar27.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 18:
                        defpackage.aacy aacyVar28 = (defpackage.aacy) obj;
                        if (aacyVar28 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar28.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar28.a = defpackage.aais.aI("VideoCallFromRecentsToPreCall", 202525);
                        break;
                    case 19:
                        defpackage.aacy aacyVar29 = (defpackage.aacy) obj;
                        if (aacyVar29 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar29.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    default:
                        defpackage.aacy aacyVar210 = (defpackage.aacy) obj;
                        if (aacyVar210 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar210.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar210.a = defpackage.aais.aI("VideoCallFromFrequentsToPreCall", 202529);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar27 = new defpackage.aacy(null, null, null);
        aonjVar13.a(aacyVar27);
        adcmVar11.h = aacyVar27;
        adcmVar11.i = defpackage.mce.USER_CLICKED_VIDEO_CALL_BUTTON_FROM_FAVORITES_POPUP_WINDOW;
        java.util.Set setSingleton29 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton29, "singleton(...)");
        adcmVar11.d(setSingleton29);
        final int i15 = 10;
        defpackage.aonj aonjVar14 = new defpackage.aonj() { // from class: mdy
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i15) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VideoCallFromSearchedContactToPreCall", 202551);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("VideoCallFromSuggestedContactsToVideoScreenShown", 202545);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VideoCallFromSuggestedContactsToPreCall", 202547);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("VideoCallFromSearchActionToVideoScreenShown", 202553);
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VideoCallFromSearchActionToPreCall", 202555);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VideoCallFromExternalToVideoScreenShown", 202701);
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToVideoScreenShown", 202541);
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("VideoCallFromFrequentsToVideoScreenShown", 202527);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToPreCall", 202543);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToVideoScreenShown", 202537);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToPreCall", 202539);
                        break;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("VideoCallFromRecentsToVideoScreenShown", 202523);
                        break;
                    case 17:
                        defpackage.aacy aacyVar28 = (defpackage.aacy) obj;
                        if (aacyVar28 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar28.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 18:
                        defpackage.aacy aacyVar29 = (defpackage.aacy) obj;
                        if (aacyVar29 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar29.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar29.a = defpackage.aais.aI("VideoCallFromRecentsToPreCall", 202525);
                        break;
                    case 19:
                        defpackage.aacy aacyVar210 = (defpackage.aacy) obj;
                        if (aacyVar210 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar210.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    default:
                        defpackage.aacy aacyVar211 = (defpackage.aacy) obj;
                        if (aacyVar211 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar211.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar211.a = defpackage.aais.aI("VideoCallFromFrequentsToPreCall", 202529);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar28 = new defpackage.aacy();
        aonjVar14.a(aacyVar28);
        java.util.Set setSingleton30 = java.util.Collections.singleton(aacyVar28);
        defpackage.aooh.e(setSingleton30, "singleton(...)");
        adcmVar11.g(setSingleton30);
        defpackage.aonj aonjVar15 = new defpackage.aonj() { // from class: mdy
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i14) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VideoCallFromSearchedContactToPreCall", 202551);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("VideoCallFromSuggestedContactsToVideoScreenShown", 202545);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VideoCallFromSuggestedContactsToPreCall", 202547);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("VideoCallFromSearchActionToVideoScreenShown", 202553);
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VideoCallFromSearchActionToPreCall", 202555);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VideoCallFromExternalToVideoScreenShown", 202701);
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToVideoScreenShown", 202541);
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("VideoCallFromFrequentsToVideoScreenShown", 202527);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToPreCall", 202543);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToVideoScreenShown", 202537);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToPreCall", 202539);
                        break;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("VideoCallFromRecentsToVideoScreenShown", 202523);
                        break;
                    case 17:
                        defpackage.aacy aacyVar29 = (defpackage.aacy) obj;
                        if (aacyVar29 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar29.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 18:
                        defpackage.aacy aacyVar210 = (defpackage.aacy) obj;
                        if (aacyVar210 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar210.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar210.a = defpackage.aais.aI("VideoCallFromRecentsToPreCall", 202525);
                        break;
                    case 19:
                        defpackage.aacy aacyVar211 = (defpackage.aacy) obj;
                        if (aacyVar211 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar211.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    default:
                        defpackage.aacy aacyVar212 = (defpackage.aacy) obj;
                        if (aacyVar212 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar212.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar212.a = defpackage.aais.aI("VideoCallFromFrequentsToPreCall", 202529);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar29 = new defpackage.aacy();
        aonjVar15.a(aacyVar29);
        java.util.Set setSingleton31 = java.util.Collections.singleton(aacyVar29);
        defpackage.aooh.e(setSingleton31, "singleton(...)");
        adcmVar11.e(setSingleton31);
        adcmVar11.f(set2);
        defpackage.adcm adcmVar12 = new defpackage.adcm(null);
        final int i16 = 13;
        defpackage.aonj aonjVar16 = new defpackage.aonj() { // from class: mdy
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i16) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VideoCallFromSearchedContactToPreCall", 202551);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("VideoCallFromSuggestedContactsToVideoScreenShown", 202545);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VideoCallFromSuggestedContactsToPreCall", 202547);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("VideoCallFromSearchActionToVideoScreenShown", 202553);
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VideoCallFromSearchActionToPreCall", 202555);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VideoCallFromExternalToVideoScreenShown", 202701);
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToVideoScreenShown", 202541);
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("VideoCallFromFrequentsToVideoScreenShown", 202527);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToPreCall", 202543);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToVideoScreenShown", 202537);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToPreCall", 202539);
                        break;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("VideoCallFromRecentsToVideoScreenShown", 202523);
                        break;
                    case 17:
                        defpackage.aacy aacyVar210 = (defpackage.aacy) obj;
                        if (aacyVar210 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar210.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 18:
                        defpackage.aacy aacyVar211 = (defpackage.aacy) obj;
                        if (aacyVar211 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar211.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar211.a = defpackage.aais.aI("VideoCallFromRecentsToPreCall", 202525);
                        break;
                    case 19:
                        defpackage.aacy aacyVar212 = (defpackage.aacy) obj;
                        if (aacyVar212 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar212.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    default:
                        defpackage.aacy aacyVar213 = (defpackage.aacy) obj;
                        if (aacyVar213 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar213.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar213.a = defpackage.aais.aI("VideoCallFromFrequentsToPreCall", 202529);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar30 = new defpackage.aacy(null, null, null);
        aonjVar16.a(aacyVar30);
        adcmVar12.h = aacyVar30;
        adcmVar12.i = defpackage.mce.USER_CLICKED_VIDEO_CALL_BUTTON_FROM_FAVORITES_DISAMBIG_DIALOG;
        java.util.Set setSingleton32 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton32, "singleton(...)");
        adcmVar12.d(setSingleton32);
        final int i17 = 14;
        defpackage.aonj aonjVar17 = new defpackage.aonj() { // from class: mdy
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i17) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VideoCallFromSearchedContactToPreCall", 202551);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("VideoCallFromSuggestedContactsToVideoScreenShown", 202545);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VideoCallFromSuggestedContactsToPreCall", 202547);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("VideoCallFromSearchActionToVideoScreenShown", 202553);
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VideoCallFromSearchActionToPreCall", 202555);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VideoCallFromExternalToVideoScreenShown", 202701);
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToVideoScreenShown", 202541);
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("VideoCallFromFrequentsToVideoScreenShown", 202527);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToPreCall", 202543);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToVideoScreenShown", 202537);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToPreCall", 202539);
                        break;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("VideoCallFromRecentsToVideoScreenShown", 202523);
                        break;
                    case 17:
                        defpackage.aacy aacyVar210 = (defpackage.aacy) obj;
                        if (aacyVar210 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar210.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 18:
                        defpackage.aacy aacyVar211 = (defpackage.aacy) obj;
                        if (aacyVar211 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar211.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar211.a = defpackage.aais.aI("VideoCallFromRecentsToPreCall", 202525);
                        break;
                    case 19:
                        defpackage.aacy aacyVar212 = (defpackage.aacy) obj;
                        if (aacyVar212 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar212.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    default:
                        defpackage.aacy aacyVar213 = (defpackage.aacy) obj;
                        if (aacyVar213 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar213.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar213.a = defpackage.aais.aI("VideoCallFromFrequentsToPreCall", 202529);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar31 = new defpackage.aacy();
        aonjVar17.a(aacyVar31);
        java.util.Set setSingleton33 = java.util.Collections.singleton(aacyVar31);
        defpackage.aooh.e(setSingleton33, "singleton(...)");
        adcmVar12.g(setSingleton33);
        final int i18 = 15;
        defpackage.aonj aonjVar18 = new defpackage.aonj() { // from class: mdy
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i18) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VideoCallFromSearchedContactToPreCall", 202551);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("VideoCallFromSuggestedContactsToVideoScreenShown", 202545);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VideoCallFromSuggestedContactsToPreCall", 202547);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("VideoCallFromSearchActionToVideoScreenShown", 202553);
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VideoCallFromSearchActionToPreCall", 202555);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VideoCallFromExternalToVideoScreenShown", 202701);
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToVideoScreenShown", 202541);
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("VideoCallFromFrequentsToVideoScreenShown", 202527);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToPreCall", 202543);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToVideoScreenShown", 202537);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToPreCall", 202539);
                        break;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("VideoCallFromRecentsToVideoScreenShown", 202523);
                        break;
                    case 17:
                        defpackage.aacy aacyVar210 = (defpackage.aacy) obj;
                        if (aacyVar210 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar210.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 18:
                        defpackage.aacy aacyVar211 = (defpackage.aacy) obj;
                        if (aacyVar211 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar211.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar211.a = defpackage.aais.aI("VideoCallFromRecentsToPreCall", 202525);
                        break;
                    case 19:
                        defpackage.aacy aacyVar212 = (defpackage.aacy) obj;
                        if (aacyVar212 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar212.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    default:
                        defpackage.aacy aacyVar213 = (defpackage.aacy) obj;
                        if (aacyVar213 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar213.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar213.a = defpackage.aais.aI("VideoCallFromFrequentsToPreCall", 202529);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar32 = new defpackage.aacy();
        aonjVar18.a(aacyVar32);
        java.util.Set setSingleton34 = java.util.Collections.singleton(aacyVar32);
        defpackage.aooh.e(setSingleton34, "singleton(...)");
        adcmVar12.e(setSingleton34);
        adcmVar12.f(set2);
        defpackage.adcm adcmVar13 = new defpackage.adcm(null);
        final int i19 = 16;
        defpackage.aonj aonjVar19 = new defpackage.aonj() { // from class: mdy
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i19) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VideoCallFromSearchedContactToPreCall", 202551);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("VideoCallFromSuggestedContactsToVideoScreenShown", 202545);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VideoCallFromSuggestedContactsToPreCall", 202547);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("VideoCallFromSearchActionToVideoScreenShown", 202553);
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VideoCallFromSearchActionToPreCall", 202555);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VideoCallFromExternalToVideoScreenShown", 202701);
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToVideoScreenShown", 202541);
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("VideoCallFromFrequentsToVideoScreenShown", 202527);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToPreCall", 202543);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToVideoScreenShown", 202537);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToPreCall", 202539);
                        break;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("VideoCallFromRecentsToVideoScreenShown", 202523);
                        break;
                    case 17:
                        defpackage.aacy aacyVar210 = (defpackage.aacy) obj;
                        if (aacyVar210 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar210.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 18:
                        defpackage.aacy aacyVar211 = (defpackage.aacy) obj;
                        if (aacyVar211 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar211.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar211.a = defpackage.aais.aI("VideoCallFromRecentsToPreCall", 202525);
                        break;
                    case 19:
                        defpackage.aacy aacyVar212 = (defpackage.aacy) obj;
                        if (aacyVar212 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar212.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    default:
                        defpackage.aacy aacyVar213 = (defpackage.aacy) obj;
                        if (aacyVar213 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar213.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar213.a = defpackage.aais.aI("VideoCallFromFrequentsToPreCall", 202529);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar33 = new defpackage.aacy(null, null, null);
        aonjVar19.a(aacyVar33);
        adcmVar13.h = aacyVar33;
        adcmVar13.i = defpackage.mce.USER_CLICKED_VIDEO_CALL_BUTTON_FROM_RECENTS;
        java.util.Set setSingleton35 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton35, "singleton(...)");
        adcmVar13.d(setSingleton35);
        final int i20 = 17;
        defpackage.aonj aonjVar20 = new defpackage.aonj() { // from class: mdy
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i20) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VideoCallFromSearchedContactToPreCall", 202551);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("VideoCallFromSuggestedContactsToVideoScreenShown", 202545);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VideoCallFromSuggestedContactsToPreCall", 202547);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("VideoCallFromSearchActionToVideoScreenShown", 202553);
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VideoCallFromSearchActionToPreCall", 202555);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VideoCallFromExternalToVideoScreenShown", 202701);
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToVideoScreenShown", 202541);
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("VideoCallFromFrequentsToVideoScreenShown", 202527);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToPreCall", 202543);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToVideoScreenShown", 202537);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToPreCall", 202539);
                        break;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("VideoCallFromRecentsToVideoScreenShown", 202523);
                        break;
                    case 17:
                        defpackage.aacy aacyVar210 = (defpackage.aacy) obj;
                        if (aacyVar210 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar210.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 18:
                        defpackage.aacy aacyVar211 = (defpackage.aacy) obj;
                        if (aacyVar211 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar211.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar211.a = defpackage.aais.aI("VideoCallFromRecentsToPreCall", 202525);
                        break;
                    case 19:
                        defpackage.aacy aacyVar212 = (defpackage.aacy) obj;
                        if (aacyVar212 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar212.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    default:
                        defpackage.aacy aacyVar213 = (defpackage.aacy) obj;
                        if (aacyVar213 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar213.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar213.a = defpackage.aais.aI("VideoCallFromFrequentsToPreCall", 202529);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar34 = new defpackage.aacy();
        aonjVar20.a(aacyVar34);
        java.util.Set setSingleton36 = java.util.Collections.singleton(aacyVar34);
        defpackage.aooh.e(setSingleton36, "singleton(...)");
        adcmVar13.g(setSingleton36);
        final int i21 = 18;
        defpackage.aonj aonjVar21 = new defpackage.aonj() { // from class: mdy
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                switch (i21) {
                    case 0:
                        defpackage.aacy aacyVar110 = (defpackage.aacy) obj;
                        if (aacyVar110 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar110.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar110.a = defpackage.aais.aI("VideoCallFromSearchedContactToPreCall", 202551);
                        break;
                    case 1:
                        defpackage.aacy aacyVar111 = (defpackage.aacy) obj;
                        if (aacyVar111 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar111.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 2:
                        defpackage.aacy aacyVar112 = (defpackage.aacy) obj;
                        if (aacyVar112 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar112.b = defpackage.aais.aI("VideoCallFromSuggestedContactsToVideoScreenShown", 202545);
                        break;
                    case 3:
                        defpackage.aacy aacyVar113 = (defpackage.aacy) obj;
                        if (aacyVar113 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar113.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 4:
                        defpackage.aacy aacyVar114 = (defpackage.aacy) obj;
                        if (aacyVar114 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar114.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar114.a = defpackage.aais.aI("VideoCallFromSuggestedContactsToPreCall", 202547);
                        break;
                    case 5:
                        defpackage.aacy aacyVar115 = (defpackage.aacy) obj;
                        if (aacyVar115 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar115.b = defpackage.aais.aI("VideoCallFromSearchActionToVideoScreenShown", 202553);
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.aacy aacyVar116 = (defpackage.aacy) obj;
                        if (aacyVar116 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar116.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.aacy aacyVar117 = (defpackage.aacy) obj;
                        if (aacyVar117 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar117.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar117.a = defpackage.aais.aI("VideoCallFromSearchActionToPreCall", 202555);
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.aacy aacyVar118 = (defpackage.aacy) obj;
                        if (aacyVar118 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar118.b = defpackage.aais.aI("VideoCallFromExternalToVideoScreenShown", 202701);
                        break;
                    case 9:
                        defpackage.aacy aacyVar119 = (defpackage.aacy) obj;
                        if (aacyVar119 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar119.b = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToVideoScreenShown", 202541);
                        break;
                    case 10:
                        defpackage.aacy aacyVar1110 = (defpackage.aacy) obj;
                        if (aacyVar1110 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1110.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 11:
                        defpackage.aacy aacyVar1111 = (defpackage.aacy) obj;
                        if (aacyVar1111 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1111.b = defpackage.aais.aI("VideoCallFromFrequentsToVideoScreenShown", 202527);
                        break;
                    case 12:
                        defpackage.aacy aacyVar1112 = (defpackage.aacy) obj;
                        if (aacyVar1112 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1112.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1112.a = defpackage.aais.aI("VideoCallFromFavoritesPopUpWindowToPreCall", 202543);
                        break;
                    case 13:
                        defpackage.aacy aacyVar1113 = (defpackage.aacy) obj;
                        if (aacyVar1113 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1113.b = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToVideoScreenShown", 202537);
                        break;
                    case 14:
                        defpackage.aacy aacyVar1114 = (defpackage.aacy) obj;
                        if (aacyVar1114 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar1114.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 15:
                        defpackage.aacy aacyVar1115 = (defpackage.aacy) obj;
                        if (aacyVar1115 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar1115.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar1115.a = defpackage.aais.aI("VideoCallFromFavoritesChannelSelectionToPreCall", 202539);
                        break;
                    case 16:
                        defpackage.aacy aacyVar1116 = (defpackage.aacy) obj;
                        if (aacyVar1116 == null) {
                            defpackage.aooh.i("$this$defaultCuiMapping");
                        }
                        aacyVar1116.b = defpackage.aais.aI("VideoCallFromRecentsToVideoScreenShown", 202523);
                        break;
                    case 17:
                        defpackage.aacy aacyVar210 = (defpackage.aacy) obj;
                        if (aacyVar210 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar210.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    case 18:
                        defpackage.aacy aacyVar211 = (defpackage.aacy) obj;
                        if (aacyVar211 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar211.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar211.a = defpackage.aais.aI("VideoCallFromRecentsToPreCall", 202525);
                        break;
                    case 19:
                        defpackage.aacy aacyVar212 = (defpackage.aacy) obj;
                        if (aacyVar212 == null) {
                            defpackage.aooh.i("$this$multiEventEnd");
                        }
                        aacyVar212.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.VIDEO_CALL_SURFACE_RENDERED});
                        break;
                    default:
                        defpackage.aacy aacyVar213 = (defpackage.aacy) obj;
                        if (aacyVar213 == null) {
                            defpackage.aooh.i("$this$end");
                        }
                        aacyVar213.b = defpackage.mce.PRE_CALL_UI_SHOWN;
                        aacyVar213.a = defpackage.aais.aI("VideoCallFromFrequentsToPreCall", 202529);
                        break;
                }
                return defpackage.aojh.a;
            }
        };
        defpackage.aacy aacyVar35 = new defpackage.aacy();
        aonjVar21.a(aacyVar35);
        java.util.Set setSingleton37 = java.util.Collections.singleton(aacyVar35);
        defpackage.aooh.e(setSingleton37, "singleton(...)");
        adcmVar13.e(setSingleton37);
        adcmVar13.f(set2);
        java.util.List listAsList = java.util.Arrays.asList(adcmVar.c(), adcmVar2.c(), adcmVar3.c(), adcmVar4.c(), adcmVar5.c(), adcmVar6.c(), adcmVar7.c(), adcmVar8.c(), adcmVar9.c(), adcmVar10.c(), adcmVar11.c(), adcmVar12.c(), adcmVar13.c());
        defpackage.aooh.e(listAsList, "asList(...)");
        return listAsList;
    }
}
