package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum amot implements alah {
    NONE(0),
    GLOBAL_SPAM_LIST(1),
    LOCAL_SPAM_LIST(2),
    LOCAL_WHITELIST(3),
    SAME_PREFIX(4),
    GCORE_SPAM(5),
    GCORE_SPOOF(6),
    GCORE_STIR_SHAKEN_FAILED(7),
    DIALER_STIR_SHAKER_VERIFIED(8),
    PATRONUS_SPAM(9);

    public final int k;

    amot(int i) {
        this.k = i;
    }

    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.k);
    }
}
