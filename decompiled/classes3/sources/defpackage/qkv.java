package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qkv implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ qkv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v41, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v43, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v56, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v58, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v60, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v75, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v82, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        android.util.Size size;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        switch (this.$cid) {
            case 0:
                return this.a.a(obj);
            case 1:
                return a.k((aonj) this.a, obj);
            case 2:
                ajcq ajcqVar = (ajcq) obj;
                try {
                    if (!ajcqVar.isDone()) {
                        return j$.util.Optional.empty();
                    }
                    size = (j$.util.Optional) aiql.H(ajcqVar);
                } catch (java.util.concurrent.ExecutionException e) {
                    defpackage.qrv.a.c().i(zct.b).k(e).l("com/android/dialer/incall/video/service/VideoScreenController", "getBlurredImageIfDone", 454, "VideoScreenController.java").y("VideoScreenController#Failed to get blurred image of type %s, returning empty image.", this.a);
                    return j$.util.Optional.empty();
                }
                break;
            case 3:
                return ((defpackage.qth) obj).c(((defpackage.qtd) this.a).b());
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((defpackage.qtd) this.a).l((defpackage.qqr) obj);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((defpackage.rcm) this.a).c((defpackage.qtg) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                size = (android.util.Size) obj;
                j$.util.Optional optional = ((defpackage.qth) this.a).e.b;
                if (optional.isPresent() && ((defpackage.pus) optional.orElseThrow()).a()) {
                    defpackage.qth.a.b().l("com/android/dialer/incall/video/ui/VideoSelector", "convertLocalDimensionsWithRotation", 407, "VideoSelector.java").z("localDimensionsWithRotation: height: %d, width: %d", size.getHeight(), size.getWidth());
                    return new android.util.Size(size.getHeight(), size.getWidth());
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                android.util.Size size2 = (android.util.Size) obj;
                double height = size2.getHeight();
                double width = size2.getWidth();
                aimz aimzVar = defpackage.qth.a;
                double d = height / width;
                aimzVar.b().l("com/android/dialer/incall/video/ui/VideoSelector", "computePreviewSize", 115, "VideoSelector.java").y("localVideoAspectRatio: %f", java.lang.Double.valueOf(d));
                java.lang.Object obj2 = this.a;
                defpackage.pxs pxsVar = new defpackage.pxs(obj2, 6);
                defpackage.qth qthVar = (defpackage.qth) obj2;
                if (((java.lang.Boolean) qthVar.d.a(pxsVar).a(mgv.u).f()).booleanValue()) {
                    dimensionPixelSize2 = qthVar.b.getResources().getDimensionPixelSize(2131167947);
                    dimensionPixelSize = (int) (((double) dimensionPixelSize2) * d);
                } else {
                    dimensionPixelSize = qthVar.b.getResources().getDimensionPixelSize(2131167959);
                    dimensionPixelSize2 = (int) (((double) dimensionPixelSize) * d);
                }
                aimzVar.b().l("com/android/dialer/incall/video/ui/VideoSelector", "computePreviewSize", 139, "VideoSelector.java").z("preview size: height: %d, width: %d", dimensionPixelSize2, dimensionPixelSize);
                size = new android.util.Size(dimensionPixelSize, dimensionPixelSize2);
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return a.k((aonj) this.a, obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return a.l((aonj) this.a, obj);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return (defpackage.qts) ((defpackage.rao) ((defpackage.apqr) obj).a(defpackage.rao.class)).bZ().get(this.a);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.quo quoVar = (defpackage.quo) obj;
                aoin aoinVar = (aoin) ((zzx) this.a).k().get(quoVar);
                ahvr.cl(aoinVar, "no CenterFragmentProvider for %s", quoVar.name());
                return ((defpackage.quq) aoinVar.a()).c();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return this.a.a(obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return this.a.a(obj);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return this.a.a(obj);
            case 15:
                return j$.util.Optional.ofNullable((aoin) ((defpackage.rgg) ((defpackage.apqr) obj).a(defpackage.rgg.class)).kR().k().get(this.a));
            case 16:
                return ((defpackage.rgi) this.a).j.d(((defpackage.rfd) obj).a);
            case 17:
                defpackage.rgp rgpVar = (defpackage.rgp) obj;
                java.lang.Object obj3 = this.a;
                if (obj3 == null) {
                    throw new java.lang.NullPointerException("Null callId");
                }
                if (rgpVar != null) {
                    return new defpackage.rgw((java.lang.String) obj3, rgpVar);
                }
                throw new java.lang.NullPointerException("Null primaryFeatureModel");
            case 18:
                return this.a.a(obj);
            case 19:
                return ((android.app.NotificationManager) ((android.content.Context) this.a).getSystemService(android.app.NotificationManager.class)).getNotificationChannel((java.lang.String) obj);
            default:
                return this.a.a(obj);
        }
        return size;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
