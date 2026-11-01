package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mfp implements defpackage.rnt {
    private final android.content.Context a;
    private java.lang.String b;
    private boolean c;

    public mfp(android.content.Context context) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        this.a = context;
        this.b = "";
        this.c = true;
    }

    @Override // defpackage.emj
    public final void fn(defpackage.emx emxVar) {
        android.content.Context context = this.a;
        java.lang.String iSO3Language = defpackage.gus.ae(context).getISO3Language();
        defpackage.aooh.e(iSO3Language, "getISO3Language(...)");
        this.c = !defpackage.aooh.n(this.b, iSO3Language);
        this.b = iSO3Language;
        final defpackage.mfk mfkVarA = defpackage.mfk.a(context);
        final boolean z = this.c;
        android.content.Context context2 = mfkVarA.b;
        if (context2 != null && z) {
            ((defpackage.mfi) defpackage.agab.aH(context2, defpackage.mfi.class)).bt().o(defpackage.rmx.SMART_DIAL_FORCED_UPDATE);
        }
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(351, "DialerDatabaseHelper_startSmartDialUpdateThread", defpackage.ahot.a, true);
        try {
            defpackage.aify aifyVar = defpackage.zqz.a;
            if (defpackage.dvx.c(context2, "android.permission.READ_CONTACTS") == 0) {
                defpackage.agsm.i(352, mfkVarA.c.g(new java.util.concurrent.Callable() { // from class: mfh
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        java.lang.String str;
                        defpackage.aimz aimzVar = defpackage.mfk.a;
                        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/database/DialerDatabaseHelper", "updateSmartDialDatabase", 783, "DialerDatabaseHelper.java")).v("forceUpdate");
                        defpackage.mfk mfkVar = mfkVarA;
                        android.content.Context context3 = mfkVar.b;
                        android.database.sqlite.SQLiteDatabase writableDatabase = mfkVar.getWritableDatabase();
                        android.content.SharedPreferences sharedPreferences = context3.getSharedPreferences("com.android.dialer", 0);
                        long j = sharedPreferences.getLong("last_updated_millis", ((java.lang.Long) ((defpackage.mfi) defpackage.agab.aH(context3, defpackage.mfi.class)).ib().a()).longValue());
                        if (true == z) {
                            j = 0;
                        }
                        java.lang.String strValueOf = java.lang.String.valueOf(j);
                        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/database/DialerDatabaseHelper", "updateSmartDialDatabase", 798, "DialerDatabaseHelper.java")).y("last updated at %s", strValueOf);
                        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                        java.lang.Long lValueOf = java.lang.Long.valueOf(jCurrentTimeMillis);
                        android.database.Cursor cursorB = ((defpackage.mfi) defpackage.agab.aH(context3, defpackage.mfi.class)).aZ().b(defpackage.mfl.a, defpackage.mfl.b, "contact_deleted_timestamp > ?", new java.lang.String[]{strValueOf}, null);
                        java.lang.String str2 = "DialerDatabaseHelper.java";
                        if (cursorB == null) {
                            sharedPreferences = sharedPreferences;
                            lValueOf = lValueOf;
                        } else {
                            writableDatabase.beginTransaction();
                            try {
                                if (cursorB.moveToFirst()) {
                                    while (true) {
                                        if (cursorB.isNull(0)) {
                                            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/database/DialerDatabaseHelper", "removeDeletedContacts", 501, "DialerDatabaseHelper.java")).v("contact_id column null. Row was deleted during iteration, skipping");
                                        } else {
                                            defpackage.rsr rsrVarAI = new defpackage.kaw("contact_id").aI("=", java.lang.Long.valueOf(cursorB.getLong(0)));
                                            writableDatabase.delete("smartdial_table", (java.lang.String) rsrVarAI.b, (java.lang.String[]) rsrVarAI.a);
                                        }
                                        if (!cursorB.moveToNext()) {
                                            break;
                                        }
                                        sharedPreferences = sharedPreferences;
                                        lValueOf = lValueOf;
                                    }
                                    writableDatabase.setTransactionSuccessful();
                                } else {
                                    sharedPreferences = sharedPreferences;
                                    lValueOf = lValueOf;
                                }
                                cursorB.close();
                                writableDatabase.endTransaction();
                            } catch (java.lang.Throwable th) {
                                cursorB.close();
                                writableDatabase.endTransaction();
                                throw th;
                            }
                        }
                        writableDatabase.delete("smartdial_table", "last_smartdial_update_time > ".concat(java.lang.String.valueOf(strValueOf)), null);
                        defpackage.aimz aimzVar2 = defpackage.mfk.a;
                        ((defpackage.aimw) ((defpackage.aimw) aimzVar2.b()).l("com/android/dialer/database/DialerDatabaseHelper", "updateSmartDialDatabase", 806, "DialerDatabaseHelper.java")).v("Finished removing deleted and corrupted contacts.");
                        if (strValueOf.equals("0")) {
                            str = strValueOf;
                        } else {
                            android.database.Cursor cursorB2 = ((defpackage.mfi) defpackage.agab.aH(mfkVar.b, defpackage.mfi.class)).aZ().b(mfn.a, mfn.b, "contact_last_updated_timestamp > ?", new java.lang.String[]{strValueOf}, null);
                            if (cursorB2 == null) {
                                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar2.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/database/DialerDatabaseHelper", "updateSmartDialDatabase", (char) 830, "DialerDatabaseHelper.java")).v("smartDial query received null for cursor");
                                return null;
                            }
                            try {
                                writableDatabase.beginTransaction();
                                try {
                                    cursorB2.moveToPosition(-1);
                                    while (cursorB2.moveToNext()) {
                                        if (cursorB2.isNull(0)) {
                                            ((defpackage.aimw) ((defpackage.aimw) aimzVar2.b()).l("com/android/dialer/database/DialerDatabaseHelper", "removeUpdatedContacts", 561, "DialerDatabaseHelper.java")).v("contact_id column null. Row was deleted during iteration, skipping");
                                        } else {
                                            writableDatabase.delete("smartdial_table", "contact_id=" + java.lang.Long.valueOf(cursorB2.getLong(0)), null);
                                        }
                                        strValueOf = strValueOf;
                                    }
                                    str = strValueOf;
                                    writableDatabase.setTransactionSuccessful();
                                    writableDatabase.endTransaction();
                                    cursorB2.close();
                                    ((defpackage.aimw) ((defpackage.aimw) defpackage.mfk.a.b()).l("com/android/dialer/database/DialerDatabaseHelper", "updateSmartDialDatabase", 838, "DialerDatabaseHelper.java")).v("Finished removing entries belonging to updated contacts.");
                                } catch (java.lang.Throwable th2) {
                                    writableDatabase.endTransaction();
                                    throw th2;
                                }
                            } catch (java.lang.Throwable th3) {
                                cursorB2.close();
                                throw th3;
                            }
                        }
                        android.content.Context context4 = mfkVar.b;
                        android.database.Cursor cursorB3 = ((defpackage.mfi) defpackage.agab.aH(context4, defpackage.mfi.class)).aZ().b(defpackage.mfm.a, defpackage.mfm.b, "contact_last_updated_timestamp > ? AND length(lookup) < 1000", new java.lang.String[]{str}, null);
                        if (cursorB3 == null) {
                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.mfk.a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/database/DialerDatabaseHelper", "updateSmartDialDatabase", (char) 859, "DialerDatabaseHelper.java")).v("smartDial query received null for cursor");
                            return null;
                        }
                        try {
                            lValueOf.getClass();
                            writableDatabase.beginTransaction();
                            try {
                                android.database.sqlite.SQLiteStatement sQLiteStatementCompileStatement = writableDatabase.compileStatement("INSERT INTO smartdial_table (data_id, phone_number, contact_id, lookup_key, display_name, photo_id, last_time_used, times_used, starred, is_super_primary, in_visible_group, is_primary, carrier_presence, last_smartdial_update_time,name_by_number,normalized_number)  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                                cursorB3.moveToPosition(-1);
                                while (cursorB3.moveToNext()) {
                                    sQLiteStatementCompileStatement.clearBindings();
                                    if (cursorB3.isNull(0)) {
                                        ((defpackage.aimw) ((defpackage.aimw) defpackage.mfk.a.b()).l("com/android/dialer/database/DialerDatabaseHelper", "insertUpdatedContactsAndNumberPrefix", 718, str2)).v("_id column null. Row was deleted during iteration, skipping");
                                    } else {
                                        java.lang.String string = cursorB3.getString(3);
                                        if (!android.text.TextUtils.isEmpty(string)) {
                                            sQLiteStatementCompileStatement.bindString(2, string);
                                            sQLiteStatementCompileStatement.bindString(16, defpackage.vwb.j(context4, string));
                                            java.lang.String string2 = cursorB3.getString(5);
                                            if (!android.text.TextUtils.isEmpty(string2)) {
                                                sQLiteStatementCompileStatement.bindString(4, string2);
                                                java.lang.String string3 = cursorB3.getString(6);
                                                if (string3 == null) {
                                                    sQLiteStatementCompileStatement.bindString(5, context4.getResources().getString(2132019348));
                                                } else {
                                                    sQLiteStatementCompileStatement.bindString(5, string3);
                                                    sQLiteStatementCompileStatement.bindString(15, defpackage.vwb.g(context4, string3));
                                                }
                                                sQLiteStatementCompileStatement.bindLong(1, cursorB3.getLong(0));
                                                sQLiteStatementCompileStatement.bindLong(3, cursorB3.getLong(4));
                                                sQLiteStatementCompileStatement.bindLong(6, cursorB3.getLong(7));
                                                sQLiteStatementCompileStatement.bindLong(7, cursorB3.getLong(8));
                                                sQLiteStatementCompileStatement.bindLong(8, cursorB3.getInt(9));
                                                sQLiteStatementCompileStatement.bindLong(9, cursorB3.getInt(10));
                                                sQLiteStatementCompileStatement.bindLong(10, cursorB3.getInt(11));
                                                sQLiteStatementCompileStatement.bindLong(11, cursorB3.getInt(12));
                                                sQLiteStatementCompileStatement.bindLong(12, cursorB3.getInt(13));
                                                sQLiteStatementCompileStatement.bindLong(13, cursorB3.getInt(14));
                                                sQLiteStatementCompileStatement.bindLong(14, jCurrentTimeMillis);
                                                sQLiteStatementCompileStatement.executeInsert();
                                                str2 = str2;
                                            }
                                        }
                                    }
                                }
                                writableDatabase.setTransactionSuccessful();
                                writableDatabase.endTransaction();
                                ((defpackage.aimw) ((defpackage.aimw) defpackage.mfk.a.b()).l("com/android/dialer/database/DialerDatabaseHelper", "updateSmartDialDatabase", 866, "DialerDatabaseHelper.java")).v("Finished building the smart dial table.");
                                cursorB3.close();
                                android.database.Cursor cursorRawQuery = writableDatabase.rawQuery("SELECT DISTINCT display_name, contact_id FROM smartdial_table WHERE last_smartdial_update_time = ".concat(lValueOf.toString()), new java.lang.String[0]);
                                defpackage.aimz aimzVar3 = defpackage.mfk.a;
                                ((defpackage.aimw) ((defpackage.aimw) aimzVar3.b()).l("com/android/dialer/database/DialerDatabaseHelper", "updateSmartDialDatabase", 888, "DialerDatabaseHelper.java")).v("Finished querying the smart dial table for contact names.");
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                writableDatabase.execSQL("CREATE INDEX IF NOT EXISTS smartdial_contact_id_index ON smartdial_table (contact_id);");
                                writableDatabase.execSQL("CREATE INDEX IF NOT EXISTS smartdial_last_update_index ON smartdial_table (last_smartdial_update_time);");
                                writableDatabase.execSQL("CREATE INDEX IF NOT EXISTS smartdial_normalized_number_index ON smartdial_table (normalized_number);");
                                writableDatabase.execSQL("CREATE INDEX IF NOT EXISTS smartdial_name_by_number_index ON smartdial_table (name_by_number);");
                                writableDatabase.execSQL("CREATE INDEX IF NOT EXISTS smartdial_sort_index ON smartdial_table (starred, is_super_primary, last_time_used, times_used, in_visible_group, display_name, contact_id, is_primary);");
                                ((defpackage.aimw) ((defpackage.aimw) aimzVar3.b()).l("com/android/dialer/database/DialerDatabaseHelper", "updateSmartDialDatabase", 943, "DialerDatabaseHelper.java")).v("Finished recreating index.");
                                writableDatabase.execSQL("ANALYZE smartdial_table");
                                writableDatabase.execSQL("ANALYZE smartdial_contact_id_index");
                                writableDatabase.execSQL("ANALYZE smartdial_last_update_index");
                                ((defpackage.aimw) ((defpackage.aimw) aimzVar3.b()).l("com/android/dialer/database/DialerDatabaseHelper", "updateSmartDialDatabase", 949, "DialerDatabaseHelper.java")).v("Finished updating index stats.");
                                android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                lValueOf.getClass();
                                editorEdit.putLong("last_updated_millis", jCurrentTimeMillis);
                                editorEdit.apply();
                                ((defpackage.aimw) ((defpackage.aimw) aimzVar3.b()).l("com/android/dialer/database/DialerDatabaseHelper", "updateSmartDialDatabase", 955, "DialerDatabaseHelper.java")).v("broadcasting smart dial update");
                                android.content.Intent intent = new android.content.Intent("com.android.dialer.database.ACTION_SMART_DIAL_UPDATED");
                                android.content.Context context5 = mfkVar.b;
                                intent.setPackage(context5.getPackageName());
                                context5.sendBroadcast(intent);
                                return null;
                            } catch (java.lang.Throwable th4) {
                                writableDatabase.endTransaction();
                                throw th4;
                            }
                        } catch (java.lang.Throwable th5) {
                            cursorB3.close();
                            throw th5;
                        }
                    }
                }, ((defpackage.mfi) defpackage.agab.aH(context2, defpackage.mfi.class)).fF()), "Failed to updateSmartDialDatabase.", new java.lang.Object[0]);
            }
            ahoqVarX.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.emj
    public final /* synthetic */ void a(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void b(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void c(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void e(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void f(defpackage.emx emxVar) {
    }
}
