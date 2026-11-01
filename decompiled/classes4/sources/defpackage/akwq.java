package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum akwq implements alah {
    SEARCH_GENAI_TRAINING_EXCLUDED_FOR_UNSPECIFIED(0),
    SEARCH_GENAI_TRAINING_EXCLUDED_FOR_TEST_SLICE(999),
    UNRECOGNIZED(-1);

    private final int e;

    akwq(int i) {
        this.e = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
