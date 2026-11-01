package j$.time.zone;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class ZoneRules implements java.io.Serializable {
    public static final long[] i = new long[0];
    public static final j$.time.zone.d[] j = new j$.time.zone.d[0];
    public static final j$.time.LocalDateTime[] k = new j$.time.LocalDateTime[0];
    public static final j$.time.zone.b[] l = new j$.time.zone.b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final j$.time.ZoneOffset[] b;
    public final long[] c;
    public final j$.time.LocalDateTime[] d;
    public final j$.time.ZoneOffset[] e;
    public final j$.time.zone.d[] f;
    public final java.util.TimeZone g;
    public final transient j$.util.concurrent.ConcurrentHashMap h = new j$.util.concurrent.ConcurrentHashMap();

    public ZoneRules(long[] jArr, j$.time.ZoneOffset[] zoneOffsetArr, long[] jArr2, j$.time.ZoneOffset[] zoneOffsetArr2, j$.time.zone.d[] dVarArr) {
        this.a = jArr;
        this.b = zoneOffsetArr;
        this.c = jArr2;
        this.e = zoneOffsetArr2;
        this.f = dVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                j$.time.ZoneOffset zoneOffset = zoneOffsetArr2[i2];
                int i3 = i2 + 1;
                j$.time.ZoneOffset zoneOffset2 = zoneOffsetArr2[i3];
                j$.time.LocalDateTime localDateTimeC = j$.time.LocalDateTime.C(jArr2[i2], 0, zoneOffset);
                if (zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds()) {
                    arrayList.add(localDateTimeC);
                    arrayList.add(localDateTimeC.O(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()));
                } else {
                    arrayList.add(localDateTimeC.O(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()));
                    arrayList.add(localDateTimeC);
                }
                i2 = i3;
            }
            this.d = (j$.time.LocalDateTime[]) arrayList.toArray(new j$.time.LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    public static java.lang.Object a(j$.time.LocalDateTime localDateTime, j$.time.zone.b bVar) {
        j$.time.LocalDateTime localDateTime2 = bVar.b;
        j$.time.LocalDateTime localDateTime3 = bVar.b;
        j$.time.ZoneOffset zoneOffset = bVar.d;
        j$.time.ZoneOffset zoneOffset2 = bVar.c;
        if (bVar.h()) {
            if (!localDateTime.z(localDateTime2)) {
                if (localDateTime.z(localDateTime3.O(zoneOffset.getTotalSeconds() - zoneOffset2.getTotalSeconds()))) {
                    return bVar;
                }
                return zoneOffset;
            }
            return zoneOffset2;
        }
        if (localDateTime.z(localDateTime2)) {
            if (!localDateTime.z(localDateTime3.O(zoneOffset.getTotalSeconds() - zoneOffset2.getTotalSeconds()))) {
                return bVar;
            }
            return zoneOffset2;
        }
        return zoneOffset;
    }

    public static int c(long j2, j$.time.ZoneOffset zoneOffset) {
        return j$.time.LocalDate.Q(j$.com.android.tools.r8.a.C(j2 + ((long) zoneOffset.getTotalSeconds()), 86400L)).getYear();
    }

    public static j$.time.ZoneOffset i(int i2) {
        return j$.time.ZoneOffset.Q(i2 / 1000);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.zone.a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j$.time.zone.b[] b(int i2) {
        j$.time.zone.b[] bVarArr;
        j$.time.LocalDate localDateT;
        long j2;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i2);
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.h;
        j$.time.zone.b[] bVarArr2 = (j$.time.zone.b[]) concurrentHashMap.get(numValueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        int i3 = 2100;
        int i4 = 0;
        java.util.TimeZone timeZone = this.g;
        if (timeZone != null) {
            j$.time.zone.b[] bVarArr3 = l;
            if (i2 < 1800) {
                return bVarArr3;
            }
            j$.time.LocalDateTime localDateTime = j$.time.LocalDateTime.c;
            j$.time.LocalDate localDateOf = j$.time.LocalDate.of(i2 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.t(0L);
            long epochSecond = new j$.time.LocalDateTime(localDateOf, j$.time.j.h[0]).toEpochSecond(this.b[0]);
            int offset = timeZone.getOffset(epochSecond * 1000);
            long j3 = 31968000 + epochSecond;
            while (epochSecond < j3) {
                long j4 = epochSecond + 7776000;
                if (offset != timeZone.getOffset(j4 * 1000)) {
                    while (j4 - epochSecond > 1) {
                        long j5 = epochSecond;
                        long jC = j$.com.android.tools.r8.a.C(j4 + epochSecond, 2L);
                        if (timeZone.getOffset(jC * 1000) == offset) {
                            epochSecond = jC;
                        } else {
                            j4 = jC;
                            epochSecond = j5;
                        }
                    }
                    long j6 = epochSecond;
                    epochSecond = timeZone.getOffset(j6 * 1000) != offset ? j6 : j4;
                    j$.time.ZoneOffset zoneOffsetI = i(offset);
                    int offset2 = timeZone.getOffset(epochSecond * 1000);
                    j$.time.ZoneOffset zoneOffsetI2 = i(offset2);
                    if (c(epochSecond, zoneOffsetI2) == i2) {
                        j$.time.zone.b[] bVarArr4 = (j$.time.zone.b[]) java.util.Arrays.copyOf(bVarArr3, bVarArr3.length + 1);
                        bVarArr4[bVarArr4.length - 1] = new j$.time.zone.b(epochSecond, zoneOffsetI, zoneOffsetI2);
                        offset = offset2;
                        bVarArr3 = bVarArr4;
                    } else {
                        offset = offset2;
                    }
                } else {
                    epochSecond = j4;
                }
            }
            if (1916 <= i2 && i2 < 2100) {
                concurrentHashMap.putIfAbsent(numValueOf, bVarArr3);
            }
            return bVarArr3;
        }
        long j7 = 1;
        j$.time.zone.d[] dVarArr = this.f;
        j$.time.zone.b[] bVarArr5 = new j$.time.zone.b[dVarArr.length];
        while (i4 < dVarArr.length) {
            j$.time.zone.d dVar = dVarArr[i4];
            j$.time.ZoneOffset zoneOffset = dVar.h;
            j$.time.DayOfWeek dayOfWeek = dVar.c;
            byte b = dVar.b;
            j$.time.k kVar = dVar.a;
            if (b < 0) {
                bVarArr = bVarArr5;
                long j8 = i2;
                int iT = kVar.t(j$.time.chrono.q.c.D(j8)) + 1 + b;
                j$.time.LocalDate localDate = j$.time.LocalDate.d;
                j$.time.temporal.a.YEAR.t(j8);
                j$.util.Objects.requireNonNull(kVar, "month");
                j$.time.temporal.a.DAY_OF_MONTH.t(iT);
                localDateT = j$.time.LocalDate.t(i2, kVar.getValue(), iT);
                if (dayOfWeek != null) {
                    localDateT = localDateT.k(new j$.time.temporal.k(dayOfWeek.getValue(), (byte) 2));
                }
            } else {
                bVarArr = bVarArr5;
                j$.time.LocalDate localDate2 = j$.time.LocalDate.d;
                j$.time.temporal.a.YEAR.t(i2);
                j$.util.Objects.requireNonNull(kVar, "month");
                j$.time.temporal.a.DAY_OF_MONTH.t(b);
                localDateT = j$.time.LocalDate.t(i2, kVar.getValue(), b);
                if (dayOfWeek != null) {
                    localDateT = localDateT.k(j$.time.temporal.TemporalAdjusters.nextOrSame(dayOfWeek));
                }
            }
            if (dVar.e) {
                j2 = j7;
                localDateT = localDateT.plusDays(j2);
            } else {
                j2 = j7;
            }
            j$.time.LocalDateTime localDateTimeB = j$.time.LocalDateTime.B(localDateT, dVar.d);
            j$.time.zone.c cVar = dVar.f;
            j$.time.ZoneOffset zoneOffset2 = dVar.g;
            int iOrdinal = cVar.ordinal();
            if (iOrdinal == 0) {
                localDateTimeB = localDateTimeB.O(zoneOffset.getTotalSeconds() - j$.time.ZoneOffset.UTC.getTotalSeconds());
            } else if (iOrdinal == 2) {
                localDateTimeB = localDateTimeB.O(zoneOffset.getTotalSeconds() - zoneOffset2.getTotalSeconds());
            }
            bVarArr[i4] = new j$.time.zone.b(localDateTimeB, zoneOffset, dVar.i);
            i4++;
            j7 = j2;
            bVarArr5 = bVarArr;
            i3 = 2100;
        }
        j$.time.zone.b[] bVarArr6 = bVarArr5;
        if (i2 < i3) {
            concurrentHashMap.putIfAbsent(numValueOf, bVarArr6);
        }
        return bVarArr6;
    }

    public final j$.time.ZoneOffset d(j$.time.Instant instant) {
        java.util.TimeZone timeZone = this.g;
        if (timeZone != null) {
            return i(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.c;
        if (jArr.length == 0) {
            return this.b[0];
        }
        long epochSecond = instant.getEpochSecond();
        int length = this.f.length;
        j$.time.ZoneOffset[] zoneOffsetArr = this.e;
        if (length <= 0 || epochSecond <= jArr[jArr.length - 1]) {
            int iBinarySearch = java.util.Arrays.binarySearch(jArr, epochSecond);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            return zoneOffsetArr[iBinarySearch + 1];
        }
        j$.time.zone.b[] bVarArrB = b(c(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
        j$.time.zone.b bVar = null;
        for (int i2 = 0; i2 < bVarArrB.length; i2++) {
            bVar = bVarArrB[i2];
            if (epochSecond < bVar.a) {
                return bVar.c;
            }
        }
        return bVar.d;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    public final java.lang.Object e(j$.time.LocalDateTime localDateTime) {
        boolean z;
        java.lang.Object objA;
        java.lang.Object obj = null;
        j$.time.ZoneOffset[] zoneOffsetArr = this.b;
        int i2 = 0;
        java.util.TimeZone timeZone = this.g;
        if (timeZone != null) {
            j$.time.zone.b[] bVarArrB = b(localDateTime.a.getYear());
            if (bVarArrB.length == 0) {
                return i(timeZone.getOffset(localDateTime.toEpochSecond(zoneOffsetArr[0]) * 1000));
            }
            int length = bVarArrB.length;
            while (i2 < length) {
                j$.time.zone.b bVar = bVarArrB[i2];
                objA = a(localDateTime, bVar);
                if ((objA instanceof j$.time.zone.b) || objA.equals(bVar.c)) {
                    return objA;
                }
                i2++;
                obj = objA;
            }
            return obj;
        }
        if (this.c.length == 0) {
            return zoneOffsetArr[0];
        }
        int length2 = this.f.length;
        j$.time.LocalDateTime[] localDateTimeArr = this.d;
        if (length2 > 0) {
            j$.time.LocalDateTime localDateTime2 = localDateTimeArr[localDateTimeArr.length - 1];
            if (localDateTime2 == null) {
                long jE = localDateTime.a.E();
                long jE2 = localDateTime2.a.E();
                if (jE > jE2 || (jE == jE2 && localDateTime.b.T() > localDateTime2.b.T())) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (localDateTime.r(localDateTime2) > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                j$.time.zone.b[] bVarArrB2 = b(localDateTime.a.getYear());
                int length3 = bVarArrB2.length;
                while (i2 < length3) {
                    j$.time.zone.b bVar2 = bVarArrB2[i2];
                    objA = a(localDateTime, bVar2);
                    if ((objA instanceof j$.time.zone.b) || objA.equals(bVar2.c)) {
                        return objA;
                    }
                    i2++;
                    obj = objA;
                }
                return obj;
            }
        }
        int iBinarySearch = java.util.Arrays.binarySearch(localDateTimeArr, localDateTime);
        j$.time.ZoneOffset[] zoneOffsetArr2 = this.e;
        if (iBinarySearch == -1) {
            return zoneOffsetArr2[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else if (iBinarySearch < localDateTimeArr.length - 1) {
            int i3 = iBinarySearch + 1;
            if (localDateTimeArr[iBinarySearch].equals(localDateTimeArr[i3])) {
                iBinarySearch = i3;
            }
        }
        if ((iBinarySearch & 1) != 0) {
            return zoneOffsetArr2[(iBinarySearch / 2) + 1];
        }
        j$.time.LocalDateTime localDateTime3 = localDateTimeArr[iBinarySearch];
        j$.time.LocalDateTime localDateTime4 = localDateTimeArr[iBinarySearch + 1];
        int i4 = iBinarySearch / 2;
        j$.time.ZoneOffset zoneOffset = zoneOffsetArr2[i4];
        j$.time.ZoneOffset zoneOffset2 = zoneOffsetArr2[i4 + 1];
        return zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds() ? new j$.time.zone.b(localDateTime3, zoneOffset, zoneOffset2) : new j$.time.zone.b(localDateTime4, zoneOffset, zoneOffset2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.zone.ZoneRules) {
            j$.time.zone.ZoneRules zoneRules = (j$.time.zone.ZoneRules) obj;
            if (j$.util.Objects.equals(this.g, zoneRules.g) && java.util.Arrays.equals(this.a, zoneRules.a) && java.util.Arrays.equals(this.b, zoneRules.b) && java.util.Arrays.equals(this.c, zoneRules.c) && java.util.Arrays.equals(this.e, zoneRules.e) && java.util.Arrays.equals(this.f, zoneRules.f)) {
                return true;
            }
        }
        return false;
    }

    public final java.util.List f(j$.time.LocalDateTime localDateTime) {
        java.lang.Object objE = e(localDateTime);
        if (!(objE instanceof j$.time.zone.b)) {
            return java.util.Collections.singletonList((j$.time.ZoneOffset) objE);
        }
        j$.time.zone.b bVar = (j$.time.zone.b) objE;
        return bVar.h() ? java.util.Collections.EMPTY_LIST : j$.com.android.tools.r8.a.F(new java.lang.Object[]{bVar.c, bVar.d});
    }

    public final boolean g(j$.time.Instant instant) {
        j$.time.ZoneOffset zoneOffsetI;
        java.util.TimeZone timeZone = this.g;
        if (timeZone != null) {
            zoneOffsetI = i(timeZone.getRawOffset());
        } else {
            int length = this.c.length;
            j$.time.ZoneOffset[] zoneOffsetArr = this.b;
            if (length == 0) {
                zoneOffsetI = zoneOffsetArr[0];
            } else {
                int iBinarySearch = java.util.Arrays.binarySearch(this.a, instant.getEpochSecond());
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 2;
                }
                zoneOffsetI = zoneOffsetArr[iBinarySearch + 1];
            }
        }
        return !zoneOffsetI.equals(d(instant));
    }

    public j$.time.ZoneOffset getOffset(j$.time.LocalDateTime localDateTime) {
        java.lang.Object objE = e(localDateTime);
        return objE instanceof j$.time.zone.b ? ((j$.time.zone.b) objE).c : (j$.time.ZoneOffset) objE;
    }

    public final boolean h() {
        j$.time.zone.b bVar;
        java.util.TimeZone timeZone = this.g;
        if (timeZone != null) {
            if (timeZone.useDaylightTime() || timeZone.getDSTSavings() != 0) {
                return false;
            }
            j$.time.Instant instantNow = j$.time.Instant.now();
            long epochSecond = instantNow.getEpochSecond();
            if (instantNow.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
                epochSecond++;
            }
            int iC = c(epochSecond, d(instantNow));
            j$.time.zone.b[] bVarArrB = b(iC);
            int length = bVarArrB.length - 1;
            while (true) {
                if (length < 0) {
                    bVar = null;
                    if (iC <= 1800) {
                        break;
                    }
                    j$.time.zone.b[] bVarArrB2 = b(iC - 1);
                    int length2 = bVarArrB2.length - 1;
                    while (true) {
                        if (length2 < 0) {
                            int i2 = j$.time.b.a;
                            j$.time.a.c.getClass();
                            int offset = timeZone.getOffset((epochSecond - 1) * 1000);
                            long jE = j$.time.LocalDate.of(1800, 1, 1).E() * 86400;
                            for (long jMin = java.lang.Math.min(epochSecond - 31104000, (java.lang.System.currentTimeMillis() / 1000) + 31968000); jE <= jMin; jMin -= 7776000) {
                                int offset2 = timeZone.getOffset(jMin * 1000);
                                if (offset != offset2) {
                                    int iC2 = c(jMin, i(offset2));
                                    j$.time.zone.b[] bVarArrB3 = b(iC2 + 1);
                                    int length3 = bVarArrB3.length - 1;
                                    while (true) {
                                        if (length3 < 0) {
                                            j$.time.zone.b[] bVarArrB4 = b(iC2);
                                            bVar = bVarArrB4[bVarArrB4.length - 1];
                                            break;
                                        }
                                        bVar = bVarArrB3[length3];
                                        if (epochSecond > bVar.a) {
                                            break;
                                        }
                                        length3--;
                                    }
                                }
                            }
                            break;
                        }
                        j$.time.zone.b bVar2 = bVarArrB2[length2];
                        if (epochSecond > bVar2.a) {
                            bVar = bVar2;
                            break;
                        }
                        length2--;
                    }
                } else {
                    bVar = bVarArrB[length];
                    if (epochSecond > bVar.a) {
                        break;
                    }
                    length--;
                }
            }
            if (bVar != null) {
                return false;
            }
        } else if (this.c.length != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((j$.util.Objects.hashCode(this.g) ^ java.util.Arrays.hashCode(this.a)) ^ java.util.Arrays.hashCode(this.b)) ^ java.util.Arrays.hashCode(this.c)) ^ java.util.Arrays.hashCode(this.e)) ^ java.util.Arrays.hashCode(this.f);
    }

    public final java.lang.String toString() {
        java.util.TimeZone timeZone = this.g;
        if (timeZone != null) {
            return j$.desugar.sun.nio.fs.h.a("ZoneRules[timeZone=", timeZone.getID(), "]");
        }
        j$.time.ZoneOffset[] zoneOffsetArr = this.b;
        return j$.desugar.sun.nio.fs.h.a("ZoneRules[currentStandardOffset=", java.lang.String.valueOf(zoneOffsetArr[zoneOffsetArr.length - 1]), "]");
    }

    public ZoneRules(j$.time.ZoneOffset zoneOffset) {
        j$.time.ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    public ZoneRules(java.util.TimeZone timeZone) {
        j$.time.ZoneOffset[] zoneOffsetArr = {i(timeZone.getRawOffset())};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }
}
