package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xox {
    public static final /* synthetic */ int a = 0;
    private static final java.lang.String b;

    static {
        java.lang.String str;
        java.lang.String strM = ft$.ExternalSyntheticApiModelOutline0.m();
        java.lang.String strCr = null;
        if (strM != null && (str = (java.lang.String) ajsz.bG(aoov.S(strM, new java.lang.String[]{":"}, 0))) != null) {
            java.util.List listS = aoov.S(str, new java.lang.String[]{"."}, 0);
            if (listS.size() > 1) {
                aoiu aoiuVar = new aoiu(ajsz.co(listS), ajsz.bI(listS));
                java.lang.Object obj = aoiuVar.a;
                java.lang.Object obj2 = aoiuVar.b;
                strCr = ajsz.cr((java.util.List) obj, ".", (java.lang.CharSequence) null, ".".concat(java.lang.String.valueOf((java.lang.String) obj2)), new defpackage.xgn(17), 26);
            } else {
                strCr = str;
            }
        }
        b = strCr;
    }

    public static final int a(java.lang.String str, java.lang.String str2) {
        return android.util.Log.v("AndroidOnboarding", i(str, str2));
    }

    public static final void b(java.lang.String str, java.lang.String str2) {
        android.util.Log.d("AndroidOnboarding", i(str, str2));
    }

    public static final void c(java.lang.String str, java.lang.String str2) {
        android.util.Log.e("AndroidOnboarding", i(str, str2));
    }

    public static final void d(java.lang.String str, java.lang.String str2) {
        android.util.Log.i("AndroidOnboarding", i(str, str2));
    }

    public static final void e(java.lang.String str, java.lang.String str2) {
        android.util.Log.w("AndroidOnboarding", i(str, str2));
    }

    public static final void f(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        android.util.Log.w("AndroidOnboarding", i(str, str2), th);
    }

    public static final void g(java.lang.String str, java.lang.String str2) {
        android.util.Log.wtf("AndroidOnboarding", i(str, str2));
    }

    public static final void h(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        android.util.Log.e("AndroidOnboarding", i(str, str2), th);
    }

    private static final java.lang.String i(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str3 = b;
        if (str3 != null) {
            str = str + '[' + str3 + ']';
        }
        sb.append(str);
        sb.append(": ".concat(str2));
        return sb.toString();
    }
}
