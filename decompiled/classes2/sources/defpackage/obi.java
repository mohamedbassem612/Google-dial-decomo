package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum obi implements alah {
    SNACKBAR_NOT_PRESENT(0),
    SNACKBAR_FAILED_TO_INITIATE_AS_RTT(1),
    SNACKBAR_TURN_ON_SPEAKER_OR_FOLD_DEVICE(2),
    SNACKBAR_TEST_HIGH_PRIORITY(10000),
    SNACKBAR_TEST_LOW_PRIORITY(10001);

    public final int f;

    obi(int i) {
        this.f = i;
    }

    public static defpackage.obi b(int i) {
        if (i == 0) {
            return SNACKBAR_NOT_PRESENT;
        }
        if (i == 1) {
            return SNACKBAR_FAILED_TO_INITIATE_AS_RTT;
        }
        if (i == 2) {
            return SNACKBAR_TURN_ON_SPEAKER_OR_FOLD_DEVICE;
        }
        if (i == 10000) {
            return SNACKBAR_TEST_HIGH_PRIORITY;
        }
        if (i != 10001) {
            return null;
        }
        return SNACKBAR_TEST_LOW_PRIORITY;
    }

    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
