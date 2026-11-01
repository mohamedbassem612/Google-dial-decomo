package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum stt implements alah {
    CALL_REDIRECTOR_ORDER_UNSPECIFIED(0),
    MEET(1),
    TEST_1(1000),
    TEST_2(1001),
    UNRECOGNIZED(-1);

    private final int g;

    stt(int i) {
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
