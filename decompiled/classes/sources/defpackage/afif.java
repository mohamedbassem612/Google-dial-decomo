package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afif implements android.database.sqlite.SQLiteDatabase.CursorFactory {
    private final java.lang.Object[] a;

    public afif(defpackage.adag adagVar) {
        this((java.lang.Object[]) adagVar.a);
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final android.database.Cursor newCursor(android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, android.database.sqlite.SQLiteQuery sQLiteQuery) {
        java.lang.Object[] objArr = this.a;
        if (objArr != null) {
            int i = 0;
            while (i < objArr.length) {
                int i2 = i + 1;
                java.lang.Object obj = objArr[i];
                if (obj == null) {
                    sQLiteQuery.bindNull(i2);
                } else if (obj instanceof java.lang.String) {
                    sQLiteQuery.bindString(i2, (java.lang.String) obj);
                } else if (obj instanceof byte[]) {
                    sQLiteQuery.bindBlob(i2, (byte[]) obj);
                } else if (obj instanceof java.lang.Long) {
                    sQLiteQuery.bindLong(i2, ((java.lang.Long) obj).longValue());
                } else {
                    if (!(obj instanceof java.lang.Double)) {
                        throw new java.lang.AssertionError("Attempted to bind an unsupported type");
                    }
                    sQLiteQuery.bindDouble(i2, ((java.lang.Double) obj).doubleValue());
                }
                i = i2;
            }
        }
        return new android.database.sqlite.SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public afif(java.lang.Object[] objArr) {
        this.a = objArr;
    }
}
