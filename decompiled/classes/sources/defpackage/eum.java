package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eum {
    public static final java.lang.String a = android.os.Build.DEVICE + ", " + android.os.Build.MODEL + ", " + android.os.Build.MANUFACTURER + ", " + android.os.Build.VERSION.SDK_INT;
    public static final byte[] b = new byte[0];
    public static final long[] c = new long[0];
    public static final int[] d;
    private static final java.util.regex.Pattern e;
    private static java.util.HashMap f;
    private static final java.lang.String[] g;
    private static final java.lang.String[] h;
    private static final int[] i;
    private static final int[] j;

    static {
        java.util.regex.Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
        java.util.regex.Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        java.util.regex.Pattern.compile("%([A-Fa-f0-9]{2})");
        e = java.util.regex.Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        g = new java.lang.String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        h = new java.lang.String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        i = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        j = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        d = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static long A(long j2, long j3, long j4, java.math.RoundingMode roundingMode) {
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        if (j4 >= j3) {
            if (j4 % j3 == 0) {
                return defpackage.aiql.ag(j2, defpackage.aiql.ag(j4, j3, java.math.RoundingMode.UNNECESSARY), roundingMode);
            }
        } else if (j3 % j4 == 0) {
            return defpackage.aiql.aj(j2, defpackage.aiql.ag(j3, j4, java.math.RoundingMode.UNNECESSARY));
        }
        if (j4 >= j2) {
            if (j4 % j2 == 0) {
                return defpackage.aiql.ag(j3, defpackage.aiql.ag(j4, j2, java.math.RoundingMode.UNNECESSARY), roundingMode);
            }
        } else if (j2 % j4 == 0) {
            return defpackage.aiql.aj(j3, defpackage.aiql.ag(j2, j4, java.math.RoundingMode.UNNECESSARY));
        }
        return aj(j2, j3, j4, roundingMode);
    }

    public static long B(int i2) {
        return ((long) i2) & 4294967295L;
    }

    public static long C(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    public static android.graphics.Point D(android.content.Context context) {
        android.graphics.Point point;
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
        android.view.Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            defpackage.ahvr.ci(windowManager);
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && X(context)) {
            java.lang.String strJ = J("vendor.display-size");
            if (!android.text.TextUtils.isEmpty(strJ)) {
                try {
                    java.lang.String[] strArrSplit = strJ.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i2 = java.lang.Integer.parseInt(strArrSplit[0]);
                        int i3 = java.lang.Integer.parseInt(strArrSplit[1]);
                        if (i2 > 0 && i3 > 0) {
                            return new android.graphics.Point(i2, i3);
                        }
                    }
                } catch (java.lang.NumberFormatException unused) {
                }
                etr.c("Util", "Invalid display size: ".concat(java.lang.String.valueOf(strJ)));
            }
            if ("Sony".equals(android.os.Build.MANUFACTURER) && android.os.Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new android.graphics.Point(3840, 2160);
            } else {
                point = new android.graphics.Point();
                android.view.Display.Mode mode = display.getMode();
                point.x = mode.getPhysicalWidth();
                point.y = mode.getPhysicalHeight();
            }
        } else {
            point = new android.graphics.Point();
            android.view.Display.Mode mode2 = display.getMode();
            point.x = mode2.getPhysicalWidth();
            point.y = mode2.getPhysicalHeight();
        }
        return point;
    }

    public static android.os.Looper E() {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        return looperMyLooper == null ? android.os.Looper.getMainLooper() : looperMyLooper;
    }

    public static eqg F(int i2, int i3, int i4) {
        eqf eqfVar = new eqf();
        eqfVar.c("audio/raw");
        eqfVar.F = i3;
        eqfVar.H = i4;
        eqfVar.I = i2;
        return new eqg(eqfVar);
    }

    public static java.lang.String G(java.lang.String str, java.lang.Object... objArr) {
        return java.lang.String.format(java.util.Locale.US, str, objArr);
    }

    public static java.lang.String H(byte[] bArr) {
        return new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
    }

    public static java.lang.String I(byte[] bArr, int i2, int i3) {
        return new java.lang.String(bArr, i2, i3, java.nio.charset.StandardCharsets.UTF_8);
    }

    public static java.lang.String J(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return (java.lang.String) cls.getMethod("get", java.lang.String.class).invoke(cls, str);
        } catch (java.lang.Exception e2) {
            etr.d("Util", "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static java.lang.String K(int i2) {
        switch (i2) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static java.lang.String L(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        java.lang.String strP = defpackage.ahvr.p(str);
        int i2 = 0;
        java.lang.String str2 = strP.split("-", 2)[0];
        java.util.HashMap mapAk = f;
        if (mapAk == null) {
            mapAk = ak();
            f = mapAk;
        }
        java.lang.String str3 = (java.lang.String) mapAk.get(str2);
        if (str3 != null) {
            strP = str3.concat(java.lang.String.valueOf(strP.substring(str2.length())));
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strP;
        }
        while (true) {
            java.lang.String[] strArr = h;
            int length = strArr.length;
            if (i2 >= 18) {
                return strP;
            }
            if (strP.startsWith(strArr[i2])) {
                return java.lang.String.valueOf(strArr[i2 + 1]).concat(java.lang.String.valueOf(strP.substring(strArr[i2].length())));
            }
            i2 += 2;
        }
    }

    public static java.lang.String M(int i2) {
        return new java.lang.String(defpackage.aiql.V(i2), java.nio.charset.StandardCharsets.US_ASCII);
    }

    public static java.util.concurrent.ExecutorService N(java.lang.String str) {
        return java.util.concurrent.Executors.newSingleThreadExecutor(new eul(str, 1));
    }

    public static void O(java.io.Closeable closeable) {
        try {
            closeable.close();
        } catch (java.io.IOException unused) {
        }
    }

    public static void P(java.util.List list, java.lang.Object[] objArr) {
        defpackage.ahvr.bY(list.size() == objArr.length);
        list.toArray(objArr);
    }

    public static boolean Q(android.util.SparseArray sparseArray, int i2) {
        return sparseArray.indexOfKey(i2) >= 0;
    }

    public static boolean R(android.util.SparseBooleanArray sparseBooleanArray, int i2) {
        return sparseBooleanArray.indexOfKey(i2) >= 0;
    }

    public static boolean S(etx etxVar, etx etxVar2, java.util.zip.Inflater inflater) {
        boolean z = false;
        if (etxVar.d() != 0) {
            if (etxVar2.e() < etxVar.d()) {
                etxVar2.H(etxVar.d() << 1);
            }
            if (inflater == null) {
                inflater = new java.util.zip.Inflater();
            }
            inflater.setInput(etxVar.b, etxVar.c, etxVar.d());
            int iInflate = 0;
            while (true) {
                try {
                    iInflate += inflater.inflate(etxVar2.b, iInflate, etxVar2.e() - iInflate);
                    if (inflater.finished()) {
                        etxVar2.P(iInflate);
                        z = true;
                        break;
                    }
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (iInflate == etxVar2.e()) {
                        etxVar2.H(etxVar2.e() << 1);
                    }
                } catch (java.util.zip.DataFormatException unused) {
                } catch (java.lang.Throwable th) {
                    inflater.reset();
                    throw th;
                }
            }
            inflater.reset();
        }
        return z;
    }

    public static boolean T(android.content.Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean U(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4 || i2 == 1895825408 || i2 == 1879048192 || i2 == 1912602624;
    }

    public static boolean V(android.content.Context context) {
        if (context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if ((android.os.Build.VERSION.SDK_INT == 30 && (defpackage.ahvr.r(android.os.Build.MODEL, "moto g(20)") || defpackage.ahvr.r(android.os.Build.MODEL, "moto e20") || defpackage.ahvr.r(android.os.Build.MODEL, "rmx3231"))) || defpackage.ahvr.r(android.os.Build.MODEL, "sm-a032f")) {
            return true;
        }
        return android.os.Build.VERSION.SDK_INT == 34 && defpackage.ahvr.r(android.os.Build.MODEL, "sm-x200");
    }

    public static boolean W(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static boolean X(android.content.Context context) {
        android.app.UiModeManager uiModeManager = (android.app.UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean Y(etx etxVar, etx etxVar2, java.util.zip.Inflater inflater) {
        return etxVar.d() > 0 && etxVar.h() == 120 && S(etxVar, etxVar2, inflater);
    }

    public static byte[] Z(java.lang.String str) {
        return str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public static float a(float f2, float f3, float f4) {
        return java.lang.Math.max(f3, java.lang.Math.min(f2, f4));
    }

    public static java.lang.Object[] aa(java.lang.Object[] objArr, int i2) {
        defpackage.ahvr.bM(i2 <= objArr.length);
        return java.util.Arrays.copyOf(objArr, i2);
    }

    public static int ab(long[] jArr, long j2, boolean z) {
        int i2;
        int iBinarySearch = java.util.Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i2 = iBinarySearch + 1;
            if (i2 >= jArr.length || jArr[i2] != j2) {
                break;
            }
            iBinarySearch = i2;
        }
        return !z ? i2 : iBinarySearch;
    }

    public static int ac(long[] jArr, long j2, boolean z) {
        int i2;
        int iBinarySearch = java.util.Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i3 = iBinarySearch - 1;
                if (i3 < 0 || jArr[i3] != j2) {
                    break;
                }
                iBinarySearch = i3;
            }
            i2 = iBinarySearch;
        }
        return z ? java.lang.Math.max(0, i2) : i2;
    }

    public static double ad(double d2) {
        return java.lang.Math.max(-1.0d, java.lang.Math.min(d2, 1.0d));
    }

    public static android.os.Handler ae() {
        return new android.os.Handler(E(), null);
    }

    public static void af(android.os.Handler handler, java.lang.Runnable runnable) {
        android.os.Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == android.os.Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    public static void ag(long[] jArr, long j2) {
        long j3;
        java.math.RoundingMode roundingMode = java.math.RoundingMode.DOWN;
        int i2 = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long jAg = defpackage.aiql.ag(j2, 1000000L, java.math.RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = defpackage.aiql.ag(jArr[i2], jAg, roundingMode);
                i2++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long jAg2 = defpackage.aiql.ag(1000000L, j2, java.math.RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = defpackage.aiql.aj(jArr[i2], jAg2);
                i2++;
            }
            return;
        }
        int i3 = 0;
        while (i3 < jArr.length) {
            long j4 = jArr[i3];
            if (j4 == 0) {
                j3 = j2;
            } else if (j2 >= j4) {
                if (j2 % j4 == 0) {
                    jArr[i3] = defpackage.aiql.ag(1000000L, defpackage.aiql.ag(j2, j4, java.math.RoundingMode.UNNECESSARY), roundingMode);
                    j3 = j2;
                } else {
                    j3 = j2;
                    jArr[i3] = aj(j4, 1000000L, j3, roundingMode);
                }
            } else if (j4 % j2 == 0) {
                jArr[i3] = defpackage.aiql.aj(1000000L, defpackage.aiql.ag(j4, j2, java.math.RoundingMode.UNNECESSARY));
                j3 = j2;
            } else {
                j3 = j2;
                jArr[i3] = aj(j4, 1000000L, j3, roundingMode);
            }
            i3++;
            j2 = j3;
        }
    }

    public static android.os.Handler ah() {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        defpackage.ahvr.ci(looperMyLooper);
        return new android.os.Handler(looperMyLooper, null);
    }

    public static int ai(aizg aizgVar, long j2) {
        int i2 = aizgVar.a - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (aizgVar.i(i4) < j2) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        int i5 = i2 + 1;
        if (i5 < aizgVar.a && aizgVar.i(i5) == j2) {
            return i5;
        }
        if (i2 != -1) {
            return i2;
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f4  */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x00f4, please report this as an issue */
    private static long aj(long j2, long j3, long j4, java.math.RoundingMode roundingMode) {
        double dRint;
        long j5;
        long j6;
        long jAj = defpackage.aiql.aj(j2, j3);
        if (jAj != Long.MAX_VALUE && jAj != Long.MIN_VALUE) {
            return defpackage.aiql.ag(jAj, j4, roundingMode);
        }
        long jAh = defpackage.aiql.ah(java.lang.Math.abs(j3), java.lang.Math.abs(j4));
        long jAg = defpackage.aiql.ag(j3, jAh, java.math.RoundingMode.UNNECESSARY);
        long jAg2 = defpackage.aiql.ag(j4, jAh, java.math.RoundingMode.UNNECESSARY);
        long jAh2 = defpackage.aiql.ah(java.lang.Math.abs(j2), java.lang.Math.abs(jAg2));
        long jAg3 = defpackage.aiql.ag(j2, jAh2, java.math.RoundingMode.UNNECESSARY);
        long jAg4 = defpackage.aiql.ag(jAg2, jAh2, java.math.RoundingMode.UNNECESSARY);
        long jAj2 = defpackage.aiql.aj(jAg3, jAg);
        if (jAj2 != Long.MAX_VALUE && jAj2 != Long.MIN_VALUE) {
            return defpackage.aiql.ag(jAj2, jAg4, roundingMode);
        }
        double d2 = jAg3 * (jAg / jAg4);
        if (d2 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d2 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        int i2 = aiyu.a;
        if (!ajee.q(d2)) {
            throw new java.lang.ArithmeticException("input is infinite or NaN");
        }
        switch (aiyt.a[roundingMode.ordinal()]) {
            case 1:
                defpackage.aiql.ad(aiyu.b(d2));
                dRint = d2;
                if (((((-9.223372036854776E18d) - dRint) > 1.0d ? 1 : (((-9.223372036854776E18d) - dRint) == 1.0d ? 0 : -1)) & (dRint > 9.223372036854776E18d ? 1 : (dRint == 9.223372036854776E18d ? 0 : -1))) < 0) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case 2:
                if (d2 >= 0.0d || aiyu.b(d2)) {
                    dRint = d2;
                } else {
                    j5 = (long) d2;
                    j6 = -1;
                    dRint = j5 + j6;
                }
                if (((((-9.223372036854776E18d) - dRint) > 1.0d ? 1 : (((-9.223372036854776E18d) - dRint) == 1.0d ? 0 : -1)) & (dRint > 9.223372036854776E18d ? 1 : (dRint == 9.223372036854776E18d ? 0 : -1))) < 0) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case 3:
                if (d2 <= 0.0d || aiyu.b(d2)) {
                    dRint = d2;
                } else {
                    j5 = (long) d2;
                    j6 = 1;
                    dRint = j5 + j6;
                }
                if (((((-9.223372036854776E18d) - dRint) > 1.0d ? 1 : (((-9.223372036854776E18d) - dRint) == 1.0d ? 0 : -1)) & (dRint > 9.223372036854776E18d ? 1 : (dRint == 9.223372036854776E18d ? 0 : -1))) < 0) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case 4:
                dRint = d2;
                if (((((-9.223372036854776E18d) - dRint) > 1.0d ? 1 : (((-9.223372036854776E18d) - dRint) == 1.0d ? 0 : -1)) & (dRint > 9.223372036854776E18d ? 1 : (dRint == 9.223372036854776E18d ? 0 : -1))) < 0) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case 5:
                if (aiyu.b(d2)) {
                    dRint = d2;
                } else {
                    j5 = (long) d2;
                    j6 = d2 > 0.0d ? 1 : -1;
                    dRint = j5 + j6;
                }
                if (((((-9.223372036854776E18d) - dRint) > 1.0d ? 1 : (((-9.223372036854776E18d) - dRint) == 1.0d ? 0 : -1)) & (dRint > 9.223372036854776E18d ? 1 : (dRint == 9.223372036854776E18d ? 0 : -1))) < 0) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                dRint = java.lang.Math.rint(d2);
                if (((((-9.223372036854776E18d) - dRint) > 1.0d ? 1 : (((-9.223372036854776E18d) - dRint) == 1.0d ? 0 : -1)) & (dRint > 9.223372036854776E18d ? 1 : (dRint == 9.223372036854776E18d ? 0 : -1))) < 0) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                dRint = java.lang.Math.rint(d2);
                if (java.lang.Math.abs(d2 - dRint) == 0.5d) {
                    dRint = d2 + java.lang.Math.copySign(0.5d, d2);
                }
                if (((((-9.223372036854776E18d) - dRint) > 1.0d ? 1 : (((-9.223372036854776E18d) - dRint) == 1.0d ? 0 : -1)) & (dRint > 9.223372036854776E18d ? 1 : (dRint == 9.223372036854776E18d ? 0 : -1))) < 0) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                dRint = java.lang.Math.rint(d2);
                if (java.lang.Math.abs(d2 - dRint) == 0.5d) {
                    dRint = d2;
                }
                if (((((-9.223372036854776E18d) - dRint) > 1.0d ? 1 : (((-9.223372036854776E18d) - dRint) == 1.0d ? 0 : -1)) & (dRint > 9.223372036854776E18d ? 1 : (dRint == 9.223372036854776E18d ? 0 : -1))) < 0) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            default:
                throw new java.lang.AssertionError();
        }
    }

    private static java.util.HashMap ak() {
        java.lang.String[] iSOLanguages = java.util.Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = g.length;
        java.util.HashMap map = new java.util.HashMap(length + 88);
        int i2 = 0;
        for (java.lang.String str : iSOLanguages) {
            try {
                java.lang.String iSO3Language = new java.util.Locale(str).getISO3Language();
                if (!android.text.TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (java.util.MissingResourceException unused) {
            }
        }
        while (true) {
            java.lang.String[] strArr = g;
            int length3 = strArr.length;
            if (i2 >= 88) {
                return map;
            }
            map.put(strArr[i2], strArr[i2 + 1]);
            i2 += 2;
        }
    }

    public static int b(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int iBinarySearch = java.util.Arrays.binarySearch(iArr, i2);
        if (iBinarySearch < 0) {
            i4 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i3 = iBinarySearch - 1;
                if (i3 < 0 || iArr[i3] != i2) {
                    break;
                }
                iBinarySearch = i3;
            }
            i4 = z ? iBinarySearch : i3;
        }
        return z2 ? java.lang.Math.max(0, i4) : i4;
    }

    public static int c(int i2, int i3, int i4) {
        return java.lang.Math.max(i3, java.lang.Math.min(i2, i4));
    }

    public static int d(int i2, int i3) {
        return (char) (((char) (i3 << 4)) ^ j[(i3 >> 12) ^ i2]);
    }

    public static int e(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = i[(i4 >>> 24) ^ (bArr[i2] & 255)] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static int f(int i2) {
        switch (i2) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 21;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
                return 28;
            case 13:
            case 19:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            default:
                return Integer.MAX_VALUE;
            case 14:
                return 25;
            case 20:
                return 30;
            case 21:
            case 22:
                return 31;
            case 30:
            case 31:
                return 34;
        }
    }

    public static int g(int i2) {
        int i3;
        int i4 = 6396;
        if (i2 != 10) {
            if (i2 == 16) {
                i3 = 205215996;
            } else if (i2 != 24) {
                switch (i2) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return 220;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return 252;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return 1276;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return 6396;
                    default:
                        switch (i2) {
                            case 12:
                                return 743676;
                            case 13:
                                i3 = 30136348;
                                break;
                            case 14:
                                i3 = 202070268;
                                break;
                            default:
                                return 0;
                        }
                        break;
                }
            } else {
                i3 = 67108860;
            }
            i4 = 0;
        } else {
            i3 = 737532;
        }
        return android.os.Build.VERSION.SDK_INT >= 32 ? i3 : i4;
    }

    public static int h(eqg eqgVar) {
        int i2 = eqgVar.I;
        return i2 == -1 ? g(eqgVar.H) : i2;
    }

    public static int i(java.nio.ByteBuffer byteBuffer, int i2) {
        int i3 = byteBuffer.getInt(i2);
        return byteBuffer.order() != java.nio.ByteOrder.BIG_ENDIAN ? java.lang.Integer.reverseBytes(i3) : i3;
    }

    public static int j(int i2) {
        if (i2 == 2) {
            return 2;
        }
        if (i2 == 3) {
            return 1;
        }
        if (i2 != 4) {
            if (i2 != 21) {
                if (i2 != 22) {
                    if (i2 == 268435456) {
                        return 2;
                    }
                    if (i2 != 1342177280) {
                        if (i2 != 1610612736) {
                            if (i2 != 1879048192) {
                                if (i2 != 1895825408) {
                                    if (i2 != 1912602624) {
                                        throw new java.lang.IllegalArgumentException();
                                    }
                                }
                            }
                            return 8;
                        }
                    }
                }
            }
            return 3;
        }
        return 4;
    }

    public static int k(int i2) {
        if (i2 != 2 && i2 != 4) {
            if (i2 != 10) {
                if (i2 != 7) {
                    if (i2 != 8) {
                        switch (i2) {
                            case 15:
                                break;
                            case 16:
                            case 18:
                                break;
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                break;
                            default:
                                switch (i2) {
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                        return 6002;
                                    default:
                                        return 6006;
                                }
                        }
                    }
                    return 6003;
                }
            }
            return 6004;
        }
        return 6005;
    }

    public static int l(java.lang.String str) {
        java.lang.String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        java.lang.String str2 = strArrSplit[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrSplit[length + (-2)]);
        try {
            defpackage.ahvr.ci(str2);
            int i2 = java.lang.Integer.parseInt(str2);
            return z ? -i2 : i2;
        } catch (java.lang.NumberFormatException unused) {
            return 0;
        }
    }

    public static int m(int i2) {
        return n(i2, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public static int n(int i2, java.nio.ByteOrder byteOrder) {
        if (i2 == 32) {
            return byteOrder.equals(java.nio.ByteOrder.LITTLE_ENDIAN) ? 4 : 1895825408;
        }
        if (i2 != 64) {
            return 0;
        }
        return byteOrder.equals(java.nio.ByteOrder.LITTLE_ENDIAN) ? 1879048192 : 1912602624;
    }

    public static int o(int i2) {
        return p(i2, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public static int p(int i2, java.nio.ByteOrder byteOrder) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return byteOrder.equals(java.nio.ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i2 == 24) {
            return byteOrder.equals(java.nio.ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i2 != 32) {
            return 0;
        }
        return byteOrder.equals(java.nio.ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        if (r6.contains("format=m3u8-aapl") != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int q(android.net.Uri r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eum.q(android.net.Uri, java.lang.String):int");
    }

    public static int r(int[] iArr, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    public static long s(long j2, long j3, long j4) {
        return java.lang.Math.max(j3, java.lang.Math.min(j2, j4));
    }

    public static long t(long j2, int i2) {
        return A(j2, i2, 1000000L, java.math.RoundingMode.UP);
    }

    public static long u(long j2, float f2) {
        return f2 != 1.0f ? java.lang.Math.round(j2 * ((double) f2)) : j2;
    }

    public static long v(long j2, float f2) {
        return f2 != 1.0f ? java.lang.Math.round(j2 / ((double) f2)) : j2;
    }

    public static long w(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static long x(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000000;
    }

    public static long y(long j2, int i2) {
        return A(j2, 1000000L, i2, java.math.RoundingMode.DOWN);
    }

    public static long z(long j2, long j3, long j4) {
        return A(j2, j3, j4, java.math.RoundingMode.DOWN);
    }
}
