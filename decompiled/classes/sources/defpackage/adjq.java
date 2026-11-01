package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adjq implements defpackage.adjl {
    public static final java.lang.String[] a = {"parent_id", "pack_name", "packing_scheme"};
    public final defpackage.adiz b;

    public adjq(defpackage.adiz adizVar) {
        this.b = adizVar;
    }

    @Override // defpackage.adjl
    public final java.util.List a(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.b.getReadableDatabase().query("pending_packs", a, "parent_id=?", new java.lang.String[]{str}, null, null, null, null);
                while (cursorQuery != null) {
                    if (!cursorQuery.moveToNext()) {
                        cursorQuery.close();
                        break;
                    }
                    java.lang.String string = cursorQuery.getString(1);
                    arrayList.add(new defpackage.adjk(defpackage.adhw.d(string), cursorQuery.getString(2)));
                }
                return arrayList;
            } catch (android.database.sqlite.SQLiteException e) {
                defpackage.adiz adizVar = this.b;
                java.io.IOException iOException = new java.io.IOException(defpackage.a.bx(str, "SqlitePendingPacks#get, SQL query failed, parentId: "), e);
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
}
