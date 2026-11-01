package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alwk implements alah {
    NO_TRIGGER(0),
    USER_END_CALL_TRIGGER(2),
    USER_JOIN_CALL_TRIGGER(3),
    HOLD_TIMEOUT_TRIGGER(5),
    MORE_HOLD_TIME_TRIGGER(6);

    public final int f;

    alwk(int i) {
        this.f = i;
    }

    public static defpackage.alwk b(int i) {
        if (i == 0) {
            return NO_TRIGGER;
        }
        if (i == 2) {
            return USER_END_CALL_TRIGGER;
        }
        if (i == 3) {
            return USER_JOIN_CALL_TRIGGER;
        }
        if (i == 5) {
            return HOLD_TIMEOUT_TRIGGER;
        }
        if (i != 6) {
            return null;
        }
        return MORE_HOLD_TIME_TRIGGER;
    }

    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
