package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aabl {
    private final android.content.Context a;
    private int b;
    private int c = 0;

    public aabl(android.content.Context context) {
        this.a = context;
    }

    public final synchronized int a() {
        android.content.pm.PackageInfo packageInfoC;
        if (this.b == 0) {
            try {
                packageInfoC = defpackage.aaiy.b(this.a).c("com.google.android.gms", 0);
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                android.util.Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfoC = null;
            }
            if (packageInfoC != null) {
                this.b = packageInfoC.versionCode;
            }
        }
        return this.b;
    }

    public final synchronized int b() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        android.content.Context context = this.a;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (((android.content.Context) defpackage.aaiy.b(context).a).getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            android.util.Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        android.content.Intent intent = new android.content.Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        java.util.List<android.content.pm.ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) {
            android.util.Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            this.c = 2;
        } else {
            this.c = 2;
        }
        return 2;
    }
}
