package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alsy implements alah {
    NO_ACTION(0),
    END_CALL(1),
    START_RINGING(2),
    END_SPAM_CALL(3),
    ANSWER_CALL(4),
    END_MISSED_CALL(5),
    START_TAKING_MESSAGE(6),
    ASK_FOR_CONSENT_FOR_AI_REPLIES(7),
    PLAY_DTMF_TONE(8);

    public static final defpackage.alsx k = new defpackage.alsx();
    public final int j;

    alsy(int i) {
        this.j = i;
    }

    public static defpackage.alsy b(int i) {
        switch (i) {
            case 0:
                return NO_ACTION;
            case 1:
                return END_CALL;
            case 2:
                return START_RINGING;
            case 3:
                return END_SPAM_CALL;
            case 4:
                return ANSWER_CALL;
            case 5:
                return END_MISSED_CALL;
            case 6:
                return START_TAKING_MESSAGE;
            case 7:
                return ASK_FOR_CONSENT_FOR_AI_REPLIES;
            case 8:
                return PLAY_DTMF_TONE;
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
