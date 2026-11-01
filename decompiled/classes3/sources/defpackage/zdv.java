package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum zdv implements alah {
    UNSPECIFIED_CAPABILITY(0),
    TEST_CAPABILITY(1),
    ENHANCED_SONIC_CAPABILITY(3),
    EXPRESSO_CAPABILITY(4),
    CONTACT_CHECKER_CAPABILITY(5),
    CALLCORE_SPOOF_DETECTION(6),
    UNRECOGNIZED(-1);

    private final int i;

    zdv(int i) {
        this.i = i;
    }

    public static defpackage.zdv b(int i) {
        if (i == 0) {
            return UNSPECIFIED_CAPABILITY;
        }
        if (i == 1) {
            return TEST_CAPABILITY;
        }
        if (i == 3) {
            return ENHANCED_SONIC_CAPABILITY;
        }
        if (i == 4) {
            return EXPRESSO_CAPABILITY;
        }
        if (i == 5) {
            return CONTACT_CHECKER_CAPABILITY;
        }
        if (i != 6) {
            return null;
        }
        return CALLCORE_SPOOF_DETECTION;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.i;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.i);
    }
}
