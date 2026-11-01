package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum akto implements alah {
    DASHER_DEVICE_FILTER_UNSPECIFIED(0),
    BLOCK_WHEN_DASHER_ON_DEVICE(1);

    private final int d;

    akto(int i) {
        this.d = i;
    }

    public static defpackage.akto b(int i) {
        if (i == 0) {
            return DASHER_DEVICE_FILTER_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return BLOCK_WHEN_DASHER_ON_DEVICE;
    }

    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
