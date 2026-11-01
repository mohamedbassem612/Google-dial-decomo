package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mnz implements defpackage.kfh {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/dobby/impl/calllog/DobbyCallLogDataSource");
    public final defpackage.ecx b;
    public final java.util.concurrent.atomic.AtomicLong c;
    private final defpackage.aoss d;
    private final defpackage.nri e;
    private final defpackage.rsr f;

    public mnz(defpackage.aoss aossVar, defpackage.ecx ecxVar, defpackage.rsr rsrVar, defpackage.nri nriVar, defpackage.ojo ojoVar) {
        defpackage.aooh.f(aossVar, "lightweightScope");
        defpackage.aooh.f(ecxVar, "dataStore");
        defpackage.aooh.f(nriVar, "dobbyDatabase");
        defpackage.aooh.f(ojoVar, "dialerContentResolver");
        this.d = aossVar;
        this.b = ecxVar;
        this.f = rsrVar;
        this.e = nriVar;
        this.c = new java.util.concurrent.atomic.AtomicLong(-1L);
    }

    private static final byte[] j(nsp nspVar) {
        return defpackage.mni.as(nspVar).i();
    }

    @Override // defpackage.kfh
    public final defpackage.aenj a() {
        return new defpackage.aenj("DobbyCallLogDataSource");
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq b(defpackage.kfj kfjVar) {
        return defpackage.aosv.F(this.d, 0, new msi(this, kfjVar, (defpackage.aoln) null, 1), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(java.util.Set set, defpackage.aoln aolnVar) {
        mnt mntVar;
        if (aolnVar instanceof mnt) {
            mntVar = (mnt) aolnVar;
            int i = mntVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mntVar.c = i - Integer.MIN_VALUE;
            } else {
                mntVar = new mnt(this, aolnVar);
            }
        } else {
            mntVar = new mnt(this, aolnVar);
        }
        java.lang.Object objAf = mntVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = mntVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAf);
            if (set.isEmpty()) {
                defpackage.aify aifyVar = defpackage.aike.a;
                defpackage.aooh.e(aifyVar, "of(...)");
                return aifyVar;
            }
            defpackage.rsr rsrVar = this.f;
            mntVar.c = 1;
            objAf = rsrVar.af(set, mntVar);
            if (objAf == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAf);
        }
        java.util.Map map = (java.util.Map) objAf;
        if (map.isEmpty()) {
            ((defpackage.aimw) a.b().l("com/android/dialer/dobby/impl/calllog/DobbyCallLogDataSource", "getCallCreationTimeFromCallLogIds", 248, "DobbyCallLogDataSource.kt")).v("no results");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(new java.lang.Long(((kdy) ((java.util.Map.Entry) it.next()).getValue()).b));
        }
        return defpackage.ahvr.bv(arrayList);
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq d() {
        return defpackage.aosv.F(this.d, 0, new lve(this, (defpackage.aoln) null, 14), 3);
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq e() {
        return defpackage.aosv.F(this.d, 0, new lve(this, (defpackage.aoln) null, 15, (byte[]) null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [aolu] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.LinkedHashMap, java.util.Map] */
    public final java.lang.Object f(java.util.List list, defpackage.aoln aolnVar) {
        mnu mnuVar;
        if (aolnVar instanceof mnu) {
            mnuVar = (mnu) aolnVar;
            int i = mnuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mnuVar.c = i - Integer.MIN_VALUE;
            } else {
                mnuVar = new mnu(this, aolnVar);
            }
        } else {
            mnuVar = new mnu(this, aolnVar);
        }
        java.lang.Object objI = mnuVar.a;
        java.lang.Object linkedHashMap = defpackage.aolu.a;
        int i2 = mnuVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objI);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                java.lang.Integer asInteger = ((android.content.ContentValues) entry.getValue()).getAsInteger("call_type");
                java.lang.Long asLong = (asInteger == null || asInteger.intValue() != 2) ? ((android.content.ContentValues) entry.getValue()).getAsLong("timestamp") : null;
                if (asLong != null) {
                    arrayList.add(asLong);
                }
            }
            defpackage.aify aifyVarBv = defpackage.ahvr.bv(arrayList);
            defpackage.nri nriVar = this.e;
            mnuVar.c = 1;
            objI = nriVar.i(aifyVarBv, mnuVar);
            if (objI != linkedHashMap) {
            }
            return linkedHashMap;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defpackage.aooc.af(objI);
        defpackage.aify aifyVar = (defpackage.aify) objI;
        linkedHashMap = new java.util.LinkedHashMap(defpackage.aooc.t(defpackage.ajsz.aL(defpackage.ajsz.bl(aifyVar, 10)), 16));
        for (java.lang.Object obj : aifyVar) {
            linkedHashMap.put(new java.lang.Long(((nsp) obj).c), obj);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(defpackage.kfj kfjVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        mnv mnvVar;
        defpackage.nri nriVar;
        if (aolnVar instanceof mnv) {
            mnvVar = (mnv) aolnVar;
            int i = mnvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mnvVar.c = i - Integer.MIN_VALUE;
            } else {
                mnvVar = new mnv(this, aolnVar);
            }
        } else {
            mnvVar = new mnv(this, aolnVar);
        }
        java.lang.Object objE = mnvVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = mnvVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                nriVar = mnvVar.d;
                defpackage.aooc.af(objE);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objE);
            }
            ((defpackage.aimw) a.b().l("com/android/dialer/dobby/impl/calllog/DobbyCallLogDataSource", "handleDeletes", 237, "DobbyCallLogDataSource.kt")).w("removed %d entries", ((java.lang.Number) objE).intValue());
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objE);
        java.util.Set set = ((defpackage.kfk) kfjVar).c;
        if (set.isEmpty()) {
            return defpackage.aojh.a;
        }
        defpackage.nri nriVar2 = this.e;
        mnvVar.d = nriVar2;
        mnvVar.c = 1;
        java.lang.Object objC = c(set, mnvVar);
        if (objC == aoluVar) {
            return aoluVar;
        }
        objE = objC;
        nriVar = nriVar2;
        mnvVar.d = null;
        mnvVar.c = 2;
        objE = nriVar.e((java.util.List) objE, mnvVar);
        if (objE == aoluVar) {
            return aoluVar;
        }
        ((defpackage.aimw) a.b().l("com/android/dialer/dobby/impl/calllog/DobbyCallLogDataSource", "handleDeletes", 237, "DobbyCallLogDataSource.kt")).w("removed %d entries", ((java.lang.Number) objE).intValue());
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(defpackage.kfj kfjVar, defpackage.aoln aolnVar) {
        defpackage.aoln mnwVar;
        java.lang.Object obj;
        java.lang.Integer asInteger;
        if (aolnVar instanceof mnw) {
            mnwVar = (mnw) aolnVar;
            int i = ((mnw) mnwVar).d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ((mnw) mnwVar).d = i - Integer.MIN_VALUE;
            } else {
                mnwVar = new mnw(this, aolnVar);
            }
        } else {
            mnwVar = new mnw(this, aolnVar);
        }
        java.lang.Object objF = ((mnw) mnwVar).b;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = ((mnw) mnwVar).d;
        if (i2 == 0) {
            defpackage.aooc.af(objF);
            defpackage.kfk kfkVar = (defpackage.kfk) kfjVar;
            java.util.Map map = kfkVar.a;
            java.util.Map map2 = kfkVar.b;
            if (!map.isEmpty() || !map2.isEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(map.entrySet());
                arrayList.addAll(map2.entrySet());
                ((mnw) mnwVar).e = kfkVar;
                ((mnw) mnwVar).a = arrayList;
                ((mnw) mnwVar).d = 1;
                objF = f(arrayList, mnwVar);
                if (objF == obj2) {
                    return obj2;
                }
                obj = arrayList;
            }
            return defpackage.aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj = ((mnw) mnwVar).a;
        kfjVar = ((mnw) mnwVar).e;
        defpackage.aooc.af(objF);
        java.util.Map map3 = (java.util.Map) objF;
        java.util.HashMap map4 = new java.util.HashMap();
        java.util.Iterator it = ((java.util.ArrayList) obj).iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            defpackage.aooh.e(next, "next(...)");
            java.util.Map.Entry entry = (java.util.Map.Entry) next;
            long jLongValue = ((java.lang.Number) entry.getKey()).longValue();
            android.content.ContentValues contentValues = (android.content.ContentValues) entry.getValue();
            java.lang.Integer asInteger2 = contentValues.getAsInteger("call_type");
            if (asInteger2 == null || asInteger2.intValue() != 2) {
                java.lang.Long asLong = contentValues.getAsLong("timestamp");
                if (asLong == null) {
                    ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/calllog/DobbyCallLogDataSource", "handleInsertsAndUpdates", 108, "DobbyCallLogDataSource.kt")).x("null TIMESTAMP for ACL id: %d", jLongValue);
                } else {
                    nsp nspVar = (nsp) map3.get(asLong);
                    if (nspVar == null) {
                        ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b).l("com/android/dialer/dobby/impl/calllog/DobbyCallLogDataSource", "handleInsertsAndUpdates", 116, "DobbyCallLogDataSource.kt")).x("failed to find session data with CallCreationTime: %d", asLong.longValue());
                    } else if ((nspVar.b & 1) != 0) {
                        contentValues.put("dobby_calllog_details", j(nspVar));
                        nsq nsqVar = nspVar.e;
                        if (nsqVar == null) {
                            nsqVar = nsq.a;
                        }
                        if ((nsqVar.b & 8) != 0) {
                            nsq nsqVar2 = nspVar.e;
                            if (nsqVar2 == null) {
                                nsqVar2 = nsq.a;
                            }
                            nsm nsmVar = nsqVar2.f;
                            if (nsmVar == null) {
                                nsmVar = nsm.a;
                            }
                            if ((nsmVar.b & 1) != 0) {
                                nsq nsqVar3 = nspVar.e;
                                if (nsqVar3 == null) {
                                    nsqVar3 = nsq.a;
                                }
                                nsm nsmVar2 = nsqVar3.f;
                                if (nsmVar2 == null) {
                                    nsmVar2 = nsm.a;
                                }
                                int i3 = nsmVar2.c;
                                if (!contentValues.containsKey("call_type") || (asInteger = contentValues.getAsInteger("call_type")) == null || asInteger.intValue() != i3) {
                                    contentValues.put("call_type", new java.lang.Integer(i3));
                                    android.content.ContentValues contentValues2 = new android.content.ContentValues();
                                    contentValues2.put("type", new java.lang.Integer(i3));
                                    map4.put(new java.lang.Long(jLongValue), contentValues2);
                                }
                            }
                        }
                    } else {
                        ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b).l("com/android/dialer/dobby/impl/calllog/DobbyCallLogDataSource", "handleInsertsAndUpdates", 123, "DobbyCallLogDataSource.kt")).x("Data corruption in record with callCreationtime=%d", asLong.longValue());
                    }
                }
            } else {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/calllog/DobbyCallLogDataSource", "handleInsertsAndUpdates", 102, "DobbyCallLogDataSource.kt")).v("Bypass checking for outgoing calls");
            }
        }
        for (java.util.Map.Entry entry2 : map4.entrySet()) {
            if (!((defpackage.kfk) kfjVar).c.contains(entry2.getKey())) {
                kfjVar.e(((java.lang.Number) entry2.getKey()).longValue(), (android.content.ContentValues) entry2.getValue());
            }
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1 A[LOOP:2: B:33:0x00bb->B:35:0x00c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:42:0x0109  */
    /* JADX WARN: Code duplicated, block: B:44:0x012c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0139  */
    /* JADX WARN: Code duplicated, block: B:51:0x0152  */
    /* JADX WARN: Code duplicated, block: B:57:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.Map] */
    public final java.lang.Object i(defpackage.kfj kfjVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        mny mnyVar;
        defpackage.aify<nsp> aifyVar;
        java.util.ArrayList arrayList;
        java.util.Map mapAR;
        java.lang.Object objAh;
        defpackage.kfj kfjVar2;
        ?? r11;
        java.util.ArrayList arrayList2;
        long jLongValue;
        nsp nspVar;
        kdy kdyVar;
        nsp nspVar2;
        defpackage.aoiu aoiuVar;
        if (aolnVar instanceof mny) {
            mnyVar = (mny) aolnVar;
            int i = mnyVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mnyVar.d = i - Integer.MIN_VALUE;
            } else {
                mnyVar = new mny(this, aolnVar);
            }
        } else {
            mnyVar = new mny(this, aolnVar);
        }
        java.lang.Object objAu = mnyVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = mnyVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                kfjVar = mnyVar.e;
                defpackage.aooc.af(objAu);
            } else {
                if (i2 == 2) {
                    kfjVar = mnyVar.e;
                    defpackage.aooc.af(objAu);
                    aifyVar = (defpackage.aify) objAu;
                    if (!aifyVar.isEmpty()) {
                        arrayList = new java.util.ArrayList(defpackage.ajsz.bl(aifyVar, 10));
                        for (nsp nspVar3 : aifyVar) {
                            arrayList.add(new defpackage.aoiu(new java.lang.Long(nspVar3.c), nspVar3));
                        }
                        mapAR = defpackage.ajsz.aR(arrayList);
                        defpackage.rsr rsrVar = this.f;
                        java.util.Set setKeySet = mapAR.keySet();
                        mnyVar.e = (defpackage.kfk) kfjVar;
                        mnyVar.a = mapAR;
                        mnyVar.d = 4;
                        objAh = rsrVar.ah(setKeySet, mnyVar);
                        if (objAh != aoluVar) {
                            return aoluVar;
                        }
                        kfjVar2 = kfjVar;
                        r11 = mapAR;
                        objAu = objAh;
                    }
                    return defpackage.aojh.a;
                }
                if (i2 == 3) {
                    kfjVar = mnyVar.e;
                    defpackage.aooc.af(objAu);
                    aifyVar = (defpackage.aify) objAu;
                    if (!aifyVar.isEmpty()) {
                        arrayList = new java.util.ArrayList(defpackage.ajsz.bl(aifyVar, 10));
                        while (r12.hasNext()) {
                            arrayList.add(new defpackage.aoiu(new java.lang.Long(nspVar3.c), nspVar3));
                        }
                        mapAR = defpackage.ajsz.aR(arrayList);
                        defpackage.rsr rsrVar2 = this.f;
                        java.util.Set setKeySet2 = mapAR.keySet();
                        mnyVar.e = (defpackage.kfk) kfjVar;
                        mnyVar.a = mapAR;
                        mnyVar.d = 4;
                        objAh = rsrVar2.ah(setKeySet2, mnyVar);
                        if (objAh != aoluVar) {
                            return aoluVar;
                        }
                        kfjVar2 = kfjVar;
                        r11 = mapAR;
                        objAu = objAh;
                    }
                    return defpackage.aojh.a;
                }
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj = mnyVar.a;
                kfjVar2 = mnyVar.e;
                defpackage.aooc.af(objAu);
                r11 = obj;
            }
            arrayList2 = new java.util.ArrayList();
            for (java.util.Map.Entry entry : ((java.util.Map) objAu).entrySet()) {
                long jLongValue2 = ((java.lang.Number) entry.getKey()).longValue();
                kdyVar = (kdy) entry.getValue();
                nspVar2 = (nsp) r11.get(new java.lang.Long(jLongValue2));
                if (nspVar2 != null) {
                    aoiuVar = new defpackage.aoiu(new java.lang.Long(kdyVar.a), nspVar2);
                } else {
                    aoiuVar = null;
                }
                if (aoiuVar != null) {
                    arrayList2.add(aoiuVar);
                }
            }
            for (java.util.Map.Entry entry2 : defpackage.ajsz.aR(arrayList2).entrySet()) {
                jLongValue = ((java.lang.Number) entry2.getKey()).longValue();
                nspVar = (nsp) entry2.getValue();
                if (!((defpackage.kfk) kfjVar2).c.contains(new java.lang.Long(jLongValue))) {
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("dobby_calllog_details", j(nspVar));
                    kfjVar2.d(jLongValue, contentValues);
                    j$.util.concurrent.atomic.DesugarAtomicLong.getAndAccumulate(this.c, nspVar.d, new kvc(3));
                }
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objAu);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        defpackage.kfk kfkVar = (defpackage.kfk) kfjVar;
        arrayList3.addAll(kfkVar.a.entrySet());
        arrayList3.addAll(kfkVar.b.entrySet());
        defpackage.aoxh aoxhVarB = this.b.b();
        mnyVar.e = kfkVar;
        mnyVar.d = 1;
        objAu = defpackage.aoov.au(aoxhVarB, mnyVar);
        if (objAu == aoluVar) {
            return aoluVar;
        }
        moc mocVar = (moc) objAu;
        int i3 = mocVar.b & 1;
        defpackage.nri nriVar = this.e;
        if (i3 == 0) {
            mnyVar.e = (defpackage.kfk) kfjVar;
            mnyVar.d = 3;
            objAu = nriVar.g(mnyVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
            aifyVar = (defpackage.aify) objAu;
            if (!aifyVar.isEmpty()) {
                arrayList = new java.util.ArrayList(defpackage.ajsz.bl(aifyVar, 10));
                while (r12.hasNext()) {
                    arrayList.add(new defpackage.aoiu(new java.lang.Long(nspVar3.c), nspVar3));
                }
                mapAR = defpackage.ajsz.aR(arrayList);
                defpackage.rsr rsrVar3 = this.f;
                java.util.Set setKeySet3 = mapAR.keySet();
                mnyVar.e = (defpackage.kfk) kfjVar;
                mnyVar.a = mapAR;
                mnyVar.d = 4;
                objAh = rsrVar3.ah(setKeySet3, mnyVar);
                if (objAh != aoluVar) {
                    return aoluVar;
                }
                kfjVar2 = kfjVar;
                r11 = mapAR;
                objAu = objAh;
                arrayList2 = new java.util.ArrayList();
                while (r12.hasNext()) {
                    long jLongValue3 = ((java.lang.Number) entry.getKey()).longValue();
                    kdyVar = (kdy) entry.getValue();
                    nspVar2 = (nsp) r11.get(new java.lang.Long(jLongValue3));
                    if (nspVar2 != null) {
                        aoiuVar = new defpackage.aoiu(new java.lang.Long(kdyVar.a), nspVar2);
                    } else {
                        aoiuVar = null;
                    }
                    if (aoiuVar != null) {
                        arrayList2.add(aoiuVar);
                    }
                }
                while (r11.hasNext()) {
                    jLongValue = ((java.lang.Number) entry2.getKey()).longValue();
                    nspVar = (nsp) entry2.getValue();
                    if (!((defpackage.kfk) kfjVar2).c.contains(new java.lang.Long(jLongValue))) {
                        android.content.ContentValues contentValues2 = new android.content.ContentValues();
                        contentValues2.put("dobby_calllog_details", j(nspVar));
                        kfjVar2.d(jLongValue, contentValues2);
                        j$.util.concurrent.atomic.DesugarAtomicLong.getAndAccumulate(this.c, nspVar.d, new kvc(3));
                    }
                }
            }
            return defpackage.aojh.a;
        }
        long j = mocVar.c;
        mnyVar.e = (defpackage.kfk) kfjVar;
        mnyVar.d = 2;
        objAu = nriVar.j(j, mnyVar);
        if (objAu == aoluVar) {
            return aoluVar;
        }
        aifyVar = (defpackage.aify) objAu;
        if (!aifyVar.isEmpty()) {
            arrayList = new java.util.ArrayList(defpackage.ajsz.bl(aifyVar, 10));
            while (r12.hasNext()) {
                arrayList.add(new defpackage.aoiu(new java.lang.Long(nspVar3.c), nspVar3));
            }
            mapAR = defpackage.ajsz.aR(arrayList);
            defpackage.rsr rsrVar4 = this.f;
            java.util.Set setKeySet4 = mapAR.keySet();
            mnyVar.e = (defpackage.kfk) kfjVar;
            mnyVar.a = mapAR;
            mnyVar.d = 4;
            objAh = rsrVar4.ah(setKeySet4, mnyVar);
            if (objAh != aoluVar) {
                return aoluVar;
            }
            kfjVar2 = kfjVar;
            r11 = mapAR;
            objAu = objAh;
            arrayList2 = new java.util.ArrayList();
            while (r12.hasNext()) {
                long jLongValue4 = ((java.lang.Number) entry.getKey()).longValue();
                kdyVar = (kdy) entry.getValue();
                nspVar2 = (nsp) r11.get(new java.lang.Long(jLongValue4));
                if (nspVar2 != null) {
                    aoiuVar = new defpackage.aoiu(new java.lang.Long(kdyVar.a), nspVar2);
                } else {
                    aoiuVar = null;
                }
                if (aoiuVar != null) {
                    arrayList2.add(aoiuVar);
                }
            }
            while (r11.hasNext()) {
                jLongValue = ((java.lang.Number) entry2.getKey()).longValue();
                nspVar = (nsp) entry2.getValue();
                if (!((defpackage.kfk) kfjVar2).c.contains(new java.lang.Long(jLongValue))) {
                    android.content.ContentValues contentValues3 = new android.content.ContentValues();
                    contentValues3.put("dobby_calllog_details", j(nspVar));
                    kfjVar2.d(jLongValue, contentValues3);
                    j$.util.concurrent.atomic.DesugarAtomicLong.getAndAccumulate(this.c, nspVar.d, new kvc(3));
                }
            }
        }
        return defpackage.aojh.a;
    }
}
