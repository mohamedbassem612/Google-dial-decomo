package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wkb implements ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ wkb(int i) {
        this.$cid = i;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        boolean z;
        switch (this.$cid) {
            case 0:
                defpackage.wkc.a.b().l("com/android/dialer/xatu/impl/pipeline/duplex/XatuDuplexModelDownloader", "downloadNow", 80, "XatuDuplexModelDownloader.java").v("download completed");
                return null;
            case 1:
                return afsq.bR((java.lang.Integer) obj);
            case 2:
                boolean zIsPresent = ((j$.util.Optional) obj).isPresent();
                aimw aimwVarL = defpackage.wkd.a.b().l("com/android/dialer/xatu/impl/pipeline/duplex/XatuDuplexModelRepository", "isModelAvailable", 92, "XatuDuplexModelRepository.java");
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zIsPresent);
                aimwVarL.y("isModelAvailable = %b", boolValueOf);
                return boolValueOf;
            case 3:
                defpackage.aknd akndVar = (defpackage.aknd) obj;
                defpackage.wkh.a.b().l("com/android/dialer/xatu/impl/service/CachedIvrDataFetcher", "get", 173, "CachedIvrDataFetcher.java").y("Response has cached duplex data: %b", java.lang.Boolean.valueOf(1 == (akndVar.b & 1)));
                if ((akndVar.b & 1) == 0) {
                    return j$.util.Optional.empty();
                }
                defpackage.ahwi ahwiVar = akndVar.c;
                if (ahwiVar == null) {
                    ahwiVar = defpackage.ahwi.a;
                }
                return j$.util.Optional.of(ahwiVar);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                a.bt(defpackage.wkh.a.d(), "Fetching XatuInfo gRPC failed with error %s", anqw.d((java.lang.Exception) obj).o.name(), "com/android/dialer/xatu/impl/service/CachedIvrDataFetcher", "queryXatuInfoLookupApi", (char) 159, "CachedIvrDataFetcher.java", zct.b);
                return defpackage.aknd.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((java.lang.Boolean) obj).booleanValue() ? j$.util.Optional.of(defpackage.reb.XATU_PROMO) : j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.wpw wpwVarB = defpackage.wpw.b(((wpy) obj).g);
                return wpwVarB == null ? defpackage.wpw.SHOW_AHEAD_AUTO_ENROLLED : wpwVarB;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.wpt wptVarB = defpackage.wpt.b(((wpy) obj).h);
                return wptVarB == null ? defpackage.wpt.AUTOMATIC_DISPLAY_UNSPECIFIED : wptVarB;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.wpu wpuVarB = defpackage.wpu.b(((wpy) obj).c);
                return wpuVarB == null ? defpackage.wpu.UNKNOWN : wpuVarB;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.wpw wpwVar = (defpackage.wpw) obj;
                z = wpwVar == defpackage.wpw.SHOW_AHEAD_AUTO_ENROLLED || wpwVar == defpackage.wpw.SHOW_AHEAD_USER_OPTED_IN;
                defpackage.wpx.a.b().l("com/android/dialer/xatu/impl/settings/XatuSettings", "isShowAheadEnabled", 71, "XatuSettings.java").J("show ahead enrollment status %s, is enabled %b", wpwVar, z);
                return java.lang.Boolean.valueOf(z);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.wpt wptVar = (defpackage.wpt) obj;
                z = wptVar == defpackage.wpt.AUTOMATIC_DISPLAY_UNSPECIFIED || wptVar == defpackage.wpt.AUTOMATIC_DISPLAY_USER_OPTED_IN;
                defpackage.wpx.a.b().l("com/android/dialer/xatu/impl/settings/XatuSettings", "isAutomaticDisplayEnabled", 106, "XatuSettings.java").J("automatic display enrollment status %s, is enabled %b", wptVar, z);
                return java.lang.Boolean.valueOf(z);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return java.lang.Integer.valueOf(((wpy) obj).i);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return defpackage.wqk.a((wpy) obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ((defpackage.txk) obj).b();
                return null;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.wrh.a.c().i(zct.b).k((java.io.IOException) obj).l("com/android/dialer/xatu/impl/storage/XatuSessionPersistor", "save", 129, "XatuSessionPersistor.java").v("failed to save xatu tree");
                return j$.util.Optional.empty();
            case 15:
                defpackage.wrh.a.c().i(zct.b).k((java.io.IOException) obj).l("com/android/dialer/xatu/impl/storage/XatuSessionPersistor", "save", 142, "XatuSessionPersistor.java").v("failed to save duplex logs");
                return j$.util.Optional.empty();
            case 16:
                defpackage.wrh.a.c().i(zct.b).k((java.io.IOException) obj).l("com/android/dialer/xatu/impl/storage/XatuSessionPersistor", "save", 155, "XatuSessionPersistor.java").v("failed to save session logs");
                return j$.util.Optional.empty();
            case 17:
                defpackage.wrh.a.c().i(zct.b).k((java.io.IOException) obj).l("com/android/dialer/xatu/impl/storage/XatuSessionPersistor", "save", 111, "XatuSessionPersistor.java").v("failed to save call audio");
                return j$.util.Optional.empty();
            case 18:
                return j$.util.Optional.of((idv) obj);
            case 19:
                hgb.f(defpackage.wrj.a.d(), obj, "failed to compress raw audio", "com/android/dialer/xatu/impl/storage/postcall/XatuDonationScottyUploader", "compressAudioData", (char) 245, "XatuDonationScottyUploader.java", zct.b);
                return j$.util.Optional.empty();
            default:
                aimz aimzVar = wrp.a;
                return null;
        }
    }
}
