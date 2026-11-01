package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class iuo extends defpackage.ghg {
    private final defpackage.ghf c;

    public iuo() {
        super(5, 6);
        this.c = new defpackage.tug(1);
    }

    @Override // defpackage.ghg
    public final void b(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `_new_beesly_data` (`createdTimestampMs` INTEGER NOT NULL, `uniqueId` BLOB NOT NULL, `callId` TEXT, `callEndedTimestampMs` INTEGER, `transcriptionFilePath` TEXT, `transcriptionText` TEXT, `transcriptionCreationTimestampMs` INTEGER, `audioRecordingFilePath` TEXT, `callType` INTEGER, `is_content_verdict_banner_dismissed` INTEGER NOT NULL DEFAULT 0, `duplexCallActions` BLOB, `errorType` TEXT, `user_contentState` TEXT, `aicore_contentState` TEXT, PRIMARY KEY(`createdTimestampMs`))");
        defpackage.dzk.M(gjhVar, "INSERT INTO `_new_beesly_data` (`createdTimestampMs`,`uniqueId`,`callId`,`callEndedTimestampMs`,`transcriptionFilePath`,`transcriptionText`,`transcriptionCreationTimestampMs`,`audioRecordingFilePath`,`callType`,`duplexCallActions`,`errorType`,`user_contentState`) SELECT `createdTimestampMs`,`uniqueId`,`callId`,`callEndedTimestampMs`,`transcriptionFilePath`,`transcriptionText`,`transcriptionCreationTimestampMs`,`audioRecordingFilePath`,`callType`,`duplexCallActions`,`errorType`,`contentState` FROM `beesly_data`");
        defpackage.dzk.M(gjhVar, "DROP TABLE `beesly_data`");
        defpackage.dzk.M(gjhVar, "ALTER TABLE `_new_beesly_data` RENAME TO `beesly_data`");
        hgu.W(this.c, gjhVar);
    }
}
