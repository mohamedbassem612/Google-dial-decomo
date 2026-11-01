package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class abna implements aomy {
    private final /* synthetic */ int $cid;

    public final java.lang.Object a() {
        int i = this.$cid;
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.5f);
        java.lang.Float fValueOf2 = java.lang.Float.valueOf(0.0f);
        switch (i) {
            case 0:
                return java.lang.Boolean.FALSE;
            case 1:
                return java.lang.Boolean.FALSE;
            case 2:
                aiof.i("GnpSdk").d().v("Failed getting GnpInAppUiViewModel.");
                return aojh.a;
            case 3:
                cbd cbdVar = defpackage.acmw.a;
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                cbd cbdVar2 = defpackage.acmw.a;
                return new java.util.concurrent.atomic.AtomicReference(null);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return fValueOf;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return fValueOf2;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                cbd cbdVar3 = defpackage.acrn.a;
                return java.lang.Float.valueOf(android.os.Build.VERSION.SDK_INT >= 31 ? 2.5f : 2.0f);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                cbd cbdVar4 = defpackage.acrp.a;
                return new dpi(160.0f);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.akcm akcmVar = defpackage.afch.a;
                android.os.Parcelable.Creator creator = android.content.AttributionSource.CREATOR;
                aooh.e(creator, "CREATOR");
                return defpackage.agwm.o("AttributionSource", creator);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                cbd cbdVar5 = defpackage.afmu.a;
                throw new java.lang.IllegalStateException("please provide LocalVisualElements CompositionLocal from your top-level composable");
            case 15:
                cbd cbdVar6 = defpackage.afmu.a;
                throw new java.lang.IllegalStateException("please provide LocalInteractionLogger CompositionLocal from your top-level composable");
            case 16:
                aimz aimzVar = defpackage.afny.a;
                throw new java.lang.IllegalStateException("no account supplied");
            case 17:
                android.graphics.Paint paint = new android.graphics.Paint(1);
                paint.setStyle(android.graphics.Paint.Style.FILL);
                return paint;
            case 18:
                int[] iArr = defpackage.agjh.a;
                return (android.graphics.BitmapShader) aoov.ai(new defpackage.agjg(null, 0));
            default:
                java.util.logging.Logger logger = defpackage.agvv.a;
                return aimz.i("com/google/apps/tiktok/coroutines/TikTokExceptionHandlerKt");
        }
    }
}
