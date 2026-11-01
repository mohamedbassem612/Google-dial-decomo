package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum mnm implements defpackage.alah {
    MODE_UNKNOWN(0),
    MODE_SUPPORTS_AUTO_AND_MANUAL_SCREENING(1),
    MODE_SUPPORTS_MANUAL_SCREENING_ONLY(2),
    UNRECOGNIZED(-1);

    private final int f;

    mnm(int i) {
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
