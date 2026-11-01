package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aacn {
    public static boolean a = false;
    public static boolean b = false;

    @java.lang.Deprecated
    static final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean();
    private static final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean();
    private static volatile boolean e = false;

    @java.lang.Deprecated
    public static int a(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            android.util.Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009d  */
    @java.lang.Deprecated
    public static int b(android.content.Context context, int i) {
        boolean z;
        android.content.pm.PackageInfo packageInfo;
        try {
            context.getResources().getString(2132018058);
        } catch (java.lang.Throwable unused) {
            android.util.Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        int i2 = 1;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !d.get()) {
            synchronized (defpackage.aahi.a) {
                if (!defpackage.aahi.b) {
                    defpackage.aahi.b = true;
                    try {
                        android.os.Bundle bundle = defpackage.aaiy.a.a(context).b(context.getPackageName(), 128).metaData;
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            defpackage.aahi.c = bundle.getInt("com.google.android.gms.version");
                        }
                    } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                        android.util.Log.wtf("MetadataValueReader", "This should never happen.", e2);
                    }
                }
            }
            int i3 = defpackage.aahi.c;
            if (i3 == 0) {
                throw new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException();
            }
            if (i3 != 264230000) {
                throw new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException(i3);
            }
        }
        if (defpackage.aain.e(context)) {
            z = false;
        } else {
            if (defpackage.aain.a == null) {
                defpackage.aain.a = java.lang.Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (defpackage.aain.a.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
        }
        java.lang.String packageName = context.getPackageName();
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 134225984);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            android.content.pm.PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 134217792);
            defpackage.aaco.a(context);
            if (defpackage.aaco.d(packageInfo2, true)) {
                if (z) {
                    if (packageInfo == null) {
                        throw new java.lang.NullPointerException("null reference");
                    }
                    if (defpackage.aaco.d(packageInfo, true)) {
                        if (!packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                        }
                        return i2;
                    }
                    android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                }
                int i4 = packageInfo2.versionCode;
                int i5 = defpackage.aaip.a;
                if ((i4 != -1 ? i4 / 1000 : -1) < i / 1000) {
                    android.util.Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i + " but found " + packageInfo2.versionCode);
                    i2 = 2;
                } else {
                    android.content.pm.ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
                            android.util.Log.wtf("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e3);
                        }
                    }
                    if (applicationInfo.enabled) {
                        return 0;
                    }
                    i2 = 3;
                }
                return i2;
            }
            android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            i2 = 9;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
            android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
        }
        return i2;
    }

    public static android.content.Context c(android.content.Context context) {
        android.content.Context contextCreatePackageContext = null;
        if (e || b(context, 0) == 0) {
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                if (contextCreatePackageContext != null) {
                    e = true;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        } else {
            android.util.Log.e("GooglePlayServicesUtil", "Invalid GmsCore APK, remote loading disabled.");
        }
        return contextCreatePackageContext;
    }

    @java.lang.Deprecated
    public static void d(android.content.Context context, int i) throws defpackage.aacl, defpackage.aacm {
        defpackage.aaby aabyVar = defpackage.aaby.d;
        int iL = aabyVar.l(context, i);
        if (iL != 0) {
            android.content.Intent intentM = aabyVar.m(context, iL, "e");
            android.util.Log.e("GooglePlayServicesUtil", defpackage.a.bj(iL, "GooglePlayServices not available due to error "));
            if (intentM != null) {
                throw new defpackage.aacm(iL, "Google Play Services not available", intentM);
            }
            throw new defpackage.aacl(iL);
        }
    }

    public static boolean e(android.content.Context context) {
        try {
            if (!b) {
                android.content.pm.PackageInfo packageInfoC = defpackage.aaiy.b(context).c("com.google.android.gms", 134217792);
                defpackage.aaco.a(context);
                if (packageInfoC == null || defpackage.aaco.d(packageInfoC, false) || !defpackage.aaco.d(packageInfoC, true)) {
                    a = false;
                } else {
                    a = true;
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            android.util.Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
        } finally {
            b = true;
        }
        return a || !"user".equals(android.os.Build.TYPE);
    }

    @java.lang.Deprecated
    public static boolean f(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    public static boolean g(android.content.Context context) {
        try {
            java.util.Iterator<android.content.pm.PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.Exception unused) {
            return false;
        }
    }
}
