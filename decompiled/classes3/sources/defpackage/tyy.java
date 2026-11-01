package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum tyy implements alah {
    AICORE_MODEL_UNKNOWN(0),
    AICORE_MODEL_DOWNLOADABLE(1),
    AICORE_MODEL_DOWNLOADING(2),
    AICORE_MODEL_DOWNLOADED(3),
    UNRECOGNIZED(-1);

    private final int g;

    tyy(int i) {
        this.g = i;
    }

    public static defpackage.tyy b(int i) {
        if (i == 0) {
            return AICORE_MODEL_UNKNOWN;
        }
        if (i == 1) {
            return AICORE_MODEL_DOWNLOADABLE;
        }
        if (i == 2) {
            return AICORE_MODEL_DOWNLOADING;
        }
        if (i != 3) {
            return null;
        }
        return AICORE_MODEL_DOWNLOADED;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
