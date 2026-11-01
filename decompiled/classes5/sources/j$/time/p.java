package j$.time;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class p implements j$.time.temporal.Temporal, j$.time.temporal.TemporalAdjuster, java.lang.Comparable, java.io.Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final j$.time.j a;
    public final j$.time.ZoneOffset b;

    static {
        j$.time.j jVar = j$.time.j.e;
        j$.time.ZoneOffset zoneOffset = j$.time.ZoneOffset.g;
        jVar.getClass();
        new j$.time.p(jVar, zoneOffset);
        j$.time.j jVar2 = j$.time.j.f;
        j$.time.ZoneOffset zoneOffset2 = j$.time.ZoneOffset.f;
        jVar2.getClass();
        new j$.time.p(jVar2, zoneOffset2);
    }

    public p(j$.time.j jVar, j$.time.ZoneOffset zoneOffset) {
        this.a = (j$.time.j) j$.util.Objects.requireNonNull(jVar, "time");
        this.b = (j$.time.ZoneOffset) j$.util.Objects.requireNonNull(zoneOffset, "offset");
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.r((byte) 9, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            return lVar == j$.time.temporal.a.OFFSET_SECONDS ? this.b.getTotalSeconds() : this.a.D(lVar);
        }
        return lVar.l(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object G(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.m.d || temporalQuery == j$.time.temporal.m.e) {
            return this.b;
        }
        if (((temporalQuery == j$.time.temporal.m.a) || (temporalQuery == j$.time.temporal.m.b)) || temporalQuery == j$.time.temporal.m.f) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.m.g) {
            return this.a;
        }
        return temporalQuery == j$.time.temporal.m.c ? j$.time.temporal.ChronoUnit.NANOS : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.Temporal
    public final j$.time.temporal.Temporal a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return (j$.time.p) lVar.r(this, j);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
        j$.time.j jVar = this.a;
        if (lVar != aVar) {
            return z(jVar.a(j, lVar), this.b);
        }
        j$.time.temporal.a aVar2 = (j$.time.temporal.a) lVar;
        return z(jVar, j$.time.ZoneOffset.Q(aVar2.b.a(j, aVar2)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) lVar).y() || lVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return true;
            }
        } else if (lVar != null && lVar.h(this)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        j$.time.p pVar = (j$.time.p) obj;
        j$.time.ZoneOffset zoneOffset = pVar.b;
        j$.time.j jVar = pVar.a;
        boolean zEquals = this.b.equals(zoneOffset);
        j$.time.j jVar2 = this.a;
        if (zEquals) {
            return jVar2.compareTo(jVar);
        }
        int iCompare = java.lang.Long.compare(t(), pVar.t());
        return iCompare == 0 ? jVar2.compareTo(jVar) : iCompare;
    }

    @Override // j$.time.temporal.Temporal
    public final long d(j$.time.temporal.Temporal temporal, j$.time.temporal.TemporalUnit temporalUnit) {
        j$.time.p pVar;
        if (temporal instanceof j$.time.p) {
            pVar = (j$.time.p) temporal;
        } else {
            try {
                pVar = new j$.time.p(j$.time.j.z(temporal), j$.time.ZoneOffset.N(temporal));
            } catch (j$.time.DateTimeException e) {
                throw new j$.time.DateTimeException(j$.desugar.sun.nio.fs.h.b("Unable to obtain OffsetTime from TemporalAccessor: ", java.lang.String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            return temporalUnit.between(this, pVar);
        }
        long jT = pVar.t() - t();
        switch (j$.time.o.a[((j$.time.temporal.ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jT;
            case 2:
                return jT / 1000;
            case 3:
                return jT / 1000000;
            case 4:
                return jT / 1000000000;
            case 5:
                return jT / 60000000000L;
            case 6:
                return jT / 3600000000000L;
            case 7:
                return jT / 43200000000000L;
            default:
                j$.time.g.f("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.p) {
            j$.time.p pVar = (j$.time.p) obj;
            if (this.a.equals(pVar.a) && this.b.equals(pVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        return j$.time.temporal.m.a(this, lVar);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.b;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.Temporal x(j$.time.LocalDate localDate) {
        return (j$.time.p) localDate.p(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.k(this);
        }
        if (lVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return ((j$.time.temporal.a) lVar).b;
        }
        j$.time.j jVar = this.a;
        jVar.getClass();
        return j$.time.temporal.m.d(jVar, lVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.Temporal p(j$.time.temporal.Temporal temporal) {
        return temporal.a(this.a.T(), j$.time.temporal.a.NANO_OF_DAY).a(this.b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final j$.time.p b(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        return temporalUnit instanceof j$.time.temporal.ChronoUnit ? z(this.a.b(j, temporalUnit), this.b) : (j$.time.p) temporalUnit.h(this, j);
    }

    public final long t() {
        return this.a.T() - (((long) this.b.getTotalSeconds()) * 1000000000);
    }

    public final java.lang.String toString() {
        return this.a.toString() + this.b.c;
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

    public final j$.time.p z(j$.time.j jVar, j$.time.ZoneOffset zoneOffset) {
        return (this.a == jVar && this.b.equals(zoneOffset)) ? this : new j$.time.p(jVar, zoneOffset);
    }
}
