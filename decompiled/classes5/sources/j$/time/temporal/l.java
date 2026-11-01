package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public interface l {
    boolean h(j$.time.temporal.TemporalAccessor temporalAccessor);

    boolean isDateBased();

    j$.time.temporal.o k(j$.time.temporal.TemporalAccessor temporalAccessor);

    long l(j$.time.temporal.TemporalAccessor temporalAccessor);

    j$.time.temporal.TemporalAccessor p(java.util.HashMap map, j$.time.format.b0 b0Var, j$.time.format.c0 c0Var);

    j$.time.temporal.Temporal r(j$.time.temporal.Temporal temporal, long j);

    j$.time.temporal.o range();
}
