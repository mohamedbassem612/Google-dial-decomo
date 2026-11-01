package j$.time.chrono;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public interface ChronoZonedDateTime<D extends j$.time.chrono.ChronoLocalDate> extends j$.time.temporal.Temporal, java.lang.Comparable<j$.time.chrono.ChronoZonedDateTime<?>> {
    j$.time.chrono.ChronoZonedDateTime g(j$.time.ZoneId zoneId);

    j$.time.chrono.a getChronology();

    j$.time.ZoneOffset getOffset();

    j$.time.ZoneId getZone();

    long toEpochSecond();

    j$.time.chrono.ChronoLocalDate toLocalDate();

    j$.time.chrono.d toLocalDateTime();

    j$.time.j toLocalTime();

    j$.time.chrono.ChronoZonedDateTime w(j$.time.ZoneId zoneId);
}
