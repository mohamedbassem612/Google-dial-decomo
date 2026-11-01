package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akja implements alai {
    private final /* synthetic */ int $cid;
    public static final alai u = new defpackage.akja(20);
    public static final alai t = new defpackage.akja(19);
    public static final alai s = new defpackage.akja(18);
    static final alai r = new defpackage.akja(17);
    static final alai q = new defpackage.akja(16);
    static final alai p = new defpackage.akja(15);
    static final alai o = new defpackage.akja(14);
    static final alai n = new defpackage.akja(13);
    static final alai m = new defpackage.akja(12);
    static final alai l = new defpackage.akja(11);
    static final alai k = new defpackage.akja(10);
    static final alai j = new defpackage.akja(9);
    static final alai i = new defpackage.akja(8);
    static final alai h = new defpackage.akja(7);
    static final alai g = new defpackage.akja(6);
    static final alai f = new defpackage.akja(5);
    static final alai e = new defpackage.akja(4);
    static final alai d = new defpackage.akja(3);
    static final alai c = new defpackage.akja(2);
    static final alai b = new defpackage.akja(1);
    static final alai a = new defpackage.akja(0);

    private akja(int i2) {
        this.$cid = i2;
    }

    public final boolean a(int i2) {
        java.lang.Enum r0 = null;
        switch (this.$cid) {
            case 0:
                return a.aB(i2);
            case 1:
                if (defpackage.akij.b(i2) == null) {
                    return false;
                }
                break;
            case 2:
                if (defpackage.akjb.b(i2) == null) {
                    return false;
                }
                break;
            case 3:
                if (defpackage.akjd.b(i2) == null) {
                    return false;
                }
                break;
            case 4:
                if (defpackage.akje.b(i2) == null) {
                    return false;
                }
                break;
            case 5:
                if (i2 == 0) {
                    r0 = defpackage.akjf.BUTTONS_ORDER_UNSPECIFIED;
                } else if (i2 == 1) {
                    r0 = defpackage.akjf.ACTION_BUTTON_PRIMARY;
                } else if (i2 == 2) {
                    r0 = defpackage.akjf.ACK_BUTTON_PRIMARY;
                }
                if (r0 == null) {
                    return false;
                }
                break;
            case 6:
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
            case 19:
            default:
                return a.av(i2);
            case 7:
                if (defpackage.akky.c(i2) == 0) {
                    return false;
                }
                break;
            case 8:
                if (defpackage.akjg.b(i2) == null) {
                    return false;
                }
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                if (defpackage.akjq.b(i2) == null) {
                    return false;
                }
                break;
            case 12:
                if (i2 == 0) {
                    r0 = defpackage.akjv.UITHEME_DEFAULT;
                } else if (i2 == 1) {
                    r0 = defpackage.akjv.UITHEME_GOOGLE_MATERIAL;
                }
                if (r0 == null) {
                    return false;
                }
                break;
            case 13:
                if (akjw.b(i2) == null) {
                    return false;
                }
                break;
            case 14:
                if (akkc.b(i2) == null) {
                    return false;
                }
                break;
            case 15:
                if (a.aQ(i2) == 0) {
                    return false;
                }
                break;
            case 16:
                if (akkg.b(i2) == null) {
                    return false;
                }
                break;
            case 17:
                if (defpackage.akki.b(i2) == null) {
                    return false;
                }
                break;
            case 18:
                if (defpackage.akkm.b(i2) == null) {
                    return false;
                }
                break;
        }
        return true;
    }
}
