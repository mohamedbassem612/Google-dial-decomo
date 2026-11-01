package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum noh implements alah {
    ENROLLMENT_STATUS_UNSPECIFIED(0),
    ENROLLMENT_STATUS_USER_OPTED_OUT(1),
    ENROLLMENT_STATUS_AUTO_ENROLLED_FROM_REVELIO(2),
    ENROLLMENT_STATUS_USER_OPTED_IN(3),
    ENROLLMENT_STATUS_AUTO_NOT_ENROLLED_FROM_REVELIO(4),
    ENROLLMENT_STATUS_OPTED_IN_BY_GOOGLE_FI(5),
    ENROLLMENT_STATUS_OPTED_OUT_BY_GOOGLE_FI(6),
    ENROLLMENT_STATUS_AUTO_ENROLLED_FROM_PROMO(7),
    ENROLLMENT_STATUS_OPTED_IN_BY_JOYBALL(8),
    ENROLLMENT_STATUS_OPTED_IN_BY_AAPM(9),
    UNRECOGNIZED(-1);

    private final int m;

    noh(int i) {
        this.m = i;
    }

    public static defpackage.noh b(int i) {
        switch (i) {
            case 0:
                return ENROLLMENT_STATUS_UNSPECIFIED;
            case 1:
                return ENROLLMENT_STATUS_USER_OPTED_OUT;
            case 2:
                return ENROLLMENT_STATUS_AUTO_ENROLLED_FROM_REVELIO;
            case 3:
                return ENROLLMENT_STATUS_USER_OPTED_IN;
            case 4:
                return ENROLLMENT_STATUS_AUTO_NOT_ENROLLED_FROM_REVELIO;
            case 5:
                return ENROLLMENT_STATUS_OPTED_IN_BY_GOOGLE_FI;
            case 6:
                return ENROLLMENT_STATUS_OPTED_OUT_BY_GOOGLE_FI;
            case 7:
                return ENROLLMENT_STATUS_AUTO_ENROLLED_FROM_PROMO;
            case 8:
                return ENROLLMENT_STATUS_OPTED_IN_BY_JOYBALL;
            case 9:
                return ENROLLMENT_STATUS_OPTED_IN_BY_AAPM;
            default:
                return null;
        }
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.m;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.m);
    }
}
