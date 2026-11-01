package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aklr implements alai {
    private final /* synthetic */ int $cid;
    public static final alai u = new defpackage.aklr(20);
    public static final alai t = new defpackage.aklr(19);
    public static final alai s = new defpackage.aklr(18);
    public static final alai r = new defpackage.aklr(17);
    public static final alai q = new defpackage.aklr(16);
    public static final alai p = new defpackage.aklr(15);
    public static final alai o = new defpackage.aklr(14);
    public static final alai n = new defpackage.aklr(13);
    public static final alai m = new defpackage.aklr(12);
    public static final alai l = new defpackage.aklr(11);
    public static final alai k = new defpackage.aklr(10);
    public static final alai j = new defpackage.aklr(9);
    public static final alai i = new defpackage.aklr(8);
    public static final alai h = new defpackage.aklr(7);
    public static final alai g = new defpackage.aklr(6);
    public static final alai f = new defpackage.aklr(5);
    public static final alai e = new defpackage.aklr(4);
    public static final alai d = new defpackage.aklr(3);
    static final alai c = new defpackage.aklr(2);
    static final alai b = new defpackage.aklr(1);
    static final alai a = new defpackage.aklr(0);

    private aklr(int i2) {
        this.$cid = i2;
    }

    public final boolean a(int i2) {
        java.lang.Enum r0 = null;
        switch (this.$cid) {
            case 0:
                return a.aF(i2);
            case 1:
            case 12:
            case 15:
                return a.az(i2);
            case 2:
            case 16:
                return a.av(i2);
            case 3:
                return a.aC(i2);
            case 4:
                return i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 5:
                return defpackage.aknx.a(i2) != 0;
            case 6:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                    case 7:
                    case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                    case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                    case 12:
                        return true;
                    case 4:
                    case 8:
                    case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                    default:
                        return false;
                }
            case 7:
                return a.Z(i2) != 0;
            case 8:
                return a.ay(i2);
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                if (i2 == 0) {
                    r0 = defpackage.akpk.CHANNEL_GROUP_STATE_UNKNOWN;
                } else if (i2 == 1) {
                    r0 = defpackage.akpk.ALLOWED;
                } else if (i2 == 2) {
                    r0 = defpackage.akpk.BANNED;
                }
                return r0 != null;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                if (i2 == 0) {
                    r0 = defpackage.akpm.UNSPECIFIED;
                } else if (i2 == 1) {
                    r0 = defpackage.akpm.TRUE;
                } else if (i2 == 2) {
                    r0 = defpackage.akpm.FALSE;
                }
                return r0 != null;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                switch (i2) {
                    case 0:
                        r0 = defpackage.akpn.IMPORTANCE_UNSPECIFIED;
                        break;
                    case 1:
                        r0 = defpackage.akpn.IMPORTANCE_NONE;
                        break;
                    case 2:
                        r0 = defpackage.akpn.IMPORTANCE_DEFAULT;
                        break;
                    case 3:
                        r0 = defpackage.akpn.IMPORTANCE_HIGH;
                        break;
                    case 4:
                        r0 = defpackage.akpn.IMPORTANCE_LOW;
                        break;
                    case 5:
                        r0 = defpackage.akpn.IMPORTANCE_MAX;
                        break;
                    case 6:
                        r0 = defpackage.akpn.IMPORTANCE_MIN;
                        break;
                }
                return r0 != null;
            case 13:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                    case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                    case 12:
                    case 13:
                    case 14:
                        return true;
                    case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                    default:
                        return false;
                }
            case 14:
                return a.aw(i2);
            case 17:
            case 19:
                return a.aK(i2);
            case 18:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                    case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                    case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                    case 12:
                    case 13:
                    case 14:
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
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                        return true;
                    default:
                        switch (i2) {
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                            case 60:
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                                return true;
                            default:
                                return false;
                        }
                }
            default:
                if (i2 == 0) {
                    r0 = defpackage.akqj.APP_BLOCK_STATE_UNKNOWN;
                } else if (i2 == 1) {
                    r0 = defpackage.akqj.ALLOWED;
                } else if (i2 == 2) {
                    r0 = defpackage.akqj.BANNED;
                }
                return r0 != null;
        }
    }
}
