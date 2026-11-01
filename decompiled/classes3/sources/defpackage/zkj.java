package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum zkj implements alah {
    AUDIO_ACTION_UNSPECIFIED(0),
    PULL_AUDIO_TO_WATCH(1),
    UNRECOGNIZED(-1);

    private final int e;

    zkj(int i) {
        this.e = i;
    }

    public static defpackage.zkj b(int i) {
        if (i == 0) {
            return AUDIO_ACTION_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return PULL_AUDIO_TO_WATCH;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
