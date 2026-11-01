package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agnw implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ agnw(int i) {
        this.$cid = i;
        this.a = "com.google";
    }

    /* JADX WARN: Type inference failed for: r7v28, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v29, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v30, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v48, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v49, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v50, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v51, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v52, types: [aonj, java.lang.Object] */
    public final java.lang.Object apply(java.lang.Object obj) {
        boolean z = false;
        z = false;
        int i = 1;
        switch (this.$cid) {
            case 0:
                android.content.Intent intent = (android.content.Intent) obj;
                java.lang.Object obj2 = this.a;
                ahoq ahoqVarW = ahvr.W(1291, "AccountUiService useIntent");
                try {
                    com.google.apps.tiktok.account.api.controller.AccountActionResult accountActionResult = new com.google.apps.tiktok.account.api.controller.AccountActionResult(null, agoq.a, null, intent, (com.google.apps.tiktok.account.api.AccountOperationContext) obj2);
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
                return android.util.Pair.create(this.a, obj);
            case 2:
                android.os.Bundle bundle = (android.os.Bundle) obj;
                ahvr.bY(((java.lang.String) this.a).equals(bundle.getString("accountType")));
                return bundle;
            case 3:
                return ((agpq) this.a).e(((defpackage.agon) obj).b);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int iAQ = a.aQ(adai.m((agqk) obj, (com.google.apps.tiktok.account.AccountId) this.a).e);
                if (iAQ != 0 && iAQ == 2) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return aogc.H(adai.m((agqk) obj, (com.google.apps.tiktok.account.AccountId) this.a));
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                akzx akzxVarP = ((agqk) obj).p();
                com.google.apps.tiktok.account.AccountId accountId = (com.google.apps.tiktok.account.AccountId) this.a;
                int iA = accountId.a();
                java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(akzxVarP.b.d);
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(iA);
                if (!mapUnmodifiableMap.containsKey(numValueOf)) {
                    throw new java.lang.IllegalArgumentException();
                }
                akzx akzxVarP2 = ((agqm) mapUnmodifiableMap.get(numValueOf)).p();
                akzxVarP2.u();
                agqm agqmVar = akzxVarP2.b;
                agqmVar.e = 1;
                agqmVar.b |= 4;
                akzxVarP.aq(accountId.a(), akzxVarP2.p());
                return akzxVarP.p();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.io.File[] fileArrListFiles = ((java.io.File) obj).listFiles(new defpackage.agry(this.a, i));
                if (fileArrListFiles == null) {
                    return null;
                }
                for (java.io.File file : fileArrListFiles) {
                    if (file.delete()) {
                        defpackage.agrx.a.b().l("com/google/apps/tiktok/cache/OrphanCacheAccountSynclet", "clean", 71, "OrphanCacheAccountSynclet.java").y("Removed orphaned cache file: %s", file);
                    } else {
                        defpackage.agrx.a.c().l("com/google/apps/tiktok/cache/OrphanCacheAccountSynclet", "clean", 73, "OrphanCacheAccountSynclet.java").y("Failed to remove orphaned cache file: %s", file);
                    }
                }
                return null;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ((aogc) this.a).b;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((aogc) this.a).b;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                int i2 = defpackage.agvu.b;
                return this.a.a(obj);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                int i3 = defpackage.agvu.b;
                return this.a.a(obj);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int i4 = defpackage.agvu.b;
                return this.a.a(obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                agxh agxhVar = (agxh) this.a;
                return agxhVar.f() ? agxh.a(obj, agxhVar.c()) : agxh.b(obj);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.ahau ahauVar = (defpackage.ahau) this.a;
                aify aifyVar = ahauVar.a;
                java.lang.Throwable th3 = (java.lang.Throwable) obj;
                defpackage.ahap ahapVar = defpackage.ahap.b;
                if (!aifyVar.contains(ahapVar)) {
                    return defpackage.ahas.d;
                }
                if (ahauVar.b) {
                    java.io.StringWriter stringWriter = new java.io.StringWriter();
                    th3.printStackTrace(new java.io.PrintWriter(stringWriter));
                    defpackage.ahaq ahaqVarA = defpackage.ahar.a();
                    ahaqVarA.b(true);
                    ahaqVarA.a = ahapVar;
                    ahaqVarA.c(akzc.w(stringWriter.toString()));
                    return ahaqVarA.a();
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                defpackage.zoe.B(sb, th3);
                for (java.lang.Throwable cause = th3.getCause(); cause != null; cause = cause.getCause()) {
                    sb.append("Caused by: ");
                    defpackage.zoe.B(sb, cause);
                }
                defpackage.ahaq ahaqVarA2 = defpackage.ahar.a();
                ahaqVarA2.b(false);
                ahaqVarA2.a = ahapVar;
                ahaqVarA2.c(akzc.w(sb.toString()));
                return ahaqVarA2.a();
            case 15:
                defpackage.ahar aharVar = (defpackage.ahar) obj;
                if (((defpackage.ahau) this.a).b || !aharVar.c) {
                    return aharVar;
                }
                throw new java.lang.IllegalStateException("DebugData may contain PII, but no PII was allowed.");
            case 16:
                this.a.a(obj);
                return null;
            case 17:
                return this.a.a(obj);
            case 18:
                return this.a.a(obj);
            case 19:
                return this.a.a(obj);
            default:
                return this.a.a(obj);
        }
    }

    public /* synthetic */ agnw(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
