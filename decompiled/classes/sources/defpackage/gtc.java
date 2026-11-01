package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gtc implements defpackage.ghf {
    private final /* synthetic */ int $cid;

    public gtc(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ghf
    public final void a(defpackage.gip gipVar) {
        int i = this.$cid;
        if (i == 0) {
            gipVar.j("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
            return;
        }
        if (i != 1) {
            gipVar.j("UPDATE gnp_accounts SET account_type = 1");
            return;
        }
        gipVar.j("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        android.content.ContentValues contentValues = new android.content.ContentValues(1);
        contentValues.put("last_enqueue_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        gipVar.q(contentValues, new java.lang.Object[0]);
    }
}
