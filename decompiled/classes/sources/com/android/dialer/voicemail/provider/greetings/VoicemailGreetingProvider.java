package com.android.dialer.voicemail.provider.greetings;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class VoicemailGreetingProvider extends android.content.ContentProvider {
    private static final android.content.UriMatcher b;
    private java.io.File d;
    private android.database.sqlite.SQLiteDatabase e;
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/provider/greetings/VoicemailGreetingProvider");
    private static final java.lang.Object c = new java.lang.Object();

    static {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        b = uriMatcher;
        uriMatcher.addURI("com.google.android.voicemail.provider", "greeting", 1);
        uriMatcher.addURI("com.google.android.voicemail.provider", "greeting/*", 2);
    }

    private final void a(java.lang.String str, java.lang.String[] strArr) {
        android.database.Cursor cursorQuery = this.e.query("greeting", new java.lang.String[]{"_data"}, str, strArr, null, null, null);
        while (cursorQuery != null) {
            try {
                if (!cursorQuery.moveToNext()) {
                    cursorQuery.close();
                    return;
                }
                java.lang.String string = cursorQuery.getString(0);
                if (!android.text.TextUtils.isEmpty(string)) {
                    java.io.File file = new java.io.File(string);
                    if (file.exists()) {
                        file.delete();
                    } else {
                        continue;
                    }
                }
            } catch (java.lang.Throwable th) {
                try {
                    cursorQuery.close();
                    throw th;
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
    }

    private final long b(android.net.Uri uri, android.content.ContentValues contentValues) {
        try {
            return this.e.insertOrThrow("greeting", null, contentValues);
        } catch (android.database.sqlite.SQLiteConstraintException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).k(e)).i(defpackage.zct.a)).l("com/android/dialer/voicemail/provider/greetings/VoicemailGreetingProvider", "insertOrUpdateGreeting", 238, "VoicemailGreetingProvider.java")).v("Failed insert due to constraint failure, attempting update");
            defpackage.rsr rsrVarD = defpackage.zjm.D(contentValues.getAsString("phone_account_component_name"), contentValues.getAsString("phone_account_id"));
            java.lang.Object obj = rsrVarD.b;
            java.lang.Object obj2 = rsrVarD.a;
            defpackage.aift aiftVar = new defpackage.aift(4);
            android.database.Cursor cursorQuery = this.e.query("greeting", new java.lang.String[]{"_id"}, (java.lang.String) obj, (java.lang.String[]) obj2, null, null, null);
            while (cursorQuery != null) {
                try {
                    if (!cursorQuery.moveToNext()) {
                        cursorQuery.close();
                        break;
                    }
                    aiftVar.i(java.lang.Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"))));
                } catch (java.lang.Throwable th) {
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            defpackage.aify aifyVarG = aiftVar.g();
            defpackage.ahvr.bN(((defpackage.aike) aifyVarG).d == 1, "multiple updates are not allowed");
            long jLongValue = ((java.lang.Long) aifyVarG.get(0)).longValue();
            defpackage.ahvr.bR(update(uri, contentValues, (java.lang.String) rsrVarD.b, (java.lang.String[]) rsrVarD.a) != 0, "Unable to update greeting with uri %s", uri);
            return jLongValue;
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        int iDelete;
        if (b.match(uri) != 1) {
            throw new java.lang.IllegalArgumentException("Invalid URI ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
        }
        synchronized (c) {
            a(str, strArr);
            iDelete = this.e.delete("greeting", str, strArr);
        }
        defpackage.wsc.aM(getContext()).aZ().p(uri);
        return iDelete;
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        if (b.match(uri) == 1) {
            return "vnd.android.cursor.item/greeting";
        }
        throw new java.lang.IllegalArgumentException("Invalid URI ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        long jB;
        if (b.match(uri) != 1) {
            throw new java.lang.IllegalArgumentException("Unknown URI ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
        }
        synchronized (c) {
            defpackage.ahvr.ci(contentValues);
            contentValues.put("_data", new java.io.File(this.d, java.util.UUID.randomUUID().toString()).getAbsolutePath());
            jB = b(uri, contentValues);
        }
        if (jB <= 0) {
            return null;
        }
        defpackage.wsc.aM(getContext()).aZ().p(uri);
        return android.content.ContentUris.withAppendedId(vbk.a, jB);
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        java.io.File file = new java.io.File(getContext().getFilesDir(), "audios/raw");
        this.d = file;
        if (!file.exists()) {
            defpackage.ahvr.bR(this.d.mkdirs(), "Unable to create audio storage directory %s", this.d.getPath());
        }
        try {
            this.e = new defpackage.vbh(getContext()).getWritableDatabase();
        } catch (android.database.sqlite.SQLiteCantOpenDatabaseException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/voicemail/provider/greetings/VoicemailGreetingProvider", "onCreate", 'Q', "VoicemailGreetingProvider.java")).v("Failed to open database!");
        }
        return this.e != null;
    }

    @Override // android.content.ContentProvider
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str) {
        return openFileHelper(uri, str);
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        int iMatch = b.match(uri);
        if (iMatch == 1) {
            android.database.Cursor cursorQuery = this.e.query("greeting", strArr, str, strArr2, null, null, str2);
            cursorQuery.setNotificationUri(getContext().getContentResolver(), uri);
            return cursorQuery;
        }
        if (iMatch != 2) {
            throw new java.lang.IllegalArgumentException("Invalid URI ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
        }
        java.lang.String lastPathSegment = uri.getLastPathSegment();
        defpackage.rsr rsrVar = new defpackage.rsr();
        rsrVar.aC(new defpackage.kaw("_id").aI("=", lastPathSegment));
        defpackage.rsr rsrVarAB = rsrVar.aB();
        return this.e.query("greeting", null, (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a, null, null, str2);
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        int iUpdate;
        if (b.match(uri) != 1) {
            throw new java.lang.IllegalArgumentException("Invalid URI ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
        }
        synchronized (c) {
            a(str, strArr);
            defpackage.ahvr.ci(contentValues);
            contentValues.put("_data", new java.io.File(this.d, java.util.UUID.randomUUID().toString()).getAbsolutePath());
            iUpdate = this.e.update("greeting", contentValues, str, strArr);
        }
        defpackage.wsc.aM(getContext()).aZ().p(uri);
        return iUpdate;
    }
}
