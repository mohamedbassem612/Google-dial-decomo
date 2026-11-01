package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class amjv implements alai {
    private final /* synthetic */ int $cid;
    public static final alai u = new defpackage.amjv(20);
    public static final alai t = new defpackage.amjv(19);
    public static final alai s = new defpackage.amjv(18);
    public static final alai r = new defpackage.amjv(17);
    public static final alai q = new defpackage.amjv(16);
    public static final alai p = new defpackage.amjv(15);
    public static final alai o = new defpackage.amjv(14);
    public static final alai n = new defpackage.amjv(13);
    public static final alai m = new defpackage.amjv(12);
    public static final alai l = new defpackage.amjv(11);
    public static final alai k = new defpackage.amjv(10);
    public static final alai j = new defpackage.amjv(9);
    public static final alai i = new defpackage.amjv(8);
    public static final alai h = new defpackage.amjv(7);
    public static final alai g = new defpackage.amjv(6);
    public static final alai f = new defpackage.amjv(5);
    public static final alai e = new defpackage.amjv(4);
    public static final alai d = new defpackage.amjv(3);
    public static final alai c = new defpackage.amjv(2);
    public static final alai b = new defpackage.amjv(1);
    public static final alai a = new defpackage.amjv(0);

    private amjv(int i2) {
        this.$cid = i2;
    }

    public final boolean a(int i2) {
        java.lang.Enum r1 = null;
        switch (this.$cid) {
            case 0:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                    case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                    case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                    case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                    case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                        return true;
                    case 31:
                    default:
                        return false;
                }
            case 1:
                return a.aD(i2) != 0;
            case 2:
            case 3:
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
            case 19:
                return a.aw(i2);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return a.az(i2);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                    case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                    case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                    case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                        return true;
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    default:
                        return false;
                }
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                if (i2 == 0) {
                    r1 = defpackage.amkr.DISABLED;
                } else if (i2 == 1) {
                    r1 = defpackage.amkr.SPEAKER_LABEL;
                } else if (i2 == 2) {
                    r1 = defpackage.amkr.SPEAKER_CHANGE;
                }
                return r1 != null;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return a.aN(i2) != 0;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return a.aM(i2) != 0;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ammm.b(i2) != null;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
            case 16:
                return a.av(i2);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                if (i2 == 0) {
                    r1 = defpackage.amnv.UNKNOWN_RESULT;
                } else if (i2 == 1) {
                    r1 = defpackage.amnv.ANSWER;
                } else if (i2 == 2) {
                    r1 = defpackage.amnv.REJECT;
                } else if (i2 == 3) {
                    r1 = defpackage.amnv.NO_ACTION;
                } else if (i2 == 4) {
                    r1 = defpackage.amnv.CANCELED;
                } else if (i2 == 5) {
                    r1 = defpackage.amnv.TOUCHED_OUTSIDE_PUCK;
                }
                return r1 != null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                if (i2 == 0) {
                    r1 = defpackage.amnx.UNKNOWN_TAP_RESULT;
                } else if (i2 == 1) {
                    r1 = defpackage.amnx.TAP_ANSWER;
                } else if (i2 == 2) {
                    r1 = defpackage.amnx.TAP_REJECT;
                } else if (i2 == 3) {
                    r1 = defpackage.amnx.TOUCHED_OUTSIDE_BUTTONS;
                }
                return r1 != null;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return a.aH(i2);
            case 15:
                return a.aG(i2);
            case 17:
                return anar.f(i2) != 0;
            case 18:
                return akky.l(i2) != 0;
            default:
                if (i2 == 0) {
                    r1 = defpackage.amoq.UNKNOWN_CALL_TYPE;
                } else if (i2 == 1) {
                    r1 = defpackage.amoq.INCOMING_CALL;
                } else if (i2 == 2) {
                    r1 = defpackage.amoq.OUTGOING_CALL;
                }
                return r1 != null;
        }
    }
}
