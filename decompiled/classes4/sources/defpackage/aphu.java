package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aphu implements defpackage.aphi {
    private final android.net.Uri a = android.net.Uri.parse("content://com.sonymobile.home.resourceprovider/badge");
    private android.content.AsyncQueryHandler b;

    @Override // defpackage.aphi
    public final java.util.List a() {
        return java.util.Arrays.asList("com.sonyericsson.home", "com.sonymobile.home", "com.sonymobile.launcher");
    }

    @Override // defpackage.aphi
    public final void b(android.content.Context context, android.content.ComponentName componentName, int i) {
        if (context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) == null) {
            android.content.Intent intent = new android.content.Intent("com.sonyericsson.home.action.UPDATE_BADGE");
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", java.lang.String.valueOf(i));
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i > 0);
            context.sendBroadcast(intent);
            return;
        }
        if (i >= 0) {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("badge_count", java.lang.Integer.valueOf(i));
            contentValues.put("package_name", componentName.getPackageName());
            contentValues.put("activity_name", componentName.getClassName());
            if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
                context.getApplicationContext().getContentResolver().insert(this.a, contentValues);
                return;
            }
            if (this.b == null) {
                this.b = new defpackage.apht(this, context.getApplicationContext().getContentResolver());
            }
            this.b.startInsert(0, null, this.a, contentValues);
        }
    }
}
