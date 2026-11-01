package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum kqz implements alah {
    UNSET_ERROR(0),
    FEATURE_NOT_AVAILABLE(1),
    FEATURE_DOWNLOAD_INCOMPLETE(2),
    REQUEST_SAFETY_FAILURE(3),
    RESPONSE_SAFETY_FAILURE(4),
    GENERAL_INFERENCE_FAILURE(5),
    SUMMARY_SAFETY_MODEL_FAILURE(6),
    REQUEST_TOO_LARGE(7),
    RESPONSE_FORMAT_FAILURE(8),
    DUPLEX_MODEL_TRANSIENT_ERROR(9),
    DUPLEX_MODEL_FATAL_ERROR(10),
    DUPLEX_GENERIC_FAILURE(11),
    BUSY(12),
    ASTREA_NOT_UP_TO_DATE(13),
    GENERAL_UNEXPECTED_FAILURE(14);

    public final int p;

    kqz(int i) {
        this.p = i;
    }

    public static defpackage.kqz b(int i) {
        switch (i) {
            case 0:
                return UNSET_ERROR;
            case 1:
                return FEATURE_NOT_AVAILABLE;
            case 2:
                return FEATURE_DOWNLOAD_INCOMPLETE;
            case 3:
                return REQUEST_SAFETY_FAILURE;
            case 4:
                return RESPONSE_SAFETY_FAILURE;
            case 5:
                return GENERAL_INFERENCE_FAILURE;
            case 6:
                return SUMMARY_SAFETY_MODEL_FAILURE;
            case 7:
                return REQUEST_TOO_LARGE;
            case 8:
                return RESPONSE_FORMAT_FAILURE;
            case 9:
                return DUPLEX_MODEL_TRANSIENT_ERROR;
            case 10:
                return DUPLEX_MODEL_FATAL_ERROR;
            case 11:
                return DUPLEX_GENERIC_FAILURE;
            case 12:
                return BUSY;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return ASTREA_NOT_UP_TO_DATE;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return GENERAL_UNEXPECTED_FAILURE;
            default:
                return null;
        }
    }

    public final int a() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.p);
    }
}
