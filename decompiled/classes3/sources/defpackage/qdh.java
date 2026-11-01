package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qdh implements aoin {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ qdh(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v47, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [aoin, java.lang.Object] */
    public final java.lang.Object a() {
        switch (this.$cid) {
            case 0:
                return ((defpackage.qdj) this.a.a()).b;
            case 1:
                return ((qbx) this.a.a()).b;
            case 2:
                return ((defpackage.qdj) this.a.a()).c;
            case 3:
                return ((defpackage.qdq) this.a.a()).b;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((defpackage.qdq) this.a.a()).c;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((qdu) this.a).h;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((qdu) this.a.a()).g;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return this.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ((defpackage.qeg) this.a.a()).j;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((defpackage.qeg) this.a.a()).h;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((defpackage.qeg) this.a.a()).i;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return ((defpackage.qgn) this.a).q;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ((defpackage.qgn) this.a).l;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((defpackage.qgn) this.a).j;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((defpackage.qgn) this.a).o;
            case 15:
                return ((defpackage.qgn) this.a).k;
            case 16:
                return ((defpackage.qgn) this.a).p;
            case 17:
                return ((defpackage.qgn) this.a).i;
            case 18:
                return ((defpackage.qko) this.a).q;
            case 19:
                java.lang.Object obj = this.a;
                j$.util.Objects.requireNonNull(obj);
                return new defpackage.ozv(obj, 2);
            default:
                return ((defpackage.qnb) this.a.a()).c;
        }
    }
}
