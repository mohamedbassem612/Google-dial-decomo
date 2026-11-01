package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sji implements defpackage.sjh {
    private static final aimz a = aimz.i("com/android/dialer/patrick/navigation/impl/OnboardingNavigationController");
    private final android.app.Activity b;
    private final defpackage.sjl c;
    private final rlv d;
    private final da e;
    private final zjm f;
    private final gpd g;

    public sji(zjm zjmVar, android.app.Activity activity, defpackage.sjl sjlVar, rlv rlvVar, gpd gpdVar) {
        aooh.f(sjlVar, "viewModel");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        this.f = zjmVar;
        this.b = activity;
        this.c = sjlVar;
        this.d = rlvVar;
        this.g = gpdVar;
        this.e = (da) activity;
    }

    private final defpackage.sjc g() {
        j$.util.Optional optionalG = this.f.g();
        aooh.e(optionalG, "getFeature(...)");
        return (defpackage.sjc) aooh.q(optionalG);
    }

    private final java.lang.String h() {
        java.lang.String str;
        aw awVarD = this.e.a().d(android.R.id.content);
        return (awVarD == null || (str = awVarD.H) == null) ? "" : str;
    }

    private final void i() {
        defpackage.sjl sjlVar = this.c;
        defpackage.abxt abxtVar = sjlVar.a().c;
        defpackage.sjj sjjVar = sjlVar.a().e;
        boolean zN = aooh.n(sjlVar.a().d, defpackage.abxt.a);
        int iOrdinal = sjjVar.ordinal();
        if (iOrdinal == 1) {
            rlv rlvVar = this.d;
            if (zN) {
                rlvVar.o(rmx.yQ);
            } else {
                rlvVar.o(rmx.yU);
            }
        } else if (iOrdinal == 2) {
            rlv rlvVar2 = this.d;
            if (zN) {
                rlvVar2.o(rmx.yS);
            } else {
                rlvVar2.o(rmx.yT);
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("patrickDataKey", abxtVar.i());
        a(-1, intent);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    private final void j(defpackage.sjg sjgVar) throws aois {
        defpackage.sjl sjlVar = this.c;
        sjlVar.e(sjgVar);
        int iOrdinal = sjgVar.ordinal();
        if (iOrdinal == 0) {
            throw new java.lang.IllegalArgumentException("Unsupported onboarding step for navigation");
        }
        if (iOrdinal == 1) {
            k(defpackage.ryw.c(defpackage.abxn.a), "CallingCardAccountFragment");
            return;
        }
        if (iOrdinal == 2) {
            aimz aimzVar = defpackage.sle.a;
            k(defpackage.skv.q(defpackage.abxn.a), "OnboardingFlowFragment");
        } else if (iOrdinal == 3) {
            k(snl.aa(sjlVar.a().c), "CallingCardSharingFragment");
        } else {
            if (iOrdinal != 4) {
                throw new aois();
            }
            defpackage.sjc sjcVarG = g();
            if (sjcVarG == null) {
                throw new java.lang.IllegalStateException("Kappa should not be navigated to if the feature is not available");
            }
            k(sjcVarG.a(), sjcVarG.b());
        }
    }

    private final void k(aw awVar, java.lang.String str) {
        bo boVarA = this.e.a();
        u uVar = new u(boVarA);
        uVar.q(android.R.id.content, awVar, str);
        uVar.o(str);
        uVar.i(false, true);
        boVarA.af();
    }

    @Override // defpackage.sjh
    public final void a(int i, android.content.Intent intent) {
        da daVar = this.e;
        daVar.setResult(i, intent);
        daVar.finish();
    }

    @Override // defpackage.sjh
    public final void b() {
        bo boVarA = this.e.a();
        if (boVarA.a() <= 1) {
            this.g.i((java.lang.String) null).b(mce.hI);
            a(0, null);
            return;
        }
        java.lang.String strH = h();
        boVarA.al((java.lang.String) null, 0);
        java.lang.String strH2 = h();
        if (aooh.n(strH, "CallingCardSharingFragment") && aooh.n(strH2, "OnboardingFlowFragment")) {
            this.g.i((java.lang.String) null).b(mce.hI);
        }
        int iHashCode = strH2.hashCode();
        if (iHashCode != -1930485895) {
            if (iHashCode != -525206743) {
                if (iHashCode == 1397834456 && strH2.equals("CallingCardSharingFragment")) {
                    this.c.e(defpackage.sjg.d);
                    return;
                }
            } else if (strH2.equals("CallingCardAccountFragment")) {
                this.c.e(defpackage.sjg.b);
                return;
            }
        } else if (strH2.equals("OnboardingFlowFragment")) {
            this.c.e(defpackage.sjg.c);
            return;
        }
        a.d().l("com/android/dialer/patrick/navigation/impl/OnboardingNavigationController", "navigateBack", 135, "OnboardingNavigationController.kt").y("Unknown fragment tag: %s", strH2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    @Override // defpackage.sjh
    public final void c() throws aois {
        defpackage.sjl sjlVar = this.c;
        int iOrdinal = sjlVar.a().b.ordinal();
        if (iOrdinal == 0) {
            throw new java.lang.IllegalArgumentException("Unsupported onboarding step for navigation");
        }
        if (iOrdinal == 1) {
            j(defpackage.sjg.c);
            return;
        }
        if (iOrdinal == 2) {
            if (sjlVar.a().e == defpackage.sjj.b) {
                j(defpackage.sjg.d);
                return;
            } else {
                i();
                return;
            }
        }
        if (iOrdinal == 3) {
            i();
        } else {
            if (iOrdinal != 4) {
                throw new aois();
            }
            if (g() == null) {
                throw new java.lang.IllegalStateException("Kappa should not be the current step if the feature is not available");
            }
            j(defpackage.sjg.c);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    @Override // defpackage.sjh
    public final void d() throws aois {
        this.e.a().al("OnboardingFlowFragment", 1);
        j(defpackage.sjg.c);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    @Override // defpackage.sjh
    public final void e() throws aois {
        if (g() == null) {
            a.b().l("com/android/dialer/patrick/navigation/impl/OnboardingNavigationController", "navigateToKappa", 208, "OnboardingNavigationController.kt").v("Kappa feature is not available, skipping navigation to Kappa screen");
            return;
        }
        defpackage.sjl sjlVar = this.c;
        if (sjlVar.a().e == defpackage.sjj.c) {
            a.b().l("com/android/dialer/patrick/navigation/impl/OnboardingNavigationController", "navigateToKappa", 214, "OnboardingNavigationController.kt").v("Contact calling card type is not eligible for Kappa feature, skipping navigation to Kappa screen");
        } else {
            if (sjlVar.a().h.length() == 0) {
                throw new java.lang.IllegalStateException("MCC onboarding flow should have gaia account by the time we attempt to navigate to Kappa screen");
            }
            j(defpackage.sjg.e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:45:0x0119  */
    @Override // defpackage.sjh
    public final void f(defpackage.abxn abxnVar) throws aois {
        defpackage.sjg sjgVar;
        aooh.f(abxnVar, "onboardingFlowArgument");
        defpackage.sjl sjlVar = this.c;
        defpackage.sjg sjgVar2 = sjlVar.a().b;
        defpackage.sjg sjgVar3 = defpackage.sjg.a;
        if (sjgVar2 != sjgVar3) {
            a.b().l("com/android/dialer/patrick/navigation/impl/OnboardingNavigationController", "startOnboardingFlow", 178, "OnboardingNavigationController.kt").v("Activity was recreated but not destroyed (ex. orientation change). Skipping onboarding flow initialization.");
            return;
        }
        aooh.f(abxnVar, "argument");
        aoin aoinVar = sjlVar.b;
        if (!((java.lang.Boolean) aoinVar.a()).booleanValue() || sjlVar.a().b == sjgVar3) {
            if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                aozj aozjVar = sjlVar.e;
                com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState onboardingSavedState = (com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState) aozjVar.c();
                defpackage.abxt abxtVar = abxnVar.d;
                if (abxtVar == null) {
                    abxtVar = defpackage.abxt.a;
                }
                defpackage.abxt abxtVar2 = abxtVar;
                aooh.e(abxtVar2, "getPreviousResult(...)");
                defpackage.abxt abxtVar3 = abxnVar.d;
                if (abxtVar3 == null) {
                    abxtVar3 = defpackage.abxt.a;
                }
                defpackage.abxt abxtVar4 = abxtVar3;
                aooh.e(abxtVar4, "getPreviousResult(...)");
                defpackage.sjj sjjVarH = defpackage.sjl.h(abxnVar);
                defpackage.sjk sjkVarI = defpackage.sjl.i(abxnVar);
                java.lang.String str = abxnVar.c;
                aooh.e(str, "getContactName(...)");
                java.lang.String str2 = abxnVar.f;
                aooh.e(str2, "getGaiaAccountName(...)");
                com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState onboardingSavedStateA = com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState.a(onboardingSavedState, null, null, abxtVar2, abxtVar4, sjjVarH, sjkVarI, str, str2, 3);
                aozjVar.e(onboardingSavedStateA);
                sjlVar.a.d("onboarding_saved_state", onboardingSavedStateA);
            } else {
                sjlVar.i.e(defpackage.sjl.h(abxnVar));
                sjlVar.j.e(defpackage.sjl.i(abxnVar));
                aozj aozjVar2 = sjlVar.g;
                defpackage.abxt abxtVar5 = abxnVar.d;
                if (abxtVar5 == null) {
                    abxtVar5 = defpackage.abxt.a;
                }
                aozjVar2.e(abxtVar5);
                aozj aozjVar3 = sjlVar.f;
                defpackage.abxt abxtVar6 = abxnVar.d;
                if (abxtVar6 == null) {
                    abxtVar6 = defpackage.abxt.a;
                }
                aozjVar3.e(abxtVar6);
                aozj aozjVar4 = sjlVar.k;
                java.lang.String str3 = abxnVar.c;
                aooh.e(str3, "getContactName(...)");
                aozjVar4.e(str3);
                aozj aozjVar5 = sjlVar.l;
                java.lang.String str4 = abxnVar.f;
                aooh.e(str4, "getGaiaAccountName(...)");
                aozjVar5.e(str4);
            }
        }
        int iOrdinal = sjlVar.a().e.ordinal();
        if (iOrdinal == 1) {
            defpackage.abxt abxtVar7 = abxnVar.d;
            if (abxtVar7 == null) {
                abxtVar7 = defpackage.abxt.a;
            }
            if ((abxtVar7.b & 1) != 0) {
                java.lang.String str5 = abxnVar.f;
                aooh.e(str5, "getGaiaAccountName(...)");
                if (str5.length() > 0) {
                    int iAW = a.aW(abxnVar.e);
                    if (iAW == 0 || iAW != 7) {
                        sjgVar = defpackage.sjg.d;
                    }
                } else {
                    sjgVar = defpackage.sjg.b;
                }
            } else {
                sjgVar = defpackage.sjg.b;
            }
            j(sjgVar);
        }
        if (iOrdinal != 2) {
            throw new java.lang.IllegalArgumentException("Unsupported calling card type");
        }
        sjgVar = defpackage.sjg.c;
        j(sjgVar);
    }
}
