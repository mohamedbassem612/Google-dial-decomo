package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum ixg implements alah {
    UNSPECIFIED(0),
    BOT(1),
    CUSTOM(2),
    UNRECOGNIZED(-1);

    private final int f;

    ixg(int i) {
        this.f = i;
    }

    public static defpackage.ixg b(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return BOT;
        }
        if (i != 2) {
            return null;
        }
        return CUSTOM;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
