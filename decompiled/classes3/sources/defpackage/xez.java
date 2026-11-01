package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xez implements defpackage.xpb {
    @Override // defpackage.xpb
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ java.lang.Object b(android.os.PersistableBundle persistableBundle) {
        return defpackage.xfh.d(this, persistableBundle);
    }

    @Override // defpackage.xhf
    public final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        return b((android.os.PersistableBundle) obj);
    }

    @Override // defpackage.xpb
    public final /* bridge */ /* synthetic */ java.lang.Object c(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "persistableBundle");
        java.util.List listH = defpackage.xfh.h(persistableBundle, "priorities", com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority.Companion);
        return new com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriorityConfig(listH != null ? ajsz.bS(listH) : aokc.a);
    }
}
