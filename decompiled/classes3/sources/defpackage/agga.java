package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agga {
    private static final java.lang.String e = "agga";
    public final java.lang.String a;
    public final java.lang.String b;
    public final int c;
    public final android.content.res.Resources d;

    public agga(java.lang.String str, java.lang.String str2, int i, android.content.res.Resources resources) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = resources;
    }

    public static defpackage.agga a(android.content.Context context, android.os.Bundle bundle) {
        if (!bundle.containsKey("packageName") || !bundle.containsKey("resourceName") || !bundle.containsKey("resourceId")) {
            return null;
        }
        java.lang.String string = bundle.getString("packageName");
        java.lang.String string2 = bundle.getString("resourceName");
        int i = bundle.getInt("resourceId");
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            return new defpackage.agga(string, string2, i, packageManager.getResourcesForApplication(packageManager.getApplicationInfo(string, 512)));
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            android.os.Bundle bundle2 = bundle.getBundle("fallbackConfig");
            if (bundle2 == null) {
                return null;
            }
            android.util.Log.w(e, string + " not found, " + string2 + " fallback to default value");
            return a(context, bundle2);
        }
    }

    public final java.lang.String toString() {
        return "ResourceEntry{packageName=" + this.a + '/' + this.b + ",0x" + java.lang.Integer.toHexString(this.c) + '}';
    }
}
