package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahct {
    public final java.util.concurrent.Executor a;
    public final int b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;
    public final java.lang.Object h;
    public final java.lang.Object i;
    public final java.lang.Object j;
    public final java.lang.Object k;
    public final java.lang.Object l;
    private final java.lang.Object m;
    private final java.lang.Object n;

    public ahct(defpackage.adgw adgwVar) {
        this.d = new defpackage.tvn((char[]) null);
        defpackage.tvn tvnVar = new defpackage.tvn((char[]) null);
        this.k = tvnVar;
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
        android.content.Context context = adgwVar.a;
        this.n = context;
        defpackage.adjs adjsVarB = defpackage.adjs.b(context);
        this.m = adjsVarB;
        defpackage.ajct ajctVarR = defpackage.adie.a;
        this.a = ajctVarR;
        defpackage.adhk adhkVar = defpackage.adhk.a;
        defpackage.adgy adgyVar = new defpackage.adgy(adgwVar.f);
        this.i = adgyVar;
        defpackage.adjz adjzVar = new defpackage.adjz(new java.io.File(adgwVar.a.getFilesDir(), "superpacks"), new defpackage.adjo(adjsVarB), adhkVar, adgyVar);
        this.f = adjzVar;
        synchronized (adjzVar.b) {
            if (adjzVar.c.containsKey("manifests")) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bx("manifests", "Namespace is already registered: "));
            }
            adjzVar.c.put("manifests", new defpackage.adkh("manifests", 0L, true));
        }
        defpackage.aify aifyVar = adgwVar.h;
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null indexSpecs");
        }
        this.l = new defpackage.ahbq(adjzVar, new defpackage.aogc(new defpackage.adgd(defpackage.adgd.b, aifyVar), adgwVar.e, (byte[]) null));
        defpackage.adjq adjqVar = new defpackage.adjq(adjsVarB);
        this.h = adjqVar;
        defpackage.adhu adhuVar = new defpackage.adhu(adgwVar.b);
        defpackage.adhu adhuVar2 = new defpackage.adhu(adgwVar.c);
        defpackage.adhu adhuVar3 = new defpackage.adhu(adgwVar.d);
        if (ajctVarR == null) {
            defpackage.annk annkVar = new defpackage.annk(null, null, null);
            annkVar.o("superpacks-packs-control-%d");
            ajctVarR = defpackage.aiql.r(java.util.concurrent.Executors.newSingleThreadExecutor(defpackage.annk.p(annkVar)));
        }
        defpackage.adlt adltVar = new defpackage.adlt(adjzVar, adhuVar, adhuVar2, adhuVar3, ajctVarR, adjqVar, adgyVar, adgwVar.h);
        this.e = adltVar;
        this.j = new defpackage.adjr(adjsVarB);
        this.g = new defpackage.adiy(new defpackage.adjp(adjsVarB));
        this.b = adgwVar.g;
        defpackage.tvn tvnVar2 = new defpackage.tvn(tvnVar);
        adjzVar.h.R(tvnVar2);
        adjsVarB.a.R(tvnVar2);
        ((defpackage.tvn) ((defpackage.gat) adltVar.g).b).R(tvnVar2);
        for (defpackage.adip adipVar : ((defpackage.apnt) adltVar.j).i()) {
            if (adipVar instanceof defpackage.adna) {
                return;
            }
        }
    }

    public static final java.lang.String[] d(java.util.Set set, defpackage.ajsy ajsyVar) {
        if (ajsyVar == null) {
            return (java.lang.String[]) set.toArray(new java.lang.String[0]);
        }
        defpackage.alat alatVar = ajsyVar.i;
        defpackage.aooh.e(alatVar, "getLogSourceNameList(...)");
        return (java.lang.String[]) defpackage.ajsz.bQ(defpackage.ajsz.aI(set, alatVar)).toArray(new java.lang.String[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [amwu, java.lang.Object] */
    public final defpackage.ajcq a(java.lang.String str, defpackage.ajsy ajsyVar) {
        defpackage.akzc akzcVar;
        defpackage.ajas ajasVar = (defpackage.ajas) ((java.util.Map) this.m.a()).get(str);
        byte[] bArrD = null;
        if (ajasVar == null) {
            if (ajsyVar != null && (akzcVar = ajsyVar.k) != null) {
                bArrD = akzcVar.D();
            }
            return defpackage.aiql.z(bArrD);
        }
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1362, "Getting legacy params", defpackage.ahot.a, true);
        try {
            defpackage.ajcq ajcqVarG = defpackage.ahvr.G(ajasVar, this.a);
            ahoqVarX.a(ajcqVarG);
            defpackage.ajsz.ak(ahoqVarX, null);
            return ajcqVarG;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahoqVarX, th);
                throw th2;
            }
        }
    }

    public final defpackage.ajcq b() {
        return defpackage.ahvr.B(((defpackage.aewq) this.n).f.d(false), defpackage.aado.class, new defpackage.ahbx(new defpackage.rou(18), 4), defpackage.ajbm.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Collection] */
    public final boolean c(java.lang.String str, defpackage.ajsy ajsyVar) {
        boolean z = ((java.util.Map) this.m.a()).containsKey(str) || ((java.util.Map) this.g.a()).containsKey(str) || ((java.util.Map) this.h.a()).containsKey(str);
        try {
            if (!((defpackage.aexi) this.c.a()).i()) {
                return false;
            }
        } catch (com.google.android.gms.common.GooglePlayServicesManifestException e) {
            android.util.Log.e("MendelPackageState", "Failed to check if declarative registration is supported", e);
        }
        if (ajsyVar == null) {
            return false;
        }
        defpackage.alat alatVar = ajsyVar.i;
        defpackage.aooh.e(alatVar, "getLogSourceNameList(...)");
        return defpackage.ahvr.bx(alatVar).containsAll(this.e) && !z;
    }

    public final com.google.android.libraries.micore.superpacks.SuperpackManifest e(java.lang.String str, int i, java.lang.String str2) {
        com.google.android.libraries.micore.superpacks.SuperpackManifest superpackManifestD = null;
        if (i < 0) {
            return null;
        }
        try {
            superpackManifestD = ((defpackage.ahbq) this.l).d(str, i);
            if (superpackManifestD != null) {
                return superpackManifestD;
            }
            ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.d()).l("com/google/android/libraries/micore/superpacks/Superpacks", "getSuperpackManifest", 1915, "Superpacks.java")).G("Manifest for %s is not available, version: %d", str, i);
            return superpackManifestD;
        } catch (defpackage.adgf e) {
            com.google.android.libraries.micore.superpacks.SuperpackManifest superpackManifest = superpackManifestD;
            ((defpackage.aiob) ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.d()).k(e)).l("com/google/android/libraries/micore/superpacks/Superpacks", "getSuperpackManifest", 1923, "Superpacks.java")).G("Failed to parse manifest for %s, version: %d", str, i);
            ((defpackage.tvn) this.k).P(new adgu(str, i, str2, e, 1));
            return superpackManifest;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List f(java.lang.String str, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ((java.util.concurrent.locks.ReentrantLock) ((defpackage.ahbq) this.l).b).lock();
        try {
            defpackage.ailk ailkVarListIterator = ((defpackage.aify) list).listIterator(0);
            while (ailkVarListIterator.hasNext()) {
                defpackage.adhx adhxVar = (defpackage.adhx) ailkVarListIterator.next();
                com.google.android.libraries.micore.superpacks.SuperpackManifest superpackManifestE = e(str, adhxVar.a(), "openPacks");
                if (superpackManifestE == null) {
                    throw new defpackage.adhq(defpackage.a.bH(adhxVar, "A manifest could not be found for "));
                }
                java.lang.String str2 = ((defpackage.adhb) adhxVar.b()).b;
                defpackage.aigf aigfVar = ((com.google.android.libraries.micore.superpacks.C$AutoValue_SuperpackManifest) superpackManifestE).c;
                if (!aigfVar.containsKey(str2) && !aigfVar.containsKey(com.google.android.libraries.micore.superpacks.common.PackManifest.r(str2))) {
                    throw new defpackage.adhq(defpackage.a.bH(adhxVar, "The manifest does not contain "));
                }
                java.lang.String str3 = ((defpackage.adhb) adhxVar.b()).b;
                com.google.android.libraries.micore.superpacks.common.PackManifest packManifestA = (com.google.android.libraries.micore.superpacks.common.PackManifest) aigfVar.get(str3);
                if (packManifestA == null) {
                    com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = (com.google.android.libraries.micore.superpacks.common.PackManifest) aigfVar.get(com.google.android.libraries.micore.superpacks.common.PackManifest.r(str3));
                    if (packManifest == null) {
                        throw new java.lang.IllegalArgumentException("Pack " + str3 + " is not part of manifest " + superpackManifestE.toString());
                    }
                    defpackage.adis adisVarF = packManifest.f();
                    adisVarF.k(str3);
                    packManifestA = adisVarF.a();
                }
                arrayList.add(packManifestA);
            }
            ((java.util.concurrent.locks.ReentrantLock) ((defpackage.ahbq) this.l).b).unlock();
            return arrayList;
        } catch (java.lang.Throwable th) {
            ((java.util.concurrent.locks.ReentrantLock) ((defpackage.ahbq) this.l).b).unlock();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [adiz, java.lang.Object] */
    public final void g() {
        if (((java.util.concurrent.atomic.AtomicBoolean) this.c).getAndSet(true)) {
            return;
        }
        this.m.getReadableDatabase();
    }

    public final void h(java.lang.String str, java.util.List list) {
        if (((defpackage.adgy) this.i).b(str) != defpackage.adgj.a) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
            }
        }
    }

    public ahct(defpackage.aoin aoinVar, defpackage.apdi apdiVar, java.util.concurrent.Executor executor, defpackage.apnt apntVar, defpackage.amwu amwuVar, int i, java.util.Set set, java.util.Map map, defpackage.amwu amwuVar2, defpackage.amwu amwuVar3, defpackage.amwu amwuVar4, defpackage.gou gouVar, defpackage.aewq aewqVar, j$.util.Optional optional) {
        defpackage.aooh.f(aoinVar, "phenotypeClient");
        defpackage.aooh.f(executor, "backgroundExecutor");
        defpackage.aooh.f(apntVar, "subpackager");
        defpackage.aooh.f(amwuVar, "configurationUpdater");
        defpackage.aooh.f(set, "logSources");
        defpackage.aooh.f(amwuVar2, "legacyParamsMap");
        defpackage.aooh.f(amwuVar3, "runtimeProperties");
        defpackage.aooh.f(amwuVar4, "runtimePropertiesWithFallback");
        defpackage.aooh.f(aewqVar, "phenotypeContext");
        defpackage.aooh.f(optional, "perProcessRegistrationOptional");
        this.c = aoinVar;
        this.k = apdiVar;
        this.a = executor;
        this.l = apntVar;
        this.d = amwuVar;
        this.b = i;
        this.e = set;
        this.f = map;
        this.m = amwuVar2;
        this.g = amwuVar3;
        this.h = amwuVar4;
        this.i = gouVar;
        this.n = aewqVar;
        this.j = optional;
    }
}
