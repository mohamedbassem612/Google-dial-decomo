package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum ihp implements alah {
    FAILURE_UNKNOWN(0),
    FAILURE_REQUESTED_FEATURE_ALREADY_IN_SESSION(1),
    FAILURE_INCOMPATIBLE_CLIENT_IN_SESSION(2),
    UNRECOGNIZED(-1);

    private final int f;

    ihp(int i) {
        this.f = i;
    }

    public static defpackage.ihp b(int i) {
        if (i == 0) {
            return FAILURE_UNKNOWN;
        }
        if (i == 1) {
            return FAILURE_REQUESTED_FEATURE_ALREADY_IN_SESSION;
        }
        if (i != 2) {
            return null;
        }
        return FAILURE_INCOMPATIBLE_CLIENT_IN_SESSION;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
