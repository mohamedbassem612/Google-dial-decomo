package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum akgv implements alah {
    ANDROID_PERMISSION_STATE_UNSPECIFIED(0),
    ANDROID_PERMISSION_STATE_AUTHORIZED(1),
    ANDROID_PERMISSION_STATE_DENIED(2),
    UNRECOGNIZED(-1);

    private final int f;

    akgv(int i) {
        this.f = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
