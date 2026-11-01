package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum mnd implements alah {
    UNSPECIFIED_DOBBY_FEATURE_CLIENT_KEY(0),
    BEESLY(1),
    WINKY(2),
    SIESTA(3),
    UNRECOGNIZED(-1);

    private final int g;

    mnd(int i) {
        this.g = i;
    }

    public static defpackage.mnd b(int i) {
        if (i == 0) {
            return UNSPECIFIED_DOBBY_FEATURE_CLIENT_KEY;
        }
        if (i == 1) {
            return BEESLY;
        }
        if (i == 2) {
            return WINKY;
        }
        if (i != 3) {
            return null;
        }
        return SIESTA;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
