package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum igg implements alah {
    DUOLINKS_STATUS_UNSPECIFIED(0),
    DUOLINKS_STATUS_UNNEEDED(1),
    DUOLINKS_STATUS_AVAILABLE(2),
    DUOLINKS_STATUS_CONCURRENT_AUDIO_CAPTURING_UNAVAILABLE(3),
    DUOLINKS_STATUS_CONCURRENT_TRANSCRIPTION_UNAVAILABLE(4),
    UNRECOGNIZED(-1);

    private final int h;

    igg(int i) {
        this.h = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
