package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class FileTime implements java.lang.Comparable<j$.nio.file.attribute.FileTime> {
    public final java.util.concurrent.TimeUnit a;
    public final long b;
    public j$.time.Instant c;
    public java.lang.String d;

    public FileTime(long j, java.util.concurrent.TimeUnit timeUnit, j$.time.Instant instant) {
        this.b = j;
        this.a = timeUnit;
        this.c = instant;
    }

    public static j$.nio.file.attribute.FileTime from(j$.time.Instant instant) {
        j$.util.Objects.requireNonNull(instant, "instant");
        return new j$.nio.file.attribute.FileTime(0L, null, instant);
    }

    public static void h(java.lang.StringBuilder sb, int i, int i2) {
        while (i > 0) {
            sb.append((char) ((i2 / i) + 48));
            i2 %= i;
            i /= 10;
        }
    }

    public static long l(long j, long j2, long j3) {
        if (j > j3) {
            return Long.MAX_VALUE;
        }
        if (j < (-j3)) {
            return Long.MIN_VALUE;
        }
        return j * j2;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof j$.nio.file.attribute.FileTime) && compareTo((j$.nio.file.attribute.FileTime) obj) == 0;
    }

    public final int hashCode() {
        return toInstant().hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.nio.file.attribute.FileTime fileTime) {
        long j = this.b;
        java.util.concurrent.TimeUnit timeUnit = this.a;
        if (timeUnit != null && timeUnit == fileTime.a) {
            return java.lang.Long.compare(j, fileTime.b);
        }
        long epochSecond = toInstant().getEpochSecond();
        int iCompare = java.lang.Long.compare(epochSecond, fileTime.toInstant().getEpochSecond());
        if (iCompare != 0 || (iCompare = java.lang.Long.compare(toInstant().getNano(), fileTime.toInstant().getNano())) != 0) {
            return iCompare;
        }
        if (epochSecond != 31556889864403199L && epochSecond != -31557014167219200L) {
            return 0;
        }
        long days = timeUnit != null ? timeUnit.toDays(j) : toInstant().getEpochSecond() / 86400;
        java.util.concurrent.TimeUnit timeUnit2 = fileTime.a;
        long days2 = timeUnit2 != null ? timeUnit2.toDays(fileTime.b) : fileTime.toInstant().getEpochSecond() / 86400;
        return days == days2 ? java.lang.Long.compare(p(days), fileTime.p(days2)) : java.lang.Long.compare(days, days2);
    }

    public final long p(long j) {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        java.util.concurrent.TimeUnit timeUnit2 = this.a;
        if (timeUnit2 != null) {
            return timeUnit2.toNanos(this.b - timeUnit2.convert(j, timeUnit));
        }
        return java.util.concurrent.TimeUnit.SECONDS.toNanos(toInstant().getEpochSecond() - timeUnit.toSeconds(j));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x007d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0082  */
    /* JADX WARN: Code duplicated, block: B:20:0x008b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0090  */
    public j$.time.Instant toInstant() {
        long jC;
        j$.time.Instant instant = this.c;
        if (instant != null) {
            return instant;
        }
        int i = j$.nio.file.attribute.d0.a[this.a.ordinal()];
        long jL = this.b;
        int iM = 0;
        switch (i) {
            case 1:
                jL = l(this.b, 86400L, 106751991167300L);
                if (jL <= -31557014167219200L) {
                    j$.time.Instant instant2 = j$.time.Instant.MIN;
                    this.c = instant2;
                    return instant2;
                }
                if (jL >= 31556889864403199L) {
                    j$.time.Instant instant3 = j$.time.Instant.MAX;
                    this.c = instant3;
                    return instant3;
                }
                j$.time.Instant instantOfEpochSecond = j$.time.Instant.ofEpochSecond(jL, iM);
                this.c = instantOfEpochSecond;
                return instantOfEpochSecond;
            case 2:
                jL = l(this.b, 3600L, 2562047788015215L);
                if (jL <= -31557014167219200L) {
                    j$.time.Instant instant4 = j$.time.Instant.MIN;
                    this.c = instant4;
                    return instant4;
                }
                if (jL >= 31556889864403199L) {
                    j$.time.Instant instant5 = j$.time.Instant.MAX;
                    this.c = instant5;
                    return instant5;
                }
                j$.time.Instant instantOfEpochSecond2 = j$.time.Instant.ofEpochSecond(jL, iM);
                this.c = instantOfEpochSecond2;
                return instantOfEpochSecond2;
            case 3:
                jL = l(this.b, 60L, 153722867280912930L);
                if (jL <= -31557014167219200L) {
                    j$.time.Instant instant6 = j$.time.Instant.MIN;
                    this.c = instant6;
                    return instant6;
                }
                if (jL >= 31556889864403199L) {
                    j$.time.Instant instant7 = j$.time.Instant.MAX;
                    this.c = instant7;
                    return instant7;
                }
                j$.time.Instant instantOfEpochSecond3 = j$.time.Instant.ofEpochSecond(jL, iM);
                this.c = instantOfEpochSecond3;
                return instantOfEpochSecond3;
            case 4:
                if (jL <= -31557014167219200L) {
                    j$.time.Instant instant8 = j$.time.Instant.MIN;
                    this.c = instant8;
                    return instant8;
                }
                if (jL >= 31556889864403199L) {
                    j$.time.Instant instant9 = j$.time.Instant.MAX;
                    this.c = instant9;
                    return instant9;
                }
                j$.time.Instant instantOfEpochSecond4 = j$.time.Instant.ofEpochSecond(jL, iM);
                this.c = instantOfEpochSecond4;
                return instantOfEpochSecond4;
            case 5:
                jC = j$.com.android.tools.r8.a.C(jL, 1000L);
                iM = ((int) j$.com.android.tools.r8.a.M(jL, 1000L)) * 1000000;
                jL = jC;
                if (jL <= -31557014167219200L) {
                    j$.time.Instant instant10 = j$.time.Instant.MIN;
                    this.c = instant10;
                    return instant10;
                }
                if (jL >= 31556889864403199L) {
                    j$.time.Instant instant11 = j$.time.Instant.MAX;
                    this.c = instant11;
                    return instant11;
                }
                j$.time.Instant instantOfEpochSecond5 = j$.time.Instant.ofEpochSecond(jL, iM);
                this.c = instantOfEpochSecond5;
                return instantOfEpochSecond5;
            case 6:
                jC = j$.com.android.tools.r8.a.C(jL, 1000000L);
                iM = ((int) j$.com.android.tools.r8.a.M(jL, 1000000L)) * 1000;
                jL = jC;
                if (jL <= -31557014167219200L) {
                    j$.time.Instant instant12 = j$.time.Instant.MIN;
                    this.c = instant12;
                    return instant12;
                }
                if (jL >= 31556889864403199L) {
                    j$.time.Instant instant13 = j$.time.Instant.MAX;
                    this.c = instant13;
                    return instant13;
                }
                j$.time.Instant instantOfEpochSecond6 = j$.time.Instant.ofEpochSecond(jL, iM);
                this.c = instantOfEpochSecond6;
                return instantOfEpochSecond6;
            case 7:
                jC = j$.com.android.tools.r8.a.C(jL, 1000000000L);
                iM = (int) j$.com.android.tools.r8.a.M(jL, 1000000000L);
                jL = jC;
                if (jL <= -31557014167219200L) {
                    j$.time.Instant instant14 = j$.time.Instant.MIN;
                    this.c = instant14;
                    return instant14;
                }
                if (jL >= 31556889864403199L) {
                    j$.time.Instant instant15 = j$.time.Instant.MAX;
                    this.c = instant15;
                    return instant15;
                }
                j$.time.Instant instantOfEpochSecond7 = j$.time.Instant.ofEpochSecond(jL, iM);
                this.c = instantOfEpochSecond7;
                return instantOfEpochSecond7;
            default:
                throw new java.lang.AssertionError("Unit not handled");
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public final java.lang.String toString() {
        long epochSecond;
        int nano;
        long jC;
        j$.time.LocalDateTime localDateTimeC;
        int year;
        java.lang.String str = this.d;
        if (str != null) {
            return str;
        }
        if (this.c == null) {
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
            java.util.concurrent.TimeUnit timeUnit2 = this.a;
            if (timeUnit2.compareTo(timeUnit) >= 0) {
                epochSecond = timeUnit2.toSeconds(this.b);
                nano = 0;
            } else {
                epochSecond = toInstant().getEpochSecond();
                nano = toInstant().getNano();
            }
        } else {
            epochSecond = toInstant().getEpochSecond();
            nano = toInstant().getNano();
        }
        if (epochSecond >= -62167219200L) {
            long j = epochSecond - 253402300800L;
            jC = j$.com.android.tools.r8.a.C(j, 315569520000L) + 1;
            localDateTimeC = j$.time.LocalDateTime.C(j$.com.android.tools.r8.a.M(j, 315569520000L) - 62167219200L, nano, j$.time.ZoneOffset.UTC);
            year = localDateTimeC.a.getYear();
        } else {
            long j2 = epochSecond + 62167219200L;
            jC = j2 / 315569520000L;
            localDateTimeC = j$.time.LocalDateTime.C((j2 % 315569520000L) - 62167219200L, nano, j$.time.ZoneOffset.UTC);
            year = localDateTimeC.a.getYear();
        }
        int i = (((int) jC) * 10000) + year;
        j$.time.LocalDate localDate = localDateTimeC.a;
        j$.time.j jVar = localDateTimeC.b;
        if (i <= 0) {
            i--;
        }
        int i2 = jVar.d;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        sb.append(i < 0 ? "-" : "");
        int iAbs = java.lang.Math.abs(i);
        if (iAbs < 10000) {
            h(sb, 1000, java.lang.Math.abs(iAbs));
        } else {
            sb.append(java.lang.String.valueOf(iAbs));
        }
        sb.append('-');
        h(sb, 10, localDate.getMonthValue());
        sb.append('-');
        h(sb, 10, localDate.getDayOfMonth());
        sb.append('T');
        h(sb, 10, jVar.a);
        sb.append(':');
        h(sb, 10, jVar.b);
        sb.append(':');
        h(sb, 10, jVar.c);
        if (i2 != 0) {
            sb.append('.');
            int i3 = 100000000;
            while (i2 % 10 == 0) {
                i2 /= 10;
                i3 /= 10;
            }
            h(sb, i3, i2);
        }
        sb.append('Z');
        java.lang.String string = sb.toString();
        this.d = string;
        return string;
    }
}
