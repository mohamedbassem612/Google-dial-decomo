package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aapo {
    public static java.lang.String b = "0";
    private static final java.lang.String c = "aapo";
    private static aalm e;
    private static boolean f;
    private static final aaby d = aaby.d;
    public static final java.lang.Object a = new java.lang.Object();

    private aapo() {
    }

    public static aalm a() {
        aalm aalmVar;
        synchronized (a) {
            aalmVar = e;
        }
        return aalmVar;
    }

    @java.lang.Deprecated
    public static void b(android.content.Context context) {
        synchronized (a) {
            if (c()) {
                return;
            }
            defpackage.aapq aapqVar = new defpackage.aapq(context, 37401, 1.0f);
            try {
                new defpackage.xkn("PlayServices CronetProviderInstaller#installIfNeeded", 2);
                try {
                    aais.at(context, "Context must not be null");
                    if (com.google.android.gms.net.HttpEngineProviderSingleton.getInstance(context).shouldUseHttpEngine()) {
                        f = true;
                        aapqVar.a();
                        android.os.Trace.endSection();
                        aapqVar.close();
                        return;
                    }
                    java.lang.ClassLoader classLoader = defpackage.aapo.class.getClassLoader();
                    aais.as(classLoader);
                    try {
                        classLoader.loadClass("org.chromium.net.CronetEngine");
                        new defpackage.xkn("PlayServices CronetProviderInstaller#installIfNeeded verifyGooglePlayServicesIsAvailable", 2);
                        try {
                            aacn.d(context, 11925000);
                            android.os.Trace.endSection();
                            try {
                                new defpackage.xkn("CronetProviderInstaller#installIfNeeded DynamiteModule#load", 2);
                                try {
                                    aalm aalmVarC = aalm.c(context, aalm.a, "com.google.android.gms.cronet_dynamite");
                                    android.os.Trace.endSection();
                                    try {
                                        new defpackage.xkn("PlayServices CronetProviderInstaller#installIfNeeded loading class", 2);
                                        try {
                                            java.lang.Class<?> clsLoadClass = aalmVarC.c.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                                            if (clsLoadClass.getClassLoader() == defpackage.aapo.class.getClassLoader()) {
                                                android.util.Log.e(c, "ImplVersion class is missing from Cronet module.");
                                                throw new aacl(8);
                                            }
                                            java.lang.reflect.Method method = clsLoadClass.getMethod("getApiLevel", null);
                                            java.lang.reflect.Method method2 = clsLoadClass.getMethod("getCronetVersion", null);
                                            java.lang.Integer num = (java.lang.Integer) method.invoke(null, null);
                                            aais.as(num);
                                            int iIntValue = num.intValue();
                                            java.lang.String str = (java.lang.String) method2.invoke(null, null);
                                            aais.as(str);
                                            b = str;
                                            android.os.Trace.endSection();
                                            if (iIntValue >= 3) {
                                                e = aalmVarC;
                                                aapqVar.a();
                                                android.os.Trace.endSection();
                                                aapqVar.close();
                                                return;
                                            }
                                            android.content.Intent intentM = d.m(context, 2, "cr");
                                            if (intentM == null) {
                                                android.util.Log.e(c, "Unable to fetch error resolution intent");
                                                throw new aacl(2);
                                            }
                                            throw new aacm(2, "Google Play Services update is required. The API Level of the client is 3. The API Level of the implementation is " + iIntValue + ". The Cronet implementation version is " + b, intentM);
                                        } catch (java.lang.Throwable th) {
                                            try {
                                                android.os.Trace.endSection();
                                            } catch (java.lang.Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            throw th;
                                        }
                                    } catch (java.lang.Exception e2) {
                                        android.util.Log.e(c, "Unable to read Cronet version from the Cronet module ", e2);
                                        throw new aacl(8).initCause(e2);
                                    }
                                } catch (java.lang.Throwable th3) {
                                    try {
                                        android.os.Trace.endSection();
                                    } catch (java.lang.Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            } catch (aali e3) {
                                android.util.Log.e(c, "Unable to load Cronet module", e3);
                                throw new aacl(8).initCause(e3);
                            }
                        } catch (java.lang.Throwable th5) {
                            try {
                                android.os.Trace.endSection();
                            } catch (java.lang.Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    } catch (java.lang.ClassNotFoundException e4) {
                        android.util.Log.e(c, "Cronet API is not available. Have you included all required dependencies?");
                        throw new aacl(10).initCause(e4);
                    }
                } catch (java.lang.Throwable th7) {
                    try {
                        android.os.Trace.endSection();
                    } catch (java.lang.Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
            } catch (java.lang.Throwable th9) {
                aapqVar.close();
                throw th9;
            }
            try {
                aapqVar.close();
            } catch (java.lang.Throwable th10) {
                th9.addSuppressed(th10);
            }
            throw th9;
        }
    }

    public static boolean c() {
        boolean z;
        synchronized (a) {
            z = true;
            if (!f) {
                z = a() != null;
            }
        }
        return z;
    }
}
