package androidx.work.impl.diagnostics;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class DiagnosticsReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String a = gsh.b("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent != null) {
            gsh.a().c(a, "Requesting diagnostics");
            try {
                gus.w(context).f(new gsk(androidx.work.impl.workers.DiagnosticsWorker.class).g());
            } catch (java.lang.IllegalStateException e) {
                gsh.a();
                android.util.Log.e(a, "WorkManager is not initialized", e);
            }
        }
    }
}
