package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agqj {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;
    public final java.lang.Object h;

    public agqj(defpackage.ahbv ahbvVar, java.util.Set set) {
        if (ahbvVar == null) {
            defpackage.aooh.i("cuiImpressionsLogger");
        }
        if (set == null) {
            defpackage.aooh.i("allCuiProviders");
        }
        this.h = ahbvVar;
        this.a = set;
        this.c = new defpackage.aoiy(new defpackage.uob(this, 6));
        this.d = new defpackage.aoiy(new defpackage.uob(this, 7));
        this.e = new defpackage.aoiy(new defpackage.uob(this, 8));
        this.f = new defpackage.aoiy(new defpackage.uob(this, 9));
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = new j$.util.concurrent.ConcurrentHashMap();
        this.g = concurrentHashMap;
        this.b = concurrentHashMap;
    }

    public static defpackage.anpu a(agos agosVar, java.util.Set set) {
        defpackage.ajcq ajcqVarY;
        java.util.ArrayList arrayList = new java.util.ArrayList(set.size());
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                ajcqVarY = ((defpackage.agou) it.next()).b(agosVar);
                arrayList.add(ajcqVarY);
            } catch (java.lang.Exception e) {
                ajcqVarY = defpackage.aiql.y(e);
            }
            defpackage.agsm.i(1304, ajcqVarY, "AccountEnabledInterceptor Failed", new java.lang.Object[0]);
        }
        return defpackage.aiql.Y(arrayList);
    }

    public static final java.lang.String b(acwb acwbVar) {
        return acwbVar.c + '|' + acwbVar.d;
    }

    public static final java.util.Set c(java.util.Map map, java.lang.String str) {
        java.util.Set set = (java.util.Set) map.get(str);
        if (set != null) {
            return set;
        }
        map.put(str, new java.util.HashSet());
        return (java.util.Set) map.get(str);
    }

    public final defpackage.zan d(defpackage.zao zaoVar) {
        defpackage.zan zanVarE = e(zaoVar, defpackage.zak.a);
        if (zanVarE != null) {
            return zanVarE;
        }
        throw new java.lang.IllegalStateException("Uncaught exception error should have been set.");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Set] */
    public final defpackage.zan e(defpackage.zao zaoVar, defpackage.zal zalVar) {
        defpackage.zan zanVarBM;
        java.lang.Object obj = null;
        if (zalVar instanceof defpackage.zak) {
            zanVarBM = defpackage.afsq.bM(zaoVar, (defpackage.zak) zalVar);
        } else {
            zanVarBM = (defpackage.zan) zaoVar.e.get(zalVar);
            if (zanVarBM == null) {
                return null;
            }
        }
        defpackage.zjm zjmVar = (defpackage.zjm) g().get(zaoVar);
        if (zjmVar != null) {
            loop0: for (defpackage.aacy aacyVar : zjmVar.b) {
                ?? r2 = aacyVar.b;
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(r2, 10));
                java.util.Iterator it = r2.iterator();
                while (it.hasNext()) {
                    arrayList.add((java.lang.Boolean) zjmVar.a.get((defpackage.mce) it.next()));
                }
                if (!arrayList.isEmpty()) {
                    java.util.Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!defpackage.aooh.n((java.lang.Boolean) it2.next(), java.lang.Boolean.TRUE)) {
                            }
                        }
                    }
                }
                obj = aacyVar.a;
            }
            if (obj != null) {
                defpackage.aaif aaifVar = (defpackage.aaif) obj;
                ?? r6 = aaifVar.b;
                return defpackage.zan.a(zanVarBM, (defpackage.aenj) aaifVar.c, aaifVar.a, r6);
            }
        }
        return zanVarBM;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoir, java.lang.Object] */
    public final java.util.List f() {
        return (java.util.List) this.c.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoir, java.lang.Object] */
    public final java.util.Map g() {
        return (java.util.Map) this.f.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoir, java.lang.Object] */
    public final java.util.Map h() {
        return (java.util.Map) this.e.a();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final java.util.Map i(java.lang.String str) {
        ?? r3 = this.b;
        if (str == null) {
            return r3;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : r3.entrySet()) {
            java.lang.String str2 = ((defpackage.zat) entry.getKey()).b;
            if (str2 == null || defpackage.aooh.n(str2, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public agqj(defpackage.aogc aogcVar, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5) {
        this.h = aogcVar;
        this.a = ajctVar;
        this.b = ajctVar2;
        this.c = aoinVar;
        this.d = aoinVar2;
        this.g = aoinVar5;
        this.e = aoinVar3;
        this.f = aoinVar4;
    }

    public agqj(android.content.Context context, defpackage.acyv acyvVar, defpackage.adlt adltVar, defpackage.aogc aogcVar, defpackage.adba adbaVar, defpackage.acxa acxaVar, defpackage.ahyn ahynVar, java.util.concurrent.Executor executor) {
        this.h = context;
        this.b = acyvVar;
        this.c = adltVar;
        this.f = aogcVar;
        this.a = adbaVar;
        this.g = acxaVar;
        this.e = ahynVar;
        this.d = executor;
    }
}
