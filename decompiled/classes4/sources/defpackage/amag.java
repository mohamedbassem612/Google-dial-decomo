package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum amag implements alah {
    NOTIFY_USER(1),
    SUGGEST_OFF_HOLD(2),
    DO_NOT_RECORD_THE_CALL(3),
    USER_ATTENTION_REQUIRED(4),
    AGENT_DETECTED_PRE_HOLD(5),
    AUDIO_ERROR(6),
    HOLD_DETECTED(7),
    CONNECTING_TO_AGENT(8),
    MUSIC_STARTED(9),
    MUSIC_STOPPED(10);

    public final int k;

    amag(int i) {
        this.k = i;
    }

    public static defpackage.amag b(int i) {
        switch (i) {
            case 1:
                return NOTIFY_USER;
            case 2:
                return SUGGEST_OFF_HOLD;
            case 3:
                return DO_NOT_RECORD_THE_CALL;
            case 4:
                return USER_ATTENTION_REQUIRED;
            case 5:
                return AGENT_DETECTED_PRE_HOLD;
            case 6:
                return AUDIO_ERROR;
            case 7:
                return HOLD_DETECTED;
            case 8:
                return CONNECTING_TO_AGENT;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return MUSIC_STARTED;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return MUSIC_STOPPED;
            default:
                return null;
        }
    }

    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.k);
    }
}
