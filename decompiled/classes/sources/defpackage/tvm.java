package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tvm {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/shortcuts/ShortcutsJobScheduler");

    public static void a(android.content.Context context) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/shortcuts/ShortcutsJobScheduler", "schedule", 55, "ShortcutsJobScheduler.java")).v("schedule");
        if (defpackage.abyl.h(context)) {
            android.app.job.JobInfo.Builder builder = new android.app.job.JobInfo.Builder(100, new android.content.ComponentName(context, (java.lang.Class<?>) com.android.dialer.shortcuts.PeriodicJobService.class));
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
            defpackage.an anVar = new defpackage.an(context, builder.setPeriodic(86400000L).setPersisted(true).setRequiresCharging(true).setRequiresDeviceIdle(true).build(), 12);
            defpackage.ajct ajctVarFG = ((defpackage.tvl) defpackage.agab.aH(context, defpackage.tvl.class)).fG();
            defpackage.ajdk ajdkVar = new defpackage.ajdk(java.util.concurrent.Executors.callable(defpackage.ahqx.h(anVar), null));
            ajctVarFG.execute(ajdkVar);
            defpackage.agsm.i(896, ajdkVar, "Error scheduling shortcuts job", new java.lang.Object[0]);
        }
    }
}
