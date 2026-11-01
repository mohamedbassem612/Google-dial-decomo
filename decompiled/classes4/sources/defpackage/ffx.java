package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class ffx implements java.lang.Runnable {
    public final /* synthetic */ java.util.function.Consumer a;
    public final /* synthetic */ fga b;

    public /* synthetic */ ffx(java.util.function.Consumer consumer, fga fgaVar) {
        this.a = consumer;
        this.b = fgaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.accept(this.b);
    }
}
