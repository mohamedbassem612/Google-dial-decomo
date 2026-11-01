package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alnq implements alah {
    UNKNOWN_LLM_FEATURE(0),
    AICORE_LLM_PER_LAYER_GEM_FEATURE(1),
    AICORE_DIALER_SN_FEATURE(2),
    AICORE_DIALER_SR_FEATURE(3),
    AICORE_DIALER_SN_SAFETY_FEATURE(4),
    AICORE_DIALER_SN_TITLES_FEATURE(5),
    AICORE_DIALER_SN_ACTIONS_FEATURE(6),
    AICORE_DIALER_AGENTIC_CALL_SCREEN_FEATURE(7),
    AICORE_DIALER_CALL_SCREEN_LITE_FEATURE(8);

    public final int j;

    alnq(int i) {
        this.j = i;
    }

    public static defpackage.alnq b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_LLM_FEATURE;
            case 1:
                return AICORE_LLM_PER_LAYER_GEM_FEATURE;
            case 2:
                return AICORE_DIALER_SN_FEATURE;
            case 3:
                return AICORE_DIALER_SR_FEATURE;
            case 4:
                return AICORE_DIALER_SN_SAFETY_FEATURE;
            case 5:
                return AICORE_DIALER_SN_TITLES_FEATURE;
            case 6:
                return AICORE_DIALER_SN_ACTIONS_FEATURE;
            case 7:
                return AICORE_DIALER_AGENTIC_CALL_SCREEN_FEATURE;
            case 8:
                return AICORE_DIALER_CALL_SCREEN_LITE_FEATURE;
            default:
                return null;
        }
    }

    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.j);
    }
}
