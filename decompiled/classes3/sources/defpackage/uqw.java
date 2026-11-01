package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uqw extends gga {
    final /* synthetic */ com.android.dialer.suggestcontacts.impl.database.ContactScoreDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqw(com.android.dialer.suggestcontacts.impl.database.ContactScoreDatabase_Impl contactScoreDatabase_Impl) {
        super(1, "52ff05d06828e12996b17c4b86a0f8c5", "5217a52c82c81d80811de528bd59c930");
        j$.util.Objects.requireNonNull(contactScoreDatabase_Impl);
        this.d = contactScoreDatabase_Impl;
    }

    public final void a(gjh gjhVar) {
        dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `ContactScore` (`normalizedNumber` TEXT NOT NULL, `score` REAL NOT NULL, PRIMARY KEY(`normalizedNumber`))");
        dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        dzk.M(gjhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '52ff05d06828e12996b17c4b86a0f8c5')");
    }

    public final void b(gjh gjhVar) {
        dzk.M(gjhVar, "DROP TABLE IF EXISTS `ContactScore`");
    }

    public final void c(gjh gjhVar) {
        this.d.u(gjhVar);
    }

    public final void d(gjh gjhVar) {
        hgu.V(gjhVar);
    }

    public final defpackage.akwb g(gjh gjhVar) {
        java.util.HashMap map = new java.util.HashMap(2);
        map.put("normalizedNumber", new ghy("normalizedNumber", "TEXT", true, 1, (java.lang.String) null, 1));
        map.put("score", new ghy("score", "REAL", true, 0, (java.lang.String) null, 1));
        gib gibVar = new gib("ContactScore", map, new java.util.HashSet(0), new java.util.HashSet(0));
        gib gibVarT = hgu.T(gjhVar, "ContactScore");
        return !hgu.S(gibVar, gibVarT) ? new defpackage.akwb(false, hgb.e(gibVarT, gibVar, "ContactScore(com.android.dialer.suggestcontacts.impl.database.ContactScore).\n Expected:\n")) : new defpackage.akwb(true, (java.lang.String) null);
    }

    public final void e() {
    }

    public final void f() {
    }
}
