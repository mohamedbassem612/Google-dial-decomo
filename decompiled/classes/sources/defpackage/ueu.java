package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ueu extends android.database.sqlite.SQLiteOpenHelper {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/spam/inapp/SpamDatabaseHelper");
    public final android.content.Context b;
    private final defpackage.aogc c;

    public ueu(android.content.Context context, defpackage.aogc aogcVar) {
        super(context, "normalized_spam.db", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 3);
        this.b = context;
        this.c = aogcVar;
        setWriteAheadLoggingEnabled(true);
    }

    @java.lang.Deprecated
    static long a(android.content.Context context) {
        return context.getSharedPreferences(context.getPackageName(), 0).getLong("global_blacklist_experiment_id", 0L);
    }

    public static boolean d(android.content.Context context, long j, java.lang.String[] strArr, long j2) {
        android.content.SharedPreferences.Editor editorEdit = context.getSharedPreferences(context.getPackageName(), 0).edit();
        editorEdit.putLong("global_blacklist_version_v2", j);
        defpackage.acc accVar = new defpackage.acc(0);
        java.util.Collections.addAll(accVar, strArr);
        editorEdit.putStringSet("global_blacklist_country_codes", accVar);
        editorEdit.putLong("global_blacklist_experiment_id", j2);
        return editorEdit.commit();
    }

    public final android.database.sqlite.SQLiteDatabase b() {
        try {
            return getWritableDatabase();
        } catch (android.database.sqlite.SQLiteException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public final boolean c(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.util.List list) {
        if (list.size() == 0) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/spam/inapp/SpamDatabaseHelper", "bulkInsertNumbersToServerTable", 155, "SpamDatabaseHelper.java")).v("no numbers added to the spam list.");
            return true;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            contentValues.clear();
            contentValues.put("number", str);
            contentValues.put("created", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            if (sQLiteDatabase.insert("server_spam_table", null, contentValues) < 0) {
                return false;
            }
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/spam/inapp/SpamDatabaseHelper", "bulkInsertNumbersToServerTable", 168, "SpamDatabaseHelper.java")).w("inserted %d numbers into the server spam list.", list.size());
        return true;
    }

    public final long e(android.content.ContentValues contentValues) {
        return b().insertWithOnConflict("client_spam_table", null, contentValues, 5);
    }

    public final android.database.Cursor f(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2) {
        return getReadableDatabase().query(str, strArr, str2, strArr2, null, null, null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS server_spam_table (number TEXT PRIMARY KEY, created INTEGER NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS client_spam_table (number TEXT PRIMARY KEY, spam_status INTEGER, created INTEGER NOT NULL, client_meta_data BLOB);");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aoss, java.lang.Object] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase.isReadOnly()) {
            return;
        }
        defpackage.aogc aogcVar = this.c;
        defpackage.aooh.f(sQLiteDatabase, "database");
        defpackage.aoov.an(aogcVar.b, null, 0, new txm(aogcVar, sQLiteDatabase, (defpackage.aoln) null, 9), 3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        defpackage.ahvr.bN(i2 > i, "New version is not higher than old version");
        defpackage.ahvr.bP(i > 0, "Invalid old version: %s", i);
        defpackage.ahvr.bP(i2 > 0 && i2 <= 3, "Invalid new version: %s", i2);
        if (i < 2 && i2 >= 2) {
            sQLiteDatabase.execSQL("ALTER TABLE client_spam_table ADD COLUMN created INTEGER NOT NULL DEFAULT 0;");
            sQLiteDatabase.execSQL("ALTER TABLE server_spam_table ADD COLUMN created INTEGER NOT NULL DEFAULT 0;");
        }
        if (i >= 3 || i2 < 3) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE client_spam_table ADD COLUMN client_meta_data BLOB;");
    }
}
