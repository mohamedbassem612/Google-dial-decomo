package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum aaqo implements alah {
    UNKNOWN(0),
    NULL_ACCOUNT(1),
    GOOGLE(2),
    DEVICE(3),
    SIM(4),
    EXCHANGE(5),
    THIRD_PARTY_EDITABLE(6),
    THIRD_PARTY_READONLY(7),
    SIM_SDN(8),
    PRELOAD_SDN(9);

    public final int k;

    aaqo(int i) {
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
