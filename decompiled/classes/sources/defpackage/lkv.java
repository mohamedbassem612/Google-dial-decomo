package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lkv extends defpackage.gga {
    final /* synthetic */ com.android.dialer.callscreen.impl.storage.database.TranscriptDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkv(com.android.dialer.callscreen.impl.storage.database.TranscriptDatabase_Impl transcriptDatabase_Impl) {
        super(6, "f69806c35a76c12bbde999220de56c45", "f3db9050f8b76f1bdaed74a0de3c993c");
        j$.util.Objects.requireNonNull(transcriptDatabase_Impl);
        this.d = transcriptDatabase_Impl;
    }

    @Override // defpackage.gga
    public final void a(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `Transcript` (`id` TEXT NOT NULL, `conversation` BLOB, `audioRecordingFilePath` TEXT, `isRated` INTEGER NOT NULL, `revelioCallType` INTEGER, `lastModifiedMillis` INTEGER NOT NULL, `callScreenFeedbackData` BLOB, PRIMARY KEY(`id`))");
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        defpackage.dzk.M(gjhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f69806c35a76c12bbde999220de56c45')");
    }

    @Override // defpackage.gga
    public final void b(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "DROP TABLE IF EXISTS `Transcript`");
    }

    @Override // defpackage.gga
    public final void c(defpackage.gjh gjhVar) throws java.lang.Exception {
        this.d.u(gjhVar);
    }

    @Override // defpackage.gga
    public final void d(defpackage.gjh gjhVar) {
        hgu.V(gjhVar);
    }

    @Override // defpackage.gga
    public final akwb g(defpackage.gjh gjhVar) {
        java.util.HashMap map = new java.util.HashMap(7);
        map.put("id", new ghy("id", "TEXT", true, 1, (java.lang.String) null, 1));
        map.put("conversation", new ghy("conversation", "BLOB", false, 0, (java.lang.String) null, 1));
        map.put("audioRecordingFilePath", new ghy("audioRecordingFilePath", "TEXT", false, 0, (java.lang.String) null, 1));
        map.put("isRated", new ghy("isRated", "INTEGER", true, 0, (java.lang.String) null, 1));
        map.put("revelioCallType", new ghy("revelioCallType", "INTEGER", false, 0, (java.lang.String) null, 1));
        map.put("lastModifiedMillis", new ghy("lastModifiedMillis", "INTEGER", true, 0, (java.lang.String) null, 1));
        map.put("callScreenFeedbackData", new ghy("callScreenFeedbackData", "BLOB", false, 0, (java.lang.String) null, 1));
        gib gibVar = new gib("Transcript", map, new java.util.HashSet(0), new java.util.HashSet(0));
        gib gibVarT = hgu.T(gjhVar, "Transcript");
        return !hgu.S(gibVar, gibVarT) ? new akwb(false, defpackage.hgb.e(gibVarT, gibVar, "Transcript(com.android.dialer.callscreen.impl.storage.database.Transcript).\n Expected:\n")) : new akwb(true, (java.lang.String) null);
    }

    @Override // defpackage.gga
    public final void e() {
    }

    @Override // defpackage.gga
    public final void f() {
    }
}
