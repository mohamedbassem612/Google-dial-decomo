package j$.time.chrono;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class g0 extends j$.time.chrono.c {
    private static final long serialVersionUID = -8722293800195731463L;
    public final transient j$.time.LocalDate a;

    public g0(j$.time.LocalDate localDate) {
        j$.util.Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.chrono.c0((byte) 8, this);
    }

    @Override // j$.time.chrono.c
    public final j$.time.chrono.ChronoLocalDate B(long j) {
        return O(this.a.U(j));
    }

    @Override // j$.time.chrono.c
    public final j$.time.chrono.ChronoLocalDate C(long j) {
        return O(this.a.W(j));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        int iL;
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(this);
        }
        int i = j$.time.chrono.f0.a[((j$.time.temporal.a) lVar).ordinal()];
        if (i != 4) {
            j$.time.LocalDate localDate = this.a;
            if (i == 5) {
                return ((((long) L()) * 12) + ((long) localDate.getMonthValue())) - 1;
            }
            if (i != 6) {
                if (i != 7) {
                    return localDate.D(lVar);
                }
                return L() < 1 ? 0 : 1;
            }
            iL = L();
        } else {
            iL = L();
            if (iL < 1) {
                iL = 1 - iL;
            }
        }
        return iL;
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
        return L() >= 1 ? j$.time.chrono.h0.BE : j$.time.chrono.h0.BEFORE_BE;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.ChronoLocalDate J(j$.time.temporal.TemporalAmount temporalAmount) {
        return (j$.time.chrono.g0) super.J(temporalAmount);
    }

    public final int L() {
        return this.a.getYear() + 543;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    /* JADX WARN: Code duplicated, block: B:16:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0069  */
    /* JADX WARN: Code duplicated, block: B:20:0x0078  */
    /* JADX WARN: Code duplicated, block: B:21:0x0083  */
    /* JADX WARN: Code duplicated, block: B:23:0x008a  */
    @Override // j$.time.chrono.c, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final j$.time.chrono.g0 a(long j, j$.time.temporal.l lVar) {
        int iA;
        int i;
        if (!(lVar instanceof j$.time.temporal.a)) {
            return (j$.time.chrono.g0) super.a(j, lVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        if (D(aVar) == j) {
            return this;
        }
        int[] iArr = j$.time.chrono.f0.a;
        int i2 = iArr[aVar.ordinal()];
        j$.time.LocalDate localDate = this.a;
        if (i2 == 4) {
            iA = j$.time.chrono.e0.c.O(aVar).a(j, aVar);
            i = iArr[aVar.ordinal()];
            if (i != 4) {
                if (L() < 1) {
                    iA = 1 - iA;
                }
                return O(localDate.Z(iA - 543));
            }
            if (i != 6) {
                return O(localDate.Z(iA - 543));
            }
            if (i == 7) {
                return O(localDate.Z((-542) - L()));
            }
        } else {
            if (i2 == 5) {
                j$.time.chrono.e0.c.O(aVar).b(j, aVar);
                return O(localDate.U(j - (((((long) L()) * 12) + ((long) localDate.getMonthValue())) - 1)));
            }
            if (i2 == 6 || i2 == 7) {
                iA = j$.time.chrono.e0.c.O(aVar).a(j, aVar);
                i = iArr[aVar.ordinal()];
                if (i != 4) {
                    if (L() < 1) {
                        iA = 1 - iA;
                    }
                    return O(localDate.Z(iA - 543));
                }
                if (i != 6) {
                    return O(localDate.Z(iA - 543));
                }
                if (i == 7) {
                    return O(localDate.Z((-542) - L()));
                }
            }
        }
        return O(localDate.a(j, lVar));
    }

    public final j$.time.chrono.g0 O(j$.time.LocalDate localDate) {
        return !localDate.equals(this.a) ? new j$.time.chrono.g0(localDate) : this;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final j$.time.chrono.ChronoLocalDate b(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        return (j$.time.chrono.g0) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.chrono.g0) {
            return this.a.equals(((j$.time.chrono.g0) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.a getChronology() {
        return j$.time.chrono.e0.c;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        j$.time.chrono.e0.c.getClass();
        return 146118545 ^ this.a.hashCode();
    }

    @Override // j$.time.chrono.c, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.Temporal x(j$.time.LocalDate localDate) {
        return (j$.time.chrono.g0) super.x(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.k(this);
        }
        if (!j$.com.android.tools.r8.a.k(this, lVar)) {
            j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
            return null;
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        int i = j$.time.chrono.f0.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.l(lVar);
        }
        if (i != 4) {
            return j$.time.chrono.e0.c.O(aVar);
        }
        j$.time.temporal.o oVar = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.o.f(1L, L() <= 0 ? (-(oVar.a + 543)) + 1 : oVar.d + 543);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: u */
    public final j$.time.chrono.ChronoLocalDate y(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        return (j$.time.chrono.g0) super.y(j, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.ChronoLocalDate x(j$.time.temporal.TemporalAdjuster temporalAdjuster) {
        return (j$.time.chrono.g0) super.x(temporalAdjuster);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.Temporal
    public final j$.time.temporal.Temporal y(long j, j$.time.temporal.ChronoUnit chronoUnit) {
        return (j$.time.chrono.g0) super.y(j, chronoUnit);
    }

    @Override // j$.time.chrono.c
    public final j$.time.chrono.ChronoLocalDate z(long j) {
        return O(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.c, j$.time.temporal.Temporal
    public final j$.time.temporal.Temporal b(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        return (j$.time.chrono.g0) super.b(j, temporalUnit);
    }
}
