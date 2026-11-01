package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeeu implements defpackage.aeeg {
    public static final /* synthetic */ int e = 0;
    private static final defpackage.aiof f = defpackage.aiof.i("GnpSdk");
    public final defpackage.amwu a;
    public final defpackage.aoss b;
    public final java.util.concurrent.atomic.AtomicReference c;
    public final defpackage.apdp d;

    public aeeu(defpackage.amwu amwuVar, defpackage.aazc aazcVar, defpackage.aoss aossVar) {
        defpackage.aooh.f(aazcVar, "clock");
        defpackage.aooh.f(aossVar, "backgroundScope");
        this.a = amwuVar;
        this.b = aossVar;
        this.c = new java.util.concurrent.atomic.AtomicReference(null);
        this.d = new defpackage.apdp();
    }

    public static final java.util.List e(java.util.Map map, java.util.List list) {
        java.util.List listBm = defpackage.ajsz.bm(map.values());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listBm) {
            if (list.contains(((aecq) obj).d)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final java.util.List f(java.util.Map map, java.lang.String str, java.util.List list) {
        java.util.List list2 = (java.util.List) map.get(str);
        if (list2 == null) {
            return defpackage.aokc.a;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            if (list.contains(((aecq) obj).d)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.aeeg
    public final java.lang.Object a(defpackage.aeco aecoVar, java.util.List list, defpackage.aoln aolnVar) {
        java.util.Map map = (java.util.Map) this.c.get();
        return map != null ? new defpackage.adub(e(map, list)) : defpackage.agab.bQ(this.d, new ako(this, list, aecoVar, (defpackage.aoln) null, 8), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(java.util.List list, java.util.List list2, defpackage.aeco aecoVar, defpackage.aoln aolnVar) {
        aees aeesVar;
        if (aolnVar instanceof aees) {
            aeesVar = (aees) aolnVar;
            int i = aeesVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aeesVar.c = i - Integer.MIN_VALUE;
            } else {
                aeesVar = new aees(this, aolnVar);
            }
        } else {
            aeesVar = new aees(this, aolnVar);
        }
        java.lang.Object objC = aeesVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aeesVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objC);
            java.util.concurrent.atomic.AtomicReference atomicReference = this.c;
            java.util.Map map = (java.util.Map) atomicReference.get();
            if (map != null) {
                java.util.List listCc = defpackage.ajsz.cc(list, list2);
                java.util.ArrayList<defpackage.aoiu> arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listCc) {
                    if (((java.lang.Number) ((defpackage.aoiu) obj).b).longValue() != -1) {
                        arrayList.add(obj);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(arrayList, 10));
                for (defpackage.aoiu aoiuVar : arrayList) {
                    aecq aecqVar = (aecq) aoiuVar.a;
                    long jLongValue = ((java.lang.Number) aoiuVar.b).longValue();
                    int i3 = 0;
                    if (jLongValue >= 0 && jLongValue < 2147483648L) {
                        i3 = (int) jLongValue;
                    }
                    java.lang.String str = aecqVar.b;
                    int i4 = aecqVar.c;
                    aecp aecpVar = aecqVar.d;
                    j$.time.Instant instant = aecqVar.e;
                    defpackage.aeco aecoVar2 = aecqVar.f;
                    defpackage.aooh.f(str, "accountName");
                    defpackage.aooh.f(instant, "insertionTime");
                    arrayList2.add(new aecq(i3, str, i4, aecpVar, instant, aecoVar2));
                }
                if (arrayList2.isEmpty()) {
                    return defpackage.aojh.a;
                }
                java.util.Map mapAT = defpackage.ajsz.aT(map);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.lang.Object obj2 : arrayList2) {
                    java.lang.String str2 = ((aecq) obj2).b;
                    java.lang.Object arrayList3 = linkedHashMap.get(str2);
                    if (arrayList3 == null) {
                        arrayList3 = new java.util.ArrayList();
                        linkedHashMap.put(str2, arrayList3);
                    }
                    ((java.util.List) arrayList3).add(obj2);
                }
                for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                    java.lang.String str3 = (java.lang.String) entry.getKey();
                    java.util.List list3 = (java.util.List) entry.getValue();
                    java.util.Collection collection = (java.util.List) mapAT.get(str3);
                    if (collection == null) {
                        collection = defpackage.aokc.a;
                    }
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(defpackage.ajsz.bl(collection, 10));
                    java.util.Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(new java.lang.Integer(((aecq) it.next()).c));
                    }
                    java.util.Set setCf = defpackage.ajsz.cf(arrayList4);
                    java.util.HashSet hashSet = new java.util.HashSet();
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    for (java.lang.Object obj3 : list3) {
                        if (hashSet.add(new java.lang.Integer(((aecq) obj3).c))) {
                            arrayList5.add(obj3);
                        }
                    }
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    for (java.lang.Object obj4 : arrayList5) {
                        if (!setCf.contains(new java.lang.Integer(((aecq) obj4).c))) {
                            arrayList6.add(obj4);
                        }
                    }
                    mapAT.put(str3, defpackage.ajsz.bT(collection, arrayList6));
                }
                atomicReference.set(mapAT);
                return defpackage.aojh.a;
            }
            aeesVar.c = 1;
            objC = c(aecoVar, aeesVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objC);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.aeco aecoVar, defpackage.aoln aolnVar) {
        aeet aeetVar;
        defpackage.adty adtyVar;
        adtw adtwVar;
        if (aolnVar instanceof aeet) {
            aeetVar = (aeet) aolnVar;
            int i = aeetVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aeetVar.c = i - Integer.MIN_VALUE;
            } else {
                aeetVar = new aeet(this, aolnVar);
            }
        } else {
            aeetVar = new aeet(this, aolnVar);
        }
        aeet aeetVar2 = aeetVar;
        java.lang.Object objO = aeetVar2.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aeetVar2.c;
        if (i2 == 0) {
            defpackage.aooc.af(objO);
            defpackage.adty adtyVar2 = defpackage.adty.e;
            try {
                java.lang.Object objA = this.a.a();
                java.util.List listCU = defpackage.ajsz.cU(aecp.values());
                aeetVar2.d = adtyVar2;
                aeetVar2.c = 1;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("SELECT * FROM gnp_experiments WHERE experiment_source = ? AND experiment_type IN (");
                defpackage.dzk.P(sb, listCU.size());
                sb.append(')');
                objO = defpackage.dez.o(((aeeq) objA).a, true, false, new aclk(sb.toString(), aecoVar, listCU, 3, (byte[]) null), aeetVar2);
                if (objO == aoluVar) {
                    return aoluVar;
                }
                adtyVar = adtyVar2;
            } catch (java.lang.Exception e2) {
                e = e2;
                adtyVar = adtyVar2;
                defpackage.aooc.Y(aeetVar2.u());
                adtwVar = new adtw(e, adtyVar);
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adtyVar = aeetVar2.d;
            try {
                defpackage.aooc.af(objO);
            } catch (java.lang.Exception e3) {
                e = e3;
                defpackage.aooc.Y(aeetVar2.u());
                adtwVar = new adtw(e, adtyVar);
            }
        }
        adtwVar = new defpackage.adub(objO);
        if (!(adtwVar instanceof defpackage.adub)) {
            if (adtwVar instanceof defpackage.adtv) {
                ((defpackage.aiob) ((defpackage.aiob) f.d()).k(((defpackage.adtv) adtwVar).b())).v("Failed to get experiments from storage.");
            }
            return new adtw("Failed to get experiments from storage.", defpackage.adty.e);
        }
        java.util.List list = (java.util.List) ((defpackage.adub) adtwVar).a;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : list) {
            java.lang.String str = ((aecq) obj).b;
            java.lang.Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        this.c.set(linkedHashMap);
        return new defpackage.adub(defpackage.aojh.a);
    }

    public final void d() {
        this.c.set(null);
    }
}
