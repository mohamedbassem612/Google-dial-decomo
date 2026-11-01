package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abrp extends java.lang.Thread {
    public java.lang.Runnable a;
    public java.lang.Runnable b;
    public final defpackage.abry c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abrp(java.lang.Runnable runnable) {
        super(runnable);
        defpackage.aooh.f(runnable, "r");
        this.c = new defpackage.abry(this, -1, false, -21, true, true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        java.util.concurrent.atomic.AtomicLong atomicLong;
        long j;
        defpackage.abry abryVar = this.c;
        abryVar.b = android.os.Process.myTid();
        do {
            atomicLong = abryVar.f;
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, defpackage.abrx.e(j, true, true, false, 0, 0, 0L, 124)));
        if (!defpackage.abrx.c(j)) {
            abryVar.a(-21);
        }
        java.lang.Runnable runnable = null;
        try {
            try {
                java.lang.Runnable runnable2 = this.a;
                if (runnable2 == null) {
                    defpackage.aooh.j("startedCallback");
                    runnable2 = null;
                }
                runnable2.run();
                super.run();
                java.lang.Runnable runnable3 = this.b;
                if (runnable3 == null) {
                    defpackage.aooh.j("finishedCallback");
                } else {
                    runnable = runnable3;
                }
                runnable.run();
                this.c.c();
            } catch (java.lang.Throwable th) {
                th = th;
                java.lang.Runnable runnable4 = this.b;
                if (runnable4 == null) {
                    defpackage.aooh.j("finishedCallback");
                } else {
                    runnable = runnable4;
                }
                runnable.run();
                this.c.c();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            this.c.c();
            throw th;
        }
    }
}
