package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yrl implements alai {
    private final /* synthetic */ int $cid;
    public static final alai u = new defpackage.yrl(20);
    public static final alai t = new defpackage.yrl(19);
    public static final alai s = new defpackage.yrl(18);
    public static final alai r = new defpackage.yrl(17);
    public static final alai q = new defpackage.yrl(16);
    public static final alai p = new defpackage.yrl(15);
    public static final alai o = new defpackage.yrl(14);
    public static final alai n = new defpackage.yrl(13);
    public static final alai m = new defpackage.yrl(12);
    public static final alai l = new defpackage.yrl(11);
    public static final alai k = new defpackage.yrl(10);
    public static final alai j = new defpackage.yrl(9);
    public static final alai i = new defpackage.yrl(8);
    public static final alai h = new defpackage.yrl(7);
    public static final alai g = new defpackage.yrl(6);
    public static final alai f = new defpackage.yrl(5);
    public static final alai e = new defpackage.yrl(4);
    public static final alai d = new defpackage.yrl(3);
    public static final alai c = new defpackage.yrl(2);
    public static final alai b = new defpackage.yrl(1);
    static final alai a = new defpackage.yrl(0);

    private yrl(int i2) {
        this.$cid = i2;
    }

    public final boolean a(int i2) {
        switch (this.$cid) {
            case 0:
                if (defpackage.yqm.f(i2) != 0) {
                    return true;
                }
                break;
            case 1:
                return a.az(i2);
            case 2:
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
                return a.av(i2);
            case 3:
                return a.ax(i2);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return a.aL(i2);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                if (defpackage.zsz.b(i2) != null) {
                    return true;
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                if (defpackage.ztf.b(i2) != null) {
                    return true;
                }
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                if (defpackage.ztx.b(i2) != null) {
                    return true;
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                if (defpackage.zty.b(i2) != null) {
                    return true;
                }
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
            case 17:
                return a.aw(i2);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                if (aaoo.B(i2) != 0) {
                    return true;
                }
                break;
            case 18:
                if (defpackage.acvo.b(i2) != null) {
                    return true;
                }
                break;
            case 19:
            default:
                return a.aB(i2);
        }
        return false;
    }
}
