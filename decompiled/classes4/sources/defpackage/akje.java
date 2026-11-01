package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum akje implements alah {
    UNKNOWN_LAYOUT(0),
    VERTICAL(1),
    HORIZONTAL(2);

    public final int d;

    akje(int i) {
        this.d = i;
    }

    public static defpackage.akje b(int i) {
        if (i == 0) {
            return UNKNOWN_LAYOUT;
        }
        if (i == 1) {
            return VERTICAL;
        }
        if (i != 2) {
            return null;
        }
        return HORIZONTAL;
    }

    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
