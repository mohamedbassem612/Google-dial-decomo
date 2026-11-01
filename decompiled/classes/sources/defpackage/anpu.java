package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anpu {
    public final boolean a;
    public final java.lang.Object b;

    public anpu(boolean z, defpackage.anop anopVar) {
        this.a = z;
        if (anopVar == null) {
            throw new java.lang.NullPointerException("parser");
        }
        this.b = anopVar;
    }

    public final defpackage.anpr a(java.util.Map map) {
        defpackage.anpr anprVar;
        java.lang.Object obj;
        aobt aobtVar;
        defpackage.anzs anzsVar;
        java.util.Map mapJ;
        try {
            defpackage.anpr anprVarB = ((defpackage.anop) this.b).b(map);
            anzq anzqVar = null;
            if (anprVarB == null) {
                obj = null;
            } else {
                defpackage.anqw anqwVar = anprVarB.a;
                if (anqwVar != null) {
                    return new defpackage.anpr(anqwVar);
                }
                obj = anprVarB.b;
            }
            boolean z = this.a;
            if (!z || map == null || (mapJ = defpackage.aodc.j(map, "retryThrottling")) == null) {
                aobtVar = null;
            } else {
                float fFloatValue = defpackage.aodc.c(mapJ, "maxTokens").floatValue();
                float fFloatValue2 = defpackage.aodc.c(mapJ, "tokenRatio").floatValue();
                defpackage.ahvr.bZ(fFloatValue > 0.0f, "maxToken should be greater than zero");
                defpackage.ahvr.bZ(fFloatValue2 > 0.0f, "tokenRatio should be greater than zero");
                aobtVar = new aobt(fFloatValue, fFloatValue2);
            }
            java.util.HashMap map2 = new java.util.HashMap();
            java.util.HashMap map3 = new java.util.HashMap();
            java.util.Map mapJ2 = map == null ? null : defpackage.aodc.j(map, "healthCheckConfig");
            java.util.List<java.util.Map> listH = defpackage.aodc.h(map, "methodConfig");
            if (listH == null) {
                anzsVar = new defpackage.anzs(null, map2, map3, aobtVar, obj, mapJ2);
            } else {
                for (java.util.Map map4 : listH) {
                    anzq anzqVar2 = new anzq(map4, z);
                    java.util.List<java.util.Map> listH2 = defpackage.aodc.h(map4, "name");
                    if (listH2 != null && !listH2.isEmpty()) {
                        for (java.util.Map map5 : listH2) {
                            java.lang.String strF = defpackage.aodc.f(map5, "service");
                            java.lang.String strF2 = defpackage.aodc.f(map5, "method");
                            if (defpackage.ahvr.cp(strF)) {
                                defpackage.ahvr.bR(defpackage.ahvr.cp(strF2), "missing service name for method %s", strF2);
                                defpackage.ahvr.bR(anzqVar == null, "Duplicate default method config in service config %s", map);
                                anzqVar = anzqVar2;
                            } else if (defpackage.ahvr.cp(strF2)) {
                                defpackage.ahvr.bR(!map3.containsKey(strF), "Duplicate service %s", strF);
                                map3.put(strF, anzqVar2);
                            } else {
                                java.lang.String strC = anpk.c(strF, strF2);
                                defpackage.ahvr.bR(!map2.containsKey(strC), "Duplicate method name %s", strC);
                                map2.put(strC, anzqVar2);
                            }
                        }
                    }
                }
                anzsVar = new defpackage.anzs(anzqVar, map2, map3, aobtVar, obj, mapJ2);
            }
            return new defpackage.anpr(anzsVar);
        } catch (java.lang.RuntimeException e) {
            anprVar = new defpackage.anpr(defpackage.anqw.d.f("failed to parse service config").e(e));
            return anprVar;
        } catch (java.lang.Throwable th) {
            anprVar = new defpackage.anpr(defpackage.anqw.k.f("Unexpected error parsing service config").e(th));
            return anprVar;
        }
    }

    public final defpackage.ajcq b(java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        return new defpackage.ajbl((defpackage.aifo) this.b, this.a, executor, callable);
    }

    public final defpackage.ajcq c(defpackage.ajas ajasVar, java.util.concurrent.Executor executor) {
        return new defpackage.ajbl((defpackage.aifo) this.b, this.a, executor, ajasVar);
    }

    public anpu(boolean z, defpackage.aify aifyVar) {
        this.a = z;
        this.b = aifyVar;
    }

    public anpu(defpackage.anmx anmxVar, boolean z) {
        this.b = anmxVar;
        this.a = z;
    }
}
