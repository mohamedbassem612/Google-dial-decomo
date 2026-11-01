package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum qis implements alah {
    UNKNOWN(0),
    SHARPIE(1),
    CONTACT_CHECKER(2),
    DEFAULT_ICON(3),
    TEST_HIGH_PRIORITY(100000),
    TEST_LOW_PRIORITY(100001);

    private final int h;

    qis(int i) {
        this.h = i;
    }

    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
