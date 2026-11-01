package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum amrk implements alah {
    SODA_ERROR_UNKNOWN(0),
    SODA_ERROR_LANGUAGE_UNAVAILABLE(1),
    SODA_ERROR_INTERRUPTED(2),
    SODA_ERROR_AUDIO(3),
    SODA_ERROR_CLIENT(4),
    SODA_ERROR_INSUFFICIENT_PERMISSIONS(5),
    SODA_ERROR_SERVER(6),
    SODA_ERROR_NETWORK(7),
    SODA_ERROR_NETWORK_TIMEOUT(8),
    SODA_ERROR_NO_MATCH(9),
    SODA_ERROR_RECOGNIZER_BUSY(10),
    SODA_ERROR_SPEECH_TIMEOUT(11),
    SODA_ERROR_INVALID_REQUEST(18),
    SODA_ERROR_NO_SPEECH_DETECTED(19),
    SODA_ERROR_MIC_BUSY(20),
    SODA_ERROR_AUDIO_BUFFER_OVERFLOW(21),
    SODA_ERROR_SODA(22),
    SODA_ERROR_CANCELLED(23),
    SODA_ERROR_AICORE_NOT_ENABLED_RUNTIME_LIMITS(24),
    SODA_ERROR_GRPC_UNIMPLEMENTED(12),
    SODA_ERROR_GRPC_PERMISSION_DENIED(13),
    SODA_ERROR_GRPC_UNAVAILABLE(14),
    SODA_ERROR_GRPC_CANCELLED(15),
    SODA_ERROR_GRPC_INTERNAL(16),
    SODA_ERROR_GRPC_UNKNOWN(17),
    SODA_ERROR_AICORE_APP_QUOTA(25);

    public final int A;

    amrk(int i) {
        this.A = i;
    }

    public final int a() {
        return this.A;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.A);
    }
}
