package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum tyv implements alah {
    UNKNOWN(0),
    NEEDS_DOWNLOAD(2),
    DOWNLOADING_FEATURE(3),
    DOWNLOADING_SODA(4),
    ALREADY_AVAILABLE(5),
    ERROR(6),
    SODA_HOST_APP_NEEDS_UPDATE(8),
    NEED_WIFI(9),
    DOWNLOADING_BEESLY(10),
    BEESLY_ALREADY_AVAILABLE(11),
    DOWNLOADING_VOICELM(12),
    VOICELM_ALREADY_AVAILABLE(13),
    UNRECOGNIZED(-1);

    private final int o;

    tyv(int i) {
        this.o = i;
    }

    public static defpackage.tyv b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
            default:
                return null;
            case 2:
                return NEEDS_DOWNLOAD;
            case 3:
                return DOWNLOADING_FEATURE;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return DOWNLOADING_SODA;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ALREADY_AVAILABLE;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ERROR;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return SODA_HOST_APP_NEEDS_UPDATE;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return NEED_WIFI;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return DOWNLOADING_BEESLY;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return BEESLY_ALREADY_AVAILABLE;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return DOWNLOADING_VOICELM;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return VOICELM_ALREADY_AVAILABLE;
        }
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.o;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.o);
    }
}
