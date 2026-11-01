package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahhr implements android.app.Application.ActivityLifecycleCallbacks, android.content.ComponentCallbacks2 {
    private final android.content.Context b;
    private final java.util.Deque c = new java.util.ArrayDeque();
    private final java.util.Set d = new java.util.HashSet();
    public final java.util.Map a = new java.util.HashMap();

    public ahhr(android.content.Context context) {
        this.b = context;
        ((android.app.Application) context).registerActivityLifecycleCallbacks(this);
        context.registerComponentCallbacks(this);
    }

    final void a(int i) {
        java.util.Deque deque = this.c;
        deque.size();
        int size = deque.size() - i;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.d.contains((android.app.Activity) deque.peekFirst())) {
                break;
            }
            java.util.Set set = (java.util.Set) this.a.get((android.app.Activity) deque.removeFirst());
            if (set != null) {
                java.util.Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((ahhp) it.next()).a.l();
                }
            }
        }
        if (size > 0) {
            if (android.os.Debug.getNativeHeapAllocatedSize() > java.lang.Runtime.getRuntime().totalMemory() * 0.8d) {
                defpackage.xrr.b(this.b).f(15);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        this.c.remove(activity);
        this.a.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        java.util.Deque deque = this.c;
        deque.remove(activity);
        deque.add(activity);
        this.d.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        this.d.remove(activity);
        if (activity.isChangingConfigurations() || activity.isFinishing()) {
            return;
        }
        double nativeHeapAllocatedSize = android.os.Debug.getNativeHeapAllocatedSize() / java.lang.Runtime.getRuntime().maxMemory();
        if (nativeHeapAllocatedSize >= 0.8d) {
            a(1);
        } else if (nativeHeapAllocatedSize >= 0.7d) {
            a(2);
        } else if (nativeHeapAllocatedSize >= 0.6d) {
            a(3);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        int i2;
        if (i < 20) {
            if (i >= 15) {
                i2 = 1;
            } else {
                i2 = i >= 10 ? 2 : 3;
            }
            a(i2);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }
}
