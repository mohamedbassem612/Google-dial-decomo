package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum twf implements alah {
    SODA_HOST_APP_STATUS_UNKNOWN(0),
    SODA_HOST_APP_STATUS_ABLE_TO_TRANSCRIBE_AND_UP_TO_DATE(1),
    SODA_HOST_APP_STATUS_ABLE_TO_TRANSCRIBE_AND_OUTDATED(2),
    SODA_HOST_APP_STATUS_NEEDS_UPDATE(3),
    UNRECOGNIZED(-1);

    private final int g;

    twf(int i) {
        this.g = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
