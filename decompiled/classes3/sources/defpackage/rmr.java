package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rmr implements alai {
    private final /* synthetic */ int $cid;
    public static final alai u = new defpackage.rmr(20);
    public static final alai t = new defpackage.rmr(19);
    public static final alai s = new defpackage.rmr(18);
    public static final alai r = new defpackage.rmr(17);
    public static final alai q = new defpackage.rmr(16);
    public static final alai p = new defpackage.rmr(15);
    public static final alai o = new defpackage.rmr(14);
    public static final alai n = new defpackage.rmr(13);
    public static final alai m = new defpackage.rmr(12);
    public static final alai l = new defpackage.rmr(11);
    public static final alai k = new defpackage.rmr(10);
    public static final alai j = new defpackage.rmr(9);
    public static final alai i = new defpackage.rmr(8);
    public static final alai h = new defpackage.rmr(7);
    public static final alai g = new defpackage.rmr(6);
    public static final alai f = new defpackage.rmr(5);
    public static final alai e = new defpackage.rmr(4);
    public static final alai d = new defpackage.rmr(3);
    public static final alai c = new defpackage.rmr(2);
    public static final alai b = new defpackage.rmr(1);
    public static final alai a = new defpackage.rmr(0);

    private rmr(int i2) {
        this.$cid = i2;
    }

    public final boolean a(int i2) {
        switch (this.$cid) {
            case 0:
                return defpackage.rms.b(i2) != null;
            case 1:
                return defpackage.rcd.b(i2) != null;
            case 2:
                return rmt.b(i2) != null;
            case 3:
                if (i2 == 0) {
                    return true;
                }
                switch (i2) {
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
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                        return true;
                    default:
                        return false;
                }
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return a.ay(i2);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return a.aD(i2) != 0;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
            case 18:
                return a.av(i2);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
            case 17:
                return a.az(i2);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
            case 19:
                return a.aw(i2);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return defpackage.tbe.b(i2) != null;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return defpackage.trt.b(i2) != null;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return defpackage.tvy.b(i2) != null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return a.aS(i2) != 0;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return a.aQ(i2) != 0;
            case 15:
                return a.aN(i2) != 0;
            case 16:
                return defpackage.twc.b(i2) != null;
            default:
                return a.aP(i2) != 0;
        }
    }
}
