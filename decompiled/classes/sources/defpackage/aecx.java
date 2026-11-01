package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aecx extends defpackage.ghg {
    private final defpackage.ghf c;

    public aecx() {
        super(1, 2);
        this.c = new defpackage.gtc(2);
    }

    @Override // defpackage.ghg
    public final void b(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `_new_gnp_accounts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `account_specific_id` TEXT, `account_type` INTEGER, `obfuscated_gaia_id` TEXT, `registration_status` INTEGER NOT NULL, `registration_id` TEXT, `sync_sources` TEXT)");
        defpackage.dzk.M(gjhVar, "INSERT INTO `_new_gnp_accounts` (`id`,`account_specific_id`,`obfuscated_gaia_id`,`registration_status`,`registration_id`,`sync_sources`) SELECT `id`,`account_name`,`obfuscated_gaia_id`,`registration_status`,`registration_id`,`sync_sources` FROM `gnp_accounts`");
        defpackage.dzk.M(gjhVar, "DROP TABLE `gnp_accounts`");
        defpackage.dzk.M(gjhVar, "ALTER TABLE `_new_gnp_accounts` RENAME TO `gnp_accounts`");
        hgu.W(this.c, gjhVar);
    }
}
