package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum akuo implements alah {
    UI_THEME_UNSPECIFIED(0),
    UI_THEME_GOOGLE_MATERIAL(1),
    UI_THEME_GOOGLE_MATERIAL_NEXT(2);

    private final int e;

    akuo(int i) {
        this.e = i;
    }

    public static defpackage.akuo b(int i) {
        if (i == 0) {
            return UI_THEME_UNSPECIFIED;
        }
        if (i == 1) {
            return UI_THEME_GOOGLE_MATERIAL;
        }
        if (i != 2) {
            return null;
        }
        return UI_THEME_GOOGLE_MATERIAL_NEXT;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
