package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class afjz {
    public static final long a;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        a = 86400000L;
    }

    public static int a() {
        java.lang.String strG = g();
        if (strG.contains(".")) {
            strG = strG.substring(strG.lastIndexOf(".") + 1);
        }
        return java.lang.Integer.parseInt(strG);
    }

    public static android.os.Bundle b(defpackage.amit amitVar) {
        defpackage.amis amisVar = amitVar.c;
        if (amisVar == null) {
            amisVar = defpackage.amis.a;
        }
        alat alatVar = amisVar.b;
        int size = alatVar.size();
        android.os.Bundle bundle = new android.os.Bundle(size);
        for (int i = 0; i < size; i++) {
            defpackage.amir amirVar = (defpackage.amir) alatVar.get(i);
            bundle.putString(amirVar.b, amirVar.c);
        }
        return bundle;
    }

    public static albh c(albh albhVar, byte[] bArr) {
        try {
            return albhVar.L().h(bArr, akzq.a()).r();
        } catch (alaz e) {
            throw new java.lang.IllegalStateException((java.lang.Throwable) e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    public static defpackage.amhu d(android.content.Context context) {
        android.content.pm.PackageManager.NameNotFoundException e;
        java.lang.String string;
        java.lang.String string2;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    java.lang.CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    string = !android.text.TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                    try {
                        string2 = !android.text.TextUtils.isEmpty(packageInfo.versionName) ? packageInfo.versionName : java.lang.Integer.toString(packageInfo.versionCode);
                    } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                        e = e2;
                        android.util.Log.e("SurveyUtils", "Exception while retrieving application information.", e);
                        string2 = "Unknown";
                    }
                } else {
                    string = "Unknown";
                    string2 = string;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
                e = e3;
                string = "Unknown";
            }
        } else {
            string = "Unknown";
            string2 = string;
        }
        java.lang.String packageName = android.text.TextUtils.isEmpty(context.getPackageName()) ? "Unknown" : context.getPackageName();
        akzx akzxVarM = defpackage.amhr.a.m();
        akzxVarM.u();
        defpackage.amhr amhrVar = (defpackage.amhr) akzxVarM.b;
        j$.util.Objects.requireNonNull(packageName);
        amhrVar.g = packageName;
        akzxVarM.u();
        defpackage.amhr amhrVar2 = (defpackage.amhr) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        amhrVar2.f = string;
        akzxVarM.u();
        defpackage.amhr amhrVar3 = (defpackage.amhr) akzxVarM.b;
        j$.util.Objects.requireNonNull(string2);
        amhrVar3.h = string2;
        java.lang.String str = android.os.Build.MODEL;
        akzxVarM.u();
        defpackage.amhr amhrVar4 = (defpackage.amhr) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        amhrVar4.b = str;
        java.lang.String str2 = android.os.Build.VERSION.RELEASE;
        akzxVarM.u();
        defpackage.amhr amhrVar5 = (defpackage.amhr) akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        amhrVar5.e = str2;
        akzxVarM.u();
        ((defpackage.amhr) akzxVarM.b).d = a.T(3);
        defpackage.amhr amhrVar6 = (defpackage.amhr) akzxVarM.p();
        java.lang.String id = java.util.TimeZone.getDefault().getID();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        long rawOffset = ((long) j$.util.DesugarTimeZone.getTimeZone(id).getRawOffset()) / 1000;
        akzx akzxVarM2 = akzm.a.m();
        akzxVarM2.u();
        akzxVarM2.b.b = rawOffset;
        akzm akzmVarP = akzxVarM2.p();
        akzx akzxVarM3 = defpackage.amhs.a.m();
        akzxVarM3.u();
        defpackage.amhs amhsVar = (defpackage.amhs) akzxVarM3.b;
        j$.util.Objects.requireNonNull(amhrVar6);
        amhsVar.d = amhrVar6;
        amhsVar.b |= 2;
        akzxVarM3.u();
        defpackage.amhs amhsVar2 = (defpackage.amhs) akzxVarM3.b;
        j$.util.Objects.requireNonNull(akzmVarP);
        amhsVar2.e = akzmVarP;
        amhsVar2.b |= 4;
        defpackage.amhs amhsVar3 = (defpackage.amhs) akzxVarM3.p();
        akzx akzxVarM4 = defpackage.amht.a.m();
        java.lang.String strG = g();
        akzxVarM4.u();
        defpackage.amht amhtVar = (defpackage.amht) akzxVarM4.b;
        j$.util.Objects.requireNonNull(strG);
        amhtVar.c = strG;
        int iA = a();
        akzxVarM4.u();
        ((defpackage.amht) akzxVarM4.b).e = iA;
        defpackage.amhp amhpVar = defpackage.amhp.CLIENT_CAPABILITY_PII;
        akzxVarM4.u();
        defpackage.amht amhtVar2 = (defpackage.amht) akzxVarM4.b;
        j$.util.Objects.requireNonNull(amhpVar);
        alak alakVar = amhtVar2.d;
        if (!alakVar.c()) {
            amhtVar2.d = alad.H(alakVar);
        }
        amhtVar2.d.g(amhpVar.a());
        akzxVarM4.u();
        ((defpackage.amht) akzxVarM4.b).b = a.Q(4);
        defpackage.amht amhtVar3 = (defpackage.amht) akzxVarM4.p();
        akzx akzxVarM5 = defpackage.amhu.a.m();
        akzxVarM5.u();
        defpackage.amhu amhuVar = (defpackage.amhu) akzxVarM5.b;
        j$.util.Objects.requireNonNull(amhsVar3);
        amhuVar.c = amhsVar3;
        amhuVar.b |= 1;
        akzxVarM5.u();
        defpackage.amhu amhuVar2 = (defpackage.amhu) akzxVarM5.b;
        j$.util.Objects.requireNonNull(amhtVar3);
        amhuVar2.d = amhtVar3;
        amhuVar2.b |= 2;
        return (defpackage.amhu) akzxVarM5.p();
    }

    public static java.lang.String e(android.content.pm.PackageInfo packageInfo) {
        if (packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
            return null;
        }
        try {
            byte[] bArrDigest = java.security.MessageDigest.getInstance("SHA1").digest(packageInfo.signatures[0].toByteArray());
            if (bArrDigest == null) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(bArrDigest.length << 1);
            for (byte b : bArrDigest) {
                sb.append(java.lang.String.format("%02x", java.lang.Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            android.util.Log.e("SurveyUtils", "Can't find SHA1.", e);
            return null;
        }
    }

    public static java.lang.String f(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || !android.util.Patterns.WEB_URL.matcher(ahvr.p(str)).matches()) {
            android.util.Log.e("SurveyUtils", "Follow up URL was empty or invalid.");
            return "";
        }
        if (android.webkit.URLUtil.isHttpUrl(str) || android.webkit.URLUtil.isHttpsUrl(str)) {
            android.net.Uri uri = android.net.Uri.parse(str);
            try {
                aehj aehjVar = defpackage.afjy.c;
                if (defpackage.afjy.b(defpackage.anlr.a.eZ().a(defpackage.afjy.b))) {
                    return new java.net.URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), uri.getQuery(), null).toString();
                }
                return new java.net.URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), uri.getQuery() != null ? j$.net.URLEncoder.encode(uri.getQuery(), java.nio.charset.StandardCharsets.UTF_8) : "").toString();
            } catch (java.net.URISyntaxException e) {
                android.util.Log.e("SurveyUtils", e.getMessage());
            }
        }
        android.util.Log.e("SurveyUtils", "Follow up URL is not http or https.");
        return "";
    }

    public static java.lang.String g() {
        aehj aehjVar = defpackage.afjy.c;
        android.content.Context context = defpackage.afjy.b;
        defpackage.ankb ankbVar = defpackage.ankb.a;
        java.lang.String strA = ankbVar.eZ().a(context);
        if (!strA.equals("1")) {
            return strA;
        }
        aehj aehjVar2 = defpackage.afjy.c;
        return ankbVar.eZ().b(defpackage.afjy.b);
    }

    public static void h(android.view.View view) {
        ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void i(android.view.View view) {
        ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
    }

    public static boolean j(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        return packageManager != null && packageManager.hasSystemFeature("com.google.desktop.gms");
    }

    public static boolean k(android.content.Context context) {
        return ((android.view.accessibility.AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
    }

    public static boolean l(amip amipVar) {
        defpackage.amiq amiqVar = amipVar.f;
        if (amiqVar == null) {
            amiqVar = defpackage.amiq.a;
        }
        return amiqVar.b;
    }

    public static boolean m(android.content.Context context) {
        return (context.getResources().getConfiguration().uiMode & 15) == 6;
    }

    public static boolean n(amip amipVar) {
        if (amipVar.g.size() > 1) {
            return true;
        }
        amiv amivVar = (amiv) amipVar.g.get(0);
        int i = amivVar.i;
        int iAb = a.ab(i);
        if (iAb == 0 || iAb != 3) {
            int iAb2 = a.ab(i);
            if (iAb2 == 0 || iAb2 != 5) {
                return true;
            }
        } else {
            defpackage.amhn amhnVar = (amivVar.c == 4 ? (amjf) amivVar.d : amjf.a).c;
            if (amhnVar == null) {
                amhnVar = defpackage.amhn.a;
            }
            java.util.Iterator it = amhnVar.b.iterator();
            while (it.hasNext()) {
                int iW = a.W(((amhm) it.next()).c);
                if (iW == 0) {
                    iW = 1;
                }
                if (iW == 4) {
                    return true;
                }
            }
        }
        return false;
    }
}
