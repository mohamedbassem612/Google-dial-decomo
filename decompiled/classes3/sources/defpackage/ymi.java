package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ymi extends java.lang.Exception {
    public final int a;
    public final int b;

    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Illegal instructions before constructor call */
    public ymi(int i, int i2, java.lang.String str, java.lang.Throwable th) {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        java.lang.String str2 = "UNKNOWN";
        java.lang.String str3 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 7 ? "UNKNOWN" : "METADATA_ERROR" : "CONNECTION_ERROR" : "PREPARATION_ERROR" : "INFERENCE_ERROR" : "DOWNLOAD_ERROR";
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i2);
        if (i2 == 18 || i2 == 20) {
            str2 = "INTERNAL_ERROR";
        } else if (i2 == 24) {
            str2 = "DEADLINE_EXCEEDED";
        } else if (i2 == 501) {
            str2 = "NOT_ENOUGH_DISK_SPACE";
        } else if (i2 == 29) {
            str2 = "INTERNAL_ERROR";
        } else if (i2 == 30) {
            str2 = "BACKGROUND_USE_BLOCKED";
        } else if (i2 == 36) {
            str2 = "INTERNAL_ERROR_SECURITY_KEY_UNAVAILABLE";
        } else if (i2 != 37) {
            switch (i2) {
                case 2:
                    str2 = "BAD_DATA";
                    break;
                case 3:
                    str2 = "BAD_REQUEST";
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    str2 = "REQUEST_PROCESSING_ERROR";
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    str2 = "COMPUTE_ERROR";
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    str2 = "IPC_ERROR";
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    str2 = "CANCELLED";
                    break;
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    str2 = "NOT_AVAILABLE";
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                    str2 = "BUSY";
                    break;
                case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                    str2 = "SERVICE_PROCESSING_ERROR";
                    break;
                case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                    str2 = "RESPONSE_PROCESSING_ERROR";
                    break;
                case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                    str2 = "REQUEST_TOO_LARGE";
                    break;
                default:
                    switch (i2) {
                        case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                            str2 = "INTERNAL_ERROR";
                            break;
                        case 15:
                            str2 = "RESPONSE_GENERATION_ERROR";
                            break;
                        case 16:
                            str2 = "NOT_SUPPORTED";
                            break;
                        default:
                            switch (i2) {
                                case 601:
                                    str2 = "BINDING_FAILURE";
                                    break;
                                case 602:
                                    str2 = "SERVICE_DISCONNECTED";
                                    break;
                                case 603:
                                    str2 = "BINDING_DIED";
                                    break;
                                case 604:
                                    str2 = "NEEDS_SYSTEM_UPDATE";
                                    break;
                                case 605:
                                    str2 = "NULL_BINDING";
                                    break;
                                case 606:
                                    str2 = "FEATURE_NOT_FOUND";
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            str2 = "NOT_SUPPORTED_SESSION_STATE_CACHING";
        }
        super(java.lang.String.format("AICore failed with error type %s-%s and error code %s-%s: %s", numValueOf, str3, numValueOf2, str2, str), th);
        this.a = i;
        this.b = i2;
    }
}
