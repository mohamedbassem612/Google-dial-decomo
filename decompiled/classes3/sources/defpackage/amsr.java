package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum amsr implements alah {
    FAILURE_REASON_UNSPECIFIED(0),
    NETWORK_ERROR(1),
    INTERNAL_ERROR(2),
    TIMEOUT(3),
    API_NOT_CONNECTED(4),
    ERROR(6),
    NODE_ID_IS_NULL(7),
    UNSUPPORTED_API_CALL(8),
    OTHER(5);

    public final int j;

    amsr(int i) {
        this.j = i;
    }

    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.j);
    }
}
