package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum ifv implements defpackage.alah {
    AUDIO_PRISM_FEATURE_KEY_UNSPECIFIED(0),
    AUDIO_PRISM_FEATURE_KEY_DOBBY(1),
    AUDIO_PRISM_FEATURE_KEY_FERMAT(2),
    AUDIO_PRISM_FEATURE_KEY_SHARPIE(3),
    AUDIO_PRISM_FEATURE_KEY_NAUTILUS(4),
    AUDIO_PRISM_FEATURE_KEY_XATU(5),
    AUDIO_PRISM_FEATURE_KEY_HEDWIG(6),
    AUDIO_PRISM_FEATURE_KEY_BEESLY(7),
    AUDIO_PRISM_FEATURE_KEY_CALL_CONTEXT(8),
    UNRECOGNIZED(-1);

    private final int l;

    ifv(int i) {
        this.l = i;
    }

    public static defpackage.ifv b(int i) {
        switch (i) {
            case 0:
                return AUDIO_PRISM_FEATURE_KEY_UNSPECIFIED;
            case 1:
                return AUDIO_PRISM_FEATURE_KEY_DOBBY;
            case 2:
                return AUDIO_PRISM_FEATURE_KEY_FERMAT;
            case 3:
                return AUDIO_PRISM_FEATURE_KEY_SHARPIE;
            case 4:
                return AUDIO_PRISM_FEATURE_KEY_NAUTILUS;
            case 5:
                return AUDIO_PRISM_FEATURE_KEY_XATU;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return AUDIO_PRISM_FEATURE_KEY_HEDWIG;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return AUDIO_PRISM_FEATURE_KEY_BEESLY;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return AUDIO_PRISM_FEATURE_KEY_CALL_CONTEXT;
            default:
                return null;
        }
    }

    @Override // defpackage.alah
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.alau.a() : this.l;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.l);
    }
}
