package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alsp implements alah {
    UNKNOWN(0),
    USER_NOT_REACHED(1),
    USER_DECLINED(2),
    USER_ANSWERED(3);

    public final int e;

    alsp(int i) {
        this.e = i;
    }

    public static defpackage.alsp b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return USER_NOT_REACHED;
        }
        if (i == 2) {
            return USER_DECLINED;
        }
        if (i != 3) {
            return null;
        }
        return USER_ANSWERED;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
