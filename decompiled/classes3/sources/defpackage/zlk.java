package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class zlk implements aoin {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ zlk(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v27, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v33, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v36, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v39, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46, types: [aoin, java.lang.Object] */
    public final java.lang.Object a() {
        java.lang.Object afplVar;
        switch (this.$cid) {
            case 0:
                afplVar = new defpackage.afpl(defpackage.ztu.c, (defpackage.zlr) this.a.a(), (byte[]) null);
                break;
            case 1:
                return this.a;
            case 2:
                afplVar = new defpackage.zma(((hil) ((defpackage.rai) this.a).a).a.oi());
                break;
            case 3:
                return ((defpackage.zqj) this.a).j;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((defpackage.zqj) this.a).k;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((defpackage.zqu) this.a).m;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((defpackage.zqu) this.a).k;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((defpackage.zqu) this.a).l;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return (aguq) this.a.a();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((ahgd) this.a).a();
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return (ahlb) this.a.a();
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return (defpackage.akcr) this.a.a();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return (java.lang.String) this.a.a();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                aw awVar = (aw) this.a;
                return (defpackage.ahhl) defpackage.xrr.d(awVar.z()).c(awVar);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return (aguq) this.a.a();
            case 15:
                return this.a;
            case 16:
                return aify.p(((akar) this.a).a());
            case 17:
                int i = defpackage.akdb.d;
                return defpackage.anid.a.eZ().a((android.content.Context) this.a);
            default:
                try {
                    android.content.Context context = ((defpackage.akdc) this.a).b;
                    return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    throw new java.lang.AssertionError("Could not find our own package, this should be impossible.\nNo app version will appear in logs.", e);
                }
        }
        return afplVar;
    }
}
