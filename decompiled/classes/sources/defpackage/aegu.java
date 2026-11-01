package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum aegu implements defpackage.alah {
    NONE(0),
    CHIME(1),
    GNP(2),
    UNRECOGNIZED(-1);

    private final int f;

    aegu(int i) {
        this.f = i;
    }

    public static defpackage.aegu b(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return CHIME;
        }
        if (i != 2) {
            return null;
        }
        return GNP;
    }

    @Override // defpackage.alah
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.alau.a() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
