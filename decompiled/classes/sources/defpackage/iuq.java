package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class iuq extends defpackage.gga {
    final /* synthetic */ com.android.dialer.beesly.impl.data.database.BeeslyDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iuq(com.android.dialer.beesly.impl.data.database.BeeslyDatabase_Impl beeslyDatabase_Impl) {
        super(7, "021ccc58c37d63c896a1c820eaa1893b", "f9ee2757b844f7757d9f0a65f0cd3bfd");
        j$.util.Objects.requireNonNull(beeslyDatabase_Impl);
        this.d = beeslyDatabase_Impl;
    }

    @Override // defpackage.gga
    public final void a(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `beesly_data` (`createdTimestampMs` INTEGER NOT NULL, `uniqueId` BLOB NOT NULL, `callId` TEXT, `callEndedTimestampMs` INTEGER, `transcriptionFilePath` TEXT, `transcriptionText` TEXT, `transcriptionCreationTimestampMs` INTEGER, `audioRecordingFilePath` TEXT, `callType` INTEGER, `is_content_verdict_banner_dismissed` INTEGER NOT NULL DEFAULT 0, `is_eligible_for_survey` INTEGER NOT NULL DEFAULT 1, `duplexCallActions` BLOB, `errorType` TEXT, `user_contentState` TEXT, `aicore_contentState` TEXT, PRIMARY KEY(`createdTimestampMs`))");
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        defpackage.dzk.M(gjhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '021ccc58c37d63c896a1c820eaa1893b')");
    }

    @Override // defpackage.gga
    public final void b(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "DROP TABLE IF EXISTS `beesly_data`");
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
        java.util.HashMap map = new java.util.HashMap(15);
        map.put("createdTimestampMs", new ghy("createdTimestampMs", "INTEGER", true, 1, (java.lang.String) null, 1));
        map.put("uniqueId", new ghy("uniqueId", "BLOB", true, 0, (java.lang.String) null, 1));
        map.put("callId", new ghy("callId", "TEXT", false, 0, (java.lang.String) null, 1));
        map.put("callEndedTimestampMs", new ghy("callEndedTimestampMs", "INTEGER", false, 0, (java.lang.String) null, 1));
        map.put("transcriptionFilePath", new ghy("transcriptionFilePath", "TEXT", false, 0, (java.lang.String) null, 1));
        map.put("transcriptionText", new ghy("transcriptionText", "TEXT", false, 0, (java.lang.String) null, 1));
        map.put("transcriptionCreationTimestampMs", new ghy("transcriptionCreationTimestampMs", "INTEGER", false, 0, (java.lang.String) null, 1));
        map.put("audioRecordingFilePath", new ghy("audioRecordingFilePath", "TEXT", false, 0, (java.lang.String) null, 1));
        map.put("callType", new ghy("callType", "INTEGER", false, 0, (java.lang.String) null, 1));
        map.put("is_content_verdict_banner_dismissed", new ghy("is_content_verdict_banner_dismissed", "INTEGER", true, 0, "0", 1));
        map.put("is_eligible_for_survey", new ghy("is_eligible_for_survey", "INTEGER", true, 0, "1", 1));
        map.put("duplexCallActions", new ghy("duplexCallActions", "BLOB", false, 0, (java.lang.String) null, 1));
        map.put("errorType", new ghy("errorType", "TEXT", false, 0, (java.lang.String) null, 1));
        map.put("user_contentState", new ghy("user_contentState", "TEXT", false, 0, (java.lang.String) null, 1));
        map.put("aicore_contentState", new ghy("aicore_contentState", "TEXT", false, 0, (java.lang.String) null, 1));
        gib gibVar = new gib("beesly_data", map, new java.util.HashSet(0), new java.util.HashSet(0));
        gib gibVarT = hgu.T(gjhVar, "beesly_data");
        return !hgu.S(gibVar, gibVarT) ? new akwb(false, defpackage.hgb.e(gibVarT, gibVar, "beesly_data(com.android.dialer.beesly.impl.data.database.BeeslyDataEntity).\n Expected:\n")) : new akwb(true, (java.lang.String) null);
    }

    @Override // defpackage.gga
    public final void e() {
    }

    @Override // defpackage.gga
    public final void f() {
    }
}
