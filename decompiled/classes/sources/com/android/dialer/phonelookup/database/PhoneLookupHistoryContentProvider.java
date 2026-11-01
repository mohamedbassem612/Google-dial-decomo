package com.android.dialer.phonelookup.database;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class PhoneLookupHistoryContentProvider extends android.content.ContentProvider {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/phonelookup/database/PhoneLookupHistoryContentProvider");
    private defpackage.srm b;
    private final java.lang.ThreadLocal c = new java.lang.ThreadLocal();

    private static int a(android.net.Uri uri) {
        if (!uri.getAuthority().equals("com.google.android.dialer.phonelookuphistory")) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() != 1) {
            throw new java.lang.IllegalArgumentException();
        }
        if (pathSegments.get(0).equals("PhoneLookupHistory")) {
            return uri.getQueryParameter("number") != null ? 2 : 1;
        }
        throw new java.lang.IllegalArgumentException();
    }

    private final void b(android.net.Uri uri) {
        defpackage.sra sraVarC = sns.c(getContext());
        sraVarC.aZ().p(uri);
        sraVarC.qb().t(defpackage.ajcm.a, defpackage.srp.b);
    }

    private final boolean c() {
        java.lang.ThreadLocal threadLocal = this.c;
        return threadLocal.get() != null && ((java.lang.Boolean) threadLocal.get()).booleanValue();
    }

    @Override // android.content.ContentProvider
    public final android.content.ContentProviderResult[] applyBatch(java.util.ArrayList arrayList) {
        android.content.ContentProviderResult[] contentProviderResultArr = new android.content.ContentProviderResult[arrayList.size()];
        if (!arrayList.isEmpty()) {
            android.database.sqlite.SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
            try {
                this.c.set(java.lang.Boolean.TRUE);
                writableDatabase.beginTransaction();
                for (int i = 0; i < arrayList.size(); i++) {
                    android.content.ContentProviderOperation contentProviderOperation = (android.content.ContentProviderOperation) arrayList.get(i);
                    a(contentProviderOperation.getUri());
                    android.content.ContentProviderResult contentProviderResultApply = contentProviderOperation.apply(this, contentProviderResultArr, i);
                    if (contentProviderOperation.isInsert()) {
                        if (contentProviderResultApply.uri == null) {
                            throw new android.content.OperationApplicationException("error inserting row");
                        }
                    } else if (contentProviderResultApply.count.intValue() == 0) {
                        throw new android.content.OperationApplicationException("error applying operation");
                    }
                    contentProviderResultArr[i] = contentProviderResultApply;
                }
                writableDatabase.setTransactionSuccessful();
                this.c.set(java.lang.Boolean.FALSE);
                writableDatabase.endTransaction();
                b(defpackage.sro.a);
            } catch (java.lang.Throwable th) {
                this.c.set(java.lang.Boolean.FALSE);
                writableDatabase.endTransaction();
                throw th;
            }
        }
        return contentProviderResultArr;
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        android.database.sqlite.SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
        if (a(uri) != 1) {
            defpackage.ahvr.bN(str == null, "Do not specify selection when deleting by number");
            defpackage.ahvr.bN(strArr == null, "Do not specify selection args when deleting by number");
            java.lang.String strDecode = android.net.Uri.decode(uri.getQueryParameter("number"));
            if (getContext() != null) {
                boolean z = strDecode != null;
                sns.c(getContext()).ji();
                defpackage.ahvr.bR(z, "error parsing number from uri: %s", defpackage.aais.aD(uri));
            }
            strArr = new java.lang.String[]{strDecode};
            str = "normalized_number= ?";
        }
        int iDelete = writableDatabase.delete("PhoneLookupHistory", str, strArr);
        if (iDelete == 0) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/phonelookup/database/PhoneLookupHistoryContentProvider", "delete", (char) 228, "PhoneLookupHistoryContentProvider.java")).v("no rows deleted");
            return 0;
        }
        if (!c()) {
            b(uri);
        }
        return iDelete;
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        return "vnd.android.cursor.item/phone_lookup_history";
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        defpackage.ahvr.bM(contentValues != null);
        android.database.sqlite.SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
        if (a(uri) != 1) {
            java.lang.String strDecode = android.net.Uri.decode(uri.getQueryParameter("number"));
            java.lang.String asString = contentValues.getAsString("normalized_number");
            if (getContext() != null) {
                sns.c(getContext()).ji();
                defpackage.ahvr.bW(asString == null || asString.equals(strDecode), "NORMALIZED_NUMBER from values %s does not match normalized number from URI: %s", defpackage.aais.aC(asString), defpackage.aais.aC(strDecode));
            }
            if (asString == null) {
                contentValues.put("normalized_number", strDecode);
            }
        } else {
            defpackage.ahvr.bN(contentValues.getAsString("normalized_number") != null, "You must specify a normalized number when inserting");
        }
        android.net.Uri uriA = null;
        if (writableDatabase.insert("PhoneLookupHistory", null, contentValues) >= 0) {
            uriA = defpackage.sro.a(contentValues.getAsString("normalized_number"));
            if (!c()) {
                b(uriA);
            }
        } else if (getContext() != null) {
            defpackage.ainm ainmVarD = a.d();
            defpackage.ainp ainpVar = defpackage.zct.b;
            sns.c(getContext()).ji();
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ainmVarD).i(ainpVar)).l("com/android/dialer/phonelookup/database/PhoneLookupHistoryContentProvider", "insert", (char) 182, "PhoneLookupHistoryContentProvider.java")).y("error inserting row with number: %s", defpackage.aais.aC(contentValues.getAsString("normalized_number")));
        }
        return uriA;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        this.b = new defpackage.srm(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        android.database.sqlite.SQLiteDatabase readableDatabase = this.b.getReadableDatabase();
        android.database.sqlite.SQLiteQueryBuilder sQLiteQueryBuilder = new android.database.sqlite.SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("PhoneLookupHistory");
        if (a(uri) != 1) {
            sQLiteQueryBuilder.appendWhere("normalized_number=".concat(java.lang.String.valueOf(android.database.DatabaseUtils.sqlEscapeString(android.net.Uri.decode(uri.getQueryParameter("number"))))));
        }
        android.database.Cursor cursorQuery = sQLiteQueryBuilder.query(readableDatabase, strArr, str, strArr2, null, null, str2);
        if (cursorQuery != null) {
            cursorQuery.setNotificationUri(getContext().getContentResolver(), defpackage.sro.a);
            return cursorQuery;
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/phonelookup/database/PhoneLookupHistoryContentProvider", "query", '{', "PhoneLookupHistoryContentProvider.java")).v("cursor was null");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        defpackage.ahvr.bM(contentValues != null);
        android.database.sqlite.SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
        if (a(uri) == 1) {
            int iUpdate = writableDatabase.update("PhoneLookupHistory", contentValues, str, strArr);
            if (iUpdate == 0) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/phonelookup/database/PhoneLookupHistoryContentProvider", "update", (char) 258, "PhoneLookupHistoryContentProvider.java")).v("no rows updated");
                return 0;
            }
            if (!c()) {
                b(uri);
            }
            return iUpdate;
        }
        defpackage.ahvr.bN(!contentValues.containsKey("normalized_number"), "Do not specify number in values when updating by number");
        defpackage.ahvr.bN(str == null, "Do not specify selection when updating by ID");
        defpackage.ahvr.bN(strArr == null, "Do not specify selection args when updating by ID");
        contentValues.put("normalized_number", android.net.Uri.decode(uri.getQueryParameter("number")));
        writableDatabase.replaceOrThrow("PhoneLookupHistory", null, contentValues);
        if (!c()) {
            b(uri);
        }
        return 1;
    }
}
