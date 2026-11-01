package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum igh implements alah {
    FAILURE_UNKNOWN(0),
    FAILURE_CALL_PRECONDITIONS_NOT_SATISFIED(1),
    FAILURE_MODELS_NOT_AVAILABLE(2),
    FAILURE_UPLINK_REQUESTED_WHEN_DUOLINKS_UNAVAILABLE(3),
    FAILURE_LOCALE_MISMATCH(4),
    FAILURE_DEVICE_EXCEEDS_THERMAL_THRESHOLD(5),
    FAILURE_TIMEOUT(6),
    UNRECOGNIZED(-1);

    private final int j;

    igh(int i2) {
        this.j = i2;
    }

    public static defpackage.igh b(int i2) {
        switch (i2) {
            case 0:
                return FAILURE_UNKNOWN;
            case 1:
                return FAILURE_CALL_PRECONDITIONS_NOT_SATISFIED;
            case 2:
                return FAILURE_MODELS_NOT_AVAILABLE;
            case 3:
                return FAILURE_UPLINK_REQUESTED_WHEN_DUOLINKS_UNAVAILABLE;
            case 4:
                return FAILURE_LOCALE_MISMATCH;
            case 5:
                return FAILURE_DEVICE_EXCEEDS_THERMAL_THRESHOLD;
            case 6:
                return FAILURE_TIMEOUT;
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
