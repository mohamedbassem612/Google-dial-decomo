package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class lkw extends defpackage.ghg {
    public lkw() {
        super(2, 3);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0052 A[Catch: all -> 0x0094, TRY_LEAVE, TryCatch #0 {all -> 0x0094, blocks: (B:4:0x002f, B:6:0x0035, B:8:0x003d, B:11:0x004b, B:14:0x0052), top: B:26:0x002f }] */
    @Override // defpackage.ghg
    public final void a(defpackage.gip gipVar) {
        defpackage.aimz aimzVar = defpackage.lla.a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callscreen/impl/storage/database/impl/TranscriptDatabaseMigrations", "revelioCallTypeColumnExists", 91, "TranscriptDatabaseMigrations.java")).v("revelioCallTypeColumnExists");
        android.database.Cursor cursorB = gipVar.b(java.lang.String.format("PRAGMA table_info('%s')", "Transcript"));
        if (cursorB != null) {
            try {
                if (cursorB.moveToFirst()) {
                    do {
                        int columnIndex = cursorB.getColumnIndex("name");
                        if (columnIndex >= 0 && "revelioCallType".equals(cursorB.getString(columnIndex))) {
                            cursorB.close();
                            return;
                        }
                    } while (cursorB.moveToNext());
                } else {
                    ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callscreen/impl/storage/database/impl/TranscriptDatabaseMigrations", "revelioCallTypeColumnExists", 97, "TranscriptDatabaseMigrations.java")).v("Could not access table data for Transcript database.");
                    if (cursorB != null) {
                    }
                }
                cursorB.close();
            } catch (java.lang.Throwable th) {
                if (cursorB != null) {
                    try {
                        cursorB.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } else {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callscreen/impl/storage/database/impl/TranscriptDatabaseMigrations", "revelioCallTypeColumnExists", 97, "TranscriptDatabaseMigrations.java")).v("Could not access table data for Transcript database.");
            if (cursorB != null) {
                cursorB.close();
            }
        }
        ((defpackage.aimw) ((defpackage.aimw) defpackage.lla.a.b()).l("com/android/dialer/callscreen/impl/storage/database/impl/TranscriptDatabaseMigrations$1", "migrate", 39, "TranscriptDatabaseMigrations.java")).v("TranscriptDatabase does not contain revelioCallType column, adding it now.");
        gipVar.j(java.lang.String.format("ALTER TABLE %s ADD COLUMN %s INTEGER", "Transcript", "revelioCallType"));
    }
}
