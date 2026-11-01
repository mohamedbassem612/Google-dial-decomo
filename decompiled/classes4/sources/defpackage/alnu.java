package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alnu implements alah {
    UNKNOWN_ERROR_TYPE(0),
    INPUT_SAFETY_ERROR(1),
    OUTPUT_SAFETY_ERROR(2),
    TIMEOUT(3),
    REQUEST_TOO_LARGE(4),
    BUSY(5);

    public final int g;

    alnu(int i) {
        this.g = i;
    }

    public static defpackage.alnu b(int i) {
        if (i == 0) {
            return UNKNOWN_ERROR_TYPE;
        }
        if (i == 1) {
            return INPUT_SAFETY_ERROR;
        }
        if (i == 2) {
            return OUTPUT_SAFETY_ERROR;
        }
        if (i == 3) {
            return TIMEOUT;
        }
        if (i == 4) {
            return REQUEST_TOO_LARGE;
        }
        if (i != 5) {
            return null;
        }
        return BUSY;
    }

    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
