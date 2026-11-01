package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class spx extends defpackage.aomh implements defpackage.aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    java.lang.Object f;
    java.lang.Object g;
    int h;
    int i;
    final /* synthetic */ defpackage.sqc j;
    final /* synthetic */ defpackage.kfj k;
    private /* synthetic */ java.lang.Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spx(defpackage.sqc sqcVar, defpackage.kfj kfjVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.j = sqcVar;
        this.k = kfjVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.spx) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:26:0x0105  */
    /* JADX WARN: Code duplicated, block: B:30:0x014b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0172  */
    /* JADX WARN: Code duplicated, block: B:36:0x0188  */
    /* JADX WARN: Code duplicated, block: B:37:0x018b  */
    /* JADX WARN: Code duplicated, block: B:41:0x019d  */
    /* JADX WARN: Code duplicated, block: B:43:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:45:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:57:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:59:0x0211  */
    /* JADX WARN: Code duplicated, block: B:61:0x021b  */
    /* JADX WARN: Code duplicated, block: B:71:0x025b  */
    /* JADX WARN: Code duplicated, block: B:75:0x024f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.aoss aossVar;
        defpackage.aosy aosyVarAm;
        java.lang.Object objC;
        defpackage.aosy aosyVar;
        java.util.Map map;
        int size;
        defpackage.aigb aigbVar;
        java.lang.Object objA;
        defpackage.aigb aigbVar2;
        defpackage.aosy aosyVar2;
        java.util.Map map2;
        defpackage.aigf aigfVarB;
        java.lang.Object objD;
        defpackage.aosy aosyVar3;
        defpackage.spp sppVar;
        defpackage.aigf aigfVar;
        defpackage.sqc sqcVar;
        defpackage.kfj kfjVar;
        defpackage.aigf aigfVar2;
        defpackage.aola aolaVar;
        java.lang.Object objA2;
        java.lang.Object obj2;
        defpackage.kfj kfjVar2;
        defpackage.aigf aigfVar3;
        java.lang.Object obj3;
        java.lang.Object obj4;
        ?? r2;
        long jLongValue;
        java.util.Map mapA;
        java.util.Set setKeySet;
        java.lang.Object obj5;
        java.lang.Object obj6;
        long jLongValue2;
        hkd hkdVar;
        java.lang.Object obj7;
        defpackage.spp sppVar2;
        java.lang.Object obj8;
        spn spnVar;
        java.lang.Object obj9;
        long j;
        java.lang.String str;
        java.lang.Long lValueOf;
        android.content.ContentValues contentValues;
        java.util.Map mapB;
        java.lang.Object contentValues2;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.i;
        int i2 = 3;
        if (i != 0) {
            if (i == 1) {
                defpackage.aosy aosyVar4 = (defpackage.aosy) this.b;
                aosyVar = (defpackage.aosy) this.a;
                aossVar = (defpackage.aoss) this.l;
                defpackage.aooc.af(obj);
                aosyVarAm = aosyVar4;
                objC = obj;
            } else if (i == 2) {
                size = this.h;
                defpackage.aigb aigbVar3 = (defpackage.aigb) this.c;
                aigbVar2 = (defpackage.aigb) this.b;
                java.util.Map map3 = (java.util.Map) this.a;
                aosyVar2 = (defpackage.aosy) this.l;
                defpackage.aooc.af(obj);
                map = map3;
                aigbVar = aigbVar3;
                objA = obj;
                map2 = (java.util.Map) objA;
                for (hkd hkdVar2 : map.values()) {
                    sppVar = (defpackage.spp) map2.get(hkdVar2.c);
                    if (sppVar == null) {
                        sppVar = defpackage.spp.a;
                        defpackage.aooh.e(sppVar, "getDefaultInstance(...)");
                    }
                    aigbVar.i(hkdVar2, sppVar);
                }
                aigfVarB = aigbVar2.b();
                defpackage.sqi sqiVar = this.j.c;
                sqiVar.f.j(defpackage.sqi.c);
                defpackage.lkf lkfVar = new defpackage.lkf(sqiVar, aigfVarB, i2);
                long j2 = defpackage.ahqx.a;
                defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ahqt(defpackage.ahns.c(false), lkfVar, 0));
                sqiVar.e.execute(ajdkVar);
                this.l = aosyVar2;
                this.a = map;
                this.b = aigfVarB;
                this.c = null;
                this.h = size;
                this.i = 3;
                objD = defpackage.aosv.D(ajdkVar, this);
                if (objD != aoluVar) {
                    return aoluVar;
                }
                aosyVar3 = aosyVar2;
                aigfVar = aigfVarB;
                sqcVar = this.j;
                kfjVar = this.k;
                aigfVar2 = (defpackage.aigf) objD;
                aolaVar = new defpackage.aola(size);
                this.l = map;
                this.a = aigfVar;
                this.b = aigfVar2;
                this.c = kfjVar;
                this.d = sqcVar;
                this.e = aolaVar;
                this.f = aolaVar;
                this.g = sqcVar;
                this.i = 4;
                objA2 = aosyVar3.a(this);
                if (objA2 == aoluVar) {
                    return aoluVar;
                }
                obj2 = sqcVar;
                kfjVar2 = kfjVar;
                defpackage.aola aolaVar2 = aolaVar;
                aigfVar3 = aigfVar2;
                obj3 = aolaVar2;
                obj4 = obj2;
                r2 = aolaVar2;
            } else if (i != 3) {
                obj2 = this.g;
                java.lang.Object obj10 = this.f;
                java.lang.Object obj11 = this.e;
                obj4 = this.d;
                kfjVar2 = (defpackage.kfj) this.c;
                aigfVar3 = (defpackage.aigf) this.b;
                aigfVar = (defpackage.aigf) this.a;
                java.util.Map map4 = (java.util.Map) this.l;
                defpackage.aooc.af(obj);
                map = map4;
                objA2 = obj;
                r2 = obj10;
                obj3 = obj11;
            } else {
                size = this.h;
                aigfVarB = (defpackage.aigf) this.b;
                java.util.Map map5 = (java.util.Map) this.a;
                aosyVar3 = (defpackage.aosy) this.l;
                defpackage.aooc.af(obj);
                map = map5;
                objD = obj;
                aigfVar = aigfVarB;
                sqcVar = this.j;
                kfjVar = this.k;
                aigfVar2 = (defpackage.aigf) objD;
                aolaVar = new defpackage.aola(size);
                this.l = map;
                this.a = aigfVar;
                this.b = aigfVar2;
                this.c = kfjVar;
                this.d = sqcVar;
                this.e = aolaVar;
                this.f = aolaVar;
                this.g = sqcVar;
                this.i = 4;
                objA2 = aosyVar3.a(this);
                if (objA2 == aoluVar) {
                    return aoluVar;
                }
                obj2 = sqcVar;
                kfjVar2 = kfjVar;
                defpackage.aola aolaVar3 = aolaVar;
                aigfVar3 = aigfVar2;
                obj3 = aolaVar3;
                obj4 = obj2;
                r2 = aolaVar3;
            }
            jLongValue = ((java.lang.Number) objA2).longValue();
            mapA = kfjVar2.a();
            if (mapA.isEmpty()) {
                setKeySet = defpackage.aoke.a;
            } else {
                setKeySet = mapA.keySet();
            }
            obj5 = obj3;
            for (java.util.Map.Entry entry : map.entrySet()) {
                jLongValue2 = ((java.lang.Number) entry.getKey()).longValue();
                hkdVar = (hkd) entry.getValue();
                obj7 = aigfVar.get(hkdVar);
                if (obj7 != null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.");
                }
                sppVar2 = (defpackage.spp) obj7;
                obj8 = aigfVar3.get(hkdVar);
                if (obj8 != null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.");
                }
                spnVar = (spn) obj8;
                java.lang.Object obj12 = obj5;
                obj9 = obj4;
                j = sppVar2.d;
                str = hkdVar.c;
                java.lang.Object obj13 = obj2;
                defpackage.aooh.e(str, "getNormalizedNumber(...)");
                if (jLongValue >= j || setKeySet.contains(new java.lang.Long(jLongValue2))) {
                    defpackage.gus gusVar = ((defpackage.sqc) obj9).f;
                    java.util.Map mapA2 = kfjVar2.a();
                    lValueOf = java.lang.Long.valueOf(jLongValue2);
                    contentValues = (android.content.ContentValues) mapA2.get(lValueOf);
                    if (contentValues == null) {
                        mapB = kfjVar2.b();
                        contentValues2 = mapB.get(lValueOf);
                        if (contentValues2 == null) {
                            contentValues2 = new android.content.ContentValues();
                            mapB.put(lValueOf, contentValues2);
                        }
                        contentValues = (android.content.ContentValues) contentValues2;
                    }
                    kiw kiwVarR = defpackage.gus.aK(spnVar).r();
                    defpackage.aooh.e(kiwVarR, "build(...)");
                    contentValues.put("number_attributes", kiwVarR.i());
                    r2.put(str, spnVar);
                } else {
                    spn spnVar2 = sppVar2.c;
                    if (spnVar2 == null) {
                        spnVar2 = spn.a;
                    }
                    if (!defpackage.aooh.n(spnVar2, spnVar)) {
                        defpackage.gus gusVar2 = ((defpackage.sqc) obj9).f;
                        java.util.Map mapA3 = kfjVar2.a();
                        lValueOf = java.lang.Long.valueOf(jLongValue2);
                        contentValues = (android.content.ContentValues) mapA3.get(lValueOf);
                        if (contentValues == null) {
                            mapB = kfjVar2.b();
                            contentValues2 = mapB.get(lValueOf);
                            if (contentValues2 == null) {
                                contentValues2 = new android.content.ContentValues();
                                mapB.put(lValueOf, contentValues2);
                            }
                            contentValues = (android.content.ContentValues) contentValues2;
                        }
                        kiw kiwVarR2 = defpackage.gus.aK(spnVar).r();
                        defpackage.aooh.e(kiwVarR2, "build(...)");
                        contentValues.put("number_attributes", kiwVarR2.i());
                        r2.put(str, spnVar);
                    } else if (r2.containsKey(str)) {
                        r2.put(str, spnVar);
                    }
                }
                obj5 = obj12;
                obj4 = obj9;
                obj2 = obj13;
            }
            java.lang.Object obj14 = obj2;
            obj6 = obj5;
            if (obj6 == null) {
                defpackage.aooh.i("builder");
            }
            ((defpackage.sqc) obj14).a = ((defpackage.aola) obj6).e();
            return null;
        }
        defpackage.aooc.af(obj);
        aossVar = (defpackage.aoss) this.l;
        defpackage.sqc sqcVar2 = this.j;
        defpackage.aosy aosyVarAm2 = defpackage.aoov.am(aossVar, 0, new defpackage.rot(sqcVar2, (defpackage.aoln) null, 3), 3);
        aosyVarAm = defpackage.aoov.am(aossVar, 0, new defpackage.mev(sqcVar2, (defpackage.aoln) null, 18), 3);
        defpackage.kfj kfjVar3 = this.k;
        this.l = aossVar;
        this.a = aosyVarAm2;
        this.b = aosyVarAm;
        this.i = 1;
        objC = sqcVar2.c(kfjVar3, this);
        if (objC == aoluVar) {
            return aoluVar;
        }
        aosyVar = aosyVarAm2;
        map = (java.util.Map) objC;
        java.util.Set set = ((defpackage.kfk) this.k).c;
        if (!set.isEmpty()) {
            defpackage.aoov.an(aossVar, null, 0, new defpackage.hcn(set, map, this.j, (defpackage.aoln) null, 15), 3);
        }
        size = map.size();
        defpackage.ahvr.bC(size, "expectedSize");
        aigbVar = new defpackage.aigb(size);
        this.l = aosyVarAm;
        this.a = map;
        this.b = aigbVar;
        this.c = aigbVar;
        this.h = size;
        this.i = 2;
        objA = aosyVar.a(this);
        if (objA == aoluVar) {
            return aoluVar;
        }
        aigbVar2 = aigbVar;
        aosyVar2 = aosyVarAm;
        map2 = (java.util.Map) objA;
        while (r10.hasNext()) {
            sppVar = (defpackage.spp) map2.get(hkdVar2.c);
            if (sppVar == null) {
                sppVar = defpackage.spp.a;
                defpackage.aooh.e(sppVar, "getDefaultInstance(...)");
            }
            aigbVar.i(hkdVar2, sppVar);
        }
        aigfVarB = aigbVar2.b();
        defpackage.sqi sqiVar2 = this.j.c;
        sqiVar2.f.j(defpackage.sqi.c);
        defpackage.lkf lkfVar2 = new defpackage.lkf(sqiVar2, aigfVarB, i2);
        long j3 = defpackage.ahqx.a;
        defpackage.ajdk ajdkVar2 = new defpackage.ajdk(new defpackage.ahqt(defpackage.ahns.c(false), lkfVar2, 0));
        sqiVar2.e.execute(ajdkVar2);
        this.l = aosyVar2;
        this.a = map;
        this.b = aigfVarB;
        this.c = null;
        this.h = size;
        this.i = 3;
        objD = defpackage.aosv.D(ajdkVar2, this);
        if (objD != aoluVar) {
            return aoluVar;
        }
        aosyVar3 = aosyVar2;
        aigfVar = aigfVarB;
        sqcVar = this.j;
        kfjVar = this.k;
        aigfVar2 = (defpackage.aigf) objD;
        aolaVar = new defpackage.aola(size);
        this.l = map;
        this.a = aigfVar;
        this.b = aigfVar2;
        this.c = kfjVar;
        this.d = sqcVar;
        this.e = aolaVar;
        this.f = aolaVar;
        this.g = sqcVar;
        this.i = 4;
        objA2 = aosyVar3.a(this);
        if (objA2 == aoluVar) {
            return aoluVar;
        }
        obj2 = sqcVar;
        kfjVar2 = kfjVar;
        defpackage.aola aolaVar4 = aolaVar;
        aigfVar3 = aigfVar2;
        obj3 = aolaVar4;
        obj4 = obj2;
        r2 = aolaVar4;
        jLongValue = ((java.lang.Number) objA2).longValue();
        mapA = kfjVar2.a();
        if (mapA.isEmpty()) {
            setKeySet = defpackage.aoke.a;
        } else {
            setKeySet = mapA.keySet();
        }
        obj5 = obj3;
        while (r11.hasNext()) {
            jLongValue2 = ((java.lang.Number) entry.getKey()).longValue();
            hkdVar = (hkd) entry.getValue();
            obj7 = aigfVar.get(hkdVar);
            if (obj7 != null) {
                throw new java.lang.IllegalArgumentException("Required value was null.");
            }
            sppVar2 = (defpackage.spp) obj7;
            obj8 = aigfVar3.get(hkdVar);
            if (obj8 != null) {
                throw new java.lang.IllegalArgumentException("Required value was null.");
            }
            spnVar = (spn) obj8;
            java.lang.Object obj15 = obj5;
            obj9 = obj4;
            j = sppVar2.d;
            str = hkdVar.c;
            java.lang.Object obj16 = obj2;
            defpackage.aooh.e(str, "getNormalizedNumber(...)");
            if (jLongValue >= j) {
                defpackage.gus gusVar3 = ((defpackage.sqc) obj9).f;
                java.util.Map mapA4 = kfjVar2.a();
                lValueOf = java.lang.Long.valueOf(jLongValue2);
                contentValues = (android.content.ContentValues) mapA4.get(lValueOf);
                if (contentValues == null) {
                    mapB = kfjVar2.b();
                    contentValues2 = mapB.get(lValueOf);
                    if (contentValues2 == null) {
                        contentValues2 = new android.content.ContentValues();
                        mapB.put(lValueOf, contentValues2);
                    }
                    contentValues = (android.content.ContentValues) contentValues2;
                }
                kiw kiwVarR3 = defpackage.gus.aK(spnVar).r();
                defpackage.aooh.e(kiwVarR3, "build(...)");
                contentValues.put("number_attributes", kiwVarR3.i());
                r2.put(str, spnVar);
            } else {
                defpackage.gus gusVar4 = ((defpackage.sqc) obj9).f;
                java.util.Map mapA5 = kfjVar2.a();
                lValueOf = java.lang.Long.valueOf(jLongValue2);
                contentValues = (android.content.ContentValues) mapA5.get(lValueOf);
                if (contentValues == null) {
                    mapB = kfjVar2.b();
                    contentValues2 = mapB.get(lValueOf);
                    if (contentValues2 == null) {
                        contentValues2 = new android.content.ContentValues();
                        mapB.put(lValueOf, contentValues2);
                    }
                    contentValues = (android.content.ContentValues) contentValues2;
                }
                kiw kiwVarR4 = defpackage.gus.aK(spnVar).r();
                defpackage.aooh.e(kiwVarR4, "build(...)");
                contentValues.put("number_attributes", kiwVarR4.i());
                r2.put(str, spnVar);
            }
            obj5 = obj15;
            obj4 = obj9;
            obj2 = obj16;
        }
        java.lang.Object obj17 = obj2;
        obj6 = obj5;
        if (obj6 == null) {
            defpackage.aooh.i("builder");
        }
        ((defpackage.sqc) obj17).a = ((defpackage.aola) obj6).e();
        return null;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.spx spxVar = new defpackage.spx(this.j, this.k, aolnVar);
        spxVar.l = obj;
        return spxVar;
    }
}
