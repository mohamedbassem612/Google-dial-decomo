package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alyd implements alah {
    NO_TRIGGER(0),
    TIMEOUT_TRIGGER(1),
    POSSIBLY_INCOMPLETE_TRIGGER(2),
    USER_END_CALL_TRIGGER(3),
    USER_JOIN_CALL_TRIGGER(4),
    USER_NOT_REACHED_TRIGGER(5),
    USER_DECLINED_TRIGGER(6),
    SCOOBY_SPAM_TRIGGER(8),
    EXCEEDS_COUNT_REPEAT_TRIGGER(9),
    UNKNOWN_PREDICTION_INTENT_TRIGGER(10),
    SILENT_CALL_TRIGGER(11),
    ASR_LOW_CONFIDENCE_TRIGGER(12),
    ASR_LOW_CONFIDENCE_BAILOUT_TRIGGER(13),
    PREDICTION_LOW_CONFIDENCE_TRIGGER(14),
    USER_NOT_REACHED_TAKING_MESSAGE_TRIGGER(15),
    CALLER_FINISHED_LEAVING_MESSAGE_TRIGGER(16),
    TIMEOUT_DURING_LEAVING_MESSAGE_TRIGGER(17),
    MESSAGE_TOO_LONG_TRIGGER(18),
    TIMEOUT_BAILOUT(19),
    SCOOBY_NOT_SPAM_VERDICT_SOURCE_IS_USER(20),
    PRE_CONV_EXTRACTION_DURING_CONVERSATION(21),
    BOT_SILENCE_DEADLINE_REACHED(23);

    public final int w;

    alyd(int i) {
        this.w = i;
    }

    public static defpackage.alyd b(int i) {
        switch (i) {
            case 0:
                return NO_TRIGGER;
            case 1:
                return TIMEOUT_TRIGGER;
            case 2:
                return POSSIBLY_INCOMPLETE_TRIGGER;
            case 3:
                return USER_END_CALL_TRIGGER;
            case 4:
                return USER_JOIN_CALL_TRIGGER;
            case 5:
                return USER_NOT_REACHED_TRIGGER;
            case 6:
                return USER_DECLINED_TRIGGER;
            case 7:
            case 22:
            default:
                return null;
            case 8:
                return SCOOBY_SPAM_TRIGGER;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return EXCEEDS_COUNT_REPEAT_TRIGGER;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return UNKNOWN_PREDICTION_INTENT_TRIGGER;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return SILENT_CALL_TRIGGER;
            case 12:
                return ASR_LOW_CONFIDENCE_TRIGGER;
            case 13:
                return ASR_LOW_CONFIDENCE_BAILOUT_TRIGGER;
            case 14:
                return PREDICTION_LOW_CONFIDENCE_TRIGGER;
            case 15:
                return USER_NOT_REACHED_TAKING_MESSAGE_TRIGGER;
            case 16:
                return CALLER_FINISHED_LEAVING_MESSAGE_TRIGGER;
            case 17:
                return TIMEOUT_DURING_LEAVING_MESSAGE_TRIGGER;
            case 18:
                return MESSAGE_TOO_LONG_TRIGGER;
            case 19:
                return TIMEOUT_BAILOUT;
            case 20:
                return SCOOBY_NOT_SPAM_VERDICT_SOURCE_IS_USER;
            case 21:
                return PRE_CONV_EXTRACTION_DURING_CONVERSATION;
            case 23:
                return BOT_SILENCE_DEADLINE_REACHED;
        }
    }

    public final int a() {
        return this.w;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.w);
    }
}
