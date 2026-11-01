package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aphq implements defpackage.aphi {
    @Override // defpackage.aphi
    public final java.util.List a() {
        return java.util.Arrays.asList("com.teslacoilsw.launcher");
    }

    @Override // defpackage.aphi
    public final void b(android.content.Context context, android.content.ComponentName componentName, int i) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("tag", componentName.getPackageName() + '/' + componentName.getClassName());
        contentValues.put("count", java.lang.Integer.valueOf(i));
        context.getContentResolver().insert(android.net.Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }
}
