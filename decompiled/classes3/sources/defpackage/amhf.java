package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum amhf implements alah {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    UNAUTHENTICATED(16),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNRECOGNIZED(-1);

    private final int t;

    amhf(int i) {
        this.t = i;
    }

    public static defpackage.amhf b(int i) {
        switch (i) {
            case 0:
                return OK;
            case 1:
                return CANCELLED;
            case 2:
                return UNKNOWN;
            case 3:
                return INVALID_ARGUMENT;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return DEADLINE_EXCEEDED;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return NOT_FOUND;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ALREADY_EXISTS;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return PERMISSION_DENIED;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return RESOURCE_EXHAUSTED;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return FAILED_PRECONDITION;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ABORTED;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return OUT_OF_RANGE;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return UNIMPLEMENTED;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return INTERNAL;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return UNAVAILABLE;
            case 15:
                return DATA_LOSS;
            case 16:
                return UNAUTHENTICATED;
            default:
                return null;
        }
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.t;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.t);
    }
}
