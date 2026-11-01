package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mbl {
    public final java.util.Set a;
    public final defpackage.aoir b;
    public final j$.util.concurrent.ConcurrentHashMap c;
    public final java.util.Map d;
    public final defpackage.adak e;
    private final defpackage.aoir f;
    private final defpackage.aoir g;
    private final defpackage.aoir h;

    public mbl(defpackage.adak adakVar, java.util.Set set) {
        if (adakVar == null) {
            defpackage.aooh.i("cuiImpressionsLogger");
        }
        if (set == null) {
            defpackage.aooh.i("allCuiProviders");
        }
        this.e = adakVar;
        this.a = set;
        this.f = new defpackage.aoiy(new defpackage.mbe(this, 5));
        this.b = new defpackage.aoiy(new defpackage.mbe(this, 6));
        this.g = new defpackage.aoiy(new defpackage.mbe(this, 7));
        this.h = new defpackage.aoiy(new defpackage.mbe(this, 8));
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = new j$.util.concurrent.ConcurrentHashMap();
        this.c = concurrentHashMap;
        this.d = concurrentHashMap;
    }

    public final defpackage.zan a(defpackage.zao zaoVar) {
        defpackage.zan zanVarB = b(zaoVar, defpackage.zak.a);
        if (zanVarB != null) {
            return zanVarB;
        }
        throw new java.lang.IllegalStateException("Uncaught exception error should have been set.");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Set] */
    public final defpackage.zan b(defpackage.zao zaoVar, defpackage.zal zalVar) {
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
        pgi pgiVar = (pgi) d().get(zaoVar);
        if (pgiVar != null) {
            loop0: for (defpackage.aacy aacyVar : pgiVar.b) {
                ?? r2 = aacyVar.b;
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(r2, 10));
                java.util.Iterator it = r2.iterator();
                while (it.hasNext()) {
                    arrayList.add((java.lang.Boolean) pgiVar.a.get((defpackage.mce) it.next()));
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

    public final java.util.List c() {
        return (java.util.List) this.f.a();
    }

    public final java.util.Map d() {
        return (java.util.Map) this.h.a();
    }

    public final java.util.Map e() {
        return (java.util.Map) this.g.a();
    }

    public final java.util.Map f(java.lang.String str) {
        java.util.Map map = this.d;
        if (str == null) {
            return map;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str2 = ((mbb) entry.getKey()).b;
            if (str2 == null || defpackage.aooh.n(str2, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
