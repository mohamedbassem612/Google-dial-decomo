package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum twc implements alah {
    UNSPECIFIED(0),
    INTERRUPT(1),
    YIELD(2);

    public final int d;

    twc(int i) {
        this.d = i;
    }

    public static defpackage.twc b(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return INTERRUPT;
        }
        if (i != 2) {
            return null;
        }
        return YIELD;
    }

    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
