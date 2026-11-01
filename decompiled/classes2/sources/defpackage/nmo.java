package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum nmo implements alah {
    NOT_SET(0),
    NOT_A_DOBBY_CALL(1),
    READY_FOR_MANUAL_SCREENING(2),
    AUTO_SCREENING(3),
    AUTO_SCREENING_WITH_UI(12),
    MANUAL_SCREENING(4),
    MANUAL_SCREENING_WITHOUT_UI(15),
    BAM(11),
    RINGING_DURING_ACTIVE_SESSION(5),
    RINGING_DURING_NOT_ACTIVE_SESSION(6),
    TAKING_MESSAGE(7),
    FOREGROUND_DECLINING(8),
    BACKGROUND_DECLINING(9),
    ANSWERED(10),
    BEESLY(13),
    BEESLY_WITH_UI(14),
    UNRECOGNIZED(-1);

    private final int s;

    nmo(int i) {
        this.s = i;
    }

    public static defpackage.nmo b(int i) {
        switch (i) {
            case 0:
                return NOT_SET;
            case 1:
                return NOT_A_DOBBY_CALL;
            case 2:
                return READY_FOR_MANUAL_SCREENING;
            case 3:
                return AUTO_SCREENING;
            case 4:
                return MANUAL_SCREENING;
            case 5:
                return RINGING_DURING_ACTIVE_SESSION;
            case 6:
                return RINGING_DURING_NOT_ACTIVE_SESSION;
            case 7:
                return TAKING_MESSAGE;
            case 8:
                return FOREGROUND_DECLINING;
            case 9:
                return BACKGROUND_DECLINING;
            case 10:
                return ANSWERED;
            case 11:
                return BAM;
            case 12:
                return AUTO_SCREENING_WITH_UI;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return BEESLY;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return BEESLY_WITH_UI;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return MANUAL_SCREENING_WITHOUT_UI;
            default:
                return null;
        }
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.s;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.s);
    }
}
