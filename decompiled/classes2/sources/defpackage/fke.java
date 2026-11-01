package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fke extends defpackage.fkc implements android.view.Choreographer$VsyncCallback {
    private final android.os.Handler f;

    public fke(android.view.Choreographer choreographer, android.hardware.display.DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.f = eum.ah();
    }

    @Override // defpackage.fkc
    public final void a() {
        super.a();
        android.view.Choreographer choreographer = this.a;
        ae$.ExternalSyntheticApiModelOutline0.m$1(choreographer, this);
        ae$.ExternalSyntheticApiModelOutline0.m(choreographer, this);
    }

    @Override // defpackage.fkc
    public final void b() {
        super.b();
        this.f.removeCallbacksAndMessages(null);
        ae$.ExternalSyntheticApiModelOutline0.m$1(this.a, this);
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.f.removeCallbacksAndMessages(null);
            android.view.Choreographer choreographer = this.a;
            ae$.ExternalSyntheticApiModelOutline0.m$1(choreographer, this);
            ae$.ExternalSyntheticApiModelOutline0.m(choreographer, this);
        }
    }

    public final void onVsync(android.view.Choreographer.FrameData frameData) {
        this.c = ae$.ExternalSyntheticApiModelOutline0.m(frameData);
        android.view.Choreographer.FrameTimeline[] frameTimelineArrM = ae$.ExternalSyntheticApiModelOutline0.m(frameData);
        if (frameTimelineArrM.length >= 2) {
            long jM = ae$.ExternalSyntheticApiModelOutline0.m(frameTimelineArrM[1]) - ae$.ExternalSyntheticApiModelOutline0.m(frameTimelineArrM[0]);
            this.d = jM != 0 ? jM : -9223372036854775807L;
        } else {
            this.d = -9223372036854775807L;
        }
        android.os.Handler handler = this.f;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new defpackage.fay(this, 16), 500L);
    }
}
