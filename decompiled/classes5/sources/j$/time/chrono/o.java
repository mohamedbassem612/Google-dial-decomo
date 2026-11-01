package j$.time.chrono;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class o extends j$.time.chrono.c {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient j$.time.chrono.m a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    public o(j$.time.chrono.m mVar, long j) {
        int i = (int) j;
        mVar.X();
        if (i < mVar.e || i >= mVar.f) {
            j$.time.g.h("Hijrah date out of range");
            throw null;
        }
        int iBinarySearch = java.util.Arrays.binarySearch(mVar.d, i);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int[] iArr = {mVar.Z(iBinarySearch), ((mVar.g + iBinarySearch) % 12) + 1, (i - mVar.d[iBinarySearch]) + 1};
        this.a = mVar;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.chrono.c0((byte) 6, this);
    }

    @Override // j$.time.chrono.c
    public final j$.time.chrono.ChronoLocalDate C(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.b) + ((long) ((int) j));
        int i = (int) j2;
        if (j2 == i) {
            return P(i, this.c, this.d);
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        int iL;
        int i;
        int iM;
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(this);
        }
        int i2 = j$.time.chrono.n.a[((j$.time.temporal.a) lVar).ordinal()];
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return i4;
            case 2:
                iL = L();
                return iL;
            case 3:
                i = (i4 - 1) / 7;
                i4 = i + 1;
                return i4;
            case 4:
                iM = (int) j$.com.android.tools.r8.a.M(E() + 3, 7L);
                iL = iM + 1;
                return iL;
            case 5:
                i = (i4 - 1) % 7;
                i4 = i + 1;
                return i4;
            case 6:
                iM = (L() - 1) % 7;
                iL = iM + 1;
                return iL;
            case 7:
                return E();
            case 8:
                iM = (L() - 1) / 7;
                iL = iM + 1;
                return iL;
            case 9:
                return i3;
            case 10:
                return ((((long) i5) * 12) + ((long) i3)) - 1;
            case 11:
            case 12:
                return i5;
            case 13:
                return i5 <= 1 ? 0 : 1;
            default:
                j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
                return 0L;
        }
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final long E() {
        return this.a.a0(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.d F(j$.time.j jVar) {
        return new j$.time.chrono.f(this, jVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.k H() {
        return j$.time.chrono.p.AH;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.ChronoLocalDate J(j$.time.temporal.TemporalAmount temporalAmount) {
        return (j$.time.chrono.o) super.J(temporalAmount);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int K() {
        return this.a.d0(this.b, 12);
    }

    public final int L() {
        return this.a.d0(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.c
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final j$.time.chrono.o z(long j) {
        return new j$.time.chrono.o(this.a, E() + j);
    }

    @Override // j$.time.chrono.c
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final j$.time.chrono.o B(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.b) * 12) + ((long) (this.c - 1)) + j;
        long jC = j$.com.android.tools.r8.a.C(j2, 12L);
        j$.time.chrono.m mVar = this.a;
        if (jC >= mVar.Z(0) && jC <= mVar.Z(mVar.d.length - 1) - 1) {
            return P((int) jC, ((int) j$.com.android.tools.r8.a.M(j2, 12L)) + 1, this.d);
        }
        throw new j$.time.DateTimeException("Invalid Hijrah year: " + jC);
    }

    public final j$.time.chrono.o P(int i, int i2, int i3) {
        j$.time.chrono.m mVar = this.a;
        int iB0 = mVar.b0(i, i2);
        if (i3 > iB0) {
            i3 = iB0;
        }
        return new j$.time.chrono.o(mVar, i, i2, i3);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final j$.time.chrono.o a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return (j$.time.chrono.o) super.a(j, lVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        j$.time.chrono.m mVar = this.a;
        mVar.O(aVar).b(j, aVar);
        int i = (int) j;
        int i2 = j$.time.chrono.n.a[aVar.ordinal()];
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return P(i5, i4, i);
            case 2:
                return z(java.lang.Math.min(i, K()) - L());
            case 3:
                return z((j - D(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return z(j - ((long) (((int) j$.com.android.tools.r8.a.M(E() + 3, 7L)) + 1)));
            case 5:
                return z(j - D(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return z(j - D(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new j$.time.chrono.o(mVar, j);
            case 8:
                return z((j - D(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return P(i5, i, i3);
            case 10:
                return B(j - (((((long) i5) * 12) + ((long) i4)) - 1));
            case 11:
                if (i5 < 1) {
                    i = 1 - i;
                }
                return P(i, i4, i3);
            case 12:
                return P(i, i4, i3);
            case 13:
                return P(1 - i5, i4, i3);
            default:
                j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
                return null;
        }
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final j$.time.chrono.ChronoLocalDate b(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        return (j$.time.chrono.o) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.chrono.o) {
            j$.time.chrono.o oVar = (j$.time.chrono.o) obj;
            if (this.b == oVar.b && this.c == oVar.c && this.d == oVar.d && this.a.equals(oVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.a getChronology() {
        return this.a;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        this.a.getClass();
        int i = this.b;
        return (2100100019 ^ (i & (-2048))) ^ (((i << 11) + (this.c << 6)) + this.d);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.Temporal x(j$.time.LocalDate localDate) {
        return (j$.time.chrono.o) super.x(localDate);
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
        int i = j$.time.chrono.n.a[aVar.ordinal()];
        j$.time.chrono.m mVar = this.a;
        if (i == 1) {
            return j$.time.temporal.o.f(1L, mVar.b0(this.b, this.c));
        }
        if (i != 2) {
            return i != 3 ? mVar.O(aVar) : j$.time.temporal.o.f(1L, 5L);
        }
        return j$.time.temporal.o.f(1L, K());
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean s() {
        return this.a.D(this.b);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: u */
    public final j$.time.chrono.ChronoLocalDate y(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        return (j$.time.chrono.o) super.y(j, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.ChronoLocalDate x(j$.time.temporal.TemporalAdjuster temporalAdjuster) {
        return (j$.time.chrono.o) super.x(temporalAdjuster);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.Temporal
    public final j$.time.temporal.Temporal y(long j, j$.time.temporal.ChronoUnit chronoUnit) {
        return (j$.time.chrono.o) super.y(j, chronoUnit);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.Temporal
    public final j$.time.temporal.Temporal b(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        return (j$.time.chrono.o) super.b(j, temporalUnit);
    }

    public o(j$.time.chrono.m mVar, int i, int i2, int i3) {
        mVar.a0(i, i2, i3);
        this.a = mVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
