package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pes implements zcs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ pes(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v40, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v43, types: [aoin, java.lang.Object] */
    public final boolean a() {
        switch (this.$cid) {
            case 0:
                return ((defpackage.per) this.a).a();
            case 1:
                return ((java.lang.Boolean) this.a.a()).booleanValue();
            case 2:
                return ((defpackage.per) this.a).a();
            case 3:
                return ((defpackage.per) this.a).a();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((defpackage.per) this.a).a();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return afsq.bJ((aoin) this.a).booleanValue();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((java.lang.Boolean) this.a.a()).booleanValue();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((java.lang.Boolean) this.a.a()).booleanValue();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ((java.lang.Boolean) this.a.a()).booleanValue();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return !((zzx) this.a).m();
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((smx) this.a).a();
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return afsq.bJ((aoin) this.a).booleanValue();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return afsq.bJ((aoin) this.a).booleanValue();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((smx) this.a).a();
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((smx) this.a).a();
            case 15:
                return ((smx) this.a).a();
            case 16:
                return ((swq) this.a).a();
            case 17:
                return ((swq) this.a).a();
            case 18:
                return ((swq) this.a).a();
            case 19:
                return ((swq) this.a).a();
            default:
                return ((swq) this.a).a();
        }
    }
}
