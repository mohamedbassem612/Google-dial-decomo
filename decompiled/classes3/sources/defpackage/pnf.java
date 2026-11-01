package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum pnf implements alah {
    INDICATOR_KEY_UNSPECIFIED(0),
    CALL_RECORDING_INDICATOR(1),
    FERMAT_INDICATOR(2),
    SHARPIE_INDICATOR(3),
    INDICATOR_TEST_LOW_PRIORITY(-9999),
    INDICATOR_TEST_HIGH_PRIORITY(9999),
    UNRECOGNIZED(-1);

    private final int i;

    pnf(int i) {
        this.i = i;
    }

    public static defpackage.pnf b(int i) {
        if (i == -9999) {
            return INDICATOR_TEST_LOW_PRIORITY;
        }
        if (i == 9999) {
            return INDICATOR_TEST_HIGH_PRIORITY;
        }
        if (i == 0) {
            return INDICATOR_KEY_UNSPECIFIED;
        }
        if (i == 1) {
            return CALL_RECORDING_INDICATOR;
        }
        if (i == 2) {
            return FERMAT_INDICATOR;
        }
        if (i != 3) {
            return null;
        }
        return SHARPIE_INDICATOR;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.i;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.i);
    }
}
