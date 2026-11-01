package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum lnn implements alah {
    AUDIO_BASED_SCREENING_FEATURE_KEY_UNSPECIFIED(0),
    AUDIO_BASED_SCREENING_FEATURE_KEY_TEST_HIGH_PRIORITY(1),
    AUDIO_BASED_SCREENING_FEATURE_KEY_TEST_LOW_PRIORITY(2),
    AUDIO_BASED_SCREENING_FEATURE_KEY_BEESLY(3),
    AUDIO_BASED_SCREENING_FEATURE_KEY_DOBBY(4),
    AUDIO_BASED_SCREENING_FEATURE_KEY_REVELIO(5),
    UNRECOGNIZED(-1);

    private final int i;

    lnn(int i) {
        this.i = i;
    }

    public static defpackage.lnn b(int i) {
        if (i == 0) {
            return AUDIO_BASED_SCREENING_FEATURE_KEY_UNSPECIFIED;
        }
        if (i == 1) {
            return AUDIO_BASED_SCREENING_FEATURE_KEY_TEST_HIGH_PRIORITY;
        }
        if (i == 2) {
            return AUDIO_BASED_SCREENING_FEATURE_KEY_TEST_LOW_PRIORITY;
        }
        if (i == 3) {
            return AUDIO_BASED_SCREENING_FEATURE_KEY_BEESLY;
        }
        if (i == 4) {
            return AUDIO_BASED_SCREENING_FEATURE_KEY_DOBBY;
        }
        if (i != 5) {
            return null;
        }
        return AUDIO_BASED_SCREENING_FEATURE_KEY_REVELIO;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.i;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.i);
    }
}
