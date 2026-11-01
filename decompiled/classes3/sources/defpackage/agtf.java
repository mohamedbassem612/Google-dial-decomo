package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agtf implements java.lang.Runnable {
    private final java.lang.Runnable a;
    private boolean b = false;

    public agtf(java.lang.Runnable runnable) {
        this.a = runnable;
    }

    final void a() {
        afec.c();
        this.b = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afec.c();
        if (this.b) {
            return;
        }
        this.a.run();
    }
}
