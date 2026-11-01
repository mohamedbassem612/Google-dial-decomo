package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum nms implements alah {
    CASE_NO_SESSION(0),
    CASE_MANUAL_SCREENING(1),
    CASE_AUTO_SCREENING(2),
    CASE_BAM(3),
    CASE_BEESLY(4),
    CASE_CALL_SCREEN_LITE(5),
    UNRECOGNIZED(-1);

    private final int i;

    nms(int i) {
        this.i = i;
    }

    public static defpackage.nms b(int i) {
        if (i == 0) {
            return CASE_NO_SESSION;
        }
        if (i == 1) {
            return CASE_MANUAL_SCREENING;
        }
        if (i == 2) {
            return CASE_AUTO_SCREENING;
        }
        if (i == 3) {
            return CASE_BAM;
        }
        if (i == 4) {
            return CASE_BEESLY;
        }
        if (i != 5) {
            return null;
        }
        return CASE_CALL_SCREEN_LITE;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.i;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.i);
    }
}
