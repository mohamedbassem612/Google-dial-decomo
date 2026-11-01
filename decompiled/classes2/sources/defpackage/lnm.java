package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum lnm implements alah {
    UNSPECIFIED(0),
    PASS_TO_USER(1),
    SILENCE_FOR_TELECOM_AUDIO_PROCESSING(2),
    REJECT(3),
    SILENCE_WITH_NO_TELECOM_AUDIO_PROCESSING(4),
    UNRECOGNIZED(-1);

    private final int h;

    lnm(int i) {
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
