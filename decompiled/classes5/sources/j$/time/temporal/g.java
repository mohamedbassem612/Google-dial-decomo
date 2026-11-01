package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public enum g implements j$.time.temporal.TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", j$.time.Duration.ofSeconds(31556952)),
    QUARTER_YEARS("QuarterYears", j$.time.Duration.ofSeconds(7889238));

    public final java.lang.String a;
    public final j$.time.Duration b;

    g(java.lang.String str, j$.time.Duration duration) {
        this.a = str;
        this.b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final long between(j$.time.temporal.Temporal temporal, j$.time.temporal.Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.d(temporal2, this);
        }
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            j$.time.temporal.f fVar = j$.time.temporal.h.c;
            return j$.com.android.tools.r8.a.P(temporal2.D(fVar), temporal.D(fVar));
        }
        if (iOrdinal == 1) {
            return temporal.d(temporal2, j$.time.temporal.ChronoUnit.MONTHS) / 3;
        }
        throw new java.lang.IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.TemporalUnit
    public final j$.time.Duration getDuration() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final j$.time.temporal.Temporal h(j$.time.temporal.Temporal temporal, long j) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            j$.time.temporal.f fVar = j$.time.temporal.h.c;
            return temporal.a(j$.com.android.tools.r8.a.N(temporal.h(fVar), j), fVar);
        }
        if (iOrdinal == 1) {
            return temporal.b(j / 4, j$.time.temporal.ChronoUnit.YEARS).b((j % 4) * 3, j$.time.temporal.ChronoUnit.MONTHS);
        }
        throw new java.lang.IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.TemporalUnit
    public final boolean isDurationEstimated() {
        return true;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.a;
    }
}
