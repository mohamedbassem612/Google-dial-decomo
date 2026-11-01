package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum mzb implements alah {
    DOBBY_BUTTON_STATE_UNKNOWN(0),
    DOBBY_BUTTON_STATE_SELECTED(1),
    DOBBY_BUTTON_STATE_ENABLED(2),
    DOBBY_BUTTON_STATE_DISABLED(3),
    UNRECOGNIZED(-1);

    private final int g;

    mzb(int i) {
        this.g = i;
    }

    public static defpackage.mzb b(int i) {
        if (i == 0) {
            return DOBBY_BUTTON_STATE_UNKNOWN;
        }
        if (i == 1) {
            return DOBBY_BUTTON_STATE_SELECTED;
        }
        if (i == 2) {
            return DOBBY_BUTTON_STATE_ENABLED;
        }
        if (i != 3) {
            return null;
        }
        return DOBBY_BUTTON_STATE_DISABLED;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
