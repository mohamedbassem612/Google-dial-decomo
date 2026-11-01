package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum tvy implements alah {
    UNKNOWN(0),
    ON_DEVICE(1),
    DOWNLOADABLE(2),
    NOT_AVAILABLE(3),
    DOWNLOADING(4);

    public final int f;

    tvy(int i) {
        this.f = i;
    }

    public static defpackage.tvy b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ON_DEVICE;
        }
        if (i == 2) {
            return DOWNLOADABLE;
        }
        if (i == 3) {
            return NOT_AVAILABLE;
        }
        if (i != 4) {
            return null;
        }
        return DOWNLOADING;
    }

    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
