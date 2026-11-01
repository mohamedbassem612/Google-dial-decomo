package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum noi implements alah {
    PROTECTION_LEVEL_UNSPECIFIED(0),
    PROTECTION_LEVEL_BASIC(1),
    PROTECTION_LEVEL_MEDIUM(2),
    PROTECTION_LEVEL_MAXIMUM(3),
    UNRECOGNIZED(-1);

    private final int g;

    noi(int i) {
        this.g = i;
    }

    public static defpackage.noi b(int i) {
        if (i == 0) {
            return PROTECTION_LEVEL_UNSPECIFIED;
        }
        if (i == 1) {
            return PROTECTION_LEVEL_BASIC;
        }
        if (i == 2) {
            return PROTECTION_LEVEL_MEDIUM;
        }
        if (i != 3) {
            return null;
        }
        return PROTECTION_LEVEL_MAXIMUM;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
