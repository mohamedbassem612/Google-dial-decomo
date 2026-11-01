package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apwo implements java.lang.Runnable {
    public java.lang.Thread a;
    public org.chromium.net.InlineExecutionProhibitedException b;
    private final java.lang.Runnable c;

    public apwo(java.lang.Runnable runnable, java.lang.Thread thread) {
        this.c = runnable;
        this.a = thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (java.lang.Thread.currentThread() == this.a) {
            this.b = new org.chromium.net.InlineExecutionProhibitedException();
        } else {
            this.c.run();
        }
    }
}
