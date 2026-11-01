package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gte implements gsu {
    private final android.os.Handler a = ft$.ExternalSyntheticApiModelOutline0.m(android.os.Looper.getMainLooper());

    public final void a(java.lang.Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    public final void b(long j, java.lang.Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }
}
