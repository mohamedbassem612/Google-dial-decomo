package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum amrc implements alah {
    OUTCOME_UNSPECIFIED(0),
    CALL_AUTO_REJECTED(1),
    CALLER_DISCONNECTED(2),
    REVELIO_VOICEMAIL_TIMED_OUT(3),
    CALL_ACCEPTED_BY_USER(4),
    CALL_REJECTED_BY_USER(5),
    MORE_INFO_REQUESTED_BY_USER(6),
    REJECT_WITH_SMS_REQUESTED_FROM_INCOMING_CALL_SCREEN(7);

    public final int i;

    amrc(int i) {
        this.i = i;
    }

    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.i);
    }
}
