package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aczq implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ aczq(defpackage.abtr abtrVar, com.google.apps.tiktok.account.AccountId accountId, com.google.apps.tiktok.account.api.AccountOperationContext accountOperationContext, int i) {
        this.$cid = i;
        this.a = abtrVar;
        this.c = accountId;
        this.b = accountOperationContext;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: acvh */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v26, types: [aczw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v84, types: [ajcq, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v27, types: [aczw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v40, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v51, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v79, types: [ajat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v85, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v74, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v9, types: [aczw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, java.util.Set] */
    public final ajcq a(java.lang.Object obj) throws acvh {
        com.google.apps.tiktok.account.AccountId accountId;
        byte[] bArr = null;
        int i = 0;
        final int i2 = 1;
        switch (this.$cid) {
            case 0:
                android.net.Uri uri = (android.net.Uri) obj;
                if (uri == null) {
                    yg ygVarB = acvh.b();
                    ygVarB.b = defpackage.acvg.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                    throw ygVarB.d();
                }
                java.lang.Object obj2 = this.b;
                java.lang.Object obj3 = this.a;
                if (!((defpackage.acwg) obj2).e) {
                    defpackage.acvr acvrVar = (defpackage.acvr) this.c;
                    defpackage.adau.d((aogc) ((adlt) obj3).g, acvrVar, uri, acvrVar.g);
                } else if (!((aogc) ((adlt) obj3).g).R(uri)) {
                    yg ygVarB2 = acvh.b();
                    ygVarB2.b = defpackage.acvg.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                    throw ygVarB2.d();
                }
                return ajcm.a;
            case 1:
                defpackage.acwg acwgVar = (defpackage.acwg) obj;
                defpackage.acwa acwaVarB = defpackage.acwa.b(acwgVar.d);
                if (acwaVarB == null) {
                    acwaVarB = defpackage.acwa.NONE;
                }
                if (acwaVarB != defpackage.acwa.DOWNLOAD_COMPLETE) {
                    return ajcm.a;
                }
                java.lang.Object obj4 = this.c;
                java.lang.Object obj5 = this.b;
                java.lang.Object obj6 = this.a;
                adlt adltVar = (adlt) obj6;
                defpackage.adcs adcsVarE = defpackage.adcs.e(adltVar.i((defpackage.acwe) obj5));
                int[] iArr = null;
                defpackage.aczq aczqVar = new defpackage.aczq(obj6, acwgVar, obj4, 0, iArr);
                ?? r14 = adltVar.h;
                return adcsVarE.g(aczqVar, r14).d(acvh.class, new defpackage.aczq(obj6, acwgVar, obj5, 2, iArr), r14);
            case 2:
                adbe.d("%s: reVerifyFile lost or corrupted code %s", "SharedFileManager", ((acvh) obj).a);
                akzx akzxVarP = ((alad) this.b).p();
                defpackage.acwa acwaVar = defpackage.acwa.CORRUPTED;
                akzxVarP.u();
                defpackage.acwg acwgVar2 = (defpackage.acwg) akzxVarP.b;
                acwgVar2.d = acwaVar.h;
                acwgVar2.b |= 2;
                defpackage.acwg acwgVar3 = (defpackage.acwg) akzxVarP.p();
                adlt adltVar2 = (adlt) this.a;
                return defpackage.adcs.e(adltVar2.e.h((defpackage.acwe) this.c, acwgVar3)).g(new defpackage.acwn(10), adltVar2.h);
            case 3:
                java.lang.Object obj7 = this.a;
                defpackage.acwa acwaVar2 = defpackage.acwa.DOWNLOAD_IN_PROGRESS;
                akzx akzxVar = (akzx) obj7;
                akzxVar.u();
                defpackage.acwg acwgVar4 = (defpackage.acwg) akzxVar.b;
                defpackage.acwg acwgVar5 = defpackage.acwg.a;
                acwgVar4.d = acwaVar2.h;
                acwgVar4.b |= 2;
                return ((adlt) this.b).e.h((defpackage.acwe) this.c, (defpackage.acwg) akzxVar.p());
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.String str = (java.lang.String) obj;
                int iAQ = a.aQ(((defpackage.acwe) this.b).f);
                return ((adlt) this.a).n(iAQ != 0 ? iAQ : 1, str, ((defpackage.acvr) this.c).g);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.acwg acwgVar6 = (defpackage.acwg) obj;
                akzx akzxVarP2 = acwgVar6.p();
                akzxVarP2.u();
                defpackage.acwg acwgVar7 = (defpackage.acwg) akzxVarP2.b;
                defpackage.acwa acwaVar3 = (defpackage.acwa) this.c;
                acwgVar7.d = acwaVar3.h;
                acwgVar7.b |= 2;
                if (acwaVar3.equals(defpackage.acwa.CORRUPTED)) {
                    int i3 = acwgVar6.h + 1;
                    akzxVarP2.u();
                    defpackage.acwg acwgVar8 = (defpackage.acwg) akzxVarP2.b;
                    acwgVar8.b |= 32;
                    acwgVar8.h = i3;
                }
                return this.a.h((defpackage.acwe) this.b, (defpackage.acwg) akzxVarP2.p());
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ahyn ahynVar = (ahyn) obj;
                if (!ahynVar.f()) {
                    adbe.h("%s: stopDownloading on non-existent download", "MddFileDownloader");
                    return ajcm.a;
                }
                java.lang.Object obj8 = this.a;
                java.lang.Object obj9 = this.c;
                java.lang.Object obj10 = this.b;
                int i4 = adbe.a;
                ((ajcq) ahynVar.b()).cancel(true);
                return ((adax) obj10).b((java.lang.String) obj8, (android.net.Uri) obj9);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.util.concurrent.atomic.AtomicReference atomicReference = (java.util.concurrent.atomic.AtomicReference) this.a;
                akzx akzxVarP3 = ((defpackage.adco) atomicReference.get()).p();
                akzxVarP3.u();
                defpackage.adco adcoVar = (defpackage.adco) akzxVarP3.b;
                adcoVar.e = 1;
                adcoVar.b |= 4;
                atomicReference.set((defpackage.adco) akzxVarP3.p());
                ((adcn) this.b).d((android.net.Uri) this.c);
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                wym wymVar = new wym(((acve) this.c).c, (defpackage.adco) ((java.util.concurrent.atomic.AtomicReference) this.a).get(), 17);
                adai adaiVar = ((adcn) this.b).f;
                return acvh.a(((afhf) adaiVar.a).a(wymVar, (java.util.concurrent.Executor) adaiVar.b), defpackage.acvg.MANIFEST_FILE_GROUP_POPULATOR_METADATA_IO_ERROR, "Failed to write bookkeeping.");
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.acxj acxjVar = (defpackage.acxj) obj;
                boolean z = acxjVar.a;
                java.lang.Object obj11 = this.b;
                if (!z) {
                    ((java.util.concurrent.atomic.AtomicReference) this.a).set(adcn.f((java.lang.String) obj11, 3, acxjVar.b));
                    return ajcm.a;
                }
                adbe.e("%s: Manifest file on server changed during download, download failed; urlToDownload = %s; manifestFileUri = %s", new java.lang.Object[]{"ManifestFileGroupPopulator", obj11, this.c});
                yg ygVarB3 = acvh.b();
                ygVarB3.b = defpackage.acvg.MANIFEST_FILE_GROUP_POPULATOR_CONTENT_CHANGED_DURING_DOWNLOAD_ERROR;
                ygVarB3.d = "Manifest file on server changed during download.";
                return aiql.y(ygVarB3.d());
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Throwable thCp = agab.cp((java.lang.Throwable) obj);
                if (!(thCp instanceof java.util.concurrent.CancellationException)) {
                    ((tvn) ((ahct) this.c).d).P(new adfq() { // from class: adgt
                        public final void a(java.lang.Object obj12) {
                            int i5 = i2;
                            if (i5 == 0) {
                                ((defpackage.adgz) obj12).c();
                                return;
                            }
                            if (i5 == 1) {
                                ((defpackage.adgz) obj12).a();
                                return;
                            }
                            if (i5 == 2) {
                                ((defpackage.adgz) obj12).a();
                                return;
                            }
                            if (i5 == 3) {
                                ((java.lang.Runnable) obj12).run();
                                return;
                            }
                            if (i5 == 4) {
                                long j = adna.a;
                                ((defpackage.adnb) obj12).k();
                            } else if (i5 != 5) {
                                java.lang.Object obj13 = adnd.a;
                                ((defpackage.adnb) obj12).l();
                            } else {
                                java.lang.Object obj14 = adnd.a;
                                ((defpackage.adnb) obj12).l();
                            }
                        }
                    });
                    thCp.getMessage();
                    adhl.a();
                }
                return this.a;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                if (!((defpackage.adov) ((defpackage.amdx) this.c).a).equals(defpackage.adov.e)) {
                    j$.util.Optional optional = (j$.util.Optional) this.a;
                    if (optional.isPresent()) {
                        ((adnw) optional.get()).b.isPresent();
                        if (!((java.lang.String) ((adnw) optional.get()).b.get()).isEmpty()) {
                            defpackage.adow adowVar = (defpackage.adow) this.b;
                            adpe adpeVar = adowVar.i;
                            if (adpeVar.h()) {
                                adowVar.o.d(adpeVar.e());
                                return adowVar.e((adnw) optional.get());
                            }
                        }
                    }
                }
                return aiql.z(java.lang.Boolean.TRUE);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.lang.Object obj12 = this.a;
                defpackage.adow adowVar2 = (defpackage.adow) obj12;
                adowVar2.j();
                java.lang.Object obj13 = adowVar2.d;
                java.lang.Object obj14 = this.c;
                java.lang.Object obj15 = this.b;
                synchronized (obj13) {
                    if (((defpackage.adow) obj12).a() == defpackage.adov.b) {
                        ((defpackage.adow) obj12).o.d(((defpackage.adow) obj12).i.e());
                        if (((defpackage.adov) ((defpackage.amdx) obj15).a).equals(defpackage.adov.e)) {
                            return ((defpackage.adow) obj12).e((adnw) obj14);
                        }
                    }
                    return aiql.z(java.lang.Boolean.TRUE);
                }
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                aify aifyVarP = (java.util.List) obj;
                aezd aezdVar = (aezd) this.b;
                if (!aezdVar.e) {
                    aifyVarP = aify.p("");
                }
                aift aiftVar = new aift(4);
                java.util.Iterator it = aifyVarP.iterator();
                while (true) {
                    java.lang.Object obj16 = this.c;
                    if (!it.hasNext()) {
                        return aiql.Y(aiftVar.h()).b(new aczf(9), ((aewq) obj16).c());
                    }
                    java.lang.Object obj17 = this.a;
                    java.lang.String str2 = (java.lang.String) it.next();
                    apnt apntVar = aezl.a;
                    if (apntVar == null || !apntVar.g((java.lang.String) obj17, str2)) {
                        aewq aewqVar = (aewq) obj16;
                        aezt aeztVar = new aezt(aewqVar, (java.lang.String) obj17, str2, aezdVar.c);
                        ajcq ajcqVarC = aeztVar.c(aezdVar.d ? aewqVar.c.getSharedPreferences("PhenotypeStickyAccount", 0).getString(aezdVar.a, "") : str2);
                        ajck ajckVarW = ajck.w(ajcqVarC);
                        j$.util.Objects.requireNonNull(aeztVar);
                        aiftVar.i(ajckVarW.y(new adfd(aeztVar, 14), aewqVar.c()).y(new defpackage.acyj(aewqVar, ajcqVarC, aezdVar, str2, 14), aewqVar.c()));
                    }
                }
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                if (!((aezs) obj).a) {
                    return ajcm.a;
                }
                java.lang.Object obj18 = this.b;
                java.lang.Object obj19 = this.a;
                aewq aewqVar2 = (aewq) this.c;
                return ajck.w(aewqVar2.b().k((java.lang.String) obj19)).y(new adfd(obj18, 15), aewqVar2.c());
            case 15:
                ?? r15 = this.b;
                ?? r0 = this.a;
                return aiql.H((java.util.concurrent.Future) r15).equals(aiql.H((java.util.concurrent.Future) r0)) ? r0 : ajan.g(((afgx) this.c).f((ajcq) r0), ahqx.c(new adfd((java.lang.Object) r0, 17)), ajbm.a);
            case 16:
                return ((afhf) ((apnt) this.c).a).b.g((ajat) this.b, (java.util.concurrent.Executor) this.a);
            case 17:
                defpackage.agon agonVar = (defpackage.agon) obj;
                if (!((defpackage.abtr) this.a).b.contains(agonVar.b.j)) {
                    ahvr.bZ(agonVar.c != 3, "Can't auto-select disabled accounts.");
                }
                java.lang.Object obj20 = this.b;
                com.google.apps.tiktok.account.api.AccountOperationContext accountOperationContext = (com.google.apps.tiktok.account.api.AccountOperationContext) obj20;
                ahvr.bZ(accountOperationContext.a.compareAndSet(false, true), "AccountOperationContext is already in the mutable state. This may be caused by concurrent access to the object, which is forbidden.");
                defpackage.agms agmsVar = new defpackage.agms(accountOperationContext);
                try {
                    ajcq ajcqVarZ = aiql.z((java.lang.Object) null);
                    java.lang.Object obj21 = this.c;
                    agmsVar.close();
                    return ajan.f(ajcqVarZ, ahqx.a(new defpackage.agnx(obj21, obj20, i)), ajbm.a);
                } catch (java.lang.Throwable th) {
                    try {
                        agmsVar.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 18:
                com.google.apps.tiktok.account.api.controller.AccountActionResult accountActionResult = (com.google.apps.tiktok.account.api.controller.AccountActionResult) obj;
                return (accountActionResult.c != null || (accountId = accountActionResult.a) == null) ? this.a : ((defpackage.abtr) this.b).h(accountId, (android.content.Intent) this.c, accountActionResult.e);
            case 19:
                com.google.apps.tiktok.account.api.controller.ValidationResult validationResult = (com.google.apps.tiktok.account.api.controller.ValidationResult) obj;
                boolean zC = validationResult.c();
                java.lang.Object obj22 = this.b;
                java.lang.Object obj23 = this.c;
                if (zC) {
                    return ajan.f(((adag) ((defpackage.abtr) this.a).e).g((com.google.apps.tiktok.account.AccountId) obj23), ahqx.a(new defpackage.agnx(validationResult, obj22, i2, bArr)), ajbm.a);
                }
                ahvr.bY(!validationResult.c());
                return aiql.z(new com.google.apps.tiktok.account.api.controller.AccountActionResult((com.google.apps.tiktok.account.AccountId) obj23, agoq.a, validationResult, null, (com.google.apps.tiktok.account.api.AccountOperationContext) obj22));
            default:
                defpackage.agon agonVar2 = (defpackage.agon) obj;
                aooh.f(agonVar2, "account");
                return ((aogc) this.b).q((java.lang.String) this.a, (com.google.apps.tiktok.account.AccountId) this.c, agonVar2.b, true);
        }
    }

    public /* synthetic */ aczq(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ aczq(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ aczq(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ aczq(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, int[] iArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ aczq(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }
}
