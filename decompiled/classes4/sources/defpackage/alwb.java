package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alwb implements alah {
    NO_TRIGGER(0),
    TIMEOUT_TRIGGER(1),
    USER_END_CALL_TRIGGER(2),
    USER_JOIN_CALL_TRIGGER(3),
    USER_DECLINED_TRIGGER(4),
    SCOOBY_SPAM_TRIGGER(5),
    SCOOBY_NOT_SPAM_VERDICT_SOURCE_IS_USER(6),
    MAX_SILENCE_TIMEOUT_TRIGGER(7),
    SCOOBY_SPAM_VERDICT_TRIGGER(8),
    ASR_LOW_CONFIDENCE_BAILOUT_TRIGGER(9),
    LLM_TIMEOUT_BAILOUT_TRIGGER(10),
    LLM_FEATURE_MISSING_BAILOUT_TRIGGER(11),
    MAX_MANUAL_SCREEN_TURNS_TRIGGER(12);

    private final int o;

    alwb(int i) {
        this.o = i;
    }

    public static defpackage.alwb b(int i) {
        switch (i) {
            case 0:
                return NO_TRIGGER;
            case 1:
                return TIMEOUT_TRIGGER;
            case 2:
                return USER_END_CALL_TRIGGER;
            case 3:
                return USER_JOIN_CALL_TRIGGER;
            case 4:
                return USER_DECLINED_TRIGGER;
            case 5:
                return SCOOBY_SPAM_TRIGGER;
            case 6:
                return SCOOBY_NOT_SPAM_VERDICT_SOURCE_IS_USER;
            case 7:
                return MAX_SILENCE_TIMEOUT_TRIGGER;
            case 8:
                return SCOOBY_SPAM_VERDICT_TRIGGER;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return ASR_LOW_CONFIDENCE_BAILOUT_TRIGGER;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return LLM_TIMEOUT_BAILOUT_TRIGGER;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return LLM_FEATURE_MISSING_BAILOUT_TRIGGER;
            case 12:
                return MAX_MANUAL_SCREEN_TURNS_TRIGGER;
            default:
                return null;
        }
    }

    public final int a() {
        return this.o;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.o);
    }
}
