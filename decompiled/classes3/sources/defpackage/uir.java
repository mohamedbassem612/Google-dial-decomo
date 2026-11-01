package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class uir implements aoin {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ uir(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, tem] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, tev] */
    /* JADX WARN: Type inference failed for: r4v24, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v31, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v37, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v40, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v44, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v48, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v53, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v56, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v59, types: [aoin, java.lang.Object] */
    public final java.lang.Object a() {
        ooa otlVar;
        switch (this.$cid) {
            case 0:
                otlVar = new defpackage.otl(this.a, 2);
                break;
            case 1:
                return ((defpackage.uaq) this.a.a()).i;
            case 2:
                otlVar = new ooa(this.a, 8);
                break;
            case 3:
                otlVar = new defpackage.otk(this.a, 6);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((aool) this.a).b();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((aool) this.a).b();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                otlVar = new defpackage.afpl(defpackage.ztw.b, (defpackage.zux) this.a.a(), (char[]) null);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return (aguq) this.a.a();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                aopu[] aopuVarArr = aoou.a;
                return new lwu((tem) this.a, new aooa(defpackage.utm.class), 4, (int[]) null);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                aopu[] aopuVarArr2 = aoou.a;
                aooa aooaVar = new aooa(defpackage.utm.class);
                aooa aooaVar2 = new aooa(defpackage.utp.class);
                ?? r4 = this.a;
                return new defpackage.utk(new defpackage.tep(((defpackage.uto) r4).a, aooaVar, aooaVar2), r4, 0);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((defpackage.uws) this.a.a()).f;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return (aguq) this.a.a();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return (aguq) this.a.a();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((defpackage.vzr) this.a).i;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return (defpackage.zkc) this.a.a();
            case 15:
                return ((defpackage.wap) this.a.a()).b;
            case 16:
                return ((defpackage.wbc) this.a.a()).c;
            case 17:
                return ((defpackage.wbc) this.a.a()).d;
            case 18:
                java.lang.Object objA = this.a.a();
                aooh.e(objA, "get(...)");
                otlVar = new defpackage.wbg((defpackage.wbk) objA);
                break;
            case 19:
                return (defpackage.wcb) this.a.a();
            default:
                return (defpackage.znv) this.a.a();
        }
        return otlVar;
    }
}
