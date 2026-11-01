package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum qmz implements alah {
    UNKNOWN(0),
    BUTTON_MUTE(1),
    BUTTON_CAMERA_OFF(2),
    BUTTON_FLIP_CAMERA(3),
    BUTTON_HOLD(4),
    BUTTON_ADD_CALL(5),
    BUTTON_DOWNGRADE_TO_AUDIO(6),
    BUTTON_AUDIO_ROUTE(7),
    BUTTON_MANAGE_VIDEO_CONFERENCE(8),
    BUTTON_SWAP(9),
    BUTTON_MERGE(10),
    TEST_HIGH_PRIORITY(100000),
    TEST_LOW_PRIORITY(100001);

    public final int n;

    qmz(int i) {
        this.n = i;
    }

    public final int a() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.n);
    }
}
