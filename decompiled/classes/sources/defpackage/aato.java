package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aato {
    private static final java.lang.Object a;
    private static java.lang.reflect.Method b;
    private static boolean c;

    static {
        int i = defpackage.aaby.c;
        a = new java.lang.Object();
        b = null;
        c = false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x000f, B:8:0x0014, B:13:0x0036, B:14:0x003b, B:16:0x003d, B:18:0x0045, B:20:0x004a, B:23:0x0087, B:26:0x0099, B:27:0x009e, B:29:0x00a0, B:30:0x00ae, B:11:0x0020), top: B:39:0x000f, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0099 A[Catch: all -> 0x00b1, TryCatch #1 {, blocks: (B:5:0x000f, B:8:0x0014, B:13:0x0036, B:14:0x003b, B:16:0x003d, B:18:0x0045, B:20:0x004a, B:23:0x0087, B:26:0x0099, B:27:0x009e, B:29:0x00a0, B:30:0x00ae, B:11:0x0020), top: B:39:0x000f, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0 A[Catch: all -> 0x00b1, TryCatch #1 {, blocks: (B:5:0x000f, B:8:0x0014, B:13:0x0036, B:14:0x003b, B:16:0x003d, B:18:0x0045, B:20:0x004a, B:23:0x0087, B:26:0x0099, B:27:0x009e, B:29:0x00a0, B:30:0x00ae, B:11:0x0020), top: B:39:0x000f, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void a(android.content.Context context) throws defpackage.aacl, defpackage.aacm {
        android.content.Context context2;
        boolean z;
        android.content.Context contextC;
        if (context == null) {
            throw new java.lang.NullPointerException("Context must not be null");
        }
        defpackage.aacn.d(context, 11925000);
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        synchronized (a) {
            android.content.Context context3 = null;
            if (c) {
                z = c;
                contextC = defpackage.aacn.c(context);
                if (contextC != null) {
                    c = true;
                    if (!z) {
                        defpackage.aazc.z(contextC.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", new defpackage.acxg(android.content.Context.class, (java.lang.Object) context), new defpackage.acxg(java.lang.Long.TYPE, (java.lang.Object) java.lang.Long.valueOf(jUptimeMillis)), new defpackage.acxg(java.lang.Long.TYPE, (java.lang.Object) java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis())));
                    }
                    context3 = contextC;
                }
                if (context3 != null) {
                    b(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                } else {
                    android.util.Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new defpackage.aacl(8);
                }
            }
            try {
                context2 = defpackage.aalm.c(context, defpackage.aalm.b, "com.google.android.gms.providerinstaller.dynamite").c;
            } catch (defpackage.aali e) {
                android.util.Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(java.lang.String.valueOf(e.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                b(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            z = c;
            contextC = defpackage.aacn.c(context);
            if (contextC != null) {
                c = true;
                if (!z) {
                    try {
                        defpackage.aazc.z(contextC.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", new defpackage.acxg(android.content.Context.class, (java.lang.Object) context), new defpackage.acxg(java.lang.Long.TYPE, (java.lang.Object) java.lang.Long.valueOf(jUptimeMillis)), new defpackage.acxg(java.lang.Long.TYPE, (java.lang.Object) java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis())));
                    } catch (java.lang.Exception e2) {
                        android.util.Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e2.toString()));
                    }
                }
                context3 = contextC;
            }
            if (context3 != null) {
                b(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                return;
            } else {
                android.util.Log.e("ProviderInstaller", "Failed to get remote context");
                throw new defpackage.aacl(8);
            }
            throw th;
        }
    }

    private static void b(android.content.Context context, java.lang.String str) throws defpackage.aacl {
        try {
            java.lang.reflect.Method method = b;
            if (method == null) {
                method = context.getClassLoader().loadClass(str).getMethod("insertProvider", android.content.Context.class);
                b = method;
            }
            method.invoke(null, context);
        } catch (java.lang.Exception e) {
            java.lang.Throwable cause = e.getCause();
            if (android.util.Log.isLoggable("ProviderInstaller", 6)) {
                android.util.Log.e("ProviderInstaller", "Failed to install provider: ".concat(java.lang.String.valueOf(cause == null ? e.toString() : cause.toString())));
            }
            throw new defpackage.aacl(8);
        }
    }
}
