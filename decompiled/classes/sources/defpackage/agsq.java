package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agsq {
    private static final defpackage.aimz a = defpackage.aimz.i("com/google/apps/tiktok/concurrent/DefaultForegroundServiceType");
    private final android.content.Context b;

    public agsq(android.content.Context context) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        this.b = context;
    }

    public final int a() {
        boolean z;
        int i = android.os.Build.VERSION.SDK_INT;
        int i2 = this.b.getApplicationInfo().targetSdkVersion;
        if (i2 >= 34) {
            z = true;
        } else {
            ((defpackage.aimw) a.b().l("com/google/apps/tiktok/concurrent/DefaultForegroundServiceType", "isTargetSdkAtLeastU", 61, "DefaultForegroundServiceType.kt")).z("targetSdk (%d) >= VERSION_CODES.UPSIDE_DOWN_CAKE (%d) == false", i2, 34);
            z = false;
        }
        boolean z2 = i >= 34;
        if (!z2 || !z) {
            ((defpackage.aimw) a.b().l("com/google/apps/tiktok/concurrent/DefaultForegroundServiceType", "get", 33, "DefaultForegroundServiceType.kt")).L("BuildCompat.isAtLeastU()=%b, isTargetSdkAtLeastU()=%b", z2, z);
        }
        return (z2 && z) ? 2048 : 0;
    }
}
