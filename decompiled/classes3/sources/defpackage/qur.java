package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum qur implements alah {
    UNKNOWN(0),
    DUO(1),
    SONIC(2),
    CHIP_CLICK_TEST(defpackage.aehk.NEXT_REQUEST_CODE),
    SECOND_CHIP_CLICK_TEST(10001),
    UNRECOGNIZED(-1);

    private final int h;

    qur(int i) {
        this.h = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
