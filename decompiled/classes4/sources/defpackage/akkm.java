package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum akkm implements alah {
    UNKNOWN(0),
    DISPLAYED(1),
    TAPPED(2),
    AUTOMATED(3);

    public final int e;

    akkm(int i) {
        this.e = i;
    }

    public static defpackage.akkm b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return DISPLAYED;
        }
        if (i == 2) {
            return TAPPED;
        }
        if (i != 3) {
            return null;
        }
        return AUTOMATED;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
