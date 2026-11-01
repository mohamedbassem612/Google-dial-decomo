package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class goz {
    public static final defpackage.goz a = new defpackage.goz();

    public static final void a(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            defpackage.aooh.i("packageName");
        }
        if (str2 == null) {
            defpackage.aooh.i("className");
        }
        if (str.length() <= 0) {
            throw new java.lang.IllegalArgumentException("Package name must not be empty");
        }
        if (str2.length() <= 0) {
            throw new java.lang.IllegalArgumentException("Activity class name must not be empty");
        }
        if (defpackage.aoov.G(str, "*", false) && defpackage.aoov.w(str, "*", 0, false) != str.length() - 1) {
            throw new java.lang.IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if (defpackage.aoov.G(str2, "*", false) && defpackage.aoov.w(str2, "*", 0, false) != str2.length() - 1) {
            throw new java.lang.IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
    }

    public static final boolean b(defpackage.gmt gmtVar, defpackage.gmt gmtVar2) {
        if (gmtVar == null) {
            if (!defpackage.aooh.n(gmtVar2.a, "*") || !defpackage.aooh.n(gmtVar2.b, "*")) {
                return false;
            }
        } else {
            if (defpackage.aoov.G(gmtVar.toString(), "*", false)) {
                throw new java.lang.IllegalArgumentException("Wildcard can only be part of the rule.");
            }
            java.lang.String str = gmtVar.a;
            java.lang.String str2 = gmtVar2.a;
            boolean z = defpackage.aooh.n(str, str2) || e(str, str2);
            java.lang.String str3 = gmtVar.b;
            java.lang.String str4 = gmtVar2.b;
            boolean z2 = defpackage.aooh.n(str3, str4) || e(str3, str4);
            if (!z || !z2) {
                return false;
            }
        }
        return true;
    }

    public static final boolean c(android.app.Activity activity, defpackage.gmt gmtVar) {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        android.content.ComponentName componentName = activity.getComponentName();
        defpackage.aooh.e(componentName, "getComponentName(...)");
        if (b(new defpackage.gmt(componentName), gmtVar)) {
            return true;
        }
        android.content.Intent intent = activity.getIntent();
        if (intent != null) {
            return d(intent, gmtVar);
        }
        return false;
    }

    public static final boolean d(android.content.Intent intent, defpackage.gmt gmtVar) {
        java.lang.String str;
        if (intent == null) {
            defpackage.aooh.i("intent");
        }
        android.content.ComponentName component = intent.getComponent();
        if (b(component != null ? new defpackage.gmt(component) : null, gmtVar)) {
            return true;
        }
        if (intent.getComponent() == null && (str = intent.getPackage()) != null) {
            java.lang.String str2 = gmtVar.a;
            if ((defpackage.aooh.n(str, str2) || e(str, str2)) && defpackage.aooh.n(gmtVar.b, "*")) {
                return true;
            }
        }
        return false;
    }

    private static final boolean e(java.lang.String str, java.lang.String str2) {
        if (!defpackage.aoov.G(str2, "*", false)) {
            return false;
        }
        if (defpackage.aooh.n(str2, "*")) {
            return true;
        }
        if (defpackage.aoov.w(str2, "*", 0, false) != defpackage.aoov.ac(str2, "*") || !defpackage.aoov.r(str2, "*", false)) {
            throw new java.lang.IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end");
        }
        java.lang.String strSubstring = str2.substring(0, str2.length() - 1);
        defpackage.aooh.e(strSubstring, "substring(...)");
        return defpackage.aoov.ad(str, strSubstring);
    }
}
