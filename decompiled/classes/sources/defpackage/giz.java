package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class giz implements defpackage.gip {
    public final android.database.sqlite.SQLiteDatabase c;
    private static final java.lang.String[] d = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final java.lang.String[] e = new java.lang.String[0];
    public static final defpackage.aoir a = defpackage.aooc.ah(2, new defpackage.giy(1));
    public static final defpackage.aoir b = defpackage.aooc.ah(2, new defpackage.giy(0));

    public giz(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            defpackage.aooh.i("delegate");
        }
        this.c = sQLiteDatabase;
    }

    @Override // defpackage.gip
    public final android.database.Cursor a(defpackage.giv givVar) {
        final defpackage.baq baqVar = new defpackage.baq(givVar, 3);
        android.database.Cursor cursorRawQueryWithFactory = this.c.rawQueryWithFactory(new android.database.sqlite.SQLiteDatabase.CursorFactory() { // from class: gix
            /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor, java.lang.Object] */
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final android.database.Cursor newCursor(android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, android.database.sqlite.SQLiteQuery sQLiteQuery) {
                defpackage.aoir aoirVar = defpackage.giz.a;
                return baqVar.a(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, givVar.f(), e, null);
        defpackage.aooh.e(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // defpackage.gip
    public final android.database.Cursor b(java.lang.String str) {
        defpackage.aooh.f(str, "query");
        return a(new defpackage.gio(str));
    }

    @Override // defpackage.gip
    public final defpackage.giw c(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("sql");
        }
        android.database.sqlite.SQLiteStatement sQLiteStatementCompileStatement = this.c.compileStatement(str);
        defpackage.aooh.e(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new defpackage.gjg(sQLiteStatementCompileStatement);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    @Override // defpackage.gip
    public final java.lang.String d() {
        return this.c.getPath();
    }

    @Override // defpackage.gip
    public final void e() {
        this.c.beginTransaction();
    }

    @Override // defpackage.gip
    public final void f() {
        this.c.beginTransactionNonExclusive();
    }

    @Override // defpackage.gip
    public final void g() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        if (defpackage.dzk.I() == null || defpackage.dzk.J() == null) {
            e();
            return;
        }
        java.lang.reflect.Method methodI = defpackage.dzk.I();
        defpackage.aooh.c(methodI);
        java.lang.reflect.Method methodJ = defpackage.dzk.J();
        defpackage.aooh.c(methodJ);
        java.lang.Object objInvoke = methodJ.invoke(this.c, null);
        if (objInvoke == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        methodI.invoke(objInvoke, 0, null, 0, null);
    }

    @Override // defpackage.gip
    public final void h() {
        this.c.disableWriteAheadLogging();
    }

    @Override // defpackage.gip
    public final void i() {
        this.c.endTransaction();
    }

    @Override // defpackage.gip
    public final void j(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("sql");
        }
        this.c.execSQL(str);
    }

    @Override // defpackage.gip
    public final void k() {
        this.c.setTransactionSuccessful();
    }

    @Override // defpackage.gip
    public final boolean l() {
        return this.c.inTransaction();
    }

    @Override // defpackage.gip
    public final boolean m() {
        return this.c.isOpen();
    }

    @Override // defpackage.gip
    public final boolean n() {
        return this.c.isWriteAheadLoggingEnabled();
    }

    @Override // defpackage.gip
    public final void o() {
        this.c.enableWriteAheadLogging();
    }

    @Override // defpackage.gip
    public final void p(java.lang.Object[] objArr) {
        this.c.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // defpackage.gip
    public final int q(android.content.ContentValues contentValues, java.lang.Object[] objArr) {
        if (contentValues.size() == 0) {
            throw new java.lang.IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        java.lang.Object[] objArr2 = new java.lang.Object[size];
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UPDATE ");
        sb.append(d[3]);
        sb.append("WorkSpec SET ");
        int i = 0;
        for (java.lang.String str : contentValues.keySet()) {
            sb.append(i > 0 ? "," : "");
            sb.append(str);
            objArr2[i] = contentValues.get(str);
            sb.append("=?");
            i++;
        }
        for (int i2 = size; i2 < size; i2++) {
            objArr2[i2] = objArr[i2 - size];
        }
        sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        defpackage.giw giwVarC = c(sb.toString());
        defpackage.dzk.L(giwVarC, objArr2);
        return ((defpackage.gjg) giwVarC).a.executeUpdateDelete();
    }
}
