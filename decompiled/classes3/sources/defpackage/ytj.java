package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ytj {
    public static final aimz a = aimz.i("com/google/android/callcoreshared/aicore/ondeviceversion/OnDeviceVersion");
    public static final java.util.Set b = ajsz.cW(new java.lang.String[]{"com.google.android.apps.aicore.service.AiCoreService", "com.google.android.apps.aicore.service.multiuser.AiCoreMultiUserService"});
    public final android.content.Context c;
    public final aoin d;
    private final aolr e;

    public ytj(android.content.Context context, aolr aolrVar, aoin aoinVar) {
        aooh.f(context, "applicationContext");
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(aoinVar, "enableAicoreServiceEnabledCheck");
        this.c = context;
        this.e = aolrVar;
        this.d = aoinVar;
    }

    public final android.content.pm.PackageInfo a(java.lang.String str) {
        try {
            android.content.pm.PackageManager packageManager = this.c.getPackageManager();
            return android.os.Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(str, android.content.pm.PackageManager.PackageInfoFlags.of(516L)) : packageManager.getPackageInfo(str, 516);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/google/android/callcoreshared/aicore/ondeviceversion/OnDeviceVersion", "packageInfoOf", 99, "OnDeviceVersion.kt").y("packageInfoOf null: %s", str);
            return null;
        }
    }

    public final java.lang.Object b(java.lang.String str, aoln aolnVar) {
        return aoov.aj(this.e, new defpackage.tyf(this, str, (aoln) null, 9), aolnVar);
    }
}
