package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum tth implements alah {
    NOT_SET(0),
    PRECONDITION_PENDING(8),
    NOT_A_SHARPIE_CALL(1),
    STARTING(2),
    SCAM_DETECTION_RUNNING(3),
    PAUSED(5),
    ENDED(6),
    SCAM_DETECTED(7),
    UNRECOGNIZED(-1);

    private final int k;

    tth(int i) {
        this.k = i;
    }

    public static defpackage.tth b(int i) {
        switch (i) {
            case 0:
                return NOT_SET;
            case 1:
                return NOT_A_SHARPIE_CALL;
            case 2:
                return STARTING;
            case 3:
                return SCAM_DETECTION_RUNNING;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
            default:
                return null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return PAUSED;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ENDED;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return SCAM_DETECTED;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return PRECONDITION_PENDING;
        }
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.k;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.k);
    }
}
