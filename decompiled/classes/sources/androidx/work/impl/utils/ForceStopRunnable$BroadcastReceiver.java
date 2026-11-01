package androidx.work.impl.utils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class ForceStopRunnable$BroadcastReceiver extends android.content.BroadcastReceiver {
    static {
        defpackage.gsh.b("ForceStopRunnable$Rcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        int i = defpackage.gsh.a().c;
        long j = defpackage.gyd.a;
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService("alarm");
        android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(context, -1, defpackage.gyd.a(context), android.os.Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() + defpackage.gyd.a;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }
}
