package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
@java.lang.Deprecated
public final class mfk extends android.database.sqlite.SQLiteOpenHelper {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/database/DialerDatabaseHelper");
    private static defpackage.mfk d;
    public final android.content.Context b;
    public final defpackage.ahda c;

    private mfk(android.content.Context context) {
        super(context, "dialer.db", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 90013);
        this.c = new defpackage.ahda();
        this.b = (android.content.Context) j$.util.Objects.requireNonNull(context, "Context must not be null");
    }

    public static defpackage.mfk a(android.content.Context context) {
        defpackage.mfk mfkVar = d;
        if (mfkVar != null) {
            return mfkVar;
        }
        defpackage.mfk mfkVar2 = new defpackage.mfk(context);
        d = mfkVar2;
        return mfkVar2;
    }

    private static void e(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String str2) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("property_key", str);
        contentValues.put("property_value", str2);
        sQLiteDatabase.replace("properties", null, contentValues);
    }

    private static void f(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cached_number_contacts");
        sQLiteDatabase.execSQL("CREATE TABLE cached_number_contacts (normalized_number TEXT PRIMARY KEY NOT NULL, number TEXT NOT NULL, phone_type INTEGER DEFAULT 0, phone_label TEXT,display_name TEXT, has_photo INTEGER DEFAULT 0, has_thumbnail INTEGER DEFAULT 0, photo_uri TEXT, time_last_updated LONG NOT NULL, source_name TEXT, source_type INTEGER DEFAULT 0, source_id TEXT, lookup_key TEXT, reported INTEGER DEFAULT 0, object_id TEXT, user_type INTEGER DEFAULT 0);");
        sQLiteDatabase.execSQL("CREATE INDEX cached_number_index ON cached_number_contacts (normalized_number);");
        e(sQLiteDatabase, "proprietary_database_version", "9");
    }

    private final void g(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS smartdial_table");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS properties");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS filtered_numbers_table");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS voicemail_archive_table");
        sQLiteDatabase.execSQL("CREATE TABLE smartdial_table (id INTEGER PRIMARY KEY AUTOINCREMENT,data_id INTEGER, phone_number TEXT,normalized_number TEXT,name_by_number TEXT,contact_id INTEGER,lookup_key TEXT,display_name TEXT, photo_id INTEGER, last_smartdial_update_time LONG, last_time_used LONG, times_used INTEGER, starred INTEGER, is_super_primary INTEGER, in_visible_group INTEGER, is_primary INTEGER, carrier_presence INTEGER NOT NULL DEFAULT 0);");
        sQLiteDatabase.execSQL("CREATE TABLE properties (property_key TEXT PRIMARY KEY, property_value TEXT );");
        e(sQLiteDatabase, "database_version", "13");
        android.content.SharedPreferences.Editor editorEdit = this.b.getSharedPreferences("com.android.dialer", 0).edit();
        editorEdit.putLong("last_updated_millis", 0L);
        editorEdit.apply();
    }

    private static int h(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        java.lang.String string;
        try {
            android.database.Cursor cursorQuery = sQLiteDatabase.query("properties", new java.lang.String[]{"property_value"}, "property_key=?", new java.lang.String[]{str}, null, null, null);
            string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
                    cursorQuery.close();
                } catch (java.lang.Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (string == null) {
                string = "";
            }
        } catch (android.database.sqlite.SQLiteException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).k(e)).m(defpackage.aioa.MEDIUM)).l("com/android/dialer/database/DialerDatabaseHelper", "getProperty", 423, "DialerDatabaseHelper.java")).y("failed to retrieve property for %s, returning the default value", str);
        }
        try {
            return java.lang.Integer.parseInt(string);
        } catch (java.lang.NumberFormatException unused) {
            return 0;
        }
    }

    public final synchronized defpackage.aify b(java.lang.String str) {
        java.lang.String str2;
        android.database.sqlite.SQLiteDatabase readableDatabase = getReadableDatabase();
        if (str.length() <= 1) {
            str2 = (defpackage.a.bk(str, "(normalized_number LIKE '", "%')") + " OR (REPLACE(name_by_number, '$', '') LIKE '" + str + "%')") + " OR (name_by_number LIKE '%$" + str + "%')";
        } else {
            java.lang.String str3 = defpackage.a.bk(str, "(normalized_number LIKE '%", "%')") + " OR (REPLACE(name_by_number, '$', '') LIKE '%" + str + "%')";
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                sb.append("%$");
                sb.append(cCharAt);
            }
            sb.append('%');
            str2 = str3 + " OR (name_by_number LIKE '" + sb.toString() + "')";
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/database/DialerDatabaseHelper", "getLooseMatchesWhereClaus", 1115, "DialerDatabaseHelper.java")).v("Apply substring search and name initial search");
        }
        android.database.Cursor cursorQuery = readableDatabase.query("smartdial_table", new java.lang.String[]{"data_id", "display_name", "photo_id", "phone_number", "contact_id", "lookup_key", "carrier_presence"}, str2, null, null, null, "smartdial_table.starred DESC, smartdial_table.is_super_primary DESC, (CASE WHEN ( ?1 - smartdial_table.last_time_used) < 259200000 THEN 0  WHEN ( ?1 - smartdial_table.last_time_used) < 2592000000 THEN 1  ELSE 2 END), smartdial_table.times_used DESC, smartdial_table.in_visible_group DESC, smartdial_table.display_name, smartdial_table.contact_id, smartdial_table.is_primary DESC");
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/database/DialerDatabaseHelper", "getLooseMatches", 994, "DialerDatabaseHelper.java")).w("Received %d entries from the Smart Dial Table", cursorQuery.getCount());
        defpackage.aift aiftVar = new defpackage.aift(4);
        if (cursorQuery == null) {
            return aiftVar.g();
        }
        try {
            java.util.HashSet hashSet = new java.util.HashSet();
            long jLongValue = ((java.lang.Long) ((defpackage.mfi) defpackage.agab.aH(this.b, defpackage.mfi.class)).hW().a()).longValue();
            int i2 = 0;
            while (cursorQuery.moveToNext() && i2 < jLongValue) {
                if (cursorQuery.isNull(0)) {
                    ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/database/DialerDatabaseHelper", "getLooseMatches", 1017, "DialerDatabaseHelper.java")).v("_id column null. Row was deleted during iteration, skipping");
                } else {
                    long j = cursorQuery.getLong(0);
                    java.lang.String string = cursorQuery.getString(1);
                    java.lang.String string2 = cursorQuery.getString(3);
                    long j2 = cursorQuery.getLong(4);
                    long j3 = cursorQuery.getLong(2);
                    java.lang.String string3 = cursorQuery.getString(5);
                    int i3 = cursorQuery.getInt(6);
                    if (string == null) {
                        throw new java.lang.NullPointerException("Null displayName");
                    }
                    if (string2 == null) {
                        throw new java.lang.NullPointerException("Null phoneNumber");
                    }
                    if (string3 == null) {
                        throw new java.lang.NullPointerException("Null lookupKey");
                    }
                    mfj mfjVar = new mfj(j2, j, string, string2, string3, j3, i3);
                    if (!hashSet.contains(mfjVar.toString())) {
                        hashSet.add(mfjVar.toString());
                        aiftVar.i(mfjVar);
                        i2++;
                    }
                }
            }
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/database/DialerDatabaseHelper", "getLooseMatches", 1047, "DialerDatabaseHelper.java")).w("Display %d contacts on the search result page", i2);
            cursorQuery.close();
            return aiftVar.g();
        } catch (java.lang.Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    public final void c() {
        getWritableDatabase().execSQL("DELETE FROM cached_number_contacts WHERE time_last_updated<?", new java.lang.String[]{java.lang.Long.toString(java.lang.System.currentTimeMillis() - 2592000000L)});
    }

    public final void d(defpackage.rmt rmtVar) {
        getWritableDatabase().execSQL("DELETE FROM cached_number_contacts WHERE source_type=?", new java.lang.String[]{java.lang.Integer.toString(rmtVar.q)});
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        g(sQLiteDatabase);
        f(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int iH = h(sQLiteDatabase, "database_version");
        int i3 = 0;
        if (iH == 0) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/database/DialerDatabaseHelper", "upgradeLegacyAospTables", (char) 279, "DialerDatabaseHelper.java")).v("malformed database version, recreating database");
            iH = 0;
        }
        if (iH < 4) {
            g(sQLiteDatabase);
        } else {
            if (iH < 7) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS filtered_numbers_table");
                iH = 7;
            }
            if (iH < 8) {
                sQLiteDatabase.execSQL("ALTER TABLE smartdial_table ADD carrier_presence INTEGER NOT NULL DEFAULT 0");
                iH = 8;
            }
            if (iH < 10) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS voicemail_archive_table");
                iH = 10;
            }
            if (iH < 11) {
                sQLiteDatabase.execSQL("ALTER TABLE smartdial_table ADD name_by_number TEXT ");
                sQLiteDatabase.execSQL("ALTER TABLE smartdial_table ADD normalized_number TEXT ");
                iH = 11;
            }
            if (iH < 12) {
                android.database.Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT DISTINCT phone_number FROM smartdial_table", new java.lang.String[0]);
                if (cursorRawQuery != null) {
                    try {
                        if (cursorRawQuery.getCount() != 0) {
                            try {
                                sQLiteDatabase.beginTransaction();
                                while (cursorRawQuery.moveToNext()) {
                                    if (cursorRawQuery.isNull(0)) {
                                        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/database/DialerDatabaseHelper", "insertAllNormalizedNumber", 595, "DialerDatabaseHelper.java")).v("Row was deleted during iteration, skipping");
                                    } else {
                                        java.lang.String string = cursorRawQuery.getString(0);
                                        java.lang.String strJ = defpackage.vwb.j(this.b, string);
                                        android.content.ContentValues contentValues = new android.content.ContentValues();
                                        contentValues.put("normalized_number", strJ);
                                        sQLiteDatabase.update("smartdial_table", contentValues, "phone_number = ?", new java.lang.String[]{string});
                                    }
                                }
                                sQLiteDatabase.setTransactionSuccessful();
                                sQLiteDatabase.endTransaction();
                            } catch (java.lang.Throwable th) {
                                sQLiteDatabase.endTransaction();
                                throw th;
                            }
                        }
                        cursorRawQuery.close();
                    } catch (java.lang.Throwable th2) {
                        try {
                            cursorRawQuery.close();
                            throw th2;
                        } catch (java.lang.Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                }
                android.database.Cursor cursorRawQuery2 = sQLiteDatabase.rawQuery("SELECT DISTINCT display_name FROM smartdial_table", new java.lang.String[0]);
                if (cursorRawQuery2 != null) {
                    try {
                        if (cursorRawQuery2.getCount() != 0) {
                            try {
                                sQLiteDatabase.beginTransaction();
                                while (cursorRawQuery2.moveToNext()) {
                                    if (cursorRawQuery2.isNull(0)) {
                                        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/database/DialerDatabaseHelper", "insertAllNameMappedNumber", 640, "DialerDatabaseHelper.java")).v("Row was deleted during iteration, skipping");
                                    } else {
                                        java.lang.String string2 = cursorRawQuery2.getString(0);
                                        java.lang.String strG = defpackage.vwb.g(this.b, string2);
                                        android.content.ContentValues contentValues2 = new android.content.ContentValues();
                                        contentValues2.put("name_by_number", strG);
                                        sQLiteDatabase.update("smartdial_table", contentValues2, "display_name = ?", new java.lang.String[]{string2});
                                    }
                                }
                                sQLiteDatabase.setTransactionSuccessful();
                                sQLiteDatabase.endTransaction();
                            } catch (java.lang.Throwable th4) {
                                sQLiteDatabase.endTransaction();
                                throw th4;
                            }
                        }
                        cursorRawQuery2.close();
                    } catch (java.lang.Throwable th5) {
                        try {
                            cursorRawQuery2.close();
                            throw th5;
                        } catch (java.lang.Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                }
                iH = 12;
            }
            if (iH < 13) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS prefix_table");
            } else if (iH != 13) {
                throw new java.lang.IllegalStateException("error upgrading the database to version 13");
            }
            e(sQLiteDatabase, "database_version", "13");
        }
        int iH2 = h(sQLiteDatabase, "proprietary_database_version");
        if (iH2 == 0) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/database/DialerDatabaseHelper", "upgradeCachedNumberContactsTable", (char) 358, "DialerDatabaseHelper.java")).v("malformed database version, recreating database");
        } else {
            i3 = iH2;
        }
        if (i3 < 6) {
            f(sQLiteDatabase);
            return;
        }
        if (i3 < 7) {
            sQLiteDatabase.execSQL("ALTER TABLE cached_number_contacts ADD reported INTEGER;");
        }
        if (i3 < 8) {
            sQLiteDatabase.execSQL("ALTER TABLE cached_number_contacts ADD object_id TEXT;");
        }
        if (i3 < 9) {
            sQLiteDatabase.execSQL("ALTER TABLE cached_number_contacts ADD user_type INTEGER DEFAULT 0;");
        }
        e(sQLiteDatabase, "proprietary_database_version", "9");
    }
}
