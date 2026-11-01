package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aepq implements android.app.Application.ActivityLifecycleCallbacks, android.content.ComponentCallbacks2 {
    public static final /* synthetic */ int c = 0;
    private final defpackage.aeqs j;
    public final java.util.List a = new java.util.concurrent.CopyOnWriteArrayList();
    private final java.util.concurrent.atomic.AtomicInteger d = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.concurrent.atomic.AtomicInteger e = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.concurrent.atomic.AtomicInteger f = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.concurrent.atomic.AtomicInteger g = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.concurrent.atomic.AtomicInteger h = new java.util.concurrent.atomic.AtomicInteger();
    private boolean i = false;

    public aepq(defpackage.aeqs aeqsVar) {
        this.j = aeqsVar;
    }

    private final void a() {
        if (this.i || this.d.get() != 0) {
            return;
        }
        defpackage.aeqs aeqsVar = this.j;
        if (!defpackage.aeqs.b()) {
            defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/CrashOnBadPrimesConfiguration", "observedOutOfOrderLifecycleEvent", 43, "CrashOnBadPrimesConfiguration.java");
            java.lang.Object obj = aeqsVar.a;
            aimwVar.y("Primes did not observe lifecycle events in the expected order. %s is not initializing in Application#onCreate", obj);
            if (!aeqsVar.a()) {
                throw new java.lang.IllegalStateException(java.lang.String.format("Primes did not observe lifecycle events in the expected order. %s is not initializing in Application#onCreate", obj));
            }
        }
        this.i = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        this.d.incrementAndGet();
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.aepo) it.next()).h();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        if (this.h.getAndIncrement() == 0) {
            a();
        }
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.aepo) it.next()).a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        if (this.f.getAndIncrement() == 0) {
            a();
        }
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.aepo) it.next()).b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        if (this.b.getAndIncrement() == 0) {
            a();
        }
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.aepo) it.next()).c(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.aepo) it.next()).i();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        if (this.e.getAndIncrement() == 0) {
            a();
        }
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.aepo) it.next()).d(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        if (this.g.getAndIncrement() == 0) {
            a();
        }
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.aepo) it.next()).e(activity);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.aepo) it.next()).f(i);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }
}
