package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum akug implements alah {
    FONT_SIZE_UNSPECIFIED(0),
    SMALL(1),
    LARGE(2);

    private final int e;

    akug(int i) {
        this.e = i;
    }

    public static defpackage.akug b(int i) {
        if (i == 0) {
            return FONT_SIZE_UNSPECIFIED;
        }
        if (i == 1) {
            return SMALL;
        }
        if (i != 2) {
            return null;
        }
        return LARGE;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
