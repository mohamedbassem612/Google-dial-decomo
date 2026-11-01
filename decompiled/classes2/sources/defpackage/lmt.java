package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum lmt implements alah {
    UNSPECIFIED(0),
    TEST_HIGH_PRIORITY(1),
    TEST_LOW_PRIORITY(2),
    ENRICHED_CALLING(3),
    UNRECOGNIZED(-1);

    private final int g;

    lmt(int i) {
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
