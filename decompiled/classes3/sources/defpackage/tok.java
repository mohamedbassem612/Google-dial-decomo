package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tok implements defpackage.zka {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ tok(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.zka
    public final boolean a() {
        switch (this.$cid) {
            case 0:
                return afsq.ch((tkk) this.a);
            case 1:
                java.lang.Object obj = this.a;
                java.util.Set set = defpackage.tna.a;
                return afsq.ch((tkk) obj);
            case 2:
                return ((usg) this.a).a();
            case 3:
                return ((whh) this.a).a();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((whh) this.a).a();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((whh) this.a).a();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((whh) this.a).a();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((wyc) this.a).a();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ((wyc) this.a).a();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((wyc) this.a).a();
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((wyc) this.a).a();
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return ((wyc) this.a).a();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ((wyc) this.a).a();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((wyc) this.a).a();
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((wyc) this.a).a();
            default:
                return ((wyc) this.a).a();
        }
    }
}
