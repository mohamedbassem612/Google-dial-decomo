package j$.time.chrono;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class v extends j$.time.chrono.c {
    public static final j$.time.LocalDate d = j$.time.LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient j$.time.LocalDate a;
    public final transient j$.time.chrono.w b;
    public final transient int c;

    public v(j$.time.LocalDate localDate) {
        if (localDate.isBefore(d)) {
            j$.time.g.h("JapaneseDate before Meiji 6 is not supported");
            throw null;
        }
        j$.time.chrono.w wVarE = j$.time.chrono.w.e(localDate);
        this.b = wVarE;
        this.c = (localDate.getYear() - wVarE.b.getYear()) + 1;
        this.a = localDate;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.chrono.c0((byte) 4, this);
    }

    @Override // j$.time.chrono.c
    public final j$.time.chrono.ChronoLocalDate B(long j) {
        return P(this.a.U(j));
    }

    @Override // j$.time.chrono.c
    public final j$.time.chrono.ChronoLocalDate C(long j) {
        return P(this.a.W(j));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        int iB;
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(this);
        }
        int i = j$.time.chrono.u.a[((j$.time.temporal.a) lVar).ordinal()];
        int i2 = this.c;
        j$.time.chrono.w wVar = this.b;
        j$.time.LocalDate localDate = this.a;
        switch (i) {
            case 2:
                iB = i2 != 1 ? localDate.B() : (localDate.B() - wVar.b.B()) + 1;
                break;
            case 3:
                return i2;
            case 4:
            case 5:
            case 6:
            case 7:
                j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
                return 0L;
            case 8:
                iB = wVar.a;
                break;
            default:
                return localDate.D(lVar);
        }
        return iB;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final long E() {
        return this.a.E();
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.d F(j$.time.j jVar) {
        return new j$.time.chrono.f(this, jVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.k H() {
        return this.b;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.ChronoLocalDate J(j$.time.temporal.TemporalAmount temporalAmount) {
        return (j$.time.chrono.v) super.J(temporalAmount);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int K() {
        int iK;
        j$.time.chrono.w wVar = this.b;
        j$.time.chrono.w wVarF = wVar.f();
        j$.time.LocalDate localDate = this.a;
        if (wVarF != null) {
            j$.time.LocalDate localDate2 = wVarF.b;
            if (localDate2.getYear() == localDate.getYear()) {
                iK = localDate2.B() - 1;
            } else {
                iK = localDate.K();
            }
        } else {
            iK = localDate.K();
        }
        return this.c == 1 ? iK - (wVar.b.B() - 1) : iK;
    }

    public final j$.time.chrono.v L(long j, j$.time.temporal.ChronoUnit chronoUnit) {
        return (j$.time.chrono.v) super.b(j, (j$.time.temporal.TemporalUnit) chronoUnit);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final j$.time.chrono.v a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return (j$.time.chrono.v) super.a(j, lVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        if (D(aVar) == j) {
            return this;
        }
        int[] iArr = j$.time.chrono.u.a;
        int i = iArr[aVar.ordinal()];
        j$.time.LocalDate localDate = this.a;
        if (i == 3 || i == 8 || i == 9) {
            j$.time.chrono.t tVar = j$.time.chrono.t.c;
            int iA = tVar.O(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 3) {
                return P(localDate.Z(tVar.N(this.b, iA)));
            }
            if (i2 == 8) {
                return P(localDate.Z(tVar.N(j$.time.chrono.w.i(iA), this.c)));
            }
            if (i2 == 9) {
                return P(localDate.Z(iA));
            }
        }
        return P(localDate.a(j, lVar));
    }

    public final j$.time.chrono.v O(j$.desugar.sun.nio.fs.n nVar) {
        return (j$.time.chrono.v) super.x(nVar);
    }

    public final j$.time.chrono.v P(j$.time.LocalDate localDate) {
        return !localDate.equals(this.a) ? new j$.time.chrono.v(localDate) : this;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final j$.time.chrono.ChronoLocalDate b(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        return (j$.time.chrono.v) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        if (lVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || lVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || lVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || lVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (lVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) lVar).isDateBased();
        }
        return lVar != null && lVar.h(this);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.chrono.v) {
            return this.a.equals(((j$.time.chrono.v) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.a getChronology() {
        return j$.time.chrono.t.c;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        j$.time.chrono.t.c.getClass();
        return (-688086063) ^ this.a.hashCode();
    }

    @Override // j$.time.chrono.c, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.Temporal x(j$.time.LocalDate localDate) {
        return (j$.time.chrono.v) super.x(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.k(this);
        }
        if (!c(lVar)) {
            j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
            return null;
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        int i = j$.time.chrono.u.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.o.f(1L, this.a.L());
        }
        if (i == 2) {
            return j$.time.temporal.o.f(1L, K());
        }
        if (i != 3) {
            return j$.time.chrono.t.c.O(aVar);
        }
        j$.time.chrono.w wVar = this.b;
        int year = wVar.b.getYear();
        j$.time.chrono.w wVarF = wVar.f();
        return wVarF != null ? j$.time.temporal.o.f(1L, (wVarF.b.getYear() - year) + 1) : j$.time.temporal.o.f(1L, 999999999 - year);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: u */
    public final j$.time.chrono.ChronoLocalDate y(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        return (j$.time.chrono.v) super.y(j, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.ChronoLocalDate x(j$.time.temporal.TemporalAdjuster temporalAdjuster) {
        return (j$.time.chrono.v) super.x(temporalAdjuster);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.Temporal
    public final j$.time.temporal.Temporal y(long j, j$.time.temporal.ChronoUnit chronoUnit) {
        return (j$.time.chrono.v) super.y(j, chronoUnit);
    }

    @Override // j$.time.chrono.c
    public final j$.time.chrono.ChronoLocalDate z(long j) {
        return P(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.c, j$.time.temporal.Temporal
    public final j$.time.temporal.Temporal b(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        return (j$.time.chrono.v) super.b(j, temporalUnit);
    }

    public v(j$.time.chrono.w wVar, int i, j$.time.LocalDate localDate) {
        if (!localDate.isBefore(d)) {
            this.b = wVar;
            this.c = i;
            this.a = localDate;
            return;
        }
        j$.time.g.h("JapaneseDate before Meiji 6 is not supported");
        throw null;
    }
}
