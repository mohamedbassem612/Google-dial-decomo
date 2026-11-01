package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class whr implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ whr(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.Collection] */
    public final ajcq a(java.lang.Object obj) {
        int i = 20;
        int i2 = 10;
        int i3 = 16;
        int i4 = 18;
        int i5 = 8;
        int i6 = 4;
        byte[] bArr = null;
        int i7 = 0;
        int i8 = 2;
        int i9 = 1;
        switch (this.$cid) {
            case 0:
                return ((defpackage.whs) this.a).h.e((java.lang.String) this.b);
            case 1:
                return ((defpackage.whs) this.a).f.d((java.lang.String) this.b);
            case 2:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return aiql.z(java.lang.Boolean.FALSE);
                }
                return ((defpackage.wio) this.b).g((oqi) this.a, oqt.d);
            case 3:
                ahvr.bZ(((java.lang.Boolean) obj).booleanValue(), "failed to add file group");
                return ((defpackage.wkc) this.a).e.F((defpackage.acvj) this.b);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                char[] charArray = ((java.lang.String) this.b).toCharArray();
                aooh.f(charArray, "dtmfTones");
                defpackage.wla wlaVar = ((defpackage.wky) this.a).f;
                return ahvr.I(aosv.C(aoov.am(wlaVar.b, 0, new defpackage.vjf(wlaVar, charArray, (aoln) null, 17), 3)), new defpackage.wkv(new ukw(13), 6), wlaVar.a);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (optional.isPresent()) {
                    defpackage.wmy.a.b().l("com/android/dialer/xatu/impl/service/XatuSupportedNumbers", "getEligibilityData", 101, "XatuSupportedNumbers.java").v("result found in cache");
                    return aiql.z((nzb) optional.orElseThrow());
                }
                java.lang.Object obj2 = this.b;
                java.lang.Object obj3 = this.a;
                defpackage.wmy wmyVar = (defpackage.wmy) obj3;
                return ahrv.g(wmyVar.a((java.lang.String) obj2)).i(new defpackage.wkv(obj3, i5), wmyVar.d).h(new wym(obj3, obj2, 1, (byte[]) null), wmyVar.c);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((defpackage.wmy) this.a).j.v((java.lang.String) this.b, (java.lang.String) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((defpackage.wmy) this.b).j.t((hkd) this.a, (hkd) obj);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return ((defpackage.wmy) this.b).h.a((hkd) this.a, 2);
                }
                akzx akzxVarM = nzb.a.m();
                akzxVarM.u();
                nzb nzbVar = akzxVarM.b;
                nzbVar.b |= 1;
                nzbVar.c = true;
                akzxVarM.u();
                nzb nzbVar2 = akzxVarM.b;
                nzbVar2.d = 4;
                nzbVar2.b |= 2;
                return aiql.z(akzxVarM.p());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.lang.Object obj4 = this.a;
                if (!((defpackage.wrc) obj4).a.isPresent()) {
                    return aiql.z(j$.util.Optional.empty());
                }
                java.lang.Object obj5 = this.b;
                return ahvr.F(new defpackage.whv(obj5, obj4, i2, bArr), ((defpackage.wrh) obj5).e);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.wrk wrkVar = (defpackage.wrk) obj;
                aify aifyVar = (aify) j$.util.Collection.-EL.stream((java.util.Collection) this.b).filter(new defpackage.wrm(i9)).map(new defpackage.vun(i4)).collect(aido.a);
                defpackage.whz whzVar = ((defpackage.wrj) this.a).d;
                aigf aigfVar = defpackage.whz.a;
                aoin aoinVar = whzVar.c;
                if (!aigfVar.containsKey(aoinVar.a())) {
                    return aiql.y(new java.lang.IllegalStateException(java.lang.String.format("flag domain: %s not found", aoinVar.a())));
                }
                java.lang.String str = (java.lang.String) aigfVar.get(aoinVar.a());
                akzx akzxVarM2 = defpackage.ahwh.a.m();
                akzxVarM2.u();
                defpackage.ahwh ahwhVar = (defpackage.ahwh) akzxVarM2.b;
                j$.util.Objects.requireNonNull(wrkVar);
                ahwhVar.f = wrkVar;
                ahwhVar.b |= 16;
                java.lang.String str2 = wrkVar.c;
                akzxVarM2.u();
                defpackage.ahwh ahwhVar2 = (defpackage.ahwh) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str2);
                ahwhVar2.b |= 4;
                ahwhVar2.e = str2;
                return ahrv.g(ahvr.F(new defpackage.whv(aifyVar, akzxVarM2, i8), whzVar.d)).i(new defpackage.why(whzVar, str, wrkVar, i7), whzVar.e).h(new vrx(18), whzVar.f);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                akzx akzxVarM3 = idt.a.m();
                akzxVarM3.u();
                idt idtVar = akzxVarM3.b;
                java.lang.Object obj6 = this.b;
                j$.util.Objects.requireNonNull(obj6);
                idtVar.b |= 1;
                idtVar.e = (java.lang.String) obj6;
                akzx akzxVarM4 = idr.a.m();
                akzxVarM4.u();
                idr idrVar = akzxVarM4.b;
                idrVar.b |= 1;
                idrVar.e = 16000;
                akzxVarM4.u();
                idr idrVar2 = akzxVarM4.b;
                idrVar2.b |= 2;
                idrVar2.f = 1;
                akzxVarM4.u();
                idr idrVar3 = akzxVarM4.b;
                idrVar3.b |= 4;
                idrVar3.g = 2;
                akzxVarM4.u();
                idr idrVar4 = akzxVarM4.b;
                idrVar4.b |= 8;
                idrVar4.h = 16000;
                akzx akzxVarM5 = idq.a.m();
                akzxVarM5.u();
                idq idqVar = akzxVarM5.b;
                idqVar.b |= 1;
                idqVar.c = 8;
                akzxVarM4.u();
                idr idrVar5 = akzxVarM4.b;
                idq idqVarP = akzxVarM5.p();
                j$.util.Objects.requireNonNull(idqVarP);
                idrVar5.d = idqVarP;
                idrVar5.c = 5;
                akzxVarM3.u();
                idt idtVar2 = akzxVarM3.b;
                idr idrVarP = akzxVarM4.p();
                j$.util.Objects.requireNonNull(idrVarP);
                idtVar2.d = idrVarP;
                idtVar2.c = 2;
                return ((defpackage.wrj) this.a).e.n(akzxVarM3.p(), (akzc) obj);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                final aify aifyVar2 = (aify) obj;
                final defpackage.wqs wqsVar = (defpackage.wqs) this.a;
                java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: wri
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        j$.util.Optional optionalEmpty;
                        j$.util.Optional optionalEmpty2;
                        j$.util.Optional optionalEmpty3;
                        akzx akzxVarM6 = defpackage.wrk.a.m();
                        defpackage.wqs wqsVar2 = wqsVar;
                        java.lang.String str3 = wqsVar2.d;
                        akzxVarM6.u();
                        defpackage.wrk wrkVar2 = (defpackage.wrk) akzxVarM6.b;
                        j$.util.Objects.requireNonNull(str3);
                        wrkVar2.b |= 1;
                        wrkVar2.c = str3;
                        java.lang.String str4 = wqsVar2.e;
                        akzxVarM6.u();
                        defpackage.wrk wrkVar3 = (defpackage.wrk) akzxVarM6.b;
                        j$.util.Objects.requireNonNull(str4);
                        wrkVar3.b |= 2;
                        wrkVar3.d = str4;
                        for (defpackage.wrf wrfVar : wqsVar2.c) {
                            akzx akzxVarM7 = defpackage.wrq.a.m();
                            long j = wrfVar.c;
                            akzxVarM7.u();
                            defpackage.wrq wrqVar = (defpackage.wrq) akzxVarM7.b;
                            wrqVar.b |= 1;
                            wrqVar.c = j;
                            try {
                                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(wrfVar.e);
                                try {
                                    optionalEmpty = j$.util.Optional.of((defpackage.wqv) alad.A(defpackage.wqv.a, fileInputStream, akzq.a()));
                                    fileInputStream.close();
                                } catch (java.lang.Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (java.lang.Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (java.io.IOException e) {
                                a.bq(defpackage.wrj.a.c(), "unable to read persisted tree proto", "com/android/dialer/xatu/impl/storage/postcall/XatuDonationScottyUploader", "getXatuPersistedTree", (char) 259, "XatuDonationScottyUploader.java", e, zct.b);
                                optionalEmpty = j$.util.Optional.empty();
                            }
                            j$.util.Objects.requireNonNull(akzxVarM7);
                            defpackage.wlm wlmVar = new defpackage.wlm(akzxVarM7, 12);
                            if (true == optionalEmpty.isPresent()) {
                                java.lang.Object obj7 = optionalEmpty.get();
                                akzx akzxVar = (akzx) wlmVar.a;
                                akzxVar.u();
                                defpackage.wrq wrqVar2 = (defpackage.wrq) akzxVar.b;
                                j$.util.Objects.requireNonNull(obj7);
                                wrqVar2.d = (defpackage.wqv) obj7;
                                wrqVar2.b |= 2;
                            }
                            try {
                                java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(wrfVar.f);
                                try {
                                    optionalEmpty2 = j$.util.Optional.of((defpackage.wqu) alad.A(defpackage.wqu.a, fileInputStream2, akzq.a()));
                                    fileInputStream2.close();
                                } catch (java.lang.Throwable th3) {
                                    try {
                                        fileInputStream2.close();
                                    } catch (java.lang.Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            } catch (java.io.IOException e2) {
                                a.bq(defpackage.wrj.a.c(), "unable to read duplex logs proto", "com/android/dialer/xatu/impl/storage/postcall/XatuDonationScottyUploader", "getXatuPersistedDuplexLogs", (char) 272, "XatuDonationScottyUploader.java", e2, zct.b);
                                optionalEmpty2 = j$.util.Optional.empty();
                            }
                            j$.util.Objects.requireNonNull(akzxVarM7);
                            defpackage.wlm wlmVar2 = new defpackage.wlm(akzxVarM7, 9);
                            if (true == optionalEmpty2.isPresent()) {
                                java.lang.Object obj8 = optionalEmpty2.get();
                                akzx akzxVar2 = (akzx) wlmVar2.a;
                                akzxVar2.u();
                                defpackage.wrq wrqVar3 = (defpackage.wrq) akzxVar2.b;
                                j$.util.Objects.requireNonNull(obj8);
                                wrqVar3.e = (defpackage.wqu) obj8;
                                wrqVar3.b |= 4;
                            }
                            try {
                                java.io.FileInputStream fileInputStream3 = new java.io.FileInputStream(wrfVar.g);
                                try {
                                    optionalEmpty3 = j$.util.Optional.of((defpackage.whw) alad.A(defpackage.whw.a, fileInputStream3, akzq.a()));
                                    fileInputStream3.close();
                                    j$.util.Objects.requireNonNull(akzxVarM7);
                                    defpackage.wlm wlmVar3 = new defpackage.wlm(akzxVarM7, 10);
                                    if (true == optionalEmpty3.isPresent()) {
                                        java.lang.Object obj9 = optionalEmpty3.get();
                                        akzx akzxVar3 = (akzx) wlmVar3.a;
                                        akzxVar3.u();
                                        defpackage.wrq wrqVar4 = (defpackage.wrq) akzxVar3.b;
                                        j$.util.Objects.requireNonNull(obj9);
                                        wrqVar4.f = (defpackage.whw) obj9;
                                        wrqVar4.b |= 8;
                                    }
                                    java.util.List list = aifyVar2;
                                    int iIndexOf = wqsVar2.c.indexOf(wrfVar);
                                    if (iIndexOf < list.size()) {
                                        j$.util.Optional optional2 = (j$.util.Optional) list.get(iIndexOf);
                                        defpackage.wlm wlmVar4 = new defpackage.wlm(akzxVarM7, 11);
                                        if (true == optional2.isPresent()) {
                                            java.lang.Object obj10 = optional2.get();
                                            java.lang.Object obj11 = wlmVar4.a;
                                            java.lang.String str5 = ((defpackage.whx) obj10).a;
                                            akzx akzxVar4 = (akzx) obj11;
                                            akzxVar4.u();
                                            defpackage.wrq wrqVar5 = (defpackage.wrq) akzxVar4.b;
                                            j$.util.Objects.requireNonNull(str5);
                                            wrqVar5.b |= 16;
                                            wrqVar5.g = str5;
                                        }
                                    } else {
                                        defpackage.wrj.a.d().i(zct.b).l("com/android/dialer/xatu/impl/storage/postcall/XatuDonationScottyUploader", "buildFeedbackMetrics", 121, "XatuDonationScottyUploader.java").w("no matching audio file element found for index %d", iIndexOf);
                                    }
                                    if ((wrfVar.b & 64) != 0) {
                                        int i10 = wrfVar.i;
                                        akzxVarM7.u();
                                        defpackage.wrq wrqVar6 = (defpackage.wrq) akzxVarM7.b;
                                        wrqVar6.b |= 32;
                                        wrqVar6.h = i10;
                                    }
                                    defpackage.wrq wrqVar7 = (defpackage.wrq) akzxVarM7.p();
                                    akzxVarM6.u();
                                    defpackage.wrk wrkVar4 = (defpackage.wrk) akzxVarM6.b;
                                    j$.util.Objects.requireNonNull(wrqVar7);
                                    alat alatVar = wrkVar4.e;
                                    if (!alatVar.c()) {
                                        wrkVar4.e = alad.J(alatVar);
                                    }
                                    wrkVar4.e.add(wrqVar7);
                                } catch (java.lang.Throwable th5) {
                                    try {
                                        fileInputStream3.close();
                                    } catch (java.lang.Throwable th6) {
                                        th5.addSuppressed(th6);
                                    }
                                    throw th5;
                                }
                            } catch (java.io.IOException e3) {
                                a.bq(defpackage.wrj.a.c(), "unable to read xatu session logs proto", "com/android/dialer/xatu/impl/storage/postcall/XatuDonationScottyUploader", "getXatuSessionLogs", (char) 288, "XatuDonationScottyUploader.java", e3, zct.b);
                                optionalEmpty3 = j$.util.Optional.empty();
                            }
                        }
                        return (defpackage.wrk) akzxVarM6.p();
                    }
                };
                java.lang.Object obj7 = this.b;
                defpackage.wrj wrjVar = (defpackage.wrj) obj7;
                return ahvr.I(ahvr.F(callable, wrjVar.b), new defpackage.whr(obj7, aifyVar2, i2), wrjVar.c);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                if (((apjb) obj).n()) {
                    a.bI(wrp.a.d(), "exception uploading audio to Scotty", "com/android/dialer/xatu/impl/storage/postcall/XatuMetricsWorker", "handleUploadToScotty", 'n', "XatuMetricsWorker.java", zct.b);
                    return ajcm.a;
                }
                java.lang.Object obj8 = this.a;
                wrp wrpVar = (wrp) this.b;
                return ahvr.H(wrpVar.g.a(aify.p(java.lang.Long.valueOf(((defpackage.wqp) obj8).c))), new defpackage.wkb(20), wrpVar.f);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                defpackage.wwj wwjVar = (defpackage.wwj) this.b;
                wwjVar.h = zBooleanValue;
                defpackage.wwj.a.b().l("com/android/incallui/atlas/detection/techniques/composite/CompositeModelRunner", "initAsr", 206, "CompositeModelRunner.java").y("SODA available: %b", java.lang.Boolean.valueOf(wwjVar.h));
                if (!wwjVar.h) {
                    return ajcm.a;
                }
                java.lang.Object obj9 = this.a;
                defpackage.wwd wwdVar = wwjVar.e;
                return wwdVar.j.e(ahqx.b(new defpackage.vfm(wwdVar, obj9, i)), wwdVar.c);
            case 15:
                java.lang.Object obj10 = this.b;
                defpackage.wwj wwjVar2 = (defpackage.wwj) obj10;
                defpackage.wwd wwdVar2 = wwjVar2.e;
                akff akffVar = gus.ae(wwdVar2.b).toLanguageTag().equals(java.util.Locale.JAPAN.toLanguageTag()) ? akff.n : akff.f;
                twp twpVar = wwdVar2.i;
                java.lang.Object obj11 = this.a;
                ajcq ajcqVarC = twpVar.c(akffVar);
                ajcq ajcqVarE = twpVar.e();
                defpackage.wro wroVar = new defpackage.wro(i6);
                ajct ajctVar = wwdVar2.c;
                ajcq ajcqVarH = ahvr.H(ajcqVarE, wroVar, ajctVar);
                return ahrv.g(ahvr.ak(new ajcq[]{ajcqVarH, ajcqVarC}).o(new defpackage.whv(ajcqVarH, ajcqVarC, i3), ajctVar)).i(new defpackage.whr(obj10, obj11, 14, bArr), wwjVar2.b);
            case 16:
                java.lang.Object obj12 = this.a;
                java.lang.Object obj13 = this.b;
                return ahvr.F(new defpackage.wwx(obj13, obj12, (java.lang.String) obj, i7), ((defpackage.wxb) obj13).f);
            case 17:
                return ((defpackage.wyn) this.a).m.v((java.lang.String) this.b, (java.lang.String) obj);
            case 18:
                defpackage.wyn wynVar = (defpackage.wyn) this.a;
                hkd hkdVar = (hkd) obj;
                if (((alfc) wynVar.g.a()).b.contains(hkdVar.c)) {
                    java.lang.Object obj14 = this.b;
                    defpackage.wyn.a.b().l("com/android/incallui/atlas/ui/impl/businessfinder/AtlasBusinessFinderImpl", "findBusinessMatchingPhoneNumber", 224, "AtlasBusinessFinderImpl.java").v("business opted out");
                    wynVar.k.add(obj14);
                    return aiql.z(j$.util.Optional.empty());
                }
                java.lang.String strQ = ahvr.q(hkdVar.h);
                if (hkdVar.g && ((alfc) wynVar.h.a()).b.contains(strQ)) {
                    defpackage.wyn.a.b().l("com/android/incallui/atlas/ui/impl/businessfinder/AtlasBusinessFinderImpl", "findBusinessMatchingPhoneNumber", 230, "AtlasBusinessFinderImpl.java").v("toll-free number");
                    return aiql.z(j$.util.Optional.of(defpackage.wvj.TOLL_FREE));
                }
                j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((defpackage.wvj) ((aigf) wynVar.c.d.eZ()).get(hkdVar.c));
                if (optionalOfNullable.isPresent()) {
                    defpackage.wyn.a.b().l("com/android/incallui/atlas/ui/impl/businessfinder/AtlasBusinessFinderImpl", "findBusinessMatchingPhoneNumber", 238, "AtlasBusinessFinderImpl.java").v("test number");
                    return aiql.z(optionalOfNullable);
                }
                java.lang.String strQ2 = ahvr.q(hkdVar.h);
                for (java.lang.String str3 : ((alfc) wynVar.i.a()).b) {
                    if (str3.contains("_")) {
                        java.util.List listJ = ahzf.b('_').j(str3);
                        java.lang.String str4 = (java.lang.String) listJ.get(0);
                        java.lang.String str5 = (java.lang.String) listJ.get(1);
                        if (strQ2.equals(str4) && hkdVar.c.startsWith(str5)) {
                            defpackage.wyn.a.b().l("com/android/incallui/atlas/ui/impl/businessfinder/AtlasBusinessFinderImpl", "findBusinessMatchingPhoneNumber", 243, "AtlasBusinessFinderImpl.java").v("in client-side non-toll-free number allow list");
                            return aiql.z(j$.util.Optional.of(defpackage.wvj.WHITELISTED_NON_TOLL_FREE));
                        }
                    }
                }
                return ahrv.g(wynVar.e.a(hkdVar, 3)).h(new defpackage.wro(i5), wynVar.f);
            case 19:
                java.lang.Object obj15 = this.b;
                wyo wyoVar = (wyo) obj15;
                ahrv ahrvVarI = ahrv.g(wyoVar.f.bk()).i(new defpackage.wkv(obj15, 15), ajbm.a);
                defpackage.wkv wkvVar = new defpackage.wkv(obj15, i3);
                ajct ajctVar2 = wyoVar.b;
                return ahvr.H(ahrvVarI.i(wkvVar, ajctVar2), new wym(obj15, this.a, 3), ajctVar2);
            default:
                wyo.a.b().l("com/android/incallui/atlas/ui/impl/calllog/AtlasCallLogDataSource", "handleDeletes", 209, "AtlasCallLogDataSource.java").v("handle deletes");
                java.util.Set set = ((kfk) this.a).c;
                if (set.isEmpty()) {
                    return ajcm.a;
                }
                wyo wyoVar2 = (wyo) this.b;
                ajcq ajcqVarAb = wyoVar2.e.ab(set);
                defpackage.wro wroVar2 = new defpackage.wro(9);
                ajct ajctVar3 = wyoVar2.b;
                ahrv ahrvVarG = ahrv.g(ahvr.H(ajcqVarAb, wroVar2, ajctVar3));
                wzd wzdVar = wyoVar2.c;
                j$.util.Objects.requireNonNull(wzdVar);
                return ahrvVarG.i(new defpackage.wkv(wzdVar, i4), ajctVar3);
        }
    }

    public /* synthetic */ whr(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
