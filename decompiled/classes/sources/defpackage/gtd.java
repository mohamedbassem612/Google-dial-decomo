package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gtd extends defpackage.gfz {
    @Override // defpackage.gfz
    public final void a(defpackage.gip gipVar) {
        gipVar.e();
        try {
            gipVar.j(defpackage.a.bC(java.lang.System.currentTimeMillis() - defpackage.gue.a, "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ", " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))"));
            gipVar.k();
        } finally {
            gipVar.i();
        }
    }
}
