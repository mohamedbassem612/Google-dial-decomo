package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum nmn implements alah {
    CALL_SCREEN_INTENT_LABEL_UNKNOWN(0),
    CALL_SCREEN_INTENT_LABEL_FAMILY_CARE(1),
    CALL_SCREEN_INTENT_LABEL_MEDICAL_ALERT(2),
    CALL_SCREEN_INTENT_LABEL_DELIVERY_LOGISTICS(3),
    CALL_SCREEN_INTENT_LABEL_BUSINESS_WORK(4),
    CALL_SCREEN_INTENT_LABEL_PERSONAL_FRIEND(5),
    CALL_SCREEN_INTENT_LABEL_PUBLIC_INFO(6),
    CALL_SCREEN_INTENT_LABEL_SOLICITATION_SALES(7),
    CALL_SCREEN_INTENT_LABEL_LIKELY_SPAM(8),
    UNRECOGNIZED(-1);

    private final int l;

    nmn(int i) {
        this.l = i;
    }

    public static defpackage.nmn b(int i) {
        switch (i) {
            case 0:
                return CALL_SCREEN_INTENT_LABEL_UNKNOWN;
            case 1:
                return CALL_SCREEN_INTENT_LABEL_FAMILY_CARE;
            case 2:
                return CALL_SCREEN_INTENT_LABEL_MEDICAL_ALERT;
            case 3:
                return CALL_SCREEN_INTENT_LABEL_DELIVERY_LOGISTICS;
            case 4:
                return CALL_SCREEN_INTENT_LABEL_BUSINESS_WORK;
            case 5:
                return CALL_SCREEN_INTENT_LABEL_PERSONAL_FRIEND;
            case 6:
                return CALL_SCREEN_INTENT_LABEL_PUBLIC_INFO;
            case 7:
                return CALL_SCREEN_INTENT_LABEL_SOLICITATION_SALES;
            case 8:
                return CALL_SCREEN_INTENT_LABEL_LIKELY_SPAM;
            default:
                return null;
        }
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.l;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.l);
    }
}
