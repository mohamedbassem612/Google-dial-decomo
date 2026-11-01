package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
abstract class fkc implements android.hardware.display.DisplayManager.DisplayListener {
    public static final /* synthetic */ int e = 0;
    public final android.view.Choreographer a;
    final android.hardware.display.DisplayManager b;
    volatile long c = -9223372036854775807L;
    volatile long d = -9223372036854775807L;

    public fkc(android.view.Choreographer choreographer, android.hardware.display.DisplayManager displayManager) {
        this.a = choreographer;
        this.b = displayManager;
    }

    public void a() {
        this.b.registerDisplayListener(this, eum.ah());
    }

    public void b() {
        this.b.unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
