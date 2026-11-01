package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum xap implements alah {
    UNKNOWN(0),
    USER_OPTED_IN(1),
    USER_OPTED_OUT(2),
    AUTO_ENROLLED(3);

    public final int e;

    xap(int i) {
        this.e = i;
    }

    public static defpackage.xap b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return USER_OPTED_IN;
        }
        if (i == 2) {
            return USER_OPTED_OUT;
        }
        if (i != 3) {
            return null;
        }
        return AUTO_ENROLLED;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
