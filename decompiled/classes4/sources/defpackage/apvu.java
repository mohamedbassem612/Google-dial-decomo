package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apvu {
    private static final java.lang.Object a = new java.lang.Object();
    private static android.content.Context b;
    private static android.os.Bundle c;

    private apvu() {
    }

    public static android.os.Bundle a(android.content.Context context) {
        android.os.Bundle bundle;
        android.content.Context applicationContext = context.getApplicationContext();
        synchronized (a) {
            if (applicationContext != b) {
                android.content.pm.ServiceInfo serviceInfo = null;
                new xkn("CronetManifest#getMetaData fetching info", 3, (byte[]) null);
                try {
                    try {
                        serviceInfo = applicationContext.getPackageManager().getServiceInfo(new android.content.ComponentName(applicationContext, "android.net.http.MetaDataHolder"), 787072);
                    } catch (java.lang.Throwable th) {
                        try {
                            android.os.Trace.endSection();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException unused) {
                }
                c = (serviceInfo == null || serviceInfo.metaData == null) ? new android.os.Bundle() : serviceInfo.metaData;
                b = applicationContext;
                android.os.Trace.endSection();
            }
            bundle = c;
        }
        return bundle;
    }

    public static boolean b(android.content.Context context, defpackage.apvp apvpVar) {
        boolean z = true;
        if (apvpVar != defpackage.apvp.CRONET_SOURCE_PLATFORM && apvpVar != defpackage.apvp.CRONET_SOURCE_PLAY_SERVICES) {
            z = false;
        }
        return a(context).getBoolean("android.net.http.EnableTelemetry", z);
    }
}
