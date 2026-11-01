package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum zsz implements alah {
    DECISION_UNSPECIFIED(0),
    DECISION_CONTINUE(1),
    DECISION_SHOW_UI(2),
    DECISION_RUN_WITHOUT_UI(3),
    DECISION_PLACE_CALL_IMMEDIATELY(4),
    DECISION_ABORT_CALL(5);

    public final int g;

    zsz(int i) {
        this.g = i;
    }

    public static defpackage.zsz b(int i) {
        if (i == 0) {
            return DECISION_UNSPECIFIED;
        }
        if (i == 1) {
            return DECISION_CONTINUE;
        }
        if (i == 2) {
            return DECISION_SHOW_UI;
        }
        if (i == 3) {
            return DECISION_RUN_WITHOUT_UI;
        }
        if (i == 4) {
            return DECISION_PLACE_CALL_IMMEDIATELY;
        }
        if (i != 5) {
            return null;
        }
        return DECISION_ABORT_CALL;
    }

    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
