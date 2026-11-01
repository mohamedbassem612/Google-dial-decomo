package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum iht implements alah {
    FAILURE_UNKNOWN(0),
    FAILURE_PRECONDITIONS_NOT_SATISFIED(2),
    FAILURE_MODELS_FAILED_TO_START(3),
    FAILURE_CALL_AUDIO_READER_FAILED_TO_START(4),
    FAILURE_APPLYING_AUDIO_CONFIG(5),
    FAILURE_REQUESTED_FEATURE_ALREADY_IN_SESSION(6),
    FAILURE_NO_SESSION_RESERVATION(7),
    UNRECOGNIZED(-1);

    private final int j;

    iht(int i2) {
        this.j = i2;
    }

    public static defpackage.iht b(int i2) {
        if (i2 == 0) {
            return FAILURE_UNKNOWN;
        }
        switch (i2) {
            case 2:
                return FAILURE_PRECONDITIONS_NOT_SATISFIED;
            case 3:
                return FAILURE_MODELS_FAILED_TO_START;
            case 4:
                return FAILURE_CALL_AUDIO_READER_FAILED_TO_START;
            case 5:
                return FAILURE_APPLYING_AUDIO_CONFIG;
            case 6:
                return FAILURE_REQUESTED_FEATURE_ALREADY_IN_SESSION;
            case 7:
                return FAILURE_NO_SESSION_RESERVATION;
            default:
                return null;
        }
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.j;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.j);
    }
}
