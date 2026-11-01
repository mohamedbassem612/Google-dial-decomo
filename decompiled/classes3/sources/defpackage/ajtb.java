package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ajtb extends android.content.BroadcastReceiver {
    public static final java.util.concurrent.atomic.AtomicReference a = new java.util.concurrent.atomic.AtomicReference();
    private final android.content.Context b;

    public ajtb(android.content.Context context) {
        this.b = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        synchronized (ajtc.a) {
            java.util.Iterator it = ajtc.b.values().iterator();
            while (it.hasNext()) {
                ((ajtc) it.next()).h();
            }
        }
        this.b.unregisterReceiver(this);
    }
}
