package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class nxo extends defpackage.gga {
    final /* synthetic */ com.android.dialer.duo.data.database.MeetInfoDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxo(com.android.dialer.duo.data.database.MeetInfoDatabase_Impl meetInfoDatabase_Impl) {
        super(2, "76e418edbd6421124d177c3ae3f332e0", "abb49597d5206578d75c85e252768130");
        j$.util.Objects.requireNonNull(meetInfoDatabase_Impl);
        this.d = meetInfoDatabase_Impl;
    }

    @Override // defpackage.gga
    public final void a(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `meet_reachability_data` (`normalized_phone_number` TEXT NOT NULL, `meet_reachability` TEXT NOT NULL, `last_queried` INTEGER NOT NULL DEFAULT 0, `revision` INTEGER NOT NULL, PRIMARY KEY(`normalized_phone_number`))");
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        defpackage.dzk.M(gjhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '76e418edbd6421124d177c3ae3f332e0')");
    }

    @Override // defpackage.gga
    public final void b(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "DROP TABLE IF EXISTS `meet_reachability_data`");
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
        java.util.HashMap map = new java.util.HashMap(4);
        map.put("normalized_phone_number", new ghy("normalized_phone_number", "TEXT", true, 1, (java.lang.String) null, 1));
        map.put("meet_reachability", new ghy("meet_reachability", "TEXT", true, 0, (java.lang.String) null, 1));
        map.put("last_queried", new ghy("last_queried", "INTEGER", true, 0, "0", 1));
        map.put("revision", new ghy("revision", "INTEGER", true, 0, (java.lang.String) null, 1));
        gib gibVar = new gib("meet_reachability_data", map, new java.util.HashSet(0), new java.util.HashSet(0));
        gib gibVarT = hgu.T(gjhVar, "meet_reachability_data");
        return !hgu.S(gibVar, gibVarT) ? new akwb(false, defpackage.hgb.e(gibVarT, gibVar, "meet_reachability_data(com.android.dialer.duo.data.database.MeetReachabilityEntity).\n Expected:\n")) : new akwb(true, (java.lang.String) null);
    }

    @Override // defpackage.gga
    public final void e() {
    }

    @Override // defpackage.gga
    public final void f() {
    }
}
