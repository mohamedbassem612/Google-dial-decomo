package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum qik implements alah {
    VERIFIED_BADGE(1),
    TEST_HIGH_PRIORITY(9999),
    TEST_LOW_PRIORITY(defpackage.aehk.NEXT_REQUEST_CODE);

    private final int e;

    qik(int i) {
        this.e = i;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
