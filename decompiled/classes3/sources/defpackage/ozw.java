package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ozw implements aoin {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ozw(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v36, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v40, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v44, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v48, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v52, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v56, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v60, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v64, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v68, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v72, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [aoin, java.lang.Object] */
    public final java.lang.Object a() {
        switch (this.$cid) {
            case 0:
                java.lang.Object obj = this.a;
                j$.util.Objects.requireNonNull(obj);
                return new defpackage.ozv(obj, 0);
            case 1:
                return ((defpackage.otq) this.a).n;
            case 2:
                return (defpackage.pex) this.a.a();
            case 3:
                ?? r2 = this.a;
                aooh.f((java.lang.Object) r2, "<this>");
                return (defpackage.pfa) r2.a();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((pff) this.a.a()).j;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return (svq) this.a.a();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return this.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((defpackage.plv) this.a.a()).d;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ((defpackage.pqm) this.a.a()).m;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((defpackage.ptf) this.a.a()).d;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((defpackage.pqm) this.a.a()).n;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return ((defpackage.pqm) this.a.a()).k;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ((defpackage.pqm) this.a.a()).l;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((defpackage.pqm) this.a.a()).p;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((defpackage.pqm) this.a.a()).o;
            case 15:
                return ((defpackage.pvj) this.a.a()).e;
            case 16:
                return ((defpackage.pxg) this.a.a()).c;
            case 17:
                return ((defpackage.pvf) this.a.a()).f;
            case 18:
                return ((defpackage.pvf) this.a.a()).w;
            case 19:
                return ((defpackage.pvr) this.a.a()).b;
            default:
                return ((defpackage.pvf) this.a.a()).i;
        }
    }
}
