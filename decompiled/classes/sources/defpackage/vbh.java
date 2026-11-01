package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vbh extends android.database.sqlite.SQLiteOpenHelper {
    public vbh(android.content.Context context) {
        super(context, "voicemail.db", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE greeting (_id INTEGER PRIMARY KEY AUTOINCREMENT,phone_account_component_name TEXT NOT NULL,phone_account_id TEXT NOT NULL UNIQUE,duration INTEGER NOT NULL DEFAULT 0,_data TEXT NOT NULL )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
