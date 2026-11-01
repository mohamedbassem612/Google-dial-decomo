package j$.time.chrono;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public interface ChronoLocalDate extends j$.time.temporal.Temporal, j$.time.temporal.TemporalAdjuster, java.lang.Comparable<j$.time.chrono.ChronoLocalDate> {
    long E();

    j$.time.chrono.d F(j$.time.j jVar);

    j$.time.chrono.k H();

    j$.time.chrono.ChronoLocalDate J(j$.time.temporal.TemporalAmount temporalAmount);

    int K();

    /* JADX INFO: renamed from: M */
    int compareTo(j$.time.chrono.ChronoLocalDate chronoLocalDate);

    @Override // j$.time.temporal.Temporal
    j$.time.chrono.ChronoLocalDate a(long j, j$.time.temporal.l lVar);

    @Override // j$.time.temporal.Temporal
    j$.time.chrono.ChronoLocalDate b(long j, j$.time.temporal.TemporalUnit temporalUnit);

    @Override // j$.time.temporal.TemporalAccessor
    boolean c(j$.time.temporal.l lVar);

    @Override // j$.time.temporal.Temporal
    long d(j$.time.temporal.Temporal temporal, j$.time.temporal.TemporalUnit temporalUnit);

    boolean equals(java.lang.Object obj);

    j$.time.chrono.a getChronology();

    int hashCode();

    boolean s();

    java.lang.String toString();

    /* JADX INFO: renamed from: u */
    j$.time.chrono.ChronoLocalDate y(long j, j$.time.temporal.TemporalUnit temporalUnit);

    j$.time.chrono.ChronoLocalDate x(j$.time.temporal.TemporalAdjuster temporalAdjuster);
}
