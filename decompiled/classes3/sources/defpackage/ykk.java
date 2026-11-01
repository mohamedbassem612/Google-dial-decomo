package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum ykk implements alah {
    RULE_STATUS_UNSPECIFIED(0),
    RULE_STATUS_MATCHED(1),
    RULE_STATUS_UNMATCHED(2),
    RULE_STATUS_FAILED(3),
    RULE_STATUS_NOT_RUN(4);

    public final int f;

    ykk(int i) {
        this.f = i;
    }

    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
