package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum ajea implements alah {
    UNKNOWN_SUSPICIOUS_STATUS(0),
    SUSPICIOUS(1),
    NOT_SUSPICIOUS(2),
    UNRECOGNIZED(-1);

    private final int f;

    ajea(int i) {
        this.f = i;
    }

    public static defpackage.ajea b(int i) {
        if (i == 0) {
            return UNKNOWN_SUSPICIOUS_STATUS;
        }
        if (i == 1) {
            return SUSPICIOUS;
        }
        if (i != 2) {
            return null;
        }
        return NOT_SUSPICIOUS;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
