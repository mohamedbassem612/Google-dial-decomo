package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class adck implements ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public adck(aonj aonjVar, defpackage.ahdr ahdrVar, int i) {
        this.$cid = i;
        this.a = aonjVar;
        this.b = ahdrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [adbv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v79, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [acwi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v88, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v89, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r0v92, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v33, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a() {
        ajcq ajcqVarY;
        ajcq ajcqVarB;
        int i = 15;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj = this.a;
                adcn adcnVar = (adcn) obj;
                ahzi ahziVar = adcnVar.b;
                int i3 = adbe.a;
                acve acveVar = (acve) ahziVar.eZ();
                if (acveVar == null || acveVar.equals(acve.a)) {
                    adbe.h("%s: The ManifestFileFlag is empty.", "ManifestFileGroupPopulator");
                    adcnVar.g(3, acve.a);
                    return ajcm.a;
                }
                if ((acveVar.b & 1) == 0 || acveVar.c.isEmpty() || (acveVar.b & 2) == 0 || !acveVar.d.startsWith("https")) {
                    adcnVar.g(402, acveVar);
                    adbe.c("%s: Invalid manifest config from manifest flag.", "ManifestFileGroupPopulator");
                    return aiql.y(new java.lang.IllegalArgumentException("Invalid manifest flag."));
                }
                ?? r0 = this.b;
                java.lang.String str = acveVar.d;
                android.net.Uri uriBuild = adcnVar.a.buildUpon().appendPath(acveVar.c).build();
                java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(adcn.f(str, 2, ahwt.a));
                java.lang.String str2 = acveVar.c;
                adai adaiVar = adcnVar.f;
                defpackage.adcs adcsVarE = defpackage.adcs.e(acvh.a(ahvr.H(((afhf) adaiVar.a).c(), new defpackage.aczo(str2, 16), (java.util.concurrent.Executor) adaiVar.b), defpackage.acvg.MANIFEST_FILE_GROUP_POPULATOR_METADATA_IO_ERROR, "Failed to read bookkeeping."));
                defpackage.aczo aczoVar = new defpackage.aczo(atomicReference, i);
                java.util.concurrent.Executor executor = adcnVar.d;
                defpackage.adcs adcsVarG = adcsVarE.f(aczoVar, executor).g(new defpackage.acyj(adcnVar, str, uriBuild, atomicReference, 12), executor);
                defpackage.adcs adcsVarG2 = defpackage.adcs.e(defpackage.adcs.e(adcsVarG).f(new aczn(13), executor).b(java.lang.Throwable.class, new aczn(14), executor)).g(new defpackage.acyf(adcnVar, atomicReference, (acwi) r0, uriBuild, str, 6), executor);
                ajcq ajcqVarI = ahvr.I(ahvr.C(adcsVarG2, java.lang.Throwable.class, new defpackage.aczq(obj, (java.lang.Object) atomicReference, (java.lang.Object) uriBuild, 7, (char[]) null), executor), new defpackage.aczq(obj, (java.lang.Object) acveVar, (java.lang.Object) atomicReference, 8, (byte[]) (0 == true ? 1 : 0)), executor);
                return ahvr.I(ajcqVarI, new defpackage.acyf(obj, (ajcq) adcsVarG, (ajcq) adcsVarG2, (java.lang.Object) ajcqVarI, (java.lang.Object) acveVar, 7), executor);
            case 1:
                java.lang.Object obj2 = this.a;
                java.lang.Object obj3 = this.b;
                try {
                    ?? r2 = ((ahbq) obj3).b;
                    r2.remove(obj2);
                    ((ahbq) obj3).a.b((java.lang.String) obj2, r2.size());
                    return ajcm.a;
                } catch (java.lang.Exception e) {
                    adbe.g(e, "%s: Failed to remove download future (%s) from map", new java.lang.Object[]{"DownloadFutureMap", obj2});
                    return aiql.y(e);
                }
            case 2:
                return aiql.z((java.io.InputStream) ((aogc) ((adag) this.a).b).M((android.net.Uri) this.b, new affr()));
            case 3:
                return ((adqn) this.b).g((java.lang.String) this.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aetr aetrVar = (aetr) this.b;
                return aetrVar.b(((aetp) aetrVar.d.a()).c((java.lang.Iterable) this.a));
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.Object obj4 = this.a;
                afgx afgxVar = (afgx) obj4;
                android.net.Uri uri = (android.net.Uri) aiql.H(afgxVar.b);
                afey afeyVar = new afey((java.io.Closeable) afgxVar.m.M(uri, new affo(false, false)));
                java.lang.Object obj5 = this.b;
                try {
                    try {
                        ((afgx) obj4).c(uri);
                        ajcqVarY = ajcm.a;
                        break;
                    } catch (java.io.IOException e2) {
                        ajcqVarY = afgx.e(e2) ? aiql.y(e2) : ((afgd) obj5).a(e2, ((afgx) obj4).e);
                    }
                    ajcq ajcqVarB2 = afgx.b(ajcqVarY, afeyVar.a(), ((afgx) obj4).c);
                    afeyVar.close();
                    return ajcqVarB2;
                } catch (java.lang.Throwable th) {
                    try {
                        afeyVar.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((xtq) this.a).v((com.google.apps.tiktok.account.AccountId) this.b);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.agnp agnpVar = (defpackage.agnp) this.a.a();
                return ajan.f(agnpVar.a((defpackage.agns) this.b), new defpackage.agnw(agnpVar, i2), ajbm.a);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                final ajdd ajddVar = new ajdd();
                android.accounts.AccountManagerCallback<android.os.Bundle> accountManagerCallback = new android.accounts.AccountManagerCallback() { // from class: agph
                    @Override // android.accounts.AccountManagerCallback
                    public final void run(android.accounts.AccountManagerFuture accountManagerFuture) {
                        ucm.f(ajddVar, accountManagerFuture);
                    }
                };
                defpackage.agpj agpjVar = (defpackage.agpj) this.a;
                java.lang.Object obj6 = agpjVar.d;
                java.lang.Object obj7 = agpjVar.c;
                java.lang.Object obj8 = agpjVar.b;
                java.lang.String str3 = agpjVar.a;
                ucm ucmVar = (ucm) this.b;
                final android.accounts.AccountManagerFuture<android.os.Bundle> accountManagerFutureAddAccount = ((android.accounts.AccountManager) ucmVar.c).addAccount(str3, (java.lang.String) obj8, null, (android.os.Bundle) obj7, (android.app.Activity) obj6, accountManagerCallback, (android.os.Handler) ucmVar.b);
                ajddVar.c(new java.lang.Runnable() { // from class: agpi
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ajddVar.isCancelled()) {
                            accountManagerFutureAddAccount.cancel(true);
                        }
                    }
                }, ajbm.a);
                return ajddVar;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.lang.Object obj9 = this.a;
                java.lang.Object obj10 = this.b;
                ahoq ahoqVarW = ahvr.W(1302, "AccountDataServiceClient.getAccountNameFromAccountId");
                try {
                    ajcq ajcqVarE = aazc.e(((agpt) obj10).e.a((java.lang.String) obj9));
                    ahoqVarW.a(ajcqVarE);
                    ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
                    return ajcqVarE;
                } catch (java.lang.Throwable th3) {
                    try {
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        ajsz.ak(ahoqVarW, th3);
                        throw th4;
                    }
                }
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj11 = this.a;
                java.lang.Object obj12 = this.b;
                ahoq ahoqVarW2 = ahvr.W(1296, "Fast GoogleAuthUtilWrapper.getAccountId");
                try {
                    ajcq ajcqVarE2 = aazc.e(((agpt) obj12).g.a((java.lang.String) obj11));
                    ahoqVarW2.a(ajcqVarE2);
                    ajsz.ak(ahoqVarW2, (java.lang.Throwable) null);
                    return ajcqVarE2;
                } catch (java.lang.Throwable th5) {
                    try {
                        throw th5;
                    } catch (java.lang.Throwable th6) {
                        ajsz.ak(ahoqVarW2, th5);
                        throw th6;
                    }
                }
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return ((aogc) ((agqj) this.a).h).G(new defpackage.agnw(this.b, 6), ajbm.a);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return agqj.a((defpackage.agos) this.b, (java.util.Set) ((agqj) this.a).d.a()).b(new aczf(11), ajbm.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.String strA = defpackage.agqo.a((com.google.apps.tiktok.account.AccountId) this.b);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                adai adaiVar2 = (adai) this.a;
                ailj ailjVarK = ((ajwr) adaiVar2.b).j().k();
                while (ailjVarK.hasNext()) {
                    arrayList.add(adaiVar2.k(new java.io.File((java.io.File) ailjVarK.next(), strA)));
                }
                return aiql.aa(arrayList).b(new kve(12), ajbm.a);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ahvr.I((ajcq) this.a, new defpackage.agpe(new defpackage.ahdu(this.b, 1, (byte[]) null), 7), ajbm.a);
            case 15:
                java.lang.Object obj13 = this.b;
                defpackage.ahdr ahdrVar = (defpackage.ahdr) this.a;
                if (aooh.n(obj13, ahdrVar.c)) {
                    return aiql.z((java.lang.Object) null);
                }
                com.google.apps.tiktok.account.AccountId accountId = (com.google.apps.tiktok.account.AccountId) obj13;
                ahdrVar.c = accountId;
                defpackage.ahdq ahdqVar = (defpackage.ahdq) afsq.S(ahdrVar.a, defpackage.ahdq.class, accountId);
                ajcq ajcqVarB3 = ahdrVar.b.b(accountId);
                ?? r4 = ahdqVar.m().b;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(r4.size());
                java.util.Iterator it = r4.entrySet().iterator();
                while (true) {
                    int i4 = 10;
                    if (!it.hasNext()) {
                        java.util.List listAY = ajsz.aY(ajcqVarB3);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(ajsz.bl(arrayList2, 10));
                        java.util.Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(((ucm) it2.next()).c);
                        }
                        return ahvr.ah(ajsz.bT(listAY, arrayList3)).p(ahqx.b(new vto(arrayList2, ahdrVar, ajcqVarB3, 14)), ajbm.a);
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    java.lang.String str4 = (java.lang.String) entry.getKey();
                    ahce ahceVar = (ahce) entry.getValue();
                    agtc agtcVar = ahceVar.p;
                    if (agtcVar.c()) {
                        ajcqVarB = agtcVar.a();
                    } else {
                        ahoq ahoqVarZ = ahvr.Z(1351, "Loading flags async for: ".concat(java.lang.String.valueOf(ahceVar.q)));
                        try {
                            ajcqVarB = ahceVar.u.b(ahceVar.b, new defpackage.adbi(ahceVar, i));
                            ahoqVarZ.a(ajcqVarB);
                            ajsz.ak(ahoqVarZ, (java.lang.Throwable) null);
                        } catch (java.lang.Throwable th7) {
                            try {
                                throw th7;
                            } catch (java.lang.Throwable th8) {
                                ajsz.ak(ahoqVarZ, th7);
                                throw th8;
                            }
                        }
                    }
                    arrayList2.add(new ucm(str4, ahvr.H(ajcqVarB, new defpackage.agnw(new defpackage.agkh(i4), 18), ajbm.a), ((ahce) entry.getValue()).d()));
                }
                break;
            case 16:
                return this.a.a(((defpackage.ahdr) this.b).c);
            case 17:
                return ahvr.F((java.util.concurrent.Callable) this.a, ((defpackage.aheo) this.b).e);
            case 18:
                ahlt.a.b().l("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "scheduleNextSyncInline", 625, "SyncManagerImpl.java").v("Scheduling next wakeup");
                ahlt ahltVar = (ahlt) this.b;
                ajcq ajcqVarG = ahltVar.g((ajcq) this.a, ((java.lang.Long) aiql.H(ahltVar.g)).longValue());
                ahltVar.d.f(ajcqVarG, "SyncManager: Scheduling inline");
                ajcqVarG.c(new ahjn(ajcqVarG, 4), ahltVar.b);
                return ajcqVarG;
            case 19:
                ahlt.a.b().l("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "runSynclet", 428, "SyncManagerImpl.java").y("Starting synclet: %s", new akct(akcs.a, ((ahlv) this.a).b.b()));
                ahlc ahlcVar = (ahlc) this.b;
                boolean z = ahlcVar.b;
                ahvr.bZ(z, "Synclet binding must be enabled to have a Synclet");
                ahvr.bZ(z, "Synclet binding must be enabled to have a SyncletProvider");
                aoin aoinVar = ahlcVar.c;
                ahvr.ci(aoinVar);
                ahlb ahlbVar = (ahlb) aoinVar.a();
                ahvr.ci(ahlbVar);
                return ahlbVar.a();
            default:
                return ((ahmc) this.a).d.h(((androidx.work.WorkerParameters) this.b).a);
        }
    }

    public /* synthetic */ adck(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ adck(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
