package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alrp implements alah {
    INTENT_LABEL_UNKNOWN(0),
    INTENT_LABEL_FAMILY_CARE(1),
    INTENT_LABEL_MEDICAL_ALERT(2),
    INTENT_LABEL_DELIVERY_LOGISTICS(3),
    INTENT_LABEL_BUSINESS_WORK(4),
    INTENT_LABEL_PERSONAL_FRIEND(5),
    INTENT_LABEL_PUBLIC_INFO(6),
    INTENT_LABEL_SOLICITATION_SALES(7),
    INTENT_LABEL_LIKELY_SPAM(8);

    public final int j;

    alrp(int i) {
        this.j = i;
    }

    public static defpackage.alrp b(int i) {
        switch (i) {
            case 0:
                return INTENT_LABEL_UNKNOWN;
            case 1:
                return INTENT_LABEL_FAMILY_CARE;
            case 2:
                return INTENT_LABEL_MEDICAL_ALERT;
            case 3:
                return INTENT_LABEL_DELIVERY_LOGISTICS;
            case 4:
                return INTENT_LABEL_BUSINESS_WORK;
            case 5:
                return INTENT_LABEL_PERSONAL_FRIEND;
            case 6:
                return INTENT_LABEL_PUBLIC_INFO;
            case 7:
                return INTENT_LABEL_SOLICITATION_SALES;
            case 8:
                return INTENT_LABEL_LIKELY_SPAM;
            default:
                return null;
        }
    }

    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.j);
    }
}
