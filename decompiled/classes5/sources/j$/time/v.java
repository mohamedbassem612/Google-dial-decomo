package j$.time;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class v implements j$.time.temporal.Temporal, j$.time.temporal.TemporalAdjuster, java.lang.Comparable, java.io.Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    static {
        j$.time.format.u uVar = new j$.time.format.u();
        uVar.m(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.d0.EXCEEDS_PAD);
        uVar.d('-');
        uVar.l(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        uVar.q(java.util.Locale.getDefault(), j$.time.format.c0.SMART, null);
    }

    public v(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.r((byte) 12, this);
    }

    public final j$.time.v B(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return C(aVar.b.a(((long) this.a) + j, aVar), this.b);
    }

    public final j$.time.v C(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new j$.time.v(i, i2);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        int i;
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(this);
        }
        int i2 = j$.time.u.a[((j$.time.temporal.a) lVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 == 2) {
                return r();
            }
            i = this.a;
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 == 5) {
                        return i < 1 ? 0 : 1;
                    }
                    j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
                    return 0L;
                }
            } else if (i < 1) {
                i = 1 - i;
            }
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object G(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.m.b) {
            return j$.time.chrono.q.c;
        }
        return temporalQuery == j$.time.temporal.m.c ? j$.time.temporal.ChronoUnit.MONTHS : j$.time.temporal.m.c(this, temporalQuery);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final j$.time.v a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return (j$.time.v) lVar.r(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        aVar.t(j);
        int i = j$.time.u.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            int i3 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.t(i3);
            return C(i2, i3);
        }
        if (i == 2) {
            return z(j - r());
        }
        int i4 = this.b;
        if (i == 3) {
            if (i2 < 1) {
                j = 1 - j;
            }
            int i5 = (int) j;
            j$.time.temporal.a.YEAR.t(i5);
            return C(i5, i4);
        }
        if (i == 4) {
            int i6 = (int) j;
            j$.time.temporal.a.YEAR.t(i6);
            return C(i6, i4);
        }
        if (i != 5) {
            j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
            return null;
        }
        if (D(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i7 = 1 - i2;
        j$.time.temporal.a.YEAR.t(i7);
        return C(i7, i4);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            if (lVar == j$.time.temporal.a.YEAR || lVar == j$.time.temporal.a.MONTH_OF_YEAR || lVar == j$.time.temporal.a.PROLEPTIC_MONTH || lVar == j$.time.temporal.a.YEAR_OF_ERA || lVar == j$.time.temporal.a.ERA) {
                return true;
            }
        } else if (lVar != null && lVar.h(this)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        j$.time.v vVar = (j$.time.v) obj;
        int i = this.a - vVar.a;
        return i == 0 ? this.b - vVar.b : i;
    }

    @Override // j$.time.temporal.Temporal
    public final long d(j$.time.temporal.Temporal temporal, j$.time.temporal.TemporalUnit temporalUnit) {
        j$.time.v vVar;
        if (temporal instanceof j$.time.v) {
            vVar = (j$.time.v) temporal;
        } else {
            j$.util.Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.q.c.equals(j$.com.android.tools.r8.a.y(temporal))) {
                    temporal = j$.time.LocalDate.from(temporal);
                }
                j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
                int iH = temporal.h(aVar);
                j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
                int iH2 = temporal.h(aVar2);
                aVar.t(iH);
                aVar2.t(iH2);
                vVar = new j$.time.v(iH, iH2);
            } catch (j$.time.DateTimeException e) {
                throw new j$.time.DateTimeException(j$.desugar.sun.nio.fs.h.b("Unable to obtain YearMonth from TemporalAccessor: ", java.lang.String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            return temporalUnit.between(this, vVar);
        }
        long jR = vVar.r() - r();
        switch (j$.time.u.b[((j$.time.temporal.ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jR;
            case 2:
                return jR / 12;
            case 3:
                return jR / 120;
            case 4:
                return jR / 1200;
            case 5:
                return jR / 12000;
            case 6:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
                return vVar.D(aVar3) - D(aVar3);
            default:
                j$.time.g.f("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.v) {
            j$.time.v vVar = (j$.time.v) obj;
            if (this.a == vVar.a && this.b == vVar.b) {
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
        return this.a ^ (this.b << 27);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.Temporal x(j$.time.LocalDate localDate) {
        return (j$.time.v) localDate.p(this);
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
            return temporal.a(r(), j$.time.temporal.a.PROLEPTIC_MONTH);
        }
        j$.time.g.h("Adjustment only supported on ISO date-time");
        return null;
    }

    public final long r() {
        return ((((long) this.a) * 12) + ((long) this.b)) - 1;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final j$.time.v b(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            return (j$.time.v) temporalUnit.h(this, j);
        }
        switch (j$.time.u.b[((j$.time.temporal.ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return z(j);
            case 2:
                return B(j);
            case 3:
                return B(j$.com.android.tools.r8.a.O(j, 10L));
            case 4:
                return B(j$.com.android.tools.r8.a.O(j, 100L));
            case 5:
                return B(j$.com.android.tools.r8.a.O(j, 1000L));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.com.android.tools.r8.a.N(D(aVar), j), aVar);
            default:
                j$.time.g.f("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
                return null;
        }
    }

    public final java.lang.String toString() {
        int i = this.a;
        int iAbs = java.lang.Math.abs(i);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(9);
        if (iAbs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
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

    public final j$.time.v z(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return C(aVar.b.a(j$.com.android.tools.r8.a.C(j2, 12L), aVar), ((int) j$.com.android.tools.r8.a.M(j2, 12L)) + 1);
    }
}
