package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum mzv implements alah {
    TYPE_UNSET(0),
    TYPE_FAVORITE(1),
    TYPE_LOCAL_CONTACT(2),
    TYPE_WORK(3),
    TYPE_BUSINESS(4),
    TYPE_SPAM(5),
    TYPE_UNKNOWN(6),
    TYPE_HIDDEN_NUMBER(7),
    UNRECOGNIZED(-1);

    private final int k;

    mzv(int i) {
        this.k = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.k;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.k);
    }
}
