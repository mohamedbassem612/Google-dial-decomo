package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rjh implements defpackage.ahjc {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public rjh(defpackage.tcz tczVar, ajcq ajcqVar, int i) {
        this.$cid = i;
        this.b = ajcqVar;
        j$.util.Objects.requireNonNull(tczVar);
        this.a = tczVar;
    }

    /* JADX WARN: Type inference failed for: r7v35, types: [ajcq, java.lang.Object] */
    @Override // defpackage.ahjc
    public final ajcq a() {
        com.google.apps.tiktok.nav.gateway.GatewayHandler$GatewayDestination gatewayHandler$GatewayDestinationB;
        int i = this.$cid;
        if (i == 0) {
            java.lang.String str = android.os.Build.BRAND;
            aooh.e(str, "BRAND");
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            aooh.e(lowerCase, "toLowerCase(...)");
            if (aooh.n(lowerCase, "google")) {
                defpackage.rjg.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/joyball/impl/eligibility/JoyballEligibility", "isEligible", 25, "JoyballEligibility.kt").v("enabled");
                java.lang.Object obj = this.a;
                apjb apjbVar = (apjb) this.b;
                java.lang.Object obj2 = apjbVar.b;
                if (aooh.n(obj2, "com.google.android.pixel.setupwizard")) {
                    defpackage.rji rjiVar = (defpackage.rji) obj;
                    if (rjiVar.c.b((java.lang.String) obj2)) {
                        defpackage.rji.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/joyball/impl/gateway/JoyballGateway", "isVerified", 88, "JoyballGateway.kt").v("signed; verified");
                        android.content.Intent intent = new android.content.Intent(rjiVar.b, (java.lang.Class<?>) com.android.dialer.joyball.impl.ui.JoyballActivity.class);
                        defpackage.rjj rjjVar = rjiVar.d;
                        java.lang.Object obj3 = apjbVar.a;
                        aooh.e(obj3, "getIntent(...)");
                        aooh.f(obj3, "suwIntent");
                        defpackage.rjj.a.b().l("com/android/dialer/joyball/impl/lifecycle/JoyballLifecycleImpl", "startLifecycle", 17, "JoyballLifecycleImpl.kt").y("startLifecycle %s", obj3);
                        android.content.Intent intent2 = (android.content.Intent) obj3;
                        rjjVar.b = intent2;
                        defpackage.aftt.w(intent2, intent);
                        gatewayHandler$GatewayDestinationB = com.google.apps.tiktok.nav.gateway.GatewayHandler$GatewayDestination.b(intent);
                    } else {
                        defpackage.rji.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/joyball/impl/gateway/JoyballGateway", "isVerified", 93, "JoyballGateway.kt").v("unsigned; unverified");
                    }
                    return aiql.z(gatewayHandler$GatewayDestinationB);
                }
                defpackage.rji.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/joyball/impl/gateway/JoyballGateway", "isVerified", 82, "JoyballGateway.kt").v("invalid source; unverified");
            } else {
                defpackage.rjg.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/joyball/impl/eligibility/JoyballEligibility", "isEligible", 20, "JoyballEligibility.kt").v("brand; disabled");
            }
            gatewayHandler$GatewayDestinationB = new com.google.apps.tiktok.nav.gateway.GatewayHandler$GatewayDestination(4, aike.a, null, false, 3, null);
            return aiql.z(gatewayHandler$GatewayDestinationB);
        }
        if (i != 1) {
            return ahvr.H((ajcq) this.b, new defpackage.tbp(5), ((defpackage.tcz) this.a).b);
        }
        muy.a.b().l("com/android/dialer/dobby/impl/growthkit/DobbyPromoGatewayHandler$getRedirector$<anonymous>", "getRedirectIntent", 32, "DobbyPromoGatewayHandler.kt").v("enter");
        android.os.Bundle extras = ((android.content.Intent) ((apjb) this.b).a).getExtras();
        java.lang.Integer numValueOf = extras != null ? java.lang.Integer.valueOf(extras.getInt("extra_dobby_promotion_type")) : null;
        java.lang.Object obj4 = this.a;
        defpackage.ryg rygVarAU = pez.aU(defpackage.rvq.a.m());
        defpackage.ryg rygVarAS = pez.aS(defpackage.rvo.a.m());
        rygVarAS.k(defpackage.rvc.DOBBY);
        if (numValueOf != null) {
            akzx akzxVarM = defpackage.rvi.a.m();
            aooh.f(akzxVarM, "builder");
            int iAa = a.aa(numValueOf.intValue());
            if (iAa == 0) {
                throw new java.lang.IllegalArgumentException("Required value was null.");
            }
            akzxVarM.u();
            ((defpackage.rvi) akzxVarM.b).b = a.S(iAa);
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.rvi rviVar = (defpackage.rvi) aladVarP;
            aooh.f(rviVar, "value");
            akzx akzxVar = (akzx) rygVarAS.a;
            akzxVar.u();
            defpackage.rvo rvoVar = (defpackage.rvo) akzxVar.b;
            j$.util.Objects.requireNonNull(rviVar);
            rvoVar.c = rviVar;
            rvoVar.b = 7;
        }
        ipc ipcVar = ((muy) obj4).b;
        rygVarAU.o(rygVarAS.i());
        return aiql.z(com.google.apps.tiktok.nav.gateway.GatewayHandler$GatewayDestination.b(ipcVar.aL(rygVarAU.n())));
    }

    public rjh(java.lang.Object obj, apjb apjbVar, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = apjbVar;
    }
}
