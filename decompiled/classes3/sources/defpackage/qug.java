package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum qug implements alah {
    BUTTON_UNKNOWN(0),
    BUTTON_MORE(1),
    BUTTON_AUDIO_ROUTE(2),
    BUTTON_MUTE(3),
    BUTTON_DIALPAD(4),
    BUTTON_MERGE(5),
    BUTTON_ADD_CALL(6),
    BUTTON_UPGRADE_TO_RTT(7),
    BUTTON_SWAP_SIM(8),
    BUTTON_MANAGE_CONFERENCE(9),
    BUTTON_UPGRADE_TO_CARRIER_VIDEO(10),
    BUTTON_UPGRADE_TO_DUO_VIDEO(11),
    BUTTON_RECORD(12),
    BUTTON_SWAP(13),
    BUTTON_HOLD(14),
    BUTTON_UNHOLD(15),
    BUTTON_CALL_TRANSFER_CONSULTATIVE(16),
    BUTTON_UPGRADE_TO_TRANSMISSION_ONLY_VIDEO(17),
    BUTTON_SELECT_UPGRADE_VIDEO_TYPE(18),
    BUTTON_SONIC(19),
    BUTTON_FERMAT(20),
    BUTTON_ATLAS(21),
    BUTTON_XATU(22),
    BUTTON_SHARPIE(23),
    BUTTON_NAUTILUS(24),
    BUTTON_BEACON(25),
    BUTTON_DEBUG(26),
    BUTTON_TEST_HIGH_PRIORITY(defpackage.aehk.NEXT_REQUEST_CODE),
    BUTTON_TEST_LOW_PRIORITY(10001),
    BUTTON_TEST_ACTIVE_ENABLED(10002),
    BUTTON_TEST_ACTIVE_DISABLED(10003),
    BUTTON_TEST_INACTIVE_ENABLED(10004),
    BUTTON_TEST_INACTIVE_DISABLED(10005);

    public final int H;

    qug(int i) {
        this.H = i;
    }

    public static defpackage.qug b(int i) {
        switch (i) {
            case 0:
                return BUTTON_UNKNOWN;
            case 1:
                return BUTTON_MORE;
            case 2:
                return BUTTON_AUDIO_ROUTE;
            case 3:
                return BUTTON_MUTE;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return BUTTON_DIALPAD;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return BUTTON_MERGE;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return BUTTON_ADD_CALL;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return BUTTON_UPGRADE_TO_RTT;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return BUTTON_SWAP_SIM;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return BUTTON_MANAGE_CONFERENCE;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return BUTTON_UPGRADE_TO_CARRIER_VIDEO;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return BUTTON_UPGRADE_TO_DUO_VIDEO;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return BUTTON_RECORD;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return BUTTON_SWAP;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return BUTTON_HOLD;
            case 15:
                return BUTTON_UNHOLD;
            case 16:
                return BUTTON_CALL_TRANSFER_CONSULTATIVE;
            case 17:
                return BUTTON_UPGRADE_TO_TRANSMISSION_ONLY_VIDEO;
            case 18:
                return BUTTON_SELECT_UPGRADE_VIDEO_TYPE;
            case 19:
                return BUTTON_SONIC;
            case 20:
                return BUTTON_FERMAT;
            case 21:
                return BUTTON_ATLAS;
            case 22:
                return BUTTON_XATU;
            case 23:
                return BUTTON_SHARPIE;
            case 24:
                return BUTTON_NAUTILUS;
            case 25:
                return BUTTON_BEACON;
            case 26:
                return BUTTON_DEBUG;
            default:
                switch (i) {
                    case defpackage.aehk.NEXT_REQUEST_CODE /* 10000 */:
                        return BUTTON_TEST_HIGH_PRIORITY;
                    case 10001:
                        return BUTTON_TEST_LOW_PRIORITY;
                    case 10002:
                        return BUTTON_TEST_ACTIVE_ENABLED;
                    case 10003:
                        return BUTTON_TEST_ACTIVE_DISABLED;
                    case 10004:
                        return BUTTON_TEST_INACTIVE_ENABLED;
                    case 10005:
                        return BUTTON_TEST_INACTIVE_DISABLED;
                    default:
                        return null;
                }
        }
    }

    public final int a() {
        return this.H;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.H);
    }
}
