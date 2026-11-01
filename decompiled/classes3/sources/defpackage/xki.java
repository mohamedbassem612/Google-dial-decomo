package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xki implements defpackage.xkf, defpackage.xpb {
    public static final /* synthetic */ defpackage.xki a = new defpackage.xki();
    private final /* synthetic */ defpackage.xer b = com.android.onboarding.pending.PendingContract$ErasedActivity.d;

    private xki() {
    }

    public static final com.android.onboarding.pending.PendingContract$ErasedActivity e(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "persistableBundle");
        return defpackage.xer.g(persistableBundle);
    }

    @Override // defpackage.xpb
    public final /* bridge */ /* synthetic */ java.lang.Object c(android.os.PersistableBundle persistableBundle) {
        return e(persistableBundle);
    }

    @Override // defpackage.xhf
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final com.android.onboarding.pending.PendingContract$ErasedActivity b(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "input");
        return (com.android.onboarding.pending.PendingContract$ErasedActivity) defpackage.xfh.d(this.b, persistableBundle);
    }
}
