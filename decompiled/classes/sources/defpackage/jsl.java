package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jsl implements defpackage.amyv {
    public static defpackage.ahkm b() {
        return defpackage.zja.a("CallerIdFeedbackDatabaseStatus", defpackage.jsm.a).a();
    }

    public static defpackage.ahkm c() {
        return defpackage.zja.a("CrowdsourceEligibilityPhoneLookup", defpackage.jsq.a).a();
    }

    public static defpackage.ahkm d() {
        return defpackage.zja.a("CallerIdFeedbackPhoneLookup", defpackage.jtu.a).a();
    }

    public static defpackage.ahek e(defpackage.kfp kfpVar) {
        return android.os.Build.VERSION.SDK_INT < 33 ? new kfn() : kfpVar;
    }

    public static defpackage.ahkm f() {
        return defpackage.zja.b("DobbyJoyballData", defpackage.gus.aP(defpackage.mvm.a.m()).K(), null, null, 12);
    }

    public static defpackage.ahlc g(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4) {
        defpackage.aooh.f(aoinVar, "enableMeetApiIntegration");
        defpackage.aooh.f(aoinVar2, "enableBatchSync");
        defpackage.aooh.f(aoinVar3, "minibatchSyncIntervalMins");
        defpackage.aooh.f(aoinVar4, "meetReachabilityMiniBatchSynclet");
        if (!((java.lang.Boolean) aoinVar.a()).booleanValue() || !((java.lang.Boolean) aoinVar2.a()).booleanValue()) {
            return defpackage.ahlc.a;
        }
        mzq mzqVar = new mzq(aoinVar4, 17);
        defpackage.ahkv ahkvVar = new defpackage.ahkv();
        java.lang.Object objA = aoinVar3.a();
        defpackage.aooh.e(objA, "get(...)");
        ahkvVar.c(((java.lang.Number) objA).longValue(), java.util.concurrent.TimeUnit.MINUTES);
        return defpackage.agab.aB(ahkvVar.a(), mzqVar);
    }

    public static defpackage.ahlc h(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4) {
        defpackage.aooh.f(aoinVar, "enableMeetApiIntegration");
        defpackage.aooh.f(aoinVar2, "enableBatchSync");
        defpackage.aooh.f(aoinVar3, "meetReachabilitySyncIntervalMins");
        defpackage.aooh.f(aoinVar4, "meetPhoneNumberSynclet");
        if (!((java.lang.Boolean) aoinVar.a()).booleanValue() || !((java.lang.Boolean) aoinVar2.a()).booleanValue()) {
            return defpackage.ahlc.a;
        }
        mzq mzqVar = new mzq(aoinVar4, 18);
        defpackage.ahkv ahkvVar = new defpackage.ahkv();
        java.lang.Object objA = aoinVar3.a();
        defpackage.aooh.e(objA, "get(...)");
        ahkvVar.c(((java.lang.Number) objA).longValue(), java.util.concurrent.TimeUnit.MINUTES);
        return defpackage.agab.aB(ahkvVar.a(), mzqVar);
    }

    public static defpackage.ahkm i() {
        defpackage.akzx akzxVarM = defpackage.olw.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        defpackage.alad aladVarR = akzxVarM.r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return defpackage.zja.b("CallSpecificPsdDataStore", (defpackage.olw) aladVarR, null, new defpackage.med(19), 4);
    }

    public static defpackage.ahlc j(java.lang.Object obj) {
        defpackage.jrm jrmVar = new defpackage.jrm(obj, 16);
        defpackage.ahkv ahkvVar = new defpackage.ahkv();
        ahkvVar.c(1L, java.util.concurrent.TimeUnit.DAYS);
        return defpackage.agab.aB(ahkvVar.a(), jrmVar);
    }

    public static defpackage.ahlc k(java.lang.Object obj) {
        defpackage.jrm jrmVar = new defpackage.jrm(obj, 18);
        defpackage.ahkv ahkvVar = new defpackage.ahkv();
        ahkvVar.c(1L, java.util.concurrent.TimeUnit.DAYS);
        return defpackage.agab.aB(ahkvVar.a(), jrmVar);
    }

    public static java.lang.String l() {
        return defpackage.amul.a.e;
    }

    public static java.lang.String m() {
        return defpackage.amul.c.e;
    }

    public static defpackage.aduu n() {
        java.lang.String str;
        defpackage.adut adutVar;
        java.lang.String str2;
        defpackage.aigf aigfVar;
        defpackage.adur adurVar;
        defpackage.adus adusVar = new defpackage.adus();
        adusVar.d = android.os.Build.MANUFACTURER + ' ' + android.os.Build.MODEL;
        adusVar.e = 86400000L;
        short s = adusVar.n;
        adusVar.f = "com.google.android.libraries.notifications.entrypoints.scheduled.ScheduledTaskService";
        adusVar.c = defpackage.adut.a;
        adusVar.n = (short) (s | 7);
        adusVar.a(false);
        short s2 = adusVar.n;
        adusVar.i = 7;
        adusVar.j = true;
        adusVar.k = true;
        adusVar.l = defpackage.aikj.b;
        adusVar.o = 1;
        adusVar.n = (short) (s2 | 4080);
        adusVar.m = new defpackage.adur(null);
        adusVar.n = (short) (s2 | 32752);
        adusVar.a = "dialer";
        adusVar.g = "AIzaSyCrONbqfX-KhVe2acZaWuU6BnUqQJRXYRU";
        adusVar.b = "566865154279";
        adusVar.a(true);
        if (adusVar.n == Short.MAX_VALUE && (str = adusVar.a) != null && (adutVar = adusVar.c) != null && (str2 = adusVar.d) != null && (aigfVar = adusVar.l) != null && adusVar.o != 0 && (adurVar = adusVar.m) != null) {
            return new defpackage.aduu(str, adusVar.b, adutVar, str2, adusVar.e, adusVar.f, adusVar.g, adusVar.h, adusVar.i, adusVar.j, adusVar.k, aigfVar, adurVar);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (adusVar.a == null) {
            sb.append(" clientId");
        }
        if (adusVar.c == null) {
            sb.append(" defaultEnvironment");
        }
        if (adusVar.d == null) {
            sb.append(" deviceName");
        }
        if ((adusVar.n & 1) == 0) {
            sb.append(" registrationStalenessTimeMs");
        }
        if ((adusVar.n & 2) == 0) {
            sb.append(" disableEntrypoints");
        }
        if ((adusVar.n & 4) == 0) {
            sb.append(" useDefaultFirebaseApp");
        }
        if ((adusVar.n & 8) == 0) {
            sb.append(" useFirebaseReceiver");
        }
        if ((adusVar.n & 16) == 0) {
            sb.append(" enableEndToEndEncryption");
        }
        if ((adusVar.n & 32) == 0) {
            sb.append(" periodRegistrationIntervalDays");
        }
        if ((adusVar.n & 64) == 0) {
            sb.append(" enableGrowthKitIfExists");
        }
        if ((adusVar.n & 128) == 0) {
            sb.append(" enableInAppPushFlow");
        }
        if ((adusVar.n & 256) == 0) {
            sb.append(" allowedFromEmbargoedCountries");
        }
        if ((adusVar.n & 512) == 0) {
            sb.append(" disableRestartReceiverManager");
        }
        if (adusVar.l == null) {
            sb.append(" additionalRestartReceivers");
        }
        if ((adusVar.n & 1024) == 0) {
            sb.append(" firebaseInitializedByApp");
        }
        if (adusVar.o == 0) {
            sb.append(" registrationApi");
        }
        if ((adusVar.n & 2048) == 0) {
            sb.append(" removeNotVcnManagedCapability");
        }
        if (adusVar.m == null) {
            sb.append(" expeditedJobs");
        }
        if ((adusVar.n & 4096) == 0) {
            sb.append(" dropNonMatchingClientIds");
        }
        if ((adusVar.n & 8192) == 0) {
            sb.append(" logNonMatchingClientIds");
        }
        if ((adusVar.n & 16384) == 0) {
            sb.append(" additionalIsolatedInstance");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static defpackage.ahlc o(defpackage.aoin aoinVar) {
        defpackage.aooh.f(aoinVar, "synclet");
        defpackage.rmg rmgVar = new defpackage.rmg(aoinVar, 1);
        defpackage.ahkv ahkvVar = new defpackage.ahkv();
        ahkvVar.c(12L, java.util.concurrent.TimeUnit.HOURS);
        return defpackage.agab.aB(ahkvVar.a(), rmgVar);
    }

    public static defpackage.ahkm p() {
        defpackage.ahkl ahklVarA = defpackage.ahkm.a();
        ahklVarA.a = "CallingCardVerificationError";
        ahklVarA.c(defpackage.sdc.a);
        return ahklVarA.a();
    }

    public static defpackage.ahlc q(defpackage.iqm iqmVar, defpackage.ome omeVar) {
        if (!iqmVar.b()) {
            return defpackage.ahlc.a;
        }
        irh irhVar = new irh(omeVar, 10);
        defpackage.ahkv ahkvVar = new defpackage.ahkv();
        ahkvVar.c(6L, java.util.concurrent.TimeUnit.HOURS);
        return defpackage.agab.aB(ahkvVar.a(), irhVar);
    }

    public static defpackage.oko r(android.telephony.TelephonyManager telephonyManager, defpackage.aeqx aeqxVar) {
        if (aeqxVar == null) {
            defpackage.aooh.i("factory");
        }
        return aeqxVar.a(null, telephonyManager);
    }

    public static defpackage.zjm s(java.lang.Object obj) {
        return new defpackage.zjm((defpackage.aoin) new defpackage.uoe(obj, 11), (defpackage.zcs) new defpackage.vkc(2));
    }

    public static defpackage.gpd t(android.content.Context context, defpackage.vze vzeVar, defpackage.ahbv ahbvVar, java.lang.Object obj, defpackage.ajct ajctVar, defpackage.aoin aoinVar) {
        return new defpackage.gpd(context, vzeVar, ahbvVar, (defpackage.vea) obj, ajctVar, aoinVar);
    }

    public static defpackage.ahlc u(defpackage.acxg acxgVar, defpackage.ztp ztpVar, defpackage.aoin aoinVar) {
        defpackage.aooh.f(aoinVar, "schedulingPeriodHrs");
        defpackage.ahbo ahboVar = new defpackage.ahbo(acxgVar, ztpVar, 1);
        defpackage.ahkv ahkvVar = new defpackage.ahkv();
        java.lang.Object objA = aoinVar.a();
        defpackage.aooh.e(objA, "get(...)");
        ahkvVar.c(((java.lang.Number) objA).longValue(), java.util.concurrent.TimeUnit.HOURS);
        defpackage.ahkx ahkxVar = new defpackage.ahkx();
        ahkxVar.a = defpackage.ahkz.a;
        ahkvVar.b(ahkxVar.a());
        defpackage.ahlc ahlcVarAB = defpackage.agab.aB(ahkvVar.a(), ahboVar);
        defpackage.aimw aimwVar = (defpackage.aimw) defpackage.ods.a.b().l("com/android/dialer/experimentsync/synclet/ExperimentSyncSyncletModule", "provideDialerExperimentSyncSyncletBinding$<anonymous>", 58, "ExperimentSyncSyncletModule.kt");
        java.lang.Object objA2 = aoinVar.a();
        defpackage.aooh.e(objA2, "get(...)");
        aimwVar.x("DialerExperimentSyncSynclet scheduled, period: %d hours", ((java.lang.Number) objA2).longValue());
        return ahlcVarAB;
    }

    public static defpackage.ajsz v() {
        return new defpackage.ajsz((float[]) null);
    }

    @Override // defpackage.aoin, defpackage.aoim
    public final /* synthetic */ java.lang.Object a() {
        throw null;
    }
}
