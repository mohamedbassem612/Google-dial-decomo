package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum pmq implements alah {
    DISPLAY_NAME_UNDEFINED(0),
    DISPLAY_NAME_SPOOF(1),
    DISPLAY_NAME_PATRICK(2),
    DISPLAY_NAME_AURORA(3),
    DISPLAY_NAME_TEST_HIGH_PRIORITY(defpackage.aehk.NEXT_REQUEST_CODE),
    DISPLAY_NAME_TEST_LOW_PRIORITY(10001),
    UNRECOGNIZED(-1);

    private final int i;

    pmq(int i) {
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
