package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum zvj implements defpackage.alah {
    UNKNOWN(0),
    STARTUP(1),
    TELEDOCTOR(2),
    UNRECOGNIZED(-1);

    private final int f;

    zvj(int i) {
        this.f = i;
    }

    @Override // defpackage.alah
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.alau.a() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
