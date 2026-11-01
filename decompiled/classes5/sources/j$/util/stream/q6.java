package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class q6 {
    public static long a(long j, long j2, long j3) {
        if (j >= 0) {
            return java.lang.Math.max(-1L, java.lang.Math.min(j - j2, j3));
        }
        return -1L;
    }

    public static long b(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    public static int c(long j) {
        return j$.util.stream.v7.t | (j != -1 ? j$.util.stream.v7.u : 0);
    }

    public static j$.util.stream.n6 d(j$.util.stream.b0 b0Var, long j, long j2) {
        if (j >= 0) {
            return new j$.util.stream.n6(b0Var, c(j2), j, j2);
        }
        j$.time.g.a(j);
        return null;
    }

    public static j$.util.stream.j6 e(j$.util.stream.r1 r1Var, long j, long j2) {
        if (j >= 0) {
            return new j$.util.stream.j6(r1Var, c(j2), j, j2);
        }
        j$.time.g.a(j);
        return null;
    }

    public static j$.util.stream.l6 f(j$.util.stream.y1 y1Var, long j, long j2) {
        if (j >= 0) {
            return new j$.util.stream.l6(y1Var, c(j2), j, j2);
        }
        j$.time.g.a(j);
        return null;
    }

    public static j$.util.stream.h6 g(j$.util.stream.x5 x5Var, long j, long j2) {
        if (j >= 0) {
            return new j$.util.stream.h6(x5Var, c(j2), j, j2);
        }
        j$.time.g.a(j);
        return null;
    }

    public static j$.util.Spliterator h(j$.util.stream.w7 w7Var, j$.util.Spliterator spliterator, long j, long j2) {
        long jB = b(j, j2);
        int i = j$.util.stream.o6.a[w7Var.ordinal()];
        if (i == 1) {
            return new j$.util.stream.u8(spliterator, j, jB);
        }
        if (i == 2) {
            return new j$.util.stream.r8((j$.util.Spliterator.OfInt) spliterator, j, jB);
        }
        if (i == 3) {
            return new j$.util.stream.s8((j$.util.Spliterator.OfLong) spliterator, j, jB);
        }
        if (i == 4) {
            return new j$.util.stream.q8((j$.util.p0) spliterator, j, jB);
        }
        throw new java.lang.IllegalStateException("Unknown shape ".concat(java.lang.String.valueOf(w7Var)));
    }
}
