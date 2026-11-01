package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum rku implements defpackage.alah {
    BUILD_TYPE_UNSPECIFIED(0),
    BUGFOOD(1),
    FISHFOOD(2),
    DOGFOOD(3),
    PUBLIC_BETA(4),
    RELEASE(5),
    TEST(6),
    UNRECOGNIZED(-1);

    private final int j;

    rku(int i2) {
        this.j = i2;
    }

    @Override // defpackage.alah
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.alau.a() : this.j;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.j);
    }
}
