package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class p implements j$.time.temporal.l {
    public static final j$.time.temporal.o f = j$.time.temporal.o.f(1, 7);
    public static final j$.time.temporal.o g = j$.time.temporal.o.g(0, 4, 6);
    public static final j$.time.temporal.o h = j$.time.temporal.o.g(0, 52, 54);
    public static final j$.time.temporal.o i = j$.time.temporal.o.g(1, 52, 53);
    public final java.lang.String a;
    public final j$.time.temporal.q b;
    public final j$.time.temporal.TemporalUnit c;
    public final j$.time.temporal.TemporalUnit d;
    public final j$.time.temporal.o e;

    public p(java.lang.String str, j$.time.temporal.q qVar, j$.time.temporal.TemporalUnit temporalUnit, j$.time.temporal.TemporalUnit temporalUnit2, j$.time.temporal.o oVar) {
        this.a = str;
        this.b = qVar;
        this.c = temporalUnit;
        this.d = temporalUnit2;
        this.e = oVar;
    }

    public static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    public final int b(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return j$.time.temporal.m.e(temporalAccessor.h(j$.time.temporal.a.DAY_OF_WEEK) - this.b.a.getValue()) + 1;
    }

    public final int c(j$.time.temporal.TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        int iH = temporalAccessor.h(j$.time.temporal.a.YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_YEAR;
        int iH2 = temporalAccessor.h(aVar);
        int i2 = i(iH2, iB);
        int iA = a(i2, iH2);
        if (iA == 0) {
            return iH - 1;
        }
        return iA >= a(i2, ((int) temporalAccessor.l(aVar).d) + this.b.b) ? iH + 1 : iH;
    }

    public final int d(j$.time.temporal.TemporalAccessor temporalAccessor) {
        int iA;
        int iB = b(temporalAccessor);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_YEAR;
        int iH = temporalAccessor.h(aVar);
        int i2 = i(iH, iB);
        int iA2 = a(i2, iH);
        if (iA2 == 0) {
            return d(j$.com.android.tools.r8.a.y(temporalAccessor).l(temporalAccessor).y(iH, j$.time.temporal.ChronoUnit.DAYS));
        }
        return (iA2 <= 50 || iA2 < (iA = a(i2, ((int) temporalAccessor.l(aVar).d) + this.b.b))) ? iA2 : (iA2 - iA) + 1;
    }

    public final j$.time.chrono.ChronoLocalDate e(j$.time.chrono.a aVar, int i2, int i3, int i4) {
        j$.time.chrono.ChronoLocalDate chronoLocalDateK = aVar.k(i2, 1, 1);
        int i5 = i(1, b(chronoLocalDateK));
        return chronoLocalDateK.b(((java.lang.Math.min(i3, a(i5, chronoLocalDateK.K() + this.b.b) - 1) - 1) * 7) + (i4 - 1) + (-i5), (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS);
    }

    public final j$.time.temporal.o f(j$.time.temporal.TemporalAccessor temporalAccessor, j$.time.temporal.a aVar) {
        int i2 = i(temporalAccessor.h(aVar), b(temporalAccessor));
        j$.time.temporal.o oVarL = temporalAccessor.l(aVar);
        return j$.time.temporal.o.f(a(i2, (int) oVarL.a), a(i2, (int) oVarL.d));
    }

    public final j$.time.temporal.o g(j$.time.temporal.TemporalAccessor temporalAccessor) {
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_YEAR;
        if (!temporalAccessor.c(aVar)) {
            return h;
        }
        int iB = b(temporalAccessor);
        int iH = temporalAccessor.h(aVar);
        int i2 = i(iH, iB);
        int iA = a(i2, iH);
        if (iA == 0) {
            return g(j$.com.android.tools.r8.a.y(temporalAccessor).l(temporalAccessor).y(iH + 7, j$.time.temporal.ChronoUnit.DAYS));
        }
        int i3 = (int) temporalAccessor.l(aVar).d;
        int iA2 = a(i2, this.b.b + i3);
        return iA >= iA2 ? g(j$.com.android.tools.r8.a.y(temporalAccessor).l(temporalAccessor).b((i3 - iH) + 8, (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS)) : j$.time.temporal.o.f(1L, iA2 - 1);
    }

    @Override // j$.time.temporal.l
    public final boolean h(j$.time.temporal.TemporalAccessor temporalAccessor) {
        if (temporalAccessor.c(j$.time.temporal.a.DAY_OF_WEEK)) {
            j$.time.temporal.ChronoUnit chronoUnit = j$.time.temporal.ChronoUnit.WEEKS;
            j$.time.temporal.TemporalUnit temporalUnit = this.d;
            if (temporalUnit == chronoUnit) {
                return true;
            }
            if (temporalUnit == j$.time.temporal.ChronoUnit.MONTHS) {
                return temporalAccessor.c(j$.time.temporal.a.DAY_OF_MONTH);
            }
            if (temporalUnit == j$.time.temporal.ChronoUnit.YEARS) {
                return temporalAccessor.c(j$.time.temporal.a.DAY_OF_YEAR);
            }
            if (temporalUnit == j$.time.temporal.q.h) {
                return temporalAccessor.c(j$.time.temporal.a.DAY_OF_YEAR);
            }
            if (temporalUnit == j$.time.temporal.ChronoUnit.FOREVER) {
                return temporalAccessor.c(j$.time.temporal.a.YEAR);
            }
        }
        return false;
    }

    public final int i(int i2, int i3) {
        int iE = j$.time.temporal.m.e(i2 - i3);
        return iE + 1 > this.b.b ? 7 - iE : -iE;
    }

    @Override // j$.time.temporal.l
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.o k(j$.time.temporal.TemporalAccessor temporalAccessor) {
        j$.time.temporal.ChronoUnit chronoUnit = j$.time.temporal.ChronoUnit.WEEKS;
        j$.time.temporal.TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            return this.e;
        }
        if (temporalUnit == j$.time.temporal.ChronoUnit.MONTHS) {
            return f(temporalAccessor, j$.time.temporal.a.DAY_OF_MONTH);
        }
        if (temporalUnit == j$.time.temporal.ChronoUnit.YEARS) {
            return f(temporalAccessor, j$.time.temporal.a.DAY_OF_YEAR);
        }
        if (temporalUnit == j$.time.temporal.q.h) {
            return g(temporalAccessor);
        }
        if (temporalUnit == j$.time.temporal.ChronoUnit.FOREVER) {
            return j$.time.temporal.a.YEAR.b;
        }
        throw new java.lang.IllegalStateException(j$.desugar.sun.nio.fs.h.b("unreachable, rangeUnit: ", java.lang.String.valueOf(temporalUnit), ", this: ", java.lang.String.valueOf(this)));
    }

    @Override // j$.time.temporal.l
    public final long l(j$.time.temporal.TemporalAccessor temporalAccessor) {
        int iC;
        j$.time.temporal.ChronoUnit chronoUnit = j$.time.temporal.ChronoUnit.WEEKS;
        j$.time.temporal.TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            iC = b(temporalAccessor);
        } else if (temporalUnit == j$.time.temporal.ChronoUnit.MONTHS) {
            int iB = b(temporalAccessor);
            int iH = temporalAccessor.h(j$.time.temporal.a.DAY_OF_MONTH);
            iC = a(i(iH, iB), iH);
        } else if (temporalUnit == j$.time.temporal.ChronoUnit.YEARS) {
            int iB2 = b(temporalAccessor);
            int iH2 = temporalAccessor.h(j$.time.temporal.a.DAY_OF_YEAR);
            iC = a(i(iH2, iB2), iH2);
        } else if (temporalUnit == j$.time.temporal.q.h) {
            iC = d(temporalAccessor);
        } else {
            if (temporalUnit != j$.time.temporal.ChronoUnit.FOREVER) {
                throw new java.lang.IllegalStateException(j$.desugar.sun.nio.fs.h.b("unreachable, rangeUnit: ", java.lang.String.valueOf(temporalUnit), ", this: ", java.lang.String.valueOf(this)));
            }
            iC = c(temporalAccessor);
        }
        return iC;
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.TemporalAccessor p(java.util.HashMap map, j$.time.format.b0 b0Var, j$.time.format.c0 c0Var) {
        j$.time.chrono.ChronoLocalDate chronoLocalDateB;
        j$.time.chrono.ChronoLocalDate chronoLocalDateB2;
        j$.time.temporal.q qVar = this.b;
        j$.time.DayOfWeek dayOfWeek = qVar.a;
        long jLongValue = ((java.lang.Long) map.get(this)).longValue();
        int iB = j$.com.android.tools.r8.a.B(jLongValue);
        j$.time.temporal.ChronoUnit chronoUnit = j$.time.temporal.ChronoUnit.WEEKS;
        j$.time.temporal.o oVar = this.e;
        j$.time.temporal.TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            long jE = j$.time.temporal.m.e((oVar.a(jLongValue, this) - 1) + (dayOfWeek.getValue() - 1)) + 1;
            map.remove(this);
            map.put(j$.time.temporal.a.DAY_OF_WEEK, java.lang.Long.valueOf(jE));
            return null;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_WEEK;
        if (!map.containsKey(aVar)) {
            return null;
        }
        int iA = aVar.b.a(((java.lang.Long) map.get(aVar)).longValue(), aVar);
        j$.time.temporal.p pVar = qVar.e;
        j$.time.temporal.p pVar2 = qVar.f;
        int iE = j$.time.temporal.m.e(iA - dayOfWeek.getValue()) + 1;
        j$.time.chrono.a aVarY = j$.com.android.tools.r8.a.y(b0Var);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (map.containsKey(aVar2)) {
            int iA2 = aVar2.b.a(((java.lang.Long) map.get(aVar2)).longValue(), aVar2);
            j$.time.temporal.ChronoUnit chronoUnit2 = j$.time.temporal.ChronoUnit.MONTHS;
            if (temporalUnit == chronoUnit2) {
                j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
                if (map.containsKey(aVar3)) {
                    long jLongValue2 = ((java.lang.Long) map.get(aVar3)).longValue();
                    long j = iB;
                    if (c0Var == j$.time.format.c0.LENIENT) {
                        j$.time.chrono.ChronoLocalDate chronoLocalDateB3 = aVarY.k(iA2, 1, 1).b(j$.com.android.tools.r8.a.P(jLongValue2, 1L), (j$.time.temporal.TemporalUnit) chronoUnit2);
                        int iB2 = b(chronoLocalDateB3);
                        int iH = chronoLocalDateB3.h(j$.time.temporal.a.DAY_OF_MONTH);
                        chronoLocalDateB2 = chronoLocalDateB3.b(j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.O(j$.com.android.tools.r8.a.P(j, a(i(iH, iB2), iH)), 7L), iE - b(chronoLocalDateB3)), (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS);
                    } else {
                        j$.time.chrono.ChronoLocalDate chronoLocalDateK = aVarY.k(iA2, aVar3.b.a(jLongValue2, aVar3), 1);
                        long jA = oVar.a(j, this);
                        int iB3 = b(chronoLocalDateK);
                        int iH2 = chronoLocalDateK.h(j$.time.temporal.a.DAY_OF_MONTH);
                        j$.time.chrono.ChronoLocalDate chronoLocalDateB4 = chronoLocalDateK.b((((int) (jA - ((long) a(i(iH2, iB3), iH2)))) * 7) + (iE - b(chronoLocalDateK)), (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS);
                        if (c0Var == j$.time.format.c0.STRICT && chronoLocalDateB4.D(aVar3) != jLongValue2) {
                            j$.time.g.h("Strict mode rejected resolved date as it is in a different month");
                            return null;
                        }
                        chronoLocalDateB2 = chronoLocalDateB4;
                    }
                    map.remove(this);
                    map.remove(aVar2);
                    map.remove(aVar3);
                    map.remove(aVar);
                    return chronoLocalDateB2;
                }
            }
            if (temporalUnit != j$.time.temporal.ChronoUnit.YEARS) {
                return null;
            }
            long j2 = iB;
            j$.time.chrono.ChronoLocalDate chronoLocalDateK2 = aVarY.k(iA2, 1, 1);
            if (c0Var == j$.time.format.c0.LENIENT) {
                int iB4 = b(chronoLocalDateK2);
                int iH3 = chronoLocalDateK2.h(j$.time.temporal.a.DAY_OF_YEAR);
                chronoLocalDateB = chronoLocalDateK2.b(j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.O(j$.com.android.tools.r8.a.P(j2, a(i(iH3, iB4), iH3)), 7L), iE - b(chronoLocalDateK2)), (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS);
            } else {
                long jA2 = oVar.a(j2, this);
                int iB5 = b(chronoLocalDateK2);
                int iH4 = chronoLocalDateK2.h(j$.time.temporal.a.DAY_OF_YEAR);
                j$.time.chrono.ChronoLocalDate chronoLocalDateB5 = chronoLocalDateK2.b((((int) (jA2 - ((long) a(i(iH4, iB5), iH4)))) * 7) + (iE - b(chronoLocalDateK2)), (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS);
                if (c0Var == j$.time.format.c0.STRICT && chronoLocalDateB5.D(aVar2) != iA2) {
                    j$.time.g.h("Strict mode rejected resolved date as it is in a different year");
                    return null;
                }
                chronoLocalDateB = chronoLocalDateB5;
            }
            map.remove(this);
            map.remove(aVar2);
            map.remove(aVar);
        } else {
            if ((temporalUnit != j$.time.temporal.q.h && temporalUnit != j$.time.temporal.ChronoUnit.FOREVER) || !map.containsKey(pVar2) || !map.containsKey(pVar)) {
                return null;
            }
            int iA3 = pVar2.e.a(((java.lang.Long) map.get(pVar2)).longValue(), pVar2);
            if (c0Var == j$.time.format.c0.LENIENT) {
                chronoLocalDateB = e(aVarY, iA3, 1, iE).b(j$.com.android.tools.r8.a.P(((java.lang.Long) map.get(pVar)).longValue(), 1L), (j$.time.temporal.TemporalUnit) chronoUnit);
            } else {
                j$.time.chrono.ChronoLocalDate chronoLocalDateE = e(aVarY, iA3, pVar.e.a(((java.lang.Long) map.get(pVar)).longValue(), pVar), iE);
                if (c0Var == j$.time.format.c0.STRICT && c(chronoLocalDateE) != iA3) {
                    j$.time.g.h("Strict mode rejected resolved date as it is in a different week-based-year");
                    return null;
                }
                chronoLocalDateB = chronoLocalDateE;
            }
            map.remove(this);
            map.remove(pVar2);
            map.remove(pVar);
            map.remove(aVar);
        }
        return chronoLocalDateB;
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.Temporal r(j$.time.temporal.Temporal temporal, long j) {
        int iA = this.e.a(j, this);
        int iH = temporal.h(this);
        if (iA == iH) {
            return temporal;
        }
        if (this.d != j$.time.temporal.ChronoUnit.FOREVER) {
            return temporal.b(iA - iH, this.c);
        }
        j$.time.temporal.q qVar = this.b;
        return e(j$.com.android.tools.r8.a.y(temporal), (int) j, temporal.h(qVar.e), temporal.h(qVar.c));
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.o range() {
        return this.e;
    }

    public final java.lang.String toString() {
        return j$.desugar.sun.nio.fs.h.b(this.a, "[", this.b.toString(), "]");
    }
}
