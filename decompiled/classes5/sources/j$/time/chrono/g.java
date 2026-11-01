package j$.time.chrono;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class g implements j$.time.temporal.TemporalAmount, java.io.Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    public final j$.time.chrono.a a;
    public final int b;
    public final int c;
    public final int d;

    static {
        j$.com.android.tools.r8.a.F(new java.lang.Object[]{j$.time.temporal.ChronoUnit.YEARS, j$.time.temporal.ChronoUnit.MONTHS, j$.time.temporal.ChronoUnit.DAYS});
    }

    public g(j$.time.chrono.a aVar, int i, int i2, int i3) {
        j$.util.Objects.requireNonNull(aVar, "chrono");
        this.a = aVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    public final long a() {
        j$.time.temporal.o oVarO = this.a.O(j$.time.temporal.a.MONTH_OF_YEAR);
        long j = oVarO.a;
        long j2 = oVarO.d;
        if (j == oVarO.b && oVarO.c == j2 && oVarO.d()) {
            return (j2 - oVarO.a) + 1;
        }
        return -1L;
    }

    public final void b(j$.time.temporal.TemporalAccessor temporalAccessor) {
        j$.util.Objects.requireNonNull(temporalAccessor, "temporal");
        j$.time.chrono.a aVar = (j$.time.chrono.a) temporalAccessor.G(j$.time.temporal.m.b);
        if (aVar != null) {
            j$.time.chrono.a aVar2 = this.a;
            if (aVar2.equals(aVar)) {
                return;
            }
            j$.time.g.h(j$.desugar.sun.nio.fs.h.b("Chronology mismatch, expected: ", aVar2.C(), ", actual: ", aVar.C()));
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.chrono.g) {
            j$.time.chrono.g gVar = (j$.time.chrono.g) obj;
            if (this.b == gVar.b && this.c == gVar.c && this.d == gVar.d && this.a.equals(gVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final j$.time.temporal.Temporal h(j$.time.temporal.Temporal temporal) {
        b(temporal);
        int i = this.b;
        int i2 = this.c;
        if (i2 != 0) {
            long jA = a();
            if (jA > 0) {
                temporal = temporal.b((((long) i) * jA) + ((long) i2), j$.time.temporal.ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    temporal = temporal.b(i, j$.time.temporal.ChronoUnit.YEARS);
                }
                temporal = temporal.b(i2, j$.time.temporal.ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            temporal = temporal.b(i, j$.time.temporal.ChronoUnit.YEARS);
        }
        int i3 = this.d;
        return i3 != 0 ? temporal.b(i3, j$.time.temporal.ChronoUnit.DAYS) : temporal;
    }

    public final int hashCode() {
        return (java.lang.Integer.rotateLeft(this.d, 16) + (java.lang.Integer.rotateLeft(this.c, 8) + this.b)) ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.TemporalAmount
    public final j$.time.temporal.Temporal k(j$.time.Instant instant) {
        j$.time.Instant instantY;
        b(instant);
        int i = this.b;
        int i2 = this.c;
        j$.time.temporal.Temporal temporalY = instant;
        if (i2 != 0) {
            long jA = a();
            if (jA > 0) {
                instantY = instant;
                temporalY = instant.y((((long) i) * jA) + ((long) i2), j$.time.temporal.ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    instantY = instant.y(i, j$.time.temporal.ChronoUnit.YEARS);
                }
                temporalY = instantY.y(i2, j$.time.temporal.ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            temporalY = instant.y(i, j$.time.temporal.ChronoUnit.YEARS);
        }
        int i3 = this.d;
        return i3 != 0 ? temporalY.y(i3, j$.time.temporal.ChronoUnit.DAYS) : temporalY;
    }

    public final java.lang.String toString() {
        j$.time.chrono.a aVar = this.a;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 == 0 && i2 == 0 && i == 0) {
            return aVar.toString() + " P0D";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(aVar.toString());
        sb.append(" P");
        if (i3 != 0) {
            sb.append(i3);
            sb.append('Y');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('D');
        }
        return sb.toString();
    }

    public java.lang.Object writeReplace() {
        return new j$.time.chrono.c0((byte) 9, this);
    }
}
