package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum ntc implements alah {
    UNKNOWN(0),
    NEEDS_DOWNLOAD(1),
    DOWNLOADING(2),
    AVAILABLE(3),
    UNAVAILABLE(4),
    UNRECOGNIZED(-1);

    private final int h;

    ntc(int i) {
        this.h = i;
    }

    public static defpackage.ntc b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NEEDS_DOWNLOAD;
        }
        if (i == 2) {
            return DOWNLOADING;
        }
        if (i == 3) {
            return AVAILABLE;
        }
        if (i != 4) {
            return null;
        }
        return UNAVAILABLE;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
