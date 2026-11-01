package j$.time.temporal;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class f implements j$.time.temporal.l {
    public static final j$.time.temporal.f DAY_OF_QUARTER;
    public static final j$.time.temporal.f QUARTER_OF_YEAR;
    public static final j$.time.temporal.f WEEK_BASED_YEAR;
    public static final j$.time.temporal.f WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ j$.time.temporal.f[] b;

    static {
        j$.time.temporal.f fVar = new j$.time.temporal.f() { // from class: j$.time.temporal.b
            @Override // j$.time.temporal.l
            public final boolean h(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (temporalAccessor.c(j$.time.temporal.a.DAY_OF_YEAR) && temporalAccessor.c(j$.time.temporal.a.MONTH_OF_YEAR) && temporalAccessor.c(j$.time.temporal.a.YEAR)) {
                    j$.time.temporal.f fVar2 = j$.time.temporal.h.a;
                    if (j$.com.android.tools.r8.a.y(temporalAccessor).equals(j$.time.chrono.q.c)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.l
            public final j$.time.temporal.o k(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (!h(temporalAccessor)) {
                    j$.time.g.f("Unsupported field: DayOfQuarter");
                    return null;
                }
                long jD = temporalAccessor.D(j$.time.temporal.f.QUARTER_OF_YEAR);
                if (jD == 1) {
                    return j$.time.chrono.q.c.D(temporalAccessor.D(j$.time.temporal.a.YEAR)) ? j$.time.temporal.o.f(1L, 91L) : j$.time.temporal.o.f(1L, 90L);
                }
                if (jD == 2) {
                    return j$.time.temporal.o.f(1L, 91L);
                }
                return (jD == 3 || jD == 4) ? j$.time.temporal.o.f(1L, 92L) : range();
            }

            @Override // j$.time.temporal.l
            public final long l(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (!h(temporalAccessor)) {
                    j$.time.g.f("Unsupported field: DayOfQuarter");
                    return 0L;
                }
                return temporalAccessor.h(j$.time.temporal.a.DAY_OF_YEAR) - j$.time.temporal.f.a[((temporalAccessor.h(j$.time.temporal.a.MONTH_OF_YEAR) - 1) / 3) + (j$.time.chrono.q.c.D(temporalAccessor.D(j$.time.temporal.a.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.f, j$.time.temporal.l
            public final j$.time.temporal.TemporalAccessor p(java.util.HashMap map, j$.time.format.b0 b0Var, j$.time.format.c0 c0Var) {
                j$.time.LocalDate localDateOf;
                long jP;
                j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
                java.lang.Long l = (java.lang.Long) map.get(aVar);
                j$.time.temporal.l lVar = j$.time.temporal.f.QUARTER_OF_YEAR;
                java.lang.Long l2 = (java.lang.Long) map.get(lVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int iA = aVar.b.a(l.longValue(), aVar);
                long jLongValue = ((java.lang.Long) map.get(j$.time.temporal.f.DAY_OF_QUARTER)).longValue();
                j$.time.temporal.f fVar2 = j$.time.temporal.h.a;
                if (!j$.com.android.tools.r8.a.y(b0Var).equals(j$.time.chrono.q.c)) {
                    j$.time.g.h("Resolve requires IsoChronology");
                    return null;
                }
                if (c0Var == j$.time.format.c0.LENIENT) {
                    localDateOf = j$.time.LocalDate.of(iA, 1, 1).U(j$.com.android.tools.r8.a.O(j$.com.android.tools.r8.a.P(l2.longValue(), 1L), 3L));
                    jP = j$.com.android.tools.r8.a.P(jLongValue, 1L);
                } else {
                    localDateOf = j$.time.LocalDate.of(iA, ((lVar.range().a(l2.longValue(), lVar) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (c0Var == j$.time.format.c0.STRICT) {
                            k(localDateOf).b(jLongValue, this);
                        } else {
                            range().b(jLongValue, this);
                        }
                    }
                    jP = jLongValue - 1;
                }
                map.remove(this);
                map.remove(aVar);
                map.remove(lVar);
                return localDateOf.plusDays(jP);
            }

            @Override // j$.time.temporal.l
            public final j$.time.temporal.Temporal r(j$.time.temporal.Temporal temporal, long j) {
                long jL = l(temporal);
                range().b(j, this);
                j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_YEAR;
                return temporal.a((j - jL) + temporal.D(aVar), aVar);
            }

            @Override // j$.time.temporal.l
            public final j$.time.temporal.o range() {
                return j$.time.temporal.o.g(1L, 90L, 92L);
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = fVar;
        j$.time.temporal.f fVar2 = new j$.time.temporal.f() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.l
            public final boolean h(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (temporalAccessor.c(j$.time.temporal.a.MONTH_OF_YEAR)) {
                    j$.time.temporal.f fVar3 = j$.time.temporal.h.a;
                    if (j$.com.android.tools.r8.a.y(temporalAccessor).equals(j$.time.chrono.q.c)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.l
            public final j$.time.temporal.o k(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (h(temporalAccessor)) {
                    return range();
                }
                j$.time.g.f("Unsupported field: QuarterOfYear");
                return null;
            }

            @Override // j$.time.temporal.l
            public final long l(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (h(temporalAccessor)) {
                    return (temporalAccessor.D(j$.time.temporal.a.MONTH_OF_YEAR) + 2) / 3;
                }
                j$.time.g.f("Unsupported field: QuarterOfYear");
                return 0L;
            }

            @Override // j$.time.temporal.l
            public final j$.time.temporal.Temporal r(j$.time.temporal.Temporal temporal, long j) {
                long jL = l(temporal);
                range().b(j, this);
                j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
                return temporal.a(((j - jL) * 3) + temporal.D(aVar), aVar);
            }

            @Override // j$.time.temporal.l
            public final j$.time.temporal.o range() {
                return j$.time.temporal.o.f(1L, 4L);
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = fVar2;
        j$.time.temporal.f fVar3 = new j$.time.temporal.f() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.l
            public final boolean h(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (temporalAccessor.c(j$.time.temporal.a.EPOCH_DAY)) {
                    j$.time.temporal.f fVar4 = j$.time.temporal.h.a;
                    if (j$.com.android.tools.r8.a.y(temporalAccessor).equals(j$.time.chrono.q.c)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.l
            public final j$.time.temporal.o k(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (h(temporalAccessor)) {
                    return j$.time.temporal.o.f(1L, j$.time.temporal.f.z(j$.time.temporal.f.y(j$.time.LocalDate.from(temporalAccessor))));
                }
                j$.time.g.f("Unsupported field: WeekOfWeekBasedYear");
                return null;
            }

            @Override // j$.time.temporal.l
            public final long l(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (h(temporalAccessor)) {
                    return j$.time.temporal.f.t(j$.time.LocalDate.from(temporalAccessor));
                }
                j$.time.g.f("Unsupported field: WeekOfWeekBasedYear");
                return 0L;
            }

            @Override // j$.time.temporal.f, j$.time.temporal.l
            public final j$.time.temporal.TemporalAccessor p(java.util.HashMap map, j$.time.format.b0 b0Var, j$.time.format.c0 c0Var) {
                j$.time.LocalDate localDateA;
                long j;
                j$.time.temporal.l lVar = j$.time.temporal.f.WEEK_BASED_YEAR;
                java.lang.Long l = (java.lang.Long) map.get(lVar);
                j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_WEEK;
                java.lang.Long l2 = (java.lang.Long) map.get(aVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int iA = lVar.range().a(l.longValue(), lVar);
                long jLongValue = ((java.lang.Long) map.get(j$.time.temporal.f.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                j$.time.temporal.f fVar4 = j$.time.temporal.h.a;
                if (!j$.com.android.tools.r8.a.y(b0Var).equals(j$.time.chrono.q.c)) {
                    j$.time.g.h("Resolve requires IsoChronology");
                    return null;
                }
                j$.time.LocalDate localDateOf = j$.time.LocalDate.of(iA, 1, 4);
                if (c0Var == j$.time.format.c0.LENIENT) {
                    long jLongValue2 = l2.longValue();
                    if (jLongValue2 > 7) {
                        long j2 = jLongValue2 - 1;
                        localDateOf = localDateOf.V(j2 / 7);
                        j = j2 % 7;
                    } else {
                        if (jLongValue2 < 1) {
                            localDateOf = localDateOf.V(j$.com.android.tools.r8.a.P(jLongValue2, 7L) / 7);
                            j = (jLongValue2 + 6) % 7;
                        }
                        localDateA = localDateOf.V(j$.com.android.tools.r8.a.P(jLongValue, 1L)).a(jLongValue2, aVar);
                    }
                    jLongValue2 = j + 1;
                    localDateA = localDateOf.V(j$.com.android.tools.r8.a.P(jLongValue, 1L)).a(jLongValue2, aVar);
                } else {
                    int iA2 = aVar.b.a(l2.longValue(), aVar);
                    if (jLongValue < 1 || jLongValue > 52) {
                        if (c0Var == j$.time.format.c0.STRICT) {
                            j$.time.temporal.o.f(1L, j$.time.temporal.f.z(j$.time.temporal.f.y(localDateOf))).b(jLongValue, this);
                        } else {
                            range().b(jLongValue, this);
                        }
                    }
                    localDateA = localDateOf.V(jLongValue - 1).a(iA2, aVar);
                }
                j$.time.LocalDate localDate = localDateA;
                map.remove(this);
                map.remove(lVar);
                map.remove(aVar);
                return localDate;
            }

            @Override // j$.time.temporal.l
            public final j$.time.temporal.Temporal r(j$.time.temporal.Temporal temporal, long j) {
                range().b(j, this);
                return temporal.b(j$.com.android.tools.r8.a.P(j, l(temporal)), j$.time.temporal.ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.l
            public final j$.time.temporal.o range() {
                return j$.time.temporal.o.g(1L, 52L, 53L);
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = fVar3;
        j$.time.temporal.f fVar4 = new j$.time.temporal.f() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.l
            public final boolean h(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (temporalAccessor.c(j$.time.temporal.a.EPOCH_DAY)) {
                    j$.time.temporal.f fVar5 = j$.time.temporal.h.a;
                    if (j$.com.android.tools.r8.a.y(temporalAccessor).equals(j$.time.chrono.q.c)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.l
            public final j$.time.temporal.o k(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (h(temporalAccessor)) {
                    return j$.time.temporal.a.YEAR.b;
                }
                j$.time.g.f("Unsupported field: WeekBasedYear");
                return null;
            }

            @Override // j$.time.temporal.l
            public final long l(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (h(temporalAccessor)) {
                    return j$.time.temporal.f.y(j$.time.LocalDate.from(temporalAccessor));
                }
                j$.time.g.f("Unsupported field: WeekBasedYear");
                return 0L;
            }

            @Override // j$.time.temporal.l
            public final j$.time.temporal.Temporal r(j$.time.temporal.Temporal temporal, long j) {
                if (!h(temporal)) {
                    j$.time.g.f("Unsupported field: WeekBasedYear");
                    return null;
                }
                int iA = j$.time.temporal.a.YEAR.b.a(j, j$.time.temporal.f.WEEK_BASED_YEAR);
                j$.time.LocalDate localDateFrom = j$.time.LocalDate.from(temporal);
                j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_WEEK;
                int iH = localDateFrom.h(aVar);
                int iT = j$.time.temporal.f.t(localDateFrom);
                if (iT == 53 && j$.time.temporal.f.z(iA) == 52) {
                    iT = 52;
                }
                j$.time.LocalDate localDateOf = j$.time.LocalDate.of(iA, 1, 4);
                return temporal.x(localDateOf.plusDays(((iT - 1) * 7) + (iH - localDateOf.h(aVar))));
            }

            @Override // j$.time.temporal.l
            public final j$.time.temporal.o range() {
                return j$.time.temporal.a.YEAR.b;
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = fVar4;
        b = new j$.time.temporal.f[]{fVar, fVar2, fVar3, fVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int t(j$.time.LocalDate localDate) {
        int iOrdinal = localDate.getDayOfWeek().ordinal();
        int iB = localDate.B() - 1;
        int i = (3 - iOrdinal) + iB;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (iB < i3) {
            if (localDate.B() != 180) {
                localDate = j$.time.LocalDate.R(localDate.a, 180);
            }
            return (int) j$.time.temporal.o.f(1L, z(y(localDate.W(-1L)))).d;
        }
        int i4 = ((iB - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.s())) {
            return i4;
        }
        return 1;
    }

    public static j$.time.temporal.f valueOf(java.lang.String str) {
        return (j$.time.temporal.f) java.lang.Enum.valueOf(j$.time.temporal.f.class, str);
    }

    public static j$.time.temporal.f[] values() {
        return (j$.time.temporal.f[]) b.clone();
    }

    public static int y(j$.time.LocalDate localDate) {
        int year = localDate.getYear();
        int iB = localDate.B();
        if (iB <= 3) {
            return iB - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (iB >= 363) {
            return ((iB - 363) - (localDate.s() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }

    public static int z(int i) {
        j$.time.LocalDate localDateOf = j$.time.LocalDate.of(i, 1, 1);
        return (localDateOf.getDayOfWeek() == j$.time.DayOfWeek.THURSDAY || (localDateOf.getDayOfWeek() == j$.time.DayOfWeek.WEDNESDAY && localDateOf.s())) ? 53 : 52;
    }

    @Override // j$.time.temporal.l
    public final boolean isDateBased() {
        return true;
    }

    public j$.time.temporal.TemporalAccessor p(java.util.HashMap map, j$.time.format.b0 b0Var, j$.time.format.c0 c0Var) {
        return null;
    }
}
