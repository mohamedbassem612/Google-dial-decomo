package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jri extends defpackage.gga {
    final /* synthetic */ com.android.dialer.callclassification.stirshaken.calllog.storage.database.StirShakenDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jri(com.android.dialer.callclassification.stirshaken.calllog.storage.database.StirShakenDatabase_Impl stirShakenDatabase_Impl) {
        super(1, "b3b79321b9fe2bc1587dc93aefacd45a", "b141585bb5153fddd3eb3919ec8cdf79");
        j$.util.Objects.requireNonNull(stirShakenDatabase_Impl);
        this.d = stirShakenDatabase_Impl;
    }

    @Override // defpackage.gga
    public final void a(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `StirShakenEntity` (`callCreationTimeMillis` INTEGER NOT NULL, `stirShakenStatus` TEXT NOT NULL, PRIMARY KEY(`callCreationTimeMillis`))");
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        defpackage.dzk.M(gjhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b3b79321b9fe2bc1587dc93aefacd45a')");
    }

    @Override // defpackage.gga
    public final void b(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "DROP TABLE IF EXISTS `StirShakenEntity`");
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
        map.put("callCreationTimeMillis", new ghy("callCreationTimeMillis", "INTEGER", true, 1, (java.lang.String) null, 1));
        map.put("stirShakenStatus", new ghy("stirShakenStatus", "TEXT", true, 0, (java.lang.String) null, 1));
        gib gibVar = new gib("StirShakenEntity", map, new java.util.HashSet(0), new java.util.HashSet(0));
        gib gibVarT = hgu.T(gjhVar, "StirShakenEntity");
        return !hgu.S(gibVar, gibVarT) ? new akwb(false, defpackage.hgb.e(gibVarT, gibVar, "StirShakenEntity(com.android.dialer.callclassification.stirshaken.calllog.storage.database.StirShakenEntity).\n Expected:\n")) : new akwb(true, (java.lang.String) null);
    }

    @Override // defpackage.gga
    public final void e() {
    }

    @Override // defpackage.gga
    public final void f() {
    }
}
