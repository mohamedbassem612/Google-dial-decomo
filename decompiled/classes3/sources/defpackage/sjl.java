package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sjl extends eoa {
    public final enr a;
    public final aoin b;
    public final aozh c;
    public final aozh d;
    public final aozj e;
    public final aozj f;
    public final aozj g;
    public final aozj i;
    public final aozj j;
    public final aozj k;
    public final aozj l;
    private final aowi m;
    private final aozj n;
    private final aozj o;
    private final aozj p;

    public sjl(enr enrVar, aoin aoinVar) {
        aooh.f(enrVar, "savedStateHandle");
        aooh.f(aoinVar, "enableCallingCardViewModelRefactor");
        this.a = enrVar;
        this.b = aoinVar;
        com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState onboardingSavedState = (com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState) enrVar.a("onboarding_saved_state");
        this.e = aozk.a(onboardingSavedState == null ? new com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState(null) : onboardingSavedState);
        defpackage.abxt abxtVar = defpackage.abxt.a;
        this.f = aozk.a(abxtVar);
        this.g = aozk.a(abxtVar);
        defpackage.sjg sjgVar = defpackage.sjg.a;
        this.n = aozk.a(sjgVar);
        aozj aozjVarA = aozk.a(sjgVar);
        this.o = aozjVarA;
        this.c = new aoys(aozjVarA, (aoub) null);
        aozj aozjVarA2 = aozk.a(java.lang.Boolean.FALSE);
        this.p = aozjVarA2;
        this.d = new aoys(aozjVarA2, (aoub) null);
        aowi aowiVarH = aooh.H(-2, 0, (aonj) null, 6);
        this.m = aowiVarH;
        new aoxd(aowiVarH, false);
        this.i = aozk.a(defpackage.sjj.a);
        this.j = aozk.a(defpackage.sjk.a);
        this.k = aozk.a("");
        this.l = aozk.a("");
    }

    public static final defpackage.sjj h(defpackage.abxn abxnVar) {
        int iAR = a.aR(abxnVar.g);
        if (iAR == 0) {
            iAR = 1;
        }
        int i = iAR - 2;
        if (i != 1) {
            return i != 2 ? defpackage.sjj.a : defpackage.sjj.c;
        }
        return defpackage.sjj.b;
    }

    public static final defpackage.sjk i(defpackage.abxn abxnVar) {
        int iAW = a.aW(abxnVar.e);
        if (iAW == 0) {
            iAW = 1;
        }
        switch (iAW - 2) {
            case 1:
                return defpackage.sjk.b;
            case 2:
                return defpackage.sjk.c;
            case 3:
                return defpackage.sjk.d;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return defpackage.sjk.e;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return defpackage.sjk.f;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return defpackage.sjk.g;
            default:
                return defpackage.sjk.a;
        }
    }

    public final com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState a() {
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            return (com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState) this.e.c();
        }
        defpackage.sjg sjgVar = (defpackage.sjg) this.n.c();
        java.lang.Object objC = this.g.c();
        aooh.e(objC, "<get-value>(...)");
        defpackage.abxt abxtVar = (defpackage.abxt) objC;
        java.lang.Object objC2 = this.f.c();
        aooh.e(objC2, "<get-value>(...)");
        return new com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState(null, sjgVar, (defpackage.abxt) objC2, abxtVar, (defpackage.sjj) this.i.c(), (defpackage.sjk) this.j.c(), (java.lang.String) this.k.c(), (java.lang.String) this.l.c());
    }

    public final void b(boolean z) {
        this.p.e(java.lang.Boolean.valueOf(z));
    }

    public final void c(android.net.Uri uri) {
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            aozj aozjVar = this.e;
            com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState onboardingSavedStateA = com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState.a((com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState) aozjVar.c(), uri, null, null, null, null, null, null, null, 254);
            aozjVar.e(onboardingSavedStateA);
            this.a.d("onboarding_saved_state", onboardingSavedStateA);
        }
    }

    public final void e(defpackage.sjg sjgVar) {
        boolean zBooleanValue = ((java.lang.Boolean) this.b.a()).booleanValue();
        aozj aozjVar = this.o;
        if (!zBooleanValue) {
            aozj aozjVar2 = this.n;
            aozjVar.e(aozjVar2.c());
            aozjVar2.e(sjgVar);
        } else {
            aozj aozjVar3 = this.e;
            aozjVar.e(((com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState) aozjVar3.c()).b);
            com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState onboardingSavedStateA = com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState.a((com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState) aozjVar3.c(), null, sjgVar, null, null, null, null, null, null, 253);
            aozjVar3.e(onboardingSavedStateA);
            this.a.d("onboarding_saved_state", onboardingSavedStateA);
        }
    }

    public final void f(aonj aonjVar) {
        if (!((java.lang.Boolean) this.b.a()).booleanValue()) {
            aozj aozjVar = this.f;
            akzx akzxVarP = ((defpackage.abxt) aozjVar.c()).p();
            aonjVar.a(akzxVarP);
            aozjVar.e(akzxVarP.p());
            return;
        }
        aozj aozjVar2 = this.e;
        akzx akzxVarP2 = ((com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState) aozjVar2.c()).c.p();
        aonjVar.a(akzxVarP2);
        alad aladVarP = akzxVarP2.p();
        aooh.e(aladVarP, "build(...)");
        com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState onboardingSavedStateA = com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState.a((com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState) aozjVar2.c(), null, null, (defpackage.abxt) aladVarP, null, null, null, null, null, 251);
        aozjVar2.e(onboardingSavedStateA);
        this.a.d("onboarding_saved_state", onboardingSavedStateA);
    }
}
