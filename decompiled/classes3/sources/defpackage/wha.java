package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum wha implements alah {
    ADDON_FEATURE_KEY_UNSPECIFIED(0),
    ADDON_FEATURE_KEY_HOLD_FOR_ME(1),
    ADDON_FEATURE_KEY_TEST_HIGH_PRIORITY(100000),
    ADDON_FEATURE_KEY_TEST_LOW_PRIORITY(100001);

    public final int e;

    wha(int i) {
        this.e = i;
    }

    public static defpackage.wha b(int i) {
        if (i == 0) {
            return ADDON_FEATURE_KEY_UNSPECIFIED;
        }
        if (i == 1) {
            return ADDON_FEATURE_KEY_HOLD_FOR_ME;
        }
        switch (i) {
            case 100000:
                return ADDON_FEATURE_KEY_TEST_HIGH_PRIORITY;
            case 100001:
                return ADDON_FEATURE_KEY_TEST_LOW_PRIORITY;
            default:
                return null;
        }
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
