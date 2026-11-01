package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum nfb implements alah {
    REASON_UNSET(0),
    REASON_EMERGENCY_CALL_OR_CALLBACK(1),
    REASON_VIDEO_CALL(2),
    REASON_RTT_CALL(3),
    REASON_ANOTHER_CALL_ACTIVE(4),
    REASON_AUDIO_PRISM_PRECONDITIONS_FAILED(5),
    REASON_CALL_ROAMING(6),
    REASON_MIC_PERMISSION_MISSING(7),
    REASON_INVALID_CALL_STATE(9),
    REASON_TTY_ENABLED(10),
    REASON_MIC_ACCESS_BLOCKED(11),
    REASON_GEMINI_INITIALIZATION_FAILED(12),
    REASON_FI_WIFI_CALLING_UNDER_FIXING(13),
    REASON_GACS_AICORE_MODEL_MISSING(14),
    REASON_GACS_AUDIOPRISM_MODEL_MISSING(15),
    UNRECOGNIZED(-1);

    private final int r;

    nfb(int i) {
        this.r = i;
    }

    public static defpackage.nfb b(int i) {
        switch (i) {
            case 0:
                return REASON_UNSET;
            case 1:
                return REASON_EMERGENCY_CALL_OR_CALLBACK;
            case 2:
                return REASON_VIDEO_CALL;
            case 3:
                return REASON_RTT_CALL;
            case 4:
                return REASON_ANOTHER_CALL_ACTIVE;
            case 5:
                return REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
            case 6:
                return REASON_CALL_ROAMING;
            case 7:
                return REASON_MIC_PERMISSION_MISSING;
            case 8:
            default:
                return null;
            case 9:
                return REASON_INVALID_CALL_STATE;
            case 10:
                return REASON_TTY_ENABLED;
            case 11:
                return REASON_MIC_ACCESS_BLOCKED;
            case 12:
                return REASON_GEMINI_INITIALIZATION_FAILED;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return REASON_FI_WIFI_CALLING_UNDER_FIXING;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return REASON_GACS_AICORE_MODEL_MISSING;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return REASON_GACS_AUDIOPRISM_MODEL_MISSING;
        }
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.r;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.r);
    }
}
