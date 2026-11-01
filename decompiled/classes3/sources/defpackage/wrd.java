package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wrd implements alai {
    private final /* synthetic */ int $cid;
    public static final alai u = new defpackage.wrd(20);
    public static final alai t = new defpackage.wrd(19);
    public static final alai s = new defpackage.wrd(18);
    public static final alai r = new defpackage.wrd(17);
    public static final alai q = new defpackage.wrd(16);
    public static final alai p = new defpackage.wrd(15);
    public static final alai o = new defpackage.wrd(14);
    public static final alai n = new defpackage.wrd(13);
    public static final alai m = new defpackage.wrd(12);
    public static final alai l = new defpackage.wrd(11);
    public static final alai k = new defpackage.wrd(10);
    public static final alai j = new defpackage.wrd(9);
    public static final alai i = new defpackage.wrd(8);
    public static final alai h = new defpackage.wrd(7);
    public static final alai g = new defpackage.wrd(6);
    public static final alai f = new defpackage.wrd(5);
    public static final alai e = new defpackage.wrd(4);
    public static final alai d = new defpackage.wrd(3);
    public static final alai c = new defpackage.wrd(2);
    static final alai b = new defpackage.wrd(1);
    static final alai a = new defpackage.wrd(0);

    private wrd(int i2) {
        this.$cid = i2;
    }

    public final boolean a(int i2) {
        defpackage.ykk ykkVar;
        switch (this.$cid) {
            case 0:
                return defpackage.wre.b(i2) != null;
            case 1:
            case 2:
            case 18:
                return a.aw(i2);
            case 3:
                return defpackage.wxk.b(i2) != null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return a.aB(i2);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return a.aA(i2);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
            case 16:
                return a.av(i2);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return defpackage.xap.b(i2) != null;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return a.ag(i2) != 0;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return a.az(i2);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return anar.l(i2) != 0;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return defpackage.xfh.q(i2) != 0;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
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
                        return true;
                    default:
                        return false;
                }
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return a.aI(i2);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return anar.k(i2) != 0;
            case 15:
                if (i2 == 0 || i2 == 1) {
                    return true;
                }
                switch (i2) {
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
                        return true;
                    default:
                        return false;
                }
            case 17:
                return a.aX(i2) != 0;
            case 19:
                if (i2 == 0) {
                    ykkVar = defpackage.ykk.RULE_STATUS_UNSPECIFIED;
                } else if (i2 == 1) {
                    ykkVar = defpackage.ykk.RULE_STATUS_MATCHED;
                } else if (i2 == 2) {
                    ykkVar = defpackage.ykk.RULE_STATUS_UNMATCHED;
                } else if (i2 != 3) {
                    ykkVar = i2 != 4 ? null : defpackage.ykk.RULE_STATUS_NOT_RUN;
                } else {
                    ykkVar = defpackage.ykk.RULE_STATUS_FAILED;
                }
                return ykkVar != null;
            default:
                return ypm.b(i2) != null;
        }
    }
}
