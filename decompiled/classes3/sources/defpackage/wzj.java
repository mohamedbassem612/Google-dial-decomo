package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wzj implements ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ wzj(int i) {
        this.$cid = i;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                apjb apjbVar = (apjb) obj;
                aigf aigfVar = defpackage.wzk.a;
                if (apjbVar.n()) {
                    defpackage.wzk.b.b().i(zct.a).l("com/android/incallui/atlas/ui/impl/donation/ScottyUploadChannel", "upload", 131, "ScottyUploadChannel.java").y("Atlas Scotty send failed: %s", ((ammv) apjbVar.a).a);
                }
                if (!apjbVar.m()) {
                    return apjbVar;
                }
                a.bt(defpackage.wzk.b.b(), "Atlas Scotty send completed with %s", ((defpackage.amwp) apjbVar.b).c(), "com/android/incallui/atlas/ui/impl/donation/ScottyUploadChannel", "upload", (char) 137, "ScottyUploadChannel.java", zct.a);
                return apjbVar;
            case 1:
                aimz aimzVar = wzh.a;
                return new gsf();
            case 2:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (optional.isPresent()) {
                    return j$.util.Optional.ofNullable(((defpackage.wyz) optional.orElseThrow()).d);
                }
                defpackage.wzn.a.b().l("com/android/incallui/atlas/ui/impl/feedbackintegration/AtlasFeedbackBuilder", "loadMetrics", 51, "AtlasFeedbackBuilder.java").v("Atlas data absent.");
                return j$.util.Optional.empty();
            case 3:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.wyz) optionalOfNullable.get()).c.g));
                }
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                return ((java.lang.Boolean) optionalOfNullable.orElse(bool)).booleanValue() ? java.lang.Boolean.FALSE : bool;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                if (!optional2.isPresent()) {
                    return aike.a;
                }
                aift aiftVar = new aift(4);
                java.util.Iterator it = ((defpackage.wyz) optional2.orElseThrow()).d.d.iterator();
                while (it.hasNext()) {
                    for (defpackage.wzw wzwVar : ((defpackage.xab) it.next()).b) {
                        akzx akzxVarM = defpackage.utq.a.m();
                        alcf alcfVarE = aldi.e(wzwVar.d);
                        akzxVarM.u();
                        defpackage.utq utqVar = (defpackage.utq) akzxVarM.b;
                        j$.util.Objects.requireNonNull(alcfVarE);
                        utqVar.c = alcfVarE;
                        utqVar.b |= 1;
                        java.lang.String str = wzwVar.c;
                        akzxVarM.u();
                        defpackage.utq utqVar2 = (defpackage.utq) akzxVarM.b;
                        j$.util.Objects.requireNonNull(str);
                        utqVar2.b |= 2;
                        utqVar2.d = str;
                        akzxVarM.u();
                        defpackage.utq utqVar3 = (defpackage.utq) akzxVarM.b;
                        utqVar3.e = 1;
                        utqVar3.b |= 4;
                        aiftVar.i((defpackage.utq) akzxVarM.p());
                    }
                }
                return aiftVar.h();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                return !optional3.isPresent() ? java.lang.Boolean.FALSE : java.lang.Boolean.valueOf(((defpackage.wyz) optional3.orElseThrow()).c.e);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return defpackage.abxl.L("ATLAS_MODEL_DOWNLOADED", ((java.lang.Boolean) obj).booleanValue() ? 1 : 0);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.xap xapVarB = defpackage.xap.b(((xar) obj).c);
                if (xapVarB == null) {
                    xapVarB = defpackage.xap.UNKNOWN;
                }
                return defpackage.abxl.L("ATLAS_ENROLLMENT_STATUS", xapVarB.e);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return afsq.bR((java.lang.Integer) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.acui acuiVar = (defpackage.acui) obj;
                if (acuiVar == null) {
                    defpackage.wzx.a.d().i(zct.a).i(zct.b).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/incallui/atlas/ui/impl/mddresources/LegacyHoldForMeMddResourcesImpl", "getDownloadedZipFileUri", 128, "LegacyHoldForMeMddResourcesImpl.java").v("No model has been downloaded yet.");
                    return j$.util.Optional.empty();
                }
                j$.util.Optional optionalFindAny = j$.util.Collection.-EL.stream(acuiVar.h).filter(new defpackage.wrm(8)).findAny();
                if (optionalFindAny.isPresent()) {
                    return j$.util.Optional.of(android.net.Uri.parse(((defpackage.acuh) optionalFindAny.orElseThrow()).d));
                }
                hgb.h(defpackage.wzx.a.d(), "No detection model found in downloaded file group.", "com/android/incallui/atlas/ui/impl/mddresources/LegacyHoldForMeMddResourcesImpl", "getDownloadedZipFileUri", (char) 142, "LegacyHoldForMeMddResourcesImpl.java", (byte) 1, zct.a, java.util.concurrent.TimeUnit.MINUTES);
                return j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return null;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return java.lang.Boolean.valueOf(((j$.util.Optional) obj).isPresent());
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.xap xapVarB2 = defpackage.xap.b(((xar) obj).c);
                return xapVarB2 == null ? defpackage.xap.UNKNOWN : xapVarB2;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((defpackage.txk) obj).b();
                return null;
            case 15:
                return null;
            case 16:
                return hxe.c;
            case 17:
                return java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli() + ((long) ((java.lang.Integer) obj).intValue()));
            case 18:
                return (hzb) ((j$.util.Optional) obj).orElseThrow(new defpackage.vjq(19));
            case 19:
                defpackage.xcy.a.c().i(zct.b).i(zct.a).k((java.lang.Throwable) obj).l("com/android/incallui/atlas/ui/impl/tidepods/session/HoldForMeSession", "stop", 416, "HoldForMeSession.java").v("failed to stop session");
                return null;
            default:
                aimz aimzVar2 = xeq.a;
                return new gsf();
        }
    }
}
