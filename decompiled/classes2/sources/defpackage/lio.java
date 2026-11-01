package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum lio implements alah {
    VOICE_STATUS_NO_VOICE(0),
    VOICE_STATUS_ONLY_ONE_VOICE(1),
    VOICE_STATUS_MULTIPLE_VOICES(2),
    VOICE_STATUS_DOWNLOAD_ONGOING(3),
    VOICE_STATUS_DOWNLOAD_COMPLETED(4),
    UNRECOGNIZED(-1);

    private final int h;

    lio(int i) {
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
