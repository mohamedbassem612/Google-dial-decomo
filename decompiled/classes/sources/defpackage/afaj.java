package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class afaj implements android.app.Application.ActivityLifecycleCallbacks {
    boolean a = false;
    final /* synthetic */ android.app.Application b;
    final /* synthetic */ defpackage.ahyn c;
    final /* synthetic */ java.util.Set d;
    final /* synthetic */ defpackage.aoin e;
    final /* synthetic */ defpackage.adag f;

    public afaj(android.app.Application application, defpackage.ahyn ahynVar, java.util.Set set, defpackage.adag adagVar, defpackage.aoin aoinVar) {
        this.b = application;
        this.c = ahynVar;
        this.d = set;
        this.f = adagVar;
        this.e = aoinVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [ahyc, java.lang.Object] */
    private final defpackage.aify a() {
        if (this.a) {
            return defpackage.aike.a;
        }
        this.a = true;
        android.app.Application application = this.b;
        application.unregisterActivityLifecycleCallbacks(this);
        defpackage.aihb aihbVar = new defpackage.aihb();
        aihbVar.k(this.d);
        if (this.f.r()) {
            aihbVar.k((java.lang.Iterable) this.e.a());
        } else {
            java.lang.Boolean.FALSE.booleanValue();
        }
        defpackage.aihd aihdVarG = aihbVar.g();
        int size = aihdVarG.size();
        defpackage.ahvr.bC(size, "expectedSize");
        defpackage.aift aiftVar = new defpackage.aift(size);
        defpackage.ailj it = aihdVarG.iterator();
        while (it.hasNext()) {
            android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (android.app.Application.ActivityLifecycleCallbacks) ((defpackage.ahys) this.c).a.apply((android.app.Application.ActivityLifecycleCallbacks) it.next());
            application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
            aiftVar.i(activityLifecycleCallbacks);
        }
        return aiftVar.g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        defpackage.aify aifyVarA = a();
        int i = ((defpackage.aike) aifyVarA).d;
        for (int i2 = 0; i2 < i; i2++) {
            ((android.app.Application.ActivityLifecycleCallbacks) aifyVarA.get(i2)).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        defpackage.ahvr.bY(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        defpackage.ahvr.bY(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        defpackage.aify aifyVarA = a();
        int i = ((defpackage.aike) aifyVarA).d;
        for (int i2 = 0; i2 < i; i2++) {
            da$.ExternalSyntheticApiModelOutline0.m((android.app.Application.ActivityLifecycleCallbacks) aifyVarA.get(i2), activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        if (!this.a) {
            throw new java.lang.IllegalStateException();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        defpackage.ahvr.bY(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        if (!this.a) {
            throw new java.lang.IllegalStateException();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        defpackage.ahvr.bY(this.a);
    }
}
