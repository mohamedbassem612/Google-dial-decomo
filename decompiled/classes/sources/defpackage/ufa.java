package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ufa {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/spam/inapp/SpamJobScheduler");

    public static android.app.job.JobScheduler a(android.content.Context context) {
        return (android.app.job.JobScheduler) context.getSystemService("jobscheduler");
    }

    public static java.lang.String b(int i) {
        defpackage.ahvr.bM(e(i));
        if (i == 50) {
            return "SPAM_JOB_WIFI";
        }
        if (i == 51) {
            return "SPAM_JOB_ANY_NETWORK";
        }
        throw new java.lang.IllegalArgumentException("Invalid spam job type.");
    }

    public static void c(android.content.Context context, int i) {
        android.app.job.JobScheduler jobSchedulerA = a(context);
        if (jobSchedulerA != null) {
            jobSchedulerA.cancel(i);
        }
    }

    public static void d(android.content.Context context) {
        defpackage.uez uezVar = (defpackage.uez) defpackage.agab.aH(context, defpackage.uez.class);
        defpackage.ddv ddvVar = new defpackage.ddv(context, 15);
        defpackage.ajct ajctVarFG = uezVar.fG();
        defpackage.ajdk ajdkVar = new defpackage.ajdk(java.util.concurrent.Executors.callable(defpackage.ahqx.h(ddvVar), null));
        ajctVarFG.execute(ajdkVar);
        defpackage.agsm.i(913, ajdkVar, "Failed to schedule or cancel spam jobs", new java.lang.Object[0]);
    }

    public static boolean e(int i) {
        return i == 50 || i == 51;
    }
}
