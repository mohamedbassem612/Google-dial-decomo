package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum zke implements alah {
    SENT_STATUS_UNDEFINED(0),
    SUCCESS(1),
    NODE_OFFLINE(2),
    EXCEEDED_MAX_RETRIES(3),
    ERROR(4),
    SYNTHETIC_ID_NOT_AVAILABLE(5),
    CLIENT_API_UNAVAILABLE(6),
    UNRECOGNIZED(-1);

    private final int j;

    zke(int i2) {
        this.j = i2;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.j;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.j);
    }
}
