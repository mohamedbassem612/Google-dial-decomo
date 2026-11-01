package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum ouk implements alah {
    UNKNOWN(0),
    DOBBY(1),
    REVELIO(2),
    BEESLY(3),
    TEST_HIGH_PRIORITY(100000),
    TEST_LOW_PRIORITY(100001);

    public final int g;

    ouk(int i) {
        this.g = i;
    }

    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
