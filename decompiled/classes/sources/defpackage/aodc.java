package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aodc {
    private aodc() {
    }

    private static java.lang.String A(java.lang.String str, java.lang.Throwable th, java.lang.Object[] objArr) {
        return ((th != null || objArr.length <= 0) && objArr.length <= 1) ? str : java.lang.String.format(java.util.Locale.US, str, objArr);
    }

    private static java.lang.Throwable B(java.lang.Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            java.lang.Object obj = objArr[length - 1];
            if (obj instanceof java.lang.Throwable) {
                return (java.lang.Throwable) obj;
            }
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahzr */
    public static java.util.Set a(java.util.Map map, java.lang.String str) throws ahzr {
        defpackage.anqt anqtVar;
        java.util.List listG = g(map, str);
        if (listG == null) {
            return null;
        }
        java.util.EnumSet enumSetNoneOf = java.util.EnumSet.noneOf(defpackage.anqt.class);
        for (java.lang.Object obj : listG) {
            if (obj instanceof java.lang.Double) {
                java.lang.Double d = (java.lang.Double) obj;
                int iIntValue = d.intValue();
                defpackage.ahvr.bE(((double) iIntValue) == d.doubleValue(), "Status code %s is not integral", obj);
                anqtVar = defpackage.anqw.c(iIntValue).o;
                defpackage.ahvr.bE(anqtVar.r == d.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof java.lang.String)) {
                    throw new ahzr("Can not convert status code " + java.lang.String.valueOf(obj) + " to Status.Code, because its type is " + java.lang.String.valueOf(obj.getClass()));
                }
                try {
                    defpackage.anqt anqtVar2 = defpackage.anqt.OK;
                    anqtVar = (defpackage.anqt) java.lang.Enum.valueOf(defpackage.anqt.class, (java.lang.String) obj);
                } catch (java.lang.IllegalArgumentException e) {
                    throw new ahzr(defpackage.hgb.i(obj, "Status code ", " is not valid"), e);
                }
            }
            enumSetNoneOf.add(anqtVar);
        }
        return j$.util.DesugarCollections.unmodifiableSet(enumSetNoneOf);
    }

    public static java.lang.Boolean b(java.util.Map map, java.lang.String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        java.lang.Object obj = map.get(str);
        if (obj instanceof java.lang.Boolean) {
            return (java.lang.Boolean) obj;
        }
        throw new java.lang.ClassCastException(java.lang.String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static java.lang.Double c(java.util.Map map, java.lang.String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        java.lang.Object obj = map.get(str);
        if (obj instanceof java.lang.Double) {
            return (java.lang.Double) obj;
        }
        if (!(obj instanceof java.lang.String)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return java.lang.Double.valueOf(java.lang.Double.parseDouble((java.lang.String) obj));
        } catch (java.lang.NumberFormatException unused) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    public static java.lang.Integer d(java.util.Map map, java.lang.String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        java.lang.Object obj = map.get(str);
        if (!(obj instanceof java.lang.Double)) {
            if (!(obj instanceof java.lang.String)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) obj));
            } catch (java.lang.NumberFormatException unused) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        java.lang.Double d = (java.lang.Double) obj;
        int iIntValue = d.intValue();
        if (iIntValue == d.doubleValue()) {
            return java.lang.Integer.valueOf(iIntValue);
        }
        throw new java.lang.ClassCastException("Number expected to be integer: ".concat(java.lang.String.valueOf(d)));
    }

    public static java.lang.Long e(java.util.Map map, java.lang.String str) {
        boolean z;
        int iCharAt;
        java.lang.String strF = f(map, str);
        if (strF == null) {
            return null;
        }
        try {
            if (strF.isEmpty() || strF.charAt(strF.length() - 1) != 's') {
                throw new java.text.ParseException("Invalid duration string: ".concat(strF), 0);
            }
            if (strF.charAt(0) == '-') {
                strF = strF.substring(1);
                z = true;
            } else {
                z = false;
            }
            java.lang.String strSubstring = strF.substring(0, strF.length() - 1);
            java.lang.String strSubstring2 = "";
            int iIndexOf = strSubstring.indexOf(46);
            if (iIndexOf != -1) {
                strSubstring2 = strSubstring.substring(iIndexOf + 1);
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            long jD = java.lang.Long.parseLong(strSubstring);
            if (strSubstring2.isEmpty()) {
                iCharAt = 0;
            } else {
                iCharAt = 0;
                for (int i = 0; i < 9; i++) {
                    iCharAt *= 10;
                    if (i < strSubstring2.length()) {
                        if (strSubstring2.charAt(i) < '0' || strSubstring2.charAt(i) > '9') {
                            throw new java.text.ParseException("Invalid nanoseconds.", 0);
                        }
                        iCharAt += strSubstring2.charAt(i) - '0';
                    }
                }
            }
            if (jD < 0) {
                throw new java.text.ParseException("Invalid duration string: ".concat(java.lang.String.valueOf(strF)), 0);
            }
            if (z) {
                jD = -jD;
                iCharAt = -iCharAt;
            }
            if (iCharAt <= -1000000000 || iCharAt >= 1000000000) {
                try {
                    jD = defpackage.a.d(jD, iCharAt / 1000000000);
                    iCharAt %= 1000000000;
                } catch (java.lang.IllegalArgumentException unused) {
                    throw new java.text.ParseException("Duration value is out of range.", 0);
                }
            }
            if (jD > 0 && iCharAt < 0) {
                iCharAt += 1000000000;
                jD--;
            }
            if (jD < 0 && iCharAt > 0) {
                iCharAt -= 1000000000;
                jD++;
            }
            if (!defpackage.anty.ao(jD, iCharAt)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", java.lang.Long.valueOf(jD), java.lang.Integer.valueOf(iCharAt)));
            }
            long nanos = java.util.concurrent.TimeUnit.SECONDS.toNanos(jD);
            long j = iCharAt;
            long j2 = nanos + j;
            if ((((j ^ nanos) > 0L ? 1 : ((j ^ nanos) == 0L ? 0 : -1)) | (((nanos ^ j2) > 0L ? 1 : ((nanos ^ j2) == 0L ? 0 : -1)) ^ (-1))) >= 0) {
                j2 = ((j2 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
            return java.lang.Long.valueOf(j2);
        } catch (java.text.ParseException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static java.lang.String f(java.util.Map map, java.lang.String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        java.lang.Object obj = map.get(str);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        throw new java.lang.ClassCastException(java.lang.String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static java.util.List g(java.util.Map map, java.lang.String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        java.lang.Object obj = map.get(str);
        if (obj instanceof java.util.List) {
            return (java.util.List) obj;
        }
        throw new java.lang.ClassCastException(java.lang.String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static java.util.List h(java.util.Map map, java.lang.String str) {
        java.util.List listG = g(map, str);
        if (listG == null) {
            return null;
        }
        k(listG);
        return listG;
    }

    public static java.util.List i(java.util.Map map, java.lang.String str) {
        java.util.List listG = g(map, str);
        if (listG == null) {
            return null;
        }
        for (int i = 0; i < listG.size(); i++) {
            if (!(listG.get(i) instanceof java.lang.String)) {
                throw new java.lang.ClassCastException(java.lang.String.format(java.util.Locale.US, "value '%s' for idx %d in '%s' is not string", listG.get(i), java.lang.Integer.valueOf(i), listG));
            }
        }
        return listG;
    }

    public static java.util.Map j(java.util.Map map, java.lang.String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        java.lang.Object obj = map.get(str);
        if (obj instanceof java.util.Map) {
            return (java.util.Map) obj;
        }
        throw new java.lang.ClassCastException(java.lang.String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static void k(java.util.List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof java.util.Map)) {
                throw new java.lang.ClassCastException(java.lang.String.format(java.util.Locale.US, "value %s for idx %d in %s is not object", list.get(i), java.lang.Integer.valueOf(i), list));
            }
        }
    }

    public static final java.util.concurrent.CancellationException l(java.lang.String str, java.lang.Throwable th) {
        java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final long m(long j) {
        return j < 0 ? defpackage.aorh.b : defpackage.aorh.a;
    }

    public static final long n(long j, long j2, defpackage.aorj aorjVar) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return defpackage.aooh.B(j3, aorjVar);
        }
        defpackage.aorj aorjVar2 = defpackage.aorj.MILLISECONDS;
        if (aorjVar.compareTo(aorjVar2) >= 0) {
            return defpackage.aorh.l(m(j3));
        }
        long jConvert = aorjVar.h.convert(1L, aorjVar2.h);
        long j4 = (j / jConvert) - (j2 / jConvert);
        long j5 = (j % jConvert) - (j2 % jConvert);
        long j6 = defpackage.aorh.a;
        return defpackage.aorh.j(defpackage.aooh.B(j4, aorjVar2), defpackage.aooh.B(j5, aorjVar));
    }

    public static final void o(defpackage.aopu aopuVar, java.lang.Object obj) {
        if (!aopuVar.d(obj)) {
            throw new java.lang.ClassCastException("Value cannot be cast to ".concat(java.lang.String.valueOf(aopuVar.b())));
        }
        defpackage.aooh.d(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
    }

    public static final void p(java.lang.Object obj, java.util.ArrayList arrayList) {
        java.lang.Object[] objArr;
        int length;
        if (obj == null || (length = (objArr = (java.lang.Object[]) obj).length) <= 0) {
            return;
        }
        arrayList.ensureCapacity(arrayList.size() + length);
        java.util.Collections.addAll(arrayList, objArr);
    }

    public static void q(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable(str, 3)) {
            java.lang.Throwable thB = B(objArr);
            java.lang.String strA = A(str2, thB, objArr);
            java.lang.String strConcat = "cn_".concat(java.lang.String.valueOf(str));
            if (thB != null) {
                android.util.Log.d(strConcat, strA, thB);
            } else {
                android.util.Log.d(strConcat, strA);
            }
        }
    }

    public static void r(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable(str, 2)) {
            java.lang.Throwable thB = B(objArr);
            java.lang.String strA = A(str2, thB, objArr);
            java.lang.String strConcat = "cn_".concat(java.lang.String.valueOf(str));
            if (thB != null) {
                android.util.Log.v(strConcat, strA, thB);
            } else {
                android.util.Log.v(strConcat, strA);
            }
        }
    }

    public static int s(int i, java.lang.Object obj) {
        return (i * 37) + (obj != null ? obj.hashCode() : 0);
    }

    public static java.lang.String t(aptw aptwVar, int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i2);
        for (int i3 = i; i3 < i + i2; i3++) {
            sb.append((char) (aptwVar.a(i3) & 255));
        }
        return sb.toString();
    }

    public static java.nio.charset.Charset u(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            return java.nio.charset.Charset.forName(str);
        } catch (java.nio.charset.IllegalCharsetNameException | java.nio.charset.UnsupportedCharsetException unused) {
            return null;
        }
    }

    public static boolean v(char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n';
    }

    public static /* synthetic */ java.lang.String w(int i) {
        switch (i) {
            case 1:
                return "T_START_MESSAGE";
            case 2:
                return "T_END_MESSAGE";
            case 3:
                return "T_RAW_ENTITY";
            case 4:
                return "T_START_HEADER";
            case 5:
                return "T_FIELD";
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return "T_END_HEADER";
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return "T_START_MULTIPART";
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return "T_END_MULTIPART";
            case 9:
                return "T_PREAMBLE";
            case 10:
                return "T_EPILOGUE";
            case 11:
                return "T_START_BODYPART";
            case 12:
                return "T_END_BODYPART";
            case 13:
                return "T_BODY";
            default:
                return "T_END_OF_STREAM";
        }
    }

    public static java.io.InputStream x(java.lang.CharSequence charSequence) {
        if (charSequence != null) {
            return new aptg(charSequence, aprm.a);
        }
        throw new java.lang.IllegalArgumentException("CharSequence may not be null");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aprk */
    public static byte[] y(java.io.Serializable serializable) throws aprk {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(512);
        j$.util.Objects.requireNonNull(byteArrayOutputStream, "outputStream");
        try {
            java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(serializable);
                objectOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (java.lang.Throwable th) {
                try {
                    objectOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException e) {
            throw new aprk(e);
        }
    }

    public static final int z(java.util.concurrent.atomic.AtomicInteger atomicInteger, int i) {
        int i2;
        int i3;
        do {
            i2 = atomicInteger.get();
            if ((i2 & i) != 0) {
                return 0;
            }
            i3 = i2 | i;
        } while (!atomicInteger.compareAndSet(i2, i3));
        return i3;
    }
}
