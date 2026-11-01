package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum vcs implements defpackage.alah {
    UNKNOWN(0),
    TMO_REST(1),
    TMO_CVVM(2),
    OMTP_1_1(3),
    OMTP_1_2(4),
    OMTP_1_3(5),
    ADVVM(6),
    VVM3(7),
    VVM3_MVNO(8),
    TEST(100),
    UNRECOGNIZED(-1);

    private final int m;

    vcs(int i) {
        this.m = i;
    }

    @Override // defpackage.alah
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.alau.a() : this.m;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.m);
    }
}
