package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum akkc implements alah {
    UNSPECIFIED(0),
    LIGHT(1),
    DARK(2);

    public final int d;

    akkc(int i) {
        this.d = i;
    }

    public static defpackage.akkc b(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return LIGHT;
        }
        if (i != 2) {
            return null;
        }
        return DARK;
    }

    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
