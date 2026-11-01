package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum zty implements alah {
    DIALER_WEAR_GNP_FEATURE_TYPE_UNSPECIFIED(0),
    DIALER_WEAR_GNP_FEATURE_TYPE_BAM(1);

    private final int d;

    zty(int i) {
        this.d = i;
    }

    public static defpackage.zty b(int i) {
        if (i == 0) {
            return DIALER_WEAR_GNP_FEATURE_TYPE_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return DIALER_WEAR_GNP_FEATURE_TYPE_BAM;
    }

    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
