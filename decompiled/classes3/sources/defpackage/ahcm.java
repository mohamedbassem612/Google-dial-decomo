package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahcm implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ ahcm(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [erg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [erg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [erg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [erg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [erg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21, types: [erg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23, types: [erg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25, types: [erg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [erg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [erg, java.lang.Object] */
    public final java.lang.Object a() {
        switch (this.$cid) {
            case 0:
                ((ahco) this.a).b.unregisterComponentCallbacks(this.b);
                return aojh.a;
            case 1:
                java.lang.Object objF = ((ahbb) this.b).c().N().f(android.util.Base64.decode((java.lang.String) this.a, 3));
                aooh.e(objF, "parseFrom(...)");
                return objF;
            case 2:
                this.b.d((java.util.List) this.a);
                return aojh.a;
            case 3:
                this.b.y((ert) this.a);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                this.a.j((eqw) this.b);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                this.a.m((erc) this.b);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                this.a.p((erb) this.b);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                this.a.q((erb) this.b);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                this.b.z((ery) this.a);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                this.a.k((eqy) this.b);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                this.b.c((est) this.a);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                this.a.b((ere) this.b);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ((aorg) this.a).g((java.lang.CharSequence) this.b);
            default:
                java.lang.Object obj = this.a;
                java.lang.Object obj2 = this.b;
                try {
                    ((apms) obj2).b.b((apmz) obj);
                    break;
                } catch (java.io.IOException e) {
                    apnn.b.b("Http2Connection.Listener failure for ".concat(java.lang.String.valueOf(((apms) obj2).d)), e);
                    try {
                        ((apmz) obj).g(apme.b, e);
                        break;
                    } catch (java.io.IOException unused) {
                    }
                }
                return aojh.a;
        }
    }

    public /* synthetic */ ahcm(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
