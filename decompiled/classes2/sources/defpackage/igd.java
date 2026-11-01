package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum igd implements alah {
    AUDIO_SOURCE_UNSPECIFIED(0),
    AUDIO_SOURCE_DOWNLINK(1),
    AUDIO_SOURCE_UPLINK(2),
    UNRECOGNIZED(-1);

    private final int f;

    igd(int i) {
        this.f = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
