package j$.time;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class LocalDate implements j$.time.temporal.Temporal, j$.time.temporal.TemporalAdjuster, j$.time.chrono.ChronoLocalDate, java.io.Serializable {
    public static final j$.time.LocalDate d = of(-999999999, 1, 1);
    public static final j$.time.LocalDate e = of(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        of(1970, 1, 1);
    }

    public LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static j$.time.LocalDate P(j$.time.a aVar) {
        j$.util.Objects.requireNonNull(aVar, "clock");
        return ofInstant(j$.time.Instant.ofEpochMilli(java.lang.System.currentTimeMillis()), aVar.b);
    }

    public static j$.time.LocalDate Q(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.t(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + ((long) (i2 / 10));
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new j$.time.LocalDate(aVar.b.a(j7, aVar), i3, i4);
    }

    public static j$.time.LocalDate R(int i, int i2) {
        long j = i;
        j$.time.temporal.a.YEAR.t(j);
        j$.time.temporal.a.DAY_OF_YEAR.t(i2);
        boolean zD = j$.time.chrono.q.c.D(j);
        if (i2 == 366 && !zD) {
            j$.time.g.d("Invalid date 'DayOfYear 366' as '", i, "' is not a leap year");
            return null;
        }
        j$.time.k kVarB = j$.time.k.B(((i2 - 1) / 31) + 1);
        if (i2 > (kVarB.t(zD) + kVarB.r(zD)) - 1) {
            kVarB = j$.time.k.a[(kVarB.ordinal() + 13) % 12];
        }
        return new j$.time.LocalDate(i, kVarB.getValue(), (i2 - kVarB.r(zD)) + 1);
    }

    public static j$.time.LocalDate X(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = java.lang.Math.min(i3, j$.time.chrono.q.c.D((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = java.lang.Math.min(i3, 30);
        }
        return new j$.time.LocalDate(i, i2, i3);
    }

    public static j$.time.LocalDate from(j$.time.temporal.TemporalAccessor temporalAccessor) {
        j$.util.Objects.requireNonNull(temporalAccessor, "temporal");
        j$.time.LocalDate localDate = (j$.time.LocalDate) temporalAccessor.G(j$.time.temporal.m.f);
        if (localDate != null) {
            return localDate;
        }
        j$.time.g.h(j$.desugar.sun.nio.fs.h.b("Unable to obtain LocalDate from TemporalAccessor: ", java.lang.String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()));
        return null;
    }

    public static j$.time.LocalDate of(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.t(i);
        j$.time.temporal.a.MONTH_OF_YEAR.t(i2);
        j$.time.temporal.a.DAY_OF_MONTH.t(i3);
        return t(i, i2, i3);
    }

    public static j$.time.LocalDate ofInstant(j$.time.Instant instant, j$.time.ZoneId zoneId) {
        j$.util.Objects.requireNonNull(instant, "instant");
        j$.util.Objects.requireNonNull(zoneId, "zone");
        return Q(j$.com.android.tools.r8.a.C(instant.getEpochSecond() + ((long) zoneId.getRules().d(instant).getTotalSeconds()), 86400L));
    }

    public static j$.time.LocalDate parse(java.lang.CharSequence charSequence) {
        j$.time.format.DateTimeFormatter dateTimeFormatter = j$.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        j$.util.Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (j$.time.LocalDate) dateTimeFormatter.parse(charSequence, new j$.desugar.sun.nio.fs.n((byte) 1));
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    public static j$.time.LocalDate t(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (j$.time.chrono.q.c.D(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    j$.time.g.d("Invalid date 'February 29' as '", i, "' is not a leap year");
                    return null;
                }
                throw new j$.time.DateTimeException("Invalid date '" + j$.time.k.B(i2).name() + " " + i3 + "'");
            }
        }
        return new j$.time.LocalDate(i, i2, i3);
    }

    private java.lang.Object writeReplace() {
        return new j$.time.r((byte) 3, this);
    }

    public final int B() {
        return (j$.time.k.B(this.b).r(s()) + this.c) - 1;
    }

    public final long C() {
        return ((((long) this.a) * 12) + ((long) this.b)) - 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(this);
        }
        if (lVar == j$.time.temporal.a.EPOCH_DAY) {
            return E();
        }
        return lVar == j$.time.temporal.a.PROLEPTIC_MONTH ? C() : z(lVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long E() {
        long j;
        long j2 = this.a;
        long j3 = this.b;
        long j4 = 365 * j2;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.c - 1));
        if (j3 > 2) {
            j5 = !s() ? j5 - 2 : j5 - 1;
        }
        return j5 - 719528;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.d F(j$.time.j jVar) {
        return j$.time.LocalDateTime.B(this, jVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object G(j$.time.temporal.TemporalQuery temporalQuery) {
        return temporalQuery != j$.time.temporal.m.f ? j$.com.android.tools.r8.a.m(this, temporalQuery) : this;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.k H() {
        return getYear() >= 1 ? j$.time.chrono.r.CE : j$.time.chrono.r.BCE;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int K() {
        return s() ? 366 : 365;
    }

    public final int L() {
        short s = this.b;
        if (s != 2) {
            return (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31;
        }
        return s() ? 29 : 28;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof j$.time.LocalDate ? r((j$.time.LocalDate) chronoLocalDate) : j$.com.android.tools.r8.a.b(this, chronoLocalDate);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final j$.time.LocalDate y(long j, j$.time.temporal.ChronoUnit chronoUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, chronoUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, chronoUnit);
    }

    public final long O(j$.time.LocalDate localDate) {
        return (((localDate.C() << 5) + ((long) localDate.getDayOfMonth())) - ((C() << 5) + ((long) getDayOfMonth()))) / 32;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final j$.time.LocalDate b(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            return (j$.time.LocalDate) temporalUnit.h(this, j);
        }
        switch (j$.time.f.b[((j$.time.temporal.ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusDays(j);
            case 2:
                return V(j);
            case 3:
                return U(j);
            case 4:
                return W(j);
            case 5:
                return W(j$.com.android.tools.r8.a.O(j, 10L));
            case 6:
                return W(j$.com.android.tools.r8.a.O(j, 100L));
            case 7:
                return W(j$.com.android.tools.r8.a.O(j, 1000L));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.com.android.tools.r8.a.N(D(aVar), j), aVar);
            default:
                j$.time.g.f("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
                return null;
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final j$.time.LocalDate J(j$.time.q qVar) {
        return U((((long) qVar.a) * 12) + ((long) qVar.b)).plusDays(qVar.c);
    }

    public final j$.time.LocalDate U(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return X(aVar.b.a(j$.com.android.tools.r8.a.C(j2, 12L), aVar), ((int) j$.com.android.tools.r8.a.M(j2, 12L)) + 1, this.c);
    }

    public final j$.time.LocalDate V(long j) {
        return plusDays(j$.com.android.tools.r8.a.O(j, 7L));
    }

    public final j$.time.LocalDate W(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return X(aVar.b.a(((long) this.a) + j, aVar), this.b, this.c);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final j$.time.LocalDate a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return (j$.time.LocalDate) lVar.r(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        aVar.t(j);
        int i = j$.time.f.a[aVar.ordinal()];
        int i2 = this.a;
        switch (i) {
            case 1:
                return withDayOfMonth((int) j);
            case 2:
                int i3 = (int) j;
                return B() != i3 ? R(i2, i3) : this;
            case 3:
                return V(j - D(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (i2 < 1) {
                    j = 1 - j;
                }
                return Z((int) j);
            case 5:
                return plusDays(j - ((long) getDayOfWeek().getValue()));
            case 6:
                return plusDays(j - D(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j - D(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return Q(j);
            case 9:
                return V(j - D(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i4 = (int) j;
                if (this.b == i4) {
                    return this;
                }
                j$.time.temporal.a.MONTH_OF_YEAR.t(i4);
                return X(i2, i4, this.c);
            case 11:
                return U(j - C());
            case 12:
                return Z((int) j);
            case 13:
                return D(j$.time.temporal.a.ERA) != j ? Z(1 - i2) : this;
            default:
                j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
                return null;
        }
    }

    public final j$.time.LocalDate Z(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.t(i);
        return X(i, this.b, this.c);
    }

    public j$.time.ZonedDateTime atStartOfDay(j$.time.ZoneId zoneId) {
        j$.util.Objects.requireNonNull(zoneId, "zone");
        j$.time.LocalDateTime localDateTimeB = j$.time.LocalDateTime.B(this, j$.time.j.g);
        if (!(zoneId instanceof j$.time.ZoneOffset)) {
            java.lang.Object objE = zoneId.getRules().e(localDateTimeB);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            if (bVar != null && bVar.h()) {
                localDateTimeB = bVar.b.O(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds());
            }
        }
        return j$.time.ZonedDateTime.t(localDateTimeB, zoneId, null);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        return j$.com.android.tools.r8.a.k(this, lVar);
    }

    @Override // j$.time.temporal.Temporal
    public final long d(j$.time.temporal.Temporal temporal, j$.time.temporal.TemporalUnit temporalUnit) {
        j$.time.LocalDate localDateFrom = from(temporal);
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            return temporalUnit.between(this, localDateFrom);
        }
        switch (j$.time.f.b[((j$.time.temporal.ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return localDateFrom.E() - E();
            case 2:
                return (localDateFrom.E() - E()) / 7;
            case 3:
                return O(localDateFrom);
            case 4:
                return O(localDateFrom) / 12;
            case 5:
                return O(localDateFrom) / 120;
            case 6:
                return O(localDateFrom) / 1200;
            case 7:
                return O(localDateFrom) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return localDateFrom.D(aVar) - D(aVar);
            default:
                j$.time.g.f("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof j$.time.LocalDate) && r((j$.time.LocalDate) obj) == 0;
        }
        return true;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.a getChronology() {
        return j$.time.chrono.q.c;
    }

    public int getDayOfMonth() {
        return this.c;
    }

    public j$.time.DayOfWeek getDayOfWeek() {
        return j$.time.DayOfWeek.r(((int) j$.com.android.tools.r8.a.M(E() + 3, 7L)) + 1);
    }

    public int getMonthValue() {
        return this.b;
    }

    public int getYear() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? z(lVar) : j$.time.temporal.m.a(this, lVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        int i = this.a;
        return (i & (-2048)) ^ (((i << 11) + (this.b << 6)) + this.c);
    }

    public boolean isAfter(j$.time.chrono.ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof j$.time.LocalDate) {
            if (r((j$.time.LocalDate) chronoLocalDate) <= 0) {
                return false;
            }
        } else if (E() <= chronoLocalDate.E()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    public boolean isBefore(j$.time.chrono.ChronoLocalDate chronoLocalDate) {
        return (chronoLocalDate instanceof j$.time.LocalDate ? r((j$.time.LocalDate) chronoLocalDate) : (E() > chronoLocalDate.E() ? 1 : (E() == chronoLocalDate.E() ? 0 : -1))) >>> 31;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.k(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        if (!aVar.isDateBased()) {
            j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
            return null;
        }
        int i = j$.time.f.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.o.f(1L, L());
        }
        if (i == 2) {
            return j$.time.temporal.o.f(1L, K());
        }
        if (i == 3) {
            return j$.time.temporal.o.f(1L, (j$.time.k.B(this.b) != j$.time.k.FEBRUARY || s()) ? 5L : 4L);
        }
        if (i != 4) {
            return aVar.b;
        }
        return j$.time.temporal.o.f(1L, getYear() <= 0 ? 1000000000L : 999999999L);
    }

    public j$.time.LocalDate minusDays(long j) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = plusDays(Long.MAX_VALUE);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.plusDays(j2);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.Temporal p(j$.time.temporal.Temporal temporal) {
        return temporal.a(E(), j$.time.temporal.a.EPOCH_DAY);
    }

    public j$.time.LocalDate plusDays(long j) {
        j$.time.LocalDate localDate;
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.c) + j;
        if (j2 > 0) {
            short s = this.b;
            int i = this.a;
            if (j2 <= 28) {
                return new j$.time.LocalDate(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long jL = L();
                if (j2 <= jL) {
                    return new j$.time.LocalDate(i, s, (int) j2);
                }
                if (s < 12) {
                    localDate = new j$.time.LocalDate(i, s + 1, (int) (j2 - jL));
                } else {
                    int i2 = i + 1;
                    j$.time.temporal.a.YEAR.t(i2);
                    localDate = new j$.time.LocalDate(i2, 1, (int) (j2 - jL));
                }
                return localDate;
            }
        }
        return Q(j$.com.android.tools.r8.a.N(E(), j));
    }

    public final int r(j$.time.LocalDate localDate) {
        int i = this.a - localDate.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - localDate.b;
        return i2 == 0 ? this.c - localDate.c : i2;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean s() {
        return j$.time.chrono.q.c.D(this.a);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final java.lang.String toString() {
        int i = this.a;
        int iAbs = java.lang.Math.abs(i);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        short s = this.b;
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        short s2 = this.c;
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: with, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public j$.time.LocalDate x(j$.time.temporal.TemporalAdjuster temporalAdjuster) {
        return temporalAdjuster instanceof j$.time.LocalDate ? (j$.time.LocalDate) temporalAdjuster : (j$.time.LocalDate) temporalAdjuster.p(this);
    }

    public j$.time.LocalDate withDayOfMonth(int i) {
        return this.c != i ? of(this.a, this.b, i) : this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int z(j$.time.temporal.l lVar) {
        int i;
        int iB;
        int i2 = j$.time.f.a[((j$.time.temporal.a) lVar).ordinal()];
        short s = this.c;
        int i3 = this.a;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return B();
            case 3:
                i = (s - 1) / 7;
                return i + 1;
            case 4:
                if (i3 < 1) {
                    return 1 - i3;
                }
                return i3;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                i = (s - 1) % 7;
                return i + 1;
            case 7:
                iB = (B() - 1) % 7;
                return iB + 1;
            case 8:
                j$.time.g.f("Invalid field 'EpochDay' for get() method, use getLong() instead");
                return 0;
            case 9:
                iB = (B() - 1) / 7;
                return iB + 1;
            case 10:
                return this.b;
            case 11:
                j$.time.g.f("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
                return 0;
            case 12:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
                return 0;
        }
    }
}
