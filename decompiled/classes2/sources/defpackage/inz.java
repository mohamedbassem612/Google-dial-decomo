package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum inz implements alah {
    UNSPECIFIED(0),
    CAR_CRASH(1),
    EMERGENCY_SOS(2);

    private final int e;

    inz(int i) {
        this.e = i;
    }

    public static defpackage.inz b(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return CAR_CRASH;
        }
        if (i != 2) {
            return null;
        }
        return EMERGENCY_SOS;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
