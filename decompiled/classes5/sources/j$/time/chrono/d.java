package j$.time.chrono;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public interface d extends j$.time.temporal.Temporal, j$.time.temporal.TemporalAdjuster, java.lang.Comparable {
    j$.time.chrono.ChronoZonedDateTime A(j$.time.ZoneId zoneId);

    /* JADX INFO: renamed from: I */
    int compareTo(j$.time.chrono.d dVar);

    j$.time.chrono.a getChronology();

    j$.time.chrono.ChronoLocalDate toLocalDate();

    j$.time.j toLocalTime();
}
