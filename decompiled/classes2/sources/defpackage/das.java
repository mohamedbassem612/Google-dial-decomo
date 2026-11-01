package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class das {
    public static final int a(long j, long j2) {
        boolean zC = c(j);
        if (zC == c(j2)) {
            int i = (int) (j2 >> 32);
            int i2 = (int) (j >> 32);
            int iSignum = (int) java.lang.Math.signum(java.lang.Float.intBitsToFloat(i2) - java.lang.Float.intBitsToFloat(i));
            if (java.lang.Math.min(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i)) < 0.0f || b(j) == b(j2)) {
                return iSignum;
            }
            if (b(j)) {
                return -1;
            }
        } else if (zC) {
            return -1;
        }
        return 1;
    }

    public static final boolean b(long j) {
        return (j & 2) != 0;
    }

    public static final boolean c(long j) {
        return (j & 1) != 0;
    }

    public final boolean equals(java.lang.Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final java.lang.String toString() {
        throw null;
    }
}
