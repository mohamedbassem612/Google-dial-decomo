package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum akub implements alah {
    BUTTONS_LAYOUT_UNSPECIFIED(0),
    STACKED(1),
    SIDE_BY_SIDE(2);

    private final int e;

    akub(int i) {
        this.e = i;
    }

    public static defpackage.akub b(int i) {
        if (i == 0) {
            return BUTTONS_LAYOUT_UNSPECIFIED;
        }
        if (i == 1) {
            return STACKED;
        }
        if (i != 2) {
            return null;
        }
        return SIDE_BY_SIDE;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
