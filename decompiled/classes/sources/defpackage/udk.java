package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum udk implements defpackage.alah {
    STIR_SHAKEN_UNKNOWN(0),
    STIR_SHAKEN_VERIFIED(1),
    STIR_SHAKEN_FAILED(2);

    public final int d;

    udk(int i) {
        this.d = i;
    }

    public static defpackage.udk b(int i) {
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

    @Override // defpackage.alah
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
