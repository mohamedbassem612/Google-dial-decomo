package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class wgn implements android.app.Application.ActivityLifecycleCallbacks {
    private static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/windowlayout/impl/WindowLayoutProviderImpl");
    public defpackage.wgm a;
    private final defpackage.gqg c;

    public wgn(defpackage.gqg gqgVar) {
        this.c = gqgVar;
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
        int i;
        int i2;
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        defpackage.aimz aimzVar = b;
        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/windowlayout/impl/WindowLayoutProviderImpl", "updateWindowLayout", 72, "WindowLayoutProviderImpl.kt")).v("enter");
        defpackage.akzx akzxVarM = defpackage.wgm.a.m();
        if (akzxVarM == null) {
            defpackage.aooh.i("builder");
        }
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        int i3 = activity.getResources().getConfiguration().orientation;
        int i4 = 4;
        if (i3 != 1) {
            i = 2;
            if (i3 == 2) {
                i = 4;
            }
        } else {
            i = 3;
        }
        akzxVarM.u();
        ((defpackage.wgm) akzxVarM.b).b = i - 2;
        defpackage.gqg gqgVar = this.c;
        float fWidth = gqgVar.a(activity).a().width() / activity.getResources().getDisplayMetrics().density;
        if (fWidth < 300.0f) {
            i2 = 6;
        } else if (fWidth < 600.0f) {
            i2 = 3;
        } else {
            i2 = fWidth < 840.0f ? 4 : 5;
        }
        akzxVarM.u();
        ((defpackage.wgm) akzxVarM.b).c = i2 - 2;
        float fHeight = gqgVar.a(activity).a().height() / activity.getResources().getDisplayMetrics().density;
        if (fHeight < 450.0f) {
            i4 = 6;
        } else if (fHeight < 480.0f) {
            i4 = 3;
        } else if (fHeight >= 900.0f) {
            i4 = 5;
        }
        akzxVarM.u();
        ((defpackage.wgm) akzxVarM.b).d = i4 - 2;
        boolean zM = fh$.ExternalSyntheticApiModelOutline0.m(activity);
        akzxVarM.u();
        ((defpackage.wgm) akzxVarM.b).e = zM;
        defpackage.alad aladVarR = akzxVarM.r();
        defpackage.aooh.e(aladVarR, "build(...)");
        defpackage.wgm wgmVar = (defpackage.wgm) aladVarR;
        this.a = wgmVar;
        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/windowlayout/impl/WindowLayoutProviderImpl", "updateWindowLayout", 82, "WindowLayoutProviderImpl.kt")).y("windowLayout set to %s", wgmVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        defpackage.aooh.f(activity, "activity");
    }
}
