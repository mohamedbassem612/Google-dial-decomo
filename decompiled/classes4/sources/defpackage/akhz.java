package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum akhz implements alah {
    THEME_UNKNOWN(0),
    THEME_LIGHT(1),
    THEME_DARK(2);

    public final int d;

    akhz(int i) {
        this.d = i;
    }

    public static defpackage.akhz b(int i) {
        if (i == 0) {
            return THEME_UNKNOWN;
        }
        if (i == 1) {
            return THEME_LIGHT;
        }
        if (i != 2) {
            return null;
        }
        return THEME_DARK;
    }

    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
