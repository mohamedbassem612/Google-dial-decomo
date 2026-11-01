package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum nmr implements alah {
    REASON_UNKNOWN(0),
    USER_ACCEPT_CALL(1),
    USER_DECLINE_CALL(2),
    CALLER_DISCONNECT_CALL(3),
    CALL_MARKED_AS_SPAM(4),
    REASON_OTHER(5),
    UNRECOGNIZED(-1);

    private final int i;

    nmr(int i) {
        this.i = i;
    }

    public static defpackage.nmr b(int i) {
        if (i == 0) {
            return REASON_UNKNOWN;
        }
        if (i == 1) {
            return USER_ACCEPT_CALL;
        }
        if (i == 2) {
            return USER_DECLINE_CALL;
        }
        if (i == 3) {
            return CALLER_DISCONNECT_CALL;
        }
        if (i == 4) {
            return CALL_MARKED_AS_SPAM;
        }
        if (i != 5) {
            return null;
        }
        return REASON_OTHER;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.i;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.i);
    }
}
