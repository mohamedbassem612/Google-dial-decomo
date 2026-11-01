package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum aixn implements alah {
    UNKNOWN_EVENT_TYPE(0),
    INCOMING_ANSWERED_TYPE(1),
    MISSED_CALL_TYPE(2),
    VOICEMAIL_TYPE(3),
    BLOCKED_CALL_TYPE(4),
    OUTGOING_CALL_TYPE(5),
    REJECTED_CALL_TYPE(6),
    ANSWERED_EXTERNALLY_TYPE(7),
    INCOMING_MESSAGE(8),
    OUTGOING_MESSAGE(9),
    BLOCKED_MESSAGE(10);

    public final int l;

    aixn(int i) {
        this.l = i;
    }

    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.l);
    }
}
