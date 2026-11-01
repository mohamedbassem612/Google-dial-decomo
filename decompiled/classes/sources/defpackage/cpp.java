package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cpp {
    public final long a;

    public static final float a(long j) {
        return java.lang.Math.min(java.lang.Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), java.lang.Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static java.lang.String b(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + defpackage.rz.j(java.lang.Float.intBitsToFloat((int) (j >> 32))) + ", " + defpackage.rz.j(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public static boolean c(long j, java.lang.Object obj) {
        return (obj instanceof defpackage.cpp) && j == ((defpackage.cpp) obj).a;
    }

    public static final boolean d(long j) {
        int i = (int) (4294967295L & j);
        return (j == 9205357640488583168L) | (java.lang.Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (java.lang.Float.intBitsToFloat(i) <= 0.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        return c(this.a, obj);
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return b(this.a);
    }
}
