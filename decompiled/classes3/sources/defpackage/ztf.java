package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum ztf implements alah {
    STIR_SHAKEN_UNKNOWN(0),
    STIR_SHAKEN_VERIFIED(1),
    STIR_SHAKEN_FAILED(2),
    UNRECOGNIZED(-1);

    private final int f;

    ztf(int i) {
        this.f = i;
    }

    public static defpackage.ztf b(int i) {
        if (i == 0) {
            return STIR_SHAKEN_UNKNOWN;
        }
        if (i == 1) {
            return STIR_SHAKEN_VERIFIED;
        }
        if (i != 2) {
            return null;
        }
        return STIR_SHAKEN_FAILED;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
