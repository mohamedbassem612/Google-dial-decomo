package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class rht implements ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ rht(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map$Entry] */
    public final java.lang.Object apply(java.lang.Object obj) {
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                defpackage.rhq rhqVar = (defpackage.rhq) obj;
                return (rhqVar.b & 1) != 0 ? j$.util.Optional.of(java.lang.Boolean.valueOf(rhqVar.c)) : j$.util.Optional.empty();
            case 1:
                defpackage.rau.a.c().k((java.lang.Throwable) obj).g(10, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/incall/voice/service/VoiceProducerModule", "produceSelectedCenterFragmentKey", 602, "VoiceProducerModule.java").v("error selecting promo");
                return j$.util.Optional.empty();
            case 2:
                return (aify) j$.util.Collection.-EL.stream((java.util.List) obj).filter(new mif(17)).map(new defpackage.rat(6)).collect(aido.a);
            case 3:
                aigf aigfVar = (aigf) obj;
                defpackage.ruv ruvVar = (defpackage.ruv) j$.util.Collection.-EL.stream(aigfVar.f()).min(j$.util.Comparator.-CC.comparingInt(new defpackage.rar(7))).orElse((java.lang.Object) null);
                return ruvVar == null ? j$.util.Optional.empty() : (j$.util.Optional) aigfVar.get(ruvVar);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.ahaq ahaqVarA = defpackage.ahar.a();
                ahaqVarA.b(false);
                ahaqVarA.a = defpackage.ahap.b;
                ahaqVarA.c(akzc.v((java.lang.String) obj, java.nio.charset.StandardCharsets.UTF_8));
                return ahaqVarA.a();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return j$.util.Optional.ofNullable(obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                akzx akzxVarM = defpackage.spn.a.m();
                ailj ailjVarK = ((aigf) obj).e().k();
                while (ailjVarK.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
                    j$.util.Optional optional = (j$.util.Optional) entry.getValue();
                    defpackage.qgz qgzVar = new defpackage.qgz(entry, akzxVarM, 9, bArr);
                    if (true == optional.isPresent()) {
                        ((sqn) qgzVar.a.getKey()).h((akzx) qgzVar.b, optional.get());
                    }
                }
                return (defpackage.spn) akzxVarM.p();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                akzx akzxVarM2 = defpackage.spe.a.m();
                akzxVarM2.O((java.util.Set) obj);
                return (defpackage.spe) akzxVarM2.p();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.util.List list = (java.util.List) obj;
                aimz aimzVar = sqq.a;
                akzx akzxVarM3 = defpackage.spe.a.m();
                ahvr.ci(list);
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    akzxVarM3.O(((defpackage.spe) it.next()).b);
                }
                return (defpackage.spe) akzxVarM3.p();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                uip uipVar = (uip) obj;
                uio uioVarK = uipVar.k();
                j$.util.Optional optionalD = uioVarK.d();
                udm udmVar = udm.a;
                int iAQ = a.aQ(((udm) optionalD.orElse(udmVar)).h);
                if (iAQ == 0) {
                    iAQ = 1;
                }
                udm udmVar2 = (udm) uioVarK.g().orElse(udmVar);
                akzx akzxVarM4 = defpackage.spk.a.m();
                udj udjVarJ = uipVar.j();
                akzxVarM4.u();
                defpackage.spk spkVar = (defpackage.spk) akzxVarM4.b;
                spkVar.c = udjVarJ.f;
                spkVar.b |= 1;
                akzxVarM4.u();
                defpackage.spk spkVar2 = (defpackage.spk) akzxVarM4.b;
                spkVar2.d = iAQ - 1;
                spkVar2.b |= 2;
                int iAQ2 = a.aQ(udmVar2.i);
                if (iAQ2 == 0) {
                    iAQ2 = 1;
                }
                akzxVarM4.u();
                defpackage.spk spkVar3 = (defpackage.spk) akzxVarM4.b;
                spkVar3.e = iAQ2 - 1;
                spkVar3.b |= 4;
                int iAQ3 = a.aQ(udmVar2.j);
                int i = iAQ3 != 0 ? iAQ3 : 1;
                akzxVarM4.u();
                defpackage.spk spkVar4 = (defpackage.spk) akzxVarM4.b;
                spkVar4.f = i - 1;
                spkVar4.b |= 8;
                return (defpackage.spk) akzxVarM4.p();
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return null;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                akzx akzxVarBN = mni.bN((java.util.List) obj);
                akzxVarBN.u();
                lvm lvmVar = akzxVarBN.b;
                lvm lvmVar2 = lvm.a;
                lvmVar.b |= 1;
                lvmVar.c = 2132019783;
                akzxVarBN.u();
                lvm lvmVar3 = akzxVarBN.b;
                lvmVar3.b |= 2;
                lvmVar3.d = false;
                return akzxVarBN.p();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return java.lang.Boolean.valueOf(((defpackage.suj) obj).c);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return null;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.svm.a.c().i(zct.b).k((java.lang.Exception) obj).l("com/android/dialer/preferredsim/suggestion/moto/MotoSuggestionProvider", "querySuggestedSim", 218, "MotoSuggestionProvider.java").v("error querying suggested SIM");
                return j$.util.Optional.empty();
            case 15:
                swt.a.b().k((aguh) obj).l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "phoneNumberInCallHistory", 377, "TidepodsRevelioGatekeeper.java").v("Error querying calls");
                return java.lang.Boolean.FALSE;
            case 16:
                swt.a.c().i(zct.b).k((java.lang.RuntimeException) obj).l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "phoneNumberInCallHistory", 388, "TidepodsRevelioGatekeeper.java").v("Error querying calls");
                return java.lang.Boolean.FALSE;
            case 17:
                return java.lang.Boolean.valueOf(((defpackage.tbe) obj) == defpackage.tbe.SILENTLY_DECLINE);
            case 18:
                return java.lang.Boolean.valueOf(defpackage.tbg.a((tbf) obj));
            case 19:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                if (optional2.isPresent()) {
                    ((adnw) optional2.orElseThrow()).a.isPresent();
                    return j$.util.Optional.of(((java.io.File) ((adnw) optional2.orElseThrow()).a.orElseThrow()).getAbsolutePath());
                }
                defpackage.sxp.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/demo/TidepodsRevelioDemoAudioFileFetcher", "fetchOptionalPath", 70, "TidepodsRevelioDemoAudioFileFetcher.java").v("audioMessagePlaybackRequest wasn't present");
                return j$.util.Optional.empty();
            default:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                return !optional3.isPresent() ? "" : (java.lang.String) optional3.orElseThrow();
        }
    }
}
