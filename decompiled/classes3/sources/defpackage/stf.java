package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum stf implements alah {
    POST_CALL_UNKNOWN(0),
    POST_CALL_TEST_HIGH_PRIORITY(1),
    POST_CALL_TEST_LOW_PRIORITY(2),
    POST_CALL_HATS_SURVEY_HIGH_PRIORITY(3),
    POST_CALL_PLAY_CORE_REVIEW(4),
    POST_CALL_HATS_SURVEY_LOW_PRIORITY(5),
    UNRECOGNIZED(-1);

    private final int i;

    stf(int i) {
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
