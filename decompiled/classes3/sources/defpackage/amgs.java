package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class amgs extends gga {
    final /* synthetic */ com.google.quality.views.extraction.kcube.bg.ondevice.modules.vc.vadatabase.VaRoomDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amgs(com.google.quality.views.extraction.kcube.bg.ondevice.modules.vc.vadatabase.VaRoomDatabase_Impl vaRoomDatabase_Impl) {
        super(1, "f877f37f5dcb1dc5f0321de0f5f7fbc7", "bab987c2d64d778f94709b689aa284c2");
        j$.util.Objects.requireNonNull(vaRoomDatabase_Impl);
        this.d = vaRoomDatabase_Impl;
    }

    public final void a(gjh gjhVar) {
        dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `VaInfo` (`businessNumber` TEXT NOT NULL, `detailName` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`businessNumber`, `detailName`))");
        dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        dzk.M(gjhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f877f37f5dcb1dc5f0321de0f5f7fbc7')");
    }

    public final void b(gjh gjhVar) {
        dzk.M(gjhVar, "DROP TABLE IF EXISTS `VaInfo`");
    }

    public final void c(gjh gjhVar) {
        this.d.u(gjhVar);
    }

    public final void d(gjh gjhVar) {
        hgu.V(gjhVar);
    }

    public final defpackage.akwb g(gjh gjhVar) {
        java.util.HashMap map = new java.util.HashMap(3);
        map.put("businessNumber", new ghy("businessNumber", "TEXT", true, 1, (java.lang.String) null, 1));
        map.put("detailName", new ghy("detailName", "TEXT", true, 2, (java.lang.String) null, 1));
        map.put("value", new ghy("value", "TEXT", false, 0, (java.lang.String) null, 1));
        gib gibVar = new gib("VaInfo", map, new java.util.HashSet(0), new java.util.HashSet(0));
        gib gibVarT = hgu.T(gjhVar, "VaInfo");
        return !hgu.S(gibVar, gibVarT) ? new defpackage.akwb(false, hgb.e(gibVarT, gibVar, "VaInfo(com.google.quality.views.extraction.kcube.bg.ondevice.modules.vc.vadatabase.VaInfo).\n Expected:\n")) : new defpackage.akwb(true, (java.lang.String) null);
    }

    public final void e() {
    }

    public final void f() {
    }
}
