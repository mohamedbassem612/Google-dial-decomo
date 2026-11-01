package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class ajcy extends ajab implements java.lang.Runnable {
    private final java.lang.Runnable a;

    public ajcy(java.lang.Runnable runnable) {
        ahvr.ci(runnable);
        this.a = runnable;
    }

    protected final java.lang.String b() {
        return "task=[" + this.a.toString() + ']';
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (java.lang.Throwable th) {
            p(th);
            throw th;
        }
    }
}
