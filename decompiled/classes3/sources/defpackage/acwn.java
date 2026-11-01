package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acwn implements ajat {
    private final /* synthetic */ int $cid;

    public /* synthetic */ acwn(int i) {
        this.$cid = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aacw */
    public final ajcq a(java.lang.Object obj) throws java.lang.Exception {
        switch (this.$cid) {
            case 0:
                adbe.g((java.io.IOException) obj, "%s: IOException while adding group for download", new java.lang.Object[]{"MobileDataDownload"});
                return aiql.z(java.lang.Boolean.FALSE);
            case 1:
                aacw aacwVar = (aacw) obj;
                int iA = aacwVar.a();
                if (iA != 17 && iA != 20 && iA != 31003) {
                    throw aacwVar;
                }
                if (android.util.Log.isLoggable("Logging.Clearcut", 3)) {
                    android.util.Log.d("Logging.Clearcut", "Could not log data.", aacwVar);
                }
                return ajcm.a;
            case 2:
                ahyn ahynVar = (ahyn) obj;
                if (ahynVar.f()) {
                    int i = adbe.a;
                    ((ajcq) ahynVar.b()).cancel(false);
                }
                return ajcm.a;
            case 3:
                yg ygVarB = acvh.b();
                ygVarB.b = defpackage.acvg.UNABLE_TO_UPDATE_GROUP_METADATA_ERROR;
                ygVarB.c = (java.io.IOException) obj;
                return aiql.y(ygVarB.d());
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                boolean z = aczk.a;
                return abrz.ac((java.util.List) obj).D(new aczf(3), ajbm.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                boolean z2 = aczk.a;
                adbe.g((java.lang.Exception) obj, "%s: GC failed", new java.lang.Object[]{"MDDManager"});
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.acwa acwaVarB = defpackage.acwa.b(((defpackage.acwg) obj).d);
                if (acwaVarB == null) {
                    acwaVarB = defpackage.acwa.NONE;
                }
                return aiql.z(acwaVarB);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.aczv aczvVar = new defpackage.aczv();
                if (((java.lang.Boolean) obj).booleanValue()) {
                    throw aczvVar;
                }
                throw new java.io.IOException("failed to save sharedFilesMetadata", aczvVar);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return aiql.z((java.lang.Object) null);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                ahyn ahynVar2 = (ahyn) obj;
                if (ahynVar2.f()) {
                    int i2 = adbe.a;
                    ((ajcq) ahynVar2.b()).cancel(false);
                }
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                yg ygVarB2 = acvh.b();
                ygVarB2.b = defpackage.acvg.MANIFEST_CONFIG_HELPER_OVERRIDER_FAILURE_ERROR;
                ygVarB2.c = (java.lang.Throwable) obj;
                return aiql.y(ygVarB2.d());
            case 15:
                throw ((java.lang.Exception) obj);
            case 16:
                throw ((java.lang.Exception) obj);
            case 17:
                throw ((java.lang.Exception) obj);
            case 18:
                return aiql.z(alad.B(akof.a, (byte[]) obj, akzq.a));
            case 19:
                aacw aacwVar2 = (aacw) obj;
                return aacwVar2.a() == 17 ? aiql.y(new com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$ApiNotConnectedException()) : aiql.y(aacwVar2);
            default:
                java.io.IOException iOException = (java.io.IOException) obj;
                aacw aacwVarN = aehj.n(iOException, aacw.class);
                return (aacwVarN == null || aacwVarN.a() != 10) ? aiql.y(iOException) : aiql.y(new com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$DeveloperErrorException());
        }
    }
}
