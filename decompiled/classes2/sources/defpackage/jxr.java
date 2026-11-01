package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum jxr implements alah {
    LOCATION_FAILURE_NONE(0),
    LOCATION_FAILURE_BATTERY_TOO_LOW(1);

    public final int c;

    jxr(int i) {
        this.c = i;
    }

    public static defpackage.jxr b(int i) {
        if (i == 0) {
            return LOCATION_FAILURE_NONE;
        }
        if (i != 1) {
            return null;
        }
        return LOCATION_FAILURE_BATTERY_TOO_LOW;
    }

    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.c);
    }
}
