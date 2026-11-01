package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum jbn implements alah {
    ENROLLMENT_STATUS_UNKNOWN(0),
    ENROLLMENT_STATUS_OPTED_IN(1),
    ENROLLMENT_STATUS_OPTED_OUT(2),
    DISABLED_BY_EMM(3),
    UNRECOGNIZED(-1);

    private final int g;

    jbn(int i) {
        this.g = i;
    }

    public static defpackage.jbn b(int i) {
        if (i == 0) {
            return ENROLLMENT_STATUS_UNKNOWN;
        }
        if (i == 1) {
            return ENROLLMENT_STATUS_OPTED_IN;
        }
        if (i == 2) {
            return ENROLLMENT_STATUS_OPTED_OUT;
        }
        if (i != 3) {
            return null;
        }
        return DISABLED_BY_EMM;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
