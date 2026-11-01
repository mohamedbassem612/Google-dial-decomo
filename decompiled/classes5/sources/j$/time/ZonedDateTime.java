package j$.time;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class ZonedDateTime implements j$.time.temporal.Temporal, j$.time.chrono.ChronoZonedDateTime<j$.time.LocalDate>, java.io.Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final j$.time.LocalDateTime a;
    public final j$.time.ZoneOffset b;
    public final j$.time.ZoneId c;

    public ZonedDateTime(j$.time.LocalDateTime localDateTime, j$.time.ZoneId zoneId, j$.time.ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    public static j$.time.ZonedDateTime of(int i, int i2, int i3, int i4, int i5, int i6, int i7, j$.time.ZoneId zoneId) {
        j$.time.LocalDateTime localDateTime = j$.time.LocalDateTime.c;
        return t(new j$.time.LocalDateTime(j$.time.LocalDate.of(i, i2, i3), j$.time.j.C(i4, i5, i6, i7)), zoneId, null);
    }

    public static j$.time.ZonedDateTime ofInstant(j$.time.Instant instant, j$.time.ZoneId zoneId) {
        j$.util.Objects.requireNonNull(instant, "instant");
        j$.util.Objects.requireNonNull(zoneId, "zone");
        return p(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    public static j$.time.ZonedDateTime p(long j, int i, j$.time.ZoneId zoneId) {
        j$.time.ZoneOffset zoneOffsetD = zoneId.getRules().d(j$.time.Instant.ofEpochSecond(j, i));
        return new j$.time.ZonedDateTime(j$.time.LocalDateTime.C(j, i, zoneOffsetD), zoneId, zoneOffsetD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v6, types: [j$.time.ZonedDateTime] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static j$.time.ZonedDateTime r(j$.time.temporal.Temporal temporal) {
        if (temporal instanceof j$.time.ZonedDateTime) {
            return (j$.time.ZonedDateTime) temporal;
        }
        try {
            j$.time.ZoneId zoneIdR = j$.time.ZoneId.r(temporal);
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            temporal = temporal.c(aVar) ? p(temporal.D(aVar), temporal.h(j$.time.temporal.a.NANO_OF_SECOND), zoneIdR) : t(j$.time.LocalDateTime.B(j$.time.LocalDate.from(temporal), j$.time.j.z(temporal)), zoneIdR, null);
            return temporal;
        } catch (j$.time.DateTimeException e) {
            throw new j$.time.DateTimeException(j$.desugar.sun.nio.fs.h.b("Unable to obtain ZonedDateTime from TemporalAccessor: ", java.lang.String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
        }
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    public static j$.time.ZonedDateTime t(j$.time.LocalDateTime localDateTime, j$.time.ZoneId zoneId, j$.time.ZoneOffset zoneOffset) {
        j$.util.Objects.requireNonNull(localDateTime, "localDateTime");
        j$.util.Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof j$.time.ZoneOffset) {
            return new j$.time.ZonedDateTime(localDateTime, zoneId, (j$.time.ZoneOffset) zoneId);
        }
        j$.time.zone.ZoneRules rules = zoneId.getRules();
        java.util.List listF = rules.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (j$.time.ZoneOffset) listF.get(0);
        } else if (listF.size() == 0) {
            java.lang.Object objE = rules.e(localDateTime);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            localDateTime = localDateTime.O(j$.time.Duration.ofSeconds(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()).getSeconds());
            zoneOffset = bVar.d;
        } else if (zoneOffset == null || !listF.contains(zoneOffset)) {
            zoneOffset = (j$.time.ZoneOffset) j$.util.Objects.requireNonNull((j$.time.ZoneOffset) listF.get(0), "offset");
        }
        return new j$.time.ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    private java.lang.Object writeReplace() {
        return new j$.time.r((byte) 6, this);
    }

    public final j$.time.ZonedDateTime B(j$.time.LocalDateTime localDateTime) {
        j$.util.Objects.requireNonNull(localDateTime, "localDateTime");
        j$.time.ZoneOffset zoneOffset = this.b;
        j$.util.Objects.requireNonNull(zoneOffset, "offset");
        j$.time.ZoneId zoneId = this.c;
        j$.util.Objects.requireNonNull(zoneId, "zone");
        return zoneId.getRules().f(localDateTime).contains(zoneOffset) ? new j$.time.ZonedDateTime(localDateTime, zoneId, zoneOffset) : p(localDateTime.toEpochSecond(zoneOffset), localDateTime.b.d, zoneId);
    }

    public final j$.time.ZonedDateTime C(j$.time.LocalDateTime localDateTime) {
        return t(localDateTime, this.c, this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(this);
        }
        int i = j$.time.x.a[((j$.time.temporal.a) lVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.D(lVar) : this.b.getTotalSeconds();
        }
        return j$.com.android.tools.r8.a.r(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object G(j$.time.temporal.TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.m.f ? toLocalDate() : j$.com.android.tools.r8.a.o(this, temporalQuery);
    }

    @Override // j$.time.temporal.Temporal
    public final j$.time.temporal.Temporal a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return (j$.time.ZonedDateTime) lVar.r(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        int i = j$.time.x.a[aVar.ordinal()];
        j$.time.ZoneId zoneId = this.c;
        j$.time.LocalDateTime localDateTime = this.a;
        if (i == 1) {
            return p(j, localDateTime.b.d, zoneId);
        }
        if (i != 2) {
            return C(localDateTime.a(j, lVar));
        }
        j$.time.ZoneOffset zoneOffsetQ = j$.time.ZoneOffset.Q(aVar.b.a(j, aVar));
        return (zoneOffsetQ.equals(this.b) || !zoneId.getRules().f(localDateTime).contains(zoneOffsetQ)) ? this : new j$.time.ZonedDateTime(localDateTime, zoneId, zoneOffsetQ);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        return (lVar instanceof j$.time.temporal.a) || (lVar != null && lVar.h(this));
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(j$.time.chrono.ChronoZonedDateTime<?> chronoZonedDateTime) {
        return j$.com.android.tools.r8.a.d(this, chronoZonedDateTime);
    }

    @Override // j$.time.temporal.Temporal
    public final long d(j$.time.temporal.Temporal temporal, j$.time.temporal.TemporalUnit temporalUnit) {
        j$.time.ZonedDateTime zonedDateTimeR = r(temporal);
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            return temporalUnit.between(this, zonedDateTimeR);
        }
        j$.time.LocalDateTime localDateTime = zonedDateTimeR.a;
        j$.time.ZoneId zoneId = this.c;
        j$.util.Objects.requireNonNull(zoneId, "zone");
        if (!zonedDateTimeR.c.equals(zoneId)) {
            zonedDateTimeR = p(localDateTime.toEpochSecond(zonedDateTimeR.b), localDateTime.b.d, zoneId);
        }
        j$.time.LocalDateTime localDateTime2 = zonedDateTimeR.a;
        j$.time.temporal.ChronoUnit chronoUnit = (j$.time.temporal.ChronoUnit) temporalUnit;
        int iCompareTo = chronoUnit.compareTo(j$.time.temporal.ChronoUnit.DAYS);
        j$.time.LocalDateTime localDateTime3 = this.a;
        return (iCompareTo < 0 || chronoUnit == j$.time.temporal.ChronoUnit.FOREVER) ? new j$.time.OffsetDateTime(localDateTime3, this.b).d(new j$.time.OffsetDateTime(localDateTime2, zonedDateTimeR.b), temporalUnit) : localDateTime3.d(localDateTime2, temporalUnit);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.ZonedDateTime) {
            j$.time.ZonedDateTime zonedDateTime = (j$.time.ZonedDateTime) obj;
            if (this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.ChronoZonedDateTime g(j$.time.ZoneId zoneId) {
        j$.util.Objects.requireNonNull(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        j$.time.ZoneOffset zoneOffset = this.b;
        j$.time.LocalDateTime localDateTime = this.a;
        return p(localDateTime.toEpochSecond(zoneOffset), localDateTime.b.d, zoneId);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.a getChronology() {
        return ((j$.time.LocalDate) toLocalDate()).getChronology();
    }

    public int getDayOfMonth() {
        return this.a.a.getDayOfMonth();
    }

    public j$.time.DayOfWeek getDayOfWeek() {
        return this.a.a.getDayOfWeek();
    }

    public int getHour() {
        return this.a.b.a;
    }

    public int getMinute() {
        return this.a.b.b;
    }

    public int getMonthValue() {
        return this.a.a.getMonthValue();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.ZoneOffset getOffset() {
        return this.b;
    }

    public int getYear() {
        return this.a.a.getYear();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public j$.time.ZoneId getZone() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return j$.com.android.tools.r8.a.h(this, lVar);
        }
        int i = j$.time.x.a[((j$.time.temporal.a) lVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.h(lVar) : this.b.getTotalSeconds();
        }
        j$.time.g.f("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        return 0;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ java.lang.Integer.rotateLeft(this.c.hashCode(), 3);
    }

    public boolean isAfter(j$.time.chrono.ChronoZonedDateTime chronoZonedDateTime) {
        long epochSecond = toEpochSecond();
        long epochSecond2 = chronoZonedDateTime.toEpochSecond();
        return epochSecond > epochSecond2 || (epochSecond == epochSecond2 && toLocalTime().d > chronoZonedDateTime.toLocalTime().d);
    }

    public boolean isBefore(j$.time.chrono.ChronoZonedDateTime chronoZonedDateTime) {
        long epochSecond = toEpochSecond();
        long epochSecond2 = chronoZonedDateTime.toEpochSecond();
        return epochSecond < epochSecond2 || (epochSecond == epochSecond2 && toLocalTime().d < chronoZonedDateTime.toLocalTime().d);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            return (lVar == j$.time.temporal.a.INSTANT_SECONDS || lVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) lVar).b : this.a.l(lVar);
        }
        return lVar.k(this);
    }

    public j$.time.ZonedDateTime plus(j$.time.temporal.TemporalAmount temporalAmount) {
        if (!(temporalAmount instanceof j$.time.q)) {
            j$.util.Objects.requireNonNull(temporalAmount, "amountToAdd");
            return (j$.time.ZonedDateTime) temporalAmount.h(this);
        }
        j$.time.LocalDateTime localDateTime = this.a;
        return C(localDateTime.S(localDateTime.a.J((j$.time.q) temporalAmount), localDateTime.b));
    }

    public j$.time.ZonedDateTime plusDays(long j) {
        return C(this.a.N(j));
    }

    public j$.time.ZonedDateTime plusHours(long j) {
        j$.time.LocalDateTime localDateTime = this.a;
        return B(localDateTime.P(localDateTime.a, j, 0L, 0L, 0L));
    }

    public j$.time.ZonedDateTime plusWeeks(long j) {
        j$.time.LocalDateTime localDateTime = this.a;
        return C(localDateTime.S(localDateTime.a.V(j), localDateTime.b));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long toEpochSecond() {
        return j$.com.android.tools.r8.a.r(this);
    }

    public j$.time.Instant toInstant() {
        return j$.time.Instant.ofEpochSecond(toEpochSecond(), toLocalTime().d);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.j toLocalTime() {
        return this.a.b;
    }

    public final java.lang.String toString() {
        java.lang.String string = this.a.toString();
        j$.time.ZoneOffset zoneOffset = this.b;
        java.lang.String str = string + zoneOffset.c;
        j$.time.ZoneId zoneId = this.c;
        return zoneOffset != zoneId ? j$.desugar.sun.nio.fs.h.b(str, "[", zoneId.toString(), "]") : str;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.ChronoZonedDateTime w(j$.time.ZoneId zoneId) {
        j$.util.Objects.requireNonNull(zoneId, "zone");
        return !this.c.equals(zoneId) ? t(this.a, zoneId, this.b) : this;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: with, reason: merged with bridge method [inline-methods] */
    public j$.time.ZonedDateTime x(j$.time.temporal.TemporalAdjuster temporalAdjuster) {
        boolean z = temporalAdjuster instanceof j$.time.LocalDate;
        j$.time.LocalDateTime localDateTime = this.a;
        if (z) {
            return C(j$.time.LocalDateTime.B((j$.time.LocalDate) temporalAdjuster, localDateTime.b));
        }
        if (temporalAdjuster instanceof j$.time.j) {
            return C(j$.time.LocalDateTime.B(localDateTime.a, (j$.time.j) temporalAdjuster));
        }
        if (temporalAdjuster instanceof j$.time.LocalDateTime) {
            return C((j$.time.LocalDateTime) temporalAdjuster);
        }
        boolean z2 = temporalAdjuster instanceof j$.time.OffsetDateTime;
        j$.time.ZoneId zoneId = this.c;
        if (z2) {
            j$.time.OffsetDateTime offsetDateTime = (j$.time.OffsetDateTime) temporalAdjuster;
            return t(offsetDateTime.toLocalDateTime(), zoneId, offsetDateTime.b);
        }
        if (temporalAdjuster instanceof j$.time.Instant) {
            j$.time.Instant instant = (j$.time.Instant) temporalAdjuster;
            return p(instant.getEpochSecond(), instant.getNano(), zoneId);
        }
        if (!(temporalAdjuster instanceof j$.time.ZoneOffset)) {
            return (j$.time.ZonedDateTime) temporalAdjuster.p(this);
        }
        j$.time.ZoneOffset zoneOffset = (j$.time.ZoneOffset) temporalAdjuster;
        return (zoneOffset.equals(this.b) || !zoneId.getRules().f(localDateTime).contains(zoneOffset)) ? this : new j$.time.ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public j$.time.ZonedDateTime withHour(int i) {
        j$.time.LocalDateTime localDateTime = this.a;
        return C(localDateTime.S(localDateTime.a, localDateTime.b.W(i)));
    }

    public j$.time.ZonedDateTime withMinute(int i) {
        j$.time.LocalDateTime localDateTime = this.a;
        j$.time.j jVarT = localDateTime.b;
        if (jVarT.b != i) {
            j$.time.temporal.a.MINUTE_OF_HOUR.t(i);
            jVarT = j$.time.j.t(jVarT.a, i, jVarT.c, jVarT.d);
        }
        return C(localDateTime.S(localDateTime.a, jVarT));
    }

    public j$.time.ZonedDateTime withNano(int i) {
        j$.time.LocalDateTime localDateTime = this.a;
        return C(localDateTime.S(localDateTime.a, localDateTime.b.X(i)));
    }

    public j$.time.ZonedDateTime withSecond(int i) {
        j$.time.LocalDateTime localDateTime = this.a;
        j$.time.j jVarT = localDateTime.b;
        if (jVarT.c != i) {
            j$.time.temporal.a.SECOND_OF_MINUTE.t(i);
            jVarT = j$.time.j.t(jVarT.a, jVarT.b, i, jVarT.d);
        }
        return C(localDateTime.S(localDateTime.a, jVarT));
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
    public final j$.time.ZonedDateTime b(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            return (j$.time.ZonedDateTime) temporalUnit.h(this, j);
        }
        j$.time.temporal.ChronoUnit chronoUnit = (j$.time.temporal.ChronoUnit) temporalUnit;
        boolean z = chronoUnit.compareTo(j$.time.temporal.ChronoUnit.DAYS) >= 0 && chronoUnit != j$.time.temporal.ChronoUnit.FOREVER;
        j$.time.LocalDateTime localDateTime = this.a;
        return z ? C(localDateTime.b(j, temporalUnit)) : B(localDateTime.b(j, temporalUnit));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public j$.time.LocalDate toLocalDate() {
        return this.a.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public j$.time.LocalDateTime toLocalDateTime() {
        return this.a;
    }
}
