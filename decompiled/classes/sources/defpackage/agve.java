package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agve implements defpackage.gsu {
    final android.os.Handler a;

    public agve(android.os.Handler handler) {
        this.a = handler;
    }

    @Override // defpackage.gsu
    public final void a(java.lang.Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @Override // defpackage.gsu
    public final void b(long j, java.lang.Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }
}
