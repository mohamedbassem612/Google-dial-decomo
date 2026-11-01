package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum roc implements defpackage.alah {
    UNKNOWN_TAB_KEY(0),
    CALL_LOG_TAB_KEY(1),
    CHOCOLATE_CHIP_KEY(2),
    DIALPAD_KEY(3),
    VISUAL_VOICEMAIL_TAB_KEY(4),
    UNRECOGNIZED(-1);

    private final int h;

    roc(int i) {
        this.h = i;
    }

    public static defpackage.roc b(int i) {
        if (i == 0) {
            return UNKNOWN_TAB_KEY;
        }
        if (i == 1) {
            return CALL_LOG_TAB_KEY;
        }
        if (i == 2) {
            return CHOCOLATE_CHIP_KEY;
        }
        if (i == 3) {
            return DIALPAD_KEY;
        }
        if (i != 4) {
            return null;
        }
        return VISUAL_VOICEMAIL_TAB_KEY;
    }

    @Override // defpackage.alah
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.alau.a() : this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
