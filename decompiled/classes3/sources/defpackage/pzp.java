package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum pzp implements alah {
    UNKNOWN(0),
    EMERGENCY_CALLING_SCREEN(1),
    VIDEO_ANSWER_SCREEN(2),
    ANSWER_SCREEN(3),
    DOBBY_SCREEN(4),
    CALL_SCREEN(5),
    RTT_CHAT_SCREEN(6),
    VIDEO_SCREEN(7),
    XATU_SCREEN(8),
    NAUTILUS_SCREEN(9),
    BEACON_SCREEN(10),
    TINCAN_SCREEN(11),
    HEDWIG(12),
    BEESLY_SCREEN(13),
    COIN_SCREEN(1000),
    VOICE_SCREEN(9998),
    LEGACY_VOICE_SCREEN(9999),
    TEST_HIGH_PRIORITY(defpackage.aehk.NEXT_REQUEST_CODE),
    TEST_LOW_PRIORITY(10001);

    public final int t;

    pzp(int i) {
        this.t = i;
    }

    public static defpackage.pzp b(int i) {
        if (i == 1000) {
            return COIN_SCREEN;
        }
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return EMERGENCY_CALLING_SCREEN;
            case 2:
                return VIDEO_ANSWER_SCREEN;
            case 3:
                return ANSWER_SCREEN;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return DOBBY_SCREEN;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return CALL_SCREEN;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return RTT_CHAT_SCREEN;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return VIDEO_SCREEN;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return XATU_SCREEN;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return NAUTILUS_SCREEN;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return BEACON_SCREEN;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return TINCAN_SCREEN;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return HEDWIG;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return BEESLY_SCREEN;
            default:
                switch (i) {
                    case 9998:
                        return VOICE_SCREEN;
                    case 9999:
                        return LEGACY_VOICE_SCREEN;
                    case defpackage.aehk.NEXT_REQUEST_CODE /* 10000 */:
                        return TEST_HIGH_PRIORITY;
                    case 10001:
                        return TEST_LOW_PRIORITY;
                    default:
                        return null;
                }
        }
    }

    public final int a() {
        return this.t;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.t);
    }
}
