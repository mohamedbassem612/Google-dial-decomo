package com.android.dialer.phonenumbercache;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
@java.lang.Deprecated
public class PhoneNumberCacheProvider extends android.content.ContentProvider {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/phonenumbercache/PhoneNumberCacheProvider");
    private static final android.content.UriMatcher b;
    private static final java.util.Set c;
    private static final defpackage.aihd d;
    private final java.lang.String[] e = new java.lang.String[1];
    private final defpackage.ahzi f = defpackage.ahvr.bI(new defpackage.rwp(this, 3));
    private java.io.File g;
    private java.io.File h;
    private defpackage.mfk i;

    static {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        b = uriMatcher;
        java.util.HashSet hashSet = new java.util.HashSet();
        c = hashSet;
        d = defpackage.aihd.v(defpackage.rmt.SOURCE_TYPE_PLACES, defpackage.rmt.SOURCE_TYPE_PROFILE, defpackage.rmt.SOURCE_TYPE_REMOTE_OTHER, defpackage.rmt.SOURCE_TYPE_REMOTE_MANUAL, defpackage.rmt.SOURCE_TYPE_REMOTE_GOOGLE_VOICE, defpackage.rmt.SOURCE_TYPE_REMOTE_CSA, defpackage.rmt.SOURCE_TYPE_REMOTE_KNOWLEDGE_GRAPH);
        uriMatcher.addURI("com.google.android.dialer.cacheprovider", "contact", 1000);
        uriMatcher.addURI("com.google.android.dialer.cacheprovider", "contact/*", 1001);
        uriMatcher.addURI("com.google.android.dialer.cacheprovider", "photo/*", 2000);
        uriMatcher.addURI("com.google.android.dialer.cacheprovider", "thumbnail/*", 3000);
        hashSet.add("number");
        hashSet.add("phone_type");
        hashSet.add("phone_label");
        hashSet.add("display_name");
        hashSet.add("photo_uri");
        hashSet.add("source_name");
        hashSet.add("source_type");
        hashSet.add("source_id");
        hashSet.add("lookup_key");
        hashSet.add("reported");
        hashSet.add("object_id");
        hashSet.add("user_type");
    }

    public static boolean a(defpackage.rmt rmtVar) {
        return d.contains(rmtVar);
    }

    private final java.io.File b(java.lang.String str) {
        return new java.io.File(this.h, str);
    }

    private final java.io.File c(java.lang.String str) {
        return new java.io.File(this.g, str);
    }

    private final java.lang.String d(java.lang.String str) {
        return android.telephony.PhoneNumberUtils.formatNumberToE164(str, defpackage.rlt.a(getContext(), null));
    }

    private final java.lang.String e(android.net.Uri uri) {
        if (uri.getPathSegments().size() == 2) {
            return d(uri.getLastPathSegment());
        }
        throw new java.lang.IllegalArgumentException("Invalid URI or phone number not provided");
    }

    private final void f(java.lang.String str, boolean z, boolean z2) {
        android.database.sqlite.SQLiteDatabase writableDatabase = this.i.getWritableDatabase();
        java.lang.String[] strArr = this.e;
        strArr[0] = str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UPDATE cached_number_contacts SET ");
        sb.append(true != z ? "has_thumbnail" : "has_photo");
        sb.append('=');
        sb.append(true != z2 ? "0" : "1");
        sb.append(" WHERE normalized_number=?;");
        writableDatabase.execSQL(sb.toString(), strArr);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahzr */
    private final boolean g(java.io.File file) throws ahzr {
        if (file.exists() || file.mkdirs()) {
            return true;
        }
        if (!((defpackage.ssj) defpackage.agab.aH(getContext(), defpackage.ssj.class)).ov().m()) {
            throw new ahzr("Unable to create photo storage directory ".concat(java.lang.String.valueOf(file.getPath())));
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/phonenumbercache/PhoneNumberCacheProvider", "createDirectoryIfDoesNotExist", 464, "PhoneNumberCacheProvider.java")).y("Unable to create photo storage directory in direct boot mode: %s", file.getPath());
        return false;
    }

    private final void h(java.lang.String str, boolean z) {
        (z ? b(str) : c(str)).delete();
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        if (((java.lang.Boolean) this.f.eZ()).booleanValue()) {
            return 0;
        }
        if (b.match(uri) != 1001) {
            throw new java.lang.IllegalArgumentException("Unknown URI or phone number not provided");
        }
        this.i.c();
        java.lang.String strE = e(uri);
        java.lang.String[] strArr2 = this.e;
        strArr2[0] = strE;
        android.database.sqlite.SQLiteDatabase writableDatabase = this.i.getWritableDatabase();
        h(strE, true);
        h(strE, false);
        return writableDatabase.delete("cached_number_contacts", "normalized_number=?", strArr2);
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        java.lang.String strE;
        defpackage.rmt rmtVarB;
        if (!((java.lang.Boolean) this.f.eZ()).booleanValue()) {
            int iMatch = b.match(uri);
            if (iMatch != 1000 && iMatch != 1001) {
                throw new java.lang.IllegalArgumentException("Unknown URI");
            }
            this.i.c();
            if (iMatch == 1000) {
                java.lang.String asString = contentValues.getAsString("number");
                if (asString == null || asString.length() == 0) {
                    throw new java.lang.IllegalArgumentException("Phone number not provided");
                }
                strE = d(asString);
            } else {
                strE = e(uri);
            }
            if (!android.text.TextUtils.isEmpty(strE)) {
                for (java.lang.String str : contentValues.keySet()) {
                    if (!c.contains(str)) {
                        contentValues.remove(str);
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/phonenumbercache/PhoneNumberCacheProvider", "insert", (char) 222, "PhoneNumberCacheProvider.java")).y("ignoring unsupported column for update: %s", str);
                    }
                }
                contentValues.put("normalized_number", strE);
                contentValues.put("time_last_updated", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                android.database.sqlite.SQLiteDatabase writableDatabase = this.i.getWritableDatabase();
                java.lang.String[] strArr = this.e;
                strArr[0] = strE;
                java.lang.Integer asInteger = contentValues.getAsInteger("source_type");
                if (asInteger == null || !a(defpackage.rmt.b(asInteger.intValue()))) {
                    try {
                        rmtVarB = defpackage.rmt.b((int) android.database.DatabaseUtils.longForQuery(writableDatabase, "SELECT source_type FROM cached_number_contacts WHERE normalized_number=?", strArr));
                    } catch (android.database.sqlite.SQLiteDoneException unused) {
                        rmtVarB = null;
                    }
                    if (rmtVarB == null || !a(rmtVarB)) {
                        writableDatabase.insertWithOnConflict("cached_number_contacts", null, contentValues, 5);
                    }
                } else {
                    writableDatabase.insertWithOnConflict("cached_number_contacts", null, contentValues, 5);
                }
                return uri;
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        this.i = defpackage.mfk.a(getContext());
        this.h = new java.io.File(getContext().getFilesDir(), "photos/raw");
        this.g = new java.io.File(getContext().getFilesDir(), "thumbnails/raw");
        return true;
    }

    @Override // android.content.ContentProvider
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str) throws java.io.FileNotFoundException {
        java.io.File fileC;
        java.io.File fileC2;
        if (((java.lang.Boolean) this.f.eZ()).booleanValue()) {
            throw new java.io.FileNotFoundException("Provider is disabled");
        }
        int iMatch = b.match(uri);
        if (iMatch != 2000 && iMatch != 3000) {
            throw new java.io.FileNotFoundException("Unknown or unsupported URI");
        }
        java.lang.String strE = e(uri);
        android.database.sqlite.SQLiteDatabase readableDatabase = this.i.getReadableDatabase();
        java.lang.String[] strArr = this.e;
        boolean z = false;
        strArr[0] = strE;
        if (android.database.DatabaseUtils.queryNumEntries(readableDatabase, "cached_number_contacts", "normalized_number=?", strArr) <= 0) {
            throw new java.io.FileNotFoundException("Phone number does not exist in cache");
        }
        boolean z2 = true;
        if (str.equals("r")) {
            if (iMatch == 2000) {
                fileC = b(strE);
            } else {
                fileC = c(strE);
                z2 = false;
            }
            if (fileC.exists()) {
                return android.os.ParcelFileDescriptor.open(fileC, 268435456);
            }
            f(strE, z2, false);
            throw new java.io.FileNotFoundException("No photo file found for number: ".concat(java.lang.String.valueOf(strE)));
        }
        if (!g(this.h) || !g(this.g)) {
            return null;
        }
        if (iMatch == 2000) {
            fileC2 = b(strE);
            z = true;
        } else {
            fileC2 = c(strE);
        }
        try {
            if (!fileC2.exists()) {
                fileC2.createNewFile();
                f(strE, z, true);
            }
            try {
                return android.os.ParcelFileDescriptor.open(fileC2, 805306368);
            } catch (java.io.FileNotFoundException e) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/phonenumbercache/PhoneNumberCacheProvider", "openFileForWrite", 420, "PhoneNumberCacheProvider.java")).v("failed to open file for write");
                return null;
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        if (((java.lang.Boolean) this.f.eZ()).booleanValue()) {
            return new ssi(strArr == null ? new java.lang.String[0] : strArr);
        }
        if (defpackage.zqz.a(getContext(), "android.permission.READ_CONTACTS")) {
            android.content.UriMatcher uriMatcher = b;
            if (uriMatcher.match(uri) == 1000) {
                return this.i.getReadableDatabase().query("cached_number_contacts", strArr, str, strArr2, null, null, str2);
            }
            if (uriMatcher.match(uri) == 1001) {
                java.lang.String strE = e(uri);
                if (strE == null) {
                    return new ssi(strArr);
                }
                this.i.c();
                java.lang.String[] strArr3 = this.e;
                strArr3[0] = strE;
                return this.i.getWritableDatabase().query("cached_number_contacts", strArr, "normalized_number=?", strArr3, null, null, null);
            }
        } else {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/phonenumbercache/PhoneNumberCacheProvider", "query", 149, "PhoneNumberCacheProvider.java")).v("contacts permission denied");
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("The cache does not support update operations. Use insert to replace an existing phone number, if needed.");
    }
}
