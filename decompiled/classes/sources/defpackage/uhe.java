package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uhe extends defpackage.gga {
    final /* synthetic */ com.android.dialer.spam.moirai.storage.room.MoiraiDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhe(com.android.dialer.spam.moirai.storage.room.MoiraiDatabase_Impl moiraiDatabase_Impl) {
        super(1, "60696b92f21163cb53f0ad151efc22a8", "8b92b1fc607f74cdac8e54a6d8f0ab3f");
        j$.util.Objects.requireNonNull(moiraiDatabase_Impl);
        this.d = moiraiDatabase_Impl;
    }

    @Override // defpackage.gga
    public final void a(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `moirai_data` (`client_role` TEXT NOT NULL, `protection_token` BLOB NOT NULL, PRIMARY KEY(`client_role`))");
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        defpackage.dzk.M(gjhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '60696b92f21163cb53f0ad151efc22a8')");
    }

    @Override // defpackage.gga
    public final void b(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "DROP TABLE IF EXISTS `moirai_data`");
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
        map.put("client_role", new ghy("client_role", "TEXT", true, 1, (java.lang.String) null, 1));
        map.put("protection_token", new ghy("protection_token", "BLOB", true, 0, (java.lang.String) null, 1));
        gib gibVar = new gib("moirai_data", map, new java.util.HashSet(0), new java.util.HashSet(0));
        gib gibVarT = hgu.T(gjhVar, "moirai_data");
        return !hgu.S(gibVar, gibVarT) ? new akwb(false, defpackage.hgb.e(gibVarT, gibVar, "moirai_data(com.android.dialer.spam.moirai.storage.room.MoiraiDataEntity).\n Expected:\n")) : new akwb(true, (java.lang.String) null);
    }

    @Override // defpackage.gga
    public final void e() {
    }

    @Override // defpackage.gga
    public final void f() {
    }
}
