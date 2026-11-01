package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final /* synthetic */ class xfo extends aoof implements aonn {
    public static final defpackage.xfo a = new defpackage.xfo();

    public xfo() {
        super(2, defpackage.xfc.class, "registerForActivityLaunch", "registerForActivityLaunch(Landroid/content/Context;Lcom/android/onboarding/pending/Launchable;)Lcom/android/onboarding/contracts/ActivityLauncher;", 1);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        android.app.Activity activity = (android.app.Activity) obj;
        defpackage.xkf xkfVar = (defpackage.xkf) obj2;
        aooh.f(activity, "p0");
        aooh.f(xkfVar, "p1");
        aooh.f(activity, "<this>");
        aooh.f(xkfVar, com.android.onboarding.config.WaitingScreenConfig.KEY_CONTRACT);
        return new wsc(activity, xkfVar);
    }
}
