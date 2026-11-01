package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akqn implements alai {
    private final /* synthetic */ int $cid;
    public static final alai u = new defpackage.akqn(20);
    public static final alai t = new defpackage.akqn(19);
    public static final alai s = new defpackage.akqn(18);
    public static final alai r = new defpackage.akqn(17);
    public static final alai q = new defpackage.akqn(16);
    public static final alai p = new defpackage.akqn(15);
    public static final alai o = new defpackage.akqn(14);
    public static final alai n = new defpackage.akqn(13);
    public static final alai m = new defpackage.akqn(12);
    public static final alai l = new defpackage.akqn(11);
    public static final alai k = new defpackage.akqn(10);
    public static final alai j = new defpackage.akqn(9);
    public static final alai i = new defpackage.akqn(8);
    public static final alai h = new defpackage.akqn(7);
    public static final alai g = new defpackage.akqn(6);
    public static final alai f = new defpackage.akqn(5);
    public static final alai e = new defpackage.akqn(4);
    public static final alai d = new defpackage.akqn(3);
    static final alai c = new defpackage.akqn(2);
    static final alai b = new defpackage.akqn(1);
    static final alai a = new defpackage.akqn(0);

    private akqn(int i2) {
        this.$cid = i2;
    }

    public final boolean a(int i2) {
        defpackage.akst akstVar;
        switch (this.$cid) {
            case 0:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case 1:
                return a.av(i2);
            case 2:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 5:
                    case 6:
                    case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                    case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                    case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                    case 12:
                    case 13:
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
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
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
                        return true;
                    case 3:
                    case 4:
                    case 7:
                    case 8:
                    case 14:
                    default:
                        return false;
                }
            case 3:
                return a.aH(i2);
            case 4:
            default:
                return a.az(i2);
            case 5:
                return a.Z(i2) != 0;
            case 6:
                return defpackage.akrt.b(i2) != null;
            case 7:
                switch (i2) {
                    case 0:
                        akstVar = defpackage.akst.FETCH_REASON_UNSPECIFIED;
                        break;
                    case 1:
                        akstVar = defpackage.akst.FULL_SYNC_INSTRUCTION;
                        break;
                    case 2:
                        akstVar = defpackage.akst.SYNC_INSTRUCTION;
                        break;
                    case 3:
                        akstVar = defpackage.akst.COLLABORATOR_API_CALL;
                        break;
                    case 4:
                        akstVar = defpackage.akst.GUNS_MIGRATION;
                        break;
                    case 5:
                        akstVar = defpackage.akst.INBOX;
                        break;
                    case 6:
                        akstVar = defpackage.akst.DELAYED_IMPRESSION;
                        break;
                    case 7:
                        akstVar = defpackage.akst.REMOTE_DELETED_MESSAGES;
                        break;
                    case 8:
                        akstVar = defpackage.akst.LOCALE_CHANGED;
                        break;
                    case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                        akstVar = defpackage.akst.GROWTHKIT_PERIODIC_FETCH;
                        break;
                    case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                        akstVar = defpackage.akst.GROWTHKIT_SYNC_ON_STARTUP;
                        break;
                    case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                        akstVar = defpackage.akst.GROWTHKIT_SYNC_AFTER_PROMO_SHOWN;
                        break;
                    case 12:
                        akstVar = defpackage.akst.GROWTHKIT_SYNC_AFTER_USER_ACTION;
                        break;
                    case 13:
                        akstVar = defpackage.akst.GROWTHKIT_SYNC_FOR_TEST_REASON;
                        break;
                    case 14:
                        akstVar = defpackage.akst.GROWTHKIT_SYNC_INSTRUCTION;
                        break;
                    case 15:
                        akstVar = defpackage.akst.FETCH_STORED_NOTIFICATIONS;
                        break;
                    default:
                        akstVar = null;
                        break;
                }
                return akstVar != null;
            case 8:
                return akte.b(i2) != null;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return i2 == 0 || i2 == 1 || i2 == 4;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return a.aw(i2);
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return aktk.b(i2) != null;
            case 12:
                return defpackage.aktn.b(i2) != null;
            case 13:
                return akto.b(i2) != null;
            case 14:
                return defpackage.aktv.b(i2) != null;
            case 15:
                return defpackage.akty.b(i2) != null;
            case 16:
                return defpackage.akub.b(i2) != null;
            case 17:
                return defpackage.akuc.b(i2) != null;
            case 18:
                return defpackage.akue.b(i2) != null;
            case 19:
                return defpackage.akug.b(i2) != null;
        }
    }
}
