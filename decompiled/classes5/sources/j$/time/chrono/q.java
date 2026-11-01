package j$.time.chrono;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class q extends j$.time.chrono.a implements java.io.Serializable {
    public static final j$.time.chrono.q c = new j$.time.chrono.q();
    private static final long serialVersionUID = -1440403870442975015L;

    private q() {
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.a
    public final java.lang.String B() {
        return "iso8601";
    }

    @Override // j$.time.chrono.a
    public final java.lang.String C() {
        return "ISO";
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.d G(j$.time.temporal.Temporal temporal) {
        return j$.time.LocalDateTime.t(temporal);
    }

    @Override // j$.time.chrono.a
    public final int N(j$.time.chrono.k kVar, int i) {
        if (kVar instanceof j$.time.chrono.r) {
            return kVar != j$.time.chrono.r.CE ? 1 - i : i;
        }
        throw new java.lang.ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.ChronoLocalDate R(java.util.Map map, j$.time.format.c0 c0Var) {
        return (j$.time.LocalDate) super.R(map, c0Var);
    }

    @Override // j$.time.chrono.a
    public final void S(java.util.Map map, j$.time.format.c0 c0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        java.lang.Long l = (java.lang.Long) map.remove(aVar);
        if (l != null) {
            if (c0Var != j$.time.format.c0.LENIENT) {
                aVar.t(l.longValue());
            }
            j$.time.chrono.a.h(map, j$.time.temporal.a.MONTH_OF_YEAR, ((int) j$.com.android.tools.r8.a.M(l.longValue(), 12L)) + 1);
            j$.time.chrono.a.h(map, j$.time.temporal.a.YEAR, j$.com.android.tools.r8.a.C(l.longValue(), 12L));
        }
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.ChronoLocalDate T(java.util.Map map, j$.time.format.c0 c0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = aVar.b.a(((java.lang.Long) map.remove(aVar)).longValue(), aVar);
        boolean z = true;
        if (c0Var == j$.time.format.c0.LENIENT) {
            return j$.time.LocalDate.of(iA, 1, 1).U(j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).plusDays(j$.com.android.tools.r8.a.P(((java.lang.Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = aVar2.b.a(((java.lang.Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = aVar3.b.a(((java.lang.Long) map.remove(aVar3)).longValue(), aVar3);
        if (c0Var == j$.time.format.c0.SMART) {
            if (iA2 == 4 || iA2 == 6 || iA2 == 9 || iA2 == 11) {
                iA3 = java.lang.Math.min(iA3, 30);
            } else if (iA2 == 2) {
                j$.time.k kVar = j$.time.k.FEBRUARY;
                long j = iA;
                int i = j$.time.t.b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                iA3 = java.lang.Math.min(iA3, kVar.t(z));
            }
        }
        return j$.time.LocalDate.of(iA, iA2, iA3);
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.ChronoLocalDate U(java.util.Map map, j$.time.format.c0 c0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        java.lang.Long l = (java.lang.Long) map.remove(aVar);
        if (l == null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            if (!map.containsKey(aVar2)) {
                return null;
            }
            aVar2.t(((java.lang.Long) map.get(aVar2)).longValue());
            return null;
        }
        if (c0Var != j$.time.format.c0.LENIENT) {
            aVar.t(l.longValue());
        }
        java.lang.Long l2 = (java.lang.Long) map.remove(j$.time.temporal.a.ERA);
        if (l2 != null) {
            if (l2.longValue() == 1) {
                j$.time.chrono.a.h(map, j$.time.temporal.a.YEAR, l.longValue());
                return null;
            }
            if (l2.longValue() == 0) {
                j$.time.chrono.a.h(map, j$.time.temporal.a.YEAR, j$.com.android.tools.r8.a.P(1L, l.longValue()));
                return null;
            }
            throw new j$.time.DateTimeException("Invalid value for era: " + l2);
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
        java.lang.Long l3 = (java.lang.Long) map.get(aVar3);
        if (c0Var != j$.time.format.c0.STRICT) {
            j$.time.chrono.a.h(map, aVar3, (l3 == null || l3.longValue() > 0) ? l.longValue() : j$.com.android.tools.r8.a.P(1L, l.longValue()));
            return null;
        }
        if (l3 == null) {
            map.put(aVar, l);
            return null;
        }
        long jLongValue = l3.longValue();
        long jLongValue2 = l.longValue();
        if (jLongValue <= 0) {
            jLongValue2 = j$.com.android.tools.r8.a.P(1L, jLongValue2);
        }
        j$.time.chrono.a.h(map, aVar3, jLongValue2);
        return null;
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.ChronoZonedDateTime V(j$.time.Instant instant, j$.time.ZoneId zoneId) {
        return j$.time.ZonedDateTime.ofInstant(instant, zoneId);
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.ChronoZonedDateTime W(j$.time.temporal.Temporal temporal) {
        return j$.time.ZonedDateTime.r(temporal);
    }

    public java.lang.Object writeReplace() {
        return new j$.time.chrono.c0((byte) 1, this);
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.k y(int i) {
        if (i == 0) {
            return j$.time.chrono.r.BCE;
        }
        if (i == 1) {
            return j$.time.chrono.r.CE;
        }
        j$.time.g.c("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.a
    public final java.util.List z() {
        return j$.com.android.tools.r8.a.F(j$.time.chrono.r.values());
    }
}
