package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class achn implements defpackage.amyv {
    private final /* synthetic */ int $cid;

    public achn(int i) {
        this.$cid = i;
    }

    public static void b(defpackage.acdv acdvVar) {
        if (acdvVar == null) {
            throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static defpackage.ecx c(android.content.Context context, defpackage.aoss aossVar) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(aossVar, "lightweightScope");
        return defpackage.eaw.c(new defpackage.eew(defpackage.abrz.y(defpackage.achw.a.m()).B()), null, defpackage.aokc.a, aossVar, new defpackage.acik(context, 0));
    }

    public static defpackage.aktj d() {
        defpackage.ajyk ajykVarAd = defpackage.ajsz.ad(defpackage.aktj.a.m());
        defpackage.akzx akzxVar = (defpackage.akzx) ajykVarAd.b;
        akzxVar.u();
        defpackage.aktj aktjVar = (defpackage.aktj) akzxVar.b;
        aktjVar.b |= 8192;
        aktjVar.g = true;
        ajykVarAd.J();
        akzxVar.u();
        defpackage.aktj aktjVar2 = (defpackage.aktj) akzxVar.b;
        aktjVar2.b |= 262144;
        aktjVar2.i = true;
        defpackage.aktj aktjVarI = ajykVarAd.I();
        defpackage.aooc.ap(aktjVarI);
        return aktjVarI;
    }

    public static defpackage.aktj e() {
        defpackage.ajyk ajykVarAd = defpackage.ajsz.ad(defpackage.aktj.a.m());
        ajykVarAd.J();
        defpackage.aktj aktjVarI = ajykVarAd.I();
        defpackage.aooc.ap(aktjVarI);
        return aktjVarI;
    }

    public static defpackage.aktj f() {
        defpackage.ajyk ajykVarAd = defpackage.ajsz.ad(defpackage.aktj.a.m());
        if (defpackage.anfq.a.eZ().i()) {
            defpackage.akzx akzxVar = (defpackage.akzx) ajykVarAd.b;
            akzxVar.u();
            defpackage.aktj aktjVar = (defpackage.aktj) akzxVar.b;
            aktjVar.b |= 32;
            aktjVar.c = true;
        }
        defpackage.aktj aktjVarI = ajykVarAd.I();
        defpackage.aooc.ap(aktjVarI);
        return aktjVarI;
    }

    public static defpackage.aktj g() {
        defpackage.ajyk ajykVarAd = defpackage.ajsz.ad(defpackage.aktj.a.m());
        defpackage.akzx akzxVar = (defpackage.akzx) ajykVarAd.b;
        akzxVar.u();
        defpackage.aktj aktjVar = (defpackage.aktj) akzxVar.b;
        aktjVar.b |= 256;
        aktjVar.d = true;
        defpackage.aktj aktjVarI = ajykVarAd.I();
        defpackage.aooc.ap(aktjVarI);
        return aktjVarI;
    }

    public static defpackage.ajcu h(defpackage.ahyn ahynVar) {
        int i = defpackage.adxs.a;
        defpackage.ajcu ajcuVar = (defpackage.ajcu) ((defpackage.aoin) ((defpackage.ahys) ahynVar).a).a();
        if (ajcuVar != null) {
            return ajcuVar;
        }
        defpackage.annk annkVar = new defpackage.annk(null, null, null);
        annkVar.o("gnp-background-thread-%d");
        return new aduq(defpackage.aiql.r(java.util.concurrent.Executors.newFixedThreadPool(4, defpackage.annk.p(annkVar))), defpackage.aiql.s(java.util.concurrent.Executors.newSingleThreadScheduledExecutor()));
    }

    public static defpackage.ajcu i(defpackage.ahyn ahynVar, defpackage.ajcu ajcuVar) {
        int i = defpackage.adxs.a;
        defpackage.aooh.f(ajcuVar, "backgroundExecutor");
        defpackage.ajcu ajcuVar2 = (defpackage.ajcu) ((defpackage.aoin) ((defpackage.ahys) ahynVar).a).a();
        if (ajcuVar2 != null) {
            ajcuVar = ajcuVar2;
        }
        defpackage.aooc.ap(ajcuVar);
        return ajcuVar;
    }

    public static defpackage.adxz j(defpackage.aduu aduuVar, defpackage.aefv aefvVar, android.content.Context context) {
        defpackage.adxz adxzVarBP;
        int i = defpackage.adxy.a;
        defpackage.aooh.f(aduuVar, "gnpConfig");
        defpackage.aooh.f(context, "context");
        aefvVar.a(context);
        java.lang.String strA = defpackage.anfe.a.eZ().a();
        if (strA.length() > 0) {
            try {
                adxzVarBP = (defpackage.adxz) java.lang.Enum.valueOf(defpackage.adxz.class, strA);
            } catch (java.lang.IllegalArgumentException e) {
                defpackage.aiob aiobVar = (defpackage.aiob) ((defpackage.aiob) defpackage.adxx.a.d()).k(e);
                defpackage.adut adutVar = aduuVar.c;
                defpackage.aooh.e(adutVar, "getDefaultEnvironment(...)");
                aiobVar.I("Invalid environment_override value %s, falling back to %s", strA, defpackage.agab.bP(adutVar).name());
                defpackage.adut adutVar2 = aduuVar.c;
                defpackage.aooh.e(adutVar2, "getDefaultEnvironment(...)");
                adxzVarBP = defpackage.agab.bP(adutVar2);
            }
        } else {
            defpackage.adut adutVar3 = aduuVar.c;
            defpackage.aooh.e(adutVar3, "getDefaultEnvironment(...)");
            adxzVarBP = defpackage.agab.bP(adutVar3);
        }
        defpackage.aooc.ap(adxzVarBP);
        return adxzVarBP;
    }

    public static defpackage.aktj k() {
        defpackage.ajyk ajykVarAd = defpackage.ajsz.ad(defpackage.aktj.a.m());
        defpackage.akzx akzxVar = (defpackage.akzx) ajykVarAd.b;
        akzxVar.u();
        defpackage.aktj aktjVar = (defpackage.aktj) akzxVar.b;
        aktjVar.b |= 2048;
        aktjVar.f = true;
        defpackage.aktj aktjVarI = ajykVarAd.I();
        defpackage.aooc.ap(aktjVarI);
        return aktjVarI;
    }

    public static defpackage.aktj l() {
        defpackage.ajyk ajykVarAd = defpackage.ajsz.ad(defpackage.aktj.a.m());
        defpackage.akzx akzxVar = (defpackage.akzx) ajykVarAd.b;
        akzxVar.u();
        defpackage.aktj aktjVar = (defpackage.aktj) akzxVar.b;
        aktjVar.b |= 524288;
        aktjVar.j = true;
        defpackage.aktj aktjVarI = ajykVarAd.I();
        defpackage.aooc.ap(aktjVarI);
        return aktjVarI;
    }

    public static defpackage.ecx m(android.content.Context context, defpackage.aoss aossVar, android.content.SharedPreferences sharedPreferences, defpackage.aefv aefvVar, defpackage.adtq adtqVar) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (aossVar == null) {
            defpackage.aooh.i("blockingScope");
        }
        if (sharedPreferences == null) {
            defpackage.aooh.i("fcmPreferences");
        }
        aefvVar.a(context);
        java.util.ArrayList arrayList = new java.util.ArrayList(new defpackage.aojv(new defpackage.ecs[]{defpackage.aecc.a(sharedPreferences)}, true));
        if (defpackage.ango.a.eZ().d()) {
            arrayList.add(defpackage.aecc.a);
        }
        return defpackage.eaw.c(new defpackage.eew(defpackage.agab.bS(defpackage.aegw.a.m()).z()), new defpackage.efk(new defpackage.rou(12)), arrayList, aossVar, new defpackage.acik(adtqVar.a(context, "fcm_registration_data.pb", false), 4));
    }

    public static defpackage.aenl n(defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        if (!defpackage.afec.h(java.lang.Thread.currentThread())) {
            defpackage.aeqs aeqsVar = (defpackage.aeqs) aoinVar2.a();
            if (!defpackage.aeqs.b()) {
                defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/CrashOnBadPrimesConfiguration", "observedBackgroundInitialization", 29, "CrashOnBadPrimesConfiguration.java");
                java.lang.Object obj = aeqsVar.a;
                aimwVar.y("Primes init triggered from background in package: %s", obj);
                if (!aeqsVar.a()) {
                    throw new java.lang.IllegalStateException(java.lang.String.format("Primes init triggered from background in package: %s", obj));
                }
            }
        }
        return new defpackage.aenl((defpackage.aenm) aoinVar.a());
    }

    public static defpackage.adao o(defpackage.amwu amwuVar) {
        return new defpackage.adao(new defpackage.achm(amwuVar, 3));
    }

    public static defpackage.adao p(defpackage.amwu amwuVar) {
        return new defpackage.adao(new defpackage.achm(amwuVar, 2));
    }

    public static defpackage.adao q(defpackage.amwu amwuVar) {
        return new defpackage.adao(new defpackage.achm(amwuVar, 4));
    }

    public static defpackage.adao r(defpackage.amwu amwuVar) {
        return new defpackage.adao(new defpackage.achm(amwuVar, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [aoin] */
    /* JADX WARN: Type inference failed for: r5v3, types: [aenh] */
    public static defpackage.ahpz s(defpackage.ahqj ahqjVar, defpackage.ahda ahdaVar, java.util.Set set) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Set hashSet2 = new java.util.HashSet();
        new java.util.HashMap();
        new java.util.HashMap();
        if (ahqjVar == null) {
            defpackage.aooh.i("traceManager");
        }
        ?? aenhVar = ahdaVar.a;
        if (aenhVar == 0) {
            defpackage.aooh.i("rootTraceSeedExtrasProvider");
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            defpackage.ahou ahouVar = (defpackage.ahou) it.next();
            if (ahouVar == null) {
                defpackage.aooh.i("spanExtras");
            }
            hashSet2 = defpackage.ajsz.aJ(hashSet2, ahouVar);
        }
        if (ahqjVar == null) {
            if (!hashSet.isEmpty()) {
                defpackage.aooh.g();
                new defpackage.ahoh(null);
                throw null;
            }
            ahqjVar = new ahoe();
        }
        if (aenhVar == 0) {
            aenhVar = new defpackage.aenh(9);
        }
        return new defpackage.ahpz(ahqjVar, aenhVar, hashSet2);
    }

    @Override // defpackage.aoin, defpackage.aoim
    public final /* synthetic */ java.lang.Object a() {
        switch (this.$cid) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                throw null;
            case 3:
                throw null;
            case 4:
                throw null;
            case 5:
                throw null;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                throw null;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                throw null;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                throw null;
            case 9:
                return new defpackage.aazc(null);
            case 10:
                throw null;
            case 11:
                throw null;
            case 12:
                throw null;
            case 13:
                throw null;
            case 14:
                throw null;
            case 15:
                throw null;
            case 16:
                throw null;
            case 17:
                throw null;
            default:
                throw null;
        }
    }
}
