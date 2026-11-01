package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dpd {
    public final long a;

    public /* synthetic */ dpd(long j) {
        this.a = j;
    }

    public static final int a(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static final int b(long j) {
        int i = (int) (3 & j);
        int i2 = ((int) (j >> 33)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1);
        if (i2 == 0) {
            return Integer.MAX_VALUE;
        }
        return i2 - 1;
    }

    public static final int c(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    public static final int d(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1);
    }

    public static java.lang.String e(long j) {
        int iB = b(j);
        java.lang.String strValueOf = iB == Integer.MAX_VALUE ? "Infinity" : java.lang.String.valueOf(iB);
        int iA = a(j);
        java.lang.String strValueOf2 = iA != Integer.MAX_VALUE ? java.lang.String.valueOf(iA) : "Infinity";
        return "Constraints(minWidth = " + d(j) + ", maxWidth = " + strValueOf + ", minHeight = " + c(j) + ", maxHeight = " + strValueOf2 + ')';
    }

    public static boolean f(long j, java.lang.Object obj) {
        return (obj instanceof defpackage.dpd) && j == ((defpackage.dpd) obj).a;
    }

    public static final boolean g(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) + (-1))) != 0;
    }

    public static final boolean h(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) + (-1))) != 0;
    }

    public static final boolean i(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        int i3 = i2 + 15;
        int i4 = (1 << (18 - i2)) - 1;
        int i5 = ((int) (j >> (i2 + 46))) & i4;
        return (((int) (j >> i3)) & i4) == (i5 == 0 ? Integer.MAX_VALUE : i5 + (-1));
    }

    public static final boolean j(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1;
        int i3 = ((int) (j >> 33)) & i2;
        return (((int) (j >> 2)) & i2) == (i3 == 0 ? Integer.MAX_VALUE : i3 + (-1));
    }

    public static /* synthetic */ long k(long j, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = d(j);
        }
        if ((i5 & 2) != 0) {
            i2 = b(j);
        }
        if ((i5 & 4) != 0) {
            i3 = c(j);
        }
        if ((i5 & 8) != 0) {
            i4 = a(j);
        }
        if (i2 < i || i4 < i3 || i < 0) {
            dpm.a(defpackage.aoov.l("\n            maxWidth(" + i2 + ") must be >= than minWidth(" + i + "),\n            maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + "),\n            minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0\n            "));
        }
        return defpackage.dpe.f(i, i2, i3, i4);
    }

    public final boolean equals(java.lang.Object obj) {
        return f(this.a, obj);
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return e(this.a);
    }
}
