package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaea implements android.app.Application.ActivityLifecycleCallbacks, android.content.ComponentCallbacks2 {
    public static final defpackage.aaea a = new defpackage.aaea();
    public final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.ArrayList d = new java.util.ArrayList();
    private boolean e = false;

    private aaea() {
    }

    public static void b(android.app.Application application) {
        defpackage.aaea aaeaVar = a;
        synchronized (aaeaVar) {
            if (!aaeaVar.e) {
                application.registerActivityLifecycleCallbacks(aaeaVar);
                application.registerComponentCallbacks(aaeaVar);
                aaeaVar.e = true;
            }
        }
    }

    private final void d(boolean z) {
        synchronized (a) {
            java.util.Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((defpackage.aadz) it.next()).a(z);
            }
        }
    }

    public final void a(defpackage.aadz aadzVar) {
        synchronized (a) {
            this.d.add(aadzVar);
        }
    }

    public final boolean c() {
        return this.b.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.c;
        boolean zCompareAndSet = this.b.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            d(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.c;
        boolean zCompareAndSet = this.b.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            d(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.b.compareAndSet(false, true)) {
            this.c.set(true);
            d(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }
}
