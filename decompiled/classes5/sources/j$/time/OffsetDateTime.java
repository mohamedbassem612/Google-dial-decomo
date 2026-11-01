package j$.time;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class OffsetDateTime implements j$.time.temporal.Temporal, j$.time.temporal.TemporalAdjuster, java.lang.Comparable<j$.time.OffsetDateTime>, java.io.Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 2287754244819255394L;
    public final j$.time.LocalDateTime a;
    public final j$.time.ZoneOffset b;

    static {
        j$.time.LocalDateTime localDateTime = j$.time.LocalDateTime.c;
        j$.time.ZoneOffset zoneOffset = j$.time.ZoneOffset.g;
        localDateTime.getClass();
        new j$.time.OffsetDateTime(localDateTime, zoneOffset);
        j$.time.LocalDateTime localDateTime2 = j$.time.LocalDateTime.d;
        j$.time.ZoneOffset zoneOffset2 = j$.time.ZoneOffset.f;
        localDateTime2.getClass();
        new j$.time.OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public OffsetDateTime(j$.time.LocalDateTime localDateTime, j$.time.ZoneOffset zoneOffset) {
        this.a = (j$.time.LocalDateTime) j$.util.Objects.requireNonNull(localDateTime, "dateTime");
        this.b = (j$.time.ZoneOffset) j$.util.Objects.requireNonNull(zoneOffset, "offset");
    }

    public static j$.time.OffsetDateTime r(j$.time.Instant instant, j$.time.ZoneId zoneId) {
        j$.util.Objects.requireNonNull(instant, "instant");
        j$.util.Objects.requireNonNull(zoneId, "zone");
        j$.time.ZoneOffset zoneOffsetD = zoneId.getRules().d(instant);
        return new j$.time.OffsetDateTime(j$.time.LocalDateTime.C(instant.getEpochSecond(), instant.getNano(), zoneOffsetD), zoneOffsetD);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.r((byte) 10, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(this);
        }
        int i = j$.time.n.a[((j$.time.temporal.a) lVar).ordinal()];
        j$.time.ZoneOffset zoneOffset = this.b;
        j$.time.LocalDateTime localDateTime = this.a;
        if (i != 1) {
            return i != 2 ? localDateTime.D(lVar) : zoneOffset.getTotalSeconds();
        }
        return localDateTime.toEpochSecond(zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object G(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.m.d || temporalQuery == j$.time.temporal.m.e) {
            return this.b;
        }
        if (temporalQuery == j$.time.temporal.m.a) {
            return null;
        }
        j$.desugar.sun.nio.fs.n nVar = j$.time.temporal.m.f;
        j$.time.LocalDateTime localDateTime = this.a;
        if (temporalQuery == nVar) {
            return localDateTime.a;
        }
        if (temporalQuery == j$.time.temporal.m.g) {
            return localDateTime.b;
        }
        if (temporalQuery == j$.time.temporal.m.b) {
            return j$.time.chrono.q.c;
        }
        return temporalQuery == j$.time.temporal.m.c ? j$.time.temporal.ChronoUnit.NANOS : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.Temporal
    public final j$.time.temporal.Temporal a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return (j$.time.OffsetDateTime) lVar.r(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        int i = j$.time.n.a[aVar.ordinal()];
        j$.time.ZoneOffset zoneOffset = this.b;
        j$.time.LocalDateTime localDateTime = this.a;
        if (i != 1) {
            return i != 2 ? z(localDateTime.a(j, lVar), zoneOffset) : z(localDateTime, j$.time.ZoneOffset.Q(aVar.b.a(j, aVar)));
        }
        return r(j$.time.Instant.ofEpochSecond(j, localDateTime.b.d), zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        return (lVar instanceof j$.time.temporal.a) || (lVar != null && lVar.h(this));
    }

    @Override // java.lang.Comparable
    public final int compareTo(j$.time.OffsetDateTime offsetDateTime) {
        int iCompareTo;
        j$.time.OffsetDateTime offsetDateTime2 = offsetDateTime;
        j$.time.ZoneOffset zoneOffset = offsetDateTime2.b;
        j$.time.LocalDateTime localDateTime = offsetDateTime2.a;
        j$.time.ZoneOffset zoneOffset2 = this.b;
        if (zoneOffset2.equals(zoneOffset)) {
            iCompareTo = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            j$.time.LocalDateTime localDateTime2 = this.a;
            int iCompare = java.lang.Long.compare(localDateTime2.toEpochSecond(zoneOffset2), localDateTime.toEpochSecond(offsetDateTime2.b));
            iCompareTo = iCompare == 0 ? localDateTime2.b.d - localDateTime.b.d : iCompare;
        }
        return iCompareTo == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iCompareTo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14, types: [j$.time.OffsetDateTime] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // j$.time.temporal.Temporal
    public final long d(j$.time.temporal.Temporal temporal, j$.time.temporal.TemporalUnit temporalUnit) {
        j$.time.OffsetDateTime offsetDateTime;
        if (temporal instanceof j$.time.OffsetDateTime) {
            temporal = (j$.time.OffsetDateTime) temporal;
        } else {
            try {
                j$.time.ZoneOffset zoneOffsetN = j$.time.ZoneOffset.N(temporal);
                j$.time.LocalDate localDate = (j$.time.LocalDate) temporal.G(j$.time.temporal.m.f);
                j$.time.j jVar = (j$.time.j) temporal.G(j$.time.temporal.m.g);
                temporal = (localDate == null || jVar == null) ? r(j$.time.Instant.from(temporal), zoneOffsetN) : new j$.time.OffsetDateTime(j$.time.LocalDateTime.B(localDate, jVar), zoneOffsetN);
            } catch (j$.time.DateTimeException e) {
                throw new j$.time.DateTimeException(j$.desugar.sun.nio.fs.h.b("Unable to obtain OffsetDateTime from TemporalAccessor: ", java.lang.String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            return temporalUnit.between(this, temporal);
        }
        j$.time.ZoneOffset zoneOffset = temporal.b;
        j$.time.ZoneOffset zoneOffset2 = this.b;
        if (!zoneOffset2.equals(zoneOffset)) {
            offsetDateTime = temporal;
            offsetDateTime = new j$.time.OffsetDateTime(temporal.a.O(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()), zoneOffset2);
        }
        offsetDateTime = temporal;
        return this.a.d(offsetDateTime.a, temporalUnit);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.OffsetDateTime) {
            j$.time.OffsetDateTime offsetDateTime = (j$.time.OffsetDateTime) obj;
            if (this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.m.a(this, lVar);
        }
        int i = j$.time.n.a[((j$.time.temporal.a) lVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.h(lVar) : this.b.getTotalSeconds();
        }
        j$.time.g.f("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        return 0;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.b;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.Temporal x(j$.time.LocalDate localDate) {
        return !j$.desugar.sun.nio.fs.h.c(localDate) ? (j$.time.OffsetDateTime) localDate.p(this) : z(this.a.x(localDate), this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            return (lVar == j$.time.temporal.a.INSTANT_SECONDS || lVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) lVar).b : this.a.l(lVar);
        }
        return lVar.k(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.Temporal p(j$.time.temporal.Temporal temporal) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        j$.time.LocalDateTime localDateTime = this.a;
        return temporal.a(localDateTime.a.E(), aVar).a(localDateTime.b.T(), j$.time.temporal.a.NANO_OF_DAY).a(this.b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final j$.time.OffsetDateTime b(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        return temporalUnit instanceof j$.time.temporal.ChronoUnit ? z(this.a.b(j, temporalUnit), this.b) : (j$.time.OffsetDateTime) temporalUnit.h(this, j);
    }

    public j$.time.LocalDateTime toLocalDateTime() {
        return this.a;
    }

    public final java.lang.String toString() {
        return this.a.toString() + this.b.c;
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

    public final j$.time.OffsetDateTime z(j$.time.LocalDateTime localDateTime, j$.time.ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new j$.time.OffsetDateTime(localDateTime, zoneOffset);
    }
}
