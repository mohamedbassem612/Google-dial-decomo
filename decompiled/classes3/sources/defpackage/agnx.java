package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agnx implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ agnx(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v23, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v44, types: [java.lang.Object, java.util.Collection] */
    public final java.lang.Object apply(java.lang.Object obj) {
        defpackage.ahap ahapVar;
        java.lang.String strValueOf;
        java.lang.String str;
        int i = 0;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj2 = this.b;
                java.lang.Object obj3 = this.a;
                ahoq ahoqVarW = ahvr.W(1290, "AccountUiService useAccount");
                try {
                    com.google.apps.tiktok.account.api.controller.AccountActionResult accountActionResult = new com.google.apps.tiktok.account.api.controller.AccountActionResult((com.google.apps.tiktok.account.AccountId) obj3, agoq.a, null, null, (com.google.apps.tiktok.account.api.AccountOperationContext) obj2);
                    ahoqVarW.close();
                    return accountActionResult;
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarW.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 1:
                defpackage.agon agonVar = (defpackage.agon) obj;
                com.google.apps.tiktok.account.AccountId accountId = agonVar.a;
                agoq agoqVar = agonVar.b;
                com.google.apps.tiktok.account.api.controller.ValidationResult validationResult = (com.google.apps.tiktok.account.api.controller.ValidationResult) this.b;
                ahvr.bZ(validationResult.c(), "Trying to propagate AccountInfo for invalid account.");
                return new com.google.apps.tiktok.account.api.controller.AccountActionResult(accountId, agoqVar, validationResult, null, (com.google.apps.tiktok.account.api.AccountOperationContext) this.a);
            case 2:
                java.util.List<defpackage.agon> list = (java.util.List) obj;
                java.util.Iterator it = list.iterator();
                while (true) {
                    java.lang.Object obj4 = this.b;
                    java.lang.Object obj5 = this.a;
                    if (!it.hasNext()) {
                        java.lang.String strD = agpq.d((java.lang.String) obj4);
                        for (defpackage.agon agonVar2 : list) {
                            agoq agoqVar2 = agonVar2.b;
                            if (agpq.h(agoqVar2)) {
                                agpq agpqVar = (agpq) obj5;
                                if (!agpqVar.f(agoqVar2)) {
                                    continue;
                                } else if (!strD.equals(agpq.d(agoqVar2.g))) {
                                    if (agpqVar.b) {
                                        apdi apdiVar = agpv.a;
                                        agoqVar2.c(apdiVar);
                                        java.lang.Object objJ = ((alaa) agoqVar2).n.j((alac) apdiVar.a);
                                        if (objJ == null) {
                                            objJ = apdiVar.b;
                                        } else {
                                            apdiVar.c(objJ);
                                        }
                                        for (java.lang.String str2 : ((agpu) objJ).d) {
                                            if (agpq.g(str2)) {
                                                agpq.a.c().l("com/google/apps/tiktok/account/data/google/GcoreAccountName", "toAccountId", 180, "GcoreAccountName.java").v("Found google email address as the old primary email address. This shouldn't happen because the primary email address cannot change once set to a google domain one.");
                                                if (strD.equals(agpq.d(str2))) {
                                                }
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        throw new defpackage.agpf();
                    }
                    agonVar2 = (defpackage.agon) it.next();
                    agoq agoqVar3 = agonVar2.b;
                    if (agpq.h(agoqVar3)) {
                        agpq agpqVar2 = (agpq) obj5;
                        if (agpqVar2.f(agoqVar3)) {
                            java.lang.String str3 = (java.lang.String) obj4;
                            if (!str3.equals(agoqVar3.g)) {
                                if (agpqVar2.b) {
                                    apdi apdiVar2 = agpv.a;
                                    agoqVar3.c(apdiVar2);
                                    java.lang.Object objJ2 = ((alaa) agoqVar3).n.j((alac) apdiVar2.a);
                                    if (objJ2 == null) {
                                        objJ2 = apdiVar2.b;
                                    } else {
                                        apdiVar2.c(objJ2);
                                    }
                                    java.util.Iterator it2 = ((agpu) objJ2).d.iterator();
                                    while (it2.hasNext()) {
                                        if (str3.equals((java.lang.String) it2.next())) {
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return agonVar2.a;
            case 3:
                aigf aigfVar = (aigf) obj;
                ahvr.bZ(aihd.o((java.util.Collection) this.b).equals(aigfVar.f()), "EligibilityMapper returned different accounts from the original list");
                return agxh.a(aigfVar, j$.time.Instant.ofEpochMilli(((java.lang.Long) ((ahyn) this.a).b()).longValue()));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                java.lang.Object obj6 = this.a;
                defpackage.agvm agvmVar = (defpackage.agvm) this.b;
                ?? r0 = agvmVar.a.a;
                java.lang.String strB = agvl.b((androidx.work.WorkerParameters) obj6);
                defpackage.aljf aljfVar = (defpackage.aljf) r0.a();
                aogc aogcVar = agvmVar.b;
                aljfVar.d((java.lang.String) aogcVar.b, aogcVar.p(), strB, "attempt");
                return null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.amdx amdxVar = (defpackage.amdx) this.b;
                amdxVar.g();
                ((defpackage.agzq) this.a).c(amdxVar);
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.lang.Throwable th3 = (java.lang.Throwable) obj;
                boolean z = th3 instanceof java.util.concurrent.CancellationException;
                java.lang.Object obj7 = this.b;
                java.lang.Object obj8 = this.a;
                if (z) {
                    throw ((java.util.concurrent.CancellationException) th3);
                }
                try {
                    ((defpackage.amdx) obj7).g();
                    ((defpackage.agzq) obj8).c((defpackage.amdx) obj7);
                    return null;
                } catch (java.lang.NullPointerException e) {
                    a.by(defpackage.agzq.a.c(), "LocalSubscriptionMixinUpdater silently ignored NullPointerException", "com/google/apps/tiktok/dataservice/local/LocalSubscriptionMixinUpdater", "appendLoadCompletion", (char) 334, "LocalSubscriptionMixinUpdater.java", e);
                    throw e;
                }
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.ahar aharVar = (defpackage.ahar) obj;
                java.lang.Object objConcat = this.b;
                if (aharVar == defpackage.ahas.d) {
                    return new java.util.AbstractMap.SimpleEntry(objConcat, aharVar);
                }
                java.lang.Object obj9 = this.a;
                defpackage.ahap ahapVar2 = aharVar.b;
                do {
                    aike aikeVar = ((defpackage.ahau) obj9).a;
                    if (i >= aikeVar.d) {
                        throw new java.lang.IllegalArgumentException("Got unexpected DataType");
                    }
                    ahapVar = (defpackage.ahap) aikeVar.get(i);
                    i++;
                } while (ahapVar != ahapVar2);
                int iOrdinal = ahapVar2.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            strValueOf = java.lang.String.valueOf(objConcat);
                            str = ".html";
                        } else if (iOrdinal == 3) {
                            strValueOf = java.lang.String.valueOf(objConcat);
                            str = ".bin";
                        } else {
                            if (iOrdinal != 4) {
                                throw new java.lang.RuntimeException(null, null);
                            }
                            strValueOf = java.lang.String.valueOf(objConcat);
                            str = ".binarypb";
                        }
                        objConcat = strValueOf.concat(str);
                    } else {
                        objConcat = java.lang.String.valueOf(objConcat).concat(".txt");
                    }
                }
                return new java.util.AbstractMap.SimpleEntry(objConcat, aharVar);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                ahbm ahbmVar = (ahbm) obj;
                aooh.f(ahbmVar, "result");
                if (ahbmVar.a) {
                    return ahbmVar;
                }
                defpackage.ahdv ahdvVar = (defpackage.ahdv) this.a;
                j$.util.Optional optional = (j$.util.Optional) ahdvVar.d;
                if (!optional.isPresent()) {
                    return ahbmVar;
                }
                ((ahda) ahdvVar.g).b((java.lang.String) this.b);
                ((aezm) optional.get()).a();
                return ahbmVar;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.lang.Object obj10 = this.a;
                defpackage.aljf aljfVar2 = (defpackage.aljf) this.b;
                return ((apjb) aljfVar2.c).A((android.content.Context) aljfVar2.a, (defpackage.ahih) obj10, (defpackage.ahif) obj);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((aijm) this.a).b.a(this.b, obj);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return ((aijn) this.a).b.a(this.b, obj);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                aihd aihdVar = (aihd) obj;
                return java.lang.Boolean.valueOf(aihdVar.containsAll((java.util.Collection) this.a) && aihdVar.containsAll((java.util.Collection) this.b));
            default:
                java.util.Map map = (java.util.Map) obj;
                java.util.Iterator it3 = this.b.iterator();
                while (true) {
                    java.lang.Object obj11 = this.a;
                    if (!it3.hasNext()) {
                        return obj11;
                    }
                    java.lang.Integer num = (java.lang.Integer) it3.next();
                    java.lang.Integer num2 = (java.lang.Integer) map.get(num);
                    if (num2 == null) {
                        throw new defpackage.ahzr("Missing CPS Id for product id: ".concat(java.lang.String.valueOf(num)));
                    }
                    ((java.util.ArrayList) obj11).add(num2);
                }
                break;
        }
    }

    public /* synthetic */ agnx(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
