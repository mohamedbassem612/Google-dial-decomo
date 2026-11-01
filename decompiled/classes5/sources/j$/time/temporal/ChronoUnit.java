package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public enum ChronoUnit implements j$.time.temporal.TemporalUnit {
    NANOS("Nanos", j$.time.Duration.ofNanos(1)),
    MICROS("Micros", j$.time.Duration.ofNanos(1000)),
    MILLIS("Millis", j$.time.Duration.ofNanos(1000000)),
    SECONDS("Seconds", j$.time.Duration.ofSeconds(1)),
    MINUTES("Minutes", j$.time.Duration.ofSeconds(60)),
    HOURS("Hours", j$.time.Duration.ofSeconds(3600)),
    HALF_DAYS("HalfDays", j$.time.Duration.ofSeconds(43200)),
    DAYS("Days", j$.time.Duration.ofSeconds(86400)),
    WEEKS("Weeks", j$.time.Duration.ofSeconds(604800)),
    MONTHS("Months", j$.time.Duration.ofSeconds(2629746)),
    YEARS("Years", j$.time.Duration.ofSeconds(31556952)),
    DECADES("Decades", j$.time.Duration.ofSeconds(315569520)),
    CENTURIES("Centuries", j$.time.Duration.ofSeconds(3155695200L)),
    MILLENNIA("Millennia", j$.time.Duration.ofSeconds(31556952000L)),
    ERAS("Eras", j$.time.Duration.ofSeconds(31556952000000000L)),
    FOREVER("Forever", j$.time.Duration.ofSeconds(Long.MAX_VALUE, 999999999));

    public final java.lang.String a;
    public final j$.time.Duration b;

    ChronoUnit(java.lang.String str, j$.time.Duration duration) {
        this.a = str;
        this.b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public long between(j$.time.temporal.Temporal temporal, j$.time.temporal.Temporal temporal2) {
        return temporal.d(temporal2, this);
    }

    @Override // j$.time.temporal.TemporalUnit
    public j$.time.Duration getDuration() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final j$.time.temporal.Temporal h(j$.time.temporal.Temporal temporal, long j) {
        return temporal.b(j, this);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    @Override // j$.time.temporal.TemporalUnit
    public final boolean isDurationEstimated() {
        return (compareTo(DAYS) ^ (-1)) >>> 31;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.a;
    }
}
