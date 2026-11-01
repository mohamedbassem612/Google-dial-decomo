package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alwx implements alai {
    private final /* synthetic */ int $cid;
    static final alai u = new defpackage.alwx(20);
    static final alai t = new defpackage.alwx(19);
    static final alai s = new defpackage.alwx(18);
    static final alai r = new defpackage.alwx(17);
    public static final alai q = new defpackage.alwx(16);
    static final alai p = new defpackage.alwx(15);
    static final alai o = new defpackage.alwx(14);
    public static final alai n = new defpackage.alwx(13);
    static final alai m = new defpackage.alwx(12);
    static final alai l = new defpackage.alwx(11);
    static final alai k = new defpackage.alwx(10);
    static final alai j = new defpackage.alwx(9);
    public static final alai i = new defpackage.alwx(8);
    static final alai h = new defpackage.alwx(7);
    static final alai g = new defpackage.alwx(6);
    static final alai f = new defpackage.alwx(5);
    static final alai e = new defpackage.alwx(4);
    static final alai d = new defpackage.alwx(3);
    static final alai c = new defpackage.alwx(2);
    public static final alai b = new defpackage.alwx(1);
    static final alai a = new defpackage.alwx(0);

    private alwx(int i2) {
        this.$cid = i2;
    }

    public final boolean a(int i2) {
        defpackage.alxw alxwVar;
        switch (this.$cid) {
            case 0:
                return a.aG(i2);
            case 1:
                if (defpackage.alwq.b(i2) == null) {
                    return false;
                }
                break;
            case 2:
            case 5:
            case 17:
                return a.aw(i2);
            case 3:
                if (airh.r(i2) == 0) {
                    return false;
                }
                break;
            case 4:
            case 12:
                return a.aB(i2);
            case 6:
                if (defpackage.alxi.b(i2) == null) {
                    return false;
                }
                break;
            case 7:
                if (airh.q(i2) == 0) {
                    return false;
                }
                break;
            case 8:
                if (defpackage.alxn.b(i2) == null) {
                    return false;
                }
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                if (a.aN(i2) == 0) {
                    return false;
                }
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                if (i2 == 0) {
                    alxwVar = defpackage.alxw.NO_CAUSE;
                } else if (i2 != 1) {
                    alxwVar = i2 != 2 ? null : defpackage.alxw.SPAM_AUDIO_MATCH;
                } else {
                    alxwVar = defpackage.alxw.SILENT_CALL;
                }
                if (alxwVar == null) {
                    return false;
                }
                break;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                if (defpackage.alxx.b(i2) == null) {
                    return false;
                }
                break;
            case 13:
                if (defpackage.alyd.b(i2) == null) {
                    return false;
                }
                break;
            case 14:
                if (defpackage.alyh.b(i2) == null) {
                    return false;
                }
                break;
            case 15:
            case 19:
            default:
                return a.av(i2);
            case 16:
                if (defpackage.alyl.b(i2) == null) {
                    return false;
                }
                break;
            case 18:
                if (defpackage.alyo.b(i2) == null) {
                    return false;
                }
                break;
        }
        return true;
    }
}
