package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum zld implements alah {
    SIMULATED_RINGING_ACTION_UNSPECIFIED(0),
    SIMULATED_RINGING_ACTION_SILENCE(1),
    UNRECOGNIZED(-1);

    private final int e;

    zld(int i) {
        this.e = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
