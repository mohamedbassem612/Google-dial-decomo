package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adjs extends android.database.sqlite.SQLiteOpenHelper implements defpackage.adiz {
    public static final /* synthetic */ int b = 0;
    private static final java.lang.String[] c = {"CREATE TABLE pending_downloads (_id INTEGER PRIMARY KEY AUTOINCREMENT, download_id TEXT, priority INT DEFAULT(0), urls TEXT, start_timestamp_millis INT DEFAULT(0), requires_unmetered_network INT DEFAULT(1), requires_charging INT DEFAULT(0), file_path TEXT, completed INT DEFAULT(0), failure TEXT, next_retry_time_millis INT DEFAULT(0), retry_count INT DEFAULT(0), superpack_name TEXT, superpack_version INT DEFAULT(0), ttl_millis INT DEFAULT(0), scheduling_flags INT DEFAULT(2), requires_idle INT DEFAULT(0), requires_battery_not_low INT DEFAULT(0), UNIQUE (download_id) ON CONFLICT FAIL)", "CREATE TABLE file_metadata (_id INTEGER PRIMARY KEY AUTOINCREMENT, namespace TEXT, name TEXT, gc_priority INT DEFAULT(0), reservation_state INT DEFAULT(0), last_access_millis INT DEFAULT(0), reserved_size INT DEFAULT(0), source TEXT,superpack_name TEXT, superpack_version INT DEFAULT(0), validation_count INT DEFAULT(0),  UNIQUE (namespace, name) ON CONFLICT FAIL)", "CREATE TABLE selected_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, superpack_name TEXT NOT NULL, superpack_version INT DEFAULT(0), pack_list TEXT, sync_metadata BLOB, UNIQUE (superpack_name) ON CONFLICT FAIL)", "CREATE TABLE pending_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, parent_id TEXT NOT NULL, pack_name TEXT NOT NULL, packing_scheme TEXT, UNIQUE (parent_id, pack_name) ON CONFLICT FAIL)", "CREATE TABLE manifest_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, version INT DEFAULT(0), UNIQUE (name) ON CONFLICT FAIL)"};
    private static final java.lang.String[] d = {"CREATE TABLE pending_downloads (_id INTEGER PRIMARY KEY AUTOINCREMENT, download_id TEXT, priority INT DEFAULT(0), urls TEXT, start_timestamp_millis INT DEFAULT(0), requires_unmetered_network INT DEFAULT(1), requires_charging INT DEFAULT(0), file_path TEXT, completed INT DEFAULT(0), failure TEXT, next_retry_time_millis INT DEFAULT(0), retry_count INT DEFAULT(0), superpack_name TEXT, superpack_version INT DEFAULT(0), ttl_millis INT DEFAULT(0), scheduling_flags INT DEFAULT(2), UNIQUE (download_id) ON CONFLICT FAIL)", "CREATE TABLE file_metadata (_id INTEGER PRIMARY KEY AUTOINCREMENT, namespace TEXT, name TEXT, gc_priority INT DEFAULT(0), reservation_state INT DEFAULT(0), last_access_millis INT DEFAULT(0), reserved_size INT DEFAULT(0), source TEXT,superpack_name TEXT, superpack_version INT DEFAULT(0), validation_count INT DEFAULT(0),  UNIQUE (namespace, name) ON CONFLICT FAIL)", "CREATE TABLE selected_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, superpack_name TEXT NOT NULL, superpack_version INT DEFAULT(0), pack_list TEXT, sync_metadata BLOB, UNIQUE (superpack_name) ON CONFLICT FAIL)", "CREATE TABLE pending_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, parent_id TEXT NOT NULL, pack_name TEXT NOT NULL, packing_scheme TEXT, UNIQUE (parent_id, pack_name) ON CONFLICT FAIL)", "CREATE TABLE manifest_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, version INT DEFAULT(0), UNIQUE (name) ON CONFLICT FAIL)"};
    private static final java.lang.String[] e = {"CREATE TABLE pending_downloads (_id INTEGER PRIMARY KEY AUTOINCREMENT, download_id TEXT, priority INT DEFAULT(0), urls TEXT, start_timestamp_millis INT DEFAULT(0), requires_unmetered_network INT DEFAULT(1), requires_charging INT DEFAULT(0), file_path TEXT, completed INT DEFAULT(0), failure TEXT, next_retry_time_millis INT DEFAULT(0), retry_count INT DEFAULT(0), superpack_name TEXT, superpack_version INT DEFAULT(0), ttl_millis INT DEFAULT(0), scheduling_flags INT DEFAULT(2), UNIQUE (download_id) ON CONFLICT FAIL)", "CREATE TABLE file_metadata (_id INTEGER PRIMARY KEY AUTOINCREMENT, namespace TEXT, name TEXT, gc_priority INT DEFAULT(0), reservation_state INT DEFAULT(0), last_access_millis INT DEFAULT(0), reserved_size INT DEFAULT(0), source TEXT,superpack_name TEXT, superpack_version INT DEFAULT(0), validation_count INT DEFAULT(0),  UNIQUE (namespace, name) ON CONFLICT FAIL)", "CREATE TABLE selected_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, superpack_name TEXT NOT NULL, superpack_version INT DEFAULT(0), pack_list TEXT, UNIQUE (superpack_name) ON CONFLICT FAIL)", "CREATE TABLE pending_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, parent_id TEXT NOT NULL, pack_name TEXT NOT NULL, packing_scheme TEXT, UNIQUE (parent_id, pack_name) ON CONFLICT FAIL)", "CREATE TABLE manifest_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, version INT DEFAULT(0), UNIQUE (name) ON CONFLICT FAIL)"};
    private static final java.lang.String[] f = {defpackage.adjj.e, "CREATE TABLE file_metadata (_id INTEGER PRIMARY KEY AUTOINCREMENT, namespace TEXT, name TEXT, gc_priority INT DEFAULT(0), reservation_state INT DEFAULT(0), last_access_millis INT DEFAULT(0), reserved_size INT DEFAULT(0), source TEXT,superpack_name TEXT, superpack_version INT DEFAULT(0), validation_count INT DEFAULT(0),  UNIQUE (namespace, name) ON CONFLICT FAIL)", "CREATE TABLE selected_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, superpack_name TEXT NOT NULL, superpack_version INT DEFAULT(0), pack_list TEXT, UNIQUE (superpack_name) ON CONFLICT FAIL)", "CREATE TABLE pending_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, parent_id TEXT NOT NULL, pack_name TEXT NOT NULL, packing_scheme TEXT, UNIQUE (parent_id, pack_name) ON CONFLICT FAIL)", "CREATE TABLE manifest_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, version INT DEFAULT(0), UNIQUE (name) ON CONFLICT FAIL)"};
    private static final java.lang.String[] g;
    private static final java.lang.String[] h;
    private static final java.lang.String[] i;
    private static final java.lang.String[] j;
    private static volatile defpackage.adjs k;
    private static final java.lang.Object l;
    public final defpackage.tvn a;
    private final int m;

    static {
        java.lang.String str = defpackage.adjj.d;
        g = new java.lang.String[]{str, "CREATE TABLE file_metadata (_id INTEGER PRIMARY KEY AUTOINCREMENT, namespace TEXT, name TEXT, gc_priority INT DEFAULT(0), reservation_state INT DEFAULT(0), last_access_millis INT DEFAULT(0), reserved_size INT DEFAULT(0), source TEXT,superpack_name TEXT, superpack_version INT DEFAULT(0), validation_count INT DEFAULT(0),  UNIQUE (namespace, name) ON CONFLICT FAIL)", "CREATE TABLE selected_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, superpack_name TEXT NOT NULL, superpack_version INT DEFAULT(0), pack_list TEXT, UNIQUE (superpack_name) ON CONFLICT FAIL)", "CREATE TABLE pending_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, parent_id TEXT NOT NULL, pack_name TEXT NOT NULL, packing_scheme TEXT, UNIQUE (parent_id, pack_name) ON CONFLICT FAIL)", "CREATE TABLE manifest_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, version INT DEFAULT(0), UNIQUE (name) ON CONFLICT FAIL)"};
        h = new java.lang.String[]{str, "CREATE TABLE file_metadata (_id INTEGER PRIMARY KEY AUTOINCREMENT, namespace TEXT, name TEXT, gc_priority INT DEFAULT(0), reservation_state INT DEFAULT(0), last_access_millis INT DEFAULT(0), reserved_size INT DEFAULT(0), source TEXT,superpack_name TEXT, superpack_version INT DEFAULT(0),  UNIQUE (namespace, name) ON CONFLICT FAIL)", "CREATE TABLE selected_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, superpack_name TEXT NOT NULL, superpack_version INT DEFAULT(0), pack_list TEXT, UNIQUE (superpack_name) ON CONFLICT FAIL)", "CREATE TABLE pending_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, parent_id TEXT NOT NULL, pack_name TEXT NOT NULL, packing_scheme TEXT, UNIQUE (parent_id, pack_name) ON CONFLICT FAIL)", "CREATE TABLE manifest_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, version INT DEFAULT(0), UNIQUE (name) ON CONFLICT FAIL)"};
        i = new java.lang.String[]{"CREATE TABLE pending_downloads (_id INTEGER PRIMARY KEY AUTOINCREMENT, download_id TEXT, priority INT DEFAULT(0), urls TEXT, start_timestamp_millis INT DEFAULT(0), requires_unmetered_network INT DEFAULT(1), requires_charging INT DEFAULT(0), connection_attempts INT DEFAULT(3), file_path TEXT, completed INT DEFAULT(0), failure TEXT, next_retry_time_millis INT DEFAULT(0), retry_count INT DEFAULT(0), superpack_name TEXT, superpack_version INT DEFAULT(0), ttl_millis INT DEFAULT(0), UNIQUE (download_id) ON CONFLICT FAIL)", "CREATE TABLE file_metadata (_id INTEGER PRIMARY KEY AUTOINCREMENT, namespace TEXT, name TEXT, gc_priority INT DEFAULT(0), reservation_state INT DEFAULT(0), last_access_millis INT DEFAULT(0), reserved_size INT DEFAULT(0), source TEXT,superpack_name TEXT, superpack_version INT DEFAULT(0),  UNIQUE (namespace, name) ON CONFLICT FAIL)", "CREATE TABLE selected_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, superpack_name TEXT NOT NULL, superpack_version INT DEFAULT(0), pack_list TEXT, UNIQUE (superpack_name) ON CONFLICT FAIL)", "CREATE TABLE pending_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, parent_id TEXT NOT NULL, pack_name TEXT NOT NULL, packing_scheme TEXT, UNIQUE (parent_id, pack_name) ON CONFLICT FAIL)", "CREATE TABLE manifest_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, version INT DEFAULT(0), UNIQUE (name) ON CONFLICT FAIL)"};
        j = new java.lang.String[]{"DROP TABLE IF EXISTS pending_downloads", "DROP TABLE IF EXISTS file_metadata", "DROP TABLE IF EXISTS selected_packs", "DROP TABLE IF EXISTS pending_packs", "DROP TABLE IF EXISTS manifest_table"};
        l = new java.lang.Object();
    }

    private adjs(android.content.Context context) {
        super(context, "superpacks.db", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 17);
        this.a = new defpackage.tvn((char[]) null);
        this.m = 17;
    }

    public static defpackage.adjs b(android.content.Context context) {
        if (k == null) {
            synchronized (l) {
                if (k == null) {
                    k = new defpackage.adjs(context);
                }
            }
        }
        return k;
    }

    private static void d(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i2) {
        java.lang.String[] strArr;
        switch (i2) {
            case 11:
                strArr = i;
                break;
            case 12:
                strArr = h;
                break;
            case 13:
                strArr = g;
                break;
            case 14:
                strArr = f;
                break;
            case 15:
                strArr = e;
                break;
            case 16:
                strArr = d;
                break;
            case 17:
                strArr = c;
                break;
            default:
                throw new java.lang.IllegalArgumentException(defpackage.a.bj(i2, "Invalid database version: "));
        }
        int length = strArr.length;
        for (int i3 = 0; i3 < 5; i3++) {
            sQLiteDatabase.execSQL(strArr[i3]);
        }
    }

    @Override // defpackage.adja
    public final void a(java.io.IOException iOException) {
        this.a.P(new adfv(iOException, 2));
    }

    public final void c(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        java.lang.String[] strArr = j;
        int length = strArr.length;
        for (int i2 = 0; i2 < 5; i2++) {
            sQLiteDatabase.execSQL(strArr[i2]);
        }
        d(sQLiteDatabase, this.m);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        defpackage.aiob aiobVar = (defpackage.aiob) defpackage.adhn.a.b();
        int i2 = this.m;
        aiobVar.G("Creating database %s, version %d", "superpacks.db", i2);
        d(sQLiteDatabase, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        ((defpackage.aiob) defpackage.adhn.a.b()).M("Downgrading database %s, old version: %d, new version: %d", "superpacks.db", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3));
        c(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        ((defpackage.aiob) defpackage.adhn.a.b()).M("Upgrading database %s, old version: %d, new version: %d", "superpacks.db", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3));
        switch (i2) {
            case 11:
                if (i3 >= 12) {
                    sQLiteDatabase.execSQL("ALTER TABLE pending_downloads ADD COLUMN http_conn_timeout_millis INT DEFAULT(" + defpackage.adjj.a + ')');
                    sQLiteDatabase.execSQL("ALTER TABLE pending_downloads ADD COLUMN http_read_timeout_millis INT DEFAULT(" + defpackage.adjj.b + ')');
                    sQLiteDatabase.execSQL("ALTER TABLE pending_downloads ADD COLUMN http_write_timeout_millis INT DEFAULT(" + defpackage.adjj.c + ')');
                    sQLiteDatabase.execSQL("ALTER TABLE pending_downloads ADD COLUMN http_retry_on_conn_failure INT DEFAULT(1)");
                    break;
                }
            case 12:
                if (i3 >= 13) {
                    sQLiteDatabase.execSQL("ALTER TABLE file_metadata ADD COLUMN validation_count INT DEFAULT(0)");
                    break;
                }
            case 13:
                if (i3 >= 14) {
                    int i4 = defpackage.adjj.f;
                    sQLiteDatabase.execSQL("ALTER TABLE pending_downloads ADD COLUMN scheduling_flags INT DEFAULT(2)");
                    break;
                }
            case 14:
                if (i3 >= 15) {
                    int i5 = defpackage.adjj.f;
                    java.lang.String[] strArr = {"connection_attempts", "http_conn_timeout_millis", "http_read_timeout_millis", "http_write_timeout_millis", "http_retry_on_conn_failure"};
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    android.database.Cursor cursorRawQuery = null;
                    try {
                        cursorRawQuery = sQLiteDatabase.rawQuery("pragma table_info(pending_downloads);", null);
                        while (cursorRawQuery.moveToNext()) {
                            arrayList.add(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("name")));
                        }
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        arrayList.removeAll(java.util.Arrays.asList(strArr));
                        java.lang.String[] strArr2 = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
                        sQLiteDatabase.beginTransaction();
                        try {
                            sQLiteDatabase.execSQL("ALTER TABLE pending_downloads RENAME TO pending_downloads_old;");
                            sQLiteDatabase.execSQL("CREATE TABLE pending_downloads (_id INTEGER PRIMARY KEY AUTOINCREMENT, download_id TEXT, priority INT DEFAULT(0), urls TEXT, start_timestamp_millis INT DEFAULT(0), requires_unmetered_network INT DEFAULT(1), requires_charging INT DEFAULT(0), file_path TEXT, completed INT DEFAULT(0), failure TEXT, next_retry_time_millis INT DEFAULT(0), retry_count INT DEFAULT(0), superpack_name TEXT, superpack_version INT DEFAULT(0), ttl_millis INT DEFAULT(0), scheduling_flags INT DEFAULT(2), UNIQUE (download_id) ON CONFLICT FAIL)");
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            sb.append("INSERT INTO ");
                            sb.append("pending_downloads");
                            sb.append("(");
                            afcd.g(",", strArr2, sb);
                            sb.append(") SELECT ");
                            afcd.g(",", strArr2, sb);
                            sb.append(" FROM ");
                            sb.append("pending_downloads");
                            sb.append("_old;");
                            afao afaoVarF = afcd.f(sb, arrayList2);
                            sQLiteDatabase.execSQL(afaoVarF.a, afaoVarF.a());
                            sQLiteDatabase.execSQL("DROP TABLE pending_downloads_old;");
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                        } catch (java.lang.Throwable th) {
                            sQLiteDatabase.endTransaction();
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        throw th2;
                    }
                    break;
                }
            case 15:
                if (i3 >= 16) {
                    sQLiteDatabase.execSQL("ALTER TABLE selected_packs ADD COLUMN sync_metadata BLOB ");
                    break;
                }
            case 16:
                if (i3 >= 17) {
                    int i6 = defpackage.adjj.f;
                    sQLiteDatabase.execSQL("ALTER TABLE pending_downloads ADD COLUMN requires_idle INT DEFAULT(0)");
                    sQLiteDatabase.execSQL("ALTER TABLE pending_downloads ADD COLUMN requires_battery_not_low INT DEFAULT(0)");
                    return;
                }
                return;
            default:
                c(sQLiteDatabase);
                return;
        }
    }
}
