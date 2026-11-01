package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahlt implements defpackage.ahli {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/apps/tiktok/sync/impl/SyncManagerImpl");
    public final defpackage.ajcu b;
    public final defpackage.ajct c;
    public final defpackage.agsm d;
    public final defpackage.ahlm e;
    public final java.util.Map f;
    public final defpackage.ajcq g;
    public final java.lang.Object h = new java.lang.Object();
    public final defpackage.aca i;
    public final java.util.Map j;
    public final java.util.Map k;
    private final android.content.Context l;
    private final defpackage.ahyn m;
    private final boolean n;
    private final defpackage.ahlx o;
    private final java.util.concurrent.atomic.AtomicReference p;
    private final defpackage.ahmk q;
    private final defpackage.adag r;

    public ahlt(android.content.Context context, defpackage.ajcu ajcuVar, defpackage.ajct ajctVar, defpackage.adag adagVar, defpackage.agsm agsmVar, defpackage.ahyn ahynVar, defpackage.ahyn ahynVar2, defpackage.ahlm ahlmVar, java.util.Map map, java.util.Map map2, java.util.Map map3, defpackage.ahmk ahmkVar, defpackage.ahlx ahlxVar) {
        defpackage.aca acaVar = new defpackage.aca();
        this.i = acaVar;
        this.j = new defpackage.aca();
        this.k = new defpackage.aca();
        this.p = new java.util.concurrent.atomic.AtomicReference();
        this.l = context;
        this.b = ajcuVar;
        this.c = ajctVar;
        this.r = adagVar;
        this.d = agsmVar;
        this.m = ahynVar;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.n = ((java.lang.Boolean) ((defpackage.ahys) ahynVar2).a).booleanValue();
        this.e = ahlmVar;
        this.f = map3;
        this.q = ahmkVar;
        bool.booleanValue();
        defpackage.ahvr.bZ(map2.isEmpty(), "SyncletBindings cannot be bound outside of account scope without @ApplicationSynclet.");
        this.g = ahlmVar.c();
        java.util.HashMap map4 = new java.util.HashMap();
        defpackage.ailj it = ((defpackage.aikg) ((defpackage.aikj) map).entrySet()).iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            defpackage.ahla ahlaVarA = defpackage.ahla.a((java.lang.String) entry.getKey());
            defpackage.akzx akzxVarM = defpackage.ahmr.a.m();
            defpackage.ahmq ahmqVar = ahlaVarA.a;
            akzxVarM.u();
            defpackage.ahmr ahmrVar = (defpackage.ahmr) akzxVarM.b;
            j$.util.Objects.requireNonNull(ahmqVar);
            ahmrVar.c = ahmqVar;
            ahmrVar.b |= 1;
            p(new defpackage.ahlv((defpackage.ahmr) akzxVarM.r()), entry, map4);
        }
        acaVar.putAll(map4);
        this.o = ahlxVar;
        java.lang.String strAp = defpackage.agab.ap();
        int iIndexOf = strAp.indexOf(58);
        if (iIndexOf != -1) {
            strAp.substring(iIndexOf + 1);
        }
    }

    public static /* synthetic */ void j(defpackage.ajcq ajcqVar) {
        try {
            defpackage.aiql.H(ajcqVar);
        } catch (java.util.concurrent.CancellationException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).k(e)).l("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "finishScheduleListener", (char) 698, "SyncManagerImpl.java")).v("The sync scheduling future was cancelled. This should never happen.");
        } catch (java.util.concurrent.ExecutionException e2) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).k(e2)).l("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "finishScheduleListener", (char) 696, "SyncManagerImpl.java")).v("Error scheduling next sync wakeup");
        }
    }

    public static /* synthetic */ void k(defpackage.ajcq ajcqVar) {
        try {
            defpackage.aiql.H(ajcqVar);
        } catch (java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException e) {
            boolean z = e.getCause() instanceof java.util.concurrent.TimeoutException;
            defpackage.aimz aimzVar = a;
            if (z) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.d()).k(e)).l("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", (char) 799, "SyncManagerImpl.java")).v("Timeout updating accounts in sync. Some accounts may not sync correctly.");
            } else {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.c()).k(e)).l("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", (char) 803, "SyncManagerImpl.java")).v("Updating sync accounts failed. Some accounts may not sync correctly.");
            }
        }
    }

    private final defpackage.ajcq n() {
        return defpackage.ahvr.H(((defpackage.adag) ((defpackage.ahys) this.m).a).i(), new defpackage.agqh(6), this.b);
    }

    private final defpackage.ajcq o() {
        defpackage.ajdd ajddVar = new defpackage.ajdd();
        java.util.concurrent.atomic.AtomicReference atomicReference = this.p;
        if (defpackage.anty.aq(atomicReference, ajddVar)) {
            ajddVar.q(defpackage.ahvr.H(n(), new defpackage.ahbx(this, 10), this.b));
        }
        return defpackage.aiql.A((defpackage.ajcq) atomicReference.get());
    }

    private static final void p(defpackage.ahlv ahlvVar, java.util.Map.Entry entry, java.util.Map map) {
        try {
            defpackage.ahlc ahlcVar = (defpackage.ahlc) ((defpackage.aoin) entry.getValue()).a();
            if (ahlcVar.b) {
                map.put(ahlvVar, ahlcVar);
            }
        } catch (java.lang.RuntimeException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).k(e)).l("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "safePutBindingEntry", 915, "SyncManagerImpl.java")).y("Error accessing SyncletBinding for key %s. Its Synclet will be skipped", new defpackage.akct(defpackage.akcs.a, entry.getKey()));
        }
    }

    @Override // defpackage.ahli
    public final defpackage.ajcq a() {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "poke", 600, "SyncManagerImpl.java")).v("#poke(). Scheduling workers.");
        return this.q.a(f(defpackage.aiql.z(defpackage.aikn.a)), new defpackage.uqd(13));
    }

    @Override // defpackage.ahli
    public final defpackage.ajcq b() {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "sync", 200, "SyncManagerImpl.java")).v("#sync(). Running Synclets and scheduling next sync.");
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        defpackage.ahlm ahlmVar = this.e;
        defpackage.ajcq ajcqVarA = this.q.a(defpackage.ahvr.L(ahlmVar.c.submit(defpackage.ahqx.i(new xbd(ahlmVar, epochMilli, 2))), new adbi(this, 20), this.b), new agvj(4));
        ajcqVarA.c(new ahlo(0), defpackage.ajbm.INSTANCE);
        return ajcqVarA;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x014d */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ defpackage.ajcq c(defpackage.ajcq r18, java.util.Map r19) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahlt.c(ajcq, java.util.Map):ajcq");
    }

    public final /* synthetic */ defpackage.ajcq d(defpackage.ajcq ajcqVar, defpackage.ahlv ahlvVar) {
        boolean z = false;
        try {
            defpackage.aiql.H(ajcqVar);
            z = true;
        } catch (java.util.concurrent.CancellationException unused) {
        } catch (java.util.concurrent.ExecutionException e) {
            if (e.getCause() instanceof java.util.concurrent.TimeoutException) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e)).l("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "writeResultToDatabase", 484, "SyncManagerImpl.java")).y("Sync cancelled from timeout and will be retried later: %s", ahlvVar.b.b());
            }
        }
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        return defpackage.ahvr.K(this.e.d(ahlvVar, epochMilli, z), new ahlp(epochMilli), this.b);
    }

    public final defpackage.ajcq e() {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", 739, "SyncManagerImpl.java")).v("onAccountsChanged: Checking and maybe rescheduling synclet bindings");
        defpackage.ajcq ajcqVarH = h(n());
        defpackage.ahlm ahlmVar = this.e;
        defpackage.ajcq ajcqVarSubmit = ahlmVar.c.submit(defpackage.ahqx.i(new agqr(ahlmVar, 3)));
        defpackage.ahda ahdaVarAk = defpackage.ahvr.ak(ajcqVarH, ajcqVarSubmit);
        defpackage.vto vtoVar = new defpackage.vto(this, ajcqVarH, ajcqVarSubmit, 19);
        defpackage.ajcu ajcuVar = this.b;
        defpackage.ajcq ajcqVarP = ahdaVarAk.p(vtoVar, ajcuVar);
        if (!this.n) {
            this.p.set(ajcqVarP);
        }
        defpackage.ajcq ajcqVarG = defpackage.aiql.G(ajcqVarP, 10L, java.util.concurrent.TimeUnit.SECONDS, ajcuVar);
        defpackage.ajcr ajcrVar = new defpackage.ajcr(defpackage.ahqx.h(new agdr(ajcqVarG, 18)));
        ajcqVarG.c(ajcrVar, defpackage.ajbm.INSTANCE);
        return ajcrVar;
    }

    public final defpackage.ajcq f(defpackage.ajcq ajcqVar) {
        if (this.n) {
            return defpackage.aiql.Z(ajcqVar, defpackage.aiql.A(defpackage.aiql.Z(ajcqVar, this.g, o()).c(defpackage.ahqx.b(new adck(this, ajcqVar, 18, (byte[]) null)), this.c))).b(defpackage.ahqx.i(new defpackage.aczf(13)), defpackage.ajbm.INSTANCE);
        }
        defpackage.ajcq ajcqVar2 = this.g;
        defpackage.adpx adpxVar = new defpackage.adpx(this, ajcqVar, 11);
        defpackage.ajcu ajcuVar = this.b;
        defpackage.ajcq ajcqVarA = defpackage.aiql.A(defpackage.ahvr.I(ajcqVar2, adpxVar, ajcuVar));
        this.d.f(ajcqVarA, "SyncManager: Scheduling in parallel");
        ajcqVarA.c(new defpackage.ahjn(ajcqVarA, 4), ajcuVar);
        return defpackage.ajan.f(ajcqVar, defpackage.ahqx.a(new defpackage.agqh(7)), defpackage.ajbm.INSTANCE);
    }

    public final defpackage.ajcq g(defpackage.ajcq ajcqVar, final long j) {
        final java.util.Set set;
        final java.util.HashMap map;
        defpackage.ajcq ajcqVarG;
        defpackage.aikn aiknVar = defpackage.aikn.a;
        try {
            set = (java.util.Set) defpackage.aiql.H(ajcqVar);
        } catch (java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e)).l("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "scheduleNextSyncInner", (char) 681, "SyncManagerImpl.java")).v("Unable to determine attempted syncs. They will not be used to schedule the next sync.");
            set = aiknVar;
        }
        synchronized (this.h) {
            map = new java.util.HashMap(this.i);
        }
        j$.util.Collection.-EL.removeIf(map.entrySet(), new defpackage.tcw(this, 12));
        defpackage.ahlx ahlxVar = this.o;
        defpackage.ahme ahmeVar = (defpackage.ahme) ahlxVar;
        if (ahmeVar.d.booleanValue()) {
            ((defpackage.aimw) ((defpackage.aimw) defpackage.ahme.a.b()).l("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler", "scheduleNextSyncSystemWakeup", 105, "SyncWorkManagerPeriodicScheduler.java")).v("Scheduling next periodic WorkManager workers");
            final defpackage.ahlz ahlzVar = ahmeVar.b;
            ajcqVarG = defpackage.ajan.g(defpackage.ajan.f(ahlzVar.a.b(), defpackage.ahqx.a(new defpackage.ahyc() { // from class: ahly
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [aoin, java.lang.Object] */
                @Override // defpackage.ahyc
                public final java.lang.Object apply(java.lang.Object obj) {
                    defpackage.ahlz ahlzVar2;
                    int i;
                    long j2;
                    long jLongValue;
                    long j3;
                    defpackage.ahly ahlyVar = this;
                    java.util.Map map2 = (java.util.Map) obj;
                    java.util.ArrayList<defpackage.ahlw> arrayList = new java.util.ArrayList();
                    long epochMilli = j$.time.Instant.now().toEpochMilli();
                    java.util.Iterator it = map.entrySet().iterator();
                    while (true) {
                        ahlzVar2 = ahlzVar;
                        if (!it.hasNext()) {
                            break;
                        }
                        java.util.Set set2 = set;
                        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                        defpackage.ahlv ahlvVar = (defpackage.ahlv) entry.getKey();
                        defpackage.ahkw ahkwVarA = ((defpackage.ahlc) entry.getValue()).a();
                        java.lang.Long l = (java.lang.Long) map2.get(ahlvVar);
                        if (set2.contains(ahlvVar)) {
                            jLongValue = epochMilli;
                        } else {
                            jLongValue = j;
                            if (l != null) {
                                jLongValue = l.longValue();
                            }
                        }
                        defpackage.aihb aihbVar = new defpackage.aihb();
                        long j4 = ahkwVarA.a;
                        double d = ahlzVar2.c;
                        java.util.Map map3 = ahkwVarA.c;
                        defpackage.ahyn ahynVarH = defpackage.ahwt.a;
                        defpackage.ailk ailkVarListIterator = ((defpackage.aify) ((defpackage.aikj) map3).values()).listIterator(0);
                        java.util.Map map4 = map2;
                        while (true) {
                            j3 = (long) (j4 * d);
                            if (ailkVarListIterator.hasNext()) {
                                defpackage.ahky ahkyVar = (defpackage.ahky) ailkVarListIterator.next();
                                long j5 = ahkyVar.b;
                                if (j5 != -1) {
                                    long j6 = j5 + jLongValue + j3;
                                    if (epochMilli <= j6) {
                                        ahynVarH = !ahynVarH.f() ? defpackage.ahyn.h(java.lang.Long.valueOf(j6)) : defpackage.ahyn.h(java.lang.Long.valueOf(java.lang.Math.min(((java.lang.Long) ahynVarH.b()).longValue(), j6)));
                                        aihbVar.c(ahkyVar.a);
                                    } else {
                                        it = it;
                                        ailkVarListIterator = ailkVarListIterator;
                                    }
                                } else {
                                    it = it;
                                    ailkVarListIterator = ailkVarListIterator;
                                    aihbVar.c(ahkyVar.a);
                                }
                                it = it;
                                ailkVarListIterator = ailkVarListIterator;
                            }
                        }
                        java.util.Iterator it2 = it;
                        java.util.HashSet hashSet = new java.util.HashSet();
                        hashSet.addAll(aihbVar.g());
                        arrayList.add(new defpackage.ahlw(hashSet, j3 + jLongValue, ahynVarH));
                        ahlyVar = this;
                        map2 = map4;
                        it = it2;
                    }
                    int i2 = 0;
                    while (true) {
                        j2 = 900000;
                        if (i2 >= arrayList.size()) {
                            break;
                        }
                        defpackage.ahlw ahlwVar = (defpackage.ahlw) arrayList.get(i2);
                        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MINUTES;
                        long j7 = ahlwVar.b;
                        long j8 = 900000 + epochMilli;
                        if (j7 < j8) {
                            long jMax = java.lang.Math.max(epochMilli, j7);
                            java.util.HashSet hashSet2 = new java.util.HashSet();
                            defpackage.ahyn ahynVarH2 = defpackage.ahwt.a;
                            hashSet2.addAll(ahlwVar.a);
                            defpackage.ahyn ahynVar = ahlwVar.c;
                            if (ahynVar.f()) {
                                long j9 = j8 - jMax;
                                defpackage.ahvr.bY(j9 > 0);
                                defpackage.ahvr.bY(j9 <= 900000);
                                ahynVarH2 = defpackage.ahyn.h(java.lang.Long.valueOf(((java.lang.Long) ahynVar.b()).longValue() + j9));
                            }
                            arrayList.set(i2, new defpackage.ahlw(hashSet2, j8, ahynVarH2));
                        }
                        i2++;
                    }
                    long jAbs = java.lang.Math.abs(((java.security.SecureRandom) ahlzVar2.d.a.a()).nextLong());
                    java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.MILLISECONDS;
                    if (defpackage.afdp.a.a(defpackage.ahmb.a)) {
                        java.util.concurrent.TimeUnit timeUnit4 = java.util.concurrent.TimeUnit.SECONDS;
                        j2 = 5000;
                    } else {
                        java.util.concurrent.TimeUnit timeUnit5 = java.util.concurrent.TimeUnit.MINUTES;
                    }
                    long j10 = jAbs % j2;
                    for (i = 0; i < arrayList.size(); i++) {
                        defpackage.ahlw ahlwVar2 = (defpackage.ahlw) arrayList.get(i);
                        java.util.HashSet hashSet3 = new java.util.HashSet();
                        defpackage.ahyn ahynVarH3 = defpackage.ahwt.a;
                        hashSet3.addAll(ahlwVar2.a);
                        long j11 = ahlwVar2.b + j10;
                        defpackage.ahyn ahynVar2 = ahlwVar2.c;
                        if (ahynVar2.f()) {
                            ahynVarH3 = defpackage.ahyn.h(java.lang.Long.valueOf(((java.lang.Long) ahynVar2.b()).longValue() + j10));
                        }
                        arrayList.set(i, new defpackage.ahlw(hashSet3, j11, ahynVarH3));
                    }
                    defpackage.aca acaVar = new defpackage.aca();
                    for (defpackage.ahlw ahlwVar3 : arrayList) {
                        java.util.Set set3 = ahlwVar3.a;
                        defpackage.ahlw ahlwVar4 = (defpackage.ahlw) acaVar.get(set3);
                        if (ahlwVar4 == null) {
                            acaVar.put(set3, ahlwVar3);
                        } else {
                            acaVar.put(set3, defpackage.ahlw.a(ahlwVar4, ahlwVar3));
                        }
                    }
                    defpackage.ahyn ahynVarH4 = defpackage.ahwt.a;
                    java.util.Iterator it3 = acaVar.values().iterator();
                    while (it3.hasNext()) {
                        defpackage.ahyn ahynVar3 = ((defpackage.ahlw) it3.next()).c;
                        if (ahynVar3.f()) {
                            ahynVarH4 = ahynVarH4.f() ? defpackage.ahyn.h(java.lang.Long.valueOf(java.lang.Math.min(((java.lang.Long) ahynVarH4.b()).longValue(), ((java.lang.Long) ahynVar3.b()).longValue()))) : ahynVar3;
                        }
                    }
                    if (!ahynVarH4.f()) {
                        return acaVar;
                    }
                    java.util.HashMap map5 = new java.util.HashMap(acaVar);
                    defpackage.aikn aiknVar2 = defpackage.aikn.a;
                    java.util.HashSet hashSet4 = new java.util.HashSet();
                    long jLongValue2 = ((java.lang.Long) ahynVarH4.b()).longValue();
                    hashSet4.addAll(aiknVar2);
                    defpackage.ahlw ahlwVar5 = new defpackage.ahlw(hashSet4, jLongValue2, ahynVarH4);
                    defpackage.ahlw ahlwVar6 = (defpackage.ahlw) map5.get(aiknVar2);
                    if (ahlwVar6 == null) {
                        map5.put(aiknVar2, ahlwVar5);
                    } else {
                        map5.put(aiknVar2, defpackage.ahlw.a(ahlwVar6, ahlwVar5));
                    }
                    return j$.util.DesugarCollections.unmodifiableMap(map5);
                }
            }), ahlzVar.b), defpackage.ahqx.c(new defpackage.ahmd(ahlxVar, 0)), ahmeVar.c);
        } else {
            ajcqVarG = defpackage.ajcm.a;
        }
        return defpackage.ahvr.I(ajcqVarG, new defpackage.adpx(this, map, 10), defpackage.ajbm.INSTANCE);
    }

    public final defpackage.ajcq h(defpackage.ajcq ajcqVar) {
        return defpackage.ahvr.I(o(), new defpackage.ahmd(ajcqVar, 1), defpackage.ajbm.INSTANCE);
    }

    public final void i(java.util.Set set) {
        synchronized (this.h) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                com.google.apps.tiktok.account.AccountId accountId = (com.google.apps.tiktok.account.AccountId) it.next();
                defpackage.aca acaVar = this.i;
                java.util.HashMap map = new java.util.HashMap();
                defpackage.ailj it2 = ((defpackage.aikg) ((defpackage.aikj) ((ahlq) defpackage.afsq.S(this.l, ahlq.class, accountId)).w()).entrySet()).iterator();
                while (it2.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
                    defpackage.ahla ahlaVarA = defpackage.ahla.a((java.lang.String) entry.getKey());
                    int iA = accountId.a();
                    defpackage.akzx akzxVarM = defpackage.ahmr.a.m();
                    defpackage.ahmq ahmqVar = ahlaVarA.a;
                    akzxVarM.u();
                    defpackage.ahmr ahmrVar = (defpackage.ahmr) akzxVarM.b;
                    j$.util.Objects.requireNonNull(ahmqVar);
                    ahmrVar.c = ahmqVar;
                    ahmrVar.b |= 1;
                    akzxVarM.u();
                    defpackage.ahmr ahmrVar2 = (defpackage.ahmr) akzxVarM.b;
                    ahmrVar2.b |= 2;
                    ahmrVar2.d = iA;
                    p(new defpackage.ahlv((defpackage.ahmr) akzxVarM.r()), entry, map);
                }
                acaVar.putAll(map);
            }
        }
    }

    public final /* synthetic */ void l(defpackage.ahlv ahlvVar, defpackage.ajcq ajcqVar) {
        synchronized (this.h) {
            try {
                this.k.put(ahlvVar, (java.lang.Long) defpackage.aiql.H(ajcqVar));
            } catch (java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException unused) {
            }
        }
    }

    public final boolean m() {
        return this.r.r();
    }
}
