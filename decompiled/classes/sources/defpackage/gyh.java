package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class gyh extends defpackage.aoof implements defpackage.aonn {
    public static final defpackage.gyh a = new defpackage.gyh();

    public gyh() {
        super(2, defpackage.gyi.class, "isServiceEnabled", "isServiceEnabled(Landroid/content/pm/PackageManager;Landroid/content/ComponentName;)Z", 1);
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        android.content.pm.PackageManager packageManager = (android.content.pm.PackageManager) obj;
        android.content.ComponentName componentName = (android.content.ComponentName) obj2;
        if (packageManager == null) {
            defpackage.aooh.i("p0");
        }
        if (componentName == null) {
            defpackage.aooh.i("p1");
        }
        java.lang.String str = defpackage.gyi.a;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        boolean zBooleanValue = false;
        if (componentEnabledSetting == 0) {
            java.util.HashMap map = defpackage.gyi.b;
            synchronized (map) {
                java.lang.Boolean bool = (java.lang.Boolean) map.get(componentName);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        android.content.pm.ServiceInfo serviceInfo = packageManager.getServiceInfo(componentName, 512);
                        if (serviceInfo != null) {
                            zBooleanValue = ((android.content.pm.ComponentInfo) serviceInfo).enabled;
                        }
                    } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                        defpackage.gsh.a();
                        android.util.Log.w(defpackage.gyi.a, java.lang.String.valueOf(componentName.getClassName()).concat(" could not be found in manifest"), e);
                    }
                    java.util.HashMap map2 = defpackage.gyi.b;
                    synchronized (map2) {
                        map2.put(componentName, java.lang.Boolean.valueOf(zBooleanValue));
                    }
                }
            }
        } else if (componentEnabledSetting == 1) {
            zBooleanValue = true;
        }
        return java.lang.Boolean.valueOf(zBooleanValue);
    }
}
