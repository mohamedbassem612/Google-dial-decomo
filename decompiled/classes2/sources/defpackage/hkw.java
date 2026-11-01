package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum hkw implements alah {
    MODE_UNSPECIFIED(0),
    BUBBLE(1);

    private final int d;

    hkw(int i) {
        this.d = i;
    }

    public static defpackage.hkw b(int i) {
        if (i == 0) {
            return MODE_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return BUBBLE;
    }

    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
