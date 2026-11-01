package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tui extends defpackage.gga {
    final /* synthetic */ com.android.dialer.sharpie.impl.storage.database.SharpieDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tui(com.android.dialer.sharpie.impl.storage.database.SharpieDatabase_Impl sharpieDatabase_Impl) {
        super(2, "20c16c87dfa9def1af7304dab1b9b316", "7fd616596e7094bed289d4144fc866fb");
        j$.util.Objects.requireNonNull(sharpieDatabase_Impl);
        this.d = sharpieDatabase_Impl;
    }

    @Override // defpackage.gga
    public final void a(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `sharpie_data` (`callCreatedTimestampMs` INTEGER NOT NULL, `callId` TEXT NOT NULL, `mlVerdict` TEXT NOT NULL, `userVerdict` TEXT NOT NULL, `userScamAlertAction` TEXT NOT NULL, PRIMARY KEY(`callCreatedTimestampMs`))");
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        defpackage.dzk.M(gjhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '20c16c87dfa9def1af7304dab1b9b316')");
    }

    @Override // defpackage.gga
    public final void b(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "DROP TABLE IF EXISTS `sharpie_data`");
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
        java.util.HashMap map = new java.util.HashMap(5);
        map.put("callCreatedTimestampMs", new ghy("callCreatedTimestampMs", "INTEGER", true, 1, (java.lang.String) null, 1));
        map.put("callId", new ghy("callId", "TEXT", true, 0, (java.lang.String) null, 1));
        map.put("mlVerdict", new ghy("mlVerdict", "TEXT", true, 0, (java.lang.String) null, 1));
        map.put("userVerdict", new ghy("userVerdict", "TEXT", true, 0, (java.lang.String) null, 1));
        map.put("userScamAlertAction", new ghy("userScamAlertAction", "TEXT", true, 0, (java.lang.String) null, 1));
        gib gibVar = new gib("sharpie_data", map, new java.util.HashSet(0), new java.util.HashSet(0));
        gib gibVarT = hgu.T(gjhVar, "sharpie_data");
        return !hgu.S(gibVar, gibVarT) ? new akwb(false, defpackage.hgb.e(gibVarT, gibVar, "sharpie_data(com.android.dialer.sharpie.impl.storage.database.SharpieDataEntity).\n Expected:\n")) : new akwb(true, (java.lang.String) null);
    }

    @Override // defpackage.gga
    public final void e() {
    }

    @Override // defpackage.gga
    public final void f() {
    }
}
