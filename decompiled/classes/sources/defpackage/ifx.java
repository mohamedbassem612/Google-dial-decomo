package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum ifx implements defpackage.alah {
    STREAMING_TYPE_UNSPECIFIED(0),
    DOWNLINK(1),
    DOWNLINK_AND_UPLINK(4),
    UNRECOGNIZED(-1);

    private final int f;

    ifx(int i) {
        this.f = i;
    }

    public static defpackage.ifx b(int i) {
        if (i == 0) {
            return STREAMING_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return DOWNLINK;
        }
        if (i != 4) {
            return null;
        }
        return DOWNLINK_AND_UPLINK;
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
