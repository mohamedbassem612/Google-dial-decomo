package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gvj {
    public static final /* synthetic */ int a = 0;
    private static final java.lang.String b = defpackage.gsh.b("SystemJobScheduler");

    public static final android.app.job.JobScheduler a(android.content.Context context) {
        if (context == null) {
            defpackage.aooh.i("<this>");
        }
        java.lang.Object systemService = context.getSystemService("jobscheduler");
        if (systemService == null) {
            defpackage.aooh.h("null cannot be cast to non-null type android.app.job.JobScheduler");
        }
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) systemService;
        if (android.os.Build.VERSION.SDK_INT < 34) {
            return jobScheduler;
        }
        if (jobScheduler == null) {
            defpackage.aooh.i("jobScheduler");
        }
        android.app.job.JobScheduler jobSchedulerM = rp$.ExternalSyntheticApiModelOutline0.m(jobScheduler, "androidx.work.systemjobscheduler");
        defpackage.aooh.e(jobSchedulerM, "forNamespace(...)");
        return jobSchedulerM;
    }

    public static final java.util.List b(android.app.job.JobScheduler jobScheduler) {
        if (jobScheduler == null) {
            defpackage.aooh.i("<this>");
        }
        if (jobScheduler == null) {
            try {
                defpackage.aooh.i("jobScheduler");
            } catch (java.lang.Throwable th) {
                java.lang.String str = b;
                defpackage.gsh.a();
                android.util.Log.e(str, "getAllPendingJobs() is not reliable on this device.", th);
                return null;
            }
        }
        java.util.List<android.app.job.JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
        defpackage.aooh.e(allPendingJobs, "getAllPendingJobs(...)");
        return allPendingJobs;
    }
}
