package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
@java.lang.Deprecated
public final class rlz {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/logging/appinfo/LegacyAppInfo");

    public static java.lang.String a(android.content.Context context) {
        try {
            java.lang.String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str != null ? str : "Version Name Not Found";
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/logging/appinfo/LegacyAppInfo", "getAppVersionName", '+', "LegacyAppInfo.java")).v("failed to get the app version name");
            return "Version Name Not Found";
        }
    }
}
