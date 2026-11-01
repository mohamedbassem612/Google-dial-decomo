package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dwk {
    public static final /* synthetic */ int a = 0;
    private static final java.lang.ThreadLocal b = new java.lang.ThreadLocal();
    private static final java.util.WeakHashMap c = new java.util.WeakHashMap(0);
    private static final java.lang.Object d = new java.lang.Object();

    /* JADX WARN: Code duplicated, block: B:21:0x004a A[Catch: all -> 0x00bb, TryCatch #2 {, blocks: (B:4:0x0008, B:6:0x0013, B:8:0x0019, B:10:0x0021, B:12:0x002f, B:14:0x0039, B:16:0x003d, B:21:0x004a, B:22:0x004c, B:19:0x0042, B:24:0x004e, B:25:0x0051), top: B:63:0x0008 }] */
    public static android.content.res.ColorStateList a(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) {
        android.content.res.ColorStateList colorStateListA;
        android.content.res.ColorStateList colorStateList;
        defpackage.dwh dwhVar;
        defpackage.dwi dwiVar = new defpackage.dwi(resources, theme);
        synchronized (d) {
            android.util.SparseArray sparseArray = (android.util.SparseArray) c.get(dwiVar);
            colorStateListA = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (dwhVar = (defpackage.dwh) sparseArray.get(i)) == null) {
                colorStateList = null;
            } else {
                android.content.res.Configuration configuration = dwhVar.b;
                android.content.res.Resources resources2 = dwiVar.a;
                if (configuration.equals(resources2.getConfiguration()) && dwhVar.d == resources2.getConfiguration().uiMode) {
                    android.content.res.Resources.Theme theme2 = dwiVar.b;
                    if (theme2 == null) {
                        if (dwhVar.c == 0) {
                            colorStateList = dwhVar.a;
                        }
                    } else if (dwhVar.c == theme2.hashCode()) {
                        colorStateList = dwhVar.a;
                    }
                }
                sparseArray.remove(i);
                colorStateList = null;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        java.lang.ThreadLocal threadLocal = b;
        android.util.TypedValue typedValue = (android.util.TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new android.util.TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        if (typedValue.type < 28 || typedValue.type > 31) {
            try {
                colorStateListA = defpackage.dwe.a(resources, resources.getXml(i), theme);
            } catch (java.lang.Exception e) {
                android.util.Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (d) {
            java.util.WeakHashMap weakHashMap = c;
            android.util.SparseArray sparseArray2 = (android.util.SparseArray) weakHashMap.get(dwiVar);
            if (sparseArray2 == null) {
                sparseArray2 = new android.util.SparseArray();
                weakHashMap.put(dwiVar, sparseArray2);
            }
            sparseArray2.append(i, new defpackage.dwh(colorStateListA, dwiVar.a.getConfiguration(), theme));
        }
        return colorStateListA;
    }

    public static android.graphics.Typeface b(android.content.Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return d(context, i, new android.util.TypedValue(), 0, null, false, false);
    }

    public static void c(android.content.Context context, int i, defpackage.dwj dwjVar) {
        if (context.isRestricted()) {
            dwjVar.c(-4);
        } else {
            d(context, i, new android.util.TypedValue(), 0, dwjVar, false, false);
        }
    }

    public static android.graphics.Typeface d(android.content.Context context, int i, android.util.TypedValue typedValue, int i2, defpackage.dwj dwjVar, boolean z, boolean z2) {
        android.content.res.Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        android.graphics.Typeface typefaceE = e(context, resources, typedValue, i, i2, dwjVar, z, z2);
        if (typefaceE != null || dwjVar != null || z2) {
            return typefaceE;
        }
        throw new android.content.res.Resources.NotFoundException("Font resource ID #0x" + java.lang.Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0201 A[Catch: IOException -> 0x0366, XmlPullParserException -> 0x0375, TryCatch #2 {IOException -> 0x0366, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:22:0x005b, B:23:0x0062, B:24:0x0063, B:26:0x0071, B:29:0x00a9, B:30:0x00b2, B:32:0x00b8, B:34:0x00be, B:36:0x00ca, B:44:0x00f4, B:49:0x0104, B:50:0x0107, B:51:0x0108, B:53:0x010e, B:55:0x0115, B:106:0x0201, B:108:0x0208, B:109:0x020e, B:111:0x0214, B:113:0x021f, B:152:0x02ee, B:153:0x02f1, B:155:0x02fe, B:162:0x030a, B:164:0x030e, B:171:0x033b, B:115:0x0225, B:117:0x022e, B:118:0x023d, B:121:0x0245, B:123:0x024b, B:125:0x0259, B:127:0x025e, B:129:0x0264, B:131:0x0271, B:133:0x0279, B:134:0x027f, B:137:0x028d, B:138:0x02a7, B:146:0x02d8, B:148:0x02e1, B:147:0x02de, B:144:0x02cd, B:142:0x02c6, B:149:0x02e6, B:165:0x0325, B:168:0x0331, B:169:0x0335, B:57:0x011e, B:59:0x012e, B:60:0x013c, B:61:0x0143, B:62:0x014a, B:63:0x014b, B:64:0x0150, B:66:0x0156, B:68:0x015c, B:70:0x0168, B:73:0x017c, B:77:0x018c, B:81:0x0198, B:84:0x01a1, B:88:0x01aa, B:92:0x01bd, B:93:0x01c7, B:95:0x01cd, B:96:0x01d1, B:97:0x01dc, B:100:0x01e6, B:102:0x01ec, B:103:0x01fb, B:172:0x0345, B:174:0x034f, B:177:0x035c, B:178:0x0360), top: B:194:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0208 A[Catch: IOException -> 0x0366, XmlPullParserException -> 0x0375, TryCatch #2 {IOException -> 0x0366, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:22:0x005b, B:23:0x0062, B:24:0x0063, B:26:0x0071, B:29:0x00a9, B:30:0x00b2, B:32:0x00b8, B:34:0x00be, B:36:0x00ca, B:44:0x00f4, B:49:0x0104, B:50:0x0107, B:51:0x0108, B:53:0x010e, B:55:0x0115, B:106:0x0201, B:108:0x0208, B:109:0x020e, B:111:0x0214, B:113:0x021f, B:152:0x02ee, B:153:0x02f1, B:155:0x02fe, B:162:0x030a, B:164:0x030e, B:171:0x033b, B:115:0x0225, B:117:0x022e, B:118:0x023d, B:121:0x0245, B:123:0x024b, B:125:0x0259, B:127:0x025e, B:129:0x0264, B:131:0x0271, B:133:0x0279, B:134:0x027f, B:137:0x028d, B:138:0x02a7, B:146:0x02d8, B:148:0x02e1, B:147:0x02de, B:144:0x02cd, B:142:0x02c6, B:149:0x02e6, B:165:0x0325, B:168:0x0331, B:169:0x0335, B:57:0x011e, B:59:0x012e, B:60:0x013c, B:61:0x0143, B:62:0x014a, B:63:0x014b, B:64:0x0150, B:66:0x0156, B:68:0x015c, B:70:0x0168, B:73:0x017c, B:77:0x018c, B:81:0x0198, B:84:0x01a1, B:88:0x01aa, B:92:0x01bd, B:93:0x01c7, B:95:0x01cd, B:96:0x01d1, B:97:0x01dc, B:100:0x01e6, B:102:0x01ec, B:103:0x01fb, B:172:0x0345, B:174:0x034f, B:177:0x035c, B:178:0x0360), top: B:194:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x020e A[Catch: IOException -> 0x0366, XmlPullParserException -> 0x0375, TryCatch #2 {IOException -> 0x0366, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:22:0x005b, B:23:0x0062, B:24:0x0063, B:26:0x0071, B:29:0x00a9, B:30:0x00b2, B:32:0x00b8, B:34:0x00be, B:36:0x00ca, B:44:0x00f4, B:49:0x0104, B:50:0x0107, B:51:0x0108, B:53:0x010e, B:55:0x0115, B:106:0x0201, B:108:0x0208, B:109:0x020e, B:111:0x0214, B:113:0x021f, B:152:0x02ee, B:153:0x02f1, B:155:0x02fe, B:162:0x030a, B:164:0x030e, B:171:0x033b, B:115:0x0225, B:117:0x022e, B:118:0x023d, B:121:0x0245, B:123:0x024b, B:125:0x0259, B:127:0x025e, B:129:0x0264, B:131:0x0271, B:133:0x0279, B:134:0x027f, B:137:0x028d, B:138:0x02a7, B:146:0x02d8, B:148:0x02e1, B:147:0x02de, B:144:0x02cd, B:142:0x02c6, B:149:0x02e6, B:165:0x0325, B:168:0x0331, B:169:0x0335, B:57:0x011e, B:59:0x012e, B:60:0x013c, B:61:0x0143, B:62:0x014a, B:63:0x014b, B:64:0x0150, B:66:0x0156, B:68:0x015c, B:70:0x0168, B:73:0x017c, B:77:0x018c, B:81:0x0198, B:84:0x01a1, B:88:0x01aa, B:92:0x01bd, B:93:0x01c7, B:95:0x01cd, B:96:0x01d1, B:97:0x01dc, B:100:0x01e6, B:102:0x01ec, B:103:0x01fb, B:172:0x0345, B:174:0x034f, B:177:0x035c, B:178:0x0360), top: B:194:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0214 A[Catch: IOException -> 0x0366, XmlPullParserException -> 0x0375, TryCatch #2 {IOException -> 0x0366, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:22:0x005b, B:23:0x0062, B:24:0x0063, B:26:0x0071, B:29:0x00a9, B:30:0x00b2, B:32:0x00b8, B:34:0x00be, B:36:0x00ca, B:44:0x00f4, B:49:0x0104, B:50:0x0107, B:51:0x0108, B:53:0x010e, B:55:0x0115, B:106:0x0201, B:108:0x0208, B:109:0x020e, B:111:0x0214, B:113:0x021f, B:152:0x02ee, B:153:0x02f1, B:155:0x02fe, B:162:0x030a, B:164:0x030e, B:171:0x033b, B:115:0x0225, B:117:0x022e, B:118:0x023d, B:121:0x0245, B:123:0x024b, B:125:0x0259, B:127:0x025e, B:129:0x0264, B:131:0x0271, B:133:0x0279, B:134:0x027f, B:137:0x028d, B:138:0x02a7, B:146:0x02d8, B:148:0x02e1, B:147:0x02de, B:144:0x02cd, B:142:0x02c6, B:149:0x02e6, B:165:0x0325, B:168:0x0331, B:169:0x0335, B:57:0x011e, B:59:0x012e, B:60:0x013c, B:61:0x0143, B:62:0x014a, B:63:0x014b, B:64:0x0150, B:66:0x0156, B:68:0x015c, B:70:0x0168, B:73:0x017c, B:77:0x018c, B:81:0x0198, B:84:0x01a1, B:88:0x01aa, B:92:0x01bd, B:93:0x01c7, B:95:0x01cd, B:96:0x01d1, B:97:0x01dc, B:100:0x01e6, B:102:0x01ec, B:103:0x01fb, B:172:0x0345, B:174:0x034f, B:177:0x035c, B:178:0x0360), top: B:194:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0225 A[Catch: IOException -> 0x0366, XmlPullParserException -> 0x0375, TryCatch #2 {IOException -> 0x0366, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:22:0x005b, B:23:0x0062, B:24:0x0063, B:26:0x0071, B:29:0x00a9, B:30:0x00b2, B:32:0x00b8, B:34:0x00be, B:36:0x00ca, B:44:0x00f4, B:49:0x0104, B:50:0x0107, B:51:0x0108, B:53:0x010e, B:55:0x0115, B:106:0x0201, B:108:0x0208, B:109:0x020e, B:111:0x0214, B:113:0x021f, B:152:0x02ee, B:153:0x02f1, B:155:0x02fe, B:162:0x030a, B:164:0x030e, B:171:0x033b, B:115:0x0225, B:117:0x022e, B:118:0x023d, B:121:0x0245, B:123:0x024b, B:125:0x0259, B:127:0x025e, B:129:0x0264, B:131:0x0271, B:133:0x0279, B:134:0x027f, B:137:0x028d, B:138:0x02a7, B:146:0x02d8, B:148:0x02e1, B:147:0x02de, B:144:0x02cd, B:142:0x02c6, B:149:0x02e6, B:165:0x0325, B:168:0x0331, B:169:0x0335, B:57:0x011e, B:59:0x012e, B:60:0x013c, B:61:0x0143, B:62:0x014a, B:63:0x014b, B:64:0x0150, B:66:0x0156, B:68:0x015c, B:70:0x0168, B:73:0x017c, B:77:0x018c, B:81:0x0198, B:84:0x01a1, B:88:0x01aa, B:92:0x01bd, B:93:0x01c7, B:95:0x01cd, B:96:0x01d1, B:97:0x01dc, B:100:0x01e6, B:102:0x01ec, B:103:0x01fb, B:172:0x0345, B:174:0x034f, B:177:0x035c, B:178:0x0360), top: B:194:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x022e A[Catch: IOException -> 0x0366, XmlPullParserException -> 0x0375, TryCatch #2 {IOException -> 0x0366, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:22:0x005b, B:23:0x0062, B:24:0x0063, B:26:0x0071, B:29:0x00a9, B:30:0x00b2, B:32:0x00b8, B:34:0x00be, B:36:0x00ca, B:44:0x00f4, B:49:0x0104, B:50:0x0107, B:51:0x0108, B:53:0x010e, B:55:0x0115, B:106:0x0201, B:108:0x0208, B:109:0x020e, B:111:0x0214, B:113:0x021f, B:152:0x02ee, B:153:0x02f1, B:155:0x02fe, B:162:0x030a, B:164:0x030e, B:171:0x033b, B:115:0x0225, B:117:0x022e, B:118:0x023d, B:121:0x0245, B:123:0x024b, B:125:0x0259, B:127:0x025e, B:129:0x0264, B:131:0x0271, B:133:0x0279, B:134:0x027f, B:137:0x028d, B:138:0x02a7, B:146:0x02d8, B:148:0x02e1, B:147:0x02de, B:144:0x02cd, B:142:0x02c6, B:149:0x02e6, B:165:0x0325, B:168:0x0331, B:169:0x0335, B:57:0x011e, B:59:0x012e, B:60:0x013c, B:61:0x0143, B:62:0x014a, B:63:0x014b, B:64:0x0150, B:66:0x0156, B:68:0x015c, B:70:0x0168, B:73:0x017c, B:77:0x018c, B:81:0x0198, B:84:0x01a1, B:88:0x01aa, B:92:0x01bd, B:93:0x01c7, B:95:0x01cd, B:96:0x01d1, B:97:0x01dc, B:100:0x01e6, B:102:0x01ec, B:103:0x01fb, B:172:0x0345, B:174:0x034f, B:177:0x035c, B:178:0x0360), top: B:194:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x023d A[Catch: IOException -> 0x0366, XmlPullParserException -> 0x0375, TryCatch #2 {IOException -> 0x0366, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:22:0x005b, B:23:0x0062, B:24:0x0063, B:26:0x0071, B:29:0x00a9, B:30:0x00b2, B:32:0x00b8, B:34:0x00be, B:36:0x00ca, B:44:0x00f4, B:49:0x0104, B:50:0x0107, B:51:0x0108, B:53:0x010e, B:55:0x0115, B:106:0x0201, B:108:0x0208, B:109:0x020e, B:111:0x0214, B:113:0x021f, B:152:0x02ee, B:153:0x02f1, B:155:0x02fe, B:162:0x030a, B:164:0x030e, B:171:0x033b, B:115:0x0225, B:117:0x022e, B:118:0x023d, B:121:0x0245, B:123:0x024b, B:125:0x0259, B:127:0x025e, B:129:0x0264, B:131:0x0271, B:133:0x0279, B:134:0x027f, B:137:0x028d, B:138:0x02a7, B:146:0x02d8, B:148:0x02e1, B:147:0x02de, B:144:0x02cd, B:142:0x02c6, B:149:0x02e6, B:165:0x0325, B:168:0x0331, B:169:0x0335, B:57:0x011e, B:59:0x012e, B:60:0x013c, B:61:0x0143, B:62:0x014a, B:63:0x014b, B:64:0x0150, B:66:0x0156, B:68:0x015c, B:70:0x0168, B:73:0x017c, B:77:0x018c, B:81:0x0198, B:84:0x01a1, B:88:0x01aa, B:92:0x01bd, B:93:0x01c7, B:95:0x01cd, B:96:0x01d1, B:97:0x01dc, B:100:0x01e6, B:102:0x01ec, B:103:0x01fb, B:172:0x0345, B:174:0x034f, B:177:0x035c, B:178:0x0360), top: B:194:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0244  */
    /* JADX WARN: Code duplicated, block: B:123:0x024b A[Catch: IOException -> 0x0366, XmlPullParserException -> 0x0375, TryCatch #2 {IOException -> 0x0366, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:22:0x005b, B:23:0x0062, B:24:0x0063, B:26:0x0071, B:29:0x00a9, B:30:0x00b2, B:32:0x00b8, B:34:0x00be, B:36:0x00ca, B:44:0x00f4, B:49:0x0104, B:50:0x0107, B:51:0x0108, B:53:0x010e, B:55:0x0115, B:106:0x0201, B:108:0x0208, B:109:0x020e, B:111:0x0214, B:113:0x021f, B:152:0x02ee, B:153:0x02f1, B:155:0x02fe, B:162:0x030a, B:164:0x030e, B:171:0x033b, B:115:0x0225, B:117:0x022e, B:118:0x023d, B:121:0x0245, B:123:0x024b, B:125:0x0259, B:127:0x025e, B:129:0x0264, B:131:0x0271, B:133:0x0279, B:134:0x027f, B:137:0x028d, B:138:0x02a7, B:146:0x02d8, B:148:0x02e1, B:147:0x02de, B:144:0x02cd, B:142:0x02c6, B:149:0x02e6, B:165:0x0325, B:168:0x0331, B:169:0x0335, B:57:0x011e, B:59:0x012e, B:60:0x013c, B:61:0x0143, B:62:0x014a, B:63:0x014b, B:64:0x0150, B:66:0x0156, B:68:0x015c, B:70:0x0168, B:73:0x017c, B:77:0x018c, B:81:0x0198, B:84:0x01a1, B:88:0x01aa, B:92:0x01bd, B:93:0x01c7, B:95:0x01cd, B:96:0x01d1, B:97:0x01dc, B:100:0x01e6, B:102:0x01ec, B:103:0x01fb, B:172:0x0345, B:174:0x034f, B:177:0x035c, B:178:0x0360), top: B:194:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0259 A[Catch: IOException -> 0x0366, XmlPullParserException -> 0x0375, LOOP:3: B:121:0x0245->B:125:0x0259, LOOP_END, TryCatch #2 {IOException -> 0x0366, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:22:0x005b, B:23:0x0062, B:24:0x0063, B:26:0x0071, B:29:0x00a9, B:30:0x00b2, B:32:0x00b8, B:34:0x00be, B:36:0x00ca, B:44:0x00f4, B:49:0x0104, B:50:0x0107, B:51:0x0108, B:53:0x010e, B:55:0x0115, B:106:0x0201, B:108:0x0208, B:109:0x020e, B:111:0x0214, B:113:0x021f, B:152:0x02ee, B:153:0x02f1, B:155:0x02fe, B:162:0x030a, B:164:0x030e, B:171:0x033b, B:115:0x0225, B:117:0x022e, B:118:0x023d, B:121:0x0245, B:123:0x024b, B:125:0x0259, B:127:0x025e, B:129:0x0264, B:131:0x0271, B:133:0x0279, B:134:0x027f, B:137:0x028d, B:138:0x02a7, B:146:0x02d8, B:148:0x02e1, B:147:0x02de, B:144:0x02cd, B:142:0x02c6, B:149:0x02e6, B:165:0x0325, B:168:0x0331, B:169:0x0335, B:57:0x011e, B:59:0x012e, B:60:0x013c, B:61:0x0143, B:62:0x014a, B:63:0x014b, B:64:0x0150, B:66:0x0156, B:68:0x015c, B:70:0x0168, B:73:0x017c, B:77:0x018c, B:81:0x0198, B:84:0x01a1, B:88:0x01aa, B:92:0x01bd, B:93:0x01c7, B:95:0x01cd, B:96:0x01d1, B:97:0x01dc, B:100:0x01e6, B:102:0x01ec, B:103:0x01fb, B:172:0x0345, B:174:0x034f, B:177:0x035c, B:178:0x0360), top: B:194:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0264 A[Catch: IOException -> 0x0366, XmlPullParserException -> 0x0375, TryCatch #2 {IOException -> 0x0366, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:22:0x005b, B:23:0x0062, B:24:0x0063, B:26:0x0071, B:29:0x00a9, B:30:0x00b2, B:32:0x00b8, B:34:0x00be, B:36:0x00ca, B:44:0x00f4, B:49:0x0104, B:50:0x0107, B:51:0x0108, B:53:0x010e, B:55:0x0115, B:106:0x0201, B:108:0x0208, B:109:0x020e, B:111:0x0214, B:113:0x021f, B:152:0x02ee, B:153:0x02f1, B:155:0x02fe, B:162:0x030a, B:164:0x030e, B:171:0x033b, B:115:0x0225, B:117:0x022e, B:118:0x023d, B:121:0x0245, B:123:0x024b, B:125:0x0259, B:127:0x025e, B:129:0x0264, B:131:0x0271, B:133:0x0279, B:134:0x027f, B:137:0x028d, B:138:0x02a7, B:146:0x02d8, B:148:0x02e1, B:147:0x02de, B:144:0x02cd, B:142:0x02c6, B:149:0x02e6, B:165:0x0325, B:168:0x0331, B:169:0x0335, B:57:0x011e, B:59:0x012e, B:60:0x013c, B:61:0x0143, B:62:0x014a, B:63:0x014b, B:64:0x0150, B:66:0x0156, B:68:0x015c, B:70:0x0168, B:73:0x017c, B:77:0x018c, B:81:0x0198, B:84:0x01a1, B:88:0x01aa, B:92:0x01bd, B:93:0x01c7, B:95:0x01cd, B:96:0x01d1, B:97:0x01dc, B:100:0x01e6, B:102:0x01ec, B:103:0x01fb, B:172:0x0345, B:174:0x034f, B:177:0x035c, B:178:0x0360), top: B:194:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0271 A[Catch: IOException -> 0x0366, XmlPullParserException -> 0x0375, TryCatch #2 {IOException -> 0x0366, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:22:0x005b, B:23:0x0062, B:24:0x0063, B:26:0x0071, B:29:0x00a9, B:30:0x00b2, B:32:0x00b8, B:34:0x00be, B:36:0x00ca, B:44:0x00f4, B:49:0x0104, B:50:0x0107, B:51:0x0108, B:53:0x010e, B:55:0x0115, B:106:0x0201, B:108:0x0208, B:109:0x020e, B:111:0x0214, B:113:0x021f, B:152:0x02ee, B:153:0x02f1, B:155:0x02fe, B:162:0x030a, B:164:0x030e, B:171:0x033b, B:115:0x0225, B:117:0x022e, B:118:0x023d, B:121:0x0245, B:123:0x024b, B:125:0x0259, B:127:0x025e, B:129:0x0264, B:131:0x0271, B:133:0x0279, B:134:0x027f, B:137:0x028d, B:138:0x02a7, B:146:0x02d8, B:148:0x02e1, B:147:0x02de, B:144:0x02cd, B:142:0x02c6, B:149:0x02e6, B:165:0x0325, B:168:0x0331, B:169:0x0335, B:57:0x011e, B:59:0x012e, B:60:0x013c, B:61:0x0143, B:62:0x014a, B:63:0x014b, B:64:0x0150, B:66:0x0156, B:68:0x015c, B:70:0x0168, B:73:0x017c, B:77:0x018c, B:81:0x0198, B:84:0x01a1, B:88:0x01aa, B:92:0x01bd, B:93:0x01c7, B:95:0x01cd, B:96:0x01d1, B:97:0x01dc, B:100:0x01e6, B:102:0x01ec, B:103:0x01fb, B:172:0x0345, B:174:0x034f, B:177:0x035c, B:178:0x0360), top: B:194:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x02a7 A[Catch: IOException -> 0x0366, XmlPullParserException -> 0x0375, TRY_LEAVE, TryCatch #2 {IOException -> 0x0366, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:22:0x005b, B:23:0x0062, B:24:0x0063, B:26:0x0071, B:29:0x00a9, B:30:0x00b2, B:32:0x00b8, B:34:0x00be, B:36:0x00ca, B:44:0x00f4, B:49:0x0104, B:50:0x0107, B:51:0x0108, B:53:0x010e, B:55:0x0115, B:106:0x0201, B:108:0x0208, B:109:0x020e, B:111:0x0214, B:113:0x021f, B:152:0x02ee, B:153:0x02f1, B:155:0x02fe, B:162:0x030a, B:164:0x030e, B:171:0x033b, B:115:0x0225, B:117:0x022e, B:118:0x023d, B:121:0x0245, B:123:0x024b, B:125:0x0259, B:127:0x025e, B:129:0x0264, B:131:0x0271, B:133:0x0279, B:134:0x027f, B:137:0x028d, B:138:0x02a7, B:146:0x02d8, B:148:0x02e1, B:147:0x02de, B:144:0x02cd, B:142:0x02c6, B:149:0x02e6, B:165:0x0325, B:168:0x0331, B:169:0x0335, B:57:0x011e, B:59:0x012e, B:60:0x013c, B:61:0x0143, B:62:0x014a, B:63:0x014b, B:64:0x0150, B:66:0x0156, B:68:0x015c, B:70:0x0168, B:73:0x017c, B:77:0x018c, B:81:0x0198, B:84:0x01a1, B:88:0x01aa, B:92:0x01bd, B:93:0x01c7, B:95:0x01cd, B:96:0x01d1, B:97:0x01dc, B:100:0x01e6, B:102:0x01ec, B:103:0x01fb, B:172:0x0345, B:174:0x034f, B:177:0x035c, B:178:0x0360), top: B:194:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x02cb A[EDGE_INSN: B:143:0x02cb->B:150:0x02ea BREAK  A[LOOP:3: B:121:0x0245->B:125:0x0259]] */
    /* JADX WARN: Code duplicated, block: B:144:0x02cd A[Catch: IOException -> 0x0366, XmlPullParserException -> 0x0375, TryCatch #2 {IOException -> 0x0366, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:22:0x005b, B:23:0x0062, B:24:0x0063, B:26:0x0071, B:29:0x00a9, B:30:0x00b2, B:32:0x00b8, B:34:0x00be, B:36:0x00ca, B:44:0x00f4, B:49:0x0104, B:50:0x0107, B:51:0x0108, B:53:0x010e, B:55:0x0115, B:106:0x0201, B:108:0x0208, B:109:0x020e, B:111:0x0214, B:113:0x021f, B:152:0x02ee, B:153:0x02f1, B:155:0x02fe, B:162:0x030a, B:164:0x030e, B:171:0x033b, B:115:0x0225, B:117:0x022e, B:118:0x023d, B:121:0x0245, B:123:0x024b, B:125:0x0259, B:127:0x025e, B:129:0x0264, B:131:0x0271, B:133:0x0279, B:134:0x027f, B:137:0x028d, B:138:0x02a7, B:146:0x02d8, B:148:0x02e1, B:147:0x02de, B:144:0x02cd, B:142:0x02c6, B:149:0x02e6, B:165:0x0325, B:168:0x0331, B:169:0x0335, B:57:0x011e, B:59:0x012e, B:60:0x013c, B:61:0x0143, B:62:0x014a, B:63:0x014b, B:64:0x0150, B:66:0x0156, B:68:0x015c, B:70:0x0168, B:73:0x017c, B:77:0x018c, B:81:0x0198, B:84:0x01a1, B:88:0x01aa, B:92:0x01bd, B:93:0x01c7, B:95:0x01cd, B:96:0x01d1, B:97:0x01dc, B:100:0x01e6, B:102:0x01ec, B:103:0x01fb, B:172:0x0345, B:174:0x034f, B:177:0x035c, B:178:0x0360), top: B:194:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x02d8 A[Catch: IOException -> 0x0366, XmlPullParserException -> 0x0375, TryCatch #2 {IOException -> 0x0366, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:22:0x005b, B:23:0x0062, B:24:0x0063, B:26:0x0071, B:29:0x00a9, B:30:0x00b2, B:32:0x00b8, B:34:0x00be, B:36:0x00ca, B:44:0x00f4, B:49:0x0104, B:50:0x0107, B:51:0x0108, B:53:0x010e, B:55:0x0115, B:106:0x0201, B:108:0x0208, B:109:0x020e, B:111:0x0214, B:113:0x021f, B:152:0x02ee, B:153:0x02f1, B:155:0x02fe, B:162:0x030a, B:164:0x030e, B:171:0x033b, B:115:0x0225, B:117:0x022e, B:118:0x023d, B:121:0x0245, B:123:0x024b, B:125:0x0259, B:127:0x025e, B:129:0x0264, B:131:0x0271, B:133:0x0279, B:134:0x027f, B:137:0x028d, B:138:0x02a7, B:146:0x02d8, B:148:0x02e1, B:147:0x02de, B:144:0x02cd, B:142:0x02c6, B:149:0x02e6, B:165:0x0325, B:168:0x0331, B:169:0x0335, B:57:0x011e, B:59:0x012e, B:60:0x013c, B:61:0x0143, B:62:0x014a, B:63:0x014b, B:64:0x0150, B:66:0x0156, B:68:0x015c, B:70:0x0168, B:73:0x017c, B:77:0x018c, B:81:0x0198, B:84:0x01a1, B:88:0x01aa, B:92:0x01bd, B:93:0x01c7, B:95:0x01cd, B:96:0x01d1, B:97:0x01dc, B:100:0x01e6, B:102:0x01ec, B:103:0x01fb, B:172:0x0345, B:174:0x034f, B:177:0x035c, B:178:0x0360), top: B:194:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x02de A[Catch: IOException -> 0x0366, XmlPullParserException -> 0x0375, TryCatch #2 {IOException -> 0x0366, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:22:0x005b, B:23:0x0062, B:24:0x0063, B:26:0x0071, B:29:0x00a9, B:30:0x00b2, B:32:0x00b8, B:34:0x00be, B:36:0x00ca, B:44:0x00f4, B:49:0x0104, B:50:0x0107, B:51:0x0108, B:53:0x010e, B:55:0x0115, B:106:0x0201, B:108:0x0208, B:109:0x020e, B:111:0x0214, B:113:0x021f, B:152:0x02ee, B:153:0x02f1, B:155:0x02fe, B:162:0x030a, B:164:0x030e, B:171:0x033b, B:115:0x0225, B:117:0x022e, B:118:0x023d, B:121:0x0245, B:123:0x024b, B:125:0x0259, B:127:0x025e, B:129:0x0264, B:131:0x0271, B:133:0x0279, B:134:0x027f, B:137:0x028d, B:138:0x02a7, B:146:0x02d8, B:148:0x02e1, B:147:0x02de, B:144:0x02cd, B:142:0x02c6, B:149:0x02e6, B:165:0x0325, B:168:0x0331, B:169:0x0335, B:57:0x011e, B:59:0x012e, B:60:0x013c, B:61:0x0143, B:62:0x014a, B:63:0x014b, B:64:0x0150, B:66:0x0156, B:68:0x015c, B:70:0x0168, B:73:0x017c, B:77:0x018c, B:81:0x0198, B:84:0x01a1, B:88:0x01aa, B:92:0x01bd, B:93:0x01c7, B:95:0x01cd, B:96:0x01d1, B:97:0x01dc, B:100:0x01e6, B:102:0x01ec, B:103:0x01fb, B:172:0x0345, B:174:0x034f, B:177:0x035c, B:178:0x0360), top: B:194:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x02ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x02ee A[Catch: IOException -> 0x0366, XmlPullParserException -> 0x0375, TryCatch #2 {IOException -> 0x0366, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:22:0x005b, B:23:0x0062, B:24:0x0063, B:26:0x0071, B:29:0x00a9, B:30:0x00b2, B:32:0x00b8, B:34:0x00be, B:36:0x00ca, B:44:0x00f4, B:49:0x0104, B:50:0x0107, B:51:0x0108, B:53:0x010e, B:55:0x0115, B:106:0x0201, B:108:0x0208, B:109:0x020e, B:111:0x0214, B:113:0x021f, B:152:0x02ee, B:153:0x02f1, B:155:0x02fe, B:162:0x030a, B:164:0x030e, B:171:0x033b, B:115:0x0225, B:117:0x022e, B:118:0x023d, B:121:0x0245, B:123:0x024b, B:125:0x0259, B:127:0x025e, B:129:0x0264, B:131:0x0271, B:133:0x0279, B:134:0x027f, B:137:0x028d, B:138:0x02a7, B:146:0x02d8, B:148:0x02e1, B:147:0x02de, B:144:0x02cd, B:142:0x02c6, B:149:0x02e6, B:165:0x0325, B:168:0x0331, B:169:0x0335, B:57:0x011e, B:59:0x012e, B:60:0x013c, B:61:0x0143, B:62:0x014a, B:63:0x014b, B:64:0x0150, B:66:0x0156, B:68:0x015c, B:70:0x0168, B:73:0x017c, B:77:0x018c, B:81:0x0198, B:84:0x01a1, B:88:0x01aa, B:92:0x01bd, B:93:0x01c7, B:95:0x01cd, B:96:0x01d1, B:97:0x01dc, B:100:0x01e6, B:102:0x01ec, B:103:0x01fb, B:172:0x0345, B:174:0x034f, B:177:0x035c, B:178:0x0360), top: B:194:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x02fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x02fe A[Catch: IOException -> 0x0366, XmlPullParserException -> 0x0375, TryCatch #2 {IOException -> 0x0366, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:22:0x005b, B:23:0x0062, B:24:0x0063, B:26:0x0071, B:29:0x00a9, B:30:0x00b2, B:32:0x00b8, B:34:0x00be, B:36:0x00ca, B:44:0x00f4, B:49:0x0104, B:50:0x0107, B:51:0x0108, B:53:0x010e, B:55:0x0115, B:106:0x0201, B:108:0x0208, B:109:0x020e, B:111:0x0214, B:113:0x021f, B:152:0x02ee, B:153:0x02f1, B:155:0x02fe, B:162:0x030a, B:164:0x030e, B:171:0x033b, B:115:0x0225, B:117:0x022e, B:118:0x023d, B:121:0x0245, B:123:0x024b, B:125:0x0259, B:127:0x025e, B:129:0x0264, B:131:0x0271, B:133:0x0279, B:134:0x027f, B:137:0x028d, B:138:0x02a7, B:146:0x02d8, B:148:0x02e1, B:147:0x02de, B:144:0x02cd, B:142:0x02c6, B:149:0x02e6, B:165:0x0325, B:168:0x0331, B:169:0x0335, B:57:0x011e, B:59:0x012e, B:60:0x013c, B:61:0x0143, B:62:0x014a, B:63:0x014b, B:64:0x0150, B:66:0x0156, B:68:0x015c, B:70:0x0168, B:73:0x017c, B:77:0x018c, B:81:0x0198, B:84:0x01a1, B:88:0x01aa, B:92:0x01bd, B:93:0x01c7, B:95:0x01cd, B:96:0x01d1, B:97:0x01dc, B:100:0x01e6, B:102:0x01ec, B:103:0x01fb, B:172:0x0345, B:174:0x034f, B:177:0x035c, B:178:0x0360), top: B:194:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0302  */
    /* JADX WARN: Code duplicated, block: B:158:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x0305  */
    /* JADX WARN: Code duplicated, block: B:160:0x0307  */
    /* JADX WARN: Code duplicated, block: B:162:0x030a A[Catch: IOException -> 0x0366, XmlPullParserException -> 0x0375, TryCatch #2 {IOException -> 0x0366, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:22:0x005b, B:23:0x0062, B:24:0x0063, B:26:0x0071, B:29:0x00a9, B:30:0x00b2, B:32:0x00b8, B:34:0x00be, B:36:0x00ca, B:44:0x00f4, B:49:0x0104, B:50:0x0107, B:51:0x0108, B:53:0x010e, B:55:0x0115, B:106:0x0201, B:108:0x0208, B:109:0x020e, B:111:0x0214, B:113:0x021f, B:152:0x02ee, B:153:0x02f1, B:155:0x02fe, B:162:0x030a, B:164:0x030e, B:171:0x033b, B:115:0x0225, B:117:0x022e, B:118:0x023d, B:121:0x0245, B:123:0x024b, B:125:0x0259, B:127:0x025e, B:129:0x0264, B:131:0x0271, B:133:0x0279, B:134:0x027f, B:137:0x028d, B:138:0x02a7, B:146:0x02d8, B:148:0x02e1, B:147:0x02de, B:144:0x02cd, B:142:0x02c6, B:149:0x02e6, B:165:0x0325, B:168:0x0331, B:169:0x0335, B:57:0x011e, B:59:0x012e, B:60:0x013c, B:61:0x0143, B:62:0x014a, B:63:0x014b, B:64:0x0150, B:66:0x0156, B:68:0x015c, B:70:0x0168, B:73:0x017c, B:77:0x018c, B:81:0x0198, B:84:0x01a1, B:88:0x01aa, B:92:0x01bd, B:93:0x01c7, B:95:0x01cd, B:96:0x01d1, B:97:0x01dc, B:100:0x01e6, B:102:0x01ec, B:103:0x01fb, B:172:0x0345, B:174:0x034f, B:177:0x035c, B:178:0x0360), top: B:194:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x030d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0325 A[Catch: IOException -> 0x0366, XmlPullParserException -> 0x0375, TryCatch #2 {IOException -> 0x0366, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:22:0x005b, B:23:0x0062, B:24:0x0063, B:26:0x0071, B:29:0x00a9, B:30:0x00b2, B:32:0x00b8, B:34:0x00be, B:36:0x00ca, B:44:0x00f4, B:49:0x0104, B:50:0x0107, B:51:0x0108, B:53:0x010e, B:55:0x0115, B:106:0x0201, B:108:0x0208, B:109:0x020e, B:111:0x0214, B:113:0x021f, B:152:0x02ee, B:153:0x02f1, B:155:0x02fe, B:162:0x030a, B:164:0x030e, B:171:0x033b, B:115:0x0225, B:117:0x022e, B:118:0x023d, B:121:0x0245, B:123:0x024b, B:125:0x0259, B:127:0x025e, B:129:0x0264, B:131:0x0271, B:133:0x0279, B:134:0x027f, B:137:0x028d, B:138:0x02a7, B:146:0x02d8, B:148:0x02e1, B:147:0x02de, B:144:0x02cd, B:142:0x02c6, B:149:0x02e6, B:165:0x0325, B:168:0x0331, B:169:0x0335, B:57:0x011e, B:59:0x012e, B:60:0x013c, B:61:0x0143, B:62:0x014a, B:63:0x014b, B:64:0x0150, B:66:0x0156, B:68:0x015c, B:70:0x0168, B:73:0x017c, B:77:0x018c, B:81:0x0198, B:84:0x01a1, B:88:0x01aa, B:92:0x01bd, B:93:0x01c7, B:95:0x01cd, B:96:0x01d1, B:97:0x01dc, B:100:0x01e6, B:102:0x01ec, B:103:0x01fb, B:172:0x0345, B:174:0x034f, B:177:0x035c, B:178:0x0360), top: B:194:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x032f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x0331 A[Catch: IOException -> 0x0366, XmlPullParserException -> 0x0375, TryCatch #2 {IOException -> 0x0366, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:22:0x005b, B:23:0x0062, B:24:0x0063, B:26:0x0071, B:29:0x00a9, B:30:0x00b2, B:32:0x00b8, B:34:0x00be, B:36:0x00ca, B:44:0x00f4, B:49:0x0104, B:50:0x0107, B:51:0x0108, B:53:0x010e, B:55:0x0115, B:106:0x0201, B:108:0x0208, B:109:0x020e, B:111:0x0214, B:113:0x021f, B:152:0x02ee, B:153:0x02f1, B:155:0x02fe, B:162:0x030a, B:164:0x030e, B:171:0x033b, B:115:0x0225, B:117:0x022e, B:118:0x023d, B:121:0x0245, B:123:0x024b, B:125:0x0259, B:127:0x025e, B:129:0x0264, B:131:0x0271, B:133:0x0279, B:134:0x027f, B:137:0x028d, B:138:0x02a7, B:146:0x02d8, B:148:0x02e1, B:147:0x02de, B:144:0x02cd, B:142:0x02c6, B:149:0x02e6, B:165:0x0325, B:168:0x0331, B:169:0x0335, B:57:0x011e, B:59:0x012e, B:60:0x013c, B:61:0x0143, B:62:0x014a, B:63:0x014b, B:64:0x0150, B:66:0x0156, B:68:0x015c, B:70:0x0168, B:73:0x017c, B:77:0x018c, B:81:0x0198, B:84:0x01a1, B:88:0x01aa, B:92:0x01bd, B:93:0x01c7, B:95:0x01cd, B:96:0x01d1, B:97:0x01dc, B:100:0x01e6, B:102:0x01ec, B:103:0x01fb, B:172:0x0345, B:174:0x034f, B:177:0x035c, B:178:0x0360), top: B:194:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x0335 A[Catch: IOException -> 0x0366, XmlPullParserException -> 0x0375, TryCatch #2 {IOException -> 0x0366, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:22:0x005b, B:23:0x0062, B:24:0x0063, B:26:0x0071, B:29:0x00a9, B:30:0x00b2, B:32:0x00b8, B:34:0x00be, B:36:0x00ca, B:44:0x00f4, B:49:0x0104, B:50:0x0107, B:51:0x0108, B:53:0x010e, B:55:0x0115, B:106:0x0201, B:108:0x0208, B:109:0x020e, B:111:0x0214, B:113:0x021f, B:152:0x02ee, B:153:0x02f1, B:155:0x02fe, B:162:0x030a, B:164:0x030e, B:171:0x033b, B:115:0x0225, B:117:0x022e, B:118:0x023d, B:121:0x0245, B:123:0x024b, B:125:0x0259, B:127:0x025e, B:129:0x0264, B:131:0x0271, B:133:0x0279, B:134:0x027f, B:137:0x028d, B:138:0x02a7, B:146:0x02d8, B:148:0x02e1, B:147:0x02de, B:144:0x02cd, B:142:0x02c6, B:149:0x02e6, B:165:0x0325, B:168:0x0331, B:169:0x0335, B:57:0x011e, B:59:0x012e, B:60:0x013c, B:61:0x0143, B:62:0x014a, B:63:0x014b, B:64:0x0150, B:66:0x0156, B:68:0x015c, B:70:0x0168, B:73:0x017c, B:77:0x018c, B:81:0x0198, B:84:0x01a1, B:88:0x01aa, B:92:0x01bd, B:93:0x01c7, B:95:0x01cd, B:96:0x01d1, B:97:0x01dc, B:100:0x01e6, B:102:0x01ec, B:103:0x01fb, B:172:0x0345, B:174:0x034f, B:177:0x035c, B:178:0x0360), top: B:194:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x033b A[Catch: IOException -> 0x0366, XmlPullParserException -> 0x0375, TryCatch #2 {IOException -> 0x0366, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:22:0x005b, B:23:0x0062, B:24:0x0063, B:26:0x0071, B:29:0x00a9, B:30:0x00b2, B:32:0x00b8, B:34:0x00be, B:36:0x00ca, B:44:0x00f4, B:49:0x0104, B:50:0x0107, B:51:0x0108, B:53:0x010e, B:55:0x0115, B:106:0x0201, B:108:0x0208, B:109:0x020e, B:111:0x0214, B:113:0x021f, B:152:0x02ee, B:153:0x02f1, B:155:0x02fe, B:162:0x030a, B:164:0x030e, B:171:0x033b, B:115:0x0225, B:117:0x022e, B:118:0x023d, B:121:0x0245, B:123:0x024b, B:125:0x0259, B:127:0x025e, B:129:0x0264, B:131:0x0271, B:133:0x0279, B:134:0x027f, B:137:0x028d, B:138:0x02a7, B:146:0x02d8, B:148:0x02e1, B:147:0x02de, B:144:0x02cd, B:142:0x02c6, B:149:0x02e6, B:165:0x0325, B:168:0x0331, B:169:0x0335, B:57:0x011e, B:59:0x012e, B:60:0x013c, B:61:0x0143, B:62:0x014a, B:63:0x014b, B:64:0x0150, B:66:0x0156, B:68:0x015c, B:70:0x0168, B:73:0x017c, B:77:0x018c, B:81:0x0198, B:84:0x01a1, B:88:0x01aa, B:92:0x01bd, B:93:0x01c7, B:95:0x01cd, B:96:0x01d1, B:97:0x01dc, B:100:0x01e6, B:102:0x01ec, B:103:0x01fb, B:172:0x0345, B:174:0x034f, B:177:0x035c, B:178:0x0360), top: B:194:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0385  */
    /* JADX WARN: Code duplicated, block: B:192:0x02af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x02e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x028d A[SYNTHETIC] */
    private static android.graphics.Typeface e(android.content.Context context, android.content.res.Resources resources, android.util.TypedValue typedValue, int i, int i2, defpackage.dwj dwjVar, boolean z, boolean z2) {
        android.graphics.Typeface typefaceL;
        int next;
        defpackage.dwg niVar;
        int i3;
        defpackage.dwg dwgVar;
        java.lang.String str;
        int i4;
        java.util.List list;
        int i5;
        int i6;
        android.graphics.Typeface.CustomFallbackBuilder customFallbackBuilder;
        defpackage.dxj dxjVar;
        java.lang.String str2;
        android.graphics.fonts.Font fontB;
        java.lang.String str3;
        android.graphics.fonts.FontFamily fontFamilyM;
        boolean z3;
        int i7;
        if (typedValue.string == null) {
            throw new android.content.res.Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + java.lang.Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        java.lang.String string = typedValue.string.toString();
        if (!string.startsWith("res/")) {
            if (dwjVar == null) {
                return null;
            }
            dwjVar.c(-3);
            return null;
        }
        android.graphics.Typeface typeface = (android.graphics.Typeface) defpackage.dwq.a.a(defpackage.dwq.c(resources, i, string, typedValue.assetCookie, i2));
        if (typeface != null) {
            if (dwjVar != null) {
                dwjVar.d(typeface);
            }
            return typeface;
        }
        if (z2) {
            return null;
        }
        try {
            try {
                if (string.toLowerCase().endsWith(".xml")) {
                    android.content.res.XmlResourceParser xml = resources.getXml(i);
                    do {
                        next = xml.next();
                        int i8 = 2;
                        if (next == 2) {
                            xml.require(2, null, "font-family");
                            if (xml.getName().equals("font-family")) {
                                android.content.res.TypedArray typedArrayObtainAttributes = resources.obtainAttributes(android.util.Xml.asAttributeSet(xml), defpackage.dur.b);
                                java.lang.String string2 = typedArrayObtainAttributes.getString(0);
                                java.lang.String string3 = typedArrayObtainAttributes.getString(5);
                                java.lang.String string4 = typedArrayObtainAttributes.getString(6);
                                java.lang.String string5 = typedArrayObtainAttributes.getString(2);
                                int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
                                int integer = typedArrayObtainAttributes.getInteger(3, 1);
                                int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
                                int i9 = 7;
                                java.lang.String string6 = typedArrayObtainAttributes.getString(7);
                                typedArrayObtainAttributes.recycle();
                                if (string2 == null || string3 == null) {
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    while (xml.next() != 3) {
                                        if (xml.getEventType() == i8) {
                                            if (xml.getName().equals("font")) {
                                                android.content.res.TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(android.util.Xml.asAttributeSet(xml), defpackage.dur.c);
                                                int i10 = typedArrayObtainAttributes2.getInt(true != typedArrayObtainAttributes2.hasValue(8) ? 1 : 8, 400);
                                                boolean z4 = typedArrayObtainAttributes2.getInt(true != typedArrayObtainAttributes2.hasValue(6) ? i8 : 6, 0) == 1;
                                                int i11 = true != typedArrayObtainAttributes2.hasValue(9) ? 3 : 9;
                                                java.lang.String string7 = typedArrayObtainAttributes2.getString(true != typedArrayObtainAttributes2.hasValue(i9) ? 4 : i9);
                                                int i12 = typedArrayObtainAttributes2.getInt(i11, 0);
                                                int i13 = true != typedArrayObtainAttributes2.hasValue(5) ? 0 : 5;
                                                int resourceId2 = typedArrayObtainAttributes2.getResourceId(i13, 0);
                                                typedArrayObtainAttributes2.getString(i13);
                                                typedArrayObtainAttributes2.recycle();
                                                while (xml.next() != 3) {
                                                    defpackage.dff.h(xml);
                                                }
                                                arrayList.add(new dwf(i10, z4, string7, i12, resourceId2));
                                            } else {
                                                defpackage.dff.h(xml);
                                            }
                                            i8 = 2;
                                            i9 = 7;
                                        } else {
                                            i8 = 2;
                                        }
                                    }
                                    if (!arrayList.isEmpty()) {
                                        niVar = new ni((dwf[]) arrayList.toArray(new dwf[0]));
                                    }
                                } else {
                                    java.util.List listG = defpackage.dff.g(resources, resourceId);
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    while (xml.next() != 3) {
                                        if (xml.getEventType() == 2) {
                                            if (xml.getName().equals("fallback")) {
                                                android.content.res.TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(android.util.Xml.asAttributeSet(xml), defpackage.dur.d);
                                                try {
                                                    java.lang.String string8 = typedArrayObtainAttributes3.getString(0);
                                                    java.lang.String string9 = typedArrayObtainAttributes3.getString(1);
                                                    java.lang.String string10 = typedArrayObtainAttributes3.getString(2);
                                                    if (string8 == null) {
                                                        throw new org.xmlpull.v1.XmlPullParserException("query attribute must be set in fallback element");
                                                    }
                                                    while (xml.next() != 3) {
                                                        defpackage.dff.h(xml);
                                                    }
                                                    defpackage.dxj dxjVar2 = new defpackage.dxj(string2, string3, string8, listG, string9, string10);
                                                    typedArrayObtainAttributes3.recycle();
                                                    arrayList2.add(dxjVar2);
                                                } catch (java.lang.Throwable th) {
                                                    typedArrayObtainAttributes3.recycle();
                                                    throw th;
                                                }
                                            } else {
                                                defpackage.dff.h(xml);
                                            }
                                            integer2 = integer2;
                                        }
                                    }
                                    int i14 = integer2;
                                    if (!arrayList2.isEmpty()) {
                                        niVar = new defpackage.dwg(arrayList2, integer, i14, string6);
                                    } else {
                                        if (string4 == null) {
                                            throw new java.lang.IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
                                        }
                                        arrayList2.add(new defpackage.dxj(string2, string3, string4, listG, null, null));
                                        if (string5 != null) {
                                            arrayList2.add(new defpackage.dxj(string2, string3, string5, listG, null, null));
                                        }
                                        niVar = new defpackage.dwg(arrayList2, integer, i14, string6);
                                    }
                                }
                                if (niVar == null) {
                                    android.util.Log.e("ResourcesCompat", "Failed to find font-family tag");
                                    if (dwjVar != null) {
                                        dwjVar.c(-3);
                                    }
                                    return null;
                                }
                                i3 = typedValue.assetCookie;
                                if (niVar instanceof defpackage.dwg) {
                                    dwgVar = niVar;
                                    str = dwgVar.d;
                                    i4 = -1;
                                    if (!android.text.TextUtils.isEmpty(str) || (typefaceL = defpackage.dwq.a(str)) == null) {
                                        list = dwgVar.a;
                                        if (list.size() != 1) {
                                            if (android.os.Build.VERSION.SDK_INT < 31) {
                                                typefaceL = null;
                                                break;
                                            }
                                            i5 = 0;
                                            while (true) {
                                                if (i5 >= list.size()) {
                                                    i6 = 0;
                                                    customFallbackBuilder = null;
                                                    while (true) {
                                                        if (i6 < list.size()) {
                                                            dxjVar = (defpackage.dxj) list.get(i6);
                                                            if (i6 == list.size() + i4 || !android.text.TextUtils.isEmpty(dxjVar.g)) {
                                                                str2 = dxjVar.f;
                                                                fontB = defpackage.dwq.b(defpackage.dwq.a(str2));
                                                                if (fontB == null) {
                                                                    android.util.Log.w("TypefaceCompat", "Unable identify the primary font for " + str2 + ". Falling back to provider font.");
                                                                } else {
                                                                    str3 = dxjVar.g;
                                                                    if (android.text.TextUtils.isEmpty(str3)) {
                                                                        fontFamilyM = da$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.FontFamily.Builder(fontB));
                                                                    } else {
                                                                        try {
                                                                            fontFamilyM = da$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.FontFamily.Builder(da$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.Font.Builder(fontB), str3))));
                                                                        } catch (java.io.IOException unused) {
                                                                            android.util.Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                                        }
                                                                    }
                                                                    if (customFallbackBuilder == null) {
                                                                        customFallbackBuilder = new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyM);
                                                                    } else {
                                                                        da$.ExternalSyntheticApiModelOutline0.m(customFallbackBuilder, fontFamilyM);
                                                                    }
                                                                    i6++;
                                                                    i4 = -1;
                                                                }
                                                            } else {
                                                                fn$.ExternalSyntheticApiModelOutline0.m(customFallbackBuilder, dxjVar.f);
                                                            }
                                                        }
                                                        typefaceL = da$.ExternalSyntheticApiModelOutline0.m(customFallbackBuilder);
                                                        break;
                                                    }
                                                }
                                                if (defpackage.dwq.a(((defpackage.dxj) list.get(i5)).f) != null) {
                                                    i5++;
                                                }
                                                typefaceL = null;
                                                break;
                                            }
                                        }
                                        typefaceL = defpackage.dwq.a(((defpackage.dxj) list.get(0)).f);
                                    }
                                    if (typefaceL != null) {
                                        if (dwjVar != null) {
                                            dwjVar.d(typefaceL);
                                        }
                                        defpackage.dwq.a.b(defpackage.dwq.c(resources, i, string, i3, i2), typefaceL);
                                    } else {
                                        if (z) {
                                            if (dwgVar.c == 0) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                        } else if (dwjVar == null) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z) {
                                            i7 = dwgVar.b;
                                        } else {
                                            i7 = -1;
                                        }
                                        typefaceL = dvm.j(context, dwgVar.a, i2, z3, i7, new android.os.Handler(android.os.Looper.getMainLooper()), new dwp(dwjVar));
                                    }
                                } else {
                                    typefaceL = defpackage.dwq.b.m((ni) niVar, resources, i2);
                                    if (dwjVar != null) {
                                        if (typefaceL != null) {
                                            dwjVar.d(typefaceL);
                                        } else {
                                            dwjVar.c(-3);
                                        }
                                    }
                                }
                                if (typefaceL != null) {
                                    defpackage.dwq.a.b(defpackage.dwq.c(resources, i, string, i3, i2), typefaceL);
                                }
                            } else {
                                defpackage.dff.h(xml);
                            }
                            niVar = null;
                            if (niVar == null) {
                                android.util.Log.e("ResourcesCompat", "Failed to find font-family tag");
                                if (dwjVar != null) {
                                    dwjVar.c(-3);
                                }
                                return null;
                            }
                            i3 = typedValue.assetCookie;
                            if (niVar instanceof defpackage.dwg) {
                                dwgVar = niVar;
                                str = dwgVar.d;
                                i4 = -1;
                                if (!android.text.TextUtils.isEmpty(str)) {
                                    list = dwgVar.a;
                                    if (list.size() != 1) {
                                        if (android.os.Build.VERSION.SDK_INT < 31) {
                                            typefaceL = null;
                                            break;
                                        }
                                        i5 = 0;
                                        while (true) {
                                            if (i5 >= list.size()) {
                                                i6 = 0;
                                                customFallbackBuilder = null;
                                                while (true) {
                                                    if (i6 < list.size()) {
                                                        dxjVar = (defpackage.dxj) list.get(i6);
                                                        if (i6 == list.size() + i4) {
                                                        }
                                                        str2 = dxjVar.f;
                                                        fontB = defpackage.dwq.b(defpackage.dwq.a(str2));
                                                        if (fontB == null) {
                                                            android.util.Log.w("TypefaceCompat", "Unable identify the primary font for " + str2 + ". Falling back to provider font.");
                                                        } else {
                                                            str3 = dxjVar.g;
                                                            if (android.text.TextUtils.isEmpty(str3)) {
                                                                fontFamilyM = da$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.FontFamily.Builder(da$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.Font.Builder(fontB), str3))));
                                                            } else {
                                                                fontFamilyM = da$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.FontFamily.Builder(fontB));
                                                            }
                                                            if (customFallbackBuilder == null) {
                                                                customFallbackBuilder = new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyM);
                                                            } else {
                                                                da$.ExternalSyntheticApiModelOutline0.m(customFallbackBuilder, fontFamilyM);
                                                            }
                                                            i6++;
                                                            i4 = -1;
                                                        }
                                                    }
                                                    typefaceL = da$.ExternalSyntheticApiModelOutline0.m(customFallbackBuilder);
                                                    break;
                                                }
                                            }
                                            if (defpackage.dwq.a(((defpackage.dxj) list.get(i5)).f) != null) {
                                                i5++;
                                            }
                                            typefaceL = null;
                                            break;
                                        }
                                    }
                                    typefaceL = defpackage.dwq.a(((defpackage.dxj) list.get(0)).f);
                                } else {
                                    list = dwgVar.a;
                                    if (list.size() != 1) {
                                        if (android.os.Build.VERSION.SDK_INT < 31) {
                                            typefaceL = null;
                                            break;
                                        }
                                        i5 = 0;
                                        while (true) {
                                            if (i5 >= list.size()) {
                                                i6 = 0;
                                                customFallbackBuilder = null;
                                                while (true) {
                                                    if (i6 < list.size()) {
                                                        dxjVar = (defpackage.dxj) list.get(i6);
                                                        if (i6 == list.size() + i4) {
                                                        }
                                                        str2 = dxjVar.f;
                                                        fontB = defpackage.dwq.b(defpackage.dwq.a(str2));
                                                        if (fontB == null) {
                                                            android.util.Log.w("TypefaceCompat", "Unable identify the primary font for " + str2 + ". Falling back to provider font.");
                                                        } else {
                                                            str3 = dxjVar.g;
                                                            if (android.text.TextUtils.isEmpty(str3)) {
                                                                fontFamilyM = da$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.FontFamily.Builder(da$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.Font.Builder(fontB), str3))));
                                                            } else {
                                                                fontFamilyM = da$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.FontFamily.Builder(fontB));
                                                            }
                                                            if (customFallbackBuilder == null) {
                                                                customFallbackBuilder = new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyM);
                                                            } else {
                                                                da$.ExternalSyntheticApiModelOutline0.m(customFallbackBuilder, fontFamilyM);
                                                            }
                                                            i6++;
                                                            i4 = -1;
                                                        }
                                                    }
                                                    typefaceL = da$.ExternalSyntheticApiModelOutline0.m(customFallbackBuilder);
                                                    break;
                                                }
                                            }
                                            if (defpackage.dwq.a(((defpackage.dxj) list.get(i5)).f) != null) {
                                                i5++;
                                            }
                                            typefaceL = null;
                                            break;
                                        }
                                    }
                                    typefaceL = defpackage.dwq.a(((defpackage.dxj) list.get(0)).f);
                                }
                                if (typefaceL != null) {
                                    if (dwjVar != null) {
                                        dwjVar.d(typefaceL);
                                    }
                                    defpackage.dwq.a.b(defpackage.dwq.c(resources, i, string, i3, i2), typefaceL);
                                } else {
                                    if (z) {
                                        if (dwgVar.c == 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                    } else if (dwjVar == null) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z) {
                                        i7 = dwgVar.b;
                                    } else {
                                        i7 = -1;
                                    }
                                    typefaceL = dvm.j(context, dwgVar.a, i2, z3, i7, new android.os.Handler(android.os.Looper.getMainLooper()), new dwp(dwjVar));
                                }
                            } else {
                                typefaceL = defpackage.dwq.b.m((ni) niVar, resources, i2);
                                if (dwjVar != null) {
                                    if (typefaceL != null) {
                                        dwjVar.d(typefaceL);
                                    } else {
                                        dwjVar.c(-3);
                                    }
                                }
                            }
                            if (typefaceL != null) {
                                defpackage.dwq.a.b(defpackage.dwq.c(resources, i, string, i3, i2), typefaceL);
                            }
                        }
                    } while (next != 1);
                    throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
                }
                int i15 = typedValue.assetCookie;
                typefaceL = defpackage.dwq.b.l(resources, i);
                if (typefaceL != null) {
                    defpackage.dwq.a.b(defpackage.dwq.c(resources, i, string, i15, i2), typefaceL);
                }
                if (dwjVar != null) {
                    if (typefaceL != null) {
                        dwjVar.d(typefaceL);
                    } else {
                        dwjVar.c(-3);
                    }
                }
                return typefaceL;
            } catch (java.io.IOException e) {
                android.util.Log.e("ResourcesCompat", "Failed to read xml resource ".concat(java.lang.String.valueOf(string)), e);
                if (dwjVar != null) {
                    dwjVar.c(-3);
                }
            }
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            android.util.Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(java.lang.String.valueOf(string)), e2);
            if (dwjVar != null) {
                dwjVar.c(-3);
            }
        }
    }
}
