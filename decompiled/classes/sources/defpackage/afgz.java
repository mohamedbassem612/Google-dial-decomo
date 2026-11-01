package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class afgz implements defpackage.ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ afgz(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v17, types: [ahyc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v38, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r13v48, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r13v64, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v68, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v70, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v72, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v74, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v76, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v78, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v80, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v82, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v84, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.ajat
    public final defpackage.ajcq a(java.lang.Object obj) throws java.io.IOException {
        defpackage.ajcq ajddVar;
        defpackage.ajcq ajcqVar;
        int i = 0;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                android.net.Uri uri = (android.net.Uri) obj;
                android.net.Uri uriAf = defpackage.agab.af(uri, ".bak");
                try {
                    defpackage.aogc aogcVar = ((defpackage.afhc) this.a).f;
                    if (aogcVar.R(uriAf)) {
                        aogcVar.Q(uriAf, uri);
                        break;
                    }
                    return defpackage.ajcm.a;
                } catch (java.io.IOException e) {
                    ajddVar = new defpackage.ajdd(e);
                }
                break;
            case 1:
                return defpackage.aiql.A((defpackage.ajcq) ((defpackage.aezw) this.a).e.eZ());
            case 2:
                java.lang.Object obj2 = this.a;
                synchronized (((defpackage.afhc) obj2).d) {
                    ajcqVar = ((defpackage.afhc) obj2).e;
                    break;
                }
                return ajcqVar;
            case 3:
                java.lang.Object objApply = this.a.apply(obj);
                if (objApply == null) {
                    return defpackage.ajcm.a;
                }
                ajddVar = new defpackage.ajcm(objApply);
                break;
                break;
            case 4:
                return ((defpackage.afhf) this.a).c.a();
            case 5:
                return ((defpackage.afhf) this.a).b.h();
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.agov.a.c()).k((java.lang.Throwable) obj)).l("com/google/apps/tiktok/account/data/AccountInvalidator", "invalidateAllAccounts", 70, "AccountInvalidator.java")).v("Account sync failed");
                return ((defpackage.agov) this.a).b.e.a(new defpackage.aeqw(14), defpackage.ajbm.INSTANCE);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.adai adaiVar = (defpackage.adai) ((defpackage.agpb) this.a).a.a();
                defpackage.aigf aigfVarN = adaiVar.n();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                defpackage.ailj it = aigfVarN.entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    java.lang.String str = (java.lang.String) entry.getKey();
                    defpackage.apnt apntVar = (defpackage.apnt) entry.getValue();
                    java.lang.Object obj3 = apntVar.a;
                    defpackage.ahoq ahoqVarW = defpackage.ahvr.W(1294, "GmsAccounts.getAccounts()");
                    try {
                        final defpackage.agpt agptVar = (defpackage.agpt) obj3;
                        defpackage.ajcq ajcqVarE = defpackage.aiql.E(defpackage.ahqx.b(new defpackage.ajas() { // from class: agps
                            @Override // defpackage.ajas
                            public final defpackage.ajcq a() throws java.io.IOException {
                                defpackage.aaum aaumVarR;
                                defpackage.aaum aaumVarR2;
                                int i2;
                                android.accounts.Account[] accountArrI;
                                android.accounts.Account[] accountArrH;
                                defpackage.agpt agptVar2 = agptVar;
                                defpackage.ahoq ahoqVarW2 = defpackage.ahvr.W(1299, "GoogleAuthUtilWrapper.getAccounts");
                                try {
                                    defpackage.zwr zwrVar = agptVar2.g;
                                    try {
                                        defpackage.zxi zxiVar = (defpackage.zxi) zwrVar.b.eZ();
                                        android.content.Context context = zwrVar.a;
                                        if (defpackage.zxj.d(context.getPackageName())) {
                                            try {
                                                defpackage.zxi.a(defpackage.aabx.a.b(zxiVar.b, new defpackage.aadf[0]));
                                                ((defpackage.aimw) ((defpackage.aimw) defpackage.zxi.a.b().j(aaio.a, 343)).l("com/google/android/gms/auth/aang/migration/GoogleAuthClientWrapper", "getAccounts", 131, "GoogleAuthClientWrapper.java")).y("Using GoogleAuthClient for getAccounts for 1p app: %s", context.getPackageName());
                                                defpackage.aify aifyVar = defpackage.aike.a;
                                                try {
                                                    defpackage.zwx zwxVar = zxiVar.b;
                                                    zwv zwvVarA = com.google.android.gms.auth.aang.GetAccountsRequest.a();
                                                    zwvVarA.b("com.google");
                                                    accountArrH = defpackage.zxj.f(((com.google.android.gms.auth.aang.GetAccountsResponse) defpackage.zxi.a(zwxVar.b(zwvVarA.a()))).a);
                                                } catch (java.lang.InterruptedException e2) {
                                                    java.lang.Thread.currentThread().interrupt();
                                                    throw new android.os.RemoteException("Fetching accounts was interrupted. ".concat(e2.toString()));
                                                } catch (java.util.concurrent.ExecutionException e3) {
                                                    if (e3.getCause() instanceof android.os.RemoteException) {
                                                        throw ((android.os.RemoteException) e3.getCause());
                                                    }
                                                    if (e3.getCause() instanceof defpackage.aacm) {
                                                        throw ((defpackage.aacm) e3.getCause());
                                                    }
                                                    if (e3.getCause() instanceof defpackage.aacl) {
                                                        throw ((defpackage.aacl) e3.getCause());
                                                    }
                                                    throw new android.os.RemoteException("Unexpected error was thrown by GoogleAuthClient when fetching accounts. ".concat(e3.toString()));
                                                }
                                            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
                                                ((defpackage.aimw) ((defpackage.aimw) defpackage.zxi.a.b().j(aaio.a, 343)).l("com/google/android/gms/auth/aang/migration/GoogleAuthClientWrapper", "getAccounts", 134, "GoogleAuthClientWrapper.java")).y("Using GoogleAuthUtil for getAccounts for 1p app: %s", context.getPackageName());
                                                java.lang.String str2 = defpackage.zwk.a;
                                                accountArrH = defpackage.zwq.h(context);
                                            }
                                        } else {
                                            java.lang.String str3 = defpackage.zwk.a;
                                            accountArrH = defpackage.zwq.h(context);
                                        }
                                        aaumVarR = defpackage.aazc.s(accountArrH);
                                    } catch (defpackage.aacl | defpackage.aacm | android.os.RemoteException e4) {
                                        aaumVarR = defpackage.aazc.r(e4);
                                    }
                                    defpackage.ajcq ajcqVarE2 = defpackage.aazc.e(aaumVarR);
                                    ahoqVarW2.a(ajcqVarE2);
                                    defpackage.ajsz.ak(ahoqVarW2, null);
                                    defpackage.ahoq ahoqVarW3 = defpackage.ahvr.W(1300, "GoogleAuthUtilWrapper.getAccounts of G1 feature");
                                    try {
                                        defpackage.zwr zwrVar2 = agptVar2.g;
                                        java.lang.String[] strArr = {defpackage.afix.a};
                                        try {
                                            defpackage.zxi zxiVar2 = (defpackage.zxi) zwrVar2.b.eZ();
                                            android.content.Context context2 = zwrVar2.a;
                                            if (defpackage.zxj.d(context2.getPackageName())) {
                                                try {
                                                    i2 = 343;
                                                    try {
                                                        defpackage.zxi.a(defpackage.aabx.a.b(zxiVar2.b, new defpackage.aadf[0]));
                                                        ((defpackage.aimw) ((defpackage.aimw) defpackage.zxi.a.b().j(aaio.a, 343)).l("com/google/android/gms/auth/aang/migration/GoogleAuthClientWrapper", "getAccounts", 201, "GoogleAuthClientWrapper.java")).y("Using GoogleAuthClient for getAccounts for 1p app: %s", context2.getPackageName());
                                                        java.util.List list = defpackage.aike.a;
                                                        try {
                                                            defpackage.zwx zwxVar2 = zxiVar2.b;
                                                            zwv zwvVarA2 = com.google.android.gms.auth.aang.GetAccountsRequest.a();
                                                            zwvVarA2.a = defpackage.aify.o(strArr);
                                                            zwvVarA2.b("com.google");
                                                            list = ((com.google.android.gms.auth.aang.GetAccountsResponse) defpackage.zxi.a(zwxVar2.b(zwvVarA2.a()))).a;
                                                        } catch (java.lang.InterruptedException e5) {
                                                            java.lang.Thread.currentThread().interrupt();
                                                            throw new java.io.IOException(e5);
                                                        } catch (java.util.concurrent.ExecutionException e6) {
                                                            defpackage.zxj.c(e6, "Unexpected error was thrown by GoogleAuthClient when fetching accounts.");
                                                        }
                                                        accountArrI = defpackage.zxj.f(list);
                                                    } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused2) {
                                                        ((defpackage.aimw) ((defpackage.aimw) defpackage.zxi.a.b().j(aaio.a, java.lang.Integer.valueOf(i2))).l("com/google/android/gms/auth/aang/migration/GoogleAuthClientWrapper", "getAccounts", 204, "GoogleAuthClientWrapper.java")).y("Using GoogleAuthUtil for getAccounts for 1p app: %s", context2.getPackageName());
                                                        java.lang.String str4 = defpackage.zwk.a;
                                                        accountArrI = defpackage.zwq.i(context2, strArr);
                                                    }
                                                } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused3) {
                                                    i2 = 343;
                                                }
                                            } else {
                                                java.lang.String str5 = defpackage.zwk.a;
                                                accountArrI = defpackage.zwq.i(context2, strArr);
                                            }
                                            aaumVarR2 = defpackage.aazc.s(accountArrI);
                                        } catch (java.io.IOException | defpackage.zwj e7) {
                                            aaumVarR2 = defpackage.aazc.r(e7);
                                        }
                                        defpackage.ajcq ajcqVarE3 = defpackage.aazc.e(aaumVarR2);
                                        ahoqVarW3.a(ajcqVarE3);
                                        defpackage.ajsz.ak(ahoqVarW3, null);
                                        return defpackage.aiql.ab(ajcqVarE2, ajcqVarE3).b(defpackage.ahqx.i(new defpackage.nyf(ajcqVarE2, ajcqVarE3, 17)), agptVar2.b);
                                    } catch (java.lang.Throwable th) {
                                        try {
                                            throw th;
                                        } catch (java.lang.Throwable th2) {
                                            defpackage.ajsz.ak(ahoqVarW3, th);
                                            throw th2;
                                        }
                                    }
                                } catch (java.lang.Throwable th3) {
                                    try {
                                        throw th3;
                                    } catch (java.lang.Throwable th4) {
                                        defpackage.ajsz.ak(ahoqVarW2, th3);
                                        throw th4;
                                    }
                                }
                            }
                        }), ((defpackage.agpt) obj3).b);
                        defpackage.ahoq ahoqVarW2 = defpackage.ahvr.W(1303, "GoogleOwnersProvider.loadOwners");
                        try {
                            defpackage.ajcq ajcqVarC = ((defpackage.agpt) obj3).d.c();
                            ahoqVarW2.a(ajcqVarC);
                            defpackage.ajsz.ak(ahoqVarW2, null);
                            defpackage.aooh.e(ajcqVarC, "use(...)");
                            defpackage.ajcq ajcqVarG = defpackage.aizu.g(ajcqVarC, java.lang.Throwable.class, defpackage.ahqx.c(new defpackage.uqd(11)), defpackage.ajbm.INSTANCE);
                            defpackage.ajcq ajcqVarC2 = defpackage.aiql.ab(ajcqVarE, ajcqVarG).c(defpackage.ahqx.b(new defpackage.vuw(obj3, ajcqVarG, ajcqVarE, 5)), ((defpackage.agpt) obj3).c);
                            ahoqVarW.a(ajcqVarC2);
                            defpackage.ajsz.ak(ahoqVarW, null);
                            arrayList.add(defpackage.ajan.f(ajcqVarC2, defpackage.ahqx.a(new defpackage.jtv(str, apntVar, 18, bArr)), adaiVar.a));
                        } catch (java.lang.Throwable th) {
                            try {
                                throw th;
                            } catch (java.lang.Throwable th2) {
                                defpackage.ajsz.ak(ahoqVarW2, th);
                                throw th2;
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        try {
                            throw th3;
                        } catch (java.lang.Throwable th4) {
                            defpackage.ajsz.ak(ahoqVarW, th3);
                            throw th4;
                        }
                    }
                }
                return defpackage.aiql.aa(arrayList).b(defpackage.ahqx.i(new defpackage.vcz(arrayList, 15)), adaiVar.a);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                final defpackage.aify aifyVar = (defpackage.aify) obj;
                java.lang.Object obj4 = this.a;
                defpackage.ahoq ahoqVarW3 = defpackage.ahvr.W(1305, "Sync Accounts");
                java.lang.Object obj5 = ((defpackage.agpb) obj4).f.b;
                try {
                    java.lang.Object obj6 = ((defpackage.agqj) obj5).h;
                    defpackage.ahyc ahycVar = new defpackage.ahyc() { // from class: agqg
                        @Override // defpackage.ahyc
                        public final java.lang.Object apply(java.lang.Object obj7) {
                            int i2;
                            defpackage.agoq agoqVar;
                            defpackage.akzx akzxVarL = ((defpackage.agqk) obj7).L();
                            defpackage.agqk agqkVar = (defpackage.agqk) akzxVarL.r();
                            java.util.HashMap map = new java.util.HashMap();
                            java.util.Collection collection = aifyVar;
                            java.util.Iterator it2 = collection.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                defpackage.agoq agoqVar2 = (defpackage.agoq) it2.next();
                                java.util.Iterator it3 = j$.util.DesugarCollections.unmodifiableMap(j$.util.DesugarCollections.unmodifiableMap(((defpackage.agqk) akzxVarL.b).d)).values().iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        defpackage.akzx akzxVarM = defpackage.agqm.a.m();
                                        akzxVarM.u();
                                        defpackage.agqm agqmVar = (defpackage.agqm) akzxVarM.b;
                                        j$.util.Objects.requireNonNull(agoqVar2);
                                        agqmVar.d = agoqVar2;
                                        agqmVar.b |= 2;
                                        akzxVarM.u();
                                        defpackage.agqm agqmVar2 = (defpackage.agqm) akzxVarM.b;
                                        agqmVar2.e = 0;
                                        agqmVar2.b |= 4;
                                        i2 = ((defpackage.agqk) akzxVarL.b).c;
                                        akzxVarL.u();
                                        defpackage.agqk agqkVar2 = (defpackage.agqk) akzxVarL.b;
                                        agqkVar2.b |= 1;
                                        agqkVar2.c = i2 + 1;
                                        akzxVarM.u();
                                        defpackage.agqm agqmVar3 = (defpackage.agqm) akzxVarM.b;
                                        agqmVar3.b |= 1;
                                        agqmVar3.c = i2;
                                        akzxVarL.aq(i2, (defpackage.agqm) akzxVarM.r());
                                        break;
                                    }
                                    defpackage.agqm agqmVar4 = (defpackage.agqm) it3.next();
                                    defpackage.agoq agoqVar3 = agqmVar4.d;
                                    if (agoqVar3 == null) {
                                        agoqVar3 = defpackage.agoq.a;
                                    }
                                    if (!agoqVar3.j.equals(agoqVar2.j) ? false : agoqVar3.c.equals(agoqVar2.c)) {
                                        defpackage.akzx akzxVarL2 = agqmVar4.L();
                                        akzxVarL2.u();
                                        defpackage.agqm agqmVar5 = (defpackage.agqm) akzxVarL2.b;
                                        j$.util.Objects.requireNonNull(agoqVar2);
                                        defpackage.alad aladVar = agqmVar5.d;
                                        if (aladVar == null || aladVar == (agoqVar = defpackage.agoq.a)) {
                                            agqmVar5.d = agoqVar2;
                                        } else {
                                            defpackage.akzz akzzVar = (defpackage.akzz) agoqVar.n(aladVar);
                                            akzzVar.z(agoqVar2);
                                            agqmVar5.d = (defpackage.agoq) akzzVar.s();
                                        }
                                        agqmVar5.b |= 2;
                                        akzxVarL.aq(agqmVar4.c, (defpackage.agqm) akzxVarL2.r());
                                        i2 = agqmVar4.c;
                                        break;
                                    }
                                }
                                map.put(com.google.apps.tiktok.account.AccountId.b(i2), agoqVar2);
                            }
                            defpackage.aigf aigfVarI = defpackage.aigf.i(map);
                            defpackage.ahvr.bZ(aigfVarI.size() == collection.size(), "Provider had duplicate accounts.");
                            defpackage.aihb aihbVar = new defpackage.aihb();
                            java.util.Iterator it4 = j$.util.DesugarCollections.unmodifiableMap(agqkVar.d).values().iterator();
                            while (it4.hasNext()) {
                                aihbVar.c(com.google.apps.tiktok.account.AccountId.b(((defpackage.agqm) it4.next()).c));
                            }
                            defpackage.aihd<com.google.apps.tiktok.account.AccountId> aihdVarF = defpackage.ahvr.am(aihbVar.g(), aigfVarI.keySet()).f();
                            defpackage.aigb aigbVar = new defpackage.aigb(4);
                            java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(j$.util.DesugarCollections.unmodifiableMap(((defpackage.agqk) akzxVarL.b).d));
                            for (com.google.apps.tiktok.account.AccountId accountId : aihdVarF) {
                                java.lang.Integer numValueOf = java.lang.Integer.valueOf(accountId.a());
                                if (mapUnmodifiableMap.containsKey(numValueOf)) {
                                    int iAQ = defpackage.a.aQ(((defpackage.agqm) mapUnmodifiableMap.get(numValueOf)).e);
                                    if (iAQ == 0) {
                                        iAQ = 1;
                                    }
                                    if (iAQ == 2) {
                                        aigbVar.i(accountId, (defpackage.agqm) mapUnmodifiableMap.get(numValueOf));
                                    }
                                }
                            }
                            defpackage.aigf aigfVarE = aigbVar.e(true);
                            java.util.Iterator<E> it5 = aihdVarF.iterator();
                            while (it5.hasNext()) {
                                int iA = ((com.google.apps.tiktok.account.AccountId) it5.next()).a();
                                akzxVarL.u();
                                ((defpackage.agqk) akzxVarL.b).b().remove(java.lang.Integer.valueOf(iA));
                            }
                            return new defpackage.agqi(aigfVarE, (defpackage.agqk) akzxVarL.r());
                        }
                    };
                    java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
                    defpackage.ajcq ajcqVarG2 = ((defpackage.aogc) obj6).G(defpackage.ahqx.a(new defpackage.jtv(ahycVar, atomicReference, 19)), ((defpackage.agqj) obj5).a);
                    defpackage.ahyc ahycVarA = defpackage.ahqx.a(new defpackage.vut(atomicReference, 17));
                    defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                    defpackage.ahrv ahrvVarH = defpackage.ahrv.g(defpackage.ajan.f(ajcqVarG2, ahycVarA, ajbmVar)).i(new defpackage.afgz(obj5, 10), ((defpackage.agqj) obj5).b).h(new defpackage.agqh(i), ajbmVar);
                    ahoqVarW3.a(ahrvVarH);
                    ahoqVarW3.close();
                    return ahrvVarH;
                } catch (java.lang.Throwable th5) {
                    try {
                        ahoqVarW3.close();
                        throw th5;
                    } catch (java.lang.Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            case 9:
                java.util.Map map = (java.util.Map) obj;
                defpackage.aooh.f(map, "p0");
                defpackage.aift aiftVar = new defpackage.aift(4);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry2 : map.entrySet()) {
                    java.lang.String str2 = (java.lang.String) entry2.getKey();
                    java.util.Map map2 = (java.util.Map) entry2.getValue();
                    if (map2.size() == 1) {
                        aiftVar.i(defpackage.ajsz.bL(map2.values()));
                    } else {
                        linkedHashMap.put(str2, map2);
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    return defpackage.aiql.z(aiftVar.g());
                }
                java.lang.Object obj7 = this.a;
                defpackage.agpt agptVar2 = (defpackage.agpt) obj7;
                boolean z = !((java.lang.Boolean) ((defpackage.ahyn) ((defpackage.amyw) agptVar2.f).b).d(java.lang.Boolean.FALSE)).booleanValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.util.Map.Entry entry3 : linkedHashMap.entrySet()) {
                    java.lang.String str3 = (java.lang.String) entry3.getKey();
                    java.util.Map map3 = (java.util.Map) entry3.getValue();
                    if (str3.length() <= 0) {
                        throw new java.lang.IllegalArgumentException("Failed requirement.");
                    }
                    defpackage.ahoq ahoqVarW4 = defpackage.ahvr.W(1301, "getAccountNameFromAccountId");
                    try {
                        defpackage.ajcq ajcqVarE2 = defpackage.aiql.E(defpackage.ahqx.b(new adck(obj7, str3, 9, (byte[]) null)), ((defpackage.agpt) obj7).b);
                        ahoqVarW4.a(ajcqVarE2);
                        defpackage.ajsz.ak(ahoqVarW4, null);
                        arrayList2.add(defpackage.ajan.f(ajcqVarE2, defpackage.ahqx.a(new qfm(map3, z, 6)), agptVar2.c));
                    } catch (java.lang.Throwable th7) {
                        try {
                            throw th7;
                        } catch (java.lang.Throwable th8) {
                            defpackage.ajsz.ak(ahoqVarW4, th7);
                            throw th8;
                        }
                    }
                }
                return defpackage.aiql.aa(arrayList2).b(defpackage.ahqx.i(new afgu(arrayList2, aiftVar, 4)), agptVar2.c);
            case 10:
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                defpackage.ailj it2 = ((defpackage.aigf) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    java.lang.Object obj8 = this.a;
                    java.util.Map.Entry entry4 = (java.util.Map.Entry) it2.next();
                    agos agosVar = new agos((com.google.apps.tiktok.account.AccountId) entry4.getKey(), defpackage.aogc.H((defpackage.agqm) entry4.getValue()).b);
                    defpackage.agqj agqjVar = (defpackage.agqj) obj8;
                    java.util.Set set = (java.util.Set) agqjVar.e.a();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(set.size());
                    java.util.Iterator it3 = set.iterator();
                    while (it3.hasNext()) {
                        try {
                            arrayList4.add(((defpackage.agot) it3.next()).c());
                        } catch (java.lang.Exception e2) {
                            arrayList4.add(defpackage.aiql.y(e2));
                        }
                    }
                    arrayList3.add(defpackage.aiql.Y(arrayList4).c(defpackage.ahqx.b(new defpackage.vto(obj8, arrayList4, agosVar, 12, (byte[]) null)), agqjVar.b));
                }
                return defpackage.aiql.aa(arrayList3).b(new defpackage.kve(12), defpackage.ajbm.INSTANCE);
            case 11:
                java.lang.String str4 = (java.lang.String) obj;
                java.lang.Object obj9 = this.a;
                defpackage.aooh.f(obj9, "<this>");
                defpackage.aooh.f(str4, "p0");
                defpackage.aooh.f(str4, "mendelPackage");
                defpackage.ahbz ahbzVar = (defpackage.ahbz) obj9;
                java.lang.String strC = ((defpackage.apnt) ahbzVar.e).c(str4);
                defpackage.ahav ahavVar = (defpackage.ahav) ahbzVar.a.get(strC);
                if (ahavVar == defpackage.ahav.a) {
                    return ((defpackage.ahbv) ahbzVar.f.a()).a(strC, true);
                }
                throw new java.lang.IllegalStateException(defpackage.a.bo(ahavVar, strC, "Package ", " was not a device package. Instead was "));
            case 12:
                return defpackage.a.j(this.a, obj);
            case 13:
                return defpackage.a.j(this.a, obj);
            case 14:
                ?? r13 = this.a;
                defpackage.ahbq ahbqVar = defpackage.ahew.k;
                return defpackage.a.j(r13, obj);
            case 15:
                ?? r14 = this.a;
                defpackage.ahbq ahbqVar2 = defpackage.ahew.k;
                return defpackage.a.j(r14, obj);
            case 16:
                ?? r15 = this.a;
                defpackage.ahbq ahbqVar3 = defpackage.ahew.k;
                return defpackage.a.j(r15, obj);
            case 17:
                ?? r16 = this.a;
                defpackage.ahbq ahbqVar4 = defpackage.ahew.k;
                return defpackage.a.j(r16, obj);
            case 18:
                ?? r17 = this.a;
                defpackage.ahbq ahbqVar5 = defpackage.ahew.k;
                return defpackage.a.j(r17, obj);
            case 19:
                ?? r18 = this.a;
                defpackage.ahbq ahbqVar6 = defpackage.ahew.k;
                return defpackage.a.j(r18, obj);
            default:
                ?? r19 = this.a;
                defpackage.ahbq ahbqVar7 = defpackage.ahew.k;
                return defpackage.a.j(r19, obj);
        }
        return ajddVar;
    }
}
