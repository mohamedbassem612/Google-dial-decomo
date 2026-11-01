package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alik implements alah {
    UNKNOWN(0),
    TIME_HINTS_V0(1);

    private final int d;

    alik(int i) {
        this.d = i;
    }

    public static defpackage.alik b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return TIME_HINTS_V0;
    }

    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
