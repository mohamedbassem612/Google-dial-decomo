package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tdx extends android.database.sqlite.SQLiteOpenHelper {
    private static final aimz a = aimz.i("com/android/dialer/rtt/transcript/RttTranscriptDatabaseHelper");
    private static final java.lang.Object b = new java.lang.Object();
    private final android.content.Context c;

    public tdx(android.content.Context context) {
        super(context, "rtt_transcript.db", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
        this.c = context;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final android.database.sqlite.SQLiteDatabase getReadableDatabase() {
        android.database.sqlite.SQLiteDatabase readableDatabase;
        if (!((java.lang.Boolean) defpackage.sns.j(this.c).hO().a()).booleanValue()) {
            return super.getReadableDatabase();
        }
        synchronized (b) {
            readableDatabase = super.getReadableDatabase();
        }
        return readableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        android.database.sqlite.SQLiteDatabase writableDatabase;
        if (!((java.lang.Boolean) defpackage.sns.j(this.c).hO().a()).booleanValue()) {
            return super.getWritableDatabase();
        }
        synchronized (b) {
            writableDatabase = super.getWritableDatabase();
        }
        return writableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/rtt/transcript/RttTranscriptDatabaseHelper", "onCreate", 59, "RttTranscriptDatabaseHelper.java").v("enter");
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        sQLiteDatabase.execSQL("create table if not exists rtt_transcript (rtt_transcript_id integer primary key, transcript_data blob not null);");
        aimzVar.b().l("com/android/dialer/rtt/transcript/RttTranscriptDatabaseHelper", "onCreate", 62, "RttTranscriptDatabaseHelper.java").x("took: %dms", android.os.SystemClock.elapsedRealtime() - jElapsedRealtime);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
