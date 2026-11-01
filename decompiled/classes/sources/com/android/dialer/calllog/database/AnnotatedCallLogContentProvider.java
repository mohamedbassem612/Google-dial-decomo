package com.android.dialer.calllog.database;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
@java.lang.Deprecated
public final class AnnotatedCallLogContentProvider extends android.content.ContentProvider {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/database/AnnotatedCallLogContentProvider");
    private static final android.content.UriMatcher b;
    private final java.lang.ThreadLocal c = new java.lang.ThreadLocal();

    static {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        b = uriMatcher;
        uriMatcher.addURI("com.google.android.dialer.annotatedcalllog", "AnnotatedCallLog", 1);
        uriMatcher.addURI("com.google.android.dialer.annotatedcalllog", "AnnotatedCallLog/#", 2);
        uriMatcher.addURI("com.google.android.dialer.annotatedcalllog", "DistinctPhoneNumbers", 3);
    }

    private final defpackage.kdx a() {
        return hgt.A(getContext()).Y();
    }

    private static java.lang.String b(long j) {
        return defpackage.a.bz(j, "_id=");
    }

    private final void c(android.net.Uri uri) {
        hgt.A(getContext()).aZ().p(uri);
    }

    private final boolean d() {
        java.lang.ThreadLocal threadLocal = this.c;
        return threadLocal.get() != null && ((java.lang.Boolean) threadLocal.get()).booleanValue();
    }

    @Override // android.content.ContentProvider
    public final android.content.ContentProviderResult[] applyBatch(java.util.ArrayList arrayList) {
        android.content.ContentProviderResult[] contentProviderResultArr = new android.content.ContentProviderResult[arrayList.size()];
        if (!arrayList.isEmpty()) {
            android.database.sqlite.SQLiteDatabase writableDatabase = a().getWritableDatabase();
            try {
                this.c.set(java.lang.Boolean.TRUE);
                writableDatabase.beginTransaction();
                for (int i = 0; i < arrayList.size(); i++) {
                    android.content.ContentProviderOperation contentProviderOperation = (android.content.ContentProviderOperation) arrayList.get(i);
                    int iMatch = b.match(contentProviderOperation.getUri());
                    if (iMatch != 1 && iMatch != 2) {
                        if (iMatch == 3) {
                            throw new java.lang.UnsupportedOperationException();
                        }
                        throw new java.lang.IllegalArgumentException("Unknown uri: " + java.lang.String.valueOf(contentProviderOperation.getUri()));
                    }
                    android.content.ContentProviderResult contentProviderResultApply = contentProviderOperation.apply(this, contentProviderResultArr, i);
                    if (((android.content.ContentProviderOperation) arrayList.get(i)).isInsert() && contentProviderResultApply.uri == null) {
                        throw new android.content.OperationApplicationException("error inserting row");
                    }
                    contentProviderResultArr[i] = contentProviderResultApply;
                }
                writableDatabase.setTransactionSuccessful();
                this.c.set(java.lang.Boolean.FALSE);
                writableDatabase.endTransaction();
                c(kee.a);
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
        android.database.sqlite.SQLiteDatabase writableDatabase = a().getWritableDatabase();
        int iMatch = b.match(uri);
        if (iMatch != 1) {
            if (iMatch != 2) {
                if (iMatch != 3) {
                    throw new java.lang.IllegalArgumentException("Unknown uri: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
                }
                throw new java.lang.UnsupportedOperationException();
            }
            defpackage.ahvr.bN(str == null, "Do not specify selection when deleting by ID");
            defpackage.ahvr.bN(strArr == null, "Do not specify selection args when deleting by ID");
            long id = android.content.ContentUris.parseId(uri);
            defpackage.ahvr.bR(id != -1, "error parsing id from uri %s", uri);
            str = b(id);
        }
        int iDelete = writableDatabase.delete("AnnotatedCallLog", str, strArr);
        if (iDelete == 0) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/calllog/database/AnnotatedCallLogContentProvider", "delete", (char) 234, "AnnotatedCallLogContentProvider.java")).v("no rows deleted");
            return 0;
        }
        if (!d()) {
            c(uri);
        }
        return iDelete;
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        return "vnd.android.cursor.item/annotated_call_log";
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        defpackage.ahvr.ci(contentValues);
        hgt.B(contentValues, 2);
        android.database.sqlite.SQLiteDatabase writableDatabase = a().getWritableDatabase();
        int iMatch = b.match(uri);
        if (iMatch == 1) {
            defpackage.ahvr.bN(contentValues.get("_id") != null, "You must specify an _ID when inserting");
        } else {
            if (iMatch != 2) {
                if (iMatch != 3) {
                    throw new java.lang.IllegalArgumentException("Unknown uri: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
                }
                throw new java.lang.UnsupportedOperationException();
            }
            java.lang.Long lValueOf = java.lang.Long.valueOf(android.content.ContentUris.parseId(uri));
            java.lang.Long asLong = contentValues.getAsLong("_id");
            defpackage.ahvr.bW(asLong == null || asLong.equals(lValueOf), "_ID from values %s does not match ID from URI: %s", asLong, uri);
            if (asLong == null) {
                contentValues.put("_id", lValueOf);
            }
        }
        android.net.Uri uriWithAppendedId = null;
        long jInsert = writableDatabase.insert("AnnotatedCallLog", null, contentValues);
        if (jInsert < 0) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/calllog/database/AnnotatedCallLogContentProvider", "insert", (char) 201, "AnnotatedCallLogContentProvider.java")).y("error inserting row with id: %s", contentValues.get("_id"));
        } else {
            uriWithAppendedId = android.content.ContentUris.withAppendedId(kee.a, jInsert);
            if (!d()) {
                c(uriWithAppendedId);
            }
        }
        return uriWithAppendedId;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        android.database.Cursor cursorQuery;
        android.database.sqlite.SQLiteDatabase readableDatabase = a().getReadableDatabase();
        android.database.sqlite.SQLiteQueryBuilder sQLiteQueryBuilder = new android.database.sqlite.SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("AnnotatedCallLog");
        int iMatch = b.match(uri);
        java.lang.String queryParameter = uri.getQueryParameter("limit");
        if (iMatch == 1) {
            cursorQuery = sQLiteQueryBuilder.query(readableDatabase, strArr, str, strArr2, null, null, str2, queryParameter);
            if (cursorQuery != null) {
                cursorQuery.setNotificationUri(getContext().getContentResolver(), kee.a);
            } else {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/calllog/database/AnnotatedCallLogContentProvider", "query", (char) 129, "AnnotatedCallLogContentProvider.java")).v("cursor was null");
            }
        } else {
            if (iMatch != 2) {
                if (iMatch != 3) {
                    throw new java.lang.IllegalArgumentException("Unknown uri: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
                }
                defpackage.ahvr.bR(java.util.Arrays.equals(strArr, new java.lang.String[]{"number"}), "only NUMBER supported for projection for distinct phone number query, got: %s", java.util.Arrays.toString(strArr));
                sQLiteQueryBuilder.setDistinct(true);
                android.database.Cursor cursorQuery2 = sQLiteQueryBuilder.query(readableDatabase, strArr, str, strArr2, null, null, str2);
                if (cursorQuery2 != null) {
                    cursorQuery2.setNotificationUri(getContext().getContentResolver(), kee.a);
                    return cursorQuery2;
                }
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/calllog/database/AnnotatedCallLogContentProvider", "query", (char) 144, "AnnotatedCallLogContentProvider.java")).v("cursor was null");
                return cursorQuery2;
            }
            sQLiteQueryBuilder.appendWhere("_id=" + android.content.ContentUris.parseId(uri));
            cursorQuery = sQLiteQueryBuilder.query(readableDatabase, strArr, str, strArr2, null, null, str2, queryParameter);
            if (cursorQuery != null) {
                cursorQuery.setNotificationUri(getContext().getContentResolver(), kee.a);
            } else {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/calllog/database/AnnotatedCallLogContentProvider", "query", 'v', "AnnotatedCallLogContentProvider.java")).v("cursor was null");
            }
        }
        return cursorQuery;
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        int iUpdate;
        defpackage.ahvr.ci(contentValues);
        hgt.B(contentValues, 3);
        android.database.sqlite.SQLiteDatabase writableDatabase = a().getWritableDatabase();
        int iMatch = b.match(uri);
        if (iMatch == 1) {
            iUpdate = writableDatabase.update("AnnotatedCallLog", contentValues, str, strArr);
            if (iUpdate == 0) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/calllog/database/AnnotatedCallLogContentProvider", "update", (char) 260, "AnnotatedCallLogContentProvider.java")).v("no rows updated");
                return 0;
            }
            if (!d()) {
                c(uri);
            }
        } else {
            if (iMatch != 2) {
                if (iMatch != 3) {
                    throw new java.lang.IllegalArgumentException("Unknown uri: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
                }
                throw new java.lang.UnsupportedOperationException();
            }
            defpackage.ahvr.bN(!contentValues.containsKey("_id"), "Do not specify _ID when updating by ID");
            defpackage.ahvr.bN(str == null, "Do not specify selection when updating by ID");
            defpackage.ahvr.bN(strArr == null, "Do not specify selection args when updating by ID");
            iUpdate = writableDatabase.update("AnnotatedCallLog", contentValues, b(android.content.ContentUris.parseId(uri)), strArr);
            if (iUpdate == 0) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/calllog/database/AnnotatedCallLogContentProvider", "update", (char) 277, "AnnotatedCallLogContentProvider.java")).v("no rows updated");
                return 0;
            }
            if (!d()) {
                c(uri);
            }
        }
        return iUpdate;
    }
}
