package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum jmu implements alah {
    SCAM_SELECTOR_QUESTION_KEY_UNSPECIFIED(0),
    SCAM_SELECTOR_QUESTION_KEY_SCAM(1),
    SCAM_SELECTOR_QUESTION_KEY_NOT_SCAM(2),
    UNRECOGNIZED(-1);

    private final int f;

    jmu(int i) {
        this.f = i;
    }

    public static defpackage.jmu b(int i) {
        if (i == 0) {
            return SCAM_SELECTOR_QUESTION_KEY_UNSPECIFIED;
        }
        if (i == 1) {
            return SCAM_SELECTOR_QUESTION_KEY_SCAM;
        }
        if (i != 2) {
            return null;
        }
        return SCAM_SELECTOR_QUESTION_KEY_NOT_SCAM;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
