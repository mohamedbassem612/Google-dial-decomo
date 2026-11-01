package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class upp extends android.database.sqlite.SQLiteOpenHelper {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/speeddial/database/SpeedDialEntryDatabaseHelper");

    public upp(android.content.Context context) {
        super(context, "CPSpeedDialEntry", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 4);
    }

    public static defpackage.aigf b(android.database.sqlite.SQLiteDatabase sQLiteDatabase, defpackage.aify aifyVar) {
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/speeddial/database/SpeedDialEntryDatabaseHelper", "insert", 271, "SpeedDialEntryDatabaseHelper.java")).v("enter");
        defpackage.aigb aigbVar = new defpackage.aigb(4);
        int size = aifyVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/speeddial/database/SpeedDialEntryDatabaseHelper", "insert", 284, "SpeedDialEntryDatabaseHelper.java")).v("exiting");
                return aigbVar.e(true);
            }
            upo upoVar = (upo) aifyVar.get(i);
            defpackage.ahvr.bM(upoVar.a == null);
            long jInsert = sQLiteDatabase.insert("speed_dial_entries", null, f(upoVar, false));
            if (jInsert == -1) {
                throw new java.lang.UnsupportedOperationException("Attempted to insert a row that already exists.");
            }
            aigbVar.i(upoVar, java.lang.Long.valueOf(jInsert));
            i++;
        }
    }

    public static void c(android.database.sqlite.SQLiteDatabase sQLiteDatabase, defpackage.aify aifyVar) {
        j$.lang.Iterable.-EL.forEach(defpackage.ahvr.bf(aifyVar, 999), new oxs(sQLiteDatabase, 17));
    }

    public static void e(android.database.sqlite.SQLiteDatabase sQLiteDatabase, defpackage.aify aifyVar) {
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/speeddial/database/SpeedDialEntryDatabaseHelper", "update", 321, "SpeedDialEntryDatabaseHelper.java")).v("enter");
        int size = aifyVar.size();
        int i = 0;
        while (i < size) {
            upo upoVar = (upo) aifyVar.get(i);
            int iUpdate = sQLiteDatabase.update("speed_dial_entries", f(upoVar, true), "id = ?", new java.lang.String[]{java.lang.Long.toString(upoVar.a.longValue())});
            i++;
            if (iUpdate != 1) {
                throw new java.lang.UnsupportedOperationException(defpackage.a.bj(iUpdate, "Attempted to update an undetermined number of rows: "));
            }
        }
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/speeddial/database/SpeedDialEntryDatabaseHelper", "update", 334, "SpeedDialEntryDatabaseHelper.java")).v("exiting");
    }

    private static android.content.ContentValues f(upo upoVar, boolean z) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/speeddial/database/SpeedDialEntryDatabaseHelper", "buildContentValues", 346, "SpeedDialEntryDatabaseHelper.java")).v("enter");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (z) {
            contentValues.put("id", upoVar.a);
        }
        j$.util.Optional optional = upoVar.b;
        if (optional.isPresent()) {
            contentValues.put("pinned_position", (java.lang.Integer) optional.orElseThrow());
        }
        contentValues.put("contact_id", java.lang.Long.valueOf(upoVar.c));
        contentValues.put("lookup_key", upoVar.d);
        contentValues.put("source_id", upoVar.e);
        upl uplVar = upoVar.f;
        if (uplVar != null) {
            contentValues.put("phone_number", uplVar.c);
            contentValues.put("phone_type", java.lang.Long.valueOf(uplVar.d));
            contentValues.put("phone_label", uplVar.e);
            upk upkVarB = upk.b(uplVar.f);
            if (upkVarB == null) {
                upkVarB = upk.f;
            }
            contentValues.put("phone_technology", java.lang.Integer.valueOf(upkVarB.a()));
        }
        return contentValues;
    }

    public final defpackage.aify a() {
        upl uplVar;
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/speeddial/database/SpeedDialEntryDatabaseHelper", "getAllEntries", 208, "SpeedDialEntryDatabaseHelper.java")).v("enter");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.sqlite.SQLiteDatabase readableDatabase = getReadableDatabase();
        try {
            android.database.Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT * FROM speed_dial_entries", null);
            try {
                cursorRawQuery.moveToPosition(-1);
                while (cursorRawQuery.moveToNext()) {
                    java.lang.String string = cursorRawQuery.getString(4);
                    if (android.text.TextUtils.isEmpty(string)) {
                        uplVar = null;
                    } else {
                        defpackage.akzx akzxVarM = upl.a.m();
                        akzxVarM.u();
                        upl uplVar2 = akzxVarM.b;
                        j$.util.Objects.requireNonNull(string);
                        uplVar2.b |= 1;
                        uplVar2.c = string;
                        long j = cursorRawQuery.getInt(5);
                        akzxVarM.u();
                        upl uplVar3 = akzxVarM.b;
                        uplVar3.b |= 2;
                        uplVar3.d = j;
                        java.lang.String str = (java.lang.String) j$.util.Optional.ofNullable(cursorRawQuery.getString(6)).orElse("");
                        akzxVarM.u();
                        upl uplVar4 = akzxVarM.b;
                        j$.util.Objects.requireNonNull(str);
                        uplVar4.b |= 4;
                        uplVar4.e = str;
                        upk upkVarB = upk.b(cursorRawQuery.getInt(7));
                        akzxVarM.u();
                        upl uplVar5 = akzxVarM.b;
                        uplVar5.f = upkVarB.a();
                        uplVar5.b |= 8;
                        uplVar = (upl) akzxVarM.r();
                    }
                    j$.util.Optional optionalOf = j$.util.Optional.of(java.lang.Integer.valueOf(cursorRawQuery.getInt(1)));
                    if (((java.lang.Integer) optionalOf.orElse(-1)).intValue() == -1) {
                        optionalOf = j$.util.Optional.empty();
                    }
                    adrp adrpVarA = upo.a();
                    adrpVarA.d = uplVar;
                    adrpVarA.n(cursorRawQuery.getLong(2));
                    adrpVarA.o(cursorRawQuery.getString(3));
                    adrpVarA.c = cursorRawQuery.getString(8);
                    adrpVarA.p(optionalOf);
                    adrpVarA.b = java.lang.Long.valueOf(cursorRawQuery.getLong(0));
                    arrayList.add(adrpVarA.m());
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                if (readableDatabase != null) {
                    readableDatabase.close();
                }
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/speeddial/database/SpeedDialEntryDatabaseHelper", "getAllEntries", 246, "SpeedDialEntryDatabaseHelper.java")).v("exiting");
                return defpackage.aify.n(arrayList);
            } catch (java.lang.Throwable th) {
                if (cursorRawQuery == null) {
                    throw th;
                }
                try {
                    cursorRawQuery.close();
                    throw th;
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (java.lang.Throwable th3) {
            if (readableDatabase == null) {
                throw th3;
            }
            try {
                readableDatabase.close();
                throw th3;
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public final void d(defpackage.aify aifyVar) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/speeddial/database/SpeedDialEntryDatabaseHelper", "update", 303, "SpeedDialEntryDatabaseHelper.java")).v("enter");
        if (aifyVar.isEmpty()) {
            return;
        }
        android.database.sqlite.SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            e(writableDatabase, aifyVar);
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
            writableDatabase.close();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists speed_dial_entries (id integer primary key, pinned_position integer DEFAULT -1, contact_id integer, lookup_key text, phone_number text, phone_type integer, phone_label text, phone_technology integer, source_id text );");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/speeddial/database/SpeedDialEntryDatabaseHelper", "onDowngrade", 201, "SpeedDialEntryDatabaseHelper.java")).v("DB version downgrade. Wipe data");
        sQLiteDatabase.execSQL("drop table if exists speed_dial_entries");
        sQLiteDatabase.execSQL("create table if not exists speed_dial_entries (id integer primary key, pinned_position integer DEFAULT -1, contact_id integer, lookup_key text, phone_number text, phone_type integer, phone_label text, phone_technology integer, source_id text );");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3;
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/speeddial/database/SpeedDialEntryDatabaseHelper", "onUpgrade", 138, "SpeedDialEntryDatabaseHelper.java")).v("enter");
        if (i < 2) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.d()).i(defpackage.zct.b)).l("com/android/dialer/speeddial/database/SpeedDialEntryDatabaseHelper", "onUpgrade", (char) 145, "SpeedDialEntryDatabaseHelper.java")).v("Unknown or unsupported database version to upgrade");
            sQLiteDatabase.execSQL("drop table if exists speed_dial_entries");
            sQLiteDatabase.execSQL("create table if not exists speed_dial_entries (id integer primary key, pinned_position integer DEFAULT -1, contact_id integer, lookup_key text, phone_number text, phone_type integer, phone_label text, phone_technology integer, source_id text );");
            return;
        }
        if (i < 3) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/speeddial/database/SpeedDialEntryDatabaseHelper", "onUpgrade", 152, "SpeedDialEntryDatabaseHelper.java")).v("Upgrading from V2 to V3");
            sQLiteDatabase.beginTransaction();
            try {
                try {
                    sQLiteDatabase.execSQL("create table if not exists speed_dial_entries_temp (id integer primary key, pinned_position integer DEFAULT -1, contact_id integer, lookup_key text, phone_number text, phone_type integer, phone_label text, phone_technology integer );");
                    sQLiteDatabase.execSQL("INSERT INTO speed_dial_entries_temp SELECT * FROM speed_dial_entries");
                    sQLiteDatabase.execSQL("drop table if exists speed_dial_entries");
                    sQLiteDatabase.execSQL("ALTER TABLE speed_dial_entries_temp RENAME TO speed_dial_entries");
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    i3 = 3;
                } catch (android.database.SQLException e) {
                    defpackage.aimz aimzVar2 = a;
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar2.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/speeddial/database/SpeedDialEntryDatabaseHelper", "onUpgrade", 166, "SpeedDialEntryDatabaseHelper.java")).v("Error upgrading SpeedDial database to V3");
                    sQLiteDatabase.endTransaction();
                    aimzVar = aimzVar2;
                    i3 = i;
                }
            } catch (java.lang.Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
        } else {
            i3 = i;
        }
        if (i < 4) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/speeddial/database/SpeedDialEntryDatabaseHelper", "onUpgrade", 173, "SpeedDialEntryDatabaseHelper.java")).v("Upgrading from V3 to V4");
            sQLiteDatabase.beginTransaction();
            try {
                try {
                    sQLiteDatabase.execSQL("alter table speed_dial_entries add column source_id text;");
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    i3 = 4;
                } catch (android.database.SQLException e2) {
                    defpackage.aimz aimzVar3 = a;
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar3.c()).i(defpackage.zct.b)).k(e2)).l("com/android/dialer/speeddial/database/SpeedDialEntryDatabaseHelper", "onUpgrade", 184, "SpeedDialEntryDatabaseHelper.java")).v("Error upgrading SpeedDial database to V4");
                    sQLiteDatabase.endTransaction();
                    aimzVar = aimzVar3;
                }
            } catch (java.lang.Throwable th2) {
                sQLiteDatabase.endTransaction();
                throw th2;
            }
        }
        if (i3 < i2) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.d()).i(defpackage.zct.b)).l("com/android/dialer/speeddial/database/SpeedDialEntryDatabaseHelper", "onUpgrade", (char) 193, "SpeedDialEntryDatabaseHelper.java")).v("Upgrade to the latest version failed");
            sQLiteDatabase.execSQL("drop table if exists speed_dial_entries");
            sQLiteDatabase.execSQL("create table if not exists speed_dial_entries (id integer primary key, pinned_position integer DEFAULT -1, contact_id integer, lookup_key text, phone_number text, phone_type integer, phone_label text, phone_technology integer, source_id text );");
        }
    }
}
