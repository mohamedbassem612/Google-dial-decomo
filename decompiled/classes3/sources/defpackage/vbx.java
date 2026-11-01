package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum vbx implements alah {
    REST_UNSPECIFIED(0),
    GBA_AUTHENTICATION_FAILURE_UNKNOWN(1),
    GBA_AUTHENTICATION_FAILURE_FEATURE_NOT_SUPPORTED(2),
    GBA_AUTHENTICATION_FAILURE_FEATURE_NOT_READY(3),
    GBA_AUTHENTICATION_FAILURE_NETWORK_FAILURE(4),
    GBA_AUTHENTICATION_FAILURE_INCORRECT_NAF_ID(5),
    GBA_AUTHENTICATION_FAILURE_SECURITY_PROTOCOL_NOT_SUPPORTED(6),
    VVM_SERVICE_PROFILE_NOT_ACTIVATED(7),
    SYNC_MAILBOX_CORRUPT(9),
    SERVER_NOT_RESPONDING(10),
    DIGEST_AUTH_FAILURE_NO_401(11),
    DIGEST_AUTH_FAILURE_NO_WWW_HEADER(12),
    UPLOAD_GREETING_UNSUCCESSFUL(13),
    GENERAL_HTTP_EXCEPTION(14),
    UNRECOGNIZED(-1);

    private final int q;

    vbx(int i) {
        this.q = i;
    }

    public static defpackage.vbx b(int i) {
        switch (i) {
            case 0:
                return REST_UNSPECIFIED;
            case 1:
                return GBA_AUTHENTICATION_FAILURE_UNKNOWN;
            case 2:
                return GBA_AUTHENTICATION_FAILURE_FEATURE_NOT_SUPPORTED;
            case 3:
                return GBA_AUTHENTICATION_FAILURE_FEATURE_NOT_READY;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return GBA_AUTHENTICATION_FAILURE_NETWORK_FAILURE;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return GBA_AUTHENTICATION_FAILURE_INCORRECT_NAF_ID;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return GBA_AUTHENTICATION_FAILURE_SECURITY_PROTOCOL_NOT_SUPPORTED;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return VVM_SERVICE_PROFILE_NOT_ACTIVATED;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
            default:
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return SYNC_MAILBOX_CORRUPT;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return SERVER_NOT_RESPONDING;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return DIGEST_AUTH_FAILURE_NO_401;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return DIGEST_AUTH_FAILURE_NO_WWW_HEADER;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return UPLOAD_GREETING_UNSUCCESSFUL;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return GENERAL_HTTP_EXCEPTION;
        }
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.q;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.q);
    }
}
