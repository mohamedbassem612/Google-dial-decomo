package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class admw implements defpackage.adni {
    public static final int a;
    public static final int b;
    public static final defpackage.tvn h;
    public final android.app.job.JobScheduler c;
    public final android.content.Context d;
    public final java.lang.Class e;
    public final int f;
    public final int g;
    public final defpackage.agab i = new defpackage.agab((int[]) null);

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        a = 14400000;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.HOURS;
        b = 3600000;
        java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.MINUTES;
        h = new defpackage.tvn(300000L, new defpackage.adnc(1));
    }

    public admw(defpackage.admv admvVar) {
        android.app.job.JobScheduler jobScheduler = admvVar.a;
        jobScheduler.getClass();
        this.c = jobScheduler;
        android.content.Context context = admvVar.b;
        context.getClass();
        this.d = context;
        this.e = admvVar.c;
        this.f = admvVar.d;
        this.g = admvVar.e;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: admx */
    public final void a(defpackage.adib adibVar, int i) throws admx {
        defpackage.aiof aiofVar = defpackage.adhn.a;
        defpackage.adhd adhdVar = (defpackage.adhd) adibVar;
        android.app.job.JobInfo.Builder persisted = new android.app.job.JobInfo.Builder(defpackage.agab.cg(adibVar, i == 0 ? 0 : 1), new android.content.ComponentName(this.d, (java.lang.Class<?>) this.e)).setMinimumLatency(((long) i) * 1000).setRequiresCharging(adhdVar.b).setRequiresDeviceIdle(adhdVar.c).setRequiredNetworkType(true != adhdVar.a ? 1 : 2).setPersisted(true);
        aa$.ExternalSyntheticApiModelOutline0.m(persisted, adhdVar.d);
        if (this.c.schedule(persisted.build()) != 1) {
            throw new admx();
        }
        defpackage.adhl.a.b();
        defpackage.adic adicVar = new defpackage.adic();
        adicVar.b(false);
        adicVar.a = adibVar;
        adicVar.b(false);
        adicVar.a().toString();
    }
}
