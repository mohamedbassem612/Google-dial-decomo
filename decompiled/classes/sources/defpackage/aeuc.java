package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeuc implements android.app.Application.ActivityLifecycleCallbacks {
    public final android.app.Application a;
    public final /* synthetic */ defpackage.aeud b;

    public aeuc(defpackage.aeud aeudVar, android.app.Application application) {
        j$.util.Objects.requireNonNull(aeudVar);
        this.b = aeudVar;
        this.a = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        defpackage.aeud aeudVar = this.b;
        defpackage.aetz aetzVar = aeudVar.n;
        if (aetzVar.b != null) {
            aetzVar = aeudVar.o;
        }
        aetzVar.a = activity.getClass().getSimpleName();
        aetzVar.b = new defpackage.aera(android.os.SystemClock.elapsedRealtime(), android.os.SystemClock.uptimeMillis());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        defpackage.aeud aeudVar = this.b;
        defpackage.aetz aetzVar = aeudVar.o;
        if (aetzVar.b == null) {
            aetzVar = aeudVar.n;
        }
        if (aetzVar.d == null) {
            aetzVar.d = new defpackage.aera(android.os.SystemClock.elapsedRealtime(), android.os.SystemClock.uptimeMillis());
        }
        try {
            android.view.View viewFindViewById = activity.findViewById(android.R.id.content);
            android.view.ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
            viewTreeObserver.addOnDrawListener(new defpackage.aeua(this, viewFindViewById));
            viewTreeObserver.addOnPreDrawListener(new defpackage.aeub(this, viewFindViewById));
        } catch (java.lang.RuntimeException e) {
            android.util.Log.d("PrimesStartupMeasure", "Error handling StartupMeasure's onActivityResume", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        defpackage.aeud aeudVar = this.b;
        defpackage.aetz aetzVar = aeudVar.o;
        if (aetzVar.b == null) {
            aetzVar = aeudVar.n;
        }
        if (aetzVar.c == null) {
            aetzVar.c = new defpackage.aera(android.os.SystemClock.elapsedRealtime(), android.os.SystemClock.uptimeMillis());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }
}
