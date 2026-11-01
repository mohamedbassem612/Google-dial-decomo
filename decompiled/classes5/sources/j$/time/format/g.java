package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class g implements j$.time.format.e {
    @Override // j$.time.format.e
    public final boolean h(j$.time.format.w wVar, java.lang.StringBuilder sb) {
        java.lang.Long lA = wVar.a(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.TemporalAccessor temporalAccessor = wVar.a;
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        java.lang.Long lValueOf = temporalAccessor.c(aVar) ? java.lang.Long.valueOf(temporalAccessor.D(aVar)) : null;
        int i = 0;
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        int iA = aVar.b.a(lValueOf != null ? lValueOf.longValue() : 0L, aVar);
        if (jLongValue >= -62167219200L) {
            long j = jLongValue - 253402300800L;
            long jC = j$.com.android.tools.r8.a.C(j, 315569520000L) + 1;
            j$.time.LocalDateTime localDateTimeC = j$.time.LocalDateTime.C(j$.com.android.tools.r8.a.M(j, 315569520000L) - 62167219200L, 0, j$.time.ZoneOffset.UTC);
            if (jC > 0) {
                sb.append('+');
                sb.append(jC);
            }
            sb.append(localDateTimeC);
            if (localDateTimeC.b.c == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = jLongValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            j$.time.LocalDateTime localDateTimeC2 = j$.time.LocalDateTime.C(j4 - 62167219200L, 0, j$.time.ZoneOffset.UTC);
            int length = sb.length();
            sb.append(localDateTimeC2);
            if (localDateTimeC2.b.c == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (localDateTimeC2.a.getYear() == -10000) {
                    sb.replace(length, length + 2, java.lang.Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, java.lang.Math.abs(j3));
                }
            }
        }
        if (iA > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (iA <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = iA / i2;
                sb.append((char) (i3 + 48));
                iA -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    @Override // j$.time.format.e
    public final int k(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i) {
        j$.time.format.u uVar = new j$.time.format.u();
        uVar.a(j$.time.format.DateTimeFormatter.ISO_LOCAL_DATE);
        uVar.d('T');
        j$.time.temporal.a aVar = j$.time.temporal.a.HOUR_OF_DAY;
        uVar.l(aVar, 2);
        uVar.d(':');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MINUTE_OF_HOUR;
        uVar.l(aVar2, 2);
        uVar.d(':');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.SECOND_OF_MINUTE;
        uVar.l(aVar3, 2);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
        int i2 = 1;
        uVar.b(aVar4, 0, 9, true);
        uVar.d('Z');
        j$.time.format.d dVar = uVar.q(java.util.Locale.getDefault(), j$.time.format.c0.SMART, null).a;
        if (dVar.b) {
            dVar = new j$.time.format.d(dVar.a, false);
        }
        j$.time.format.v vVar2 = new j$.time.format.v(vVar.a);
        vVar2.b = vVar.b;
        vVar2.c = vVar.c;
        int iK = dVar.k(vVar2, charSequence, i);
        if (iK < 0) {
            return iK;
        }
        long jLongValue = vVar2.d(j$.time.temporal.a.YEAR).longValue();
        int iIntValue = vVar2.d(j$.time.temporal.a.MONTH_OF_YEAR).intValue();
        int iIntValue2 = vVar2.d(j$.time.temporal.a.DAY_OF_MONTH).intValue();
        int iIntValue3 = vVar2.d(aVar).intValue();
        int iIntValue4 = vVar2.d(aVar2).intValue();
        java.lang.Long lD = vVar2.d(aVar3);
        java.lang.Long lD2 = vVar2.d(aVar4);
        int iIntValue5 = lD != null ? lD.intValue() : 0;
        int iIntValue6 = lD2 != null ? lD2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            iIntValue3 = 0;
        } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
            vVar.c().d = true;
            i2 = 0;
            iIntValue5 = 59;
        } else {
            i2 = 0;
        }
        int i3 = ((int) jLongValue) % 10000;
        try {
            j$.time.LocalDateTime localDateTime = j$.time.LocalDateTime.c;
            return vVar.f(aVar4, iIntValue6, i, vVar.f(j$.time.temporal.a.INSTANT_SECONDS, new j$.time.LocalDateTime(j$.time.LocalDate.of(i3, iIntValue, iIntValue2), j$.time.j.C(iIntValue3, iIntValue4, iIntValue5, 0)).N(i2).toEpochSecond(j$.time.ZoneOffset.UTC) + j$.com.android.tools.r8.a.O(jLongValue / 10000, 315569520000L), i, iK));
        } catch (java.lang.RuntimeException unused) {
            return ~i;
        }
    }

    public final java.lang.String toString() {
        return "Instant()";
    }
}
