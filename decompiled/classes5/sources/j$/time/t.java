package j$.time;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class t implements j$.time.temporal.Temporal, j$.time.temporal.TemporalAdjuster, java.lang.Comparable, java.io.Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    public final int a;

    static {
        j$.time.format.u uVar = new j$.time.format.u();
        uVar.m(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.d0.EXCEEDS_PAD);
        uVar.q(java.util.Locale.getDefault(), j$.time.format.c0.SMART, null);
    }

    public t(int i) {
        this.a = i;
    }

    public static j$.time.t r(int i) {
        j$.time.temporal.a.YEAR.t(i);
        return new j$.time.t(i);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.r((byte) 11, this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final j$.time.t a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return (j$.time.t) lVar.r(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        aVar.t(j);
        int i = j$.time.s.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                j = 1 - j;
            }
            return r((int) j);
        }
        if (i == 2) {
            return r((int) j);
        }
        if (i == 3) {
            return D(j$.time.temporal.a.ERA) != j ? r(1 - i2) : this;
        }
        j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
        return null;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(this);
        }
        int i = j$.time.s.a[((j$.time.temporal.a) lVar).ordinal()];
        int i2 = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return i2 < 1 ? 0 : 1;
                }
                j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
                return 0L;
            }
        } else if (i2 < 1) {
            i2 = 1 - i2;
        }
        return i2;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object G(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.m.b) {
            return j$.time.chrono.q.c;
        }
        return temporalQuery == j$.time.temporal.m.c ? j$.time.temporal.ChronoUnit.YEARS : j$.time.temporal.m.c(this, temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            if (lVar == j$.time.temporal.a.YEAR || lVar == j$.time.temporal.a.YEAR_OF_ERA || lVar == j$.time.temporal.a.ERA) {
                return true;
            }
        } else if (lVar != null && lVar.h(this)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return this.a - ((j$.time.t) obj).a;
    }

    @Override // j$.time.temporal.Temporal
    public final long d(j$.time.temporal.Temporal temporal, j$.time.temporal.TemporalUnit temporalUnit) {
        j$.time.t tVarR;
        if (temporal instanceof j$.time.t) {
            tVarR = (j$.time.t) temporal;
        } else {
            j$.util.Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.q.c.equals(j$.com.android.tools.r8.a.y(temporal))) {
                    temporal = j$.time.LocalDate.from(temporal);
                }
                tVarR = r(temporal.h(j$.time.temporal.a.YEAR));
            } catch (j$.time.DateTimeException e) {
                throw new j$.time.DateTimeException(j$.desugar.sun.nio.fs.h.b("Unable to obtain Year from TemporalAccessor: ", java.lang.String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            return temporalUnit.between(this, tVarR);
        }
        long j = ((long) tVarR.a) - ((long) this.a);
        int i = j$.time.s.b[((j$.time.temporal.ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return j;
        }
        if (i == 2) {
            return j / 10;
        }
        if (i == 3) {
            return j / 100;
        }
        if (i == 4) {
            return j / 1000;
        }
        if (i == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return tVarR.D(aVar) - D(aVar);
        }
        j$.time.g.f("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
        return 0L;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.t) {
            if (this.a == ((j$.time.t) obj).a) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        return l(lVar).a(D(lVar), lVar);
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.Temporal x(j$.time.LocalDate localDate) {
        return (j$.time.t) localDate.p(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        if (lVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.o.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.m.d(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.Temporal p(j$.time.temporal.Temporal temporal) {
        if (j$.com.android.tools.r8.a.y(temporal).equals(j$.time.chrono.q.c)) {
            return temporal.a(this.a, j$.time.temporal.a.YEAR);
        }
        j$.time.g.h("Adjustment only supported on ISO date-time");
        return null;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final j$.time.t b(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            return (j$.time.t) temporalUnit.h(this, j);
        }
        int i = j$.time.s.b[((j$.time.temporal.ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return z(j);
        }
        if (i == 2) {
            return z(j$.com.android.tools.r8.a.O(j, 10L));
        }
        if (i == 3) {
            return z(j$.com.android.tools.r8.a.O(j, 100L));
        }
        if (i == 4) {
            return z(j$.com.android.tools.r8.a.O(j, 1000L));
        }
        if (i == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return a(j$.com.android.tools.r8.a.N(D(aVar), j), aVar);
        }
        j$.time.g.f("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
        return null;
    }

    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.a);
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

    public final j$.time.t z(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return r(aVar.b.a(((long) this.a) + j, aVar));
    }
}
