package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class uj extends android.content.AsyncQueryHandler {
    final /* synthetic */ defpackage.uk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(defpackage.uk ukVar, android.content.ContentResolver contentResolver) {
        super(contentResolver);
        this.a = ukVar;
    }

    @Override // android.content.AsyncQueryHandler
    protected final void onQueryComplete(int i, java.lang.Object obj, android.database.Cursor cursor) {
        if (cursor == null) {
            android.util.Log.w("CarApp.Conn", "Null response from content provider when checking connection to the car, treating as disconnected");
            this.a.i(0);
            return;
        }
        int columnIndex = cursor.getColumnIndex("CarConnectionState");
        if (columnIndex < 0) {
            android.util.Log.e("CarApp.Conn", "Connection to car response is missing the connection type, treating as disconnected");
            this.a.i(0);
        } else if (cursor.moveToNext()) {
            this.a.i(java.lang.Integer.valueOf(cursor.getInt(columnIndex)));
        } else {
            android.util.Log.e("CarApp.Conn", "Connection to car response is empty, treating as disconnected");
            this.a.i(0);
        }
    }
}
