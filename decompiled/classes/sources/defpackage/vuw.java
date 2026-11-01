package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class vuw implements defpackage.ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ vuw(defpackage.agvg agvgVar, defpackage.ahoq ahoqVar, androidx.work.WorkerParameters workerParameters, int i) {
        this.$cid = i;
        this.b = agvgVar;
        this.a = ahoqVar;
        this.c = workerParameters;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x02cf A[Catch: all -> 0x032e, LOOP:2: B:70:0x02c9->B:72:0x02cf, LOOP_END, TryCatch #2 {all -> 0x032e, blocks: (B:69:0x02c1, B:70:0x02c9, B:72:0x02cf, B:73:0x02de, B:74:0x02e2, B:67:0x02b2, B:64:0x029f, B:66:0x02ab, B:84:0x032a, B:68:0x02b9), top: B:104:0x01ed }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0307  */
    /* JADX WARN: Code duplicated, block: B:79:0x0309  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [ajcq] */
    /* JADX WARN: Type inference failed for: r0v37, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v55, types: [ahlt] */
    /* JADX WARN: Type inference failed for: r0v57, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [adlt] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v55, types: [ahmi] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v4, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v20, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ajas
    public final defpackage.ajcq a() throws java.lang.Throwable {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.util.List listUnmodifiableList;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.util.Iterator it;
        java.lang.Object obj5;
        int i = 0;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj6 = this.b;
                java.lang.Object obj7 = this.a;
                defpackage.vva vvaVar = (defpackage.vva) obj7;
                defpackage.ajcq ajcqVarN = vvaVar.n((defpackage.rsr) obj6);
                defpackage.kvf kvfVar = new defpackage.kvf(12);
                long j = defpackage.ahqx.a;
                defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), kvfVar);
                defpackage.ajcu ajcuVar = vvaVar.g;
                int i2 = defpackage.ajan.c;
                defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarN, ahqvVar);
                ajcqVarN.c(ajamVar, defpackage.aiql.t(ajcuVar, ajamVar));
                return defpackage.ahrv.g(ajamVar).i(new defpackage.kjs(obj7, this.c, 17), ajcuVar).i(new defpackage.vmn(obj7, 3), ajcuVar);
            case 1:
                ?? r2 = this.b;
                defpackage.ahvr.cc(r2.isDone(), "Future was expected to be done: %s", r2);
                boolean zBooleanValue = ((java.lang.Boolean) defpackage.a.h(r2)).booleanValue();
                ?? r3 = this.a;
                if (zBooleanValue) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.vav.a.b()).l("com/android/dialer/voicemail/notification/impl/VoicemailNotifierImpl", "getAllNewVoicemailsToNotify", 301, "VoicemailNotifierImpl.java")).v("not filtering due to recent emergency call");
                    return r3;
                }
                java.lang.Object obj8 = this.c;
                defpackage.ahrv ahrvVarG = defpackage.ahrv.g(r3);
                defpackage.jwf jwfVar = new defpackage.jwf(obj8, 18);
                defpackage.ajct ajctVar = ((defpackage.vav) obj8).e;
                return ahrvVarG.i(jwfVar, ajctVar).i(new defpackage.jwf(obj8, 19), ajctVar);
            case 2:
                java.lang.Object obj9 = this.b;
                java.lang.Object obj10 = this.a;
                try {
                    java.lang.Object obj11 = ((defpackage.ahct) this.c).f;
                    defpackage.adme admeVar = defpackage.adme.POST_SYNC_GC;
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    try {
                        try {
                            synchronized (((defpackage.adjz) obj11).b) {
                                try {
                                    long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                                    defpackage.adkh adkhVar = (defpackage.adkh) ((defpackage.adjz) obj11).c.get(obj10);
                                    if (adkhVar != null) {
                                        if (adkhVar.c) {
                                            listUnmodifiableList = java.util.Collections.EMPTY_LIST;
                                        } else {
                                            java.util.List listD = defpackage.adhk.d(((defpackage.adjz) obj11).g((java.lang.String) obj10));
                                            java.util.ArrayList arrayList = new java.util.ArrayList(listD.size());
                                            java.util.Iterator it2 = listD.iterator();
                                            while (it2.hasNext()) {
                                                java.lang.String name = ((java.io.File) it2.next()).getName();
                                                int i3 = defpackage.adhw.c;
                                                arrayList.add(new defpackage.adhb((java.lang.String) obj10, name));
                                            }
                                            defpackage.adgy adgyVar = ((defpackage.adjz) obj11).f;
                                            defpackage.adgj adgjVar = adgyVar.d((java.lang.String) obj10).c;
                                            defpackage.aikn aiknVar = defpackage.aikn.a;
                                            java.util.LinkedList linkedList = new java.util.LinkedList();
                                            int size = arrayList.size();
                                            while (i < size) {
                                                defpackage.adhw adhwVar = (defpackage.adhw) arrayList.get(i);
                                                if (aiknVar.contains(adhwVar)) {
                                                    linkedList.add(adhwVar);
                                                    obj3 = obj11;
                                                    obj4 = obj9;
                                                } else {
                                                    obj3 = obj11;
                                                    obj4 = obj9;
                                                    if (!((defpackage.adjz) obj3).g.b(((defpackage.adjz) obj3).f(adhwVar))) {
                                                        adgyVar.g(adhwVar.b());
                                                    }
                                                }
                                                i++;
                                                obj11 = obj3;
                                                obj9 = obj4;
                                            }
                                            obj2 = obj11;
                                            obj = obj9;
                                            listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(linkedList);
                                        }
                                        long jCurrentTimeMillis3 = java.lang.System.currentTimeMillis();
                                        it = listUnmodifiableList.iterator();
                                        while (it.hasNext()) {
                                            ((defpackage.adjz) obj2).o((defpackage.adhw) it.next(), admeVar, true);
                                        }
                                        long jCurrentTimeMillis4 = java.lang.System.currentTimeMillis();
                                        long j2 = jCurrentTimeMillis4 - jCurrentTimeMillis;
                                        long j3 = jCurrentTimeMillis2 - jCurrentTimeMillis;
                                        long j4 = jCurrentTimeMillis3 - jCurrentTimeMillis2;
                                        long j5 = jCurrentTimeMillis4 - jCurrentTimeMillis3;
                                        defpackage.aiob aiobVar = (defpackage.aiob) defpackage.adhn.a.a(java.util.logging.Level.INFO).l("com/google/android/libraries/micore/superpacks/gc/GcUtil", "logGcPerformance", 217, "GcUtil.java");
                                        if (obj10 != null) {
                                            obj5 = obj10;
                                        } else {
                                            obj5 = "global";
                                        }
                                        aiobVar.Q("GC for '%s' (%s) with ttl of %d ms took %d ms (%d/%d/%d)", obj5, admeVar, 0L, java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3), java.lang.Long.valueOf(j4), java.lang.Long.valueOf(j5));
                                        return obj;
                                    }
                                    ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.d()).l("com/google/android/libraries/micore/superpacks/gc/FileManager", "findGcCandidates", 971, "FileManager.java")).y("Skipping unregistered directory found during GC: %s", obj10);
                                    listUnmodifiableList = java.util.Collections.EMPTY_LIST;
                                    obj2 = obj11;
                                    obj = obj9;
                                    long jCurrentTimeMillis5 = java.lang.System.currentTimeMillis();
                                    it = listUnmodifiableList.iterator();
                                    while (it.hasNext()) {
                                        ((defpackage.adjz) obj2).o((defpackage.adhw) it.next(), admeVar, true);
                                    }
                                    long jCurrentTimeMillis6 = java.lang.System.currentTimeMillis();
                                    long j6 = jCurrentTimeMillis6 - jCurrentTimeMillis;
                                    long j7 = jCurrentTimeMillis2 - jCurrentTimeMillis;
                                    long j8 = jCurrentTimeMillis5 - jCurrentTimeMillis2;
                                    long j9 = jCurrentTimeMillis6 - jCurrentTimeMillis5;
                                    defpackage.aiob aiobVar2 = (defpackage.aiob) defpackage.adhn.a.a(java.util.logging.Level.INFO).l("com/google/android/libraries/micore/superpacks/gc/GcUtil", "logGcPerformance", 217, "GcUtil.java");
                                    if (obj10 != null) {
                                        obj5 = obj10;
                                    } else {
                                        obj5 = "global";
                                    }
                                    aiobVar2.Q("GC for '%s' (%s) with ttl of %d ms took %d ms (%d/%d/%d)", obj5, admeVar, 0L, java.lang.Long.valueOf(j6), java.lang.Long.valueOf(j7), java.lang.Long.valueOf(j8), java.lang.Long.valueOf(j9));
                                    return obj;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                        }
                    } catch (java.io.IOException e) {
                        e = e;
                        ((defpackage.aiob) ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.d()).k(e)).l("com/google/android/libraries/micore/superpacks/Superpacks", "applyPostSyncGcBehavior", 1615, "Superpacks.java")).y("Error occurred during post-sync garbage collection on superpack: %s", obj10);
                    }
                } catch (java.io.IOException e2) {
                    e = e2;
                    obj = obj9;
                }
                break;
            case 3:
                ((defpackage.gat) this.b).a.remove(this.c);
                return this.a;
            case 4:
                ?? r1 = (defpackage.adlt) this.c;
                ?? r4 = r1.h;
                java.lang.Object obj12 = this.b;
                defpackage.adlx adlxVar = (defpackage.adlx) r4.remove(obj12);
                if (adlxVar != null) {
                    adlxVar.a();
                    defpackage.aiof aiofVar = defpackage.adhn.a;
                }
                return r1.a((java.lang.String) obj12, java.util.Collections.EMPTY_SET, this.a);
            case 5:
                java.lang.Object objH = defpackage.aiql.H(this.b);
                defpackage.aooh.e(objH, "getDone(...)");
                final defpackage.aify aifyVar = (defpackage.aify) objH;
                java.lang.Object objH2 = defpackage.aiql.H(this.a);
                defpackage.aooh.e(objH2, "getDone(...)");
                final java.util.Map map = (java.util.Map) objH2;
                defpackage.aimz aimzVar = defpackage.agpt.a;
                ((defpackage.aimw) aimzVar.b().l("com/google/apps/tiktok/account/data/google/GmsAccounts", "createAccountInfos", 137, "GmsAccounts.kt")).w("GMSCore Auth returned %d accounts.", map.size());
                ((defpackage.aimw) aimzVar.b().l("com/google/apps/tiktok/account/data/google/GmsAccounts", "createAccountInfos", 138, "GmsAccounts.kt")).w("GoogleOwnersProvider returned %d accounts.", aifyVar.size());
                if (aifyVar.size() < map.size()) {
                    ((defpackage.aimw) aimzVar.d().l("com/google/apps/tiktok/account/data/google/GmsAccounts", "createAccountInfos", 140, "GmsAccounts.kt")).v("GoogleOwnersProvider did not return all accounts.");
                }
                final java.util.Map mapAT = defpackage.ajsz.aT(map);
                final defpackage.aca acaVar = new defpackage.aca(map.size());
                defpackage.ailk ailkVarListIterator = aifyVar.listIterator(0);
                defpackage.aooh.e(ailkVarListIterator, "iterator(...)");
                while (true) {
                    java.lang.Object obj13 = this.c;
                    if (!ailkVarListIterator.hasNext()) {
                        for (java.lang.String str : mapAT.keySet()) {
                            j$.util.Map.-EL.computeIfAbsent(acaVar, str, new aite(new agvo(obj13, str, 1), 1));
                        }
                        if (!acaVar.isEmpty()) {
                            ((defpackage.aimw) aimzVar.d().l("com/google/apps/tiktok/account/data/google/GmsAccounts", "createAccountInfos", 162, "GmsAccounts.kt")).w("GoogleOwnersProvider had %d missing ids.", acaVar.d);
                        }
                        defpackage.anpu anpuVarY = defpackage.aiql.Y(acaVar.values());
                        java.util.concurrent.Callable callableI = defpackage.ahqx.i(new java.util.concurrent.Callable() { // from class: agpr
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.concurrent.Callable
                            public final java.lang.Object call() {
                                java.util.HashMap map2 = new java.util.HashMap();
                                defpackage.ailk ailkVarListIterator2 = aifyVar.listIterator(0);
                                defpackage.aooh.e(ailkVarListIterator2, "iterator(...)");
                                while (true) {
                                    defpackage.aca acaVar2 = acaVar;
                                    int i4 = 1;
                                    if (!ailkVarListIterator2.hasNext()) {
                                        for (java.util.Map.Entry entry : mapAT.entrySet()) {
                                            java.lang.String str2 = (java.lang.String) entry.getKey();
                                            boolean zBooleanValue2 = ((java.lang.Boolean) entry.getValue()).booleanValue();
                                            try {
                                                java.lang.Object obj14 = acaVar2.get(str2);
                                                if (obj14 == null) {
                                                    throw new java.lang.IllegalStateException("Required value was null.");
                                                }
                                                java.lang.Object objH3 = defpackage.aiql.H((java.util.concurrent.Future) obj14);
                                                defpackage.aooh.c(objH3);
                                                java.lang.String str3 = (java.lang.String) objH3;
                                                defpackage.zzx zzxVarBg = defpackage.agab.bg((defpackage.akzz) defpackage.agoq.a.m());
                                                zzxVarBg.D(str3);
                                                zzxVarBg.B(str2);
                                                zzxVarBg.C(str2);
                                                zzxVarBg.E();
                                                defpackage.apdi apdiVar = defpackage.agpv.a;
                                                defpackage.aooh.e(apdiVar, "data");
                                                defpackage.zzx zzxVarBf = defpackage.agab.bf(defpackage.agpu.a.m());
                                                zzxVarBf.y(zBooleanValue2);
                                                zzxVarBf.z(1);
                                                zzxVarBg.L(apdiVar, zzxVarBf.x());
                                                defpackage.agab.bd(str3, zzxVarBg.A(), map2);
                                            } catch (java.util.concurrent.ExecutionException e3) {
                                                ((defpackage.aimw) ((defpackage.aimw) defpackage.agpt.a.c()).k(e3.getCause()).l("com/google/apps/tiktok/account/data/google/GmsAccounts$Companion", "createGaiaIdToAccountInfosMap", 517, "GmsAccounts.kt")).v("Failed to get GaiaId");
                                            }
                                        }
                                        return map2;
                                    }
                                    E next = ailkVarListIterator2.next();
                                    defpackage.aooh.e(next, "next(...)");
                                    defpackage.aeme aemeVar = (defpackage.aeme) next;
                                    java.lang.String str4 = aemeVar.e;
                                    if (str4 == null) {
                                        defpackage.ajcq ajcqVar = (defpackage.ajcq) acaVar2.get(aemeVar.a);
                                        if (ajcqVar == null) {
                                            ((defpackage.aimw) defpackage.agpt.a.d().l("com/google/apps/tiktok/account/data/google/GmsAccounts$Companion", "createGaiaIdToAccountInfosMap", 457, "GmsAccounts.kt")).v("GoogleOwnersProvider returned account that does not exist on the device.");
                                        } else {
                                            try {
                                                str4 = (java.lang.String) defpackage.aiql.H(ajcqVar);
                                            } catch (java.util.concurrent.ExecutionException e4) {
                                                ((defpackage.aimw) ((defpackage.aimw) defpackage.agpt.a.c()).k(e4.getCause()).l("com/google/apps/tiktok/account/data/google/GmsAccounts$Companion", "createGaiaIdToAccountInfosMap", 464, "GmsAccounts.kt")).v("Failed to get GaiaId");
                                            }
                                        }
                                    }
                                    if (str4 == null) {
                                        throw new java.lang.IllegalStateException("Required value was null.");
                                    }
                                    java.util.Map map3 = map;
                                    java.lang.String str5 = aemeVar.a;
                                    java.lang.Boolean bool = (java.lang.Boolean) map3.get(str5);
                                    if (bool != null) {
                                        defpackage.zzx zzxVarBg2 = defpackage.agab.bg((defpackage.akzz) defpackage.agoq.a.m());
                                        zzxVarBg2.D(str4);
                                        java.lang.Object obj15 = zzxVarBg2.a;
                                        defpackage.akzx akzxVar = (defpackage.akzx) obj15;
                                        akzxVar.u();
                                        defpackage.akzz akzzVar = (defpackage.akzz) obj15;
                                        defpackage.agoq agoqVar = (defpackage.agoq) akzzVar.b;
                                        agoqVar.b |= 64;
                                        agoqVar.i = false;
                                        defpackage.aooh.e(str5, "accountName(...)");
                                        zzxVarBg2.B(str5);
                                        java.lang.String str6 = aemeVar.b;
                                        if (str6 != null && str6.length() != 0) {
                                            zzxVarBg2.C(str6);
                                        }
                                        java.lang.String str7 = aemeVar.h;
                                        if (str7 != null && str7.length() != 0) {
                                            akzxVar.u();
                                            defpackage.agoq agoqVar2 = (defpackage.agoq) akzzVar.b;
                                            j$.util.Objects.requireNonNull(str7);
                                            agoqVar2.b |= 32;
                                            agoqVar2.h = str7;
                                        }
                                        java.lang.String str8 = aemeVar.c;
                                        if (str8 != null && str8.length() != 0) {
                                            akzxVar.u();
                                            defpackage.agoq agoqVar3 = (defpackage.agoq) akzzVar.b;
                                            j$.util.Objects.requireNonNull(str8);
                                            agoqVar3.b |= 4;
                                            agoqVar3.e = str8;
                                        }
                                        java.lang.String str9 = aemeVar.d;
                                        if (str9 != null && str9.length() != 0) {
                                            akzxVar.u();
                                            defpackage.agoq agoqVar4 = (defpackage.agoq) akzzVar.b;
                                            j$.util.Objects.requireNonNull(str9);
                                            agoqVar4.b |= 8;
                                            agoqVar4.f = str9;
                                        }
                                        zzxVarBg2.E();
                                        defpackage.apdi apdiVar2 = defpackage.agpv.a;
                                        defpackage.aooh.e(apdiVar2, "data");
                                        defpackage.zzx zzxVarBf2 = defpackage.agab.bf(defpackage.agpu.a.m());
                                        zzxVarBf2.y(bool.booleanValue());
                                        defpackage.aemd aemdVar = aemeVar.g;
                                        defpackage.aooh.e(aemdVar, "isUnicornUser(...)");
                                        int iOrdinal = aemdVar.ordinal();
                                        if (iOrdinal != 0) {
                                            if (iOrdinal == 1) {
                                                i4 = 2;
                                            } else {
                                                if (iOrdinal != 2) {
                                                    throw new defpackage.aois();
                                                }
                                                i4 = 3;
                                            }
                                        }
                                        zzxVarBf2.z(i4);
                                        zzxVarBg2.L(apdiVar2, zzxVarBf2.x());
                                        defpackage.agab.bd(str4, zzxVarBg2.A(), map2);
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        });
                        defpackage.ajct ajctVar2 = ((defpackage.agpt) obj13).c;
                        return defpackage.ajan.g(anpuVarY.b(callableI, ajctVar2), defpackage.ahqx.c(new defpackage.afgz(obj13, 9)), ajctVar2);
                    }
                    java.lang.Object next = ailkVarListIterator.next();
                    defpackage.aooh.e(next, "next(...)");
                    defpackage.aeme aemeVar = (defpackage.aeme) next;
                    java.lang.String str2 = aemeVar.a;
                    if (str2 == null) {
                        throw new java.lang.IllegalStateException("Required value was null.");
                    }
                    if (map.containsKey(str2)) {
                        mapAT.remove(str2);
                        if (aemeVar.e == null && !acaVar.containsKey(str2)) {
                            acaVar.put(str2, ((defpackage.agpt) obj13).a(str2));
                        }
                    }
                }
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.ajcq ajcqVarB = ((defpackage.aguq) ((defpackage.agvg) this.b).a.a()).b((androidx.work.WorkerParameters) this.c);
                ((defpackage.ahoq) this.a).a(ajcqVarB);
                return ajcqVarB;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.aimw) ((defpackage.aimw) defpackage.ahlt.a.b()).l("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "scheduleNextSyncInParallel", 658, "SyncManagerImpl.java")).v("Completed sync. Scheduling next wakeup");
                long jLongValue = ((java.lang.Long) this.a).longValue();
                return ((defpackage.ahlt) this.c).g(this.b, jLongValue);
            default:
                defpackage.ahmh ahmhVar = (defpackage.ahmh) this.c;
                defpackage.ajcq ajcqVar = ahmhVar.b;
                defpackage.ahvr.cc(ajcqVar.isDone(), "Future was expected to be done: %s", ajcqVar);
                defpackage.a.h(ajcqVar);
                ?? r5 = this.b;
                defpackage.ahvr.cc(r5.isDone(), "Future was expected to be done: %s", r5);
                j$.time.Duration duration = (j$.time.Duration) defpackage.a.h(r5);
                return ahmhVar.a.a(this.a, duration);
        }
    }

    public /* synthetic */ vuw(defpackage.ahct ahctVar, java.lang.String str, defpackage.ajcq ajcqVar, int i) {
        this.$cid = i;
        this.c = ahctVar;
        this.a = str;
        this.b = ajcqVar;
    }

    public /* synthetic */ vuw(defpackage.gat gatVar, defpackage.adhw adhwVar, defpackage.ajcq ajcqVar, int i) {
        this.$cid = i;
        this.b = gatVar;
        this.c = adhwVar;
        this.a = ajcqVar;
    }

    public /* synthetic */ vuw(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ vuw(defpackage.vva vvaVar, defpackage.rsr rsrVar, android.net.Uri uri, int i) {
        this.$cid = i;
        this.a = vvaVar;
        this.b = rsrVar;
        this.c = uri;
    }
}
