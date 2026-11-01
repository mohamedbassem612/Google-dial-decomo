package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum akgw implements defpackage.alah {
    ANDROID_PERMISSION_TYPE_UNSPECIFIED(0),
    ANDROID_POST_NOTIFICATIONS(1),
    ANDROID_CAMERA(2),
    ANDROID_ACCESS_FINE_LOCATION(3),
    ANDROID_ACCESS_BACKGROUND_LOCATION(4),
    ANDROID_ACTIVITY_RECOGNITION(5),
    UNRECOGNIZED(-1);

    private final int i;

    akgw(int i) {
        this.i = i;
    }

    public static defpackage.akgw b(int i) {
        if (i == 0) {
            return ANDROID_PERMISSION_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return ANDROID_POST_NOTIFICATIONS;
        }
        if (i == 2) {
            return ANDROID_CAMERA;
        }
        if (i == 3) {
            return ANDROID_ACCESS_FINE_LOCATION;
        }
        if (i == 4) {
            return ANDROID_ACCESS_BACKGROUND_LOCATION;
        }
        if (i != 5) {
            return null;
        }
        return ANDROID_ACTIVITY_RECOGNITION;
    }

    @Override // defpackage.alah
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.alau.a() : this.i;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.i);
    }
}
