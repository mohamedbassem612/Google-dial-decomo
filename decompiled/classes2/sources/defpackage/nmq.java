package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum nmq implements alah {
    DECISION_UNKNOWN_IF_SPAM(0),
    DECISION_SPAM(1),
    DECISION_NOT_SPAM(2),
    NO_DECISION(3),
    UNRECOGNIZED(-1);

    private final int g;

    nmq(int i) {
        this.g = i;
    }

    public static defpackage.nmq b(int i) {
        if (i == 0) {
            return DECISION_UNKNOWN_IF_SPAM;
        }
        if (i == 1) {
            return DECISION_SPAM;
        }
        if (i == 2) {
            return DECISION_NOT_SPAM;
        }
        if (i != 3) {
            return null;
        }
        return NO_DECISION;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
