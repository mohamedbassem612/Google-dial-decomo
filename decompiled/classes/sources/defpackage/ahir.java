package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahir implements android.app.Application.ActivityLifecycleCallbacks {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        if (activity instanceof defpackage.aheh) {
            defpackage.aeud aeudVar = defpackage.aeud.a;
            long jW = ((defpackage.aheh) activity).w();
            defpackage.aera aeraVar = new defpackage.aera(jW, jW);
            defpackage.aera aeraVar2 = aeudVar.n.b;
            if (defpackage.afec.h(java.lang.Thread.currentThread()) && aeudVar.b != null) {
                long j = aeraVar.a;
                if (j <= android.os.SystemClock.elapsedRealtime() && ((aeraVar2 == null || j <= aeraVar2.a) && aeudVar.g == null)) {
                    aeudVar.g = aeraVar;
                }
            }
        }
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }
}
