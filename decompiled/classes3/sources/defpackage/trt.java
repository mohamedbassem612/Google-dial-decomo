package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum trt implements alah {
    ENROLLMENT_STATUS_UNKNOWN(0),
    ENROLLMENT_STATUS_MANUAL_ENROLLED_FROM_SETTINGS(1),
    ENROLLMENT_STATUS_OPTED_OUT(2),
    ENROLLMENT_STATUS_AUTO_ENROLLED_FROM_PROMO(3),
    ENROLLMENT_STATUS_MANUAL_ENROLLED_FROM_JOYBALL(4),
    UNRECOGNIZED(-1);

    private final int h;

    trt(int i) {
        this.h = i;
    }

    public static defpackage.trt b(int i) {
        if (i == 0) {
            return ENROLLMENT_STATUS_UNKNOWN;
        }
        if (i == 1) {
            return ENROLLMENT_STATUS_MANUAL_ENROLLED_FROM_SETTINGS;
        }
        if (i == 2) {
            return ENROLLMENT_STATUS_OPTED_OUT;
        }
        if (i == 3) {
            return ENROLLMENT_STATUS_AUTO_ENROLLED_FROM_PROMO;
        }
        if (i != 4) {
            return null;
        }
        return ENROLLMENT_STATUS_MANUAL_ENROLLED_FROM_JOYBALL;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
