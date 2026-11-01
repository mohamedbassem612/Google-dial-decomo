package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum lno implements alah {
    CALL_INFO_BASED_SCREENING_FEATURE_KEY_UNSPECIFIED(0),
    CALL_INFO_BASED_SCREENING_FEATURE_KEY_TEST_HIGH_PRIORITY(1),
    CALL_INFO_BASED_SCREENING_FEATURE_KEY_TEST_LOW_PRIORITY(2),
    CALL_INFO_BASED_SCREENING_FEATURE_KEY_DOBBY(3),
    CALL_INFO_BASED_SCREENING_FEATURE_KEY_SPAM(4),
    CALL_INFO_BASED_SCREENING_FEATURE_KEY_BEESLY(5),
    UNRECOGNIZED(-1);

    private final int i;

    lno(int i) {
        this.i = i;
    }

    public static defpackage.lno b(int i) {
        if (i == 0) {
            return CALL_INFO_BASED_SCREENING_FEATURE_KEY_UNSPECIFIED;
        }
        if (i == 1) {
            return CALL_INFO_BASED_SCREENING_FEATURE_KEY_TEST_HIGH_PRIORITY;
        }
        if (i == 2) {
            return CALL_INFO_BASED_SCREENING_FEATURE_KEY_TEST_LOW_PRIORITY;
        }
        if (i == 3) {
            return CALL_INFO_BASED_SCREENING_FEATURE_KEY_DOBBY;
        }
        if (i == 4) {
            return CALL_INFO_BASED_SCREENING_FEATURE_KEY_SPAM;
        }
        if (i != 5) {
            return null;
        }
        return CALL_INFO_BASED_SCREENING_FEATURE_KEY_BEESLY;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.i;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.i);
    }
}
