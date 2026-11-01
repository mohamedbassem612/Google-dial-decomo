package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum akuw implements alah {
    PLACEMENT_UNSPECIFIED(0),
    ABOVE(1),
    BELOW(2);

    private final int e;

    akuw(int i) {
        this.e = i;
    }

    public static defpackage.akuw b(int i) {
        if (i == 0) {
            return PLACEMENT_UNSPECIFIED;
        }
        if (i == 1) {
            return ABOVE;
        }
        if (i != 2) {
            return null;
        }
        return BELOW;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
