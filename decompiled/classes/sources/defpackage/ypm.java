package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum ypm implements defpackage.alah {
    MODEL_UNSPECIFIED(0),
    WHISPER(1),
    SODA(2),
    UNRECOGNIZED(-1);

    private final int f;

    ypm(int i) {
        this.f = i;
    }

    public static defpackage.ypm b(int i) {
        if (i == 0) {
            return MODEL_UNSPECIFIED;
        }
        if (i == 1) {
            return WHISPER;
        }
        if (i != 2) {
            return null;
        }
        return SODA;
    }

    @Override // defpackage.alah
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.alau.a() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
