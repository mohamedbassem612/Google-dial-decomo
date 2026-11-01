package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alti implements alah {
    UNKNONW(1),
    RECOGNIZER_STATUS_INITIALIZATION_ERROR(2),
    RECOGNIZER_STATUS_RECOGNITION_ERROR(3),
    RECOGNIZER_STATUS_STREAM_BROKEN(4),
    INVALID_INPUT_FORMAT(5),
    START_DUPLEX_CALLED_WHILE_IN_PROGRESS(6),
    SPECS_LOADING_FAILURE(7),
    CALLBACK_HANDLING_FAILURE(8),
    START_DUPLEX_CALLED_BEFORE_INITIALIZATION(9),
    CORE_INFRA_FATAL_FAILURE(10),
    MODEL_FATAL_ERROR(11),
    MODEL_TRANSIENT_ERROR(12);

    public final int m;

    alti(int i) {
        this.m = i;
    }

    public final int a() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.m);
    }
}
