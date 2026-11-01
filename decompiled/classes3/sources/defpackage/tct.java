package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tct implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ tct(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final ajcq a(java.lang.Object obj) {
        int i = 18;
        int i2 = 9;
        int i3 = 8;
        int i4 = 7;
        int i5 = 4;
        int i6 = 1;
        int i7 = 12;
        int i8 = 6;
        int i9 = 5;
        int i10 = 0;
        byte[] bArr = null;
        int i11 = 3;
        switch (this.$cid) {
            case 0:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                java.lang.Object obj2 = this.a;
                tcu tcuVar = (tcu) obj2;
                return ahvr.I(tcuVar.c(zBooleanValue ? tcp.d : ((tcu) obj2).a()), new defpackage.tak(obj2, bool, i9, bArr), tcuVar.d);
            case 1:
                tcp tcpVar = (tcp) obj;
                tcu.a.b().l("com/android/dialer/rtt/settings/impl/configuration/RttConfigurationDao", "getRttConfiguration", 68, "RttConfigurationDao.java").y("successfully loaded rtt configuration: %s", tcpVar.name());
                java.lang.Object obj3 = this.a;
                if (tcpVar != tcp.a) {
                    return aiql.z(tcpVar);
                }
                ahoq ahoqVarW = ahvr.W(874, "RttConfigurationDao_isRttCallingModeEnabled");
                try {
                    ajct ajctVar = ((tcu) obj3).d;
                    ajcq ajcqVarH = ahvr.H(ajctVar.eU(ahqx.i(new defpackage.sws(obj3, i7))), new defpackage.tbp(i11), ajctVar);
                    ahoqVarW.a(ajcqVarH);
                    ahoqVarW.close();
                    return ahvr.I(ajcqVarH, new defpackage.tct(obj3, i10), ((tcu) obj3).d);
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarW.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 2:
                tcp tcpVar2 = (tcp) obj;
                tcv.a.b().l("com/android/dialer/rtt/settings/impl/configuration/RttConfigurationLoaderImpl", "optimizedLoad", 104, "RttConfigurationLoaderImpl.java").y("RTT Configuration: %s", tcpVar2);
                return (tcpVar2 == tcp.d || tcpVar2 == tcp.c) ? ((tcv) this.a).e.a() : aiql.z(java.lang.Boolean.FALSE);
            case 3:
                return ((defpackage.tia) this.a).d((aify) obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aify aifyVar = (aify) obj;
                defpackage.tia.a.b().l("com/android/dialer/searchfragment/contactretriever/impl/Cp2DefaultDirectoryContactRetrieverImpl", "keyboardQuery", 151, "Cp2DefaultDirectoryContactRetrieverImpl.java").w("contact filtering query found %d results", aifyVar.size());
                if (aifyVar.isEmpty()) {
                    return aiql.z(aike.a);
                }
                java.lang.Object obj4 = this.a;
                defpackage.tia tiaVar = (defpackage.tia) obj4;
                return ahvr.I(tiaVar.d.a((aify) j$.util.Collection.-EL.stream(aifyVar).map(new defpackage.thw(i6)).collect(aido.a)), new defpackage.tak(obj4, aifyVar, i8, bArr), tiaVar.c);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.tia tiaVar2 = (defpackage.tia) this.a;
                zjm zjmVar = tiaVar2.h;
                aify aifyVar2 = (aify) obj;
                return !zjmVar.g().isPresent() ? aiql.z(aifyVar2) : ahvr.H(((zzx) zjmVar.g().orElseThrow()).q((aihd) j$.util.Collection.-EL.stream(aifyVar2).map(new defpackage.rat(i)).collect(aido.b)), new defpackage.tcy(aifyVar2, i11), tiaVar2.c);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aify aifyVar3 = (aify) obj;
                java.lang.Object obj5 = this.a;
                ahoq ahoqVarW2 = ahvr.W(883, "Cp2DefaultDirectoryContactRetrieverImpl_assignMeetReachabilityToEachEntry");
                try {
                    ajcq ajcqVarZ = !((java.lang.Boolean) ((defpackage.tia) obj5).e.a()).booleanValue() ? aiql.z(aifyVar3) : ahvr.H(((defpackage.tia) obj5).f.a(), new defpackage.tcy(aifyVar3, i9), ((defpackage.tia) obj5).c);
                    ahoqVarW2.close();
                    return ajcqVarZ;
                } catch (java.lang.Throwable th3) {
                    try {
                        ahoqVarW2.close();
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.tib tibVar = (defpackage.tib) this.a;
                aigf aigfVar = (aigf) obj;
                j$.util.Optional optionalG = tibVar.e.g();
                if (!optionalG.isPresent()) {
                    return aiql.z(aigfVar);
                }
                aihb aihbVar = new aihb();
                ailj ailjVarK = aigfVar.e().k();
                while (ailjVarK.hasNext()) {
                    aihbVar.k((java.lang.Iterable) j$.util.Collection.-EL.stream((aify) ((java.util.Map.Entry) ailjVarK.next()).getValue()).map(new defpackage.thw(i5)).collect(j$.util.stream.Collectors.toCollection(new defpackage.rqc(i9))));
                }
                return ahvr.H(((zzx) optionalG.orElseThrow()).q(aihbVar.h()), new defpackage.tcy(aigfVar, i4), tibVar.b);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                aigf aigfVar2 = (aigf) obj;
                java.lang.Object obj6 = this.a;
                ahoq ahoqVarW3 = ahvr.W(884, "Cp2PhoneEntryListRetriever_assignMeetReachabilityToEachEntry");
                try {
                    ajcq ajcqVarZ2 = !((java.lang.Boolean) ((defpackage.tib) obj6).c.a()).booleanValue() ? aiql.z(aigfVar2) : ahvr.H(((defpackage.tib) obj6).d.a(), new defpackage.tcy(aigfVar2, i8), ((defpackage.tib) obj6).b);
                    ahoqVarW3.close();
                    return ajcqVarZ2;
                } catch (java.lang.Throwable th5) {
                    try {
                        ahoqVarW3.close();
                        throw th5;
                    } catch (java.lang.Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.tvh tvhVar = ((defpackage.tvi) this.a).c;
                return tvhVar.d.eU(new defpackage.tvg(tvhVar, i10));
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((defpackage.tzr) this.a).f.a((android.net.Uri) ((j$.util.Optional) obj).orElseThrow());
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.tzv tzvVar = (defpackage.tzv) this.a;
                tzvVar.d.a(mcd.W);
                tzvVar.j.c();
                return aiql.y((java.lang.Exception) obj);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.tzv tzvVar2 = (defpackage.tzv) this.a;
                tzvVar2.d.a(mcd.X);
                tzvVar2.j.c();
                return aiql.y((java.lang.Exception) obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                android.net.Uri uri = (android.net.Uri) ((j$.util.Optional) obj).orElseThrow();
                defpackage.tzv tzvVar3 = (defpackage.tzv) this.a;
                return ahvr.H(tzvVar3.g.a(uri), new defpackage.tbp(17), tzvVar3.b);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((defpackage.tzv) this.a).d.a(mcd.Z);
                return aiql.y((java.lang.Exception) obj);
            case 15:
                defpackage.uad uadVar = (defpackage.uad) obj;
                final ajcq ajcqVarAM = uadVar.aM();
                final ajcq ajcqVarAG = uadVar.aG();
                final ajcq ajcqVarAH = uadVar.aH();
                final ajcq ajcqVarAS = uadVar.aS();
                final ajcq ajcqVarAy = uadVar.ay();
                final ajcq ajcqVarAU = uadVar.aU();
                final ajcq ajcqVarAC = uadVar.aC();
                final ajcq ajcqVarAF = uadVar.aF();
                final ajcq ajcqVarAD = uadVar.aD();
                final defpackage.uae uaeVar = (defpackage.uae) this.a;
                defpackage.tzl tzlVar = uaeVar.c;
                final ajcq ajcqVarA = tzlVar.a.a(tzlVar.b.a(), 3);
                final ajcq ajcqVarY = uadVar.y();
                final ajcq ajcqVarB = uaeVar.b.b();
                return ahvr.ak(new ajcq[]{ajcqVarAM, ajcqVarAG, ajcqVarAH, ajcqVarAS, ajcqVarAy, ajcqVarAU, ajcqVarAC, ajcqVarAF, ajcqVarAD, ajcqVarA, ajcqVarY, ajcqVarB}).o(new java.util.concurrent.Callable() { // from class: uac
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        if (((java.lang.Boolean) aiql.H(ajcqVarAM)).booleanValue()) {
                            hgb.c(defpackage.uae.a.b(), "call is RTT call, not showing sonic", "com/android/dialer/sonic/impl/service/SonicPreconditions", "arePreconditionsSatified", 'm', "SonicPreconditions.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                            return java.lang.Boolean.FALSE;
                        }
                        if (((java.lang.Boolean) aiql.H(ajcqVarAG)).booleanValue()) {
                            hgb.c(defpackage.uae.a.b(), "call is emergency call, not showing sonic", "com/android/dialer/sonic/impl/service/SonicPreconditions", "arePreconditionsSatified", 'r', "SonicPreconditions.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                            return java.lang.Boolean.FALSE;
                        }
                        if (((java.lang.Boolean) aiql.H(ajcqVarAH)).booleanValue()) {
                            hgb.c(defpackage.uae.a.b(), "call is emergency callback, not showing sonic", "com/android/dialer/sonic/impl/service/SonicPreconditions", "arePreconditionsSatified", 'w', "SonicPreconditions.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                            return java.lang.Boolean.FALSE;
                        }
                        if (((java.lang.Boolean) aiql.H(ajcqVarAS)).booleanValue()) {
                            hgb.c(defpackage.uae.a.b(), "call is video call, not showing sonic", "com/android/dialer/sonic/impl/service/SonicPreconditions", "arePreconditionsSatified", '|', "SonicPreconditions.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                            return java.lang.Boolean.FALSE;
                        }
                        j$.util.Optional optional = (j$.util.Optional) aiql.H(ajcqVarAy);
                        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                        if (((java.lang.Boolean) optional.orElse(bool2)).booleanValue()) {
                            if (optional.isPresent()) {
                                hgb.c(defpackage.uae.a.b(), "call is business number, not showing sonic", "com/android/dialer/sonic/impl/service/SonicPreconditions", "arePreconditionsSatified", (char) 131, "SonicPreconditions.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                            } else {
                                hgb.c(defpackage.uae.a.b(), "Still checking if the number is business, not showing sonic", "com/android/dialer/sonic/impl/service/SonicPreconditions", "arePreconditionsSatified", (char) 134, "SonicPreconditions.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                            }
                            return java.lang.Boolean.FALSE;
                        }
                        if (((java.lang.Boolean) aiql.H(ajcqVarAU)).booleanValue()) {
                            hgb.c(defpackage.uae.a.b(), "call is voicemail number, not showing sonic", "com/android/dialer/sonic/impl/service/SonicPreconditions", "arePreconditionsSatified", (char) 140, "SonicPreconditions.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                            return java.lang.Boolean.FALSE;
                        }
                        if (((java.lang.Boolean) aiql.H(ajcqVarAC)).booleanValue()) {
                            hgb.c(defpackage.uae.a.b(), "call is conference call, not showing sonic", "com/android/dialer/sonic/impl/service/SonicPreconditions", "arePreconditionsSatified", (char) 145, "SonicPreconditions.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                            return java.lang.Boolean.FALSE;
                        }
                        j$.util.Optional optional2 = (j$.util.Optional) aiql.H(ajcqVarAF);
                        java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
                        if (((java.lang.Boolean) optional2.orElse(bool3)).booleanValue()) {
                            hgb.c(defpackage.uae.a.b(), "call is eligible to upgrade to xatu, not showing sonic", "com/android/dialer/sonic/impl/service/SonicPreconditions", "arePreconditionsSatified", (char) 150, "SonicPreconditions.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                        } else if (((java.lang.Boolean) ((j$.util.Optional) aiql.H(ajcqVarAD)).orElse(bool3)).booleanValue()) {
                            hgb.c(defpackage.uae.a.b(), "call is eligible to upgrade to atlas, not showing sonic", "com/android/dialer/sonic/impl/service/SonicPreconditions", "arePreconditionsSatified", (char) 155, "SonicPreconditions.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                        } else if (!((java.lang.Boolean) aiql.H(ajcqVarA)).booleanValue()) {
                            hgb.c(defpackage.uae.a.b(), "Sonic enables MDD but resources aren't downloaded, not showing sonic", "com/android/dialer/sonic/impl/service/SonicPreconditions", "arePreconditionsSatified", (char) 160, "SonicPreconditions.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                        } else {
                            if (((java.lang.Boolean) aiql.H(ajcqVarB)).booleanValue()) {
                                if (aiql.H(ajcqVarY) == defpackage.zpo.f) {
                                    ((defpackage.qbe) uaeVar.e.a).c(qbc.hw);
                                }
                                return bool2;
                            }
                            hgb.c(defpackage.uae.a.b(), "sonic feature is turned off in settings, not showing sonic", "com/android/dialer/sonic/impl/service/SonicPreconditions", "arePreconditionsSatified", (char) 165, "SonicPreconditions.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                        }
                        return bool3;
                    }
                }, uaeVar.d);
            case 16:
                return ((defpackage.uar) this.a).g.a();
            case 17:
                return ((ubj) ((defpackage.uss) this.a).b).a();
            case 18:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    ubj.a.b().l("com/android/dialer/sonic/impl/settings/SonicSettingsMddDownloader", "downloadMddResourcesIfRequired", 89, "SonicSettingsMddDownloader.java").v("Newest Sonic MDD resources already downloaded");
                    return ajcm.a;
                }
                java.lang.Object obj7 = this.a;
                ubj.a.b().l("com/android/dialer/sonic/impl/settings/SonicSettingsMddDownloader", "downloadMddResourcesIfRequired", 92, "SonicSettingsMddDownloader.java").v("Sonic MDD resources not downloaded, triggering download");
                acux acuxVar = defpackage.tzm.a;
                akzx akzxVarP = acuxVar.p();
                acuz acuzVar = acuxVar.g;
                if (acuzVar == null) {
                    acuzVar = acuz.a;
                }
                akzx akzxVarP2 = acuzVar.p();
                akzxVarP2.u();
                acuz acuzVar2 = akzxVarP2.b;
                acuzVar2.d = 0;
                acuzVar2.b |= 2;
                akzxVarP.u();
                acux acuxVar2 = akzxVarP.b;
                acuz acuzVarP = akzxVarP2.p();
                j$.util.Objects.requireNonNull(acuzVarP);
                acuxVar2.g = acuzVarP;
                acuxVar2.b |= 2048;
                acux acuxVarP = akzxVarP.p();
                defpackage.aliq aliqVar = new defpackage.aliq(null, null);
                aliqVar.o(acuxVarP);
                defpackage.acuo acuoVarN = aliqVar.n();
                defpackage.acvi acviVarA = defpackage.acvj.a();
                acviVarA.c(acuxVarP.c);
                acuz acuzVar3 = acuxVarP.g;
                if (acuzVar3 == null) {
                    acuzVar3 = acuz.a;
                }
                tzq tzqVar = ((ubj) obj7).b;
                acviVarA.b(ahyn.h(acuzVar3));
                defpackage.acvj acvjVarA = acviVarA.a();
                tzq.a.b().l("com/android/dialer/sonic/impl/mdd/SonicMddRepository", "downloadInForeground", 139, "SonicMddRepository.java").v("starting download request");
                ahrv ahrvVarG = ahrv.g(tzqVar.d.E(acuoVarN));
                defpackage.tak takVar = new defpackage.tak(tzqVar, acvjVarA, i3, bArr);
                ajct ajctVar2 = tzqVar.c;
                return ahrvVarG.i(takVar, ajctVar2).h(new defpackage.tbp(14), ajctVar2);
            case 19:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    ubj.a.b().l("com/android/dialer/sonic/impl/settings/SonicSettingsMddDownloader", "downloadMddResourcesIfEnabled", 82, "SonicSettingsMddDownloader.java").v("Skipping Sonic MDD resources downloading as the feature is disabled");
                    return ajcm.a;
                }
                java.lang.Object obj8 = this.a;
                acux acuxVar3 = defpackage.tzm.a;
                int i12 = acuxVar3.e;
                defpackage.acvm acvmVarA = defpackage.acvn.a();
                acvmVarA.b(acuxVar3.c);
                defpackage.acvn acvnVarA = acvmVarA.a();
                ubj ubjVar = (ubj) obj8;
                tzq tzqVar2 = ubjVar.b;
                return ahvr.I(tzqVar2.a(tzqVar2.d.G(acvnVarA), i12), new defpackage.tct(obj8, i), ubjVar.c);
            default:
                udy udyVar = ((udd) this.a).b;
                udy udyVar2 = udyVar;
                return ahvr.B(((java.lang.Boolean) udyVar2.j.a()).booleanValue() ? udyVar2.d.eU(ahqx.i(new defpackage.syg(udyVar, (aify) obj, i2))) : ajcm.a, java.lang.Throwable.class, ahqx.a(new ubc(3)), ajbm.a);
        }
    }
}
