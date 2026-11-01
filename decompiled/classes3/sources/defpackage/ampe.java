package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum ampe implements alah {
    UNKNOWN_SATISFACTION(0),
    SATISFACTION_VERY_LOW(1),
    SATISFACTION_LOW(2),
    SATISFACTION_MEDIUM(3),
    SATISFACTION_HIGH(4),
    SATISFACTION_VERY_HIGH(5);

    public final int g;

    ampe(int i) {
        this.g = i;
    }

    public static defpackage.ampe b(int i) {
        if (i == 0) {
            return UNKNOWN_SATISFACTION;
        }
        if (i == 1) {
            return SATISFACTION_VERY_LOW;
        }
        if (i == 2) {
            return SATISFACTION_LOW;
        }
        if (i == 3) {
            return SATISFACTION_MEDIUM;
        }
        if (i == 4) {
            return SATISFACTION_HIGH;
        }
        if (i != 5) {
            return null;
        }
        return SATISFACTION_VERY_HIGH;
    }

    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
