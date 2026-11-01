package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajxo {
    private final android.content.Context a;
    private java.lang.String b;
    private java.lang.String c;
    private int d;
    private int e = 0;

    public ajxo(android.content.Context context) {
        this.a = context;
    }

    private final android.content.pm.PackageInfo f(java.lang.String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.w("FirebaseMessaging", "Failed to find package ".concat(e.toString()));
            return null;
        }
    }

    private final synchronized void g() {
        android.content.pm.PackageInfo packageInfoF = f(this.a.getPackageName());
        if (packageInfoF != null) {
            this.b = java.lang.Integer.toString(packageInfoF.versionCode);
            this.c = packageInfoF.versionName;
        }
    }

    public final synchronized int a() {
        android.content.pm.PackageInfo packageInfoF;
        if (this.d == 0 && (packageInfoF = f("com.google.android.gms")) != null) {
            this.d = packageInfoF.versionCode;
        }
        return this.d;
    }

    final synchronized int b() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        android.content.pm.PackageManager packageManager = this.a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            android.util.Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        android.content.Intent intent = new android.content.Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        java.util.List<android.content.pm.ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
            android.util.Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
            this.e = 2;
        } else {
            this.e = 2;
        }
        return 2;
    }

    public final synchronized java.lang.String c() {
        if (this.b == null) {
            g();
        }
        return this.b;
    }

    public final synchronized java.lang.String d() {
        if (this.c == null) {
            g();
        }
        return this.c;
    }

    final boolean e() {
        return b() != 0;
    }
}
