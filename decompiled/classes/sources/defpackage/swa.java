package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class swa {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/prefetchedcall/datacache/PrefetchedCallDataCache");
    public final defpackage.svs b;
    public final defpackage.swa c;
    public final java.lang.String d;
    public final defpackage.aoss e;
    public final defpackage.zpz f;
    public final defpackage.apni g;
    private final java.util.Map h;
    private final defpackage.apdp i;

    public swa(defpackage.svs svsVar, defpackage.swa swaVar, java.lang.String str, defpackage.zpz zpzVar, defpackage.apni apniVar, defpackage.aazc aazcVar, defpackage.aoss aossVar) {
        if (zpzVar == null) {
            defpackage.aooh.i("inCallUpdatePropagator");
        }
        if (apniVar == null) {
            defpackage.aooh.i("androidJobs");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.b = svsVar;
        this.c = swaVar;
        this.d = str;
        this.f = zpzVar;
        this.g = apniVar;
        this.e = aossVar;
        this.i = new defpackage.apdp();
        this.h = new java.util.LinkedHashMap();
    }

    public final svt a(svu svuVar) {
        return (svt) this.h.get(svuVar);
    }

    public final defpackage.ajcq b(long j, java.lang.Object obj) {
        defpackage.ajcq ajcqVarA = defpackage.aiql.A(defpackage.aosv.F(this.e, 4, new klr(this, j, obj, (defpackage.aoln) null, 8), 1));
        defpackage.aooh.e(ajcqVarA, "nonCancellationPropagating(...)");
        return ajcqVarA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(long j, java.lang.Object obj, defpackage.aoln aolnVar) {
        svv svvVar;
        if (aolnVar instanceof svv) {
            svvVar = (svv) aolnVar;
            int i = svvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                svvVar.c = i - Integer.MIN_VALUE;
            } else {
                svvVar = new svv(this, aolnVar);
            }
        } else {
            svvVar = new svv(this, aolnVar);
        }
        java.lang.Object objD = svvVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = svvVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            svvVar.c = 1;
            objD = d(j, obj, svvVar);
            if (objD != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
            return objD;
        }
        defpackage.aooc.af(objD);
        svvVar.c = 2;
        java.lang.Object objA = ((defpackage.aosy) objD).a(svvVar);
        if (objA != aoluVar) {
            return objA;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final java.lang.Object d(long j, java.lang.Object obj, defpackage.aoln aolnVar) {
        svw svwVar;
        defpackage.apdp apdpVar;
        java.lang.Object obj2;
        long j2;
        defpackage.apdp apdpVar2;
        j$.time.Instant instant;
        if (aolnVar instanceof svw) {
            svwVar = (svw) aolnVar;
            int i = svwVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                svwVar.e = i - Integer.MIN_VALUE;
            } else {
                svwVar = new svw(this, aolnVar);
            }
        } else {
            svwVar = new svw(this, aolnVar);
        }
        java.lang.Object obj3 = svwVar.c;
        java.lang.Object obj4 = defpackage.aolu.a;
        int i2 = svwVar.e;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj3);
                apdpVar = this.i;
                obj2 = obj;
                svwVar.b = obj2;
                svwVar.f = apdpVar;
                svwVar.a = j;
                svwVar.e = 1;
                if (apdpVar.b(svwVar) != obj4) {
                    j2 = j;
                }
                return obj4;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = svwVar.a;
            apdpVar = svwVar.f;
            java.lang.Object obj5 = svwVar.b;
            defpackage.aooc.af(obj3);
            obj2 = obj5;
            defpackage.aimz aimzVar = a;
            defpackage.aimw aimwVar = (defpackage.aimw) aimzVar.b().l("com/android/dialer/prefetchedcall/datacache/PrefetchedCallDataCache", "fetchAndStoreDataAsync$<anonymous>", 138, "PrefetchedCallDataCache.kt");
            java.lang.String str = this.d;
            aimwVar.y("%s: enter", str);
            svu svuVar = new svu(j2, this.b.a(obj2));
            defpackage.aoop aoopVar = new defpackage.aoop();
            java.util.Map map = this.h;
            obj4 = ((svt) j$.util.Map.-EL.computeIfAbsent(map, svuVar, new pei(new defpackage.tfm(this, aoopVar, svuVar, obj2, 1), 18))).a;
            if (aoopVar.a) {
                j$.time.Instant instantNow = j$.time.Instant.now();
                java.util.Set setKeySet = map.keySet();
                java.util.ArrayList<svu> arrayList = new java.util.ArrayList();
                for (java.lang.Object obj6 : setKeySet) {
                    svt svtVar = (svt) map.get((svu) obj6);
                    if (svtVar != null && (instant = svtVar.b) != null && instant.isBefore(instantNow)) {
                        arrayList.add(obj6);
                    }
                }
                for (svu svuVar2 : arrayList) {
                    ((defpackage.aimw) aimzVar.b().l("com/android/dialer/prefetchedcall/datacache/PrefetchedCallDataCache", "removeAllExpiredData$<anonymous>", 257, "PrefetchedCallDataCache.kt")).y("%s: cache item removed (expired)", str);
                    map.remove(svuVar2);
                }
            }
            return obj4;
        } finally {
            apdpVar2.d();
        }
        apdpVar2 = apdpVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object e(long j, j$.time.Duration duration, defpackage.aoln aolnVar) {
        svx svxVar;
        j$.time.Duration duration2;
        defpackage.apdp apdpVar;
        if (aolnVar instanceof svx) {
            svxVar = (svx) aolnVar;
            int i = svxVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                svxVar.d = i - Integer.MIN_VALUE;
            } else {
                svxVar = new svx(this, aolnVar);
            }
        } else {
            svxVar = new svx(this, aolnVar);
        }
        java.lang.Object obj = svxVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = svxVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.apdp apdpVar2 = this.i;
            svxVar.e = duration;
            svxVar.f = apdpVar2;
            svxVar.a = j;
            svxVar.d = 1;
            if (apdpVar2.b(svxVar) == aoluVar) {
                return aoluVar;
            }
            duration2 = duration;
            apdpVar = apdpVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = svxVar.a;
            apdpVar = svxVar.f;
            duration2 = svxVar.e;
            defpackage.aooc.af(obj);
        }
        try {
            java.util.Map map = this.h;
            java.util.Set setKeySet = map.keySet();
            java.util.ArrayList<svu> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : setKeySet) {
                if (((svu) obj2).a == j) {
                    arrayList.add(obj2);
                }
            }
            for (svu svuVar : arrayList) {
                ((defpackage.aimw) a.b().l("com/android/dialer/prefetchedcall/datacache/PrefetchedCallDataCache", "setTtlOnAllDataForCall$<anonymous>$<anonymous>", 234, "PrefetchedCallDataCache.kt")).y("%s: set TTL", this.d);
                svt svtVar = (svt) map.get(svuVar);
                if (svtVar != null) {
                    map.put(svuVar, new svt(svtVar.a, j$.time.Instant.now().plusSeconds(duration2.getSeconds())));
                }
            }
            return defpackage.aojh.a;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008b A[Catch: all -> 0x00cd, TryCatch #0 {all -> 0x00cd, blocks: (B:13:0x002e, B:29:0x0085, B:31:0x008b, B:33:0x00b4, B:36:0x00c7), top: B:45:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    public final java.lang.Object f(long j, svr svrVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        svy svyVar;
        svr svrVar2;
        defpackage.apdp apdpVar;
        defpackage.apdp apdpVar2;
        svr svrVar3;
        ?? it;
        svt svtVar;
        defpackage.svs svsVar;
        defpackage.aosy aosyVar;
        if (aolnVar instanceof svy) {
            svyVar = (svy) aolnVar;
            int i = svyVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                svyVar.e = i - Integer.MIN_VALUE;
            } else {
                svyVar = new svy(this, aolnVar);
            }
        } else {
            svyVar = new svy(this, aolnVar);
        }
        java.lang.Object obj = svyVar.c;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = svyVar.e;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                defpackage.apdp apdpVar3 = this.i;
                svyVar.f = svrVar;
                svyVar.g = apdpVar3;
                svyVar.a = j;
                svyVar.e = 1;
                if (apdpVar3.b(svyVar) != obj2) {
                    svrVar2 = svrVar;
                    apdpVar = apdpVar3;
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj3 = svyVar.b;
                apdpVar2 = svyVar.g;
                svrVar3 = svyVar.f;
                try {
                    defpackage.aooc.af(obj);
                    it = obj3;
                    while (it.hasNext()) {
                        svu svuVar = (svu) it.next();
                        ((defpackage.aimw) a.b().l("com/android/dialer/prefetchedcall/datacache/PrefetchedCallDataCache", "stopFetchAndDiscardAllDataForCall$<anonymous>$<anonymous>", 216, "PrefetchedCallDataCache.kt")).I("%s: cache item removed (%s)", this.d, svrVar3);
                        svtVar = (svt) this.h.remove(svuVar);
                        if (svtVar != null) {
                            svsVar = this.b;
                            aosyVar = svtVar.a;
                            svyVar.f = svrVar3;
                            svyVar.g = apdpVar2;
                            svyVar.b = it;
                            svyVar.e = 2;
                            if (svsVar.c(aosyVar, svrVar3, svyVar) == obj2) {
                                return obj2;
                            }
                        }
                    }
                    obj2 = defpackage.aojh.a;
                    apdpVar2.d();
                    return obj2;
                } catch (java.lang.Throwable th) {
                    th = th;
                    apdpVar2.d();
                    throw th;
                }
            }
            j = svyVar.a;
            apdpVar = svyVar.g;
            svrVar2 = svyVar.f;
            defpackage.aooc.af(obj);
            java.util.Set setKeySet = this.h.keySet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj4 : setKeySet) {
                if (((svu) obj4).a == j) {
                    arrayList.add(obj4);
                }
            }
            apdpVar2 = apdpVar;
            svrVar3 = svrVar2;
            it = arrayList.iterator();
            while (it.hasNext()) {
                svu svuVar2 = (svu) it.next();
                ((defpackage.aimw) a.b().l("com/android/dialer/prefetchedcall/datacache/PrefetchedCallDataCache", "stopFetchAndDiscardAllDataForCall$<anonymous>$<anonymous>", 216, "PrefetchedCallDataCache.kt")).I("%s: cache item removed (%s)", this.d, svrVar3);
                svtVar = (svt) this.h.remove(svuVar2);
                if (svtVar != null) {
                    svsVar = this.b;
                    aosyVar = svtVar.a;
                    svyVar.f = svrVar3;
                    svyVar.g = apdpVar2;
                    svyVar.b = it;
                    svyVar.e = 2;
                    if (svsVar.c(aosyVar, svrVar3, svyVar) == obj2) {
                        return obj2;
                    }
                }
            }
            obj2 = defpackage.aojh.a;
            apdpVar2.d();
            return obj2;
        } catch (java.lang.Throwable th2) {
            th = th2;
            apdpVar2 = apdpVar;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(long j, java.lang.Object obj, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        svz svzVar;
        defpackage.apdp apdpVar;
        if (aolnVar instanceof svz) {
            svzVar = (svz) aolnVar;
            int i = svzVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                svzVar.d = i - Integer.MIN_VALUE;
            } else {
                svzVar = new svz(this, aolnVar);
            }
        } else {
            svzVar = new svz(this, aolnVar);
        }
        java.lang.Object obj2 = svzVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = svzVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            apdpVar = this.i;
            svzVar.e = (phj) obj;
            svzVar.g = (lnb) aonnVar;
            svzVar.f = apdpVar;
            svzVar.a = j;
            svzVar.d = 1;
            if (apdpVar.b(svzVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = svzVar.a;
            defpackage.apdp apdpVar2 = svzVar.f;
            aonnVar = svzVar.g;
            phj phjVar = svzVar.e;
            defpackage.aooc.af(obj2);
            apdpVar = apdpVar2;
            obj = phjVar;
        }
        defpackage.aonn aonnVar2 = aonnVar;
        try {
            svu svuVar = new svu(j, this.b.a(obj));
            java.util.Map map = this.h;
            svt svtVar = (svt) map.get(svuVar);
            if (svtVar != null) {
                map.put(svuVar, new svt(defpackage.aoov.am(this.e, 4, new jnq(aonnVar2, svtVar, this, (defpackage.aoln) null, 3), 1), svtVar.b));
            }
            return defpackage.aojh.a;
        } finally {
            apdpVar.d();
        }
    }
}
