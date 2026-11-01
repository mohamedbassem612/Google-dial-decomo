package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afgi extends android.content.BroadcastReceiver {
    private final java.lang.Runnable a;

    public afgi(java.lang.Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        this.a.run();
    }
}
