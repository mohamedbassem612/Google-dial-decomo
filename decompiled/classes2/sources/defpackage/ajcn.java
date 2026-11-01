package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ajcn extends java.util.concurrent.locks.AbstractOwnableSynchronizer implements java.lang.Runnable {
    private final ajco a;

    public ajcn(ajco ajcoVar) {
        this.a = ajcoVar;
    }

    public final void a(java.lang.Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
