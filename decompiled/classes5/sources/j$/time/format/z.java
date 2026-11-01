package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class z {
    public static final j$.util.concurrent.ConcurrentHashMap a = new j$.util.concurrent.ConcurrentHashMap(16, 0.75f, 2);
    public static final j$.time.format.x b = new j$.time.format.x();
    public static final j$.time.format.z c = new j$.time.format.z();

    public static java.lang.Object a(j$.time.temporal.l lVar, java.util.Locale locale) {
        java.lang.Object yVar;
        java.util.AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new java.util.AbstractMap.SimpleImmutableEntry(lVar, locale);
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = a;
        V v = concurrentHashMap.get(simpleImmutableEntry);
        if (v != 0) {
            return v;
        }
        java.util.HashMap map = new java.util.HashMap();
        if (lVar == j$.time.temporal.a.ERA) {
            java.text.DateFormatSymbols dateFormatSymbols = java.text.DateFormatSymbols.getInstance(locale);
            java.util.HashMap map2 = new java.util.HashMap();
            java.util.HashMap map3 = new java.util.HashMap();
            java.lang.String[] eras = dateFormatSymbols.getEras();
            for (int i = 0; i < eras.length; i++) {
                if (!eras[i].isEmpty()) {
                    long j = i;
                    map2.put(java.lang.Long.valueOf(j), eras[i]);
                    java.lang.Long lValueOf = java.lang.Long.valueOf(j);
                    java.lang.String str = eras[i];
                    map3.put(lValueOf, str.substring(0, java.lang.Character.charCount(str.codePointAt(0))));
                }
            }
            if (!map2.isEmpty()) {
                map.put(j$.time.format.TextStyle.FULL, map2);
                map.put(j$.time.format.TextStyle.SHORT, map2);
                map.put(j$.time.format.TextStyle.NARROW, map3);
            }
            yVar = new j$.time.format.y(map);
        } else {
            long j2 = 1;
            if (lVar == j$.time.temporal.a.MONTH_OF_YEAR) {
                int length = java.text.DateFormatSymbols.getInstance(locale).getMonths().length;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                for (long j3 = 1; j3 <= length; j3++) {
                    java.lang.String strW = j$.com.android.tools.r8.a.w(j3, "LLLL", locale);
                    linkedHashMap.put(java.lang.Long.valueOf(j3), strW);
                    linkedHashMap2.put(java.lang.Long.valueOf(j3), strW.substring(0, java.lang.Character.charCount(strW.codePointAt(0))));
                    linkedHashMap3.put(java.lang.Long.valueOf(j3), j$.com.android.tools.r8.a.w(j3, "LLL", locale));
                }
                if (length > 0) {
                    map.put(j$.time.format.TextStyle.FULL_STANDALONE, linkedHashMap);
                    map.put(j$.time.format.TextStyle.NARROW_STANDALONE, linkedHashMap2);
                    map.put(j$.time.format.TextStyle.SHORT_STANDALONE, linkedHashMap3);
                    map.put(j$.time.format.TextStyle.FULL, linkedHashMap);
                    map.put(j$.time.format.TextStyle.NARROW, linkedHashMap2);
                    map.put(j$.time.format.TextStyle.SHORT, linkedHashMap3);
                }
                yVar = new j$.time.format.y(map);
            } else if (lVar == j$.time.temporal.a.DAY_OF_WEEK) {
                int length2 = java.text.DateFormatSymbols.getInstance(locale).getWeekdays().length;
                java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
                java.util.LinkedHashMap linkedHashMap5 = new java.util.LinkedHashMap();
                java.util.LinkedHashMap linkedHashMap6 = new java.util.LinkedHashMap();
                boolean z = locale == java.util.Locale.SIMPLIFIED_CHINESE || locale == java.util.Locale.TRADITIONAL_CHINESE;
                long j4 = 1;
                while (j4 <= length2) {
                    java.lang.String strV = j$.com.android.tools.r8.a.v(j4, "cccc", locale);
                    linkedHashMap4.put(java.lang.Long.valueOf(j4), strV);
                    long j5 = j2;
                    linkedHashMap5.put(java.lang.Long.valueOf(j4), z ? new java.lang.StringBuilder().appendCodePoint(strV.codePointBefore(strV.length())).toString() : strV.substring(0, java.lang.Character.charCount(strV.codePointAt(0))));
                    linkedHashMap6.put(java.lang.Long.valueOf(j4), j$.com.android.tools.r8.a.v(j4, "ccc", locale));
                    j4 += j5;
                    j2 = j5;
                }
                if (length2 > 0) {
                    map.put(j$.time.format.TextStyle.FULL_STANDALONE, linkedHashMap4);
                    map.put(j$.time.format.TextStyle.NARROW_STANDALONE, linkedHashMap5);
                    map.put(j$.time.format.TextStyle.SHORT_STANDALONE, linkedHashMap6);
                    map.put(j$.time.format.TextStyle.FULL, linkedHashMap4);
                    map.put(j$.time.format.TextStyle.NARROW, linkedHashMap5);
                    map.put(j$.time.format.TextStyle.SHORT, linkedHashMap6);
                }
                yVar = new j$.time.format.y(map);
            } else if (lVar == j$.time.temporal.a.AMPM_OF_DAY) {
                java.text.DateFormatSymbols dateFormatSymbols2 = java.text.DateFormatSymbols.getInstance(locale);
                java.util.HashMap map4 = new java.util.HashMap();
                java.util.HashMap map5 = new java.util.HashMap();
                java.lang.String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
                for (int i2 = 0; i2 < amPmStrings.length; i2++) {
                    if (!amPmStrings[i2].isEmpty()) {
                        long j6 = i2;
                        map4.put(java.lang.Long.valueOf(j6), amPmStrings[i2]);
                        java.lang.Long lValueOf2 = java.lang.Long.valueOf(j6);
                        java.lang.String str2 = amPmStrings[i2];
                        map5.put(lValueOf2, str2.substring(0, java.lang.Character.charCount(str2.codePointAt(0))));
                    }
                }
                if (!map4.isEmpty()) {
                    map.put(j$.time.format.TextStyle.FULL, map4);
                    map.put(j$.time.format.TextStyle.SHORT, map4);
                    map.put(j$.time.format.TextStyle.NARROW, map5);
                }
                yVar = new j$.time.format.y(map);
            } else {
                yVar = "";
            }
        }
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, yVar);
        return concurrentHashMap.get(simpleImmutableEntry);
    }

    public java.lang.String b(j$.time.chrono.a aVar, j$.time.temporal.l lVar, long j, j$.time.format.TextStyle textStyle, java.util.Locale locale) {
        if (aVar == j$.time.chrono.q.c || !(lVar instanceof j$.time.temporal.a)) {
            return c(lVar, j, textStyle, locale);
        }
        return null;
    }

    public java.lang.String c(j$.time.temporal.l lVar, long j, j$.time.format.TextStyle textStyle, java.util.Locale locale) {
        java.lang.Object objA = a(lVar, locale);
        if (objA instanceof j$.time.format.y) {
            return ((j$.time.format.y) objA).a(j, textStyle);
        }
        return null;
    }

    public java.util.Iterator d(j$.time.chrono.a aVar, j$.time.temporal.l lVar, j$.time.format.TextStyle textStyle, java.util.Locale locale) {
        if (aVar == j$.time.chrono.q.c || !(lVar instanceof j$.time.temporal.a)) {
            return e(lVar, textStyle, locale);
        }
        return null;
    }

    public java.util.Iterator e(j$.time.temporal.l lVar, j$.time.format.TextStyle textStyle, java.util.Locale locale) {
        java.util.List list;
        java.lang.Object objA = a(lVar, locale);
        if (!(objA instanceof j$.time.format.y) || (list = (java.util.List) ((j$.time.format.y) objA).b.get(textStyle)) == null) {
            return null;
        }
        return list.iterator();
    }
}
