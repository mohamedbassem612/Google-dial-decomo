package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tee implements zcs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ tee(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [aoin, java.lang.Object] */
    public final boolean a() {
        switch (this.$cid) {
            case 0:
                alat alatVar = ((alfc) this.a.a()).b;
                aooh.e(alatVar, "getElementList(...)");
                if (!(alatVar instanceof java.util.Collection) || !alatVar.isEmpty()) {
                    java.util.Iterator it = alatVar.iterator();
                    while (it.hasNext()) {
                        if (aoov.s((java.lang.String) it.next(), android.os.Build.DEVICE, true)) {
                            return true;
                        }
                    }
                }
                return false;
            case 1:
                return ((tcq) this.a).a();
            case 2:
                return ((gpd) this.a).d();
            case 3:
                return afsq.ch((tkk) this.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return afsq.ch((tkk) this.a);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((tkk) this.a).a();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return afsq.ch((tkk) this.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return afsq.ch((tkk) this.a);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return afsq.ch((tkk) this.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return afsq.ch((tkk) this.a);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return afsq.ch((tkk) this.a);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return afsq.ch((tkk) this.a);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return afsq.ch((tkk) this.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return afsq.ch((tkk) this.a);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return afsq.ch((tkk) this.a);
            case 15:
                return afsq.ch((tkk) this.a);
            case 16:
                return afsq.ch((tkk) this.a);
            case 17:
                return afsq.ch((tkk) this.a);
            case 18:
                return afsq.ch((tkk) this.a);
            case 19:
                return afsq.ch((tkk) this.a);
            default:
                return afsq.ch((tkk) this.a);
        }
    }
}
