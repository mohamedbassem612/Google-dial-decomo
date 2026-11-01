package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xkc {
    static final /* synthetic */ defpackage.xkc a = new defpackage.xkc();
    private static final xtq b;

    static {
        int i = defpackage.xox.a;
        b = new xtq("BackgroundLaunchable", (byte[]) null);
    }

    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    public final com.android.onboarding.utils.persistable.PersistableIntent a(defpackage.xhu xhuVar) {
        com.android.onboarding.utils.persistable.PersistableIntent persistableIntent = new com.android.onboarding.utils.persistable.PersistableIntent("com.android.onboarding.task.RUN_ONBOARDING_TASK", xhuVar.getNodePackage(), ajsz.aF(xhuVar.getSubcomponent()), 214);
        if (aooh.n(xhuVar.identity(), "com.google.android.apps.restore/restore") && android.os.Build.VERSION.SDK_INT >= 34) {
            b.c("Allowing activity starts as special case for restore");
            persistableIntent.e |= 512;
        }
        if (aooh.n(xhuVar.getNodePackage(), "com.google.android.gms") && !aooh.n(xhuVar.getSubcomponent(), "auth")) {
            xtq xtqVar = b;
            xtqVar.c("Rewriting GMS intent action");
            persistableIntent.d = aoke.a;
            persistableIntent.a = persistableIntent.a + '/' + xhuVar.getSubcomponent();
            xtqVar.c("Rewrote GMS intent action to ".concat(java.lang.String.valueOf(persistableIntent.a)));
        }
        return persistableIntent;
    }
}
