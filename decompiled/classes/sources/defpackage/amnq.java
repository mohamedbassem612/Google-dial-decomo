package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum amnq implements defpackage.alah {
    ANDROID_AUTO_CONNECTION_STATUS_UNKNOWN(0),
    ANDROID_AUTO_NOT_CONNECTED_IN_PROJECTION_MODE(1),
    ANDROID_AUTO_CONNECTED_IN_PROJECTION_MODE(2);

    public final int d;

    amnq(int i) {
        this.d = i;
    }

    public static defpackage.amnq b(int i) {
        if (i == 0) {
            return ANDROID_AUTO_CONNECTION_STATUS_UNKNOWN;
        }
        if (i == 1) {
            return ANDROID_AUTO_NOT_CONNECTED_IN_PROJECTION_MODE;
        }
        if (i != 2) {
            return null;
        }
        return ANDROID_AUTO_CONNECTED_IN_PROJECTION_MODE;
    }

    @Override // defpackage.alah
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
