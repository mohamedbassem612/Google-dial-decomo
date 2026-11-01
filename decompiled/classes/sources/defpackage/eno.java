package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eno implements android.app.Application.ActivityLifecycleCallbacks {
    public static final defpackage.enn Companion = new defpackage.enn();

    public static final void registerIn(android.app.Activity activity) {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        fn$.ExternalSyntheticApiModelOutline0.m(activity, new defpackage.eno());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        defpackage.aooh.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        defpackage.aooh.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        int i = defpackage.enp.a;
        defpackage.dzn.d(activity, defpackage.emp.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(android.app.Activity activity) {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        int i = defpackage.enp.a;
        defpackage.dzn.d(activity, defpackage.emp.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(android.app.Activity activity) {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        int i = defpackage.enp.a;
        defpackage.dzn.d(activity, defpackage.emp.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(android.app.Activity activity) {
        defpackage.aooh.f(activity, "activity");
        int i = defpackage.enp.a;
        defpackage.dzn.d(activity, defpackage.emp.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(android.app.Activity activity) {
        defpackage.aooh.f(activity, "activity");
        int i = defpackage.enp.a;
        defpackage.dzn.d(activity, defpackage.emp.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(android.app.Activity activity) {
        defpackage.aooh.f(activity, "activity");
        int i = defpackage.enp.a;
        defpackage.dzn.d(activity, defpackage.emp.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        defpackage.aooh.f(activity, "activity");
        defpackage.aooh.f(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        defpackage.aooh.f(activity, "activity");
    }
}
