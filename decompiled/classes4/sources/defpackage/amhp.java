package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum amhp implements alah {
    CLIENT_CAPABILITY_UNKNOWN(0),
    CLIENT_CAPABILITY_PII(1),
    CLIENT_CAPABILITY_RATING_SCALE_10_11(2),
    UNRECOGNIZED(-1);

    private final int f;

    amhp(int i) {
        this.f = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
