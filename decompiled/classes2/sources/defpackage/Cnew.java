package defpackage;

/* JADX INFO: renamed from: new, reason: invalid class name */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum Cnew implements alah {
    PLAY_RECORDING_RESULT_UNKNOWN(0),
    PLAY_RECORDING_COMPLETED(1),
    PLAY_RECORDING_FAILED(2),
    PLAY_RECORDING_NOT_STARTED(3),
    PLAY_RECORDING_CANCELLED_UNDER_WRONG_STATES(4),
    PLAY_RECORDING_CANCELLED_DUE_TO_AUDIO_PLAYING_ISSUES_DETECTED(5),
    UNRECOGNIZED(-1);

    private final int i;

    Cnew(int i) {
        this.i = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.i;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.i);
    }
}
