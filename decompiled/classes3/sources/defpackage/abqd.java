package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class abqd implements java.lang.Runnable {
    public final /* synthetic */ java.util.concurrent.Executor a;
    public final /* synthetic */ java.lang.Runnable b;
    public final /* synthetic */ ajdd c;

    public /* synthetic */ abqd(java.util.concurrent.Executor executor, java.lang.Runnable runnable, ajdd ajddVar) {
        this.a = executor;
        this.b = runnable;
        this.c = ajddVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = abqi.b;
        final java.lang.Runnable runnable = this.b;
        final ajdd ajddVar = this.c;
        this.a.execute(new java.lang.Runnable() { // from class: abqc
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = abqi.b;
                try {
                    runnable.run();
                } catch (java.lang.Throwable th) {
                    ajddVar.p(th);
                }
            }
        });
    }
}
