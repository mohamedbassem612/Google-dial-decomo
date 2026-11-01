package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum ihj implements alah {
    ASR_ENHANCEMENT_POLICY_UNDEFINED(0),
    NO_AUDIO_GEMINI(1),
    FALLBACK_TO_AUDIO_GEMINI_ON_LOW_CONFIDENCE(2),
    FALLBACK_TO_AUDIO_GEMINI_ALWAYS(3),
    FALLBACK_TO_AUDIO_GEMINI_TRANSLATION_ALWAYS(4),
    UNRECOGNIZED(-1);

    private final int h;

    ihj(int i) {
        this.h = i;
    }

    public static defpackage.ihj b(int i) {
        if (i == 0) {
            return ASR_ENHANCEMENT_POLICY_UNDEFINED;
        }
        if (i == 1) {
            return NO_AUDIO_GEMINI;
        }
        if (i == 2) {
            return FALLBACK_TO_AUDIO_GEMINI_ON_LOW_CONFIDENCE;
        }
        if (i == 3) {
            return FALLBACK_TO_AUDIO_GEMINI_ALWAYS;
        }
        if (i != 4) {
            return null;
        }
        return FALLBACK_TO_AUDIO_GEMINI_TRANSLATION_ALWAYS;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
