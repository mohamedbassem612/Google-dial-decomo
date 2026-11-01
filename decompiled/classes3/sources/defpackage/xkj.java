package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xkj implements defpackage.xpb {
    public static final /* synthetic */ defpackage.xkj a = new defpackage.xkj();
    private final /* synthetic */ defpackage.xer b = com.android.onboarding.pending.PendingContract$ErasedTask.d;

    private xkj() {
    }

    public static final com.android.onboarding.pending.PendingContract$ErasedTask e(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "persistableBundle");
        return defpackage.xer.h(persistableBundle);
    }

    @Override // defpackage.xpb
    public final /* bridge */ /* synthetic */ java.lang.Object c(android.os.PersistableBundle persistableBundle) {
        return e(persistableBundle);
    }

    @Override // defpackage.xhf
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final com.android.onboarding.pending.PendingContract$ErasedTask b(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "input");
        return (com.android.onboarding.pending.PendingContract$ErasedTask) defpackage.xfh.d(this.b, persistableBundle);
    }
}
