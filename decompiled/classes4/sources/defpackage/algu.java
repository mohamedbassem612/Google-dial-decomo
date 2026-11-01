package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum algu implements alah {
    UNKNOWN(0),
    CLIENT_ACTIVITY_WAS_DESTROYED(1),
    CLIENT_ACTIVITY_WAS_FINISHING(2),
    CLIENT_ACTIVITY_WAS_NULL(3),
    INVALID_AUTH_PARAMS(10),
    INVALID_COMPLETION_STYLE(8),
    INVALID_PROMPT_STYLE(9),
    INVALID_SURVEY_DATA_TYPE(4),
    INVALID_SURVEY_PAYLOAD(5),
    SURVEY_ALREADY_RUNNING(6),
    SURVEY_EXPIRED(7),
    PARENT_VIEW_NOT_FOUND(14),
    SURVEY_NOT_IN_KEY_WINDOW(11),
    VIEW_CONTROLLER_NOT_FULL_SIZE(12),
    UNSUPPORTED_EMBEDDED_SURVEY_CONTAINER(13),
    UNRECOGNIZED(-1);

    private final int r;

    algu(int i) {
        this.r = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.r;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.r);
    }
}
