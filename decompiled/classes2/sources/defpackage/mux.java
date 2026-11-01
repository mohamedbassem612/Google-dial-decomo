package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mux {
    private static final aimz a = aimz.i("com/android/dialer/dobby/impl/growthkit/DobbyPromoCallLogEventFetcher");
    private final ojo b;
    private final nri c;
    private final ucr d;

    public mux(aazc aazcVar, ojo ojoVar, nri nriVar, ucr ucrVar) {
        aooh.f(aazcVar, "clock");
        aooh.f(ojoVar, "dialerContentResolver");
        aooh.f(nriVar, "dobbyDatabase");
        this.b = ojoVar;
        this.c = nriVar;
        this.d = ucrVar;
    }

    private static final java.lang.Object h() {
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        long j = aorh.a;
        return new java.lang.Long(epochMilli - aorh.g(aooh.A(7, aorj.g)));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:32:0x010f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0115  */
    /* JADX WARN: Code duplicated, block: B:36:0x0117  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.muq muqVar;
        rsr rsrVar;
        kaw kawVar;
        java.lang.String str;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        udj udjVarB;
        int i;
        if (aolnVar instanceof defpackage.muq) {
            muqVar = (defpackage.muq) aolnVar;
            int i2 = muqVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                muqVar.c = i2 - Integer.MIN_VALUE;
            } else {
                muqVar = new defpackage.muq(this, aolnVar);
            }
        } else {
            muqVar = new defpackage.muq(this, aolnVar);
        }
        defpackage.muq muqVar2 = muqVar;
        java.lang.Object objH = muqVar2.a;
        aolu aoluVar = aolu.a;
        int i3 = muqVar2.c;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    str = muqVar2.d;
                    kawVar = muqVar2.e;
                    rsrVar = muqVar2.f;
                    aooc.af(objH);
                } else if (i3 == 2) {
                    aooc.af(objH);
                    ajcq ajcqVarA = this.d.a(ahvr.bv((java.util.Collection) objH));
                    aooh.e(ajcqVarA, "batchCheckCallSpamStatus(...)");
                    muqVar2.c = 3;
                    objH = aosv.D(ajcqVarA, muqVar2);
                    if (objH == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (i3 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aooc.af(objH);
                }
                aooh.e(objH, "await(...)");
                java.util.Map map = (java.util.Map) objH;
                arrayList = new java.util.ArrayList(map.size());
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    udjVarB = udj.b(((ucu) ((java.util.Map.Entry) it.next()).getValue()).d);
                    if (udjVarB == null) {
                        udjVarB = udj.a;
                    }
                    if (udjVarB == udj.c) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    arrayList.add(new java.lang.Integer(i));
                }
                return new java.lang.Integer(ajsz.bz(ahvr.bv(arrayList)));
            }
            aooc.af(objH);
            rsrVar = new rsr();
            rsrVar.aC(new kaw("type").aI("=", "1"));
            rsrVar.aC(new kaw("duration").aI("<", new java.lang.Integer(10)));
            kawVar = new kaw("date");
            muqVar2.f = rsrVar;
            muqVar2.e = kawVar;
            str = ">";
            muqVar2.d = ">";
            muqVar2.c = 1;
            objH = h();
            if (objH == aoluVar) {
                return aoluVar;
            }
            rsrVar.aC(kawVar.aI(str, objH));
            rsr rsrVarAB = rsrVar.aB();
            ojo ojoVar = this.b;
            android.net.Uri uri = android.provider.CallLog.Calls.CONTENT_URI;
            aooh.e(uri, "CONTENT_URI");
            java.lang.Object obj = rsrVarAB.b;
            java.lang.Object obj2 = rsrVarAB.a;
            defpackage.bbb bbbVar = defpackage.bbb.j;
            muqVar2.f = null;
            muqVar2.e = null;
            muqVar2.d = null;
            muqVar2.c = 2;
            objH = ojoVar.i(uri, new java.lang.String[]{"date"}, (java.lang.String) obj, (java.lang.String[]) obj2, (java.lang.String) null, bbbVar, muqVar2);
            if (objH == aoluVar) {
                return aoluVar;
            }
            ajcq ajcqVarA2 = this.d.a(ahvr.bv((java.util.Collection) objH));
            aooh.e(ajcqVarA2, "batchCheckCallSpamStatus(...)");
            muqVar2.c = 3;
            objH = aosv.D(ajcqVarA2, muqVar2);
            if (objH == aoluVar) {
                return aoluVar;
            }
            aooh.e(objH, "await(...)");
            java.util.Map map2 = (java.util.Map) objH;
            arrayList = new java.util.ArrayList(map2.size());
            it = map2.entrySet().iterator();
            while (it.hasNext()) {
                udjVarB = udj.b(((ucu) ((java.util.Map.Entry) it.next()).getValue()).d);
                if (udjVarB == null) {
                    udjVarB = udj.a;
                }
                if (udjVarB == udj.c) {
                    i = 1;
                } else {
                    i = 0;
                }
                arrayList.add(new java.lang.Integer(i));
            }
            return new java.lang.Integer(ajsz.bz(ahvr.bv(arrayList)));
        } catch (java.lang.RuntimeException e) {
            a.d().k(e).l("com/android/dialer/dobby/impl/growthkit/DobbyPromoCallLogEventFetcher", "getAnsweredThenImmediatelyDroppedSpamCallCount", 158, "DobbyPromoCallLogEventFetcher.kt").v("getAnsweredThenImmediatelyDroppedSpamCallCount failed");
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:34:0x0108  */
    /* JADX WARN: Code duplicated, block: B:41:0x0131 A[LOOP:2: B:39:0x012b->B:41:0x0131, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x0163  */
    /* JADX WARN: Code duplicated, block: B:48:0x017d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0187  */
    /* JADX WARN: Code duplicated, block: B:53:0x018d  */
    /* JADX WARN: Code duplicated, block: B:64:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.mur murVar;
        rsr rsrVar;
        kaw kawVar;
        java.lang.String str;
        java.util.LinkedHashMap linkedHashMap;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        aify aifyVarBv;
        java.lang.Object objI;
        aify aifyVar;
        udj udjVarB;
        java.util.ArrayList arrayList2;
        java.util.Iterator it2;
        defpackage.nsq nsqVar;
        defpackage.nsm nsmVar;
        if (aolnVar instanceof defpackage.mur) {
            murVar = (defpackage.mur) aolnVar;
            int i = murVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                murVar.d = i - Integer.MIN_VALUE;
            } else {
                murVar = new defpackage.mur(this, aolnVar);
            }
        } else {
            murVar = new defpackage.mur(this, aolnVar);
        }
        defpackage.mur murVar2 = murVar;
        java.lang.Object objH = murVar2.b;
        aolu aoluVar = aolu.a;
        int i2 = murVar2.d;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    str = murVar2.e;
                    kawVar = murVar2.f;
                    rsrVar = (rsr) murVar2.a;
                    aooc.af(objH);
                } else if (i2 == 2) {
                    aooc.af(objH);
                    ajcq ajcqVarA = this.d.a(ahvr.bv((java.util.Collection) objH));
                    aooh.e(ajcqVarA, "batchCheckCallSpamStatus(...)");
                    murVar2.d = 3;
                    objH = aosv.D(ajcqVarA, murVar2);
                    if (objH == aoluVar) {
                        return aoluVar;
                    }
                    aigf aigfVar = (aigf) objH;
                    aooh.c(aigfVar);
                    linkedHashMap = new java.util.LinkedHashMap();
                    for (java.util.Map.Entry entry : aigfVar.entrySet()) {
                        udjVarB = udj.b(((ucu) entry.getValue()).d);
                        if (udjVarB == null) {
                            udjVarB = udj.a;
                        }
                        if (udjVarB == udj.c) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    arrayList = new java.util.ArrayList(linkedHashMap.size());
                    it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        java.lang.Object key = ((java.util.Map.Entry) it.next()).getKey();
                        aooh.e(key, "<get-key>(...)");
                        arrayList.add(new java.lang.Long(java.lang.Long.parseLong((java.lang.String) key)));
                    }
                    aifyVarBv = ahvr.bv(arrayList);
                    nri nriVar = this.c;
                    aify aifyVarBv2 = ahvr.bv(aifyVarBv);
                    murVar2.a = aifyVarBv;
                    murVar2.d = 4;
                    objI = nriVar.i(aifyVarBv2, murVar2);
                    if (objI == aoluVar) {
                        return aoluVar;
                    }
                    objH = objI;
                    aifyVar = aifyVarBv;
                } else if (i2 == 3) {
                    aooc.af(objH);
                    aigf aigfVar2 = (aigf) objH;
                    aooh.c(aigfVar2);
                    linkedHashMap = new java.util.LinkedHashMap();
                    while (r14.hasNext()) {
                        udjVarB = udj.b(((ucu) entry.getValue()).d);
                        if (udjVarB == null) {
                            udjVarB = udj.a;
                        }
                        if (udjVarB == udj.c) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    arrayList = new java.util.ArrayList(linkedHashMap.size());
                    it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        java.lang.Object key2 = ((java.util.Map.Entry) it.next()).getKey();
                        aooh.e(key2, "<get-key>(...)");
                        arrayList.add(new java.lang.Long(java.lang.Long.parseLong((java.lang.String) key2)));
                    }
                    aifyVarBv = ahvr.bv(arrayList);
                    nri nriVar2 = this.c;
                    aify aifyVarBv3 = ahvr.bv(aifyVarBv);
                    murVar2.a = aifyVarBv;
                    murVar2.d = 4;
                    objI = nriVar2.i(aifyVarBv3, murVar2);
                    if (objI == aoluVar) {
                        return aoluVar;
                    }
                    objH = objI;
                    aifyVar = aifyVarBv;
                } else {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aifyVar = (aify) murVar2.a;
                    aooc.af(objH);
                }
                java.lang.Iterable iterable = (java.lang.Iterable) objH;
                arrayList2 = new java.util.ArrayList(ajsz.bl(iterable, 10));
                it2 = iterable.iterator();
                while (it2.hasNext()) {
                    nsqVar = ((defpackage.nsp) it2.next()).e;
                    if (nsqVar == null) {
                        nsqVar = defpackage.nsq.a;
                    }
                    nsmVar = nsqVar.f;
                    if (nsmVar == null) {
                        nsmVar = defpackage.nsm.a;
                    }
                    arrayList2.add(new java.lang.Integer(!nsmVar.g ? 1 : 0));
                }
                aify aifyVarBv4 = ahvr.bv(arrayList2);
                return new java.lang.Integer(ajsz.bz(aifyVarBv4) + (aifyVar.size() - aifyVarBv4.size()));
            }
            aooc.af(objH);
            java.util.List listBd = ajsz.bd(new java.lang.String[]{"5", "3"});
            rsrVar = new rsr();
            rsrVar.aC(new kaw("type").aF(listBd));
            kawVar = new kaw("date");
            murVar2.a = rsrVar;
            murVar2.f = kawVar;
            str = ">";
            murVar2.e = ">";
            murVar2.d = 1;
            objH = h();
            if (objH == aoluVar) {
                return aoluVar;
            }
            rsrVar.aC(kawVar.aI(str, objH));
            rsr rsrVarAB = rsrVar.aB();
            ojo ojoVar = this.b;
            android.net.Uri uri = android.provider.CallLog.Calls.CONTENT_URI;
            aooh.e(uri, "CONTENT_URI");
            java.lang.Object obj = rsrVarAB.b;
            java.lang.Object obj2 = rsrVarAB.a;
            defpackage.bbb bbbVar = defpackage.bbb.k;
            murVar2.a = null;
            murVar2.f = null;
            murVar2.e = null;
            murVar2.d = 2;
            objH = ojoVar.i(uri, new java.lang.String[]{"date"}, (java.lang.String) obj, (java.lang.String[]) obj2, (java.lang.String) null, bbbVar, murVar2);
            if (objH == aoluVar) {
                return aoluVar;
            }
            ajcq ajcqVarA2 = this.d.a(ahvr.bv((java.util.Collection) objH));
            aooh.e(ajcqVarA2, "batchCheckCallSpamStatus(...)");
            murVar2.d = 3;
            objH = aosv.D(ajcqVarA2, murVar2);
            if (objH == aoluVar) {
                return aoluVar;
            }
            aigf aigfVar3 = (aigf) objH;
            aooh.c(aigfVar3);
            linkedHashMap = new java.util.LinkedHashMap();
            while (r14.hasNext()) {
                udjVarB = udj.b(((ucu) entry.getValue()).d);
                if (udjVarB == null) {
                    udjVarB = udj.a;
                }
                if (udjVarB == udj.c) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            arrayList = new java.util.ArrayList(linkedHashMap.size());
            it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                java.lang.Object key3 = ((java.util.Map.Entry) it.next()).getKey();
                aooh.e(key3, "<get-key>(...)");
                arrayList.add(new java.lang.Long(java.lang.Long.parseLong((java.lang.String) key3)));
            }
            aifyVarBv = ahvr.bv(arrayList);
            nri nriVar3 = this.c;
            aify aifyVarBv5 = ahvr.bv(aifyVarBv);
            murVar2.a = aifyVarBv;
            murVar2.d = 4;
            objI = nriVar3.i(aifyVarBv5, murVar2);
            if (objI == aoluVar) {
                return aoluVar;
            }
            objH = objI;
            aifyVar = aifyVarBv;
            java.lang.Iterable iterable2 = (java.lang.Iterable) objH;
            arrayList2 = new java.util.ArrayList(ajsz.bl(iterable2, 10));
            it2 = iterable2.iterator();
            while (it2.hasNext()) {
                nsqVar = ((defpackage.nsp) it2.next()).e;
                if (nsqVar == null) {
                    nsqVar = defpackage.nsq.a;
                }
                nsmVar = nsqVar.f;
                if (nsmVar == null) {
                    nsmVar = defpackage.nsm.a;
                }
                arrayList2.add(new java.lang.Integer(!nsmVar.g ? 1 : 0));
            }
            aify aifyVarBv6 = ahvr.bv(arrayList2);
            return new java.lang.Integer(ajsz.bz(aifyVarBv6) + (aifyVar.size() - aifyVarBv6.size()));
        } catch (java.lang.RuntimeException e) {
            a.d().k(e).l("com/android/dialer/dobby/impl/growthkit/DobbyPromoCallLogEventFetcher", "getNotAnsweredSpamCallCount", 112, "DobbyPromoCallLogEventFetcher.kt").v("getNotAnsweredSpamCallCount failed");
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.mus musVar;
        int i;
        if (aolnVar instanceof defpackage.mus) {
            musVar = (defpackage.mus) aolnVar;
            int i2 = musVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                musVar.d = i2 - Integer.MIN_VALUE;
            } else {
                musVar = new defpackage.mus(this, aolnVar);
            }
        } else {
            musVar = new defpackage.mus(this, aolnVar);
        }
        java.lang.Object objD = musVar.b;
        aolu aoluVar = aolu.a;
        int i3 = musVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                aooc.af(objD);
            } else {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = musVar.a;
                aooc.af(objD);
            }
            return new java.lang.Integer(i + ((java.lang.Number) objD).intValue());
        }
        aooc.af(objD);
        musVar.d = 1;
        objD = d(musVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        int iIntValue = ((java.lang.Number) objD).intValue();
        musVar.a = iIntValue;
        musVar.d = 2;
        java.lang.Object objE = e(musVar);
        if (objE == aoluVar) {
            return aoluVar;
        }
        objD = objE;
        i = iIntValue;
        return new java.lang.Integer(i + ((java.lang.Number) objD).intValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.mut mutVar;
        udy udyVar;
        if (aolnVar instanceof defpackage.mut) {
            mutVar = (defpackage.mut) aolnVar;
            int i = mutVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mutVar.c = i - Integer.MIN_VALUE;
            } else {
                mutVar = new defpackage.mut(this, aolnVar);
            }
        } else {
            mutVar = new defpackage.mut(this, aolnVar);
        }
        java.lang.Object objH = mutVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mutVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                udyVar = mutVar.d;
                aooc.af(objH);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objH);
            }
            aooh.e(objH, "await(...)");
            return objH;
        }
        aooc.af(objH);
        udyVar = this.d;
        mutVar.d = udyVar;
        mutVar.c = 1;
        objH = h();
        if (objH == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarD = udyVar.d(j$.time.Instant.ofEpochMilli(((java.lang.Number) objH).longValue()), udj.e);
        mutVar.d = null;
        mutVar.c = 2;
        objH = aosv.D(ajcqVarD, mutVar);
        if (objH == aoluVar) {
            return aoluVar;
        }
        aooh.e(objH, "await(...)");
        return objH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.muu muuVar;
        udy udyVar;
        if (aolnVar instanceof defpackage.muu) {
            muuVar = (defpackage.muu) aolnVar;
            int i = muuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                muuVar.c = i - Integer.MIN_VALUE;
            } else {
                muuVar = new defpackage.muu(this, aolnVar);
            }
        } else {
            muuVar = new defpackage.muu(this, aolnVar);
        }
        java.lang.Object objH = muuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = muuVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                udyVar = muuVar.d;
                aooc.af(objH);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objH);
            }
            aooh.e(objH, "await(...)");
            return objH;
        }
        aooc.af(objH);
        udyVar = this.d;
        muuVar.d = udyVar;
        muuVar.c = 1;
        objH = h();
        if (objH == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarD = udyVar.d(j$.time.Instant.ofEpochMilli(((java.lang.Number) objH).longValue()), udj.b);
        muuVar.d = null;
        muuVar.c = 2;
        objH = aosv.D(ajcqVarD, muuVar);
        if (objH == aoluVar) {
            return aoluVar;
        }
        aooh.e(objH, "await(...)");
        return objH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(aoln aolnVar) {
        defpackage.muv muvVar;
        udy udyVar;
        if (aolnVar instanceof defpackage.muv) {
            muvVar = (defpackage.muv) aolnVar;
            int i = muvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                muvVar.c = i - Integer.MIN_VALUE;
            } else {
                muvVar = new defpackage.muv(this, aolnVar);
            }
        } else {
            muvVar = new defpackage.muv(this, aolnVar);
        }
        java.lang.Object objH = muvVar.a;
        aolu aoluVar = aolu.a;
        int i2 = muvVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                udyVar = muvVar.d;
                aooc.af(objH);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objH);
            }
            aooh.e(objH, "await(...)");
            return objH;
        }
        aooc.af(objH);
        udyVar = this.d;
        muvVar.d = udyVar;
        muvVar.c = 1;
        objH = h();
        if (objH == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarD = udyVar.d(j$.time.Instant.ofEpochMilli(((java.lang.Number) objH).longValue()), udj.c);
        muvVar.d = null;
        muvVar.c = 2;
        objH = aosv.D(ajcqVarD, muvVar);
        if (objH == aoluVar) {
            return aoluVar;
        }
        aooh.e(objH, "await(...)");
        return objH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(aoln aolnVar) {
        defpackage.muw muwVar;
        int i;
        if (aolnVar instanceof defpackage.muw) {
            muwVar = (defpackage.muw) aolnVar;
            int i2 = muwVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                muwVar.d = i2 - Integer.MIN_VALUE;
            } else {
                muwVar = new defpackage.muw(this, aolnVar);
            }
        } else {
            muwVar = new defpackage.muw(this, aolnVar);
        }
        java.lang.Object objB = muwVar.b;
        aolu aoluVar = aolu.a;
        int i3 = muwVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                aooc.af(objB);
            } else {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = muwVar.a;
                aooc.af(objB);
            }
            return new java.lang.Integer(i + ((java.lang.Number) objB).intValue());
        }
        aooc.af(objB);
        muwVar.d = 1;
        objB = b(muwVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        int iIntValue = ((java.lang.Number) objB).intValue();
        muwVar.a = iIntValue;
        muwVar.d = 2;
        java.lang.Object objA = a(muwVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        objB = objA;
        i = iIntValue;
        return new java.lang.Integer(i + ((java.lang.Number) objB).intValue());
    }
}
