package j$.time;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class ZoneOffset extends j$.time.ZoneId implements j$.time.temporal.TemporalAccessor, j$.time.temporal.TemporalAdjuster, java.lang.Comparable<j$.time.ZoneOffset>, java.io.Serializable {
    private static final long serialVersionUID = 2357656521762053153L;
    public final int b;
    public final transient java.lang.String c;
    public static final j$.util.concurrent.ConcurrentHashMap d = new j$.util.concurrent.ConcurrentHashMap(16, 0.75f, 4);
    public static final j$.util.concurrent.ConcurrentHashMap e = new j$.util.concurrent.ConcurrentHashMap(16, 0.75f, 4);
    public static final j$.time.ZoneOffset UTC = Q(0);
    public static final j$.time.ZoneOffset f = Q(-64800);
    public static final j$.time.ZoneOffset g = Q(64800);

    public ZoneOffset(int i) {
        java.lang.String string;
        this.b = i;
        if (i == 0) {
            string = "Z";
        } else {
            int iAbs = java.lang.Math.abs(i);
            int i2 = iAbs / 3600;
            int i3 = (iAbs / 60) % 60;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(i < 0 ? "-" : "+");
            sb.append(i2 < 10 ? "0" : "");
            sb.append(i2);
            sb.append(i3 < 10 ? ":0" : ":");
            sb.append(i3);
            int i4 = iAbs % 60;
            if (i4 != 0) {
                sb.append(i4 < 10 ? ":0" : ":");
                sb.append(i4);
            }
            string = sb.toString();
        }
        this.c = string;
    }

    public static j$.time.ZoneOffset N(j$.time.temporal.Temporal temporal) {
        j$.util.Objects.requireNonNull(temporal, "temporal");
        j$.time.ZoneOffset zoneOffset = (j$.time.ZoneOffset) temporal.G(j$.time.temporal.m.d);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        j$.time.g.h(j$.desugar.sun.nio.fs.h.b("Unable to obtain ZoneOffset from TemporalAccessor: ", java.lang.String.valueOf(temporal), " of type ", temporal.getClass().getName()));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Multi-variable type inference failed */
    public static j$.time.ZoneOffset O(java.lang.String str) {
        int iR;
        int iR2;
        int iR3;
        char cCharAt;
        j$.util.Objects.requireNonNull(str, "offsetId");
        j$.time.ZoneOffset zoneOffset = (j$.time.ZoneOffset) e.get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length != 2) {
            if (length != 3) {
                if (length != 5) {
                    if (length == 6) {
                        iR = R(str, 1, false);
                        iR2 = R(str, 4, true);
                    } else if (length == 7) {
                        iR = R(str, 1, false);
                        iR2 = R(str, 3, false);
                        iR3 = R(str, 5, false);
                    } else if (length == 9) {
                        iR = R(str, 1, false);
                        iR2 = R(str, 4, true);
                        iR3 = R(str, 7, true);
                    } else {
                        j$.time.g.h("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                    }
                    return null;
                }
                iR = R(str, 1, false);
                iR2 = R(str, 3, false);
                iR3 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt != '+' || cCharAt == '-') {
                return cCharAt == '-' ? P(-iR, -iR2, -iR3) : P(iR, iR2, iR3);
            }
            j$.time.g.h("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
            return null;
        }
        str = str.charAt(0) + "0" + str.charAt(1);
        iR = R(str, 1, false);
        iR2 = 0;
        iR3 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt != '+') {
        }
        if (cCharAt == '-') {
        }
    }

    public static j$.time.ZoneOffset P(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            j$.time.g.d("Zone offset hours not in valid range: value ", i, " is not in the range -18 to 18");
            return null;
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                j$.time.g.h("Zone offset minutes and seconds must be positive because hours is positive");
                return null;
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                j$.time.g.h("Zone offset minutes and seconds must be negative because hours is negative");
                return null;
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            j$.time.g.h("Zone offset minutes and seconds must have the same sign");
            return null;
        }
        if (i2 < -59 || i2 > 59) {
            j$.time.g.d("Zone offset minutes not in valid range: value ", i2, " is not in the range -59 to 59");
            return null;
        }
        if (i3 < -59 || i3 > 59) {
            j$.time.g.d("Zone offset seconds not in valid range: value ", i3, " is not in the range -59 to 59");
            return null;
        }
        if (java.lang.Math.abs(i) != 18 || (i2 | i3) == 0) {
            return Q((i2 * 60) + (i * 3600) + i3);
        }
        j$.time.g.h("Zone offset not in valid range: -18:00 to +18:00");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static j$.time.ZoneOffset Q(int i) {
        if (i < -64800 || i > 64800) {
            j$.time.g.h("Zone offset not in valid range: -18:00 to +18:00");
            return null;
        }
        if (i % 900 != 0) {
            return new j$.time.ZoneOffset(i);
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = d;
        j$.time.ZoneOffset zoneOffset = (j$.time.ZoneOffset) concurrentHashMap.get(numValueOf);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        concurrentHashMap.putIfAbsent(numValueOf, new j$.time.ZoneOffset(i));
        j$.time.ZoneOffset zoneOffset2 = (j$.time.ZoneOffset) concurrentHashMap.get(numValueOf);
        e.putIfAbsent(zoneOffset2.c, zoneOffset2);
        return zoneOffset2;
    }

    public static int R(java.lang.CharSequence charSequence, int i, boolean z) {
        if (z && charSequence.charAt(i - 1) != ':') {
            j$.time.g.h("Invalid ID for ZoneOffset, colon not found when expected: ".concat(java.lang.String.valueOf(charSequence)));
            return 0;
        }
        char cCharAt = charSequence.charAt(i);
        char cCharAt2 = charSequence.charAt(i + 1);
        if (cCharAt < '0' || cCharAt > '9' || cCharAt2 < '0' || cCharAt2 > '9') {
            j$.time.g.h("Invalid ID for ZoneOffset, non numeric characters found: ".concat(java.lang.String.valueOf(charSequence)));
            return 0;
        }
        return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
    }

    public static j$.time.ZoneOffset S(java.io.DataInput dataInput) throws java.io.IOException {
        byte b = dataInput.readByte();
        return b == 127 ? Q(dataInput.readInt()) : Q(b * 900);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.r((byte) 8, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        if (lVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(this);
        }
        j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
        return 0L;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object G(j$.time.temporal.TemporalQuery temporalQuery) {
        return (temporalQuery == j$.time.temporal.m.d || temporalQuery == j$.time.temporal.m.e) ? this : j$.time.temporal.m.c(this, temporalQuery);
    }

    @Override // j$.time.ZoneId
    public final void L(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        objectOutput.writeByte(8);
        T(objectOutput);
    }

    public final void T(java.io.DataOutput dataOutput) throws java.io.IOException {
        int i = this.b;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            if (lVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return false;
            }
        } else if (lVar == null || !lVar.h(this)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Comparable
    public final int compareTo(j$.time.ZoneOffset zoneOffset) {
        return zoneOffset.b - this.b;
    }

    @Override // j$.time.ZoneId
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.ZoneOffset) {
            if (this.b == ((j$.time.ZoneOffset) obj).b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.ZoneRules getRules() {
        j$.util.Objects.requireNonNull(this, "offset");
        return new j$.time.zone.ZoneRules(this);
    }

    public int getTotalSeconds() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        if (lVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (!j$.desugar.sun.nio.fs.h.c(lVar)) {
            return j$.time.temporal.m.d(this, lVar).a(D(lVar), lVar);
        }
        j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
        return 0;
    }

    @Override // j$.time.ZoneId
    public final int hashCode() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        return j$.time.temporal.m.d(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.Temporal p(j$.time.temporal.Temporal temporal) {
        return temporal.a(this.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.ZoneId
    public final java.lang.String t() {
        return this.c;
    }

    @Override // j$.time.ZoneId
    public final java.lang.String toString() {
        return this.c;
    }
}
