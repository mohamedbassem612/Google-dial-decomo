package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aeps extends defpackage.aept {
    final /* synthetic */ defpackage.aepu a;

    public aeps(defpackage.aepu aepuVar) {
        j$.util.Objects.requireNonNull(aepuVar);
        this.a = aepuVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahzr */
    @Override // defpackage.aept, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) throws ahzr {
        defpackage.aepu aepuVar = this.a;
        int i = aepuVar.b - 1;
        aepuVar.b = i;
        if (i == 0) {
            aepuVar.h = defpackage.aenj.e(activity.getClass());
            android.os.Handler handler = aepuVar.e;
            defpackage.ahvr.bH(handler);
            java.lang.Runnable runnable = aepuVar.f;
            defpackage.ahvr.bH(runnable);
            handler.postDelayed(runnable, 700L);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahzr */
    @Override // defpackage.aept, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) throws ahzr {
        defpackage.aepu aepuVar = this.a;
        int i = aepuVar.b + 1;
        aepuVar.b = i;
        if (i == 1) {
            if (aepuVar.c) {
                java.util.Iterator it = aepuVar.g.iterator();
                while (it.hasNext()) {
                    ((defpackage.aepi) it.next()).l(new defpackage.aenj(activity.getClass().getSimpleName()));
                }
                aepuVar.c = false;
                return;
            }
            android.os.Handler handler = aepuVar.e;
            defpackage.ahvr.bG(handler, new java.lang.Object[0]);
            java.lang.Runnable runnable = aepuVar.f;
            defpackage.ahvr.bG(runnable, new java.lang.Object[0]);
            handler.removeCallbacks(runnable);
        }
    }

    @Override // defpackage.aept, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        defpackage.aepu aepuVar = this.a;
        int i = aepuVar.a + 1;
        aepuVar.a = i;
        if (i == 1 && aepuVar.d) {
            for (defpackage.aepi aepiVar : aepuVar.g) {
                activity.getClass().getSimpleName();
            }
            aepuVar.d = false;
        }
    }

    @Override // defpackage.aept, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        defpackage.aepu aepuVar = this.a;
        aepuVar.a--;
        defpackage.aenj.e(activity.getClass());
        aepuVar.a();
    }
}
