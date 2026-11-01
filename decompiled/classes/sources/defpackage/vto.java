package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class vto implements defpackage.ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ vto(defpackage.aetr aetrVar, aeto aetoVar, defpackage.aevn aevnVar, int i) {
        this.$cid = i;
        this.b = aetrVar;
        this.a = aetoVar;
        this.c = aevnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v164, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v168, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v176, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v189, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v195, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v205, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v222, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v65, types: [adti, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v29, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v69, types: [ajat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32, types: [ajcq, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v52, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v53, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v17, types: [adbv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [ajas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v67, types: [agqx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v72, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v47, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // defpackage.ajas
    public final defpackage.ajcq a() throws java.io.IOException {
        defpackage.ajcq ajcqVarY;
        android.net.NetworkInfo activeNetworkInfo;
        int iAS;
        defpackage.ajcq ajcqVarG;
        defpackage.ajcq ajcqVarY2;
        defpackage.ajcq ajcqVarZ;
        defpackage.ajcq ajcqVarY3;
        int i = 12;
        int i2 = 20;
        java.util.ArrayList arrayList = null;
        int i3 = 3;
        switch (this.$cid) {
            case 0:
                if (((java.util.List) defpackage.aiql.H(this.b)).isEmpty()) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.vtp.a.b()).l("com/android/dialer/voicemail/tab/impl/VoicemailTabImpl", "getShouldShowVvmTabState", 117, "VoicemailTabImpl.java")).v("SIM not present");
                    defpackage.akzx akzxVarM = defpackage.vtn.a.m();
                    akzxVarM.u();
                    defpackage.vtn vtnVar = (defpackage.vtn) akzxVarM.b;
                    vtnVar.b |= 1;
                    vtnVar.c = true;
                    akzxVarM.u();
                    defpackage.vtn vtnVar2 = (defpackage.vtn) akzxVarM.b;
                    vtnVar2.d = 2;
                    vtnVar2.b |= 2;
                    return defpackage.aiql.z((defpackage.vtn) akzxVarM.r());
                }
                java.lang.Object obj = this.a;
                defpackage.vtp vtpVar = (defpackage.vtp) obj;
                if (vtpVar.c.g().isPresent()) {
                    return defpackage.ahvr.H(defpackage.aiql.v((java.lang.Iterable) j$.util.Collection.-EL.stream((defpackage.aify) defpackage.aiql.H(this.c)).map(new defpackage.thy(obj, i2)).collect(defpackage.aido.a)), new defpackage.vrx(i3), vtpVar.b);
                }
                ((defpackage.aimw) ((defpackage.aimw) defpackage.vtp.a.b()).l("com/android/dialer/voicemail/tab/impl/VoicemailTabImpl", "getShouldShowVvmTabState", 129, "VoicemailTabImpl.java")).v("VvmService is not available. This means that the legacy VVM is used.");
                defpackage.akzx akzxVarM2 = defpackage.vtn.a.m();
                akzxVarM2.u();
                defpackage.vtn vtnVar3 = (defpackage.vtn) akzxVarM2.b;
                vtnVar3.b |= 1;
                vtnVar3.c = false;
                akzxVarM2.u();
                defpackage.vtn vtnVar4 = (defpackage.vtn) akzxVarM2.b;
                vtnVar4.d = 3;
                vtnVar4.b |= 2;
                return defpackage.aiql.z((defpackage.vtn) akzxVarM2.r());
            case 1:
                ?? r0 = this.b;
                defpackage.vcr vcrVar = defpackage.vgg.a;
                if (((java.lang.Boolean) defpackage.aiql.H(r0)).booleanValue()) {
                    return ((defpackage.vcg) defpackage.aiql.H(this.c)).g((android.telecom.PhoneAccountHandle) this.a);
                }
                ((defpackage.aimw) ((defpackage.aimw) defpackage.vgg.c.b()).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmSyncService", "shouldDownloadAudio", 666, "OmtpVvmSyncService.java")).v("skip fetch audio since the network is roaming");
                return defpackage.aiql.z(vcf.a);
            case 2:
                ?? r3 = this.c;
                java.lang.Object obj2 = this.b;
                abtr abtrVar = (abtr) this.a;
                return defpackage.ahvr.I(defpackage.aosv.F(abtrVar.e, 0, new ugg(abtrVar, (wor) obj2, (defpackage.ajas) r3, (defpackage.aoln) null, 20), 3), new wkv(new defpackage.ukw(14), 9), abtrVar.b);
            case 3:
                ?? r4 = this.c;
                java.lang.Object obj3 = this.b;
                abtr abtrVar2 = (abtr) this.a;
                return defpackage.aosv.F(abtrVar2.e, 0, new ugg(abtrVar2, (wor) obj3, (defpackage.aonj) r4, (defpackage.aoln) null, 19), 3);
            case 4:
                defpackage.aify aifyVar = (defpackage.aify) defpackage.aiql.H(this.c);
                wzk wzkVar = ((wze) this.a).d;
                defpackage.aigf aigfVar = wzk.a;
                defpackage.aoin aoinVar = wzkVar.c;
                if (!aigfVar.containsKey(aoinVar.a())) {
                    return defpackage.aiql.y(new java.lang.IllegalStateException(java.lang.String.format("flag domain: %s not found", aoinVar.a())));
                }
                java.lang.Object obj4 = this.b;
                java.lang.String str = (java.lang.String) aigfVar.get(aoinVar.a());
                defpackage.akzx akzxVarM3 = ahwh.a.m();
                akzxVarM3.u();
                ahwh ahwhVar = akzxVarM3.b;
                j$.util.Objects.requireNonNull(obj4);
                xac xacVar = (xac) obj4;
                ahwhVar.d = xacVar;
                ahwhVar.b |= 2;
                java.lang.String str2 = xacVar.i;
                akzxVarM3.u();
                ahwh ahwhVar2 = akzxVarM3.b;
                j$.util.Objects.requireNonNull(str2);
                ahwhVar2.b |= 4;
                ahwhVar2.e = str2;
                return defpackage.ahrv.g(defpackage.ahvr.F(new wzc(aifyVar, akzxVarM3, 3), wzkVar.d)).i(new why(wzkVar, str, (defpackage.alad) obj4, 5), wzkVar.e).h(new wzj(0), wzkVar.f);
            case 5:
                int i4 = defpackage.adbe.a;
                ?? r1 = ((abtr) this.a).b;
                java.lang.Object obj5 = this.c;
                java.net.HttpURLConnection httpURLConnectionA = r1.a((java.lang.String) obj5);
                httpURLConnectionA.setRequestMethod("HEAD");
                java.lang.Object objG = this.b;
                defpackage.ahyn ahynVar = (defpackage.ahyn) objG;
                if (ahynVar.f()) {
                    httpURLConnectionA.setRequestProperty("If-None-Match", (java.lang.String) ahynVar.b());
                }
                try {
                    try {
                        httpURLConnectionA.connect();
                        int responseCode = httpURLConnectionA.getResponseCode();
                        if (responseCode != 304) {
                            if (responseCode != 200) {
                                yg ygVarB = defpackage.acvh.b();
                                ygVarB.b = acvg.g;
                                ygVarB.d = defpackage.a.bj(responseCode, "Http request failed; code = ");
                                ajcqVarY = defpackage.aiql.y(ygVarB.d());
                                return ajcqVarY;
                            }
                            objG = defpackage.ahyn.g(httpURLConnectionA.getHeaderField("ETag"));
                        }
                        return defpackage.aiql.z(objG);
                    } finally {
                        httpURLConnectionA.disconnect();
                    }
                } catch (java.io.IOException e) {
                    yg ygVarB2 = defpackage.acvh.b();
                    ygVarB2.b = acvg.k;
                    ygVarB2.d = defpackage.a.bx((java.lang.String) obj5, "Failed while connecting to ");
                    ygVarB2.c = e;
                    ajcqVarY = defpackage.aiql.y(ygVarB2.d());
                }
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Object obj6 = this.b;
                java.lang.Object obj7 = this.c;
                java.lang.Object obj8 = this.a;
                try {
                    ?? r5 = ((defpackage.ahbq) obj8).a;
                    ?? r2 = ((defpackage.ahbq) obj8).b;
                    r5.a((java.lang.String) obj7, r2.size() + 1);
                    r2.put(obj7, obj6);
                    return defpackage.ajcm.a;
                } catch (java.lang.Exception e2) {
                    defpackage.adbe.g(e2, "%s: Failed to add download future (%s) to map", "DownloadFutureMap", obj7);
                    return defpackage.aiql.y(e2);
                }
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((com.google.android.libraries.mdi.download.workmanager.workers.PeriodicWorker) this.b).d.g((java.lang.String) this.c, com.google.android.libraries.mdi.download.workmanager.workers.PeriodicWorker.c((defpackage.grp) this.a));
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                ?? r6 = this.b;
                java.lang.Object obj9 = this.a;
                try {
                    if (((com.google.android.libraries.micore.superpacks.SyncResult) defpackage.aiql.H(r6)).e()) {
                        ((defpackage.tvn) ((defpackage.ahct) obj9).d).P(new adgt(0));
                    }
                    break;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable thCp = defpackage.agab.cp(th);
                    if (!(thCp instanceof java.util.concurrent.CancellationException)) {
                        ((defpackage.tvn) ((defpackage.ahct) obj9).d).P(new adgt(2));
                        thCp.getMessage();
                        defpackage.adhl.a();
                    }
                }
                return r6;
            case 9:
                java.lang.Object obj10 = this.c;
                java.lang.Object obj11 = this.b;
                try {
                    int iAM = defpackage.a.aM(((defpackage.apga) ((defpackage.aetr) obj11).e.a()).e);
                    java.lang.Object obj12 = this.a;
                    if (iAM != 0 && iAM == 5) {
                        ((aeto) obj12).q = (defpackage.aevn) obj10;
                    }
                    android.content.Context context = ((defpackage.aetr) obj11).a;
                    ((aeto) obj12).l = ((defpackage.aetr) obj11).h.q();
                    int type = -1;
                    try {
                        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
                        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                            type = activeNetworkInfo.getType();
                        }
                        break;
                    } catch (java.lang.SecurityException e3) {
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(e3)).l("com/google/android/libraries/performance/primes/metrics/network/NetworkCapture", "getNetworkType", '$', "NetworkCapture.java")).v("Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml");
                    }
                    int iG = defpackage.aoog.g(type);
                    ((aeto) obj12).s = iG != 0 ? iG : 1;
                    int i5 = ((defpackage.aetn) ((defpackage.aetr) obj11).b.a()).a;
                    synchronized (((defpackage.aetr) obj11).c) {
                        ((defpackage.aetr) obj11).f.ensureCapacity(i5);
                        ((defpackage.aetr) obj11).f.add(obj12);
                        if (((defpackage.aetr) obj11).f.size() >= i5) {
                            arrayList = ((defpackage.aetr) obj11).f;
                            ((defpackage.aetr) obj11).f = new java.util.ArrayList(0);
                        }
                        break;
                    }
                    defpackage.ajcq ajcqVarB = arrayList == null ? defpackage.ajcm.a : ((defpackage.aetr) obj11).b(((defpackage.aetp) ((defpackage.aetr) obj11).d.a()).c(arrayList));
                    ((defpackage.aetr) obj11).g.decrementAndGet();
                    return ajcqVarB;
                } catch (java.lang.Throwable th2) {
                    ((defpackage.aetr) obj11).g.decrementAndGet();
                    throw th2;
                }
            case 10:
                defpackage.aeue aeueVar = (defpackage.aeue) this.a;
                if (!aeueVar.a.b(null)) {
                    return defpackage.ajcm.a;
                }
                defpackage.akzx akzxVar = (defpackage.akzx) this.b;
                int iAS2 = defpackage.a.aS(((defpackage.apfj) akzxVar.b).s);
                if (((iAS2 != 0 && iAS2 == 3) || ((iAS = defpackage.a.aS(((defpackage.apfj) akzxVar.b).s)) != 0 && iAS == 2)) && (((defpackage.apfj) akzxVar.b).b & 16) == 0) {
                    return defpackage.ajcm.a;
                }
                java.lang.Object obj13 = this.c;
                defpackage.aety aetyVar = (defpackage.aety) aeueVar.b.a();
                defpackage.ahyn ahynVar2 = aetyVar.b;
                defpackage.ahwt ahwtVar = defpackage.ahwt.a;
                defpackage.ahyn ahynVar3 = aetyVar.a;
                defpackage.ajcq ajcqVarZ2 = defpackage.aiql.z(ahwtVar);
                defpackage.ajcq ajcqVarZ3 = defpackage.aiql.z(ahwtVar);
                return defpackage.aiql.Z(ajcqVarZ2, ajcqVarZ3).c(new defpackage.uej(aeueVar, akzxVar, ajcqVarZ2, ajcqVarZ3, (java.lang.String) obj13, 10), defpackage.ajbm.INSTANCE);
            case 11:
                java.lang.Object obj14 = this.a;
                defpackage.afgx afgxVar = (defpackage.afgx) obj14;
                android.net.Uri uri = (android.net.Uri) defpackage.aiql.H(afgxVar.b);
                defpackage.afey afeyVar = new defpackage.afey((java.io.Closeable) afgxVar.m.M(uri, new defpackage.affo(false, false)));
                ?? r7 = this.c;
                ?? r8 = this.b;
                try {
                    try {
                        ajcqVarG = defpackage.aiql.z(((defpackage.afgx) obj14).c(uri));
                        break;
                    } catch (java.lang.Throwable th3) {
                        try {
                            afeyVar.close();
                            throw th3;
                        } catch (java.lang.Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (java.io.IOException e4) {
                    defpackage.ahyn ahynVar4 = ((defpackage.afgx) obj14).d;
                    if (ahynVar4.f()) {
                        ajcqVarG = defpackage.ajan.g(defpackage.afgx.e(e4) ? defpackage.aiql.y(e4) : ((defpackage.afgd) ahynVar4.b()).a(e4, ((defpackage.afgx) obj14).e), defpackage.ahqx.c(new adot(obj14, uri, 9, (byte[]) null)), ((defpackage.afgx) obj14).c);
                    } else {
                        ajcqVarY2 = defpackage.aiql.y(e4);
                    }
                    afeyVar.close();
                    return ajcqVarY2;
                }
                defpackage.ajcq ajcqVarG2 = defpackage.ajan.g(ajcqVarG, r8, r7);
                ajcqVarY2 = defpackage.afgx.b(defpackage.ajan.g(ajcqVarG2, defpackage.ahqx.c(new aczq(obj14, ajcqVarG, ajcqVarG2, 15, (short[]) null)), defpackage.ajbm.INSTANCE), afeyVar.a(), ((defpackage.afgx) obj14).c);
                afeyVar.close();
                return ajcqVarY2;
            case 12:
                java.util.Set set = (java.util.Set) ((defpackage.agqj) this.b).f.a();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(set.size());
                java.util.Iterator it = set.iterator();
                java.lang.Object obj15 = this.a;
                while (it.hasNext()) {
                    try {
                        arrayList2.add(((agor) it.next()).a((agos) obj15));
                    } catch (java.lang.Exception e5) {
                        arrayList2.add(defpackage.aiql.y(e5));
                    }
                }
                ?? r9 = this.c;
                r9.addAll(arrayList2);
                return defpackage.aiql.aa(r9).b(new defpackage.kve(i), defpackage.ajbm.INSTANCE);
            case 13:
                defpackage.ahyn ahynVar5 = (defpackage.ahyn) defpackage.aiql.H(this.b);
                defpackage.ahyn ahynVar6 = (defpackage.ahyn) defpackage.aiql.H(this.c);
                if (!ahynVar5.f() || !ahynVar6.f()) {
                    return defpackage.aiql.z(defpackage.agxh.a);
                }
                java.lang.Object obj16 = this.a;
                defpackage.aify aifyVarN = defpackage.aify.n((java.util.Collection) ahynVar5.b());
                agqv agqvVar = (agqv) obj16;
                defpackage.ahyn ahynVar7 = agqvVar.a;
                if (ahynVar7.f()) {
                    return defpackage.ajan.f(ahynVar7.b().a(aifyVarN), defpackage.ahqx.a(new agnx(aifyVarN, ahynVar6, 3, (byte[]) null)), agqvVar.b);
                }
                defpackage.aigb aigbVar = new defpackage.aigb(4);
                int size = aifyVarN.size();
                for (int i6 = 0; i6 < size; i6++) {
                    aigbVar.i((agon) aifyVarN.get(i6), agqw.a);
                }
                return defpackage.aiql.z(defpackage.agxh.a(aigbVar.e(true), j$.time.Instant.ofEpochMilli(((java.lang.Long) ahynVar6.b()).longValue())));
            case 14:
                ?? r10 = this.c;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(defpackage.ajsz.bl(r10, 10));
                for (defpackage.ucm ucmVar : r10) {
                    ?? r11 = this.b;
                    java.lang.Object obj17 = this.a;
                    java.lang.Object objH = defpackage.aiql.H(ucmVar.c);
                    defpackage.aooh.e(objH, "getDone(...)");
                    ahdr ahdrVar = (ahdr) obj17;
                    arrayList3.add(ahdrVar.a((defpackage.aexf) objH, (defpackage.akzc) ucmVar.a, ahdrVar.e.s(((agon) defpackage.aiql.H(r11)).b), (java.lang.String) ucmVar.b));
                }
                return defpackage.ahvr.ah(arrayList3).p(new adbi(arrayList3, 17), defpackage.ajbm.INSTANCE);
            case 15:
                java.lang.Object obj18 = this.c;
                java.lang.Object obj19 = this.a;
                return ((aheo) obj19).k.d(new adck(obj18, obj19, 17), (defpackage.aihd) this.b);
            case 16:
                return ((defpackage.ahlt) this.a).c(this.b, this.c);
            case 17:
                return ((defpackage.ahlt) this.a).d(this.c, (defpackage.ahlv) this.b);
            case 18:
                java.lang.Object obj20 = this.c;
                java.lang.Object obj21 = this.a;
                adck adckVar = new adck(obj20, obj21, 19);
                defpackage.ahlt ahltVar = (defpackage.ahlt) this.b;
                return defpackage.aiql.G(defpackage.ajan.f(defpackage.ahvr.G(adckVar, ahltVar.c), new agqd(10), defpackage.ajbm.INSTANCE), ((defpackage.ahlc) obj21).a().b, java.util.concurrent.TimeUnit.MILLISECONDS, ahltVar.b);
            case 19:
                java.util.Set set2 = (java.util.Set) defpackage.aiql.H(this.b);
                java.util.Set set3 = (java.util.Set) defpackage.aiql.H(this.c);
                defpackage.aild aildVarAm = defpackage.ahvr.am(set2, set3);
                defpackage.aild aildVarAm2 = defpackage.ahvr.am(set3, set2);
                java.lang.Object obj22 = this.a;
                defpackage.ahlt ahltVar2 = (defpackage.ahlt) obj22;
                ahltVar2.i(aildVarAm);
                java.util.HashSet hashSet = new java.util.HashSet();
                java.lang.Object obj23 = ahltVar2.h;
                synchronized (obj23) {
                    for (defpackage.ahlv ahlvVar : ((defpackage.ahlt) obj22).i.keySet()) {
                        if (aildVarAm2.contains(ahlvVar.c)) {
                            hashSet.add(ahlvVar);
                        }
                    }
                    synchronized (obj23) {
                        try {
                            java.util.Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                defpackage.ajcq ajcqVar = (defpackage.ajcq) ((defpackage.ahlt) obj22).j.get((defpackage.ahlv) it2.next());
                                if (ajcqVar != null) {
                                    ajcqVar.cancel(false);
                                }
                            }
                        } catch (java.lang.Throwable th5) {
                            throw th5;
                        }
                        break;
                    }
                    if (!aildVarAm.isEmpty() && aildVarAm2.isEmpty()) {
                        return defpackage.ajcm.a;
                    }
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.ahlt.a.b()).l("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", 764, "SyncManagerImpl.java")).v("Accounts did change. Rescheduling synclets.");
                    return defpackage.ahvr.H(ahltVar2.f(defpackage.aiql.z(defpackage.aikn.a)), new agqd(9), defpackage.ajbm.INSTANCE);
                }
                ((defpackage.ahlt) obj22).i.keySet().removeAll(hashSet);
                defpackage.agsm agsmVar = ((defpackage.ahlt) obj22).d;
                defpackage.ahlm ahlmVar = ((defpackage.ahlt) obj22).e;
                defpackage.ajcq ajcqVarSubmit = ahlmVar.c.submit(new afgu(ahlmVar, hashSet, 10, (byte[]) null));
                agsmVar.f(ajcqVarSubmit, "SyncManager: removeAccounts");
                defpackage.agsm.i(1403, ajcqVarSubmit, "Error removing accounts from sync. IDs: %s", aildVarAm2);
                if (!aildVarAm.isEmpty()) {
                }
                ((defpackage.aimw) ((defpackage.aimw) defpackage.ahlt.a.b()).l("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", 764, "SyncManagerImpl.java")).v("Accounts did change. Rescheduling synclets.");
                return defpackage.ahvr.H(ahltVar2.f(defpackage.aiql.z(defpackage.aikn.a)), new agqd(9), defpackage.ajbm.INSTANCE);
            default:
                java.util.Set set4 = (java.util.Set) defpackage.aiql.H(this.a);
                java.util.Set set5 = (java.util.Set) defpackage.aiql.H(this.b);
                if (set4.isEmpty() || set5.isEmpty()) {
                    return defpackage.aiql.z(java.lang.Boolean.FALSE);
                }
                akxo akxoVar = ((akxw) this.c).c;
                if (akxoVar == null) {
                    akxoVar = akxo.a;
                }
                int i7 = akxoVar.b;
                if ((i7 & 2) == 0) {
                    if ((i7 & 4) == 0) {
                        ajcqVarY3 = defpackage.aiql.y(new ahzr("Missing explicit principal gaia user email and explicit principal zwieback token"));
                    } else {
                        java.lang.String str3 = akxoVar.d;
                        ajcqVarZ = defpackage.aiql.z(akxb.a(defpackage.aikn.a));
                    }
                    return defpackage.ajan.f(ajcqVarY3, new agnx(set5, set4, 12), defpackage.ajbm.INSTANCE);
                }
                java.lang.String str4 = akxoVar.c;
                ajcqVarZ = defpackage.aiql.z(akxb.a(defpackage.aikn.a));
                ajcqVarY3 = defpackage.ajan.f(ajcqVarZ, new agqd(20), defpackage.ajbm.INSTANCE);
                return defpackage.ajan.f(ajcqVarY3, new agnx(set5, set4, 12), defpackage.ajbm.INSTANCE);
        }
    }

    public /* synthetic */ vto(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ vto(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ vto(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ vto(java.util.List list, ahdr ahdrVar, defpackage.ajcq ajcqVar, int i) {
        this.$cid = i;
        this.c = list;
        this.a = ahdrVar;
        this.b = ajcqVar;
    }
}
