package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum akjd implements alah {
    UNKNOWN_ALIGNMENT(0),
    RIGHT(1),
    CENTER(2);

    public final int d;

    akjd(int i) {
        this.d = i;
    }

    public static defpackage.akjd b(int i) {
        if (i == 0) {
            return UNKNOWN_ALIGNMENT;
        }
        if (i == 1) {
            return RIGHT;
        }
        if (i != 2) {
            return null;
        }
        return CENTER;
    }

    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
