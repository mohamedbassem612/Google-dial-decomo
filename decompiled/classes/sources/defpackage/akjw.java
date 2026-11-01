package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum akjw implements defpackage.alah {
    UITYPE_NONE(0),
    UITYPE_DO_NOT_DISPLAY(1),
    UITYPE_RATING_DEFAULT(2),
    UITYPE_RATING_SYSTEM_DIALOG(3),
    UITYPE_RATING_MATERIAL_DIALOG(4),
    UITYPE_RATING_PREFERRED_DIALOG(5),
    UITYPE_RATING_PREFERRED_BOTTOMSHEET(6),
    UITYPE_RATING_NATIVE_STORE_REVIEW_DIALOG(7),
    UITYPE_NON_BLOCKING_BOTTOMSHEET(8),
    UITYPE_DIALOG(12),
    UITYPE_TAP_TARGET(9),
    UITYPE_TOOLTIP(11),
    UITYPE_NOTIFICATION(10),
    UITYPE_PERMISSION(13),
    UITYPE_GM_DIALOG(14),
    UITYPE_GM_TAP_TARGET(15),
    UITYPE_GM_TOOLTIP(16),
    UITYPE_GNP_CUSTOM_UI(17),
    UITYPE_GNP_PLACEMENT(18);

    public final int t;

    akjw(int i) {
        this.t = i;
    }

    public static defpackage.akjw b(int i) {
        switch (i) {
            case 0:
                return UITYPE_NONE;
            case 1:
                return UITYPE_DO_NOT_DISPLAY;
            case 2:
                return UITYPE_RATING_DEFAULT;
            case 3:
                return UITYPE_RATING_SYSTEM_DIALOG;
            case 4:
                return UITYPE_RATING_MATERIAL_DIALOG;
            case 5:
                return UITYPE_RATING_PREFERRED_DIALOG;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return UITYPE_RATING_PREFERRED_BOTTOMSHEET;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return UITYPE_RATING_NATIVE_STORE_REVIEW_DIALOG;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return UITYPE_NON_BLOCKING_BOTTOMSHEET;
            case 9:
                return UITYPE_TAP_TARGET;
            case 10:
                return UITYPE_NOTIFICATION;
            case 11:
                return UITYPE_TOOLTIP;
            case 12:
                return UITYPE_DIALOG;
            case 13:
                return UITYPE_PERMISSION;
            case 14:
                return UITYPE_GM_DIALOG;
            case 15:
                return UITYPE_GM_TAP_TARGET;
            case 16:
                return UITYPE_GM_TOOLTIP;
            case 17:
                return UITYPE_GNP_CUSTOM_UI;
            case 18:
                return UITYPE_GNP_PLACEMENT;
            default:
                return null;
        }
    }

    @Override // defpackage.alah
    public final int a() {
        return this.t;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.t);
    }
}
