package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adiy implements defpackage.adje {
    private final defpackage.adjp a;
    private final java.util.Map b = new java.util.HashMap();

    public adiy(defpackage.adjp adjpVar) {
        this.a = adjpVar;
    }

    @Override // defpackage.adje
    public final synchronized int a(java.lang.String str) {
        java.lang.Integer num = (java.lang.Integer) this.b.get(str);
        if (num != null) {
            return num.intValue();
        }
        defpackage.adjp adjpVar = this.a;
        android.database.Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = adjpVar.b.getReadableDatabase().query("manifest_table", defpackage.adjp.a, "name=?", new java.lang.String[]{str}, null, null, null, null);
                int i = -1;
                if (cursorQuery != null) {
                    i = cursorQuery.moveToNext() ? cursorQuery.getInt(1) : -1;
                    cursorQuery.close();
                }
                java.util.Map map = this.b;
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
                map.put(str, numValueOf);
                numValueOf.getClass();
                return i;
            } catch (android.database.sqlite.SQLiteException e) {
                defpackage.adiz adizVar = adjpVar.b;
                java.io.IOException iOException = new java.io.IOException(defpackage.a.bx(str, "SqliteManifestTable#getSyncVersion, SQL query failed, superpackName: "), e);
                adizVar.a(iOException);
                throw iOException;
            }
        } catch (java.lang.Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }

    @Override // defpackage.adje
    public final synchronized java.util.Collection b() {
        defpackage.adjp adjpVar;
        adjpVar = this.a;
        try {
        } catch (android.database.sqlite.SQLiteException e) {
            defpackage.adiz adizVar = adjpVar.b;
            java.io.IOException iOException = new java.io.IOException("SqliteManifestTable#getAll, SQL query failed.", e);
            adizVar.a(iOException);
            throw iOException;
        }
        return defpackage.adik.l(adjpVar.b.getReadableDatabase(), "manifest_table", defpackage.adjp.a, new adfe(5));
    }

    @Override // defpackage.adje
    public final synchronized void c(com.google.android.libraries.micore.superpacks.base.VersionedName versionedName) {
        defpackage.adjp adjpVar = this.a;
        try {
            defpackage.adiz adizVar = adjpVar.b;
            android.database.sqlite.SQLiteDatabase writableDatabase = adizVar.getWritableDatabase();
            android.content.ContentValues contentValues = new android.content.ContentValues(2);
            java.lang.String str = ((com.google.android.libraries.micore.superpacks.base.C$AutoValue_VersionedName) versionedName).a;
            contentValues.put("name", str);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(((com.google.android.libraries.micore.superpacks.base.C$AutoValue_VersionedName) versionedName).b);
            contentValues.put("version", numValueOf);
            long jReplaceOrThrow = writableDatabase.replaceOrThrow("manifest_table", null, contentValues);
            if (jReplaceOrThrow < 0) {
                java.io.IOException iOException = new java.io.IOException("SqliteManifestTable#setSyncVersion, SQL replaceOrThrow returned < 0, versionedName: " + versionedName.toString() + ", rowId: " + jReplaceOrThrow);
                adizVar.a(iOException);
                throw iOException;
            }
            this.b.put(str, numValueOf);
        } catch (android.database.sqlite.SQLiteException e) {
            defpackage.adiz adizVar2 = adjpVar.b;
            java.io.IOException iOException2 = new java.io.IOException("SqliteManifestTable#setSyncVersion, SQL replaceOrThrow failed, versionedName: ".concat(versionedName.toString()), e);
            adizVar2.a(iOException2);
            throw iOException2;
        }
    }
}
