package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acvt implements alai {
    private final /* synthetic */ int $cid;
    public static final alai u = new defpackage.acvt(20);
    public static final alai t = new defpackage.acvt(19);
    public static final alai s = new defpackage.acvt(18);
    public static final alai r = new defpackage.acvt(17);
    public static final alai q = new defpackage.acvt(16);
    public static final alai p = new defpackage.acvt(15);
    public static final alai o = new defpackage.acvt(14);
    public static final alai n = new defpackage.acvt(13);
    public static final alai m = new defpackage.acvt(12);
    public static final alai l = new defpackage.acvt(11);
    public static final alai k = new defpackage.acvt(10);
    public static final alai j = new defpackage.acvt(9);
    public static final alai i = new defpackage.acvt(8);
    public static final alai h = new defpackage.acvt(7);
    static final alai g = new defpackage.acvt(6);
    static final alai f = new defpackage.acvt(5);
    static final alai e = new defpackage.acvt(4);
    static final alai d = new defpackage.acvt(3);
    static final alai c = new defpackage.acvt(2);
    static final alai b = new defpackage.acvt(1);
    static final alai a = new defpackage.acvt(0);

    private acvt(int i2) {
        this.$cid = i2;
    }

    public final boolean a(int i2) {
        switch (this.$cid) {
            case 0:
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return a.av(i2);
            case 1:
            case 2:
            case 3:
            case 15:
                return a.aB(i2);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return defpackage.acwa.b(i2) != null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return a.aw(i2);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return afsq.Y(i2) != 0;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return a.aC(i2);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return a.az(i2);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return defpackage.afbu.b(i2) != null;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return i2 == 0 || i2 == 1;
            case 16:
                return a.aN(i2) != 0;
            case 17:
                return aehj.O(i2) != 0;
            case 18:
                return a.ay(i2);
            case 19:
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
                        return true;
                    default:
                        return false;
                }
            default:
                if (i2 == 0 || i2 == 1 || i2 == 601) {
                    return true;
                }
                switch (i2) {
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                    case 120:
                    case 121:
                    case 122:
                    case 123:
                    case 124:
                    case 125:
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 132:
                    case 133:
                    case 134:
                    case 135:
                        return true;
                    default:
                        switch (i2) {
                            case 701:
                            case 702:
                            case 703:
                            case 704:
                            case 705:
                            case 706:
                            case 707:
                                return true;
                            default:
                                return false;
                        }
                }
        }
    }
}
