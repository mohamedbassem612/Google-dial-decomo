package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum alhs implements alah {
    UNKNOWN(0),
    BACKEND_TIMEOUT(1),
    FAILED_TO_FETCH_SURVEY(2),
    NO_AVAILABLE_SURVEY(3),
    TRIGGER_ID_NOT_SET(4),
    UNSUPPORTED_CRONET_ENGINE(5),
    UNRECOGNIZED(-1);

    private final int i;

    alhs(int i) {
        this.i = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.i;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.i);
    }
}
