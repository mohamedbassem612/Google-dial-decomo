package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sdm extends defpackage.gga {
    final /* synthetic */ com.android.dialer.patrick.impl.security.storage.room.WhitePagesDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdm(com.android.dialer.patrick.impl.security.storage.room.WhitePagesDatabase_Impl whitePagesDatabase_Impl) {
        super(1, "1da9923b67033c7105d9b668a19d1e12", "ae19c60267cada1a3f80b53d35cdb931");
        j$.util.Objects.requireNonNull(whitePagesDatabase_Impl);
        this.d = whitePagesDatabase_Impl;
    }

    @Override // defpackage.gga
    public final void a(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `white_pages_data` (`accountName` TEXT NOT NULL, `accountE164PhoneNumber` TEXT NOT NULL, `verificationStatus` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`accountName`, `accountE164PhoneNumber`))");
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        defpackage.dzk.M(gjhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1da9923b67033c7105d9b668a19d1e12')");
    }

    @Override // defpackage.gga
    public final void b(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "DROP TABLE IF EXISTS `white_pages_data`");
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
        map.put("accountName", new ghy("accountName", "TEXT", true, 1, (java.lang.String) null, 1));
        map.put("accountE164PhoneNumber", new ghy("accountE164PhoneNumber", "TEXT", true, 2, (java.lang.String) null, 1));
        map.put("verificationStatus", new ghy("verificationStatus", "TEXT", true, 0, (java.lang.String) null, 1));
        map.put("timestamp", new ghy("timestamp", "INTEGER", true, 0, (java.lang.String) null, 1));
        gib gibVar = new gib("white_pages_data", map, new java.util.HashSet(0), new java.util.HashSet(0));
        gib gibVarT = hgu.T(gjhVar, "white_pages_data");
        return !hgu.S(gibVar, gibVarT) ? new akwb(false, defpackage.hgb.e(gibVarT, gibVar, "white_pages_data(com.android.dialer.patrick.impl.security.storage.room.WhitePagesDataEntity).\n Expected:\n")) : new akwb(true, (java.lang.String) null);
    }

    @Override // defpackage.gga
    public final void e() {
    }

    @Override // defpackage.gga
    public final void f() {
    }
}
