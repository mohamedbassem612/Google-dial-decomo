package j$.time;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class j implements j$.time.temporal.Temporal, j$.time.temporal.TemporalAdjuster, java.lang.Comparable, java.io.Serializable {
    public static final j$.time.j e;
    public static final j$.time.j f;
    public static final j$.time.j g;
    public static final j$.time.j[] h = new j$.time.j[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            j$.time.j[] jVarArr = h;
            if (i >= 24) {
                j$.time.j jVar = jVarArr[0];
                g = jVar;
                e = jVar;
                f = new j$.time.j(23, 59, 59, 999999999);
                return;
            }
            jVarArr[i] = new j$.time.j(i, 0, 0, 0);
            i++;
        }
    }

    public j(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    public static j$.time.j C(int i, int i2, int i3, int i4) {
        j$.time.temporal.a.HOUR_OF_DAY.t(i);
        j$.time.temporal.a.MINUTE_OF_HOUR.t(i2);
        j$.time.temporal.a.SECOND_OF_MINUTE.t(i3);
        j$.time.temporal.a.NANO_OF_SECOND.t(i4);
        return t(i, i2, i3, i4);
    }

    public static j$.time.j L(long j) {
        j$.time.temporal.a.NANO_OF_DAY.t(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return t(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    public static j$.time.j S(java.io.ObjectInput objectInput) throws java.io.IOException {
        int i;
        int i2;
        int i3 = objectInput.readByte();
        int i4 = 0;
        if (i3 < 0) {
            i3 = ~i3;
            i2 = 0;
            i = 0;
        } else {
            byte b = objectInput.readByte();
            if (b < 0) {
                int i5 = ~b;
                i = 0;
                i4 = i5;
                i2 = 0;
            } else {
                byte b2 = objectInput.readByte();
                if (b2 < 0) {
                    i2 = ~b2;
                    i = 0;
                    i4 = b;
                } else {
                    i = objectInput.readInt();
                    i4 = b;
                    i2 = b2;
                }
            }
        }
        return C(i3, i4, i2, i);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    public static j$.time.j t(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? h[i] : new j$.time.j(i, i2, i3, i4);
    }

    private java.lang.Object writeReplace() {
        return new j$.time.r((byte) 4, this);
    }

    public static j$.time.j z(j$.time.temporal.Temporal temporal) {
        j$.util.Objects.requireNonNull(temporal, "temporal");
        j$.time.j jVar = (j$.time.j) temporal.G(j$.time.temporal.m.g);
        if (jVar != null) {
            return jVar;
        }
        j$.time.g.h(j$.desugar.sun.nio.fs.h.b("Unable to obtain LocalTime from TemporalAccessor: ", java.lang.String.valueOf(temporal), " of type ", temporal.getClass().getName()));
        return null;
    }

    public final int B(j$.time.temporal.l lVar) {
        int i = j$.time.i.a[((j$.time.temporal.a) lVar).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                j$.time.g.f("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
                return 0;
            case 3:
                return i2 / 1000;
            case 4:
                j$.time.g.f("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
                return 0;
            case 5:
                return i2 / 1000000;
            case 6:
                return (int) (T() / 1000000);
            case 7:
                return this.c;
            case 8:
                return U();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case 12:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 13:
                break;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
                break;
            case 15:
                return b2 / 12;
            default:
                j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
                return 0;
        }
        return b2;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(this);
        }
        if (lVar == j$.time.temporal.a.NANO_OF_DAY) {
            return T();
        }
        return lVar == j$.time.temporal.a.MICRO_OF_DAY ? T() / 1000 : B(lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object G(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery != j$.time.temporal.m.b && temporalQuery != j$.time.temporal.m.a && temporalQuery != j$.time.temporal.m.e && temporalQuery != j$.time.temporal.m.d) {
            if (temporalQuery == j$.time.temporal.m.g) {
                return this;
            }
            if (temporalQuery != j$.time.temporal.m.f) {
                return temporalQuery == j$.time.temporal.m.c ? j$.time.temporal.ChronoUnit.NANOS : temporalQuery.queryFrom(this);
            }
        }
        return null;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final j$.time.j b(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            return (j$.time.j) temporalUnit.h(this, j);
        }
        switch (j$.time.i.b[((j$.time.temporal.ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return Q(j);
            case 2:
                return Q((j % 86400000000L) * 1000);
            case 3:
                return Q((j % 86400000) * 1000000);
            case 4:
                return R(j);
            case 5:
                return P(j);
            case 6:
                return O(j);
            case 7:
                return O((j % 2) * 12);
            default:
                j$.time.g.f("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
                return null;
        }
    }

    public final j$.time.j O(long j) {
        if (j == 0) {
            return this;
        }
        return t(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final j$.time.j P(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.a * 60) + this.b;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        return i != i2 ? t(i2 / 60, i2 % 60, this.c, this.d) : this;
    }

    public final j$.time.j Q(long j) {
        if (j == 0) {
            return this;
        }
        long jT = T();
        long j2 = (((j % 86400000000000L) + jT) + 86400000000000L) % 86400000000000L;
        return jT != j2 ? t((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000)) : this;
    }

    public final j$.time.j R(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.b * 60) + (this.a * 3600) + this.c;
        int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
        return i != i2 ? t(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d) : this;
    }

    public final long T() {
        return (((long) this.c) * 1000000000) + (((long) this.b) * 60000000000L) + (((long) this.a) * 3600000000000L) + ((long) this.d);
    }

    public final int U() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final j$.time.j a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return (j$.time.j) lVar.r(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        aVar.t(j);
        int i = j$.time.i.a[aVar.ordinal()];
        int i2 = this.d;
        byte b = this.c;
        byte b2 = this.b;
        byte b3 = this.a;
        switch (i) {
            case 1:
                return X((int) j);
            case 2:
                return L(j);
            case 3:
                return X(((int) j) * 1000);
            case 4:
                return L(j * 1000);
            case 5:
                return X(((int) j) * 1000000);
            case 6:
                return L(j * 1000000);
            case 7:
                int i3 = (int) j;
                if (b == i3) {
                    return this;
                }
                j$.time.temporal.a.SECOND_OF_MINUTE.t(i3);
                return t(b3, b2, i3, i2);
            case 8:
                return R(j - ((long) U()));
            case 9:
                int i4 = (int) j;
                if (b2 == i4) {
                    return this;
                }
                j$.time.temporal.a.MINUTE_OF_HOUR.t(i4);
                return t(b3, i4, b, i2);
            case 10:
                return P(j - ((long) ((b3 * 60) + b2)));
            case 11:
                return O(j - ((long) (b3 % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return O(j - ((long) (b3 % 12)));
            case 13:
                return W((int) j);
            case 14:
                if (j == 24) {
                    j = 0;
                }
                return W((int) j);
            case 15:
                return O((j - ((long) (b3 / 12))) * 12);
            default:
                j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
                return null;
        }
    }

    public final j$.time.j W(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.HOUR_OF_DAY.t(i);
        return t(i, this.b, this.c, this.d);
    }

    public final j$.time.j X(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.t(i);
        return t(this.a, this.b, this.c, i);
    }

    public final void Y(java.io.DataOutput dataOutput) throws java.io.IOException {
        byte b = this.a;
        byte b2 = this.c;
        byte b3 = this.b;
        int i = this.d;
        if (i != 0) {
            dataOutput.writeByte(b);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(b2);
            dataOutput.writeInt(i);
            return;
        }
        if (b2 != 0) {
            dataOutput.writeByte(b);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(~b2);
        } else if (b3 == 0) {
            dataOutput.writeByte(~b);
        } else {
            dataOutput.writeByte(b);
            dataOutput.writeByte(~b3);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) lVar).y();
        }
        return lVar != null && lVar.h(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long d(j$.time.temporal.Temporal temporal, j$.time.temporal.TemporalUnit temporalUnit) {
        j$.time.j jVarZ = z(temporal);
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            return temporalUnit.between(this, jVarZ);
        }
        long jT = jVarZ.T() - T();
        switch (j$.time.i.b[((j$.time.temporal.ChronoUnit) temporalUnit).ordinal()]) {
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
        if (obj instanceof j$.time.j) {
            j$.time.j jVar = (j$.time.j) obj;
            if (this.a == jVar.a && this.b == jVar.b && this.c == jVar.c && this.d == jVar.d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? B(lVar) : j$.time.temporal.m.a(this, lVar);
    }

    public final int hashCode() {
        long jT = T();
        return (int) (jT ^ (jT >>> 32));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.Temporal x(j$.time.LocalDate localDate) {
        return (j$.time.j) localDate.p(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        return j$.time.temporal.m.d(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.Temporal p(j$.time.temporal.Temporal temporal) {
        return temporal.a(T(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.j jVar) {
        int iCompare = java.lang.Integer.compare(this.a, jVar.a);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = java.lang.Integer.compare(this.b, jVar.b);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = java.lang.Integer.compare(this.c, jVar.c);
        return iCompare3 == 0 ? java.lang.Integer.compare(this.d, jVar.d) : iCompare3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(18);
        byte b = this.a;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        byte b2 = this.b;
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        byte b3 = this.c;
        int i = this.d;
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(java.lang.Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(java.lang.Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(java.lang.Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
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
}
