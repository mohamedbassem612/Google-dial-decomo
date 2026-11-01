package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum akki implements alah {
    DASHER_DEVICE_FILTER_UNKNOWN(0),
    BLOCK_WHEN_DASHER_ON_DEVICE(1);

    public final int c;

    akki(int i) {
        this.c = i;
    }

    public static defpackage.akki b(int i) {
        if (i == 0) {
            return DASHER_DEVICE_FILTER_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return BLOCK_WHEN_DASHER_ON_DEVICE;
    }

    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.c);
    }
}
