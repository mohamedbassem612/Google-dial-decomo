package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class achr implements amyv {
    public static ecx b(android.content.Context context, aoss aossVar) {
        aooh.f(context, "context");
        aooh.f(aossVar, "scope");
        achs achsVar = achs.a;
        aooh.e(achsVar, "getDefaultInstance(...)");
        return eaw.d(new eew(achsVar), aossVar, new abmn(context, 6));
    }

    public static android.telecom.Call c(zoe zoeVar) {
        java.lang.Object obj = zoeVar.a;
        aooc.ap(obj);
        return (android.telecom.Call) obj;
    }

    public static java.lang.String d() {
        return (java.lang.String) anfa.a.eZ();
    }

    public static aify e(java.util.Map map, aec aecVar) {
        java.util.List arrayList;
        int i;
        java.util.Set setKeySet = map.keySet();
        synchronized (aecVar) {
            arrayList = (java.util.List) aecVar.get(setKeySet);
            if (arrayList == null) {
                java.util.Random random = akca.a;
                arrayList = new java.util.ArrayList(setKeySet);
                java.util.Collections.shuffle(arrayList, akca.a);
                int i2 = 0;
                aec aecVar2 = new aec(0);
                java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(arrayList);
                java.util.HashSet hashSet = new java.util.HashSet(arrayList);
                while (!arrayDeque.isEmpty()) {
                    akbz akbzVar = (akbz) arrayDeque.remove();
                    aike aikeVar = akbzVar.b;
                    int i3 = aikeVar.d;
                    for (int i4 = 0; i4 < i3; i4++) {
                        akbz akbzVar2 = (akbz) aikeVar.get(i4);
                        akca.b(aecVar2, akbzVar, akbzVar2);
                        if (hashSet.add(akbzVar2)) {
                            arrayDeque.add(akbzVar2);
                        }
                    }
                    aike aikeVar2 = akbzVar.c;
                    int i5 = aikeVar2.d;
                    for (int i6 = 0; i6 < i5; i6++) {
                        akbz akbzVar3 = (akbz) aikeVar2.get(i6);
                        akca.b(aecVar2, akbzVar3, akbzVar);
                        if (hashSet.add(akbzVar3)) {
                            arrayDeque.add(akbzVar3);
                        }
                    }
                }
                aihd aihdVarO = aihd.o(arrayList);
                try {
                    java.util.ArrayList<defpackage.aizn> arrayList2 = new java.util.ArrayList(arrayList.size());
                    java.util.HashMap map2 = new java.util.HashMap(arrayList.size());
                    int i7 = 0;
                    for (java.lang.Object obj : arrayList) {
                        defpackage.aizn aiznVar = new defpackage.aizn(obj, i7);
                        arrayList2.add(aiznVar);
                        java.util.List arrayList3 = (java.util.List) map2.get(obj);
                        if (arrayList3 == null) {
                            arrayList3 = new java.util.ArrayList();
                            map2.put(obj, arrayList3);
                        }
                        arrayList3.add(aiznVar);
                        i7++;
                    }
                    int size = arrayList2.size();
                    while (i2 < size) {
                        defpackage.aizn aiznVar2 = (defpackage.aizn) arrayList2.get(i2);
                        java.util.Iterator it = akca.a(aihdVarO, aecVar2, (akbz) aiznVar2.a).iterator();
                        while (true) {
                            i = i2 + 1;
                            if (it.hasNext()) {
                                java.util.List list = (java.util.List) map2.get(it.next());
                                if (list != null) {
                                    java.util.Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        ((defpackage.aizn) it2.next()).c.add(aiznVar2);
                                        aiznVar2.d++;
                                    }
                                } else {
                                    aiznVar2.d++;
                                }
                            }
                        }
                        i2 = i;
                    }
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList.size());
                    java.util.PriorityQueue priorityQueue = new java.util.PriorityQueue();
                    for (defpackage.aizn aiznVar3 : arrayList2) {
                        if (aiznVar3.d == 0) {
                            priorityQueue.add(aiznVar3);
                        }
                    }
                    while (!priorityQueue.isEmpty()) {
                        defpackage.aizn aiznVar4 = (defpackage.aizn) priorityQueue.poll();
                        arrayList4.add(aiznVar4);
                        for (defpackage.aizn aiznVar5 : aiznVar4.c) {
                            int i8 = aiznVar5.d - 1;
                            aiznVar5.d = i8;
                            if (i8 == 0) {
                                priorityQueue.add(aiznVar5);
                            }
                        }
                    }
                    if (arrayList4.size() != arrayList.size()) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        for (defpackage.aizn aiznVar6 : arrayList2) {
                            if (aiznVar6.d > 0) {
                                arrayList5.add(aiznVar6.a);
                            }
                        }
                        throw new aizm(arrayList5);
                    }
                    arrayList.clear();
                    java.util.Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((defpackage.aizn) it3.next()).a);
                    }
                    aecVar.put(setKeySet, arrayList);
                } catch (aizm e) {
                    throw new java.lang.IllegalStateException("Cycle: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(j$.util.DesugarCollections.unmodifiableList(e.a)))), e);
                }
            }
        }
        aift aiftVar = new aift(4);
        java.util.Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            java.util.Iterator it5 = ((java.util.Set) map.get((akbz) it4.next())).iterator();
            while (it5.hasNext()) {
                aiftVar.i((akbp) ((aoin) it5.next()).a());
            }
        }
        aify aifyVarH = aiftVar.h();
        aooc.ap(aifyVarH);
        return aifyVarH;
    }

    public static akyj f() {
        akyj akyjVar = akyj.a;
        aooc.ap(akyjVar);
        return akyjVar;
    }

    public static aihd g(j$.util.Optional optional, aihd aihdVar) {
        aihd aihdVarA = ahus.A(optional, aihdVar);
        aooc.ap(aihdVarA);
        return aihdVarA;
    }

    public static aihd h(j$.util.Optional optional, aihd aihdVar) {
        aihd aihdVarA = ahus.A(optional, aihdVar);
        aooc.ap(aihdVarA);
        return aihdVarA;
    }

    public static aljw i(alli alliVar) {
        return new aljw(new amfj(1), alliVar);
    }

    public static amcg j(java.util.Map map, amey ameyVar, aizr aizrVar, amac amacVar, alpg alpgVar, alqf alqfVar, amci amciVar) {
        amen amenVar = amcx.b;
        if (amenVar == null) {
            throw new java.lang.NullPointerException("Null transcriptionEndpointer");
        }
        aigf aigfVar = (aigf) j$.util.Collection.-EL.stream(((aikj) map).e()).collect(aido.b(new alzr(10), new alzr(11)));
        if (aigfVar == null) {
            throw new java.lang.NullPointerException("Null ivrOptionParsersMap");
        }
        if (aizrVar == null) {
            throw new java.lang.NullPointerException("Null timeSource");
        }
        if (amacVar == null) {
            throw new java.lang.NullPointerException("Null executorService");
        }
        if (alpgVar == null) {
            throw new java.lang.NullPointerException("Null activeTaskMonitor");
        }
        if (alqfVar == null) {
            throw new java.lang.NullPointerException("Null timerManager");
        }
        alty altyVarA = alty.b().a();
        if (ameyVar == null) {
            throw new java.lang.NullPointerException("Null assetsModelRepository");
        }
        amjk.g().e();
        acul aculVar = new acul(ameyVar, 3);
        if (amciVar != null) {
            return new amcx(aigfVar, aizrVar, amacVar, alpgVar, alqfVar, altyVarA, amenVar, aculVar, ameyVar, amciVar);
        }
        throw new java.lang.NullPointerException("Null publisher");
    }

    public static amdf k(amey ameyVar, amac amacVar, amci amciVar) {
        return new amdn(new alij(ameyVar), amacVar, amciVar);
    }

    public static aolr l(zzx zzxVar, ajcu ajcuVar, aolr aolrVar, ahyn ahynVar, ahyn ahynVar2, ahyn ahynVar3) {
        aooh.f(ajcuVar, "uiThreadExecutor");
        aooh.f(aolrVar, "mainContext");
        aooh.f(ahynVar2, "crashOnExecutorException");
        defpackage.agvz agvzVar = new defpackage.agvz();
        java.lang.Boolean.TRUE.booleanValue();
        aolr aolrVarV = zzxVar.v(new abqi(aiql.r(new agtg(ajcuVar, true, ((java.lang.Boolean) ahynVar2.d(java.lang.Boolean.FALSE)).booleanValue(), true)), ajcuVar));
        defpackage.agwa agwaVar = new defpackage.agwa(agvzVar, 0);
        kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler = aolrVarV.get(kotlinx.coroutines.CoroutineExceptionHandler.c);
        aooh.c(coroutineExceptionHandler);
        defpackage.agvy agvyVar = new defpackage.agvy(coroutineExceptionHandler, agvw.a, agwaVar);
        cch cchVar = aolo.k;
        aosp aospVar = aolrVarV.get(cchVar);
        aooh.d(aospVar, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        aosp aospVar2 = aolrVar.get(cchVar);
        aooh.d(aospVar2, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        aolr aolrVarPlus = aolrVarV.plus(new defpackage.agvx(aospVar, new agwb(aospVar2), agvzVar)).plus(agvyVar);
        aooc.ap(aolrVarPlus);
        return aolrVarPlus;
    }

    public static apjb m(alkw alkwVar) {
        return new apjb(new java.util.concurrent.LinkedBlockingQueue(), alkwVar);
    }

    public final /* synthetic */ java.lang.Object a() {
        throw null;
    }
}
