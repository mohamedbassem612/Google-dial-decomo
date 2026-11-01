package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class oqd implements android.app.Application.ActivityLifecycleCallbacks {
    private final defpackage.aoin a;

    public oqd(defpackage.aoin aoinVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("enableHardwareAccelerationForAllActivities");
        }
        this.a = aoinVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        defpackage.aooh.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        defpackage.aooh.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        if (((java.lang.Boolean) this.a.a()).booleanValue()) {
            activity.getWindow().setFlags(16777216, 16777216);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        defpackage.aooh.f(activity, "activity");
        defpackage.aooh.f(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        defpackage.aooh.f(activity, "activity");
    }
}
