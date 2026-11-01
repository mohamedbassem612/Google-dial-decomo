package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum akrr implements defpackage.alah {
    IMPORTANCE_UNSPECIFIED(0),
    IMPORTANCE_NONE(1),
    IMPORTANCE_DEFAULT(2),
    IMPORTANCE_HIGH(3),
    IMPORTANCE_LOW(4),
    IMPORTANCE_MAX(5),
    IMPORTANCE_MIN(6);

    public final int h;

    akrr(int i2) {
        this.h = i2;
    }

    public static defpackage.akrr b(int i2) {
        switch (i2) {
            case 0:
                return IMPORTANCE_UNSPECIFIED;
            case 1:
                return IMPORTANCE_NONE;
            case 2:
                return IMPORTANCE_DEFAULT;
            case 3:
                return IMPORTANCE_HIGH;
            case 4:
                return IMPORTANCE_LOW;
            case 5:
                return IMPORTANCE_MAX;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return IMPORTANCE_MIN;
            default:
                return null;
        }
    }

    @Override // defpackage.alah
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
