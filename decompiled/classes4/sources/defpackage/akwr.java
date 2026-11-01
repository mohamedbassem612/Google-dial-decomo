package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum akwr implements alah {
    SENSITIVE_CLASSIFICATION_REASON_CODE_UNSPECIFIED(0),
    SENSITIVE_CLASSIFICATION_REASON_CODE_CASTE(1),
    SENSITIVE_CLASSIFICATION_REASON_CODE_RELIGION(2),
    SENSITIVE_CLASSIFICATION_REASON_CODE_POLITICS(3),
    SENSITIVE_CLASSIFICATION_REASON_CODE_HEALTHCARE(4),
    SENSITIVE_CLASSIFICATION_REASON_CODE_DRUGS(5),
    SENSITIVE_CLASSIFICATION_REASON_CODE_ALCOHOL(6),
    SENSITIVE_CLASSIFICATION_REASON_CODE_CITIZENSHIP_AND_IMMIGRATION(7),
    SENSITIVE_CLASSIFICATION_REASON_CODE_NATIONAL_ORIGIN(8),
    SENSITIVE_CLASSIFICATION_REASON_CODE_GENETIC(9),
    SENSITIVE_CLASSIFICATION_REASON_CODE_GAMBLING(10),
    SENSITIVE_CLASSIFICATION_REASON_CODE_SEXUALITY_AND_GENDER(11),
    SENSITIVE_CLASSIFICATION_REASON_CODE_CRIME_AND_JUSTICE(12),
    SENSITIVE_CLASSIFICATION_REASON_CODE_TRADE_UNION_MEMBERSHIP(13),
    SENSITIVE_CLASSIFICATION_REASON_CODE_BIOMETRIC(14),
    SENSITIVE_CLASSIFICATION_REASON_CODE_FINANCIAL_VULNERABILITY(15),
    SENSITIVE_CLASSIFICATION_REASON_CODE_VULNERABLE_GROUP(16);

    public final int r;

    akwr(int i) {
        this.r = i;
    }

    public static defpackage.akwr b(int i) {
        switch (i) {
            case 0:
                return SENSITIVE_CLASSIFICATION_REASON_CODE_UNSPECIFIED;
            case 1:
                return SENSITIVE_CLASSIFICATION_REASON_CODE_CASTE;
            case 2:
                return SENSITIVE_CLASSIFICATION_REASON_CODE_RELIGION;
            case 3:
                return SENSITIVE_CLASSIFICATION_REASON_CODE_POLITICS;
            case 4:
                return SENSITIVE_CLASSIFICATION_REASON_CODE_HEALTHCARE;
            case 5:
                return SENSITIVE_CLASSIFICATION_REASON_CODE_DRUGS;
            case 6:
                return SENSITIVE_CLASSIFICATION_REASON_CODE_ALCOHOL;
            case 7:
                return SENSITIVE_CLASSIFICATION_REASON_CODE_CITIZENSHIP_AND_IMMIGRATION;
            case 8:
                return SENSITIVE_CLASSIFICATION_REASON_CODE_NATIONAL_ORIGIN;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return SENSITIVE_CLASSIFICATION_REASON_CODE_GENETIC;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return SENSITIVE_CLASSIFICATION_REASON_CODE_GAMBLING;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return SENSITIVE_CLASSIFICATION_REASON_CODE_SEXUALITY_AND_GENDER;
            case 12:
                return SENSITIVE_CLASSIFICATION_REASON_CODE_CRIME_AND_JUSTICE;
            case 13:
                return SENSITIVE_CLASSIFICATION_REASON_CODE_TRADE_UNION_MEMBERSHIP;
            case 14:
                return SENSITIVE_CLASSIFICATION_REASON_CODE_BIOMETRIC;
            case 15:
                return SENSITIVE_CLASSIFICATION_REASON_CODE_FINANCIAL_VULNERABILITY;
            case 16:
                return SENSITIVE_CLASSIFICATION_REASON_CODE_VULNERABLE_GROUP;
            default:
                return null;
        }
    }

    public final int a() {
        return this.r;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.r);
    }
}
