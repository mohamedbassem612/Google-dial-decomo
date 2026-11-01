package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tuh extends defpackage.ghg {
    private final defpackage.ghf c;

    public tuh() {
        super(1, 2);
        this.c = new defpackage.tug(0);
    }

    @Override // defpackage.ghg
    public final void b(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `_new_sharpie_data` (`callCreatedTimestampMs` INTEGER NOT NULL, `callId` TEXT NOT NULL, `mlVerdict` TEXT NOT NULL, `userVerdict` TEXT NOT NULL, `userScamAlertAction` TEXT NOT NULL, PRIMARY KEY(`callCreatedTimestampMs`))");
        defpackage.dzk.M(gjhVar, "INSERT INTO `_new_sharpie_data` (`callCreatedTimestampMs`,`callId`,`mlVerdict`,`userVerdict`,`userScamAlertAction`) SELECT `callCreatedTimestampMs`,`callId`,`mlVerdict`,`userVerdict`,`userScamAlertAction` FROM `sharpie_data`");
        defpackage.dzk.M(gjhVar, "DROP TABLE `sharpie_data`");
        defpackage.dzk.M(gjhVar, "ALTER TABLE `_new_sharpie_data` RENAME TO `sharpie_data`");
        hgu.W(this.c, gjhVar);
    }
}
