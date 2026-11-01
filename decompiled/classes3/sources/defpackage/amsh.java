package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum amsh implements alah {
    UNKNOWN_CLIENT_TYPE(0),
    TMO_REST(1),
    TMO_CVVM_OMTP(2),
    OMTP_1_1(3),
    OMTP_1_2(4),
    OMTP_1_3(5),
    ADVVM(6),
    VVM3(7),
    VVM3_MVNO(8),
    TEST_CLIENT_TYPE(100);

    public final int k;

    amsh(int i) {
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
