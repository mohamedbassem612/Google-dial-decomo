package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zfb extends gga {
    final /* synthetic */ com.google.android.callingshared.peertopeer.capabilities.registrar.impl.cache.db.DialerHasRcsDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfb(com.google.android.callingshared.peertopeer.capabilities.registrar.impl.cache.db.DialerHasRcsDatabase_Impl dialerHasRcsDatabase_Impl) {
        super(1, "2774a2b6fe84b8a247f75c414f467608", "c342a980d078aee927d1766d1e03981f");
        j$.util.Objects.requireNonNull(dialerHasRcsDatabase_Impl);
        this.d = dialerHasRcsDatabase_Impl;
    }

    public final void a(gjh gjhVar) {
        dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `dialer_has_rcs_data` (`e164_phone_number` TEXT NOT NULL, `timestamp_millis` INTEGER NOT NULL, PRIMARY KEY(`e164_phone_number`))");
        dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        dzk.M(gjhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2774a2b6fe84b8a247f75c414f467608')");
    }

    public final void b(gjh gjhVar) {
        dzk.M(gjhVar, "DROP TABLE IF EXISTS `dialer_has_rcs_data`");
    }

    public final void c(gjh gjhVar) {
        this.d.u(gjhVar);
    }

    public final void d(gjh gjhVar) {
        hgu.V(gjhVar);
    }

    public final defpackage.akwb g(gjh gjhVar) {
        java.util.HashMap map = new java.util.HashMap(2);
        map.put("e164_phone_number", new ghy("e164_phone_number", "TEXT", true, 1, (java.lang.String) null, 1));
        map.put("timestamp_millis", new ghy("timestamp_millis", "INTEGER", true, 0, (java.lang.String) null, 1));
        gib gibVar = new gib("dialer_has_rcs_data", map, new java.util.HashSet(0), new java.util.HashSet(0));
        gib gibVarT = hgu.T(gjhVar, "dialer_has_rcs_data");
        return !hgu.S(gibVar, gibVarT) ? new defpackage.akwb(false, hgb.e(gibVarT, gibVar, "dialer_has_rcs_data(com.google.android.callingshared.peertopeer.capabilities.registrar.impl.cache.db.DialerHasRcsEntity).\n Expected:\n")) : new defpackage.akwb(true, (java.lang.String) null);
    }

    public final void e() {
    }

    public final void f() {
    }
}
