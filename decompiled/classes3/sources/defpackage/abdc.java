package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abdc extends defpackage.abcq {
    public abdc() {
        super(defpackage.zvl.EXEC_SQL_FIX, 10L);
    }

    private static void c(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            try {
                sQLiteDatabase.execSQL(str);
            } catch (android.database.sqlite.SQLiteException e) {
                android.util.Log.e("EXEC_SQL_FIX", "Unable to execute query ".concat(java.lang.String.valueOf(str)));
                throw e;
            }
        }
    }

    @Override // defpackage.abcq
    public final defpackage.abcv a(defpackage.abcv abcvVar, ahyn ahynVar) {
        if (!ahynVar.f() || ((defpackage.zvz) ahynVar.b()).c != 2) {
            throw new java.lang.IllegalArgumentException();
        }
        android.content.Context contextM = abcvVar.b;
        defpackage.zvz zvzVar = (defpackage.zvz) ahynVar.b();
        defpackage.zvp zvpVar = zvzVar.c == 2 ? (defpackage.zvp) zvzVar.d : defpackage.zvp.a;
        if (zvpVar.f) {
            contextM = aa$.ExternalSyntheticApiModelOutline1.m(contextM);
        }
        java.io.File databasePath = contextM.getDatabasePath(zvpVar.c);
        if (databasePath.exists()) {
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseOpenDatabase = android.database.sqlite.SQLiteDatabase.openDatabase(databasePath.getPath(), null, 0);
            try {
                int version = sQLiteDatabaseOpenDatabase.getVersion();
                int i = zvpVar.d;
                if (i == 0 || i == version) {
                    int iAR = a.aR(zvpVar.b);
                    if (iAR == 0) {
                        iAR = 1;
                    }
                    int i2 = iAR - 2;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.UnsupportedOperationException("This command type is not supported");
                        }
                        contextM.deleteDatabase(zvpVar.c);
                    } else if (zvpVar.g) {
                        alat alatVar = zvpVar.e;
                        sQLiteDatabaseOpenDatabase.beginTransaction();
                        try {
                            c(sQLiteDatabaseOpenDatabase, alatVar);
                            sQLiteDatabaseOpenDatabase.setTransactionSuccessful();
                            sQLiteDatabaseOpenDatabase.endTransaction();
                        } catch (java.lang.Throwable th) {
                            sQLiteDatabaseOpenDatabase.endTransaction();
                            throw th;
                        }
                    } else {
                        c(sQLiteDatabaseOpenDatabase, zvpVar.e);
                    }
                }
                if (sQLiteDatabaseOpenDatabase != null) {
                    sQLiteDatabaseOpenDatabase.close();
                }
            } catch (java.lang.Throwable th2) {
                if (sQLiteDatabaseOpenDatabase != null) {
                    try {
                        sQLiteDatabaseOpenDatabase.close();
                    } catch (java.lang.Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return abcvVar;
    }

    @Override // defpackage.abcq
    public final java.lang.String b() {
        return "EXEC_SQL_FIX";
    }
}
