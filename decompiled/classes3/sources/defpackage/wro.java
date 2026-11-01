package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wro implements ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ wro(int i) {
        this.$cid = i;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        defpackage.wvj wvjVar;
        int i = 4;
        switch (this.$cid) {
            case 0:
                aimz aimzVar = wrp.a;
                return new gsf();
            case 1:
                hgb.f(wrp.a.c(), obj, "error uploading to scotty", "com/android/dialer/xatu/impl/storage/postcall/XatuMetricsWorker", "uploadEligibleAudioAndMetricsToScotty", 'b', "XatuMetricsWorker.java", zct.b);
                return null;
            case 2:
                defpackage.wgz wgzVar = ((defpackage.whf) obj).c;
                if (wgzVar == null) {
                    wgzVar = defpackage.wgz.a;
                }
                defpackage.wha whaVarB = defpackage.wha.b(wgzVar.c);
                if (whaVarB == null) {
                    whaVarB = defpackage.wha.ADDON_FEATURE_KEY_UNSPECIFIED;
                }
                return java.lang.Integer.valueOf(whaVarB.e);
            case 3:
                return ((defpackage.wlf) obj).e;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.twf twfVar = (defpackage.twf) obj;
                return java.lang.Boolean.valueOf(twfVar.equals(defpackage.twf.SODA_HOST_APP_STATUS_ABLE_TO_TRANSCRIBE_AND_UP_TO_DATE) || twfVar.equals(defpackage.twf.SODA_HOST_APP_STATUS_ABLE_TO_TRANSCRIBE_AND_OUTDATED));
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ((defpackage.wxb) obj).a();
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return (aigf) j$.util.Collection.-EL.stream((java.util.List) obj).filter(new defpackage.wrm(i)).collect(aido.b(new defpackage.wyd(0), new defpackage.wyd(2)));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.xap xapVarB = defpackage.xap.b(((xar) obj).c);
                return xapVarB == null ? defpackage.xap.UNKNOWN : xapVarB;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                nzb nzbVar = (nzb) obj;
                int iAd = mni.ad(nzbVar.d);
                if (iAd == 0) {
                    iAd = 1;
                }
                int i2 = iAd - 1;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            aimw aimwVarL = defpackage.wyn.a.b().l("com/android/incallui/atlas/ui/impl/businessfinder/AtlasBusinessFinderImpl", "checkEligibleNonTollFreeNumberDb", 294, "AtlasBusinessFinderImpl.java");
                            int iAd2 = mni.ad(nzbVar.d);
                            if (iAd2 == 0) {
                                iAd2 = 1;
                            }
                            aimwVarL.w("in eligibility DB, type: %d", iAd2 - 1);
                            int iAd3 = mni.ad(nzbVar.d);
                            if (iAd3 == 0) {
                                iAd3 = 1;
                            }
                            int i3 = iAd3 - 1;
                            if (i3 == 1) {
                                wvjVar = defpackage.wvj.TOLL_FREE;
                            } else if (i3 != 2) {
                                wvjVar = i3 != 3 ? defpackage.wvj.UNKNOWN_ATLAS_BUSINESS : defpackage.wvj.WHITELISTED_NON_TOLL_FREE;
                            } else {
                                wvjVar = defpackage.wvj.DUPLEX_VERIFIED_DATA_EXTRACTION_NUMBER;
                            }
                            return j$.util.Optional.of(wvjVar);
                        }
                        if (i2 != 3 && i2 != 4) {
                            switch (i2) {
                                case 1000:
                                case 1001:
                                case 1002:
                                case 1003:
                                case 1004:
                                    break;
                                default:
                                    aimw aimwVarL2 = defpackage.wyn.a.d().l("com/android/incallui/atlas/ui/impl/businessfinder/AtlasBusinessFinderImpl", "checkEligibleNonTollFreeNumberDb", 300, "AtlasBusinessFinderImpl.java");
                                    boolean z = nzbVar.c;
                                    int iAd4 = mni.ad(nzbVar.d);
                                    aimwVarL2.Y(z, (iAd4 != 0 ? iAd4 : 1) - 1);
                                    return j$.util.Optional.empty();
                            }
                        }
                    }
                    aimw aimwVarL3 = defpackage.wyn.a.d().l("com/android/incallui/atlas/ui/impl/businessfinder/AtlasBusinessFinderImpl", "checkEligibleNonTollFreeNumberDb", 289, "AtlasBusinessFinderImpl.java");
                    int iAd5 = mni.ad(nzbVar.d);
                    aimwVarL3.w("Received a client-side eligibility source from DB: %d", (iAd5 != 0 ? iAd5 : 1) - 1);
                    return j$.util.Optional.empty();
                }
                return j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return (aify) j$.util.Collection.-EL.stream(((java.util.Map) obj).values()).map(new defpackage.wyd(8)).collect(aido.a);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return (aigf) j$.util.Collection.-EL.stream((java.util.List) obj).collect(aido.b(new defpackage.wyd(6), new defpackage.wyd(7)));
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                hgb.f(wzd.a.c(), obj, "failed to delete AtlasData", "com/android/incallui/atlas/ui/impl/database/SafeAtlasDao", "deleteAllByCallCreationMillis", (char) 263, "SafeAtlasDao.java", zct.b);
                return null;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                hgb.f(wzd.a.c(), obj, "failed to find AtlasData modified later than a call creation timestamp", "com/android/incallui/atlas/ui/impl/database/SafeAtlasDao", "findByLastModifiedTimestampMillisGreaterThan", (char) 216, "SafeAtlasDao.java", zct.b);
                return aike.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                hgb.f(wzd.a.c(), obj, "failed to clear detection metrics", "com/android/incallui/atlas/ui/impl/database/SafeAtlasDao", "clearMetrics", (char) 459, "SafeAtlasDao.java", zct.b);
                return null;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                hgb.f(wzd.a.c(), obj, "failed to upsert detection metrics", "com/android/incallui/atlas/ui/impl/database/SafeAtlasDao", "upsert", (char) 398, "SafeAtlasDao.java", zct.b);
                return null;
            case 15:
                hgb.f(wzd.a.c(), obj, "failed to find AtlasData by call creation time", "com/android/incallui/atlas/ui/impl/database/SafeAtlasDao", "findByCallCreationTimeMillis", 'Y', "SafeAtlasDao.java", zct.b);
                return j$.util.Optional.empty();
            case 16:
                hgb.f(wzd.a.c(), obj, "failed to find AtlasData created earlier than a call creation timestamp", "com/android/incallui/atlas/ui/impl/database/SafeAtlasDao", "findAllByCallCreationTimeMillisLessThan", (char) 180, "SafeAtlasDao.java", zct.b);
                return aike.a;
            case 17:
                hgb.f(wzd.a.c(), obj, "failed to upsert AtlasCallDetails", "com/android/incallui/atlas/ui/impl/database/SafeAtlasDao", "upsert", (char) 323, "SafeAtlasDao.java", zct.b);
                return null;
            case 18:
                hgb.f(wzd.a.c(), obj, "failed to find AtlasData matching call creation time list", "com/android/incallui/atlas/ui/impl/database/SafeAtlasDao", "findAllByCallCreationTimeMillis", (char) 127, "SafeAtlasDao.java", zct.b);
                return aike.a;
            case 19:
                return j$.util.Optional.of((idv) obj);
            default:
                defpackage.wze.a.d().k((java.lang.Throwable) obj).l("com/android/incallui/atlas/ui/impl/database/postcall/AtlasAudioDonationScottyUploader", "compressAudioData", 160, "AtlasAudioDonationScottyUploader.java").v("failed to compress raw audio");
                return j$.util.Optional.empty();
        }
    }
}
