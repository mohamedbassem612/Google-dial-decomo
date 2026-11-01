package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum tki implements alah {
    UNKNOWN(0),
    SCAM(1),
    NOT_SCAM(2),
    UNRECOGNIZED(-1);

    private final int f;

    tki(int i) {
        this.f = i;
    }

    public static defpackage.tki b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SCAM;
        }
        if (i != 2) {
            return null;
        }
        return NOT_SCAM;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
