package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum whe implements alah {
    BOTTOM_SHEET_KEY_UNSPECIFIED(0),
    TEST_BOTTOM_SHEET_HIGH_PRIORITY(100000),
    TEST_BOTTOM_SHEET_LOW_PRIORITY(100001);

    public final int d;

    whe(int i) {
        this.d = i;
    }

    public static defpackage.whe b(int i) {
        if (i == 0) {
            return BOTTOM_SHEET_KEY_UNSPECIFIED;
        }
        switch (i) {
            case 100000:
                return TEST_BOTTOM_SHEET_HIGH_PRIORITY;
            case 100001:
                return TEST_BOTTOM_SHEET_LOW_PRIORITY;
            default:
                return null;
        }
    }

    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
