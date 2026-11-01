package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum lui implements alah {
    UNKNOWN(0),
    VERIFIED(1),
    SPOOF(2),
    NOT_SURE(3),
    UNRECOGNIZED(-1);

    private final int g;

    lui(int i) {
        this.g = i;
    }

    public static defpackage.lui b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return VERIFIED;
        }
        if (i == 2) {
            return SPOOF;
        }
        if (i != 3) {
            return null;
        }
        return NOT_SURE;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
