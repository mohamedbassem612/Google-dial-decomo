package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum amth implements alah {
    UNKNOWN_ENROLLMENT_STATUS(0),
    USER_OPTED_OUT(1),
    UNSUPPORTED_NUMBER(3),
    SCREEN_READER_ENABLED(4),
    MORE_THAN_ONE_ONGOING_CALL(5),
    NOT_AN_OUTGOING_CALL(6),
    PIPELINE_RUNNER_PRECONDITION_CHECK_FAILED(7),
    HEDWIG_ACTIVE(8);

    public final int i;

    amth(int i) {
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
