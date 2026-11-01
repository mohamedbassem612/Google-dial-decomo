package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aphs implements defpackage.aphi {
    private static final java.lang.String[] a = {"_id", "class"};
    private final defpackage.aphl b = new defpackage.aphl(1);

    private static final android.content.ContentValues c(android.content.ComponentName componentName, int i, boolean z) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", java.lang.Integer.valueOf(i));
        return contentValues;
    }

    @Override // defpackage.aphi
    public final java.util.List a() {
        return java.util.Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    @Override // defpackage.aphi
    public final void b(android.content.Context context, android.content.ComponentName componentName, int i) throws java.lang.Throwable {
        java.lang.Throwable th;
        android.database.Cursor cursorQuery;
        if (aoog.f(context, new android.content.Intent("android.intent.action.BADGE_COUNT_UPDATE"))) {
            this.b.b(context, componentName, i);
            return;
        }
        android.net.Uri uri = android.net.Uri.parse("content://com.sec.badge/apps?notify=true");
        android.content.ContentResolver contentResolver = context.getContentResolver();
        try {
            cursorQuery = contentResolver.query(uri, a, "package=?", new java.lang.String[]{componentName.getPackageName()}, null);
            if (cursorQuery != null) {
                try {
                    java.lang.String className = componentName.getClassName();
                    boolean zEquals = false;
                    while (cursorQuery.moveToNext()) {
                        contentResolver.update(uri, c(componentName, i, false), "_id=?", new java.lang.String[]{java.lang.String.valueOf(cursorQuery.getInt(0))});
                        zEquals |= className.equals(cursorQuery.getString(cursorQuery.getColumnIndex("class")));
                    }
                    if (!zEquals) {
                        contentResolver.insert(uri, c(componentName, i, true));
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    aoog.e(cursorQuery);
                    throw th;
                }
            }
            aoog.e(cursorQuery);
        } catch (java.lang.Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
    }
}
