package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum wow implements alah {
    CACHED_IVR_DATA_BANNER_NONE(0),
    INTRO_FOR_LIVE_TRANSCRIPTION(1),
    INTRO_FOR_IVR_DATA(2),
    UNRECOGNIZED(-1);

    private final int f;

    wow(int i) {
        this.f = i;
    }

    public static defpackage.wow b(int i) {
        if (i == 0) {
            return CACHED_IVR_DATA_BANNER_NONE;
        }
        if (i == 1) {
            return INTRO_FOR_LIVE_TRANSCRIPTION;
        }
        if (i != 2) {
            return null;
        }
        return INTRO_FOR_IVR_DATA;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
