package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alyh implements alah {
    ACTION_UNKNOWN(0),
    ACTION_REPORT_SPAM(1),
    ACTION_END_CALL(2),
    ACTION_PLAY_DTMF_TONE(3),
    ACTION_ASK_FOR_CONSENT_FOR_AI_REPLIES(4);

    public final int f;

    alyh(int i) {
        this.f = i;
    }

    public static defpackage.alyh b(int i) {
        if (i == 0) {
            return ACTION_UNKNOWN;
        }
        if (i == 1) {
            return ACTION_REPORT_SPAM;
        }
        if (i == 2) {
            return ACTION_END_CALL;
        }
        if (i == 3) {
            return ACTION_PLAY_DTMF_TONE;
        }
        if (i != 4) {
            return null;
        }
        return ACTION_ASK_FOR_CONSENT_FOR_AI_REPLIES;
    }

    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
