package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum owy implements alah {
    SELECTED_ANSWER_METHOD_UNKNOWN(0),
    SELECTED_ANSWER_METHOD_HORIZONTAL(1),
    SELECTED_ANSWER_METHOD_TAP(2),
    UNRECOGNIZED(-1);

    private final int f;

    owy(int i) {
        this.f = i;
    }

    public static defpackage.owy b(int i) {
        if (i == 0) {
            return SELECTED_ANSWER_METHOD_UNKNOWN;
        }
        if (i == 1) {
            return SELECTED_ANSWER_METHOD_HORIZONTAL;
        }
        if (i != 2) {
            return null;
        }
        return SELECTED_ANSWER_METHOD_TAP;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
