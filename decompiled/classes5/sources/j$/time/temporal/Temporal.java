package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public interface Temporal extends j$.time.temporal.TemporalAccessor {
    j$.time.temporal.Temporal a(long j, j$.time.temporal.l lVar);

    j$.time.temporal.Temporal b(long j, j$.time.temporal.TemporalUnit temporalUnit);

    long d(j$.time.temporal.Temporal temporal, j$.time.temporal.TemporalUnit temporalUnit);

    /* JADX INFO: renamed from: k */
    j$.time.temporal.Temporal x(j$.time.LocalDate localDate);

    j$.time.temporal.Temporal y(long j, j$.time.temporal.ChronoUnit chronoUnit);
}
