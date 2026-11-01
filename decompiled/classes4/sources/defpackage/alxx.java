package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alxx implements alah {
    DECISION_UNKNOWN_IF_SPAM(0),
    DECISION_SPAM(1),
    DECISION_NOT_SPAM(2),
    NO_DECISION(3);

    public final int e;

    alxx(int i) {
        this.e = i;
    }

    public static defpackage.alxx b(int i) {
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
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
