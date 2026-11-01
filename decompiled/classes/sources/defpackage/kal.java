package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kal {
    private static final defpackage.aimz i = defpackage.aimz.i("com/android/dialer/calllog/compose/data/realtime/CallLogRealtimeDataRepository");
    public final defpackage.kag a;
    public final defpackage.aoss b;
    public final defpackage.aozh c;
    public final j$.util.concurrent.ConcurrentHashMap d;
    public final java.util.Set e;
    public final defpackage.aozj f;
    public final defpackage.apdp g;
    public final defpackage.zjm h;
    private final defpackage.kai j;
    private final defpackage.aoir k;

    public kal(defpackage.kag kagVar, defpackage.kai kaiVar, defpackage.zjm zjmVar, defpackage.aoss aossVar) {
        if (kaiVar == null) {
            defpackage.aooh.i("persister");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.a = kagVar;
        this.j = kaiVar;
        this.h = zjmVar;
        this.b = aossVar;
        this.k = new defpackage.aoiy(new defpackage.jza(this, 7));
        defpackage.aozj aozjVar = new defpackage.aozj(0);
        this.f = aozjVar;
        this.c = new defpackage.aoys(aozjVar, null);
        this.d = new j$.util.concurrent.ConcurrentHashMap();
        this.e = new java.util.LinkedHashSet();
        this.g = new defpackage.apdp();
    }

    private final defpackage.kgz e() {
        return (defpackage.kgz) this.k.a();
    }

    public final kaq a(defpackage.kiu kiuVar) {
        defpackage.kgz kgzVarE = e();
        if (kgzVarE != null && kgzVarE.d) {
            defpackage.kgz kgzVarE2 = e();
            defpackage.kgu kguVarB = kgzVarE2 != null ? kgzVarE2.b(kiuVar) : null;
            if (kguVarB != null) {
                java.lang.String str = kguVarB.c;
                defpackage.aooh.e(str, "getUuid(...)");
                java.lang.String str2 = kiuVar.N;
                defpackage.aooh.e(str2, "getCachedLookupUri(...)");
                java.lang.String str3 = kguVarB.g;
                defpackage.aooh.e(str3, "getAppPackageName(...)");
                return new kap(str, str2, str3);
            }
        }
        hkd hkdVar = kiuVar.f;
        if (hkdVar == null) {
            hkdVar = hkd.a;
        }
        defpackage.aooh.e(hkdVar, "getNumber(...)");
        return new kao(hkdVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final java.lang.Object b(java.util.List list, defpackage.aoln aolnVar) {
        kaj kajVar;
        defpackage.apdp apdpVar;
        ?? r6;
        if (aolnVar instanceof kaj) {
            kajVar = (kaj) aolnVar;
            int i2 = kajVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kajVar.d = i2 - Integer.MIN_VALUE;
            } else {
                kajVar = new kaj(this, aolnVar);
            }
        } else {
            kajVar = new kaj(this, aolnVar);
        }
        java.lang.Object obj = kajVar.b;
        java.lang.Object objBQ = defpackage.aolu.a;
        int i3 = kajVar.d;
        try {
            if (i3 == 0) {
                defpackage.aooc.af(obj);
                apdpVar = this.g;
                kajVar.a = list;
                kajVar.e = apdpVar;
                kajVar.d = 1;
                if (apdpVar.b(kajVar) != objBQ) {
                }
                r6 = list;
                return objBQ;
            }
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.apdp apdpVar2 = kajVar.e;
            java.lang.Object obj2 = kajVar.a;
            defpackage.aooc.af(obj);
            apdpVar = apdpVar2;
            r6 = obj2;
            r6 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(r6, 10));
            java.util.Iterator it = r6.iterator();
            while (it.hasNext()) {
                arrayList.add(a((defpackage.kiu) it.next()));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj3 : arrayList) {
                kaq kaqVar = (kaq) obj3;
                java.util.Set set = this.e;
                if (!set.contains(kaqVar) && !this.d.containsKey(kaqVar)) {
                    set.add(kaqVar);
                    arrayList2.add(obj3);
                }
            }
            objBQ = defpackage.ajsz.bQ(arrayList2);
            r6 = list;
            return objBQ;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object c(java.util.List list, defpackage.aoln aolnVar) throws java.lang.Throwable {
        kak kakVar;
        java.lang.Object objAR;
        defpackage.aoiu aoiuVar;
        if (aolnVar instanceof kak) {
            kakVar = (kak) aolnVar;
            int i2 = kakVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kakVar.d = i2 - Integer.MIN_VALUE;
            } else {
                kakVar = new kak(this, aolnVar);
            }
        } else {
            kakVar = new kak(this, aolnVar);
        }
        java.lang.Object objM = kakVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = kakVar.d;
        try {
            try {
                if (i3 == 0) {
                    defpackage.aooc.af(objM);
                    defpackage.kag kagVar = this.a;
                    kakVar.a = list;
                    kakVar.d = 1;
                    objM = defpackage.aosv.m(new apw(list, kagVar, (defpackage.aoln) null, 14), kakVar);
                    if (objM == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 == 2 || i3 == 3) {
                            java.util.Map map = (java.util.Map) kakVar.a;
                            defpackage.aooc.af(objM);
                            return map;
                        }
                        if (i3 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.Throwable th = (java.lang.Throwable) kakVar.a;
                        defpackage.aooc.af(objM);
                        throw th;
                    }
                    list = (java.util.List) kakVar.a;
                    defpackage.aooc.af(objM);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.util.Map.Entry entry : ((java.util.Map) objM).entrySet()) {
                    kaq kaqVar = (kaq) entry.getKey();
                    kar karVar = (kat) entry.getValue();
                    if (karVar instanceof kar) {
                        defpackage.kai kaiVar = this.j;
                        jlr jlrVar = karVar.a;
                        kaiVar.c.put(jlrVar.C(), jlrVar);
                        aoiuVar = new defpackage.aoiu(kaqVar, jlrVar);
                    } else {
                        aoiuVar = null;
                    }
                    if (aoiuVar != null) {
                        arrayList.add(aoiuVar);
                    }
                }
                objAR = defpackage.ajsz.aR(arrayList);
                defpackage.aour aourVar = defpackage.aour.a;
                ite iteVar = new ite(this, list, (defpackage.aoln) null, 2);
                kakVar.a = objAR;
                kakVar.d = 2;
                if (defpackage.aoov.aj(aourVar, iteVar, kakVar) == aoluVar) {
                    return aoluVar;
                }
            } catch (java.util.concurrent.CancellationException e) {
                throw e;
            } catch (java.lang.Exception e2) {
                ((defpackage.aimw) ((defpackage.aimw) i.d()).k(e2).l("com/android/dialer/calllog/compose/data/realtime/CallLogRealtimeDataRepository", "processKeys", 162, "CallLogRealtimeDataRepository.kt")).v("Failed realtime processing");
                objAR = defpackage.aokd.a;
                defpackage.aour aourVar2 = defpackage.aour.a;
                ite iteVar2 = new ite(this, list, (defpackage.aoln) null, 2);
                kakVar.a = objAR;
                kakVar.d = 3;
                if (defpackage.aoov.aj(aourVar2, iteVar2, kakVar) == aoluVar) {
                    return aoluVar;
                }
            }
            return objAR;
        } catch (java.lang.Throwable th2) {
            defpackage.aour aourVar3 = defpackage.aour.a;
            ite iteVar3 = new ite(this, list, (defpackage.aoln) null, 2);
            kakVar.a = th2;
            kakVar.d = 4;
            if (defpackage.aoov.aj(aourVar3, iteVar3, kakVar) == aoluVar) {
                return aoluVar;
            }
            throw th2;
        }
    }

    public final void d() {
        this.d.clear();
    }
}
