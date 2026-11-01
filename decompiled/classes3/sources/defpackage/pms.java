package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum pms implements alah {
    UNKNOWN(0),
    SHARED_DATA(1),
    CALL_QUALITY(2),
    CONNECTION(3),
    FIDES(4),
    TEST_HIGH_PRIORITY(100000),
    TEST_LOW_PRIORITY(100001);

    public final int h;

    pms(int i2) {
        this.h = i2;
    }

    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
