package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aecu extends gga {
    final /* synthetic */ com.google.android.libraries.notifications.platform.internal.room.GnpPerDeviceRoomDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aecu(com.google.android.libraries.notifications.platform.internal.room.GnpPerDeviceRoomDatabase_Impl gnpPerDeviceRoomDatabase_Impl) {
        super(1, "8ad347fd733bd73ae79a04cad7afe8a7", "f47de4f50f676117a489ac8cd91e3f8f");
        j$.util.Objects.requireNonNull(gnpPerDeviceRoomDatabase_Impl);
        this.d = gnpPerDeviceRoomDatabase_Impl;
    }

    public final void a(gjh gjhVar) {
        dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `gnp_experiments` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `account_name` TEXT NOT NULL, `experiment_id` INTEGER NOT NULL, `experiment_type` INTEGER NOT NULL, `insertion_time` INTEGER NOT NULL, `experiment_source` INTEGER NOT NULL)");
        dzk.M(gjhVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_gnp_experiments_experiment_id` ON `gnp_experiments` (`experiment_id`)");
        dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        dzk.M(gjhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8ad347fd733bd73ae79a04cad7afe8a7')");
    }

    public final void b(gjh gjhVar) {
        dzk.M(gjhVar, "DROP TABLE IF EXISTS `gnp_experiments`");
    }

    public final void c(gjh gjhVar) {
        this.d.u(gjhVar);
    }

    public final void d(gjh gjhVar) {
        hgu.V(gjhVar);
    }

    public final defpackage.akwb g(gjh gjhVar) {
        java.util.HashMap map = new java.util.HashMap(6);
        map.put("id", new ghy("id", "INTEGER", true, 1, (java.lang.String) null, 1));
        map.put("account_name", new ghy("account_name", "TEXT", true, 0, (java.lang.String) null, 1));
        map.put("experiment_id", new ghy("experiment_id", "INTEGER", true, 0, (java.lang.String) null, 1));
        map.put("experiment_type", new ghy("experiment_type", "INTEGER", true, 0, (java.lang.String) null, 1));
        map.put("insertion_time", new ghy("insertion_time", "INTEGER", true, 0, (java.lang.String) null, 1));
        map.put("experiment_source", new ghy("experiment_source", "INTEGER", true, 0, (java.lang.String) null, 1));
        java.util.HashSet hashSet = new java.util.HashSet(0);
        java.util.HashSet hashSet2 = new java.util.HashSet(1);
        hashSet2.add(new gia("index_gnp_experiments_experiment_id", true, java.util.Arrays.asList("experiment_id"), java.util.Arrays.asList("ASC")));
        gib gibVar = new gib("gnp_experiments", map, hashSet, hashSet2);
        gib gibVarT = hgu.T(gjhVar, "gnp_experiments");
        return !hgu.S(gibVar, gibVarT) ? new defpackage.akwb(false, hgb.e(gibVarT, gibVar, "gnp_experiments(com.google.android.libraries.notifications.platform.internal.room.GnpExperimentEntity).\n Expected:\n")) : new defpackage.akwb(true, (java.lang.String) null);
    }

    public final void e() {
    }

    public final void f() {
    }
}
