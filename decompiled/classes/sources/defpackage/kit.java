package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum kit implements defpackage.alah {
    UNKNOWN(0),
    TODAY(1),
    YESTERDAY(2),
    OLDER(3);

    public final int e;

    kit(int i) {
        this.e = i;
    }

    public static defpackage.kit b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return TODAY;
        }
        if (i == 2) {
            return YESTERDAY;
        }
        if (i != 3) {
            return null;
        }
        return OLDER;
    }

    @Override // defpackage.alah
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
