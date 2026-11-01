package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agso implements android.app.Application.ActivityLifecycleCallbacks {
    public static final /* synthetic */ int b = 0;
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public agso(defpackage.agsp agspVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(agspVar);
        this.a = agspVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoin, java.lang.Object] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        if (this.$cid != 0) {
            if (activity == null) {
                defpackage.aooh.i("activity");
            }
            java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.dgs.a;
            final ?? r0 = this.a;
            defpackage.dgs.a.set(new defpackage.dgr() { // from class: agsb
                @Override // defpackage.dgr
                public final defpackage.cds a(android.view.View view) {
                    int i = defpackage.agso.b;
                    if (view == null) {
                        defpackage.aooh.i("rootView");
                    }
                    java.lang.Object objA = r0.a();
                    defpackage.aooh.e(objA, "get(...)");
                    return defpackage.dgx.e(view, (defpackage.aolr) objA, 2);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        if (this.$cid != 0) {
            defpackage.aooh.f(activity, "activity");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        if (this.$cid != 0) {
            defpackage.aooh.f(activity, "activity");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        if (this.$cid == 0 || activity != null) {
            return;
        }
        defpackage.aooh.i("activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        if (this.$cid != 0) {
            defpackage.aooh.f(activity, "activity");
            defpackage.aooh.f(bundle, "outState");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) throws afeb {
        if (this.$cid != 0) {
            if (activity == null) {
                defpackage.aooh.i("activity");
            }
        } else {
            defpackage.agsp agspVar = (defpackage.agsp) this.a;
            int i = agspVar.c + 1;
            agspVar.c = i;
            if (i == 1) {
                agspVar.a(true);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) throws afeb {
        if (this.$cid != 0) {
            defpackage.aooh.f(activity, "activity");
            return;
        }
        defpackage.agsp agspVar = (defpackage.agsp) this.a;
        int i = agspVar.c - 1;
        agspVar.c = i;
        if (i != 0 || activity.isChangingConfigurations()) {
            return;
        }
        agspVar.a(false);
    }

    public agso(defpackage.aoin aoinVar, int i) {
        this.$cid = i;
        this.a = aoinVar;
    }
}
