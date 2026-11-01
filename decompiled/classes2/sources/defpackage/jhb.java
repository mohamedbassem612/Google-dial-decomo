package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum jhb implements alah {
    NOT_SET(0),
    ELIGIBILITY_FAILED(1),
    ELIGIBILITY_PASSED(2),
    ACTIVATING_BACKGROUND(7),
    ACTIVATING_FOREGROUND(8),
    ACTIVE_BACKGROUND(3),
    ACTIVE_FOREGROUND(4),
    ANSWERED(5),
    DISCONNECTED(6),
    ANSWERING_BACKGROUND(9),
    ANSWERING_FOREGROUND(10),
    UNRECOGNIZED(-1);

    private final int n;

    jhb(int i) {
        this.n = i;
    }

    public static defpackage.jhb b(int i) {
        switch (i) {
            case 0:
                return NOT_SET;
            case 1:
                return ELIGIBILITY_FAILED;
            case 2:
                return ELIGIBILITY_PASSED;
            case 3:
                return ACTIVE_BACKGROUND;
            case 4:
                return ACTIVE_FOREGROUND;
            case 5:
                return ANSWERED;
            case 6:
                return DISCONNECTED;
            case 7:
                return ACTIVATING_BACKGROUND;
            case 8:
                return ACTIVATING_FOREGROUND;
            case 9:
                return ANSWERING_BACKGROUND;
            case 10:
                return ANSWERING_FOREGROUND;
            default:
                return null;
        }
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.n;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.n);
    }
}
