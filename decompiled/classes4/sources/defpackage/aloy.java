package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aloy implements alai {
    private final /* synthetic */ int $cid;
    public static final alai u = new defpackage.aloy(20);
    public static final alai t = new defpackage.aloy(19);
    public static final alai s = new defpackage.aloy(18);
    public static final alai r = new defpackage.aloy(17);
    public static final alai q = new defpackage.aloy(16);
    public static final alai p = new defpackage.aloy(15);
    public static final alai o = new defpackage.aloy(14);
    public static final alai n = new defpackage.aloy(13);
    public static final alai m = new defpackage.aloy(12);
    public static final alai l = new defpackage.aloy(11);
    public static final alai k = new defpackage.aloy(10);
    public static final alai j = new defpackage.aloy(9);
    public static final alai i = new defpackage.aloy(8);
    public static final alai h = new defpackage.aloy(7);
    public static final alai g = new defpackage.aloy(6);
    public static final alai f = new defpackage.aloy(5);
    public static final alai e = new defpackage.aloy(4);
    public static final alai d = new defpackage.aloy(3);
    public static final alai c = new defpackage.aloy(2);
    static final alai b = new defpackage.aloy(1);
    static final alai a = new defpackage.aloy(0);

    private aloy(int i2) {
        this.$cid = i2;
    }

    public final boolean a(int i2) {
        defpackage.alti altiVar;
        switch (this.$cid) {
            case 0:
            case 18:
                return a.av(i2);
            case 1:
                return a.aB(i2);
            case 2:
                if (a.aN(i2) != 0) {
                    return true;
                }
                break;
            case 3:
                if (a.aN(i2) != 0) {
                    return true;
                }
                break;
            case 4:
                if (alrb.b(i2) != null) {
                    return true;
                }
                break;
            case 5:
                if (defpackage.alrf.b(i2) != null) {
                    return true;
                }
                break;
            case 6:
                if (defpackage.alrp.b(i2) != null) {
                    return true;
                }
                break;
            case 7:
                if (defpackage.alrx.b(i2) != null) {
                    return true;
                }
                break;
            case 8:
                if (ahus.w(i2) != 0) {
                    return true;
                }
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                if (defpackage.alsp.b(i2) != null) {
                    return true;
                }
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                if (defpackage.alss.b(i2) != null) {
                    return true;
                }
                break;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return a.aI(i2);
            case 12:
                if (a.aQ(i2) != 0) {
                    return true;
                }
                break;
            case 13:
                if (defpackage.alsy.b(i2) != null) {
                    return true;
                }
                break;
            case 14:
                if (defpackage.alsz.b(i2) != null) {
                    return true;
                }
                break;
            case 15:
                if (defpackage.altg.b(i2) != null) {
                    return true;
                }
                break;
            case 16:
                switch (i2) {
                    case 1:
                        altiVar = defpackage.alti.UNKNONW;
                        break;
                    case 2:
                        altiVar = defpackage.alti.RECOGNIZER_STATUS_INITIALIZATION_ERROR;
                        break;
                    case 3:
                        altiVar = defpackage.alti.RECOGNIZER_STATUS_RECOGNITION_ERROR;
                        break;
                    case 4:
                        altiVar = defpackage.alti.RECOGNIZER_STATUS_STREAM_BROKEN;
                        break;
                    case 5:
                        altiVar = defpackage.alti.INVALID_INPUT_FORMAT;
                        break;
                    case 6:
                        altiVar = defpackage.alti.START_DUPLEX_CALLED_WHILE_IN_PROGRESS;
                        break;
                    case 7:
                        altiVar = defpackage.alti.SPECS_LOADING_FAILURE;
                        break;
                    case 8:
                        altiVar = defpackage.alti.CALLBACK_HANDLING_FAILURE;
                        break;
                    case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                        altiVar = defpackage.alti.START_DUPLEX_CALLED_BEFORE_INITIALIZATION;
                        break;
                    case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                        altiVar = defpackage.alti.CORE_INFRA_FATAL_FAILURE;
                        break;
                    case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                        altiVar = defpackage.alti.MODEL_FATAL_ERROR;
                        break;
                    case 12:
                        altiVar = defpackage.alti.MODEL_TRANSIENT_ERROR;
                        break;
                    default:
                        altiVar = null;
                        break;
                }
                if (altiVar != null) {
                    return true;
                }
                break;
            case 17:
                if (defpackage.alwb.b(i2) != null) {
                    return true;
                }
                break;
            case 19:
                if (defpackage.alwk.b(i2) != null) {
                    return true;
                }
                break;
            default:
                return a.aw(i2);
        }
        return false;
    }
}
