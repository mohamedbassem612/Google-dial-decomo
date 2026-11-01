package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum qio implements alah {
    UNKNOWN(0),
    DOBBY(1),
    REVELIO_SCREENING(2),
    SHARPIE(3),
    CONTACT_CHECKER(4),
    ATLAS(5),
    FIDES(6),
    VERIFIED_CALL(7),
    TINCAN(8),
    EXPRESSO(9),
    BEESLY(10),
    HEDWIG_CONTENT_PRIORITY(11),
    BASIC(12),
    TEST_HIGH_PRIORITY(100000),
    TEST_LOW_PRIORITY(100001);

    private final int q;

    qio(int i) {
        this.q = i;
    }

    public final int a() {
        return this.q;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.q);
    }
}
