package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum zlb implements alah {
    SIMULATED_RINGING_ACTION_UNSPECIFIED(0),
    SIMULATED_RINGING_ACTION_SILENCE(1),
    UNRECOGNIZED(-1);

    private final int e;

    zlb(int i) {
        this.e = i;
    }

    public static defpackage.zlb b(int i) {
        if (i == 0) {
            return SIMULATED_RINGING_ACTION_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return SIMULATED_RINGING_ACTION_SILENCE;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
