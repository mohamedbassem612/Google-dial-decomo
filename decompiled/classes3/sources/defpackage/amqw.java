package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum amqw implements alah {
    VERIFICATION_UNKNOWN(0),
    UNVERIFIED(1),
    VERIFIED_AND_FRESH(2),
    VERIFIED_BUT_STALE(3),
    NO_ACCOUNT_ON_DEVICE(4),
    NO_DATA_STORED_ON_DEVICE(5),
    STALE_DATA_ON_DEVICE(6),
    NO_RECENT_CALLS(7),
    NO_PHONE_ACCOUNT(8),
    NO_PHONE_NUMBER_FROM_SERVER(9),
    NO_VALID_PHONE_NUMBER_FOUND(10),
    NO_MATCHING_PHONE_NUMBER(11),
    LIST_PHONE_NUMBERS_FAILED(12);

    public final int n;

    amqw(int i) {
        this.n = i;
    }

    public static defpackage.amqw b(int i) {
        switch (i) {
            case 0:
                return VERIFICATION_UNKNOWN;
            case 1:
                return UNVERIFIED;
            case 2:
                return VERIFIED_AND_FRESH;
            case 3:
                return VERIFIED_BUT_STALE;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return NO_ACCOUNT_ON_DEVICE;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return NO_DATA_STORED_ON_DEVICE;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return STALE_DATA_ON_DEVICE;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return NO_RECENT_CALLS;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return NO_PHONE_ACCOUNT;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return NO_PHONE_NUMBER_FROM_SERVER;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return NO_VALID_PHONE_NUMBER_FOUND;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return NO_MATCHING_PHONE_NUMBER;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return LIST_PHONE_NUMBERS_FAILED;
            default:
                return null;
        }
    }

    public final int a() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.n);
    }
}
