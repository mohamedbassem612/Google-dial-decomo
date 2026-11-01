package j$.time.chrono;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class t extends j$.time.chrono.a implements java.io.Serializable {
    public static final j$.time.chrono.t c = new j$.time.chrono.t();
    private static final long serialVersionUID = 459996390165777884L;

    private t() {
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.a
    public final java.lang.String B() {
        return "japanese";
    }

    @Override // j$.time.chrono.a
    public final java.lang.String C() {
        return "Japanese";
    }

    @Override // j$.time.chrono.a
    public final boolean D(long j) {
        return j$.time.chrono.q.c.D(j);
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.d G(j$.time.temporal.Temporal temporal) {
        return super.G(temporal);
    }

    @Override // j$.time.chrono.a
    public final int N(j$.time.chrono.k kVar, int i) {
        if (!(kVar instanceof j$.time.chrono.w)) {
            throw new java.lang.ClassCastException("Era must be JapaneseEra");
        }
        j$.time.LocalDate localDate = ((j$.time.chrono.w) kVar).b;
        int year = (localDate.getYear() + i) - 1;
        if (i == 1) {
            return year;
        }
        if (year >= -999999999 && year <= 999999999 && year >= localDate.getYear() && kVar == j$.time.chrono.w.e(j$.time.LocalDate.of(year, 1, 1))) {
            return year;
        }
        j$.time.g.h("Invalid yearOfEra value");
        return 0;
    }

    @Override // j$.time.chrono.a
    public final j$.time.temporal.o O(j$.time.temporal.a aVar) {
        switch (j$.time.chrono.s.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(aVar)));
                return null;
            case 5:
                j$.time.chrono.w[] wVarArr = j$.time.chrono.w.e;
                int year = wVarArr[wVarArr.length - 1].b.getYear();
                int year2 = 1000000000 - wVarArr[wVarArr.length - 1].b.getYear();
                int year3 = wVarArr[0].b.getYear();
                for (int i = 1; i < wVarArr.length; i++) {
                    j$.time.chrono.w wVar = wVarArr[i];
                    year2 = java.lang.Math.min(year2, (wVar.b.getYear() - year3) + 1);
                    year3 = wVar.b.getYear();
                }
                return j$.time.temporal.o.g(1L, year2, 999999999 - year);
            case 6:
                j$.time.chrono.w wVar2 = j$.time.chrono.w.d;
                long j = j$.time.temporal.a.DAY_OF_YEAR.b.c;
                long jMin = j;
                for (j$.time.chrono.w wVar3 : j$.time.chrono.w.e) {
                    long jMin2 = java.lang.Math.min(jMin, (wVar3.b.K() - wVar3.b.B()) + 1);
                    jMin = wVar3.f() != null ? java.lang.Math.min(jMin2, wVar3.f().b.B() - 1) : jMin2;
                }
                return j$.time.temporal.o.g(1L, jMin, j$.time.temporal.a.DAY_OF_YEAR.b.d);
            case 7:
                return j$.time.temporal.o.f(j$.time.chrono.v.d.getYear(), 999999999L);
            case 8:
                long j2 = j$.time.chrono.w.d.a;
                j$.time.chrono.w[] wVarArr2 = j$.time.chrono.w.e;
                return j$.time.temporal.o.f(j2, wVarArr2[wVarArr2.length - 1].a);
            default:
                return aVar.b;
        }
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.ChronoLocalDate R(java.util.Map map, j$.time.format.c0 c0Var) {
        return (j$.time.chrono.v) super.R(map, c0Var);
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.ChronoLocalDate U(java.util.Map map, j$.time.format.c0 c0Var) {
        j$.time.chrono.v vVarO;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        java.lang.Long l = (java.lang.Long) map.get(aVar);
        j$.time.chrono.w wVarI = l != null ? j$.time.chrono.w.i(O(aVar).a(l.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        java.lang.Long l2 = (java.lang.Long) map.get(aVar2);
        int iA = l2 != null ? O(aVar2).a(l2.longValue(), aVar2) : 0;
        if (wVarI == null && l2 != null && !map.containsKey(j$.time.temporal.a.YEAR) && c0Var != j$.time.format.c0.STRICT) {
            j$.time.chrono.w[] wVarArr = j$.time.chrono.w.e;
            wVarI = ((j$.time.chrono.w[]) java.util.Arrays.copyOf(wVarArr, wVarArr.length))[((j$.time.chrono.w[]) java.util.Arrays.copyOf(wVarArr, wVarArr.length)).length - 1];
        }
        if (l2 == null || wVarI == null) {
            return null;
        }
        j$.time.LocalDate localDate = wVarI.b;
        j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
        if (map.containsKey(aVar3)) {
            j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
            if (map.containsKey(aVar4)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (c0Var == j$.time.format.c0.LENIENT) {
                    return new j$.time.chrono.v(j$.time.LocalDate.of((localDate.getYear() + iA) - 1, 1, 1)).L(j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar3)).longValue(), 1L), j$.time.temporal.ChronoUnit.MONTHS).L(j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar4)).longValue(), 1L), j$.time.temporal.ChronoUnit.DAYS);
                }
                int iA2 = O(aVar3).a(((java.lang.Long) map.remove(aVar3)).longValue(), aVar3);
                int iA3 = O(aVar4).a(((java.lang.Long) map.remove(aVar4)).longValue(), aVar4);
                if (c0Var != j$.time.format.c0.SMART) {
                    j$.time.LocalDate localDate2 = j$.time.chrono.v.d;
                    j$.util.Objects.requireNonNull(wVarI, "era");
                    j$.time.LocalDate localDateOf = j$.time.LocalDate.of((localDate.getYear() + iA) - 1, iA2, iA3);
                    if (!localDateOf.isBefore(localDate) && wVarI == j$.time.chrono.w.e(localDateOf)) {
                        return new j$.time.chrono.v(wVarI, iA, localDateOf);
                    }
                    j$.time.g.h("year, month, and day not valid for Era");
                    return null;
                }
                if (iA < 1) {
                    j$.time.g.c("Invalid YearOfEra: ", iA);
                    return null;
                }
                int year = (localDate.getYear() + iA) - 1;
                try {
                    vVarO = new j$.time.chrono.v(j$.time.LocalDate.of(year, iA2, iA3));
                } catch (j$.time.DateTimeException unused) {
                    vVarO = new j$.time.chrono.v(j$.time.LocalDate.of(year, iA2, 1)).O(new j$.desugar.sun.nio.fs.n((byte) 3));
                }
                if (vVarO.b == wVarI || j$.time.temporal.m.a(vVarO, j$.time.temporal.a.YEAR_OF_ERA) <= 1 || iA <= 1) {
                    return vVarO;
                }
                throw new j$.time.DateTimeException("Invalid YearOfEra for Era: " + java.lang.String.valueOf(wVarI) + " " + iA);
            }
        }
        j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
        if (!map.containsKey(aVar5)) {
            return null;
        }
        map.remove(aVar);
        map.remove(aVar2);
        if (c0Var == j$.time.format.c0.LENIENT) {
            return new j$.time.chrono.v(j$.time.LocalDate.R((localDate.getYear() + iA) - 1, 1)).L(j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(aVar5)).longValue(), 1L), j$.time.temporal.ChronoUnit.DAYS);
        }
        int iA4 = O(aVar5).a(((java.lang.Long) map.remove(aVar5)).longValue(), aVar5);
        j$.time.LocalDate localDate3 = j$.time.chrono.v.d;
        j$.util.Objects.requireNonNull(wVarI, "era");
        j$.time.LocalDate localDateR = iA == 1 ? j$.time.LocalDate.R(localDate.getYear(), (localDate.B() + iA4) - 1) : j$.time.LocalDate.R((localDate.getYear() + iA) - 1, iA4);
        if (!localDateR.isBefore(localDate) && wVarI == j$.time.chrono.w.e(localDateR)) {
            return new j$.time.chrono.v(wVarI, iA, localDateR);
        }
        j$.time.g.h("Invalid parameters");
        return null;
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.ChronoZonedDateTime V(j$.time.Instant instant, j$.time.ZoneId zoneId) {
        return j$.time.chrono.j.t(this, instant, zoneId);
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.ChronoZonedDateTime W(j$.time.temporal.Temporal temporal) {
        return super.W(temporal);
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.ChronoLocalDate k(int i, int i2, int i3) {
        return new j$.time.chrono.v(j$.time.LocalDate.of(i, i2, i3));
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.ChronoLocalDate l(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof j$.time.chrono.v ? (j$.time.chrono.v) temporalAccessor : new j$.time.chrono.v(j$.time.LocalDate.from(temporalAccessor));
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.ChronoLocalDate p(long j) {
        return new j$.time.chrono.v(j$.time.LocalDate.Q(j));
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.ChronoLocalDate r() {
        int i = j$.time.b.a;
        return new j$.time.chrono.v(j$.time.LocalDate.from(j$.time.LocalDate.P(new j$.time.a(j$.time.ZoneId.systemDefault()))));
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.ChronoLocalDate t(int i, int i2) {
        return new j$.time.chrono.v(j$.time.LocalDate.R(i, i2));
    }

    public java.lang.Object writeReplace() {
        return new j$.time.chrono.c0((byte) 1, this);
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.k y(int i) {
        return j$.time.chrono.w.i(i);
    }

    @Override // j$.time.chrono.a
    public final java.util.List z() {
        j$.time.chrono.w[] wVarArr = j$.time.chrono.w.e;
        return j$.com.android.tools.r8.a.F((j$.time.chrono.w[]) java.util.Arrays.copyOf(wVarArr, wVarArr.length));
    }
}
