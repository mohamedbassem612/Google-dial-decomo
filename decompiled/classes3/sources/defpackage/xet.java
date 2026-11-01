package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xet implements defpackage.xpb {
    public static final boolean d(java.lang.String str, java.lang.String str2) {
        return !aoov.J(str, '*') ? aooh.n(str, str2) : ((aorg) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(com.android.onboarding.config.foregroundpriority.ForegroundPriority.regexCache, str, new defpackage.vxb(new defpackage.xgn(1), 10))).f(str2);
    }

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
        return new com.android.onboarding.config.foregroundpriority.ForegroundPriority(persistableBundle.getString(com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_NODE), persistableBundle.getString(com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION), wsc.f(persistableBundle, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_DISABLED));
    }
}
