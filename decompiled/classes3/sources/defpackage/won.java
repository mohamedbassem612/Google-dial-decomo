package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum won implements alah {
    UNKNOWN(0),
    NOT_A_XATU_CALL(1),
    UI_SHOWN_NOT_IN_SESSION(2),
    IN_SESSION(3),
    CLOSED(4),
    UNRECOGNIZED(-1);

    private final int h;

    won(int i) {
        this.h = i;
    }

    public static defpackage.won b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NOT_A_XATU_CALL;
        }
        if (i == 2) {
            return UI_SHOWN_NOT_IN_SESSION;
        }
        if (i == 3) {
            return IN_SESSION;
        }
        if (i != 4) {
            return null;
        }
        return CLOSED;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
