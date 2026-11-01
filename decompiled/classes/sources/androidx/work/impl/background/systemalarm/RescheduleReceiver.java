package androidx.work.impl.background.systemalarm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class RescheduleReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String a = defpackage.gsh.b("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        defpackage.gsh gshVarA = defpackage.gsh.a();
        java.lang.String str = a;
        java.util.Objects.toString(intent);
        gshVarA.c(str, "Received intent ".concat(java.lang.String.valueOf(intent)));
        try {
            defpackage.guq guqVarH = defpackage.guq.h(context);
            android.content.BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (defpackage.guq.b) {
                try {
                    android.content.BroadcastReceiver.PendingResult pendingResult = guqVarH.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    guqVarH.i = pendingResultGoAsync;
                    if (guqVarH.h) {
                        guqVarH.i.finish();
                        guqVarH.i = null;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } catch (java.lang.IllegalStateException e) {
            defpackage.gsh.a();
            android.util.Log.e(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
