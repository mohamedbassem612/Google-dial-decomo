package j$.time.chrono;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class j implements j$.time.chrono.ChronoZonedDateTime, java.io.Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient j$.time.chrono.f a;
    public final transient j$.time.ZoneOffset b;
    public final transient j$.time.ZoneId c;

    public j(j$.time.ZoneId zoneId, j$.time.ZoneOffset zoneOffset, j$.time.chrono.f fVar) {
        this.a = (j$.time.chrono.f) j$.util.Objects.requireNonNull(fVar, "dateTime");
        this.b = (j$.time.ZoneOffset) j$.util.Objects.requireNonNull(zoneOffset, "offset");
        this.c = (j$.time.ZoneId) j$.util.Objects.requireNonNull(zoneId, "zone");
    }

    public static j$.time.chrono.j p(j$.time.chrono.a aVar, j$.time.temporal.Temporal temporal) {
        j$.time.chrono.j jVar = (j$.time.chrono.j) temporal;
        if (aVar.equals(jVar.getChronology())) {
            return jVar;
        }
        throw new java.lang.ClassCastException(j$.desugar.sun.nio.fs.h.b("Chronology mismatch, required: ", aVar.C(), ", actual: ", jVar.getChronology().C()));
    }

    public static j$.time.chrono.j r(j$.time.ZoneId zoneId, j$.time.ZoneOffset zoneOffset, j$.time.chrono.f fVar) {
        j$.util.Objects.requireNonNull(fVar, "localDateTime");
        j$.util.Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof j$.time.ZoneOffset) {
            return new j$.time.chrono.j(zoneId, (j$.time.ZoneOffset) zoneId, fVar);
        }
        j$.time.zone.ZoneRules rules = zoneId.getRules();
        j$.time.LocalDateTime localDateTimeT = j$.time.LocalDateTime.t(fVar);
        java.util.List listF = rules.f(localDateTimeT);
        if (listF.size() == 1) {
            zoneOffset = (j$.time.ZoneOffset) listF.get(0);
        } else if (listF.size() == 0) {
            java.lang.Object objE = rules.e(localDateTimeT);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            fVar = fVar.z(fVar.a, 0L, 0L, j$.time.Duration.ofSeconds(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()).getSeconds(), 0L);
            zoneOffset = bVar.d;
        } else {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (j$.time.ZoneOffset) listF.get(0);
            }
            fVar = fVar;
        }
        j$.util.Objects.requireNonNull(zoneOffset, "offset");
        return new j$.time.chrono.j(zoneId, zoneOffset, fVar);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    public static j$.time.chrono.j t(j$.time.chrono.a aVar, j$.time.Instant instant, j$.time.ZoneId zoneId) {
        j$.time.ZoneOffset zoneOffsetD = zoneId.getRules().d(instant);
        j$.util.Objects.requireNonNull(zoneOffsetD, "offset");
        return new j$.time.chrono.j(zoneId, zoneOffsetD, (j$.time.chrono.f) aVar.G(j$.time.LocalDateTime.C(instant.getEpochSecond(), instant.getNano(), zoneOffsetD)));
    }

    private java.lang.Object writeReplace() {
        return new j$.time.chrono.c0((byte) 3, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(this);
        }
        int i = j$.time.chrono.h.a[((j$.time.temporal.a) lVar).ordinal()];
        if (i != 1) {
            return i != 2 ? ((j$.time.chrono.f) toLocalDateTime()).D(lVar) : getOffset().getTotalSeconds();
        }
        return toEpochSecond();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ java.lang.Object G(j$.time.temporal.TemporalQuery temporalQuery) {
        return j$.com.android.tools.r8.a.o(this, temporalQuery);
    }

    @Override // j$.time.temporal.Temporal
    public final j$.time.temporal.Temporal a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return p(getChronology(), lVar.r(this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        int i = j$.time.chrono.i.a[aVar.ordinal()];
        if (i == 1) {
            return b(j - j$.com.android.tools.r8.a.r(this), j$.time.temporal.ChronoUnit.SECONDS);
        }
        j$.time.ZoneId zoneId = this.c;
        j$.time.chrono.f fVar = this.a;
        if (i != 2) {
            return r(zoneId, this.b, fVar.a(j, lVar));
        }
        j$.time.ZoneOffset zoneOffsetQ = j$.time.ZoneOffset.Q(aVar.b.a(j, aVar));
        fVar.getClass();
        return t(getChronology(), j$.time.Instant.ofEpochSecond(fVar.B(zoneOffsetQ), fVar.toLocalTime().d), zoneId);
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
        j$.util.Objects.requireNonNull(temporal, "endExclusive");
        j$.time.chrono.ChronoZonedDateTime chronoZonedDateTimeW = getChronology().W(temporal);
        if (temporalUnit instanceof j$.time.temporal.ChronoUnit) {
            return this.a.d(chronoZonedDateTimeW.g(this.b).toLocalDateTime(), temporalUnit);
        }
        j$.util.Objects.requireNonNull(temporalUnit, "unit");
        return temporalUnit.between(this, chronoZonedDateTimeW);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof j$.time.chrono.ChronoZonedDateTime) && j$.com.android.tools.r8.a.d(this, (j$.time.chrono.ChronoZonedDateTime) obj) == 0;
        }
        return true;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.ChronoZonedDateTime g(j$.time.ZoneId zoneId) {
        j$.util.Objects.requireNonNull(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        j$.time.chrono.f fVar = this.a;
        fVar.getClass();
        return t(getChronology(), j$.time.Instant.ofEpochSecond(fVar.B(this.b), fVar.toLocalTime().d), zoneId);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.a getChronology() {
        return this.a.a.getChronology();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.ZoneOffset getOffset() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.ZoneId getZone() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int h(j$.time.temporal.l lVar) {
        return j$.com.android.tools.r8.a.h(this, lVar);
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ java.lang.Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.Temporal x(j$.time.LocalDate localDate) {
        return p(getChronology(), localDate.p(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            return (lVar == j$.time.temporal.a.INSTANT_SECONDS || lVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) lVar).b : this.a.l(lVar);
        }
        return lVar.k(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long toEpochSecond() {
        return j$.com.android.tools.r8.a.r(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.ChronoLocalDate toLocalDate() {
        return this.a.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.d toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.j toLocalTime() {
        return ((j$.time.chrono.f) toLocalDateTime()).toLocalTime();
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
        return r(zoneId, this.b, this.a);
    }

    @Override // j$.time.temporal.Temporal
    public final j$.time.temporal.Temporal y(long j, j$.time.temporal.ChronoUnit chronoUnit) {
        return p(getChronology(), j$.time.temporal.m.b(this, j, chronoUnit));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final j$.time.chrono.j b(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            return p(getChronology(), temporalUnit.h(this, j));
        }
        return p(getChronology(), this.a.b(j, temporalUnit).p(this));
    }
}
