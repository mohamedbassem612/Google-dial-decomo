package j$.time;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class Instant implements j$.time.temporal.Temporal, j$.time.temporal.TemporalAdjuster, java.lang.Comparable<j$.time.Instant>, java.io.Serializable {
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;
    public static final j$.time.Instant EPOCH = new j$.time.Instant(0, 0);
    public static final j$.time.Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final j$.time.Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static j$.time.Instant from(j$.time.temporal.TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof j$.time.Instant) {
            return (j$.time.Instant) temporalAccessor;
        }
        j$.util.Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.D(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.h(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (j$.time.DateTimeException e) {
            throw new j$.time.DateTimeException(j$.desugar.sun.nio.fs.h.b("Unable to obtain Instant from TemporalAccessor: ", java.lang.String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()), e);
        }
    }

    public static j$.time.Instant now() {
        int i = j$.time.b.a;
        j$.time.a.c.getClass();
        return ofEpochMilli(java.lang.System.currentTimeMillis());
    }

    public static j$.time.Instant ofEpochMilli(long j) {
        return r(j$.com.android.tools.r8.a.C(j, 1000L), ((int) j$.com.android.tools.r8.a.M(j, 1000L)) * 1000000);
    }

    public static j$.time.Instant ofEpochSecond(long j, long j2) {
        return r(j$.com.android.tools.r8.a.N(j, j$.com.android.tools.r8.a.C(j2, 1000000000L)), (int) j$.com.android.tools.r8.a.M(j2, 1000000000L));
    }

    public static j$.time.Instant r(long j, int i) {
        if ((((long) i) | j) == 0) {
            return EPOCH;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new j$.time.Instant(j, i);
        }
        j$.time.g.h("Instant exceeds minimum or maximum instant");
        return null;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.r((byte) 2, this);
    }

    public final long B(j$.time.Instant instant) {
        long jP = j$.com.android.tools.r8.a.P(instant.a, this.a);
        long j = instant.b - this.b;
        if (jP <= 0 || j >= 0) {
            return (jP >= 0 || j <= 0) ? jP : jP + 1;
        }
        return jP - 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(this);
        }
        int i = j$.time.e.a[((j$.time.temporal.a) lVar).ordinal()];
        int i2 = this.b;
        if (i != 1) {
            if (i == 2) {
                i2 /= 1000;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return this.a;
                    }
                    j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
                    return 0L;
                }
                i2 /= 1000000;
            }
        }
        return i2;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object G(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.m.c) {
            return j$.time.temporal.ChronoUnit.NANOS;
        }
        if (temporalQuery == j$.time.temporal.m.b || temporalQuery == j$.time.temporal.m.a || temporalQuery == j$.time.temporal.m.e || temporalQuery == j$.time.temporal.m.d || temporalQuery == j$.time.temporal.m.f || temporalQuery == j$.time.temporal.m.g) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.Temporal
    public final j$.time.temporal.Temporal a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return (j$.time.Instant) lVar.r(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        aVar.t(j);
        int i = j$.time.e.a[aVar.ordinal()];
        int i2 = this.b;
        long j2 = this.a;
        if (i == 1) {
            return j != ((long) i2) ? r(j2, (int) j) : this;
        }
        if (i == 2) {
            int i3 = ((int) j) * 1000;
            return i3 != i2 ? r(j2, i3) : this;
        }
        if (i == 3) {
            int i4 = ((int) j) * 1000000;
            return i4 != i2 ? r(j2, i4) : this;
        }
        if (i == 4) {
            return j != j2 ? r(j, i2) : this;
        }
        j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
        return null;
    }

    public j$.time.OffsetDateTime atOffset(j$.time.ZoneOffset zoneOffset) {
        return j$.time.OffsetDateTime.r(this, zoneOffset);
    }

    public j$.time.ZonedDateTime atZone(j$.time.ZoneId zoneId) {
        return j$.time.ZonedDateTime.ofInstant(this, zoneId);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            if (lVar == j$.time.temporal.a.INSTANT_SECONDS || lVar == j$.time.temporal.a.NANO_OF_SECOND || lVar == j$.time.temporal.a.MICRO_OF_SECOND || lVar == j$.time.temporal.a.MILLI_OF_SECOND) {
                return true;
            }
        } else if (lVar != null && lVar.h(this)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public int compareTo(j$.time.Instant instant) {
        int iCompare = java.lang.Long.compare(this.a, instant.a);
        return iCompare == 0 ? this.b - instant.b : iCompare;
    }

    @Override // j$.time.temporal.Temporal
    public final long d(j$.time.temporal.Temporal temporal, j$.time.temporal.TemporalUnit temporalUnit) {
        j$.time.Instant instantFrom = from(temporal);
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            return temporalUnit.between(this, instantFrom);
        }
        int i = j$.time.e.b[((j$.time.temporal.ChronoUnit) temporalUnit).ordinal()];
        int i2 = this.b;
        long j = this.a;
        switch (i) {
            case 1:
                return j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.O(j$.com.android.tools.r8.a.P(instantFrom.a, j), 1000000000L), instantFrom.b - i2);
            case 2:
                return j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.O(j$.com.android.tools.r8.a.P(instantFrom.a, j), 1000000000L), instantFrom.b - i2) / 1000;
            case 3:
                return j$.com.android.tools.r8.a.P(instantFrom.toEpochMilli(), toEpochMilli());
            case 4:
                return B(instantFrom);
            case 5:
                return B(instantFrom) / 60;
            case 6:
                return B(instantFrom) / 3600;
            case 7:
                return B(instantFrom) / 43200;
            case 8:
                return B(instantFrom) / 86400;
            default:
                j$.time.g.f("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.Instant) {
            j$.time.Instant instant = (j$.time.Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.m.d(this, lVar).a(lVar.l(this), lVar);
        }
        int i = j$.time.e.a[((j$.time.temporal.a) lVar).ordinal()];
        int i2 = this.b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / 1000;
        }
        if (i == 3) {
            return i2 / 1000000;
        }
        if (i == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.b.a(this.a, aVar);
        }
        j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
        return 0;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isAfter(j$.time.Instant instant) {
        return compareTo(instant) > 0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    public boolean isBefore(j$.time.Instant instant) {
        return compareTo(instant) >>> 31;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.Temporal x(j$.time.LocalDate localDate) {
        return (j$.time.Instant) localDate.p(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        return j$.time.temporal.m.d(this, lVar);
    }

    public j$.time.Instant minus(j$.time.temporal.TemporalAmount temporalAmount) {
        return (j$.time.Instant) temporalAmount.k(this);
    }

    public j$.time.Instant minusMillis(long j) {
        return j == Long.MIN_VALUE ? plusMillis(Long.MAX_VALUE).plusMillis(1L) : plusMillis(-j);
    }

    public j$.time.Instant minusSeconds(long j) {
        return j == Long.MIN_VALUE ? plusSeconds(Long.MAX_VALUE).plusSeconds(1L) : plusSeconds(-j);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.Temporal p(j$.time.temporal.Temporal temporal) {
        return temporal.a(this.a, j$.time.temporal.a.INSTANT_SECONDS).a(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public j$.time.Instant plus(j$.time.temporal.TemporalAmount temporalAmount) {
        return (j$.time.Instant) temporalAmount.h(this);
    }

    public j$.time.Instant plusMillis(long j) {
        return t(j / 1000, (j % 1000) * 1000000);
    }

    public j$.time.Instant plusSeconds(long j) {
        return t(j, 0L);
    }

    public final j$.time.Instant t(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.N(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    public long toEpochMilli() {
        long j = this.a;
        int i = this.b;
        return (j >= 0 || i <= 0) ? j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.O(j, 1000L), i / 1000000) : j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.O(j + 1, 1000L), (i / 1000000) - 1000);
    }

    public final java.lang.String toString() {
        return j$.time.format.DateTimeFormatter.ISO_INSTANT.format(this);
    }

    public j$.time.Instant truncatedTo(j$.time.temporal.TemporalUnit temporalUnit) {
        if (temporalUnit == j$.time.temporal.ChronoUnit.NANOS) {
            return this;
        }
        j$.time.Duration duration = temporalUnit.getDuration();
        if (duration.getSeconds() <= 86400) {
            long nanos = duration.toNanos();
            if (86400000000000L % nanos == 0) {
                long j = ((this.a % 86400) * 1000000000) + ((long) this.b);
                return t(0L, (j$.com.android.tools.r8.a.C(j, nanos) * nanos) - j);
            }
            j$.time.g.f("Unit must divide into a standard day without remainder");
        } else {
            j$.time.g.f("Unit is too large to be used for truncation");
        }
        return null;
    }

    @Override // j$.time.temporal.Temporal
    public final j$.time.temporal.Temporal y(long j, j$.time.temporal.ChronoUnit chronoUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, chronoUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, chronoUnit);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final j$.time.Instant b(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            return (j$.time.Instant) temporalUnit.h(this, j);
        }
        switch (j$.time.e.b[((j$.time.temporal.ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return t(0L, j);
            case 2:
                return t(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return plusMillis(j);
            case 4:
                return plusSeconds(j);
            case 5:
                return plusSeconds(j$.com.android.tools.r8.a.O(j, 60L));
            case 6:
                return plusSeconds(j$.com.android.tools.r8.a.O(j, 3600L));
            case 7:
                return plusSeconds(j$.com.android.tools.r8.a.O(j, 43200L));
            case 8:
                return plusSeconds(j$.com.android.tools.r8.a.O(j, 86400L));
            default:
                j$.time.g.f("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
                return null;
        }
    }

    public static j$.time.Instant ofEpochSecond(long j) {
        return r(j, 0);
    }
}
