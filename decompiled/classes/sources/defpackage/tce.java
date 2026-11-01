package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class tce extends defpackage.aonv implements defpackage.aonn {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tce(java.lang.Object obj, int i, byte[] bArr) {
        super(2, obj, defpackage.cja.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        this.$cid = i;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        boolean z;
        if (this.$cid != 0) {
            int iIntValue = ((java.lang.Number) obj2).intValue();
            ((defpackage.cja) this.b).b((defpackage.cav) obj, iIntValue);
            return defpackage.aojh.a;
        }
        if (((defpackage.tcf) this.b).c.m()) {
            ((defpackage.aimw) defpackage.tcf.a.b().l("com/android/dialer/reverselookup/settings/ReverseLookupDataStoreMigration", "shouldRunMigration", 43, "ReverseLookupDataStoreMigration.kt")).v("in directboot");
            z = false;
        } else {
            z = true;
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tce(java.lang.Object obj, int i) {
        super(2, obj, defpackage.tcf.class, "shouldRunMigration", "shouldRunMigration(Lcom/android/dialer/reverselookup/settings/ReverseLookupSettingsData;)Z", 4);
        this.$cid = i;
    }
}
