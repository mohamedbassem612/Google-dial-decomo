package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajxr {
    private static defpackage.ajxr d;
    private java.lang.String e = null;
    public java.lang.Boolean a = null;
    public java.lang.Boolean b = null;
    public final java.util.Queue c = new java.util.ArrayDeque();

    private ajxr() {
    }

    public static synchronized defpackage.ajxr a() {
        defpackage.ajxr ajxrVar;
        ajxrVar = d;
        if (ajxrVar == null) {
            ajxrVar = new defpackage.ajxr();
            d = ajxrVar;
        }
        return ajxrVar;
    }

    public final synchronized java.lang.String b(android.content.Context context, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String strConcat;
        str = this.e;
        if (str == null) {
            android.content.pm.ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            str = null;
            if (resolveInfoResolveService == null || resolveInfoResolveService.serviceInfo == null) {
                android.util.Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            } else {
                android.content.pm.ServiceInfo serviceInfo = resolveInfoResolveService.serviceInfo;
                if (!context.getPackageName().equals(serviceInfo.packageName) || serviceInfo.name == null) {
                    android.util.Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + '/' + serviceInfo.name);
                } else {
                    if (serviceInfo.name.startsWith(".")) {
                        strConcat = java.lang.String.valueOf(context.getPackageName()).concat(java.lang.String.valueOf(serviceInfo.name));
                        this.e = strConcat;
                    } else {
                        strConcat = serviceInfo.name;
                        this.e = strConcat;
                    }
                    str = strConcat;
                }
            }
        }
        return str;
    }

    public final boolean c(android.content.Context context) {
        java.lang.Boolean boolValueOf = this.a;
        if (boolValueOf == null) {
            boolValueOf = java.lang.Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
            this.a = boolValueOf;
        }
        if (!boolValueOf.booleanValue() && android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            android.util.Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.a.booleanValue();
    }
}
