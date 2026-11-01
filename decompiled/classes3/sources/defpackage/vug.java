package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vug implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vug(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v42, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, java.util.List] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws aois {
        int i = 8;
        int i2 = 3;
        int i3 = 2;
        int i4 = 0;
        int i5 = 1;
        switch (this.$cid) {
            case 0:
                try {
                    return (aify) j$.util.Collection.-EL.stream((java.util.Collection) this.a).map(new defpackage.vun(i5)).collect(aido.a);
                } catch (defpackage.ahzq e) {
                    throw e.d(java.util.concurrent.ExecutionException.class);
                }
            case 1:
                return (defpackage.vtu) aiql.H((java.util.concurrent.Future) this.a);
            case 2:
                ?? r0 = this.a;
                java.lang.String[] strArr = vva.a;
                return (aify) j$.util.Collection.-EL.stream((java.util.Collection) r0).map(new defpackage.vun(i2)).collect(aido.a);
            case 3:
                zjs zjsVar = ((defpackage.wcw) this.a).a;
                j$.util.Optional optionalH = zjsVar.h("voicemail");
                if (!optionalH.isPresent()) {
                    return defpackage.zui.a;
                }
                java.lang.String str = (java.lang.String) zjsVar.k((android.telecom.PhoneAccountHandle) optionalH.orElseThrow()).orElseThrow();
                akzx akzxVarM = defpackage.zui.a.m();
                akzxVarM.u();
                defpackage.zui zuiVar = (defpackage.zui) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                zuiVar.b |= 1;
                zuiVar.c = str;
                return (defpackage.zui) akzxVarM.p();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                wgl wglVar = (wgl) this.a;
                j$.util.Optional optionalH2 = wglVar.d.h("tel");
                if (optionalH2.isPresent()) {
                    return wglVar.a((android.telecom.PhoneAccountHandle) optionalH2.orElseThrow());
                }
                a.bI(wgl.a.d(), "default outgoing phone account is null", "com/android/dialer/wificallingicons/impl/service/WifiCallingIconsConfigService", "getWifiCallingIconsConfigForDefaultPhoneAccountHandle", 'k', "WifiCallingIconsConfigService.java", zct.b);
                return wgi.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aca acaVar = new aca();
                wgl wglVar2 = (wgl) this.a;
                for (android.telecom.PhoneAccountHandle phoneAccountHandle : wglVar2.d.t()) {
                    acaVar.put(phoneAccountHandle, wglVar2.a(phoneAccountHandle));
                }
                wgl.a.b().l("com/android/dialer/wificallingicons/impl/service/WifiCallingIconsConfigService", "getWifiCallingIconsConfigForAllSubscriptionPhoneAccountHandles", 129, "WifiCallingIconsConfigService.java").y("Returning wifi calling icons config for all subscriptions: %s", j$.util.Collection.-EL.stream(acaVar.values()).map(new defpackage.vun(i)).toArray());
                return aigf.i(acaVar);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.wjb wjbVar = (defpackage.wjb) this.a;
                java.util.LinkedHashMap linkedHashMap = wjbVar.b;
                if (!linkedHashMap.isEmpty()) {
                    akzx akzxVarM2 = aiyo.a.m();
                    aify aifyVarA = wjbVar.a();
                    akzxVarM2.u();
                    aiyo aiyoVar = akzxVarM2.b;
                    alat alatVar = aiyoVar.b;
                    if (!alatVar.c()) {
                        aiyoVar.b = alad.J(alatVar);
                    }
                    akyl.i(aifyVarA, aiyoVar.b);
                    akzx akzxVar = wjbVar.c;
                    akzxVar.u();
                    aiyr aiyrVar = akzxVar.b;
                    aiyo aiyoVarP = akzxVarM2.p();
                    aiyr aiyrVar2 = aiyr.a;
                    j$.util.Objects.requireNonNull(aiyoVarP);
                    aiyrVar.g = aiyoVarP;
                    aiyrVar.b |= 8;
                }
                java.util.Map mapAS = ajsz.aS(linkedHashMap);
                aiyr aiyrVarP = wjbVar.c.p();
                aooh.e(aiyrVarP, "build(...)");
                defpackage.wiy wiyVar = new defpackage.wiy(mapAS, aiyrVarP);
                linkedHashMap.clear();
                akzx akzxVarM3 = aiyr.a.m();
                aooh.e(akzxVarM3, "newBuilder(...)");
                wjbVar.c = akzxVarM3;
                return wiyVar;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                ((defpackage.wky) this.a).G.bm(rmu.z);
                return null;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.wky wkyVar = (defpackage.wky) this.a;
                defpackage.woo wooVar = wkyVar.D.n().d;
                if (wooVar == null) {
                    wooVar = defpackage.woo.a;
                }
                defpackage.won wonVarB = defpackage.won.b(wooVar.c);
                if (wonVarB == null) {
                    wonVarB = defpackage.won.UNRECOGNIZED;
                }
                if (wonVarB == defpackage.won.NOT_A_XATU_CALL) {
                    return null;
                }
                wkyVar.i.j(ruc.r);
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                agsm.i(1076, ((defpackage.wky) this.a).b(), "failed to close ui", new java.lang.Object[0]);
                return null;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.woo wooVar2 = ((defpackage.abtr) this.a.a()).n().d;
                if (wooVar2 == null) {
                    wooVar2 = defpackage.woo.a;
                }
                defpackage.won wonVarB2 = defpackage.won.b(wooVar2.c);
                if (wonVarB2 == null) {
                    wonVarB2 = defpackage.won.UNRECOGNIZED;
                }
                return (wonVarB2 == defpackage.won.IN_SESSION || wonVarB2 == defpackage.won.UI_SHOWN_NOT_IN_SESSION) ? j$.util.Optional.of(defpackage.pzp.XATU_SCREEN) : j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.wpg wpgVar = ((defpackage.abtr) this.a).n().c;
                if (wpgVar == null) {
                    wpgVar = defpackage.wpg.a;
                }
                return wpgVar.h == 1 ? j$.util.Optional.of(defpackage.qtz.SNACKBAR_XATU_AUTOMATIC_DISPLAY_OPT_OUT) : j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                if (!((zzx) this.a).o()) {
                    return j$.util.Optional.empty();
                }
                defpackage.oum oumVar = new defpackage.oum();
                oumVar.d(defpackage.ous.XATU);
                oumVar.b(new defpackage.ouo(2131232009, 2131102976));
                oumVar.c(2132021052);
                return j$.util.Optional.of(oumVar.a());
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.wpg wpgVar2 = ((defpackage.abtr) this.a).n().c;
                if (wpgVar2 == null) {
                    wpgVar2 = defpackage.wpg.a;
                }
                return wpgVar2.h == 2 ? j$.util.Optional.of(defpackage.qtz.SNACKBAR_XATU_AUTOMATIC_DISPLAY_OPT_OUT_CONFIRMATION) : j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return rlt.a(((defpackage.wmy) this.a).b, (android.telecom.PhoneAccountHandle) null);
            case 15:
                defpackage.wqo wqoVar = (defpackage.wqo) this.a;
                wqoVar.c(wqoVar.d);
                return wqoVar.b();
            case 16:
                aift aiftVar = new aift(4);
                while (true) {
                    ?? r2 = this.a;
                    if (i4 >= r2.size()) {
                        return aiftVar.h();
                    }
                    j$.util.Optional optional = (j$.util.Optional) aiql.H((java.util.concurrent.Future) r2.get(i4));
                    if (optional.isPresent()) {
                        java.io.File file = new java.io.File(((idv) optional.orElseThrow()).c);
                        if (file.exists()) {
                            java.lang.String name = file.getName();
                            if (name == null) {
                                throw new java.lang.NullPointerException("Null fileName");
                            }
                            akzc akzcVarA = defpackage.wrj.a(file);
                            if (akzcVarA == null) {
                                throw new java.lang.NullPointerException("Null audioData");
                            }
                            aiftVar.i(j$.util.Optional.of(new defpackage.whx(name, akzcVarA)));
                            if (!file.exists()) {
                                defpackage.wrj.a.b().l("com/android/dialer/xatu/impl/storage/postcall/XatuDonationScottyUploader", "deleteFile", 306, "XatuDonationScottyUploader.java").y("file %s doesn't exist", file.getName());
                            } else if (!file.delete()) {
                                a.bt(defpackage.wrj.a.d(), "unable to delete file %s", file.getName(), "com/android/dialer/xatu/impl/storage/postcall/XatuDonationScottyUploader", "deleteFile", (char) 311, "XatuDonationScottyUploader.java", zct.b);
                            }
                        } else {
                            aiftVar.i(j$.util.Optional.empty());
                            a.bt(defpackage.wrj.a.d(), "file %s doesn't exist", file.getName(), "com/android/dialer/xatu/impl/storage/postcall/XatuDonationScottyUploader", "prepareAudioUploadForScotty", (char) 181, "XatuDonationScottyUploader.java", zct.b);
                        }
                    } else {
                        aiftVar.i(j$.util.Optional.empty());
                        a.bI(defpackage.wrj.a.d(), "no encoded audio data found", "com/android/dialer/xatu/impl/storage/postcall/XatuDonationScottyUploader", "prepareAudioUploadForScotty", (char) 170, "XatuDonationScottyUploader.java", zct.b);
                    }
                    i4++;
                }
                break;
            case 17:
                return defpackage.wrj.a(new java.io.File((java.lang.String) this.a));
            case 18:
                defpackage.wvn wvnVar = (defpackage.wvn) this.a;
                if (!wvnVar.h.isPresent()) {
                    defpackage.wvn.a.b().l("com/android/incallui/atlas/detection/detectors/callaudiodetector/CallAudioAtlasDetector", "closeResources", 156, "CallAudioAtlasDetector.java").v("resources are already closed");
                    return null;
                }
                defpackage.wvx wvxVar = wvnVar.b;
                if (((java.lang.Boolean) wvxVar.d.a()).booleanValue()) {
                    j$.util.Optional optional2 = wvxVar.e;
                    if (true == optional2.isPresent()) {
                        ((defpackage.wvw) optional2.get()).b = null;
                    }
                    wvxVar.e = j$.util.Optional.empty();
                }
                defpackage.wvt wvtVar = wvxVar.c;
                a.bI(defpackage.wwj.a.b(), "closing resources", "com/android/incallui/atlas/detection/techniques/composite/CompositeModelRunner", "closeResources", (char) 237, "CompositeModelRunner.java", zct.a);
                defpackage.wwj wwjVar = (defpackage.wwj) wvtVar;
                wwjVar.f.g.set(false);
                defpackage.wxc wxcVar = wwjVar.c;
                agsm.i(1136, wxcVar.i.d(ahqx.i(new defpackage.wwy(wxcVar, i3)), wxcVar.d), "failed to close resources", new java.lang.Object[0]);
                agsm.i(1129, ahrv.g(wwjVar.d.a()).h(new defpackage.wro(5), wwjVar.b), "failed to close HoldDetectionModel resources", new java.lang.Object[0]);
                if (wwjVar.h) {
                    wwjVar.e.a();
                }
                wvnVar.h = j$.util.Optional.empty();
                return null;
            case 19:
                defpackage.wvq wvqVar = (defpackage.wvq) this.a;
                wvqVar.h.x();
                wvqVar.e.clear();
                wvqVar.i.x();
                wvqVar.f = false;
                wvqVar.g = j$.util.OptionalLong.empty();
                return null;
            default:
                defpackage.wvq wvqVar2 = (defpackage.wvq) this.a;
                ahvr.bY(wvqVar2.f);
                akzx akzxVarM4 = defpackage.wus.a.m();
                akzx akzxVar2 = wvqVar2.h;
                defpackage.wvi wviVar = (defpackage.wvi) akzxVar2.p();
                if (!wviVar.equals(defpackage.wvi.a)) {
                    akzxVarM4.u();
                    defpackage.wus wusVar = (defpackage.wus) akzxVarM4.b;
                    j$.util.Objects.requireNonNull(wviVar);
                    wusVar.c = wviVar;
                    wusVar.b |= 1;
                }
                int i6 = ((defpackage.wvi) akzxVar2.b).b;
                if ((i6 & 2) != 0 && (i6 & 4) != 0 && !wvqVar2.e.isEmpty()) {
                    defpackage.wxm wxmVar = wvqVar2.d;
                    long asLong = wvqVar2.g.getAsLong();
                    aift aiftVar2 = new aift(4);
                    defpackage.wvi wviVar2 = (defpackage.wvi) akzxVar2.b;
                    long j = wviVar2.d;
                    long j2 = wviVar2.e;
                    aoin aoinVar = wvqVar2.b;
                    long jMax = java.lang.Math.max(j, j2 - (((java.lang.Long) aoinVar.a()).longValue() * 1000));
                    long j3 = j2;
                    while (jMax > j) {
                        aiftVar2.i(wvqVar2.b(jMax, j3));
                        i5 = i5 == i3 ? 3 : i5 << 1;
                        long j4 = jMax;
                        jMax = java.lang.Math.max(j, jMax - ((((long) i5) * ((java.lang.Long) aoinVar.a()).longValue()) * 1000));
                        j3 = j4;
                        wxmVar = wxmVar;
                        i3 = 2;
                    }
                    aiftVar2.i(wvqVar2.b(jMax, j3));
                    aike aikeVarH = aiftVar2.h();
                    defpackage.wxm.a.b().l("com/android/incallui/atlas/logger/AtlasCallMetricsLogger", "logSoundEventCounters", 175, "AtlasCallMetricsLogger.java").w("hold for me audio sound event counter size:%d", aikeVarH.d);
                    wxmVar.d(asLong, new defpackage.who(aikeVarH, 10));
                }
                return (defpackage.wus) akzxVarM4.p();
        }
    }
}
