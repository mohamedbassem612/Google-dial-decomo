package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mup implements rrz {
    private static final aimz d = aimz.i("com/android/dialer/dobby/impl/growthkit/DobbyDowngradeHomepageMarquee");
    public final android.content.Context a;
    public final rlv b;
    public final ipc c;
    private final defpackage.mux e;
    private final nnx f;
    private final noe g;
    private final aoin h;
    private final rsd i;
    private final rsb j;

    public mup(android.content.Context context, ipc ipcVar, defpackage.mux muxVar, nnx nnxVar, rlv rlvVar, noe noeVar, aoin aoinVar) {
        aooh.f(context, "appContext");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar, "enableMarqueeDynamicLocale");
        this.a = context;
        this.c = ipcVar;
        this.e = muxVar;
        this.f = nnxVar;
        this.b = rlvVar;
        this.g = noeVar;
        this.h = aoinVar;
        this.i = rsd.e;
        this.j = new rsb(new rsm(14));
    }

    public final rsb a() {
        return this.j;
    }

    public final rsd b() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.muo muoVar;
        defpackage.noh nohVarB;
        java.lang.Object objC;
        defpackage.noh nohVar;
        int iIntValue;
        aimz aimzVar;
        rse rsfVar;
        rse rsfVar2;
        rse rsfVar3;
        if (aolnVar instanceof defpackage.muo) {
            muoVar = (defpackage.muo) aolnVar;
            int i = muoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                muoVar.c = i - Integer.MIN_VALUE;
            } else {
                muoVar = new defpackage.muo(this, aolnVar);
            }
        } else {
            muoVar = new defpackage.muo(this, aolnVar);
        }
        java.lang.Object objC2 = muoVar.a;
        aolu aoluVar = aolu.a;
        int i2 = muoVar.c;
        int i3 = 2;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objC2);
            } else if (i2 == 2) {
                aooc.af(objC2);
                nohVarB = defpackage.noh.b(((nok) objC2).c);
                if (nohVarB == null) {
                    nohVarB = defpackage.noh.UNRECOGNIZED;
                }
                defpackage.mux muxVar = this.e;
                muoVar.d = nohVarB;
                muoVar.c = 3;
                objC = muxVar.c(muoVar);
                if (objC != aoluVar) {
                    return aoluVar;
                }
                nohVar = nohVarB;
                objC2 = objC;
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nohVar = muoVar.d;
                aooc.af(objC2);
            }
            iIntValue = ((java.lang.Number) objC2).intValue();
            aimzVar = d;
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyDowngradeHomepageMarquee", "getMarqueeUiModel", 62, "DobbyDowngradeHomepageMarquee.kt").y("enrollmentStatus %s", nohVar);
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyDowngradeHomepageMarquee", "getMarqueeUiModel", 66, "DobbyDowngradeHomepageMarquee.kt").w("reportDoNotScreenAndNotSpamCountInPastWeekCount %d", iIntValue);
            if (iIntValue > 0 || !mni.D(nohVar)) {
                aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyDowngradeHomepageMarquee", "getMarqueeUiModel", 75, "DobbyDowngradeHomepageMarquee.kt").v("Downgrade banner is NOT eligible for display.");
                return null;
            }
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyDowngradeHomepageMarquee", "getMarqueeUiModel", 79, "DobbyDowngradeHomepageMarquee.kt").v("Downgrade banner is eligible for display.");
            aoin aoinVar = this.h;
            if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                rsfVar = new rse(2132017802, (java.lang.Object) null);
            } else {
                java.lang.String string = this.a.getResources().getString(2132017802);
                aooh.e(string, "getString(...)");
                rsfVar = new rsf(string);
            }
            rsp rspVar = new rsp(rsfVar);
            rry rryVar = new rry(defpackage.abja.aN);
            if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                rsfVar2 = new rse(2132017800, (java.lang.Object) null);
            } else {
                java.lang.String string2 = this.a.getResources().getString(2132017800);
                aooh.e(string2, "getString(...)");
                rsfVar2 = new rsf(string2);
            }
            rrx rrxVar = new rrx(rsfVar2);
            if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                rsfVar3 = new rse(2132017801, (java.lang.Object) null);
            } else {
                java.lang.String string3 = this.a.getResources().getString(2132017801);
                aooh.e(string3, "getString(...)");
                rsfVar3 = new rsf(string3);
            }
            return new rsh(rspVar, rryVar, rrxVar, new rsa(rsfVar3, new defpackage.mtr(this, i3)));
        }
        aooc.af(objC2);
        noe noeVar = this.g;
        muoVar.c = 1;
        objC2 = noeVar.c(muoVar);
        if (objC2 == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objC2).booleanValue()) {
            d.b().l("com/android/dialer/dobby/impl/growthkit/DobbyDowngradeHomepageMarquee", "getMarqueeUiModel", 55, "DobbyDowngradeHomepageMarquee.kt").v("AAPM is enabled, inhibit promotion");
        } else {
            nnx nnxVar = this.f;
            muoVar.c = 2;
            objC2 = nnxVar.b(muoVar);
            if (objC2 == aoluVar) {
                return aoluVar;
            }
            nohVarB = defpackage.noh.b(((nok) objC2).c);
            if (nohVarB == null) {
                nohVarB = defpackage.noh.UNRECOGNIZED;
            }
            defpackage.mux muxVar2 = this.e;
            muoVar.d = nohVarB;
            muoVar.c = 3;
            objC = muxVar2.c(muoVar);
            if (objC != aoluVar) {
                return aoluVar;
            }
            nohVar = nohVarB;
            objC2 = objC;
            iIntValue = ((java.lang.Number) objC2).intValue();
            aimzVar = d;
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyDowngradeHomepageMarquee", "getMarqueeUiModel", 62, "DobbyDowngradeHomepageMarquee.kt").y("enrollmentStatus %s", nohVar);
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyDowngradeHomepageMarquee", "getMarqueeUiModel", 66, "DobbyDowngradeHomepageMarquee.kt").w("reportDoNotScreenAndNotSpamCountInPastWeekCount %d", iIntValue);
            if (iIntValue > 0) {
            }
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyDowngradeHomepageMarquee", "getMarqueeUiModel", 75, "DobbyDowngradeHomepageMarquee.kt").v("Downgrade banner is NOT eligible for display.");
        }
        return null;
    }

    public final void g() {
        this.b.o(rmx.kO);
    }

    public final /* synthetic */ void f() {
    }
}
