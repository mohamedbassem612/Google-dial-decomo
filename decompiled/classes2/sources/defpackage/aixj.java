package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aixj implements alai {
    private final /* synthetic */ int $cid;
    public static final alai u = new defpackage.aixj(20);
    public static final alai t = new defpackage.aixj(19);
    public static final alai s = new defpackage.aixj(18);
    public static final alai r = new defpackage.aixj(17);
    public static final alai q = new defpackage.aixj(16);
    public static final alai p = new defpackage.aixj(15);
    public static final alai o = new defpackage.aixj(14);
    public static final alai n = new defpackage.aixj(13);
    public static final alai m = new defpackage.aixj(12);
    public static final alai l = new defpackage.aixj(11);
    public static final alai k = new defpackage.aixj(10);
    public static final alai j = new defpackage.aixj(9);
    public static final alai i = new defpackage.aixj(8);
    public static final alai h = new defpackage.aixj(7);
    public static final alai g = new defpackage.aixj(6);
    public static final alai f = new defpackage.aixj(5);
    public static final alai e = new defpackage.aixj(4);
    public static final alai d = new defpackage.aixj(3);
    public static final alai c = new defpackage.aixj(2);
    static final alai b = new defpackage.aixj(1);
    public static final alai a = new defpackage.aixj(0);

    private aixj(int i2) {
        this.$cid = i2;
    }

    public final boolean a(int i2) {
        java.lang.Enum r2 = null;
        switch (this.$cid) {
            case 0:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            default:
                return a.az(i2);
            case 1:
            case 8:
            case 9:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return a.av(i2);
            case 2:
                return a.aG(i2);
            case 3:
                if (defpackage.aixm.b(i2) == null) {
                    return false;
                }
                break;
            case 4:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return a.aC(i2);
            case 5:
                switch (i2) {
                    case 0:
                        r2 = defpackage.aixn.UNKNOWN_EVENT_TYPE;
                        break;
                    case 1:
                        r2 = defpackage.aixn.INCOMING_ANSWERED_TYPE;
                        break;
                    case 2:
                        r2 = defpackage.aixn.MISSED_CALL_TYPE;
                        break;
                    case 3:
                        r2 = defpackage.aixn.VOICEMAIL_TYPE;
                        break;
                    case 4:
                        r2 = defpackage.aixn.BLOCKED_CALL_TYPE;
                        break;
                    case 5:
                        r2 = defpackage.aixn.OUTGOING_CALL_TYPE;
                        break;
                    case 6:
                        r2 = defpackage.aixn.REJECTED_CALL_TYPE;
                        break;
                    case 7:
                        r2 = defpackage.aixn.ANSWERED_EXTERNALLY_TYPE;
                        break;
                    case 8:
                        r2 = defpackage.aixn.INCOMING_MESSAGE;
                        break;
                    case 9:
                        r2 = defpackage.aixn.OUTGOING_MESSAGE;
                        break;
                    case 10:
                        r2 = defpackage.aixn.BLOCKED_MESSAGE;
                        break;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            case 6:
                if (a.aP(i2) == 0) {
                    return false;
                }
                break;
            case 7:
                if (i2 == 0) {
                    r2 = defpackage.aixq.UNKNOWN;
                } else if (i2 == 1) {
                    r2 = defpackage.aixq.USER_CONFIRMED_BUSINESS;
                } else if (i2 == 2) {
                    r2 = defpackage.aixq.USER_DENIED_BUSINESS;
                } else if (i2 == 3) {
                    r2 = defpackage.aixq.USER_CONFIRMED_BUSINESS_CNAP;
                } else if (i2 == 4) {
                    r2 = defpackage.aixq.USER_DENIED_BUSINESS_CNAP;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            case 10:
                switch (i2) {
                    case 0:
                        r2 = defpackage.aixx.UNKNOWN_CONTACT_TYPE;
                        break;
                    case 1:
                        r2 = defpackage.aixx.NOT_RESOLVED;
                        break;
                    case 2:
                        r2 = defpackage.aixx.CP2_DEFAULT_DIRECTORY;
                        break;
                    case 3:
                        r2 = defpackage.aixx.CP2_EXTENDED_DIRECTORY;
                        break;
                    case 4:
                        r2 = defpackage.aixx.CNAP;
                        break;
                    case 5:
                        r2 = defpackage.aixx.CEQUINT;
                        break;
                    case 6:
                        r2 = defpackage.aixx.CALLER_ID_BUSINESS;
                        break;
                    case 7:
                        r2 = defpackage.aixx.CALLER_ID_INDIVIDUAL;
                        break;
                    case 8:
                        r2 = defpackage.aixx.CALLER_ID_UNKNOWN;
                        break;
                    case 9:
                        r2 = defpackage.aixx.CALLER_ID_FEEDBACK;
                        break;
                    case 10:
                        r2 = defpackage.aixx.FIXED_DIALING_NUMBER;
                        break;
                    case 11:
                        r2 = defpackage.aixx.CALLER_TAG;
                        break;
                    case 12:
                        r2 = defpackage.aixx.CALLER_TAG_FEEDBACK;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        r2 = defpackage.aixx.B2C_ENRICHED_CALLING;
                        break;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            case 11:
                if (defpackage.aiyg.b(i2) == null) {
                    return false;
                }
                break;
            case 12:
                if (i2 == 0) {
                    r2 = defpackage.aiyh.PATRONUS_STATUS_UNKNOWN;
                } else if (i2 == 1) {
                    r2 = defpackage.aiyh.PATRONUS_STATUS_SPAM;
                } else if (i2 == 2) {
                    r2 = defpackage.aiyh.PATRONUS_STATUS_NOT_SPAM;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return a.aw(i2);
            case 16:
                if (a.aQ(i2) == 0) {
                    return false;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (a.aQ(i2) == 0) {
                    return false;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (i2 == 0) {
                    r2 = defpackage.aiyn.STIR_SHAKEN_VERSTAT_UNSPECIFIED;
                } else if (i2 == 1) {
                    r2 = defpackage.aiyn.STIR_SHAKEN_VERSTAT_VERIFIED;
                } else if (i2 == 2) {
                    r2 = defpackage.aiyn.STIR_SHAKEN_VERSTAT_FAILED;
                } else if (i2 == 3) {
                    r2 = defpackage.aiyn.STIR_SHAKEN_VERSTAT_UNKNOWN;
                }
                if (r2 == null) {
                    return false;
                }
                break;
        }
        return true;
    }
}
