package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum wcm implements alah {
    SIMULATED_RINGING_ACTION_STATE_EVENT_UNSPECIFIED(0),
    RINGER_SILENCED(1),
    UNRECOGNIZED(-1);

    private final int e;

    wcm(int i) {
        this.e = i;
    }

    public static defpackage.wcm b(int i) {
        if (i == 0) {
            return SIMULATED_RINGING_ACTION_STATE_EVENT_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return RINGER_SILENCED;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
