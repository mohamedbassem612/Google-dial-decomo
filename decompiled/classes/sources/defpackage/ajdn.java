package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum ajdn implements defpackage.alah {
    UNKNOWN_API_FEATURE(0),
    CALL_INTENT_API_CALL_PHONE_NUMBER(1),
    CALL_INTENT_API_TARGETED_CALL(2),
    CALL_INTENT_API_SELF_CALL(5),
    INTENT_API_OPEN_SETTINGS(3),
    INTENT_API_OPEN_BLOCKED_CONTACTS(4),
    SERVICE_API_GET_REGISTRATION_INFO(6),
    SERVICE_API_GET_REGISTERED_ID_TYPE(7),
    DUO_KIT_REQUESTS(8),
    MEET_API_REQUESTS(9),
    UNRECOGNIZED(-1);

    private final int m;

    ajdn(int i) {
        this.m = i;
    }

    @Override // defpackage.alah
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.alau.a() : this.m;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.m);
    }
}
