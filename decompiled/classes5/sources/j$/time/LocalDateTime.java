package j$.time;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class LocalDateTime implements j$.time.temporal.Temporal, j$.time.temporal.TemporalAdjuster, j$.time.chrono.d, java.io.Serializable {
    public static final j$.time.LocalDateTime c = B(j$.time.LocalDate.d, j$.time.j.e);
    public static final j$.time.LocalDateTime d = B(j$.time.LocalDate.e, j$.time.j.f);
    private static final long serialVersionUID = 6207766400415563566L;
    public final j$.time.LocalDate a;
    public final j$.time.j b;

    public LocalDateTime(j$.time.LocalDate localDate, j$.time.j jVar) {
        this.a = localDate;
        this.b = jVar;
    }

    public static j$.time.LocalDateTime B(j$.time.LocalDate localDate, j$.time.j jVar) {
        j$.util.Objects.requireNonNull(localDate, "date");
        j$.util.Objects.requireNonNull(jVar, "time");
        return new j$.time.LocalDateTime(localDate, jVar);
    }

    public static j$.time.LocalDateTime C(long j, int i, j$.time.ZoneOffset zoneOffset) {
        j$.util.Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.t(j2);
        long totalSeconds = j + ((long) zoneOffset.getTotalSeconds());
        return new j$.time.LocalDateTime(j$.time.LocalDate.Q(j$.com.android.tools.r8.a.C(totalSeconds, 86400L)), j$.time.j.L((((long) ((int) j$.com.android.tools.r8.a.M(totalSeconds, 86400L))) * 1000000000) + j2));
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    public static j$.time.LocalDateTime t(j$.time.temporal.Temporal temporal) {
        if (temporal instanceof j$.time.LocalDateTime) {
            return (j$.time.LocalDateTime) temporal;
        }
        if (temporal instanceof j$.time.ZonedDateTime) {
            return ((j$.time.ZonedDateTime) temporal).toLocalDateTime();
        }
        if (temporal instanceof j$.time.OffsetDateTime) {
            return ((j$.time.OffsetDateTime) temporal).toLocalDateTime();
        }
        try {
            return new j$.time.LocalDateTime(j$.time.LocalDate.from(temporal), j$.time.j.z(temporal));
        } catch (j$.time.DateTimeException e) {
            throw new j$.time.DateTimeException(j$.desugar.sun.nio.fs.h.b("Unable to obtain LocalDateTime from TemporalAccessor: ", java.lang.String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
        }
    }

    private java.lang.Object writeReplace() {
        return new j$.time.r((byte) 5, this);
    }

    @Override // j$.time.chrono.d
    public final j$.time.chrono.ChronoZonedDateTime A(j$.time.ZoneId zoneId) {
        return j$.time.ZonedDateTime.t(this, zoneId, null);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) lVar).y() ? this.b.D(lVar) : this.a.D(lVar);
        }
        return lVar.l(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object G(j$.time.temporal.TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.m.f ? this.a : j$.com.android.tools.r8.a.n(this, temporalQuery);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.d dVar) {
        return dVar instanceof j$.time.LocalDateTime ? r((j$.time.LocalDateTime) dVar) : j$.com.android.tools.r8.a.c(this, dVar);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final j$.time.LocalDateTime b(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            return (j$.time.LocalDateTime) temporalUnit.h(this, j);
        }
        switch (j$.time.h.a[((j$.time.temporal.ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return P(this.a, 0L, 0L, 0L, j);
            case 2:
                j$.time.LocalDateTime localDateTimeN = N(j / 86400000000L);
                return localDateTimeN.P(localDateTimeN.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                j$.time.LocalDateTime localDateTimeN2 = N(j / 86400000);
                return localDateTimeN2.P(localDateTimeN2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return O(j);
            case 5:
                return P(this.a, 0L, j, 0L, 0L);
            case 6:
                return P(this.a, j, 0L, 0L, 0L);
            case 7:
                j$.time.LocalDateTime localDateTimeN3 = N(j / 256);
                return localDateTimeN3.P(localDateTimeN3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return S(this.a.b(j, temporalUnit), this.b);
        }
    }

    public final j$.time.LocalDateTime N(long j) {
        return S(this.a.plusDays(j), this.b);
    }

    public final j$.time.LocalDateTime O(long j) {
        return P(this.a, 0L, 0L, j, 0L);
    }

    public final j$.time.LocalDateTime P(j$.time.LocalDate localDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j$.time.j jVarL = this.b;
        if (j5 == 0) {
            return S(localDate, jVarL);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jT = jVarL.T();
        long j10 = j9 + jT;
        long jC = j$.com.android.tools.r8.a.C(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long jM = j$.com.android.tools.r8.a.M(j10, 86400000000000L);
        if (jM != jT) {
            jVarL = j$.time.j.L(jM);
        }
        return S(localDate.plusDays(jC), jVarL);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final j$.time.LocalDateTime a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return (j$.time.LocalDateTime) lVar.r(this, j);
        }
        boolean zY = ((j$.time.temporal.a) lVar).y();
        j$.time.j jVar = this.b;
        j$.time.LocalDate localDate = this.a;
        return zY ? S(localDate, jVar.a(j, lVar)) : S(localDate.a(j, lVar), jVar);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final j$.time.LocalDateTime x(j$.time.LocalDate localDate) {
        return j$.desugar.sun.nio.fs.h.c(localDate) ? S(localDate, this.b) : (j$.time.LocalDateTime) localDate.p(this);
    }

    public final j$.time.LocalDateTime S(j$.time.LocalDate localDate, j$.time.j jVar) {
        return (this.a == localDate && this.b == jVar) ? this : new j$.time.LocalDateTime(localDate, jVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
            if (aVar.isDateBased() || aVar.y()) {
                return true;
            }
        } else if (lVar != null && lVar.h(this)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // j$.time.temporal.Temporal
    public final long d(j$.time.temporal.Temporal temporal, j$.time.temporal.TemporalUnit temporalUnit) {
        long jO;
        long j;
        j$.time.LocalDateTime localDateTimeT = t(temporal);
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            return temporalUnit.between(this, localDateTimeT);
        }
        j$.time.temporal.ChronoUnit chronoUnit = (j$.time.temporal.ChronoUnit) temporalUnit;
        int iCompareTo = chronoUnit.compareTo(j$.time.temporal.ChronoUnit.DAYS);
        j$.time.j jVar = this.b;
        j$.time.chrono.ChronoLocalDate chronoLocalDate = this.a;
        if (iCompareTo >= 0) {
            j$.time.LocalDate localDatePlusDays = localDateTimeT.a;
            j$.time.j jVar2 = localDateTimeT.b;
            if (localDatePlusDays.isAfter(chronoLocalDate) && jVar2.compareTo(jVar) < 0) {
                localDatePlusDays = localDatePlusDays.minusDays(1L);
            } else if (localDatePlusDays.isBefore(chronoLocalDate) && jVar2.compareTo(jVar) > 0) {
                localDatePlusDays = localDatePlusDays.plusDays(1L);
            }
            return chronoLocalDate.d(localDatePlusDays, temporalUnit);
        }
        j$.time.LocalDate localDate = localDateTimeT.a;
        j$.time.j jVar3 = localDateTimeT.b;
        chronoLocalDate.getClass();
        long jE = localDate.E() - chronoLocalDate.E();
        if (jE == 0) {
            return jVar.d(jVar3, temporalUnit);
        }
        long jT = jVar3.T() - jVar.T();
        if (jE > 0) {
            jO = jE - 1;
            j = jT + 86400000000000L;
        } else {
            jO = jE + 1;
            j = jT - 86400000000000L;
        }
        switch (j$.time.h.a[chronoUnit.ordinal()]) {
            case 1:
                jO = j$.com.android.tools.r8.a.O(jO, 86400000000000L);
                break;
            case 2:
                jO = j$.com.android.tools.r8.a.O(jO, 86400000000L);
                j /= 1000;
                break;
            case 3:
                jO = j$.com.android.tools.r8.a.O(jO, 86400000L);
                j /= 1000000;
                break;
            case 4:
                jO = j$.com.android.tools.r8.a.O(jO, 86400L);
                j /= 1000000000;
                break;
            case 5:
                jO = j$.com.android.tools.r8.a.O(jO, 1440L);
                j /= 60000000000L;
                break;
            case 6:
                jO = j$.com.android.tools.r8.a.O(jO, 24L);
                j /= 3600000000000L;
                break;
            case 7:
                jO = j$.com.android.tools.r8.a.O(jO, 2L);
                j /= 43200000000000L;
                break;
        }
        return j$.com.android.tools.r8.a.N(jO, j);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.LocalDateTime) {
            j$.time.LocalDateTime localDateTime = (j$.time.LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String format(j$.time.format.DateTimeFormatter dateTimeFormatter) {
        j$.util.Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.chrono.d
    public final j$.time.chrono.a getChronology() {
        return ((j$.time.LocalDate) toLocalDate()).getChronology();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) lVar).y() ? this.b.h(lVar) : this.a.h(lVar);
        }
        return j$.time.temporal.m.a(this, lVar);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.k(this);
        }
        if (!((j$.time.temporal.a) lVar).y()) {
            return this.a.l(lVar);
        }
        j$.time.j jVar = this.b;
        jVar.getClass();
        return j$.time.temporal.m.d(jVar, lVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.Temporal p(j$.time.temporal.Temporal temporal) {
        return temporal.a(((j$.time.LocalDate) toLocalDate()).E(), j$.time.temporal.a.EPOCH_DAY).a(toLocalTime().T(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int r(j$.time.LocalDateTime localDateTime) {
        int iR = this.a.r(localDateTime.a);
        return iR == 0 ? this.b.compareTo(localDateTime.b) : iR;
    }

    public /* synthetic */ long toEpochSecond(j$.time.ZoneOffset zoneOffset) {
        return j$.com.android.tools.r8.a.q(this, zoneOffset);
    }

    @Override // j$.time.chrono.d
    public final j$.time.chrono.ChronoLocalDate toLocalDate() {
        return this.a;
    }

    @Override // j$.time.chrono.d
    public final j$.time.j toLocalTime() {
        return this.b;
    }

    public final java.lang.String toString() {
        return j$.desugar.sun.nio.fs.h.a(this.a.toString(), "T", this.b.toString());
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

    /* JADX WARN: Type inference failed for: r4v8, types: [boolean, int] */
    public final boolean z(j$.time.chrono.d dVar) {
        if (dVar instanceof j$.time.LocalDateTime) {
            return r((j$.time.LocalDateTime) dVar) >>> 31;
        }
        long jE = this.a.E();
        long jE2 = dVar.toLocalDate().E();
        return jE < jE2 || (jE == jE2 && this.b.T() < dVar.toLocalTime().T());
    }
}
