package j$.time;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class m implements j$.time.temporal.TemporalAccessor, j$.time.temporal.TemporalAdjuster, java.lang.Comparable, java.io.Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = -939150713474957432L;
    public final int a;
    public final int b;

    static {
        j$.time.format.u uVar = new j$.time.format.u();
        uVar.e("--");
        uVar.l(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        uVar.d('-');
        uVar.l(j$.time.temporal.a.DAY_OF_MONTH, 2);
        uVar.q(java.util.Locale.getDefault(), j$.time.format.c0.SMART, null);
    }

    public m(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.r((byte) 13, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        int i;
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(this);
        }
        int i2 = j$.time.l.a[((j$.time.temporal.a) lVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
                return 0L;
            }
            i = this.a;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object G(j$.time.temporal.TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.m.b ? j$.time.chrono.q.c : j$.time.temporal.m.c(this, temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            if (lVar == j$.time.temporal.a.MONTH_OF_YEAR || lVar == j$.time.temporal.a.DAY_OF_MONTH) {
                return true;
            }
        } else if (lVar != null && lVar.h(this)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        j$.time.m mVar = (j$.time.m) obj;
        int i = this.a - mVar.a;
        return i == 0 ? this.b - mVar.b : i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.m) {
            j$.time.m mVar = (j$.time.m) obj;
            if (this.a == mVar.a && this.b == mVar.b) {
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
        return (this.a << 6) + this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        int i;
        if (lVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return lVar.range();
        }
        if (lVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.m.d(this, lVar);
        }
        int i2 = this.a;
        int iOrdinal = j$.time.k.B(i2).ordinal();
        if (iOrdinal != 1) {
            i = (iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 8 || iOrdinal == 10) ? 30 : 31;
        } else {
            i = 28;
        }
        return j$.time.temporal.o.g(1L, i, j$.time.k.B(i2).z());
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.Temporal p(j$.time.temporal.Temporal temporal) {
        if (!j$.com.android.tools.r8.a.y(temporal).equals(j$.time.chrono.q.c)) {
            j$.time.g.h("Adjustment only supported on ISO date-time");
            return null;
        }
        j$.time.temporal.Temporal temporalA = temporal.a(this.a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return temporalA.a(java.lang.Math.min(temporalA.l(aVar).d, this.b), aVar);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(10);
        sb.append("--");
        int i = this.a;
        sb.append(i < 10 ? "0" : "");
        sb.append(i);
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }
}
