package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class m {
    public static final j$.desugar.sun.nio.fs.n a = new j$.desugar.sun.nio.fs.n(4);
    public static final j$.desugar.sun.nio.fs.n b = new j$.desugar.sun.nio.fs.n(5);
    public static final j$.desugar.sun.nio.fs.n c = new j$.desugar.sun.nio.fs.n(6);
    public static final j$.desugar.sun.nio.fs.n d = new j$.desugar.sun.nio.fs.n(7);
    public static final j$.desugar.sun.nio.fs.n e = new j$.desugar.sun.nio.fs.n(8);
    public static final j$.desugar.sun.nio.fs.n f = new j$.desugar.sun.nio.fs.n(9);
    public static final j$.desugar.sun.nio.fs.n g = new j$.desugar.sun.nio.fs.n(10);

    public static int a(j$.time.temporal.TemporalAccessor temporalAccessor, j$.time.temporal.l lVar) {
        j$.time.temporal.o oVarL = temporalAccessor.l(lVar);
        if (!oVarL.d()) {
            j$.time.g.f(j$.desugar.sun.nio.fs.h.a("Invalid field ", java.lang.String.valueOf(lVar), " for get() method, use getLong() instead"));
            return 0;
        }
        long jD = temporalAccessor.D(lVar);
        if (oVarL.e(jD)) {
            return (int) jD;
        }
        throw new j$.time.DateTimeException("Invalid value for " + java.lang.String.valueOf(lVar) + " (valid values " + java.lang.String.valueOf(oVarL) + "): " + jD);
    }

    public static j$.time.temporal.Temporal b(j$.time.temporal.Temporal temporal, long j, j$.time.temporal.TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            temporal = temporal.b(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return temporal.b(j2, temporalUnit);
    }

    public static java.lang.Object c(j$.time.temporal.TemporalAccessor temporalAccessor, j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == a || temporalQuery == b || temporalQuery == c) {
            return null;
        }
        return temporalQuery.queryFrom(temporalAccessor);
    }

    public static j$.time.temporal.o d(j$.time.temporal.TemporalAccessor temporalAccessor, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            j$.util.Objects.requireNonNull(lVar, "field");
            return lVar.k(temporalAccessor);
        }
        if (temporalAccessor.c(lVar)) {
            return ((j$.time.temporal.a) lVar).b;
        }
        j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
        return null;
    }

    public static /* synthetic */ int e(int i) {
        int i2 = i % 7;
        if (i2 == 0) {
            return 0;
        }
        return (((i ^ 7) >> 31) | 1) <= 0 ? i2 + 7 : i2;
    }
}
