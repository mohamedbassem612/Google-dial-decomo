package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum rea implements alah {
    CONTROLLER_UNKNOWN(0),
    CONTROLLER_ATLAS(1),
    CONTROLLER_XATU(2),
    UNRECOGNIZED(-1);

    private final int f;

    rea(int i) {
        this.f = i;
    }

    public static defpackage.rea b(int i) {
        if (i == 0) {
            return CONTROLLER_UNKNOWN;
        }
        if (i == 1) {
            return CONTROLLER_ATLAS;
        }
        if (i != 2) {
            return null;
        }
        return CONTROLLER_XATU;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
