package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ovt extends defpackage.aoof implements defpackage.aomy {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovt(java.lang.Object obj, int i, byte[] bArr) {
        super(0, obj, nts.class, "onLlmGeneratedContentConsentDialogDismissRequested", "onLlmGeneratedContentConsentDialogDismissRequested()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x02ca  */
    /* JADX WARN: Type inference failed for: r3v27, types: [aoss, java.lang.Object] */
    @Override // defpackage.aomy
    public final /* synthetic */ java.lang.Object a() throws java.io.IOException {
        int iAR;
        int iAW;
        int iAR2;
        boolean z = true;
        switch (this.$cid) {
            case 0:
                ovu ovuVar = (ovu) this.e;
                ovuVar.b.o(defpackage.rmx.MARQUEE_INCOMING_CALL_GESTURE_PROMO_ACTION_CLICKED);
                defpackage.ipc ipcVar = ovuVar.c;
                ryg rygVarAU = defpackage.pez.aU(rvq.a.m());
                ryg rygVarAS = defpackage.pez.aS(rvo.a.m());
                rygVarAS.k(rvc.r);
                ryg rygVarAT = defpackage.pez.aT(rve.a.m());
                rygVarAT.m();
                rygVarAS.j(rygVarAT.l());
                rygVarAU.o(rygVarAS.i());
                android.content.Intent intentAddFlags = ipcVar.aL(rygVarAU.n()).addFlags(268435456);
                defpackage.aooh.e(intentAddFlags, "addFlags(...)");
                defpackage.ahqx.l(ovuVar.a, intentAddFlags);
                return defpackage.aojh.a;
            case 1:
                nts ntsVar = (nts) this.e;
                ((defpackage.aimw) nts.a.b().l("com/android/dialer/dobby/impl/ui/DobbyInCallFragmentPeer", "onLlmGeneratedContentConsentDialogDismissRequested", 295, "DobbyInCallFragmentPeer.kt")).v("LLM generated content consent dialog dismiss requested");
                defpackage.aoov.an(ntsVar.d, null, 0, new defpackage.nto(ntsVar, (defpackage.aoln) null, 3, (char[]) null), 3);
                ntsVar.e();
                return defpackage.aojh.a;
            case 2:
                ((defpackage.gpd) ((defpackage.rsr) this.e).b).i(null).b(defpackage.mce.BANNER_FRAGMENT_ON_CREATE);
                return defpackage.aojh.a;
            case 3:
                ((defpackage.gpd) ((defpackage.rsr) this.e).b).i(null).b(defpackage.mce.BANNER_HAS_NO_ENTRY_TO_SHOW);
                return defpackage.aojh.a;
            case 4:
                ((defpackage.rrz) this.e).f();
                return defpackage.aojh.a;
            case 5:
                ryl rylVar = (ryl) this.e;
                rylVar.m.o(defpackage.rmx.MY_CALLING_CARD_SHARING_EDIT_CLICKED);
                rylVar.l.d();
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ((sjf) ((rze) this.e).a).a().a(0, (android.content.Intent) null);
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.sby sbyVar = (defpackage.sby) this.e;
                defpackage.ipc ipcVar2 = sbyVar.c;
                ryg rygVarAU2 = defpackage.pez.aU(rvq.a.m());
                ryg rygVarAS2 = defpackage.pez.aS(rvo.a.m());
                rygVarAS2.k(rvc.H);
                rygVarAU2.o(rygVarAS2.i());
                android.content.Intent intentAddFlags2 = ipcVar2.aL(rygVarAU2.n()).addFlags(268435456);
                defpackage.aooh.e(intentAddFlags2, "addFlags(...)");
                sbyVar.b.o(defpackage.rmx.PATRICK_PROMO_MARQUEE_CLICKED_FROM_RECENTS_TAB);
                defpackage.ahqx.l(sbyVar.a, intentAddFlags2);
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                sca scaVar = (sca) this.e;
                defpackage.ipc ipcVar3 = scaVar.c;
                ryg rygVarAU3 = defpackage.pez.aU(rvq.a.m());
                ryg rygVarAS3 = defpackage.pez.aS(rvo.a.m());
                rygVarAS3.k(rvc.H);
                rygVarAU3.o(rygVarAS3.i());
                android.content.Intent intentAddFlags3 = ipcVar3.aL(rygVarAU3.n()).addFlags(268435456);
                defpackage.aooh.e(intentAddFlags3, "addFlags(...)");
                scaVar.b.o(defpackage.rmx.MY_CALLING_CARD_PROMO_MARQUEE_CLICKED_FROM_RECENTS_TAB);
                defpackage.ahqx.l(scaVar.a, intentAddFlags3);
                return defpackage.aojh.a;
            case 9:
                sfz sfzVar = (sfz) this.e;
                ((defpackage.aimw) sfz.a.b().l("com/android/dialer/patrick/impl/settings/ui/CallingCardSettingsFragmentPeer", "onAddButtonClick", 274, "CallingCardSettingsFragmentPeer.kt")).v("onAddButtonClick");
                sfzVar.h.o(defpackage.rmx.PATRICK_SETTINGS_ADD_BUTTON_CLICKED);
                defpackage.aoov.an(sfzVar.f, null, 0, new sge(sfzVar, (defpackage.aoln) null, 1), 3);
                return defpackage.aojh.a;
            case 10:
                sfz sfzVar2 = (sfz) this.e;
                defpackage.aimz aimzVar = sfz.a;
                sfzVar2.h.o(defpackage.rmx.CALLING_CARD_SETTINGS_MCC_ADD_BUTTON_CLICKED);
                if (((java.lang.Boolean) sfzVar2.i.a()).booleanValue()) {
                    ((defpackage.aimw) sfz.a.b().l("com/android/dialer/patrick/impl/settings/ui/CallingCardSettingsFragmentPeer", "onMyCallingCardCreateClick", 351, "CallingCardSettingsFragmentPeer.kt")).v("launching OnboardingFlowActivity");
                    sfzVar2.r.b(sfz.c);
                } else {
                    ((defpackage.aimw) sfz.a.b().l("com/android/dialer/patrick/impl/settings/ui/CallingCardSettingsFragmentPeer", "onMyCallingCardCreateClick", 356, "CallingCardSettingsFragmentPeer.kt")).v("launching CallingCardAccountActivity");
                    sfzVar2.s.b(defpackage.aojh.a);
                }
                return defpackage.aojh.a;
            case 11:
                sle sleVar = (sle) this.e;
                defpackage.aimz aimzVar2 = sle.a;
                defpackage.aoin aoinVar = sleVar.l;
                if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                    sjl sjlVar = sleVar.t;
                    if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                        abxp abxpVar = sjlVar.a().d.c;
                        if (abxpVar == null) {
                            abxpVar = abxp.a;
                        }
                        abxp abxpVar2 = sjlVar.a().c.c;
                        if (abxpVar2 == null) {
                            abxpVar2 = abxp.a;
                        }
                        if (defpackage.aooh.n(abxpVar, abxpVar2)) {
                            abxr abxrVar = sjlVar.a().d.d;
                            if (abxrVar == null) {
                                abxrVar = abxr.a;
                            }
                            abxr abxrVar2 = sjlVar.a().c.d;
                            if (abxrVar2 == null) {
                                abxrVar2 = abxr.a;
                            }
                            if (defpackage.aooh.n(abxrVar, abxrVar2)) {
                                sleVar.s.b();
                            }
                        }
                        sleVar.K.z(new skk(0));
                    } else {
                        sleVar.s.b();
                    }
                } else {
                    sleVar.a().b(defpackage.mce.USER_BACKED_OUT_OF_CALLING_CARD_EDITOR_FLOW);
                    skv skvVar = sleVar.e;
                    skvVar.H().setResult(0);
                    skvVar.H().finish();
                }
                return defpackage.aojh.a;
            case 12:
                sle sleVar2 = (sle) this.e;
                defpackage.aimz aimzVar3 = sle.a;
                uhp uhpVar = sleVar2.K;
                uhpVar.p(uhpVar.g());
                uhpVar.x(true);
                uhpVar.t(true);
                return defpackage.aojh.a;
            case 13:
                sle sleVar3 = (sle) this.e;
                defpackage.aimz aimzVar4 = sle.a;
                uhp uhpVar2 = sleVar3.K;
                uhpVar2.x(false);
                sko skoVarH = uhpVar2.h();
                if (skoVarH == null) {
                    throw new java.lang.IllegalStateException("onSaveCustomFontClick: Currently selected font cannot be null.");
                }
                uhpVar2.m(skoVarH);
                return defpackage.aojh.a;
            case 14:
                sle sleVar4 = (sle) this.e;
                defpackage.aimz aimzVar5 = sle.a;
                uhp uhpVar3 = sleVar4.K;
                uhpVar3.p(uhpVar3.g());
                uhpVar3.x(false);
                return defpackage.aojh.a;
            case 15:
                sle sleVar5 = (sle) this.e;
                defpackage.aimz aimzVar6 = sle.a;
                sleVar5.K.k();
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.addFlags(268435456);
                skv skvVar2 = sleVar5.e;
                android.net.Uri uri = android.net.Uri.parse("package:".concat(java.lang.String.valueOf(skvVar2.A().getPackageName())));
                defpackage.aooh.e(uri, "parse(...)");
                intent.setData(uri);
                defpackage.ahqx.l(skvVar2.A(), intent);
                return defpackage.aojh.a;
            case 16:
                sle sleVar6 = (sle) this.e;
                defpackage.aimz aimzVar7 = sle.a;
                sleVar6.i.o(defpackage.rmx.PATRICK_DELETED);
                defpackage.aoin aoinVar2 = sleVar6.l;
                if (!((java.lang.Boolean) aoinVar2.a()).booleanValue() ? !((iAR = defpackage.a.aR(sleVar6.d.g)) == 0 || iAR != 3) : sleVar6.t.a().e == sjj.b) {
                    sleVar6.a().b(defpackage.mce.MY_CALLING_CARD_DELETE_BUTTON_PRESSED);
                }
                if (((java.lang.Boolean) aoinVar2.a()).booleanValue() && sleVar6.t.a().e == sjj.b) {
                    defpackage.agtj agtjVar = sleVar6.r;
                    uhp uhpVar4 = sleVar6.K;
                    agtjVar.i(new zoe(defpackage.aosv.F(uhpVar4.f, 0, new mel(uhpVar4, (defpackage.aoln) null, 3), 3)), sleVar6.E);
                } else {
                    if (!((java.lang.Boolean) aoinVar2.a()).booleanValue() ? (iAW = defpackage.a.aW(sleVar6.d.e)) == 0 || iAW != 5 : sleVar6.t.a().f != sjk.d) {
                        z = false;
                    }
                    if (!((java.lang.Boolean) aoinVar2.a()).booleanValue() ? !((iAR2 = defpackage.a.aR(sleVar6.d.g)) == 0 || iAR2 != 4) : sleVar6.t.a().e == sjj.c) {
                        if (z) {
                            sleVar6.a().b(defpackage.mce.CONTACT_CALLING_CARD_DELETE_INITIATED_BY_DIALER);
                        }
                    }
                    sleVar6.c();
                }
                return defpackage.aojh.a;
            case 17:
                sle sleVar7 = (sle) this.e;
                defpackage.aimz aimzVar8 = sle.a;
                sleVar7.a().b(defpackage.mce.USER_DISCARD_CHANGE_FROM_CALLING_CARD_EDITOR);
                uhp uhpVar5 = sleVar7.K;
                uhpVar5.k();
                sjl sjlVar2 = sleVar7.t;
                if (((java.lang.Boolean) sjlVar2.b.a()).booleanValue()) {
                    defpackage.aozj aozjVar = sjlVar2.e;
                    com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState onboardingSavedStateA = com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState.a((com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState) aozjVar.c(), (android.net.Uri) null, (sjg) null, ((com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState) aozjVar.c()).d, (abxt) null, (sjj) null, (sjk) null, (java.lang.String) null, (java.lang.String) null, 251);
                    aozjVar.e(onboardingSavedStateA);
                    sjlVar2.a.d("onboarding_saved_state", onboardingSavedStateA);
                } else {
                    sjlVar2.f.e(sjlVar2.g.c());
                }
                skp skpVar = skp.a;
                defpackage.aooh.e(skpVar, "getDefaultInstance(...)");
                uhpVar5.y(skpVar);
                defpackage.aoov.an(sleVar7.f, null, 0, new sge(sleVar7, (defpackage.aoln) null, 12), 3);
                sleVar7.s.b();
                return defpackage.aojh.a;
            case 18:
                tup tupVar = (tup) this.e;
                tpj tpjVarA = tupVar.a();
                if (tpjVarA != null) {
                    tpi tpiVar = tpjVarA.d;
                    if (tpiVar == null) {
                        tpiVar = tpi.a;
                    }
                    if (tpiVar != null) {
                        defpackage.alcf alcfVar = tpiVar.e;
                        if (alcfVar == null) {
                            alcfVar = defpackage.alcf.a;
                        }
                        if (alcfVar != null) {
                            defpackage.agtj agtjVar2 = tupVar.c;
                            tmj tmjVarB = tupVar.b();
                            agtjVar2.i(zoe.N(tmjVarB != null ? defpackage.aosv.F(tmjVarB.b, 0, new tkz(tmjVarB, alcfVar, (defpackage.aoln) null, 2), 3) : null), tupVar.f);
                        }
                    }
                }
                return defpackage.aojh.a;
            case 19:
                tup tupVar2 = (tup) this.e;
                tpj tpjVarA2 = tupVar2.a();
                if (tpjVarA2 != null) {
                    tpi tpiVar2 = tpjVarA2.d;
                    if (tpiVar2 == null) {
                        tpiVar2 = tpi.a;
                    }
                    if (tpiVar2 != null) {
                        defpackage.alcf alcfVar2 = tpiVar2.e;
                        if (alcfVar2 == null) {
                            alcfVar2 = defpackage.alcf.a;
                        }
                        defpackage.alcf alcfVar3 = alcfVar2;
                        if (alcfVar3 != null) {
                            defpackage.agtj agtjVar3 = tupVar2.c;
                            tmj tmjVarB2 = tupVar2.b();
                            agtjVar3.i(zoe.N(tmjVarB2 != null ? defpackage.aosv.F(tmjVarB2.b, 0, new tkz(tmjVarB2, alcfVar3, (defpackage.aoln) null, 3, (byte[]) null), 3) : null), tupVar2.e);
                        }
                    }
                }
                return defpackage.aojh.a;
            default:
                uoo uooVar = (uoo) this.e;
                java.lang.String[] strArr = uoo.a;
                uooVar.a();
                return defpackage.aojh.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovt(java.lang.Object obj, int i) {
        super(0, obj, ovu.class, "launchFeatureSettings", "launchFeatureSettings$third_party_java_src_android_app_dialer_java_com_android_dialer_incall_answer_method_promo_promo()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovt(java.lang.Object obj, int i, char[] cArr) {
        super(0, obj, defpackage.rsr.class, "logCreated", "logCreated()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovt(java.lang.Object obj, int i, short[] sArr) {
        super(0, obj, defpackage.rsr.class, "logNoEntryToShow", "logNoEntryToShow()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovt(java.lang.Object obj, int i, int[] iArr) {
        super(0, obj, defpackage.rrz.class, "onClose", "onClose()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovt(java.lang.Object obj, int i, boolean[] zArr) {
        super(0, obj, ryl.class, "toEditor", "toEditor()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovt(java.lang.Object obj, int i, float[] fArr) {
        super(0, obj, rze.class, "onBack", "onBack()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovt(java.lang.Object obj, int i, byte[][] bArr) {
        super(0, obj, defpackage.sby.class, "launchFeatureSettings", "launchFeatureSettings()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovt(java.lang.Object obj, int i, char[][] cArr) {
        super(0, obj, sca.class, "launchFeatureSettings", "launchFeatureSettings()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovt(java.lang.Object obj, int i, short[][] sArr) {
        super(0, obj, sfz.class, "onAddButtonClick", "onAddButtonClick()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovt(java.lang.Object obj, int i, int[][] iArr) {
        super(0, obj, sfz.class, "onMyCallingCardCreateClick", "onMyCallingCardCreateClick()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovt(java.lang.Object obj, int i, boolean[][] zArr) {
        super(0, obj, sle.class, "onBackClick", "onBackClick()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovt(java.lang.Object obj, int i, float[][] fArr) {
        super(0, obj, sle.class, "onCustomTypographyIconClick", "onCustomTypographyIconClick()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovt(java.lang.Object obj, int i, byte[][][] bArr) {
        super(0, obj, sle.class, "onSaveCustomFontClick", "onSaveCustomFontClick()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovt(java.lang.Object obj, int i, char[][][] cArr) {
        super(0, obj, sle.class, "onCancelCustomFontClick", "onCancelCustomFontClick()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovt(java.lang.Object obj, int i, short[][][] sArr) {
        super(0, obj, sle.class, "onCameraPermissionsAlertDialogConfirmClick", "onCameraPermissionsAlertDialogConfirmClick()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovt(java.lang.Object obj, int i, int[][][] iArr) {
        super(0, obj, sle.class, "onDeleteBackgroundConfirm", "onDeleteBackgroundConfirm()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovt(java.lang.Object obj, int i, boolean[][][] zArr) {
        super(0, obj, sle.class, "discardChanges", "discardChanges()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovt(java.lang.Object obj, int i, float[][][] fArr) {
        super(0, obj, tup.class, "onConfirmButtonClicked", "onConfirmButtonClicked()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovt(java.lang.Object obj, int i, byte[] bArr, byte[] bArr2) {
        super(0, obj, tup.class, "onDismissButtonClicked", "onDismissButtonClicked()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovt(java.lang.Object obj, int i, char[] cArr, byte[] bArr) {
        super(0, obj, uoo.class, "onAddFavoriteClicked", "onAddFavoriteClicked()V", 0);
        this.$cid = i;
    }
}
