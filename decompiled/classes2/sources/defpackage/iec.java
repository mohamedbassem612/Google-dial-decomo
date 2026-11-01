package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum iec implements alah {
    UNKNOWN(0),
    VVM_VOICEMAIL(1),
    TRANSCRIPT_AUDIO_FEEDBACK_RECORDING(2),
    CALL_RECORDING(3),
    CALL_SCREEN_AUDIO_UNDER_CALL_LOG(4),
    DOBBY_AUDIO_UNDER_CALL_LOG(5),
    BEESLY_CUSTOM_GREETING(6),
    BEESLY_AUDIO_UNDER_CALL_LOG(7),
    TEST_AUDIO_SOURCE(1001),
    UNRECOGNIZED(-1);

    private final int l;

    iec(int i) {
        this.l = i;
    }

    public static defpackage.iec b(int i) {
        if (i == 1001) {
            return TEST_AUDIO_SOURCE;
        }
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return VVM_VOICEMAIL;
            case 2:
                return TRANSCRIPT_AUDIO_FEEDBACK_RECORDING;
            case 3:
                return CALL_RECORDING;
            case 4:
                return CALL_SCREEN_AUDIO_UNDER_CALL_LOG;
            case 5:
                return DOBBY_AUDIO_UNDER_CALL_LOG;
            case 6:
                return BEESLY_CUSTOM_GREETING;
            case 7:
                return BEESLY_AUDIO_UNDER_CALL_LOG;
            default:
                return null;
        }
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.l;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.l);
    }
}
