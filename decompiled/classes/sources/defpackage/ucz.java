package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ucz extends defpackage.gga {
    final /* synthetic */ com.android.dialer.spam.call.database.SpamCallDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ucz(com.android.dialer.spam.call.database.SpamCallDatabase_Impl spamCallDatabase_Impl) {
        super(1, "8b6efeacdbb435a7f02e61fb24faa545", "3ed9f25b883d92523a5c48327a196e90");
        j$.util.Objects.requireNonNull(spamCallDatabase_Impl);
        this.d = spamCallDatabase_Impl;
    }

    @Override // defpackage.gga
    public final void a(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `SpamCall` (`id` TEXT NOT NULL, `persistableSpamStatus` BLOB NOT NULL, PRIMARY KEY(`id`))");
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        defpackage.dzk.M(gjhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8b6efeacdbb435a7f02e61fb24faa545')");
    }

    @Override // defpackage.gga
    public final void b(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "DROP TABLE IF EXISTS `SpamCall`");
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
        map.put("id", new ghy("id", "TEXT", true, 1, (java.lang.String) null, 1));
        map.put("persistableSpamStatus", new ghy("persistableSpamStatus", "BLOB", true, 0, (java.lang.String) null, 1));
        gib gibVar = new gib("SpamCall", map, new java.util.HashSet(0), new java.util.HashSet(0));
        gib gibVarT = hgu.T(gjhVar, "SpamCall");
        return !hgu.S(gibVar, gibVarT) ? new akwb(false, defpackage.hgb.e(gibVarT, gibVar, "SpamCall(com.android.dialer.spam.call.database.SpamCall).\n Expected:\n")) : new akwb(true, (java.lang.String) null);
    }

    @Override // defpackage.gga
    public final void e() {
    }

    @Override // defpackage.gga
    public final void f() {
    }
}
