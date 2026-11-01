package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum njf implements alah {
    UNKNOWN_ACTION(0),
    END_CALL(1),
    REPORT_SPAM(2),
    PLAY_DTMF_TONE(3),
    ASK_FOR_CONSENT_FOR_AI_REPLIES(4),
    UNRECOGNIZED(-1);

    private final int h;

    njf(int i) {
        this.h = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
