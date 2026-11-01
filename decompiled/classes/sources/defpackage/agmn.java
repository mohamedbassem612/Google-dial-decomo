package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum agmn implements defpackage.alah {
    OWNER_USER_TYPE_UNKNOWN(0),
    GOOGLE_USER(1),
    GPLUS_USER(2),
    GPLUS_DISABLED_BY_ADMIN(3),
    GOOGLE_APPS_USER(4),
    GOOGLE_APPS_SELF_MANAGED_USER(5),
    GOOGLE_FAMILY_USER(6),
    GOOGLE_FAMILY_CHILD_USER(7),
    GOOGLE_APPS_ADMIN_DISABLED(9),
    GOOGLE_ONE_USER(10),
    GOOGLE_FAMILY_CONVERTED_CHILD_USER(11);

    private final int m;

    agmn(int i) {
        this.m = i;
    }

    public static defpackage.agmn b(int i) {
        switch (i) {
            case 0:
                return OWNER_USER_TYPE_UNKNOWN;
            case 1:
                return GOOGLE_USER;
            case 2:
                return GPLUS_USER;
            case 3:
                return GPLUS_DISABLED_BY_ADMIN;
            case 4:
                return GOOGLE_APPS_USER;
            case 5:
                return GOOGLE_APPS_SELF_MANAGED_USER;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return GOOGLE_FAMILY_USER;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return GOOGLE_FAMILY_CHILD_USER;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
            default:
                return null;
            case 9:
                return GOOGLE_APPS_ADMIN_DISABLED;
            case 10:
                return GOOGLE_ONE_USER;
            case 11:
                return GOOGLE_FAMILY_CONVERTED_CHILD_USER;
        }
    }

    @Override // defpackage.alah
    public final int a() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.m);
    }
}
