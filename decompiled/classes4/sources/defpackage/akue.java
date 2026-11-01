package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum akue implements alah {
    ALIGNMENT_UNSPECIFIED(0),
    TRAILING(1),
    CENTER(2);

    private final int e;

    akue(int i) {
        this.e = i;
    }

    public static defpackage.akue b(int i) {
        if (i == 0) {
            return ALIGNMENT_UNSPECIFIED;
        }
        if (i == 1) {
            return TRAILING;
        }
        if (i != 2) {
            return null;
        }
        return CENTER;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
