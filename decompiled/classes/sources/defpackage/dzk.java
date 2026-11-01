package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class dzk {
    public dzk(char[] cArr) {
        new j$.util.concurrent.ConcurrentHashMap();
    }

    public static float A(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public static int B(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static android.graphics.drawable.Drawable C(android.graphics.drawable.Drawable drawable) {
        return drawable instanceof dwv ? ((dwv) drawable).a() : drawable;
    }

    public static int D(int i) {
        if (i <= 4) {
            return 8;
        }
        return i << 1;
    }

    public static java.util.ArrayList E(java.util.ArrayList arrayList, java.lang.Object obj) {
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        if (!arrayList.contains(obj)) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static android.graphics.Path F(float f, float f2, float f3, float f4) {
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static void G(java.lang.String str) {
        android.os.Trace.beginSection(H(str));
    }

    public static java.lang.String H(java.lang.String str) {
        if (str.length() <= 127) {
            return str;
        }
        java.lang.String strSubstring = str.substring(0, 127);
        defpackage.aooh.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static java.lang.reflect.Method I() {
        return (java.lang.reflect.Method) defpackage.giz.b.a();
    }

    public static java.lang.reflect.Method J() {
        return (java.lang.reflect.Method) defpackage.giz.a.a();
    }

    public static defpackage.gir K(android.content.Context context) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        return new defpackage.gir(context);
    }

    public static void L(defpackage.giu giuVar, java.lang.Object[] objArr) {
        if (objArr != null) {
            int i = 0;
            while (i < objArr.length) {
                java.lang.Object obj = objArr[i];
                i++;
                if (obj == null) {
                    giuVar.d(i);
                } else if (obj instanceof byte[]) {
                    giuVar.a(i, (byte[]) obj);
                } else if (obj instanceof java.lang.Float) {
                    giuVar.b(i, ((java.lang.Number) obj).floatValue());
                } else if (obj instanceof java.lang.Double) {
                    giuVar.b(i, ((java.lang.Number) obj).doubleValue());
                } else if (obj instanceof java.lang.Long) {
                    giuVar.c(i, ((java.lang.Number) obj).longValue());
                } else if (obj instanceof java.lang.Integer) {
                    giuVar.c(i, ((java.lang.Number) obj).intValue());
                } else if (obj instanceof java.lang.Short) {
                    giuVar.c(i, ((java.lang.Number) obj).shortValue());
                } else if (obj instanceof java.lang.Byte) {
                    giuVar.c(i, ((java.lang.Number) obj).byteValue());
                } else if (obj instanceof java.lang.String) {
                    giuVar.e(i, (java.lang.String) obj);
                } else {
                    if (!(obj instanceof java.lang.Boolean)) {
                        throw new java.lang.IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                    giuVar.c(i, true != ((java.lang.Boolean) obj).booleanValue() ? 0L : 1L);
                }
            }
        }
    }

    public static void M(defpackage.gjh gjhVar, java.lang.String str) throws java.lang.Exception {
        if (gjhVar == null) {
            defpackage.aooh.i("<this>");
        }
        if (str == null) {
            defpackage.aooh.i("sql");
        }
        defpackage.gin ginVarA = gjhVar.a(str);
        try {
            ginVarA.m();
            ginVarA.close();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    ginVarA.close();
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                }
                throw th2;
            }
        }
    }

    public static defpackage.gii N(android.view.View view) {
        if (view == null) {
            defpackage.aooh.i("<this>");
        }
        while (view != null) {
            java.lang.Object tag = view.getTag(2131429437);
            defpackage.gii giiVar = tag instanceof defpackage.gii ? (defpackage.gii) tag : null;
            if (giiVar != null) {
                return giiVar;
            }
            java.lang.Object objD = defpackage.dzp.d(view);
            view = objD instanceof android.view.View ? (android.view.View) objD : null;
        }
        return null;
    }

    public static void O(android.view.View view, defpackage.gii giiVar) {
        if (view == null) {
            defpackage.aooh.i("<this>");
        }
        view.setTag(2131429437, giiVar);
    }

    public static void P(java.lang.StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append('?');
            if (i2 < i - 1) {
                sb.append(',');
            }
        }
    }

    public static int Q(defpackage.gin ginVar, java.lang.String str) {
        int iR = R(ginVar, str);
        if (iR >= 0) {
            return iR;
        }
        int iR2 = R(ginVar, "`" + str + '`');
        if (iR2 < 0) {
            return -1;
        }
        return iR2;
    }

    public static int R(defpackage.gin ginVar, java.lang.String str) {
        int iB = ginVar.b();
        for (int i = 0; i < iB; i++) {
            if (defpackage.aooh.n(str, ginVar.d(i))) {
                return i;
            }
        }
        return -1;
    }

    public static int S(defpackage.gin ginVar, java.lang.String str) throws java.io.IOException {
        int iQ = Q(ginVar, str);
        if (iQ >= 0) {
            return iQ;
        }
        int iB = ginVar.b();
        java.util.ArrayList arrayList = new java.util.ArrayList(iB);
        for (int i = 0; i < iB; i++) {
            arrayList.add(ginVar.d(i));
        }
        throw new java.lang.IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + defpackage.ajsz.cr(arrayList, null, null, null, null, 63) + ']');
    }

    public static defpackage.giz T(defpackage.aiyy aiyyVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (aiyyVar == null) {
            defpackage.aooh.i("refHolder");
        }
        if (sQLiteDatabase == null) {
            defpackage.aooh.i("sqLiteDatabase");
        }
        java.lang.Object obj = aiyyVar.a;
        if (obj != null) {
            if (sQLiteDatabase == null) {
                defpackage.aooh.i("sqLiteDatabase");
            }
            defpackage.giz gizVar = (defpackage.giz) obj;
            if (defpackage.aooh.n(gizVar.c, sQLiteDatabase)) {
                return gizVar;
            }
        }
        defpackage.giz gizVar2 = new defpackage.giz(sQLiteDatabase);
        aiyyVar.a = gizVar2;
        return gizVar2;
    }

    public static defpackage.kaw U(defpackage.gii giiVar) {
        return new defpackage.kaw(new defpackage.cop(giiVar, new defpackage.ghb(giiVar, 2)));
    }

    public static defpackage.eax n(android.view.View view, defpackage.eax eaxVar, android.graphics.Rect rect) {
        android.view.WindowInsets windowInsetsE = eaxVar.e();
        if (windowInsetsE != null) {
            return defpackage.eax.q(view.computeSystemWindowInsets(windowInsetsE, rect), view);
        }
        rect.setEmpty();
        return eaxVar;
    }

    public static void o(android.view.View view, defpackage.dyy dyyVar) {
        defpackage.dzj dzjVar = dyyVar != null ? new defpackage.dzj(view, dyyVar) : null;
        if (view.getTag(2131429223) == null) {
            if (dzjVar != null) {
                view.setOnApplyWindowInsetsListener(dzjVar);
            } else {
                view.setOnApplyWindowInsetsListener((android.view.View.OnApplyWindowInsetsListener) view.getTag(2131429236));
            }
        }
    }

    public static int p(android.content.res.Resources resources, int i, dyc dycVar, int i2) {
        int dimensionPixelSize;
        if (i != -1) {
            return (i == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i)) < 0) ? i2 : dimensionPixelSize;
        }
        return ((java.lang.Integer) dycVar.a()).intValue();
    }

    public static boolean q(int i, int i2, int i3) {
        android.view.InputDevice device = android.view.InputDevice.getDevice(i);
        return (device == null || device.getMotionRange(i2, i3) == null) ? false : true;
    }

    public static java.lang.Object r(defpackage.ecx ecxVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        return ecxVar.a(new defpackage.efz(aonnVar, null), aolnVar);
    }

    public static /* synthetic */ defpackage.efw s(java.lang.String str) {
        defpackage.aooh.f(str, "name");
        return new defpackage.efw(str);
    }

    public static defpackage.efx t(defpackage.dzk... dzkVarArr) {
        defpackage.efx efxVar = new defpackage.efx(false);
        defpackage.dzk[] dzkVarArr2 = (defpackage.dzk[]) java.util.Arrays.copyOf(dzkVarArr, 0);
        defpackage.aooh.f(dzkVarArr2, "pairs");
        efxVar.c();
        if (dzkVarArr2.length <= 0) {
            return efxVar;
        }
        defpackage.dzk dzkVar = dzkVarArr2[0];
        throw null;
    }

    public static void u(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException((java.lang.String) obj);
        }
    }

    public static void v(boolean z, java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static void w(int i, int i2, int i3, java.lang.String str) {
        if (i < i2) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s is out of range of [%d, %d] (too low)", str, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)));
        }
        if (i > i3) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s is out of range of [%d, %d] (too high)", str, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)));
        }
    }

    public static void x(java.lang.Object obj) {
        obj.getClass();
    }

    public static void y(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException((java.lang.String) obj2);
        }
    }

    public static void z(java.lang.Object obj) {
        obj.getClass();
    }

    public android.view.View a(android.view.MenuItem menuItem) {
        throw null;
    }

    public void b(android.view.SubMenu subMenu) {
        throw null;
    }

    public boolean c() {
        throw null;
    }

    public boolean d() {
        throw null;
    }

    public boolean e() {
        throw null;
    }

    public boolean f() {
        throw null;
    }

    public void g(defpackage.apnt apntVar) {
        throw null;
    }

    public android.graphics.Typeface i(android.content.Context context, dxo[] dxoVarArr, int i) {
        throw null;
    }

    public android.graphics.Typeface j(android.content.Context context, java.util.List list, int i) {
        throw null;
    }

    public android.graphics.Typeface l(android.content.res.Resources resources, int i) {
        throw null;
    }

    public android.graphics.Typeface m(ni niVar, android.content.res.Resources resources, int i) {
        throw null;
    }

    public dzk(byte[] bArr) {
    }

    public dzk() {
    }
}
