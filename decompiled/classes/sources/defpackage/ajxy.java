package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajxy {
    public static final /* synthetic */ int d = 0;
    private static final long e;
    public final defpackage.ajxw b;
    public final defpackage.aogc c;
    private final android.content.Context f;
    private final defpackage.ajxo g;
    private final java.util.concurrent.ScheduledExecutorService h;
    public final java.util.Map a = new defpackage.aca();
    private boolean i = false;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        e = 28800L;
    }

    public ajxy(defpackage.ajxo ajxoVar, defpackage.ajxw ajxwVar, defpackage.aogc aogcVar, android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.g = ajxoVar;
        this.b = ajxwVar;
        this.c = aogcVar;
        this.f = context;
        this.h = scheduledExecutorService;
    }

    final void a(java.lang.Runnable runnable, long j) {
        this.h.schedule(runnable, j, java.util.concurrent.TimeUnit.SECONDS);
    }

    final synchronized void b(boolean z) {
        this.i = z;
    }

    final void c(long j) {
        a(new ajya(this, this.f, this.g, java.lang.Math.min(java.lang.Math.max(30L, j << 1), e)), j);
        b(true);
    }

    final synchronized boolean d() {
        return this.i;
    }
}
