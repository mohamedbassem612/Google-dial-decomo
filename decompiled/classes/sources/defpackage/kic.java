package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kic extends defpackage.gga {
    final /* synthetic */ com.android.dialer.calllog.halo.impl.storage.database.PeopleDirectoryContactDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kic(com.android.dialer.calllog.halo.impl.storage.database.PeopleDirectoryContactDatabase_Impl peopleDirectoryContactDatabase_Impl) {
        super(1, "786a5e76c24c0187f1cd73639269a495", "8d19eac6616fd1edaedcb44d6305ee13");
        j$.util.Objects.requireNonNull(peopleDirectoryContactDatabase_Impl);
        this.d = peopleDirectoryContactDatabase_Impl;
    }

    @Override // defpackage.gga
    public final void a(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `PeopleDirectoryContactEntity` (`uuid` TEXT NOT NULL, `name` TEXT NOT NULL, `photoThumbnailUri` TEXT NOT NULL, `packageName` TEXT NOT NULL, `lookupKey` TEXT NOT NULL, `capabilities` INTEGER NOT NULL, PRIMARY KEY(`uuid`))");
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        defpackage.dzk.M(gjhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '786a5e76c24c0187f1cd73639269a495')");
    }

    @Override // defpackage.gga
    public final void b(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "DROP TABLE IF EXISTS `PeopleDirectoryContactEntity`");
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
        java.util.HashMap map = new java.util.HashMap(6);
        map.put("uuid", new ghy("uuid", "TEXT", true, 1, (java.lang.String) null, 1));
        map.put("name", new ghy("name", "TEXT", true, 0, (java.lang.String) null, 1));
        map.put("photoThumbnailUri", new ghy("photoThumbnailUri", "TEXT", true, 0, (java.lang.String) null, 1));
        map.put("packageName", new ghy("packageName", "TEXT", true, 0, (java.lang.String) null, 1));
        map.put("lookupKey", new ghy("lookupKey", "TEXT", true, 0, (java.lang.String) null, 1));
        map.put("capabilities", new ghy("capabilities", "INTEGER", true, 0, (java.lang.String) null, 1));
        gib gibVar = new gib("PeopleDirectoryContactEntity", map, new java.util.HashSet(0), new java.util.HashSet(0));
        gib gibVarT = hgu.T(gjhVar, "PeopleDirectoryContactEntity");
        return !hgu.S(gibVar, gibVarT) ? new akwb(false, defpackage.hgb.e(gibVarT, gibVar, "PeopleDirectoryContactEntity(com.android.dialer.calllog.halo.impl.storage.database.PeopleDirectoryContactEntity).\n Expected:\n")) : new akwb(true, (java.lang.String) null);
    }

    @Override // defpackage.gga
    public final void e() {
    }

    @Override // defpackage.gga
    public final void f() {
    }
}
