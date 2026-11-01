package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum qit implements alah {
    UNKNOWN(0),
    DOBBY(1),
    REVELIO(2),
    SHARPIE(3),
    CONTACT_CHECKER(4),
    BEESLY(5),
    HEDWIG(6),
    SHARPIE_RUNNING(7),
    BEACON(8),
    DEFAULT(99999),
    TEST_HIGH_PRIORITY(100000),
    TEST_LOW_PRIORITY(100001);

    public final int m;

    qit(int i) {
        this.m = i;
    }

    public final int a() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.m);
    }
}
