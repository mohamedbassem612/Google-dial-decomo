package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fkd extends defpackage.fkc implements android.view.Choreographer.FrameCallback {
    private static long c(android.hardware.display.DisplayManager displayManager) {
        android.view.Display display = displayManager.getDisplay(0);
        if (display != null) {
            return (long) (1.0E9d / ((double) display.getRefreshRate()));
        }
        defpackage.etr.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        return -9223372036854775807L;
    }

    @Override // defpackage.fkc
    public final void a() {
        super.a();
        android.view.Choreographer choreographer = this.a;
        choreographer.removeFrameCallback(this);
        choreographer.postFrameCallback(this);
        this.d = c(this.b);
    }

    @Override // defpackage.fkc
    public final void b() {
        super.b();
        this.a.removeFrameCallback(this);
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.c = j;
        android.view.Choreographer choreographer = this.a;
        choreographer.removeFrameCallback(this);
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            android.view.Choreographer choreographer = this.a;
            choreographer.removeFrameCallback(this);
            choreographer.postFrameCallback(this);
            this.d = c(this.b);
        }
    }
}
