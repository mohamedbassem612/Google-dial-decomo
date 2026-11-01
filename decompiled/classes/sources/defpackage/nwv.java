package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum nwv implements defpackage.alah {
    UNKNOWN_API_PROVIDER_AVAILABILITY(0),
    UNAVAILABLE_MISSING_PROVIDER(1),
    UNAVAILABLE_SIGNED_OUT(2),
    AVAILABLE(3),
    AVAILABLE_NO_REACHABILITY(4),
    UNRECOGNIZED(-1);

    private final int h;

    nwv(int i) {
        this.h = i;
    }

    public static defpackage.nwv b(int i) {
        if (i == 0) {
            return UNKNOWN_API_PROVIDER_AVAILABILITY;
        }
        if (i == 1) {
            return UNAVAILABLE_MISSING_PROVIDER;
        }
        if (i == 2) {
            return UNAVAILABLE_SIGNED_OUT;
        }
        if (i == 3) {
            return AVAILABLE;
        }
        if (i != 4) {
            return null;
        }
        return AVAILABLE_NO_REACHABILITY;
    }

    @Override // defpackage.alah
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.alau.a() : this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
