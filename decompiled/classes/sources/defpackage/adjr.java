package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adjr implements defpackage.adjn {
    public final defpackage.adiz b;
    private static final java.lang.String[] c = {"superpack_name", "superpack_version", "pack_list", "sync_metadata"};
    private static final java.lang.String[] d = {"superpack_name", "superpack_version", "pack_list"};
    public static final java.lang.String[] a = {"superpack_name"};

    public adjr(defpackage.adiz adizVar) {
        this.b = adizVar;
    }

    @Override // defpackage.adjn
    public final adjm a(java.lang.String str, boolean z) throws java.lang.Throwable {
        java.lang.Throwable th;
        android.database.sqlite.SQLiteException sQLiteException;
        int i;
        adhc adhcVar;
        android.database.Cursor cursor = null;
        cursor = null;
        try {
            try {
                android.database.Cursor cursorQuery = this.b.getReadableDatabase().query("selected_packs", z ? c : d, "superpack_name=?", new java.lang.String[]{str}, null, null, null, null);
                if (cursorQuery == null) {
                    return null;
                }
                try {
                    if (!cursorQuery.moveToNext()) {
                        cursorQuery.close();
                        return null;
                    }
                    int i2 = cursorQuery.getInt(1);
                    byte[] blob = z ? cursorQuery.getBlob(3) : null;
                    java.lang.String string = cursorQuery.getString(2);
                    java.util.List listJ = adjf.b.j(string);
                    int size = listJ.size();
                    if (size == 1) {
                        i = 0;
                    } else {
                        if (size != 2) {
                            throw new adht("Invalid serialized pack list: ".concat(java.lang.String.valueOf(string)));
                        }
                        java.lang.String str2 = (java.lang.String) listJ.get(0);
                        try {
                            int i3 = java.lang.Integer.parseInt(str2);
                            if (i3 != 1) {
                                throw new adht("Unsupported serializer version found: " + i3);
                            }
                            string = (java.lang.String) listJ.get(1);
                            i = i3;
                        } catch (java.lang.NumberFormatException e) {
                            throw new adht("Failed to parse version number: ".concat(java.lang.String.valueOf(str2)), e);
                        }
                    }
                    java.util.List<java.lang.String> listJ2 = adjf.a.j(string);
                    defpackage.aift aiftVar = new defpackage.aift(4);
                    for (java.lang.String str3 : listJ2) {
                        if (i == 0) {
                            defpackage.adhw adhwVarD = defpackage.adhw.d(str3);
                            defpackage.ahzf ahzfVar = defpackage.adhx.a;
                            adhcVar = new adhc(adhwVarD, i2);
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("Found invalid serializer version: " + i);
                            }
                            java.util.List listJ3 = defpackage.adhx.a.j(str3);
                            if (listJ3.size() != 2) {
                                throw new adht("Invalid input: ".concat(java.lang.String.valueOf(str3)));
                            }
                            java.lang.String str4 = (java.lang.String) listJ3.get(1);
                            try {
                                adhcVar = new adhc(defpackage.adhw.d((java.lang.String) listJ3.get(0)), java.lang.Integer.parseInt(str4));
                            } catch (java.lang.NumberFormatException e2) {
                                throw new adht("Failed to parse version number: ".concat(java.lang.String.valueOf(str4)), e2);
                            }
                        }
                        aiftVar.i(adhcVar);
                    }
                    adjm adjmVar = new adjm(str, aiftVar.g(), blob);
                    cursorQuery.close();
                    return adjmVar;
                } catch (android.database.sqlite.SQLiteException e3) {
                    sQLiteException = e3;
                    cursor = cursorQuery;
                    defpackage.adiz adizVar = this.b;
                    java.io.IOException iOException = new java.io.IOException(defpackage.a.bx(str, "SqliteSelectedPacks#get, SQL query failed, superpackName: "), sQLiteException);
                    adizVar.a(iOException);
                    throw iOException;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor == null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            } catch (android.database.sqlite.SQLiteException e4) {
                sQLiteException = e4;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }
}
