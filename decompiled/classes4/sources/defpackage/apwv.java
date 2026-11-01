package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apwv {
    private static final java.lang.Object a = new java.lang.Object();
    private static int b;

    public static java.lang.String a(android.content.Context context, defpackage.apvp apvpVar, java.lang.String str) {
        int i;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (apvpVar != defpackage.apvp.CRONET_SOURCE_PLATFORM || defpackage.apvu.a(context).getBoolean("android.net.http.UseLegacyDefaultUserAgent", false)) {
            sb.append(context.getPackageName());
            sb.append('/');
            synchronized (a) {
                i = b;
                if (i == 0) {
                    try {
                        i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                        b = i;
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                        throw new java.lang.IllegalStateException("Cannot determine package version");
                    }
                }
            }
            sb.append(i);
        } else {
            sb.append("AndroidHttpClient");
        }
        sb.append(" (Linux; U; Android ");
        sb.append(android.os.Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(java.util.Locale.getDefault().toString());
        java.lang.String str2 = android.os.Build.MODEL;
        if (str2.length() > 0) {
            sb.append("; ");
            sb.append(str2);
        }
        java.lang.String str3 = android.os.Build.ID;
        if (str3.length() > 0) {
            sb.append("; Build/");
            sb.append(str3);
        }
        sb.append("; Cronet/");
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
