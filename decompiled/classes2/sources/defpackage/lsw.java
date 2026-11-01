package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lsw extends gga {
    final /* synthetic */ com.android.dialer.contactchecker.receiver.impl.service.db.ContactCheckerCallLogDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsw(com.android.dialer.contactchecker.receiver.impl.service.db.ContactCheckerCallLogDatabase_Impl contactCheckerCallLogDatabase_Impl) {
        super(2, "12c1d2f66a1ae33b642f976efd3a7340", "52d476122c73ca217f36802f4335a9ce");
        j$.util.Objects.requireNonNull(contactCheckerCallLogDatabase_Impl);
        this.d = contactCheckerCallLogDatabase_Impl;
    }

    public final void a(gjh gjhVar) {
        dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `contact_checker_call_log_data` (`caller_number` TEXT NOT NULL, `verification_state` TEXT NOT NULL, PRIMARY KEY(`caller_number`))");
        dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `contact_check_spoof_call_log_data` (`call_creation_time_millis` INTEGER NOT NULL, `caller_number` TEXT NOT NULL, PRIMARY KEY(`call_creation_time_millis`))");
        dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        dzk.M(gjhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '12c1d2f66a1ae33b642f976efd3a7340')");
    }

    public final void b(gjh gjhVar) {
        dzk.M(gjhVar, "DROP TABLE IF EXISTS `contact_checker_call_log_data`");
        dzk.M(gjhVar, "DROP TABLE IF EXISTS `contact_check_spoof_call_log_data`");
    }

    public final void c(gjh gjhVar) {
        this.d.u(gjhVar);
    }

    public final void d(gjh gjhVar) {
        defpackage.hgu.V(gjhVar);
    }

    public final akwb g(gjh gjhVar) {
        java.util.HashMap map = new java.util.HashMap(2);
        map.put("caller_number", new defpackage.ghy("caller_number", "TEXT", true, 1, null, 1));
        map.put("verification_state", new defpackage.ghy("verification_state", "TEXT", true, 0, null, 1));
        defpackage.gib gibVar = new defpackage.gib("contact_checker_call_log_data", map, new java.util.HashSet(0), new java.util.HashSet(0));
        defpackage.gib gibVarT = defpackage.hgu.T(gjhVar, "contact_checker_call_log_data");
        if (!defpackage.hgu.S(gibVar, gibVarT)) {
            return new akwb(false, hgb.e(gibVarT, gibVar, "contact_checker_call_log_data(com.android.dialer.contactchecker.receiver.impl.service.db.ContactCheckerCallerVerificationStateDbEntity).\n Expected:\n"));
        }
        java.util.HashMap map2 = new java.util.HashMap(2);
        map2.put("call_creation_time_millis", new defpackage.ghy("call_creation_time_millis", "INTEGER", true, 1, null, 1));
        map2.put("caller_number", new defpackage.ghy("caller_number", "TEXT", true, 0, null, 1));
        defpackage.gib gibVar2 = new defpackage.gib("contact_check_spoof_call_log_data", map2, new java.util.HashSet(0), new java.util.HashSet(0));
        defpackage.gib gibVarT2 = defpackage.hgu.T(gjhVar, "contact_check_spoof_call_log_data");
        return !defpackage.hgu.S(gibVar2, gibVarT2) ? new akwb(false, hgb.e(gibVarT2, gibVar2, "contact_check_spoof_call_log_data(com.android.dialer.contactchecker.receiver.impl.service.db.ContactCheckSpoofCallLogDbEntity).\n Expected:\n")) : new akwb(true, (java.lang.String) null);
    }

    public final void e() {
    }

    public final void f() {
    }
}
