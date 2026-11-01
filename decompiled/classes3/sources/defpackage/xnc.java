package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xnc extends defpackage.xne {
    private final java.util.Map a;
    private final java.util.Map j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnc(defpackage.xhu xhuVar, java.util.Set set, java.util.Set set2) {
        super(new defpackage.xnb(xhuVar));
        aooh.f(xhuVar, "component");
        aooh.f(set, "activities");
        aooh.f(set2, "tasks");
        this.a = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(set, 10)), 16));
        this.j = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(set2, 10)), 16));
    }

    @Override // defpackage.xmb
    public final /* synthetic */ java.lang.Object eq(java.lang.Object obj, aoln aolnVar) {
        defpackage.xmz xmzVar = (defpackage.xmz) obj;
        defpackage.xox.a("PendingContractProvider", "Resolving PendingContract for ".concat(xmzVar.identity()));
        defpackage.xib xibVar = xmzVar.a;
        defpackage.xfp xfpVar = (defpackage.xfp) this.a.get(xibVar);
        if (xfpVar != null) {
            android.content.Intent intentA = defpackage.xpg.f(xmzVar.b).a();
            defpackage.xly xlyVar = this.f;
            android.content.Context context = xlyVar != null ? xlyVar.a : null;
            if (context == null) {
                throw new java.lang.IllegalStateException("Context is not initialized! Was task initialised?");
            }
            com.android.onboarding.pending.PendingActivityContract pendingActivityContract = new com.android.onboarding.pending.PendingActivityContract(((com.android.onboarding.pending.PendingActivityContract.Resolved) xfpVar.prepare(context, xfpVar.extractArgument(intentA))).a.a.a());
            java.util.Objects.toString(xibVar);
            defpackage.xox.b("PendingContractProvider", "Provided PendingContract.Activity for ".concat(defpackage.xfc.b(xibVar)));
            return pendingActivityContract;
        }
        defpackage.xmd xmdVar = (defpackage.xmd) this.j.get(xibVar);
        if (xmdVar == null) {
            java.util.Objects.toString(xibVar);
            defpackage.xox.c("PendingContractProvider", "Failed to provide PendingContract for ".concat(defpackage.xfc.b(xibVar)));
            throw new defpackage.xlx("Node " + defpackage.xfc.b(xibVar) + " is not recognised by this provider");
        }
        java.lang.Object objB = xmdVar.d.b(xmzVar.b);
        aooh.f(objB, "taskArgs");
        com.android.onboarding.pending.PendingTaskContract.Resolved resolved = new com.android.onboarding.pending.PendingTaskContract.Resolved(new com.android.onboarding.pending.PendingTaskContract(new android.os.PersistableBundle((android.os.PersistableBundle) objB), xmdVar, (com.android.onboarding.utils.persistable.PersistableIntent) xmdVar.b.a(), android.os.Process.myUid() / 100000, xmdVar.getNodeComponent(), xmdVar.b()), xmdVar);
        android.os.PersistableBundle persistableBundle = resolved.d.e;
        defpackage.xix xixVar = defpackage.xjb.c;
        long j = persistableBundle.getLong("com.android.onboarding.pending.CREATOR_ID", -1L);
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "now(...)");
        aooh.f(instantNow, "timestamp");
        xixVar.a(new defpackage.xiv(xmdVar.asNodeRef(), j, objB, instantNow));
        com.android.onboarding.pending.PendingTaskContract pendingTaskContract = new com.android.onboarding.pending.PendingTaskContract(resolved.toPersistableBundle());
        java.util.Objects.toString(xibVar);
        defpackage.xox.b("PendingContractProvider", "Provided PendingContract.Task for ".concat(defpackage.xfc.b(xibVar)));
        return pendingTaskContract;
    }
}
