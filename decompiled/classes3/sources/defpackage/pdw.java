package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum pdw implements alah {
    BACKGROUND_UNDEFINED(0),
    BACKGROUND_SPAM(1),
    BACKGROUND_SPOOF(2),
    BACKGROUND_PATRICK(3),
    TEST_HIGH_PRIORITY(defpackage.aehk.NEXT_REQUEST_CODE),
    TEST_LOW_PRIORITY(10001),
    UNRECOGNIZED(-1);

    private final int i;

    pdw(int i) {
        this.i = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.i;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.i);
    }
}
