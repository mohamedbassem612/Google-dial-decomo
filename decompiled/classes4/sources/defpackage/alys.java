package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alys implements alah {
    NO_TRIGGER(0),
    TIMEOUT_TRIGGER(1),
    POSSIBLY_INCOMPLETE_TRIGGER(2),
    SCOOBY_SPAM_TRIGGER(3),
    EXCEEDS_COUNT_REPEAT_TRIGGER(4),
    UNKNOWN_PREDICTION_INTENT_TRIGGER(5),
    SILENT_CALL_TRIGGER(6),
    ASR_LOW_CONFIDENCE_TRIGGER(7),
    ASR_LOW_CONFIDENCE_BAILOUT_TRIGGER(8),
    PREDICTION_LOW_CONFIDENCE_TRIGGER(9),
    TIMEOUT_BAILOUT(10),
    PRE_CONV_EXTRACTION_DURING_CONVERSATION(11),
    BOT_SILENCE_DEADLINE_REACHED(12),
    EXCEEDS_COUNT_MEANINGFUL_STATEMENTS_TRIGGER(13),
    TRUSTED_CALLER_TRIGGER(14);

    public final int p;

    alys(int i) {
        this.p = i;
    }

    public static defpackage.alys b(int i) {
        switch (i) {
            case 0:
                return NO_TRIGGER;
            case 1:
                return TIMEOUT_TRIGGER;
            case 2:
                return POSSIBLY_INCOMPLETE_TRIGGER;
            case 3:
                return SCOOBY_SPAM_TRIGGER;
            case 4:
                return EXCEEDS_COUNT_REPEAT_TRIGGER;
            case 5:
                return UNKNOWN_PREDICTION_INTENT_TRIGGER;
            case 6:
                return SILENT_CALL_TRIGGER;
            case 7:
                return ASR_LOW_CONFIDENCE_TRIGGER;
            case 8:
                return ASR_LOW_CONFIDENCE_BAILOUT_TRIGGER;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return PREDICTION_LOW_CONFIDENCE_TRIGGER;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return TIMEOUT_BAILOUT;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return PRE_CONV_EXTRACTION_DURING_CONVERSATION;
            case 12:
                return BOT_SILENCE_DEADLINE_REACHED;
            case 13:
                return EXCEEDS_COUNT_MEANINGFUL_STATEMENTS_TRIGGER;
            case 14:
                return TRUSTED_CALLER_TRIGGER;
            default:
                return null;
        }
    }

    public final int a() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.p);
    }
}
