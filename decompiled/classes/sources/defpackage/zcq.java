package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum zcq implements defpackage.alah {
    SERVER_ENV_UNSPECIFIED(0),
    SERVER_ENV_AUTOPUSH(1),
    SERVER_ENV_CANARY(2),
    SERVER_ENV_CONTROL(3),
    SERVER_ENV_DEV(5),
    SERVER_ENV_PREPROD(6),
    SERVER_ENV_PROD(7),
    SERVER_ENV_STAGING(8),
    UNRECOGNIZED(-1);

    private final int k;

    zcq(int i) {
        this.k = i;
    }

    @Override // defpackage.alah
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.alau.a() : this.k;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.k);
    }
}
