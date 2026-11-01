package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum wpw implements alah {
    SHOW_AHEAD_UNKNOWN(0),
    SHOW_AHEAD_AUTO_ENROLLED(1),
    SHOW_AHEAD_USER_OPTED_IN(2),
    SHOW_AHEAD_USER_OPTED_OUT(3);

    public final int e;

    wpw(int i) {
        this.e = i;
    }

    public static defpackage.wpw b(int i) {
        if (i == 0) {
            return SHOW_AHEAD_UNKNOWN;
        }
        if (i == 1) {
            return SHOW_AHEAD_AUTO_ENROLLED;
        }
        if (i == 2) {
            return SHOW_AHEAD_USER_OPTED_IN;
        }
        if (i != 3) {
            return null;
        }
        return SHOW_AHEAD_USER_OPTED_OUT;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
