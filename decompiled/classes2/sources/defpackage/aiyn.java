package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum aiyn implements alah {
    STIR_SHAKEN_VERSTAT_UNSPECIFIED(0),
    STIR_SHAKEN_VERSTAT_VERIFIED(1),
    STIR_SHAKEN_VERSTAT_FAILED(2),
    STIR_SHAKEN_VERSTAT_UNKNOWN(3);

    public final int e;

    aiyn(int i) {
        this.e = i;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
