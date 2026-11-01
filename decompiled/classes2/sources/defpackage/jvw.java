package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum jvw implements alah {
    UNKNOWN(0),
    WIFI(1),
    LTE(2),
    HD_PLUS(3),
    SHARED_DATA(4),
    VIDEO_WIFI(5);

    public final int g;

    jvw(int i) {
        this.g = i;
    }

    public static defpackage.jvw b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return WIFI;
        }
        if (i == 2) {
            return LTE;
        }
        if (i == 3) {
            return HD_PLUS;
        }
        if (i == 4) {
            return SHARED_DATA;
        }
        if (i != 5) {
            return null;
        }
        return VIDEO_WIFI;
    }

    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
