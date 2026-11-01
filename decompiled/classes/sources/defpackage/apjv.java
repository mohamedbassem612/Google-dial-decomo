package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apjv {
    public static final /* synthetic */ int a = 0;

    static {
        defpackage.aoov aoovVar = defpackage.appn.c;
        defpackage.appb appbVar = defpackage.appb.a;
        aoovVar.aJ(defpackage.aoov.aP("efbbbf"), defpackage.aoov.aP("feff"), defpackage.aoov.aP("fffe0000"), defpackage.aoov.aP("fffe"), defpackage.aoov.aP("0000feff"));
    }

    public static final int a(java.lang.String str, char c, int i, int i2) {
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int b(java.lang.String str, java.lang.String str2, int i, int i2) {
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        while (i < i2) {
            if (defpackage.aoov.M(str2, str.charAt(i), 0) >= 0) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int c(java.lang.String str) {
        defpackage.aooh.f(str, "<this>");
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final int d(java.lang.String str, int i, int i2) {
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int e(java.lang.String str, int i, int i2) {
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        int i3 = i2 - 1;
        if (i > i3) {
            return i;
        }
        while (true) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i3 + 1;
            }
            if (i3 == i) {
                return i;
            }
            i3--;
        }
    }

    public static final int f(char c) {
        if (c >= '0' && c < ':') {
            return c - '0';
        }
        if (c >= 'a' && c < 'g') {
            return c - 'W';
        }
        if (c < 'A' || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final int g(defpackage.appa appaVar) {
        return ((appaVar.d() & 255) << 16) | ((appaVar.d() & 255) << 8) | (appaVar.d() & 255);
    }

    public static final int h(java.lang.String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            long j = java.lang.Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (java.lang.NumberFormatException unused) {
            return i;
        }
    }

    public static final java.lang.String i(java.lang.String str, int i, int i2) {
        defpackage.aooh.f(str, "<this>");
        int iD = d(str, i, i2);
        java.lang.String strSubstring = str.substring(iD, e(str, iD, i2));
        defpackage.aooh.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void j(java.io.Closeable closeable) {
        defpackage.aooh.f(closeable, "<this>");
        try {
            closeable.close();
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception unused) {
        }
    }

    public static final boolean k(java.lang.String[] strArr, java.lang.String[] strArr2, java.util.Comparator comparator) {
        if (strArr.length == 0 || strArr2 == null || strArr2.length == 0) {
            return false;
        }
        for (java.lang.String str : strArr) {
            for (java.lang.String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean l(java.lang.String str) {
        defpackage.aooh.f(str, "name");
        return defpackage.aoov.s(str, "Authorization", true) || defpackage.aoov.s(str, "Cookie", true) || defpackage.aoov.s(str, "Proxy-Authorization", true) || defpackage.aoov.s(str, "Set-Cookie", true);
    }

    public static final java.lang.String[] m(java.lang.String[] strArr, java.lang.String[] strArr2, java.util.Comparator comparator) {
        if (strArr == null) {
            defpackage.aooh.i("<this>");
        }
        if (strArr2 == null) {
            defpackage.aooh.i("other");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            for (java.lang.String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    public static final void n(long j, long j2) {
        if (j < 0 || j < j2) {
            throw new java.lang.ArrayIndexOutOfBoundsException(defpackage.a.bC(j, "length=", ", offset=0, count=0"));
        }
    }

    public static /* synthetic */ int o(java.lang.String str, char c, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = str.length();
        }
        return a(str, c, 0, i);
    }
}
