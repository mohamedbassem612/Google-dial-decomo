package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mn implements android.view.ViewTreeObserver.OnDrawListener, java.lang.Runnable, java.util.concurrent.Executor {
    public java.lang.Runnable a;
    final /* synthetic */ defpackage.mp b;
    private final long c = android.os.SystemClock.uptimeMillis() + 10000;
    private boolean d;

    public mn(defpackage.mp mpVar) {
        this.b = mpVar;
    }

    public final void a(android.view.View view) {
        defpackage.aooh.f(view, "view");
        if (this.d) {
            return;
        }
        this.d = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        defpackage.aooh.f(runnable, "runnable");
        this.a = runnable;
        android.view.View decorView = this.b.getWindow().getDecorView();
        defpackage.aooh.e(decorView, "getDecorView(...)");
        if (!this.d) {
            decorView.postOnAnimation(new jd(this, 10, (byte[]) null));
        } else if (defpackage.aooh.n(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        java.lang.Runnable runnable = this.a;
        if (runnable == null) {
            if (android.os.SystemClock.uptimeMillis() > this.c) {
                this.d = false;
                this.b.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.a = null;
        defpackage.aewl aewlVarV = this.b.v();
        synchronized (aewlVarV.d) {
            z = aewlVarV.b;
        }
        if (z) {
            this.d = false;
            this.b.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
