package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aedf extends defpackage.gga {
    final /* synthetic */ com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aedf(com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase_Impl gnpRoomDatabase_Impl) {
        super(11, "96ef747075977340544a7fd178d7b145", "971093f20d339fcd3f21f8ebaf20b8db");
        j$.util.Objects.requireNonNull(gnpRoomDatabase_Impl);
        this.d = gnpRoomDatabase_Impl;
    }

    @Override // defpackage.gga
    public final void a(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `gnp_accounts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `account_specific_id` TEXT, `account_type` INTEGER, `obfuscated_gaia_id` TEXT, `actual_account_name` TEXT, `actual_account_oid` TEXT, `registration_status` INTEGER NOT NULL, `registration_id` TEXT, `sync_sources` TEXT, `representative_target_id` TEXT, `sync_version` INTEGER NOT NULL DEFAULT 0, `last_registration_time_ms` INTEGER NOT NULL DEFAULT 0, `last_registration_request_hash` INTEGER NOT NULL DEFAULT 0, `first_registration_version` INTEGER NOT NULL DEFAULT 0, `internal_target_id` TEXT, `fitbit_decoded_id` INTEGER NOT NULL DEFAULT 0)");
        defpackage.dzk.M(gjhVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_gnp_accounts_account_specific_id` ON `gnp_accounts` (`account_specific_id`)");
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        defpackage.dzk.M(gjhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '96ef747075977340544a7fd178d7b145')");
    }

    @Override // defpackage.gga
    public final void b(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "DROP TABLE IF EXISTS `gnp_accounts`");
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
        java.util.HashMap map = new java.util.HashMap(16);
        map.put("id", new ghy("id", "INTEGER", true, 1, (java.lang.String) null, 1));
        map.put("account_specific_id", new ghy("account_specific_id", "TEXT", false, 0, (java.lang.String) null, 1));
        map.put("account_type", new ghy("account_type", "INTEGER", false, 0, (java.lang.String) null, 1));
        map.put("obfuscated_gaia_id", new ghy("obfuscated_gaia_id", "TEXT", false, 0, (java.lang.String) null, 1));
        map.put("actual_account_name", new ghy("actual_account_name", "TEXT", false, 0, (java.lang.String) null, 1));
        map.put("actual_account_oid", new ghy("actual_account_oid", "TEXT", false, 0, (java.lang.String) null, 1));
        map.put("registration_status", new ghy("registration_status", "INTEGER", true, 0, (java.lang.String) null, 1));
        map.put("registration_id", new ghy("registration_id", "TEXT", false, 0, (java.lang.String) null, 1));
        map.put("sync_sources", new ghy("sync_sources", "TEXT", false, 0, (java.lang.String) null, 1));
        map.put("representative_target_id", new ghy("representative_target_id", "TEXT", false, 0, (java.lang.String) null, 1));
        map.put("sync_version", new ghy("sync_version", "INTEGER", true, 0, "0", 1));
        map.put("last_registration_time_ms", new ghy("last_registration_time_ms", "INTEGER", true, 0, "0", 1));
        map.put("last_registration_request_hash", new ghy("last_registration_request_hash", "INTEGER", true, 0, "0", 1));
        map.put("first_registration_version", new ghy("first_registration_version", "INTEGER", true, 0, "0", 1));
        map.put("internal_target_id", new ghy("internal_target_id", "TEXT", false, 0, (java.lang.String) null, 1));
        map.put("fitbit_decoded_id", new ghy("fitbit_decoded_id", "INTEGER", true, 0, "0", 1));
        java.util.HashSet hashSet = new java.util.HashSet(0);
        java.util.HashSet hashSet2 = new java.util.HashSet(1);
        hashSet2.add(new gia("index_gnp_accounts_account_specific_id", true, java.util.Arrays.asList("account_specific_id"), java.util.Arrays.asList("ASC")));
        gib gibVar = new gib("gnp_accounts", map, hashSet, hashSet2);
        gib gibVarT = hgu.T(gjhVar, "gnp_accounts");
        return !hgu.S(gibVar, gibVarT) ? new akwb(false, defpackage.hgb.e(gibVarT, gibVar, "gnp_accounts(com.google.android.libraries.notifications.platform.data.entities.GnpAccount).\n Expected:\n")) : new akwb(true, (java.lang.String) null);
    }

    @Override // defpackage.gga
    public final void e() {
    }

    @Override // defpackage.gga
    public final void f() {
    }
}
