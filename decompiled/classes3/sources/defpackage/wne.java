package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum wne implements alah {
    UNKNOWN(0),
    LIVE(1),
    SHOW_AHEAD(2);

    public final int d;

    wne(int i) {
        this.d = i;
    }

    public static defpackage.wne b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return LIVE;
        }
        if (i != 2) {
            return null;
        }
        return SHOW_AHEAD;
    }

    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
