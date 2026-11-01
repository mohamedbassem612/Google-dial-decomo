package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adjo implements defpackage.adjd {
    public static final java.lang.String[] a = {"namespace", "name", "reserved_size", "reservation_state", "gc_priority", "last_access_millis", "source", "superpack_name", "superpack_version", "validation_count"};
    private static final defpackage.adjc c;
    public final defpackage.adiz b;

    static {
        defpackage.adjb adjbVarI = defpackage.adjc.i();
        int i = defpackage.adhw.c;
        adjbVarI.d(new defpackage.adhb("default", "default"));
        c = adjbVarI.a();
    }

    public adjo(defpackage.adiz adizVar) {
        this.b = adizVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0093 A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #2 {all -> 0x00a4, blocks: (B:4:0x0022, B:6:0x0028, B:8:0x007b, B:9:0x008e, B:10:0x0093), top: B:26:0x0022 }] */
    @Override // defpackage.adjd
    public final defpackage.adjc a(defpackage.adhw adhwVar) throws java.lang.Throwable {
        java.lang.Throwable th;
        android.database.Cursor cursorQuery;
        defpackage.adjc adjcVarA;
        try {
            try {
                cursorQuery = this.b.getReadableDatabase().query("file_metadata", a, "namespace=? AND name=?", new java.lang.String[]{adhwVar.b(), adhwVar.a()}, null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToNext()) {
                            defpackage.adjb adjbVarI = defpackage.adjc.i();
                            adjbVarI.d(new defpackage.adhb(cursorQuery.getString(0), cursorQuery.getString(1)));
                            adjbVarI.f(cursorQuery.getLong(2));
                            adjbVarI.c(cursorQuery.getLong(5));
                            int i = cursorQuery.getInt(4);
                            com.google.android.libraries.micore.superpacks.base.BasePriority.d(i);
                            adjbVarI.b(i);
                            int i2 = cursorQuery.getInt(3);
                            defpackage.adik.m(i2);
                            adjbVarI.e(i2);
                            adjbVarI.b = cursorQuery.getString(6);
                            adjbVarI.g(cursorQuery.getInt(9));
                            java.lang.String string = cursorQuery.getString(7);
                            if (string != null) {
                                int i3 = cursorQuery.getInt(8);
                                defpackage.adik.k("version", i3);
                                adjbVarI.a = new com.google.android.libraries.micore.superpacks.base.AutoValue_VersionedName(string, i3);
                            }
                            adjcVarA = adjbVarI.a();
                        } else {
                            defpackage.adjb adjbVarI2 = defpackage.adjc.i();
                            adjbVarI2.d(adhwVar);
                            adjcVarA = adjbVarI2.a();
                            if (cursorQuery != null) {
                            }
                        }
                        cursorQuery.close();
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        if (cursorQuery == null) {
                            throw th;
                        }
                        cursorQuery.close();
                        throw th;
                    }
                } else {
                    defpackage.adjb adjbVarI3 = defpackage.adjc.i();
                    adjbVarI3.d(adhwVar);
                    adjcVarA = adjbVarI3.a();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
                return adjcVarA;
            } catch (android.database.sqlite.SQLiteException e) {
                defpackage.adiz adizVar = this.b;
                java.io.IOException iOException = new java.io.IOException("SqliteFileMetadataTable#get, SQL query failed, name: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(adhwVar))), e);
                adizVar.a(iOException);
                throw iOException;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
    }

    @Override // defpackage.adjd
    public final void b(defpackage.adhw adhwVar) throws java.io.IOException {
        try {
            this.b.getWritableDatabase().delete("file_metadata", "namespace=? AND name=?", new java.lang.String[]{adhwVar.b(), adhwVar.a()});
        } catch (android.database.sqlite.SQLiteException e) {
            defpackage.adiz adizVar = this.b;
            java.io.IOException iOException = new java.io.IOException("SqliteFileMetadataTable#remove, SQL delete failed, name: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(adhwVar))), e);
            adizVar.a(iOException);
            throw iOException;
        }
    }

    @Override // defpackage.adjd
    public final void c(defpackage.adhw adhwVar, int i) throws java.io.IOException {
        android.content.ContentValues contentValues = new android.content.ContentValues(1);
        contentValues.put("reservation_state", java.lang.Integer.valueOf(i));
        d(adhwVar, contentValues);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0060  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [adjo] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.libraries.micore.superpacks.base.$AutoValue_VersionedName] */
    /* JADX WARN: Type inference failed for: r1v8, types: [adjo] */
    public final void d(defpackage.adhw adhwVar, android.content.ContentValues contentValues) throws java.io.IOException {
        int iIntValue;
        int iIntValue2;
        defpackage.adjo autoValue_VersionedName = this;
        try {
            defpackage.adiz adizVar = autoValue_VersionedName.b;
            android.database.sqlite.SQLiteDatabase writableDatabase = adizVar.getWritableDatabase();
            java.lang.String str = ((defpackage.adhb) adhwVar).a;
            java.lang.String str2 = ((defpackage.adhb) adhwVar).b;
            if (writableDatabase.update("file_metadata", contentValues, "namespace=? AND name=?", new java.lang.String[]{str, str2}) <= 0) {
                if (contentValues.containsKey("superpack_name")) {
                    try {
                        if (contentValues.containsKey("superpack_version")) {
                            java.lang.String asString = contentValues.getAsString("superpack_name");
                            int iIntValue3 = contentValues.getAsInteger("superpack_version").intValue();
                            defpackage.adik.k("version", iIntValue3);
                            autoValue_VersionedName = new com.google.android.libraries.micore.superpacks.base.AutoValue_VersionedName(asString, iIntValue3);
                        } else {
                            autoValue_VersionedName = 0;
                        }
                    } catch (android.database.sqlite.SQLiteException e) {
                        e = e;
                        autoValue_VersionedName = this;
                    }
                } else {
                    autoValue_VersionedName = 0;
                }
                if (contentValues.containsKey("gc_priority")) {
                    iIntValue = contentValues.getAsInteger("gc_priority").intValue();
                    com.google.android.libraries.micore.superpacks.base.BasePriority.d(iIntValue);
                } else {
                    iIntValue = ((defpackage.adiw) c).c;
                }
                if (contentValues.containsKey("reservation_state")) {
                    iIntValue2 = contentValues.getAsInteger("reservation_state").intValue();
                    defpackage.adik.m(iIntValue2);
                } else {
                    iIntValue2 = ((defpackage.adiw) c).d;
                }
                long jLongValue = contentValues.containsKey("last_access_millis") ? contentValues.getAsLong("last_access_millis").longValue() : ((defpackage.adiw) c).e;
                long jLongValue2 = contentValues.containsKey("reserved_size") ? contentValues.getAsLong("reserved_size").longValue() : ((defpackage.adiw) c).b;
                java.lang.String asString2 = contentValues.containsKey("source") ? contentValues.getAsString("source") : ((defpackage.adiw) c).f;
                int iIntValue4 = contentValues.containsKey("validation_count") ? contentValues.getAsInteger("validation_count").intValue() : ((defpackage.adiw) c).g;
                try {
                    android.database.sqlite.SQLiteDatabase writableDatabase2 = adizVar.getWritableDatabase();
                    int i = iIntValue4;
                    android.content.ContentValues contentValues2 = new android.content.ContentValues(8);
                    contentValues2.put("namespace", str);
                    contentValues2.put("name", str2);
                    contentValues2.put("gc_priority", java.lang.Integer.valueOf(iIntValue));
                    contentValues2.put("last_access_millis", java.lang.Long.valueOf(jLongValue));
                    contentValues2.put("reservation_state", java.lang.Integer.valueOf(iIntValue2));
                    contentValues2.put("reserved_size", java.lang.Long.valueOf(jLongValue2));
                    contentValues2.put("source", asString2);
                    if (autoValue_VersionedName != 0) {
                        contentValues2.put("superpack_name", autoValue_VersionedName.a);
                        contentValues2.put("superpack_version", java.lang.Integer.valueOf(autoValue_VersionedName.b));
                    } else {
                        contentValues2.putNull("superpack_name");
                        contentValues2.put("superpack_version", (java.lang.Integer) 0);
                    }
                    contentValues2.put("validation_count", java.lang.Integer.valueOf(i));
                    autoValue_VersionedName = 0;
                    long jReplace = writableDatabase2.replace("file_metadata", null, contentValues2);
                    if (jReplace >= 0) {
                        return;
                    }
                    throw new java.io.IOException("Update failed for " + java.lang.String.valueOf(adhwVar) + ", rowId: " + jReplace);
                } catch (android.database.sqlite.SQLiteException e2) {
                    autoValue_VersionedName = this;
                    defpackage.adiz adizVar2 = autoValue_VersionedName.b;
                    java.io.IOException iOException = new java.io.IOException("SqliteFileMetadataTable#insertOrUpdate, SQL replace failed, name: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(adhwVar))), e2);
                    adizVar2.a(iOException);
                    throw iOException;
                }
                e = e;
                defpackage.adiz adizVar3 = autoValue_VersionedName.b;
                java.io.IOException iOException2 = new java.io.IOException("SqliteFileMetadataTable#updateColumns, SQL update failed, name: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(adhwVar))), e);
                adizVar3.a(iOException2);
                throw iOException2;
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            e = e3;
        }
    }
}
