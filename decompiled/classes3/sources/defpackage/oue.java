package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum oue implements alah {
    UNKNOWN(0),
    BAM(1),
    DOBBY_SUMMARY(2),
    SHARPIE(3),
    REVELIO_SUMMARY(5),
    CALLER_TAG(6),
    ENRICHED_CALLING(7),
    EXPRESSO(8),
    COIN(1000),
    AURORA_AVATAR(9999),
    AVATAR(defpackage.aehk.NEXT_REQUEST_CODE),
    TEST_HIGH_PRIORITY(100000),
    TEST_LOW_PRIORITY(100001);

    public final int n;

    oue(int i) {
        this.n = i;
    }

    public final int a() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.n);
    }
}
