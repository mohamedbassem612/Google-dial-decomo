package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wzb extends gga {
    final /* synthetic */ com.android.incallui.atlas.ui.impl.database.AtlasDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzb(com.android.incallui.atlas.ui.impl.database.AtlasDatabase_Impl atlasDatabase_Impl) {
        super(3, "99fdc90faec001cfaf00549c8ebf3e43", "f7f08b3e19c1802a4b26de96c10aec26");
        j$.util.Objects.requireNonNull(atlasDatabase_Impl);
        this.d = atlasDatabase_Impl;
    }

    public final void a(gjh gjhVar) {
        dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `AtlasData` (`callCreationTimeMillis` INTEGER NOT NULL, `lastModifiedTimestampMillis` INTEGER NOT NULL, `atlasCallDetails` BLOB, `detectionMetrics` BLOB, PRIMARY KEY(`callCreationTimeMillis`))");
        dzk.M(gjhVar, "CREATE INDEX IF NOT EXISTS `index_AtlasData_lastModifiedTimestampMillis` ON `AtlasData` (`lastModifiedTimestampMillis`)");
        dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        dzk.M(gjhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '99fdc90faec001cfaf00549c8ebf3e43')");
    }

    public final void b(gjh gjhVar) {
        dzk.M(gjhVar, "DROP TABLE IF EXISTS `AtlasData`");
    }

    public final void c(gjh gjhVar) {
        this.d.u(gjhVar);
    }

    public final void d(gjh gjhVar) {
        hgu.V(gjhVar);
    }

    public final defpackage.akwb g(gjh gjhVar) {
        java.util.HashMap map = new java.util.HashMap(4);
        map.put("callCreationTimeMillis", new ghy("callCreationTimeMillis", "INTEGER", true, 1, (java.lang.String) null, 1));
        map.put("lastModifiedTimestampMillis", new ghy("lastModifiedTimestampMillis", "INTEGER", true, 0, (java.lang.String) null, 1));
        map.put("atlasCallDetails", new ghy("atlasCallDetails", "BLOB", false, 0, (java.lang.String) null, 1));
        map.put("detectionMetrics", new ghy("detectionMetrics", "BLOB", false, 0, (java.lang.String) null, 1));
        java.util.HashSet hashSet = new java.util.HashSet(0);
        java.util.HashSet hashSet2 = new java.util.HashSet(1);
        hashSet2.add(new gia("index_AtlasData_lastModifiedTimestampMillis", false, java.util.Arrays.asList("lastModifiedTimestampMillis"), java.util.Arrays.asList("ASC")));
        gib gibVar = new gib("AtlasData", map, hashSet, hashSet2);
        gib gibVarT = hgu.T(gjhVar, "AtlasData");
        return !hgu.S(gibVar, gibVarT) ? new defpackage.akwb(false, hgb.e(gibVarT, gibVar, "AtlasData(com.android.incallui.atlas.ui.impl.database.AtlasData).\n Expected:\n")) : new defpackage.akwb(true, (java.lang.String) null);
    }

    public final void e() {
    }

    public final void f() {
    }
}
