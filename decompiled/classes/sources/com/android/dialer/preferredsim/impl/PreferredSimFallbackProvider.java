package com.android.dialer.preferredsim.impl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class PreferredSimFallbackProvider extends android.content.ContentProvider {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/preferredsim/impl/PreferredSimFallbackProvider");
    private static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("data_id IN [(][?](,[?])*[)]");
    private defpackage.sud c;

    private final void a() {
        if (getContext().checkCallingOrSelfPermission("android.permission.WRITE_CONTACTS") == -1) {
            throw new java.lang.SecurityException("WRITE_CONTACTS required");
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/preferredsim/impl/PreferredSimFallbackProvider", "delete", 92, "PreferredSimFallbackProvider.java")).v("delete");
        a();
        if (abxw.a.equals(uri) && str == null && strArr == null) {
            int iDelete = this.c.b.getWritableDatabase().delete("preferred_sim", null, null);
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/preferredsim/impl/PreferredSimFallbackProvider", "delete", 99, "PreferredSimFallbackProvider.java")).w("deleted %d rows", iDelete);
            return iDelete;
        }
        if (!android.text.TextUtils.equals(getContext().getPackageName(), getCallingPackage())) {
            throw new java.lang.IllegalArgumentException("Unsupported operation");
        }
        int iDelete2 = this.c.b.getWritableDatabase().delete("preferred_sim", str, strArr);
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/preferredsim/impl/PreferredSimFallbackProvider", "delete", 108, "PreferredSimFallbackProvider.java")).w("deleted %d rows with selection", iDelete2);
        return iDelete2;
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.IllegalArgumentException("Unsupported operation");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        this.c = new defpackage.sud(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/preferredsim/impl/PreferredSimFallbackProvider", "query", 65, "PreferredSimFallbackProvider.java")).v("query");
        if (getContext().checkCallingOrSelfPermission("android.permission.READ_CONTACTS") == -1) {
            throw new java.lang.SecurityException("READ_CONTACTS required");
        }
        defpackage.sud sudVar = this.c;
        android.database.sqlite.SQLiteQueryBuilder sQLiteQueryBuilder = new android.database.sqlite.SQLiteQueryBuilder();
        sQLiteQueryBuilder.setStrict(true);
        sQLiteQueryBuilder.setProjectionMap(defpackage.sud.a);
        sQLiteQueryBuilder.setTables("preferred_sim");
        return sQLiteQueryBuilder.query(sudVar.b.getReadableDatabase(), strArr, str, strArr2, null, null, str2);
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/preferredsim/impl/PreferredSimFallbackProvider", "update", 130, "PreferredSimFallbackProvider.java")).v("update");
        a();
        int iA = 0;
        if (contentValues == null) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/preferredsim/impl/PreferredSimFallbackProvider", "update", 133, "PreferredSimFallbackProvider.java")).v("null values");
        } else {
            if (str == null || strArr == null) {
                throw new java.lang.IllegalArgumentException("Unsupported operation");
            }
            java.lang.String asString = contentValues.getAsString("preferred_phone_account_component_name");
            java.lang.String asString2 = contentValues.getAsString("preferred_phone_account_id");
            if (str.equals("data_id = ?")) {
                if (strArr.length != 1) {
                    throw new java.lang.IllegalArgumentException("Unsupported operation");
                }
                iA = this.c.a(strArr[0], asString, asString2);
            } else {
                if (!b.matcher(str).find()) {
                    throw new java.lang.IllegalArgumentException("Unsupported operation");
                }
                defpackage.ailj it = defpackage.aihd.p(strArr).iterator();
                while (it.hasNext()) {
                    iA += this.c.a((java.lang.String) it.next(), asString, asString2);
                }
            }
            ((defpackage.sui) defpackage.agab.aH(getContext(), defpackage.sui.class)).aZ().p(abxw.a);
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/preferredsim/impl/PreferredSimFallbackProvider", "update", 165, "PreferredSimFallbackProvider.java")).w("updated %d rows", iA);
        }
        return iA;
    }
}
