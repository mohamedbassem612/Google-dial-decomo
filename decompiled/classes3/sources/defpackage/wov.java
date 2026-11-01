package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum wov implements alah {
    AUTOMATIC_DISPLAY_SNACKBAR_NONE(0),
    AUTOMATIC_DISPLAY_OPT_OUT_SNACKBAR(1),
    AUTOMATIC_DISPLAY_OPT_OUT_CONFIRMATION_SNACKBAR(2),
    UNRECOGNIZED(-1);

    private final int f;

    wov(int i) {
        this.f = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
