package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class suh extends android.database.sqlite.SQLiteOpenHelper {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/preferredsim/impl/PreferredSimDatabaseHelper");
    public final android.content.Context b;

    public suh(android.content.Context context) {
        super(context, "preferred_sim.db", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
        this.b = context;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/preferredsim/impl/PreferredSimDatabaseHelper", "onCreate", 84, "PreferredSimDatabaseHelper.java")).v("onCreate");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        sQLiteDatabase.execSQL("create table if not exists preferred_sim (data_id integer primary key, preferred_phone_account_component_name text, preferred_phone_account_id text);");
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/preferredsim/impl/PreferredSimDatabaseHelper", "onCreate", 87, "PreferredSimDatabaseHelper.java")).x("took: %dms", java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        defpackage.ajcq ajcqVarI;
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/preferredsim/impl/PreferredSimDatabaseHelper", "onOpen", 95, "PreferredSimDatabaseHelper.java")).v("onOpen");
        super.onOpen(sQLiteDatabase);
        try {
            if (android.os.Build.VERSION.SDK_INT < 33) {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/preferredsim/impl/PreferredSimDatabaseHelper", "migrateIccIdToSubId", 108, "PreferredSimDatabaseHelper.java")).v("version older than T doesn't need migration");
                ajcqVarI = defpackage.ajcm.a;
            } else {
                defpackage.sug sugVar = (defpackage.sug) defpackage.agab.aH(this.b, defpackage.sug.class);
                ajcqVarI = defpackage.ahrv.g(defpackage.ahrv.g(sugVar.tq().bk()).h(new rht(12), sugVar.fH())).i(new sue(this, sugVar, sQLiteDatabase, 2), sugVar.fH());
            }
            ajcqVarI.get(2L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/preferredsim/impl/PreferredSimDatabaseHelper", "onOpen", 'e', "PreferredSimDatabaseHelper.java")).v("failed to migrate");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
