package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum ous implements alah {
    UNKNOWN_FEATUERE_LABEL_PRIORITY(0),
    SHARPIE(1),
    XATU(2),
    HOLD_FOR_ME(3),
    TEST_HIGH_PRIORITY(100000),
    TEST_LOW_PRIORITY(100001),
    UNRECOGNIZED(-1);

    private final int i;

    ous(int i) {
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
