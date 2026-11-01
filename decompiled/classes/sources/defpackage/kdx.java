package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kdx extends android.database.sqlite.SQLiteOpenHelper {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/database/AnnotatedCallLogDatabaseHelper");

    public kdx(android.content.Context context) {
        super(context, "annotated_call_log.db", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 26);
    }

    private static void a(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists AnnotatedCallLog (_id integer primary key, timestamp integer, number blob, formatted_number text, presentation integer, duration integer, data_usage integer, is_read integer, new integer, geocoded_location text, phone_account_component_name text, phone_account_id text, features integer, voicemail_uri text, call_type integer, number_attributes blob, is_voicemail_call integer, voicemail_call_tag text, transcription_state integer, call_mapping_id text,spam_status blob,voicemail_transcription text,callee_id blob,raw_number text,atlas_call_details blob,call_screen_details blob,call_recording_details blob,calling_networks_attributes blob,xatu_call_details blob,enriched_calling_details blob,fides_details blob,dobby_calllog_details blob,uuid text,name text,lookup_uri text);");
        sQLiteDatabase.execSQL("create index call_type_index on AnnotatedCallLog (call_type);");
        sQLiteDatabase.execSQL("create index number_index on AnnotatedCallLog (number);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/calllog/database/AnnotatedCallLogDatabaseHelper", "onCreate", 119, "AnnotatedCallLogDatabaseHelper.java")).v("onCreate");
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 9) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/calllog/database/AnnotatedCallLogDatabaseHelper", "wipeAndRecreateAtCurrentVersion", 196, "AnnotatedCallLogDatabaseHelper.java")).v("wipeAndRecreateAtCurrentVersion");
            sQLiteDatabase.execSQL("drop table if exists AnnotatedCallLog");
            a(sQLiteDatabase);
            return;
        }
        if (i < 12) {
            sQLiteDatabase.execSQL("alter table AnnotatedCallLog add column atlas_call_details blob;");
        }
        if (i < 13) {
            sQLiteDatabase.execSQL("alter table AnnotatedCallLog add column call_screen_details blob;");
        }
        if (i < 14) {
            sQLiteDatabase.execSQL("alter table AnnotatedCallLog add column call_recording_details blob;");
        }
        if (i < 16) {
            sQLiteDatabase.execSQL("alter table AnnotatedCallLog add column calling_networks_attributes blob;");
        }
        if (i < 17) {
            sQLiteDatabase.execSQL("alter table AnnotatedCallLog add column xatu_call_details blob;");
        }
        if (i < 18) {
            sQLiteDatabase.execSQL("alter table AnnotatedCallLog add column enriched_calling_details blob;");
        }
        if (i < 19) {
            sQLiteDatabase.execSQL("alter table AnnotatedCallLog add column fides_details blob;");
        }
        if (i < 20) {
            sQLiteDatabase.execSQL("alter table AnnotatedCallLog add column dobby_calllog_details blob;");
        }
        if (i < 21) {
            try {
                sQLiteDatabase.execSQL("update AnnotatedCallLog set call_verification_details=null;");
            } catch (android.database.sqlite.SQLiteException unused) {
            }
        }
        if (i < 24) {
            try {
                sQLiteDatabase.execSQL("update AnnotatedCallLog set fermat_call_log_details=null;");
            } catch (android.database.sqlite.SQLiteException unused2) {
            }
            try {
                sQLiteDatabase.execSQL("update AnnotatedCallLog set sharpie_call_log_details=null;");
            } catch (android.database.sqlite.SQLiteException unused3) {
            }
        }
        if (i < 25) {
            sQLiteDatabase.execSQL("alter table AnnotatedCallLog add column uuid text;");
            sQLiteDatabase.execSQL("alter table AnnotatedCallLog add column name text;");
        }
        if (i < 26) {
            sQLiteDatabase.execSQL("alter table AnnotatedCallLog add column lookup_uri text;");
        }
    }
}
