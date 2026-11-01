package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class srm extends android.database.sqlite.SQLiteOpenHelper {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/phonelookup/database/PhoneLookupHistoryDatabaseHelper");

    public srm(android.content.Context context) {
        super(context.getApplicationContext(), "phone_lookup_history.db", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/phonelookup/database/PhoneLookupHistoryDatabaseHelper", "onCreate", 55, "PhoneLookupHistoryDatabaseHelper.java")).v("onCreate");
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        sQLiteDatabase.execSQL("create table if not exists PhoneLookupHistory (normalized_number text primary key not null, phone_lookup_info blob not null, last_modified long not null);");
        sQLiteDatabase.execSQL("create index last_modified_index on PhoneLookupHistory (last_modified);");
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/phonelookup/database/PhoneLookupHistoryDatabaseHelper", "onCreate", 60, "PhoneLookupHistoryDatabaseHelper.java")).x("took: %dms", android.os.SystemClock.uptimeMillis() - jUptimeMillis);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
