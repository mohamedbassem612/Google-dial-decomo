package j$.time;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class q implements j$.time.temporal.TemporalAmount, java.io.Serializable {
    public static final j$.time.q d = new j$.time.q(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;
    public final int a;
    public final int b;
    public final int c;

    static {
        java.util.regex.Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.com.android.tools.r8.a.F(new java.lang.Object[]{j$.time.temporal.ChronoUnit.YEARS, j$.time.temporal.ChronoUnit.MONTHS, j$.time.temporal.ChronoUnit.DAYS});
    }

    public q(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static j$.time.q a(int i, int i2, int i3) {
        return ((i | i2) | i3) == 0 ? d : new j$.time.q(i, i2, i3);
    }

    public static void b(j$.time.temporal.TemporalAccessor temporalAccessor) {
        j$.util.Objects.requireNonNull(temporalAccessor, "temporal");
        j$.time.chrono.a aVar = (j$.time.chrono.a) temporalAccessor.G(j$.time.temporal.m.b);
        if (aVar == null || j$.time.chrono.q.c.equals(aVar)) {
            return;
        }
        throw new j$.time.DateTimeException("Chronology mismatch, expected: ISO, actual: " + aVar.C());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.r((byte) 14, this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.q) {
            j$.time.q qVar = (j$.time.q) obj;
            if (this.a == qVar.a && this.b == qVar.b && this.c == qVar.c) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final j$.time.temporal.Temporal h(j$.time.temporal.Temporal temporal) {
        b(temporal);
        int i = this.b;
        int i2 = this.a;
        if (i != 0) {
            long j = (((long) i2) * 12) + ((long) i);
            if (j != 0) {
                temporal = temporal.b(j, j$.time.temporal.ChronoUnit.MONTHS);
            }
        } else if (i2 != 0) {
            temporal = temporal.b(i2, j$.time.temporal.ChronoUnit.YEARS);
        }
        int i3 = this.c;
        return i3 != 0 ? temporal.b(i3, j$.time.temporal.ChronoUnit.DAYS) : temporal;
    }

    public final int hashCode() {
        return java.lang.Integer.rotateLeft(this.c, 16) + java.lang.Integer.rotateLeft(this.b, 8) + this.a;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final j$.time.temporal.Temporal k(j$.time.Instant instant) {
        b(instant);
        int i = this.b;
        int i2 = this.a;
        j$.time.Instant instantY = instant;
        if (i != 0) {
            long j = (((long) i2) * 12) + ((long) i);
            if (j != 0) {
                instantY = instant;
                instantY = instant.y(j, j$.time.temporal.ChronoUnit.MONTHS);
            }
        } else if (i2 != 0) {
            instantY = instant.y(i2, j$.time.temporal.ChronoUnit.YEARS);
        }
        instantY = instant;
        int i3 = this.c;
        if (i3 == 0) {
            return instantY;
        }
        return instantY.y(i3, j$.time.temporal.ChronoUnit.DAYS);
    }

    public final java.lang.String toString() {
        if (this == d) {
            return "P0D";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
