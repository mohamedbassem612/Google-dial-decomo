package j$.time.chrono;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class a implements java.lang.Comparable {
    public static final j$.util.concurrent.ConcurrentHashMap a = new j$.util.concurrent.ConcurrentHashMap();
    public static final j$.util.concurrent.ConcurrentHashMap b = new j$.util.concurrent.ConcurrentHashMap();

    static {
        new java.util.Locale("ja", "JP", "JP");
    }

    public static j$.time.chrono.a L(java.lang.String str) {
        j$.util.Objects.requireNonNull(str, "id");
        while (true) {
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap = a;
            aVar = (j$.time.chrono.a) concurrentHashMap.get(str);
            if (aVar == null) {
                aVar = (j$.time.chrono.a) b.get(str);
            }
            if (aVar != null) {
                break;
            }
            if (concurrentHashMap.get("ISO") != null) {
                for (j$.time.chrono.a aVar : java.util.ServiceLoader.load(j$.time.chrono.a.class)) {
                    if (str.equals(aVar.C()) || str.equals(aVar.B())) {
                        break;
                    }
                }
                throw new j$.time.DateTimeException("Unknown chronology: " + str);
            }
            j$.time.chrono.m mVar = j$.time.chrono.m.l;
            P(mVar, mVar.C());
            j$.time.chrono.t tVar = j$.time.chrono.t.c;
            P(tVar, tVar.C());
            j$.time.chrono.y yVar = j$.time.chrono.y.c;
            P(yVar, yVar.C());
            j$.time.chrono.e0 e0Var = j$.time.chrono.e0.c;
            P(e0Var, e0Var.C());
            try {
                for (j$.time.chrono.a aVar2 : java.util.Arrays.asList(new j$.time.chrono.a[0])) {
                    if (!aVar2.C().equals("ISO")) {
                        P(aVar2, aVar2.C());
                    }
                }
                j$.time.chrono.q qVar = j$.time.chrono.q.c;
                P(qVar, qVar.C());
            } catch (java.lang.Throwable th) {
                throw new java.util.ServiceConfigurationError(th.getMessage(), th);
            }
        }
        return aVar;
    }

    public static j$.time.chrono.a P(j$.time.chrono.a aVar, java.lang.String str) {
        java.lang.String strB;
        j$.time.chrono.a aVar2 = (j$.time.chrono.a) a.putIfAbsent(str, aVar);
        if (aVar2 == null && (strB = aVar.B()) != null) {
            b.putIfAbsent(strB, aVar);
        }
        return aVar2;
    }

    public static j$.time.chrono.ChronoLocalDate Q(j$.time.chrono.ChronoLocalDate chronoLocalDate, long j, long j2, long j3) {
        long j4;
        j$.time.chrono.ChronoLocalDate chronoLocalDateB = chronoLocalDate.b(j, (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.MONTHS);
        j$.time.temporal.ChronoUnit chronoUnit = j$.time.temporal.ChronoUnit.WEEKS;
        j$.time.chrono.ChronoLocalDate chronoLocalDateB2 = chronoLocalDateB.b(j2, (j$.time.temporal.TemporalUnit) chronoUnit);
        if (j3 <= 7) {
            if (j3 < 1) {
                chronoLocalDateB2 = chronoLocalDateB2.b(j$.com.android.tools.r8.a.P(j3, 7L) / 7, (j$.time.temporal.TemporalUnit) chronoUnit);
                j4 = (j3 + 6) % 7;
            }
            return chronoLocalDateB2.x(j$.time.temporal.TemporalAdjusters.nextOrSame(j$.time.DayOfWeek.r((int) j3)));
        }
        long j5 = j3 - 1;
        chronoLocalDateB2 = chronoLocalDateB2.b(j5 / 7, (j$.time.temporal.TemporalUnit) chronoUnit);
        j4 = j5 % 7;
        j3 = j4 + 1;
        return chronoLocalDateB2.x(j$.time.temporal.TemporalAdjusters.nextOrSame(j$.time.DayOfWeek.r((int) j3)));
    }

    public static void h(java.util.Map map, j$.time.temporal.a aVar, long j) {
        java.lang.Long l = (java.lang.Long) map.get(aVar);
        if (l == null || l.longValue() == j) {
            map.put(aVar, java.lang.Long.valueOf(j));
            return;
        }
        throw new j$.time.DateTimeException("Conflict found: " + java.lang.String.valueOf(aVar) + " " + l + " differs from " + java.lang.String.valueOf(aVar) + " " + j);
    }

    public java.lang.String B() {
        return "islamic-umalqura";
    }

    public java.lang.String C() {
        return "Hijrah-umalqura";
    }

    public boolean D(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    public j$.time.chrono.d G(j$.time.temporal.Temporal temporal) {
        try {
            return l(temporal).F(j$.time.j.z(temporal));
        } catch (j$.time.DateTimeException e) {
            throw new j$.time.DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ".concat(java.lang.String.valueOf(temporal.getClass())), e);
        }
    }

    public int N(j$.time.chrono.k kVar, int i) {
        if (kVar instanceof j$.time.chrono.p) {
            return i;
        }
        throw new java.lang.ClassCastException("Era must be HijrahEra");
    }

    public j$.time.temporal.o O(j$.time.temporal.a aVar) {
        return aVar.b;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:48:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x0205  */
    /* JADX WARN: Code duplicated, block: B:54:0x020d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0217  */
    /* JADX WARN: Code duplicated, block: B:58:0x022d  */
    /* JADX WARN: Code duplicated, block: B:60:0x025a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0292  */
    /* JADX WARN: Code duplicated, block: B:65:0x029d  */
    /* JADX WARN: Code duplicated, block: B:67:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:69:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:72:0x0324  */
    /* JADX WARN: Code duplicated, block: B:79:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public j$.time.chrono.ChronoLocalDate R(java.util.Map map, j$.time.format.c0 c0Var) {
        j$.time.temporal.a aVar;
        j$.time.temporal.a aVar2;
        j$.time.temporal.a aVar3;
        j$.time.temporal.a aVar4;
        int iA;
        j$.time.chrono.ChronoLocalDate chronoLocalDateX;
        int iA2;
        j$.time.chrono.ChronoLocalDate chronoLocalDateB;
        int iA3;
        j$.time.temporal.a aVar5 = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar5)) {
            return p(((java.lang.Long) map.remove(aVar5)).longValue());
        }
        S(map, c0Var);
        j$.time.chrono.ChronoLocalDate chronoLocalDateU = U(map, c0Var);
        if (chronoLocalDateU != null) {
            return chronoLocalDateU;
        }
        j$.time.temporal.a aVar6 = j$.time.temporal.a.YEAR;
        if (map.containsKey(aVar6)) {
            j$.time.temporal.a aVar7 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (!map.containsKey(aVar7)) {
                aVar = j$.time.temporal.a.DAY_OF_YEAR;
                if (map.containsKey(aVar)) {
                    iA3 = O(aVar6).a(((java.lang.Long) map.remove(aVar6)).longValue(), aVar6);
                    if (c0Var != j$.time.format.c0.LENIENT) {
                        return t(iA3, O(aVar).a(((java.lang.Long) map.remove(aVar)).longValue(), aVar));
                    }
                    return t(iA3, 1).b(j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar)).longValue(), 1L), (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS);
                }
                aVar2 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
                if (map.containsKey(aVar2)) {
                    aVar3 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                    if (map.containsKey(aVar3)) {
                        iA2 = O(aVar6).a(((java.lang.Long) map.remove(aVar6)).longValue(), aVar6);
                        if (c0Var == j$.time.format.c0.LENIENT) {
                            return t(iA2, 1).b(j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar2)).longValue(), 1L), (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.WEEKS).b(j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar3)).longValue(), 1L), (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS);
                        }
                        chronoLocalDateB = t(iA2, 1).b((O(aVar3).a(((java.lang.Long) map.remove(aVar3)).longValue(), aVar3) - 1) + ((O(aVar2).a(((java.lang.Long) map.remove(aVar2)).longValue(), aVar2) - 1) * 7), (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS);
                        if (c0Var == j$.time.format.c0.STRICT || chronoLocalDateB.h(aVar6) == iA2) {
                            return chronoLocalDateB;
                        }
                        j$.time.g.h("Strict mode rejected resolved date as it is in a different year");
                    } else {
                        aVar4 = j$.time.temporal.a.DAY_OF_WEEK;
                        if (map.containsKey(aVar4)) {
                            iA = O(aVar6).a(((java.lang.Long) map.remove(aVar6)).longValue(), aVar6);
                            if (c0Var == j$.time.format.c0.LENIENT) {
                                return Q(t(iA, 1), 0L, j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar2)).longValue(), 1L), j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar4)).longValue(), 1L));
                            }
                            chronoLocalDateX = t(iA, 1).b((O(aVar2).a(((java.lang.Long) map.remove(aVar2)).longValue(), aVar2) - 1) * 7, (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS).x(j$.time.temporal.TemporalAdjusters.nextOrSame(j$.time.DayOfWeek.r(O(aVar4).a(((java.lang.Long) map.remove(aVar4)).longValue(), aVar4))));
                            if (c0Var == j$.time.format.c0.STRICT || chronoLocalDateX.h(aVar6) == iA) {
                                return chronoLocalDateX;
                            }
                            j$.time.g.h("Strict mode rejected resolved date as it is in a different year");
                        }
                    }
                }
            } else {
                if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                    return T(map, c0Var);
                }
                j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
                if (map.containsKey(aVar8)) {
                    j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                    if (map.containsKey(aVar9)) {
                        int iA4 = O(aVar6).a(((java.lang.Long) map.remove(aVar6)).longValue(), aVar6);
                        if (c0Var == j$.time.format.c0.LENIENT) {
                            long jP = j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar7)).longValue(), 1L);
                            return k(iA4, 1, 1).b(jP, (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.MONTHS).b(j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar8)).longValue(), 1L), (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.WEEKS).b(j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar9)).longValue(), 1L), (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS);
                        }
                        int iA5 = O(aVar7).a(((java.lang.Long) map.remove(aVar7)).longValue(), aVar7);
                        j$.time.chrono.ChronoLocalDate chronoLocalDateB2 = k(iA4, iA5, 1).b((O(aVar9).a(((java.lang.Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((O(aVar8).a(((java.lang.Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7), (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS);
                        if (c0Var != j$.time.format.c0.STRICT || chronoLocalDateB2.h(aVar7) == iA5) {
                            return chronoLocalDateB2;
                        }
                        j$.time.g.h("Strict mode rejected resolved date as it is in a different month");
                    } else {
                        j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
                        if (map.containsKey(aVar10)) {
                            int iA6 = O(aVar6).a(((java.lang.Long) map.remove(aVar6)).longValue(), aVar6);
                            if (c0Var == j$.time.format.c0.LENIENT) {
                                return Q(k(iA6, 1, 1), j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar7)).longValue(), 1L), j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar8)).longValue(), 1L), j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar10)).longValue(), 1L));
                            }
                            int iA7 = O(aVar7).a(((java.lang.Long) map.remove(aVar7)).longValue(), aVar7);
                            j$.time.chrono.ChronoLocalDate chronoLocalDateX2 = k(iA6, iA7, 1).b((O(aVar8).a(((java.lang.Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS).x(j$.time.temporal.TemporalAdjusters.nextOrSame(j$.time.DayOfWeek.r(O(aVar10).a(((java.lang.Long) map.remove(aVar10)).longValue(), aVar10))));
                            if (c0Var != j$.time.format.c0.STRICT || chronoLocalDateX2.h(aVar7) == iA7) {
                                return chronoLocalDateX2;
                            }
                            j$.time.g.h("Strict mode rejected resolved date as it is in a different month");
                        } else {
                            aVar = j$.time.temporal.a.DAY_OF_YEAR;
                            if (map.containsKey(aVar)) {
                                iA3 = O(aVar6).a(((java.lang.Long) map.remove(aVar6)).longValue(), aVar6);
                                if (c0Var != j$.time.format.c0.LENIENT) {
                                    return t(iA3, O(aVar).a(((java.lang.Long) map.remove(aVar)).longValue(), aVar));
                                }
                                return t(iA3, 1).b(j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar)).longValue(), 1L), (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS);
                            }
                            aVar2 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
                            if (map.containsKey(aVar2)) {
                                aVar3 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                                if (map.containsKey(aVar3)) {
                                    iA2 = O(aVar6).a(((java.lang.Long) map.remove(aVar6)).longValue(), aVar6);
                                    if (c0Var == j$.time.format.c0.LENIENT) {
                                        return t(iA2, 1).b(j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar2)).longValue(), 1L), (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.WEEKS).b(j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar3)).longValue(), 1L), (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS);
                                    }
                                    chronoLocalDateB = t(iA2, 1).b((O(aVar3).a(((java.lang.Long) map.remove(aVar3)).longValue(), aVar3) - 1) + ((O(aVar2).a(((java.lang.Long) map.remove(aVar2)).longValue(), aVar2) - 1) * 7), (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS);
                                    if (c0Var == j$.time.format.c0.STRICT) {
                                        return chronoLocalDateB;
                                    }
                                    return chronoLocalDateB;
                                }
                                aVar4 = j$.time.temporal.a.DAY_OF_WEEK;
                                if (map.containsKey(aVar4)) {
                                    iA = O(aVar6).a(((java.lang.Long) map.remove(aVar6)).longValue(), aVar6);
                                    if (c0Var == j$.time.format.c0.LENIENT) {
                                        return Q(t(iA, 1), 0L, j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar2)).longValue(), 1L), j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar4)).longValue(), 1L));
                                    }
                                    chronoLocalDateX = t(iA, 1).b((O(aVar2).a(((java.lang.Long) map.remove(aVar2)).longValue(), aVar2) - 1) * 7, (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS).x(j$.time.temporal.TemporalAdjusters.nextOrSame(j$.time.DayOfWeek.r(O(aVar4).a(((java.lang.Long) map.remove(aVar4)).longValue(), aVar4))));
                                    if (c0Var == j$.time.format.c0.STRICT) {
                                        return chronoLocalDateX;
                                    }
                                    return chronoLocalDateX;
                                }
                            }
                        }
                    }
                } else {
                    aVar = j$.time.temporal.a.DAY_OF_YEAR;
                    if (map.containsKey(aVar)) {
                        iA3 = O(aVar6).a(((java.lang.Long) map.remove(aVar6)).longValue(), aVar6);
                        if (c0Var != j$.time.format.c0.LENIENT) {
                            return t(iA3, O(aVar).a(((java.lang.Long) map.remove(aVar)).longValue(), aVar));
                        }
                        return t(iA3, 1).b(j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar)).longValue(), 1L), (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS);
                    }
                    aVar2 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
                    if (map.containsKey(aVar2)) {
                        aVar3 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                        if (map.containsKey(aVar3)) {
                            iA2 = O(aVar6).a(((java.lang.Long) map.remove(aVar6)).longValue(), aVar6);
                            if (c0Var == j$.time.format.c0.LENIENT) {
                                return t(iA2, 1).b(j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar2)).longValue(), 1L), (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.WEEKS).b(j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar3)).longValue(), 1L), (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS);
                            }
                            chronoLocalDateB = t(iA2, 1).b((O(aVar3).a(((java.lang.Long) map.remove(aVar3)).longValue(), aVar3) - 1) + ((O(aVar2).a(((java.lang.Long) map.remove(aVar2)).longValue(), aVar2) - 1) * 7), (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS);
                            if (c0Var == j$.time.format.c0.STRICT) {
                                return chronoLocalDateB;
                            }
                            return chronoLocalDateB;
                        }
                        aVar4 = j$.time.temporal.a.DAY_OF_WEEK;
                        if (map.containsKey(aVar4)) {
                            iA = O(aVar6).a(((java.lang.Long) map.remove(aVar6)).longValue(), aVar6);
                            if (c0Var == j$.time.format.c0.LENIENT) {
                                return Q(t(iA, 1), 0L, j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar2)).longValue(), 1L), j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar4)).longValue(), 1L));
                            }
                            chronoLocalDateX = t(iA, 1).b((O(aVar2).a(((java.lang.Long) map.remove(aVar2)).longValue(), aVar2) - 1) * 7, (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS).x(j$.time.temporal.TemporalAdjusters.nextOrSame(j$.time.DayOfWeek.r(O(aVar4).a(((java.lang.Long) map.remove(aVar4)).longValue(), aVar4))));
                            if (c0Var == j$.time.format.c0.STRICT) {
                                return chronoLocalDateX;
                            }
                            return chronoLocalDateX;
                        }
                    }
                }
            }
        }
        return null;
    }

    public void S(java.util.Map map, j$.time.format.c0 c0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        java.lang.Long l = (java.lang.Long) map.remove(aVar);
        if (l != null) {
            if (c0Var != j$.time.format.c0.LENIENT) {
                aVar.t(l.longValue());
            }
            j$.time.chrono.ChronoLocalDate chronoLocalDateA = r().a(1L, (j$.time.temporal.l) j$.time.temporal.a.DAY_OF_MONTH).a(l.longValue(), (j$.time.temporal.l) aVar);
            j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
            h(map, aVar2, chronoLocalDateA.h(aVar2));
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            h(map, aVar3, chronoLocalDateA.h(aVar3));
        }
    }

    public j$.time.chrono.ChronoLocalDate T(java.util.Map map, j$.time.format.c0 c0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = O(aVar).a(((java.lang.Long) map.remove(aVar)).longValue(), aVar);
        if (c0Var == j$.time.format.c0.LENIENT) {
            long jP = j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return k(iA, 1, 1).b(jP, (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.MONTHS).b(j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = O(aVar2).a(((java.lang.Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = O(aVar3).a(((java.lang.Long) map.remove(aVar3)).longValue(), aVar3);
        if (c0Var != j$.time.format.c0.SMART) {
            return k(iA, iA2, iA3);
        }
        try {
            return k(iA, iA2, iA3);
        } catch (j$.time.DateTimeException unused) {
            return k(iA, iA2, 1).x(new j$.desugar.sun.nio.fs.n((byte) 3));
        }
    }

    public j$.time.chrono.ChronoLocalDate U(java.util.Map map, j$.time.format.c0 c0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        java.lang.Long l = (java.lang.Long) map.remove(aVar);
        if (l == null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            if (!map.containsKey(aVar2)) {
                return null;
            }
            O(aVar2).b(((java.lang.Long) map.get(aVar2)).longValue(), aVar2);
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        java.lang.Long l2 = (java.lang.Long) map.remove(aVar3);
        int iA = c0Var != j$.time.format.c0.LENIENT ? O(aVar).a(l.longValue(), aVar) : j$.com.android.tools.r8.a.B(l.longValue());
        if (l2 != null) {
            h(map, j$.time.temporal.a.YEAR, N(y(O(aVar3).a(l2.longValue(), aVar3)), iA));
            return null;
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.YEAR;
        if (map.containsKey(aVar4)) {
            h(map, aVar4, N(t(O(aVar4).a(((java.lang.Long) map.get(aVar4)).longValue(), aVar4), 1).H(), iA));
            return null;
        }
        if (c0Var == j$.time.format.c0.STRICT) {
            map.put(aVar, l);
            return null;
        }
        java.util.List listZ = z();
        if (listZ.isEmpty()) {
            h(map, aVar4, iA);
            return null;
        }
        h(map, aVar4, N((j$.time.chrono.k) listZ.get(listZ.size() - 1), iA));
        return null;
    }

    public j$.time.chrono.ChronoZonedDateTime V(j$.time.Instant instant, j$.time.ZoneId zoneId) {
        return j$.time.chrono.j.t(this, instant, zoneId);
    }

    public j$.time.chrono.ChronoZonedDateTime W(j$.time.temporal.Temporal temporal) {
        try {
            j$.time.ZoneId zoneIdR = j$.time.ZoneId.r(temporal);
            try {
                return V(j$.time.Instant.from(temporal), zoneIdR);
            } catch (j$.time.DateTimeException unused) {
                return j$.time.chrono.j.r(zoneIdR, null, j$.time.chrono.f.r(this, G(temporal)));
            }
        } catch (j$.time.DateTimeException e) {
            throw new j$.time.DateTimeException("Unable to obtain ChronoZonedDateTime from TemporalAccessor: ".concat(java.lang.String.valueOf(temporal.getClass())), e);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return C().compareTo(((j$.time.chrono.a) obj).C());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof j$.time.chrono.a) && C().compareTo(((j$.time.chrono.a) obj).C()) == 0;
        }
        return true;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ C().hashCode();
    }

    public j$.time.chrono.ChronoLocalDate k(int i, int i2, int i3) {
        return j$.time.LocalDate.of(i, i2, i3);
    }

    public j$.time.chrono.ChronoLocalDate l(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return j$.time.LocalDate.from(temporalAccessor);
    }

    public j$.time.chrono.ChronoLocalDate p(long j) {
        return j$.time.LocalDate.Q(j);
    }

    public j$.time.chrono.ChronoLocalDate r() {
        int i = j$.time.b.a;
        j$.time.a aVar = new j$.time.a(j$.time.ZoneId.systemDefault());
        j$.util.Objects.requireNonNull(aVar, "clock");
        return j$.time.LocalDate.from(j$.time.LocalDate.P(aVar));
    }

    public j$.time.chrono.ChronoLocalDate t(int i, int i2) {
        return j$.time.LocalDate.R(i, i2);
    }

    public final java.lang.String toString() {
        return C();
    }

    public j$.time.chrono.k y(int i) {
        if (i == 1) {
            return j$.time.chrono.p.AH;
        }
        j$.time.g.h("invalid Hijrah era");
        return null;
    }

    public java.util.List z() {
        return j$.com.android.tools.r8.a.F(j$.time.chrono.p.values());
    }
}
