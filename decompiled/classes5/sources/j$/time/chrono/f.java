package j$.time.chrono;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class f implements j$.time.chrono.d, j$.time.temporal.Temporal, j$.time.temporal.TemporalAdjuster, java.io.Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient j$.time.chrono.ChronoLocalDate a;
    public final transient j$.time.j b;

    public f(j$.time.chrono.ChronoLocalDate chronoLocalDate, j$.time.j jVar) {
        j$.util.Objects.requireNonNull(chronoLocalDate, "date");
        j$.util.Objects.requireNonNull(jVar, "time");
        this.a = chronoLocalDate;
        this.b = jVar;
    }

    public static j$.time.chrono.f r(j$.time.chrono.a aVar, j$.time.temporal.Temporal temporal) {
        j$.time.chrono.f fVar = (j$.time.chrono.f) temporal;
        if (aVar.equals(fVar.a.getChronology())) {
            return fVar;
        }
        throw new java.lang.ClassCastException(j$.desugar.sun.nio.fs.h.b("Chronology mismatch, required: ", aVar.C(), ", actual: ", fVar.a.getChronology().C()));
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.chrono.c0((byte) 2, this);
    }

    @Override // j$.time.chrono.d
    public final j$.time.chrono.ChronoZonedDateTime A(j$.time.ZoneId zoneId) {
        return j$.time.chrono.j.r(zoneId, null, this);
    }

    public final /* synthetic */ long B(j$.time.ZoneOffset zoneOffset) {
        return j$.com.android.tools.r8.a.q(this, zoneOffset);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final j$.time.chrono.f a(long j, j$.time.temporal.l lVar) {
        boolean z = lVar instanceof j$.time.temporal.a;
        j$.time.chrono.ChronoLocalDate chronoLocalDate = this.a;
        if (!z) {
            return r(chronoLocalDate.getChronology(), lVar.r(this, j));
        }
        boolean zY = ((j$.time.temporal.a) lVar).y();
        j$.time.j jVar = this.b;
        return zY ? L(chronoLocalDate, jVar.a(j, lVar)) : L(chronoLocalDate.a(j, lVar), jVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) lVar).y() ? this.b.D(lVar) : this.a.D(lVar);
        }
        return lVar.l(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ java.lang.Object G(j$.time.temporal.TemporalQuery temporalQuery) {
        return j$.com.android.tools.r8.a.n(this, temporalQuery);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int compareTo(j$.time.chrono.d dVar) {
        return j$.com.android.tools.r8.a.c(this, dVar);
    }

    public final j$.time.chrono.f L(j$.time.temporal.Temporal temporal, j$.time.j jVar) {
        j$.time.chrono.ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == temporal && this.b == jVar) ? this : new j$.time.chrono.f(j$.time.chrono.c.r(chronoLocalDate.getChronology(), temporal), jVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
            if (aVar.isDateBased() || aVar.y()) {
                return true;
            }
        } else if (lVar != null && lVar.h(this)) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final long d(j$.time.temporal.Temporal temporal, j$.time.temporal.TemporalUnit temporalUnit) {
        j$.util.Objects.requireNonNull(temporal, "endExclusive");
        j$.time.chrono.ChronoLocalDate chronoLocalDate = this.a;
        j$.time.chrono.d dVarG = chronoLocalDate.getChronology().G(temporal);
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            j$.util.Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, dVarG);
        }
        j$.time.temporal.ChronoUnit chronoUnit = (j$.time.temporal.ChronoUnit) temporalUnit;
        j$.time.temporal.ChronoUnit chronoUnit2 = j$.time.temporal.ChronoUnit.DAYS;
        int iCompareTo = chronoUnit.compareTo(chronoUnit2);
        j$.time.j jVar = this.b;
        if (iCompareTo >= 0) {
            j$.time.chrono.ChronoLocalDate localDate = dVarG.toLocalDate();
            if (dVarG.toLocalTime().compareTo(jVar) < 0) {
                localDate = localDate.y(1L, chronoUnit2);
            }
            return chronoLocalDate.d(localDate, temporalUnit);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        long jD = dVarG.D(aVar) - chronoLocalDate.D(aVar);
        switch (j$.time.chrono.e.a[chronoUnit.ordinal()]) {
            case 1:
                jD = j$.com.android.tools.r8.a.O(jD, 86400000000000L);
                break;
            case 2:
                jD = j$.com.android.tools.r8.a.O(jD, 86400000000L);
                break;
            case 3:
                jD = j$.com.android.tools.r8.a.O(jD, 86400000L);
                break;
            case 4:
                jD = j$.com.android.tools.r8.a.O(jD, 86400L);
                break;
            case 5:
                jD = j$.com.android.tools.r8.a.O(jD, 1440L);
                break;
            case 6:
                jD = j$.com.android.tools.r8.a.O(jD, 24L);
                break;
            case 7:
                jD = j$.com.android.tools.r8.a.O(jD, 2L);
                break;
        }
        return j$.com.android.tools.r8.a.N(jD, jVar.d(dVarG.toLocalTime(), temporalUnit));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof j$.time.chrono.d) && j$.com.android.tools.r8.a.c(this, (j$.time.chrono.d) obj) == 0;
        }
        return true;
    }

    @Override // j$.time.chrono.d
    public final j$.time.chrono.a getChronology() {
        return this.a.getChronology();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) lVar).y() ? this.b.h(lVar) : this.a.h(lVar);
        }
        return l(lVar).a(D(lVar), lVar);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.Temporal x(j$.time.LocalDate localDate) {
        return j$.desugar.sun.nio.fs.h.c(localDate) ? L(localDate, this.b) : r(this.a.getChronology(), (j$.time.chrono.f) localDate.p(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.k(this);
        }
        if (!((j$.time.temporal.a) lVar).y()) {
            return this.a.l(lVar);
        }
        j$.time.j jVar = this.b;
        jVar.getClass();
        return j$.time.temporal.m.d(jVar, lVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.Temporal p(j$.time.temporal.Temporal temporal) {
        return temporal.a(toLocalDate().E(), j$.time.temporal.a.EPOCH_DAY).a(toLocalTime().T(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final j$.time.chrono.f b(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof j$.time.temporal.ChronoUnit;
        j$.time.chrono.ChronoLocalDate chronoLocalDate = this.a;
        if (!z) {
            return r(chronoLocalDate.getChronology(), temporalUnit.h(this, j));
        }
        int i = j$.time.chrono.e.a[((j$.time.temporal.ChronoUnit) temporalUnit).ordinal()];
        j$.time.j jVar = this.b;
        switch (i) {
            case 1:
                return z(chronoLocalDate, 0L, 0L, 0L, j);
            case 2:
                j$.time.chrono.f fVarL = L(chronoLocalDate.b(j / 86400000000L, (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS), jVar);
                return fVarL.z(fVarL.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                j$.time.chrono.f fVarL2 = L(chronoLocalDate.b(j / 86400000, (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS), jVar);
                return fVarL2.z(fVarL2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return z(chronoLocalDate, 0L, 0L, j, 0L);
            case 5:
                return z(chronoLocalDate, 0L, j, 0L, 0L);
            case 6:
                return z(chronoLocalDate, j, 0L, 0L, 0L);
            case 7:
                j$.time.chrono.f fVarL3 = L(chronoLocalDate.b(j / 256, (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS), jVar);
                return fVarL3.z(fVarL3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return L(chronoLocalDate.b(j, temporalUnit), jVar);
        }
    }

    @Override // j$.time.chrono.d
    public final j$.time.chrono.ChronoLocalDate toLocalDate() {
        return this.a;
    }

    @Override // j$.time.chrono.d
    public final j$.time.j toLocalTime() {
        return this.b;
    }

    public final java.lang.String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final j$.time.temporal.Temporal y(long j, j$.time.temporal.ChronoUnit chronoUnit) {
        return r(this.a.getChronology(), j$.time.temporal.m.b(this, j, chronoUnit));
    }

    public final j$.time.chrono.f z(j$.time.chrono.ChronoLocalDate chronoLocalDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j$.time.j jVarL = this.b;
        if (j5 == 0) {
            return L(chronoLocalDate, jVarL);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jT = jVarL.T();
        long j10 = j9 + jT;
        long jC = j$.com.android.tools.r8.a.C(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long jM = j$.com.android.tools.r8.a.M(j10, 86400000000000L);
        if (jM != jT) {
            jVarL = j$.time.j.L(jM);
        }
        return L(chronoLocalDate.b(jC, (j$.time.temporal.TemporalUnit) j$.time.temporal.ChronoUnit.DAYS), jVarL);
    }
}
