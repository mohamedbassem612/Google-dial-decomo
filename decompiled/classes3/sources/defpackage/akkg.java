package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum akkg implements alah {
    UNKNOWN(0),
    ABOVE(1),
    BELOW(2);

    public final int d;

    akkg(int i) {
        this.d = i;
    }

    public static defpackage.akkg b(int i) {
        if (i == 0) {
            return UNKNOWN;
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
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
