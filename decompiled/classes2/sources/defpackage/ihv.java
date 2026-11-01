package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum ihv implements alah {
    FAILURE_UNKNOWN(0),
    FAILURE_NO_ONGOING_SESSION_FOR_FEATURE(3),
    UNRECOGNIZED(-1);

    private final int e;

    ihv(int i) {
        this.e = i;
    }

    public static defpackage.ihv b(int i) {
        if (i == 0) {
            return FAILURE_UNKNOWN;
        }
        if (i != 3) {
            return null;
        }
        return FAILURE_NO_ONGOING_SESSION_FOR_FEATURE;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
