package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class b0 implements j$.time.temporal.TemporalAccessor {
    public j$.time.ZoneId b;
    public j$.time.chrono.a c;
    public boolean d;
    public j$.time.format.c0 e;
    public j$.time.chrono.ChronoLocalDate f;
    public j$.time.j g;
    public final java.util.HashMap a = new java.util.HashMap();
    public j$.time.q h = j$.time.q.d;

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        j$.util.Objects.requireNonNull(lVar, "field");
        java.lang.Long l = (java.lang.Long) this.a.get(lVar);
        if (l != null) {
            return l.longValue();
        }
        j$.time.chrono.ChronoLocalDate chronoLocalDate = this.f;
        if (chronoLocalDate != null && chronoLocalDate.c(lVar)) {
            return this.f.D(lVar);
        }
        j$.time.j jVar = this.g;
        if (jVar != null && jVar.c(lVar)) {
            return this.g.D(lVar);
        }
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(this);
        }
        j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
        return 0L;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object G(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.m.a) {
            return this.b;
        }
        if (temporalQuery == j$.time.temporal.m.b) {
            return this.c;
        }
        if (temporalQuery == j$.time.temporal.m.f) {
            j$.time.chrono.ChronoLocalDate chronoLocalDate = this.f;
            if (chronoLocalDate != null) {
                return j$.time.LocalDate.from(chronoLocalDate);
            }
        } else {
            if (temporalQuery == j$.time.temporal.m.g) {
                return this.g;
            }
            if (temporalQuery == j$.time.temporal.m.d) {
                java.lang.Long l = (java.lang.Long) this.a.get(j$.time.temporal.a.OFFSET_SECONDS);
                if (l != null) {
                    return j$.time.ZoneOffset.Q(l.intValue());
                }
                j$.time.ZoneId zoneId = this.b;
                return zoneId instanceof j$.time.ZoneOffset ? zoneId : temporalQuery.queryFrom(this);
            }
            if (temporalQuery == j$.time.temporal.m.e) {
                return temporalQuery.queryFrom(this);
            }
            if (temporalQuery != j$.time.temporal.m.c) {
                return temporalQuery.queryFrom(this);
            }
        }
        return null;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        if (this.a.containsKey(lVar)) {
            return true;
        }
        j$.time.chrono.ChronoLocalDate chronoLocalDate = this.f;
        if (chronoLocalDate != null && chronoLocalDate.c(lVar)) {
            return true;
        }
        j$.time.j jVar = this.g;
        if (jVar == null || !jVar.c(lVar)) {
            return (lVar == null || (lVar instanceof j$.time.temporal.a) || !lVar.h(this)) ? false : true;
        }
        return true;
    }

    public final void e(j$.time.temporal.TemporalAccessor temporalAccessor) {
        java.util.Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            j$.time.temporal.l lVar = (j$.time.temporal.l) entry.getKey();
            if (temporalAccessor.c(lVar)) {
                try {
                    long jD = temporalAccessor.D(lVar);
                    long jLongValue = ((java.lang.Long) entry.getValue()).longValue();
                    if (jD != jLongValue) {
                        throw new j$.time.DateTimeException("Conflict found: Field " + java.lang.String.valueOf(lVar) + " " + jD + " differs from " + java.lang.String.valueOf(lVar) + " " + jLongValue + " derived from " + java.lang.String.valueOf(temporalAccessor));
                    }
                    it.remove();
                } catch (java.lang.RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final void f() {
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        java.util.HashMap map = this.a;
        if (map.containsKey(aVar)) {
            j$.time.ZoneId zoneId = this.b;
            if (zoneId != null) {
                i(zoneId);
                return;
            }
            java.lang.Long l = (java.lang.Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l != null) {
                i(j$.time.ZoneOffset.Q(l.intValue()));
            }
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int h(j$.time.temporal.l lVar) {
        return j$.time.temporal.m.a(this, lVar);
    }

    public final void i(j$.time.ZoneId zoneId) {
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        j$.time.chrono.ChronoZonedDateTime chronoZonedDateTimeV = this.c.V(j$.time.Instant.ofEpochSecond(((java.lang.Long) this.a.remove(aVar)).longValue()), zoneId);
        o(chronoZonedDateTimeV.toLocalDate());
        p(aVar, j$.time.temporal.a.SECOND_OF_DAY, java.lang.Long.valueOf(chronoZonedDateTimeV.toLocalTime().U()));
    }

    public final void j(long j, long j2, long j3, long j4) {
        if (this.e == j$.time.format.c0.LENIENT) {
            long jN = j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.O(j, 3600000000000L), j$.com.android.tools.r8.a.O(j2, 60000000000L)), j$.com.android.tools.r8.a.O(j3, 1000000000L)), j4);
            n(j$.time.j.L(j$.com.android.tools.r8.a.M(jN, 86400000000000L)), j$.time.q.a(0, 0, (int) j$.com.android.tools.r8.a.C(jN, 86400000000000L)));
            return;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.MINUTE_OF_HOUR;
        int iA = aVar.b.a(j2, aVar);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
        int iA2 = aVar2.b.a(j4, aVar2);
        if (this.e == j$.time.format.c0.SMART && j == 24 && iA == 0 && j3 == 0 && iA2 == 0) {
            n(j$.time.j.g, j$.time.q.a(0, 0, 1));
            return;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.HOUR_OF_DAY;
        int iA3 = aVar3.b.a(j, aVar3);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.SECOND_OF_MINUTE;
        n(j$.time.j.C(iA3, iA, aVar4.b.a(j3, aVar4), iA2), j$.time.q.d);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ j$.time.temporal.o l(j$.time.temporal.l lVar) {
        return j$.time.temporal.m.d(this, lVar);
    }

    public final void m() {
        j$.time.temporal.a aVar = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        java.util.HashMap map = this.a;
        if (map.containsKey(aVar)) {
            long jLongValue = ((java.lang.Long) map.remove(aVar)).longValue();
            j$.time.format.c0 c0Var = this.e;
            if (c0Var == j$.time.format.c0.STRICT || (c0Var == j$.time.format.c0.SMART && jLongValue != 0)) {
                aVar.t(jLongValue);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            p(aVar, aVar2, java.lang.Long.valueOf(jLongValue));
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (map.containsKey(aVar3)) {
            long jLongValue2 = ((java.lang.Long) map.remove(aVar3)).longValue();
            j$.time.format.c0 c0Var2 = this.e;
            if (c0Var2 == j$.time.format.c0.STRICT || (c0Var2 == j$.time.format.c0.SMART && jLongValue2 != 0)) {
                aVar3.t(jLongValue2);
            }
            p(aVar3, j$.time.temporal.a.HOUR_OF_AMPM, java.lang.Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.AMPM_OF_DAY;
        if (map.containsKey(aVar4)) {
            j$.time.temporal.a aVar5 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (map.containsKey(aVar5)) {
                long jLongValue3 = ((java.lang.Long) map.remove(aVar4)).longValue();
                long jLongValue4 = ((java.lang.Long) map.remove(aVar5)).longValue();
                if (this.e == j$.time.format.c0.LENIENT) {
                    p(aVar4, j$.time.temporal.a.HOUR_OF_DAY, java.lang.Long.valueOf(j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.O(jLongValue3, 12L), jLongValue4)));
                } else {
                    aVar4.t(jLongValue3);
                    aVar5.t(jLongValue3);
                    p(aVar4, j$.time.temporal.a.HOUR_OF_DAY, java.lang.Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        j$.time.temporal.a aVar6 = j$.time.temporal.a.NANO_OF_DAY;
        if (map.containsKey(aVar6)) {
            long jLongValue5 = ((java.lang.Long) map.remove(aVar6)).longValue();
            if (this.e != j$.time.format.c0.LENIENT) {
                aVar6.t(jLongValue5);
            }
            p(aVar6, j$.time.temporal.a.HOUR_OF_DAY, java.lang.Long.valueOf(jLongValue5 / 3600000000000L));
            p(aVar6, j$.time.temporal.a.MINUTE_OF_HOUR, java.lang.Long.valueOf((jLongValue5 / 60000000000L) % 60));
            p(aVar6, j$.time.temporal.a.SECOND_OF_MINUTE, java.lang.Long.valueOf((jLongValue5 / 1000000000) % 60));
            p(aVar6, j$.time.temporal.a.NANO_OF_SECOND, java.lang.Long.valueOf(jLongValue5 % 1000000000));
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.MICRO_OF_DAY;
        if (map.containsKey(aVar7)) {
            long jLongValue6 = ((java.lang.Long) map.remove(aVar7)).longValue();
            if (this.e != j$.time.format.c0.LENIENT) {
                aVar7.t(jLongValue6);
            }
            p(aVar7, j$.time.temporal.a.SECOND_OF_DAY, java.lang.Long.valueOf(jLongValue6 / 1000000));
            p(aVar7, j$.time.temporal.a.MICRO_OF_SECOND, java.lang.Long.valueOf(jLongValue6 % 1000000));
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.MILLI_OF_DAY;
        if (map.containsKey(aVar8)) {
            long jLongValue7 = ((java.lang.Long) map.remove(aVar8)).longValue();
            if (this.e != j$.time.format.c0.LENIENT) {
                aVar8.t(jLongValue7);
            }
            p(aVar8, j$.time.temporal.a.SECOND_OF_DAY, java.lang.Long.valueOf(jLongValue7 / 1000));
            p(aVar8, j$.time.temporal.a.MILLI_OF_SECOND, java.lang.Long.valueOf(jLongValue7 % 1000));
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.SECOND_OF_DAY;
        if (map.containsKey(aVar9)) {
            long jLongValue8 = ((java.lang.Long) map.remove(aVar9)).longValue();
            if (this.e != j$.time.format.c0.LENIENT) {
                aVar9.t(jLongValue8);
            }
            p(aVar9, j$.time.temporal.a.HOUR_OF_DAY, java.lang.Long.valueOf(jLongValue8 / 3600));
            p(aVar9, j$.time.temporal.a.MINUTE_OF_HOUR, java.lang.Long.valueOf((jLongValue8 / 60) % 60));
            p(aVar9, j$.time.temporal.a.SECOND_OF_MINUTE, java.lang.Long.valueOf(jLongValue8 % 60));
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (map.containsKey(aVar10)) {
            long jLongValue9 = ((java.lang.Long) map.remove(aVar10)).longValue();
            if (this.e != j$.time.format.c0.LENIENT) {
                aVar10.t(jLongValue9);
            }
            p(aVar10, j$.time.temporal.a.HOUR_OF_DAY, java.lang.Long.valueOf(jLongValue9 / 60));
            p(aVar10, j$.time.temporal.a.MINUTE_OF_HOUR, java.lang.Long.valueOf(jLongValue9 % 60));
        }
        j$.time.temporal.a aVar11 = j$.time.temporal.a.NANO_OF_SECOND;
        if (map.containsKey(aVar11)) {
            long jLongValue10 = ((java.lang.Long) map.get(aVar11)).longValue();
            j$.time.format.c0 c0Var3 = this.e;
            j$.time.format.c0 c0Var4 = j$.time.format.c0.LENIENT;
            if (c0Var3 != c0Var4) {
                aVar11.t(jLongValue10);
            }
            j$.time.temporal.a aVar12 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (map.containsKey(aVar12)) {
                long jLongValue11 = ((java.lang.Long) map.remove(aVar12)).longValue();
                if (this.e != c0Var4) {
                    aVar12.t(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                p(aVar12, aVar11, java.lang.Long.valueOf(jLongValue10));
            }
            j$.time.temporal.a aVar13 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (map.containsKey(aVar13)) {
                long jLongValue12 = ((java.lang.Long) map.remove(aVar13)).longValue();
                if (this.e != c0Var4) {
                    aVar13.t(jLongValue12);
                }
                p(aVar13, aVar11, java.lang.Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        j$.time.temporal.a aVar14 = j$.time.temporal.a.HOUR_OF_DAY;
        if (map.containsKey(aVar14)) {
            j$.time.temporal.a aVar15 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (map.containsKey(aVar15)) {
                j$.time.temporal.a aVar16 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (map.containsKey(aVar16) && map.containsKey(aVar11)) {
                    j(((java.lang.Long) map.remove(aVar14)).longValue(), ((java.lang.Long) map.remove(aVar15)).longValue(), ((java.lang.Long) map.remove(aVar16)).longValue(), ((java.lang.Long) map.remove(aVar11)).longValue());
                }
            }
        }
    }

    public final void n(j$.time.j jVar, j$.time.q qVar) {
        j$.time.j jVar2 = this.g;
        if (jVar2 == null) {
            this.g = jVar;
            this.h = qVar;
            return;
        }
        if (!jVar2.equals(jVar)) {
            j$.time.g.h(j$.desugar.sun.nio.fs.h.b("Conflict found: Fields resolved to different times: ", java.lang.String.valueOf(this.g), " ", java.lang.String.valueOf(jVar)));
            return;
        }
        j$.time.q qVar2 = this.h;
        j$.time.q qVar3 = j$.time.q.d;
        if (qVar2 == qVar3 || qVar == qVar3 || qVar2.equals(qVar)) {
            this.h = qVar;
        } else {
            j$.time.g.h(j$.desugar.sun.nio.fs.h.b("Conflict found: Fields resolved to different excess periods: ", java.lang.String.valueOf(this.h), " ", java.lang.String.valueOf(qVar)));
        }
    }

    public final void o(j$.time.chrono.ChronoLocalDate chronoLocalDate) {
        j$.time.chrono.ChronoLocalDate chronoLocalDate2 = this.f;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate == null || chronoLocalDate2.equals(chronoLocalDate)) {
                return;
            }
            j$.time.g.h(j$.desugar.sun.nio.fs.h.b("Conflict found: Fields resolved to two different dates: ", java.lang.String.valueOf(this.f), " ", java.lang.String.valueOf(chronoLocalDate)));
            return;
        }
        if (chronoLocalDate != null) {
            if (this.c.equals(chronoLocalDate.getChronology())) {
                this.f = chronoLocalDate;
            } else {
                j$.time.g.h("ChronoLocalDate must use the effective parsed chronology: ".concat(java.lang.String.valueOf(this.c)));
            }
        }
    }

    public final void p(j$.time.temporal.l lVar, j$.time.temporal.a aVar, java.lang.Long l) {
        java.lang.Long l2 = (java.lang.Long) this.a.put(aVar, l);
        if (l2 == null || l2.longValue() == l.longValue()) {
            return;
        }
        throw new j$.time.DateTimeException("Conflict found: " + java.lang.String.valueOf(aVar) + " " + l2 + " differs from " + java.lang.String.valueOf(aVar) + " " + l + " while resolving  " + java.lang.String.valueOf(lVar));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        sb.append(this.a);
        sb.append(',');
        sb.append(this.c);
        if (this.b != null) {
            sb.append(',');
            sb.append(this.b);
        }
        if (this.f != null || this.g != null) {
            sb.append(" resolved to ");
            j$.time.chrono.ChronoLocalDate chronoLocalDate = this.f;
            if (chronoLocalDate != null) {
                sb.append(chronoLocalDate);
                if (this.g != null) {
                    sb.append('T');
                    sb.append(this.g);
                }
            } else {
                sb.append(this.g);
            }
        }
        return sb.toString();
    }
}
