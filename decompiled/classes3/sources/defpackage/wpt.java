package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum wpt implements alah {
    AUTOMATIC_DISPLAY_UNSPECIFIED(0),
    AUTOMATIC_DISPLAY_USER_OPTED_IN(1),
    AUTOMATIC_DISPLAY_USER_OPTED_OUT(2);

    public final int d;

    wpt(int i) {
        this.d = i;
    }

    public static defpackage.wpt b(int i) {
        if (i == 0) {
            return AUTOMATIC_DISPLAY_UNSPECIFIED;
        }
        if (i == 1) {
            return AUTOMATIC_DISPLAY_USER_OPTED_IN;
        }
        if (i != 2) {
            return null;
        }
        return AUTOMATIC_DISPLAY_USER_OPTED_OUT;
    }

    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
