package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum wgw implements alah {
    UNSPECIFIED(0),
    INFO(1),
    OPTION_DTMF(2),
    OPTION_VOICE(3),
    MUSIC_PLAYING(4),
    TRANSCRIPTION_MODE_CHANGED(5);

    public final int g;

    wgw(int i) {
        this.g = i;
    }

    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
