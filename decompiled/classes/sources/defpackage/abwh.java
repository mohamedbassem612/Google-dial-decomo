package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abwh implements defpackage.abwo {
    public final defpackage.abwo a;
    public final defpackage.aeza b;

    public abwh(defpackage.abwo abwoVar, defpackage.aeza aezaVar) {
        if (aezaVar == null) {
            defpackage.aooh.i("cache");
        }
        this.a = abwoVar;
        this.b = aezaVar;
    }

    @Override // defpackage.abwo
    public final java.lang.Object b(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.aeza aezaVar = this.b;
        return aezaVar.g(obj) ? aezaVar.c(obj) : defpackage.aoov.aj(defpackage.aour.a, new abvg(this, obj, (defpackage.aoln) null, 6), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.abwo
    public final java.lang.Object c(java.util.Set set, defpackage.aoln aolnVar) {
        defpackage.abwg abwgVar;
        ?? r8;
        if (aolnVar instanceof defpackage.abwg) {
            abwgVar = (defpackage.abwg) aolnVar;
            int i = abwgVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                abwgVar.d = i - Integer.MIN_VALUE;
            } else {
                abwgVar = new defpackage.abwg(this, aolnVar);
            }
        } else {
            abwgVar = new defpackage.abwg(this, aolnVar);
        }
        java.lang.Object obj = abwgVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = abwgVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.aeza aezaVar = this.b;
            if (set == null) {
                defpackage.aooh.i("keys");
            }
            r8 = set;
            if (!aezaVar.a && !aezaVar.b.keySet().containsAll(set)) {
                defpackage.aour aourVar = defpackage.aour.a;
                ryd rydVar = new ryd(this, set, (defpackage.aoln) null, 10);
                abwgVar.a = set;
                abwgVar.d = 1;
                if (defpackage.aoov.aj(aourVar, rydVar, abwgVar) == aoluVar) {
                    r8 = set;
                    r8 = set;
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj2 = abwgVar.a;
            defpackage.aooc.af(obj);
            r8 = obj2;
        }
        r8 = set;
        r8 = set;
        r8 = set;
        defpackage.aeza aezaVar2 = this.b;
        if (r8 == 0) {
            defpackage.aooh.i("keys");
        }
        defpackage.aola aolaVar = new defpackage.aola(r8.size());
        if (aezaVar2.a) {
            for (java.lang.Object obj3 : r8) {
                java.lang.Object obj4 = aezaVar2.b.get(obj3);
                if (obj4 != null) {
                    aolaVar.put(obj3, obj4);
                }
            }
        } else {
            for (java.lang.Object obj5 : r8) {
                ?? r1 = aezaVar2.b;
                java.lang.Object obj6 = r1.get(obj5);
                if (obj6 != null) {
                    aolaVar.put(obj5, obj6);
                } else if (!r1.containsKey(obj5)) {
                    java.util.Objects.toString(obj5);
                    throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj5).concat(" data not loaded"));
                }
            }
        }
        return aolaVar.e();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.abwo
    public final java.lang.Object d(defpackage.aoln aolnVar) {
        defpackage.aeza aezaVar = this.b;
        boolean z = aezaVar.a;
        if (!z) {
            return defpackage.aoov.aj(defpackage.aour.a, new defpackage.unj(this, (defpackage.aoln) null, 17), aolnVar);
        }
        if (!z) {
            throw new java.lang.IllegalStateException("All data not loaded");
        }
        java.lang.Object obj = aezaVar.c;
        if (obj != null) {
            return obj;
        }
        ?? r4 = aezaVar.b;
        defpackage.aola aolaVar = new defpackage.aola(r4.size());
        for (java.util.Map.Entry entry : r4.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value != null) {
                aolaVar.put(key, value);
            }
        }
        java.util.Map mapE = aolaVar.e();
        aezaVar.c = mapE;
        return mapE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.abwo
    public final java.lang.Object e(defpackage.ahbq ahbqVar, defpackage.aoln aolnVar) {
        ?? r0 = ahbqVar.c;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.ajsz.aL(r0.size()));
        for (java.util.Map.Entry entry : r0.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.Object key2 = entry.getKey();
            abwl abwlVar = (abwl) entry.getValue();
            if (!defpackage.aooh.n(this.b.c(key2), abwlVar.b())) {
                java.util.Objects.toString(key2);
                throw new java.lang.IllegalArgumentException("Before data does not match for ".concat(java.lang.String.valueOf(key2)));
            }
            linkedHashMap.put(key, abwlVar.a());
        }
        java.lang.Object objAj = defpackage.aoov.aj(defpackage.aour.a, new xhb(this, ahbqVar, linkedHashMap, (defpackage.aoln) null, 5), aolnVar);
        return objAj != defpackage.aolu.a ? defpackage.aojh.a : objAj;
    }
}
