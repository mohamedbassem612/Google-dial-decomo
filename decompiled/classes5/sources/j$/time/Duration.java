package j$.time;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class Duration implements j$.time.temporal.TemporalAmount, java.lang.Comparable<j$.time.Duration>, java.io.Serializable {
    public static final j$.time.Duration ZERO = new j$.time.Duration(0, 0);
    public static final java.math.BigInteger c = java.math.BigInteger.valueOf(1000000000);
    private static final long serialVersionUID = 3078945930695997490L;
    public final long a;
    public final int b;

    public Duration(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static j$.time.Duration between(j$.time.temporal.Temporal temporal, j$.time.temporal.Temporal temporal2) {
        try {
            return ofNanos(temporal.d(temporal2, j$.time.temporal.ChronoUnit.NANOS));
        } catch (j$.time.DateTimeException | java.lang.ArithmeticException unused) {
            long jD = temporal.d(temporal2, j$.time.temporal.ChronoUnit.SECONDS);
            long j = 0;
            try {
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
                long jD2 = temporal2.D(aVar) - temporal.D(aVar);
                if (jD > 0 && jD2 < 0) {
                    jD++;
                } else if (jD < 0 && jD2 > 0) {
                    jD--;
                }
                j = jD2;
            } catch (j$.time.DateTimeException unused2) {
            }
            return ofSeconds(jD, j);
        }
    }

    public static j$.time.Duration l(long j, int i) {
        return (((long) i) | j) == 0 ? ZERO : new j$.time.Duration(j, i);
    }

    public static j$.time.Duration of(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        j$.time.Duration duration = ZERO;
        duration.getClass();
        j$.util.Objects.requireNonNull(temporalUnit, "unit");
        if (temporalUnit == j$.time.temporal.ChronoUnit.DAYS) {
            return duration.y(j$.com.android.tools.r8.a.O(j, 86400L), 0L);
        }
        if (temporalUnit.isDurationEstimated()) {
            j$.time.g.f("Unit must not have an estimated duration");
            return null;
        }
        if (j == 0) {
            return duration;
        }
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            j$.time.Duration durationR = temporalUnit.getDuration().r(j);
            return duration.plusSeconds(durationR.getSeconds()).plusNanos(durationR.getNano());
        }
        int i = j$.time.c.a[((j$.time.temporal.ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return duration.plusNanos(j);
        }
        if (i == 2) {
            return duration.plusSeconds((j / 1000000000) * 1000).plusNanos((j % 1000000000) * 1000);
        }
        if (i != 3) {
            return i != 4 ? duration.plusSeconds(j$.com.android.tools.r8.a.O(temporalUnit.getDuration().a, j)) : duration.plusSeconds(j);
        }
        return duration.y(j / 1000, (j % 1000) * 1000000);
    }

    public static j$.time.Duration ofDays(long j) {
        return l(j$.com.android.tools.r8.a.O(j, 86400L), 0);
    }

    public static j$.time.Duration ofHours(long j) {
        return l(j$.com.android.tools.r8.a.O(j, 3600L), 0);
    }

    public static j$.time.Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return l(j2, i * 1000000);
    }

    public static j$.time.Duration ofMinutes(long j) {
        return l(j$.com.android.tools.r8.a.O(j, 60L), 0);
    }

    public static j$.time.Duration ofNanos(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            j2--;
        }
        return l(j2, i);
    }

    public static j$.time.Duration ofSeconds(long j, long j2) {
        return l(j$.com.android.tools.r8.a.N(j, j$.com.android.tools.r8.a.C(j2, 1000000000L)), (int) j$.com.android.tools.r8.a.M(j2, 1000000000L));
    }

    public static j$.time.Duration p(java.math.BigDecimal bigDecimal) {
        java.math.BigInteger bigIntegerExact = bigDecimal.movePointRight(9).toBigIntegerExact();
        java.math.BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerExact.divideAndRemainder(c);
        if (bigIntegerArrDivideAndRemainder[0].bitLength() <= 63) {
            return ofSeconds(bigIntegerArrDivideAndRemainder[0].longValue(), bigIntegerArrDivideAndRemainder[1].intValue());
        }
        throw new java.lang.ArithmeticException("Exceeds capacity of Duration: ".concat(java.lang.String.valueOf(bigIntegerExact)));
    }

    public static j$.time.Duration parse(java.lang.CharSequence charSequence) {
        int i;
        int i2;
        j$.util.Objects.requireNonNull(charSequence, "text");
        java.util.regex.Matcher matcher = j$.time.d.a.matcher(charSequence);
        if (matcher.matches()) {
            int iStart = matcher.start(3);
            int iEnd = matcher.end(3);
            if (iStart < 0 || iEnd != iStart + 1 || charSequence.charAt(iStart) != 'T') {
                int i3 = 1;
                int iStart2 = matcher.start(1);
                boolean z = iStart2 >= 0 && matcher.end(1) == iStart2 + 1 && charSequence.charAt(iStart2) == '-';
                int iStart3 = matcher.start(2);
                int iEnd2 = matcher.end(2);
                int iStart4 = matcher.start(4);
                int iEnd3 = matcher.end(4);
                int iStart5 = matcher.start(5);
                int iEnd4 = matcher.end(5);
                int iStart6 = matcher.start(6);
                int iEnd5 = matcher.end(6);
                int iStart7 = matcher.start(7);
                int iEnd6 = matcher.end(7);
                if (iStart3 >= 0 || iStart4 >= 0 || iStart5 >= 0 || iStart6 >= 0) {
                    long jT = t(charSequence, iStart3, iEnd2, 86400, "days");
                    long jT2 = t(charSequence, iStart4, iEnd3, 3600, "hours");
                    long jT3 = t(charSequence, iStart5, iEnd4, 60, "minutes");
                    long jT4 = t(charSequence, iStart6, iEnd5, 1, "seconds");
                    if (iStart6 >= 0 && charSequence.charAt(iStart6) == '-') {
                        i3 = -1;
                    }
                    if (iStart7 < 0 || iEnd6 < 0 || (i2 = iEnd6 - iStart7) == 0) {
                        i = 0;
                    } else {
                        try {
                            int i4 = java.lang.Integer.parseInt(charSequence.subSequence(iStart7, iEnd6).toString(), 10);
                            for (i2 = iEnd6 - iStart7; i2 < 9; i2++) {
                                i4 *= 10;
                            }
                            i = i4 * i3;
                        } catch (java.lang.ArithmeticException | java.lang.NumberFormatException e) {
                            throw ((j$.time.format.DateTimeParseException) new j$.time.format.DateTimeParseException("Text cannot be parsed to a Duration: fraction", charSequence).initCause(e));
                        }
                    }
                    try {
                        long jN = j$.com.android.tools.r8.a.N(jT, j$.com.android.tools.r8.a.N(jT2, j$.com.android.tools.r8.a.N(jT3, jT4)));
                        return z ? ofSeconds(jN, i).r(-1L) : ofSeconds(jN, i);
                    } catch (java.lang.ArithmeticException e2) {
                        throw ((j$.time.format.DateTimeParseException) new j$.time.format.DateTimeParseException("Text cannot be parsed to a Duration: overflow", charSequence).initCause(e2));
                    }
                }
            }
        }
        throw new j$.time.format.DateTimeParseException("Text cannot be parsed to a Duration", charSequence);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    public static long t(java.lang.CharSequence charSequence, int i, int i2, int i3, java.lang.String str) {
        if (i < 0 || i2 < 0) {
            return 0L;
        }
        try {
            return j$.com.android.tools.r8.a.O(java.lang.Long.parseLong(charSequence.subSequence(i, i2).toString(), 10), i3);
        } catch (java.lang.ArithmeticException | java.lang.NumberFormatException e) {
            throw ((j$.time.format.DateTimeParseException) new j$.time.format.DateTimeParseException("Text cannot be parsed to a Duration: ".concat(str), charSequence).initCause(e));
        }
    }

    private java.lang.Object writeReplace() {
        return new j$.time.r((byte) 1, this);
    }

    public j$.time.Duration abs() {
        return isNegative() ? r(-1L) : this;
    }

    @Override // java.lang.Comparable
    public int compareTo(j$.time.Duration duration) {
        int iCompare = java.lang.Long.compare(this.a, duration.a);
        return iCompare == 0 ? this.b - duration.b : iCompare;
    }

    public j$.time.Duration dividedBy(long j) {
        if (j != 0) {
            return j != 1 ? p(java.math.BigDecimal.valueOf(this.a).add(java.math.BigDecimal.valueOf(this.b, 9)).divide(java.math.BigDecimal.valueOf(j), java.math.RoundingMode.DOWN)) : this;
        }
        throw new java.lang.ArithmeticException("Cannot divide by zero");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.Duration) {
            j$.time.Duration duration = (j$.time.Duration) obj;
            if (this.a == duration.a && this.b == duration.b) {
                return true;
            }
        }
        return false;
    }

    public int getNano() {
        return this.b;
    }

    public long getSeconds() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final j$.time.temporal.Temporal h(j$.time.temporal.Temporal temporal) {
        long j = this.a;
        if (j != 0) {
            temporal = temporal.b(j, j$.time.temporal.ChronoUnit.SECONDS);
        }
        int i = this.b;
        return i != 0 ? temporal.b(i, j$.time.temporal.ChronoUnit.NANOS) : temporal;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    public boolean isNegative() {
        return (this.a > 0L ? 1 : (this.a == 0L ? 0 : -1)) >>> 31;
    }

    public boolean isZero() {
        return (this.a | ((long) this.b)) == 0;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final j$.time.temporal.Temporal k(j$.time.Instant instant) {
        long j = this.a;
        j$.time.Instant instantY = instant;
        if (j != 0) {
            instantY = instant.y(j, j$.time.temporal.ChronoUnit.SECONDS);
        }
        int i = this.b;
        if (i == 0) {
            return instantY;
        }
        return instantY.y(i, j$.time.temporal.ChronoUnit.NANOS);
    }

    public j$.time.Duration minus(j$.time.Duration duration) {
        long seconds = duration.getSeconds();
        int nano = duration.getNano();
        return seconds == Long.MIN_VALUE ? y(Long.MAX_VALUE, -nano).y(1L, 0L) : y(-seconds, -nano);
    }

    public j$.time.Duration minusMinutes(long j) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = y(j$.com.android.tools.r8.a.O(Long.MAX_VALUE, 60L), 0L);
            this.getClass();
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.y(j$.com.android.tools.r8.a.O(j2, 60L), 0L);
    }

    public j$.time.Duration plus(j$.time.Duration duration) {
        return y(duration.getSeconds(), duration.getNano());
    }

    public j$.time.Duration plusNanos(long j) {
        return y(0L, j);
    }

    public j$.time.Duration plusSeconds(long j) {
        return y(j, 0L);
    }

    public final j$.time.Duration r(long j) {
        if (j == 0) {
            return ZERO;
        }
        return j != 1 ? p(java.math.BigDecimal.valueOf(this.a).add(java.math.BigDecimal.valueOf(this.b, 9)).multiply(java.math.BigDecimal.valueOf(j))) : this;
    }

    public long toDays() {
        return this.a / 86400;
    }

    public long toMillis() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.O(j2, 1000L), j / 1000000);
    }

    public long toMinutes() {
        return this.a / 60;
    }

    public long toNanos() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.O(j2, 1000000000L), j);
    }

    public long toSeconds() {
        return this.a;
    }

    public java.lang.String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.a;
        int i = this.b;
        long j2 = (j >= 0 || i <= 0) ? j : 1 + j;
        long j3 = j2 / 3600;
        int i2 = (int) ((j2 % 3600) / 60);
        int i3 = (int) (j2 % 60);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(24);
        sb.append("PT");
        if (j3 != 0) {
            sb.append(j3);
            sb.append('H');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i3 == 0 && i == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j >= 0 || i <= 0 || i3 != 0) {
            sb.append(i3);
        } else {
            sb.append("-0");
        }
        if (i > 0) {
            int length = sb.length();
            if (j < 0) {
                sb.append(2000000000 - ((long) i));
            } else {
                sb.append(((long) i) + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    public final j$.time.Duration y(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofSeconds(j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.N(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    public static j$.time.Duration ofSeconds(long j) {
        return l(j, 0);
    }
}
