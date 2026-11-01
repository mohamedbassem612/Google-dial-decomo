package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class rqc implements java.util.function.Supplier {
    private final /* synthetic */ int $cid;

    public /* synthetic */ rqc(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        switch (this.$cid) {
            case 0:
                return new java.lang.IllegalStateException();
            case 1:
                return new defpackage.pom(null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, 524287);
            case 2:
                return new java.util.ArrayList();
            case 3:
                return new java.lang.NullPointerException();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new java.util.ArrayList();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new java.util.ArrayList();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new java.lang.NullPointerException();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new java.util.NoSuchElementException();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new java.lang.IllegalStateException("Cannot retrieve VvmAccountState for this PhoneAccountHandle");
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new java.util.NoSuchElementException();
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new java.lang.IllegalArgumentException("phone account not found");
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new java.util.HashMap();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return new java.lang.IllegalStateException("OMTP protocol should have a GreetingProcessor");
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return new java.lang.IllegalStateException("Every VvmCarrierName should correspond to a vvm carrier config, but none is found.");
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new java.lang.IllegalStateException("VvmCarrierName should be identified at this point but is not found.");
            case 15:
                vcr vcrVar = vgg.a;
                return new defpackage.vcv(defpackage.vbs.VVM_CARRIER_SERVICE_NOT_FOUND, "Not able to retrieve OMTP configurations", (java.lang.Throwable) null);
            case 16:
                return new java.lang.NullPointerException();
            case 17:
                return new java.lang.IllegalStateException("Every VvmCarrierName should correspond to a vvm carrier config, but none is found.");
            case 18:
                return new java.lang.IllegalStateException("VvmStatusSms should be present at this point but is absent.");
            case 19:
                return new java.lang.IllegalStateException("VvmCarrierName should be identified at this point but is not found.");
            default:
                return new defpackage.vgv("No greeting payload data", null);
        }
    }
}
