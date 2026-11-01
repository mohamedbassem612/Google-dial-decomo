package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wzc implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ wzc(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:198:0x071a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v77, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v74, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v75, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v78, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v62, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v37, types: [j$.time.temporal.Temporal, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws java.lang.Exception {
        j$.util.Optional optionalI;
        java.lang.String str;
        java.io.File fileCreateTempFile;
        int i = 3;
        int i2 = 0;
        akzx[] akzxVarArr = null;
        switch (this.$cid) {
            case 0:
                wzd wzdVar = (wzd) this.a;
                aike aikeVarA = wzdVar.a((aify) this.b);
                if (!aikeVarA.isEmpty()) {
                    aift aiftVar = new aift(4);
                    int i3 = aikeVarA.d;
                    for (int i4 = 0; i4 < i3; i4++) {
                        defpackage.wyz wyzVar = (defpackage.wyz) aikeVarA.get(i4);
                        defpackage.wxp wxpVar = wyzVar.c;
                        if (wxpVar == null) {
                            wxpVar = defpackage.wxp.a;
                        }
                        akzx akzxVarP = wxpVar.p();
                        akzxVarP.u();
                        defpackage.wxp wxpVar2 = (defpackage.wxp) akzxVarP.b;
                        wxpVar2.b |= 32;
                        wxpVar2.g = false;
                        akzxVarP.u();
                        defpackage.wxp wxpVar3 = (defpackage.wxp) akzxVarP.b;
                        wxpVar3.b |= 64;
                        wxpVar3.h = false;
                        wyzVar.c = (defpackage.wxp) akzxVarP.p();
                        wzd.j(wzd.b(wyzVar.d));
                        wyzVar.d = defpackage.xac.a;
                        wyzVar.b = j$.time.Instant.now().toEpochMilli();
                        aiftVar.i(wyzVar);
                    }
                    defpackage.wyw wywVarX = ((com.android.incallui.atlas.ui.impl.database.AtlasDatabase) wzdVar.b.a()).x();
                    dez.m((gfy) wywVarX.a, false, true, new uph(wywVarX, aiftVar.h(), 7, (byte[]) null));
                    return null;
                }
                return akzxVarArr;
            case 1:
                ?? r1 = this.b;
                java.lang.Object obj = this.a;
                j$.lang.Iterable.-EL.forEach(((wzd) obj).a((aify) r1), new defpackage.uwm(6));
                j$.lang.Iterable.-EL.forEach(ahvr.aQ((java.util.List) r1), new defpackage.who(obj, 12));
                return null;
            case 2:
                return ((wzd) this.a).a((aify) this.b);
            case 3:
                ?? r2 = this.a;
                aigf aigfVar = defpackage.wzk.a;
                int size = r2.size();
                while (true) {
                    java.lang.Object obj2 = this.b;
                    if (i2 >= size) {
                        return new amms(((defpackage.ahwh) ((akzx) obj2).p()).i());
                    }
                    defpackage.wzi wziVar = (defpackage.wzi) r2.get(i2);
                    akzx akzxVarM = defpackage.ahwg.a.m();
                    java.lang.String str2 = wziVar.a;
                    akzxVarM.u();
                    defpackage.ahwg ahwgVar = (defpackage.ahwg) akzxVarM.b;
                    j$.util.Objects.requireNonNull(str2);
                    ahwgVar.b |= 1;
                    ahwgVar.c = str2;
                    akzc akzcVar = wziVar.b;
                    akzxVarM.u();
                    defpackage.ahwg ahwgVar2 = (defpackage.ahwg) akzxVarM.b;
                    j$.util.Objects.requireNonNull(akzcVar);
                    ahwgVar2.b |= 2;
                    ahwgVar2.d = akzcVar;
                    ((akzx) obj2).at((defpackage.ahwg) akzxVarM.p());
                    i2++;
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.xbf xbfVar = (defpackage.xbf) this.a;
                if (xbfVar.d.isPresent()) {
                    ahvr.bZ(xbfVar.d.isPresent(), "output stream absent");
                    akzx akzxVar = xbfVar.e;
                    defpackage.amoa amoaVar = ((defpackage.wzw) akzxVar.b).f;
                    if (amoaVar == null) {
                        amoaVar = defpackage.amoa.a;
                    }
                    akzc akzcVar2 = (akzc) this.b;
                    akzcVar2.m((java.io.OutputStream) xbfVar.d.orElseThrow());
                    int iC = akzcVar2.c();
                    akyy akyyVarD = akzcVar2.d();
                    while (akyyVarD.hasNext()) {
                        if (akyyVarD.a() == 0) {
                            i2++;
                        }
                    }
                    akzx akzxVarM2 = defpackage.amoa.a.m();
                    int i5 = amoaVar.c + iC;
                    akzxVarM2.u();
                    defpackage.amoa amoaVar2 = (defpackage.amoa) akzxVarM2.b;
                    amoaVar2.b |= 1;
                    amoaVar2.c = i5;
                    int i6 = amoaVar.d + i2;
                    akzxVarM2.u();
                    defpackage.amoa amoaVar3 = (defpackage.amoa) akzxVarM2.b;
                    amoaVar3.b |= 2;
                    amoaVar3.d = i6;
                    defpackage.amoa amoaVar4 = (defpackage.amoa) akzxVarM2.p();
                    akzxVar.u();
                    defpackage.wzw wzwVar = (defpackage.wzw) akzxVar.b;
                    j$.util.Objects.requireNonNull(amoaVar4);
                    wzwVar.f = amoaVar4;
                    wzwVar.b |= 8;
                    defpackage.xbf.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/incallui/atlas/ui/impl/tidepods/logger/HoldForMeCallAudioLogger", "writeData", 204, "HoldForMeCallAudioLogger.java").z("so far, write data [bytes = %d, zero bytes = %d] into the recording file for atlas", amoaVar4.c, amoaVar4.d);
                    return null;
                }
                return akzxVarArr;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.Object obj3 = this.a;
                defpackage.amoa amoaVar5 = ((defpackage.wzw) obj3).f;
                if (amoaVar5 == null) {
                    amoaVar5 = defpackage.amoa.a;
                }
                java.lang.Object obj4 = this.b;
                defpackage.wxm.a.b().l("com/android/incallui/atlas/logger/AtlasCallMetricsLogger", "logAudioDataCounter", 165, "AtlasCallMetricsLogger.java").w("hold for me audio data num bytes :%d", amoaVar5.c);
                defpackage.who whoVar = new defpackage.who(amoaVar5, 5);
                defpackage.xcy xcyVar = (defpackage.xcy) obj4;
                long j = xcyVar.r;
                defpackage.wxm wxmVar = xcyVar.e;
                wxmVar.d(j, whoVar);
                if (((double) amoaVar5.d) / ((double) amoaVar5.c) >= 0.9d) {
                    wxmVar.b(j, defpackage.alex.ATLAS_EMPTY_AUDIO);
                }
                akzx akzxVar2 = xcyVar.D;
                akzx akzxVarM3 = defpackage.xab.a.m();
                akzxVarM3.u();
                defpackage.xab xabVar = (defpackage.xab) akzxVarM3.b;
                j$.util.Objects.requireNonNull(obj3);
                alat alatVar = xabVar.b;
                if (!alatVar.c()) {
                    xabVar.b = alad.J(alatVar);
                }
                xabVar.b.add(obj3);
                akzxVar2.u();
                defpackage.xac xacVar = (defpackage.xac) akzxVar2.b;
                defpackage.xab xabVar2 = (defpackage.xab) akzxVarM3.p();
                defpackage.xac xacVar2 = defpackage.xac.a;
                j$.util.Objects.requireNonNull(xabVar2);
                alat alatVar2 = xacVar.d;
                if (!alatVar2.c()) {
                    xacVar.d = alad.J(alatVar2);
                }
                xacVar.d.add(xabVar2);
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aimw aimwVarL = defpackage.xdh.a.b().i(zct.a).l("com/android/incallui/atlas/ui/impl/tidepods/uistate/HoldForMeUiStateController", "setUiState", 60, "HoldForMeUiStateController.java");
                java.lang.Object objA = this.a;
                defpackage.wya wyaVar = (defpackage.wya) objA;
                int iJ = wsc.j(wyaVar.c);
                if (iJ == 0) {
                    throw null;
                }
                java.lang.Object obj5 = this.b;
                aimwVarL.y("set UI state %s", wsc.i(iJ));
                defpackage.xdh xdhVar = (defpackage.xdh) obj5;
                j$.util.Optional optionalC = defpackage.xdh.c(xdhVar.c);
                j$.util.Optional optionalC2 = defpackage.xdh.c(wyaVar);
                boolean z = optionalC.isPresent() && wsc.k(((defpackage.wxx) optionalC.orElseThrow()).c) != 3;
                if ((!optionalC2.isPresent() || wsc.k(((defpackage.wxx) optionalC2.orElseThrow()).c) == 3) && z) {
                    objA = defpackage.xdh.a(wyaVar, (defpackage.wxx) optionalC.orElseThrow());
                }
                xdhVar.d((defpackage.wya) objA);
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.xdh xdhVar2 = (defpackage.xdh) this.b;
                xdhVar2.d(defpackage.xdh.a(xdhVar2.c, (defpackage.wxx) this.a));
                return null;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.Object obj6 = this.b;
                java.lang.Object obj7 = this.a;
                if (obj7 == null) {
                    throw new java.lang.NullPointerException("account is null");
                }
                try {
                    defpackage.ulw ulwVarB = ((defpackage.zcx) obj6).c.b(new defpackage.ajzy(((android.accounts.Account) obj7).name), defpackage.zcx.b);
                    ?? r4 = ulwVarB.b;
                    if (r4 != 0) {
                        defpackage.zcx.a.b().l("com/google/android/callingshared/grpc/impl/GmsAuthTokenFetcher", "getToken", 81, "GmsAuthTokenFetcher.java").x("token expires in %d seconds", j$.time.Duration.between(j$.time.Instant.now(), (j$.time.temporal.Temporal) r4).toSeconds());
                    }
                    ((defpackage.zcx) obj6).d.put(obj7, ulwVarB);
                    return ulwVarB.c;
                } catch (akac e) {
                    if (e.getCause() instanceof com.google.android.gms.auth.UserRecoverableAuthException) {
                        ((defpackage.zcx) obj6).e.l(zbq.a(defpackage.zbr.aF).e());
                        throw new java.lang.Exception("Need user approval", e);
                    }
                    if (e.getCause() instanceof zwj) {
                        ((defpackage.zcx) obj6).e.l(zbq.a(defpackage.zbr.aD).e());
                        throw new java.lang.Exception("Error authenticating via oauth.", e);
                    }
                    if (!(e.getCause() instanceof java.io.IOException)) {
                        throw new java.lang.Exception("Error fetching oauth token.", e);
                    }
                    ((defpackage.zcx) obj6).e.l(zbq.a(defpackage.zbr.aE).e());
                    throw new java.lang.Exception("Error fetching oauth token.", e);
                }
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.lang.Object obj8 = this.a;
                java.lang.Object obj9 = this.b;
                try {
                    aimz aimzVar = zdl.a;
                    aimzVar.b().l("com/google/android/callingshared/mobiledatadownload/UriLoader", "load", 45, "UriLoader.java").y("loading uri \"%s\" into file", obj8);
                    aogc aogcVar = ((zdl) obj9).b;
                    defpackage.affp affpVar = new defpackage.affp();
                    affpVar.b();
                    java.io.File file = (java.io.File) aogcVar.M((android.net.Uri) obj8, affpVar);
                    if (file.exists()) {
                        aimzVar.b().l("com/google/android/callingshared/mobiledatadownload/UriLoader", "load", 48, "UriLoader.java").y("file for uri \"%s\" exists", obj8);
                        return j$.util.Optional.of(file);
                    }
                    aimzVar.d().i(zct.b).l("com/google/android/callingshared/mobiledatadownload/UriLoader", "load", 52, "UriLoader.java").y("file for uri \"%s\" doesn't exist", obj8);
                    return j$.util.Optional.empty();
                } catch (java.io.IOException e2) {
                    hgb.g(zdl.a.d(), "failed to load uri \"%s\"", obj8, "com/google/android/callingshared/mobiledatadownload/UriLoader", "load", ';', "UriLoader.java", e2, zct.b);
                    return j$.util.Optional.empty();
                }
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj10 = this.b;
                defpackage.zmn zmnVar = (defpackage.zmn) obj10;
                aca acaVar = zmnVar.c;
                java.lang.Object obj11 = this.a;
                if (acaVar.containsKey(obj11)) {
                    hgb.c(defpackage.zmn.a.b(), "Not getting callback number. Already cached.", "com/google/android/dialershared/incall/cachedcallinfo/CachedCallInfo", "retrieveCallbackNumberIfNotCached", (char) 148, "CachedCallInfo.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                    return null;
                }
                try {
                    if (android.os.Build.VERSION.SDK_INT >= 33) {
                        okj okjVar = ((defpackage.zmn) obj10).m;
                        int iB = okjVar.b((android.telecom.PhoneAccountHandle) obj11);
                        if (iB == -1) {
                            a.bI(defpackage.zmn.a.d(), "No active cellular subscription ID found", "com/google/android/dialershared/incall/cachedcallinfo/CachedCallInfo", "getCallbackNumberFromSubscriptionManager", (char) 193, "CachedCallInfo.java", zct.b);
                            str = null;
                        } else {
                            defpackage.zmn.a.b().l("com/google/android/dialershared/incall/cachedcallinfo/CachedCallInfo", "getCallbackNumberFromSubscriptionManager", 196, "CachedCallInfo.java").v("Getting phone number from subscription manager.");
                            str = (java.lang.String) okjVar.g(iB).orElse((java.lang.Object) null);
                        }
                        optionalI = j$.util.Optional.ofNullable(str);
                    } else {
                        optionalI = ((defpackage.zmn) obj10).k.i((android.telecom.PhoneAccountHandle) obj11);
                    }
                    zmnVar.c.put(obj11, optionalI);
                    zmnVar.o.a(ajcm.a);
                    return null;
                } catch (java.lang.SecurityException e3) {
                    a.bq(defpackage.zmn.a.d(), "Tried to get self phone number without permission.", "com/google/android/dialershared/incall/cachedcallinfo/CachedCallInfo", "retrieveCallbackNumberIfNotCached", (char) 166, "CachedCallInfo.java", e3, zct.b);
                    zmnVar.c.put(obj11, j$.util.Optional.empty());
                    return null;
                } catch (java.lang.RuntimeException e4) {
                    a.bq(defpackage.zmn.a.d(), "Unexpected exception when getting self phone number.", "com/google/android/dialershared/incall/cachedcallinfo/CachedCallInfo", "retrieveCallbackNumberIfNotCached", (char) 176, "CachedCallInfo.java", e4, zct.b);
                    return null;
                }
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return (java.lang.Void) aazc.t(((abce) ((aapf) this.b).a.a).q((android.net.Uri) this.a));
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                com.google.android.libraries.appdoctor.AppDoctorReceiver.a(this.b, (android.content.BroadcastReceiver.PendingResult) this.a);
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ?? r3 = this.b;
                aiof aiofVar = acea.a;
                defpackage.adrp adrpVar = new defpackage.adrp((byte[]) null);
                com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext = (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) this.a;
                adrpVar.g(promoContext.b());
                adrpVar.a = promoContext.e();
                adrpVar.h(promoContext.c());
                adrpVar.i(promoContext.a());
                adrpVar.d = promoContext.d();
                adrpVar.c = promoContext.f();
                adrpVar.g((java.util.Map) aiql.H((java.util.concurrent.Future) r3));
                return adrpVar.f();
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                akzxVarArr = (akzz[]) aiql.H((java.util.concurrent.Future) this.b);
                int length = akzxVarArr.length;
                while (i2 < length) {
                    int iValueAt = ((android.util.SparseIntArray) this.a).valueAt(i2);
                    if (iValueAt != -1) {
                        akzx akzxVar3 = akzxVarArr[iValueAt];
                        akzxVar3.u();
                        aivy aivyVar = ((akzz) akzxVar3).b;
                        aivy aivyVar2 = aivy.a;
                        alak alakVar = aivyVar.e;
                        if (!alakVar.c()) {
                            aivyVar.e = alad.H(alakVar);
                        }
                        aivyVar.e.g(i2);
                    }
                    i2++;
                }
                return akzxVarArr;
            case 15:
                java.util.Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((defpackage.acnr) aiql.H((ajcq) it.next())).a(null);
                }
                return this.b;
            case 16:
                return java.lang.Boolean.valueOf(((ahbq) this.a).b.containsKey(this.b));
            case 17:
                return ahyn.g((ajcq) ((ahbq) this.a).b.get(this.b));
            case 18:
                int i7 = adbe.a;
                defpackage.acvd acvdVar = defpackage.acvd.a;
                return (defpackage.acvd) ((aogc) ((adao) this.b).a).M((android.net.Uri) this.a, new defpackage.affq(alad.M(defpackage.acvd.class)));
            case 19:
                aiob aiobVarL = adhn.a.b().l("com/google/android/libraries/micore/superpacks/Superpacks", "deletePacks", 1005, "Superpacks.java");
                defpackage.adfe adfeVar = new defpackage.adfe(i);
                ?? r5 = this.b;
                aiobVarL.y("Deleting packs: %s", adik.e((java.util.Collection) r5, adfeVar));
                ahct ahctVar = (ahct) this.a;
                ahctVar.g();
                for (adhw adhwVar : r5) {
                    java.lang.Object obj12 = ahctVar.f;
                    aiof aiofVar2 = adhn.a;
                    adjz adjzVar = (adjz) obj12;
                    java.io.File fileG = adjzVar.g(adhwVar.b());
                    if (fileG.exists()) {
                        final java.lang.String strA = adhwVar.a();
                        java.io.File[] fileArrListFiles = fileG.listFiles(new java.io.FileFilter() { // from class: adjx
                            @Override // java.io.FileFilter
                            public final boolean accept(java.io.File file2) {
                                int i8 = adjz.i;
                                return file2.getName().startsWith(strA);
                            }
                        });
                        if (fileArrListFiles != null) {
                            for (java.io.File file2 : fileArrListFiles) {
                                adjzVar.o(new adhb(adhwVar.b(), file2.getName()), adme.d, false);
                            }
                        }
                    }
                }
                return akzxVarArr;
            default:
                java.lang.Object obj13 = this.b;
                java.lang.Object obj14 = this.a;
                try {
                    java.io.File file3 = new java.io.File((java.lang.String) ((aezt) obj14).b.eZ());
                    aisq.b(file3);
                    fileCreateTempFile = java.io.File.createTempFile("snapshot", ".pb", file3.getParentFile());
                    try {
                        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileCreateTempFile);
                        try {
                            ((akym) obj13).h(fileOutputStream);
                            fileOutputStream.flush();
                            fileOutputStream.getFD().sync();
                            fileOutputStream.close();
                            if (!fileCreateTempFile.renameTo(file3)) {
                                throw new java.io.IOException(java.lang.String.valueOf(fileCreateTempFile) + " could not be renamed to " + file3.toString());
                            }
                        } catch (java.lang.Throwable th) {
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (java.io.IOException e5) {
                        e = e5;
                        java.lang.Exception exc = e;
                        if (fileCreateTempFile != null) {
                            try {
                                fileCreateTempFile.delete();
                            } catch (java.lang.SecurityException e6) {
                                exc.addSuppressed(e6);
                            }
                        }
                        aezt aeztVar = (aezt) obj14;
                        agab.au(java.util.logging.Level.WARNING, aeztVar.a.c(), exc, "Failed to update snapshot for %s flags may be stale.", new java.lang.Object[]{aeztVar.c});
                        break;
                    } catch (java.lang.RuntimeException e7) {
                        e = e7;
                        java.lang.Exception exc2 = e;
                        if (fileCreateTempFile != null) {
                            fileCreateTempFile.delete();
                        }
                        aezt aeztVar2 = (aezt) obj14;
                        agab.au(java.util.logging.Level.WARNING, aeztVar2.a.c(), exc2, "Failed to update snapshot for %s flags may be stale.", new java.lang.Object[]{aeztVar2.c});
                        break;
                    }
                } catch (java.io.IOException | java.lang.RuntimeException e8) {
                    e = e8;
                    fileCreateTempFile = null;
                }
                return akzxVarArr;
        }
    }

    public /* synthetic */ wzc(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
