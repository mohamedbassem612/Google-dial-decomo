package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahju implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ ahju(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public final ajcq a(java.lang.Object obj) {
        aaum aaumVarR;
        com.google.android.gms.auth.TokenData tokenDataA;
        java.lang.Long l;
        java.util.List list;
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj2 = this.b;
            j$.time.Instant instantNow = j$.time.Instant.now();
            android.accounts.Account account = new android.accounts.Account((java.lang.String) obj2, "com.google");
            defpackage.ahjv ahjvVar = (defpackage.ahjv) this.a;
            zwr zwrVar = ahjvVar.d;
            try {
                zxi zxiVar = (zxi) zwrVar.b.eZ();
                android.content.Context context = zwrVar.a;
                android.os.Bundle bundle = new android.os.Bundle();
                if (andi.d()) {
                    zxiVar.c(account);
                }
                java.lang.String packageName = context.getPackageName();
                zwx zwxVar = zxiVar.b;
                boolean zE = zxj.e(packageName, zwxVar, context);
                java.lang.String str = ((defpackage.ahjw) ahjvVar.c).a;
                if (zE) {
                    try {
                        java.lang.String str2 = account.name;
                        java.lang.String str3 = zwk.a;
                        java.lang.String strC = zwq.c(context, str2);
                        if (android.text.TextUtils.isEmpty(strC)) {
                            throw new java.io.IOException("Could not fetch gaia id for account.");
                        }
                        com.google.android.gms.auth.aang.GetTokenResponse getTokenResponse = (com.google.android.gms.auth.aang.GetTokenResponse) aazc.t(zwxVar.c(andi.a.b().g() ? zxj.a(strC, str, bundle).a() : zxj.b(account, str, zwxVar, bundle).a()));
                        java.lang.String str4 = getTokenResponse.a;
                        com.google.android.gms.auth.aang.Oauth2TokenMetadata oauth2TokenMetadata = getTokenResponse.b;
                        if (oauth2TokenMetadata != null) {
                            java.lang.Long l2 = oauth2TokenMetadata.a;
                            list = oauth2TokenMetadata.b;
                            l = l2;
                        } else {
                            l = null;
                            list = null;
                        }
                        tokenDataA = android.text.TextUtils.isEmpty(str4) ? null : new com.google.android.gms.auth.TokenData(1, str4, l, false, false, list, null);
                        if (tokenDataA == null) {
                            throw new java.io.IOException("Token is null");
                        }
                    } catch (java.lang.InterruptedException e) {
                        java.lang.Thread.currentThread().interrupt();
                        throw new java.io.IOException(e);
                    } catch (java.util.concurrent.ExecutionException e2) {
                        zxj.c(e2, "Unexpected exception while fetching token.");
                        java.lang.String str5 = zwk.a;
                        tokenDataA = zwq.a(context, account, str, bundle, 0L, (java.util.concurrent.Executor) null);
                    }
                } else {
                    java.lang.String str6 = zwk.a;
                    tokenDataA = zwq.a(context, account, str, bundle, 0L, (java.util.concurrent.Executor) null);
                }
                aaumVarR = aazc.s(tokenDataA);
            } catch (zwj | java.io.IOException e3) {
                aaumVarR = aazc.r(e3);
            }
            return ahvr.H(aazc.e(aaumVarR), new defpackage.ahds(instantNow, 8), ajbm.a);
        }
        if (i == 1) {
            return aazc.e(((defpackage.aawd) ((apjb) this.b).b).m((com.google.android.gms.feedback.FeedbackOptions) obj, (defpackage.uwk) this.a));
        }
        if (i == 2) {
            java.lang.String str7 = (java.lang.String) obj;
            return str7 != null ? ((defpackage.ahjv) this.b).d(str7) : aiql.y(new java.lang.IllegalStateException("Cannot get auth token for account id: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.a)))));
        }
        if (i == 3) {
            java.lang.String str8 = (java.lang.String) obj;
            return str8 != null ? ((defpackage.ahjv) this.b).c(str8) : aiql.y(new java.lang.IllegalStateException("Cannot get auth token for account id: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.a)))));
        }
        if (i != 4) {
            if (i == 5) {
                ahmc ahmcVar = (ahmc) this.b;
                if (ahmcVar.e.r()) {
                    ahme ahmeVar = ahmcVar.b;
                    androidx.work.WorkerParameters workerParameters = (androidx.work.WorkerParameters) this.a;
                    if (!workerParameters.c.contains(ahmc.c(ahmeVar.b()))) {
                        ahmc.a.b().l("com/google/apps/tiktok/sync/impl/workmanager/SyncPeriodicWorker", "maybeCancelThisWorkerIfItHasWrongMainProcessTag", 154, "SyncPeriodicWorker.java").v("Cancelling Sync worker since it has the wrong tag");
                        return ahmcVar.d.h(workerParameters.a);
                    }
                }
                return ajcm.a;
            }
            ajdd ajddVar = new ajdd();
            java.lang.Object obj3 = this.b;
            ajzh ajzhVar = (ajzh) this.a;
            defpackage.ajzm ajzmVar = (defpackage.ajzm) obj3;
            defpackage.ajzg ajzgVar = new defpackage.ajzg(ajddVar, ajzhVar.c, ajzmVar);
            java.lang.String str9 = ajzmVar.a;
            ajbm ajbmVar = ajbm.a;
            org.chromium.net.ExperimentalUrlRequest.Builder builderAllowDirectExecutor = ((org.chromium.net.CronetEngine) obj).newUrlRequestBuilder(str9, ajzgVar, ajbmVar).allowDirectExecutor();
            java.lang.String str10 = ajzmVar.g;
            if (str10 != null) {
                builderAllowDirectExecutor.setHttpMethod(str10);
            }
            for (java.util.Map.Entry entry : ajzmVar.c.i()) {
                builderAllowDirectExecutor.addHeader(((defpackage.ajzj) entry.getKey()).a, (java.lang.String) entry.getValue());
            }
            defpackage.ajzl ajzlVar = ajzmVar.d;
            if (ajzlVar != null) {
                builderAllowDirectExecutor.addHeader("Content-Type", ajzlVar.a);
                builderAllowDirectExecutor.setUploadDataProvider(new ajzf(ajzlVar), ajbmVar);
            }
            if (builderAllowDirectExecutor instanceof org.chromium.net.ExperimentalUrlRequest.Builder) {
                org.chromium.net.ExperimentalUrlRequest.Builder builder = builderAllowDirectExecutor;
                java.lang.Integer num = ajzmVar.j;
                if (num != null) {
                    builder.setTrafficStatsUid(num.intValue());
                }
                java.lang.Integer num2 = ajzmVar.k;
                if (num2 != null) {
                    builder.setTrafficStatsTag(num2.intValue());
                }
                java.lang.Long l3 = ajzmVar.h;
                if (l3 != null) {
                    builder.bindToNetwork(l3.longValue());
                }
            }
            builderAllowDirectExecutor.setPriority(ajzmVar.f);
            ajzh.b.getAndIncrement();
            org.chromium.net.UrlRequest urlRequestBuild = builderAllowDirectExecutor.build();
            ajddVar.c(new defpackage.ajze(ajzhVar, ajddVar, urlRequestBuild), ajbmVar);
            urlRequestBuild.start();
            return ajddVar;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.List) obj).iterator();
        while (true) {
            java.lang.Object obj4 = this.a;
            java.lang.Object obj5 = this.b;
            if (!it.hasNext()) {
                return ahvr.ah(arrayList).p(new defpackage.adck(obj5, obj4, 20), ((ahmc) obj5).c);
            }
            gsx gsxVar = (gsx) it.next();
            java.util.UUID uuid = ((androidx.work.WorkerParameters) obj4).a;
            java.util.UUID uuid2 = gsxVar.a;
            if (!uuid.equals(uuid2)) {
                arrayList.add(((ahmc) obj5).d.h(uuid2));
            }
        }
    }

    public /* synthetic */ ahju(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
