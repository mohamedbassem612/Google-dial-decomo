package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum nwx implements alah {
    UNKNOWN_REACHABILITY(0),
    UNREACHABLE(1),
    REACHABLE(2),
    UNRECOGNIZED(-1);

    private final int f;

    nwx(int i) {
        this.f = i;
    }

    public static defpackage.nwx b(int i) {
        if (i == 0) {
            return UNKNOWN_REACHABILITY;
        }
        if (i == 1) {
            return UNREACHABLE;
        }
        if (i != 2) {
            return null;
        }
        return REACHABLE;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
