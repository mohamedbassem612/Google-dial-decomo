package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum iga implements alah {
    RESULT_UNKNOWN(0),
    RESULT_SUCCESS(1),
    RESULT_FAILURE_BAD_CONFIG_PROVIDED(2),
    RESULT_FAILURE_NO_LISTENER_PROVIDED(3),
    RESULT_FAILURE_AUDIO_FRAMEWORK_ERROR(4),
    RESULT_FAILURE_REQUESTED_UPLINK_WHEN_DUOLINKS_UNAVAILABLE(5),
    UNRECOGNIZED(-1);

    private final int i;

    iga(int i) {
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
