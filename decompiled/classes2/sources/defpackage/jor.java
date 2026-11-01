package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum jor implements alah {
    INVALID(0),
    ALWAYS(1),
    HEADSET(2),
    NEVER(3),
    UNRECOGNIZED(-1);

    private final int g;

    jor(int i) {
        this.g = i;
    }

    public static defpackage.jor b(int i) {
        if (i == 0) {
            return INVALID;
        }
        if (i == 1) {
            return ALWAYS;
        }
        if (i == 2) {
            return HEADSET;
        }
        if (i != 3) {
            return null;
        }
        return NEVER;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
