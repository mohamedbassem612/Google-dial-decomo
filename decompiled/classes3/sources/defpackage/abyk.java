package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class abyk extends android.content.BroadcastReceiver {
    final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean a;
    final /* synthetic */ android.content.Context b;
    final /* synthetic */ ajdd c;
    final /* synthetic */ ajas d;
    final /* synthetic */ java.util.concurrent.Executor e;

    public abyk(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, android.content.Context context, ajdd ajddVar, ajas ajasVar, java.util.concurrent.Executor executor) {
        this.a = atomicBoolean;
        this.b = context;
        this.c = ajddVar;
        this.d = ajasVar;
        this.e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (this.a.compareAndSet(false, true)) {
            abyl.f(this.b, this);
            this.c.q(aiql.E(this.d, this.e));
        }
    }
}
