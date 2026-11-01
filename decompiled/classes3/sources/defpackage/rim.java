package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum rim implements alah {
    JOYBALL_FEATURE_UNKNOWN(0),
    DOBBY(1),
    SHARPIE(2),
    TEST_JOYBALL_FEATURE_TOP(-9999),
    TEST_JOYBALL_FEATURE_BOTTOM(9999),
    UNRECOGNIZED(-1);

    private final int h;

    rim(int i) {
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
