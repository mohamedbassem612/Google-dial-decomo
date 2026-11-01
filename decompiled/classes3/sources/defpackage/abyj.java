package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class abyj implements java.lang.Runnable {
    public final /* synthetic */ ajdd a;
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean b;
    public final /* synthetic */ android.content.Context c;
    public final /* synthetic */ android.content.BroadcastReceiver d;

    public /* synthetic */ abyj(ajdd ajddVar, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, android.content.Context context, android.content.BroadcastReceiver broadcastReceiver) {
        this.a = ajddVar;
        this.b = atomicBoolean;
        this.c = context;
        this.d = broadcastReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = abyl.a;
        if (this.a.isCancelled() && this.b.compareAndSet(false, true)) {
            abyl.f(this.c, this.d);
        }
    }
}
