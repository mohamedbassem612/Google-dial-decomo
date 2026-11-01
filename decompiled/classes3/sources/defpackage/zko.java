package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum zko implements alah {
    LIFECYCLE_STATE_UNSPECIFIED(0),
    READY_FOR_BAM(1),
    BAM(2),
    TAKING_MESSAGE(3),
    BACKGROUND_DECLINING(4),
    RINGING_DURING_NOT_ACTIVE_SESSION(5),
    UNRECOGNIZED(-1);

    private final int i;

    zko(int i) {
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
