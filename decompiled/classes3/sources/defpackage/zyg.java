package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zyg extends epi {
    private final java.util.concurrent.Semaphore c;
    private final java.util.Set d;

    public zyg(android.content.Context context, java.util.Set set) {
        super(context);
        this.c = new java.util.concurrent.Semaphore(0);
        this.d = set;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        java.util.Iterator it = this.d.iterator();
        if (it.hasNext()) {
            throw new java.lang.UnsupportedOperationException();
        }
        try {
            this.c.tryAcquire(0, 5L, java.util.concurrent.TimeUnit.SECONDS);
            return null;
        } catch (java.lang.InterruptedException e) {
            android.util.Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            java.lang.Thread.currentThread().interrupt();
            return null;
        }
    }

    public final void m() {
        this.c.drainPermits();
        g();
    }
}
