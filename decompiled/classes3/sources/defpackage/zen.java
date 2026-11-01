package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zen extends gga {
    final /* synthetic */ com.google.android.callingshared.peertopeer.capabilities.registrar.impl.cache.db.DialerCapabilityDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zen(com.google.android.callingshared.peertopeer.capabilities.registrar.impl.cache.db.DialerCapabilityDatabase_Impl dialerCapabilityDatabase_Impl) {
        super(2, "98fa50ecc139f1f981f27b121fe0d8f0", "0abccf09b4b0b372bec13eb6919919f9");
        j$.util.Objects.requireNonNull(dialerCapabilityDatabase_Impl);
        this.d = dialerCapabilityDatabase_Impl;
    }

    public final void a(gjh gjhVar) {
        dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `dialer_capability_data` (`e164_phone_number` TEXT NOT NULL, `capability` TEXT NOT NULL, `timestamp_millis` INTEGER NOT NULL, PRIMARY KEY(`e164_phone_number`, `capability`))");
        dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `dialer_contact_status_data` (`e164_phone_number` TEXT NOT NULL, `contact_status` TEXT NOT NULL, `timestamp_millis` INTEGER NOT NULL, PRIMARY KEY(`e164_phone_number`))");
        dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        dzk.M(gjhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '98fa50ecc139f1f981f27b121fe0d8f0')");
    }

    public final void b(gjh gjhVar) {
        dzk.M(gjhVar, "DROP TABLE IF EXISTS `dialer_capability_data`");
        dzk.M(gjhVar, "DROP TABLE IF EXISTS `dialer_contact_status_data`");
    }

    public final void c(gjh gjhVar) {
        this.d.u(gjhVar);
    }

    public final void d(gjh gjhVar) {
        hgu.V(gjhVar);
    }

    public final defpackage.akwb g(gjh gjhVar) {
        java.util.HashMap map = new java.util.HashMap(3);
        map.put("e164_phone_number", new ghy("e164_phone_number", "TEXT", true, 1, (java.lang.String) null, 1));
        map.put("capability", new ghy("capability", "TEXT", true, 2, (java.lang.String) null, 1));
        map.put("timestamp_millis", new ghy("timestamp_millis", "INTEGER", true, 0, (java.lang.String) null, 1));
        gib gibVar = new gib("dialer_capability_data", map, new java.util.HashSet(0), new java.util.HashSet(0));
        gib gibVarT = hgu.T(gjhVar, "dialer_capability_data");
        if (!hgu.S(gibVar, gibVarT)) {
            return new defpackage.akwb(false, hgb.e(gibVarT, gibVar, "dialer_capability_data(com.google.android.callingshared.peertopeer.capabilities.registrar.impl.cache.db.DialerCapabilityEntity).\n Expected:\n"));
        }
        java.util.HashMap map2 = new java.util.HashMap(3);
        map2.put("e164_phone_number", new ghy("e164_phone_number", "TEXT", true, 1, (java.lang.String) null, 1));
        map2.put("contact_status", new ghy("contact_status", "TEXT", true, 0, (java.lang.String) null, 1));
        map2.put("timestamp_millis", new ghy("timestamp_millis", "INTEGER", true, 0, (java.lang.String) null, 1));
        gib gibVar2 = new gib("dialer_contact_status_data", map2, new java.util.HashSet(0), new java.util.HashSet(0));
        gib gibVarT2 = hgu.T(gjhVar, "dialer_contact_status_data");
        return !hgu.S(gibVar2, gibVarT2) ? new defpackage.akwb(false, hgb.e(gibVarT2, gibVar2, "dialer_contact_status_data(com.google.android.callingshared.peertopeer.capabilities.registrar.impl.cache.db.DialerContactStatusEntity).\n Expected:\n")) : new defpackage.akwb(true, (java.lang.String) null);
    }

    public final void e() {
    }

    public final void f() {
    }
}
