package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum amqd implements alah {
    UNKNOWN_ERROR(0),
    INPUT_SAFETY_ERROR(1),
    OUTPUT_SAFETY_ERROR(2),
    TIMEOUT_ERROR(3),
    REQUEST_TOO_LARGE_ERROR(4),
    BUSY_ERROR(5);

    public final int g;

    amqd(int i) {
        this.g = i;
    }

    public static defpackage.amqd b(int i) {
        if (i == 0) {
            return UNKNOWN_ERROR;
        }
        if (i == 1) {
            return INPUT_SAFETY_ERROR;
        }
        if (i == 2) {
            return OUTPUT_SAFETY_ERROR;
        }
        if (i == 3) {
            return TIMEOUT_ERROR;
        }
        if (i == 4) {
            return REQUEST_TOO_LARGE_ERROR;
        }
        if (i != 5) {
            return null;
        }
        return BUSY_ERROR;
    }

    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
