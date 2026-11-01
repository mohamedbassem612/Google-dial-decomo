package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aesu implements defpackage.aepo {
    private final android.view.Window.OnFrameMetricsAvailableListener a;
    private final defpackage.amwu b;
    private android.app.Activity c;
    private boolean d;
    private final java.util.Set e = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    public aesu(defpackage.amwu amwuVar, android.view.Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
        this.a = onFrameMetricsAvailableListener;
        this.b = amwuVar;
    }

    private final synchronized void k() {
        android.app.Activity activity = this.c;
        if (activity == null || !this.e.add(activity.getWindow())) {
            return;
        }
        aa$.ExternalSyntheticApiModelOutline1.m(activity.getWindow(), this.a, (android.os.Handler) this.b.a());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037 A[DONT_GENERATE] */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x0037, please report this as an issue */
    private final synchronized void l(android.app.Activity activity) {
        if (activity != null) {
            try {
                if (this.e.remove(activity.getWindow())) {
                    try {
                        aa$.ExternalSyntheticApiModelOutline1.m(activity.getWindow(), this.a);
                    } catch (java.lang.RuntimeException e) {
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(e)).l("com/google/android/libraries/performance/primes/metrics/jank/WindowTracker", "detachFromActivity", 'm', "WindowTracker.java")).v("Failed to detach the frame metrics listener");
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.aepo
    public final void a(android.app.Activity activity) {
        synchronized (this) {
            l(activity);
        }
    }

    @Override // defpackage.aepo
    public final void b(android.app.Activity activity) {
        synchronized (this) {
            this.c = null;
        }
    }

    @Override // defpackage.aepo
    public final void c(android.app.Activity activity) {
        synchronized (this) {
            this.c = activity;
            if (this.d) {
                k();
            }
        }
    }

    public final synchronized void g() {
        this.d = true;
        k();
    }

    public final synchronized void j() {
        this.d = false;
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void d(android.app.Activity activity) {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void e(android.app.Activity activity) {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void f(int i) {
    }
}
