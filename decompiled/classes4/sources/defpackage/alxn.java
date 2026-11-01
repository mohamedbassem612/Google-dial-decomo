package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alxn implements alah {
    NO_TRIGGER(0),
    TIMEOUT_TRIGGER(1),
    USER_END_CALL_TRIGGER(2),
    USER_JOIN_CALL_TRIGGER(3),
    WAIT_FOR_USER_RESPONSE_TRIGGER(4),
    WAIT_FOR_USER_RESPONSE_AFTER_HUMAN_SPEECH_TIMEOUT_TRIGGER(5);

    public final int g;

    alxn(int i) {
        this.g = i;
    }

    public static defpackage.alxn b(int i) {
        if (i == 0) {
            return NO_TRIGGER;
        }
        if (i == 1) {
            return TIMEOUT_TRIGGER;
        }
        if (i == 2) {
            return USER_END_CALL_TRIGGER;
        }
        if (i == 3) {
            return USER_JOIN_CALL_TRIGGER;
        }
        if (i == 4) {
            return WAIT_FOR_USER_RESPONSE_TRIGGER;
        }
        if (i != 5) {
            return null;
        }
        return WAIT_FOR_USER_RESPONSE_AFTER_HUMAN_SPEECH_TIMEOUT_TRIGGER;
    }

    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
