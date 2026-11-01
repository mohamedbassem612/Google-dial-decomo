package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class yvz implements zcs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ yvz(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [aoin, java.lang.Object] */
    public final boolean a() {
        switch (this.$cid) {
            case 0:
                return afsq.bJ((aoin) this.a).booleanValue();
            case 1:
                return afsq.bJ((aoin) this.a).booleanValue();
            case 2:
                return afsq.bJ((aoin) this.a).booleanValue();
            case 3:
                return afsq.bJ((aoin) this.a).booleanValue();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((tvn) this.a).c();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                mfq mfqVar = (mfq) aooh.q((j$.util.Optional) this.a);
                return mfqVar != null && mfqVar.a();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((defpackage.zqy) this.a).a();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((defpackage.zqy) this.a).a();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ((defpackage.zqy) this.a).a();
            default:
                return afsq.bJ((aoin) this.a).booleanValue();
        }
    }
}
