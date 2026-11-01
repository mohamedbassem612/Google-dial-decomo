package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class oek extends defpackage.gga {
    final /* synthetic */ com.android.dialer.expresso.calllog.db.ExpressoCallLogDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oek(com.android.dialer.expresso.calllog.db.ExpressoCallLogDatabase_Impl expressoCallLogDatabase_Impl) {
        super(2, "8aaa21d39527f3089c8c47254a7f10e7", "92bf4c72aff2b8d1524a6485bdf79f81");
        j$.util.Objects.requireNonNull(expressoCallLogDatabase_Impl);
        this.d = expressoCallLogDatabase_Impl;
    }

    @Override // defpackage.gga
    public final void a(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `expresso_call_log_data` (`call_creation_time_millis` INTEGER NOT NULL, `call_type` TEXT NOT NULL, PRIMARY KEY(`call_creation_time_millis`))");
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `expresso_handshake_data` (`caller_number` TEXT NOT NULL, PRIMARY KEY(`caller_number`))");
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        defpackage.dzk.M(gjhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8aaa21d39527f3089c8c47254a7f10e7')");
    }

    @Override // defpackage.gga
    public final void b(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "DROP TABLE IF EXISTS `expresso_call_log_data`");
        defpackage.dzk.M(gjhVar, "DROP TABLE IF EXISTS `expresso_handshake_data`");
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
        java.util.HashMap map = new java.util.HashMap(2);
        map.put("call_creation_time_millis", new ghy("call_creation_time_millis", "INTEGER", true, 1, (java.lang.String) null, 1));
        map.put("call_type", new ghy("call_type", "TEXT", true, 0, (java.lang.String) null, 1));
        gib gibVar = new gib("expresso_call_log_data", map, new java.util.HashSet(0), new java.util.HashSet(0));
        gib gibVarT = hgu.T(gjhVar, "expresso_call_log_data");
        if (!hgu.S(gibVar, gibVarT)) {
            return new akwb(false, defpackage.hgb.e(gibVarT, gibVar, "expresso_call_log_data(com.android.dialer.expresso.calllog.db.ExpressoCallLogDbEntity).\n Expected:\n"));
        }
        java.util.HashMap map2 = new java.util.HashMap(1);
        map2.put("caller_number", new ghy("caller_number", "TEXT", true, 1, (java.lang.String) null, 1));
        gib gibVar2 = new gib("expresso_handshake_data", map2, new java.util.HashSet(0), new java.util.HashSet(0));
        gib gibVarT2 = hgu.T(gjhVar, "expresso_handshake_data");
        return !hgu.S(gibVar2, gibVarT2) ? new akwb(false, defpackage.hgb.e(gibVarT2, gibVar2, "expresso_handshake_data(com.android.dialer.expresso.calllog.db.ExpressoHandshakeDbEntity).\n Expected:\n")) : new akwb(true, (java.lang.String) null);
    }

    @Override // defpackage.gga
    public final void e() {
    }

    @Override // defpackage.gga
    public final void f() {
    }
}
