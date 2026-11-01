package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agpe implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ agpe(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v28, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v30, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v32, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v34, types: [aonj, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) throws java.lang.Throwable {
        aaum aaumVarR;
        java.lang.String strSubstring;
        switch (this.$cid) {
            case 0:
                return (((agpc) obj).b & 1) != 0 ? ahvr.H(((adag) ((apjb) this.a).b).h(), new aeqw(15), ajbm.a) : aiql.z(ahwt.a);
            case 1:
                java.lang.Object obj2 = this.a;
                ((java.io.IOException) obj2).addSuppressed((java.io.IOException) obj);
                throw ((java.lang.Throwable) obj2);
            case 2:
                return ajan.f(((agoo) ((ucm) this.a).c).d(), new ahye(((android.os.Bundle) obj).getString("authAccount")), ajbm.a);
            case 3:
                agpc agpcVar = (agpc) obj;
                return ((agpcVar.b & 1) == 0 || java.lang.Math.abs(j$.time.Instant.now().toEpochMilli() - agpcVar.c) >= defpackage.agqp.b) ? ajan.f(((defpackage.agqp) this.a).d.a(), ahqx.a(new defpackage.agqd(3)), ajbm.a) : aiql.z(java.lang.Boolean.FALSE);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((java.lang.Boolean) obj).booleanValue() ? ((defpackage.agqp) this.a).b() : aiql.z((java.lang.Object) null);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return a.j((aonj) this.a, obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return a.j((aonj) this.a, obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return a.j((aonj) this.a, obj);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return a.j((aonj) this.a, obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ucm ucmVar = (ucm) obj;
                if (ucmVar == null) {
                    return ajcm.a;
                }
                java.lang.Object obj3 = this.a;
                java.lang.Object obj4 = ucmVar.b;
                try {
                    android.content.Context context = ((defpackage.ahjv) obj3).d.a;
                    java.lang.String str = zwk.a;
                    zwq.e(context, (java.lang.String) obj4, 0L);
                    aaumVarR = aazc.s((java.lang.Object) null);
                } catch (zwj | java.io.IOException e) {
                    aaumVarR = aazc.r(e);
                }
                return aazc.e(aaumVarR);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.util.Map map = (java.util.Map) obj;
                ahlt.a.b().l("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "syncInternal", 317, "SyncManagerImpl.java").y("Running synclets: %s", j$.util.Collection.-EL.stream(map.keySet()).map(new defpackage.adci(12)).toArray());
                if (map.isEmpty()) {
                    return aiql.z(aikn.a);
                }
                java.lang.Object obj5 = this.a;
                final java.util.Set setKeySet = map.keySet();
                ahlt ahltVar = (ahlt) obj5;
                final ahlm ahlmVar = ahltVar.e;
                ajcq ajcqVarF = ahvr.F(new java.util.concurrent.Callable() { // from class: ahlj
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        java.lang.Boolean boolValueOf;
                        akzx akzxVarM;
                        long epochMilli;
                        java.util.HashSet hashSet;
                        java.util.Iterator it;
                        java.util.Collection collection;
                        java.util.Iterator it2;
                        boolean z;
                        ahlm ahlmVar2 = ahlmVar;
                        ahlmVar2.b.writeLock().lock();
                        try {
                            ahmp ahmpVarA = ahmp.a;
                            try {
                                ahmpVarA = ahlmVar2.a();
                                while (true) {
                                    boolean zHasNext = it.hasNext();
                                    collection = setKeySet;
                                    if (!zHasNext) {
                                        break;
                                    }
                                    ahmo ahmoVar = (ahmo) it.next();
                                    ahmr ahmrVar = ahmoVar.c;
                                    if (ahmrVar == null) {
                                        ahmrVar = ahmr.a;
                                    }
                                    if (collection.contains(new ahlv(ahmrVar))) {
                                        ahmr ahmrVar2 = ahmoVar.c;
                                        if (ahmrVar2 == null) {
                                            ahmrVar2 = ahmr.a;
                                        }
                                        hashSet.add(new ahlv(ahmrVar2));
                                        akzx akzxVarP = ahmoVar.p();
                                        akzxVarP.u();
                                        ahmo ahmoVar2 = akzxVarP.b;
                                        ahmoVar2.b |= 4;
                                        ahmoVar2.e = epochMilli;
                                        akzxVarM.ar(akzxVarP.p());
                                    } else {
                                        akzxVarM.ar(ahmoVar);
                                    }
                                }
                                while (true) {
                                    z = false;
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    ahlv ahlvVar = (ahlv) it2.next();
                                    if (!hashSet.contains(ahlvVar)) {
                                        akzx akzxVarM2 = ahmo.a.m();
                                        ahmr ahmrVar3 = ahlvVar.a;
                                        akzxVarM2.u();
                                        ahmo ahmoVar3 = akzxVarM2.b;
                                        j$.util.Objects.requireNonNull(ahmrVar3);
                                        ahmoVar3.c = ahmrVar3;
                                        ahmoVar3.b |= 1;
                                        long j = ahlmVar2.e;
                                        akzxVarM2.u();
                                        ahmo ahmoVar4 = akzxVarM2.b;
                                        ahmoVar4.b |= 2;
                                        ahmoVar4.d = j;
                                        akzxVarM2.u();
                                        ahmo ahmoVar5 = akzxVarM2.b;
                                        ahmoVar5.b |= 4;
                                        ahmoVar5.e = epochMilli;
                                        akzxVarM2.u();
                                        ahmo ahmoVar6 = akzxVarM2.b;
                                        ahmoVar6.b |= 8;
                                        ahmoVar6.f = 0;
                                        akzxVarM.ar(akzxVarM2.p());
                                    }
                                }
                            } catch (java.io.IOException e2) {
                                if (!ahlmVar2.g(e2)) {
                                    ahlm.a.c().k(e2).l("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "prepareForSync", 237, "SyncManagerDataStore.java").v("Error, could not read or clear store. Aborting sync attempt.");
                                    boolValueOf = java.lang.Boolean.FALSE;
                                }
                                ahlmVar2.b.writeLock().unlock();
                                return boolValueOf;
                            }
                            akzxVarM = ahmp.a.m();
                            akzxVarM.z(ahmpVarA);
                            akzxVarM.u();
                            akzxVarM.b.d = albq.a;
                            epochMilli = j$.time.Instant.now().toEpochMilli();
                            hashSet = new java.util.HashSet();
                            it = ahmpVarA.d.iterator();
                            it2 = collection.iterator();
                            if (ahmpVarA.c < 0) {
                                long epochMilli2 = ahlmVar2.e;
                                if (epochMilli2 < 0) {
                                    epochMilli2 = j$.time.Instant.now().toEpochMilli();
                                    ahlmVar2.e = epochMilli2;
                                }
                                akzxVarM.u();
                                ahmp ahmpVar = akzxVarM.b;
                                ahmpVar.b |= 1;
                                ahmpVar.c = epochMilli2;
                            }
                            try {
                                ahlmVar2.f(akzxVarM.p());
                                ahlmVar2.d.set(true);
                                z = true;
                            } catch (java.io.IOException unused) {
                            } catch (java.lang.Throwable th) {
                                ahlmVar2.d.set(true);
                                throw th;
                            }
                            boolValueOf = java.lang.Boolean.valueOf(z);
                            ahlmVar2.b.writeLock().unlock();
                            return boolValueOf;
                        } catch (java.lang.Throwable th2) {
                            ahlmVar2.b.writeLock().unlock();
                            throw th2;
                        }
                    }
                }, ahlmVar.c);
                ajcq ajcqVarH = ahltVar.h(ajcqVarF);
                vto vtoVar = new vto(obj5, ajcqVarF, map, 16);
                ajcu ajcuVar = ahltVar.b;
                ajcq ajcqVarL = ahvr.L(ajcqVarH, vtoVar, ajcuVar);
                j$.util.Objects.requireNonNull(map);
                ajcq ajcqVarK = ahvr.K(ajcqVarL, new agqr(map, 4), ajcuVar);
                ahltVar.d.f(ajcqVarK, "SyncManager: Syncing");
                return ajcqVarK;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                final long jLongValue = ((java.lang.Long) obj).longValue();
                final aca acaVar = new aca();
                final aca acaVar2 = new aca();
                final long epochMilli = j$.time.Instant.now().toEpochMilli();
                java.lang.Object obj6 = this.a;
                final ahlt ahltVar2 = (ahlt) obj6;
                ajcq ajcqVarH2 = ahltVar2.h(ahltVar2.e.b());
                ahyc ahycVar = new ahyc() { // from class: ahln
                    public final java.lang.Object apply(java.lang.Object obj7) {
                        java.util.Map map2;
                        java.util.Iterator it;
                        this = this;
                        ahlt ahltVar3 = ahltVar2;
                        java.lang.Object obj8 = ahltVar3.h;
                        java.util.Map map3 = (java.util.Map) obj7;
                        java.util.Map map4 = acaVar2;
                        synchronized (obj8) {
                            java.util.Iterator it2 = ahltVar3.i.entrySet().iterator();
                            while (true) {
                                boolean zHasNext = it2.hasNext();
                                map2 = acaVar;
                                if (zHasNext) {
                                    java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
                                    ahlv ahlvVar = (ahlv) entry.getKey();
                                    java.util.Map map5 = ahltVar3.j;
                                    if (!map5.containsKey(ahlvVar) && ahltVar3.m()) {
                                        long jMax = java.lang.Math.max(((java.lang.Long) j$.util.Map.-EL.getOrDefault(ahltVar3.k, ahlvVar, -1L)).longValue(), ((java.lang.Long) j$.util.Map.-EL.getOrDefault(map3, ahlvVar, -1L)).longValue());
                                        ahwt ahwtVarH = jMax == -1 ? ahwt.a : ahyn.h(j$.time.Instant.ofEpochMilli(jMax));
                                        if (jMax == -1) {
                                            jMax = jLongValue;
                                        }
                                        ahla ahlaVar = ((ahlv) entry.getKey()).b;
                                        ahkw ahkwVarA = ((ahlc) entry.getValue()).a();
                                        long j = ahkwVarA.a;
                                        long j2 = jMax;
                                        long j3 = epochMilli;
                                        if (j2 + j <= j3) {
                                            java.util.Iterator itK = ahkwVarA.c.e().k();
                                            while (true) {
                                                if (!itK.hasNext()) {
                                                    it = it2;
                                                    ajdd ajddVar = new ajdd();
                                                    map5.put(ahlvVar, ajddVar);
                                                    map2.put(ahlvVar, new defpackage.ahls(ajddVar, ahwtVarH));
                                                    break;
                                                }
                                                java.util.Map.Entry entry2 = (java.util.Map.Entry) itK.next();
                                                it = it2;
                                                java.util.Iterator it3 = itK;
                                                long j4 = ((ahky) entry2.getValue()).b;
                                                long j5 = j3 - j2;
                                                long j6 = j4 + j;
                                                if (j4 == -1 || j5 <= j6) {
                                                    ahkz ahkzVar = (ahkz) entry2.getKey();
                                                    if (!map4.containsKey(ahkzVar)) {
                                                        map4.put(ahkzVar, java.lang.Boolean.valueOf(((defpackage.ahld) ((aoin) ahltVar3.f.get(ahkzVar)).a()).a()));
                                                    }
                                                    if (!((java.lang.Boolean) map4.get(ahkzVar)).booleanValue()) {
                                                        break;
                                                    }
                                                }
                                                it2 = it;
                                                itK = it3;
                                            }
                                        } else {
                                            it = it2;
                                        }
                                        it2 = it;
                                    }
                                }
                            }
                        }
                        return map2;
                    }
                };
                ajcu ajcuVar2 = ahltVar2.b;
                return ahvr.I(ahvr.H(ajcqVarH2, ahycVar, ajcuVar2), new defpackage.agpe(obj6, 10), ajcuVar2);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                final defpackage.akxm akxmVar = (defpackage.akxm) obj;
                androidx.work.WorkerParameters workerParameters = (androidx.work.WorkerParameters) this.a;
                grp grpVar = workerParameters.b;
                if (!akxmVar.b() || !grpVar.d().containsKey("scheduled_execution_time_epoch_millis") || !grpVar.d().containsKey("worker_enqueue_time_epoch_millis")) {
                    return ajcm.a;
                }
                final long jB = grpVar.b("scheduled_execution_time_epoch_millis", 0L);
                final long jB2 = grpVar.b("worker_enqueue_time_epoch_millis", 0L);
                final long epochMilli2 = j$.time.Instant.now().toEpochMilli();
                for (java.lang.String str2 : workerParameters.c) {
                    if (str2.startsWith("sync_constraint:")) {
                        strSubstring = str2.substring(16);
                        final java.lang.String str3 = strSubstring;
                        return ajan.f(((defpackage.ahid) ((ahys) akxmVar.c).a).a(), ahqx.a(new ahyc() { // from class: ahmn
                            /* JADX WARN: Type inference failed for: r5v0, types: [ahzi, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r8v2, types: [aoin, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r9v2, types: [ahzi, java.lang.Object] */
                            public final java.lang.Object apply(java.lang.Object obj7) {
                                if (!((java.lang.Boolean) obj7).booleanValue()) {
                                    return null;
                                }
                                long j = epochMilli2;
                                java.lang.String str4 = str3;
                                long j2 = jB2;
                                long j3 = jB;
                                defpackage.akxm akxmVar2 = akxmVar;
                                ?? r8 = ((ahys) akxmVar2.d).a;
                                defpackage.ahiy ahiyVar = (defpackage.ahiy) r8.a();
                                double dA = aizo.a(j$.time.Duration.ofMillis(j3 - j2));
                                aogc aogcVar = (aogc) akxmVar2.e;
                                java.lang.Object obj8 = aogcVar.b;
                                ((afim) ahiyVar.h.eZ()).b(dA, new java.lang.Object[]{obj8, aogcVar.p(), "PERIODIC".toLowerCase(java.util.Locale.US), str4});
                                defpackage.ahiy ahiyVar2 = (defpackage.ahiy) r8.a();
                                ((afim) ahiyVar2.i.eZ()).b(aizo.a(j$.time.Duration.ofMillis(j - j2)), new java.lang.Object[]{obj8, aogcVar.p(), "PERIODIC".toLowerCase(java.util.Locale.US), str4});
                                return null;
                            }
                        }), (java.util.concurrent.Executor) akxmVar.a);
                    }
                }
                strSubstring = "none";
                final java.lang.String str4 = strSubstring;
                return ajan.f(((defpackage.ahid) ((ahys) akxmVar.c).a).a(), ahqx.a(new ahyc() { // from class: ahmn
                    /* JADX WARN: Type inference failed for: r5v0, types: [ahzi, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r8v2, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r9v2, types: [ahzi, java.lang.Object] */
                    public final java.lang.Object apply(java.lang.Object obj7) {
                        if (!((java.lang.Boolean) obj7).booleanValue()) {
                            return null;
                        }
                        long j = epochMilli2;
                        java.lang.String str5 = str4;
                        long j2 = jB2;
                        long j3 = jB;
                        defpackage.akxm akxmVar2 = akxmVar;
                        ?? r8 = ((ahys) akxmVar2.d).a;
                        defpackage.ahiy ahiyVar = (defpackage.ahiy) r8.a();
                        double dA = aizo.a(j$.time.Duration.ofMillis(j3 - j2));
                        aogc aogcVar = (aogc) akxmVar2.e;
                        java.lang.Object obj8 = aogcVar.b;
                        ((afim) ahiyVar.h.eZ()).b(dA, new java.lang.Object[]{obj8, aogcVar.p(), "PERIODIC".toLowerCase(java.util.Locale.US), str5});
                        defpackage.ahiy ahiyVar2 = (defpackage.ahiy) r8.a();
                        ((afim) ahiyVar2.i.eZ()).b(aizo.a(j$.time.Duration.ofMillis(j - j2)), new java.lang.Object[]{obj8, aogcVar.p(), "PERIODIC".toLowerCase(java.util.Locale.US), str5});
                        return null;
                    }
                }), (java.util.concurrent.Executor) akxmVar.a);
            default:
                defpackage.ajzm ajzmVar = (defpackage.ajzm) obj;
                java.lang.String scheme = android.net.Uri.parse(ajzmVar.a).getScheme();
                if (!ajzmVar.b && !ahvr.r(scheme, "https")) {
                    ajzh.a.c().l("com/google/frameworks/client/data/android/HttpClientImpl", "makeRequest", 85, "HttpClientImpl.java").v("Making plaintext http request");
                }
                java.lang.Object obj7 = this.a;
                ajbm ajbmVar = ajbm.a;
                return ajan.g(aiql.E(((ajzh) obj7).d, ajbmVar), ahqx.c(new defpackage.ahju(obj7, ajzmVar, 6)), ajbmVar);
        }
    }
}
