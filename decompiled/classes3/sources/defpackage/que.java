package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum que implements alah {
    UNKNOWN(0),
    MORE(1),
    CALL_ASSIST(2),
    AUDIO_EMOJI(3),
    TEST_HIGH_PRIORITY(100000),
    TEST_LOW_PRIORITY(100001);

    public final int g;

    que(int i) {
        this.g = i;
    }

    public static defpackage.que b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return MORE;
        }
        if (i == 2) {
            return CALL_ASSIST;
        }
        if (i == 3) {
            return AUDIO_EMOJI;
        }
        switch (i) {
            case 100000:
                return TEST_HIGH_PRIORITY;
            case 100001:
                return TEST_LOW_PRIORITY;
            default:
                return null;
        }
    }

    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
