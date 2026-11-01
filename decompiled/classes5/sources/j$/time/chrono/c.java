package j$.time.chrono;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class c implements j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal, j$.time.temporal.TemporalAdjuster, java.io.Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public static j$.time.chrono.ChronoLocalDate r(j$.time.chrono.a aVar, j$.time.temporal.Temporal temporal) {
        j$.time.chrono.ChronoLocalDate chronoLocalDate = (j$.time.chrono.ChronoLocalDate) temporal;
        if (aVar.equals(chronoLocalDate.getChronology())) {
            return chronoLocalDate;
        }
        throw new java.lang.ClassCastException(j$.desugar.sun.nio.fs.h.b("Chronology mismatch, expected: ", aVar.C(), ", actual: ", chronoLocalDate.getChronology().C()));
    }

    public abstract j$.time.chrono.ChronoLocalDate B(long j);

    public abstract j$.time.chrono.ChronoLocalDate C(long j);

    @Override // j$.time.chrono.ChronoLocalDate
    public long E() {
        return D(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public j$.time.chrono.d F(j$.time.j jVar) {
        return new j$.time.chrono.f(this, jVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ java.lang.Object G(j$.time.temporal.TemporalQuery temporalQuery) {
        return j$.com.android.tools.r8.a.m(this, temporalQuery);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public j$.time.chrono.k H() {
        return getChronology().y(j$.time.temporal.m.a(this, j$.time.temporal.a.ERA));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public j$.time.chrono.ChronoLocalDate J(j$.time.temporal.TemporalAmount temporalAmount) {
        return r(getChronology(), temporalAmount.h(this));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int K() {
        return s() ? 366 : 365;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ int compareTo(j$.time.chrono.ChronoLocalDate chronoLocalDate) {
        return j$.com.android.tools.r8.a.b(this, chronoLocalDate);
    }

    @Override // j$.time.temporal.Temporal
    public j$.time.chrono.ChronoLocalDate a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return r(getChronology(), lVar.r(this, j));
        }
        j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
        return null;
    }

    @Override // j$.time.temporal.Temporal
    public j$.time.chrono.ChronoLocalDate b(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof j$.time.temporal.ChronoUnit;
        if (!z) {
            if (!z) {
                return r(getChronology(), temporalUnit.h(this, j));
            }
            j$.time.g.f("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
            return null;
        }
        switch (j$.time.chrono.b.a[((j$.time.temporal.ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return z(j);
            case 2:
                return z(j$.com.android.tools.r8.a.O(j, 7L));
            case 3:
                return B(j);
            case 4:
                return C(j);
            case 5:
                return C(j$.com.android.tools.r8.a.O(j, 10L));
            case 6:
                return C(j$.com.android.tools.r8.a.O(j, 100L));
            case 7:
                return C(j$.com.android.tools.r8.a.O(j, 1000L));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.com.android.tools.r8.a.N(D(aVar), j), (j$.time.temporal.l) aVar);
            default:
                j$.time.g.f("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
                return null;
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public /* synthetic */ boolean c(j$.time.temporal.l lVar) {
        return j$.com.android.tools.r8.a.k(this, lVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final long d(j$.time.temporal.Temporal temporal, j$.time.temporal.TemporalUnit temporalUnit) {
        j$.util.Objects.requireNonNull(temporal, "endExclusive");
        j$.time.chrono.ChronoLocalDate chronoLocalDateL = getChronology().l(temporal);
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            j$.util.Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, chronoLocalDateL);
        }
        switch (j$.time.chrono.b.a[((j$.time.temporal.ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return chronoLocalDateL.E() - E();
            case 2:
                return (chronoLocalDateL.E() - E()) / 7;
            case 3:
                return t(chronoLocalDateL);
            case 4:
                return t(chronoLocalDateL) / 12;
            case 5:
                return t(chronoLocalDateL) / 120;
            case 6:
                return t(chronoLocalDateL) / 1200;
            case 7:
                return t(chronoLocalDateL) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return chronoLocalDateL.D(aVar) - D(aVar);
            default:
                j$.time.g.f("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof j$.time.chrono.ChronoLocalDate) && j$.com.android.tools.r8.a.b(this, (j$.time.chrono.ChronoLocalDate) obj) == 0;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int h(j$.time.temporal.l lVar) {
        return j$.time.temporal.m.a(this, lVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long jE = E();
        return getChronology().hashCode() ^ ((int) (jE ^ (jE >>> 32)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.o l(j$.time.temporal.l lVar) {
        return j$.time.temporal.m.d(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.Temporal p(j$.time.temporal.Temporal temporal) {
        return temporal.a(E(), j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean s() {
        return getChronology().D(D(j$.time.temporal.a.YEAR));
    }

    public final long t(j$.time.chrono.ChronoLocalDate chronoLocalDate) {
        if (getChronology().O(j$.time.temporal.a.MONTH_OF_YEAR).d != 12) {
            throw new java.lang.IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        long jD = D(aVar) << 5;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_MONTH;
        return (((chronoLocalDate.D(aVar) << 5) + ((long) chronoLocalDate.h(aVar2))) - (jD + ((long) j$.time.temporal.m.a(this, aVar2)))) / 32;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final java.lang.String toString() {
        long jD = D(j$.time.temporal.a.YEAR_OF_ERA);
        long jD2 = D(j$.time.temporal.a.MONTH_OF_YEAR);
        long jD3 = D(j$.time.temporal.a.DAY_OF_MONTH);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(" ");
        sb.append(H());
        sb.append(" ");
        sb.append(jD);
        sb.append(jD2 < 10 ? "-0" : "-");
        sb.append(jD2);
        sb.append(jD3 < 10 ? "-0" : "-");
        sb.append(jD3);
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: u */
    public j$.time.chrono.ChronoLocalDate y(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        return r(getChronology(), j$.time.temporal.m.b(this, j, temporalUnit));
    }

    @Override // j$.time.temporal.Temporal
    public j$.time.chrono.ChronoLocalDate x(j$.time.temporal.TemporalAdjuster temporalAdjuster) {
        return r(getChronology(), temporalAdjuster.p(this));
    }

    public abstract j$.time.chrono.ChronoLocalDate z(long j);
}
