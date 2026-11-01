package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum htv implements alah {
    MISSED_CALL_CUSTOMIZER_PRIORITY_UNSPECIFIED(0),
    MISSED_CALL_CUSTOMIZER_PRIORITY_SPAM(1),
    MISSED_CALL_CUSTOMIZER_PRIORITY_TEST_HIGH(100000),
    MISSED_CALL_CUSTOMIZER_PRIORITY_TEST_LOW(100001),
    UNRECOGNIZED(-1);

    private final int g;

    htv(int i) {
        this.g = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
