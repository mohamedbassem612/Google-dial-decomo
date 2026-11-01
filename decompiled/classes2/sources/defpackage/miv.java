package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum miv implements alah {
    UNSPECIFIED(0),
    VOICE_BUTTON(1),
    WAIT_TIME_VOICE_BUTTON(2),
    RTT_VOICE_BUTTON(3),
    RTT_BUTTON(4),
    BUSINESS_MESSAGE_CHAT_BUTTON(5);

    public final int g;

    miv(int i) {
        this.g = i;
    }

    public static defpackage.miv b(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return VOICE_BUTTON;
        }
        if (i == 2) {
            return WAIT_TIME_VOICE_BUTTON;
        }
        if (i == 3) {
            return RTT_VOICE_BUTTON;
        }
        if (i == 4) {
            return RTT_BUTTON;
        }
        if (i != 5) {
            return null;
        }
        return BUSINESS_MESSAGE_CHAT_BUTTON;
    }

    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
